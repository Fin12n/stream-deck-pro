package p211y4;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f38402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f38404c;

    public i0(j0 j0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f38404c = j0Var;
        this.f38402a = lifecycleCallback;
        this.f38403b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        j0 j0Var = this.f38404c;
        if (j0Var.f38407p0 > 0) {
            LifecycleCallback lifecycleCallback = this.f38402a;
            if (j0Var.f38408q0 != null) {
                bundle = j0Var.f38408q0.getBundle(this.f38403b);
            } else {
                bundle = null;
            }
            lifecycleCallback.f(bundle);
        }
        if (this.f38404c.f38407p0 >= 2) {
            this.f38402a.j();
        }
        if (this.f38404c.f38407p0 >= 3) {
            this.f38402a.h();
        }
        if (this.f38404c.f38407p0 >= 4) {
            this.f38402a.k();
        }
        if (this.f38404c.f38407p0 >= 5) {
            this.f38402a.g();
        }
    }
}
