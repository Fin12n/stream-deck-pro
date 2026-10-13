package io.sentry.android.core;

import io.sentry.C2481b1;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.InterfaceC2480b0;
import io.sentry.InterfaceC2516k0;
import io.sentry.J2;
import io.sentry.util.C2569a;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnvelopeFileObserverIntegration implements InterfaceC2516k0, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f0 f26188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ILogger f26189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26190c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2569a f26191d = new C2569a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        @Override // io.sentry.android.core.EnvelopeFileObserverIntegration
        public String j(J2 j8) {
            return j8.getOutboxPath();
        }
    }

    public static /* synthetic */ void b(EnvelopeFileObserverIntegration envelopeFileObserverIntegration, io.sentry.X x8, J2 j8, String str) {
        InterfaceC2480b0 interfaceC2480b0A = envelopeFileObserverIntegration.f26191d.a();
        try {
            if (!envelopeFileObserverIntegration.f26190c) {
                envelopeFileObserverIntegration.t(x8, j8, str);
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

    public static EnvelopeFileObserverIntegration c() {
        return new OutboxEnvelopeFileObserverIntegration();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC2480b0 interfaceC2480b0A = this.f26191d.a();
        try {
            this.f26190c = true;
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            f0 f0Var = this.f26188a;
            if (f0Var != null) {
                f0Var.stopWatching();
                ILogger iLogger = this.f26189b;
                if (iLogger != null) {
                    iLogger.c(EnumC2596z2.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
                }
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

    public abstract String j(J2 j8);

    @Override // io.sentry.InterfaceC2516k0
    public final void o(final io.sentry.X x8, final J2 j8) {
        io.sentry.util.u.c(x8, "Scopes are required");
        io.sentry.util.u.c(j8, "SentryOptions is required");
        this.f26189b = j8.getLogger();
        final String strJ = j(j8);
        if (strJ == null) {
            this.f26189b.c(EnumC2596z2.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        this.f26189b.c(EnumC2596z2.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", strJ);
        try {
            j8.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.g0
                @Override // java.lang.Runnable
                public final void run() {
                    EnvelopeFileObserverIntegration.b(this.f26338a, x8, j8, strJ);
                }
            });
        } catch (Throwable th) {
            this.f26189b.b(EnumC2596z2.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th);
        }
    }

    public final void t(io.sentry.X x8, J2 j8, String str) {
        f0 f0Var = new f0(str, new C2481b1(x8, j8.getEnvelopeReader(), j8.getSerializer(), j8.getLogger(), j8.getFlushTimeoutMillis(), j8.getMaxQueueSize()), j8.getLogger(), j8.getFlushTimeoutMillis());
        this.f26188a = f0Var;
        try {
            f0Var.startWatching();
            j8.getLogger().c(EnumC2596z2.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
        } catch (Throwable th) {
            j8.getLogger().b(EnumC2596z2.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th);
        }
    }
}
