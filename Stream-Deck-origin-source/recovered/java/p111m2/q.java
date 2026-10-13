package p111m2;

import I1.a;
import T1.f;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends AbstractC2688m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f29944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f29945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f29946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f29948e;

    public q(Context context, Handler handler, int i8) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i8);
    }

    @Override // p111m2.AbstractC2688m
    public View f(int i8) {
        return null;
    }

    @Override // p111m2.AbstractC2688m
    public boolean g() {
        return true;
    }

    public Activity j() {
        return this.f29944a;
    }

    public Context o() {
        return this.f29945b;
    }

    public Handler r() {
        return this.f29946c;
    }

    public abstract Object x();

    public LayoutInflater y() {
        return LayoutInflater.from(this.f29945b);
    }

    public void z(ComponentCallbacksC2681f componentCallbacksC2681f, Intent intent, int i8, Bundle bundle) {
        if (i8 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        a.g(this.f29945b, intent, bundle);
    }

    public q(ActivityC2686k activityC2686k) {
        this(activityC2686k, activityC2686k, new Handler(), 0);
    }

    public q(Activity activity, Context context, Handler handler, int i8) {
        this.f29948e = new z();
        this.f29944a = activity;
        this.f29945b = (Context) f.h(context, "context == null");
        this.f29946c = (Handler) f.h(handler, "handler == null");
        this.f29947d = i8;
    }

    public void A() {
    }

    public void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
