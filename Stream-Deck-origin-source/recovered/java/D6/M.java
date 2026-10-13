package D6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class M extends L {
    public static Map g() {
        C c8 = C.f1923a;
        kotlin.jvm.internal.t.e(c8, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c8;
    }

    public static Object h(Map map, Object obj) {
        kotlin.jvm.internal.t.g(map, "<this>");
        return K.a(map, obj);
    }

    public static HashMap i(C6.o... pairs) {
        kotlin.jvm.internal.t.g(pairs, "pairs");
        HashMap map = new HashMap(L.d(pairs.length));
        q(map, pairs);
        return map;
    }

    public static Map j(C6.o... pairs) {
        kotlin.jvm.internal.t.g(pairs, "pairs");
        return pairs.length > 0 ? x(pairs, new LinkedHashMap(L.d(pairs.length))) : g();
    }

    public static Map k(Map map, Iterable keys) {
        kotlin.jvm.internal.t.g(map, "<this>");
        kotlin.jvm.internal.t.g(keys, "keys");
        Map mapY = y(map);
        w.K(mapY.keySet(), keys);
        return l(mapY);
    }

    public static final Map l(Map map) {
        kotlin.jvm.internal.t.g(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : L.f(map);
        }
        return g();
    }

    public static Map m(Map map, C6.o pair) {
        kotlin.jvm.internal.t.g(map, "<this>");
        kotlin.jvm.internal.t.g(pair, "pair");
        if (map.isEmpty()) {
            return L.e(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.c(), pair.d());
        return linkedHashMap;
    }

    public static Map n(Map map, Map map2) {
        kotlin.jvm.internal.t.g(map, "<this>");
        kotlin.jvm.internal.t.g(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void o(Map map, Y6.g pairs) {
        kotlin.jvm.internal.t.g(map, "<this>");
        kotlin.jvm.internal.t.g(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            C6.o oVar = (C6.o) it.next();
            map.put(oVar.a(), oVar.b());
        }
    }

    public static void p(Map map, Iterable pairs) {
        kotlin.jvm.internal.t.g(map, "<this>");
        kotlin.jvm.internal.t.g(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            C6.o oVar = (C6.o) it.next();
            map.put(oVar.a(), oVar.b());
        }
    }

    public static final void q(Map map, C6.o[] pairs) {
        kotlin.jvm.internal.t.g(map, "<this>");
        kotlin.jvm.internal.t.g(pairs, "pairs");
        for (C6.o oVar : pairs) {
            map.put(oVar.a(), oVar.b());
        }
    }

    public static Map r(Y6.g gVar) {
        kotlin.jvm.internal.t.g(gVar, "<this>");
        return l(s(gVar, new LinkedHashMap()));
    }

    public static final Map s(Y6.g gVar, Map destination) {
        kotlin.jvm.internal.t.g(gVar, "<this>");
        kotlin.jvm.internal.t.g(destination, "destination");
        o(destination, gVar);
        return destination;
    }

    public static Map t(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return l(u(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return g();
        }
        if (size != 1) {
            return u(iterable, new LinkedHashMap(L.d(collection.size())));
        }
        return L.e((C6.o) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    public static final Map u(Iterable iterable, Map destination) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        kotlin.jvm.internal.t.g(destination, "destination");
        p(destination, iterable);
        return destination;
    }

    public static Map v(Map map) {
        kotlin.jvm.internal.t.g(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? y(map) : L.f(map);
        }
        return g();
    }

    public static final Map x(C6.o[] oVarArr, Map destination) {
        kotlin.jvm.internal.t.g(oVarArr, "<this>");
        kotlin.jvm.internal.t.g(destination, "destination");
        q(destination, oVarArr);
        return destination;
    }

    public static Map y(Map map) {
        kotlin.jvm.internal.t.g(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static Map w(C6.o[] oVarArr) {
        kotlin.jvm.internal.t.g(oVarArr, RaiWHuj.KkVjyREqPHonK);
        int length = oVarArr.length;
        if (length != 0) {
            return length != 1 ? x(oVarArr, new LinkedHashMap(L.d(oVarArr.length))) : L.e(oVarArr[0]);
        }
        return g();
    }
}
