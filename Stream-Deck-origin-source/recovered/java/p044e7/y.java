package p044e7;

import G6.g;
import p017b7.InterfaceC1815v0;
import p035d7.d;
import p053f7.q;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class y implements B, InterfaceC2260f, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1815v0 f21225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f21226b;

    public y(B b8, InterfaceC1815v0 interfaceC1815v0) {
        this.f21225a = interfaceC1815v0;
        this.f21226b = b8;
    }

    @Override // p053f7.q
    public InterfaceC2260f a(g gVar, int i8, d dVar) {
        return D.e(this, gVar, i8, dVar);
    }

    @Override // p044e7.B, p044e7.InterfaceC2260f
    public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
        return this.f21226b.collect(interfaceC2261g, dVar);
    }
}
