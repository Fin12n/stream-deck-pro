package com.revenuecat.purchases;

import C6.G;
import C6.q;
import C6.r;
import Q6.o;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class CoroutinesExtensionsCommonKt$awaitPurchase$2$2 extends u implements o {
    final /* synthetic */ G6.d<PurchaseResult> $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutinesExtensionsCommonKt$awaitPurchase$2$2(G6.d<? super PurchaseResult> dVar) {
        super(2);
        this.$continuation = dVar;
    }

    @Override // Q6.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
        return G.f1419a;
    }

    public final void invoke(PurchasesError purchasesError, boolean z8) {
        t.g(purchasesError, "purchasesError");
        G6.d<PurchaseResult> dVar = this.$continuation;
        q.a aVar = q.f1441b;
        dVar.resumeWith(q.b(r.a(new PurchasesTransactionException(purchasesError, z8))));
    }
}
