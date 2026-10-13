package io.sentry;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class s3 extends d3 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final io.sentry.protocol.E f27630r = io.sentry.protocol.E.CUSTOM;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f27631n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public io.sentry.protocol.E f27632o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r3 f27633p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f27634q;

    public s3(String str, String str2) {
        this(str, str2, (r3) null);
    }

    public static s3 v(C2505h1 c2505h1) {
        Boolean boolF = c2505h1.f();
        C2487d c2487dA = c2505h1.a();
        return new s3(c2505h1.e(), c2505h1.d(), c2505h1.b(), boolF == null ? null : new r3(boolF, c2487dA.l(), c2505h1.c()), c2487dA);
    }

    public String w() {
        return this.f27631n;
    }

    public r3 x() {
        return this.f27633p;
    }

    public io.sentry.protocol.E y() {
        return this.f27632o;
    }

    public void z(boolean z8) {
        this.f27634q = z8;
    }

    public s3(String str, io.sentry.protocol.E e8, String str2) {
        this(str, e8, str2, null);
    }

    public s3(String str, String str2, r3 r3Var) {
        this(str, io.sentry.protocol.E.CUSTOM, str2, r3Var);
    }

    public s3(String str, io.sentry.protocol.E e8, String str2, r3 r3Var) {
        super(str2);
        this.f27634q = false;
        this.f27631n = (String) io.sentry.util.u.c(str, "name is required");
        this.f27632o = e8;
        s(r3Var);
        this.f27090m = io.sentry.util.F.d(null, r3Var);
    }

    public s3(io.sentry.protocol.u uVar, i3 i3Var, i3 i3Var2, r3 r3Var, C2487d c2487d) {
        super(uVar, i3Var, "default", i3Var2, null);
        this.f27634q = false;
        this.f27631n = "<unlabeled transaction>";
        this.f27633p = r3Var;
        this.f27632o = f27630r;
        this.f27090m = io.sentry.util.F.d(c2487d, r3Var);
    }
}
