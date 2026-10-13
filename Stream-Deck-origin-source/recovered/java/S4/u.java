package S4;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class u implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f9753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9754b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1633d f9755c;

    public u(Executor executor, InterfaceC1633d interfaceC1633d) {
        this.f9753a = executor;
        this.f9755c = interfaceC1633d;
    }

    @Override // S4.D
    public final void c(k kVar) {
        if (kVar.j()) {
            synchronized (this.f9754b) {
                try {
                    if (this.f9755c == null) {
                        return;
                    }
                    this.f9753a.execute(new t(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
