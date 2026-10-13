package io.sentry;

import io.sentry.protocol.C2541c;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface V {
    void A(C2557s2 c2557s2);

    C2541c B();

    C2505h1 C(C2533o1.a aVar);

    String D();

    void E(C2533o1.c cVar);

    void F(io.sentry.protocol.u uVar);

    void G(InterfaceC2496f0 interfaceC2496f0);

    List H();

    io.sentry.protocol.F I();

    io.sentry.protocol.l J();

    List K();

    String L();

    void M(C2505h1 c2505h1);

    void a(String str, String str2);

    J2 b();

    void c(io.sentry.protocol.F f8);

    void clear();

    /* JADX INFO: renamed from: clone */
    V m233clone();

    void d(String str, String str2);

    void e(C2491e c2491e, H h8);

    void f(Throwable th, InterfaceC2488d0 interfaceC2488d0, String str);

    void g(io.sentry.protocol.u uVar);

    Map getExtras();

    Map getTags();

    InterfaceC2496f0 h();

    Y2 j();

    C2533o1.d k();

    void l(EnumC2596z2 enumC2596z2);

    void m(J2 j8);

    void n();

    void o(Z z8);

    InterfaceC2488d0 p();

    Y2 q();

    Queue r();

    EnumC2596z2 s();

    io.sentry.protocol.u t();

    C2505h1 u();

    Y2 v(C2533o1.b bVar);

    void w(String str);

    Z x();

    List y();

    List z();
}
