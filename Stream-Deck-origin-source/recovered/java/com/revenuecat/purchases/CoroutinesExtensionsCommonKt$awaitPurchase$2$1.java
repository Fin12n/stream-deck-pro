package com.revenuecat.purchases;

import C6.G;
import C6.q;
import Q6.o;
import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class CoroutinesExtensionsCommonKt$awaitPurchase$2$1 extends u implements o {
    final /* synthetic */ G6.d<PurchaseResult> $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutinesExtensionsCommonKt$awaitPurchase$2$1(G6.d<? super PurchaseResult> dVar) {
        super(2);
        this.$continuation = dVar;
    }

    @Override // Q6.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((StoreTransaction) obj, (CustomerInfo) obj2);
        return G.f1419a;
    }

    public final void invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        t.g(storeTransaction, "storeTransaction");
        t.g(customerInfo, "customerInfo");
        G6.d<PurchaseResult> dVar = this.$continuation;
        q.a aVar = q.f1441b;
        dVar.resumeWith(q.b(new PurchaseResult(storeTransaction, customerInfo)));
    }
}
