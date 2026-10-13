package p211y4;

import android.util.Log;
import p195w4.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class E implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f38293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f38294b;

    public E(F f8, b bVar) {
        this.f38294b = f8;
        this.f38293a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F f8 = this.f38294b;
        B b8 = (B) f8.f38300f.f38371j.get(f8.f38296b);
        if (b8 == null) {
            return;
        }
        if (!this.f38293a.e()) {
            b8.I(this.f38293a, null);
            return;
        }
        this.f38294b.f38299e = true;
        if (this.f38294b.f38295a.o()) {
            this.f38294b.i();
            return;
        }
        try {
            F f9 = this.f38294b;
            f9.f38295a.e(null, f9.f38295a.d());
        } catch (SecurityException e8) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e8);
            this.f38294b.f38295a.f("Failed to get service from broker.");
            b8.I(new b(10), null);
        }
    }
}
