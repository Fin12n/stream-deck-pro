package com.revenuecat.purchases.identity;

import C6.G;
import Q6.k;
import Q6.o;
import Z6.j;
import Z6.v;
import Z6.w;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offerings.OfferingsCache;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.strings.IdentityStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class IdentityManager {
    private final j anonymousIdRegex;
    private final Backend backend;
    private final DeviceCache deviceCache;
    private final OfferingsCache offeringsCache;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final SubscriberAttributesCache subscriberAttributesCache;
    private final SubscriberAttributesManager subscriberAttributesManager;

    /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$logIn$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class AnonymousClass2 extends u implements Function0 {
        final /* synthetic */ String $newAppUserID;
        final /* synthetic */ String $oldAppUserID;
        final /* synthetic */ k $onError;
        final /* synthetic */ o $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$logIn$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class AnonymousClass1 extends u implements o {
            final /* synthetic */ String $newAppUserID;
            final /* synthetic */ String $oldAppUserID;
            final /* synthetic */ o $onSuccess;
            final /* synthetic */ IdentityManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(IdentityManager identityManager, o oVar, String str, String str2) {
                super(2);
                this.this$0 = identityManager;
                this.$onSuccess = oVar;
                this.$newAppUserID = str;
                this.$oldAppUserID = str2;
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((CustomerInfo) obj, ((Boolean) obj2).booleanValue());
                return G.f1419a;
            }

            public final void invoke(CustomerInfo customerInfo, boolean z8) {
                t.g(customerInfo, "customerInfo");
                IdentityManager identityManager = this.this$0;
                String str = this.$newAppUserID;
                String str2 = this.$oldAppUserID;
                synchronized (identityManager) {
                    LogIntent logIntent = LogIntent.USER;
                    String str3 = String.format(IdentityStrings.LOG_IN_SUCCESSFUL, Arrays.copyOf(new Object[]{str, Boolean.valueOf(z8)}, 2));
                    t.f(str3, "format(this, *args)");
                    LogWrapperKt.log(logIntent, str3);
                    identityManager.deviceCache.clearCachesForAppUserID(str2);
                    identityManager.offeringsCache.clearCache();
                    identityManager.subscriberAttributesCache.clearSubscriberAttributesIfSyncedForSubscriber(str2);
                    identityManager.deviceCache.cacheAppUserID(str);
                    identityManager.deviceCache.cacheCustomerInfo(str, customerInfo);
                    identityManager.copySubscriberAttributesToNewUserIfOldIsAnonymous(str2, str);
                    identityManager.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
                    G g8 = G.f1419a;
                }
                this.$onSuccess.invoke(customerInfo, Boolean.valueOf(z8));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, k kVar, o oVar) {
            super(0);
            this.$oldAppUserID = str;
            this.$newAppUserID = str2;
            this.$onError = kVar;
            this.$onSuccess = oVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m173invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m173invoke() {
            Backend backend = IdentityManager.this.backend;
            String str = this.$oldAppUserID;
            String str2 = this.$newAppUserID;
            backend.logIn(str, str2, new AnonymousClass1(IdentityManager.this, this.$onSuccess, str2, str), this.$onError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$logOut$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class AnonymousClass1 extends u implements Function0 {
        final /* synthetic */ k $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(k kVar) {
            super(0);
            this.$completion = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m174invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m174invoke() {
            IdentityManager identityManager = IdentityManager.this;
            identityManager.resetAndSaveUserID(identityManager.generateRandomID());
            LogWrapperKt.log(LogIntent.USER, IdentityStrings.LOG_OUT_SUCCESSFUL);
            this.$completion.invoke(null);
        }
    }

    public IdentityManager(DeviceCache deviceCache, SubscriberAttributesCache subscriberAttributesCache, SubscriberAttributesManager subscriberAttributesManager, OfferingsCache offeringsCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager) {
        t.g(deviceCache, "deviceCache");
        t.g(subscriberAttributesCache, "subscriberAttributesCache");
        t.g(subscriberAttributesManager, "subscriberAttributesManager");
        t.g(offeringsCache, "offeringsCache");
        t.g(backend, "backend");
        t.g(offlineEntitlementsManager, "offlineEntitlementsManager");
        this.deviceCache = deviceCache;
        this.subscriberAttributesCache = subscriberAttributesCache;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.offeringsCache = offeringsCache;
        this.backend = backend;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.anonymousIdRegex = new j("^\\$RCAnonymousID:([a-f0-9]{32})$");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copySubscriberAttributesToNewUserIfOldIsAnonymous(String str, String str2) {
        if (isUserIDAnonymous(str)) {
            this.subscriberAttributesManager.copyUnsyncedSubscriberAttributes(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String generateRandomID() {
        StringBuilder sb = new StringBuilder();
        sb.append("$RCAnonymousID:");
        String string = UUID.randomUUID().toString();
        t.f(string, "randomUUID().toString()");
        Locale ROOT = Locale.ROOT;
        t.f(ROOT, "ROOT");
        String lowerCase = string.toLowerCase(ROOT);
        t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String strD = v.D(lowerCase, "-", "", false, 4, null);
        LogWrapperKt.log(LogIntent.USER, IdentityStrings.SETTING_NEW_ANON_ID);
        sb.append(strD);
        return sb.toString();
    }

    private final void invalidateCustomerInfoAndETagCacheIfNeeded(String str) {
        if (shouldInvalidateCustomerInfoAndETagCache(this.deviceCache.getCachedCustomerInfo(str))) {
            LogUtilsKt.infoLog(IdentityStrings.INVALIDATING_CACHED_CUSTOMER_INFO);
            this.deviceCache.clearCustomerInfoCache(str);
            this.backend.clearCaches();
        }
    }

    private final boolean isUserIDAnonymous(String str) {
        return this.anonymousIdRegex.d(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void resetAndSaveUserID(String str) {
        this.deviceCache.clearCachesForAppUserID(getCurrentAppUserID());
        this.offeringsCache.clearCache();
        this.subscriberAttributesCache.clearSubscriberAttributesIfSyncedForSubscriber(getCurrentAppUserID());
        this.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
        this.deviceCache.cacheAppUserID(str);
        this.backend.clearCaches();
    }

    private final boolean shouldInvalidateCustomerInfoAndETagCache(CustomerInfo customerInfo) {
        return (customerInfo == null || customerInfo.getEntitlements().getVerification() != VerificationResult.NOT_REQUESTED || t.c(this.backend.getVerificationMode(), SignatureVerificationMode.Disabled.INSTANCE)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0021 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:5:0x0004, B:7:0x000a, B:11:0x0016, B:22:0x0035, B:17:0x0021, B:19:0x0029, B:21:0x0031), top: B:27:0x0004 }] */
    public final synchronized void configure(String str) {
        if (str != null) {
            try {
                if (w.b0(str)) {
                    LogWrapperKt.log(LogIntent.WARNING, IdentityStrings.EMPTY_APP_USER_ID_WILL_BECOME_ANONYMOUS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (str == null) {
            str = this.deviceCache.getCachedAppUserID();
            if (str == null && (str = this.deviceCache.getLegacyCachedAppUserID()) == null) {
                str = generateRandomID();
            }
        } else {
            if (w.b0(str)) {
                str = null;
            }
            if (str == null) {
                str = this.deviceCache.getCachedAppUserID();
                if (str == null) {
                    str = generateRandomID();
                }
            }
        }
        LogIntent logIntent = LogIntent.USER;
        String str2 = String.format(IdentityStrings.IDENTIFYING_APP_USER_ID, Arrays.copyOf(new Object[]{str}, 1));
        t.f(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.deviceCache.cacheAppUserID(str);
        this.subscriberAttributesCache.cleanUpSubscriberAttributeCache(str);
        this.deviceCache.cleanupOldAttributionData();
        invalidateCustomerInfoAndETagCacheIfNeeded(str);
    }

    public final synchronized boolean currentUserIsAnonymous() {
        String cachedAppUserID;
        try {
            cachedAppUserID = this.deviceCache.getCachedAppUserID();
            if (cachedAppUserID == null) {
                cachedAppUserID = "";
            }
        } catch (Throwable th) {
            throw th;
        }
        return isUserIDAnonymous(cachedAppUserID) || t.c(this.deviceCache.getCachedAppUserID(), this.deviceCache.getLegacyCachedAppUserID());
    }

    public final String getCurrentAppUserID() {
        String cachedAppUserID = this.deviceCache.getCachedAppUserID();
        return cachedAppUserID == null ? "" : cachedAppUserID;
    }

    public final synchronized void logOut(k completion) {
        t.g(completion, "completion");
        if (!currentUserIsAnonymous()) {
            this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(getCurrentAppUserID(), new AnonymousClass1(completion));
        } else {
            LogWrapperKt.log(LogIntent.RC_ERROR, IdentityStrings.LOG_OUT_CALLED_ON_ANONYMOUS_USER);
            completion.invoke(new PurchasesError(PurchasesErrorCode.LogOutWithAnonymousUserError, null, 2, null));
        }
    }

    public final void switchUser(String newAppUserID) {
        t.g(newAppUserID, "newAppUserID");
        String str = String.format(IdentityStrings.SWITCHING_USER, Arrays.copyOf(new Object[]{newAppUserID}, 1));
        t.f(str, "format(this, *args)");
        LogUtilsKt.debugLog(str);
        resetAndSaveUserID(newAppUserID);
    }

    public final void logIn(String newAppUserID, o onSuccess, k kVar) {
        t.g(newAppUserID, "newAppUserID");
        t.g(onSuccess, "onSuccess");
        t.g(kVar, RaiWHuj.GoULzw);
        if (w.b0(newAppUserID)) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.InvalidAppUserIdError, IdentityStrings.LOG_IN_ERROR_MISSING_APP_USER_ID);
            LogUtilsKt.errorLog(purchasesError);
            kVar.invoke(purchasesError);
        } else {
            LogIntent logIntent = LogIntent.USER;
            String str = String.format(IdentityStrings.LOGGING_IN, Arrays.copyOf(new Object[]{getCurrentAppUserID(), newAppUserID}, 2));
            t.f(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(newAppUserID, new AnonymousClass2(getCurrentAppUserID(), newAppUserID, kVar, onSuccess));
        }
    }
}
