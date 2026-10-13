package com.revenuecat.purchases.google;

import C6.G;
import Q6.k;
import Q6.o;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class BillingWrapper$findPurchaseInPurchaseHistory$1$3 extends C2639q implements o {
    public BillingWrapper$findPurchaseInPurchaseHistory$1$3(Object obj) {
        super(2, obj, BillingWrapper.class, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", 0);
    }

    @Override // Q6.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Long) obj, (k) obj2);
        return G.f1419a;
    }

    public final void invoke(Long l8, k p8) {
        t.g(p8, "p1");
        ((BillingWrapper) this.receiver).executeRequestOnUIThread(l8, p8);
    }
}
