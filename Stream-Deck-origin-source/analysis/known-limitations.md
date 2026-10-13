# Báo Cáo Giới Hạn Kỹ Thuật Đã Biết (Known Technical Limitations)
# Elgato Stream Deck Pro — Bản Phát Triển com.fin12n.streamdeck

> **Mục tiêu tài liệu**: Tài liệu hóa các ranh giới kỹ thuật, phụ thuộc bên thứ ba, hạn chế phần cứng và những điểm cần lưu ý khi vận hành bản build tùy biến `com.fin12n.streamdeck`.
> **Vị trí tài liệu**: `Stream-Deck-origin-source/analysis/known-limitations.md`

---

## 1. Giới Hạn Mã Nguồn Dịch Ngược (Decompiled Source Limitations)

| Hạng mục | Thực trạng kỹ thuật | Tác động & Giải pháp |
| :--- | :--- | :--- |
| **Obfuscation bởi R8 Compiler** | Mã nguồn dịch ngược bởi JADX chứa nhiều lớp bị đổi tên thành các ký tự ngắn (`a`, `b`, `c`), có xung đột tên chữ hoa/thường trên hệ thống tệp case-insensitive. | Không thể chạy trực tiếp lệnh `gradle assembleDebug` từ mã Java đã dịch ngược. Phải sử dụng phương pháp **Smali Disassembly / Apktool Reassembly** hoặc tái lập Clean-Room. |
| **Synthetic Coroutines & Lambdas** | Trình biên dịch Kotlin sinh ra hàng ngàn lớp ẩn danh (`ContinuationImpl`, `FunctionAdapter`) mà decompiler không thể phục hồi 100% cú pháp nguồn gốc. | Các thành phần nghiệp vụ cần được tham khảo từ Protobuf contracts (`Messages.java`) và cấu trúc DI thay vì biên dịch trực tiếp mã synthetic. |
| **Thiếu Thư viện Mã Nguồn Đóng** | Một số thư viện liên kết động nội bộ của Corsair không có mã nguồn mở kèm theo. | Được giải quyết trọn vẹn bằng cách giữ nguyên mã máy bytecode và thư viện native nhị phân đã biên dịch sẵn. |

---

## 2. Giới Hạn Tích Hợp Dịch Vụ Bên Thứ Ba Khi Đổi Application ID

Khi thay đổi định danh ứng dụng từ `com.corsair.android.streamdeck` sang `com.fin12n.streamdeck`:

### A. Google Play Billing & RevenueCat
- **Khóa API**: Khóa RevenueCat `"goog_OKgVgwbVmfbYpuOGByEveqSIaXC"` và các SKU gói đăng ký được Corsair đăng ký riêng cho package `com.corsair.android.streamdeck` trên Google Play Console.
- **Hệ quả**: Khi ứng dụng `com.fin12n.streamdeck` gửi yêu cầu tra cứu sản phẩm tới Google Play Billing, Google Play Store sẽ trả về thông báo lỗi *"Item not found / Package not registered"*.
- **Cách xử lý trong môi trường dev**: 
  - Ứng dụng tự động kích hoạt cơ chế chịu lỗi ngoại tuyến (Offline Tolerance), sử dụng bộ đệm cờ `isProUser` trong DataStore (`AppSettings.proto`).
  - Trong quá trình phát triển UI, sử dụng `MockLicenseManager` hoặc cờ `isForcedProUser` (Field #6 trong `AppSettings.proto`) để kiểm thử tính năng Pro mà không cần gọi API mua hàng thực tế.

### B. Deep Links & App Links (`streamdeck.elgato.com/connect`)
- **Cơ chế xác thực**: Trong `AndroidManifest.xml`, intent filter deep link sử dụng `android:autoVerify="true"`.
- **Hệ quả**: Từ Android 12 trở lên, hệ điều hành sẽ tải tệp `https://streamdeck.elgato.com/.well-known/assetlinks.json` để đối chiếu vân tay chứng chỉ ký số và package name. Do máy chủ Elgato chỉ khai báo package `com.corsair.android.streamdeck` cùng khóa ký gốc của Corsair, tính năng tự động mở liên kết trực tiếp (Auto-verification) sẽ không kích hoạt cho `com.fin12n.streamdeck`.
- **Cách xử lý**: Người dùng vẫn có thể kết nối bình thường thông qua quét mã QR trên màn hình hoặc nhập địa chỉ IP thủ công trong mạng LAN.

### C. Giám Sát Lỗi Từ Xa (Sentry Telemetry)
- Ứng dụng tích hợp DSN Sentry của Elgato trong manifest. Khi gửi báo cáo lỗi hoặc crash, máy chủ Sentry của bên thứ ba có thể gắn nhãn đây là bản build không chính thức hoặc từ chối sự kiện do khác biệt package name.

---

## 3. Giới Hạn Kiến Trúc Vi Xử Lý & Phần Cứng (Hardware Architecture)

1. **Kiến Trúc Đơn Lẻ ARM64-v8a**:
   - Toàn bộ 9 thư viện `.so` (`libvsd2-android.so`, `libsodium.so`, `libbarhopper_v3.so`, v.v.) được trích xuất từ phân đoạn `config.arm64_v8a.apk`.
   - **Hệ quả**: Tệp APK chỉ có thể cài đặt và thực thi trên các thiết bị chạy chip xử lý **64-bit ARM (`arm64-v8a`)** — đây là kiến trúc của 99% điện thoại Android hiện nay.
   - **Lưu ý giả lập**: APK **sẽ không chạy được** trên các trình giả lập Android x86/x86_64 thuần túy (ví dụ: AVD x86_64 tiêu chuẩn trên máy tính) nếu giả lập không được kích hoạt lớp dịch mã nhị phân ARM (như ARM Translation Engine / libndk_translation).

2. **Yêu Cầu Mạng Cục Bộ (Local Network Requirement)**:
   - Giao thức VSD2 hoạt động dựa trên kết nối trực tiếp TCP/WebSockets trong mạng nội bộ. Thiết bị di động và máy tính Stream Deck Desktop bắt buộc phải cùng nằm trong một subnet Wi-Fi/LAN (hoặc qua VPN nội bộ) và không bị tường lửa chặn các cổng WebSockets ngẫu nhiên.

---

## 4. Tóm Tắt Khuyến Nghị Vận Hành

- Đối với mục đích nghiên cứu, tối ưu hóa giao thức VSD2 và kiểm thử tích hợp: Bản build APK `com.fin12n.streamdeck-v2.1.2-dev.apk` đáp ứng 100% tính năng kết nối bàn phím ảo, mã hóa Curve25519, giải nén ảnh LZ4 và điều khiển máy tính.
- Để triển khai sản xuất đại trà: Khuyến nghị phát triển theo lộ trình **Clean-Room Implementation** (đã vạch ra trong `build/reconstruction-notes.md`), sử dụng trực tiếp hợp đồng Protobuf `Messages.java` và thư viện Ktor để xây dựng một ứng dụng mã nguồn mở hoàn toàn mới.
