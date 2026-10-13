# Giới Hạn Của Quá Trình Khôi Phục Mã Nguồn (Recovery Limitations)

Tài liệu này ghi nhận một cách minh bạch các giới hạn kỹ thuật và sự khác biệt giữa mã nguồn khôi phục (recovered/decompiled source) và mã nguồn dự án gốc của nhà sản xuất (original source code).

---

## 1. Giới hạn Bản chất giữa Mã Khôi Phục và Mã Gốc
- **Mã nguồn đã dịch ngược (Decompiled Code)**: Toàn bộ 8,857 tệp Java trong thư mục `recovered/java` được dịch ngược từ mã nhị phân Dalvik Executable (DEX) bằng JADX v1.5.6.
- **Không khẳng định là mã nguồn gốc 100%**:
  - Tên các biến cục bộ (local variables) bên trong thân hàm không có trong bảng biểu tượng gỡ lỗi DEX đã được đặt tên tự động bởi decompiler (ví dụ: `aVar`, `bVar`, `strC`).
  - Toàn bộ ghi chú (developer comments) và tài liệu Javadoc ban đầu của lập trình viên đã bị trình biên dịch loại bỏ trong tệp APK xuất bản thương mại.

---

## 2. Ảnh hưởng của R8 / ProGuard Obfuscation
Ứng dụng được tối ưu hóa và làm rối bằng **Android R8** (với bản đồ ánh xạ `r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce`).

### Những phần giữ lại tên gốc đầy đủ (Preserved Identifiers):
1. **Các thành phần Android trong Manifest**: `com.elgato.streamdeck.MainActivity`, `com.elgato.streamdeck.StreamDeckApplication`.
2. **Các lớp cầu nối JNI Native**: `com.elgato.streamdeck.vsd2.CryptoBoxAndroid`, `com.elgato.streamdeck.vsd2.ImageDecompressor` (bắt buộc giữ nguyên tên để thư viện C++ `libvsd2-android.so` có thể liên kết động).
3. **Các lớp Protobuf Lite**: `com.elgato.vsd2.Messages`, `com.elgato.streamdeck.vsd2.AppSettings` (giữ nguyên để serialization/deserialization nhị phân hoạt động đúng).
4. **Các SDK công khai của bên thứ ba**: `com.revenuecat.purchases.*`, `com.amazon.*`, `io.sentry.*`.

### Những phần bị làm rối (Obfuscated Identifiers):
- Hàng nghìn lớp nội bộ được đổi tên thành các định danh ngắn một ký tự (`A0`, `B1`, `C5`, `defpackage.*`).
- Các hàm nội bộ của Jetpack Compose và Ktor WebSockets engine bị rút gọn mã định danh.

---

## 3. Khôi phục Cấu trúc Ngôn ngữ Kotlin
- Ứng dụng gốc được viết bằng **100% Kotlin** với Kotlin Coroutines, Jetpack Compose và Flow.
- Khi biên dịch sang bytecode Java, trình biên dịch Kotlin tạo ra các cấu trúc nhân tạo (synthetic classes, suspend state machines, property delegates `$delegate`).
- JADX tái hiện lại logic dưới dạng mã nguồn Java tương đương. Mặc dù cấu trúc thuật toán và lời gọi hàm được giữ nguyên vẹn, nhưng cú pháp ngôn ngữ hiển thị là Java chứ không phải mã Kotlin nguyên bản.

---

## 4. Ranh giới Thư viện Nhị phân Native (`.so`)
- Các thư viện C/C++ biên dịch (`libvsd2-android.so`, `libsodium.so`, `libsentry.so`, `libbarhopper_v3.so`) nằm ở dạng mã máy ARM64 (ELF binary).
- Công cụ JADX và Apktool chỉ khôi phục được **giao diện cầu nối JNI (Java Native Interface)** và danh mục các biểu tượng xuất xưởng (`symbols`), không thể tự động khôi phục ngược lại mã nguồn C/C++ nếu không sử dụng các công cụ phân tích nhị phân chuyên sâu (Ghidra / IDA Pro).

---

## 5. Lớp Bảo Vệ Runtime Google Play Protect / PairIP
- Bản cài đặt chứa lớp bọc bảo vệ chữ ký **PairIP** (`com.pairip.application.Application` và `libpairipcore.so`).
- Nếu cố gắng biên dịch lại và chạy ứng dụng mà không có chữ ký hợp lệ từ Google Play hoặc không gỡ bỏ lớp kiểm tra `PairIP`, ứng dụng sẽ tự động đóng ngay khi khởi động.
