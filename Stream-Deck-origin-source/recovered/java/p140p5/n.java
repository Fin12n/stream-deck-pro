package p140p5;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f31296b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f31295a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Queue f31297c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f31298d = new AtomicReference();

    public void a(Executor executor, Runnable runnable) {
        synchronized (this.f31295a) {
            try {
                if (this.f31296b) {
                    this.f31297c.add(new H(executor, runnable, null));
                } else {
                    this.f31296b = true;
                    e(executor, runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.f31295a) {
            try {
                if (this.f31297c.isEmpty()) {
                    this.f31296b = false;
                } else {
                    H h8 = (H) this.f31297c.remove();
                    e(h8.f31245a, h8.f31246b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: p5.F
                @Override // java.lang.Runnable
                public final void run() {
                    J j8 = new J(this.f31243a, null);
                    try {
                        runnable.run();
                        j8.close();
                    } catch (Throwable th) {
                        try {
                            j8.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            d();
        }
    }
}
