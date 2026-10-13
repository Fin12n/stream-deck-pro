package p017b7;

import C6.q;
import C6.r;
import G6.d;
import p062g7.C2372k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class N {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(d dVar) {
        Object objB;
        if (dVar instanceof C2372k) {
            return dVar.toString();
        }
        try {
            q.a aVar = q.f1441b;
            objB = q.b(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            q.a aVar2 = q.f1441b;
            objB = q.b(r.a(th));
        }
        if (q.e(objB) != null) {
            objB = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) objB;
    }
}
