package N0;

import A1.r;
import p038e1.AbstractC2248t;
import p038e1.InterfaceC2247s;
import p056g1.AbstractC2347k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final boolean c(d dVar, long j8) {
        if (!dVar.I0().K1()) {
            return false;
        }
        InterfaceC2247s interfaceC2247sG = AbstractC2347k.k(dVar).g();
        if (!interfaceC2247sG.y()) {
            return false;
        }
        long jA = interfaceC2247sG.a();
        int iG = r.g(jA);
        int iF = r.f(jA);
        long jE = AbstractC2248t.e(interfaceC2247sG);
        float fE = Q0.f.e(jE);
        float f8 = Q0.f.f(jE);
        float f9 = iG + fE;
        float f10 = iF + f8;
        float fO = Q0.f.o(j8);
        if (fE <= fO && fO <= f9) {
            float fP = Q0.f.p(j8);
            if (f8 <= fP && fP <= f10) {
                return true;
            }
        }
        return false;
    }

    public static final void d(g gVar, b bVar) {
        gVar.z0(bVar);
        gVar.N(bVar);
    }
}
