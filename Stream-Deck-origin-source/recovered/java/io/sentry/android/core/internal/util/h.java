package io.sentry.android.core.internal.util;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.sentry.transport.p f26423b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26425d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f26424c = new AtomicInteger(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicLong f26426e = new AtomicLong(0);

    public h(io.sentry.transport.p pVar, long j8, int i8) {
        this.f26423b = pVar;
        this.f26422a = j8;
        this.f26425d = i8 <= 0 ? 1 : i8;
    }

    public boolean a() {
        long currentTimeMillis = this.f26423b.getCurrentTimeMillis();
        if (this.f26426e.get() == 0 || this.f26426e.get() + this.f26422a <= currentTimeMillis) {
            this.f26424c.set(0);
            this.f26426e.set(currentTimeMillis);
            return false;
        }
        if (this.f26424c.incrementAndGet() < this.f26425d) {
            return false;
        }
        this.f26424c.set(0);
        return true;
    }
}
