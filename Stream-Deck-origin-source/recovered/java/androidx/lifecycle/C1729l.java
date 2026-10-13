package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1729l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1729l f15302a = new C1729l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f15303b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: androidx.lifecycle.l$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends C1722e {
        @Override // androidx.lifecycle.C1722e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.t.g(activity, "activity");
            D.f15213b.c(activity);
        }
    }

    public static final void a(Context context) {
        kotlin.jvm.internal.t.g(context, "context");
        if (f15303b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.t.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
