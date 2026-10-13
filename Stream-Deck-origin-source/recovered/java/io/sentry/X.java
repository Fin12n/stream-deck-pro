package io.sentry;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface X {
    default io.sentry.protocol.u A(Throwable th) {
        return B(th, new H());
    }

    io.sentry.protocol.u B(Throwable th, H h8);

    io.sentry.protocol.u C(io.sentry.protocol.B b8, p3 p3Var, H h8, C2497f1 c2497f1);

    default io.sentry.protocol.u D(W1 w8) {
        return r(w8, new H());
    }

    X E(String str);

    io.sentry.protocol.u F(C2557s2 c2557s2, H h8);

    void a(boolean z8);

    J2 b();

    void c(io.sentry.protocol.F f8);

    P clone();

    void e(C2491e c2491e, H h8);

    void f(Throwable th, InterfaceC2488d0 interfaceC2488d0, String str);

    InterfaceC2496f0 h();

    void i(C2491e c2491e);

    boolean isEnabled();

    void j();

    void k();

    io.sentry.transport.A m();

    boolean n();

    void p(long j8);

    InterfaceC2480b0 q();

    io.sentry.protocol.u r(W1 w8, H h8);

    InterfaceC2496f0 s(s3 s3Var, u3 u3Var);

    default io.sentry.protocol.u t(io.sentry.protocol.B b8, p3 p3Var, H h8) {
        return C(b8, p3Var, h8, null);
    }

    default void u(InterfaceC2549q1 interfaceC2549q1) {
        w(null, interfaceC2549q1);
    }

    default boolean v() {
        return false;
    }

    void w(EnumC2556s1 enumC2556s1, InterfaceC2549q1 interfaceC2549q1);

    io.sentry.protocol.u x(K2 k8, H h8);

    V y();

    void z(InterfaceC2549q1 interfaceC2549q1);
}
