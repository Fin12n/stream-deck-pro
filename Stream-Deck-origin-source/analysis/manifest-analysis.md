# Phân Tích AndroidManifest.xml (Manifest Analysis)

## 1. Định danh và Môi trường thực thi
- **Package Name**: `com.corsair.android.streamdeck`
- **Compile SDK**: `35` (Android 15)
- **Target SDK**: `35` (Android 15)
- **Min SDK**: `28` (Android 9.0 Pie)
- **Split Types**: `base__abi,base__density`

---

## 2. Mô hình Ứng dụng & Lớp Bảo vệ (Application Architecture)
```xml
<application 
    android:name="com.pairip.application.Application"
    android:theme="@style/Theme.ElgatoMaterial3.Splash"
    android:allowBackup="false"
    android:extractNativeLibs="false"
    android:supportsRtl="true">
```
- **Lớp bảo vệ PairIP**: Ứng dụng khai báo Application gốc là `com.pairip.application.Application`. Đây là cơ chế bảo vệ Play Integrity / PairIP do Google Play thêm vào trong quá trình đóng gói ký số. Khi ứng dụng khởi chạy, PairIP kiểm tra tính toàn vẹn chữ ký và tải ứng dụng logic thực tế (`com.elgato.streamdeck.StreamDeckApplication`).
- **Sao lưu (Backup)**: `android:allowBackup="false"` được cấu hình để ngăn chặn việc trích xuất dữ liệu nhạy cảm hoặc token cấu hình máy chủ thông qua `adb backup`.

---

## 3. Quyền hạn Hệ thống (Permissions Analysis)

| Tên Quyền (Permission) | Mức độ | Mục đích sử dụng trong Stream Deck |
| :--- | :---: | :--- |
| `android.permission.INTERNET` | Bình thường | Kết nối mạng LAN/WiFi tới máy tính Stream Deck Desktop, truyền phát hình ảnh nút bấm và sự kiện phím qua WebSockets/TCP. |
| `android.permission.CAMERA` | Nguy hiểm | Quét mã QR trên màn hình ứng dụng Stream Deck Desktop (PC/Mac) để tự động nhận dạng IP, Port và Secret Key mã hóa. |
| `android.permission.ACCESS_NETWORK_STATE` | Bình thường | Giám sát trạng thái kết nối Wi-Fi, kiểm tra thiết bị có đang cùng mạng cục bộ với máy tính hay không. |
| `com.android.vending.BILLING` | Chữ ký | Quản lý gói đăng ký dịch vụ (Subscription) bản quyền Stream Deck Mobile qua Google Play. |
| `com.android.vending.CHECK_LICENSE` | Chữ ký | Kiểm tra giấy phép bản quyền ứng dụng. |
| `com.corsair.android.streamdeck.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` | Chữ ký | Quyền tùy biến (Signature level) nhằm cô lập các Broadcast Receiver động nội bộ, chống tấn công từ ứng dụng khác trên thiết bị. |

---

## 4. Các Thành phần Hệ thống (Application Components)

### A. Activity chính (Main Launcher & Deep Link)
- **Lớp thực thi**: `com.elgato.streamdeck.MainActivity`
- **Chế độ khởi chạy**: `android:launchMode="singleInstancePerTask"` (Đảm bảo chỉ có một instance hoạt động duy nhất cho giao diện bàn phím điều khiển)
- **Intent Filters**:
  1. **Launcher**: 
     - Action: `android.intent.action.MAIN`
     - Category: `android.intent.category.LAUNCHER`
  2. **App Links (Deep Link kết nối nhanh)**:
     - Scheme: `http` / `https`
     - Host: `streamdeck.elgato.com`
     - Path Prefix: `/c` và `/connect`
     - Tự động xác thực: `android:autoVerify="true"`
     - Chức năng: Cho phép quét liên kết URL hoặc mã QR mở trực tiếp ứng dụng và tự động cấu hình Endpoint kết nối tới PC.

### B. Thành phần Thanh toán & Bản quyền
- `com.amazon.device.iap.ResponseReceiver`: Receiver nhận thông báo mua hàng trên kho ứng dụng Amazon Appstore.
- `com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity`: Activity proxy trung gian xử lý hóa đơn Amazon.
- `com.android.billingclient.api.ProxyBillingActivity` & `ProxyBillingActivityV2`: Activity proxy của Google Play Billing v7.0.0.
- `com.pairip.licensecheck.LicenseActivity`: Activity kiểm tra giấy phép bản quyền của PairIP.

### C. Services & Xử lý nền
- `androidx.camera.core.impl.MetadataHolderService`: Cấu hình provider cho CameraX Camera2.
- `com.google.mlkit.common.internal.MlKitComponentDiscoveryService`: Tự động nạp BarcodeRegistrar cho ML Kit Vision.
- `com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService`: JobScheduler lập lịch gửi telemetry sự kiện.
- `androidx.room.MultiInstanceInvalidationService`: Đồng bộ dữ liệu đa tiến trình cho Room Database (`TelemetryDatabase`).

### D. Content Providers (Khởi tạo tự động)
- `com.google.mlkit.common.internal.MlKitInitProvider`: Khởi tạo engine ML Kit Barcode.
- `androidx.startup.InitializationProvider`: Khởi tạo Emoji2, ProcessLifecycle và ProfileInstaller.
- `io.sentry.android.core.SentryInitProvider`: Khởi tạo Sentry crash tracking.
- `io.sentry.android.core.SentryPerformanceProvider`: Giám sát hiệu năng render và khung hình.

---

## 5. Cấu hình Giám sát & Telemetry (Sentry & Logging)
Ứng dụng tích hợp sẵn cấu hình Sentry qua `meta-data`:
- **DSN**: `https://050c027ff4284c8a80d6862c00c33991@o324181.ingest.us.sentry.io/4503981576290304`
- **Traces Sample Rate**: `0.05` (5%)
- **Profiling Sample Rate**: `0.05` (5%)
- **Attach View Hierarchy**: `true` (Tự động đính kèm cây giao diện phân cấp khi có crash)
- **User Interaction Tracking**: `true` (Ghi lại hành động bấm nút của người dùng)
