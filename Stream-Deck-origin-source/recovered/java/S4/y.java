package S4;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class y implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f9763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9764b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1635f f9765c;

    public y(Executor executor, InterfaceC1635f interfaceC1635f) {
        this.f9763a = executor;
        this.f9765c = interfaceC1635f;
    }

    @Override // S4.D
    public final void c(k kVar) {
        if (kVar.l() || kVar.j()) {
            return;
        }
        synchronized (this.f9764b) {
            try {
                if (this.f9765c == null) {
                    return;
                }
                this.f9763a.execute(new x(this, kVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
