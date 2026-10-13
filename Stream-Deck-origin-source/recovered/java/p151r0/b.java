package p151r0;

import A1.c;
import W6.n;
import p143q0.F;
import p216z1.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final long a(long j8, boolean z8, int i8, float f8) {
        return c.b(0, c(j8, z8, i8, f8), 0, A1.b.m(j8), 5, null);
    }

    public static final int b(boolean z8, int i8, int i9) {
        if (z8 || !t.e(i8, t.f39054a.b())) {
            return n.d(i9, 1);
        }
        return 1;
    }

    public static final int c(long j8, boolean z8, int i8, float f8) {
        int iN = ((z8 || t.e(i8, t.f39054a.b())) && A1.b.j(j8)) ? A1.b.n(j8) : Integer.MAX_VALUE;
        return A1.b.p(j8) == iN ? iN : n.k(F.a(f8), A1.b.p(j8), iN);
    }

    public static final long d(A1.b.a aVar, int i8, int i9) {
        int iMin;
        int iMin2 = Math.min(i8, 262142);
        if (iMin2 < 8191) {
            iMin = Math.min(i9, 262142);
        } else if (iMin2 < 32767) {
            iMin = Math.min(i9, 65534);
        } else {
            iMin = iMin2 < 65535 ? Math.min(i9, 32766) : Math.min(i9, 8190);
        }
        return aVar.c(iMin2, iMin);
    }
}
