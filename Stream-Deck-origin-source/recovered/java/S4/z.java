package S4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f9766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f9767b;

    public z(A a8, k kVar) {
        this.f9767b = a8;
        this.f9766a = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f9767b.f9727b) {
            try {
                A a8 = this.f9767b;
                if (a8.f9728c != null) {
                    a8.f9728c.a(this.f9766a.i());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
