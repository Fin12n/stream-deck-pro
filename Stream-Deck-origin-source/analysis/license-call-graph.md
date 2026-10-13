# Đồ Thị Lời Gọi Xác Thực Bản Quyền (License Validation Call Graph)
# Elgato Stream Deck Mobile 2.1.2

Tài liệu này chi tiết hóa toàn bộ chuỗi lời gọi hàm (Call Flow / Call Graph) cho các kịch bản: Khởi động ứng dụng, Mua hàng mới, Khôi phục giao dịch và Xử lý sự cố mạng.

---

## 1. Chuỗi Khởi Động & Kiểm Tra Vòng Đời (Lifecycle & Startup Flow)

```
[Android System Lifecycle]
      │
      ▼
ProcessLifecycleOwner (ON_START / ON_RESUME)
      │
      ▼
com.elgato.streamdeck.DiKt$applicationComponent$1.z.b(androidProcessLifecycle, it)
[File: DiKt$applicationComponent$1.java : L2220-2224]
      │
      ▼
A3.r.m()
[File: A3/r.java : L774-776]
      │
      ▼ (Lauch Coroutine Scope)
A3.r$h.invokeSuspend()
[File: A3/r.java : L259-286]
      │
      ▼
A3.r.f(Continuation)
[File: A3/r.java : L661-708]
      │
      ▼
CoroutinesExtensionsKt.awaitCustomerInfo(
    purchases, 
    CacheFetchPolicy.NOT_STALE_CACHED_OR_CURRENT
)
      │
      ├───────────────────────────────┐
      │ (Thành công - Có mạng/Cache)  │ (Lỗi mạng / Timeout)
      ▼                               ▼
CustomerInfo                         Ngoại lệ (Throwable)
      │                               │
      ▼                               ▼
A3.r.l(CustomerInfo)                 Khối catch [A3/r.java : L276]
[File: A3/r.java : L754-772]          │
      │                               ▼
      ├─► getEntitlements()          Ghi log: "Error fetching entitlement"
      │   └─► getActive()             │
      │       └─► get("Full Access")  ▼
      │                               Dừng coroutine (KHÔNG gọi q())
      ▼                               │
A3.e (Product / Promotional / null)   ▼
      │                               AppSettingsStore GIỮ NGUYÊN cờ cũ!
      ▼
A3.r.q(A3.e, Continuation)
[File: A3/r.java : L1215-1303]
      │
      ├─► isPro = (eVar != null)
      │
      ├─► So sánh với AppSettingsStore.get().getIsProUser()
      │   │
      │   ├─► Nếu thay đổi:
      │   │   AppSettingsStore.updateIsProUser(isPro)
      │   │   [File: AppSettingsStore.java : L937]
      │   │   │
      │   │   └─► Ghi vào Proto DataStore (AppSettings.is_pro_user)
      │   │
      │   └─► Gửi telemetry: A3.r.p(A3.e)
      │
      └─► Cập nhật cache: this.f757g = A3.e
            │
            ▼
AppSettingsStore.getData() [Flow]
      │
      ▼
A3.r$j [Flow.map: AppSettings.getIsProUser()]
[File: A3/r.java : L355-388]
      │
      ▼
A3.r.f758h [StateFlow<Boolean>] (S3.a.d())
      │
      ▼
Các UI Subscribers nhận trạng thái mới!
```

---

## 2. Chuỗi Mua Hàng Mới (In-App Purchase Flow)

```
[Người dùng bấm nút "Upgrade to Pro" trên Paywall]
      │
      ▼
A3.p (Paywall ViewModel)
      │
      ▼
A3.p$d (Action Purchase)
[File: A3/p.java : L98-141]
      │
      ▼
A3.r.b(Activity activity, A3.g product, Continuation)
[File: A3/r.java : L546-597]
      │
      ├─► Package r8 = this.f756f.get(product.c())
      │
      ├─► PurchaseParams.Builder(activity, r8).build()
      │
      ▼
CoroutinesExtensionsKt.awaitPurchase(purchases, purchaseParams)
      │
      ▼
PurchaseResult
      │
      ▼
PurchaseResult.getCustomerInfo()
      │
      ▼
A3.r.l(CustomerInfo) [Kiểm tra "Full Access"]
      │
      ▼
A3.e.a (Product active)
      │
      ▼
A3.r.q(A3.e.a)
      │
      ▼
AppSettingsStore.updateIsProUser(true)
      │
      ▼
StateFlow phát tín hiệu true ──> Màn hình Paywall đóng lại ──> UI mở khóa Pro!
```

---

## 3. Chuỗi Khôi Phục Giao Dịch (Restore Purchases Flow)

```
[Người dùng bấm "Restore Purchases"]
      │
      ▼
A3.p (Paywall ViewModel)
      │
      ▼
A3.p$f (Action RestorePurchase)
[File: A3/p.java : L167-187]
      │
      ▼
A3.r.e(Continuation)
[File: A3/r.java : L611-657]
      │
      ▼
CoroutinesExtensionsCommonKt.awaitRestore(purchases, continuation)
      │
      ▼
CustomerInfo (sau khi đồng bộ với Google Play / Amazon Store)
      │
      ▼
A3.r.l(CustomerInfo)
      │
      ├─► Tìm thấy "Full Access" ──> Trả về A3.e ──> updateIsProUser(true)
      │
      └─► Không tìm thấy ─────────► Trả về null ──> updateIsProUser(false)
```

---

## 4. Chuỗi Lan Truyền Đến Giao Diện & Thiết Bị (UI & Feature Gating Graph)

```
A3.r (triển khai S3.a)
      │
      ▼ S3.a.d() [StateFlow<Boolean>]
T3.a (Workstation / Selected Device Manager)
[File: T3/a.java : L37, L263-274]
      │
      ▼
T3.b / T3.c (combine getKnownHostByID với isProUser Flow)
[File: T3/b.java : L179]
      │
      ▼
T3.a.C0274a (KnownHostData: knownHost, device, isProUser)
[File: T3/a.java : L56-111]
      │
      ├───────────────────────────────┬───────────────────────────────┐
      ▼                               ▼                               ▼
VirtualDeviceSettings          FaceplateManager                 Màn hình kết nối
(B3.k.a : L68-135)             (C3.e.c : L57-69)                (p162s3.q : L427)
      │                               │                               │
      ├─► isPro == true:              ├─► isPro == true:              └─► Hiển thị lưới
      │   Mở khóa chọn Faceplate      │   Cho phép Faceplate tùy chọn     bàn phím đầy đủ
      │                               │                                   (15 / 32 phím)
      └─► isPro == false:             └─► isPro == false:
          Khóa Faceplate tùy chọn         Bắt buộc dùng b.h ("Classic")
```
