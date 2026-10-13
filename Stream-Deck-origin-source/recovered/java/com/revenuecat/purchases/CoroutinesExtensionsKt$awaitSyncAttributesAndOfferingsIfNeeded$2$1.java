package com.revenuecat.purchases;

import C6.G;
import C6.q;
import Q6.k;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class CoroutinesExtensionsKt$awaitSyncAttributesAndOfferingsIfNeeded$2$1 extends C2639q implements k {
    public CoroutinesExtensionsKt$awaitSyncAttributesAndOfferingsIfNeeded$2$1(Object obj) {
        super(1, obj, G6.f.class, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", 1);
    }

    @Override // Q6.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Offerings) obj);
        return G.f1419a;
    }

    public final void invoke(Offerings p8) {
        t.g(p8, "p0");
        ((G6.d) this.receiver).resumeWith(q.b(p8));
    }
}
