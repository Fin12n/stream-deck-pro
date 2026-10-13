package S4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f9756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f9757b;

    public v(w wVar, k kVar) {
        this.f9757b = wVar;
        this.f9756a = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f9757b.f9759b) {
            try {
                w wVar = this.f9757b;
                if (wVar.f9760c != null) {
                    wVar.f9760c.a(this.f9756a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
