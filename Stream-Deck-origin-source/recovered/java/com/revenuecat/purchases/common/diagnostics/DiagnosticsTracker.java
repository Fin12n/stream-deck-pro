package com.revenuecat.purchases.common.diagnostics;

import C6.G;
import C6.o;
import C6.v;
import D6.L;
import D6.M;
import I0.mIk.efuWFSeiT;
import androidx.startup.TrZh.ZWZaxQrCHfNe;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import io.sentry.exception.uXy.SZCvugJaXc;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class DiagnosticsTracker {

    @Deprecated
    public static final String BILLING_DEBUG_MESSAGE = "billing_debug_message";

    @Deprecated
    public static final String BILLING_RESPONSE_CODE = "billing_response_code";
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String ENDPOINT_NAME_KEY = "endpoint_name";

    @Deprecated
    public static final String ETAG_HIT_KEY = "etag_hit";

    @Deprecated
    public static final String PRODUCT_TYPE_QUERIED_KEY = "product_type_queried";

    @Deprecated
    public static final String RESPONSE_CODE_KEY = "response_code";

    @Deprecated
    public static final String RESPONSE_TIME_MILLIS_KEY = "response_time_millis";

    @Deprecated
    public static final String SUCCESSFUL_KEY = "successful";

    @Deprecated
    public static final String VERIFICATION_RESULT_KEY = "verification_result";
    private final AppConfig appConfig;
    private final DiagnosticsAnonymizer diagnosticsAnonymizer;
    private final Dispatcher diagnosticsDispatcher;
    private final DiagnosticsFileHelper diagnosticsFileHelper;
    private final DiagnosticsHelper diagnosticsHelper;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker$checkAndClearDiagnosticsFileIfTooBig$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class AnonymousClass1 extends u implements Function0 {
        final /* synthetic */ Function0 $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0 function0) {
            super(0);
            this.$completion = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m167invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m167invoke() {
            if (DiagnosticsTracker.this.diagnosticsFileHelper.isDiagnosticsFileTooBig()) {
                LogUtilsKt.verboseLog("Diagnostics file is too big. Deleting it.");
                DiagnosticsTracker.this.diagnosticsHelper.resetDiagnosticsStatus();
                DiagnosticsTracker.trackMaxEventsStoredLimitReached$default(DiagnosticsTracker.this, false, 1, null);
            }
            this.$completion.invoke();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker$trackEvent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C21671 extends u implements Function0 {
        final /* synthetic */ DiagnosticsEntry $diagnosticsEntry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21671(DiagnosticsEntry diagnosticsEntry) {
            super(0);
            this.$diagnosticsEntry = diagnosticsEntry;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m168invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m168invoke() {
            DiagnosticsTracker.this.trackEventInCurrentThread$purchases_defaultsRelease(this.$diagnosticsEntry);
        }
    }

    public DiagnosticsTracker(AppConfig appConfig, DiagnosticsFileHelper diagnosticsFileHelper, DiagnosticsAnonymizer diagnosticsAnonymizer, DiagnosticsHelper diagnosticsHelper, Dispatcher diagnosticsDispatcher) {
        t.g(appConfig, "appConfig");
        t.g(diagnosticsFileHelper, "diagnosticsFileHelper");
        t.g(diagnosticsAnonymizer, "diagnosticsAnonymizer");
        t.g(diagnosticsHelper, "diagnosticsHelper");
        t.g(diagnosticsDispatcher, "diagnosticsDispatcher");
        this.appConfig = appConfig;
        this.diagnosticsFileHelper = diagnosticsFileHelper;
        this.diagnosticsAnonymizer = diagnosticsAnonymizer;
        this.diagnosticsHelper = diagnosticsHelper;
        this.diagnosticsDispatcher = diagnosticsDispatcher;
    }

    private final void checkAndClearDiagnosticsFileIfTooBig(Function0 function0) {
        enqueue(new AnonymousClass1(function0));
    }

    private final void enqueue(final Function0 function0) {
        Dispatcher.enqueue$default(this.diagnosticsDispatcher, new Runnable() { // from class: com.revenuecat.purchases.common.diagnostics.b
            @Override // java.lang.Runnable
            public final void run() {
                DiagnosticsTracker.enqueue$lambda$0(function0);
            }
        }, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$0(Function0 tmp0) {
        t.g(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public static /* synthetic */ void trackMaxEventsStoredLimitReached$default(DiagnosticsTracker diagnosticsTracker, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        diagnosticsTracker.trackMaxEventsStoredLimitReached(z8);
    }

    /* JADX INFO: renamed from: trackAmazonQueryProductDetailsRequest-VtjQ1oo, reason: not valid java name */
    public final void m161trackAmazonQueryProductDetailsRequestVtjQ1oo(long j8, boolean z8) {
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.AMAZON_QUERY_PRODUCT_DETAILS_REQUEST, M.j(v.a(SUCCESSFUL_KEY, Boolean.valueOf(z8)), v.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(p008a7.a.z(j8)))), null, null, 12, null));
    }

    /* JADX INFO: renamed from: trackAmazonQueryPurchasesRequest-VtjQ1oo, reason: not valid java name */
    public final void m162trackAmazonQueryPurchasesRequestVtjQ1oo(long j8, boolean z8) {
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.AMAZON_QUERY_PURCHASES_REQUEST, M.j(v.a(SUCCESSFUL_KEY, Boolean.valueOf(z8)), v.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(p008a7.a.z(j8)))), null, null, 12, null));
    }

    public final void trackClearingDiagnosticsAfterFailedSync() {
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.CLEARING_DIAGNOSTICS_AFTER_FAILED_SYNC, M.g(), null, null, 12, null));
    }

    public final void trackCustomerInfoVerificationResultIfNeeded(CustomerInfo customerInfo) {
        t.g(customerInfo, "customerInfo");
        VerificationResult verification = customerInfo.getEntitlements().getVerification();
        if (verification == VerificationResult.NOT_REQUESTED) {
            return;
        }
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.CUSTOMER_INFO_VERIFICATION_RESULT, L.e(v.a(VERIFICATION_RESULT_KEY, verification.name())), null, null, 12, null));
    }

    public final void trackEnteredOfflineEntitlementsMode() {
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.ENTERED_OFFLINE_ENTITLEMENTS_MODE, M.g(), null, null, 12, null));
    }

    public final void trackEvent(DiagnosticsEntry diagnosticsEntry) {
        t.g(diagnosticsEntry, "diagnosticsEntry");
        checkAndClearDiagnosticsFileIfTooBig(new C21671(diagnosticsEntry));
    }

    public final void trackEventInCurrentThread$purchases_defaultsRelease(DiagnosticsEntry diagnosticsEntry) {
        t.g(diagnosticsEntry, "diagnosticsEntry");
        if (AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            DiagnosticsEntry diagnosticsEntryAnonymizeEntryIfNeeded = this.diagnosticsAnonymizer.anonymizeEntryIfNeeded(diagnosticsEntry);
            LogUtilsKt.verboseLog("Tracking diagnostics entry: " + diagnosticsEntryAnonymizeEntryIfNeeded);
            try {
                this.diagnosticsFileHelper.appendEvent(diagnosticsEntryAnonymizeEntryIfNeeded);
            } catch (IOException e8) {
                LogUtilsKt.verboseLog("Error tracking diagnostics entry: " + e8);
            }
        }
    }

    /* JADX INFO: renamed from: trackGoogleQueryProductDetailsRequest-Wn2Vu4Y, reason: not valid java name */
    public final void m163trackGoogleQueryProductDetailsRequestWn2Vu4Y(String productType, int i8, String billingDebugMessage, long j8) {
        t.g(productType, "productType");
        t.g(billingDebugMessage, "billingDebugMessage");
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.GOOGLE_QUERY_PRODUCT_DETAILS_REQUEST, M.j(v.a(PRODUCT_TYPE_QUERIED_KEY, productType), v.a(BILLING_RESPONSE_CODE, Integer.valueOf(i8)), v.a(BILLING_DEBUG_MESSAGE, billingDebugMessage), v.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(p008a7.a.z(j8)))), null, null, 12, null));
    }

    /* JADX INFO: renamed from: trackHttpRequestPerformed-NcHsxvU, reason: not valid java name */
    public final void m166trackHttpRequestPerformedNcHsxvU(Endpoint endpoint, long j8, boolean z8, int i8, HTTPResult.Origin origin, VerificationResult verificationResult) {
        t.g(endpoint, "endpoint");
        t.g(verificationResult, "verificationResult");
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.HTTP_REQUEST_PERFORMED, M.j(v.a(ENDPOINT_NAME_KEY, endpoint.getName()), v.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(p008a7.a.z(j8))), v.a(SUCCESSFUL_KEY, Boolean.valueOf(z8)), v.a(RESPONSE_CODE_KEY, Integer.valueOf(i8)), v.a(ETAG_HIT_KEY, Boolean.valueOf(origin == HTTPResult.Origin.CACHE)), v.a(VERIFICATION_RESULT_KEY, verificationResult.name())), null, null, 12, null));
    }

    public final void trackMaxDiagnosticsSyncRetriesReached() {
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.MAX_DIAGNOSTICS_SYNC_RETRIES_REACHED, M.g(), null, null, 12, null));
    }

    public final void trackMaxEventsStoredLimitReached(boolean z8) {
        DiagnosticsEntry diagnosticsEntry = new DiagnosticsEntry(DiagnosticsEntryName.MAX_EVENTS_STORED_LIMIT_REACHED, M.g(), null, null, 12, null);
        if (z8) {
            trackEventInCurrentThread$purchases_defaultsRelease(diagnosticsEntry);
        } else {
            trackEvent(diagnosticsEntry);
        }
    }

    public final void trackProductDetailsNotSupported(int i8, String billingDebugMessage) {
        t.g(billingDebugMessage, "billingDebugMessage");
        DiagnosticsEntryName diagnosticsEntryName = DiagnosticsEntryName.PRODUCT_DETAILS_NOT_SUPPORTED;
        String playStoreVersionName = this.appConfig.getPlayStoreVersionName();
        if (playStoreVersionName == null) {
            playStoreVersionName = "";
        }
        o oVarA = v.a("play_store_version", playStoreVersionName);
        String playServicesVersionName = this.appConfig.getPlayServicesVersionName();
        trackEvent(new DiagnosticsEntry(diagnosticsEntryName, M.j(oVarA, v.a("play_services_version", playServicesVersionName != null ? playServicesVersionName : ""), v.a(BILLING_RESPONSE_CODE, Integer.valueOf(i8)), v.a(BILLING_DEBUG_MESSAGE, billingDebugMessage)), null, null, 12, null));
    }

    public final void trackErrorEnteringOfflineEntitlementsMode(PurchasesError error) {
        t.g(error, "error");
        String str = (error.getCode() == PurchasesErrorCode.UnsupportedError && t.c(error.getUnderlyingErrorMessage(), OfflineEntitlementsStrings.OFFLINE_ENTITLEMENTS_UNSUPPORTED_INAPP_PURCHASES)) ? "one_time_purchase_found" : "unknown";
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.ERROR_ENTERING_OFFLINE_ENTITLEMENTS_MODE, M.j(v.a("offline_entitlement_error_reason", str), v.a(ZWZaxQrCHfNe.bTIV, error.getMessage() + " Underlying error: " + error.getUnderlyingErrorMessage())), null, null, 12, null));
    }

    /* JADX INFO: renamed from: trackGoogleQueryPurchaseHistoryRequest-Wn2Vu4Y, reason: not valid java name */
    public final void m164trackGoogleQueryPurchaseHistoryRequestWn2Vu4Y(String productType, int i8, String billingDebugMessage, long j8) {
        t.g(productType, "productType");
        t.g(billingDebugMessage, "billingDebugMessage");
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.GOOGLE_QUERY_PURCHASE_HISTORY_REQUEST, M.j(v.a(PRODUCT_TYPE_QUERIED_KEY, productType), v.a(BILLING_RESPONSE_CODE, Integer.valueOf(i8)), v.a(SZCvugJaXc.gxUSOoBmL, billingDebugMessage), v.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(p008a7.a.z(j8)))), null, null, 12, null));
    }

    /* JADX INFO: renamed from: trackGoogleQueryPurchasesRequest-Wn2Vu4Y, reason: not valid java name */
    public final void m165trackGoogleQueryPurchasesRequestWn2Vu4Y(String productType, int i8, String billingDebugMessage, long j8) {
        t.g(productType, "productType");
        t.g(billingDebugMessage, "billingDebugMessage");
        trackEvent(new DiagnosticsEntry(DiagnosticsEntryName.GOOGLE_QUERY_PURCHASES_REQUEST, M.j(v.a(PRODUCT_TYPE_QUERIED_KEY, productType), v.a(efuWFSeiT.MxvTpfPlg, Integer.valueOf(i8)), v.a(BILLING_DEBUG_MESSAGE, billingDebugMessage), v.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(p008a7.a.z(j8)))), null, null, 12, null));
    }
}
