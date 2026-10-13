package p035d7;

import G6.g;
import G6.h;
import Q6.k;
import Q6.o;
import p017b7.E;
import p017b7.J;
import p017b7.L;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final y a(J j8, g gVar, int i8, L l8, k kVar, o oVar) {
        a aVar;
        a aVar2;
        a sVar;
        g gVarE = E.e(j8, gVar);
        g gVarB = j.b(i8, null, null, 6, null);
        if (l8.c()) {
            sVar = new s(gVarE, gVarB, oVar);
        } else {
            aVar = new a(gVarE, gVarB, true);
        }
        if (kVar != null) {
            aVar2 = aVar;
            aVar2 = sVar;
            aVar2.H0(kVar);
        }
        aVar2 = aVar;
        aVar2 = sVar;
        aVar2.c1(l8, aVar2, oVar);
        return aVar2;
    }

    public static /* synthetic */ y b(J j8, g gVar, int i8, L l8, k kVar, o oVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            gVar = h.f2820a;
        }
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            l8 = L.DEFAULT;
        }
        if ((i9 & 8) != 0) {
            kVar = null;
        }
        L l9 = l8;
        return a(j8, gVar, i8, l9, kVar, oVar);
    }
}
