package p100l0;

import A1.n;
import L0.i;
import p037e0.AbstractC2214j;
import p037e0.E;
import p037e0.x0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface q {
    static /* synthetic */ i a(q qVar, i iVar, E e8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
        }
        if ((i8 & 1) != 0) {
            e8 = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
        }
        return qVar.b(iVar, e8);
    }

    i b(i iVar, E e8);
}
