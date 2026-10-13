package D6;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class U extends T {
    public static Set h(Set set, Iterable elements) {
        kotlin.jvm.internal.t.g(set, "<this>");
        kotlin.jvm.internal.t.g(elements, "elements");
        Collection<?> collectionG = w.G(elements);
        if (collectionG.isEmpty()) {
            return z.W0(set);
        }
        if (!(collectionG instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionG);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!collectionG.contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static Set i(Set set, Iterable elements) {
        int size;
        kotlin.jvm.internal.t.g(set, "<this>");
        kotlin.jvm.internal.t.g(elements, "elements");
        Integer numZ = C0938s.z(elements);
        if (numZ != null) {
            size = set.size() + numZ.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(L.d(size));
        linkedHashSet.addAll(set);
        w.E(linkedHashSet, elements);
        return linkedHashSet;
    }
}
