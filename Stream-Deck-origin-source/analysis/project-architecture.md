# Báo Cáo Phân Tích Kiến Trúc Toàn Diện Dự Án (Project Architecture Analysis)
# Elgato Stream Deck Mobile — Phiên Bản 2.1.2

> **Tài liệu đặc tả kiến trúc**: Phân tích cấu trúc hệ thống, chu trình khởi tạo, giao thức truyền thông VSD2, mật mã học, quản lý bản quyền và sự phân tách định danh gói phục vụ dự án đóng gói phiên bản tùy biến.
> **Vị trí tài liệu**: `Stream-Deck-origin-source/analysis/project-architecture.md`

---

## 1. Tổng Quan Kiến Trúc Đa Tầng (High-Level Architecture)

Ứng dụng **Elgato Stream Deck Mobile** áp dụng mô hình phân tách tầng nghiêm ngặt (Clean Layered Architecture) kết hợp lập trình phản ứng (Reactive Programming) trên nền tảng Kotlin:

```
┌────────────────────────────────────────────────────────────────────────┐
│                   TẦNG TRÌNH DIỄN (PRESENTATION LAYER)                 │
│   • Jetpack Compose 1.6.8 + Material3 1.2.1 + Lottie Animations        │
│   • Điều hướng: Voyager Navigation (cafe.adriel.voyager 1.0.0)         │
│   • Mô hình quản lý: ViewModel + Kotlin Coroutines & StateFlow         │
│   • Dependency Injection: Winter DI (io.jentz.winter 0.10.0-alpha1)    │
└───────────────────────────────────┬────────────────────────────────────┘
                                    │
┌───────────────────────────────────▼────────────────────────────────────┐
│                  TẦNG MIỀN & GIAO THỨC VSD2 (DOMAIN LAYER)              │
│   • Cấu hình ứng dụng: AppSettingsStore (Jetpack DataStore + Protobuf)  │
│   • Điểm kết nối trạm: KnownHost, StaticHost, Endpoint                 │
│   • Khế ước thông điệp: Messages.java (8,347 dòng Protobuf Lite)       │
│   • Quản lý bản quyền ứng dụng: A3.r (implement S3.a & A3.n)           │
└───────────────────┬────────────────────────────────┬───────────────────┘
                    │                                │
┌───────────────────▼─────────────┐    ┌─────────────▼───────────────────┐
│     KẾT NỐI MẠNG & BẢO MẬT      │    │    GIẢI NÉN ĐỒ HỌA NÚT BẤM      │
│   • Ktor Client 2.3.9           │    │   • ImageDecompressor           │
│   • WebSockets (CIO Engine)     │    │   • Thuật toán: LZ4, LZF, LZFSE │
│   • CryptoBoxAndroid            │    │   • Bộ đệm khung hình thời gian │
│   • Libsodium (Curve25519)      │    │     thực 60 FPS                 │
└───────────────────┬─────────────┘    └─────────────┬───────────────────┘
                    │                                │
┌───────────────────▼────────────────────────────────▼───────────────────┐
│               TẦNG GỐC C/C++ (NATIVE JNI ENGINE - ARM64)               │
│   • libvsd2-android.so (JNI bindings cho CryptoBox & Image Decoders)   │
│   • libsodium.so (Thư viện mật mã học Curve25519 chuẩn)                │
│   • libbarhopper_v3.so (Mô hình nhận diện mã QR của ML Kit)            │
│   • libsentry.so & libsentry-android.so (Giám sát sự cố mã gốc)        │
└────────────────────────────────────────────────────────────────────────┘
```

---

## 2. Chu Trình Khởi Tạo & Vòng Đời Ứng Dụng (Application Initialization)

