package H;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class T0 implements InterfaceC0984i0 {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final Comparator f2896Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final T0 f2897R;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final TreeMap f2898P;

    static {
        Comparator comparator = new Comparator() { // from class: H.S0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((InterfaceC0984i0.a) obj).c().compareTo(((InterfaceC0984i0.a) obj2).c());
            }
        };
        f2896Q = comparator;
        f2897R = new T0(new TreeMap(comparator));
    }

    public T0(TreeMap treeMap) {
        this.f2898P = treeMap;
    }

    public static T0 g0() {
        return f2897R;
    }

    public static T0 h0(InterfaceC0984i0 interfaceC0984i0) {
        if (T0.class.equals(interfaceC0984i0.getClass())) {
            return (T0) interfaceC0984i0;
        }
        TreeMap treeMap = new TreeMap(f2896Q);
        for (InterfaceC0984i0.a aVar : interfaceC0984i0.c()) {
            Set<InterfaceC0984i0.c> setG = interfaceC0984i0.g(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (InterfaceC0984i0.c cVar : setG) {
                arrayMap.put(cVar, interfaceC0984i0.b(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new T0(treeMap);
    }

    @Override // H.InterfaceC0984i0
    public void a(String str, InterfaceC0984i0.b bVar) {
        for (Map.Entry entry : this.f2898P.tailMap(InterfaceC0984i0.a.a(str, Void.class)).entrySet()) {
            if (!((InterfaceC0984i0.a) entry.getKey()).c().startsWith(str) || !bVar.a((InterfaceC0984i0.a) entry.getKey())) {
                return;
            }
        }
    }

    @Override // H.InterfaceC0984i0
    public Object b(InterfaceC0984i0.a aVar, InterfaceC0984i0.c cVar) {
        Map map = (Map) this.f2898P.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        }
        if (map.containsKey(cVar)) {
            return map.get(cVar);
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + cVar);
    }

    @Override // H.InterfaceC0984i0
    public Set c() {
        return Collections.unmodifiableSet(this.f2898P.keySet());
    }

    @Override // H.InterfaceC0984i0
    public InterfaceC0984i0.c d(InterfaceC0984i0.a aVar) {
        Map map = (Map) this.f2898P.get(aVar);
        if (map != null) {
            return (InterfaceC0984i0.c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // H.InterfaceC0984i0
    public boolean e(InterfaceC0984i0.a aVar) {
        return this.f2898P.containsKey(aVar);
    }

    @Override // H.InterfaceC0984i0
    public Object f(InterfaceC0984i0.a aVar, Object obj) {
        Map map = (Map) this.f2898P.get(aVar);
        return map == null ? obj : map.get((InterfaceC0984i0.c) Collections.min(map.keySet()));
    }

    @Override // H.InterfaceC0984i0
    public Set g(InterfaceC0984i0.a aVar) {
        Map map = (Map) this.f2898P.get(aVar);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // H.InterfaceC0984i0
    public Object h(InterfaceC0984i0.a aVar) {
        Map map = (Map) this.f2898P.get(aVar);
        if (map != null) {
            return map.get((InterfaceC0984i0.c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }
}
