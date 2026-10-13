package com.revenuecat.purchases.subscriberattributes.caching;

import C6.j;
import C6.k;
import C6.o;
import C6.v;
import D6.L;
import D6.M;
import D6.z;
import T0.Vl.PCRzgdeK;
import V.ocy.SVzBK;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONObject;
import p043e6.dT.GIGvBf;
import p090k.zI.jULK;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class SubscriberAttributesCache {
    private final DeviceCache deviceCache;
    private final j subscriberAttributesCacheKey$delegate;

    public SubscriberAttributesCache(DeviceCache deviceCache) {
        t.g(deviceCache, "deviceCache");
        this.deviceCache = deviceCache;
        this.subscriberAttributesCacheKey$delegate = k.b(new SubscriberAttributesCache$subscriberAttributesCacheKey$2(this));
    }

    private final synchronized void deleteSyncedSubscriberAttributesForOtherUsers(String str) {
        o oVarA;
        try {
            LogIntent logIntent = LogIntent.DEBUG;
            String str2 = String.format(AttributionStrings.DELETING_ATTRIBUTES_OTHER_USERS, Arrays.copyOf(new Object[]{str}, 1));
            t.f(str2, hJroAgFztiMK.wMZCazwNTtBpRMA);
            LogWrapperKt.log(logIntent, str2);
            Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
            ArrayList arrayList = new ArrayList(allStoredSubscriberAttributes.size());
            for (Map.Entry<String, Map<String, SubscriberAttribute>> entry : allStoredSubscriberAttributes.entrySet()) {
                String key = entry.getKey();
                Map<String, SubscriberAttribute> value = entry.getValue();
                if (t.c(str, key)) {
                    oVarA = v.a(key, value);
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, SubscriberAttribute> entry2 : value.entrySet()) {
                        if (!entry2.getValue().isSynced()) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    oVarA = v.a(key, linkedHashMap);
                }
                arrayList.add(oVarA);
            }
            Map mapT = M.t(arrayList);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry3 : mapT.entrySet()) {
                if (!((Map) entry3.getValue()).isEmpty()) {
                    linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                }
            }
            putAttributes$purchases_defaultsRelease(this.deviceCache, linkedHashMap2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void cleanUpSubscriberAttributeCache(String str) {
        t.g(str, PCRzgdeK.ODQSEbgO);
        SubscriberAttributesMigrationExtensionsKt.migrateSubscriberAttributesIfNeeded(this);
        deleteSyncedSubscriberAttributesForOtherUsers(str);
    }

    public final synchronized void clearAllSubscriberAttributesFromUser(String appUserID) {
        t.g(appUserID, "appUserID");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.DELETING_ATTRIBUTES, Arrays.copyOf(new Object[]{appUserID}, 1));
        t.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        Map mapY = M.y(getAllStoredSubscriberAttributes());
        mapY.remove(appUserID);
        putAttributes$purchases_defaultsRelease(this.deviceCache, M.v(mapY));
    }

    public final synchronized void clearSubscriberAttributesIfSyncedForSubscriber(String appUserID) {
        t.g(appUserID, "appUserID");
        if (getUnsyncedSubscriberAttributes(appUserID).isEmpty()) {
            clearAllSubscriberAttributesFromUser(appUserID);
        }
    }

    public final synchronized Map<String, Map<String, SubscriberAttribute>> getAllStoredSubscriberAttributes() {
        Map<String, Map<String, SubscriberAttribute>> mapG;
        try {
            JSONObject jSONObjectOrNull = this.deviceCache.getJSONObjectOrNull(getSubscriberAttributesCacheKey$purchases_defaultsRelease());
            if (jSONObjectOrNull == null || (mapG = SubscriberAttributesFactoriesKt.buildSubscriberAttributesMapPerUser(jSONObjectOrNull)) == null) {
                mapG = M.g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return mapG;
    }

    public final DeviceCache getDeviceCache$purchases_defaultsRelease() {
        return this.deviceCache;
    }

    public final String getSubscriberAttributesCacheKey$purchases_defaultsRelease() {
        return (String) this.subscriberAttributesCacheKey$delegate.getValue();
    }

    public final synchronized Map<String, Map<String, SubscriberAttribute>> getUnsyncedSubscriberAttributes() {
        LinkedHashMap linkedHashMap;
        try {
            Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(L.d(allStoredSubscriberAttributes.size()));
            for (Object obj : allStoredSubscriberAttributes.entrySet()) {
                Object key = ((Map.Entry) obj).getKey();
                Map.Entry entry = (Map.Entry) obj;
                linkedHashMap2.put(key, filterUnsynced((Map) entry.getValue(), (String) entry.getKey()));
            }
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                if (!((Map) entry2.getValue()).isEmpty()) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return linkedHashMap;
    }

    public final synchronized void setAttributes(String str, Map<String, SubscriberAttribute> attributesToBeSet) {
        try {
            t.g(str, SVzBK.rdREtEelYwubW);
            t.g(attributesToBeSet, "attributesToBeSet");
            Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
            Map<String, SubscriberAttribute> mapG = allStoredSubscriberAttributes.get(str);
            if (mapG == null) {
                mapG = M.g();
            }
            putAttributes$purchases_defaultsRelease(this.deviceCache, M.n(allStoredSubscriberAttributes, L.e(v.a(str, M.n(mapG, attributesToBeSet)))));
        } catch (Throwable th) {
            throw th;
        }
    }

    private final Map<String, SubscriberAttribute> filterUnsynced(Map<String, SubscriberAttribute> map, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, SubscriberAttribute> entry : map.entrySet()) {
            if (!entry.getValue().isSynced()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LogIntent logIntent = LogIntent.DEBUG;
        StringBuilder sb = new StringBuilder();
        String str2 = String.format(jULK.FyrGugwfiQmM, Arrays.copyOf(new Object[]{Integer.valueOf(linkedHashMap.size()), str}, 2));
        t.f(str2, "format(this, *args)");
        sb.append(str2);
        sb.append(!linkedHashMap.isEmpty() ? z.r0(linkedHashMap.values(), "\n", null, null, 0, null, null, 62, null) : "");
        LogWrapperKt.log(logIntent, sb.toString());
        return linkedHashMap;
    }

    public final void putAttributes$purchases_defaultsRelease(DeviceCache deviceCache, Map<String, ? extends Map<String, SubscriberAttribute>> updatedSubscriberAttributesForAll) {
        t.g(deviceCache, GIGvBf.THbegCaCZCksLAq);
        t.g(updatedSubscriberAttributesForAll, "updatedSubscriberAttributesForAll");
        DeviceCache deviceCache2 = this.deviceCache;
        String subscriberAttributesCacheKey$purchases_defaultsRelease = getSubscriberAttributesCacheKey$purchases_defaultsRelease();
        String string = CachingHelpersKt.toJSONObject(updatedSubscriberAttributesForAll).toString();
        t.f(string, "updatedSubscriberAttribu…toJSONObject().toString()");
        deviceCache2.putString(subscriberAttributesCacheKey$purchases_defaultsRelease, string);
    }

    public final synchronized Map<String, SubscriberAttribute> getAllStoredSubscriberAttributes(String appUserID) {
        Map<String, SubscriberAttribute> mapG;
        t.g(appUserID, "appUserID");
        mapG = getAllStoredSubscriberAttributes().get(appUserID);
        if (mapG == null) {
            mapG = M.g();
        }
        return mapG;
    }

    public final synchronized Map<String, SubscriberAttribute> getUnsyncedSubscriberAttributes(String appUserID) {
        t.g(appUserID, "appUserID");
        return filterUnsynced(getAllStoredSubscriberAttributes(appUserID), appUserID);
    }
}
