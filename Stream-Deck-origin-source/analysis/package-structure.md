# Phân Tích Cấu Trúc Gói Ứng Dụng (Package Structure Analysis)

## 1. Tổng quan định dạng gói (Container Format)
Tệp cài đặt đầu vào của Stream Deck Mobile có định dạng **APKX (XAPK v2)** được đóng gói bởi APKPure từ định dạng gốc Google Play **Android App Bundle (AAB)**.

- **Kích thước tổng**: `31,058,992 bytes` (~31.05 MB)
- **Cấu trúc container**:
  ```
  Elgato+Stream+Deck+Mobile_2.1.2_APKPure.xapk
  ├── manifest.json                       [APKPure XAPK Manifest]
  ├── icon.png                            [Application Icon 512x512]
  ├── com.corsair.android.streamdeck.apk  [Base Master APK - 18.5 MB]
  ├── config.arm64_v8a.apk                [ABI Architecture Split - 7.85 MB]
  ├── config.en.apk                       [Language/Locale Split - 49.5 KB]
  └── config.mdpi.apk                     [Screen Density Split - 4.50 MB]
  ```

---

## 2. Chi tiết các Phân đoạn APK (Split APKs)

### A. Base APK (`com.corsair.android.streamdeck.apk`)
- **Dung lượng**: 18,510,606 bytes
- **Vai trò**: Chứa toàn bộ bytecode logic chính, AndroidManifest tổng thể, cấu trúc layout Compose/XML cơ sở, bảng tài nguyên chung và asset ứng dụng.
- **Thành phần cốt lõi**:
  - `classes.dex` (6.87 MB) và `classes2.dex` (4.81 MB): Bytecode thực thi của ứng dụng.
  - `AppSettings.proto`: Định nghĩa schema Protobuf cấu hình thiết bị và kết nối PC.
  - `assets/mlkit_barcode_models/`: Các mô hình TensorFlow Lite nhận diện mã QR ghép nối.
  - `assets/open_source_licenses.json`: Danh mục đầy đủ 197 thư viện mã nguồn mở với phiên bản chính xác.

### B. ABI Split (`config.arm64_v8a.apk`)
- **Dung lượng**: 7,857,196 bytes
- **Kiến trúc mục tiêu**: 64-bit ARM (`arm64-v8a`)
- **Danh sách thư viện nhị phân (`.so`)**:
  | Thư viện (.so) | Kích thước | Chức năng chính |
  | :--- | :--- | :--- |
  | `libvsd2-android.so` | 92 KB | **Virtual Stream Deck 2 JNI Bridge**: Quản lý CryptoBox và giải nén hình ảnh nút bấm |
  | `libsodium.so` | 395 KB | Thư viện mã hóa học **Libsodium** (Curve25519, Box authentication) |
  | `libsentry.so` | 1.28 MB | Sentry native crash reporting & signal catching |
  | `libsentry-android.so` | 16 KB | Sentry Android JNI wrapper |
  | `libbarhopper_v3.so` | 5.26 MB | Google ML Kit Barcode Recognition engine |
  | `libpairipcore.so` | 625 KB | Google Play Protect / PairIP runtime integrity shield |
  | `libimage_processing_util_jni.so` | 32 KB | Android CameraX image processing utility |
  | `libdatastore_shared_counter.so` | 7.1 KB | Jetpack DataStore lock counter |
  | `libsurface_util_jni.so` | 4.9 KB | Android Surface graphic render helper |

### C. Locale Split (`config.en.apk`)
- **Dung lượng**: 49,561 bytes
- **Vai trò**: Cung cấp chuỗi tài nguyên ngôn ngữ tiếng Anh (`values-en/strings.xml`).

### D. Density Split (`config.mdpi.apk`)
- **Dung lượng**: 4,500,384 bytes
- **Vai trò**: Cung cấp tài nguyên hình ảnh được tối ưu hóa cho mật độ điểm ảnh MDPI (`drawable-mdpi`, `drawable-ldrtl-mdpi`, v.v.).

---

## 3. Phân vùng Bytecode DEX (Multi-DEX Architecture)
Ứng dụng sử dụng cấu trúc Multi-DEX 2 phần với tổng dung lượng `11.68 MB`:
1. **`classes.dex`**:
   - Chứa gói mã nguồn chính `com.elgato.*`, `com.corsair.android.streamdeck.*`, các package `io.jentz.winter.*`, `com.pairip.*`, và phần lớn các lớp cơ sở của Jetpack Compose và AndroidX.
2. **`classes2.dex`**:
   - Chứa phần bổ sung của Ktor Client, Google Play Billing Client, ML Kit Barcode Vision, Sentry, Room Database và các synthetic lambdas.

---

## 4. Cấu trúc Package sau khi khôi phục (Recovered Package Tree)
Toàn bộ mã nguồn đã được khôi phục thành công ra **8,857 tệp Java** theo cấu trúc phân tầng:
```
recovered/java/
├── com/
│   ├── corsair/android/streamdeck/     [Lớp R.java và thông tin định danh]
│   ├── elgato/
│   │   ├── streamdeck/                 [Application, MainActivity, MainViewModel, DI]
│   │   │   └── vsd2/                   [Giao thức kết nối, CryptoBox, Image Decompressor]
│   │   ├── telemetry/                  [TelemetryDatabase, Datamaster Room DB]
│   │   └── vsd2/                       [Messages.java - 8,347 dòng Protobuf contract]
│   ├── revenuecat/purchases/           [Quản lý License, Subscription & Store Sync]
│   ├── pairip/                         [Google Play Integrity protection wrappers]
│   ├── google/                         [ML Kit, Protobuf Lite, DataTransport, Tink Crypto]
│   ├── amazon/                         [Amazon Appstore IAP SDK]
│   └── airbnb/lottie/                  [Lottie Animation player cho Compose]
├── io/
│   ├── jentz/winter/                   [Winter Dependency Injection engine]
│   ├── ktor/                           [Ktor Network engine, WebSockets, CIO engine]
│   └── sentry/                         [Sentry Error & Performance monitoring]
└── [A-Z0-9]/                           [Các package bị obfuscate bởi R8 - xem thêm limitations]
```
