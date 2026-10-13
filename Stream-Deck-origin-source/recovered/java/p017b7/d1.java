package p017b7;

import C6.G;
import G6.d;
import G6.g;
import H6.b;
import H6.c;
import I6.h;
import p062g7.AbstractC2373l;
import p062g7.C2372k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d1 {
    public static final Object a(d dVar) {
        Object objF;
        g context = dVar.getContext();
        AbstractC1823z0.l(context);
        d dVarC = b.c(dVar);
        C2372k c2372k = dVarC instanceof C2372k ? (C2372k) dVarC : null;
        if (c2372k == null) {
            objF = G.f1419a;
        } else {
            if (c2372k.f23844d.g1(context)) {
                c2372k.k(context, G.f1419a);
            } else {
                c1 c1Var = new c1();
                g gVarP1 = context.P1(c1Var);
                G g8 = G.f1419a;
                c2372k.k(gVarP1, g8);
                objF = (!c1Var.f15943b || AbstractC2373l.d(c2372k)) ? c.f() : g8;
            }
            objF = c.f();
        }
        if (objF == c.f()) {
            h.c(dVar);
        }
        return objF == c.f() ? objF : G.f1419a;
    }
}
