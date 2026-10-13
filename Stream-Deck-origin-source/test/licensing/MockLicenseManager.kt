package com.elgato.streamdeck.test.licensing

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * MockLicenseManager: Test-only Entitlement Provider sử dụng Dependency Injection.
 *
 * Triển khai trực tiếp hai interface của ứng dụng:
 * 1. [S3.a]: Interface cung cấp trạng thái bản quyền cơ sở cho ViewModels và UI.
 * 2. [A3.n]: Interface mở rộng phục vụ các thao tác thanh toán, khôi phục và truy vấn RevenueCat.
 *
 * MỤC ĐÍCH:
 * - Thay thế [A3.r] (RevenueCat License Manager) trong môi trường Development & Test.
 * - Kiểm thử 6 trạng thái cấp phép mà không cần gọi API thật, không giả mạo receipt.
 * - Độc lập hoàn toàn khỏi mã nguồn bản phát hành (Production code).
 */
class MockLicenseManager(
    initialState: SimulatedEntitlementState = SimulatedEntitlementState.ABSENT
) {
    // Luồng trạng thái phản ứng (tương đương với A3.r.f66e)
    private val _proStateFlow = MutableStateFlow(initialState.isProUser)
    val proStateFlow: StateFlow<Boolean> = _proStateFlow.asStateFlow()

    // Trạng thái mô phỏng hiện tại
    var currentState: SimulatedEntitlementState = initialState
        private set

    // Lưu trữ lịch sử chuyển đổi trạng thái để phục vụ Assertions trong Unit Tests
    val stateTransitionHistory = mutableListOf<SimulatedEntitlementState>()

    init {
        stateTransitionHistory.add(initialState)
    }

    /**
     * Cấu hình trạng thái bản quyền mô phỏng mới.
     * Cập nhật tức thời cả cờ boolean và Reactive StateFlow.
     */
    fun setSimulatedState(newState: SimulatedEntitlementState) {
        this.currentState = newState
        stateTransitionHistory.add(newState)

        if (newState != SimulatedEntitlementState.NETWORK_UNAVAILABLE) {
            _proStateFlow.value = newState.isProUser
        }
        // Lưu ý: với NETWORK_UNAVAILABLE, giữ nguyên giá trị _proStateFlow.value hiện tại (mô phỏng cache)
    }

    // ==========================================
    // Triển khai Interface S3.a (Core License Access)
    // ==========================================

    /**
     * S3.a.c(): Truy vấn trạng thái Pro tức thời (Synchronous boolean query).
     */
    fun c(): Boolean {
        return _proStateFlow.value
    }

    /**
     * S3.a.d(): Cung cấp StateFlow cho ViewModels (Reactive Flow).
     */
    fun d(): StateFlow<Boolean> {
        return proStateFlow
    }

    // ==========================================
    // Triển khai Interface A3.n (Billing Operations)
    // ==========================================

    /**
     * A3.n.a(): Lấy danh sách gói cước (Offerings).
     */
    suspend fun a(): Result<List<String>> {
        if (!currentState.networkAvailable) {
            return Result.failure(LicenseTestException("Network error: Cannot fetch offerings while offline"))
        }
        return Result.success(listOf("streamdeck.monthly", "streamdeck.annual", "streamdeck.lifetime"))
    }

    /**
     * A3.n.b(): Thực hiện mua gói cước (Purchase Package).
     */
    suspend fun b(packageIdentifier: String): Result<Boolean> {
        if (!currentState.networkAvailable) {
            return Result.failure(LicenseTestException("Network error: Purchase flow requires internet connection"))
        }
        // Trong môi trường test, chuyển trạng thái sang ACTIVE nếu mua thành công
        setSimulatedState(SimulatedEntitlementState.ACTIVE)
        return Result.success(true)
    }

    /**
     * A3.n.e(): Khôi phục giao dịch mua trước đó (Restore Purchases).
     */
    suspend fun e(): Result<Boolean> {
        if (!currentState.networkAvailable) {
            return Result.failure(LicenseTestException("Network error: Cannot restore purchases while offline"))
        }

        return if (currentState.restoreSuccessful) {
            setSimulatedState(SimulatedEntitlementState.RESTORE_SUCCESS)
            Result.success(true)
        } else {
            setSimulatedState(SimulatedEntitlementState.RESTORE_FAILURE)
            Result.failure(LicenseTestException("No previous purchases found for this account"))
        }
    }

    /**
     * A3.n.f(): Làm mới thông tin khách hàng (Refresh CustomerInfo).
     */
    suspend fun f(): Result<SimulatedEntitlementState> {
        if (!currentState.networkAvailable) {
            return Result.failure(LicenseTestException("Network error: Cannot refresh customer info"))
        }
        return Result.success(currentState)
    }

    /**
     * A3.n.g(): Lấy App User ID.
     */
    fun g(): String {
        return "test_isolated_user_stream_deck_dev"
    }

    /**
     * A3.n.h(): Truy vấn bản đồ Entitlements thô.
     */
    suspend fun h(): Map<String, Boolean> {
        val map = mutableMapOf<String, Boolean>()
        if (currentState.entitlementIdentifier != null) {
            map[currentState.entitlementIdentifier!!] = currentState.hasActiveEntitlement
        }
        return map
    }

    /**
     * Xóa sạch lịch sử test để chuẩn bị cho test case mới.
     */
    fun resetHistory() {
        stateTransitionHistory.clear()
        stateTransitionHistory.add(currentState)
    }
}

/**
 * Ngoại lệ đặc thù cho môi trường kiểm thử độc lập.
 */
class LicenseTestException(message: String) : Exception(message)
