package p044e7;

import G6.g;
import p017b7.InterfaceC1815v0;
import p035d7.d;
import p053f7.q;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements M, InterfaceC2260f, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1815v0 f21227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f21228b;

    public z(M m8, InterfaceC1815v0 interfaceC1815v0) {
        this.f21227a = interfaceC1815v0;
        this.f21228b = m8;
    }

    @Override // p053f7.q
    public InterfaceC2260f a(g gVar, int i8, d dVar) {
        return O.d(this, gVar, i8, dVar);
    }

    @Override // p044e7.B, p044e7.InterfaceC2260f
    public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
        return this.f21228b.collect(interfaceC2261g, dVar);
    }

    @Override // p044e7.M
    public Object getValue() {
        return this.f21228b.getValue();
    }
}
