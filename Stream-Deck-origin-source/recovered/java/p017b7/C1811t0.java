package p017b7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: b7.t0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1811t0 extends AbstractC1819x0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15982f = AtomicIntegerFieldUpdater.newUpdater(C1811t0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1809s0 f15983e;

    public C1811t0(InterfaceC1809s0 interfaceC1809s0) {
        this.f15983e = interfaceC1809s0;
    }

    @Override // p017b7.InterfaceC1809s0
    public void a(Throwable th) {
        if (f15982f.compareAndSet(this, 0, 1)) {
            this.f15983e.a(th);
        }
    }
}
