package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.InterfaceC2516k0;
import io.sentry.J2;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class UserInteractionIntegration implements InterfaceC2516k0, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f26268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public io.sentry.X f26269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SentryAndroidOptions f26270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26271d;

    public UserInteractionIntegration(Application application, io.sentry.util.r rVar) {
        this.f26268a = (Application) io.sentry.util.u.c(application, "Application is required");
        this.f26271d = rVar.b("androidx.core.view.GestureDetectorCompat", this.f26270c);
    }

    public final void b(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f26270c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(EnumC2596z2.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.f26269b == null || this.f26270c == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new io.sentry.android.core.internal.gestures.b();
        }
        if (callback instanceof io.sentry.android.core.internal.gestures.h) {
            return;
        }
        window.setCallback(new io.sentry.android.core.internal.gestures.h(callback, activity, new io.sentry.android.core.internal.gestures.g(activity, this.f26269b, this.f26270c), this.f26270c));
    }

    public final void c(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f26270c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(EnumC2596z2.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof io.sentry.android.core.internal.gestures.h) {
            io.sentry.android.core.internal.gestures.h hVar = (io.sentry.android.core.internal.gestures.h) callback;
            hVar.c();
            if (hVar.a() instanceof io.sentry.android.core.internal.gestures.b) {
                window.setCallback(null);
            } else {
                window.setCallback(hVar.a());
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f26268a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f26270c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(EnumC2596z2.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC2516k0
    public void o(io.sentry.X x8, J2 j8) {
        this.f26270c = (SentryAndroidOptions) io.sentry.util.u.c(j8 instanceof SentryAndroidOptions ? (SentryAndroidOptions) j8 : null, "SentryAndroidOptions is required");
        this.f26269b = (io.sentry.X) io.sentry.util.u.c(x8, "Scopes are required");
        boolean z8 = this.f26270c.isEnableUserInteractionBreadcrumbs() || this.f26270c.isEnableUserInteractionTracing();
        ILogger logger = this.f26270c.getLogger();
        EnumC2596z2 enumC2596z2 = EnumC2596z2.DEBUG;
        logger.c(enumC2596z2, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z8));
        if (z8) {
            if (!this.f26271d) {
                j8.getLogger().c(EnumC2596z2.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
                return;
            }
            this.f26268a.registerActivityLifecycleCallbacks(this);
            this.f26270c.getLogger().c(enumC2596z2, "UserInteractionIntegration installed.", new Object[0]);
            io.sentry.util.o.a("UserInteraction");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
