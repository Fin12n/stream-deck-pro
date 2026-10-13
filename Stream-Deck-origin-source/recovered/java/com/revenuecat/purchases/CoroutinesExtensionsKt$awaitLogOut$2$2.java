package com.revenuecat.purchases;

import C6.G;
import C6.q;
import Q6.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class CoroutinesExtensionsKt$awaitLogOut$2$2 extends u implements k {
    final /* synthetic */ G6.d<CustomerInfo> $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutinesExtensionsKt$awaitLogOut$2$2(G6.d<? super CustomerInfo> dVar) {
        super(1);
        this.$continuation = dVar;
    }

    @Override // Q6.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CustomerInfo) obj);
        return G.f1419a;
    }

    public final void invoke(CustomerInfo it) {
        t.g(it, "it");
        this.$continuation.resumeWith(q.b(it));
    }
}
