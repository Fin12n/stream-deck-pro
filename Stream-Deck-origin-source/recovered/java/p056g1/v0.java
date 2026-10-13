package p056g1;

import B0.d;
import L0.b;
import L0.i;
import P2.Lsk.mHPawN;
import Q6.k;
import androidx.compose.ui.node.a;
import kotlin.jvm.internal.t;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [Q6.k] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [L0.i$c] */
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
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void a(u0 u0Var, k kVar) {
        a aVarJ0;
        int iA = Z.a(262144);
        if (!u0Var.I0().K1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        i.c cVarH1 = u0Var.I0().H1();
        F fK = AbstractC2347k.k(u0Var);
        while (fK != null) {
            if ((fK.j0().k().A1() & iA) != 0) {
                while (cVarH1 != null) {
                    if ((cVarH1.F1() & iA) != 0) {
                        ?? G8 = cVarH1;
                        ?? dVar = 0;
                        while (G8 != 0) {
                            boolean zBooleanValue = true;
                            if (G8 instanceof u0) {
                                u0 u0Var2 = (u0) G8;
                                if (t.c(u0Var.C(), u0Var2.C()) && b.a(u0Var, u0Var2)) {
                                    zBooleanValue = ((Boolean) kVar.invoke(u0Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((G8.F1() & iA) != 0) && (G8 instanceof AbstractC2348l)) {
                                    i.c cVarE2 = ((AbstractC2348l) G8).e2();
                                    int i8 = 0;
                                    while (cVarE2 != null) {
                                        if ((cVarE2.F1() & iA) != 0) {
                                            G8 = G8;
                                            dVar = dVar;
                                            i8++;
                                            if (i8 == 1) {
                                                G8 = G8;
                                                dVar = dVar;
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
                                        } else {
                                            G8 = G8;
                                            dVar = dVar;
                                            G8 = G8;
                                            dVar = dVar;
                                        }
                                        cVarE2 = cVarE2.B1();
                                        G8 = G8;
                                        dVar = dVar;
                                    }
                                    if (i8 == 1) {
                                        G8 = G8;
                                        dVar = dVar;
                                    } else {
                                        G8 = G8;
                                        dVar = dVar;
                                    }
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [Q6.k] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void d(u0 u0Var, k kVar) {
        int iA = Z.a(262144);
        if (!u0Var.I0().K1()) {
            throw new IllegalStateException("visitSubtreeIf called on an unattached node");
        }
        d dVar = new d(new i.c[16], 0);
        i.c cVarB1 = u0Var.I0().B1();
        if (cVarB1 == null) {
            AbstractC2347k.c(dVar, u0Var.I0());
        } else {
            dVar.d(cVarB1);
        }
        while (dVar.v()) {
            i.c cVar = (i.c) dVar.D(dVar.s() - 1);
            if ((cVar.A1() & iA) != 0) {
                i.c cVarB2 = cVar;
                while (true) {
                    if (cVarB2 != null) {
                        if ((cVarB2.F1() & iA) != 0) {
                            ?? G8 = cVarB2;
                            ?? dVar2 = 0;
                            while (G8 != 0) {
                                if (G8 instanceof u0) {
                                    u0 u0Var2 = (u0) G8;
                                    t0 t0Var = (t.c(u0Var.C(), u0Var2.C()) && b.a(u0Var, u0Var2)) ? (t0) kVar.invoke(u0Var2) : t0.ContinueTraversal;
                                    if (t0Var != t0.CancelTraversal) {
                                        if (t0Var == t0.SkipSubtreeAndContinueTraversal) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((G8.F1() & iA) != 0 && (G8 instanceof AbstractC2348l)) {
                                    i.c cVarE2 = ((AbstractC2348l) G8).e2();
                                    int i8 = 0;
                                    while (cVarE2 != null) {
                                        if ((cVarE2.F1() & iA) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                G8 = G8;
                                                dVar2 = dVar2;
                                                dVar2 = dVar2;
                                                G8 = cVarE2;
                                            } else {
                                                if (dVar2 == 0) {
                                                    dVar2 = new d(new i.c[16], 0);
                                                }
                                                if (G8 != 0) {
                                                    dVar2.d(G8);
                                                    G8 = 0;
                                                }
                                                dVar2.d(cVarE2);
                                            }
                                        } else {
                                            G8 = G8;
                                            dVar2 = dVar2;
                                        }
                                        cVarE2 = cVarE2.B1();
                                        G8 = G8;
                                        dVar2 = dVar2;
                                    }
                                    if (i8 == 1) {
                                        G8 = G8;
                                        dVar2 = dVar2;
                                    } else {
                                        G8 = G8;
                                        dVar2 = dVar2;
                                    }
                                }
                                G8 = AbstractC2347k.g(dVar2);
                            }
                        }
                        cVarB2 = cVarB2.B1();
                    }
                }
            }
            AbstractC2347k.c(dVar, cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [Q6.k] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v7, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r3v8, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r3v9, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void b(u0 u0Var, k kVar) {
        int iA = Z.a(262144);
        if (!u0Var.I0().K1()) {
            throw new IllegalStateException(mHPawN.kDuiDriqNJukRe);
        }
        d dVar = new d(new i.c[16], 0);
        i.c cVarB1 = u0Var.I0().B1();
        if (cVarB1 == null) {
            AbstractC2347k.c(dVar, u0Var.I0());
        } else {
            dVar.d(cVarB1);
        }
        while (dVar.v()) {
            ?? G8 = (i.c) dVar.D(dVar.s() - 1);
            if ((G8.A1() & iA) == 0) {
                AbstractC2347k.c(dVar, G8);
            } else {
                while (G8 != 0) {
                    if ((G8.F1() & iA) != 0) {
                        ?? dVar2 = 0;
                        while (G8 != 0) {
                            if (G8 instanceof u0) {
                                u0 u0Var2 = (u0) G8;
                                if (!((t.c(u0Var.C(), u0Var2.C()) && b.a(u0Var, u0Var2)) ? ((Boolean) kVar.invoke(u0Var2)).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((G8.F1() & iA) != 0) && (G8 instanceof AbstractC2348l)) {
                                    i.c cVarE2 = ((AbstractC2348l) G8).e2();
                                    int i8 = 0;
                                    while (cVarE2 != null) {
                                        if ((cVarE2.F1() & iA) != 0) {
                                            G8 = G8;
                                            dVar2 = dVar2;
                                            i8++;
                                            if (i8 == 1) {
                                                G8 = G8;
                                                dVar2 = dVar2;
                                                dVar2 = dVar2;
                                                G8 = cVarE2;
                                            } else {
                                                if (dVar2 == 0) {
                                                    dVar2 = new d(new i.c[16], 0);
                                                }
                                                if (G8 != 0) {
                                                    dVar2.d(G8);
                                                    G8 = 0;
                                                }
                                                dVar2.d(cVarE2);
                                            }
                                        } else {
                                            G8 = G8;
                                            dVar2 = dVar2;
                                            G8 = G8;
                                            dVar2 = dVar2;
                                        }
                                        cVarE2 = cVarE2.B1();
                                        G8 = G8;
                                        dVar2 = dVar2;
                                    }
                                    if (i8 == 1) {
                                        G8 = G8;
                                        dVar2 = dVar2;
                                    } else {
                                        G8 = G8;
                                        dVar2 = dVar2;
                                    }
                                }
                            }
                            G8 = AbstractC2347k.g(dVar2);
                        }
                        break;
                    }
                    G8 = G8.B1();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [Q6.k] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public static final void c(InterfaceC2346j interfaceC2346j, Object obj, k kVar) {
        int iA = Z.a(262144);
        if (!interfaceC2346j.I0().K1()) {
            throw new IllegalStateException(hJroAgFztiMK.lQItNKZybz);
        }
        d dVar = new d(new i.c[16], 0);
        i.c cVarB1 = interfaceC2346j.I0().B1();
        if (cVarB1 == null) {
            AbstractC2347k.c(dVar, interfaceC2346j.I0());
        } else {
            dVar.d(cVarB1);
        }
        while (dVar.v()) {
            i.c cVar = (i.c) dVar.D(dVar.s() - 1);
            if ((cVar.A1() & iA) != 0) {
                i.c cVarB2 = cVar;
                while (true) {
                    if (cVarB2 != null) {
                        if ((cVarB2.F1() & iA) != 0) {
                            ?? G8 = cVarB2;
                            ?? dVar2 = 0;
                            while (G8 != 0) {
                                if (G8 instanceof u0) {
                                    u0 u0Var = (u0) G8;
                                    t0 t0Var = t.c(obj, u0Var.C()) ? (t0) kVar.invoke(u0Var) : t0.ContinueTraversal;
                                    if (t0Var != t0.CancelTraversal) {
                                        if (t0Var == t0.SkipSubtreeAndContinueTraversal) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((G8.F1() & iA) != 0 && (G8 instanceof AbstractC2348l)) {
                                    i.c cVarE2 = ((AbstractC2348l) G8).e2();
                                    int i8 = 0;
                                    while (cVarE2 != null) {
                                        if ((cVarE2.F1() & iA) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                G8 = G8;
                                                dVar2 = dVar2;
                                                dVar2 = dVar2;
                                                G8 = cVarE2;
                                            } else {
                                                if (dVar2 == 0) {
                                                    dVar2 = new d(new i.c[16], 0);
                                                }
                                                if (G8 != 0) {
                                                    dVar2.d(G8);
                                                    G8 = 0;
                                                }
                                                dVar2.d(cVarE2);
                                            }
                                        } else {
                                            G8 = G8;
                                            dVar2 = dVar2;
                                        }
                                        cVarE2 = cVarE2.B1();
                                        G8 = G8;
                                        dVar2 = dVar2;
                                    }
                                    if (i8 == 1) {
                                        G8 = G8;
                                        dVar2 = dVar2;
                                    } else {
                                        G8 = G8;
                                        dVar2 = dVar2;
                                    }
                                }
                                G8 = AbstractC2347k.g(dVar2);
                            }
                        }
                        cVarB2 = cVarB2.B1();
                    }
                }
            }
            AbstractC2347k.c(dVar, cVar);
        }
    }
}
