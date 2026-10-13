package io.sentry.exception;

import io.sentry.protocol.i;
import io.sentry.util.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f27103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f27104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Thread f27105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f27106d;

    public a(i iVar, Throwable th, Thread thread, boolean z8) {
        this.f27103a = (i) u.c(iVar, "Mechanism is required.");
        this.f27104b = (Throwable) u.c(th, "Throwable is required.");
        this.f27105c = (Thread) u.c(thread, "Thread is required.");
        this.f27106d = z8;
    }

    public i a() {
        return this.f27103a;
    }

    public Thread b() {
        return this.f27105c;
    }

    public Throwable c() {
        return this.f27104b;
    }

    public boolean d() {
        return this.f27106d;
    }

    public a(i iVar, Throwable th, Thread thread) {
        this(iVar, th, thread, false);
    }
}
