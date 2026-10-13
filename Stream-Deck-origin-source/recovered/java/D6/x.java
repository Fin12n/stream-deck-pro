package D6;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class x extends w {
    public static List T(List list) {
        kotlin.jvm.internal.t.g(list, "<this>");
        return new Q(list);
    }

    public static List U(List list) {
        kotlin.jvm.internal.t.g(list, "<this>");
        return new P(list);
    }

    public static final int V(List list, int i8) {
        if (i8 >= 0 && i8 <= r.p(list)) {
            return r.p(list) - i8;
        }
        throw new IndexOutOfBoundsException("Element index " + i8 + " must be in range [" + new W6.i(0, r.p(list)) + "].");
    }

    public static final int W(List list, int i8) {
        return r.p(list) - i8;
    }

    public static final int X(List list, int i8) {
        if (i8 >= 0 && i8 <= list.size()) {
            return list.size() - i8;
        }
        throw new IndexOutOfBoundsException("Position index " + i8 + " must be in range [" + new W6.i(0, list.size()) + "].");
    }
}
