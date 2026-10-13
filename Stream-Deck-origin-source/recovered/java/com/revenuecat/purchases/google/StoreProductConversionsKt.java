package com.revenuecat.purchases.google;

import D6.C0938s;
import D6.M;
import D6.r;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import p180u5.FCkZ.BpgIURjN;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class StoreProductConversionsKt {
    private static final Price createOneTimeProductPrice(com.android.billingclient.api.f fVar) {
        com.android.billingclient.api.f.b bVarC;
        if (ProductTypeConversionsKt.toRevenueCatProductType(fVar.e()) != ProductType.INAPP || (bVarC = fVar.c()) == null) {
            return null;
        }
        String strA = bVarC.a();
        t.f(strA, "it.formattedPrice");
        long jB = bVarC.b();
        String strC = bVarC.c();
        t.f(strC, "it.priceCurrencyCode");
        return new Price(strA, jB, strC);
    }

    public static final StoreProduct toInAppStoreProduct(com.android.billingclient.api.f fVar) {
        t.g(fVar, "<this>");
        return toStoreProduct(fVar, r.n());
    }

    public static final List<StoreProduct> toStoreProducts(List<com.android.billingclient.api.f> list) {
        List listN;
        Map mapG;
        t.g(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (com.android.billingclient.api.f fVar : list) {
            List subscriptionOfferDetails = fVar.f();
            if (subscriptionOfferDetails != null) {
                t.f(subscriptionOfferDetails, "subscriptionOfferDetails");
                listN = new ArrayList();
                for (Object obj : subscriptionOfferDetails) {
                    com.android.billingclient.api.f.e it = (com.android.billingclient.api.f.e) obj;
                    t.f(it, "it");
                    if (SubscriptionOptionConversionsKt.isBasePlan(it)) {
                        listN.add(obj);
                    }
                }
            } else {
                listN = r.n();
            }
            List subscriptionOfferDetails2 = fVar.f();
            if (subscriptionOfferDetails2 != null) {
                t.f(subscriptionOfferDetails2, "subscriptionOfferDetails");
                mapG = new LinkedHashMap();
                for (Object obj2 : subscriptionOfferDetails2) {
                    String strA = ((com.android.billingclient.api.f.e) obj2).a();
                    Object arrayList2 = mapG.get(strA);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        mapG.put(strA, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
            } else {
                mapG = M.g();
            }
            if (listN.isEmpty()) {
                listN = null;
            }
            if (listN != null) {
                Iterator it2 = listN.iterator();
                while (it2.hasNext()) {
                    List listN2 = (List) mapG.get(((com.android.billingclient.api.f.e) it2.next()).a());
                    if (listN2 == null) {
                        listN2 = r.n();
                    }
                    GoogleStoreProduct storeProduct = toStoreProduct(fVar, listN2);
                    if (storeProduct != null) {
                        arrayList.add(storeProduct);
                    } else {
                        LogIntent logIntent = LogIntent.RC_ERROR;
                        String str = String.format(PurchaseStrings.INVALID_PRODUCT_NO_PRICE, Arrays.copyOf(new Object[]{fVar.d()}, 1));
                        t.f(str, "format(this, *args)");
                        LogWrapperKt.log(logIntent, str);
                    }
                }
            } else {
                StoreProduct inAppStoreProduct = toInAppStoreProduct(fVar);
                if (inAppStoreProduct != null) {
                    arrayList.add(inAppStoreProduct);
                } else {
                    LogIntent logIntent2 = LogIntent.RC_ERROR;
                    String str2 = String.format(PurchaseStrings.INVALID_PRODUCT_NO_PRICE, Arrays.copyOf(new Object[]{fVar.d()}, 1));
                    t.f(str2, "format(this, *args)");
                    LogWrapperKt.log(logIntent2, str2);
                }
            }
        }
        return arrayList;
    }

    public static final GoogleStoreProduct toStoreProduct(com.android.billingclient.api.f fVar, List<com.android.billingclient.api.f.e> list) {
        SubscriptionOptions subscriptionOptions;
        PricingPhase fullPricePhase;
        t.g(fVar, "<this>");
        t.g(list, BpgIURjN.jtIFmB);
        if (ProductTypeConversionsKt.toRevenueCatProductType(fVar.e()) == ProductType.SUBS) {
            ArrayList arrayList = new ArrayList(C0938s.y(list, 10));
            for (com.android.billingclient.api.f.e eVar : list) {
                String productId = fVar.d();
                t.f(productId, "productId");
                arrayList.add(SubscriptionOptionConversionsKt.toSubscriptionOption(eVar, productId, fVar));
            }
            subscriptionOptions = new SubscriptionOptions(arrayList);
        } else {
            subscriptionOptions = null;
        }
        SubscriptionOption basePlan = subscriptionOptions != null ? subscriptionOptions.getBasePlan() : null;
        Price price = (basePlan == null || (fullPricePhase = basePlan.getFullPricePhase()) == null) ? null : fullPricePhase.getPrice();
        Price priceCreateOneTimeProductPrice = createOneTimeProductPrice(fVar);
        if (priceCreateOneTimeProductPrice != null) {
            price = priceCreateOneTimeProductPrice;
        } else if (price == null) {
            return null;
        }
        SubscriptionOption subscriptionOption = basePlan;
        Price price2 = price;
        String productId2 = fVar.d();
        t.f(productId2, "productId");
        String id = subscriptionOption != null ? subscriptionOption.getId() : null;
        ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(fVar.e());
        String name = fVar.b();
        t.f(name, "name");
        String str = id;
        String title = fVar.g();
        t.f(title, "title");
        String description = fVar.a();
        t.f(description, "description");
        return new GoogleStoreProduct(productId2, str, revenueCatProductType, price2, name, title, description, subscriptionOption != null ? subscriptionOption.getBillingPeriod() : null, subscriptionOptions, subscriptionOptions != null ? subscriptionOptions.getDefaultOffer() : null, fVar, (PresentedOfferingContext) null);
    }
}
