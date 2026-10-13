# Ghi Chú Tái Cấu Trúc Dự Án (Reconstruction Notes)

## 1. Khả năng Tái Biên dịch Trực tiếp (Direct Buildability Assessment)

| Phương thức | Tính khả thi | Đánh giá kỹ thuật |
| :--- | :---: | :--- |
| **Biên dịch trực tiếp từ mã Java đã dịch ngược (`gradle assembleDebug`)** | ❌ **Không khuyến nghị** | Mã nguồn dịch ngược từ R8 minified chứa nhiều định danh xung đột (`a`, `A`), các lớp synthetic coroutines và thiếu các mapping thư viện nội bộ. Đòi hỏi hàng trăm giờ sửa lỗi cú pháp thủ công. |
| **Đóng gói lại từ Smali và Resources (`apktool b`)** | ✅ **Khả thi 100%** | Sử dụng thư mục giải mã bởi Apktool (`AndroidManifest.xml`, tài nguyên `res/`, và mã bytecode trung gian `smali/`), có thể đóng gói lại APK, căn chỉnh (zipalign) và ký số (apksigner) để chạy thử nghiệm. |
| **Tái lập dự án mã nguồn sạch (Clean-room Implementation)** | ⭐ **Khuyến nghị cao nhất** | Sử dụng các thông tin khôi phục (Protobuf contract `Messages.java`, schema `AppSettings.proto`, cơ chế mã hóa `CryptoBox`, giải nén LZ4) để xây dựng ứng dụng mã nguồn mở tương thích hoàn hảo với Stream Deck PC. |

---

## 2. Hướng dẫn Tái tạo Ứng dụng Mã Nguồn Sạch (Clean-room Implementation Guide)

Nếu bạn muốn tạo một ứng dụng Android hoặc Desktop tương thích với Elgato Stream Deck Desktop, bạn chỉ cần các thành phần cốt lõi sau đã được khám phá trong dự án này:

### A. Thư viện Phụ thuộc (Dependencies)
```kotlin
// build.gradle.kts
dependencies {
    // 1. Giao thức mạng thời gian thực
    implementation("io.ktor:ktor-client-core:2.3.9")
    implementation("io.ktor:ktor-client-cio:2.3.9")
    implementation("io.ktor:ktor-client-websockets:2.3.9")

    // 2. Mật mã học (Libsodium Curve25519)
    implementation("com.goterl:lazysodium-android:5.1.0@aar")
    implementation("net.java.dev.jna:jna:5.13.0@aar")

    // 3. Serializer Protobuf
    implementation("com.google.protobuf:protobuf-javalite:3.25.3")

    // 4. Giải nén ảnh siêu tốc (LZ4)
    implementation("org.lz4:lz4-java:1.8.0")

    // 5. Quét mã QR
    implementation("com.google.mlkit:barcode-scanning:17.2.0")
    implementation("androidx.camera:camera-camera2:1.3.4")
}
```

### B. Các bước kết nối tới Stream Deck PC
1. **Quét QR Code**: Máy tính Stream Deck hiển thị chuỗi JSON chứa IP, Port và Secret Key/Fingerprint.
2. **Thiết lập WebSocket**: Mở kết nối `ws://<PC_IP>:<PORT>`.
3. **Mã hóa Handshake**: Dùng `LazySodium` tạo cặp khóa Curve25519, tính khóa đối xứng chung và bắt đầu mã hóa hai chiều.
4. **Nhận Frame đồ họa**: Khi PC gửi thông điệp `Icon` (Protobuf `Messages.Icon`), giải nén mảng byte bằng thuật toán LZ4 và hiển thị lên giao diện Compose.
5. **Gửi sự kiện phím**: Khi người dùng chạm vào ô phím trên màn hình, đóng gói thông điệp `Action` / `KeyDown` qua Protobuf và gửi qua WebSocket.

---

## 3. Hướng dẫn Đóng gói lại bằng Apktool (Patching & Rebuilding)

Khi cần thực hiện patch logic trong smali:
```bash
# 1. Đóng gói lại thư mục apktool
apktool b .scratch/xapk_unpacked/apktool_base -o rebuilt_streamdeck.apk

# 2. Căn chỉnh 4-byte (Zipalign)
zipalign -p -f -v 4 rebuilt_streamdeck.apk aligned_streamdeck.apk

# 3. Ký số với debug keystore
apksigner sign --ks ~/.android/debug.keystore --ks-pass pass:android aligned_streamdeck.apk
```
