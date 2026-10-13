package io.sentry;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class ShutdownHookIntegration implements InterfaceC2516k0, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runtime f25998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread f25999b;

    public ShutdownHookIntegration(Runtime runtime) {
        this.f25998a = (Runtime) io.sentry.util.u.c(runtime, "Runtime is required");
    }

    public static /* synthetic */ void b(ShutdownHookIntegration shutdownHookIntegration, J2 j8) {
        shutdownHookIntegration.f25998a.addShutdownHook(shutdownHookIntegration.f25999b);
        j8.getLogger().c(EnumC2596z2.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
        io.sentry.util.o.a("ShutdownHook");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f25999b != null) {
            t(new Runnable() { // from class: io.sentry.Z2
                @Override // java.lang.Runnable
                public final void run() {
                    ShutdownHookIntegration shutdownHookIntegration = this.f26075a;
                    shutdownHookIntegration.f25998a.removeShutdownHook(shutdownHookIntegration.f25999b);
                }
            });
        }
    }

    @Override // io.sentry.InterfaceC2516k0
    public void o(final X x8, final J2 j8) {
        io.sentry.util.u.c(x8, "Scopes are required");
        io.sentry.util.u.c(j8, "SentryOptions is required");
        if (!j8.isEnableShutdownHook()) {
            j8.getLogger().c(EnumC2596z2.INFO, "enableShutdownHook is disabled.", new Object[0]);
        } else {
            this.f25999b = new Thread(new Runnable() { // from class: io.sentry.a3
                @Override // java.lang.Runnable
                public final void run() {
                    x8.p(j8.getFlushTimeoutMillis());
                }
            });
            t(new Runnable() { // from class: io.sentry.b3
                @Override // java.lang.Runnable
                public final void run() {
                    ShutdownHookIntegration.b(this.f26989a, j8);
                }
            });
        }
    }

    public final void t(Runnable runnable) {
        try {
            runnable.run();
        } catch (IllegalStateException e8) {
            String message = e8.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e8;
            }
        }
    }

    public ShutdownHookIntegration() {
        this(Runtime.getRuntime());
    }
}
