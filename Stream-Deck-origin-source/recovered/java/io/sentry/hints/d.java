package io.sentry.hints;

import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements f, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f27171a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ILogger f27173c;

    public d(long j8, ILogger iLogger) {
        this.f27172b = j8;
        this.f27173c = iLogger;
    }

    @Override // io.sentry.hints.f
    public void b() {
        this.f27171a.countDown();
    }

    @Override // io.sentry.hints.i
    public boolean e() {
        try {
            return this.f27171a.await(this.f27172b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            Thread.currentThread().interrupt();
            this.f27173c.b(EnumC2596z2.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e8);
            return false;
        }
    }
}
