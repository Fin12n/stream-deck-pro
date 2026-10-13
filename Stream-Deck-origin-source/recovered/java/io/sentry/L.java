package io.sentry;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class L implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X f25927a;

    public L(X x8) {
        this.f25927a = x8;
    }

    @Override // io.sentry.X
    public io.sentry.protocol.u B(Throwable th, H h8) {
        return this.f25927a.B(th, h8);
    }

    @Override // io.sentry.X
    public io.sentry.protocol.u C(io.sentry.protocol.B b8, p3 p3Var, H h8, C2497f1 c2497f1) {
        return this.f25927a.C(b8, p3Var, h8, c2497f1);
    }

    @Override // io.sentry.X
    public X E(String str) {
        return this.f25927a.E(str);
    }

    @Override // io.sentry.X
    public io.sentry.protocol.u F(C2557s2 c2557s2, H h8) {
        return this.f25927a.F(c2557s2, h8);
    }

    @Override // io.sentry.X
    public void a(boolean z8) {
        this.f25927a.a(z8);
    }

    @Override // io.sentry.X
    public J2 b() {
        return this.f25927a.b();
    }

    @Override // io.sentry.X
    public void c(io.sentry.protocol.F f8) {
        this.f25927a.c(f8);
    }

    @Override // io.sentry.X
    public void e(C2491e c2491e, H h8) {
        this.f25927a.e(c2491e, h8);
    }

    @Override // io.sentry.X
    public void f(Throwable th, InterfaceC2488d0 interfaceC2488d0, String str) {
        this.f25927a.f(th, interfaceC2488d0, str);
    }

    @Override // io.sentry.X
    public InterfaceC2496f0 h() {
        return this.f25927a.h();
    }

    @Override // io.sentry.X
    public void i(C2491e c2491e) {
        this.f25927a.i(c2491e);
    }

    @Override // io.sentry.X
    public boolean isEnabled() {
        return this.f25927a.isEnabled();
    }

    @Override // io.sentry.X
    public void j() {
        this.f25927a.j();
    }

    @Override // io.sentry.X
    public void k() {
        this.f25927a.k();
    }

    @Override // io.sentry.X
    public io.sentry.transport.A m() {
        return this.f25927a.m();
    }

    @Override // io.sentry.X
    public boolean n() {
        return this.f25927a.n();
    }

    @Override // io.sentry.X
    public void p(long j8) {
        this.f25927a.p(j8);
    }

    @Override // io.sentry.X
    public InterfaceC2480b0 q() {
        return this.f25927a.q();
    }

    @Override // io.sentry.X
    public io.sentry.protocol.u r(W1 w8, H h8) {
        return this.f25927a.r(w8, h8);
    }

    @Override // io.sentry.X
    public InterfaceC2496f0 s(s3 s3Var, u3 u3Var) {
        return this.f25927a.s(s3Var, u3Var);
    }

    @Override // io.sentry.X
    public void w(EnumC2556s1 enumC2556s1, InterfaceC2549q1 interfaceC2549q1) {
        this.f25927a.w(enumC2556s1, interfaceC2549q1);
    }

    @Override // io.sentry.X
    public io.sentry.protocol.u x(K2 k8, H h8) {
        return this.f25927a.x(k8, h8);
    }

    @Override // io.sentry.X
    public V y() {
        return this.f25927a.y();
    }

    @Override // io.sentry.X
    public void z(InterfaceC2549q1 interfaceC2549q1) {
        this.f25927a.z(interfaceC2549q1);
    }

    @Override // io.sentry.X
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public P m225clone() {
        return this.f25927a.m225clone();
    }
}
