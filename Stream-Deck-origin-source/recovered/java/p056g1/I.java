package p056g1;

import L0.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class I {
    public static final i.c b(InterfaceC2346j interfaceC2346j) {
        int iA = Z.a(4);
        int iA2 = Z.a(2);
        i.c cVarB1 = interfaceC2346j.I0().B1();
        if (cVarB1 == null || (cVarB1.A1() & iA) == 0) {
            return null;
        }
        while (cVarB1 != null && (cVarB1.F1() & iA2) == 0) {
            if ((cVarB1.F1() & iA) != 0) {
                return cVarB1;
            }
            cVarB1 = cVarB1.B1();
        }
        return null;
    }
}
