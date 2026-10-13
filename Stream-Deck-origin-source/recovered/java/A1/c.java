package A1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final long a(int i8, int i9, int i10, int i11) {
        if (i9 < i8) {
            throw new IllegalArgumentException(("maxWidth(" + i9 + ") must be >= than minWidth(" + i8 + ')').toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("maxHeight(" + i11 + ") must be >= than minHeight(" + i10 + ')').toString());
        }
        if (i8 >= 0 && i10 >= 0) {
            return b.f422b.b(i8, i9, i10, i11);
        }
        throw new IllegalArgumentException(("minWidth(" + i8 + ") and minHeight(" + i10 + ") must be >= 0").toString());
    }

    public static /* synthetic */ long b(int i8, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i8 = 0;
        }
        if ((i12 & 2) != 0) {
            i9 = Integer.MAX_VALUE;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return a(i8, i9, i10, i11);
    }

    public static final int c(int i8, int i9) {
        return i8 == Integer.MAX_VALUE ? i8 : W6.n.d(i8 + i9, 0);
    }

    public static final long d(long j8, long j9) {
        return s.a(W6.n.k(r.g(j9), b.p(j8), b.n(j8)), W6.n.k(r.f(j9), b.o(j8), b.m(j8)));
    }

    public static final long e(long j8, long j9) {
        return a(W6.n.k(b.p(j9), b.p(j8), b.n(j8)), W6.n.k(b.n(j9), b.p(j8), b.n(j8)), W6.n.k(b.o(j9), b.o(j8), b.m(j8)), W6.n.k(b.m(j9), b.o(j8), b.m(j8)));
    }

    public static final int f(long j8, int i8) {
        return W6.n.k(i8, b.o(j8), b.m(j8));
    }

    public static final int g(long j8, int i8) {
        return W6.n.k(i8, b.p(j8), b.n(j8));
    }

    public static final boolean h(long j8, long j9) {
        int iP = b.p(j8);
        int iN = b.n(j8);
        int iG = r.g(j9);
        if (iP > iG || iG > iN) {
            return false;
        }
        int iO = b.o(j8);
        int iM = b.m(j8);
        int iF = r.f(j9);
        return iO <= iF && iF <= iM;
    }

    public static final long i(long j8, int i8, int i9) {
        return a(W6.n.d(b.p(j8) + i8, 0), c(b.n(j8), i8), W6.n.d(b.o(j8) + i9, 0), c(b.m(j8), i9));
    }

    public static /* synthetic */ long j(long j8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        return i(j8, i8, i9);
    }
}
