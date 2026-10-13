package E6;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.t;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static final Object[] d(int i8) {
        if (i8 >= 0) {
            return new Object[i8];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    public static final Object[] e(Object[] objArr, int i8) {
        t.g(objArr, "<this>");
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i8);
        t.f(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static final void f(Object[] objArr, int i8) {
        t.g(objArr, "<this>");
        objArr[i8] = null;
    }

    public static final void g(Object[] objArr, int i8, int i9) {
        t.g(objArr, "<this>");
        while (i8 < i9) {
            f(objArr, i8);
            i8++;
        }
    }

    public static final boolean h(Object[] objArr, int i8, int i9, List list) {
        if (i9 != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!t.c(objArr[i8 + i10], list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final int i(Object[] objArr, int i8, int i9) {
        int iHashCode = 1;
        for (int i10 = 0; i10 < i9; i10++) {
            Object obj = objArr[i8 + i10];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public static final String j(Object[] objArr, int i8, int i9, Collection collection) {
        StringBuilder sb = new StringBuilder((i9 * 3) + 2);
        sb.append("[");
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i8 + i10];
            if (obj == collection) {
                sb.append(jULK.yeBZpqkwBkSdgsn);
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        t.f(string, "toString(...)");
        return string;
    }
}
