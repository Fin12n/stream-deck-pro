package V0;

import A1.s;
import A1.t;
import R0.AbstractC1590h0;
import R0.AbstractC1625z0;
import R0.C1598l0;
import R0.C1600m0;
import R0.C1623y0;
import R0.InterfaceC1586f0;
import R0.InterfaceC1621x0;
import R0.X;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC1621x0 f10261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1586f0 f10262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public A1.d f10263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f10264d = t.Ltr;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10265e = A1.r.f455b.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10266f = C1623y0.f9449b.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final T0.a f10267g = new T0.a();

    public final void a(T0.f fVar) {
        T0.f.w1(fVar, C1598l0.f9405b.a(), 0L, 0L, 0.0f, null, null, X.f9354a.a(), 62, null);
    }

    public final void b(int i8, long j8, A1.d dVar, t tVar, Q6.k kVar) {
        this.f10263c = dVar;
        this.f10264d = tVar;
        InterfaceC1621x0 interfaceC1621x0B = this.f10261a;
        InterfaceC1586f0 interfaceC1586f0A = this.f10262b;
        if (interfaceC1621x0B == null || interfaceC1586f0A == null || A1.r.g(j8) > interfaceC1621x0B.g() || A1.r.f(j8) > interfaceC1621x0B.f() || !C1623y0.i(this.f10266f, i8)) {
            interfaceC1621x0B = AbstractC1625z0.b(A1.r.g(j8), A1.r.f(j8), i8, false, null, 24, null);
            interfaceC1586f0A = AbstractC1590h0.a(interfaceC1621x0B);
            this.f10261a = interfaceC1621x0B;
            this.f10262b = interfaceC1586f0A;
            this.f10266f = i8;
        }
        this.f10265e = j8;
        T0.a aVar = this.f10267g;
        long jC = s.c(j8);
        T0.a.C0273a c0273aT = aVar.t();
        A1.d dVarA = c0273aT.a();
        t tVarB = c0273aT.b();
        InterfaceC1586f0 interfaceC1586f0C = c0273aT.c();
        long jD = c0273aT.d();
        T0.a.C0273a c0273aT2 = aVar.t();
        c0273aT2.j(dVar);
        c0273aT2.k(tVar);
        c0273aT2.i(interfaceC1586f0A);
        c0273aT2.l(jC);
        interfaceC1586f0A.k();
        a(aVar);
        kVar.invoke(aVar);
        interfaceC1586f0A.x();
        T0.a.C0273a c0273aT3 = aVar.t();
        c0273aT3.j(dVarA);
        c0273aT3.k(tVarB);
        c0273aT3.i(interfaceC1586f0C);
        c0273aT3.l(jD);
        interfaceC1621x0B.a();
    }

    public final void c(T0.f fVar, float f8, C1600m0 c1600m0) {
        InterfaceC1621x0 interfaceC1621x0 = this.f10261a;
        if (interfaceC1621x0 == null) {
            throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        T0.f.F0(fVar, interfaceC1621x0, 0L, this.f10265e, 0L, 0L, f8, null, c1600m0, 0, 0, 858, null);
    }

    public final InterfaceC1621x0 d() {
        return this.f10261a;
    }
}
