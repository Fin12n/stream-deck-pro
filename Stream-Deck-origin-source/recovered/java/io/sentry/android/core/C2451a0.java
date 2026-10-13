package io.sentry.android.core;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: io.sentry.android.core.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C2451a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2451a0 f26285b = new C2451a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f26286a;

    public static C2451a0 c() {
        return f26285b;
    }

    public void a() {
        this.f26286a = null;
    }

    public Activity b() {
        WeakReference weakReference = this.f26286a;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public void d(Activity activity) {
        WeakReference weakReference = this.f26286a;
        if (weakReference == null || weakReference.get() != activity) {
            this.f26286a = new WeakReference(activity);
        }
    }
}
