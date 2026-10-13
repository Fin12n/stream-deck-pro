package p211y4;

import F4.g;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: y4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class ComponentCallbacks2C3102c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ComponentCallbacks2C3102c f38349e = new ComponentCallbacks2C3102c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f38350a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f38351b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f38352c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f38353d = false;

    /* JADX INFO: renamed from: y4.c$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        void a(boolean z8);
    }

    public static ComponentCallbacks2C3102c b() {
        return f38349e;
    }

    public static void c(Application application) {
        ComponentCallbacks2C3102c componentCallbacks2C3102c = f38349e;
        synchronized (componentCallbacks2C3102c) {
            try {
                if (!componentCallbacks2C3102c.f38353d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C3102c);
                    application.registerComponentCallbacks(componentCallbacks2C3102c);
                    componentCallbacks2C3102c.f38353d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(a aVar) {
        synchronized (f38349e) {
            this.f38352c.add(aVar);
        }
    }

    public boolean d() {
        return this.f38350a.get();
    }

    public boolean e(boolean z8) {
        if (!this.f38351b.get()) {
            if (!g.a()) {
                return z8;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f38351b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f38350a.set(true);
            }
        }
        return d();
    }

    public final void f(boolean z8) {
        synchronized (f38349e) {
            try {
                Iterator it = this.f38352c.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(z8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f38351b;
        boolean zCompareAndSet = this.f38350a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f38351b;
        boolean zCompareAndSet = this.f38350a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i8) {
        if (i8 == 20 && this.f38350a.compareAndSet(false, true)) {
            this.f38351b.set(true);
            f(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
