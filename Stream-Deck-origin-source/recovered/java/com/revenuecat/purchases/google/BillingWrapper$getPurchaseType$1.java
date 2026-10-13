package com.revenuecat.purchases.google;

import C6.G;
import Q6.k;
import com.revenuecat.purchases.ProductType;
import kotlin.jvm.internal.u;
import p043e6.dT.GIGvBf;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class BillingWrapper$getPurchaseType$1 extends u implements k {
    final /* synthetic */ k $listener;
    final /* synthetic */ String $purchaseToken;
    final /* synthetic */ BillingWrapper this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$getPurchaseType$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class AnonymousClass1 extends u implements k {
        final /* synthetic */ k $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(k kVar) {
            super(1);
            this.$listener = kVar;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return G.f1419a;
        }

        public final void invoke(boolean z8) {
            if (z8) {
                this.$listener.invoke(ProductType.INAPP);
            } else {
                this.$listener.invoke(ProductType.UNKNOWN);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$getPurchaseType$1(k kVar, BillingWrapper billingWrapper, String str) {
        super(1);
        this.$listener = kVar;
        this.this$0 = billingWrapper;
        this.$purchaseToken = str;
    }

    @Override // Q6.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return G.f1419a;
    }

    public final void invoke(boolean z8) {
        if (z8) {
            this.$listener.invoke(ProductType.SUBS);
            return;
        }
        BillingWrapper billingWrapper = this.this$0;
        String str = this.$purchaseToken;
        k kVar = this.$listener;
        billingWrapper.queryPurchaseType(GIGvBf.IcGvw, str, kVar, new AnonymousClass1(kVar));
    }
}
