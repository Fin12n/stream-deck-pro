package p046f0;

import A1.r;
import A1.s;
import C6.G;
import O0.i;
import Q0.g;
import Q0.h;
import Q0.l;
import Q0.m;
import Q6.k;
import R0.AbstractC1582d0;
import R0.AbstractC1590h0;
import R0.AbstractC1596k0;
import R0.AbstractC1625z0;
import R0.C1598l0;
import R0.C1600m0;
import R0.C1623y0;
import R0.D0;
import R0.H0;
import R0.InterfaceC1586f0;
import R0.InterfaceC1621x0;
import R0.L0;
import R0.T0;
import R0.U0;
import R0.X;
import T0.f;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p056g1.AbstractC2348l;

/* JADX INFO: renamed from: f0.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2279g extends AbstractC2348l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C2277e f21453p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f21454q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AbstractC1582d0 f21455r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public T0 f21456s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final O0.c f21457t;

    /* JADX INFO: renamed from: f0.g$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D0.a f21458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1582d0 f21459b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(D0.a aVar, AbstractC1582d0 abstractC1582d0) {
            super(1);
            this.f21458a = aVar;
            this.f21459b = abstractC1582d0;
        }

        public final void b(T0.c cVar) {
            cVar.v1();
            f.e0(cVar, this.f21458a.a(), this.f21459b, 0.0f, null, null, 0, 60, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((T0.c) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: f0.g$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f21460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J f21461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f21462c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C1600m0 f21463d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, J j8, long j9, C1600m0 c1600m0) {
            super(1);
            this.f21460a = hVar;
            this.f21461b = j8;
            this.f21462c = j9;
            this.f21463d = c1600m0;
        }

        public final void b(T0.c cVar) {
            cVar.v1();
            float fI = this.f21460a.i();
            float fL = this.f21460a.l();
            J j8 = this.f21461b;
            long j9 = this.f21462c;
            C1600m0 c1600m0 = this.f21463d;
            cVar.K0().a().d(fI, fL);
            f.F0(cVar, (InterfaceC1621x0) j8.f28779a, 0L, j9, 0L, 0L, 0.0f, null, c1600m0, 0, 0, 890, null);
            cVar.K0().a().d(-fI, -fL);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((T0.c) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: f0.g$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f21464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1582d0 f21465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f21466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f21467d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f21468e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f21469f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f21470g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ T0.k f21471h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z8, AbstractC1582d0 abstractC1582d0, long j8, float f8, float f9, long j9, long j10, T0.k kVar) {
            super(1);
            this.f21464a = z8;
            this.f21465b = abstractC1582d0;
            this.f21466c = j8;
            this.f21467d = f8;
            this.f21468e = f9;
            this.f21469f = j9;
            this.f21470g = j10;
            this.f21471h = kVar;
        }

        public final void b(T0.c cVar) {
            cVar.v1();
            if (this.f21464a) {
                f.d0(cVar, this.f21465b, 0L, 0L, this.f21466c, 0.0f, null, null, 0, 246, null);
                return;
            }
            float fD = Q0.a.d(this.f21466c);
            float f8 = this.f21467d;
            if (fD >= f8) {
                f.d0(cVar, this.f21465b, this.f21469f, this.f21470g, AbstractC2278f.l(this.f21466c, f8), 0.0f, this.f21471h, null, 0, 208, null);
                return;
            }
            float f9 = this.f21468e;
            float fI = l.i(cVar.d()) - this.f21468e;
            float fG = l.g(cVar.d()) - this.f21468e;
            int iA = AbstractC1596k0.f9402a.a();
            AbstractC1582d0 abstractC1582d0 = this.f21465b;
            long j8 = this.f21466c;
            T0.d dVarK0 = cVar.K0();
            long jD = dVarK0.d();
            dVarK0.c().k();
            dVarK0.a().c(f9, f9, fI, fG, iA);
            f.d0(cVar, abstractC1582d0, 0L, 0L, j8, 0.0f, null, null, 0, 246, null);
            dVarK0.c().x();
            dVarK0.b(jD);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((T0.c) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: f0.g$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ H0 f21472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1582d0 f21473b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(H0 h8, AbstractC1582d0 abstractC1582d0) {
            super(1);
            this.f21472a = h8;
            this.f21473b = abstractC1582d0;
        }

        public final void b(T0.c cVar) {
            cVar.v1();
            f.e0(cVar, this.f21472a, this.f21473b, 0.0f, null, null, 0, 60, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((T0.c) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: f0.g$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements k {
        public e() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i invoke(O0.e eVar) {
            if (eVar.E0(C2279g.this.o2()) < 0.0f || l.h(eVar.d()) <= 0.0f) {
                return AbstractC2278f.j(eVar);
            }
            float f8 = 2;
            float fMin = Math.min(A1.h.t(C2279g.this.o2(), A1.h.f432b.a()) ? 1.0f : (float) Math.ceil(eVar.E0(C2279g.this.o2())), (float) Math.ceil(l.h(eVar.d()) / f8));
            float f9 = fMin / f8;
            long jA = g.a(f9, f9);
            long jA2 = m.a(l.i(eVar.d()) - fMin, l.g(eVar.d()) - fMin);
            boolean z8 = f8 * fMin > l.h(eVar.d());
            D0 d0A = C2279g.this.n2().a(eVar.d(), eVar.getLayoutDirection(), eVar);
            if (d0A instanceof D0.a) {
                C2279g c2279g = C2279g.this;
                return c2279g.k2(eVar, c2279g.m2(), (D0.a) d0A, z8, fMin);
            }
            if (d0A instanceof D0.c) {
                C2279g c2279g2 = C2279g.this;
                return c2279g2.l2(eVar, c2279g2.m2(), (D0.c) d0A, jA, jA2, z8, fMin);
            }
            if (d0A instanceof D0.b) {
                return AbstractC2278f.k(eVar, C2279g.this.m2(), jA, jA2, z8, fMin);
            }
            throw new C6.m();
        }
    }

    public /* synthetic */ C2279g(float f8, AbstractC1582d0 abstractC1582d0, T0 t8, AbstractC2633k abstractC2633k) {
        this(f8, abstractC1582d0, t8);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00d5  */
    public final i k2(O0.e eVar, AbstractC1582d0 abstractC1582d0, D0.a aVar, boolean z8, float f8) {
        int iB;
        C1600m0 c1600m0B;
        boolean z9;
        C2277e c2277e;
        InterfaceC1621x0 interfaceC1621x0;
        InterfaceC1586f0 interfaceC1586f0;
        if (z8) {
            return eVar.e(new a(aVar, abstractC1582d0));
        }
        if (abstractC1582d0 instanceof U0) {
            iB = C1623y0.f9449b.a();
            c1600m0B = C1600m0.a.b(C1600m0.f9420b, ((U0) abstractC1582d0).b(), 0, 2, null);
        } else {
            iB = C1623y0.f9449b.b();
            c1600m0B = null;
        }
        int i8 = iB;
        h bounds = aVar.a().getBounds();
        if (this.f21453p == null) {
            this.f21453p = new C2277e(null, null, null, null, 15, null);
        }
        C2277e c2277e2 = this.f21453p;
        t.d(c2277e2);
        H0 h0G = c2277e2.g();
        h0G.reset();
        h0G.q(bounds);
        h0G.h(h0G, aVar.a(), L0.f9316a.a());
        J j8 = new J();
        long jA = s.a((int) Math.ceil(bounds.n()), (int) Math.ceil(bounds.h()));
        C2277e c2277e3 = this.f21453p;
        t.d(c2277e3);
        InterfaceC1621x0 interfaceC1621x1 = c2277e3.f21444a;
        InterfaceC1586f0 interfaceC1586f1 = c2277e3.f21445b;
        C1623y0 c1623y0F = interfaceC1621x1 != null ? C1623y0.f(interfaceC1621x1.b()) : null;
        if (!(c1623y0F == null ? false : C1623y0.i(c1623y0F.l(), C1623y0.f9449b.b()))) {
            z9 = C1623y0.h(i8, interfaceC1621x1 != null ? C1623y0.f(interfaceC1621x1.b()) : null);
        }
        if (interfaceC1621x1 == null || interfaceC1586f1 == null || l.i(eVar.d()) > interfaceC1621x1.g() || l.g(eVar.d()) > interfaceC1621x1.f() || !z9) {
            c2277e = c2277e3;
            InterfaceC1621x0 interfaceC1621x0B = AbstractC1625z0.b(r.g(jA), r.f(jA), i8, false, null, 24, null);
            c2277e.f21444a = interfaceC1621x0B;
            InterfaceC1586f0 interfaceC1586f0A = AbstractC1590h0.a(interfaceC1621x0B);
            c2277e.f21445b = interfaceC1586f0A;
            interfaceC1621x0 = interfaceC1621x0B;
            interfaceC1586f0 = interfaceC1586f0A;
        } else {
            c2277e = c2277e3;
            interfaceC1586f0 = interfaceC1586f1;
            interfaceC1621x0 = interfaceC1621x1;
        }
        T0.a aVar2 = c2277e.f21446c;
        if (aVar2 == null) {
            aVar2 = new T0.a();
            c2277e.f21446c = aVar2;
        }
        T0.a aVar3 = aVar2;
        long jC = s.c(jA);
        A1.t layoutDirection = eVar.getLayoutDirection();
        T0.a.C0273a c0273aT = aVar3.t();
        A1.d dVarA = c0273aT.a();
        A1.t tVarB = c0273aT.b();
        InterfaceC1586f0 interfaceC1586f0C = c0273aT.c();
        long jD = c0273aT.d();
        T0.a.C0273a c0273aT2 = aVar3.t();
        c0273aT2.j(eVar);
        c0273aT2.k(layoutDirection);
        c0273aT2.i(interfaceC1586f0);
        c0273aT2.l(jC);
        interfaceC1586f0.k();
        long jA2 = C1598l0.f9405b.a();
        X.a aVar4 = X.f9354a;
        f.w1(aVar3, jA2, 0L, jC, 0.0f, null, null, aVar4.a(), 58, null);
        float f9 = -bounds.i();
        float f10 = -bounds.l();
        aVar3.K0().a().d(f9, f10);
        InterfaceC1621x0 interfaceC1621x2 = interfaceC1621x0;
        f.e0(aVar3, aVar.a(), abstractC1582d0, 0.0f, new T0.k(f8 * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
        float f11 = 1;
        float fI = (l.i(aVar3.d()) + f11) / l.i(aVar3.d());
        float fG = (l.g(aVar3.d()) + f11) / l.g(aVar3.d());
        long jC1 = aVar3.c1();
        T0.d dVarK0 = aVar3.K0();
        long jD2 = dVarK0.d();
        dVarK0.c().k();
        dVarK0.a().f(fI, fG, jC1);
        f.e0(aVar3, h0G, abstractC1582d0, 0.0f, null, null, aVar4.a(), 28, null);
        dVarK0.c().x();
        dVarK0.b(jD2);
        aVar3.K0().a().d(-f9, -f10);
        interfaceC1586f0.x();
        T0.a.C0273a c0273aT3 = aVar3.t();
        c0273aT3.j(dVarA);
        c0273aT3.k(tVarB);
        c0273aT3.i(interfaceC1586f0C);
        c0273aT3.l(jD);
        interfaceC1621x2.a();
        j8.f28779a = interfaceC1621x2;
        return eVar.e(new b(bounds, j8, jA, c1600m0B));
    }

    public final i l2(O0.e eVar, AbstractC1582d0 abstractC1582d0, D0.c cVar, long j8, long j9, boolean z8, float f8) {
        if (Q0.k.d(cVar.a())) {
            return eVar.e(new c(z8, abstractC1582d0, cVar.a().h(), f8 / 2, f8, j8, j9, new T0.k(f8, 0.0f, 0, 0, null, 30, null)));
        }
        if (this.f21453p == null) {
            this.f21453p = new C2277e(null, null, null, null, 15, null);
        }
        C2277e c2277e = this.f21453p;
        t.d(c2277e);
        return eVar.e(new d(AbstractC2278f.i(c2277e.g(), cVar.a(), f8, z8), abstractC1582d0));
    }

    public final AbstractC1582d0 m2() {
        return this.f21455r;
    }

    public final T0 n2() {
        return this.f21456s;
    }

    public final float o2() {
        return this.f21454q;
    }

    public final void p2(AbstractC1582d0 abstractC1582d0) {
        if (t.c(this.f21455r, abstractC1582d0)) {
            return;
        }
        this.f21455r = abstractC1582d0;
        this.f21457t.G();
    }

    public final void q2(float f8) {
        if (A1.h.t(this.f21454q, f8)) {
            return;
        }
        this.f21454q = f8;
        this.f21457t.G();
    }

    public final void x(T0 t8) {
        if (t.c(this.f21456s, t8)) {
            return;
        }
        this.f21456s = t8;
        this.f21457t.G();
    }

    public C2279g(float f8, AbstractC1582d0 abstractC1582d0, T0 t8) {
        this.f21454q = f8;
        this.f21455r = abstractC1582d0;
        this.f21456s = t8;
        this.f21457t = (O0.c) d2(androidx.compose.ui.draw.a.a(new e()));
    }
}
