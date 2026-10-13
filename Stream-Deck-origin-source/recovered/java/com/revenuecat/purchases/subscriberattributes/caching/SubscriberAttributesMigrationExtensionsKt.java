package com.revenuecat.purchases.subscriberattributes.caching;

import C6.v;
import D6.C0938s;
import D6.M;
import Z6.w;
import com.amazon.a.a.o.c.a.b;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class SubscriberAttributesMigrationExtensionsKt {
    public static final synchronized Map<String, Map<String, SubscriberAttribute>> getAllLegacyStoredSubscriberAttributes(SubscriberAttributesCache subscriberAttributesCache) {
        ArrayList arrayList;
        Map<String, SubscriberAttribute> mapG;
        try {
            t.g(subscriberAttributesCache, "<this>");
            String strLegacySubscriberAttributesCacheKey = legacySubscriberAttributesCacheKey(subscriberAttributesCache, "");
            Set<String> setFindKeysThatStartWith = subscriberAttributesCache.getDeviceCache$purchases_defaultsRelease().findKeysThatStartWith(strLegacySubscriberAttributesCacheKey);
            arrayList = new ArrayList(C0938s.y(setFindKeysThatStartWith, 10));
            for (String str : setFindKeysThatStartWith) {
                String str2 = (String) w.A0(str, new String[]{strLegacySubscriberAttributesCacheKey}, false, 0, 6, null).get(1);
                JSONObject jSONObjectOrNull = subscriberAttributesCache.getDeviceCache$purchases_defaultsRelease().getJSONObjectOrNull(str);
                if (jSONObjectOrNull == null || (mapG = SubscriberAttributesFactoriesKt.buildLegacySubscriberAttributes(jSONObjectOrNull)) == null) {
                    mapG = M.g();
                }
                arrayList.add(v.a(str2, mapG));
            }
        } catch (Throwable th) {
            throw th;
        }
        return M.t(arrayList);
    }

    public static final String legacySubscriberAttributesCacheKey(SubscriberAttributesCache subscriberAttributesCache, String appUserID) {
        t.g(subscriberAttributesCache, "<this>");
        t.g(appUserID, "appUserID");
        return subscriberAttributesCache.getSubscriberAttributesCacheKey$purchases_defaultsRelease() + b.f16789a + appUserID;
    }

    public static final synchronized void migrateSubscriberAttributes(SubscriberAttributesCache subscriberAttributesCache, Map<String, ? extends Map<String, SubscriberAttribute>> legacySubscriberAttributesForAppUserID) {
        try {
            t.g(subscriberAttributesCache, "<this>");
            t.g(legacySubscriberAttributesForAppUserID, "legacySubscriberAttributesForAppUserID");
            Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = subscriberAttributesCache.getAllStoredSubscriberAttributes();
            Map<String, ? extends Map<String, SubscriberAttribute>> mapY = M.y(allStoredSubscriberAttributes);
            for (Map.Entry<String, ? extends Map<String, SubscriberAttribute>> entry : legacySubscriberAttributesForAppUserID.entrySet()) {
                String key = entry.getKey();
                Map<String, SubscriberAttribute> value = entry.getValue();
                Map<String, SubscriberAttribute> mapG = allStoredSubscriberAttributes.get(key);
                if (mapG == null) {
                    mapG = M.g();
                }
                mapY.put(key, M.n(value, mapG));
                subscriberAttributesCache.getDeviceCache$purchases_defaultsRelease().remove(legacySubscriberAttributesCacheKey(subscriberAttributesCache, key));
            }
            subscriberAttributesCache.putAttributes$purchases_defaultsRelease(subscriberAttributesCache.getDeviceCache$purchases_defaultsRelease(), mapY);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static final synchronized void migrateSubscriberAttributesIfNeeded(SubscriberAttributesCache subscriberAttributesCache) {
        t.g(subscriberAttributesCache, "<this>");
        Map<String, Map<String, SubscriberAttribute>> allLegacyStoredSubscriberAttributes = getAllLegacyStoredSubscriberAttributes(subscriberAttributesCache);
        if (allLegacyStoredSubscriberAttributes.isEmpty()) {
            allLegacyStoredSubscriberAttributes = null;
        }
        if (allLegacyStoredSubscriberAttributes != null) {
            migrateSubscriberAttributes(subscriberAttributesCache, allLegacyStoredSubscriberAttributes);
        }
    }
}
