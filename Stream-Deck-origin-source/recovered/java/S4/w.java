package S4;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class w implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f9758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9759b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1634e f9760c;

    public w(Executor executor, InterfaceC1634e interfaceC1634e) {
        this.f9758a = executor;
        this.f9760c = interfaceC1634e;
    }

    @Override // S4.D
    public final void c(k kVar) {
        synchronized (this.f9759b) {
            try {
                if (this.f9760c == null) {
                    return;
                }
                this.f9758a.execute(new v(this, kVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
