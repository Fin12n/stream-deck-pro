package D6;

import M6.eLZq.eGwOBWCdOTaKus;
import R0.pkXL.Oitvkwcwn;
import io.sentry.exception.uXy.SZCvugJaXc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2625c;
import p043e6.dT.GIGvBf;

/* JADX INFO: renamed from: D6.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C0934n extends C0933m {

    /* JADX INFO: renamed from: D6.n$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Iterable, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object[] f1954a;

        public a(Object[] objArr) {
            this.f1954a = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return AbstractC2625c.a(this.f1954a);
        }
    }

    /* JADX INFO: renamed from: D6.n$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object[] f1955a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object[] objArr) {
            super(0);
            this.f1955a = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke() {
            return AbstractC2625c.a(this.f1955a);
        }
    }

    public static Iterable E(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        return objArr.length == 0 ? r.n() : new a(objArr);
    }

    public static boolean F(byte[] bArr, byte b8) {
        kotlin.jvm.internal.t.g(bArr, "<this>");
        return V(bArr, b8) >= 0;
    }

    public static boolean G(int[] iArr, int i8) {
        kotlin.jvm.internal.t.g(iArr, "<this>");
        return W(iArr, i8) >= 0;
    }

    public static boolean H(long[] jArr, long j8) {
        kotlin.jvm.internal.t.g(jArr, "<this>");
        return X(jArr, j8) >= 0;
    }

    public static boolean I(Object[] objArr, Object obj) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        return Y(objArr, obj) >= 0;
    }

    public static boolean J(short[] sArr, short s8) {
        kotlin.jvm.internal.t.g(sArr, "<this>");
        return Z(sArr, s8) >= 0;
    }

    public static List K(Object[] objArr, int i8) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        if (i8 >= 0) {
            return p0(objArr, W6.n.d(objArr.length - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static List L(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        return (List) M(objArr, new ArrayList());
    }

    public static final Collection M(Object[] objArr, Collection destination) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        kotlin.jvm.internal.t.g(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static Object O(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static W6.i Q(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        return new W6.i(0, T(objArr));
    }

    public static int R(int[] iArr) {
        kotlin.jvm.internal.t.g(iArr, "<this>");
        return iArr.length - 1;
    }

    public static int S(long[] jArr) {
        kotlin.jvm.internal.t.g(jArr, "<this>");
        return jArr.length - 1;
    }

    public static int T(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Object U(Object[] objArr, int i8) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        if (i8 < 0 || i8 >= objArr.length) {
            return null;
        }
        return objArr[i8];
    }

    public static final int V(byte[] bArr, byte b8) {
        kotlin.jvm.internal.t.g(bArr, "<this>");
        int length = bArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (b8 == bArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static final int W(int[] iArr, int i8) {
        kotlin.jvm.internal.t.g(iArr, "<this>");
        int length = iArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (i8 == iArr[i9]) {
                return i9;
            }
        }
        return -1;
    }

    public static final int X(long[] jArr, long j8) {
        kotlin.jvm.internal.t.g(jArr, "<this>");
        int length = jArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (j8 == jArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static int Y(Object[] objArr, Object obj) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        int i8 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i8 < length) {
                if (objArr[i8] == null) {
                    return i8;
                }
                i8++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i8 < length2) {
            if (kotlin.jvm.internal.t.c(obj, objArr[i8])) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static final int Z(short[] sArr, short s8) {
        kotlin.jvm.internal.t.g(sArr, "<this>");
        int length = sArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (s8 == sArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static final Appendable a0(byte[] bArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Q6.k kVar) throws IOException {
        kotlin.jvm.internal.t.g(bArr, "<this>");
        kotlin.jvm.internal.t.g(buffer, "buffer");
        kotlin.jvm.internal.t.g(separator, "separator");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        kotlin.jvm.internal.t.g(postfix, "postfix");
        kotlin.jvm.internal.t.g(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (byte b8 : bArr) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            if (kVar != null) {
                buffer.append((CharSequence) kVar.invoke(Byte.valueOf(b8)));
            } else {
                buffer.append(String.valueOf((int) b8));
            }
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable b0(Object[] objArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Q6.k kVar) throws IOException {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        kotlin.jvm.internal.t.g(buffer, "buffer");
        kotlin.jvm.internal.t.g(separator, "separator");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        kotlin.jvm.internal.t.g(postfix, "postfix");
        kotlin.jvm.internal.t.g(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (Object obj : objArr) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            Z6.n.a(buffer, obj, kVar);
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String d0(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Q6.k kVar) {
        kotlin.jvm.internal.t.g(bArr, "<this>");
        kotlin.jvm.internal.t.g(separator, "separator");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        kotlin.jvm.internal.t.g(postfix, "postfix");
        kotlin.jvm.internal.t.g(truncated, "truncated");
        String string = ((StringBuilder) a0(bArr, new StringBuilder(), separator, prefix, postfix, i8, truncated, kVar)).toString();
        kotlin.jvm.internal.t.f(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String f0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, Q6.k kVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i9 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i9 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i9 & 8) != 0) {
            i8 = -1;
        }
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i9 & 32) != 0) {
            kVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        Q6.k kVar2 = kVar;
        return d0(bArr, charSequence, charSequence2, charSequence3, i8, charSequence5, kVar2);
    }

    public static /* synthetic */ String g0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, Q6.k kVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i9 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i9 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i9 & 8) != 0) {
            i8 = -1;
        }
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i9 & 32) != 0) {
            kVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        Q6.k kVar2 = kVar;
        return e0(objArr, charSequence, charSequence2, charSequence3, i8, charSequence5, kVar2);
    }

    public static Object h0(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[T(objArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int i0(Object[] objArr, Object obj) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i8 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i8 >= 0) {
                        length = i8;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i9 = length2 - 1;
                    if (kotlin.jvm.internal.t.c(obj, objArr[length2])) {
                        return length2;
                    }
                    if (i9 < 0) {
                        break;
                    }
                    length2 = i9;
                }
            }
        }
        return -1;
    }

    public static Object j0(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[objArr.length - 1];
    }

    public static char k0(char[] cArr) {
        kotlin.jvm.internal.t.g(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object l0(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static byte[] m0(byte[] bArr, W6.i indices) {
        kotlin.jvm.internal.t.g(bArr, "<this>");
        kotlin.jvm.internal.t.g(indices, "indices");
        return indices.isEmpty() ? new byte[0] : C0933m.n(bArr, indices.c().intValue(), indices.o().intValue() + 1);
    }

    public static final Object[] n0(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        kotlin.jvm.internal.t.g(comparator, "comparator");
        if (objArr.length == 0) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.t.f(objArrCopyOf, "copyOf(...)");
        C0933m.C(objArrCopyOf, comparator);
        return objArrCopyOf;
    }

    public static List o0(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        kotlin.jvm.internal.t.g(comparator, "comparator");
        return C0933m.c(n0(objArr, comparator));
    }

    public static final Collection q0(Object[] objArr, Collection destination) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        kotlin.jvm.internal.t.g(destination, "destination");
        for (Object obj : objArr) {
            destination.add(obj);
        }
        return destination;
    }

    public static List r0(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? t0(objArr) : C0937q.e(objArr[0]);
        }
        return r.n();
    }

    public static List s0(int[] iArr) {
        kotlin.jvm.internal.t.g(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i8 : iArr) {
            arrayList.add(Integer.valueOf(i8));
        }
        return arrayList;
    }

    public static List t0(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        return new ArrayList(r.i(objArr));
    }

    public static final Set u0(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? (Set) q0(objArr, new LinkedHashSet(L.d(objArr.length))) : S.c(objArr[0]);
        }
        return T.d();
    }

    public static Iterable v0(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        return new G(new b(objArr));
    }

    public static List w0(Object[] objArr, Object[] other) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        kotlin.jvm.internal.t.g(other, "other");
        int iMin = Math.min(objArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(C6.v.a(objArr[i8], other[i8]));
        }
        return arrayList;
    }

    public static Object N(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, GIGvBf.EAArDiB);
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static W6.i P(int[] iArr) {
        kotlin.jvm.internal.t.g(iArr, SZCvugJaXc.geoagKZJuvzhcC);
        return new W6.i(0, R(iArr));
    }

    public static final String e0(Object[] objArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Q6.k kVar) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        kotlin.jvm.internal.t.g(separator, "separator");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        kotlin.jvm.internal.t.g(postfix, "postfix");
        kotlin.jvm.internal.t.g(truncated, "truncated");
        String string = ((StringBuilder) b0(objArr, new StringBuilder(), separator, prefix, postfix, i8, truncated, kVar)).toString();
        kotlin.jvm.internal.t.f(string, Oitvkwcwn.XdvUmLhYEUCvzOw);
        return string;
    }

    public static final List p0(Object[] objArr, int i8) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + eGwOBWCdOTaKus.TAU).toString());
        }
        if (i8 == 0) {
            return r.n();
        }
        int length = objArr.length;
        if (i8 >= length) {
            return r0(objArr);
        }
        if (i8 == 1) {
            return C0937q.e(objArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = length - i8; i9 < length; i9++) {
            arrayList.add(objArr[i9]);
        }
        return arrayList;
    }
}
