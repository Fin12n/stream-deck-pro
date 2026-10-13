package io.sentry;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class H1 implements F1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D1 f25886a;

    public H1(D1 d8) {
        this.f25886a = (D1) io.sentry.util.u.c(d8, "SendFireAndForgetDirPath is required");
    }

    @Override // io.sentry.F1
    public C1 c(X x8, J2 j8) {
        io.sentry.util.u.c(x8, "Scopes are required");
        io.sentry.util.u.c(j8, "SentryOptions is required");
        String strA = this.f25886a.a();
        if (strA != null && d(strA, j8.getLogger())) {
            return a(new C2481b1(x8, j8.getEnvelopeReader(), j8.getSerializer(), j8.getLogger(), j8.getFlushTimeoutMillis(), j8.getMaxQueueSize()), strA, j8.getLogger());
        }
        j8.getLogger().c(EnumC2596z2.ERROR, "No outbox dir path is defined in options.", new Object[0]);
        return null;
    }
}
