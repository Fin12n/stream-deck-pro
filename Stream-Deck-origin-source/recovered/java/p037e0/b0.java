package p037e0;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {
    public static long a(int i8, int i9) {
        return b(i8 * i9);
    }

    public static /* synthetic */ long c(int i8, int i9, int i10, AbstractC2633k abstractC2633k) {
        if ((i10 & 2) != 0) {
            i9 = c0.f20151a.a();
        }
        return a(i8, i9);
    }

    public static final boolean d(long j8, long j9) {
        return j8 == j9;
    }

    public static int e(long j8) {
        return Long.hashCode(j8);
    }

    public static long b(long j8) {
        return j8;
    }
}
