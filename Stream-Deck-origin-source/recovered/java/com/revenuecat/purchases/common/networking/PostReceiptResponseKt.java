package com.revenuecat.purchases.common.networking;

import D6.L;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.common.CustomerInfoFactory;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class PostReceiptResponseKt {
    public static final PostReceiptResponse buildPostReceiptResponse(HTTPResult result) {
        t.g(result, "result");
        CustomerInfo customerInfoBuildCustomerInfo = CustomerInfoFactory.INSTANCE.buildCustomerInfo(result);
        JSONObject jSONObjectOptJSONObject = result.getBody().optJSONObject("purchased_products");
        LinkedHashMap linkedHashMap = null;
        if (jSONObjectOptJSONObject != null) {
            Map map$default = JSONObjectExtensionsKt.toMap$default(jSONObjectOptJSONObject, false, 1, null);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(L.d(map$default.size()));
            for (Map.Entry entry : map$default.entrySet()) {
                Object key = entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                if (!jSONObject.has("should_consume")) {
                    jSONObject = null;
                }
                linkedHashMap2.put(key, new PostReceiptProductInfo(jSONObject != null ? Boolean.valueOf(jSONObject.optBoolean("should_consume")) : null));
            }
            linkedHashMap = linkedHashMap2;
        }
        return new PostReceiptResponse(customerInfoBuildCustomerInfo, linkedHashMap, result.getBody());
    }
}
