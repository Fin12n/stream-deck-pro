package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import io.sentry.C2491e;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.InterfaceC2516k0;
import io.sentry.J2;
import io.sentry.protocol.C2543e;
import java.io.Closeable;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class AppComponentsBreadcrumbsIntegration implements InterfaceC2516k0, Closeable, ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public io.sentry.X f26128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SentryAndroidOptions f26129c;

    public AppComponentsBreadcrumbsIntegration(Context context) {
        this.f26127a = (Context) io.sentry.util.u.c(Z.h(context), "Context is required");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f26127a.unregisterComponentCallbacks(this);
        } catch (Throwable th) {
            SentryAndroidOptions sentryAndroidOptions = this.f26129c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().a(EnumC2596z2.DEBUG, th, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f26129c;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().c(EnumC2596z2.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC2516k0
    public void o(io.sentry.X x8, J2 j8) {
        this.f26128b = (io.sentry.X) io.sentry.util.u.c(x8, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.u.c(j8 instanceof SentryAndroidOptions ? (SentryAndroidOptions) j8 : null, "SentryAndroidOptions is required");
        this.f26129c = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        EnumC2596z2 enumC2596z2 = EnumC2596z2.DEBUG;
        logger.c(enumC2596z2, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f26129c.isEnableAppComponentBreadcrumbs()));
        if (this.f26129c.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f26127a.registerComponentCallbacks(this);
                j8.getLogger().c(enumC2596z2, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                io.sentry.util.o.a("AppComponentsBreadcrumbs");
            } catch (Throwable th) {
                this.f26129c.setEnableAppComponentBreadcrumbs(false);
                j8.getLogger().a(EnumC2596z2.INFO, th, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(final Configuration configuration) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        y(new Runnable() { // from class: io.sentry.android.core.L
            @Override // java.lang.Runnable
            public final void run() {
                this.f26204a.t(jCurrentTimeMillis, configuration);
            }
        });
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        y(new Runnable() { // from class: io.sentry.android.core.K
            @Override // java.lang.Runnable
            public final void run() {
                this.f26202a.v(jCurrentTimeMillis, null);
            }
        });
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(final int i8) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        y(new Runnable() { // from class: io.sentry.android.core.M
            @Override // java.lang.Runnable
            public final void run() {
                this.f26207a.v(jCurrentTimeMillis, Integer.valueOf(i8));
            }
        });
    }

    public final void t(long j8, Configuration configuration) {
        if (this.f26128b != null) {
            C2543e.b bVarA = io.sentry.android.core.internal.util.i.a(this.f26127a.getResources().getConfiguration().orientation);
            String lowerCase = bVarA != null ? bVarA.name().toLowerCase(Locale.ROOT) : "undefined";
            C2491e c2491e = new C2491e(j8);
            c2491e.C("navigation");
            c2491e.y("device.orientation");
            c2491e.z("position", lowerCase);
            c2491e.A(EnumC2596z2.INFO);
            io.sentry.H h8 = new io.sentry.H();
            h8.k("android:configuration", configuration);
            this.f26128b.e(c2491e, h8);
        }
    }

    public final void v(long j8, Integer num) {
        if (this.f26128b != null) {
            C2491e c2491e = new C2491e(j8);
            if (num != null) {
                if (num.intValue() < 40) {
                    return;
                } else {
                    c2491e.z("level", num);
                }
            }
            c2491e.C("system");
            c2491e.y("device.event");
            c2491e.B("Low memory");
            c2491e.z("action", "LOW_MEMORY");
            c2491e.A(EnumC2596z2.WARNING);
            this.f26128b.i(c2491e);
        }
    }

    public final void y(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.f26129c;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th) {
                this.f26129c.getLogger().a(EnumC2596z2.ERROR, th, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }
}
