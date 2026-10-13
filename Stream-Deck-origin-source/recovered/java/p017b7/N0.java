package p017b7;

import C6.q;
import C6.r;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class N0 extends C0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1797m f15911e;

    public N0(C1797m c1797m) {
        this.f15911e = c1797m;
    }

    @Override // p017b7.InterfaceC1809s0
    public void a(Throwable th) {
        Object objC0 = x().c0();
        if (objC0 instanceof C1822z) {
            C1797m c1797m = this.f15911e;
            q.a aVar = q.f1441b;
            c1797m.resumeWith(q.b(r.a(((C1822z) objC0).f15995a)));
        } else {
            C1797m c1797m2 = this.f15911e;
            q.a aVar2 = q.f1441b;
            c1797m2.resumeWith(q.b(E0.h(objC0)));
        }
    }
}
