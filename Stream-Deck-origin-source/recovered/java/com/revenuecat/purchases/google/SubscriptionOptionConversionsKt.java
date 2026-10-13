package com.revenuecat.purchases.google;

import D6.C0938s;
import D6.z;
import com.revenuecat.purchases.models.GoogleInstallmentsInfo;
import com.revenuecat.purchases.models.GoogleSubscriptionOption;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class SubscriptionOptionConversionsKt {
    private static final GoogleInstallmentsInfo getInstallmentsInfo(com.android.billingclient.api.f.a aVar) {
        return new GoogleInstallmentsInfo(aVar.a(), aVar.b());
    }

    public static final String getSubscriptionBillingPeriod(com.android.billingclient.api.f.e eVar) {
        t.g(eVar, "<this>");
        List listA = eVar.f().a();
        t.f(listA, "this.pricingPhases.pricingPhaseList");
        com.android.billingclient.api.f.c cVar = (com.android.billingclient.api.f.c) z.u0(listA);
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public static final boolean isBasePlan(com.android.billingclient.api.f.e eVar) {
        t.g(eVar, "<this>");
        return eVar.f().a().size() == 1;
    }

    public static final GoogleSubscriptionOption toSubscriptionOption(com.android.billingclient.api.f.e eVar, String productId, com.android.billingclient.api.f productDetails) {
        t.g(eVar, "<this>");
        t.g(productId, "productId");
        t.g(productDetails, "productDetails");
        List<com.android.billingclient.api.f.c> listA = eVar.f().a();
        t.f(listA, "pricingPhases.pricingPhaseList");
        ArrayList arrayList = new ArrayList(C0938s.y(listA, 10));
        for (com.android.billingclient.api.f.c it : listA) {
            t.f(it, "it");
            arrayList.add(PricingPhaseConversionsKt.toRevenueCatPricingPhase(it));
        }
        String basePlanId = eVar.a();
        t.f(basePlanId, "basePlanId");
        String strC = eVar.c();
        List offerTags = eVar.d();
        t.f(offerTags, "offerTags");
        String offerToken = eVar.e();
        t.f(offerToken, "offerToken");
        com.android.billingclient.api.f.a aVarB = eVar.b();
        return new GoogleSubscriptionOption(productId, basePlanId, strC, arrayList, offerTags, productDetails, offerToken, null, aVarB != null ? getInstallmentsInfo(aVarB) : null);
    }
}
