package io.sentry.android.core;

import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.InterfaceC2516k0;
import io.sentry.J2;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class AppLifecycleIntegration implements InterfaceC2516k0, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile k0 f26130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SentryAndroidOptions f26131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f26132c;

    public AppLifecycleIntegration() {
        this(new l0());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f26130a == null) {
            return;
        }
        if (io.sentry.android.core.internal.util.d.d().b()) {
            t();
        } else {
            this.f26132c.b(new Runnable() { // from class: io.sentry.android.core.O
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26236a.t();
                }
            });
        }
    }

    public final void j(io.sentry.X x8) {
        SentryAndroidOptions sentryAndroidOptions = this.f26131b;
        if (sentryAndroidOptions == null) {
            return;
        }
        this.f26130a = new k0(x8, sentryAndroidOptions.getSessionTrackingIntervalMillis(), this.f26131b.isEnableAutoSessionTracking(), this.f26131b.isEnableAppLifecycleBreadcrumbs());
        try {
            ProcessLifecycleOwner.n().w().a(this.f26130a);
            this.f26131b.getLogger().c(EnumC2596z2.DEBUG, "AppLifecycleIntegration installed.", new Object[0]);
            io.sentry.util.o.a("AppLifecycle");
        } catch (Throwable th) {
            this.f26130a = null;
            this.f26131b.getLogger().b(EnumC2596z2.ERROR, "AppLifecycleIntegration failed to get Lifecycle and could not be installed.", th);
        }
    }

    @Override // io.sentry.InterfaceC2516k0
    public void o(final io.sentry.X x8, J2 j8) {
        io.sentry.util.u.c(x8, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.u.c(j8 instanceof SentryAndroidOptions ? (SentryAndroidOptions) j8 : null, "SentryAndroidOptions is required");
        this.f26131b = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        EnumC2596z2 enumC2596z2 = EnumC2596z2.DEBUG;
        logger.c(enumC2596z2, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f26131b.isEnableAutoSessionTracking()));
        this.f26131b.getLogger().c(enumC2596z2, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f26131b.isEnableAppLifecycleBreadcrumbs()));
        if (this.f26131b.isEnableAutoSessionTracking() || this.f26131b.isEnableAppLifecycleBreadcrumbs()) {
            try {
                ProcessLifecycleOwner.b bVar = ProcessLifecycleOwner.f15256i;
                if (io.sentry.android.core.internal.util.d.d().b()) {
                    j(x8);
                } else {
                    this.f26132c.b(new Runnable() { // from class: io.sentry.android.core.N
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f26210a.j(x8);
                        }
                    });
                }
            } catch (ClassNotFoundException e8) {
                j8.getLogger().b(EnumC2596z2.INFO, "androidx.lifecycle is not available, AppLifecycleIntegration won't be installed", e8);
            } catch (IllegalStateException e9) {
                j8.getLogger().b(EnumC2596z2.ERROR, "AppLifecycleIntegration could not be installed", e9);
            }
        }
    }

    public final void t() {
        k0 k0Var = this.f26130a;
        if (k0Var != null) {
            ProcessLifecycleOwner.n().w().d(k0Var);
            SentryAndroidOptions sentryAndroidOptions = this.f26131b;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(EnumC2596z2.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
            }
        }
        this.f26130a = null;
    }

    public AppLifecycleIntegration(l0 l0Var) {
        this.f26132c = l0Var;
    }
}
