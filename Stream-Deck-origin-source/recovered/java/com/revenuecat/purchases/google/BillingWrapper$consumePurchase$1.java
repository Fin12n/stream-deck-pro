package com.revenuecat.purchases.google;

import C6.G;
import Q6.k;
import com.revenuecat.purchases.PurchasesError;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class BillingWrapper$consumePurchase$1 extends u implements k {
    public static final BillingWrapper$consumePurchase$1 INSTANCE = new BillingWrapper$consumePurchase$1();

    public BillingWrapper$consumePurchase$1() {
        super(1);
    }

    public final void invoke(PurchasesError purchasesError) {
        t.g(purchasesError, "<anonymous parameter 0>");
    }

    @Override // Q6.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return G.f1419a;
    }
}
