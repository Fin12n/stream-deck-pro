package T0;

import A1.n;
import A1.s;
import A1.t;
import Q0.l;
import Q0.m;
import R0.AbstractC1582d0;
import R0.AbstractC1615u0;
import R0.C1600m0;
import R0.H0;
import R0.I0;
import R0.InterfaceC1621x0;
import R0.X;
import p179u4.eubL.OjEsfyJYzbPn;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface f extends A1.d {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final a f9808L = a.f9809a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f9809a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f9810b = X.f9354a.B();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f9811c = AbstractC1615u0.f9427a.a();

        public final int a() {
            return f9810b;
        }

        public final int b() {
            return f9811c;
        }
    }

    static /* synthetic */ void F0(f fVar, InterfaceC1621x0 interfaceC1621x0, long j8, long j9, long j10, long j11, float f8, g gVar, C1600m0 c1600m0, int i8, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long jA = (i10 & 2) != 0 ? n.f446b.a() : j8;
        long jA2 = (i10 & 4) != 0 ? s.a(interfaceC1621x0.g(), interfaceC1621x0.f()) : j9;
        fVar.X(interfaceC1621x0, jA, jA2, (i10 & 8) != 0 ? n.f446b.a() : j10, (i10 & 16) != 0 ? jA2 : j11, (i10 & 32) != 0 ? 1.0f : f8, (i10 & 64) != 0 ? j.f9812a : gVar, (i10 & 128) != 0 ? null : c1600m0, (i10 & 256) != 0 ? f9808L.a() : i8, (i10 & 512) != 0 ? f9808L.b() : i9);
    }

    static /* synthetic */ void G0(f fVar, long j8, long j9, long j10, long j11, g gVar, float f8, C1600m0 c1600m0, int i8, int i9, Object obj) {
        f fVar2;
        long jR0;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        long jC = (i9 & 2) != 0 ? Q0.f.f9082b.c() : j9;
        if ((i9 & 4) != 0) {
            fVar2 = fVar;
            jR0 = fVar2.r0(fVar.d(), jC);
        } else {
            fVar2 = fVar;
            jR0 = j10;
        }
        fVar2.u1(j8, jC, jR0, (i9 & 8) != 0 ? Q0.a.f9076a.a() : j11, (i9 & 16) != 0 ? j.f9812a : gVar, (i9 & 32) != 0 ? 1.0f : f8, (i9 & 64) != 0 ? null : c1600m0, (i9 & 128) != 0 ? f9808L.a() : i8);
    }

    static /* synthetic */ void c0(f fVar, long j8, float f8, float f9, boolean z8, long j9, long j10, float f10, g gVar, C1600m0 c1600m0, int i8, int i9, Object obj) {
        f fVar2;
        long jR0;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long jC = (i9 & 16) != 0 ? Q0.f.f9082b.c() : j9;
        if ((i9 & 32) != 0) {
            fVar2 = fVar;
            jR0 = fVar2.r0(fVar.d(), jC);
        } else {
            fVar2 = fVar;
            jR0 = j10;
        }
        fVar2.a0(j8, f8, f9, z8, jC, jR0, (i9 & 64) != 0 ? 1.0f : f10, (i9 & 128) != 0 ? j.f9812a : gVar, (i9 & 256) != 0 ? null : c1600m0, (i9 & 512) != 0 ? f9808L.a() : i8);
    }

    static /* synthetic */ void d0(f fVar, AbstractC1582d0 abstractC1582d0, long j8, long j9, long j10, float f8, g gVar, C1600m0 c1600m0, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long jC = (i9 & 2) != 0 ? Q0.f.f9082b.c() : j8;
        fVar.z(abstractC1582d0, jC, (i9 & 4) != 0 ? fVar.r0(fVar.d(), jC) : j9, (i9 & 8) != 0 ? Q0.a.f9076a.a() : j10, (i9 & 16) != 0 ? 1.0f : f8, (i9 & 32) != 0 ? j.f9812a : gVar, (i9 & 64) != 0 ? null : c1600m0, (i9 & 128) != 0 ? f9808L.a() : i8);
    }

    static /* synthetic */ void e0(f fVar, H0 h8, AbstractC1582d0 abstractC1582d0, float f8, g gVar, C1600m0 c1600m0, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i9 & 4) != 0) {
            f8 = 1.0f;
        }
        float f9 = f8;
        if ((i9 & 8) != 0) {
            gVar = j.f9812a;
        }
        g gVar2 = gVar;
        if ((i9 & 16) != 0) {
            c1600m0 = null;
        }
        C1600m0 c1600m1 = c1600m0;
        if ((i9 & 32) != 0) {
            i8 = f9808L.a();
        }
        fVar.A0(h8, abstractC1582d0, f9, gVar2, c1600m1, i8);
    }

    static /* synthetic */ void j1(f fVar, InterfaceC1621x0 interfaceC1621x0, long j8, float f8, g gVar, C1600m0 c1600m0, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        fVar.t0(interfaceC1621x0, (i9 & 2) != 0 ? Q0.f.f9082b.c() : j8, (i9 & 4) != 0 ? 1.0f : f8, (i9 & 8) != 0 ? j.f9812a : gVar, (i9 & 16) != 0 ? null : c1600m0, (i9 & 32) != 0 ? f9808L.a() : i8);
    }

    static /* synthetic */ void m0(f fVar, long j8, float f8, long j9, float f9, g gVar, C1600m0 c1600m0, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        if ((i9 & 2) != 0) {
            f8 = l.h(fVar.d()) / 2.0f;
        }
        fVar.D(j8, f8, (i9 & 4) != 0 ? fVar.c1() : j9, (i9 & 8) != 0 ? 1.0f : f9, (i9 & 16) != 0 ? j.f9812a : gVar, (i9 & 32) != 0 ? null : c1600m0, (i9 & 64) != 0 ? f9808L.a() : i8);
    }

    static /* synthetic */ void p1(f fVar, long j8, long j9, long j10, float f8, int i8, I0 i9, float f9, C1600m0 c1600m0, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        fVar.Y(j8, j9, j10, (i11 & 8) != 0 ? 0.0f : f8, (i11 & 16) != 0 ? k.f9813f.a() : i8, (i11 & 32) != 0 ? null : i9, (i11 & 64) != 0 ? 1.0f : f9, (i11 & 128) != 0 ? null : c1600m0, (i11 & 256) != 0 ? f9808L.a() : i10);
    }

    static /* synthetic */ void q0(f fVar, AbstractC1582d0 abstractC1582d0, long j8, long j9, float f8, g gVar, C1600m0 c1600m0, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long jC = (i9 & 2) != 0 ? Q0.f.f9082b.c() : j8;
        fVar.y1(abstractC1582d0, jC, (i9 & 4) != 0 ? fVar.r0(fVar.d(), jC) : j9, (i9 & 8) != 0 ? 1.0f : f8, (i9 & 16) != 0 ? j.f9812a : gVar, (i9 & 32) != 0 ? null : c1600m0, (i9 & 64) != 0 ? f9808L.a() : i8);
    }

    static /* synthetic */ void s0(f fVar, AbstractC1582d0 abstractC1582d0, long j8, long j9, float f8, int i8, I0 i9, float f9, C1600m0 c1600m0, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        fVar.Y0(abstractC1582d0, j8, j9, (i11 & 8) != 0 ? 0.0f : f8, (i11 & 16) != 0 ? k.f9813f.a() : i8, (i11 & 32) != 0 ? null : i9, (i11 & 64) != 0 ? 1.0f : f9, (i11 & 128) != 0 ? null : c1600m0, (i11 & 256) != 0 ? f9808L.a() : i10);
    }

    void A0(H0 h8, AbstractC1582d0 abstractC1582d0, float f8, g gVar, C1600m0 c1600m0, int i8);

    void D(long j8, float f8, long j9, float f9, g gVar, C1600m0 c1600m0, int i8);

    d K0();

    void U(long j8, long j9, long j10, float f8, g gVar, C1600m0 c1600m0, int i8);

    void X(InterfaceC1621x0 interfaceC1621x0, long j8, long j9, long j10, long j11, float f8, g gVar, C1600m0 c1600m0, int i8, int i9);

    void Y(long j8, long j9, long j10, float f8, int i8, I0 i9, float f9, C1600m0 c1600m0, int i10);

    void Y0(AbstractC1582d0 abstractC1582d0, long j8, long j9, float f8, int i8, I0 i9, float f9, C1600m0 c1600m0, int i10);

    void a0(long j8, float f8, float f9, boolean z8, long j9, long j10, float f10, g gVar, C1600m0 c1600m0, int i8);

    default long c1() {
        return m.b(K0().d());
    }

    default long d() {
        return K0().d();
    }

    t getLayoutDirection();

    default long r0(long j8, long j9) {
        return m.a(l.i(j8) - Q0.f.o(j9), l.g(j8) - Q0.f.p(j9));
    }

    void t0(InterfaceC1621x0 interfaceC1621x0, long j8, float f8, g gVar, C1600m0 c1600m0, int i8);

    void u1(long j8, long j9, long j10, long j11, g gVar, float f8, C1600m0 c1600m0, int i8);

    void y1(AbstractC1582d0 abstractC1582d0, long j8, long j9, float f8, g gVar, C1600m0 c1600m0, int i8);

    void z(AbstractC1582d0 abstractC1582d0, long j8, long j9, long j10, float f8, g gVar, C1600m0 c1600m0, int i8);

    void z1(H0 h8, long j8, float f8, g gVar, C1600m0 c1600m0, int i8);

    static /* synthetic */ void w1(f fVar, long j8, long j9, long j10, float f8, g gVar, C1600m0 c1600m0, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(OjEsfyJYzbPn.PwzebPiZk);
        }
        long jC = (i9 & 2) != 0 ? Q0.f.f9082b.c() : j9;
        fVar.U(j8, jC, (i9 & 4) != 0 ? fVar.r0(fVar.d(), jC) : j10, (i9 & 8) != 0 ? 1.0f : f8, (i9 & 16) != 0 ? j.f9812a : gVar, (i9 & 32) != 0 ? null : c1600m0, (i9 & 64) != 0 ? f9808L.a() : i8);
    }
}
