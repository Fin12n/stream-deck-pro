# Stream Deck Mobile — Dự Án Dịch Ngược & Khôi Phục Cấu Trúc Mã Nguồn
# (Reverse Engineering & Source Recovery Project)

> **Mục đích dự án**: Khôi phục cấu trúc mã nguồn, tài nguyên và phân tích kiến trúc ứng dụng **Elgato Stream Deck Mobile** phục vụ nghiên cứu khả năng tương thích phần mềm, phân tích giao thức mạng VSD2 và kỹ thuật kiến trúc Android hiện đại.

---

## 📌 Thông Tin Ứng Dụng Mục Tiêu (Target Information)

- **Tên thương mại**: Stream Deck Mobile
- **Mã gói (Package ID)**: `com.corsair.android.streamdeck`
- **Nhà phát triển**: Elgato Systems GmbH / Corsair Memory Inc.
- **Phiên bản (Version)**: `2.1.2` (Version Code: `117`)
- **Target SDK**: `35` (Android 15) | **Min SDK**: `28` (Android 9.0 Pie)
- **Tệp gốc đầu vào**: [`Elgato+Stream+Deck+Mobile_2.1.2_APKPure.xapk`](file:///data/Codebase/Stream%20Deck%20Pro/Elgato+Stream+Deck+Mobile_2.1.2_APKPure.xapk) (31.05 MB)

---

## 📂 Bản Đồ Thư Mục Dự Án (Project Structure)

```
Stream-Deck-origin-source/
├── README.md                               [Tài liệu tổng quan dự án này]
├── analysis/                               [Các báo cáo phân tích chuyên sâu]
│   ├── package-structure.md                [Phân tích cấu trúc XAPK, Split APKs, DEX]
│   ├── manifest-analysis.md                [Phân tích quyền hạn, components, deep links]
│   ├── architecture.md                     [Kiến trúc ứng dụng, giao thức VSD2, mật mã học]
│   ├── license-architecture.md             [Kiểm toán kiến trúc bản quyền & RevenueCat]
│   ├── license-call-graph.md               [Đồ thị chuỗi lời gọi xác thực & lan truyền bản quyền]
│   ├── license-debugging.md                [Cẩm nang chẩn đoán lỗi Entitlement & Test an toàn]
│   ├── license-test-architecture.md        [Kiến trúc môi trường kiểm thử bản quyền cách ly]
│   ├── license-testing-report.md           [Báo cáo thực thi 8 test cases & xác nhận an toàn]
│   └── recovery-limitations.md             [Báo cáo giới hạn kỹ thuật, R8 minification]
├── test/                                   [Môi trường kiểm thử độc lập (Isolated Test Harness)]
│   └── licensing/                          [Bộ test harness bản quyền qua Dependency Injection]
│       ├── SimulatedEntitlementState.kt    [6 trạng thái cấp phép mô phỏng]
│       ├── MockLicenseManager.kt           [Triển khai S3.a & A3.n qua Winter DI]
│       ├── TestModuleConfig.kt             [Safety Guardrails & Debug overrides]
│       ├── LicenseBehaviorTestSuite.kt     [8 unit tests cấp mã nguồn xác thực hành vi]
│       └── run_tests.py                    [Script thực thi kiểm thử độc lập tự động]
├── recovered/                              [Tài nguyên và mã nguồn đã khôi phục]
│   ├── java/                               [8,857 tệp mã nguồn Java/Kotlin đã dịch ngược]
│   │   ├── com/elgato/                     [Mã nguồn cốt lõi: VSD2, Telemetry, UI]
│   │   ├── com/corsair/                    [Package định danh ứng dụng]
│   │   └── io/ktor/, io/jentz/winter/      [Thư viện mạng Ktor và DI Winter]
│   ├── kotlin/                             [Tài liệu và chỉ mục thành phần Kotlin]
│   │   └── README.md                       [Hướng dẫn ánh xạ tính năng ngôn ngữ Kotlin]
│   ├── resources/                          [Toàn bộ tài nguyên giải mã bởi Apktool]
│   │   ├── base/                           [Layouts, colors, drawables, navigation]
│   │   ├── split_en/                       [Chuỗi ngôn ngữ tiếng Anh strings.xml]
│   │   └── split_mdpi/                     [Tài nguyên hình ảnh raster MDPI]
│   ├── assets/                             [Tài sản ứng dụng trích xuất]
│   │   ├── AppSettings.proto               [Schema Protobuf cấu hình thiết bị]
│   │   ├── open_source_licenses.json       [Chi tiết 197 thư viện mã nguồn mở]
│   │   └── mlkit_barcode_models/           [Model TensorFlow Lite quét mã QR]
│   ├── manifest/                           [Toàn bộ tệp AndroidManifest đã giải mã]
│   │   ├── AndroidManifest.xml             [Manifest chính từ Apktool]
│   │   ├── AndroidManifest.jadx.xml        [Manifest xuất từ JADX]
│   │   └── splits/                         [Manifest con của các split modules]
│   ├── native-libraries/                   [Thư viện thực thi nhị phân ARM64]
│   │   ├── arm64-v8a/                      [9 tệp thư viện .so: libvsd2-android, libsodium...]
│   │   └── symbols/                        [Bảng export symbols và dynamic headers qua nm/readelf]
│   └── splits/                             [Tài liệu phân đoạn module APK App Bundle]
├── metadata/                               [Thông số kỹ thuật và phiên bản công cụ]
│   ├── manifest.json                       [File manifest.json gốc từ container XAPK]
│   ├── package-info.txt                    [Thông số kỹ thuật chi tiết của ứng dụng]
│   ├── tool-versions.txt                   [Phiên bản công cụ JADX, Apktool, JDK, OS]
│   └── dependencies.txt                    [Danh sách 197 dependencies chính xác]
└── build/                                  [Tài liệu và cấu hình phục vụ tái tạo dự án]
    ├── reconstruction-notes.md             [Đánh giá khả năng build và hướng dẫn clean-room]
    ├── root.build.gradle                   [Cấu hình Gradle root project]
    ├── app.build.gradle                    [Cấu hình Gradle app module]
    └── settings.gradle                     [Cấu hình Gradle settings]
```

---

## 🔍 Những Phát Hiện Kỹ Thuật Quan Trọng (Key Technical Findings)

1. **Giao thức Mạng Virtual Stream Deck 2 (VSD2)**:
   - Ứng dụng hoạt động như một thiết bị ngoại vi ảo kết nối với phần mềm Stream Deck trên PC/Mac qua **Ktor WebSockets**.
   - Khế ước dữ liệu được định nghĩa đầy đủ trong [`com.elgato.vsd2.Messages.java`](file:///data/Codebase/Stream%20Deck%20Pro/Stream-Deck-origin-source/recovered/java/com/elgato/vsd2/Messages.java) (8,347 dòng code Protobuf Lite).
2. **Bảo mật và Mật mã học (Zero-Trust Cryptography)**:
   - Sử dụng thư viện gốc **Libsodium** (`libsodium.so`) thông qua lớp JNI [`CryptoBoxAndroid.java`](file:///data/Codebase/Stream%20Deck%20Pro/Stream-Deck-origin-source/recovered/java/com/elgato/streamdeck/vsd2/CryptoBoxAndroid.java).
   - Trao đổi khóa bất đối xứng trên đường cong Curve25519 (`crypto_box`) và xác thực bằng vân tay băm (`fingerprint`).
3. **Giải Nén Khung Hình Nút Bấm Siêu Tốc**:
   - Hình ảnh hiển thị trên từng nút bấm được PC nén và truyền qua mạng, sau đó được giải nén thời gian thực trong C++ (`libvsd2-android.so`) qua 3 thuật toán: **LZ4**, **LZF**, và **LZFSE** (định dạng nén của Apple).
4. **Quy trình Ghép Nối Bằng Mã QR**:
   - Sử dụng **CameraX** kết hợp **Google ML Kit Barcode Vision** (`libbarhopper_v3.so` + mô hình TFLite trong `assets/`) để quét mã QR trên màn hình PC và tự động trích xuất IP, Port, Secret Token.
5. **Kiến Trúc UI Hiện Đại**:
   - Xây dựng 100% bằng **Jetpack Compose 1.6.8**, **Material3**, thư viện điều hướng **Voyager**, và hệ thống Dependency Injection siêu nhẹ **Winter DI**.
6. **Bản Quyền & Thương Mại**:
   - Quản lý gói thuê bao qua **RevenueCat SDK 8.1.0**, hỗ trợ đồng thời Google Play Billing 7.0.0 và Amazon Appstore IAP 3.0.5.

---

## 🛠️ Công Cụ Đã Sử Dụng (Toolkit)
- **JADX v1.5.6**: Dịch ngược bytecode DEX thành mã nguồn Java/Kotlin và trích xuất cấu trúc Gradle.
- **Apktool v3.0.3**: Giải mã bảng tài nguyên `resources.arsc`, XML layouts, chuỗi ngôn ngữ và tái tạo `AndroidManifest.xml`.
- **OpenJDK 21.0.4 Temurin**: Môi trường Java 64-bit thực thi decompiler.
- **GNU Binutils (`readelf`, `nm`)**: Trích xuất bảng symbol và phân tích thư viện liên kết động C++.
- **`reverse-skill` framework**: Quy chuẩn thực thi nghiệp vụ dịch ngược an toàn.
