package io.sentry.android.core;

import Z.JTT.ryTuoS;
import io.sentry.C1;
import io.sentry.EnumC2515k;
import io.sentry.EnumC2596z2;
import io.sentry.F1;
import io.sentry.InterfaceC2480b0;
import io.sentry.InterfaceC2516k0;
import io.sentry.J2;
import io.sentry.util.C2569a;
import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
final class SendCachedEnvelopeIntegration implements InterfaceC2516k0, io.sentry.M.b, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F1 f26244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.sentry.util.q f26245b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public io.sentry.M f26247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public io.sentry.X f26248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SentryAndroidOptions f26249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1 f26250g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f26246c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f26251h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f26252i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C2569a f26253j = new C2569a();

    public SendCachedEnvelopeIntegration(F1 f8, io.sentry.util.q qVar) {
        this.f26244a = (F1) io.sentry.util.u.c(f8, "SendFireAndForgetFactory is required");
        this.f26245b = qVar;
    }

    public final void c(final io.sentry.X x8, final SentryAndroidOptions sentryAndroidOptions) {
        try {
            InterfaceC2480b0 interfaceC2480b0A = this.f26253j.a();
            try {
                Future futureSubmit = sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.r0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SendCachedEnvelopeIntegration.b(this.f26543a, sentryAndroidOptions, x8);
                    }
                });
                if (((Boolean) this.f26245b.a()).booleanValue() && this.f26246c.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().c(EnumC2596z2.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        futureSubmit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().c(EnumC2596z2.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().c(EnumC2596z2.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
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
        } catch (RejectedExecutionException e8) {
            sentryAndroidOptions.getLogger().b(EnumC2596z2.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e8);
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().b(EnumC2596z2.ERROR, "Failed to call the executor. Cached events will not be sent", th3);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f26252i.set(true);
        io.sentry.M m8 = this.f26247d;
        if (m8 != null) {
            m8.d(this);
        }
    }

    @Override // io.sentry.M.b
    public void j(io.sentry.M.a aVar) {
        SentryAndroidOptions sentryAndroidOptions;
        io.sentry.X x8 = this.f26248e;
        if (x8 == null || (sentryAndroidOptions = this.f26249f) == null) {
            return;
        }
        c(x8, sentryAndroidOptions);
    }

    @Override // io.sentry.InterfaceC2516k0
    public void o(io.sentry.X x8, J2 j8) {
        this.f26248e = (io.sentry.X) io.sentry.util.u.c(x8, "Scopes are required");
        this.f26249f = (SentryAndroidOptions) io.sentry.util.u.c(j8 instanceof SentryAndroidOptions ? (SentryAndroidOptions) j8 : null, "SentryAndroidOptions is required");
        if (!this.f26244a.d(j8.getCacheDirPath(), j8.getLogger())) {
            j8.getLogger().c(EnumC2596z2.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            io.sentry.util.o.a("SendCachedEnvelope");
            c(x8, this.f26249f);
        }
    }

    public static /* synthetic */ void b(SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration, SentryAndroidOptions sentryAndroidOptions, io.sentry.X x8) {
        sendCachedEnvelopeIntegration.getClass();
        try {
            if (sendCachedEnvelopeIntegration.f26252i.get()) {
                sentryAndroidOptions.getLogger().c(EnumC2596z2.INFO, ryTuoS.NoHDjoS, new Object[0]);
                return;
            }
            if (!sendCachedEnvelopeIntegration.f26251h.getAndSet(true)) {
                io.sentry.M connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                sendCachedEnvelopeIntegration.f26247d = connectionStatusProvider;
                connectionStatusProvider.c(sendCachedEnvelopeIntegration);
                sendCachedEnvelopeIntegration.f26250g = sendCachedEnvelopeIntegration.f26244a.c(x8, sentryAndroidOptions);
            }
            io.sentry.M m8 = sendCachedEnvelopeIntegration.f26247d;
            if (m8 != null && m8.b() == io.sentry.M.a.DISCONNECTED) {
                sentryAndroidOptions.getLogger().c(EnumC2596z2.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                return;
            }
            io.sentry.transport.A aM = x8.m();
            if (aM != null && aM.A(EnumC2515k.All)) {
                sentryAndroidOptions.getLogger().c(EnumC2596z2.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                return;
            }
            C1 c8 = sendCachedEnvelopeIntegration.f26250g;
            if (c8 == null) {
                sentryAndroidOptions.getLogger().c(EnumC2596z2.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
            } else {
                c8.a();
            }
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().b(EnumC2596z2.ERROR, "Failed trying to send cached events.", th);
        }
    }
}
