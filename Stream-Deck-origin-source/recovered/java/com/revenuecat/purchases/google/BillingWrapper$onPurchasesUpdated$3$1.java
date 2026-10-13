package com.revenuecat.purchases.google;

import Q6.k;
import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.common.PurchaseExtensionsKt;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class BillingWrapper$onPurchasesUpdated$3$1 extends u implements k {
    public static final BillingWrapper$onPurchasesUpdated$3$1 INSTANCE = new BillingWrapper$onPurchasesUpdated$3$1();

    public BillingWrapper$onPurchasesUpdated$3$1() {
        super(1);
    }

    @Override // Q6.k
    public final CharSequence invoke(Purchase it) {
        t.g(it, "it");
        return PurchaseExtensionsKt.toHumanReadableDescription(it);
    }
}
