package p128o1;

import W6.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class H {
    public static final long a(int i8) {
        return b(i8, i8);
    }

    public static final long b(int i8, int i9) {
        return G.c(d(i8, i9));
    }

    public static final long c(long j8, int i8, int i9) {
        int iK = n.k(G.n(j8), i8, i9);
        int iK2 = n.k(G.i(j8), i8, i9);
        return (iK == G.n(j8) && iK2 == G.i(j8)) ? j8 : b(iK, iK2);
    }

    public static final long d(int i8, int i9) {
        if (i8 < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i8 + ", end: " + i9 + ']').toString());
        }
        if (i9 >= 0) {
            return (((long) i9) & 4294967295L) | (((long) i8) << 32);
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i8 + ", end: " + i9 + ']').toString());
    }
}
