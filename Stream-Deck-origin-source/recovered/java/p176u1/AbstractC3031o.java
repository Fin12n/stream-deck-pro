package p176u1;

import p128o1.G;
import p128o1.H;

/* JADX INFO: renamed from: u1.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3031o {
    public static final long a(long j8, long j9) {
        int iJ;
        int iL = G.l(j8);
        int iK = G.k(j8);
        if (G.p(j9, j8)) {
            if (G.d(j9, j8)) {
                iL = G.l(j9);
                iK = iL;
            } else {
                if (G.d(j8, j9)) {
                    iJ = G.j(j9);
                } else if (G.e(j9, iL)) {
                    iL = G.l(j9);
                    iJ = G.j(j9);
                } else {
                    iK = G.l(j9);
                }
                iK -= iJ;
            }
        } else if (iK > G.l(j9)) {
            iL -= G.j(j9);
            iJ = G.j(j9);
            iK -= iJ;
        }
        return H.b(iL, iK);
    }
}
