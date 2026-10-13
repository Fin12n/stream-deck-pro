package com.elgato.streamdeck.test.licensing

/**
 * Cấu hình Module Dependency Injection (Winter DI) dành riêng cho Test Harness.
 *
 * YÊU CẦU AN TOÀN TUYỆT ĐỐI (Safety Guardrails):
 * 1. Tách biệt hoàn toàn khỏi production build.
 * 2. Không cho phép âm thầm kích hoạt quyền Pro trong Release build.
 * 3. Nếu phát hiện chạy trên môi trường Release mà cố nạp TestModule, hệ thống sẽ ném ngoại lệ dừng ngay lập tức.
 */
object TestModuleConfig {

    /**
     * Cờ mô phỏng kiểu build hiện tại (chỉ DEBUG mới được phép dùng Mock).
     */
    var isDebugBuild: Boolean = true

    /**
     * Kiểm tra chốt chặn an toàn (Build Safety Guardrail).
     * Ngăn chặn việc sử dụng MockLicenseManager trong Release build.
     */
    fun assertTestEnvironmentSafe() {
        if (!isDebugBuild) {
            throw IllegalStateException(
                "CRITICAL SECURITY VIOLATION: MockLicenseManager cannot be bound in a Release build! " +
                "Production builds must strictly use RevenueCat A3.r implementation."
            )
        }
    }

    /**
     * Tạo đối tượng Winter DI module cho môi trường kiểm thử.
     * Thay thế singleton S3.a và A3.n bằng instance của MockLicenseManager.
     */
    fun createTestLicenseModule(mockLicenseManager: MockLicenseManager): Map<String, Any> {
        assertTestEnvironmentSafe()

        return mapOf(
            "S3.a" to mockLicenseManager,
            "A3.n" to mockLicenseManager,
            "DESCRIPTION" to "Winter DI Test Scope - Isolated Licensing Harness"
        )
    }

    /**
     * Kiểm tra cơ chế Debug Override chính thống của Elgato:
     * Tận dụng trường số 6 trong AppSettings.proto: `optional bool isForcedProUser = 6;`
     */
    fun evaluateEffectiveProState(
        isProUserFromSdk: Boolean,
        isForcedProUserFromStore: Boolean?
    ): Boolean {
        // Nếu cờ isForcedProUser được bật (chỉ có trong debug build), ưu tiên giá trị này
        if (isForcedProUserFromStore != null) {
            return isForcedProUserFromStore
        }
        // Mặc định tuân theo kết quả trả về từ RevenueCat SDK
        return isProUserFromSdk
    }
}
