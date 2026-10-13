package p056g1;

import A1.s;
import A1.t;
import L0.i;
import R0.AbstractC1582d0;
import R0.C1600m0;
import R0.H0;
import R0.I0;
import R0.InterfaceC1586f0;
import R0.InterfaceC1621x0;
import T0.a;
import T0.c;
import T0.d;
import T0.f;
import T0.g;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class H implements f, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f23372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC2353q f23373b;

    /* JADX WARN: Multi-variable type inference failed */
    public H() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // T0.f
    public void A0(H0 h8, AbstractC1582d0 abstractC1582d0, float f8, g gVar, C1600m0 c1600m0, int i8) {
        this.f23372a.A0(h8, abstractC1582d0, f8, gVar, c1600m0, i8);
    }

    @Override // T0.f
    public void D(long j8, float f8, long j9, float f9, g gVar, C1600m0 c1600m0, int i8) {
        this.f23372a.D(j8, f8, j9, f9, gVar, c1600m0, i8);
    }

    @Override // A1.d
    public float E0(float f8) {
        return this.f23372a.E0(f8);
    }

    @Override // A1.l
    public long H(float f8) {
        return this.f23372a.H(f8);
    }

    @Override // A1.d
    public long I(long j8) {
        return this.f23372a.I(j8);
    }

    @Override // T0.f
    public d K0() {
        return this.f23372a.K0();
    }

    @Override // A1.l
    public float T(long j8) {
        return this.f23372a.T(j8);
    }

    @Override // T0.f
    public void U(long j8, long j9, long j10, float f8, g gVar, C1600m0 c1600m0, int i8) {
        this.f23372a.U(j8, j9, j10, f8, gVar, c1600m0, i8);
    }

    @Override // A1.d
    public int V0(float f8) {
        return this.f23372a.V0(f8);
    }

    @Override // T0.f
    public void X(InterfaceC1621x0 interfaceC1621x0, long j8, long j9, long j10, long j11, float f8, g gVar, C1600m0 c1600m0, int i8, int i9) {
        this.f23372a.X(interfaceC1621x0, j8, j9, j10, j11, f8, gVar, c1600m0, i8, i9);
    }

    @Override // T0.f
    public void Y(long j8, long j9, long j10, float f8, int i8, I0 i9, float f9, C1600m0 c1600m0, int i10) {
        this.f23372a.Y(j8, j9, j10, f8, i8, i9, f9, c1600m0, i10);
    }

    @Override // T0.f
    public void Y0(AbstractC1582d0 abstractC1582d0, long j8, long j9, float f8, int i8, I0 i9, float f9, C1600m0 c1600m0, int i10) {
        this.f23372a.Y0(abstractC1582d0, j8, j9, f8, i8, i9, f9, c1600m0, i10);
    }

    @Override // T0.f
    public void a0(long j8, float f8, float f9, boolean z8, long j9, long j10, float f10, g gVar, C1600m0 c1600m0, int i8) {
        this.f23372a.a0(j8, f8, f9, z8, j9, j10, f10, gVar, c1600m0, i8);
    }

    public final void c(InterfaceC1586f0 interfaceC1586f0, long j8, X x8, i.c cVar) {
        InterfaceC1586f0 interfaceC1586f1;
        long j9;
        X x9;
        int iA = Z.a(4);
        B0.d dVar = null;
        while (cVar != null) {
            if (cVar instanceof InterfaceC2353q) {
                interfaceC1586f1 = interfaceC1586f0;
                j9 = j8;
                x9 = x8;
                e(interfaceC1586f1, j9, x9, (InterfaceC2353q) cVar);
            } else {
                interfaceC1586f1 = interfaceC1586f0;
                j9 = j8;
                x9 = x8;
                if ((cVar.F1() & iA) != 0 && (cVar instanceof AbstractC2348l)) {
                    int i8 = 0;
                    for (i.c cVarE2 = ((AbstractC2348l) cVar).e2(); cVarE2 != null; cVarE2 = cVarE2.B1()) {
                        if ((cVarE2.F1() & iA) != 0) {
                            i8++;
                            if (i8 == 1) {
                                cVar = cVarE2;
                            } else {
                                if (dVar == null) {
                                    dVar = new B0.d(new i.c[16], 0);
                                }
                                if (cVar != null) {
                                    dVar.d(cVar);
                                    cVar = null;
                                }
                                dVar.d(cVarE2);
                            }
                        }
                    }
                    if (i8 == 1) {
                    }
                }
                interfaceC1586f0 = interfaceC1586f1;
                j8 = j9;
                x8 = x9;
            }
            cVar = AbstractC2347k.g(dVar);
            interfaceC1586f0 = interfaceC1586f1;
            j8 = j9;
            x8 = x9;
        }
    }

    @Override // T0.f
    public long c1() {
        return this.f23372a.c1();
    }

    @Override // T0.f
    public long d() {
        return this.f23372a.d();
    }

    public final void e(InterfaceC1586f0 interfaceC1586f0, long j8, X x8, InterfaceC2353q interfaceC2353q) {
        InterfaceC2353q interfaceC2353q2 = this.f23373b;
        this.f23373b = interfaceC2353q;
        a aVar = this.f23372a;
        t layoutDirection = x8.getLayoutDirection();
        a.C0273a c0273aT = aVar.t();
        A1.d dVarA = c0273aT.a();
        t tVarB = c0273aT.b();
        InterfaceC1586f0 interfaceC1586f0C = c0273aT.c();
        long jD = c0273aT.d();
        a.C0273a c0273aT2 = aVar.t();
        c0273aT2.j(x8);
        c0273aT2.k(layoutDirection);
        c0273aT2.i(interfaceC1586f0);
        c0273aT2.l(j8);
        interfaceC1586f0.k();
        interfaceC2353q.q(this);
        interfaceC1586f0.x();
        a.C0273a c0273aT3 = aVar.t();
        c0273aT3.j(dVarA);
        c0273aT3.k(tVarB);
        c0273aT3.i(interfaceC1586f0C);
        c0273aT3.l(jD);
        this.f23373b = interfaceC2353q2;
    }

    public final void f(InterfaceC2353q interfaceC2353q, InterfaceC1586f0 interfaceC1586f0) {
        X xH = AbstractC2347k.h(interfaceC2353q, Z.a(4));
        xH.h1().a0().e(interfaceC1586f0, s.c(xH.a()), xH, interfaceC2353q);
    }

    @Override // A1.d
    public float getDensity() {
        return this.f23372a.getDensity();
    }

    @Override // T0.f
    public t getLayoutDirection() {
        return this.f23372a.getLayoutDirection();
    }

    @Override // A1.d
    public long i0(float f8) {
        return this.f23372a.i0(f8);
    }

    @Override // A1.d
    public long i1(long j8) {
        return this.f23372a.i1(j8);
    }

    @Override // A1.d
    public float l1(long j8) {
        return this.f23372a.l1(j8);
    }

    @Override // A1.d
    public float n0(int i8) {
        return this.f23372a.n0(i8);
    }

    @Override // A1.d
    public float p0(float f8) {
        return this.f23372a.p0(f8);
    }

    @Override // T0.f
    public void t0(InterfaceC1621x0 interfaceC1621x0, long j8, float f8, g gVar, C1600m0 c1600m0, int i8) {
        this.f23372a.t0(interfaceC1621x0, j8, f8, gVar, c1600m0, i8);
    }

    @Override // T0.f
    public void u1(long j8, long j9, long j10, long j11, g gVar, float f8, C1600m0 c1600m0, int i8) {
        this.f23372a.u1(j8, j9, j10, j11, gVar, f8, c1600m0, i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // T0.c
    public void v1() {
        InterfaceC1586f0 interfaceC1586f0C = K0().c();
        InterfaceC2353q interfaceC2353q = this.f23373b;
        kotlin.jvm.internal.t.d(interfaceC2353q);
        ?? B8 = I.b(interfaceC2353q);
        if (B8 == 0) {
            X xH = AbstractC2347k.h(interfaceC2353q, Z.a(4));
            if (xH.i2() == interfaceC2353q.I0()) {
                xH = xH.j2();
                kotlin.jvm.internal.t.d(xH);
            }
            xH.E2(interfaceC1586f0C);
            return;
        }
        int iA = Z.a(4);
        ?? dVar = 0;
        while (B8 != 0) {
            if (B8 instanceof InterfaceC2353q) {
                f((InterfaceC2353q) B8, interfaceC1586f0C);
            } else if ((B8.F1() & iA) != 0 && (B8 instanceof AbstractC2348l)) {
                i.c cVarE2 = ((AbstractC2348l) B8).e2();
                int i8 = 0;
                B8 = B8;
                dVar = dVar;
                while (cVarE2 != null) {
                    if ((cVarE2.F1() & iA) != 0) {
                        i8++;
                        if (i8 == 1) {
                            dVar = dVar;
                            B8 = cVarE2;
                        } else {
                            if (dVar == 0) {
                                dVar = new B0.d(new i.c[16], 0);
                            }
                            if (B8 != 0) {
                                dVar.d(B8);
                                B8 = 0;
                            }
                            dVar.d(cVarE2);
                        }
                    }
                    cVarE2 = cVarE2.B1();
                    B8 = B8;
                    dVar = dVar;
                }
                if (i8 == 1) {
                }
            }
            B8 = AbstractC2347k.g(dVar);
        }
    }

    @Override // A1.l
    public float x0() {
        return this.f23372a.x0();
    }

    @Override // T0.f
    public void y1(AbstractC1582d0 abstractC1582d0, long j8, long j9, float f8, g gVar, C1600m0 c1600m0, int i8) {
        this.f23372a.y1(abstractC1582d0, j8, j9, f8, gVar, c1600m0, i8);
    }

    @Override // T0.f
    public void z(AbstractC1582d0 abstractC1582d0, long j8, long j9, long j10, float f8, g gVar, C1600m0 c1600m0, int i8) {
        this.f23372a.z(abstractC1582d0, j8, j9, j10, f8, gVar, c1600m0, i8);
    }

    @Override // T0.f
    public void z1(H0 h8, long j8, float f8, g gVar, C1600m0 c1600m0, int i8) {
        this.f23372a.z1(h8, j8, f8, gVar, c1600m0, i8);
    }

    public H(a aVar) {
        this.f23372a = aVar;
    }

    public /* synthetic */ H(a aVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? new a() : aVar);
    }
}
