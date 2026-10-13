package com.elgato.streamdeck.test.licensing

/**
 * Định nghĩa 6 trạng thái cấp phép mô phỏng (Simulated Entitlement States)
 * dùng riêng cho môi trường kiểm thử độc lập (Isolated Testing Environment).
 *
 * TUÂN THỦ:
 * - Không can thiệp vào mã xác thực trong bản phát hành (Production).
 * - Không tạo receipt giả mạo gửi lên server bên thứ ba.
 * - Mô phỏng logic tương thích với RevenueCat SDK và cơ chế nội bộ của Elgato.
 */
enum class SimulatedEntitlementState(
    val stateName: String,
    val isProUser: Boolean,
    val hasActiveEntitlement: Boolean,
    val entitlementIdentifier: String?,
    val isExpired: Boolean,
    val networkAvailable: Boolean,
    val restoreSuccessful: Boolean,
    val errorCode: String? = null,
    val description: String
) {
    /**
     * 1. Entitlement active:
     * Người dùng có gói bản quyền "Full Access" còn hạn sử dụng hợp lệ.
     */
    ACTIVE(
        stateName = "ENTITLEMENT_ACTIVE",
        isProUser = true,
        hasActiveEntitlement = true,
        entitlementIdentifier = "Full Access",
        isExpired = false,
        networkAvailable = true,
        restoreSuccessful = true,
        errorCode = null,
        description = "Gói Full Access đang hoạt động hợp lệ. Toàn bộ tính năng Pro và vỏ phím tùy chỉnh được mở khóa."
    ),

    /**
     * 2. Entitlement absent:
     * Người dùng dùng bản miễn phí, chưa từng mua gói Pro.
     */
    ABSENT(
        stateName = "ENTITLEMENT_ABSENT",
        isProUser = false,
        hasActiveEntitlement = false,
        entitlementIdentifier = null,
        isExpired = false,
        networkAvailable = true,
        restoreSuccessful = false,
        errorCode = null,
        description = "Không có gói bản quyền. Vỏ phím tùy chỉnh bị khóa, ép buộc về vỏ phím Classic."
    ),

    /**
     * 3. Subscription expired:
     * Người dùng từng đăng ký nhưng gói thuê bao đã hết hạn thanh toán.
     */
    EXPIRED(
        stateName = "SUBSCRIPTION_EXPIRED",
        isProUser = false,
        hasActiveEntitlement = false,
        entitlementIdentifier = "Full Access",
        isExpired = true,
        networkAvailable = true,
        restoreSuccessful = false,
        errorCode = "SUBSCRIPTION_EXPIRED",
        description = "Gói thuê bao đã hết hạn. Hệ thống tự động thu hồi quyền Pro và khôi phục giao diện mặc định."
    ),

    /**
     * 4. Network unavailable:
     * Thiết bị không có kết nối Internet khi truy vấn thông tin bản quyền.
     */
    NETWORK_UNAVAILABLE(
        stateName = "NETWORK_UNAVAILABLE",
        isProUser = false, // Fallback về cache cục bộ của AppSettingsStore
        hasActiveEntitlement = false,
        entitlementIdentifier = null,
        isExpired = false,
        networkAvailable = false,
        restoreSuccessful = false,
        errorCode = "NETWORK_ERROR",
        description = "Mất kết nối Internet. SDK ném NetworkError, ứng dụng giữ nguyên trạng thái cache gần nhất."
    ),

    /**
     * 5. Purchase restoration successful:
     * Quá trình khôi phục giao dịch (Restore Purchases) tìm thấy gói "Full Access" cũ và kích hoạt thành công.
     */
    RESTORE_SUCCESS(
        stateName = "RESTORE_SUCCESSFUL",
        isProUser = true,
        hasActiveEntitlement = true,
        entitlementIdentifier = "Full Access",
        isExpired = false,
        networkAvailable = true,
        restoreSuccessful = true,
        errorCode = null,
        description = "Khôi phục giao dịch thành công. Trạng thái Pro được cập nhật và kích hoạt tức thì."
    ),

    /**
     * 6. Purchase restoration unsuccessful:
     * Quá trình khôi phục giao dịch thất bại (không tìm thấy biên lai mua trước đó hoặc lỗi tài khoản).
     */
    RESTORE_FAILURE(
        stateName = "RESTORE_UNSUCCESSFUL",
        isProUser = false,
        hasActiveEntitlement = false,
        entitlementIdentifier = null,
        isExpired = false,
        networkAvailable = true,
        restoreSuccessful = false,
        errorCode = "PURCHASE_NOT_FOUND",
        description = "Khôi phục thất bại do không tìm thấy gói bản quyền nào liên kết với tài khoản này."
    );
}
