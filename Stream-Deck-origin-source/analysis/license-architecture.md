# Kiến Trúc Quản Lý Bản Quyền & Gói Đăng Ký (License & Subscription Architecture)
# Elgato Stream Deck Mobile 2.1.2

> **Tài liệu kiểm toán kỹ thuật (Audit Document)**: Phân tích cấu trúc xác thực bản quyền, tích hợp RevenueCat, kiểm tra Entitlement và cơ chế lan truyền trạng thái trong mã nguồn đã khôi phục của Elgato Stream Deck Mobile 2.1.2.

---

## 1. Tổng Quan Kiến Trúc (Architecture Overview)

Hệ thống quản lý bản quyền của Stream Deck Mobile áp dụng mô hình phân tách tầng nghiêm ngặt (Clean Architecture) kết hợp giữa:
1. **Third-Party Billing & Subscription Platform**: RevenueCat Android SDK v8.1.0 (trung gian hóa giữa Google Play Billing v7.0.0 và Amazon Appstore IAP v3.0.5).
2. **Application-Owned Domain Layer**: Lớp dịch vụ quản lý bản quyền `A3.r` triển khai interface `A3.n` và `S3.a`.
3. **Persistent Local Cache**: Jetpack DataStore lưu trữ Protocol Buffers (`AppSettings.proto`), giữ cờ `isProUser` để hỗ trợ hoạt động ngoại tuyến (Offline Tolerance).
4. **Reactive State Propagation**: Kotlin Coroutines `StateFlow<Boolean>` lan truyền trạng thái tức thì đến các thành phần UI Jetpack Compose và bộ điều phối thiết bị ảo (`T3.a`).

```
┌────────────────────────────────────────────────────────────────────────┐
│                   EXTERNAL BILLING PLATFORM (REVENUECAT)               │
│   • Google Play Billing v7.0.0 / Amazon IAP                            │
│   • API Key: "goog_OKgVgwbVmfbYpuOGByEveqSIaXC"                        │
│   • Entitlement định danh: "Full Access"                               │
└───────────────────────────────────┬────────────────────────────────────┘
                                    │ (CustomerInfo)
┌───────────────────────────────────▼────────────────────────────────────┐
│                  APPLICATION DOMAIN LAYER (A3.r / S3.a)                │
│   • Quản lý: A3.r (implement A3.n, S3.a)                               │
│   • Phân tích: A3.r.l(CustomerInfo) ──> A3.e (Product / Promotional)   │
│   • Đồng bộ: A3.r.q(A3.e) ──> Ghi cờ isProUser vào DataStore           │
└───────────────────┬────────────────────────────────┬───────────────────┘
                    │                                │
┌───────────────────▼─────────────┐    ┌─────────────▼───────────────────┐
│     BỘ NHỚ CỤC BỘ BỀN VỮNG      │    │     LAN TRUYỀN PHẢN ỨNG (UI)    │
│   • AppSettingsStore (DataStore)│    │   • StateFlow<Boolean> (S3.a.d) │
│   • AppSettings.isProUser       │    │   • T3.a (Workstation / Device) │
│   • Hỗ trợ Offline Tolerance    │    │   • B3.k, C3.e (Khóa tính năng) │
└─────────────────────────────────┘    └─────────────────────────────────┘
```

---

## 2. Danh Mục Các Thành Phần Bản Quyền Cốt Lõi (Core Components)

### A. Third-Party SDK vs Mã Nguồn Ứng Dụng (Application-Owned)

