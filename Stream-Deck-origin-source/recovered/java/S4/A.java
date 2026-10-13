package S4;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class A implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f9726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9727b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1636g f9728c;

    public A(Executor executor, InterfaceC1636g interfaceC1636g) {
        this.f9726a = executor;
        this.f9728c = interfaceC1636g;
    }

    @Override // S4.D
    public final void c(k kVar) {
        if (kVar.l()) {
            synchronized (this.f9727b) {
                try {
                    if (this.f9728c == null) {
                        return;
                    }
                    this.f9726a.execute(new z(this, kVar));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
