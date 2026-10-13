package com.revenuecat.purchases;

import G6.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class CoroutinesExtensionsKt {
    public static final /* synthetic */ Object awaitCustomerInfo(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, G6.d dVar) throws Throwable {
        i iVar = new i(H6.b.c(dVar));
        ListenerConversionsKt.getCustomerInfoWith(purchases, cacheFetchPolicy, new CoroutinesExtensionsKt$awaitCustomerInfo$2$2(iVar), new CoroutinesExtensionsKt$awaitCustomerInfo$2$1(iVar));
        Object objA = iVar.a();
        if (objA == H6.c.f()) {
            I6.h.c(dVar);
        }
        return objA;
    }

    public static /* synthetic */ Object awaitCustomerInfo$default(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, G6.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cacheFetchPolicy = CacheFetchPolicy.Companion.m124default();
        }
        return awaitCustomerInfo(purchases, cacheFetchPolicy, dVar);
    }

    public static final /* synthetic */ Object awaitLogIn(Purchases purchases, String str, G6.d dVar) throws Throwable {
        i iVar = new i(H6.b.c(dVar));
        ListenerConversionsKt.logInWith(purchases, str, new CoroutinesExtensionsKt$awaitLogIn$2$1(iVar), new CoroutinesExtensionsKt$awaitLogIn$2$2(iVar));
        Object objA = iVar.a();
        if (objA == H6.c.f()) {
            I6.h.c(dVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitLogOut(Purchases purchases, G6.d dVar) throws Throwable {
        i iVar = new i(H6.b.c(dVar));
        ListenerConversionsKt.logOutWith(purchases, new CoroutinesExtensionsKt$awaitLogOut$2$1(iVar), new CoroutinesExtensionsKt$awaitLogOut$2$2(iVar));
        Object objA = iVar.a();
        if (objA == H6.c.f()) {
            I6.h.c(dVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitSyncAttributesAndOfferingsIfNeeded(Purchases purchases, G6.d dVar) throws Throwable {
        i iVar = new i(H6.b.c(dVar));
        ListenerConversionsKt.syncAttributesAndOfferingsIfNeededWith(purchases, new CoroutinesExtensionsKt$awaitSyncAttributesAndOfferingsIfNeeded$2$2(iVar), new CoroutinesExtensionsKt$awaitSyncAttributesAndOfferingsIfNeeded$2$1(iVar));
        Object objA = iVar.a();
        if (objA == H6.c.f()) {
            I6.h.c(dVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitSyncPurchases(Purchases purchases, G6.d dVar) throws Throwable {
        i iVar = new i(H6.b.c(dVar));
        ListenerConversionsKt.syncPurchasesWith(purchases, new CoroutinesExtensionsKt$awaitSyncPurchases$2$2(iVar), new CoroutinesExtensionsKt$awaitSyncPurchases$2$1(iVar));
        Object objA = iVar.a();
        if (objA == H6.c.f()) {
            I6.h.c(dVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object getAmazonLWAConsentStatus(Purchases purchases, G6.d dVar) throws Throwable {
        i iVar = new i(H6.b.c(dVar));
        ListenerConversionsKt.getAmazonLWAConsentStatusWith(purchases, new CoroutinesExtensionsKt$getAmazonLWAConsentStatus$2$2(iVar), new CoroutinesExtensionsKt$getAmazonLWAConsentStatus$2$1(iVar));
        Object objA = iVar.a();
        if (objA == H6.c.f()) {
            I6.h.c(dVar);
        }
        return objA;
    }
}
