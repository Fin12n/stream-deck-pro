package p056g1;

import B0.d;
import L0.i;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: g1.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2347k {
    public static final void c(d dVar, i.c cVar) {
        d dVarU0 = k(cVar).u0();
        int iS = dVarU0.s();
        if (iS > 0) {
            int i8 = iS - 1;
            Object[] objArrR = dVarU0.r();
            do {
                dVar.d(((F) objArrR[i8]).j0().k());
                i8--;
            } while (i8 >= 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final A d(i.c cVar) {
        if ((Z.a(2) & cVar.F1()) != 0) {
            if (cVar instanceof A) {
                return (A) cVar;
            }
            if (cVar instanceof AbstractC2348l) {
                i.c cVarE2 = ((AbstractC2348l) cVar).e2();
                while (cVarE2 != 0) {
                    if (cVarE2 instanceof A) {
                        return (A) cVarE2;
                    }
                    cVarE2 = (!(cVarE2 instanceof AbstractC2348l) || (Z.a(2) & cVarE2.F1()) == 0) ? cVarE2.B1() : ((AbstractC2348l) cVarE2).e2();
                }
            }
        }
        return null;
    }

    public static final boolean e(InterfaceC2346j interfaceC2346j, int i8) {
        return (interfaceC2346j.I0().A1() & i8) != 0;
    }

    public static final boolean f(InterfaceC2346j interfaceC2346j) {
        return interfaceC2346j.I0() == interfaceC2346j;
    }

    public static final i.c g(d dVar) {
        if (dVar == null || dVar.u()) {
            return null;
        }
        return (i.c) dVar.D(dVar.s() - 1);
    }

    public static final X h(InterfaceC2346j interfaceC2346j, int i8) {
        X xC1 = interfaceC2346j.I0().C1();
        t.d(xC1);
        if (xC1.i2() != interfaceC2346j || !a0.i(i8)) {
            return xC1;
        }
        X xJ2 = xC1.j2();
        t.d(xJ2);
        return xJ2;
    }

    public static final A1.d i(InterfaceC2346j interfaceC2346j) {
        return k(interfaceC2346j).I();
    }

    public static final A1.t j(InterfaceC2346j interfaceC2346j) {
        return k(interfaceC2346j).getLayoutDirection();
    }

    public static final F k(InterfaceC2346j interfaceC2346j) {
        X xC1 = interfaceC2346j.I0().C1();
        if (xC1 != null) {
            return xC1.h1();
        }
        throw new IllegalStateException("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final h0 l(InterfaceC2346j interfaceC2346j) {
        h0 h0VarL0 = k(interfaceC2346j).l0();
        if (h0VarL0 != null) {
            return h0VarL0;
        }
        throw new IllegalStateException("This node does not have an owner.");
    }
}
