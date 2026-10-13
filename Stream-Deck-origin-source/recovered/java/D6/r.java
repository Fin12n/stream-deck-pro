package D6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p179u4.eubL.OjEsfyJYzbPn;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class r extends C0937q {
    public static ArrayList h(Object... elements) {
        kotlin.jvm.internal.t.g(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C0929i(elements, true));
    }

    public static final Collection i(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        return new C0929i(objArr, false);
    }

    public static final int j(List list, int i8, int i9, Q6.k comparison) {
        kotlin.jvm.internal.t.g(list, "<this>");
        kotlin.jvm.internal.t.g(comparison, "comparison");
        v(list.size(), i8, i9);
        int i10 = i9 - 1;
        while (i8 <= i10) {
            int i11 = (i8 + i10) >>> 1;
            int iIntValue = ((Number) comparison.invoke(list.get(i11))).intValue();
            if (iIntValue < 0) {
                i8 = i11 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i11;
                }
                i10 = i11 - 1;
            }
        }
        return -(i8 + 1);
    }

    public static final int k(List list, Comparable comparable, int i8, int i9) {
        kotlin.jvm.internal.t.g(list, "<this>");
        v(list.size(), i8, i9);
        int i10 = i9 - 1;
        while (i8 <= i10) {
            int i11 = (i8 + i10) >>> 1;
            int iA = F6.a.a((Comparable) list.get(i11), comparable);
            if (iA < 0) {
                i8 = i11 + 1;
            } else {
                if (iA <= 0) {
                    return i11;
                }
                i10 = i11 - 1;
            }
        }
        return -(i8 + 1);
    }

    public static /* synthetic */ int l(List list, int i8, int i9, Q6.k kVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = list.size();
        }
        return j(list, i8, i9, kVar);
    }

    public static /* synthetic */ int m(List list, Comparable comparable, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = list.size();
        }
        return k(list, comparable, i8, i9);
    }

    public static List n() {
        return B.f1922a;
    }

    public static W6.i o(Collection collection) {
        kotlin.jvm.internal.t.g(collection, "<this>");
        return new W6.i(0, collection.size() - 1);
    }

    public static int p(List list) {
        kotlin.jvm.internal.t.g(list, "<this>");
        return list.size() - 1;
    }

    public static List r(Object obj) {
        return obj != null ? C0937q.e(obj) : n();
    }

    public static List s(Object... elements) {
        kotlin.jvm.internal.t.g(elements, "elements");
        return C0934n.L(elements);
    }

    public static List t(Object... elements) {
        kotlin.jvm.internal.t.g(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C0929i(elements, true));
    }

    public static final List u(List list) {
        kotlin.jvm.internal.t.g(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : C0937q.e(list.get(0));
        }
        return n();
    }

    public static final void v(int i8, int i9, int i10) {
        if (i9 > i10) {
            throw new IllegalArgumentException("fromIndex (" + i9 + ") is greater than toIndex (" + i10 + ").");
        }
        if (i9 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i9 + ") is less than zero.");
        }
        if (i10 <= i8) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i8 + ").");
    }

    public static void x() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static List q(Object... objArr) {
        kotlin.jvm.internal.t.g(objArr, OjEsfyJYzbPn.hDZwLkqBFqQHQg);
        return objArr.length > 0 ? C0933m.c(objArr) : n();
    }

    public static void w() {
        throw new ArithmeticException(hJroAgFztiMK.QLRw);
    }
}
