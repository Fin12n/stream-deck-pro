package S0;

import D6.C0933m;
import R0.AbstractC1602n0;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class A extends AbstractC1628c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f9573t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final i f9574u = new i() { // from class: S0.s
        @Override // S0.i
        public final double a(double d8) {
            return A.B(d8);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C f9575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f9576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f9577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final B f9578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f9579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f9580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f9581k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f9582l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Q6.k f9583m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i f9584n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i f9585o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Q6.k f9586p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f9587q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f9588r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f9589s;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final float f(float[] fArr) {
            float f8 = fArr[0];
            float f9 = fArr[1];
            float f10 = fArr[2];
            float f11 = fArr[3];
            float f12 = fArr[4];
            float f13 = fArr[5];
            float f14 = ((((((f8 * f11) + (f9 * f12)) + (f10 * f13)) - (f11 * f12)) - (f9 * f10)) - (f8 * f13)) * 0.5f;
            return f14 < 0.0f ? -f14 : f14;
        }

        public final boolean g(double d8, i iVar, i iVar2) {
            return Math.abs(iVar.a(d8) - iVar2.a(d8)) <= 0.001d;
        }

        public final float[] h(float[] fArr) {
            float[] fArrM = AbstractC1629d.m(fArr, new float[]{1.0f, 0.0f, 0.0f});
            float[] fArrM2 = AbstractC1629d.m(fArr, new float[]{0.0f, 1.0f, 0.0f});
            float[] fArrM3 = AbstractC1629d.m(fArr, new float[]{0.0f, 0.0f, 1.0f});
            float f8 = fArrM[0];
            float f9 = fArrM[1];
            float f10 = f8 + f9 + fArrM[2];
            float f11 = fArrM2[0];
            float f12 = fArrM2[1];
            float f13 = f11 + f12 + fArrM2[2];
            float f14 = fArrM3[0];
            float f15 = fArrM3[1];
            float f16 = f14 + f15 + fArrM3[2];
            return new float[]{f8 / f10, f9 / f10, f11 / f13, f12 / f13, f14 / f16, f15 / f16};
        }

        public final C i(float[] fArr) {
            float[] fArrM = AbstractC1629d.m(fArr, new float[]{1.0f, 1.0f, 1.0f});
            float f8 = fArrM[0];
            float f9 = fArrM[1];
            float f10 = f8 + f9 + fArrM[2];
            return new C(f8 / f10, f9 / f10);
        }

        public final float[] j(float[] fArr, C c8) {
            float f8 = fArr[0];
            float f9 = fArr[1];
            float f10 = fArr[2];
            float f11 = fArr[3];
            float f12 = fArr[4];
            float f13 = fArr[5];
            float fA = c8.a();
            float fB = c8.b();
            float f14 = 1;
            float f15 = (f14 - f8) / f9;
            float f16 = (f14 - f10) / f11;
            float f17 = (f14 - f12) / f13;
            float f18 = (f14 - fA) / fB;
            float f19 = f8 / f9;
            float f20 = (f10 / f11) - f19;
            float f21 = (fA / fB) - f19;
            float f22 = f16 - f15;
            float f23 = (f12 / f13) - f19;
            float f24 = (((f18 - f15) * f20) - (f21 * f22)) / (((f17 - f15) * f20) - (f22 * f23));
            float f25 = (f21 - (f23 * f24)) / f20;
            float f26 = (1.0f - f25) - f24;
            float f27 = f26 / f9;
            float f28 = f25 / f11;
            float f29 = f24 / f13;
            return new float[]{f27 * f8, f26, f27 * ((1.0f - f8) - f9), f28 * f10, f25, f28 * ((1.0f - f10) - f11), f29 * f12, f24, f29 * ((1.0f - f12) - f13)};
        }

        public final boolean k(float[] fArr, float[] fArr2) {
            float f8 = fArr[0];
            float f9 = fArr2[0];
            float f10 = fArr[1];
            float f11 = fArr2[1];
            float f12 = fArr[2] - fArr2[2];
            float f13 = fArr[3] - fArr2[3];
            float f14 = fArr[4];
            float f15 = fArr2[4];
            float f16 = fArr[5];
            float f17 = fArr2[5];
            float[] fArr3 = {f8 - f9, f10 - f11, f12, f13, f14 - f15, f16 - f17};
            return l(fArr3[0], fArr3[1], f9 - f15, f11 - f17) >= 0.0f && l(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) >= 0.0f && l(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) >= 0.0f && l(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) >= 0.0f && l(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) >= 0.0f && l(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) >= 0.0f;
        }

        public final float l(float f8, float f9, float f10, float f11) {
            return (f8 * f11) - (f9 * f10);
        }

        public final boolean m(float[] fArr, C c8, i iVar, i iVar2, float f8, float f9, int i8) {
            if (i8 == 0) {
                return true;
            }
            g gVar = g.f9615a;
            if (!AbstractC1629d.g(fArr, gVar.x()) || !AbstractC1629d.f(c8, j.f9652a.e()) || f8 != 0.0f || f9 != 1.0f) {
                return false;
            }
            A aW = gVar.w();
            for (double d8 = 0.0d; d8 <= 1.0d; d8 += 0.00392156862745098d) {
                if (!g(d8, iVar, aW.V()) || !g(d8, iVar2, aW.R())) {
                    return false;
                }
            }
            return true;
        }

        public final boolean n(float[] fArr, float f8, float f9) {
            float f10 = f(fArr);
            g gVar = g.f9615a;
            if (f10 / f(gVar.s()) <= 0.9f || !k(fArr, gVar.x())) {
                return f8 < 0.0f && f9 > 1.0f;
            }
            return true;
        }

        public final float[] o(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length != 9) {
                C0933m.k(fArr, fArr2, 0, 0, 6, 6, null);
                return fArr2;
            }
            float f8 = fArr[0];
            float f9 = fArr[1];
            float f10 = f8 + f9 + fArr[2];
            fArr2[0] = f8 / f10;
            fArr2[1] = f9 / f10;
            float f11 = fArr[3];
            float f12 = fArr[4];
            float f13 = f11 + f12 + fArr[5];
            fArr2[2] = f11 / f13;
            fArr2[3] = f12 / f13;
            float f14 = fArr[6];
            float f15 = fArr[7];
            float f16 = f14 + f15 + fArr[8];
            fArr2[4] = f14 / f16;
            fArr2[5] = f15 / f16;
            return fArr2;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Q6.k {
        public b() {
            super(1);
        }

        public final Double b(double d8) {
            return Double.valueOf(A.this.R().a(W6.n.i(d8, A.this.f9576f, A.this.f9577g)));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends kotlin.jvm.internal.u implements Q6.k {
        public c() {
            super(1);
        }

        public final Double b(double d8) {
            return Double.valueOf(W6.n.i(A.this.V().a(d8), A.this.f9576f, A.this.f9577g));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).doubleValue());
        }
    }

    public A(String str, float[] fArr, C c8, float[] fArr2, i iVar, i iVar2, float f8, float f9, B b8, int i8) {
        super(str, AbstractC1627b.f9606a.b(), i8, null);
        this.f9575e = c8;
        this.f9576f = f8;
        this.f9577g = f9;
        this.f9578h = b8;
        this.f9582l = iVar;
        this.f9583m = new c();
        this.f9584n = new i() { // from class: S0.n
            @Override // S0.i
            public final double a(double d8) {
                return A.a0(this.f9674a, d8);
            }
        };
        this.f9585o = iVar2;
        this.f9586p = new b();
        this.f9587q = new i() { // from class: S0.r
            @Override // S0.i
            public final double a(double d8) {
                return A.O(this.f9678a, d8);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f8 >= f9) {
            throw new IllegalArgumentException("Invalid range: min=" + f8 + ", max=" + f9 + "; min must be strictly < max");
        }
        a aVar = f9573t;
        float[] fArrO = aVar.o(fArr);
        this.f9579i = fArrO;
        if (fArr2 == null) {
            this.f9580j = aVar.j(fArrO, c8);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f9580j = fArr2;
        }
        this.f9581k = AbstractC1629d.j(this.f9580j);
        this.f9588r = aVar.n(fArrO, f8, f9);
        this.f9589s = aVar.m(fArrO, c8, iVar, iVar2, f8, f9, i8);
    }

    public static final double C(double d8, double d9) {
        if (d9 < 0.0d) {
            d9 = 0.0d;
        }
        return Math.pow(d9, 1.0d / d8);
    }

    public static final double D(double d8, double d9) {
        if (d9 < 0.0d) {
            d9 = 0.0d;
        }
        return Math.pow(d9, d8);
    }

    public static final double E(Q6.k kVar, double d8) {
        return ((Number) kVar.invoke(Double.valueOf(d8))).doubleValue();
    }

    public static final double F(Q6.k kVar, double d8) {
        return ((Number) kVar.invoke(Double.valueOf(d8))).doubleValue();
    }

    public static final double G(Q6.k kVar, double d8) {
        return ((Number) kVar.invoke(Double.valueOf(d8))).doubleValue();
    }

    public static final double H(Q6.k kVar, double d8) {
        return ((Number) kVar.invoke(Double.valueOf(d8))).doubleValue();
    }

    public static final double I(B b8, double d8) {
        return AbstractC1629d.q(d8, b8.a(), b8.b(), b8.c(), b8.d(), b8.g());
    }

    public static final double J(B b8, double d8) {
        return AbstractC1629d.r(d8, b8.a(), b8.b(), b8.c(), b8.d(), b8.e(), b8.f(), b8.g());
    }

    public static final double K(B b8, double d8) {
        return AbstractC1629d.s(d8, b8.a(), b8.b(), b8.c(), b8.d(), b8.g());
    }

    public static final double L(B b8, double d8) {
        return AbstractC1629d.t(d8, b8.a(), b8.b(), b8.c(), b8.d(), b8.e(), b8.f(), b8.g());
    }

    public static final double O(A a8, double d8) {
        return a8.f9585o.a(W6.n.i(d8, a8.f9576f, a8.f9577g));
    }

    public static final double a0(A a8, double d8) {
        return W6.n.i(a8.f9582l.a(d8), a8.f9576f, a8.f9577g);
    }

    public final Q6.k P() {
        return this.f9586p;
    }

    public final i Q() {
        return this.f9587q;
    }

    public final i R() {
        return this.f9585o;
    }

    public final float[] S() {
        return this.f9581k;
    }

    public final Q6.k T() {
        return this.f9583m;
    }

    public final i U() {
        return this.f9584n;
    }

    public final i V() {
        return this.f9582l;
    }

    public final float[] W() {
        return this.f9579i;
    }

    public final B X() {
        return this.f9578h;
    }

    public final float[] Y() {
        return this.f9580j;
    }

    public final C Z() {
        return this.f9575e;
    }

    @Override // S0.AbstractC1628c
    public float[] b(float[] fArr) {
        AbstractC1629d.m(this.f9581k, fArr);
        fArr[0] = (float) this.f9584n.a(fArr[0]);
        fArr[1] = (float) this.f9584n.a(fArr[1]);
        fArr[2] = (float) this.f9584n.a(fArr[2]);
        return fArr;
    }

    @Override // S0.AbstractC1628c
    public float e(int i8) {
        return this.f9577g;
    }

    @Override // S0.AbstractC1628c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || A.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        A a8 = (A) obj;
        if (Float.compare(a8.f9576f, this.f9576f) != 0 || Float.compare(a8.f9577g, this.f9577g) != 0 || !kotlin.jvm.internal.t.c(this.f9575e, a8.f9575e) || !Arrays.equals(this.f9579i, a8.f9579i)) {
            return false;
        }
        B b8 = this.f9578h;
        if (b8 != null) {
            return kotlin.jvm.internal.t.c(b8, a8.f9578h);
        }
        if (a8.f9578h == null) {
            return true;
        }
        if (kotlin.jvm.internal.t.c(this.f9582l, a8.f9582l)) {
            return kotlin.jvm.internal.t.c(this.f9585o, a8.f9585o);
        }
        return false;
    }

    @Override // S0.AbstractC1628c
    public float f(int i8) {
        return this.f9576f;
    }

    @Override // S0.AbstractC1628c
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.f9575e.hashCode()) * 31) + Arrays.hashCode(this.f9579i)) * 31;
        float f8 = this.f9576f;
        int iFloatToIntBits = (iHashCode + (f8 == 0.0f ? 0 : Float.floatToIntBits(f8))) * 31;
        float f9 = this.f9577g;
        int iFloatToIntBits2 = (iFloatToIntBits + (f9 == 0.0f ? 0 : Float.floatToIntBits(f9))) * 31;
        B b8 = this.f9578h;
        int iHashCode2 = iFloatToIntBits2 + (b8 != null ? b8.hashCode() : 0);
        return this.f9578h == null ? (((iHashCode2 * 31) + this.f9582l.hashCode()) * 31) + this.f9585o.hashCode() : iHashCode2;
    }

    @Override // S0.AbstractC1628c
    public boolean i() {
        return this.f9589s;
    }

    @Override // S0.AbstractC1628c
    public long j(float f8, float f9, float f10) {
        float fA = (float) this.f9587q.a(f8);
        float fA2 = (float) this.f9587q.a(f9);
        float fA3 = (float) this.f9587q.a(f10);
        return (((long) Float.floatToRawIntBits(AbstractC1629d.n(this.f9580j, fA, fA2, fA3))) << 32) | (((long) Float.floatToRawIntBits(AbstractC1629d.o(this.f9580j, fA, fA2, fA3))) & 4294967295L);
    }

    @Override // S0.AbstractC1628c
    public float[] l(float[] fArr) {
        fArr[0] = (float) this.f9587q.a(fArr[0]);
        fArr[1] = (float) this.f9587q.a(fArr[1]);
        fArr[2] = (float) this.f9587q.a(fArr[2]);
        return AbstractC1629d.m(this.f9580j, fArr);
    }

    @Override // S0.AbstractC1628c
    public float m(float f8, float f9, float f10) {
        return AbstractC1629d.p(this.f9580j, (float) this.f9587q.a(f8), (float) this.f9587q.a(f9), (float) this.f9587q.a(f10));
    }

    @Override // S0.AbstractC1628c
    public long n(float f8, float f9, float f10, float f11, AbstractC1628c abstractC1628c) {
        return AbstractC1602n0.a((float) this.f9584n.a(AbstractC1629d.n(this.f9581k, f8, f9, f10)), (float) this.f9584n.a(AbstractC1629d.o(this.f9581k, f8, f9, f10)), (float) this.f9584n.a(AbstractC1629d.p(this.f9581k, f8, f9, f10)), f11, abstractC1628c);
    }

    public static final double B(double d8) {
        return d8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public A(String str, float[] fArr, final Q6.k kVar, final Q6.k kVar2) {
        a aVar = f9573t;
        this(str, aVar.h(fArr), aVar.i(fArr), null, new i() { // from class: S0.t
            @Override // S0.i
            public final double a(double d8) {
                return A.E(kVar, d8);
            }
        }, new i() { // from class: S0.u
            @Override // S0.i
            public final double a(double d8) {
                return A.F(kVar2, d8);
            }
        }, 0.0f, 1.0f, null, -1);
    }

    public A(String str, float[] fArr, C c8, final Q6.k kVar, final Q6.k kVar2, float f8, float f9) {
        this(str, fArr, c8, null, new i() { // from class: S0.x
            @Override // S0.i
            public final double a(double d8) {
                return A.G(kVar, d8);
            }
        }, new i() { // from class: S0.y
            @Override // S0.i
            public final double a(double d8) {
                return A.H(kVar2, d8);
            }
        }, f8, f9, null, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public A(String str, float[] fArr, B b8) {
        a aVar = f9573t;
        this(str, aVar.h(fArr), aVar.i(fArr), b8, -1);
    }

    public A(String str, float[] fArr, C c8, B b8) {
        this(str, fArr, c8, b8, -1);
    }

    public A(String str, float[] fArr, C c8, final B b8, int i8) {
        this(str, fArr, c8, null, (b8.e() == 0.0d && b8.f() == 0.0d) ? new i() { // from class: S0.z
            @Override // S0.i
            public final double a(double d8) {
                return A.I(b8, d8);
            }
        } : new i() { // from class: S0.o
            @Override // S0.i
            public final double a(double d8) {
                return A.J(b8, d8);
            }
        }, (b8.e() == 0.0d && b8.f() == 0.0d) ? new i() { // from class: S0.p
            @Override // S0.i
            public final double a(double d8) {
                return A.K(b8, d8);
            }
        } : new i() { // from class: S0.q
            @Override // S0.i
            public final double a(double d8) {
                return A.L(b8, d8);
            }
        }, 0.0f, 1.0f, b8, i8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public A(String str, float[] fArr, double d8) {
        a aVar = f9573t;
        this(str, aVar.h(fArr), aVar.i(fArr), d8, 0.0f, 1.0f, -1);
    }

    public A(String str, float[] fArr, C c8, double d8) {
        this(str, fArr, c8, d8, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public A(String str, float[] fArr, C c8, final double d8, float f8, float f9, int i8) {
        i iVar;
        i iVar2;
        if (d8 == 1.0d) {
            iVar = f9574u;
        } else {
            iVar = new i() { // from class: S0.v
                @Override // S0.i
                public final double a(double d9) {
                    return A.C(d8, d9);
                }
            };
        }
        i iVar3 = iVar;
        if (d8 == 1.0d) {
            iVar2 = f9574u;
        } else {
            iVar2 = new i() { // from class: S0.w
                @Override // S0.i
                public final double a(double d9) {
                    return A.D(d8, d9);
                }
            };
        }
        this(str, fArr, c8, null, iVar3, iVar2, f8, f9, new B(d8, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i8);
    }

    public A(A a8, float[] fArr, C c8) {
        this(a8.h(), a8.f9579i, c8, fArr, a8.f9582l, a8.f9585o, a8.f9576f, a8.f9577g, a8.f9578h, -1);
    }
}
