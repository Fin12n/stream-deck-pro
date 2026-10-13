package P1;

import android.os.CancellationSignal;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f8865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8867d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        void onCancel();
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f8864a) {
                    return;
                }
                this.f8864a = true;
                this.f8867d = true;
                a aVar = this.f8865b;
                Object obj = this.f8866c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f8867d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f8867d = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(a aVar) {
        synchronized (this) {
            try {
                c();
                if (this.f8865b == aVar) {
                    return;
                }
                this.f8865b = aVar;
                if (this.f8864a && aVar != null) {
                    aVar.onCancel();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        while (this.f8867d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
