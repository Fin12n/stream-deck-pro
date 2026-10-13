package p115m6;

import Q6.k;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: m6.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2698h {
    public static final Map a(k supplier, k close, int i8) {
        t.g(supplier, "supplier");
        t.g(close, "close");
        Map mapSynchronizedMap = Collections.synchronizedMap(new v(supplier, close, i8));
        t.f(mapSynchronizedMap, "synchronizedMap(LRUCache…upplier, close, maxSize))");
        return mapSynchronizedMap;
    }
}
