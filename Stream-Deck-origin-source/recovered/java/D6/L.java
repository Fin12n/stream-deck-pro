package D6;

import Z.JTT.ryTuoS;
import java.util.Collections;
import java.util.Map;
import p179u4.eubL.OjEsfyJYzbPn;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class L extends K {
    public static Map c() {
        return new E6.d();
    }

    public static int d(int i8) {
        if (i8 < 0) {
            return i8;
        }
        if (i8 < 3) {
            return i8 + 1;
        }
        if (i8 < 1073741824) {
            return (int) ((i8 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map e(C6.o pair) {
        kotlin.jvm.internal.t.g(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.c(), pair.d());
        kotlin.jvm.internal.t.f(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static Map b(Map map) {
        kotlin.jvm.internal.t.g(map, OjEsfyJYzbPn.UwxJmue);
        return ((E6.d) map).l();
    }

    public static final Map f(Map map) {
        kotlin.jvm.internal.t.g(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.t.f(mapSingletonMap, ryTuoS.iCyEmuvt);
        return mapSingletonMap;
    }
}
