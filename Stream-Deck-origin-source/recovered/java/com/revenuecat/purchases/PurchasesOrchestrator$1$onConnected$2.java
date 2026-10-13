package com.revenuecat.purchases;

import C6.G;
import Q6.k;
import com.revenuecat.purchases.common.LogUtilsKt;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class PurchasesOrchestrator$1$onConnected$2 extends u implements k {
    public static final PurchasesOrchestrator$1$onConnected$2 INSTANCE = new PurchasesOrchestrator$1$onConnected$2();

    public PurchasesOrchestrator$1$onConnected$2() {
        super(1);
    }

    @Override // Q6.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return G.f1419a;
    }

    public final void invoke(PurchasesError error) {
        t.g(error, "error");
        LogUtilsKt.errorLog(error);
    }
}
