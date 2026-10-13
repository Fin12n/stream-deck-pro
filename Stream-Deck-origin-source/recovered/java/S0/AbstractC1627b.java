package S0;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: S0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1627b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9606a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f9607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f9608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f9609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f9610e;

    /* JADX INFO: renamed from: S0.b$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final long a() {
            return AbstractC1627b.f9609d;
        }

        public final long b() {
            return AbstractC1627b.f9607b;
        }

        public final long c() {
            return AbstractC1627b.f9608c;
        }

        public a() {
        }
    }

    static {
        long j8 = 3;
        long j9 = j8 << 32;
        f9607b = d((((long) 0) & 4294967295L) | j9);
        f9608c = d((((long) 1) & 4294967295L) | j9);
        f9609d = d(j9 | (((long) 2) & 4294967295L));
        f9610e = d((j8 & 4294967295L) | (((long) 4) << 32));
    }

    public static final boolean e(long j8, long j9) {
        return j8 == j9;
    }

    public static final int f(long j8) {
        return (int) (j8 >> 32);
    }

    public static int g(long j8) {
        return Long.hashCode(j8);
    }

    public static String h(long j8) {
        if (e(j8, f9607b)) {
            return "Rgb";
        }
        if (e(j8, f9608c)) {
            return "Xyz";
        }
        if (e(j8, f9609d)) {
            return "Lab";
        }
        return e(j8, f9610e) ? "Cmyk" : "Unknown";
    }

    public static long d(long j8) {
        return j8;
    }
}
