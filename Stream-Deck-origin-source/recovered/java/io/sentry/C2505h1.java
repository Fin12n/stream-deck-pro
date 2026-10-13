package io.sentry;

/* JADX INFO: renamed from: io.sentry.h1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2505h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public io.sentry.protocol.u f27164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i3 f27165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i3 f27166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f27167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2487d f27168e;

    public C2505h1() {
        this(new io.sentry.protocol.u(), new i3(), null, null, null);
    }

    public C2487d a() {
        return this.f27168e;
    }

    public i3 b() {
        return this.f27166c;
    }

    public Double c() {
        Double dJ = this.f27168e.j();
        return Double.valueOf(dJ == null ? 0.0d : dJ.doubleValue());
    }

    public i3 d() {
        return this.f27165b;
    }

    public io.sentry.protocol.u e() {
        return this.f27164a;
    }

    public Boolean f() {
        return this.f27167d;
    }

    public d3 g() {
        d3 d3Var = new d3(this.f27164a, this.f27165b, "default", null, null);
        d3Var.r("auto");
        return d3Var;
    }

    public p3 h() {
        C2487d c2487d = this.f27168e;
        if (c2487d != null) {
            return c2487d.O();
        }
        return null;
    }

    public C2505h1(C2505h1 c2505h1) {
        this(c2505h1.e(), c2505h1.d(), c2505h1.b(), c2505h1.a(), c2505h1.f());
    }

    public C2505h1(io.sentry.protocol.u uVar, i3 i3Var, i3 i3Var2, C2487d c2487d, Boolean bool) {
        this.f27164a = uVar;
        this.f27165b = i3Var;
        this.f27166c = i3Var2;
        this.f27168e = io.sentry.util.F.e(c2487d, bool, null, null);
        this.f27167d = bool;
    }
}
