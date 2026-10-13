package com.revenuecat.purchases;

import C6.G;
import Q6.k;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$2 extends u implements k {
    final /* synthetic */ k $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$2(k kVar) {
        super(1);
        this.$onError = kVar;
    }

    @Override // Q6.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return G.f1419a;
    }

    public final void invoke(PurchasesError error) {
        t.g(error, "error");
        LogWrapperKt.log(LogIntent.GOOGLE_ERROR, error.toString());
        k kVar = this.$onError;
        if (kVar != null) {
            kVar.invoke(error);
        }
    }
}
