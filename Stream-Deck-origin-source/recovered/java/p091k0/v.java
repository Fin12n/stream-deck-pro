package p091k0;

import Q6.k;
import Q6.p;
import Q6.q;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface v {
    static /* synthetic */ void c(v vVar, Object obj, Object obj2, p pVar, int i8, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i8 & 1) != 0) {
            obj = null;
        }
        if ((i8 & 2) != 0) {
            obj2 = null;
        }
        vVar.a(obj, obj2, pVar);
    }

    static /* synthetic */ void g(v vVar, Object obj, Object obj2, p pVar, int i8, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i8 & 1) != 0) {
            obj = null;
        }
        if ((i8 & 2) != 0) {
            obj2 = null;
        }
        vVar.h(obj, obj2, pVar);
    }

    void a(Object obj, Object obj2, p pVar);

    void d(int i8, k kVar, k kVar2, q qVar);

    void h(Object obj, Object obj2, p pVar);
}
