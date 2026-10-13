package P;

import A.InterfaceC0870f0;
import H.AbstractC1016z;
import H.EnumC1002s;
import H.EnumC1006u;
import H.EnumC1010w;
import H.InterfaceC1014y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a {
    public e(int i8, c cVar) {
        super(i8, cVar);
    }

    public void d(androidx.camera.core.d dVar) {
        if (e(dVar.e1())) {
            super.b(dVar);
        } else {
            this.f8823d.a(dVar);
        }
    }

    public final boolean e(InterfaceC0870f0 interfaceC0870f0) {
        InterfaceC1014y interfaceC1014yA = AbstractC1016z.a(interfaceC0870f0);
        if (interfaceC1014yA == null) {
            return false;
        }
        return (interfaceC1014yA.k() == EnumC1006u.LOCKED_FOCUSED || interfaceC1014yA.k() == EnumC1006u.PASSIVE_FOCUSED) && interfaceC1014yA.h() == EnumC1002s.CONVERGED && interfaceC1014yA.e() == EnumC1010w.CONVERGED;
    }
}