| Thành phần | Đường dẫn tệp / Package | Thuộc tính | Vai trò kiến trúc |
| :--- | :--- | :---: | :--- |
| `Purchases` | `com.revenuecat.purchases.Purchases` | Third-Party | SDK lõi của RevenueCat: xử lý thanh toán, cache và đồng bộ hóa receipt lên đám mây. |
| `PurchasesConfiguration` | `com.revenuecat.purchases.PurchasesConfiguration` | Third-Party | Cấu hình khởi tạo SDK (Context, API Key, Store). |
| `CustomerInfo` | `com.revenuecat.purchases.CustomerInfo` | Third-Party | Đối tượng phản hồi chứa danh sách Entitlement, active subscriptions, và expiration date. |
| `A3.r` | [`recovered/java/A3/r.java`](file:///data/Codebase/Stream%20Deck%20Pro/Stream-Deck-origin-source/recovered/java/A3/r.java) | **App-Owned** | **Bộ quản lý bản quyền chính (License Manager)**: Triển khai toàn bộ quy trình fetch, purchase, restore, và đồng bộ DataStore. |
| `A3.n` | [`recovered/java/A3/n.java`](file:///data/Codebase/Stream%20Deck%20Pro/Stream-Deck-origin-source/recovered/java/A3/n.java) | **App-Owned** | Interface định nghĩa các phương thức: `a()` (offerings), `b()` (purchase), `e()` (restore), `f()` (refresh), `g()` (appUserID), `h()` (entitlements). |
| `S3.a` | [`recovered/java/S3/a.java`](file:///data/Codebase/Stream%20Deck%20Pro/Stream-Deck-origin-source/recovered/java/S3/a.java) | **App-Owned** | Interface phân giải quyền cơ sở: `boolean c()` (kiểm tra tức thì) và `M d()` (trả về `StateFlow<Boolean>`). |
| `A3.e` | [`recovered/java/A3/e.java`](file:///data/Codebase/Stream%20Deck%20Pro/Stream-Deck-origin-source/recovered/java/A3/e.java) | **App-Owned** | Sealed class mô hình hóa trạng thái gói: `A3.e.a` (Product thương mại) và `A3.e.b` (Promotional tặng kèm). |
| `A3.p` | [`recovered/java/A3/p.java`](file:///data/Codebase/Stream%20Deck%20Pro/Stream-Deck-origin-source/recovered/java/A3/p.java) | **App-Owned** | ViewModel của màn hình Paywall / Nâng cấp Pro. |
| `AppSettingsStore` | [`recovered/java/com/elgato/streamdeck/vsd2/AppSettingsStore.java`](file:///data/Codebase/Stream%20Deck%20Pro/Stream-Deck-origin-source/recovered/java/com/elgato/streamdeck/vsd2/AppSettingsStore.java) | **App-Owned** | Quản lý lưu trữ DataStore Protobuf, lưu trường `isProUser` và `isForcedProUser`. |
| `T3.a` | [`recovered/java/T3/a.java`](file:///data/Codebase/Stream%20Deck%20Pro/Stream-Deck-origin-source/recovered/java/T3/a.java) | **App-Owned** | Quản lý trạng thái thiết bị ảo kết nối (`C0274a`), áp dụng cờ `isProUser`. |

---

## 3. Khởi Tạo SDK & Cấu Hình Khóa API (Initialization & Store Detection)

Trong đồ thị Dependency Injection (`DiKt$applicationComponent$1.java`):

```java
// File: com/elgato/streamdeck/DiKt$applicationComponent$1.java (Dòng 394 - 400)
public final Purchases invoke(h singleton) {
    kotlin.jvm.internal.t.g(singleton, "$this$singleton");
    Purchases.Companion companion = Purchases.Companion;
    companion.setLogLevel(LogLevel.ERROR);
    return G3.h.a() 
        ? companion.configure(new AmazonConfiguration.Builder(
              (Context) singleton.h(new A5.a(Context.class, false, null, null), null), 
              mHPawN.MnGviGod).build()) 
        : companion.configure(new PurchasesConfiguration.Builder(
              (Context) singleton.h(new A5.a(Context.class, false, null, null), null), 
              "goog_OKgVgwbVmfbYpuOGByEveqSIaXC").build());
}
```

### Chi tiết cấu hình:
1. **Google Play API Key**: `"goog_OKgVgwbVmfbYpuOGByEveqSIaXC"`
2. **Mức ghi log**: `LogLevel.ERROR` (ẩn các log info/debug của RevenueCat trong bản phát hành)
3. **Phát hiện Store (`G3.h.a()`)**:
   - Hàm `G3.h.a()` trong tệp `G3/h.java` trả về: `v.v("google", "amazon", true)` -> Luôn trả về `false` trong biến thể Google Play này do trình biên dịch R8 đã inline chuỗi build variant.
   - Nhánh `PurchasesConfiguration.Builder` (Google Play) được thực thi.

---

## 4. Cơ Chế Đánh Giá Quyền Hạn (Entitlement Evaluation Logic)

Logic kiểm tra bản quyền nằm tại phương thức `l(CustomerInfo)` trong `A3.r`:

```java
// File: A3/r.java (Dòng 754 - 772)
public final A3.e l(CustomerInfo customerInfo) {
    EntitlementInfo entitlementInfo = customerInfo.getEntitlements().getActive().get("Full Access");
    if (entitlementInfo == null) {
        return null;
    }
    if (c.f767a[entitlementInfo.getStore().ordinal()] == 1) { // Store.PROMOTIONAL
        return new A3.e.b(entitlementInfo.getExpirationDate(), p186v3.b.c(entitlementInfo.getStore()));
    }
    StringBuilder sb = new StringBuilder();
    sb.append(entitlementInfo.getProductIdentifier());
    String productPlanIdentifier = entitlementInfo.getProductPlanIdentifier();
    if (productPlanIdentifier != null) {
        sb.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        sb.append(productPlanIdentifier);
    }
    String string = sb.toString();
    t.f(string, "toString(...)");
    return new A3.e.a(
        string, 
        entitlementInfo.getExpirationDate(), 
        entitlementInfo.getOriginalPurchaseDate(), 
        entitlementInfo.getLatestPurchaseDate(), 
        entitlementInfo.getWillRenew(), 
        entitlementInfo.getBillingIssueDetectedAt(), 
        entitlementInfo.getUnsubscribeDetectedAt(), 
        entitlementInfo.getPeriodType() == PeriodType.TRIAL, 
        p186v3.b.c(entitlementInfo.getStore())
    );
}
```

### Các quy tắc xác thực:
1. **Khóa Entitlement bắt buộc**: Chuỗi chính xác `"Full Access"` (phân biệt hoa thường). Bất kỳ phản hồi nào thiếu key `"Full Access"` trong danh sách `getActive()` sẽ trả về `null`.
2. **Xác thực gói Promotional**: Nếu Store là `Store.PROMOTIONAL`, tạo thực thể `A3.e.b` chứa ngày hết hạn và nhãn cửa hàng.
3. **Xác thực gói Subscription/In-App thông thường**: Ghép `productIdentifier` và `productPlanIdentifier` (nếu có) thông qua ký tự phân cách của RevenueCat. Ghi nhận đầy đủ trạng thái `isTrial`, `willRenew`, `billingIssueDetectedAt`, và `unsubscribeDetectedAt`.

---

## 5. Đồng Bộ Hóa Trạng Thái & Cơ Chế Hoạt Động Ngoại Tuyến (Offline Tolerance)

Sau khi tính toán được thực thể `A3.e` (hoặc `null`), phương thức `q(A3.e, Continuation)` thực hiện đồng bộ:

```java
// File: A3/r.java (Dòng 1272 - 1302)
int i12 = eVar != null ? 1 : 0;
...
if (i8 != ((AppSettings) obj).getIsProUser()) {
    Z2.j jVar = f750k;
    String str = "Set isProUser to " + (i9 != 0);
    // Ghi log debug: Set isProUser to true/false
    AppSettingsStore appSettingsStore2 = rVar.f752b;
    boolean z8 = i9 != 0;
    appSettingsStore2.updateIsProUser(z8, lVar);
}
if (!t.c(eVar2, rVar.f757g)) {
    rVar.p(eVar2); // Gửi telemetry / metrics
}
rVar.f757g = eVar2; // Cập nhật cache bộ nhớ RAM
```

### Tính chịu lỗi mạng (Graceful Offline Handling):
1. **Khởi tạo trạng thái**: Trong constructor của `A3.r` (dòng 469), luồng `f758h` (`StateFlow<Boolean>`) được tạo bằng cách ánh xạ luồng dữ liệu từ `store.getData()` (Jetpack DataStore):
   ```java
   this.f758h = AbstractC2262h.T(new j(store.getData()), scope, H.f20929a.c(), Boolean.FALSE);
   ```
2. **Bắt ngoại lệ an toàn**: Trong coroutine kiểm tra định kỳ `h.invokeSuspend` (dòng 276-284):
   ```java
   } catch (Throwable th) {
       V3.f.b(new V3.g.c(th));
       jVar.b(pVar, strC, th, "Error fetching entitlement");
   }
   ```
   Khi thiết bị mất mạng, máy chủ RevenueCat timeout hoặc lỗi HTTP 5xx, hàm `f()` ném ngoại lệ. Khối `catch` ghi log lỗi và **dừng lại mà không gọi hàm `q()`**. Do đó, trường `isProUser` đã lưu trong `AppSettingsStore` **không bị ghi đè thành false**. Người dùng đã mua bản quyền vẫn tiếp tục dùng đầy đủ tính năng Pro bình thường khi không có kết nối Internet.

---

## 6. Các Tính Năng Bị Giới Hạn Bởi Bản Quyền (Entitlement Gating)

Khi `isProUser == false`, các thành phần sau của Stream Deck Mobile sẽ bị khóa hoặc giới hạn:

1. **Vỏ bọc phím ảo (Faceplates)**:
   - File [`C3/e.java:57-69`](file:///data/Codebase/Stream%20Deck%20Pro/Stream-Deck-origin-source/recovered/java/C3/e.java):
     ```java
     public static final String c(KnownHost.Device device, boolean z8) {
         if (!z8) {
             return d(new b.h()); // Bắt buộc dùng vỏ mặc định "Classic" (b.h)
         }
         ...
     }
     ```
   - Người dùng miễn phí bị từ chối mọi tùy chọn Faceplate tùy biến.
2. **Cài đặt thiết bị ảo (Virtual Device Settings Content)**:
   - File [`B3/k.java:121-127`](file:///data/Codebase/Stream%20Deck%20Pro/Stream-Deck-origin-source/recovered/java/B3/k.java) và [`p162s3/q.java:427`](file:///data/Codebase/Stream%20Deck%20Pro/Stream-Deck-origin-source/recovered/java/p162s3/q.java):
   - Tùy chọn giao diện cài đặt phím hiển thị nhãn nâng cấp Pro.
3. **Màn hình mua hàng (Paywall Promotion)**:
   - File [`A3/p.java`](file:///data/Codebase/Stream%20Deck%20Pro/Stream-Deck-origin-source/recovered/java/A3/p.java):
   - Màn hình Paywall liên tục tải các gói từ hai Offering: `"default"` và `"streamdeckv2"`.
