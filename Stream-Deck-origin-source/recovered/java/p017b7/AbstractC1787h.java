package p017b7;

import G6.e;
import G6.g;
import G6.h;
import Q6.o;

/* JADX INFO: renamed from: b7.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1787h {
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    public static final Object a(g gVar, o oVar) {
        AbstractC1784f0 abstractC1784f0A;
        g gVarE;
        Thread threadCurrentThread = Thread.currentThread();
        e eVar = (e) gVar.A(e.f2817J);
        if (eVar == null) {
            abstractC1784f0A = U0.f15919a.b();
            gVarE = E.e(C1802o0.f15975a, gVar.P1(abstractC1784f0A));
        } else {
            AbstractC1784f0 abstractC1784f0 = eVar instanceof AbstractC1784f0 ? (AbstractC1784f0) eVar : null;
            if (abstractC1784f0 == null) {
                abstractC1784f0A = U0.f15919a.a();
            } else {
                AbstractC1784f0 abstractC1784f1 = abstractC1784f0.f2() ? abstractC1784f0 : null;
                if (abstractC1784f1 == null) {
                    abstractC1784f0A = U0.f15919a.a();
                } else {
                    abstractC1784f0A = abstractC1784f1;
                }
            }
            gVarE = E.e(C1802o0.f15975a, gVar);
        }
        C1781e c1781e = new C1781e(gVarE, threadCurrentThread, abstractC1784f0A);
        c1781e.c1(L.DEFAULT, c1781e, oVar);
        return c1781e.d1();
    }

    public static /* synthetic */ Object b(g gVar, o oVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = h.f2820a;
        }
        return AbstractC1785g.e(gVar, oVar);
    }
}
