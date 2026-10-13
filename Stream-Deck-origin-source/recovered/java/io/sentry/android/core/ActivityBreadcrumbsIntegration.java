package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.C2491e;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.InterfaceC2480b0;
import io.sentry.InterfaceC2516k0;
import io.sentry.J2;
import io.sentry.util.C2569a;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class ActivityBreadcrumbsIntegration implements InterfaceC2516k0, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f26083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public io.sentry.X f26084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2569a f26086d = new C2569a();

    public ActivityBreadcrumbsIntegration(Application application) {
        this.f26083a = (Application) io.sentry.util.u.c(application, "Application is required");
    }

    public final void b(Activity activity, String str) {
        if (this.f26084b == null) {
            return;
        }
        C2491e c2491e = new C2491e();
        c2491e.C("navigation");
        c2491e.z("state", str);
        c2491e.z("screen", c(activity));
        c2491e.y("ui.lifecycle");
        c2491e.A(EnumC2596z2.INFO);
        io.sentry.H h8 = new io.sentry.H();
        h8.k("android:activity", activity);
        this.f26084b.e(c2491e, h8);
    }

    public final String c(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f26085c) {
            this.f26083a.unregisterActivityLifecycleCallbacks(this);
            io.sentry.X x8 = this.f26084b;
            if (x8 != null) {
                x8.b().getLogger().c(EnumC2596z2.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC2516k0
    public void o(io.sentry.X x8, J2 j8) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.u.c(j8 instanceof SentryAndroidOptions ? (SentryAndroidOptions) j8 : null, "SentryAndroidOptions is required");
        this.f26084b = (io.sentry.X) io.sentry.util.u.c(x8, "Scopes are required");
        this.f26085c = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        ILogger logger = j8.getLogger();
        EnumC2596z2 enumC2596z2 = EnumC2596z2.DEBUG;
        logger.c(enumC2596z2, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f26085c));
        if (this.f26085c) {
            this.f26083a.registerActivityLifecycleCallbacks(this);
            j8.getLogger().c(enumC2596z2, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            io.sentry.util.o.a("ActivityBreadcrumbs");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26086d.a();
        try {
            b(activity, "created");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26086d.a();
        try {
            b(activity, "destroyed");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26086d.a();
        try {
            b(activity, "paused");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26086d.a();
        try {
            b(activity, "resumed");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26086d.a();
        try {
            b(activity, "saveInstanceState");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26086d.a();
        try {
            b(activity, "started");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26086d.a();
        try {
            b(activity, "stopped");
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
}
