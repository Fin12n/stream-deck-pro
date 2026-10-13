package p110m1;

import B0.d;
import L0.i;
import Q6.k;
import androidx.compose.ui.node.a;
import kotlin.jvm.internal.t;
import p056g1.AbstractC2347k;
import p056g1.AbstractC2348l;
import p056g1.F;
import p056g1.Z;
import p056g1.p0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[LOOP:0: B:5:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x007a A[EDGE_INSN: B:41:0x007a->B:37:0x007a BREAK  A[LOOP:0: B:5:0x0016->B:36:0x0075], SYNTHETIC] */
    public static final o a(F f8, boolean z8) {
        a aVarJ0 = f8.j0();
        int iA = Z.a(8);
        Object obj = null;
        if ((aVarJ0.i() & iA) != 0) {
            loop0: for (i.c cVarK = aVarJ0.k(); cVarK != null; cVarK = cVarK.B1()) {
                if ((cVarK.F1() & iA) == 0) {
                    if ((cVarK.A1() & iA) != 0) {
                        break;
                        break;
                    }
                } else {
                    i.c cVarG = cVarK;
                    d dVar = null;
                    while (cVarG != null) {
                        if (cVarG instanceof p0) {
                            obj = cVarG;
                            break loop0;
                        }
                        if ((cVarG.F1() & iA) != 0 && (cVarG instanceof AbstractC2348l)) {
                            int i8 = 0;
                            for (i.c cVarE2 = ((AbstractC2348l) cVarG).e2(); cVarE2 != null; cVarE2 = cVarE2.B1()) {
                                if ((cVarE2.F1() & iA) != 0) {
                                    i8++;
                                    if (i8 == 1) {
                                        cVarG = cVarE2;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new d(new i.c[16], 0);
                                        }
                                        if (cVarG != null) {
                                            dVar.d(cVarG);
                                            cVarG = null;
                                        }
                                        dVar.d(cVarE2);
                                    }
                                }
                            }
                            if (i8 == 1) {
                            }
                        }
                        cVarG = AbstractC2347k.g(dVar);
                    }
                    if ((cVarK.A1() & iA) != 0) {
                        break;
                    }
                }
            }
        }
        t.d(obj);
        i.c cVarI0 = ((p0) obj).I0();
        k kVarG = f8.G();
        t.d(kVarG);
        return new o(cVarI0, z8, f8, kVarG);
    }

    public static final int e(o oVar) {
        return oVar.n() + 2000000000;
    }

    public static final F f(F f8, k kVar) {
        for (F fM0 = f8.m0(); fM0 != null; fM0 = fM0.m0()) {
            if (((Boolean) kVar.invoke(fM0)).booleanValue()) {
                return fM0;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007e A[LOOP:0: B:5:0x0016->B:38:0x007e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0083 A[EDGE_INSN: B:43:0x0083->B:39:0x0083 BREAK  A[LOOP:0: B:5:0x0016->B:38:0x007e], SYNTHETIC] */
    public static final p0 g(F f8) {
        a aVarJ0 = f8.j0();
        int iA = Z.a(8);
        Object obj = null;
        if ((aVarJ0.i() & iA) != 0) {
            loop0: for (i.c cVarK = aVarJ0.k(); cVarK != null; cVarK = cVarK.B1()) {
                if ((cVarK.F1() & iA) == 0) {
                    if ((cVarK.A1() & iA) != 0) {
                        break;
                        break;
                    }
                } else {
                    i.c cVarG = cVarK;
                    d dVar = null;
                    while (cVarG != null) {
                        if (cVarG instanceof p0) {
                            if (((p0) cVarG).k1()) {
                                obj = cVarG;
                                break loop0;
                            }
                        } else if ((cVarG.F1() & iA) != 0 && (cVarG instanceof AbstractC2348l)) {
                            int i8 = 0;
                            for (i.c cVarE2 = ((AbstractC2348l) cVarG).e2(); cVarE2 != null; cVarE2 = cVarE2.B1()) {
                                if ((cVarE2.F1() & iA) != 0) {
                                    i8++;
                                    if (i8 == 1) {
                                        cVarG = cVarE2;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new d(new i.c[16], 0);
                                        }
                                        if (cVarG != null) {
                                            dVar.d(cVarG);
                                            cVarG = null;
                                        }
                                        dVar.d(cVarE2);
                                    }
                                }
                            }
                            if (i8 == 1) {
                            }
                        }
                        cVarG = AbstractC2347k.g(dVar);
                    }
                    if ((cVarK.A1() & iA) != 0) {
                        break;
                    }
                }
            }
        }
        return (p0) obj;
    }

    public static final h h(o oVar) {
        return (h) l.a(oVar.v(), r.f29573a.u());
    }

    public static final int i(o oVar) {
        return oVar.n() + 1000000000;
    }
}
