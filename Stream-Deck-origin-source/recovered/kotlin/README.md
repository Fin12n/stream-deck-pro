# Tài Liệu Khôi Phục Thành Phần Kotlin (Kotlin Source Recovery)

Ứng dụng Stream Deck Mobile được phát triển hoàn toàn bằng **ngôn ngữ Kotlin** hiện đại (Kotlin 1.9.23, Jetpack Compose 1.6.8, Kotlin Coroutines 1.8.0).

---

## 1. Cơ chế Biên dịch & Trích xuất của Kotlin

Khi mã nguồn Kotlin được biên dịch sang bytecode Android DEX qua R8, các đặc trưng ngôn ngữ Kotlin được chuyển đổi như sau:

| Tính năng gốc Kotlin | Hình thái trong mã đã khôi phục (`recovered/java/`) | Ví dụ cụ thể |
| :--- | :--- | :--- |
| **Top-level functions & File Facades** | Các lớp trừu tượng hoặc tiện ích có hậu tố `Kt.java` | `DiKt.java`, `AppSettingsStoreKt.java`, `IconDecompressorAndroidKt.java` |
| **Property Delegates (`by lazy`, `by injector`)** | Trường `$delegate` kết hợp hàm nạp qua `K.f(...)` | `injector$delegate`, `graph$delegate`, `mainViewModel$delegate` trong `MainActivity.java` |
| **Kotlin Lambdas & Higher-Order Functions** | Lớp nội bộ mở rộng `kotlin.jvm.internal.Lambda` (`u`) | `public static final class a extends u implements Function0` trong `DiKt.java` |
| **Suspend Functions & Coroutines** | Lớp trạng thái State Machine mở rộng `kotlin.coroutines.jvm.internal.SuspendLambda` | Quản lý luồng WebSocket và Dispatcher IO |
| **Companion Objects** | Lớp tĩnh lồng nhau `public static final class Companion` | `CryptoBoxAndroid.Companion` (quản lý hàm nạp `System.loadLibrary("vsd2-android")`) |
| **Data Classes** | Các lớp với hàm `copy()`, `equals()`, `hashCode()`, `toString()` | `CryptoBox.KeyPair` |

---

## 2. Danh Mục Các Thành Phần Kotlin Cốt Lõi

### A. Tầng Khởi tạo & Tiêm phụ thuộc (Dependency Injection)
- **`com.elgato.streamdeck.DiKt`**:
  - Khởi tạo đồ thị phụ thuộc ứng dụng (`applicationComponent`) bằng thư viện Winter (`io.jentz.winter`).
  - Đăng ký vòng đời `ProcessLifecycleOwner` và quản lý Coroutine Scope toàn cục.

### B. Tầng Trình diễn (UI & Presentation - Jetpack Compose)
- **`com.elgato.streamdeck.MainActivity`**:
  - Entry point kế thừa `ComponentActivity` của AndroidX.
  - Sử dụng Composable Trees render lưới nút bấm Stream Deck.
  - Tích hợp Voyager Navigator (`cafe.adriel.voyager`) quản lý màn hình kết nối, cài đặt và bàn phím ảo.

### C. Tầng Lưu trữ & Cấu hình (Data Persistence)
- **`com.elgato.streamdeck.vsd2.AppSettingsStoreKt`**:
  - Cung cấp các hàm mở rộng bất đồng bộ đọc/ghi DataStore cho cấu hình máy chủ kết nối và ID thiết bị vừa mở.

### D. Tầng Xử lý Đồ họa & Giải nén (Graphics Decompression)
- **`com.elgato.streamdeck.vsd2.IconDecompressorAndroidKt`**:
  - Các hàm tiện ích hỗ trợ chuyển đổi dữ liệu mảng byte giải nén sang `Bitmap` tương thích Compose.
