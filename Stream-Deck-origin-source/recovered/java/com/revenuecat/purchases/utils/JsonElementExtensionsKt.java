package com.revenuecat.purchases.utils;

import C6.o;
import C6.v;
import D6.C0938s;
import D6.L;
import W6.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;
import r7.d;
import r7.j;
import r7.k;
import r7.w;
import r7.y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class JsonElementExtensionsKt {
    public static final Map<String, Object> asMap(j jVar) {
        t.g(jVar, "<this>");
        if (!(jVar instanceof w)) {
            return null;
        }
        Set<Map.Entry<String, j>> setEntrySet = k.o(jVar).entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.d(L.d(C0938s.y(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            o oVarA = v.a(entry.getKey(), getExtractedContent((j) entry.getValue()));
            linkedHashMap.put(oVarA.c(), oVarA.d());
        }
        return linkedHashMap;
    }

    private static final Object getExtractedContent(j jVar) {
        if (jVar instanceof y) {
            y yVarP = k.p(jVar);
            if (yVarP.m()) {
                return yVarP.c();
            }
            Object objF = k.f(yVarP);
            return (objF == null && (objF = k.m(yVarP)) == null && (objF = k.s(yVarP)) == null && (objF = k.k(yVarP)) == null && (objF = k.i(yVarP)) == null) ? k.g(yVarP) : objF;
        }
        if (jVar instanceof d) {
            d dVarN = k.n(jVar);
            ArrayList arrayList = new ArrayList(C0938s.y(dVarN, 10));
            Iterator<j> it = dVarN.iterator();
            while (it.hasNext()) {
                arrayList.add(getExtractedContent(it.next()));
            }
            return arrayList;
        }
        if (!(jVar instanceof w)) {
            return null;
        }
        Set<Map.Entry<String, j>> setEntrySet = k.o(jVar).entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.d(L.d(C0938s.y(setEntrySet, 10)), 16));
        Iterator<T> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            o oVarA = v.a(entry.getKey(), getExtractedContent((j) entry.getValue()));
            linkedHashMap.put(oVarA.c(), oVarA.d());
        }
        return linkedHashMap;
    }
}
