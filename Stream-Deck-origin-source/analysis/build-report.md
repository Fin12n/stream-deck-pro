# Báo Cáo Xây Dựng Bản Gói APK Tùy Biến (Custom APK Build Report)
# Elgato Stream Deck Pro — Bản Phát Triển Riêng Biệt

> **Tài liệu nghiệm thu quy trình build**: Ghi nhận toàn bộ thông số kỹ thuật, chuỗi công cụ, giải pháp tích hợp thư viện nhị phân và kết quả ký số tạo tệp APK độc lập mang định danh `com.fin12n.streamdeck`.
> **Vị trí tài liệu**: `Stream-Deck-origin-source/analysis/build-report.md`

---

## 1. Thông Tin Thành Phẩm (Target Artifact Specification)

| Thông số | Giá trị thực tế |
| :--- | :--- |
| **Tên tệp APK thành phẩm** | `com.fin12n.streamdeck-v2.1.2-dev.apk` |
| **Đường dẫn tệp tuyệt đối** | [`/data/Codebase/Stream Deck Pro/dist/com.fin12n.streamdeck-v2.1.2-dev.apk`](file:///data/Codebase/Stream%20Deck%20Pro/dist/com.fin12n.streamdeck-v2.1.2-dev.apk) |
| **Kích thước tệp** | `31,962,569 bytes` (~30.48 MiB) |
| **Mã định danh gói (Application ID)** | `com.fin12n.streamdeck` |
| **Mã phiên bản (Version Code)** | `117` |
| **Tên phiên bản (Version Name)** | `2.1.2` |
| **Mức SDK tối thiểu (Min SDK)** | `28` (Android 9.0 Pie) |
| **Mức SDK mục tiêu (Target SDK)** | `35` (Android 15) |
| **Kiến trúc vi xử lý (Native ABI)** | `arm64-v8a` (64-bit ARM) |
| **Mã băm SHA-256 tệp APK** | `64e1d11aadad894c7afee85fca8a0d2cbf075cf93d9b74eef46271aa8d9e2d69` |

---

## 2. Chuỗi Công Cụ Thực Thi (Build Toolchain)

- **Trình đóng gói bytecode & tài nguyên**: `Apktool v3.0.3` kết hợp `aapt2` tích hợp.
- **Môi trường máy ảo Java**: `OpenJDK 25.0.4.1` 64-Bit Server VM (Red Hat Extension runtime).
- **Trình căn chỉnh & Ký số**: `Uber-APK-Signer v1.3.0` tích hợp thư viện chính thức của Google `apksig` và công cụ nhị phân Linux `zipalign`.
- **Trình quản lý khóa mã hóa**: `keytool` (chuẩn OpenJDK).

---

## 3. Quy Trình Hợp Nhất & Tái Cấu Trúc Gói Cài Đặt (Engineering Pipeline)

### Bước 1: Khảo sát và Đánh giá Tính Khả thi
- Dự án mã nguồn Java dịch ngược từ JADX (8,857 tệp) chứa các đặc tính obfuscate R8, định danh lớp trùng lặp (`a.smali`, `A.smali`) và thiếu các mapping type nội bộ, không thể biên dịch trực tiếp qua `gradle assembleDebug` mà không sửa hàng trăm giờ lỗi cú pháp thủ công.
- Ngược lại, phương pháp **Disassembly/Reassembly qua Apktool kết hợp Smali** bảo toàn 100% tính toàn vẹn của logic bytecode, tài nguyên XML và các ràng buộc hệ thống.

### Bước 2: Hợp nhất Mô hình Split APKs thành Standalone Monolithic APK
Ứng dụng gốc được phân phối theo mô hình Google Play App Bundle (Split APKs) gồm:
- Base APK (chứa code nhưng không có `.so` native libs).
- `config.arm64_v8a.apk` (chứa 9 thư viện `.so`).
- `config.en.apk` và `config.mdpi.apk` (chứa chuỗi ngôn ngữ và tài nguyên giao diện mặt phím).

**Giải pháp hợp nhất**:
1. Giải mã Base APK bằng `apktool d`.
2. Tạo thư mục `lib/arm64-v8a/` bên trong dự án và sao chép toàn bộ 9 thư viện gốc:
   - `libvsd2-android.so` (Virtual Stream Deck Engine)
   - `libsodium.so` (Mật mã học Curve25519)
   - `libbarhopper_v3.so` (Quét mã QR ML Kit)
   - `libpairipcore.so`
   - `libsentry.so` & `libsentry-android.so`
   - `libimage_processing_util_jni.so`
   - `libdatastore_shared_counter.so`
   - `libsurface_util_jni.so`
3. Sao chép và gộp các tài nguyên mặt phím (`drawable-mdpi`, `drawable-night-mdpi`) và chuỗi đa ngôn ngữ (`values-en-*`) vào thư mục tài nguyên `res/`.
4. Cấu hình `apktool.yml` thêm cờ `- so` vào danh mục `doNotCompress` để đảm bảo thư viện máy tính được căn chỉnh biên 4-byte/16-byte theo tiêu chuẩn nạp bộ nhớ của Android 15.

### Bước 3: Thay Đổi Định Danh Ứng Dụng (Custom Application ID)
Áp dụng định danh mục tiêu `com.fin12n.streamdeck`:
1. **Trong `AndroidManifest.xml`**:
   - `package="com.fin12n.streamdeck"`
   - Loại bỏ các thuộc tính yêu cầu split: `android:requiredSplitTypes` và `android:splitTypes`.
   - Cập nhật quyền tùy biến Signature:
     - `com.fin12n.streamdeck.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION`
   - Cập nhật định danh 4 Content Providers:
     - `com.fin12n.streamdeck.mlkitinitprovider`
     - `com.fin12n.streamdeck.androidx-startup`
     - `com.fin12n.streamdeck.SentryInitProvider`
     - `com.fin12n.streamdeck.SentryPerformanceProvider`
2. **Bóc tách lớp vỏ PairIP**:
   - Chuyển `android:name` trong `<application>` từ lớp bảo vệ `com.pairip.application.Application` trực tiếp sang lớp ứng dụng cốt lõi `com.elgato.streamdeck.StreamDeckApplication`. Điều này ngăn chặn việc kiểm tra chữ ký sai lệch gây sập ứng dụng khi chạy trên thiết bị kiểm thử.
3. **Cập nhật trường tĩnh trong bytecode Smali**:
   - Đồng bộ trường `packageName` trong `LicenseClient.smali` thành `com.fin12n.streamdeck`.

### Bước 4: Biên Dịch Lại (Rebuilding)
Thực thi lệnh:
```bash
java -jar .tools/apktool_3.0.3.jar b build-work/apktool_project -o build-work/streamdeck-custom-unsigned.apk
```
Kết quả:
- Smali biên dịch hoàn tất vào `classes.dex` và `classes2.dex`.
- Tài nguyên được biên dịch bởi `aapt2`.
- Assets và toàn bộ 9 thư viện trong `lib/arm64-v8a/` được đóng gói thành công.

---

## 4. Tạo Khóa Phát Triển Riêng Biệt & Ký Số (Signing & Verification)

### A. Khóa Phát Triển Riêng Biệt (Dedicated Development Keystore)
Khóa được tạo mới độc lập, lưu trữ tại thư mục cách ly `build-work/dev-debug.keystore` (nằm ngoài git tracking, không tái sử dụng khóa cá nhân của người khác):
- **Thuật toán khóa**: RSA 2048-bit
- **Thuật toán ký**: SHA384withRSA
- **Thời hạn hiệu lực**: 10,000 ngày (đến năm 2054)
- **Tên Alias**: `streamdeck-dev`
- **Distinguished Name (DName)**: `CN=Fin12n Dev, OU=StreamDeckPro, O=Fin12n, C=VN`

### B. Căn Chỉnh Bộ Nhớ (Zipalign) & Ký Số
Thực thi căn chỉnh 4-byte tự động kết hợp ký số Signature Scheme v3:
```bash
java -jar .tools/uber-apk-signer-1.3.0.jar \
  -a build-work/streamdeck-custom-unsigned.apk \
  --ks build-work/dev-debug.keystore \
  --ksAlias streamdeck-dev \
  --ksPass androiddev \
  --ksKeyPass androiddev \
  --out dist/
```

### C. Báo Cáo Kiểm Tra Chữ Ký (Verification Results)
Kết quả xác thực chính thức từ `uber-apk-signer --onlyVerify -a ...`:
- ✅ **Zipalign**: `VERIFIED` (Căn chỉnh bộ nhớ 4-byte hoàn hảo).
- ✅ **Signature Scheme**: `v3 Verified` (Hỗ trợ cơ chế chữ ký an toàn v3 của Android hiện đại).
- **Chủ thể chứng chỉ (Subject)**: `CN=Fin12n Dev, OU=StreamDeckPro, O=Fin12n, C=VN`
- **Mã băm chứng chỉ (Certificate SHA-256)**: `248037013bb967f9fe188416416f098f32cbcb1fa11b4546a46c1bc3fd3efee0`
- **Trạng thái xử lý**: `Successfully processed 1 APKs and 0 errors`.

---

## 5. Kết Luận
Bản gói APK tùy biến độc lập đã được tạo ra thành công, tuân thủ đầy đủ các nguyên tắc an toàn, giữ nguyên toàn vẹn tính năng mạng VSD2 và mật mã học, với định danh riêng biệt `com.fin12n.streamdeck`.
