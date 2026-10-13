package com.revenuecat.purchases.common;

import D6.M;
import android.net.Uri;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.EntitlementInfos;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.utils.Iso8601Utils;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class CustomerInfoFactory {
    public static final CustomerInfoFactory INSTANCE = new CustomerInfoFactory();

    private CustomerInfoFactory() {
    }

    private final HashMap<String, Date> parseDates(JSONObject jSONObject, String str) throws JSONException {
        HashMap<String, Date> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            String it = jSONObject.getJSONObject(key).optString("product_plan_identifier");
            t.f(it, "it");
            if (it.length() <= 0) {
                it = null;
            }
            JSONObject expirationObject = jSONObject.getJSONObject(key);
            if (it != null) {
                String str2 = key + ':' + it;
                if (str2 != null) {
                    key = str2;
                }
            }
            t.f(key, "key");
            t.f(expirationObject, "expirationObject");
            map.put(key, JSONObjectExtensionsKt.optDate(expirationObject, str));
        }
        return map;
    }

    private final Map<String, Date> parseExpirations(JSONObject jSONObject) {
        return parseDates(jSONObject, "expires_date");
    }

    private final Map<String, Date> parsePurchaseDates(JSONObject jSONObject) {
        return parseDates(jSONObject, "purchase_date");
    }

    public final CustomerInfo buildCustomerInfo(HTTPResult httpResult) {
        t.g(httpResult, "httpResult");
        return buildCustomerInfo(httpResult.getBody(), httpResult.getRequestDate(), httpResult.getVerificationResult());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x008c  */
    public final CustomerInfo buildCustomerInfo(JSONObject body, Date date, VerificationResult verificationResult) throws JSONException {
        EntitlementInfos entitlementInfos;
        Date date2;
        t.g(body, "body");
        t.g(verificationResult, "verificationResult");
        JSONObject subscriber = body.getJSONObject(CustomerInfoResponseJsonKeys.SUBSCRIBER);
        JSONObject jSONObject = subscriber.getJSONObject(CustomerInfoResponseJsonKeys.NON_SUBSCRIPTIONS);
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        t.f(itKeys, "nonSubscriptions.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONArray jSONArray = jSONObject.getJSONArray(next);
            int length = jSONArray.length();
            if (length > 0) {
                jSONObject2.put(next, jSONArray.getJSONObject(length - 1));
            }
        }
        JSONObject subscriptions = subscriber.getJSONObject(CustomerInfoResponseJsonKeys.SUBSCRIPTIONS);
        t.f(subscriptions, "subscriptions");
        Map<String, Date> expirations = parseExpirations(subscriptions);
        Map mapN = M.n(parsePurchaseDates(subscriptions), parsePurchaseDates(jSONObject2));
        JSONObject jSONObjectOptJSONObject = subscriber.optJSONObject(CustomerInfoResponseJsonKeys.ENTITLEMENTS);
        Date requestDate = date == null ? Iso8601Utils.parse(body.getString(CustomerInfoResponseJsonKeys.REQUEST_DATE)) : date;
        Date firstSeen = Iso8601Utils.parse(subscriber.getString(CustomerInfoResponseJsonKeys.FIRST_SEEN));
        if (jSONObjectOptJSONObject != null) {
            t.f(requestDate, "requestDate");
            entitlementInfos = EntitlementInfoFactoriesKt.buildEntitlementInfos(jSONObjectOptJSONObject, subscriptions, jSONObject2, requestDate, verificationResult);
            if (entitlementInfos == null) {
                Map map = Collections.EMPTY_MAP;
                t.f(map, "emptyMap()");
                entitlementInfos = new EntitlementInfos(map, verificationResult);
            }
        } else {
            Map map2 = Collections.EMPTY_MAP;
            t.f(map2, "emptyMap()");
            entitlementInfos = new EntitlementInfos(map2, verificationResult);
        }
        t.f(subscriber, "subscriber");
        String strOptNullableString = JSONObjectExtensionsKt.optNullableString(subscriber, CustomerInfoResponseJsonKeys.MANAGEMENT_URL);
        String strOptNullableString2 = JSONObjectExtensionsKt.optNullableString(subscriber, "original_purchase_date");
        if (strOptNullableString2 == null || (date2 = Iso8601Utils.parse(strOptNullableString2)) == null) {
            date2 = null;
        }
        int iOptInt = body.optInt("schema_version", 3);
        String strOptString = subscriber.optString(CustomerInfoResponseJsonKeys.ORIGINAL_APP_USER_ID);
        Uri uri = strOptNullableString != null ? Uri.parse(strOptNullableString) : null;
        t.f(requestDate, "requestDate");
        t.f(firstSeen, "firstSeen");
        t.f(strOptString, "optString(CustomerInfoRe…eys.ORIGINAL_APP_USER_ID)");
        return new CustomerInfo(entitlementInfos, expirations, mapN, requestDate, iOptInt, firstSeen, strOptString, uri, date2, body);
    }
}
