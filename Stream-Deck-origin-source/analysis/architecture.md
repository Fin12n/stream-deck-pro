# Kiến Trúc Ứng Dụng Stream Deck Mobile (Architecture Breakdown)

## 1. Sơ đồ Kiến trúc Tổng thể (High-Level Architecture)

```
┌────────────────────────────────────────────────────────────────────────┐
│                   GIAO DIỆN NGƯỜI DÙNG (PRESENTATION)                  │
│   • Jetpack Compose 1.6.8 + Material3 1.2.1 + Lottie Animations        │
│   • Điều hướng: Voyager Navigation (cafe.adriel.voyager 1.0.0)         │
│   • Quản lý trạng thái: ViewModel + Kotlin Coroutines & StateFlow      │
│   • DI Framework: Winter (io.jentz.winter 0.10.0-alpha1)               │
└───────────────────────────────────┬────────────────────────────────────┘
                                    │
┌───────────────────────────────────▼────────────────────────────────────┐
│                  TẦNG MIỀN & GIAO THỨC VSD2 (DOMAIN LAYER)              │
│   • Cấu hình ứng dụng: AppSettingsStore (Jetpack DataStore + Protobuf)  │
│   • Ghép nối thiết bị: KnownHost, StaticHost, Endpoint                 │
│   • Khế ước truyền tin: Messages.java (Elgato VSD2 Protobuf Schema)     │
│   • Quản lý quyền: PermissionRepository (Camera, Mạng)                 │
└───────────────────┬────────────────────────────────┬───────────────────┘
                    │                                │
┌───────────────────▼─────────────┐    ┌─────────────▼───────────────────┐
│       KẾT NỐI & MẬT MÃ          │    │    GIẢI NÉN ĐỒ HỌA NÚT BẤM      │
│   • Ktor Client WebSockets      │    │   • ImageDecompressor           │
│   • CryptoBoxAndroid            │    │   • IconDecompressorAndroid     │
│   • Libsodium (Curve25519)      │    │   • Giải nén: LZ4, LZF, LZFSE   │
└───────────────────┬─────────────┘    └─────────────┬───────────────────┘
                    │                                │
┌───────────────────▼────────────────────────────────▼───────────────────┐
│               TẦNG GỐC C/C++ (NATIVE JNI ENGINE - ARM64)               │
│   • libvsd2-android.so (JNI bindings cho CryptoBox & Image Decoders)   │
│   • libsodium.so (Động cơ mã hóa chuẩn công nghiệp)                     │
│   • libbarhopper_v3.so (Mô hình quét mã QR ghép nối của ML Kit)        │
└────────────────────────────────────────────────────────────────────────┘
```

---

## 2. Giao thức Virtual Stream Deck 2 (VSD2 Protocol)

### A. Bản chất của VSD2
Ứng dụng di động không đóng vai trò tính toán phím tắt trực tiếp, mà đóng vai trò là một **thiết bị phần cứng ảo (Virtual Stream Deck Device)** kết nối với ứng dụng điều khiển trung tâm **Stream Deck Desktop (PC Windows / macOS)** qua mạng cục bộ (LAN/Wi-Fi).

### B. Khế ước Thông điệp (`com.elgato.vsd2.Messages.java`)
Giao thức sử dụng Protocol Buffers phiên bản rút gọn (`GeneratedMessageLite`) gồm **8,347 dòng code** định nghĩa toàn bộ cấu trúc:
- **`Action`**: Định nghĩa một nút bấm trên bàn phím:
  - `index`: Tọa độ phím trên lưới (Grid slot: 0 đến 14 trên bố cục 3x5, hoặc mở rộng)
  - `title`: Nhãn văn bản hiển thị
  - `name`: Tên hành động từ plugin (ví dụ: `OBS: Scene Switch`, `Mute Mic`)
  - `category`: Nhóm chức năng
  - `shortcutID`: ID định danh duy nhất của hành động
- **`Icon` & `Image`**: Dữ liệu hình ảnh động hoặc tĩnh được render từ PC gửi sang cho từng phím.
- **Sự kiện Tương tác (User Input Events)**:
  - Gửi sự kiện nhấn phím: `KeyDown`, `KeyUp`
  - Gửi sự kiện núm xoay (Dials): `DialRotate`, `DialPress`
  - Gửi sự kiện dải cảm ứng (Touch Strip): `TouchSwipe`, `TouchPress`
