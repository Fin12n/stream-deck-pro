package io.sentry;

import io.sentry.util.C2569a;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.u2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2568u2 implements InterfaceC2447a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f27706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2569a f27707b;

    /* JADX INFO: renamed from: io.sentry.u2$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f27708a;

        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("SentryExecutorServiceThreadFactory-");
            int i8 = this.f27708a;
            this.f27708a = i8 + 1;
            sb.append(i8);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public C2568u2(ScheduledExecutorService scheduledExecutorService) {
        this.f27707b = new C2569a();
        this.f27706a = scheduledExecutorService;
    }

    @Override // io.sentry.InterfaceC2447a0
    public void a(long j8) {
        InterfaceC2480b0 interfaceC2480b0A = this.f27707b.a();
        try {
            if (!this.f27706a.isShutdown()) {
                this.f27706a.shutdown();
                try {
                    if (!this.f27706a.awaitTermination(j8, TimeUnit.MILLISECONDS)) {
                        this.f27706a.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    this.f27706a.shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.InterfaceC2447a0
    public Future b(Runnable runnable, long j8) {
        return this.f27706a.schedule(runnable, j8, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.InterfaceC2447a0
    public boolean isClosed() {
        InterfaceC2480b0 interfaceC2480b0A = this.f27707b.a();
        try {
            boolean zIsShutdown = this.f27706a.isShutdown();
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return zIsShutdown;
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.InterfaceC2447a0
    public Future submit(Runnable runnable) {
        return this.f27706a.submit(runnable);
    }

    public C2568u2() {
        this(Executors.newSingleThreadScheduledExecutor(new b()));
    }
}
