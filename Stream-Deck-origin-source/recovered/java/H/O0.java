package H;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class O0 extends T0 implements N0 {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final InterfaceC0984i0.c f2874S = InterfaceC0984i0.c.OPTIONAL;

    public O0(TreeMap treeMap) {
        super(treeMap);
    }

    public static O0 i0() {
        return new O0(new TreeMap(T0.f2896Q));
    }

    public static O0 j0(InterfaceC0984i0 interfaceC0984i0) {
        TreeMap treeMap = new TreeMap(T0.f2896Q);
        for (InterfaceC0984i0.a aVar : interfaceC0984i0.c()) {
            Set<InterfaceC0984i0.c> setG = interfaceC0984i0.g(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (InterfaceC0984i0.c cVar : setG) {
                arrayMap.put(cVar, interfaceC0984i0.b(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new O0(treeMap);
    }

    @Override // H.N0
    public void K(InterfaceC0984i0.a aVar, InterfaceC0984i0.c cVar, Object obj) {
        Map map = (Map) this.f2898P.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f2898P.put(aVar, arrayMap);
            arrayMap.put(cVar, obj);
            return;
        }
        InterfaceC0984i0.c cVar2 = (InterfaceC0984i0.c) Collections.min(map.keySet());
        if (Objects.equals(map.get(cVar2), obj) || !InterfaceC0984i0.J(cVar2, cVar)) {
            map.put(cVar, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.c() + ", existing value (" + cVar2 + ")=" + map.get(cVar2) + ", conflicting (" + cVar + ")=" + obj);
    }

    @Override // H.N0
    public void L(InterfaceC0984i0.a aVar, Object obj) {
        K(aVar, f2874S, obj);
    }

    public Object k0(InterfaceC0984i0.a aVar) {
        return this.f2898P.remove(aVar);
    }
}
