package p100l0;

import Q6.k;
import Q6.o;
import Q6.p;
import Q6.q;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface A {
    static /* synthetic */ void f(A a8, Object obj, k kVar, Object obj2, p pVar, int i8, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i8 & 1) != 0) {
            obj = null;
        }
        if ((i8 & 2) != 0) {
            kVar = null;
        }
        if ((i8 & 4) != 0) {
            obj2 = null;
        }
        a8.b(obj, kVar, obj2, pVar);
    }

    void b(Object obj, k kVar, Object obj2, p pVar);

    void e(int i8, k kVar, o oVar, k kVar2, q qVar);
}
