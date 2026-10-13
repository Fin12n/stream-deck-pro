package com.revenuecat.purchases.utils;

import D6.C0938s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class JSONArrayExtensionsKt {
    public static final <T> List<T> replaceJsonNullWithKotlinNull(List<? extends T> list) {
        t.g(list, "<this>");
        ArrayList arrayList = new ArrayList(C0938s.y(list, 10));
        for (T t8 : list) {
            if (t8 instanceof Map) {
                t.e(t8, "null cannot be cast to non-null type kotlin.collections.Map<T of com.revenuecat.purchases.utils.JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull$lambda$0, T of com.revenuecat.purchases.utils.JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull$lambda$0?>");
                t8 = (T) JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull((Map) t8);
            } else if (t8 instanceof List) {
                t.e(t8, "null cannot be cast to non-null type kotlin.collections.List<T of com.revenuecat.purchases.utils.JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull$lambda$0?>");
                t8 = (T) replaceJsonNullWithKotlinNull((List) t8);
            } else if (t.c(t8, JSONObject.NULL)) {
                t8 = (T) null;
            }
            arrayList.add(t8);
        }
        return arrayList;
    }

    public static final <T> List<T> toList(JSONArray jSONArray) {
        t.g(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            Object list = jSONArray.get(i8);
            if (list instanceof JSONObject) {
                list = JSONObjectExtensionsKt.toMap((JSONObject) list, true);
            } else if (list instanceof JSONArray) {
                list = toList((JSONArray) list);
            }
            arrayList.add(list);
        }
        return arrayList;
    }
}
