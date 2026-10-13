package p017b7;

import C6.G;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class P0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f15917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1795l f15918b;

    public P0(F f8, InterfaceC1795l interfaceC1795l) {
        this.f15917a = f8;
        this.f15918b = interfaceC1795l;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f15918b.C(this.f15917a, G.f1419a);
    }
}
