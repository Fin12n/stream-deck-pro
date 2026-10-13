package p008a7;

import S6.c;
import W6.l;
import W6.n;
import Z6.w;
import com.amazon.a.a.o.c.a.b;
import com.revenuecat.purchases.common.UtilsKt;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p180u5.FCkZ.BpgIURjN;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0338a f13446b = new C0338a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f13447c = s(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f13448d = c.j(4611686018427387903L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f13449e = c.j(-4611686018427387903L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13450a;

    /* JADX INFO: renamed from: a7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0338a {
        public /* synthetic */ C0338a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final long a() {
            return a.f13448d;
        }

        public final long b() {
            return a.f13447c;
        }

        public final long c(String value) {
            t.g(value, "value");
            try {
                return c.p(value, true);
            } catch (IllegalArgumentException e8) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e8);
            }
        }

        public C0338a() {
        }
    }

    public /* synthetic */ a(long j8) {
        this.f13450a = j8;
    }

    public static final long A(long j8) {
        return R(j8, d.MINUTES);
    }

    public static final long B(long j8) {
        return R(j8, d.SECONDS);
    }

    public static final int C(long j8) {
        if (L(j8)) {
            return 0;
        }
        return (int) (A(j8) % ((long) 60));
    }

    public static final int D(long j8) {
        if (L(j8)) {
            return 0;
        }
        return (int) (J(j8) ? c.n(G(j8) % ((long) 1000)) : G(j8) % ((long) 1000000000));
    }

    public static final int E(long j8) {
        if (L(j8)) {
            return 0;
        }
        return (int) (B(j8) % ((long) 60));
    }

    public static final d F(long j8) {
        return K(j8) ? d.NANOSECONDS : d.MILLISECONDS;
    }

    public static final long G(long j8) {
        return j8 >> 1;
    }

    public static int H(long j8) {
        return Long.hashCode(j8);
    }

    public static final boolean I(long j8) {
        return !L(j8);
    }

    public static final boolean J(long j8) {
        return (((int) j8) & 1) == 1;
    }

    public static final boolean K(long j8) {
        return (((int) j8) & 1) == 0;
    }

    public static final boolean L(long j8) {
        return j8 == f13448d || j8 == f13449e;
    }

    public static final boolean M(long j8) {
        return j8 < 0;
    }

    public static final boolean N(long j8) {
        return j8 > 0;
    }

    public static final long O(long j8, long j9) {
        if (L(j8)) {
            if (I(j9) || (j9 ^ j8) >= 0) {
                return j8;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (L(j9)) {
            return j9;
        }
        if ((((int) j8) & 1) != (((int) j9) & 1)) {
            return J(j8) ? c(j8, G(j8), G(j9)) : c(j8, G(j9), G(j8));
        }
        long jG = G(j8) + G(j9);
        return K(j8) ? c.m(jG) : c.k(jG);
    }

    public static final long P(long j8, int i8) {
        if (L(j8)) {
            if (i8 != 0) {
                return i8 > 0 ? j8 : T(j8);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i8 == 0) {
            return f13447c;
        }
        long jG = G(j8);
        long j9 = i8;
        long j10 = jG * j9;
        if (!K(j8)) {
            if (j10 / j9 == jG) {
                return c.j(n.n(j10, new l(-4611686018427387903L, 4611686018427387903L)));
            }
            return c.b(jG) * c.a(i8) > 0 ? f13448d : f13449e;
        }
        if (-2147483647L <= jG && jG < 2147483648L) {
            return c.l(j10);
        }
        if (j10 / j9 == jG) {
            return c.m(j10);
        }
        long jO = c.o(jG);
        long j11 = jO * j9;
        long jO2 = c.o((jG - c.n(jO)) * j9) + j11;
        if (j11 / j9 != jO || (jO2 ^ j11) < 0) {
            return c.b(jG) * c.a(i8) > 0 ? f13448d : f13449e;
        }
        return c.j(n.n(jO2, new l(-4611686018427387903L, 4611686018427387903L)));
    }

    public static final long R(long j8, d unit) {
        t.g(unit, "unit");
        if (j8 == f13448d) {
            return Long.MAX_VALUE;
        }
        if (j8 == f13449e) {
            return Long.MIN_VALUE;
        }
        return e.b(G(j8), F(j8), unit);
    }

    public static final long T(long j8) {
        return c.i(-G(j8), ((int) j8) & 1);
    }

    public static final long c(long j8, long j9, long j10) {
        long jO = c.o(j10);
        long j11 = j9 + jO;
        if (-4611686018426L > j11 || j11 >= 4611686018427L) {
            return c.j(n.m(j11, -4611686018427387903L, 4611686018427387903L));
        }
        return c.l(c.n(j11) + (j10 - c.n(jO)));
    }

    public static final void d(long j8, StringBuilder sb, int i8, int i9, int i10, String str, boolean z8) {
        sb.append(i8);
        if (i9 != 0) {
            sb.append(b.f16789a);
            String strK0 = w.k0(String.valueOf(i9), i10, '0');
            int i11 = -1;
            int length = strK0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i12 = length - 1;
                    if (strK0.charAt(length) != '0') {
                        i11 = length;
                        break;
                    } else if (i12 < 0) {
                        break;
                    } else {
                        length = i12;
                    }
                }
            }
            int i13 = i11 + 1;
            if (z8 || i13 >= 3) {
                sb.append((CharSequence) strK0, 0, ((i11 + 3) / 3) * 3);
                t.f(sb, "append(...)");
            } else {
                sb.append((CharSequence) strK0, 0, i13);
                t.f(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static final /* synthetic */ a e(long j8) {
        return new a(j8);
    }

    public static int m(long j8, long j9) {
        long j10 = j8 ^ j9;
        if (j10 < 0 || (((int) j10) & 1) == 0) {
            return t.i(j8, j9);
        }
        int i8 = (((int) j8) & 1) - (((int) j9) & 1);
        return M(j8) ? -i8 : i8;
    }

    public static long s(long j8) {
        if (!b.a()) {
            return j8;
        }
        if (K(j8)) {
            long jG = G(j8);
            if (-4611686018426999999L <= jG && jG < 4611686018427000000L) {
                return j8;
            }
            throw new AssertionError(G(j8) + " ns is out of nanoseconds range");
        }
        long jG2 = G(j8);
        if (-4611686018427387903L > jG2 || jG2 >= 4611686018427387904L) {
            throw new AssertionError(G(j8) + " ms is out of milliseconds range");
        }
        long jG3 = G(j8);
        if (-4611686018426L > jG3 || jG3 >= 4611686018427L) {
            return j8;
        }
        throw new AssertionError(G(j8) + " ms is denormalized");
    }

    public static boolean t(long j8, Object obj) {
        return (obj instanceof a) && j8 == ((a) obj).U();
    }

    public static final boolean u(long j8, long j9) {
        return j8 == j9;
    }

    public static final long v(long j8) {
        return M(j8) ? T(j8) : j8;
    }

    public static final int w(long j8) {
        if (L(j8)) {
            return 0;
        }
        return (int) (y(j8) % ((long) 24));
    }

    public static final long x(long j8) {
        return R(j8, d.DAYS);
    }

    public static final long y(long j8) {
        return R(j8, d.HOURS);
    }

    public static final long z(long j8) {
        return (J(j8) && I(j8)) ? G(j8) : R(j8, d.MILLISECONDS);
    }

    public final /* synthetic */ long U() {
        return this.f13450a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return j(((a) obj).U());
    }

    public boolean equals(Object obj) {
        return t(this.f13450a, obj);
    }

    public int hashCode() {
        return H(this.f13450a);
    }

    public int j(long j8) {
        return m(this.f13450a, j8);
    }

    public String toString() {
        return S(this.f13450a);
    }

    public static final String Q(long j8) {
        StringBuilder sb = new StringBuilder();
        if (M(j8)) {
            sb.append('-');
        }
        sb.append("PT");
        long jV = v(j8);
        long jY = y(jV);
        int iC = C(jV);
        int iE = E(jV);
        int iD = D(jV);
        long j9 = L(j8) ? 9999999999999L : jY;
        boolean z8 = false;
        boolean z9 = j9 != 0;
        boolean z10 = (iE == 0 && iD == 0) ? false : true;
        if (iC != 0 || (z10 && z9)) {
            z8 = true;
        }
        if (z9) {
            sb.append(j9);
            sb.append('H');
        }
        if (z8) {
            sb.append(iC);
            sb.append('M');
        }
        if (z10 || (!z9 && !z8)) {
            d(j8, sb, iE, iD, 9, "S", true);
        }
        String string = sb.toString();
        t.f(string, BpgIURjN.svXo);
        return string;
    }

    public static String S(long j8) {
        if (j8 == 0) {
            return "0s";
        }
        if (j8 == f13448d) {
            return hJroAgFztiMK.kTF;
        }
        if (j8 == f13449e) {
            return "-Infinity";
        }
        boolean zM = M(j8);
        StringBuilder sb = new StringBuilder();
        if (zM) {
            sb.append('-');
        }
        long jV = v(j8);
        long jX = x(jV);
        int iW = w(jV);
        int iC = C(jV);
        int iE = E(jV);
        int iD = D(jV);
        int i8 = 0;
        boolean z8 = jX != 0;
        boolean z9 = iW != 0;
        boolean z10 = iC != 0;
        boolean z11 = (iE == 0 && iD == 0) ? false : true;
        if (z8) {
            sb.append(jX);
            sb.append('d');
            i8 = 1;
        }
        if (z9 || (z8 && (z10 || z11))) {
            int i9 = i8 + 1;
            if (i8 > 0) {
                sb.append(' ');
            }
            sb.append(iW);
            sb.append('h');
            i8 = i9;
        }
        if (z10 || (z11 && (z9 || z8))) {
            int i10 = i8 + 1;
            if (i8 > 0) {
                sb.append(' ');
            }
            sb.append(iC);
            sb.append('m');
            i8 = i10;
        }
        if (z11) {
            int i11 = i8 + 1;
            if (i8 > 0) {
                sb.append(' ');
            }
            if (iE != 0 || z8 || z9 || z10) {
                d(j8, sb, iE, iD, 9, "s", false);
            } else if (iD >= 1000000) {
                d(j8, sb, iD / UtilsKt.MICROS_MULTIPLIER, iD % UtilsKt.MICROS_MULTIPLIER, 6, "ms", false);
            } else if (iD >= 1000) {
                d(j8, sb, iD / 1000, iD % 1000, 3, "us", false);
            } else {
                sb.append(iD);
                sb.append("ns");
            }
            i8 = i11;
        }
        if (zM && i8 > 1) {
            sb.insert(1, '(').append(')');
        }
        String string = sb.toString();
        t.f(string, "toString(...)");
        return string;
    }
}
