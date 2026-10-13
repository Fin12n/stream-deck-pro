package androidx.compose.ui.focus;

import kotlin.jvm.internal.u;
import p056g1.AbstractC2347k;
import p056g1.AbstractC2348l;
import p056g1.Z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f14627a = new a();

        public a() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(j.j(focusTargetNode));
        }
    }

    public static final boolean a(P0.j jVar) {
        int iA = Z.a(1024);
        L0.i.c cVarI0 = jVar.I0();
        B0.d dVar = null;
        while (cVarI0 != null) {
            if (cVarI0 instanceof FocusTargetNode) {
                FocusTargetNode focusTargetNode = (FocusTargetNode) cVarI0;
                return focusTargetNode.i2().e() ? j.j(focusTargetNode) : m.k(focusTargetNode, c.f14597b.b(), a.f14627a);
            }
            if ((cVarI0.F1() & iA) != 0 && (cVarI0 instanceof AbstractC2348l)) {
                int i8 = 0;
                for (L0.i.c cVarE2 = ((AbstractC2348l) cVarI0).e2(); cVarE2 != null; cVarE2 = cVarE2.B1()) {
                    if ((cVarE2.F1() & iA) != 0) {
                        i8++;
                        if (i8 == 1) {
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
                if (i8 == 1) {
                }
            }
            cVarI0 = AbstractC2347k.g(dVar);
        }
        if (!jVar.I0().K1()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        B0.d dVar2 = new B0.d(new L0.i.c[16], 0);
        L0.i.c cVarB1 = jVar.I0().B1();
        if (cVarB1 == null) {
            AbstractC2347k.c(dVar2, jVar.I0());
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
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarG;
                                return focusTargetNode2.i2().e() ? j.j(focusTargetNode2) : m.k(focusTargetNode2, c.f14597b.b(), a.f14627a);
                            }
                            if ((cVarG.F1() & iA) != 0 && (cVarG instanceof AbstractC2348l)) {
                                int i9 = 0;
                                for (L0.i.c cVarE3 = ((AbstractC2348l) cVarG).e2(); cVarE3 != null; cVarE3 = cVarE3.B1()) {
                                    if ((cVarE3.F1() & iA) != 0) {
                                        i9++;
                                        if (i9 == 1) {
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
                                if (i9 == 1) {
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
        return false;
    }
}
