package S4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f9752a;

    public t(u uVar) {
        this.f9752a = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f9752a.f9754b) {
            try {
                u uVar = this.f9752a;
                if (uVar.f9755c != null) {
                    uVar.f9755c.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
