package p082j0;

import A1.b;
import A1.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class H {
    public static long a(int i8, int i9, int i10, int i11) {
        return b(c.a(i8, i9, i10, i11));
    }

    public static long c(long j8, C c8) {
        C c9 = C.Horizontal;
        return a(c8 == c9 ? b.p(j8) : b.o(j8), c8 == c9 ? b.n(j8) : b.m(j8), c8 == c9 ? b.o(j8) : b.p(j8), c8 == c9 ? b.m(j8) : b.n(j8));
    }

    public static final long d(long j8, int i8, int i9, int i10, int i11) {
        return a(i8, i9, i10, i11);
    }

    public static /* synthetic */ long e(long j8, int i8, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i8 = b.p(j8);
        }
        int i13 = i8;
        if ((i12 & 2) != 0) {
            i9 = b.n(j8);
        }
        int i14 = i9;
        if ((i12 & 4) != 0) {
            i10 = b.o(j8);
        }
        int i15 = i10;
        if ((i12 & 8) != 0) {
            i11 = b.m(j8);
        }
        return d(j8, i13, i14, i15, i11);
    }

    public static final long f(long j8, C c8) {
        return c8 == C.Horizontal ? c.a(b.p(j8), b.n(j8), b.o(j8), b.m(j8)) : c.a(b.o(j8), b.m(j8), b.p(j8), b.n(j8));
    }

    public static long b(long j8) {
        return j8;
    }
}
