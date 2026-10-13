package S4;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C implements InterfaceC1636g, InterfaceC1635f, InterfaceC1633d, D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f9731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f9732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I f9733c;

    public C(Executor executor, j jVar, I i8) {
        this.f9731a = executor;
        this.f9732b = jVar;
        this.f9733c = i8;
    }

    @Override // S4.InterfaceC1636g
    public final void a(Object obj) {
        this.f9733c.o(obj);
    }

    @Override // S4.InterfaceC1633d
    public final void b() {
        this.f9733c.p();
    }

    @Override // S4.D
    public final void c(k kVar) {
        this.f9731a.execute(new B(this, kVar));
    }

    @Override // S4.InterfaceC1635f
    public final void d(Exception exc) {
        this.f9733c.n(exc);
    }
}
