package P0;

import androidx.compose.ui.focus.FocusTargetNode;
import p056g1.AbstractC2347k;
import p056g1.AbstractC2348l;
import p056g1.F;
import p056g1.Z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8845a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.f8855c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8845a = iArr;
        }
    }

    public static final l a(c cVar) {
        int iA = Z.a(1024);
        L0.i.c cVarI0 = cVar.I0();
        B0.d dVar = null;
        while (cVarI0 != null) {
            if (cVarI0 instanceof FocusTargetNode) {
                m mVarK2 = ((FocusTargetNode) cVarI0).k2();
                int i8 = a.f8845a[mVarK2.ordinal()];
                if (i8 == 1 || i8 == 2 || i8 == 3) {
                    return mVarK2;
                }
            } else if ((cVarI0.F1() & iA) != 0 && (cVarI0 instanceof AbstractC2348l)) {
                int i9 = 0;
                for (L0.i.c cVarE2 = ((AbstractC2348l) cVarI0).e2(); cVarE2 != null; cVarE2 = cVarE2.B1()) {
                    if ((cVarE2.F1() & iA) != 0) {
                        i9++;
                        if (i9 == 1) {
                            cVarI0 = cVarE2;
                        } else {
                            if (dVar == null) {
                                dVar = new B0.d(new L0.i.c[16], 0);
                            }
                            if (cVarI0 != null) {
                                dVar.d(cVarI0);
                                cVarI0 = null;
                            }
                            dVar.d(cVarE2);
                        }
                    }
                }
                if (i9 == 1) {
                }
            }
            cVarI0 = AbstractC2347k.g(dVar);
        }
        if (!cVar.I0().K1()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        B0.d dVar2 = new B0.d(new L0.i.c[16], 0);
        L0.i.c cVarB1 = cVar.I0().B1();
        if (cVarB1 == null) {
            AbstractC2347k.c(dVar2, cVar.I0());
        } else {
            dVar2.d(cVarB1);
        }
        while (dVar2.v()) {
            L0.i.c cVarG = (L0.i.c) dVar2.D(dVar2.s() - 1);
            if ((cVarG.A1() & iA) == 0) {
                AbstractC2347k.c(dVar2, cVarG);
            } else {
                while (cVarG != null) {
                    if ((cVarG.F1() & iA) != 0) {
                        B0.d dVar3 = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                m mVarK3 = ((FocusTargetNode) cVarG).k2();
                                int i10 = a.f8845a[mVarK3.ordinal()];
                                if (i10 == 1 || i10 == 2 || i10 == 3) {
                                    return mVarK3;
                                }
                            } else if ((cVarG.F1() & iA) != 0 && (cVarG instanceof AbstractC2348l)) {
                                int i11 = 0;
                                for (L0.i.c cVarE3 = ((AbstractC2348l) cVarG).e2(); cVarE3 != null; cVarE3 = cVarE3.B1()) {
                                    if ((cVarE3.F1() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVarG = cVarE3;
                                        } else {
                                            if (dVar3 == null) {
                                                dVar3 = new B0.d(new L0.i.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                dVar3.d(cVarG);
                                                cVarG = null;
                                            }
                                            dVar3.d(cVarE3);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVarG = AbstractC2347k.g(dVar3);
                        }
                        break;
                    }
                    cVarG = cVarG.B1();
                }
            }
        }
        return m.Inactive;
    }

    public static final void b(c cVar) {
        AbstractC2347k.l(cVar).getFocusOwner().l(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [L0.i$c] */
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
    /* JADX WARN: Type inference failed for: r8v5 */
    public static final void c(FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.a aVarJ0;
        int iA = Z.a(4096);
        int iA2 = Z.a(1024);
        L0.i.c cVarI0 = focusTargetNode.I0();
        int i8 = iA | iA2;
        if (!focusTargetNode.I0().K1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        L0.i.c cVarI1 = focusTargetNode.I0();
        F fK = AbstractC2347k.k(focusTargetNode);
        while (fK != null) {
            if ((fK.j0().k().A1() & i8) != 0) {
                while (cVarI1 != null) {
                    if ((cVarI1.F1() & i8) != 0) {
                        if (cVarI1 != cVarI0 && (cVarI1.F1() & iA2) != 0) {
                            return;
                        }
                        if ((cVarI1.F1() & iA) != 0) {
                            ?? G8 = cVarI1;
                            ?? dVar = 0;
                            while (G8 != 0) {
                                if (G8 instanceof c) {
                                    c cVar = (c) G8;
                                    cVar.J(a(cVar));
                                } else if ((G8.F1() & iA) != 0 && (G8 instanceof AbstractC2348l)) {
                                    L0.i.c cVarE2 = ((AbstractC2348l) G8).e2();
                                    int i9 = 0;
                                    G8 = G8;
                                    dVar = dVar;
                                    while (cVarE2 != null) {
                                        if ((cVarE2.F1() & iA) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                dVar = dVar;
                                                G8 = cVarE2;
                                            } else {
                                                if (dVar == 0) {
                                                    dVar = new B0.d(new L0.i.c[16], 0);
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
                                    if (i9 == 1) {
                                    }
                                }
                                G8 = AbstractC2347k.g(dVar);
                            }
                        }
                    }
                    cVarI1 = cVarI1.H1();
                }
            }
            fK = fK.m0();
            cVarI1 = (fK == null || (aVarJ0 = fK.j0()) == null) ? null : aVarJ0.p();
        }
    }
}
