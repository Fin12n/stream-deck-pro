package p017b7;

import G6.d;
import H6.c;

/* JADX INFO: renamed from: b7.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1814v extends D0 implements InterfaceC1812u {
    public C1814v(InterfaceC1815v0 interfaceC1815v0) {
        super(true);
        k0(interfaceC1815v0);
    }

    @Override // p017b7.Q
    public Object Q0(d dVar) throws Throwable {
        Object objX = x(dVar);
        c.f();
        return objX;
    }

    @Override // p017b7.D0
    public boolean X() {
        return true;
    }

    @Override // p017b7.InterfaceC1812u
    public boolean r1(Object obj) {
        return q0(obj);
    }

    @Override // p017b7.InterfaceC1812u
    public boolean v(Throwable th) {
        return q0(new C1822z(th, false, 2, null));
    }
}
