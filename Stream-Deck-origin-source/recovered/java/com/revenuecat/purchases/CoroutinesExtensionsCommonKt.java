package com.revenuecat.purchases;

import G6.i;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class CoroutinesExtensionsCommonKt {
    public static final /* synthetic */ Object awaitGetProducts(Purchases purchases, List list, ProductType productType, G6.d dVar) throws Throwable {
        i iVar = new i(H6.b.c(dVar));
        ListenerConversionsCommonKt.getProductsWith(purchases, list, productType, new CoroutinesExtensionsCommonKt$awaitGetProducts$2$2(iVar), new CoroutinesExtensionsCommonKt$awaitGetProducts$2$1(iVar));
        Object objA = iVar.a();
        if (objA == H6.c.f()) {
            I6.h.c(dVar);
        }
        return objA;
    }

    public static /* synthetic */ Object awaitGetProducts$default(Purchases purchases, List list, ProductType productType, G6.d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            productType = null;
        }
        return awaitGetProducts(purchases, list, productType, dVar);
    }

    public static final /* synthetic */ Object awaitOfferings(Purchases purchases, G6.d dVar) throws Throwable {
        i iVar = new i(H6.b.c(dVar));
        ListenerConversionsCommonKt.getOfferingsWith(purchases, new CoroutinesExtensionsCommonKt$awaitOfferings$2$2(iVar), new CoroutinesExtensionsCommonKt$awaitOfferings$2$1(iVar));
        Object objA = iVar.a();
        if (objA == H6.c.f()) {
            I6.h.c(dVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitPurchase(Purchases purchases, PurchaseParams purchaseParams, G6.d dVar) throws Throwable {
        i iVar = new i(H6.b.c(dVar));
        purchases.purchase(purchaseParams, ListenerConversionsCommonKt.purchaseCompletedCallback(new CoroutinesExtensionsCommonKt$awaitPurchase$2$1(iVar), new CoroutinesExtensionsCommonKt$awaitPurchase$2$2(iVar)));
        Object objA = iVar.a();
        if (objA == H6.c.f()) {
            I6.h.c(dVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitRestore(Purchases purchases, G6.d dVar) throws Throwable {
        i iVar = new i(H6.b.c(dVar));
        ListenerConversionsCommonKt.restorePurchasesWith(purchases, new CoroutinesExtensionsCommonKt$awaitRestore$2$1(iVar), new CoroutinesExtensionsCommonKt$awaitRestore$2$2(iVar));
        Object objA = iVar.a();
        if (objA == H6.c.f()) {
            I6.h.c(dVar);
        }
        return objA;
    }
}
