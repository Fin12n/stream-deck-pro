package io.sentry;

import io.sentry.protocol.C2539a;
import io.sentry.protocol.C2540b;
import io.sentry.protocol.C2541c;
import io.sentry.protocol.C2543e;
import io.sentry.protocol.C2545g;
import java.util.Enumeration;
import java.util.Set;

/* JADX INFO: renamed from: io.sentry.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2499g extends C2541c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2541c f27146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2541c f27147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2541c f27148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EnumC2556s1 f27149f;

    /* JADX INFO: renamed from: io.sentry.g$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27150a;

        static {
            int[] iArr = new int[EnumC2556s1.values().length];
            f27150a = iArr;
            try {
                iArr[EnumC2556s1.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27150a[EnumC2556s1.ISOLATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27150a[EnumC2556s1.GLOBAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C2499g(C2541c c2541c, C2541c c2541c2, C2541c c2541c3, EnumC2556s1 enumC2556s1) {
        this.f27146c = c2541c;
        this.f27147d = c2541c2;
        this.f27148e = c2541c3;
        this.f27149f = enumC2556s1;
    }

    @Override // io.sentry.protocol.C2541c
    public boolean a(Object obj) {
        return this.f27146c.a(obj) || this.f27147d.a(obj) || this.f27148e.a(obj);
    }

    @Override // io.sentry.protocol.C2541c
    public Set b() {
        return x().b();
    }

    @Override // io.sentry.protocol.C2541c
    public Object c(Object obj) {
        Object objC = this.f27148e.c(obj);
        if (objC != null) {
            return objC;
        }
        Object objC2 = this.f27147d.c(obj);
        return objC2 != null ? objC2 : this.f27146c.c(obj);
    }

    @Override // io.sentry.protocol.C2541c
    public C2539a d() {
        C2539a c2539aD = this.f27148e.d();
        if (c2539aD != null) {
            return c2539aD;
        }
        C2539a c2539aD2 = this.f27147d.d();
        return c2539aD2 != null ? c2539aD2 : this.f27146c.d();
    }

    @Override // io.sentry.protocol.C2541c
    public C2543e e() {
        C2543e c2543eE = this.f27148e.e();
        if (c2543eE != null) {
            return c2543eE;
        }
        C2543e c2543eE2 = this.f27147d.e();
        return c2543eE2 != null ? c2543eE2 : this.f27146c.e();
    }

    @Override // io.sentry.protocol.C2541c
    public io.sentry.protocol.k f() {
        io.sentry.protocol.k kVarF = this.f27148e.f();
        if (kVarF != null) {
            return kVarF;
        }
        io.sentry.protocol.k kVarF2 = this.f27147d.f();
        return kVarF2 != null ? kVarF2 : this.f27146c.f();
    }

    @Override // io.sentry.protocol.C2541c
    public io.sentry.protocol.w g() {
        io.sentry.protocol.w wVarG = this.f27148e.g();
        if (wVarG != null) {
            return wVarG;
        }
        io.sentry.protocol.w wVarG2 = this.f27147d.g();
        return wVarG2 != null ? wVarG2 : this.f27146c.g();
    }

    @Override // io.sentry.protocol.C2541c
    public d3 h() {
        d3 d3VarH = this.f27148e.h();
        if (d3VarH != null) {
            return d3VarH;
        }
        d3 d3VarH2 = this.f27147d.h();
        return d3VarH2 != null ? d3VarH2 : this.f27146c.h();
    }

    @Override // io.sentry.protocol.C2541c
    public Enumeration i() {
        return x().i();
    }

    @Override // io.sentry.protocol.C2541c
    public Object j(String str, Object obj) {
        return w().j(str, obj);
    }

    @Override // io.sentry.protocol.C2541c
    public Object l(Object obj) {
        return w().l(obj);
    }

    @Override // io.sentry.protocol.C2541c
    public void m(C2539a c2539a) {
        w().m(c2539a);
    }

    @Override // io.sentry.protocol.C2541c
    public void n(C2540b c2540b) {
        w().n(c2540b);
    }

    @Override // io.sentry.protocol.C2541c
    public void o(C2543e c2543e) {
        w().o(c2543e);
    }

    @Override // io.sentry.protocol.C2541c
    public void p(C2545g c2545g) {
        w().p(c2545g);
    }

    @Override // io.sentry.protocol.C2541c
    public void q(io.sentry.protocol.k kVar) {
        w().q(kVar);
    }

    @Override // io.sentry.protocol.C2541c
    public void r(io.sentry.protocol.m mVar) {
        w().r(mVar);
    }

    @Override // io.sentry.protocol.C2541c
    public void s(io.sentry.protocol.w wVar) {
        w().s(wVar);
    }

    @Override // io.sentry.protocol.C2541c, io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x().serialize(x8, iLogger);
    }

    @Override // io.sentry.protocol.C2541c
    public void t(io.sentry.protocol.C c8) {
        w().t(c8);
    }

    @Override // io.sentry.protocol.C2541c
    public void u(d3 d3Var) {
        w().u(d3Var);
    }

    public final C2541c w() {
        int i8 = a.f27150a[this.f27149f.ordinal()];
        if (i8 == 1) {
            return this.f27148e;
        }
        if (i8 != 2) {
            return i8 != 3 ? this.f27148e : this.f27146c;
        }
        return this.f27147d;
    }

    public final C2541c x() {
        C2541c c2541c = new C2541c();
        c2541c.k(this.f27146c);
        c2541c.k(this.f27147d);
        c2541c.k(this.f27148e);
        return c2541c;
    }
}
