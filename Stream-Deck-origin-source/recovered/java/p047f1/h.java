package p047f1;

import B0.d;
import L0.i;
import androidx.compose.ui.node.a;
import p056g1.AbstractC2347k;
import p056g1.AbstractC2348l;
import p056g1.F;
import p056g1.InterfaceC2346j;
import p056g1.Z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface h extends k, InterfaceC2346j {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // p047f1.k
    default Object u(c cVar) {
        a aVarJ0;
        if (!I0().K1()) {
            throw new IllegalArgumentException("ModifierLocal accessed from an unattached node");
        }
        int iA = Z.a(32);
        if (!I0().K1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        i.c cVarH1 = I0().H1();
        F fK = AbstractC2347k.k(this);
        while (fK != null) {
            if ((fK.j0().k().A1() & iA) != 0) {
                while (cVarH1 != null) {
                    if ((cVarH1.F1() & iA) != 0) {
                        ?? G8 = cVarH1;
                        ?? dVar = 0;
                        while (G8 != 0) {
                            if (G8 instanceof h) {
                                h hVar = (h) G8;
                                if (hVar.u0().a(cVar)) {
                                    return hVar.u0().b(cVar);
                                }
                            } else if ((G8.F1() & iA) != 0 && (G8 instanceof AbstractC2348l)) {
                                i.c cVarE2 = ((AbstractC2348l) G8).e2();
                                int i8 = 0;
                                G8 = G8;
                                dVar = dVar;
                                while (cVarE2 != null) {
                                    if ((cVarE2.F1() & iA) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            dVar = dVar;
                                            G8 = cVarE2;
                                        } else {
                                            if (dVar == 0) {
                                                dVar = new d(new i.c[16], 0);
                                            }
                                            if (G8 != 0) {
                                                dVar.d(G8);
                                                G8 = 0;
                                            }
                                            dVar.d(cVarE2);
                                        }
                                    }
                                    cVarE2 = cVarE2.B1();
                                    G8 = G8;
                                    dVar = dVar;
                                }
                                if (i8 == 1) {
                                }
                            }
                            G8 = AbstractC2347k.g(dVar);
                        }
                    }
                    cVarH1 = cVarH1.H1();
                }
            }
            fK = fK.m0();
            cVarH1 = (fK == null || (aVarJ0 = fK.j0()) == null) ? null : aVarJ0.p();
        }
        return cVar.a().invoke();
    }

    default g u0() {
        return b.f21524a;
    }
}
