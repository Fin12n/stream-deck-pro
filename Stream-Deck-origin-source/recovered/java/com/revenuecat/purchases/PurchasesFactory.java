package com.revenuecat.purchases;

import Q6.k;
import Z6.w;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.preference.PreferenceManager;
import com.revenuecat.purchases.common.Anonymizer;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsAnonymizer;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsFileHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.networking.ETagManager;
import com.revenuecat.purchases.common.offerings.OfferingsCache;
import com.revenuecat.purchases.common.offerings.OfferingsFactory;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.common.offlineentitlements.OfflineCustomerInfoCalculator;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.offlineentitlements.PurchasedProductsFetcher;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.paywalls.PaywallPresentedCache;
import com.revenuecat.purchases.paywalls.events.PaywallEventsManager;
import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import com.revenuecat.purchases.strings.ConfigureStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import com.revenuecat.purchases.utils.CoilImageDownloader;
import com.revenuecat.purchases.utils.EventsFileHelper;
import com.revenuecat.purchases.utils.OfferingImagePreDownloader;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class PurchasesFactory {
    private final APIKeyValidator apiKeyValidator;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class LowPriorityThreadFactory implements ThreadFactory {
        private final String threadName;

        public LowPriorityThreadFactory(String threadName) {
            t.g(threadName, "threadName");
            this.threadName = threadName;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void newThread$lambda$1(Runnable runnable) {
            if (runnable != null) {
                Process.setThreadPriority(19);
                runnable.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            return new Thread(new Runnable() { // from class: com.revenuecat.purchases.d
                @Override // java.lang.Runnable
                public final void run() {
                    PurchasesFactory.LowPriorityThreadFactory.newThread$lambda$1(runnable);
                }
            }, this.threadName);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesFactory$createPaywallEventsManager$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class AnonymousClass1 extends C2639q implements k {
        public AnonymousClass1(Object obj) {
            super(1, obj, PaywallStoredEvent.Companion.class, "fromString", "fromString(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", 0);
        }

        @Override // Q6.k
        public final PaywallStoredEvent invoke(String p8) {
            t.g(p8, "p0");
            return ((PaywallStoredEvent.Companion) this.receiver).fromString(p8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PurchasesFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final ExecutorService createDefaultExecutor() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        t.f(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    private final ExecutorService createEventsExecutor() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new LowPriorityThreadFactory("revenuecat-events-thread"));
        t.f(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduled…venuecat-events-thread\"))");
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    private final PaywallEventsManager createPaywallEventsManager(Context context, IdentityManager identityManager, Dispatcher dispatcher, Backend backend) {
        if (AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            return new PaywallEventsManager(new EventsFileHelper(new FileHelper(context), PaywallEventsManager.PAYWALL_EVENTS_FILE_PATH, new AnonymousClass1(PaywallStoredEvent.Companion)), identityManager, dispatcher, backend);
        }
        LogUtilsKt.debugLog("Paywall events are only supported on Android N or newer.");
        return null;
    }

    public static /* synthetic */ Purchases createPurchases$default(PurchasesFactory purchasesFactory, PurchasesConfiguration purchasesConfiguration, PlatformInfo platformInfo, URL url, BillingAbstract billingAbstract, boolean z8, boolean z9, boolean z10, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            billingAbstract = null;
        }
        return purchasesFactory.createPurchases(purchasesConfiguration, platformInfo, url, billingAbstract, (i8 & 16) != 0 ? false : z8, (i8 & 32) != 0 ? false : z9, (i8 & 64) != 0 ? false : z10);
    }

    private final Application getApplication(Context context) {
        Context applicationContext = context.getApplicationContext();
        t.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return (Application) applicationContext;
    }

    private final boolean hasPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Purchases createPurchases(PurchasesConfiguration configuration, PlatformInfo platformInfo, URL url, BillingAbstract billingAbstract, boolean z8, boolean z9, boolean z10) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        Dispatcher dispatcher;
        DiagnosticsTracker diagnosticsTracker;
        DiagnosticsHelper diagnosticsHelper;
        DiagnosticsFileHelper diagnosticsFileHelper;
        DeviceCache deviceCache;
        Application application;
        BillingAbstract billingAbstractCreateBilling;
        Dispatcher dispatcher2;
        DiagnosticsSynchronizer diagnosticsSynchronizer;
        t.g(configuration, "configuration");
        t.g(platformInfo, "platformInfo");
        validateConfiguration(configuration);
        Application application2 = getApplication(configuration.getContext());
        AppConfig appConfig = new AppConfig(configuration.getContext(), configuration.getPurchasesAreCompletedBy(), configuration.getShowInAppMessagesAutomatically(), platformInfo, url, configuration.getStore(), configuration.getDangerousSettings(), z10, z8, z9);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(application2);
        ETagManager eTagManager = new ETagManager(configuration.getContext(), null, null, 6, null);
        Dispatcher dispatcher3 = new Dispatcher(createDefaultExecutor(), null, z10, 2, null);
        ExecutorService service = configuration.getService();
        if (service == null) {
            service = createDefaultExecutor();
        }
        Dispatcher dispatcher4 = new Dispatcher(service, null, z10, 2, null);
        Dispatcher dispatcher5 = new Dispatcher(createEventsExecutor(), null, z10, 2, null);
        if (configuration.getDiagnosticsEnabled() && AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            diagnosticsFileHelper = new DiagnosticsFileHelper(new FileHelper(configuration.getContext()));
            diagnosticsHelper = new DiagnosticsHelper(configuration.getContext(), diagnosticsFileHelper, null, 4, null);
            dispatcher = dispatcher3;
            diagnosticsTracker = new DiagnosticsTracker(appConfig, diagnosticsFileHelper, new DiagnosticsAnonymizer(new Anonymizer()), diagnosticsHelper, dispatcher5);
        } else {
            dispatcher = dispatcher3;
            if (configuration.getDiagnosticsEnabled()) {
                LogUtilsKt.warnLog("Diagnostics are only supported on Android N or newer.");
            }
            diagnosticsTracker = null;
            diagnosticsHelper = null;
            diagnosticsFileHelper = null;
        }
        SigningManager signingManager = new SigningManager(SignatureVerificationMode.Companion.fromEntitlementVerificationMode$default(SignatureVerificationMode.Companion, configuration.getVerificationMode(), null, 2, null), appConfig, configuration.getApiKey());
        t.f(prefs, "prefs");
        DeviceCache deviceCache2 = new DeviceCache(prefs, configuration.getApiKey(), null, 4, null);
        DiagnosticsTracker diagnosticsTracker2 = diagnosticsTracker;
        HTTPClient hTTPClient = new HTTPClient(appConfig, eTagManager, diagnosticsTracker2, signingManager, deviceCache2, null, null, 96, null);
        BackendHelper backendHelper = new BackendHelper(configuration.getApiKey(), r5, appConfig, hTTPClient);
        Backend backend = new Backend(appConfig, r5, dispatcher5, hTTPClient, backendHelper);
        PurchasesStateCache purchasesStateCache = new PurchasesStateCache(new PurchasesState(null, null, null, false, false, 31, null));
        if (billingAbstract == null) {
            billingAbstractCreateBilling = BillingFactory.INSTANCE.createBilling(configuration.getStore(), application2, backendHelper, deviceCache2, PurchasesAreCompletedByKt.getFinishTransactions(configuration.getPurchasesAreCompletedBy()), diagnosticsTracker2, purchasesStateCache, configuration.getPendingTransactionsForPrepaidPlansEnabled());
            backendHelper = backendHelper;
            application = application2;
            deviceCache = deviceCache2;
        } else {
            deviceCache = deviceCache2;
            application = application2;
            billingAbstractCreateBilling = billingAbstract;
        }
        SubscriberAttributesPoster subscriberAttributesPoster = new SubscriberAttributesPoster(backendHelper);
        DeviceIdentifiersFetcher deviceIdentifiersFetcherCreateAttributionFetcher = AttributionFetcherFactory.INSTANCE.createAttributionFetcher(configuration.getStore(), r5);
        SubscriberAttributesCache subscriberAttributesCache = new SubscriberAttributesCache(deviceCache);
        SubscriberAttributesManager subscriberAttributesManager = new SubscriberAttributesManager(subscriberAttributesCache, subscriberAttributesPoster, deviceIdentifiersFetcherCreateAttributionFetcher);
        DeviceCache deviceCache3 = deviceCache;
        OfflineEntitlementsManager offlineEntitlementsManager = new OfflineEntitlementsManager(backend, new OfflineCustomerInfoCalculator(new PurchasedProductsFetcher(deviceCache3, billingAbstractCreateBilling, null, 4, null), appConfig, diagnosticsTracker2, null, 8, null), deviceCache3, appConfig, diagnosticsTracker2);
        OfferingsCache offeringsCache = new OfferingsCache(deviceCache3, null, null, 6, null);
        IdentityManager identityManager = new IdentityManager(deviceCache3, subscriberAttributesCache, subscriberAttributesManager, offeringsCache, backend, offlineEntitlementsManager);
        Application application3 = application;
        CustomerInfoUpdateHandler customerInfoUpdateHandler = new CustomerInfoUpdateHandler(deviceCache3, identityManager, offlineEntitlementsManager, appConfig, diagnosticsTracker2, 0 == true ? 1 : 0, 32, null);
        PaywallPresentedCache paywallPresentedCache = new PaywallPresentedCache();
        BillingAbstract billingAbstract2 = billingAbstractCreateBilling;
        PostReceiptHelper postReceiptHelper = new PostReceiptHelper(appConfig, backend, billingAbstract2, customerInfoUpdateHandler, deviceCache3, subscriberAttributesManager, offlineEntitlementsManager, paywallPresentedCache);
        PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper = new PostTransactionWithProductDetailsHelper(billingAbstract2, postReceiptHelper);
        PostPendingTransactionsHelper postPendingTransactionsHelper = new PostPendingTransactionsHelper(appConfig, deviceCache3, billingAbstract2, dispatcher4, identityManager, postTransactionWithProductDetailsHelper);
        CustomerInfoHelper customerInfoHelper = new CustomerInfoHelper(deviceCache3, backend, offlineEntitlementsManager, customerInfoUpdateHandler, postPendingTransactionsHelper, null, 32, null);
        DiagnosticsHelper diagnosticsHelper2 = diagnosticsHelper;
        OfferingParser offeringParserCreateOfferingParser = OfferingParserFactory.INSTANCE.createOfferingParser(configuration.getStore());
        if (diagnosticsFileHelper == null || diagnosticsHelper2 == null || diagnosticsTracker2 == null || !AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            dispatcher2 = dispatcher5;
            diagnosticsSynchronizer = null;
        } else {
            diagnosticsSynchronizer = new DiagnosticsSynchronizer(diagnosticsHelper2, diagnosticsFileHelper, diagnosticsTracker2, backend, dispatcher5);
            dispatcher2 = dispatcher5;
        }
        SyncPurchasesHelper syncPurchasesHelper = new SyncPurchasesHelper(billingAbstract2, identityManager, customerInfoHelper, postReceiptHelper);
        OfferingsManager offeringsManager = new OfferingsManager(offeringsCache, backend, new OfferingsFactory(billingAbstract2, offeringParserCreateOfferingParser, dispatcher), new OfferingImagePreDownloader(false, new CoilImageDownloader(application3), 1, null), null, 16, null);
        LogIntent logIntent = LogIntent.DEBUG;
        LogWrapperKt.log(logIntent, ConfigureStrings.DEBUG_ENABLED);
        String str = String.format(ConfigureStrings.SDK_VERSION, Arrays.copyOf(new Object[]{Purchases.Companion.getFrameworkVersion()}, 1));
        t.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        String str2 = String.format(ConfigureStrings.PACKAGE_NAME, Arrays.copyOf(new Object[]{appConfig.getPackageName()}, 1));
        t.f(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        LogIntent logIntent2 = LogIntent.USER;
        String str3 = String.format(ConfigureStrings.INITIAL_APP_USER_ID, Arrays.copyOf(new Object[]{configuration.getAppUserID()}, 1));
        t.f(str3, "format(this, *args)");
        LogWrapperKt.log(logIntent2, str3);
        String str4 = String.format(ConfigureStrings.VERIFICATION_MODE_SELECTED, Arrays.copyOf(new Object[]{configuration.getVerificationMode().name()}, 1));
        t.f(str4, "format(this, *args)");
        LogWrapperKt.log(logIntent, str4);
        return new Purchases(new PurchasesOrchestrator(application3, configuration.getAppUserID(), backend, billingAbstract2, deviceCache3, identityManager, subscriberAttributesManager, appConfig, customerInfoHelper, customerInfoUpdateHandler, diagnosticsSynchronizer, offlineEntitlementsManager, postReceiptHelper, postTransactionWithProductDetailsHelper, postPendingTransactionsHelper, syncPurchasesHelper, offeringsManager, createPaywallEventsManager(application3, identityManager, dispatcher2, backend), paywallPresentedCache, purchasesStateCache, null, 1048576, null));
    }

    public final void validateConfiguration(PurchasesConfiguration configuration) {
        t.g(configuration, "configuration");
        if (!hasPermission(configuration.getContext(), "android.permission.INTERNET")) {
            throw new IllegalArgumentException("Purchases requires INTERNET permission.");
        }
        if (w.b0(configuration.getApiKey())) {
            throw new IllegalArgumentException("API key must be set. Get this from the RevenueCat web app");
        }
        if (!(configuration.getContext().getApplicationContext() instanceof Application)) {
            throw new IllegalArgumentException("Needs an application context.");
        }
        this.apiKeyValidator.validateAndLog(configuration.getApiKey(), configuration.getStore());
    }

    public PurchasesFactory(APIKeyValidator apiKeyValidator) {
        t.g(apiKeyValidator, "apiKeyValidator");
        this.apiKeyValidator = apiKeyValidator;
    }

    public /* synthetic */ PurchasesFactory(APIKeyValidator aPIKeyValidator, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? new APIKeyValidator() : aPIKeyValidator);
    }
}
