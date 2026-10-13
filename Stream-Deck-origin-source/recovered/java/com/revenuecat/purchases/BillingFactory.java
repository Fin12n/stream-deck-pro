package com.revenuecat.purchases;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.revenuecat.purchases.amazon.AmazonBilling;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.BillingWrapper;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class BillingFactory {
    public static final BillingFactory INSTANCE = new BillingFactory();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.PLAY_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Store.AMAZON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BillingFactory() {
    }

    public final BillingAbstract createBilling(Store store, Application application, BackendHelper backendHelper, DeviceCache cache, boolean z8, DiagnosticsTracker diagnosticsTracker, PurchasesStateProvider stateProvider, boolean z9) {
        t.g(store, "store");
        t.g(application, "application");
        t.g(backendHelper, "backendHelper");
        t.g(cache, "cache");
        t.g(stateProvider, "stateProvider");
        int i8 = WhenMappings.$EnumSwitchMapping$0[store.ordinal()];
        if (i8 == 1) {
            return new BillingWrapper(new BillingWrapper.ClientFactory(application, z9), new Handler(application.getMainLooper()), cache, diagnosticsTracker, stateProvider, null, 32, null);
        }
        if (i8 == 2) {
            try {
                Context applicationContext = application.getApplicationContext();
                t.f(applicationContext, "application.applicationContext");
                return new AmazonBilling(applicationContext, cache, z8, new Handler(application.getMainLooper()), backendHelper, stateProvider, diagnosticsTracker);
            } catch (NoClassDefFoundError e8) {
                LogUtilsKt.errorLog("Make sure purchases-amazon is added as dependency", e8);
                throw e8;
            }
        }
        LogUtilsKt.errorLog$default("Incompatible store (" + store + ") used", null, 2, null);
        throw new IllegalArgumentException("Couldn't configure SDK. Incompatible store (" + store + ") used");
    }
}
