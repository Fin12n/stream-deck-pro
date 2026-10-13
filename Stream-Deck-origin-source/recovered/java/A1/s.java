package A1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static final long a(int i8, int i9) {
        return r.c((((long) i9) & 4294967295L) | (((long) i8) << 32));
    }

    public static final long b(long j8) {
        return o.a(r.g(j8) / 2, r.f(j8) / 2);
    }

    public static final long c(long j8) {
        return Q0.m.a(r.g(j8), r.f(j8));
    }
}
