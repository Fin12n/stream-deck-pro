package io.sentry.transport;

import H.FL.dCqzKmEghGTQ;
import io.sentry.AbstractC2519l;
import io.sentry.C2521l1;
import io.sentry.EnumC2596z2;
import io.sentry.H;
import io.sentry.ILogger;
import io.sentry.J2;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.V1;
import io.sentry.W1;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f27662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.sentry.cache.g f27663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J2 f27664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A f27665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f27666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f27667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile Runnable f27668g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f27669a;

        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("SentryAsyncConnection-");
            int i8 = this.f27669a;
            this.f27669a = i8 + 1;
            sb.append(i8);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final W1 f27670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final H f27671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final io.sentry.cache.g f27672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C f27673d = C.a();

        public c(W1 w8, H h8, io.sentry.cache.g gVar) {
            this.f27670a = (W1) io.sentry.util.u.c(w8, "Envelope is required.");
            this.f27671b = h8;
            this.f27672c = (io.sentry.cache.g) io.sentry.util.u.c(gVar, "EnvelopeCache is required.");
        }

        public static /* synthetic */ void a(c cVar, C c8, io.sentry.hints.p pVar) {
            e.this.f27664c.getLogger().c(EnumC2596z2.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(c8.d()));
            pVar.b(c8.d());
        }

        public static /* synthetic */ void b(c cVar, io.sentry.hints.f fVar) {
            if (!fVar.f(cVar.f27670a.b().a())) {
                e.this.f27664c.getLogger().c(EnumC2596z2.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            } else {
                fVar.b();
                e.this.f27664c.getLogger().c(EnumC2596z2.DEBUG, "Disk flush envelope fired", new Object[0]);
            }
        }

        public static /* synthetic */ void c(c cVar, W1 w8, Object obj, Class cls) {
            io.sentry.util.s.a(cls, obj, e.this.f27664c.getLogger());
            e.this.f27664c.getClientReportRecorder().b(io.sentry.clientreport.f.NETWORK_ERROR, w8);
        }

        public static /* synthetic */ void g(c cVar, Object obj, Class cls) {
            io.sentry.util.s.a(cls, obj, e.this.f27664c.getLogger());
            e.this.f27664c.getClientReportRecorder().b(io.sentry.clientreport.f.NETWORK_ERROR, cVar.f27670a);
        }

        public final C j() {
            C c8 = this.f27673d;
            this.f27670a.b().d(null);
            this.f27672c.p(this.f27670a, this.f27671b);
            io.sentry.util.m.k(this.f27671b, io.sentry.hints.f.class, new io.sentry.util.m.a() { // from class: io.sentry.transport.g
                @Override // io.sentry.util.m.a
                public final void accept(Object obj) {
                    e.c.b(this.f27677a, (io.sentry.hints.f) obj);
                }
            });
            if (!e.this.f27666e.a()) {
                io.sentry.util.m.l(this.f27671b, io.sentry.hints.k.class, new io.sentry.util.m.a() { // from class: io.sentry.transport.k
                    @Override // io.sentry.util.m.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.k) obj).c(true);
                    }
                }, new io.sentry.util.m.b() { // from class: io.sentry.transport.l
                    @Override // io.sentry.util.m.b
                    public final void a(Object obj, Class cls) {
                        e.c.g(this.f27682a, obj, cls);
                    }
                });
                return c8;
            }
            final W1 w1D = e.this.f27664c.getClientReportRecorder().d(this.f27670a);
            try {
                w1D.b().d(AbstractC2519l.j(e.this.f27664c.getDateProvider().a().j()));
                C cH = e.this.f27667f.h(w1D);
                if (cH.d()) {
                    this.f27672c.e(this.f27670a);
                    return cH;
                }
                String str = "The transport failed to send the envelope with response code " + cH.c();
                e.this.f27664c.getLogger().c(EnumC2596z2.ERROR, str, new Object[0]);
                if (cH.c() >= 400 && cH.c() != 429) {
                    io.sentry.util.m.j(this.f27671b, io.sentry.hints.k.class, new io.sentry.util.m.c() { // from class: io.sentry.transport.h
                        @Override // io.sentry.util.m.c
                        public final void accept(Object obj) {
                            e.this.f27664c.getClientReportRecorder().b(io.sentry.clientreport.f.NETWORK_ERROR, w1D);
                        }
                    });
                }
                throw new IllegalStateException(str);
            } catch (IOException e8) {
                io.sentry.util.m.l(this.f27671b, io.sentry.hints.k.class, new io.sentry.util.m.a() { // from class: io.sentry.transport.i
                    @Override // io.sentry.util.m.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.k) obj).c(true);
                    }
                }, new io.sentry.util.m.b() { // from class: io.sentry.transport.j
                    @Override // io.sentry.util.m.b
                    public final void a(Object obj, Class cls) {
                        e.c.c(this.f27680a, w1D, obj, cls);
                    }
                });
                throw new IllegalStateException("Sending the event failed.", e8);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.f27668g = this;
            final C cJ = this.f27673d;
            try {
                cJ = j();
                e.this.f27664c.getLogger().c(EnumC2596z2.DEBUG, "Envelope flushed", new Object[0]);
                io.sentry.util.m.k(this.f27671b, io.sentry.hints.p.class, new io.sentry.util.m.a() { // from class: io.sentry.transport.f
                    @Override // io.sentry.util.m.a
                    public final void accept(Object obj) {
                        e.c.a(this.f27675a, cJ, (io.sentry.hints.p) obj);
                    }
                });
                e.this.f27668g = null;
            } catch (Throwable th) {
                try {
                    e.this.f27664c.getLogger().a(EnumC2596z2.ERROR, th, dCqzKmEghGTQ.OJvvbxsTbHOB, new Object[0]);
                    throw th;
                } catch (Throwable th2) {
                    io.sentry.util.m.k(this.f27671b, io.sentry.hints.p.class, new io.sentry.util.m.a() { // from class: io.sentry.transport.f
                        @Override // io.sentry.util.m.a
                        public final void accept(Object obj) {
                            e.c.a(this.f27675a, cJ, (io.sentry.hints.p) obj);
                        }
                    });
                    e.this.f27668g = null;
                    throw th2;
                }
            }
        }
    }

    public e(J2 j8, A a8, r rVar, C2521l1 c2521l1) {
        this(A(j8.getMaxQueueSize(), j8.getEnvelopeDiskCache(), j8.getLogger(), j8.getDateProvider()), j8, a8, rVar, new o(j8, c2521l1, a8));
    }

    public static w A(int i8, final io.sentry.cache.g gVar, final ILogger iLogger, V1 v8) {
        return new w(1, i8, new b(), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                e.o(gVar, iLogger, runnable, threadPoolExecutor);
            }
        }, iLogger, v8);
    }

    public static void Y(H h8, final boolean z8) {
        io.sentry.util.m.k(h8, io.sentry.hints.p.class, new io.sentry.util.m.a() { // from class: io.sentry.transport.c
            @Override // io.sentry.util.m.a
            public final void accept(Object obj) {
                ((io.sentry.hints.p) obj).b(false);
            }
        });
        io.sentry.util.m.k(h8, io.sentry.hints.k.class, new io.sentry.util.m.a() { // from class: io.sentry.transport.d
            @Override // io.sentry.util.m.a
            public final void accept(Object obj) {
                ((io.sentry.hints.k) obj).c(z8);
            }
        });
    }

    public static /* synthetic */ void c(e eVar, io.sentry.hints.g gVar) {
        eVar.getClass();
        gVar.d();
        eVar.f27664c.getLogger().c(EnumC2596z2.DEBUG, "Envelope enqueued", new Object[0]);
    }

    public static /* synthetic */ void o(io.sentry.cache.g gVar, ILogger iLogger, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (runnable instanceof c) {
            c cVar = (c) runnable;
            if (!io.sentry.util.m.h(cVar.f27671b, io.sentry.hints.e.class)) {
                gVar.p(cVar.f27670a, cVar.f27671b);
            }
            Y(cVar.f27671b, true);
            iLogger.c(EnumC2596z2.WARNING, "Envelope rejected", new Object[0]);
        }
    }

    @Override // io.sentry.transport.q
    public void a(boolean z8) {
        long flushTimeoutMillis;
        this.f27665d.close();
        this.f27662a.shutdown();
        this.f27664c.getLogger().c(EnumC2596z2.DEBUG, "Shutting down", new Object[0]);
        if (z8) {
            flushTimeoutMillis = 0;
        } else {
            try {
                flushTimeoutMillis = this.f27664c.getFlushTimeoutMillis();
            } catch (InterruptedException unused) {
                this.f27664c.getLogger().c(EnumC2596z2.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
                Thread.currentThread().interrupt();
                return;
            }
        }
        if (this.f27662a.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
            return;
        }
        this.f27664c.getLogger().c(EnumC2596z2.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
        this.f27662a.shutdownNow();
        if (this.f27668g != null) {
            this.f27662a.getRejectedExecutionHandler().rejectedExecution(this.f27668g, this.f27662a);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a(false);
    }

    @Override // io.sentry.transport.q
    public A m() {
        return this.f27665d;
    }

    @Override // io.sentry.transport.q
    public void m0(W1 w8, H h8) {
        io.sentry.cache.g gVarC = this.f27663b;
        boolean z8 = false;
        if (io.sentry.util.m.h(h8, io.sentry.hints.e.class)) {
            gVarC = s.c();
            this.f27664c.getLogger().c(EnumC2596z2.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z8 = true;
        }
        W1 w1Y = this.f27665d.y(w8, h8);
        if (w1Y == null) {
            if (z8) {
                this.f27663b.e(w8);
                return;
            }
            return;
        }
        if (io.sentry.util.m.h(h8, UncaughtExceptionHandlerIntegration.a.class)) {
            w1Y = this.f27664c.getClientReportRecorder().d(w1Y);
        }
        Future futureSubmit = this.f27662a.submit(new c(w1Y, h8, gVarC));
        if (futureSubmit == null || !futureSubmit.isCancelled()) {
            io.sentry.util.m.k(h8, io.sentry.hints.g.class, new io.sentry.util.m.a() { // from class: io.sentry.transport.b
                @Override // io.sentry.util.m.a
                public final void accept(Object obj) {
                    e.c(this.f27660a, (io.sentry.hints.g) obj);
                }
            });
        } else {
            this.f27664c.getClientReportRecorder().b(io.sentry.clientreport.f.QUEUE_OVERFLOW, w1Y);
        }
    }

    @Override // io.sentry.transport.q
    public boolean n() {
        return (this.f27665d.Y() || this.f27662a.a()) ? false : true;
    }

    @Override // io.sentry.transport.q
    public void p(long j8) {
        this.f27662a.d(j8);
    }

    public e(w wVar, J2 j8, A a8, r rVar, o oVar) {
        this.f27668g = null;
        this.f27662a = (w) io.sentry.util.u.c(wVar, "executor is required");
        this.f27663b = (io.sentry.cache.g) io.sentry.util.u.c(j8.getEnvelopeDiskCache(), "envelopeCache is required");
        this.f27664c = (J2) io.sentry.util.u.c(j8, "options is required");
        this.f27665d = (A) io.sentry.util.u.c(a8, "rateLimiter is required");
        this.f27666e = (r) io.sentry.util.u.c(rVar, "transportGate is required");
        this.f27667f = (o) io.sentry.util.u.c(oVar, "httpConnection is required");
    }
}
