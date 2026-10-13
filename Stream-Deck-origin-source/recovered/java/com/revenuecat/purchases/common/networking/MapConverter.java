package com.revenuecat.purchases.common.networking;

import C6.v;
import D6.L;
import Q6.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class MapConverter {
    private final /* synthetic */ <T> Object tryCast(Object obj, k kVar) {
        t.k(3, "T");
        return obj != null ? kVar.invoke(obj) : obj;
    }

    public final JSONObject convertToJSON$purchases_defaultsRelease(Map<String, ? extends Object> inputMap) throws JSONException {
        t.g(inputMap, "inputMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap(L.d(inputMap.size()));
        Iterator<T> it = inputMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof List) {
                Iterable iterable = (Iterable) value;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it2 = iterable.iterator();
                    do {
                        if (!it2.hasNext()) {
                            value = new JSONObject(L.e(v.a("temp_key", new JSONArray((Collection) value)))).getJSONArray("temp_key");
                            break;
                        }
                    } while (it2.next() instanceof String);
                } else {
                    value = new JSONObject(L.e(v.a("temp_key", new JSONArray((Collection) value)))).getJSONArray("temp_key");
                    break;
                    break;
                }
            } else if (value instanceof Map) {
                value = convertToJSON$purchases_defaultsRelease((Map) value);
            }
            linkedHashMap.put(key, value);
        }
        return createJSONObject$purchases_defaultsRelease(linkedHashMap);
    }

    public final JSONObject createJSONObject$purchases_defaultsRelease(Map<String, ? extends Object> inputMap) {
        t.g(inputMap, "inputMap");
        return new JSONObject(inputMap);
    }
}
