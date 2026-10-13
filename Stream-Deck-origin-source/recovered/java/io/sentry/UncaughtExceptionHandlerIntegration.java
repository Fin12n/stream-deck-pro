package io.sentry;

import io.jentz.winter.js.HRHLwtyqJWz;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class UncaughtExceptionHandlerIntegration implements InterfaceC2516k0, Thread.UncaughtExceptionHandler, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f26011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public X f26012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public J2 f26013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w3 f26015e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends io.sentry.hints.d implements io.sentry.hints.l, io.sentry.hints.q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReference f26016d;

        public a(long j8, ILogger iLogger) {
            super(j8, iLogger);
            this.f26016d = new AtomicReference();
        }

        @Override // io.sentry.hints.f
        public boolean f(io.sentry.protocol.u uVar) {
            io.sentry.protocol.u uVar2 = (io.sentry.protocol.u) this.f26016d.get();
            return uVar2 != null && uVar2.equals(uVar);
        }

        @Override // io.sentry.hints.f
        public void h(io.sentry.protocol.u uVar) {
            this.f26016d.set(uVar);
        }
    }

    public UncaughtExceptionHandlerIntegration() {
        this(w3.a.c());
    }

    public static Throwable b(Thread thread, Throwable th) {
        io.sentry.protocol.i iVar = new io.sentry.protocol.i();
        iVar.n(Boolean.FALSE);
        iVar.p("UncaughtExceptionHandler");
        return new io.sentry.exception.a(iVar, th, thread);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this == this.f26015e.b()) {
            this.f26015e.a(this.f26011a);
            J2 j8 = this.f26013c;
            if (j8 != null) {
                j8.getLogger().c(EnumC2596z2.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        J2 j8 = this.f26013c;
        if (j8 == null || this.f26012b == null) {
            return;
        }
        j8.getLogger().c(EnumC2596z2.INFO, "Uncaught exception received.", new Object[0]);
        try {
            a aVar = new a(this.f26013c.getFlushTimeoutMillis(), this.f26013c.getLogger());
            C2557s2 c2557s2 = new C2557s2(b(thread, th));
            c2557s2.B0(EnumC2596z2.FATAL);
            if (this.f26012b.h() == null && c2557s2.G() != null) {
                aVar.h(c2557s2.G());
            }
            H hE = io.sentry.util.m.e(aVar);
            boolean zEquals = this.f26012b.F(c2557s2, hE).equals(io.sentry.protocol.u.f27472b);
            io.sentry.hints.h hVarF = io.sentry.util.m.f(hE);
            if ((!zEquals || io.sentry.hints.h.MULTITHREADED_DEDUPLICATION.equals(hVarF)) && !aVar.e()) {
                this.f26013c.getLogger().c(EnumC2596z2.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", c2557s2.G());
            }
        } catch (Throwable th2) {
            this.f26013c.getLogger().b(EnumC2596z2.ERROR, "Error sending uncaught exception to Sentry.", th2);
        }
        if (this.f26011a != null) {
            this.f26013c.getLogger().c(EnumC2596z2.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.f26011a.uncaughtException(thread, th);
        } else if (this.f26013c.isPrintUncaughtStackTrace()) {
            th.printStackTrace();
        }
    }

    public UncaughtExceptionHandlerIntegration(w3 w3Var) {
        this.f26014d = false;
        this.f26015e = (w3) io.sentry.util.u.c(w3Var, "threadAdapter is required.");
    }

    @Override // io.sentry.InterfaceC2516k0
    public final void o(X x8, J2 j8) {
        if (this.f26014d) {
            j8.getLogger().c(EnumC2596z2.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f26014d = true;
        this.f26012b = (X) io.sentry.util.u.c(x8, "Scopes are required");
        J2 j9 = (J2) io.sentry.util.u.c(j8, HRHLwtyqJWz.DyZhgkFIEX);
        this.f26013c = j9;
        ILogger logger = j9.getLogger();
        EnumC2596z2 enumC2596z2 = EnumC2596z2.DEBUG;
        logger.c(enumC2596z2, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f26013c.isEnableUncaughtExceptionHandler()));
        if (this.f26013c.isEnableUncaughtExceptionHandler()) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandlerB = this.f26015e.b();
            if (uncaughtExceptionHandlerB != null) {
                this.f26013c.getLogger().c(enumC2596z2, "default UncaughtExceptionHandler class='" + uncaughtExceptionHandlerB.getClass().getName() + "'", new Object[0]);
                if (uncaughtExceptionHandlerB instanceof UncaughtExceptionHandlerIntegration) {
                    this.f26011a = ((UncaughtExceptionHandlerIntegration) uncaughtExceptionHandlerB).f26011a;
                } else {
                    this.f26011a = uncaughtExceptionHandlerB;
                }
            }
            this.f26015e.a(this);
            this.f26013c.getLogger().c(enumC2596z2, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
            io.sentry.util.o.a("UncaughtExceptionHandler");
        }
    }
}
