package io.sentry.android.core;

import android.content.Context;
import io.sentry.C2557s2;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.InterfaceC2480b0;
import io.sentry.InterfaceC2516k0;
import io.sentry.J2;
import io.sentry.util.C2569a;
import java.io.Closeable;
import p116m7.kKPq.toqHM;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class AnrIntegration implements InterfaceC2516k0, Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C2454c f26106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2569a f26107f = new C2569a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26109b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2569a f26110c = new C2569a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public J2 f26111d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements io.sentry.hints.a, io.sentry.hints.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f26112a;

        public a(boolean z8) {
            this.f26112a = z8;
        }

        @Override // io.sentry.hints.a
        public Long c() {
            return null;
        }

        @Override // io.sentry.hints.a
        public boolean d() {
            return true;
        }

        @Override // io.sentry.hints.a
        public String g() {
            return this.f26112a ? "anr_background" : "anr_foreground";
        }
    }

    public AnrIntegration(Context context) {
        this.f26108a = Z.h(context);
    }

    public static /* synthetic */ void b(AnrIntegration anrIntegration, io.sentry.X x8, SentryAndroidOptions sentryAndroidOptions) {
        InterfaceC2480b0 interfaceC2480b0A = anrIntegration.f26110c.a();
        try {
            if (!anrIntegration.f26109b) {
                anrIntegration.y(x8, sentryAndroidOptions);
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC2480b0 interfaceC2480b0A = this.f26110c.a();
        try {
            this.f26109b = true;
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            interfaceC2480b0A = f26107f.a();
            try {
                C2454c c2454c = f26106e;
                if (c2454c != null) {
                    c2454c.interrupt();
                    f26106e = null;
                    J2 j8 = this.f26111d;
                    if (j8 != null) {
                        j8.getLogger().c(EnumC2596z2.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
                if (interfaceC2480b0A != null) {
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
        } finally {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
            }
        }
    }

    public final Throwable j(boolean z8, SentryAndroidOptions sentryAndroidOptions, ApplicationNotResponding applicationNotResponding) {
        String str = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
        if (z8) {
            str = "Background " + str;
        }
        ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(str, applicationNotResponding.a());
        io.sentry.protocol.i iVar = new io.sentry.protocol.i();
        iVar.p("ANR");
        return new io.sentry.exception.a(iVar, applicationNotResponding2, applicationNotResponding2.a(), true);
    }

    @Override // io.sentry.InterfaceC2516k0
    public final void o(io.sentry.X x8, J2 j8) {
        this.f26111d = (J2) io.sentry.util.u.c(j8, "SentryOptions is required");
        t(x8, (SentryAndroidOptions) j8);
    }

    public final void t(final io.sentry.X x8, final SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.getLogger().c(EnumC2596z2.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            io.sentry.util.o.a("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.F
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnrIntegration.b(this.f26192a, x8, sentryAndroidOptions);
                    }
                });
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().b(EnumC2596z2.DEBUG, "Failed to start AnrIntegration on executor thread.", th);
            }
        }
    }

    public void v(io.sentry.X x8, SentryAndroidOptions sentryAndroidOptions, ApplicationNotResponding applicationNotResponding) {
        sentryAndroidOptions.getLogger().c(EnumC2596z2.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
        boolean zEquals = Boolean.TRUE.equals(P.a().b());
        C2557s2 c2557s2 = new C2557s2(j(zEquals, sentryAndroidOptions, applicationNotResponding));
        c2557s2.B0(EnumC2596z2.ERROR);
        x8.F(c2557s2, io.sentry.util.m.e(new a(zEquals)));
    }

    public final void y(final io.sentry.X x8, final SentryAndroidOptions sentryAndroidOptions) {
        InterfaceC2480b0 interfaceC2480b0A = f26107f.a();
        try {
            if (f26106e == null) {
                ILogger logger = sentryAndroidOptions.getLogger();
                EnumC2596z2 enumC2596z2 = EnumC2596z2.DEBUG;
                logger.c(enumC2596z2, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                C2454c c2454c = new C2454c(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new C2454c.a() { // from class: io.sentry.android.core.G
                    @Override // io.sentry.android.core.C2454c.a
                    public final void a(ApplicationNotResponding applicationNotResponding) {
                        this.f26195a.v(x8, sentryAndroidOptions, applicationNotResponding);
                    }
                }, sentryAndroidOptions.getLogger(), this.f26108a);
                f26106e = c2454c;
                c2454c.start();
                sentryAndroidOptions.getLogger().c(enumC2596z2, toqHM.AFvUsn, new Object[0]);
            }
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC2480b0A == null) {
                throw th;
            }
            try {
                interfaceC2480b0A.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
