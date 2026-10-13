package com.revenuecat.purchases;

import C6.G;
import C6.q;
import C6.r;
import Q6.k;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class CoroutinesExtensionsCommonKt$awaitGetProducts$2$2 extends u implements k {
    final /* synthetic */ G6.d<List<? extends StoreProduct>> $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutinesExtensionsCommonKt$awaitGetProducts$2$2(G6.d<? super List<? extends StoreProduct>> dVar) {
        super(1);
        this.$continuation = dVar;
    }

    @Override // Q6.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return G.f1419a;
    }

    public final void invoke(PurchasesError purchasesError) {
        t.g(purchasesError, jULK.jREVRHrimnF);
        G6.d<List<? extends StoreProduct>> dVar = this.$continuation;
        q.a aVar = q.f1441b;
        dVar.resumeWith(q.b(r.a(new PurchasesException(purchasesError))));
    }
}
