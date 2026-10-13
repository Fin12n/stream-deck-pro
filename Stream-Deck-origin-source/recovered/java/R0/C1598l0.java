package R0;

import S0.AbstractC1628c;
import S0.AbstractC1629d;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: R0.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1598l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9405b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f9406c = AbstractC1602n0.d(4278190080L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f9407d = AbstractC1602n0.d(4282664004L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f9408e = AbstractC1602n0.d(4287137928L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f9409f = AbstractC1602n0.d(4291611852L);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f9410g = AbstractC1602n0.d(4294967295L);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f9411h = AbstractC1602n0.d(4294901760L);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f9412i = AbstractC1602n0.d(4278255360L);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f9413j = AbstractC1602n0.d(4278190335L);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f9414k = AbstractC1602n0.d(4294967040L);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f9415l = AbstractC1602n0.d(4278255615L);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f9416m = AbstractC1602n0.d(4294902015L);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f9417n = AbstractC1602n0.b(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f9418o = AbstractC1602n0.a(0.0f, 0.0f, 0.0f, 0.0f, S0.g.f9615a.y());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9419a;

    /* JADX INFO: renamed from: R0.l0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final long a() {
            return C1598l0.f9406c;
        }

        public final long b() {
            return C1598l0.f9413j;
        }

        public final long c() {
            return C1598l0.f9411h;
        }

        public final long d() {
            return C1598l0.f9417n;
        }

        public final long e() {
            return C1598l0.f9418o;
        }

        public final long f() {
            return C1598l0.f9410g;
        }

        public a() {
        }
    }

    public /* synthetic */ C1598l0(long j8) {
        this.f9419a = j8;
    }

    public static final /* synthetic */ C1598l0 g(long j8) {
        return new C1598l0(j8);
    }

    public static final float h(long j8) {
        return v(j8);
    }

    public static final float i(long j8) {
        return u(j8);
    }

    public static final float j(long j8) {
        return s(j8);
    }

    public static final float k(long j8) {
        return r(j8);
    }

    public static final long m(long j8, AbstractC1628c abstractC1628c) {
        AbstractC1628c abstractC1628cT = t(j8);
        return kotlin.jvm.internal.t.c(abstractC1628c, abstractC1628cT) ? j8 : AbstractC1629d.i(abstractC1628cT, abstractC1628c, 0, 2, null).e(v(j8), u(j8), s(j8), r(j8));
    }

    public static final long n(long j8, float f8, float f9, float f10, float f11) {
        return AbstractC1602n0.a(f9, f10, f11, f8, t(j8));
    }

    public static /* synthetic */ long o(long j8, float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = r(j8);
        }
        float f12 = f8;
        if ((i8 & 2) != 0) {
            f9 = v(j8);
        }
        float f13 = f9;
        if ((i8 & 4) != 0) {
            f10 = u(j8);
        }
        float f14 = f10;
        if ((i8 & 8) != 0) {
            f11 = s(j8);
        }
        return n(j8, f12, f13, f14, f11);
    }

    public static boolean p(long j8, Object obj) {
        return (obj instanceof C1598l0) && j8 == ((C1598l0) obj).y();
    }

    public static final boolean q(long j8, long j9) {
        return C6.A.d(j8, j9);
    }

    public static final float r(long j8) {
        float fC;
        float f8;
        if (C6.A.b(63 & j8) == 0) {
            fC = (float) C6.I.c(C6.A.b(C6.A.b(j8 >>> 56) & 255));
            f8 = 255.0f;
        } else {
            fC = (float) C6.I.c(C6.A.b(C6.A.b(j8 >>> 6) & 1023));
            f8 = 1023.0f;
        }
        return fC / f8;
    }

    public static final float s(long j8) {
        return C6.A.b(63 & j8) == 0 ? ((float) C6.I.c(C6.A.b(C6.A.b(j8 >>> 32) & 255))) / 255.0f : AbstractC1617v0.c(AbstractC1617v0.b((short) C6.A.b(C6.A.b(j8 >>> 16) & 65535)));
    }

    public static final AbstractC1628c t(long j8) {
        S0.g gVar = S0.g.f9615a;
        return gVar.l()[(int) C6.A.b(j8 & 63)];
    }

    public static final float u(long j8) {
        return C6.A.b(63 & j8) == 0 ? ((float) C6.I.c(C6.A.b(C6.A.b(j8 >>> 40) & 255))) / 255.0f : AbstractC1617v0.c(AbstractC1617v0.b((short) C6.A.b(C6.A.b(j8 >>> 32) & 65535)));
    }

    public static final float v(long j8) {
        return C6.A.b(63 & j8) == 0 ? ((float) C6.I.c(C6.A.b(C6.A.b(j8 >>> 48) & 255))) / 255.0f : AbstractC1617v0.c(AbstractC1617v0.b((short) C6.A.b(C6.A.b(j8 >>> 48) & 65535)));
    }

    public static int w(long j8) {
        return C6.A.e(j8);
    }

    public static String x(long j8) {
        return "Color(" + v(j8) + ", " + u(j8) + ", " + s(j8) + ", " + r(j8) + ", " + t(j8).h() + ')';
    }

    public boolean equals(Object obj) {
        return p(this.f9419a, obj);
    }

    public int hashCode() {
        return w(this.f9419a);
    }

    public String toString() {
        return x(this.f9419a);
    }

    public final /* synthetic */ long y() {
        return this.f9419a;
    }

    public static long l(long j8) {
        return j8;
    }
}
