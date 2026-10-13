package io.sentry;

import io.sentry.protocol.C2541c;
import io.sentry.protocol.C2546h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c3 implements InterfaceC2488d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public U1 f27000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public U1 f27001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d3 f27002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V2 f27003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Throwable f27004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final X f27005f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j3 f27008i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f3 f27009j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f27006g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f27007h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f27010k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f27011l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C2541c f27012m = new C2541c();

    public c3(V2 v8, X x8, d3 d3Var, j3 j3Var, f3 f3Var) {
        this.f27002c = d3Var;
        d3Var.r(j3Var.a());
        this.f27003d = (V2) io.sentry.util.u.c(v8, "transaction is required");
        this.f27005f = (X) io.sentry.util.u.c(x8, "Scopes are required");
        this.f27008i = j3Var;
        this.f27009j = f3Var;
        U1 u1C = j3Var.c();
        if (u1C != null) {
            this.f27000a = u1C;
        } else {
            this.f27000a = x8.b().getDateProvider().a();
        }
    }

    public i3 A() {
        return this.f27002c.g();
    }

    public r3 B() {
        return this.f27002c.j();
    }

    public f3 C() {
        return this.f27009j;
    }

    public i3 D() {
        return this.f27002c.k();
    }

    public Map E() {
        return this.f27002c.m();
    }

    public io.sentry.protocol.u F() {
        return this.f27002c.n();
    }

    public Boolean G() {
        return this.f27002c.h();
    }

    public Boolean H() {
        return this.f27002c.i();
    }

    public void I(f3 f3Var) {
        this.f27009j = f3Var;
    }

    public final void J(U1 u8) {
        this.f27000a = u8;
    }

    @Override // io.sentry.InterfaceC2488d0
    public k3 a() {
        return this.f27002c.l();
    }

    @Override // io.sentry.InterfaceC2488d0
    public void c(String str, Object obj) {
        this.f27010k.put(str, obj);
    }

    @Override // io.sentry.InterfaceC2488d0
    public boolean d() {
        return this.f27006g;
    }

    @Override // io.sentry.InterfaceC2488d0
    public boolean f(U1 u8) {
        if (this.f27001b == null) {
            return false;
        }
        this.f27001b = u8;
        return true;
    }

    @Override // io.sentry.InterfaceC2488d0
    public void g(k3 k3Var) {
        t(k3Var, this.f27005f.b().getDateProvider().a());
    }

    @Override // io.sentry.InterfaceC2488d0
    public String getDescription() {
        return this.f27002c.c();
    }

    @Override // io.sentry.InterfaceC2488d0
    public InterfaceC2488d0 h(String str, String str2, U1 u8, EnumC2512j0 enumC2512j0) {
        return l(str, str2, u8, enumC2512j0, new j3());
    }

    @Override // io.sentry.InterfaceC2488d0
    public void i() {
        g(this.f27002c.l());
    }

    @Override // io.sentry.InterfaceC2488d0
    public void j(String str, Number number, InterfaceC2594z0 interfaceC2594z0) {
        if (d()) {
            this.f27005f.b().getLogger().c(EnumC2596z2.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f27011l.put(str, new C2546h(number, interfaceC2594z0.apiName()));
        if (this.f27003d.L() != this) {
            this.f27003d.W(str, number, interfaceC2594z0);
        }
    }

    @Override // io.sentry.InterfaceC2488d0
    public InterfaceC2488d0 l(String str, String str2, U1 u8, EnumC2512j0 enumC2512j0, j3 j3Var) {
        return this.f27006g ? Q0.v() : this.f27003d.X(this.f27002c.k(), str, str2, u8, enumC2512j0, j3Var);
    }

    @Override // io.sentry.InterfaceC2488d0
    public void m(String str) {
        this.f27002c.p(str);
    }

    @Override // io.sentry.InterfaceC2488d0
    public d3 p() {
        return this.f27002c;
    }

    @Override // io.sentry.InterfaceC2488d0
    public U1 r() {
        return this.f27001b;
    }

    @Override // io.sentry.InterfaceC2488d0
    public void s(String str, Number number) {
        if (d()) {
            this.f27005f.b().getLogger().c(EnumC2596z2.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f27011l.put(str, new C2546h(number, null));
        if (this.f27003d.L() != this) {
            this.f27003d.V(str, number);
        }
    }

    @Override // io.sentry.InterfaceC2488d0
    public void t(k3 k3Var, U1 u8) {
        U1 u9;
        if (this.f27006g || !this.f27007h.compareAndSet(false, true)) {
            return;
        }
        this.f27002c.t(k3Var);
        if (u8 == null) {
            u8 = this.f27005f.b().getDateProvider().a();
        }
        this.f27001b = u8;
        if (this.f27008i.f() || this.f27008i.e()) {
            U1 u1U = null;
            U1 u1R = null;
            for (c3 c3Var : this.f27003d.L().D().equals(D()) ? this.f27003d.I() : w()) {
                if (u1U == null || c3Var.u().d(u1U)) {
                    u1U = c3Var.u();
                }
                if (u1R == null || (c3Var.r() != null && c3Var.r().c(u1R))) {
                    u1R = c3Var.r();
                }
            }
            if (this.f27008i.f() && u1U != null && this.f27000a.d(u1U)) {
                J(u1U);
            }
            if (this.f27008i.e() && u1R != null && ((u9 = this.f27001b) == null || u9.c(u1R))) {
                f(u1R);
            }
        }
        Throwable th = this.f27004e;
        if (th != null) {
            this.f27005f.f(th, this, this.f27003d.getName());
        }
        f3 f3Var = this.f27009j;
        if (f3Var != null) {
            f3Var.a(this);
        }
        this.f27006g = true;
    }

    @Override // io.sentry.InterfaceC2488d0
    public U1 u() {
        return this.f27000a;
    }

    public Map v() {
        return this.f27010k;
    }

    public final List w() {
        ArrayList arrayList = new ArrayList();
        for (c3 c3Var : this.f27003d.N()) {
            if (c3Var.A() != null && c3Var.A().equals(D())) {
                arrayList.add(c3Var);
            }
        }
        return arrayList;
    }

    public Map x() {
        return this.f27011l;
    }

    public String y() {
        return this.f27002c.e();
    }

    public j3 z() {
        return this.f27008i;
    }

    public c3(s3 s3Var, V2 v8, X x8, j3 j3Var) {
        d3 d3Var = (d3) io.sentry.util.u.c(s3Var, "context is required");
        this.f27002c = d3Var;
        d3Var.r(j3Var.a());
        this.f27003d = (V2) io.sentry.util.u.c(v8, "sentryTracer is required");
        this.f27005f = (X) io.sentry.util.u.c(x8, "scopes are required");
        this.f27009j = null;
        U1 u1C = j3Var.c();
        if (u1C != null) {
            this.f27000a = u1C;
        } else {
            this.f27000a = x8.b().getDateProvider().a();
        }
        this.f27008i = j3Var;
    }
}
