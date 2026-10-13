package io.sentry;

import io.sentry.protocol.C2541c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class H0 implements V {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H0 f25884b = new H0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2 f25885a = J2.empty();

    public static H0 i() {
        return f25884b;
    }

    @Override // io.sentry.V
    public C2541c B() {
        return new C2541c();
    }

    @Override // io.sentry.V
    public C2505h1 C(C2533o1.a aVar) {
        return new C2505h1();
    }

    @Override // io.sentry.V
    public String D() {
        return null;
    }

    @Override // io.sentry.V
    public List H() {
        return new ArrayList();
    }

    @Override // io.sentry.V
    public io.sentry.protocol.F I() {
        return null;
    }

    @Override // io.sentry.V
    public io.sentry.protocol.l J() {
        return null;
    }

    @Override // io.sentry.V
    public List K() {
        return new ArrayList();
    }

    @Override // io.sentry.V
    public String L() {
        return null;
    }

    @Override // io.sentry.V
    public J2 b() {
        return this.f25885a;
    }

    @Override // io.sentry.V
    public Map getExtras() {
        return new HashMap();
    }

    @Override // io.sentry.V
    public Map getTags() {
        return new HashMap();
    }

    @Override // io.sentry.V
    public InterfaceC2496f0 h() {
        return null;
    }

    @Override // io.sentry.V
    public Y2 j() {
        return null;
    }

    @Override // io.sentry.V
    public C2533o1.d k() {
        return null;
    }

    @Override // io.sentry.V
    public InterfaceC2488d0 p() {
        return null;
    }

    @Override // io.sentry.V
    public Y2 q() {
        return null;
    }

    @Override // io.sentry.V
    public Queue r() {
        return new ArrayDeque();
    }

    @Override // io.sentry.V
    public EnumC2596z2 s() {
        return null;
    }

    @Override // io.sentry.V
    public io.sentry.protocol.u t() {
        return io.sentry.protocol.u.f27472b;
    }

    @Override // io.sentry.V
    public C2505h1 u() {
        return new C2505h1();
    }

    @Override // io.sentry.V
    public Y2 v(C2533o1.b bVar) {
        return null;
    }

    @Override // io.sentry.V
    public Z x() {
        return L0.f();
    }

    @Override // io.sentry.V
    public List y() {
        return new ArrayList();
    }

    @Override // io.sentry.V
    public List z() {
        return new ArrayList();
    }

    @Override // io.sentry.V
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public V m223clone() {
        return i();
    }

    @Override // io.sentry.V
    public void clear() {
    }

    @Override // io.sentry.V
    public void n() {
    }

    @Override // io.sentry.V
    public void A(C2557s2 c2557s2) {
    }

    @Override // io.sentry.V
    public void E(C2533o1.c cVar) {
    }

    @Override // io.sentry.V
    public void F(io.sentry.protocol.u uVar) {
    }

    @Override // io.sentry.V
    public void G(InterfaceC2496f0 interfaceC2496f0) {
    }

    @Override // io.sentry.V
    public void M(C2505h1 c2505h1) {
    }

    @Override // io.sentry.V
    public void c(io.sentry.protocol.F f8) {
    }

    @Override // io.sentry.V
    public void g(io.sentry.protocol.u uVar) {
    }

    @Override // io.sentry.V
    public void l(EnumC2596z2 enumC2596z2) {
    }

    @Override // io.sentry.V
    public void m(J2 j8) {
    }

    @Override // io.sentry.V
    public void o(Z z8) {
    }

    @Override // io.sentry.V
    public void w(String str) {
    }

    @Override // io.sentry.V
    public void a(String str, String str2) {
    }

    @Override // io.sentry.V
    public void d(String str, String str2) {
    }

    @Override // io.sentry.V
    public void e(C2491e c2491e, H h8) {
    }

    @Override // io.sentry.V
    public void f(Throwable th, InterfaceC2488d0 interfaceC2488d0, String str) {
    }
}
