package p082j0;

import A1.d;
import L0.c;
import L0.i;
import p056g1.k0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends i.c implements k0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c.InterfaceC0174c f27937n;

    public c0(c.InterfaceC0174c interfaceC0174c) {
        this.f27937n = interfaceC0174c;
    }

    @Override // p056g1.k0
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public Q f(d dVar, Object obj) {
        Q q8 = obj instanceof Q ? (Q) obj : null;
        if (q8 == null) {
            q8 = new Q(0.0f, false, null, 7, null);
        }
        q8.d(AbstractC2611o.f28039a.b(this.f27937n));
        return q8;
    }

    public final void e2(c.InterfaceC0174c interfaceC0174c) {
        this.f27937n = interfaceC0174c;
    }
}
