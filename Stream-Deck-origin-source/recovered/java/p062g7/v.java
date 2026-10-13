package p062g7;

import Y6.l;
import Y6.n;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import p017b7.H0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f23874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H0 f23875b;

    static {
        v vVar = new v();
        f23874a = vVar;
        H.f("kotlinx.coroutines.fast.service.loader", true);
        f23875b = vVar.a();
    }

    public final H0 a() {
        Object next;
        H0 h0E;
        try {
            List listU = n.u(l.c(ServiceLoader.load(u.class, u.class.getClassLoader()).iterator()));
            Iterator it = listU.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((u) next).c();
                    do {
                        Object next2 = it.next();
                        int iC2 = ((u) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            u uVar = (u) next;
            if (uVar != null && (h0E = w.e(uVar, listU)) != null) {
                return h0E;
            }
            return w.b(null, null, 3, null);
        } catch (Throwable th) {
            return w.b(th, null, 2, null);
        }
    }
}
