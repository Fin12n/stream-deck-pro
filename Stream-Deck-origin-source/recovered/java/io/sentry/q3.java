package io.sentry;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2 f27533a;

    public q3(J2 j8) {
        this.f27533a = (J2) io.sentry.util.u.c(j8, "options are required");
    }

    public r3 a(C2529n1 c2529n1) {
        Double dA = c2529n1.a();
        r3 r3VarJ = c2529n1.b().j();
        if (r3VarJ != null) {
            return io.sentry.util.y.a(r3VarJ);
        }
        this.f27533a.getProfilesSampler();
        Double profilesSampleRate = this.f27533a.getProfilesSampleRate();
        Boolean boolValueOf = Boolean.valueOf(profilesSampleRate != null && b(profilesSampleRate, dA));
        this.f27533a.getTracesSampler();
        r3 r3VarX = c2529n1.b().x();
        if (r3VarX != null) {
            return io.sentry.util.y.a(r3VarX);
        }
        Double tracesSampleRate = this.f27533a.getTracesSampleRate();
        Double dValueOf = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, this.f27533a.getBackpressureMonitor().a()));
        if (dValueOf != null) {
            return new r3(Boolean.valueOf(b(dValueOf, dA)), dValueOf, dA, boolValueOf, profilesSampleRate);
        }
        Boolean bool = Boolean.FALSE;
        return new r3(bool, null, dA, bool, null);
    }

    public final boolean b(Double d8, Double d9) {
        return d8.doubleValue() >= d9.doubleValue();
    }
}
