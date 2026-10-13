package T0;

import A1.t;
import C6.m;
import Q0.l;
import R0.AbstractC1582d0;
import R0.AbstractC1615u0;
import R0.C1598l0;
import R0.C1600m0;
import R0.F0;
import R0.G0;
import R0.H0;
import R0.I0;
import R0.InterfaceC1586f0;
import R0.InterfaceC1621x0;
import R0.M;
import R0.V0;
import R0.W0;
import R0.X;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0273a f9796a = new C0273a(null, null, null, 0, 15, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f9797b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public F0 f9798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public F0 f9799d;

    /* JADX INFO: renamed from: T0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0273a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public A1.d f9800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public t f9801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public InterfaceC1586f0 f9802c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f9803d;

        public /* synthetic */ C0273a(A1.d dVar, t tVar, InterfaceC1586f0 interfaceC1586f0, long j8, AbstractC2633k abstractC2633k) {
            this(dVar, tVar, interfaceC1586f0, j8);
        }

        public final A1.d a() {
            return this.f9800a;
        }

        public final t b() {
            return this.f9801b;
        }

        public final InterfaceC1586f0 c() {
            return this.f9802c;
        }

        public final long d() {
            return this.f9803d;
        }

        public final InterfaceC1586f0 e() {
            return this.f9802c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0273a)) {
                return false;
            }
            C0273a c0273a = (C0273a) obj;
            return kotlin.jvm.internal.t.c(this.f9800a, c0273a.f9800a) && this.f9801b == c0273a.f9801b && kotlin.jvm.internal.t.c(this.f9802c, c0273a.f9802c) && l.f(this.f9803d, c0273a.f9803d);
        }

        public final A1.d f() {
            return this.f9800a;
        }

        public final t g() {
            return this.f9801b;
        }

        public final long h() {
            return this.f9803d;
        }

        public int hashCode() {
            return (((((this.f9800a.hashCode() * 31) + this.f9801b.hashCode()) * 31) + this.f9802c.hashCode()) * 31) + l.j(this.f9803d);
        }

        public final void i(InterfaceC1586f0 interfaceC1586f0) {
            this.f9802c = interfaceC1586f0;
        }

        public final void j(A1.d dVar) {
            this.f9800a = dVar;
        }

        public final void k(t tVar) {
            this.f9801b = tVar;
        }

        public final void l(long j8) {
            this.f9803d = j8;
        }

        public String toString() {
            return "DrawParams(density=" + this.f9800a + ", layoutDirection=" + this.f9801b + ", canvas=" + this.f9802c + ", size=" + ((Object) l.l(this.f9803d)) + ')';
        }

        public C0273a(A1.d dVar, t tVar, InterfaceC1586f0 interfaceC1586f0, long j8) {
            this.f9800a = dVar;
            this.f9801b = tVar;
            this.f9802c = interfaceC1586f0;
            this.f9803d = j8;
        }

        public /* synthetic */ C0273a(A1.d dVar, t tVar, InterfaceC1586f0 interfaceC1586f0, long j8, int i8, AbstractC2633k abstractC2633k) {
            this((i8 & 1) != 0 ? e.a() : dVar, (i8 & 2) != 0 ? t.Ltr : tVar, (i8 & 4) != 0 ? new i() : interfaceC1586f0, (i8 & 8) != 0 ? l.f9103b.b() : j8, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f9804a = T0.b.b(this);

        public b() {
        }

        @Override // T0.d
        public h a() {
            return this.f9804a;
        }

        @Override // T0.d
        public void b(long j8) {
            a.this.t().l(j8);
        }

        @Override // T0.d
        public InterfaceC1586f0 c() {
            return a.this.t().e();
        }

        @Override // T0.d
        public long d() {
            return a.this.t().h();
        }
    }

    public static /* synthetic */ F0 e(a aVar, long j8, g gVar, float f8, C1600m0 c1600m0, int i8, int i9, int i10, Object obj) {
        return aVar.c(j8, gVar, f8, c1600m0, i8, (i10 & 32) != 0 ? f.f9808L.b() : i9);
    }

    public static /* synthetic */ F0 g(a aVar, AbstractC1582d0 abstractC1582d0, g gVar, float f8, C1600m0 c1600m0, int i8, int i9, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            i9 = f.f9808L.b();
        }
        return aVar.f(abstractC1582d0, gVar, f8, c1600m0, i8, i9);
    }

    public static /* synthetic */ F0 n(a aVar, long j8, float f8, float f9, int i8, int i9, I0 i10, float f10, C1600m0 c1600m0, int i11, int i12, int i13, Object obj) {
        return aVar.m(j8, f8, f9, i8, i9, i10, f10, c1600m0, i11, (i13 & 512) != 0 ? f.f9808L.b() : i12);
    }

    public static /* synthetic */ F0 q(a aVar, AbstractC1582d0 abstractC1582d0, float f8, float f9, int i8, int i9, I0 i10, float f10, C1600m0 c1600m0, int i11, int i12, int i13, Object obj) {
        return aVar.o(abstractC1582d0, f8, f9, i8, i9, i10, f10, c1600m0, i11, (i13 & 512) != 0 ? f.f9808L.b() : i12);
    }

    @Override // T0.f
    public void A0(H0 h8, AbstractC1582d0 abstractC1582d0, float f8, g gVar, C1600m0 c1600m0, int i8) {
        this.f9796a.e().e(h8, g(this, abstractC1582d0, gVar, f8, c1600m0, i8, 0, 32, null));
    }

    public final F0 C() {
        F0 f8 = this.f9799d;
        if (f8 != null) {
            return f8;
        }
        F0 f0A = M.a();
        f0A.s(G0.f9302a.b());
        this.f9799d = f0A;
        return f0A;
    }

    @Override // T0.f
    public void D(long j8, float f8, long j9, float f9, g gVar, C1600m0 c1600m0, int i8) {
        this.f9796a.e().r(j9, f8, e(this, j8, gVar, f9, c1600m0, i8, 0, 32, null));
    }

    public final F0 F(g gVar) {
        if (kotlin.jvm.internal.t.c(gVar, j.f9812a)) {
            return y();
        }
        if (!(gVar instanceof k)) {
            throw new m();
        }
        F0 f0C = C();
        k kVar = (k) gVar;
        if (f0C.x() != kVar.f()) {
            f0C.w(kVar.f());
        }
        if (!V0.e(f0C.q(), kVar.b())) {
            f0C.g(kVar.b());
        }
        if (f0C.i() != kVar.d()) {
            f0C.n(kVar.d());
        }
        if (!W0.e(f0C.f(), kVar.c())) {
            f0C.r(kVar.c());
        }
        if (!kotlin.jvm.internal.t.c(f0C.u(), kVar.e())) {
            f0C.e(kVar.e());
        }
        return f0C;
    }

    @Override // T0.f
    public d K0() {
        return this.f9797b;
    }

    @Override // T0.f
    public void U(long j8, long j9, long j10, float f8, g gVar, C1600m0 c1600m0, int i8) {
        this.f9796a.e().s(Q0.f.o(j9), Q0.f.p(j9), Q0.f.o(j9) + l.i(j10), Q0.f.p(j9) + l.g(j10), e(this, j8, gVar, f8, c1600m0, i8, 0, 32, null));
    }

    @Override // T0.f
    public void X(InterfaceC1621x0 interfaceC1621x0, long j8, long j9, long j10, long j11, float f8, g gVar, C1600m0 c1600m0, int i8, int i9) {
        this.f9796a.e().p(interfaceC1621x0, j8, j9, j10, j11, f(null, gVar, f8, c1600m0, i8, i9));
    }

    @Override // T0.f
    public void Y(long j8, long j9, long j10, float f8, int i8, I0 i9, float f9, C1600m0 c1600m0, int i10) {
        this.f9796a.e().t(j9, j10, n(this, j8, f8, 4.0f, i8, W0.f9346a.b(), i9, f9, c1600m0, i10, 0, 512, null));
    }

    @Override // T0.f
    public void Y0(AbstractC1582d0 abstractC1582d0, long j8, long j9, float f8, int i8, I0 i9, float f9, C1600m0 c1600m0, int i10) {
        this.f9796a.e().t(j8, j9, q(this, abstractC1582d0, f8, 4.0f, i8, W0.f9346a.b(), i9, f9, c1600m0, i10, 0, 512, null));
    }

    @Override // T0.f
    public void a0(long j8, float f8, float f9, boolean z8, long j9, long j10, float f10, g gVar, C1600m0 c1600m0, int i8) {
        this.f9796a.e().j(Q0.f.o(j9), Q0.f.p(j9), Q0.f.o(j9) + l.i(j10), Q0.f.p(j9) + l.g(j10), f8, f9, z8, e(this, j8, gVar, f10, c1600m0, i8, 0, 32, null));
    }

    public final F0 c(long j8, g gVar, float f8, C1600m0 c1600m0, int i8, int i9) {
        F0 f0F = F(gVar);
        long jU = u(j8, f8);
        if (!C1598l0.q(f0F.d(), jU)) {
            f0F.t(jU);
        }
        if (f0F.m() != null) {
            f0F.l(null);
        }
        if (!kotlin.jvm.internal.t.c(f0F.j(), c1600m0)) {
            f0F.v(c1600m0);
        }
        if (!X.E(f0F.y(), i8)) {
            f0F.h(i8);
        }
        if (!AbstractC1615u0.d(f0F.p(), i9)) {
            f0F.o(i9);
        }
        return f0F;
    }

    public final F0 f(AbstractC1582d0 abstractC1582d0, g gVar, float f8, C1600m0 c1600m0, int i8, int i9) {
        F0 f0F = F(gVar);
        if (abstractC1582d0 != null) {
            abstractC1582d0.a(d(), f0F, f8);
        } else {
            if (f0F.m() != null) {
                f0F.l(null);
            }
            long jD = f0F.d();
            C1598l0.a aVar = C1598l0.f9405b;
            if (!C1598l0.q(jD, aVar.a())) {
                f0F.t(aVar.a());
            }
            if (f0F.c() != f8) {
                f0F.b(f8);
            }
        }
        if (!kotlin.jvm.internal.t.c(f0F.j(), c1600m0)) {
            f0F.v(c1600m0);
        }
        if (!X.E(f0F.y(), i8)) {
            f0F.h(i8);
        }
        if (!AbstractC1615u0.d(f0F.p(), i9)) {
            f0F.o(i9);
        }
        return f0F;
    }

    @Override // A1.d
    public float getDensity() {
        return this.f9796a.f().getDensity();
    }

    @Override // T0.f
    public t getLayoutDirection() {
        return this.f9796a.g();
    }

    public final F0 m(long j8, float f8, float f9, int i8, int i9, I0 i10, float f10, C1600m0 c1600m0, int i11, int i12) {
        F0 f0C = C();
        long jU = u(j8, f10);
        if (!C1598l0.q(f0C.d(), jU)) {
            f0C.t(jU);
        }
        if (f0C.m() != null) {
            f0C.l(null);
        }
        if (!kotlin.jvm.internal.t.c(f0C.j(), c1600m0)) {
            f0C.v(c1600m0);
        }
        if (!X.E(f0C.y(), i11)) {
            f0C.h(i11);
        }
        if (f0C.x() != f8) {
            f0C.w(f8);
        }
        if (f0C.i() != f9) {
            f0C.n(f9);
        }
        if (!V0.e(f0C.q(), i8)) {
            f0C.g(i8);
        }
        if (!W0.e(f0C.f(), i9)) {
            f0C.r(i9);
        }
        if (!kotlin.jvm.internal.t.c(f0C.u(), i10)) {
            f0C.e(i10);
        }
        if (!AbstractC1615u0.d(f0C.p(), i12)) {
            f0C.o(i12);
        }
        return f0C;
    }

    public final F0 o(AbstractC1582d0 abstractC1582d0, float f8, float f9, int i8, int i9, I0 i10, float f10, C1600m0 c1600m0, int i11, int i12) {
        F0 f0C = C();
        if (abstractC1582d0 != null) {
            abstractC1582d0.a(d(), f0C, f10);
        } else if (f0C.c() != f10) {
            f0C.b(f10);
        }
        if (!kotlin.jvm.internal.t.c(f0C.j(), c1600m0)) {
            f0C.v(c1600m0);
        }
        if (!X.E(f0C.y(), i11)) {
            f0C.h(i11);
        }
        if (f0C.x() != f8) {
            f0C.w(f8);
        }
        if (f0C.i() != f9) {
            f0C.n(f9);
        }
        if (!V0.e(f0C.q(), i8)) {
            f0C.g(i8);
        }
        if (!W0.e(f0C.f(), i9)) {
            f0C.r(i9);
        }
        if (!kotlin.jvm.internal.t.c(f0C.u(), i10)) {
            f0C.e(i10);
        }
        if (!AbstractC1615u0.d(f0C.p(), i12)) {
            f0C.o(i12);
        }
        return f0C;
    }

    public final C0273a t() {
        return this.f9796a;
    }

    @Override // T0.f
    public void t0(InterfaceC1621x0 interfaceC1621x0, long j8, float f8, g gVar, C1600m0 c1600m0, int i8) {
        this.f9796a.e().n(interfaceC1621x0, j8, g(this, null, gVar, f8, c1600m0, i8, 0, 32, null));
    }

    public final long u(long j8, float f8) {
        return f8 == 1.0f ? j8 : C1598l0.o(j8, C1598l0.r(j8) * f8, 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Override // T0.f
    public void u1(long j8, long j9, long j10, long j11, g gVar, float f8, C1600m0 c1600m0, int i8) {
        this.f9796a.e().u(Q0.f.o(j9), Q0.f.p(j9), Q0.f.o(j9) + l.i(j10), Q0.f.p(j9) + l.g(j10), Q0.a.d(j11), Q0.a.e(j11), e(this, j8, gVar, f8, c1600m0, i8, 0, 32, null));
    }

    @Override // A1.l
    public float x0() {
        return this.f9796a.f().x0();
    }

    public final F0 y() {
        F0 f8 = this.f9798c;
        if (f8 != null) {
            return f8;
        }
        F0 f0A = M.a();
        f0A.s(G0.f9302a.a());
        this.f9798c = f0A;
        return f0A;
    }

    @Override // T0.f
    public void y1(AbstractC1582d0 abstractC1582d0, long j8, long j9, float f8, g gVar, C1600m0 c1600m0, int i8) {
        this.f9796a.e().s(Q0.f.o(j8), Q0.f.p(j8), Q0.f.o(j8) + l.i(j9), Q0.f.p(j8) + l.g(j9), g(this, abstractC1582d0, gVar, f8, c1600m0, i8, 0, 32, null));
    }

    @Override // T0.f
    public void z(AbstractC1582d0 abstractC1582d0, long j8, long j9, long j10, float f8, g gVar, C1600m0 c1600m0, int i8) {
        this.f9796a.e().u(Q0.f.o(j8), Q0.f.p(j8), Q0.f.o(j8) + l.i(j9), Q0.f.p(j8) + l.g(j9), Q0.a.d(j10), Q0.a.e(j10), g(this, abstractC1582d0, gVar, f8, c1600m0, i8, 0, 32, null));
    }

    @Override // T0.f
    public void z1(H0 h8, long j8, float f8, g gVar, C1600m0 c1600m0, int i8) {
        this.f9796a.e().e(h8, e(this, j8, gVar, f8, c1600m0, i8, 0, 32, null));
    }
}
