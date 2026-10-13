package p062g7;

import Q6.o;

/* JADX INFO: renamed from: g7.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2365d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G f23837a = new G("CLOSED");

    public static final AbstractC2366e b(AbstractC2366e abstractC2366e) {
        while (true) {
            Object objG = abstractC2366e.g();
            if (objG == f23837a) {
                return abstractC2366e;
            }
            AbstractC2366e abstractC2366e2 = (AbstractC2366e) objG;
            if (abstractC2366e2 != null) {
                abstractC2366e = abstractC2366e2;
            } else if (abstractC2366e.m()) {
                return abstractC2366e;
            }
        }
    }

    public static final Object c(D d8, long j8, o oVar) {
        while (true) {
            if (d8.f23815c >= j8 && !d8.k()) {
                return E.a(d8);
            }
            Object objG = d8.g();
            if (objG == f23837a) {
                return E.a(f23837a);
            }
            D d9 = (D) ((AbstractC2366e) objG);
            if (d9 == null) {
                d9 = (D) oVar.invoke(Long.valueOf(d8.f23815c + 1), d8);
                if (d8.o(d9)) {
                    if (d8.k()) {
                        d8.n();
                    }
                }
            }
            d8 = d9;
        }
    }
}
