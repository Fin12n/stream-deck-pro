package R0;

/* JADX INFO: renamed from: R0.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1586f0 {
    static /* synthetic */ void m(InterfaceC1586f0 interfaceC1586f0, H0 h8, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i9 & 2) != 0) {
            i8 = AbstractC1596k0.f9402a.b();
        }
        interfaceC1586f0.b(h8, i8);
    }

    static /* synthetic */ void q(InterfaceC1586f0 interfaceC1586f0, float f8, float f9, float f10, float f11, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i9 & 16) != 0) {
            i8 = AbstractC1596k0.f9402a.b();
        }
        interfaceC1586f0.c(f8, f9, f10, f11, i8);
    }

    static /* synthetic */ void v(InterfaceC1586f0 interfaceC1586f0, Q0.h hVar, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i9 & 2) != 0) {
            i8 = AbstractC1596k0.f9402a.b();
        }
        interfaceC1586f0.i(hVar, i8);
    }

    void b(H0 h8, int i8);

    void c(float f8, float f9, float f10, float f11, int i8);

    void d(float f8, float f9);

    void e(H0 h8, F0 f8);

    void f(Q0.h hVar, F0 f8);

    void g(float f8, float f9);

    void h(float f8);

    default void i(Q0.h hVar, int i8) {
        c(hVar.i(), hVar.l(), hVar.j(), hVar.e(), i8);
    }

    void j(float f8, float f9, float f10, float f11, float f12, float f13, boolean z8, F0 f14);

    void k();

    void l();

    void n(InterfaceC1621x0 interfaceC1621x0, long j8, F0 f8);

    void o(float[] fArr);

    void p(InterfaceC1621x0 interfaceC1621x0, long j8, long j9, long j10, long j11, F0 f8);

    void r(long j8, float f8, F0 f9);

    void s(float f8, float f9, float f10, float f11, F0 f12);

    void t(long j8, long j9, F0 f8);

    void u(float f8, float f9, float f10, float f11, float f12, float f13, F0 f14);

    default void w(Q0.h hVar, F0 f8) {
        s(hVar.i(), hVar.l(), hVar.j(), hVar.e(), f8);
    }

    void x();

    void y();
}
