package p038e1;

import A1.n;
import A1.o;
import A1.s;
import Q0.f;
import Q0.g;
import Q0.h;
import S6.c;
import kotlin.jvm.internal.t;
import p056g1.P;
import p056g1.X;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C implements InterfaceC2247s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f20414a;

    public C(P p8) {
        this.f20414a = p8;
    }

    @Override // p038e1.InterfaceC2247s
    public void C(InterfaceC2247s interfaceC2247s, float[] fArr) {
        b().C(interfaceC2247s, fArr);
    }

    @Override // p038e1.InterfaceC2247s
    public long K(long j8) {
        return f.t(b().K(j8), c());
    }

    @Override // p038e1.InterfaceC2247s
    public InterfaceC2247s N() {
        P pE2;
        if (!y()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        X xK2 = b().h1().k0().k2();
        if (xK2 == null || (pE2 = xK2.e2()) == null) {
            return null;
        }
        return pE2.F1();
    }

    @Override // p038e1.InterfaceC2247s
    public h O(InterfaceC2247s interfaceC2247s, boolean z8) {
        return b().O(interfaceC2247s, z8);
    }

    @Override // p038e1.InterfaceC2247s
    public long S(long j8) {
        return b().S(f.t(j8, c()));
    }

    @Override // p038e1.InterfaceC2247s
    public long a() {
        P p8 = this.f20414a;
        return s.a(p8.y0(), p8.h0());
    }

    public final X b() {
        return this.f20414a.G1();
    }

    public final long c() {
        P pA = D.a(this.f20414a);
        InterfaceC2247s interfaceC2247sF1 = pA.F1();
        f.a aVar = f.f9082b;
        return f.s(o(interfaceC2247sF1, aVar.c()), b().o(pA.G1(), aVar.c()));
    }

    @Override // p038e1.InterfaceC2247s
    public long n(long j8) {
        return b().n(f.t(j8, c()));
    }

    @Override // p038e1.InterfaceC2247s
    public long o(InterfaceC2247s interfaceC2247s, long j8) {
        if (!(interfaceC2247s instanceof C)) {
            P pA = D.a(this.f20414a);
            return f.t(o(pA.H1(), j8), pA.G1().a2().o(interfaceC2247s, f.f9082b.c()));
        }
        P p8 = ((C) interfaceC2247s).f20414a;
        p8.G1().x2();
        P pE2 = b().W1(p8.G1()).e2();
        if (pE2 != null) {
            long jL1 = p8.L1(pE2);
            long jA = o.a(c.d(f.o(j8)), c.d(f.p(j8)));
            long jA2 = o.a(n.j(jL1) + n.j(jA), n.k(jL1) + n.k(jA));
            long jL2 = this.f20414a.L1(pE2);
            long jA3 = o.a(n.j(jA2) - n.j(jL2), n.k(jA2) - n.k(jL2));
            return g.a(n.j(jA3), n.k(jA3));
        }
        P pA2 = D.a(p8);
        long jL3 = p8.L1(pA2);
        long jF1 = pA2.f1();
        long jA4 = o.a(n.j(jL3) + n.j(jF1), n.k(jL3) + n.k(jF1));
        long jA5 = o.a(c.d(f.o(j8)), c.d(f.p(j8)));
        long jA6 = o.a(n.j(jA4) + n.j(jA5), n.k(jA4) + n.k(jA5));
        P p9 = this.f20414a;
        long jL4 = p9.L1(D.a(p9));
        long jF2 = D.a(p9).f1();
        long jA7 = o.a(n.j(jL4) + n.j(jF2), n.k(jL4) + n.k(jF2));
        long jA8 = o.a(n.j(jA6) - n.j(jA7), n.k(jA6) - n.k(jA7));
        X xK2 = D.a(this.f20414a).G1().k2();
        t.d(xK2);
        X xK3 = pA2.G1().k2();
        t.d(xK3);
        return xK2.o(xK3, g.a(n.j(jA8), n.k(jA8)));
    }

    @Override // p038e1.InterfaceC2247s
    public boolean y() {
        return b().y();
    }
}
