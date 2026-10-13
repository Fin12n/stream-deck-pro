package p168t1;

import C6.G;
import C6.o;
import C6.q;
import C6.r;
import Q6.k;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static final o b(List list, S s8, C3003h c3003h, H h8, k kVar) {
        Object objG;
        Object objB;
        Object objG2;
        int size = list.size();
        List listT = null;
        for (int i8 = 0; i8 < size; i8++) {
            InterfaceC3008m interfaceC3008m = (InterfaceC3008m) list.get(i8);
            int iA = interfaceC3008m.a();
            w.a aVar = w.f34108a;
            if (w.e(iA, aVar.b())) {
                synchronized (c3003h.f34068d) {
                    try {
                        C3003h.b bVar = new C3003h.b(interfaceC3008m, h8.c());
                        C3003h.a aVar2 = (C3003h.a) c3003h.f34066b.d(bVar);
                        if (aVar2 == null) {
                            aVar2 = (C3003h.a) c3003h.f34067c.c(bVar);
                        }
                        if (aVar2 != null) {
                            objG = aVar2.g();
                        } else {
                            G g8 = G.f1419a;
                            try {
                                Object objB2 = h8.b(interfaceC3008m);
                                C3003h.f(c3003h, interfaceC3008m, h8, objB2, false, 8, null);
                                objG = objB2;
                            } catch (Exception e8) {
                                throw new IllegalStateException("Unable to load font " + interfaceC3008m, e8);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (objG != null) {
                    return C6.v.a(listT, A.a(s8.e(), objG, interfaceC3008m, s8.f(), s8.d()));
                }
                throw new IllegalStateException("Unable to load font " + interfaceC3008m);
            }
            if (w.e(iA, aVar.c())) {
                synchronized (c3003h.f34068d) {
                    try {
                        C3003h.b bVar2 = new C3003h.b(interfaceC3008m, h8.c());
                        C3003h.a aVar3 = (C3003h.a) c3003h.f34066b.d(bVar2);
                        if (aVar3 == null) {
                            aVar3 = (C3003h.a) c3003h.f34067c.c(bVar2);
                        }
                        if (aVar3 != null) {
                            objG2 = aVar3.g();
                        } else {
                            G g9 = G.f1419a;
                            try {
                                q.a aVar4 = q.f1441b;
                                objB = q.b(h8.b(interfaceC3008m));
                            } catch (Throwable th2) {
                                q.a aVar5 = q.f1441b;
                                objB = q.b(r.a(th2));
                            }
                            Object obj = q.g(objB) ? null : objB;
                            C3003h.f(c3003h, interfaceC3008m, h8, obj, false, 8, null);
                            objG2 = obj;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (objG2 != null) {
                    return C6.v.a(listT, A.a(s8.e(), objG2, interfaceC3008m, s8.f(), s8.d()));
                }
            } else {
                if (!w.e(iA, aVar.a())) {
                    throw new IllegalStateException("Unknown font type " + interfaceC3008m);
                }
                C3003h.a aVarD = c3003h.d(interfaceC3008m, h8);
                if (aVarD != null) {
                    if (!C3003h.a.e(aVarD.g()) && aVarD.g() != null) {
                        return C6.v.a(listT, A.a(s8.e(), aVarD.g(), interfaceC3008m, s8.f(), s8.d()));
                    }
                } else if (listT == null) {
                    listT = D6.r.t(interfaceC3008m);
                } else {
                    listT.add(interfaceC3008m);
                }
            }
        }
        return C6.v.a(listT, kVar.invoke(s8));
    }
}
