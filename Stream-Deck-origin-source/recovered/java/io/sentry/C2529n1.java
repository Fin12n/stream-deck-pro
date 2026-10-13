package io.sentry;

/* JADX INFO: renamed from: io.sentry.n1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2529n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s3 f27235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2511j f27236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f27237c;

    @Deprecated
    public C2529n1(s3 s3Var, C2511j c2511j) {
        this(s3Var, c2511j, Double.valueOf(io.sentry.util.z.a().d()));
    }

    public Double a() {
        return this.f27237c;
    }

    public s3 b() {
        return this.f27235a;
    }

    public C2529n1(s3 s3Var, C2511j c2511j, Double d8) {
        this.f27235a = (s3) io.sentry.util.u.c(s3Var, "transactionContexts is required");
        this.f27236b = c2511j;
        this.f27237c = d8;
    }
}
