package p143q0;

import Q0.f;
import Q0.g;
import Q0.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class Y {
    public static final long b(long j8, h hVar) {
        float fJ;
        float fE;
        if (f.o(j8) < hVar.i()) {
            fJ = hVar.i();
        } else {
            fJ = f.o(j8) > hVar.j() ? hVar.j() : f.o(j8);
        }
        if (f.p(j8) < hVar.l()) {
            fE = hVar.l();
        } else {
            fE = f.p(j8) > hVar.e() ? hVar.e() : f.p(j8);
        }
        return g.a(fJ, fE);
    }
}
