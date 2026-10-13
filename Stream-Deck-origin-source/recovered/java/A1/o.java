package A1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final long a(int i8, int i9) {
        return n.e((((long) i9) & 4294967295L) | (((long) i8) << 32));
    }

    public static final long b(long j8, long j9) {
        return Q0.g.a(Q0.f.o(j8) - n.j(j9), Q0.f.p(j8) - n.k(j9));
    }

    public static final long c(long j8, long j9) {
        return Q0.g.a(Q0.f.o(j8) + n.j(j9), Q0.f.p(j8) + n.k(j9));
    }
}
