package D6;

import D6.iIQ.BmWxZhjGfw;
import P2.Lsk.mHPawN;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: D6.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C0933m extends C0932l {
    public static Object[] A(Object[] objArr, Object obj) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        int length = objArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + 1);
        objArrCopyOf[length] = obj;
        kotlin.jvm.internal.t.d(objArrCopyOf);
        return objArrCopyOf;
    }

    public static void B(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static final void C(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        kotlin.jvm.internal.t.g(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static List c(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        List listA = AbstractC0935o.a(objArr);
        kotlin.jvm.internal.t.f(listA, "asList(...)");
        return listA;
    }

    public static byte[] d(byte[] bArr, byte[] destination, int i8, int i9, int i10) {
        kotlin.jvm.internal.t.g(bArr, "<this>");
        kotlin.jvm.internal.t.g(destination, "destination");
        System.arraycopy(bArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static char[] e(char[] cArr, char[] destination, int i8, int i9, int i10) {
        kotlin.jvm.internal.t.g(cArr, "<this>");
        kotlin.jvm.internal.t.g(destination, "destination");
        System.arraycopy(cArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static float[] f(float[] fArr, float[] destination, int i8, int i9, int i10) {
        kotlin.jvm.internal.t.g(fArr, "<this>");
        kotlin.jvm.internal.t.g(destination, "destination");
        System.arraycopy(fArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static long[] h(long[] jArr, long[] destination, int i8, int i9, int i10) {
        kotlin.jvm.internal.t.g(jArr, "<this>");
        kotlin.jvm.internal.t.g(destination, "destination");
        System.arraycopy(jArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static Object[] i(Object[] objArr, Object[] destination, int i8, int i9, int i10) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        kotlin.jvm.internal.t.g(destination, "destination");
        System.arraycopy(objArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static /* synthetic */ byte[] j(byte[] bArr, byte[] bArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = bArr.length;
        }
        return d(bArr, bArr2, i8, i9, i10);
    }

    public static /* synthetic */ float[] k(float[] fArr, float[] fArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = fArr.length;
        }
        return f(fArr, fArr2, i8, i9, i10);
    }

    public static /* synthetic */ int[] l(int[] iArr, int[] iArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = iArr.length;
        }
        return g(iArr, iArr2, i8, i9, i10);
    }

    public static /* synthetic */ Object[] m(Object[] objArr, Object[] objArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = objArr.length;
        }
        return i(objArr, objArr2, i8, i9, i10);
    }

    public static byte[] n(byte[] bArr, int i8, int i9) {
        kotlin.jvm.internal.t.g(bArr, "<this>");
        C0931k.b(i9, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i8, i9);
        kotlin.jvm.internal.t.f(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] o(Object[] objArr, int i8, int i9) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        C0931k.b(i9, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i8, i9);
        kotlin.jvm.internal.t.f(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static final void p(byte[] bArr, byte b8, int i8, int i9) {
        kotlin.jvm.internal.t.g(bArr, "<this>");
        Arrays.fill(bArr, i8, i9, b8);
    }

    public static final void q(int[] iArr, int i8, int i9, int i10) {
        kotlin.jvm.internal.t.g(iArr, "<this>");
        Arrays.fill(iArr, i9, i10, i8);
    }

    public static final void r(long[] jArr, long j8, int i8, int i9) {
        kotlin.jvm.internal.t.g(jArr, "<this>");
        Arrays.fill(jArr, i8, i9, j8);
    }

    public static void s(Object[] objArr, Object obj, int i8, int i9) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        Arrays.fill(objArr, i8, i9, obj);
    }

    public static /* synthetic */ void t(byte[] bArr, byte b8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = bArr.length;
        }
        p(bArr, b8, i8, i9);
    }

    public static /* synthetic */ void u(int[] iArr, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = iArr.length;
        }
        q(iArr, i8, i9, i10);
    }

    public static /* synthetic */ void v(long[] jArr, long j8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = jArr.length;
        }
        r(jArr, j8, i8, i9);
    }

    public static /* synthetic */ void w(Object[] objArr, Object obj, int i8, int i9, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = objArr.length;
        }
        s(objArr, obj, i8, i9);
    }

    public static byte[] x(byte[] bArr, byte[] elements) {
        kotlin.jvm.internal.t.g(bArr, "<this>");
        kotlin.jvm.internal.t.g(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        kotlin.jvm.internal.t.d(bArrCopyOf);
        return bArrCopyOf;
    }

    public static int[] y(int[] iArr, int i8) {
        kotlin.jvm.internal.t.g(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i8;
        kotlin.jvm.internal.t.d(iArrCopyOf);
        return iArrCopyOf;
    }

    public static int[] z(int[] iArr, int[] elements) {
        kotlin.jvm.internal.t.g(iArr, "<this>");
        kotlin.jvm.internal.t.g(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, iArrCopyOf, length, length2);
        kotlin.jvm.internal.t.d(iArrCopyOf);
        return iArrCopyOf;
    }

    public static void D(Object[] objArr, Comparator comparator, int i8, int i9) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        kotlin.jvm.internal.t.g(comparator, BmWxZhjGfw.mkVNhcaFvCbpWA);
        Arrays.sort(objArr, i8, i9, comparator);
    }

    public static int[] g(int[] iArr, int[] iArr2, int i8, int i9, int i10) {
        kotlin.jvm.internal.t.g(iArr, "<this>");
        kotlin.jvm.internal.t.g(iArr2, mHPawN.WPgvxUqQtE);
        System.arraycopy(iArr, i9, iArr2, i8, i10 - i9);
        return iArr2;
    }
}
