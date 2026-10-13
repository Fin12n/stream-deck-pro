package p163s4;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f33161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f33162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CountDownLatch f33163c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33164d = false;

    public c(a aVar, long j8) {
        this.f33161a = new WeakReference(aVar);
        this.f33162b = j8;
        start();
    }

    public final void a() {
        a aVar = (a) this.f33161a.get();
        if (aVar != null) {
            aVar.c();
            this.f33164d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f33163c.await(this.f33162b, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
