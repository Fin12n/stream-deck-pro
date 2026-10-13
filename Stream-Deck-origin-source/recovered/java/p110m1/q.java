package p110m1;

import B0.d;
import L0.i;
import androidx.compose.ui.node.a;
import kotlin.jvm.internal.t;
import p056g1.AbstractC2347k;
import p056g1.AbstractC2348l;
import p056g1.F;
import p056g1.Z;
import p056g1.p0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f29565a;

    public q(F f8) {
        this.f29565a = f8;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0077 A[LOOP:0: B:5:0x0019->B:36:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x007c A[EDGE_INSN: B:41:0x007c->B:37:0x007c BREAK  A[LOOP:0: B:5:0x0019->B:36:0x0077], SYNTHETIC] */
    public final o a() {
        a aVarJ0 = this.f29565a.j0();
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
        return new o(((p0) obj).I0(), false, this.f29565a, new k());
    }
}
