package p115m6;

import C6.v;
import D6.C0938s;
import D6.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class F {
    public static final C c(C c8, C builder) {
        t.g(c8, "<this>");
        t.g(builder, "builder");
        for (Map.Entry entry : builder.a()) {
            c8.e((String) entry.getKey(), (List) entry.getValue());
        }
        return c8;
    }

    public static final boolean d(Set set, Set set2) {
        return t.c(set, set2);
    }

    public static final int e(Set set, int i8) {
        return (i8 * 31) + set.hashCode();
    }

    public static final List f(B b8) {
        t.g(b8, "<this>");
        Set<Map.Entry> setA = b8.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setA) {
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(C0938s.y(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(v.a(entry.getKey(), (String) it.next()));
            }
            w.E(arrayList, arrayList2);
        }
        return arrayList;
    }
}
