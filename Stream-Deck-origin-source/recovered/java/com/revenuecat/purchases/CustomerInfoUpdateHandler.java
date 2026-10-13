package com.revenuecat.purchases;

import C6.G;
import C6.o;
import C6.v;
import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.strings.ConfigureStrings;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class CustomerInfoUpdateHandler {
    private final AppConfig appConfig;
    private final DeviceCache deviceCache;
    private final DiagnosticsTracker diagnosticsTracker;
    private final Handler handler;
    private final IdentityManager identityManager;
    private CustomerInfo lastSentCustomerInfo;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private UpdatedCustomerInfoListener updatedCustomerInfoListener;

    public CustomerInfoUpdateHandler(DeviceCache deviceCache, IdentityManager identityManager, OfflineEntitlementsManager offlineEntitlementsManager, AppConfig appConfig, DiagnosticsTracker diagnosticsTracker, Handler handler) {
        t.g(deviceCache, "deviceCache");
        t.g(identityManager, "identityManager");
        t.g(offlineEntitlementsManager, "offlineEntitlementsManager");
        t.g(appConfig, "appConfig");
        t.g(handler, "handler");
        this.deviceCache = deviceCache;
        this.identityManager = identityManager;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.appConfig = appConfig;
        this.diagnosticsTracker = diagnosticsTracker;
        this.handler = handler;
    }

    private final void afterSetListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        CustomerInfo cachedCustomerInfo;
        if (updatedCustomerInfoListener != null) {
            LogWrapperKt.log(LogIntent.DEBUG, ConfigureStrings.LISTENER_SET);
            if (this.appConfig.getCustomEntitlementComputation() || (cachedCustomerInfo = getCachedCustomerInfo(this.identityManager.getCurrentAppUserID())) == null) {
                return;
            }
            notifyListeners(cachedCustomerInfo);
        }
    }

    private final void dispatch(final Function0 function0) {
        if (t.c(Thread.currentThread(), this.handler.getLooper().getThread())) {
            function0.invoke();
        } else {
            this.handler.post(new Runnable() { // from class: com.revenuecat.purchases.b
                @Override // java.lang.Runnable
                public final void run() {
                    CustomerInfoUpdateHandler.dispatch$lambda$5(function0);
                }
            });
        }
    }

    private final CustomerInfo getCachedCustomerInfo(String str) {
        CustomerInfo offlineCustomerInfo = this.offlineEntitlementsManager.getOfflineCustomerInfo();
        return offlineCustomerInfo == null ? this.deviceCache.getCachedCustomerInfo(str) : offlineCustomerInfo;
    }

    public final void cacheAndNotifyListeners(CustomerInfo customerInfo) {
        t.g(customerInfo, "customerInfo");
        this.deviceCache.cacheCustomerInfo(this.identityManager.getCurrentAppUserID(), customerInfo);
        notifyListeners(customerInfo);
    }

    public final synchronized UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.updatedCustomerInfoListener;
    }

    public final void notifyListeners(CustomerInfo customerInfo) {
        o oVarA;
        DiagnosticsTracker diagnosticsTracker;
        t.g(customerInfo, "customerInfo");
        synchronized (this) {
            oVarA = v.a(this.updatedCustomerInfoListener, this.lastSentCustomerInfo);
        }
        UpdatedCustomerInfoListener updatedCustomerInfoListener = (UpdatedCustomerInfoListener) oVarA.a();
        CustomerInfo customerInfo2 = (CustomerInfo) oVarA.b();
        if (!t.c(customerInfo2, customerInfo) && (diagnosticsTracker = this.diagnosticsTracker) != null) {
            diagnosticsTracker.trackCustomerInfoVerificationResultIfNeeded(customerInfo);
        }
        if (updatedCustomerInfoListener == null || t.c(customerInfo2, customerInfo)) {
            return;
        }
        if (customerInfo2 != null) {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.CUSTOMERINFO_UPDATED_NOTIFYING_LISTENER);
        } else {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.SENDING_LATEST_CUSTOMERINFO_TO_LISTENER);
        }
        synchronized (this) {
            this.lastSentCustomerInfo = customerInfo;
            G g8 = G.f1419a;
        }
        dispatch(new CustomerInfoUpdateHandler$notifyListeners$2$2(updatedCustomerInfoListener, customerInfo));
    }

    public final void setUpdatedCustomerInfoListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        synchronized (this) {
            this.updatedCustomerInfoListener = updatedCustomerInfoListener;
            G g8 = G.f1419a;
        }
        afterSetListener(updatedCustomerInfoListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatch$lambda$5(Function0 function0) {
        t.g(function0, jULK.gxXW);
        function0.invoke();
    }

    public /* synthetic */ CustomerInfoUpdateHandler(DeviceCache deviceCache, IdentityManager identityManager, OfflineEntitlementsManager offlineEntitlementsManager, AppConfig appConfig, DiagnosticsTracker diagnosticsTracker, Handler handler, int i8, AbstractC2633k abstractC2633k) {
        this(deviceCache, identityManager, offlineEntitlementsManager, appConfig, diagnosticsTracker, (i8 & 32) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}
