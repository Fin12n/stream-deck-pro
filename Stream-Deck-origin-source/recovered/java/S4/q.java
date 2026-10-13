package S4;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f9750a = new CountDownLatch(1);

    public /* synthetic */ q(p pVar) {
    }

    @Override // S4.InterfaceC1636g
    public final void a(Object obj) {
        this.f9750a.countDown();
    }

    @Override // S4.InterfaceC1633d
    public final void b() {
        this.f9750a.countDown();
    }

    public final void c() throws InterruptedException {
        this.f9750a.await();
    }

    @Override // S4.InterfaceC1635f
    public final void d(Exception exc) {
        this.f9750a.countDown();
    }
}
