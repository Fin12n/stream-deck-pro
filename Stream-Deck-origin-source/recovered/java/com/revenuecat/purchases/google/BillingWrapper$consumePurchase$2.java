package com.revenuecat.purchases.google;

import C6.G;
import Q6.k;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class BillingWrapper$consumePurchase$2 extends C2639q implements k {
    public BillingWrapper$consumePurchase$2(Object obj) {
        super(1, obj, BillingWrapper.class, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V", 0);
    }

    @Override // Q6.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((k) obj);
        return G.f1419a;
    }

    public final void invoke(k p8) {
        t.g(p8, "p0");
        ((BillingWrapper) this.receiver).withConnectedClient(p8);
    }
}
