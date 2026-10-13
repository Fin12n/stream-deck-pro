package p211y4;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f38384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f38386c;

    public g0(h0 h0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f38386c = h0Var;
        this.f38384a = lifecycleCallback;
        this.f38385b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        h0 h0Var = this.f38386c;
        if (h0Var.f38389b > 0) {
            LifecycleCallback lifecycleCallback = this.f38384a;
            if (h0Var.f38390c != null) {
                bundle = h0Var.f38390c.getBundle(this.f38385b);
            } else {
                bundle = null;
            }
            lifecycleCallback.f(bundle);
        }
        if (this.f38386c.f38389b >= 2) {
            this.f38384a.j();
        }
        if (this.f38386c.f38389b >= 3) {
            this.f38384a.h();
        }
        if (this.f38386c.f38389b >= 4) {
            this.f38384a.k();
        }
        if (this.f38386c.f38389b >= 5) {
            this.f38384a.g();
        }
    }
}
