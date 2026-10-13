package p017b7;

import C6.q;
import C6.r;
import G6.d;
import Q6.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class C {
    public static final Object a(Object obj, d dVar) {
        if (!(obj instanceof C1822z)) {
            return q.b(obj);
        }
        q.a aVar = q.f1441b;
        return q.b(r.a(((C1822z) obj).f15995a));
    }

    public static final Object b(Object obj, k kVar) {
        Throwable thE = q.e(obj);
        if (thE == null) {
            return kVar != null ? new A(obj, kVar) : obj;
        }
        return new C1822z(thE, false, 2, null);
    }

    public static final Object c(Object obj, InterfaceC1795l interfaceC1795l) {
        Throwable thE = q.e(obj);
        return thE == null ? obj : new C1822z(thE, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, k kVar, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            kVar = null;
        }
        return b(obj, kVar);
    }
}
