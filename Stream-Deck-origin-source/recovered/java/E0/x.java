package E0;

import D6.C0933m;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static final int f(int i8, int i9) {
        return (i8 >> i9) & 31;
    }

    public static final Object[] g(Object[] objArr, int i8, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        C0933m.m(objArr, objArr2, 0, 0, i8, 6, null);
        C0933m.i(objArr, objArr2, i8 + 2, i8, objArr.length);
        objArr2[i8] = obj;
        objArr2[i8 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] h(Object[] objArr, int i8) {
        Object[] objArr2 = new Object[objArr.length - 2];
        C0933m.m(objArr, objArr2, 0, 0, i8, 6, null);
        C0933m.i(objArr, objArr2, i8, i8 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] i(Object[] objArr, int i8) {
        Object[] objArr2 = new Object[objArr.length - 1];
        C0933m.m(objArr, objArr2, 0, 0, i8, 6, null);
        C0933m.i(objArr, objArr2, i8, i8 + 1, objArr.length);
        return objArr2;
    }

    public static final Object[] j(Object[] objArr, int i8, int i9, t tVar) {
        Object[] objArr2 = new Object[objArr.length - 1];
        C0933m.m(objArr, objArr2, 0, 0, i8, 6, null);
        C0933m.i(objArr, objArr2, i8, i8 + 2, i9);
        objArr2[i9 - 2] = tVar;
        C0933m.i(objArr, objArr2, i9 - 1, i9, objArr.length);
        return objArr2;
    }

    public static final Object[] k(Object[] objArr, int i8, int i9, Object obj, Object obj2) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        kotlin.jvm.internal.t.f(objArrCopyOf, "copyOf(this, newSize)");
        C0933m.i(objArrCopyOf, objArrCopyOf, i8 + 2, i8 + 1, objArr.length);
        C0933m.i(objArrCopyOf, objArrCopyOf, i9 + 2, i9, i8);
        objArrCopyOf[i9] = obj;
        objArrCopyOf[i9 + 1] = obj2;
        return objArrCopyOf;
    }
}
