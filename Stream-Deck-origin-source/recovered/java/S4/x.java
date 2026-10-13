package S4;

import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f9761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f9762b;

    public x(y yVar, k kVar) {
        this.f9762b = yVar;
        this.f9761a = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f9762b.f9764b) {
            try {
                y yVar = this.f9762b;
                if (yVar.f9765c != null) {
                    yVar.f9765c.d((Exception) AbstractC3207p.k(this.f9761a.h()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
