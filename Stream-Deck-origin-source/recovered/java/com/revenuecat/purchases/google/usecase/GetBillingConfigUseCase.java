package com.revenuecat.purchases.google.usecase;

import C6.G;
import Q6.k;
import Q6.o;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p138p3.C2767d;
import p138p3.C2773h;
import p138p3.InterfaceC2769e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class GetBillingConfigUseCase extends BillingClientUseCase<C2767d> {
    private final DeviceCache deviceCache;
    private final k onError;
    private final k onReceive;
    private final k withConnectedClient;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.GetBillingConfigUseCase$executeAsync$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class AnonymousClass1 extends u implements k {
        public AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(AtomicBoolean hasResponded, GetBillingConfigUseCase this$0, com.android.billingclient.api.d result, C2767d c2767d) {
            t.g(hasResponded, "$hasResponded");
            t.g(this$0, "this$0");
            t.g(result, "result");
            if (!hasResponded.getAndSet(true)) {
                BillingClientUseCase.processResult$default(this$0, result, c2767d, null, null, 12, null);
                return;
            }
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            String str = String.format(OfferingStrings.EXTRA_GET_BILLING_CONFIG_RESPONSE, Arrays.copyOf(new Object[]{Integer.valueOf(result.b())}, 1));
            t.f(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.android.billingclient.api.a) obj);
            return G.f1419a;
        }

        public final void invoke(com.android.billingclient.api.a invoke) {
            t.g(invoke, "$this$invoke");
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C2773h c2773hA = C2773h.a().a();
            final GetBillingConfigUseCase getBillingConfigUseCase = GetBillingConfigUseCase.this;
            invoke.d(c2773hA, new InterfaceC2769e() { // from class: com.revenuecat.purchases.google.usecase.c
                @Override // p138p3.InterfaceC2769e
                public final void a(com.android.billingclient.api.d dVar, C2767d c2767d) {
                    GetBillingConfigUseCase.AnonymousClass1.invoke$lambda$0(atomicBoolean, getBillingConfigUseCase, dVar, c2767d);
                }
            });
        }
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        this.withConnectedClient.invoke(new AnonymousClass1());
    }

    public final DeviceCache getDeviceCache() {
        return this.deviceCache;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error getting billing config";
    }

    public final k getOnError() {
        return this.onError;
    }

    public final k getOnReceive() {
        return this.onReceive;
    }

    public final k getWithConnectedClient() {
        return this.withConnectedClient;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBillingConfigUseCase(GetBillingConfigUseCaseParams useCaseParams, DeviceCache deviceCache, k onReceive, k onError, k kVar, o executeRequestOnUIThread) {
        super(useCaseParams, onError, executeRequestOnUIThread);
        t.g(useCaseParams, "useCaseParams");
        t.g(deviceCache, "deviceCache");
        t.g(onReceive, "onReceive");
        t.g(onError, "onError");
        t.g(kVar, ajyWhveMDgQ.pXQdbQksRW);
        t.g(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.deviceCache = deviceCache;
        this.onReceive = onReceive;
        this.onError = onError;
        this.withConnectedClient = kVar;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void onOk(C2767d c2767d) {
        if (c2767d == null) {
            this.onError.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, BillingStrings.BILLING_CONFIG_NULL_ON_SUCCESS));
            return;
        }
        DeviceCache deviceCache = this.deviceCache;
        String strA = c2767d.a();
        t.f(strA, "received.countryCode");
        deviceCache.setStorefront(strA);
        this.onReceive.invoke(c2767d);
    }
}
