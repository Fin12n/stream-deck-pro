package p017b7;

import C6.G;
import C6.q;
import G6.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class O0 extends C0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f15914e;

    public O0(d<? super G> dVar) {
        this.f15914e = dVar;
    }

    @Override // p017b7.InterfaceC1809s0
    public void a(Throwable th) {
        d dVar = this.f15914e;
        q.a aVar = q.f1441b;
        dVar.resumeWith(q.b(G.f1419a));
    }
}
