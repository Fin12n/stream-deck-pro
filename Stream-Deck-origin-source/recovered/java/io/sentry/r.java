package io.sentry;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2 f27534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ILogger f27535b;

    public r(J2 j8, ILogger iLogger) {
        this.f27534a = (J2) io.sentry.util.u.c(j8, "SentryOptions is required.");
        this.f27535b = iLogger;
    }

    @Override // io.sentry.ILogger
    public void a(EnumC2596z2 enumC2596z2, Throwable th, String str, Object... objArr) {
        if (this.f27535b == null || !d(enumC2596z2)) {
            return;
        }
        this.f27535b.a(enumC2596z2, th, str, objArr);
    }

    @Override // io.sentry.ILogger
    public void b(EnumC2596z2 enumC2596z2, String str, Throwable th) {
        if (this.f27535b == null || !d(enumC2596z2)) {
            return;
        }
        this.f27535b.b(enumC2596z2, str, th);
    }

    @Override // io.sentry.ILogger
    public void c(EnumC2596z2 enumC2596z2, String str, Object... objArr) {
        if (this.f27535b == null || !d(enumC2596z2)) {
            return;
        }
        this.f27535b.c(enumC2596z2, str, objArr);
    }

    @Override // io.sentry.ILogger
    public boolean d(EnumC2596z2 enumC2596z2) {
        return enumC2596z2 != null && this.f27534a.isDebug() && enumC2596z2.ordinal() >= this.f27534a.getDiagnosticLevel().ordinal();
    }
}
