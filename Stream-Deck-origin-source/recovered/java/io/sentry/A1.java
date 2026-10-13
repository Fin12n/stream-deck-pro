package io.sentry;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class A1 implements X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A1 f25810a = new A1();

    public static A1 d() {
        return f25810a;
    }

    @Override // io.sentry.X
    public io.sentry.protocol.u B(Throwable th, H h8) {
        return M1.j(th, h8);
    }

    @Override // io.sentry.X
    public io.sentry.protocol.u C(io.sentry.protocol.B b8, p3 p3Var, H h8, C2497f1 c2497f1) {
        return M1.q().C(b8, p3Var, h8, c2497f1);
    }

    @Override // io.sentry.X
    public X E(String str) {
        return M1.p(str);
    }

    @Override // io.sentry.X
    public io.sentry.protocol.u F(C2557s2 c2557s2, H h8) {
        return M1.h(c2557s2, h8);
    }

    @Override // io.sentry.X
    public void a(boolean z8) {
        M1.k();
    }

    @Override // io.sentry.X
    public J2 b() {
        return M1.q().b();
    }

    @Override // io.sentry.X
    public void c(io.sentry.protocol.F f8) {
        M1.F(f8);
    }

    @Override // io.sentry.X
    public void e(C2491e c2491e, H h8) {
        M1.f(c2491e, h8);
    }

    @Override // io.sentry.X
    public void f(Throwable th, InterfaceC2488d0 interfaceC2488d0, String str) {
        M1.q().f(th, interfaceC2488d0, str);
    }

    @Override // io.sentry.X
    public InterfaceC2496f0 h() {
        return M1.q().h();
    }

    @Override // io.sentry.X
    public void i(C2491e c2491e) {
        e(c2491e, new H());
    }

    @Override // io.sentry.X
    public boolean isEnabled() {
        return M1.z();
    }

    @Override // io.sentry.X
    public void j() {
        M1.m();
    }

    @Override // io.sentry.X
    public void k() {
        M1.G();
    }

    @Override // io.sentry.X
    public io.sentry.transport.A m() {
        return M1.q().m();
    }

    @Override // io.sentry.X
    public boolean n() {
        return M1.A();
    }

    @Override // io.sentry.X
    public void p(long j8) {
        M1.o(j8);
    }

    @Override // io.sentry.X
    public InterfaceC2480b0 q() {
        return J0.b();
    }

    @Override // io.sentry.X
    public io.sentry.protocol.u r(W1 w8, H h8) {
        return M1.q().r(w8, h8);
    }

    @Override // io.sentry.X
    public InterfaceC2496f0 s(s3 s3Var, u3 u3Var) {
        return M1.H(s3Var, u3Var);
    }

    @Override // io.sentry.X
    public void w(EnumC2556s1 enumC2556s1, InterfaceC2549q1 interfaceC2549q1) {
        M1.l(enumC2556s1, interfaceC2549q1);
    }

    @Override // io.sentry.X
    public io.sentry.protocol.u x(K2 k8, H h8) {
        return M1.q().x(k8, h8);
    }

    @Override // io.sentry.X
    public V y() {
        return M1.q().y();
    }

    @Override // io.sentry.X
    public void z(InterfaceC2549q1 interfaceC2549q1) {
        M1.I(interfaceC2549q1);
    }

    @Override // io.sentry.X
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public P m221clone() {
        return M1.q().m234clone();
    }
}
