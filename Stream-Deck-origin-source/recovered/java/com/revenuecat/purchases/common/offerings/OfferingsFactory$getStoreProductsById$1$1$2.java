package com.revenuecat.purchases.common.offerings;

import C6.G;
import Q6.k;
import com.revenuecat.purchases.PurchasesError;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class OfferingsFactory$getStoreProductsById$1$1$2 extends u implements k {
    final /* synthetic */ k $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsFactory$getStoreProductsById$1$1$2(k kVar) {
        super(1);
        this.$onError = kVar;
    }

    @Override // Q6.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return G.f1419a;
    }

    public final void invoke(PurchasesError it) {
        t.g(it, "it");
        this.$onError.invoke(it);
    }
}
