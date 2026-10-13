package io.sentry.android.core;

import io.sentry.J2;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryAndroidOptions extends J2 {
    private boolean attachScreenshot;
    private boolean attachViewHierarchy;
    private a beforeScreenshotCaptureCallback;
    private a beforeViewHierarchyCaptureCallback;
    private io.sentry.android.core.internal.util.u frameMetricsCollector;
    private boolean anrEnabled = true;
    private long anrTimeoutIntervalMillis = 5000;
    private boolean anrReportInDebug = false;
    private boolean enableActivityLifecycleBreadcrumbs = true;
    private boolean enableAppLifecycleBreadcrumbs = true;
    private boolean enableSystemEventBreadcrumbs = true;
    private boolean enableAppComponentBreadcrumbs = true;
    private boolean enableNetworkEventBreadcrumbs = true;
    private boolean enableAutoActivityLifecycleTracing = true;
    private boolean enableActivityLifecycleTracingAutoFinish = true;
    private h0 debugImagesLoader = p0.a();
    private boolean collectAdditionalContext = true;
    private long startupCrashFlushTimeoutMillis = 5000;
    private final long startupCrashDurationThresholdMillis = 2000;
    private boolean enableFramesTracking = true;
    private String nativeSdkName = null;
    private boolean enableRootCheck = true;
    private boolean enableNdk = true;
    private n0 ndkHandlerStrategy = n0.SENTRY_HANDLER_STRATEGY_DEFAULT;
    private boolean enableScopeSync = true;
    private boolean enableAutoTraceIdGeneration = true;
    private boolean reportHistoricalAnrs = false;
    private boolean attachAnrThreadDump = false;
    private boolean enablePerformanceV2 = true;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
    }

    public SentryAndroidOptions() {
        setSentryClientName("sentry.java.android/8.3.0");
        setSdkVersion(createSdkVersion());
        setAttachServerName(false);
    }

    private io.sentry.protocol.o createSdkVersion() {
        io.sentry.protocol.o oVarK = io.sentry.protocol.o.k(getSdkVersion(), "sentry.java.android", "8.3.0");
        oVarK.c("maven:io.sentry:sentry-android-core", "8.3.0");
        return oVarK;
    }

    public void enableAllAutoBreadcrumbs(boolean z8) {
        this.enableActivityLifecycleBreadcrumbs = z8;
        this.enableAppComponentBreadcrumbs = z8;
        this.enableSystemEventBreadcrumbs = z8;
        this.enableAppLifecycleBreadcrumbs = z8;
        this.enableNetworkEventBreadcrumbs = z8;
        setEnableUserInteractionBreadcrumbs(z8);
    }

    public long getAnrTimeoutIntervalMillis() {
        return this.anrTimeoutIntervalMillis;
    }

    public a getBeforeScreenshotCaptureCallback() {
        return null;
    }

    public a getBeforeViewHierarchyCaptureCallback() {
        return null;
    }

    public h0 getDebugImagesLoader() {
        return this.debugImagesLoader;
    }

    public io.sentry.android.core.internal.util.u getFrameMetricsCollector() {
        return this.frameMetricsCollector;
    }

    public String getNativeSdkName() {
        return this.nativeSdkName;
    }

    public int getNdkHandlerStrategy() {
        return this.ndkHandlerStrategy.getValue();
    }

    public long getStartupCrashDurationThresholdMillis() {
        return 2000L;
    }

    public long getStartupCrashFlushTimeoutMillis() {
        return this.startupCrashFlushTimeoutMillis;
    }

    public boolean isAnrEnabled() {
        return this.anrEnabled;
    }

    public boolean isAnrReportInDebug() {
        return this.anrReportInDebug;
    }

    public boolean isAttachAnrThreadDump() {
        return this.attachAnrThreadDump;
    }

    public boolean isAttachScreenshot() {
        return this.attachScreenshot;
    }

    public boolean isAttachViewHierarchy() {
        return this.attachViewHierarchy;
    }

    public boolean isCollectAdditionalContext() {
        return this.collectAdditionalContext;
    }

    public boolean isEnableActivityLifecycleBreadcrumbs() {
        return this.enableActivityLifecycleBreadcrumbs;
    }

    public boolean isEnableActivityLifecycleTracingAutoFinish() {
        return this.enableActivityLifecycleTracingAutoFinish;
    }

    public boolean isEnableAppComponentBreadcrumbs() {
        return this.enableAppComponentBreadcrumbs;
    }

    public boolean isEnableAppLifecycleBreadcrumbs() {
        return this.enableAppLifecycleBreadcrumbs;
    }

    public boolean isEnableAutoActivityLifecycleTracing() {
        return this.enableAutoActivityLifecycleTracing;
    }

    public boolean isEnableAutoTraceIdGeneration() {
        return this.enableAutoTraceIdGeneration;
    }

    public boolean isEnableFramesTracking() {
        return this.enableFramesTracking;
    }

    public boolean isEnableNdk() {
        return this.enableNdk;
    }

    public boolean isEnableNetworkEventBreadcrumbs() {
        return this.enableNetworkEventBreadcrumbs;
    }

    public boolean isEnablePerformanceV2() {
        return this.enablePerformanceV2;
    }

    public boolean isEnableRootCheck() {
        return this.enableRootCheck;
    }

    public boolean isEnableScopeSync() {
        return this.enableScopeSync;
    }

    public boolean isEnableSystemEventBreadcrumbs() {
        return this.enableSystemEventBreadcrumbs;
    }

    public boolean isReportHistoricalAnrs() {
        return this.reportHistoricalAnrs;
    }

    public void setAnrEnabled(boolean z8) {
        this.anrEnabled = z8;
    }

    public void setAnrReportInDebug(boolean z8) {
        this.anrReportInDebug = z8;
    }

    public void setAnrTimeoutIntervalMillis(long j8) {
        this.anrTimeoutIntervalMillis = j8;
    }

    public void setAttachAnrThreadDump(boolean z8) {
        this.attachAnrThreadDump = z8;
    }

    public void setAttachScreenshot(boolean z8) {
        this.attachScreenshot = z8;
    }

    public void setAttachViewHierarchy(boolean z8) {
        this.attachViewHierarchy = z8;
    }

    public void setCollectAdditionalContext(boolean z8) {
        this.collectAdditionalContext = z8;
    }

    public void setDebugImagesLoader(h0 h0Var) {
        if (h0Var == null) {
            h0Var = p0.a();
        }
        this.debugImagesLoader = h0Var;
    }

    public void setEnableActivityLifecycleBreadcrumbs(boolean z8) {
        this.enableActivityLifecycleBreadcrumbs = z8;
    }

    public void setEnableActivityLifecycleTracingAutoFinish(boolean z8) {
        this.enableActivityLifecycleTracingAutoFinish = z8;
    }

    public void setEnableAppComponentBreadcrumbs(boolean z8) {
        this.enableAppComponentBreadcrumbs = z8;
    }

    public void setEnableAppLifecycleBreadcrumbs(boolean z8) {
        this.enableAppLifecycleBreadcrumbs = z8;
    }

    public void setEnableAutoActivityLifecycleTracing(boolean z8) {
        this.enableAutoActivityLifecycleTracing = z8;
    }

    public void setEnableAutoTraceIdGeneration(boolean z8) {
        this.enableAutoTraceIdGeneration = z8;
    }

    public void setEnableFramesTracking(boolean z8) {
        this.enableFramesTracking = z8;
    }

    public void setEnableNdk(boolean z8) {
        this.enableNdk = z8;
    }

    public void setEnableNetworkEventBreadcrumbs(boolean z8) {
        this.enableNetworkEventBreadcrumbs = z8;
    }

    public void setEnablePerformanceV2(boolean z8) {
        this.enablePerformanceV2 = z8;
    }

    public void setEnableRootCheck(boolean z8) {
        this.enableRootCheck = z8;
    }

    public void setEnableScopeSync(boolean z8) {
        this.enableScopeSync = z8;
    }

    public void setEnableSystemEventBreadcrumbs(boolean z8) {
        this.enableSystemEventBreadcrumbs = z8;
    }

    public void setFrameMetricsCollector(io.sentry.android.core.internal.util.u uVar) {
        this.frameMetricsCollector = uVar;
    }

    public void setNativeHandlerStrategy(n0 n0Var) {
        this.ndkHandlerStrategy = n0Var;
    }

    public void setNativeSdkName(String str) {
        this.nativeSdkName = str;
    }

    public void setReportHistoricalAnrs(boolean z8) {
        this.reportHistoricalAnrs = z8;
    }

    public void setStartupCrashFlushTimeoutMillis(long j8) {
        this.startupCrashFlushTimeoutMillis = j8;
    }

    public void setBeforeScreenshotCaptureCallback(a aVar) {
    }

    public void setBeforeViewHierarchyCaptureCallback(a aVar) {
    }
}