### A. Lớp Ứng Dụng Cốt Lõi (`com.elgato.streamdeck.StreamDeckApplication`)
Trong mã nguồn nguyên bản của nhà phát triển Elgato, `StreamDeckApplication` là lớp dẫn xuất từ `android.app.Application`, chịu trách nhiệm:
1. **Thiết lập Đồ thị Phụ thuộc (Winter DI)**:
   - Nạp đồ thị `applicationComponent` tại [`DiKt$applicationComponent$1.java`](file:///data/Codebase/Stream%20Deck%20Pro/Stream-Deck-origin-source/recovered/java/com/elgato/streamdeck/DiKt$applicationComponent$1.java).
   - Đăng ký singleton cho `Context`, `Application`, `AppSettingsStore`, `TelemetryDatabase`, `Purchases` (RevenueCat), và `Ktor HttpClient`.
2. **Khởi tạo Hệ thống Báo cáo Sentry**:
   - Tự động nạp DSN `https://050c027ff4284c8a80d6862c00c33991@o324181.ingest.us.sentry.io/4503981576290304`.
   - Cấu hình tỷ lệ lấy mẫu trace 5% và đính kèm cây phân cấp giao diện (View Hierarchy).
3. **Quản lý Cấu hình Bền vững (DataStore)**:
   - Nạp tệp cấu hình `AppSettings.proto` từ thư mục dữ liệu cục bộ của ứng dụng để trích xuất danh sách máy tính ghép nối (`KnownHosts`) và trạng thái kích hoạt Pro (`isProUser`).

### B. Vỏ Bọc Bảo Vệ Chữ Ký Google Play (PairIP Wrapper)
- **Thực tế đã xác minh**: Bản phát hành thương mại từ Google Play đã được bọc một lớp ảo hóa mã bytecode và kiểm tra tính toàn vẹn mang tên **PairIP** (`com.pairip.application.Application`).
- Khi khởi chạy, PairIP kiểm tra chữ ký SHA-256 đối chiếu với khóa chứng chỉ của Elgato (`MGx9WT4NA63FqtmYcO3tI+ryvG6i8+l22r9DlNqeDck=`). Nếu chữ ký không khớp (ví dụ: khi ký lại bằng khóa phát triển), PairIP sẽ ném ngoại lệ `SignatureTamperedException` và dừng tiến trình.
- **Giải pháp bóc tách trong bản custom**: Thay vì chạy qua wrapper `com.pairip.application.Application`, cấu hình manifest được chuyển trực tiếp về `com.elgato.streamdeck.StreamDeckApplication`. Điều này cho phép ứng dụng khởi động độc lập, không bị ràng buộc vào chữ ký gốc của Elgato hay dịch vụ Play App Signing.

---

## 3. Phân Tích AndroidManifest.xml & Các Thành Phần Hệ Thống

| Thành phần | Định danh lớp | Quyền hạn / Bộ lọc | Mục đích kỹ thuật |
| :--- | :--- | :--- | :--- |
| **Activity Chính** | `com.elgato.streamdeck.MainActivity` | `LAUNCHER`, `VIEW` (Deep Link `streamdeck.elgato.com/connect`) | Giao diện điều khiển đơn Activity duy nhất; khởi chạy Voyager Navigator và render bảng phím. |
| **IAP Proxy Activity** | `com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity` | Translucent | Cửa sổ trung gian hiển thị hộp thoại thanh toán Amazon Appstore. |
| **Google Play Billing** | `com.android.billingclient.api.ProxyBillingActivity` & `V2` | Translucent | Xử lý thanh toán Google Play Billing v7.0.0. |
| **Content Provider** | `androidx.startup.InitializationProvider` | Authority: `${applicationId}.androidx-startup` | Tự động khởi tạo Emoji2, ProcessLifecycle và ProfileInstaller. |
| **Content Provider** | `com.google.mlkit.common.internal.MlKitInitProvider` | Authority: `${applicationId}.mlkitinitprovider` | Khởi tạo động cơ quét thị giác ML Kit Barcode. |
| **Content Provider** | `io.sentry.android.core.SentryInitProvider` | Authority: `${applicationId}.SentryInitProvider` | Tự động nạp bộ điều hợp giám sát Sentry Android. |
| **Background Service** | `com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService` | `android.permission.BIND_JOB_SERVICE` | Lập lịch đẩy dữ liệu phân tích telemetry qua JobScheduler. |
| **Database Service** | `androidx.room.MultiInstanceInvalidationService` | Nội bộ | Đồng bộ hóa bộ nhớ đệm đa tiến trình cho Room Database. |

---

## 4. Giao Thức Mạng VSD2 & Động Cơ Mật Mã Học (Virtual Stream Deck 2)

Ứng dụng di động đóng vai trò là một **Bàn phím Stream Deck ảo (Virtual Hardware)** kết nối với ứng dụng Stream Deck Desktop (PC/Mac) qua mạng Wi-Fi/LAN:

### A. Khế Ước Dữ Liệu Protocol Buffers (`Messages.java`)
Giao thức VSD2 được đóng gói bằng Google Protocol Buffers Lite (8,347 dòng mã nguồn), định nghĩa:
- **`Action`**: Vị trí ô phím (`index` từ 0 đến 14 trên lưới 3x5 chuẩn hoặc mở rộng), tên plugin (`OBS`, `Discord`, `Philips Hue`), nhãn hiển thị và shortcutID.
- **`Icon` / `Image`**: Luồng byte đồ họa động/tĩnh gửi từ PC sang thiết bị di động để hiển thị trên phím bấm.
- **Sự kiện Tương tác (User Input Events)**: `KeyDown`, `KeyUp`, `DialRotate`, `DialPress`, `TouchSwipe`, `TouchPress`.

### B. Mật Mã Học Đầu-Cuối (End-to-End Cryptography - Zero-Trust LAN)
1. **Quét mã QR**: Camera điện thoại quét mã QR hiển thị trên màn hình máy tính để nhận `Host IP`, `Port`, và `Fingerprint` băm.
2. **Kênh truyền WebSockets**: Kết nối qua Ktor WebSockets tới địa chỉ `ws://<PC_IP>:<PORT>`.
3. **Trao đổi Khóa Diffie-Hellman**:
   - `CryptoBoxAndroid.createKeypair()` tạo cặp khóa Curve25519 bất đối xứng.
   - `CryptoBoxAndroid.calculateSharedKey()` tính toán khóa bí mật dùng chung thông qua thư viện bản xứ `libsodium.so`.
4. **Mã hóa Frame dữ liệu**: Mọi thông điệp truyền qua mạng sau đó đều được mã hóa bằng hàm `encrypt()` và giải mã bằng `decrypt()` qua `libvsd2-android.so`.

### C. Động Cơ Giải Nén Khung Hình Thời Gian Thực
Máy tính gửi hình ảnh phím bấm dưới dạng mảng byte đã nén. Module C++ `libvsd2-android.so` cung cấp 3 bộ giải nén native:
- **`decodeLZ4`**: Tối ưu hóa cho tốc độ giải nén siêu cao (độ trễ nano-giây), đảm bảo bảng phím render mượt mà ở tần số cao.
- **`decodeLZF`**: Giải nén tiết kiệm RAM cho các ảnh tĩnh.
- **`decodeLZFSE`**: Thuật toán nén chuyên dụng từ hệ sinh thái Apple macOS.

---

## 5. Phân Tích Cơ Chế Bản Quyền & Entitlement (RevenueCat & DataStore)

### A. Tích Hợp Đám Mây RevenueCat
- **SDK**: RevenueCat Android SDK v8.1.0.
- **Khóa API Google Play**: `"goog_OKgVgwbVmfbYpuOGByEveqSIaXC"`.
- **Tên Entitlement**: `"Full Access"`.
- **Lớp dịch vụ ứng dụng**: `A3.r` (triển khai interface `A3.n` và `S3.a`).

### B. Cơ Chế Chịu Lỗi Ngoại Tuyến (Offline Tolerance)
- Khi không có mạng hoặc khi chạy trên thiết bị không kết nối Google Play, `A3.r` đọc cờ `isProUser` được lưu trong bộ nhớ đệm bền vững Jetpack DataStore (`AppSettings.proto`).
- Điều này cho phép ứng dụng tiếp tục hoạt động mà không chặn người dùng khi kết nối thanh toán gặp sự cố.

### C. Sự Khác Biệt Giữa Môi Trường Phát Triển và Môi Trường Sản Xuất
- Trong môi trường sản xuất, bản quyền được đồng bộ hóa từ máy chủ RevenueCat và Google Play Store.
- Trong môi trường kiểm thử/phát triển, việc sử dụng Dependency Injection (`MockLicenseManager` thay thế `S3.a`) hoặc thiết lập cờ cấu hình `isForcedProUser` (Field #6 trong `AppSettings.proto`) cho phép thẩm định hành vi giao diện một cách an toàn mà không xâm phạm hay làm giả hóa đơn thanh toán sản xuất.

---

## 6. Phân Biệt Giữa Application ID Và JNI Symbol Namespace

Một phát hiện kỹ thuật đặc biệt quan trọng:
1. **Application ID (Package trong AndroidManifest)**:
   - Gốc: `com.corsair.android.streamdeck`
   - Bản tùy biến: `com.fin12n.streamdeck`
   - Vai trò: Định danh ứng dụng đối với hệ điều hành Android, quản lý quyền dữ liệu sandboxing và Content Provider authorities.
2. **Java Class Package & JNI Symbol Namespace**:
   - Gói mã nguồn: `com.elgato.streamdeck.vsd2.CryptoBoxAndroid`
   - Tên hàm JNI trong `libvsd2-android.so`: `Java_com_elgato_streamdeck_vsd2_CryptoBoxAndroid_createKeypair`
   - **Kết luận**: Các hàm C/C++ trong thư viện gốc liên kết động với tên gói Java class (`com.elgato.streamdeck`), **KHÔNG** liên kết với Application ID (`com.corsair.android.streamdeck`). Do đó, việc thay đổi Application ID thành `com.fin12n.streamdeck` hoàn toàn không làm đứt gãy liên kết JNI native!

---

## 7. Phân Định Giữa Thực Tế Đã Kiểm Chứng & Giả Định (Verified vs Assumptions)

| Nội dung | Phân loại | Bằng chứng kiểm chứng |
| :--- | :---: | :--- |
| **Giao thức VSD2 dùng WebSockets & Protobuf Lite** | `XÁC MINH 100%` | Đã kiểm tra 8,347 dòng mã nguồn `Messages.java` và Ktor client. |
| **Libsodium Curve25519 chạy trên mã gốc ARM64** | `XÁC MINH 100%` | Đã kiểm tra bảng export symbol của `libvsd2-android.so` và `libsodium.so`. |
| **Lớp bảo vệ PairIP chặn chữ ký lạ** | `XÁC MINH 100%` | Đã đọc mã nguồn `SignatureCheck.java` và `com.pairip.application.Application`. |
| **Thay đổi Application ID không ảnh hưởng tới JNI** | `XÁC MINH 100%` | Symbol `Java_com_elgato_streamdeck_vsd2_CryptoBoxAndroid_*` phụ thuộc vào class path `com.elgato`, không phụ thuộc Application ID. |
| **Dự án mã nguồn Java dịch ngược không thể build trực tiếp qua Gradle** | `XÁC MINH 100%` | Phân tích R8 minification, lớp synthetic và định danh xung đột. |
| **Có thể repackage thành công APK độc lập bằng Apktool** | `XÁC MINH 100%` | Đã thực nghiệm biên dịch lại, gom gộp 9 thư viện `.so` và ký số thành công APK 30.48 MB. |
| **Khả năng quét QR trên thiết bị không có Google Play Services** | `GIẢ ĐỊNH` | ML Kit Barcode Vision sử dụng mô hình TFLite trong `assets/` kết hợp `libbarhopper_v3.so`, dự kiến có thể chạy độc lập (bundled mode). |
