package D6;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class T extends S {
    public static Set d() {
        return D.f1924a;
    }

    public static Set e(Object... elements) {
        kotlin.jvm.internal.t.g(elements, "elements");
        return (Set) C0934n.q0(elements, new LinkedHashSet(L.d(elements.length)));
    }

    public static final Set f(Set set) {
        kotlin.jvm.internal.t.g(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : S.c(set.iterator().next());
        }
        return d();
    }

    public static Set g(Object... elements) {
        kotlin.jvm.internal.t.g(elements, "elements");
        return C0934n.u0(elements);
    }
}
