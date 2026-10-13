package androidx.compose.ui.draw;

import A1.n;
import A1.s;
import C6.G;
import L0.c;
import L0.i;
import Q0.l;
import Q0.m;
import Q6.k;
import R0.C1600m0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p038e1.I;
import p038e1.InterfaceC2235f;
import p038e1.InterfaceC2243n;
import p038e1.InterfaceC2244o;
import p038e1.J;
import p038e1.a0;
import p038e1.g0;
import p056g1.A;
import p056g1.InterfaceC2353q;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class PainterNode extends i.c implements A, InterfaceC2353q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14568n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f14569o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InterfaceC2235f f14570p;
    private U0.b painter;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f14571q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1600m0 f14572r;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f14573a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a0 a0Var) {
            super(1);
            this.f14573a = a0Var;
        }

        public final void b(a0.a aVar) {
            a0.a.j(aVar, this.f14573a, 0, 0, 0.0f, 4, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    public /* synthetic */ PainterNode(U0.b bVar, boolean z8, c cVar, InterfaceC2235f interfaceC2235f, float f8, C1600m0 c1600m0, int i8, AbstractC2633k abstractC2633k) {
        this(bVar, z8, (i8 & 4) != 0 ? c.f4806a.e() : cVar, (i8 & 8) != 0 ? InterfaceC2235f.f20468a.d() : interfaceC2235f, (i8 & 16) != 0 ? 1.0f : f8, (i8 & 32) != 0 ? null : c1600m0);
    }

    @Override // L0.i.c
    public boolean I1() {
        return false;
    }

    public final void b(float f8) {
        this.f14571q = f8;
    }

    @Override // p056g1.A
    public I c(J j8, p038e1.G g8, long j9) {
        a0 a0VarJ = g8.J(j2(j9));
        return J.X0(j8, a0VarJ.y0(), a0VarJ.h0(), null, new a(a0VarJ), 4, null);
    }

    public final long d2(long j8) {
        if (!g2()) {
            return j8;
        }
        long jA = m.a(!i2(this.painter.h()) ? l.i(j8) : l.i(this.painter.h()), !h2(this.painter.h()) ? l.g(j8) : l.g(this.painter.h()));
        return (l.i(j8) == 0.0f || l.g(j8) == 0.0f) ? l.f9103b.b() : g0.b(jA, this.f14570p.a(jA, j8));
    }

    public final U0.b e2() {
        return this.painter;
    }

    public final boolean f2() {
        return this.f14568n;
    }

    @Override // p056g1.A
    public int g(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        if (!g2()) {
            return interfaceC2243n.G(i8);
        }
        long jJ2 = j2(A1.c.b(0, 0, 0, i8, 7, null));
        return Math.max(A1.b.p(jJ2), interfaceC2243n.G(i8));
    }

    public final boolean g2() {
        return this.f14568n && this.painter.h() != l.f9103b.a();
    }

    public final boolean h2(long j8) {
        if (l.f(j8, l.f9103b.a())) {
            return false;
        }
        float fG = l.g(j8);
        return (Float.isInfinite(fG) || Float.isNaN(fG)) ? false : true;
    }

    public final boolean i2(long j8) {
        if (l.f(j8, l.f9103b.a())) {
            return false;
        }
        float fI = l.i(j8);
        return (Float.isInfinite(fI) || Float.isNaN(fI)) ? false : true;
    }

    public final long j2(long j8) {
        boolean z8 = false;
        boolean z9 = A1.b.j(j8) && A1.b.i(j8);
        if (A1.b.l(j8) && A1.b.k(j8)) {
            z8 = true;
        }
        if ((!g2() && z9) || z8) {
            return A1.b.e(j8, A1.b.n(j8), 0, A1.b.m(j8), 0, 10, null);
        }
        long jH = this.painter.h();
        long jD2 = d2(m.a(A1.c.g(j8, i2(jH) ? S6.c.d(l.i(jH)) : A1.b.p(j8)), A1.c.f(j8, h2(jH) ? S6.c.d(l.g(jH)) : A1.b.o(j8))));
        return A1.b.e(j8, A1.c.g(j8, S6.c.d(l.i(jD2))), 0, A1.c.f(j8, S6.c.d(l.g(jD2))), 0, 10, null);
    }

    public final void k2(c cVar) {
        this.f14569o = cVar;
    }

    public final void l2(C1600m0 c1600m0) {
        this.f14572r = c1600m0;
    }

    public final void m2(InterfaceC2235f interfaceC2235f) {
        this.f14570p = interfaceC2235f;
    }

    @Override // p056g1.A
    public int n(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        if (!g2()) {
            return interfaceC2243n.W(i8);
        }
        long jJ2 = j2(A1.c.b(0, i8, 0, 0, 13, null));
        return Math.max(A1.b.o(jJ2), interfaceC2243n.W(i8));
    }

    public final void n2(U0.b bVar) {
        this.painter = bVar;
    }

    @Override // p056g1.A
    public int o(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        if (!g2()) {
            return interfaceC2243n.F(i8);
        }
        long jJ2 = j2(A1.c.b(0, 0, 0, i8, 7, null));
        return Math.max(A1.b.p(jJ2), interfaceC2243n.F(i8));
    }

    public final void o2(boolean z8) {
        this.f14568n = z8;
    }

    @Override // p056g1.InterfaceC2353q
    public void q(T0.c cVar) {
        long jH = this.painter.h();
        long jA = m.a(i2(jH) ? l.i(jH) : l.i(cVar.d()), h2(jH) ? l.g(jH) : l.g(cVar.d()));
        long jB = (l.i(cVar.d()) == 0.0f || l.g(cVar.d()) == 0.0f) ? l.f9103b.b() : g0.b(jA, this.f14570p.a(jA, cVar.d()));
        long jA2 = this.f14569o.a(s.a(S6.c.d(l.i(jB)), S6.c.d(l.g(jB))), s.a(S6.c.d(l.i(cVar.d())), S6.c.d(l.g(cVar.d()))), cVar.getLayoutDirection());
        float fJ = n.j(jA2);
        float fK = n.k(jA2);
        cVar.K0().a().d(fJ, fK);
        this.painter.g(cVar, jB, this.f14571q, this.f14572r);
        cVar.K0().a().d(-fJ, -fK);
        cVar.v1();
    }

    @Override // p056g1.A
    public int t(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        if (!g2()) {
            return interfaceC2243n.g(i8);
        }
        long jJ2 = j2(A1.c.b(0, i8, 0, 0, 13, null));
        return Math.max(A1.b.o(jJ2), interfaceC2243n.g(i8));
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.f14568n + ", alignment=" + this.f14569o + ", alpha=" + this.f14571q + ", colorFilter=" + this.f14572r + ')';
    }

    public PainterNode(U0.b bVar, boolean z8, c cVar, InterfaceC2235f interfaceC2235f, float f8, C1600m0 c1600m0) {
        this.painter = bVar;
        this.f14568n = z8;
        this.f14569o = cVar;
        this.f14570p = interfaceC2235f;
        this.f14571q = f8;
        this.f14572r = c1600m0;
    }
}
