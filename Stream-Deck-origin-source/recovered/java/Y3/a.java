package Y3;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f12187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f12188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12190d;

    public a(Function0 onForeground, Function0 onBackground) {
        t.g(onForeground, "onForeground");
        t.g(onBackground, "onBackground");
        this.f12187a = onForeground;
        this.f12188b = onBackground;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        t.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        t.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        t.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        t.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        t.g(activity, "activity");
        t.g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        t.g(activity, "activity");
        this.f12189c++;
        if (this.f12190d) {
            return;
        }
        this.f12190d = true;
        this.f12187a.invoke();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        t.g(activity, "activity");
        int i8 = this.f12189c;
        if (i8 == 0) {
            return;
        }
        int i9 = i8 - 1;
        this.f12189c = i9;
        if (i9 == 0 && this.f12190d) {
            this.f12190d = false;
            this.f12188b.invoke();
        }
    }
}
