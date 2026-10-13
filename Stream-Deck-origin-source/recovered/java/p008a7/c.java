package p008a7;

import D6.I;
import W6.i;
import W6.n;
import Z6.v;
import Z6.w;
import Z6.y;
import com.amazon.a.a.o.c.a.b;
import com.revenuecat.purchases.common.UtilsKt;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static final long i(long j8, int i8) {
        return a.s((j8 << 1) + ((long) i8));
    }

    public static final long j(long j8) {
        return a.s((j8 << 1) + 1);
    }

    public static final long k(long j8) {
        return (-4611686018426L > j8 || j8 >= 4611686018427L) ? j(n.m(j8, -4611686018427387903L, 4611686018427387903L)) : l(n(j8));
    }

    public static final long l(long j8) {
        return a.s(j8 << 1);
    }

    public static final long m(long j8) {
        return (-4611686018426999999L > j8 || j8 >= 4611686018427000000L) ? j(o(j8)) : l(j8);
    }

    public static final long n(long j8) {
        return j8 * ((long) UtilsKt.MICROS_MULTIPLIER);
    }

    public static final long o(long j8) {
        return j8 / ((long) UtilsKt.MICROS_MULTIPLIER);
    }

    public static final long p(String str, boolean z8) {
        int i8;
        char cCharAt;
        char cCharAt2;
        int i9;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        a.C0338a c0338a = a.f13446b;
        long jB = c0338a.b();
        char cCharAt3 = str.charAt(0);
        int length2 = (cCharAt3 == '+' || cCharAt3 == '-') ? 1 : 0;
        boolean z9 = length2 > 0;
        boolean z10 = z9 && w.F0(str, '-', false, 2, null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char c8 = ':';
        char c9 = '0';
        if (str.charAt(length2) == 'P') {
            int i10 = length2 + 1;
            if (i10 == length) {
                throw new IllegalArgumentException();
            }
            boolean z11 = false;
            d dVar = null;
            while (i10 < length) {
                if (str.charAt(i10) != 'T') {
                    int i11 = i10;
                    while (true) {
                        if (i11 >= str.length()) {
                            i9 = length;
                            break;
                        }
                        char cCharAt4 = str.charAt(i11);
                        if (c9 > cCharAt4 || cCharAt4 >= c8) {
                            i9 = length;
                            if (!w.L("+-.", cCharAt4, false, 2, null)) {
                                break;
                            }
                        } else {
                            i9 = length;
                        }
                        i11++;
                        length = i9;
                        c9 = '0';
                        c8 = ':';
                    }
                    t.e(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i10, i11);
                    t.f(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i10 + strSubstring.length();
                    if (length3 < 0 || length3 >= str.length()) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt5 = str.charAt(length3);
                    i10 = length3 + 1;
                    d dVarD = f.d(cCharAt5, z11);
                    if (dVar != null && dVar.compareTo(dVarD) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iX = w.X(strSubstring, b.f16789a, 0, false, 6, null);
                    if (dVarD != d.SECONDS || iX <= 0) {
                        jB = a.O(jB, t(q(strSubstring), dVarD));
                    } else {
                        t.e(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iX);
                        t.f(strSubstring2, "substring(...)");
                        long jO = a.O(jB, t(q(strSubstring2), dVarD));
                        t.e(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iX);
                        t.f(strSubstring3, "substring(...)");
                        jB = a.O(jO, r(Double.parseDouble(strSubstring3), dVarD));
                    }
                    z11 = z11;
                    dVar = dVarD;
                    length = i9;
                    c9 = '0';
                    c8 = ':';
                } else {
                    if (z11 || (i10 = i10 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z11 = true;
                }
            }
        } else {
            if (z8) {
                throw new IllegalArgumentException();
            }
            char c10 = '0';
            if (v.x(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jB = c0338a.a();
            } else {
                boolean z12 = !z9;
                if (z9 && str.charAt(length2) == '(' && y.b1(str) == ')') {
                    length2++;
                    int i12 = length - 1;
                    if (length2 == i12) {
                        throw new IllegalArgumentException("No components");
                    }
                    i8 = i12;
                    z12 = true;
                } else {
                    i8 = length;
                }
                boolean z13 = false;
                d dVar2 = null;
                while (length2 < i8) {
                    if (z13 && z12) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i13 = length2;
                    while (i13 < str.length() && ((c10 <= (cCharAt2 = str.charAt(i13)) && cCharAt2 < ':') || cCharAt2 == '.')) {
                        i13++;
                    }
                    t.e(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i13);
                    t.f(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i14 = length4;
                    while (i14 < str.length() && 'a' <= (cCharAt = str.charAt(i14)) && cCharAt < '{') {
                        i14++;
                    }
                    t.e(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i14);
                    t.f(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    d dVarE = f.e(strSubstring5);
                    if (dVar2 != null && dVar2.compareTo(dVarE) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iX2 = w.X(strSubstring4, b.f16789a, 0, false, 6, null);
                    if (iX2 > 0) {
                        t.e(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iX2);
                        t.f(strSubstring6, "substring(...)");
                        long jO2 = a.O(jB, t(Long.parseLong(strSubstring6), dVarE));
                        t.e(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iX2);
                        t.f(strSubstring7, "substring(...)");
                        jB = a.O(jO2, r(Double.parseDouble(strSubstring7), dVarE));
                        if (length2 < i8) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jB = a.O(jB, t(Long.parseLong(strSubstring4), dVarE));
                    }
                    dVar2 = dVarE;
                    z13 = true;
                    c10 = '0';
                }
            }
        }
        return z10 ? a.T(jB) : jB;
    }

    public static final long q(String str) {
        int length = str.length();
        int i8 = (length <= 0 || !w.L("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i8 > 16) {
            Iterable iVar = new i(i8, w.S(str));
            if (!(iVar instanceof Collection) || !((Collection) iVar).isEmpty()) {
                Iterator it = iVar.iterator();
                while (true) {
                    if (it.hasNext()) {
                        char cCharAt = str.charAt(((I) it).nextInt());
                        if ('0' > cCharAt || cCharAt >= ':') {
                        }
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return v.H(str, "+", false, 2, null) ? Long.parseLong(y.Y0(str, 1)) : Long.parseLong(str);
    }

    public static final long r(double d8, d unit) {
        t.g(unit, "unit");
        double dA = e.a(d8, unit, d.NANOSECONDS);
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jE = S6.c.e(dA);
        return (-4611686018426999999L > jE || jE >= 4611686018427000000L) ? k(S6.c.e(e.a(d8, unit, d.MILLISECONDS))) : l(jE);
    }

    public static final long s(int i8, d unit) {
        t.g(unit, "unit");
        return unit.compareTo(d.SECONDS) <= 0 ? l(e.c(i8, unit, d.NANOSECONDS)) : t(i8, unit);
    }

    public static final long t(long j8, d unit) {
        t.g(unit, "unit");
        d dVar = d.NANOSECONDS;
        long jC = e.c(4611686018426999999L, dVar, unit);
        return ((-jC) > j8 || j8 > jC) ? j(n.m(e.b(j8, unit, d.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : l(e.c(j8, unit, dVar));
    }
}
