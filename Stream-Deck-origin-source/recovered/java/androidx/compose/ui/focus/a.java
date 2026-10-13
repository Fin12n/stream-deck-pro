package androidx.compose.ui.focus;

import kotlin.jvm.internal.t;
import p038e1.InterfaceC2232c;
import p056g1.AbstractC2347k;
import p056g1.AbstractC2348l;
import p056g1.F;
import p056g1.Z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Object a(FocusTargetNode focusTargetNode, int i8, Q6.k kVar) {
        L0.i.c cVarG;
        InterfaceC2232c interfaceC2232cJ2;
        int iC;
        androidx.compose.ui.node.a aVarJ0;
        int iA = Z.a(1024);
        if (!focusTargetNode.I0().K1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        L0.i.c cVarH1 = focusTargetNode.I0().H1();
        F fK = AbstractC2347k.k(focusTargetNode);
        loop0: while (true) {
            if (fK == null) {
                cVarG = null;
                break;
            }
            if ((fK.j0().k().A1() & iA) != 0) {
                while (cVarH1 != null) {
                    if ((cVarH1.F1() & iA) != 0) {
                        cVarG = cVarH1;
                        B0.d dVar = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((cVarG.F1() & iA) != 0 && (cVarG instanceof AbstractC2348l)) {
                                int i9 = 0;
                                for (L0.i.c cVarE2 = ((AbstractC2348l) cVarG).e2(); cVarE2 != null; cVarE2 = cVarE2.B1()) {
                                    if ((cVarE2.F1() & iA) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            cVarG = cVarE2;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new B0.d(new L0.i.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                dVar.d(cVarG);
                                                cVarG = null;
                                            }
                                            dVar.d(cVarE2);
                                        }
                                    }
                                }
                                if (i9 == 1) {
                                }
                            }
                            cVarG = AbstractC2347k.g(dVar);
                        }
                    }
                    cVarH1 = cVarH1.H1();
                }
            }
            fK = fK.m0();
            cVarH1 = (fK == null || (aVarJ0 = fK.j0()) == null) ? null : aVarJ0.p();
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarG;
        if ((focusTargetNode2 != null && t.c(focusTargetNode2.j2(), focusTargetNode.j2())) || (interfaceC2232cJ2 = focusTargetNode.j2()) == null) {
            return null;
        }
        c.a aVar = c.f14597b;
        if (c.l(i8, aVar.h())) {
            iC = InterfaceC2232c.b.f20452a.a();
        } else if (c.l(i8, aVar.a())) {
            iC = InterfaceC2232c.b.f20452a.d();
        } else if (c.l(i8, aVar.d())) {
            iC = InterfaceC2232c.b.f20452a.e();
        } else if (c.l(i8, aVar.g())) {
            iC = InterfaceC2232c.b.f20452a.f();
        } else if (c.l(i8, aVar.e())) {
            iC = InterfaceC2232c.b.f20452a.b();
        } else {
            if (!c.l(i8, aVar.f())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            iC = InterfaceC2232c.b.f20452a.c();
        }
        return interfaceC2232cJ2.k(iC, kVar);
    }
}