- **Đồng bộ Trang & Hồ sơ (Pages & Profiles)**: Chuyển đổi giữa các trang nút bấm trong thời gian thực.

---

## 3. Quy trình Ghép nối & Bảo mật (Pairing Handshake & Cryptography)

Quá trình kết nối giữa Stream Deck Mobile và PC tuân thủ mô hình **Zero-Trust LAN Security**:

```
[Mobile App]                                               [PC Stream Deck]
     │                                                            │
     │ 1. Quét QR bằng CameraX + ML Kit                           │
     │    (Nhận Host IP, Port, Fingerprint)                       │
     │───────────────────────────────────────────────────────────>│
     │                                                            │
     │ 2. Khởi tạo Ktor WebSocket Connection                      │
     │───────────────────────────────────────────────────────────>│
     │                                                            │
     │ 3. Tạo cặp khóa Curve25519 (CryptoBoxAndroid.createKeypair)│
     │    Trao đổi Public Key                                     │
     │<══════════════════════════════════════════════════════════>│
     │                                                            │
     │ 4. Tính toán Khóa dùng chung (calculateSharedKey)          │
     │    Xác thực Fingerprint từ QR Code                         │
     │                                                            │
     │ 5. Toàn bộ gói tin sau đó được mã hóa (encrypt / decrypt) │
     │<══════════════════════════════════════════════════════════>│
```

### Các hàm Native trong `libvsd2-android.so`:
- `Java_com_elgato_streamdeck_vsd2_CryptoBoxAndroid_createKeypair`: Tạo cặp khóa công khai/bí mật mới.
- `Java_com_elgato_streamdeck_vsd2_CryptoBoxAndroid_calculateSharedKey`: Tính toán khóa đối xứng chia sẻ bằng Diffie-Hellman trên đường cong Curve25519 thông qua `libsodium`.
- `Java_com_elgato_streamdeck_vsd2_CryptoBoxAndroid_encrypt` & `decrypt`: Mã hóa và giải mã payload của từng frame gói tin.
- `Java_com_elgato_streamdeck_vsd2_CryptoBoxAndroid_getFingerprint`: Trích xuất chuỗi băm vân tay của khóa để so khớp với QR Code.

---

## 4. Cơ chế Nén và Render Đồ họa Nút bấm Thời gian Thực

Mỗi nút trên Stream Deck có thể cập nhật hình ảnh với tần số cao (ví dụ: hiển thị đồng hồ CPU, thanh âm lượng, gif động). Để tối ưu băng thông mạng nội bộ, máy tính nén ảnh trước khi truyền:
- **`decodeLZ4`**: Thuật toán nén/giải nén cực nhanh với độ trễ nano-giây, thích hợp cho luồng stream liên tục.
- **`decodeLZF`**: Thuật toán nén dung lượng nhỏ với bộ nhớ RAM thấp.
- **`decodeLZFSE`**: Thuật toán nén độc quyền của Apple (được thừa hưởng từ mã nguồn gốc Stream Deck trên macOS).

Sau khi giải nén nhị phân qua C++, `IconDecompressorAndroid` chuyển đổi thành đối tượng `android.graphics.Bitmap` và đưa vào bộ nhớ đệm (Cache) của Jetpack Compose để hiển thị mượt mà 60 FPS.

---

## 5. Hệ thống Quản lý Dữ liệu & Đăng ký (Storage & Monetization)
1. **Lưu trữ Cấu hình Thiết bị**:
   - Sử dụng `AppSettingsStore` dựa trên **Jetpack DataStore** kết hợp **Protobuf** (`AppSettings.proto`).
   - Lưu trữ danh sách `KnownHost` (máy tính đã từng ghép nối), `StaticHost` (máy tính thêm thủ công bằng IP), và `DeviceList`.
2. **Quản lý Bản quyền (Monetization)**:
   - Tích hợp **RevenueCat SDK (`com.revenuecat.purchases:8.1.0`)** đóng vai trò tầng trừu tượng quản lý gói đăng ký Premium.
   - Hỗ trợ song song cả **Google Play Billing Client 7.0.0** và **Amazon Appstore SDK 3.0.5**.
