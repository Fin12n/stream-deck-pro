package io.sentry.android.core;

import android.app.Activity;
import io.sentry.C2479b;
import io.sentry.C2557s2;
import io.sentry.EnumC2596z2;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class ScreenshotEventProcessor implements io.sentry.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SentryAndroidOptions f26241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f26242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.h f26243c = new io.sentry.android.core.internal.util.h(io.sentry.android.core.internal.util.b.a(), 2000, 3);

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, Q q8) {
        this.f26241a = (SentryAndroidOptions) io.sentry.util.u.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f26242b = (Q) io.sentry.util.u.c(q8, "BuildInfoProvider is required");
        if (sentryAndroidOptions.isAttachScreenshot()) {
            io.sentry.util.o.a("Screenshot");
        }
    }

    @Override // io.sentry.C
    public C2557s2 c(C2557s2 c2557s2, io.sentry.H h8) {
        byte[] bArrD;
        if (c2557s2.y0()) {
            if (!this.f26241a.isAttachScreenshot()) {
                this.f26241a.getLogger().c(EnumC2596z2.DEBUG, "attachScreenshot is disabled.", new Object[0]);
                return c2557s2;
            }
            Activity activityB = C2451a0.c().b();
            if (activityB != null && !io.sentry.util.m.i(h8)) {
                boolean zA = this.f26243c.a();
                this.f26241a.getBeforeScreenshotCaptureCallback();
                if (!zA && (bArrD = io.sentry.android.core.internal.util.q.d(activityB, this.f26241a.getThreadChecker(), this.f26241a.getLogger(), this.f26242b)) != null) {
                    h8.m(C2479b.a(bArrD));
                    h8.k("android:activity", activityB);
                }
            }
        }
        return c2557s2;
    }

    @Override // io.sentry.C
    public io.sentry.protocol.B j(io.sentry.protocol.B b8, io.sentry.H h8) {
        return b8;
    }
}
