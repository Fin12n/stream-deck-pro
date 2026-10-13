package p038e1;

import kotlin.jvm.internal.t;
import p056g1.F;
import p056g1.P;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class D {
    public static final P a(P p8) {
        F fH1 = p8.h1();
        while (true) {
            F fM0 = fH1.m0();
            if ((fM0 != null ? fM0.Z() : null) == null) {
                P pE2 = fH1.k0().e2();
                t.d(pE2);
                return pE2;
            }
            F fM1 = fH1.m0();
            F fZ = fM1 != null ? fM1.Z() : null;
            t.d(fZ);
            if (fZ.M0()) {
                fH1 = fH1.m0();
                t.d(fH1);
            } else {
                F fM2 = fH1.m0();
                t.d(fM2);
                fH1 = fM2.Z();
                t.d(fH1);
            }
        }
    }
}
