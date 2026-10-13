package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.InterfaceC2516k0;
import io.sentry.J2;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class CurrentActivityIntegration implements InterfaceC2516k0, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f26169a;

    public CurrentActivityIntegration(Application application) {
        this.f26169a = (Application) io.sentry.util.u.c(application, "Application is required");
    }

    public final void b(Activity activity) {
        if (C2451a0.c().b() == activity) {
            C2451a0.c().a();
        }
    }

    public final void c(Activity activity) {
        C2451a0.c().d(activity);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f26169a.unregisterActivityLifecycleCallbacks(this);
        C2451a0.c().a();
    }

    @Override // io.sentry.InterfaceC2516k0
    public void o(io.sentry.X x8, J2 j8) {
        this.f26169a.registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
