# Cẩm Nang Chẩn Đoán & Khắc Phục Lỗi Bản Quyền (License Debugging & Diagnostic Guide)
# Elgato Stream Deck Mobile 2.1.2

Tài liệu này cung cấp các kịch bản kiểm tra, phân tích nguyên nhân gốc rễ (Root Cause Analysis) của các lỗi xác thực bản quyền hợp lệ và hướng dẫn thử nghiệm an toàn cho môi trường phát triển (Developer Testing).

---

## 1. Chẩn Đoán Các Lỗi Xác Thực Thường Gặp (Diagnosing Legitimate Failures)

### Kịch bản 1: Người dùng đã mua gói nhưng ứng dụng vẫn báo chưa có Pro (Entitlement Mismatch)
- **Bằng chứng trong mã nguồn**:
  [`A3/r.java:755`](file:///data/Codebase/Stream%20Deck%20Pro/Stream-Deck-origin-source/recovered/java/A3/r.java):
  ```java
  EntitlementInfo entitlementInfo = customerInfo.getEntitlements().getActive().get("Full Access");
  ```
- **Nguyên nhân gốc rễ**: 
  Phương thức `l(CustomerInfo)` tìm kiếm chính xác key `"Full Access"` (phân biệt hoa thường). Nếu bảng cấu hình trên RevenueCat Dashboard đặt tên Entitlement là `"Pro"`, `"pro"`, `"premium"`, `"StreamDeckPro"`, hoặc `"full_access"`, hàm `get()` sẽ trả về `null` dẫn đến việc ứng dụng hủy kích hoạt Pro.
- **Cách kiểm tra & khắc phục**:
  1. Đăng nhập vào RevenueCat Dashboard -> Project: Stream Deck Mobile -> **Entitlements**.
  2. Xác nhận Identifier phải là chính xác chuỗi: **`Full Access`**.
  3. Đảm bảo tất cả các Product IDs từ Google Play Console và Amazon Developer Console đều được đính kèm (attached) vào Entitlement `"Full Access"` này.

---

### Kịch bản 2: Màn hình Paywall hiển thị trống hoặc không tải được gói mua (Missing Offerings)
- **Bằng chứng trong mã nguồn**:
  [`A3/r.java:518-525`](file:///data/Codebase/Stream%20Deck%20Pro/Stream-Deck-origin-source/recovered/java/A3/r.java):
  ```java
  Offering offering = offerings.get("default");
  Offering offering2 = offerings.get("streamdeckv2");
  ```
- **Nguyên nhân gốc rễ**: 
  Ứng dụng yêu cầu bắt buộc hai định danh Offering: `"default"` và `"streamdeckv2"`. Nếu trên RevenueCat Dashboard thiếu một trong hai hoặc cấu hình sai tên, danh sách gói nạp `listN` / `listN2` sẽ rỗng.
- **Cách kiểm tra & khắc phục**:
  1. Kiểm tra mục **Offerings** trên RevenueCat Dashboard.
  2. Đảm bảo tồn tại đồng thời 2 Offerings với ID:
     - `default` (chứa các gói subscription cơ bản)
     - `streamdeckv2` (chứa các gói bản quyền thế hệ mới)

---

### Kịch bản 3: Xung đột bộ nhớ đệm khi đổi tài khoản Google Play (Stale Cache)
- **Bằng chứng trong mã nguồn**:
  [`A3/r.java:682`](file:///data/Codebase/Stream%20Deck%20Pro/Stream-Deck-origin-source/recovered/java/A3/r.java):
  ```java
  CacheFetchPolicy cacheFetchPolicy = CacheFetchPolicy.NOT_STALE_CACHED_OR_CURRENT;
  objAwaitCustomerInfo = CoroutinesExtensionsKt.awaitCustomerInfo(purchases, cacheFetchPolicy, dVar2);
  ```
- **Nguyên nhân gốc rễ**: 
  Chính sách cache `NOT_STALE_CACHED_OR_CURRENT` ưu tiên đọc dữ liệu cache cục bộ của RevenueCat (hợp lệ trong vòng 5 phút). Khi người dùng đổi sang tài khoản Google Play khác trên thiết bị, ứng dụng có thể vẫn giữ trạng thái cũ cho đến khi hết hạn cache hoặc người dùng chủ động bấm "Restore Purchases".
- **Cách khắc phục cho người dùng**:
  1. Hướng dẫn người dùng vào màn hình cài đặt và bấm **"Restore Purchases"**.
  2. Thao tác này kích hoạt `CoroutinesExtensionsCommonKt.awaitRestore()`, buộc RevenueCat đồng bộ hóa tươi (fresh sync) từ máy chủ Google Play.

---

### Kịch bản 4: Cài đặt tệp APK Google Play trên máy tính bảng Amazon Fire (Flavor Incompatibility)
- **Bằng chứng trong mã nguồn**:
  [`G3/h.java:8-10`](file:///data/Codebase/Stream%20Deck%20Pro/Stream-Deck-origin-source/recovered/java/G3/h.java):
  ```java
  public static final boolean a() {
      return v.v("google", "amazon", true); // Luôn trả về false trong bản APK này!
  }
  ```
- **Nguyên nhân gốc rễ**: 
  Tệp APK được trích xuất là bản build dành riêng cho kênh phân phối Google Play. Nếu cài đặt (sideload) lên thiết bị Amazon Fire không có dịch vụ Google Play, RevenueCat sẽ cố gắng kết nối tới `Google Play In-App Billing Service` thay vì `Amazon Appstore SDK`, dẫn đến mã lỗi `BILLING_UNAVAILABLE`.
- **Cách khắc phục**:
  Cần sử dụng đúng gói cài đặt biên dịch từ flavor `amazon` cho thiết bị Amazon Fire.

---

## 2. Quy Trình Giám Sát Log & Bắt Lỗi Thực Nghiệm (Live Diagnostic Commands)

Nhà phát triển và kỹ sư kiểm thử có thể theo dõi trực tiếp luồng xử lý bản quyền qua Android Debug Bridge (ADB):

### Lọc Log Xác Thực Bản Quyền & RevenueCat:
```bash
adb logcat -v time | grep -E "(purchases|RevenueCat)"
```

### Các dấu hiệu Log quan trọng:
1. **Khi bản quyền kích hoạt thành công**:
   ```
   D/purchases: Set isProUser to true
   ```
2. **Khi bản quyền hết hạn hoặc không có Pro**:
   ```
   D/purchases: Set isProUser to false
   ```
3. **Khi mất kết nối mạng (Hệ thống tự động kích hoạt Offline Tolerance)**:
   ```
   E/purchases: Error fetching entitlement
   # Lưu ý: Không xuất hiện log "Set isProUser to false", trạng thái Pro cũ được bảo toàn!
   ```

---

## 3. Thử Nghiệm An Toàn Trong Môi Trường Phát Triển (Safe Developer Testing)

> ⚠️ **Quy tắc an toàn**: Không can thiệp, bypass hoặc gỡ bỏ cơ chế xác thực bản quyền của ứng dụng thương mại. Dưới đây là các phương pháp thử nghiệm chính thống được nhà sản xuất Elgato thiết kế sẵn:

### Phương Pháp 1: Thử nghiệm Sandbox qua Google Play Console & RevenueCat (Khuyến nghị)
1. Thêm địa chỉ email kiểm thử vào danh sách **License Testing** trong Google Play Console.
2. Thêm người dùng thử nghiệm vào mục **Sandbox Users** của RevenueCat.
3. Khi thực hiện mua gói trên thiết bị test, Google Play sẽ mô phỏng giao dịch thành công mà không phát sinh cước phí thực tế.
4. Kiểm tra xem Entitlement `"Full Access"` có được cấp và tự động kích hoạt `isProUser = true` hay không.

### Phương Pháp 2: Tận dụng cơ chế `isForcedProUser` được thiết kế sẵn bởi Elgato
Trong schema Protocol Buffers gốc [`AppSettings.proto:98`](file:///data/Codebase/Stream%20Deck%20Pro/Stream-Deck-origin-source/recovered/assets/AppSettings.proto), các kỹ sư Elgato đã dự trù sẵn trường ghi đè nội bộ cho bản build phát triển:
```protobuf
message AppSettings {
  ...
  bool isProUser = 5;
  optional bool isForcedProUser = 6; // debug build override
  ...
}
```
Và trong [`AppSettingsStore.java:246-289`](file:///data/Codebase/Stream%20Deck%20Pro/Stream-Deck-origin-source/recovered/java/com/elgato/streamdeck/vsd2/AppSettingsStore.java), phương thức `updateIsForcedProUser(Boolean)` đã được triển khai đầy đủ. Trong mã nguồn kiểm thử nội bộ (Internal Test Suite), nhà phát triển chỉ cần gọi:
```kotlin
// Dành cho bản build test nội bộ
appSettingsStore.updateIsForcedProUser(true)
```
Cơ chế này cho phép đội ngũ QA kiểm thử toàn diện giao diện Pro mà không cần giả lập thanh toán bên thứ ba.

### Phương Pháp 3: Sử Dụng Mock License Manager Trong Unit Test
Trong tầng kiểm thử tự động (Unit Test / Instrumented Test), thay thế `A3.r` trong đồ thị Winter DI bằng mock implementation của interface `S3.a`:
```kotlin
class MockLicenseManager(
    private val isProState: MutableStateFlow<Boolean> = MutableStateFlow(true)
) : S3.a {
    override fun c(): Boolean = isProState.value
    override fun d(): StateFlow<Boolean> = isProState.asStateFlow()
}
```
Cách tiếp cận này tuân thủ hoàn toàn nguyên lý Dependency Injection, không làm thay đổi mã nguồn sản phẩm và đảm bảo độ bao phủ kiểm thử cao nhất.
