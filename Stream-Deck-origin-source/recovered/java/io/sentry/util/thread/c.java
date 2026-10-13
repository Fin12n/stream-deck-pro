package io.sentry.util.thread;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f27734a = Thread.currentThread().getId();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f27735b = new c();

    public static c c() {
        return f27735b;
    }

    @Override // io.sentry.util.thread.a
    public long a() {
        return Thread.currentThread().getId();
    }

    @Override // io.sentry.util.thread.a
    public boolean b() {
        return e(Thread.currentThread());
    }

    public boolean d(long j8) {
        return f27734a == j8;
    }

    public boolean e(Thread thread) {
        return d(thread.getId());
    }
}
