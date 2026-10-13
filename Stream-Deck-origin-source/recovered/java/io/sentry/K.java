package io.sentry;

import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class K {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f25904g = TimeUnit.HOURS.toMillis(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f25905h = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static K f25906i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f25908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f25909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f25910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Callable f25911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ExecutorService f25912f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f25913a;

        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("SentryHostnameCache-");
            int i8 = this.f25913a;
            this.f25913a = i8 + 1;
            sb.append(i8);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public K() {
        this(f25904g);
    }

    public static /* synthetic */ Void b(K k8) {
        k8.getClass();
        try {
            k8.f25908b = ((InetAddress) k8.f25911e.call()).getCanonicalHostName();
            k8.f25909c = System.currentTimeMillis() + k8.f25907a;
            return null;
        } finally {
            k8.f25910d.set(false);
        }
    }

    public static K e() {
        if (f25906i == null) {
            f25906i = new K();
        }
        return f25906i;
    }

    public void c() {
        this.f25912f.shutdown();
    }

    public String d() {
        if (this.f25909c < System.currentTimeMillis() && this.f25910d.compareAndSet(false, true)) {
            g();
        }
        return this.f25908b;
    }

    public final void f() {
        this.f25909c = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(1L);
    }

    public final void g() {
        try {
            this.f25912f.submit(new Callable() { // from class: io.sentry.J
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return K.b(this.f25891a);
                }
            }).get(f25905h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            f();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            f();
        }
    }

    public K(long j8) {
        this(j8, new Callable() { // from class: io.sentry.I
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return InetAddress.getLocalHost();
            }
        });
    }

    public K(long j8, Callable callable) {
        this.f25910d = new AtomicBoolean(false);
        this.f25912f = Executors.newSingleThreadExecutor(new b());
        this.f25907a = j8;
        this.f25911e = (Callable) io.sentry.util.u.c(callable, "getLocalhost is required");
        g();
    }
}
