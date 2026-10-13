package com.revenuecat.purchases.common.offerings;

import C6.G;
import D6.T;
import Q6.k;
import Q6.o;
import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.utils.OfferingImagePreDownloader;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class OfferingsManager {
    private final Backend backend;
    private final Handler mainHandler;
    private final OfferingImagePreDownloader offeringImagePreDownloader;
    private final OfferingsCache offeringsCache;
    private final OfferingsFactory offeringsFactory;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class AnonymousClass1 extends u implements k {
        final /* synthetic */ k $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(k kVar) {
            super(1);
            this.$onError = kVar;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G.f1419a;
        }

        public final void invoke(PurchasesError error) {
            t.g(error, "error");
            OfferingsManager.this.handleErrorFetchingOfferings(error, this.$onError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class AnonymousClass2 extends u implements k {
        final /* synthetic */ JSONObject $offeringsJSON;
        final /* synthetic */ k $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C04452 extends u implements Function0 {
            final /* synthetic */ Offerings $offerings;
            final /* synthetic */ k $onSuccess;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04452(k kVar, Offerings offerings) {
                super(0);
                this.$onSuccess = kVar;
                this.$offerings = offerings;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m169invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m169invoke() {
                k kVar = this.$onSuccess;
                if (kVar != null) {
                    kVar.invoke(this.$offerings);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(JSONObject jSONObject, k kVar) {
            super(1);
            this.$offeringsJSON = jSONObject;
            this.$onSuccess = kVar;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Offerings) obj);
            return G.f1419a;
        }

        public final void invoke(Offerings offerings) {
            t.g(offerings, "offerings");
            Offering current = offerings.getCurrent();
            if (current != null) {
                OfferingsManager.this.offeringImagePreDownloader.preDownloadOfferingImages(current);
            }
            OfferingsManager.this.offeringsCache.cacheOfferings(offerings, this.$offeringsJSON);
            OfferingsManager.this.dispatch(new C04452(this.$onSuccess, offerings));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchAndCacheOfferings$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C21701 extends u implements k {
        final /* synthetic */ k $onError;
        final /* synthetic */ k $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21701(k kVar, k kVar2) {
            super(1);
            this.$onError = kVar;
            this.$onSuccess = kVar2;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return G.f1419a;
        }

        public final void invoke(JSONObject it) {
            t.g(it, "it");
            OfferingsManager.this.createAndCacheOfferings(it, this.$onError, this.$onSuccess);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchAndCacheOfferings$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C21712 extends u implements o {
        final /* synthetic */ k $onError;
        final /* synthetic */ k $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21712(k kVar, k kVar2) {
            super(2);
            this.$onError = kVar;
            this.$onSuccess = kVar2;
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
            return G.f1419a;
        }

        public final void invoke(PurchasesError backendError, boolean z8) {
            t.g(backendError, "backendError");
            if (!z8) {
                OfferingsManager.this.handleErrorFetchingOfferings(backendError, this.$onError);
                return;
            }
            JSONObject cachedOfferingsResponse = OfferingsManager.this.offeringsCache.getCachedOfferingsResponse();
            if (cachedOfferingsResponse == null) {
                OfferingsManager.this.handleErrorFetchingOfferings(backendError, this.$onError);
            } else {
                LogUtilsKt.warnLog(OfferingStrings.ERROR_FETCHING_OFFERINGS_USING_DISK_CACHE);
                OfferingsManager.this.createAndCacheOfferings(cachedOfferingsResponse, this.$onError, this.$onSuccess);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$getOfferings$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C21721 extends u implements Function0 {
        final /* synthetic */ Offerings $cachedOfferings;
        final /* synthetic */ k $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21721(k kVar, Offerings offerings) {
            super(0);
            this.$onSuccess = kVar;
            this.$cachedOfferings = offerings;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m170invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m170invoke() {
            k kVar = this.$onSuccess;
            if (kVar != null) {
                kVar.invoke(this.$cachedOfferings);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$handleErrorFetchingOfferings$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C21731 extends u implements Function0 {
        final /* synthetic */ PurchasesError $error;
        final /* synthetic */ k $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21731(k kVar, PurchasesError purchasesError) {
            super(0);
            this.$onError = kVar;
            this.$error = purchasesError;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m171invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m171invoke() {
            k kVar = this.$onError;
            if (kVar != null) {
                kVar.invoke(this.$error);
            }
        }
    }

    public OfferingsManager(OfferingsCache offeringsCache, Backend backend, OfferingsFactory offeringsFactory, OfferingImagePreDownloader offeringImagePreDownloader, Handler handler) {
        t.g(offeringsCache, "offeringsCache");
        t.g(backend, "backend");
        t.g(offeringsFactory, "offeringsFactory");
        t.g(offeringImagePreDownloader, "offeringImagePreDownloader");
        this.offeringsCache = offeringsCache;
        this.backend = backend;
        this.offeringsFactory = offeringsFactory;
        this.offeringImagePreDownloader = offeringImagePreDownloader;
        this.mainHandler = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createAndCacheOfferings(JSONObject jSONObject, k kVar, k kVar2) {
        this.offeringsFactory.createOfferings(jSONObject, new AnonymousClass1(kVar), new AnonymousClass2(jSONObject, kVar2));
    }

    public static /* synthetic */ void createAndCacheOfferings$default(OfferingsManager offeringsManager, JSONObject jSONObject, k kVar, k kVar2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            kVar = null;
        }
        if ((i8 & 4) != 0) {
            kVar2 = null;
        }
        offeringsManager.createAndCacheOfferings(jSONObject, kVar, kVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatch(final Function0 function0) {
        if (t.c(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            function0.invoke();
            return;
        }
        Handler handler = this.mainHandler;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new Runnable() { // from class: com.revenuecat.purchases.common.offerings.c
            @Override // java.lang.Runnable
            public final void run() {
                OfferingsManager.dispatch$lambda$0(function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatch$lambda$0(Function0 tmp0) {
        t.g(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public static /* synthetic */ void fetchAndCacheOfferings$default(OfferingsManager offeringsManager, String str, boolean z8, k kVar, k kVar2, int i8, Object obj) throws Throwable {
        if ((i8 & 4) != 0) {
            kVar = null;
        }
        if ((i8 & 8) != 0) {
            kVar2 = null;
        }
        offeringsManager.fetchAndCacheOfferings(str, z8, kVar, kVar2);
    }

    public static /* synthetic */ void getOfferings$default(OfferingsManager offeringsManager, String str, boolean z8, k kVar, k kVar2, boolean z9, int i8, Object obj) throws Throwable {
        if ((i8 & 4) != 0) {
            kVar = null;
        }
        if ((i8 & 8) != 0) {
            kVar2 = null;
        }
        if ((i8 & 16) != 0) {
            z9 = false;
        }
        offeringsManager.getOfferings(str, z8, kVar, kVar2, z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleErrorFetchingOfferings(PurchasesError purchasesError, k kVar) {
        LogIntent logIntent = T.g(PurchasesErrorCode.ConfigurationError, PurchasesErrorCode.UnexpectedBackendResponseError).contains(purchasesError.getCode()) ? LogIntent.RC_ERROR : LogIntent.GOOGLE_ERROR;
        String str = String.format(OfferingStrings.FETCHING_OFFERINGS_ERROR, Arrays.copyOf(new Object[]{purchasesError}, 1));
        t.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.offeringsCache.clearOfferingsCacheTimestamp();
        dispatch(new C21731(kVar, purchasesError));
    }

    public final void fetchAndCacheOfferings(String appUserID, boolean z8, k kVar, k kVar2) throws Throwable {
        t.g(appUserID, "appUserID");
        LogWrapperKt.log(LogIntent.RC_SUCCESS, OfferingStrings.OFFERINGS_START_UPDATE_FROM_NETWORK);
        this.backend.getOfferings(appUserID, z8, new C21701(kVar, kVar2), new C21712(kVar, kVar2));
    }

    public final void getOfferings(String appUserID, boolean z8, k kVar, k kVar2, boolean z9) throws Throwable {
        t.g(appUserID, "appUserID");
        Offerings cachedOfferings = this.offeringsCache.getCachedOfferings();
        if (cachedOfferings == null) {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.NO_CACHED_OFFERINGS_FETCHING_NETWORK);
            fetchAndCacheOfferings(appUserID, z8, kVar, kVar2);
            return;
        }
        if (z9) {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.FORCE_OFFERINGS_FETCHING_NETWORK);
            fetchAndCacheOfferings(appUserID, z8, kVar, kVar2);
            return;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        LogWrapperKt.log(logIntent, OfferingStrings.VENDING_OFFERINGS_CACHE);
        dispatch(new C21721(kVar2, cachedOfferings));
        if (this.offeringsCache.isOfferingsCacheStale(z8)) {
            LogWrapperKt.log(logIntent, z8 ? OfferingStrings.OFFERINGS_STALE_UPDATING_IN_BACKGROUND : OfferingStrings.OFFERINGS_STALE_UPDATING_IN_FOREGROUND);
            fetchAndCacheOfferings$default(this, appUserID, z8, null, null, 12, null);
        }
    }

    public final void onAppForeground(String appUserID) throws Throwable {
        t.g(appUserID, "appUserID");
        if (this.offeringsCache.isOfferingsCacheStale(false)) {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.OFFERINGS_STALE_UPDATING_IN_FOREGROUND);
            fetchAndCacheOfferings$default(this, appUserID, false, null, null, 12, null);
        }
    }

    public /* synthetic */ OfferingsManager(OfferingsCache offeringsCache, Backend backend, OfferingsFactory offeringsFactory, OfferingImagePreDownloader offeringImagePreDownloader, Handler handler, int i8, AbstractC2633k abstractC2633k) {
        this(offeringsCache, backend, offeringsFactory, offeringImagePreDownloader, (i8 & 16) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}
