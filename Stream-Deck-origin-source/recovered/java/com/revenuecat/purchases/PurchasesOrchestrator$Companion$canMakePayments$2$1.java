package com.revenuecat.purchases;

import android.os.Handler;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.google.BillingResultExtensionsKt;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.models.BillingFeature;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;
import p138p3.InterfaceC2765c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class PurchasesOrchestrator$Companion$canMakePayments$2$1 implements InterfaceC2765c {
    final /* synthetic */ com.android.billingclient.api.a $billingClient;
    final /* synthetic */ Callback<Boolean> $callback;
    final /* synthetic */ List<BillingFeature> $features;
    final /* synthetic */ AtomicBoolean $hasResponded;
    final /* synthetic */ Handler $mainHandler;

    /* JADX WARN: Multi-variable type inference failed */
    public PurchasesOrchestrator$Companion$canMakePayments$2$1(Handler handler, AtomicBoolean atomicBoolean, Callback<Boolean> callback, com.android.billingclient.api.a aVar, List<? extends BillingFeature> list) {
        this.$mainHandler = handler;
        this.$hasResponded = atomicBoolean;
        this.$callback = callback;
        this.$billingClient = aVar;
        this.$features = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBillingServiceDisconnected$lambda$2(com.android.billingclient.api.a billingClient, AtomicBoolean hasResponded, Callback callback) {
        t.g(billingClient, "$billingClient");
        t.g(hasResponded, "$hasResponded");
        t.g(callback, "$callback");
        try {
            billingClient.c();
        } catch (IllegalArgumentException e8) {
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            String str = String.format(PurchaseStrings.EXCEPTION_CANMAKEPAYMENTS, Arrays.copyOf(new Object[]{e8.getLocalizedMessage()}, 1));
            t.f(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        } finally {
            if (hasResponded.getAndSet(true)) {
                LogWrapperKt.log(LogIntent.GOOGLE_ERROR, PurchaseStrings.EXTRA_CALLBACK_CANMAKEPAYMENTS);
            } else {
                callback.onReceived(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBillingSetupFinished$lambda$1(AtomicBoolean hasResponded, com.android.billingclient.api.d billingResult, Callback callback, com.android.billingclient.api.a billingClient, List features) {
        boolean z8;
        t.g(hasResponded, "$hasResponded");
        t.g(billingResult, "$billingResult");
        t.g(callback, "$callback");
        t.g(billingClient, "$billingClient");
        t.g(features, "$features");
        if (hasResponded.getAndSet(true)) {
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            String str = String.format(PurchaseStrings.EXTRA_CONNECTION_CANMAKEPAYMENTS, Arrays.copyOf(new Object[]{Integer.valueOf(billingResult.b())}, 1));
            t.f(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            return;
        }
        try {
            if (!BillingResultExtensionsKt.isSuccessful(billingResult)) {
                callback.onReceived(Boolean.FALSE);
                billingClient.c();
                return;
            }
            if (features == null || !features.isEmpty()) {
                Iterator it = features.iterator();
                while (it.hasNext()) {
                    com.android.billingclient.api.d dVarE = billingClient.e(((BillingFeature) it.next()).getPlayBillingClientName());
                    t.f(dVarE, "billingClient.isFeatureS…it.playBillingClientName)");
                    if (!BillingResultExtensionsKt.isSuccessful(dVarE)) {
                        z8 = false;
                    }
                }
                z8 = true;
            } else {
                z8 = true;
            }
            billingClient.c();
            callback.onReceived(Boolean.valueOf(z8));
        } catch (IllegalArgumentException e8) {
            LogIntent logIntent2 = LogIntent.GOOGLE_ERROR;
            String str2 = String.format(PurchaseStrings.EXCEPTION_CANMAKEPAYMENTS, Arrays.copyOf(new Object[]{e8.getLocalizedMessage()}, 1));
            t.f(str2, "format(this, *args)");
            LogWrapperKt.log(logIntent2, str2);
            callback.onReceived(Boolean.FALSE);
        }
    }

    @Override // p138p3.InterfaceC2765c
    public void onBillingServiceDisconnected() {
        Handler handler = this.$mainHandler;
        final com.android.billingclient.api.a aVar = this.$billingClient;
        final AtomicBoolean atomicBoolean = this.$hasResponded;
        final Callback<Boolean> callback = this.$callback;
        handler.post(new Runnable() { // from class: com.revenuecat.purchases.g
            @Override // java.lang.Runnable
            public final void run() {
                PurchasesOrchestrator$Companion$canMakePayments$2$1.onBillingServiceDisconnected$lambda$2(aVar, atomicBoolean, callback);
            }
        });
    }

    @Override // p138p3.InterfaceC2765c
    public void onBillingSetupFinished(final com.android.billingclient.api.d billingResult) {
        t.g(billingResult, "billingResult");
        Handler handler = this.$mainHandler;
        final AtomicBoolean atomicBoolean = this.$hasResponded;
        final Callback<Boolean> callback = this.$callback;
        final com.android.billingclient.api.a aVar = this.$billingClient;
        final List<BillingFeature> list = this.$features;
        handler.post(new Runnable() { // from class: com.revenuecat.purchases.h
            @Override // java.lang.Runnable
            public final void run() {
                PurchasesOrchestrator$Companion$canMakePayments$2$1.onBillingSetupFinished$lambda$1(atomicBoolean, billingResult, callback, aVar, list);
            }
        });
    }
}
