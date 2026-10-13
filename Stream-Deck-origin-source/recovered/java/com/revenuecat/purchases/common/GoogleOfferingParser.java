package com.revenuecat.purchases.common;

import D6.z;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class GoogleOfferingParser extends OfferingParser {
    @Override // com.revenuecat.purchases.common.OfferingParser
    public StoreProduct findMatchingProduct(Map<String, ? extends List<? extends StoreProduct>> productsById, JSONObject packageJson) throws JSONException {
        SubscriptionOption basePlan;
        t.g(productsById, "productsById");
        t.g(packageJson, "packageJson");
        String string = packageJson.getString("platform_product_identifier");
        String it = packageJson.optString("platform_product_plan_identifier");
        t.f(it, "it");
        Object obj = null;
        if (it.length() <= 0) {
            it = null;
        }
        List<? extends StoreProduct> list = productsById.get(string);
        if (it == null) {
            if (list == null || list.size() != 1) {
                list = null;
            }
            if (list != null) {
                if (list.get(0).getType() != ProductType.INAPP) {
                    list = null;
                }
                if (list != null) {
                    return (StoreProduct) z.k0(list);
                }
            }
            return null;
        }
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            SubscriptionOptions subscriptionOptions = ((StoreProduct) obj2).getSubscriptionOptions();
            if (t.c((subscriptionOptions == null || (basePlan = subscriptionOptions.getBasePlan()) == null) ? null : basePlan.getId(), it)) {
                obj = obj2;
                break;
            }
        }
        return (StoreProduct) obj;
    }
}
