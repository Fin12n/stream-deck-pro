package Q0;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2635m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9082b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f9083c = g.a(0.0f, 0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f9084d = g.a(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f9085e = g.a(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9086a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final long a() {
            return f.f9084d;
        }

        public final long b() {
            return f.f9085e;
        }

        public final long c() {
            return f.f9083c;
        }

        public a() {
        }
    }

    public /* synthetic */ f(long j8) {
        this.f9086a = j8;
    }

    public static final /* synthetic */ f d(long j8) {
        return new f(j8);
    }

    public static final float e(long j8) {
        return o(j8);
    }

    public static final float f(long j8) {
        return p(j8);
    }

    public static final long h(long j8, float f8, float f9) {
        return g.a(f8, f9);
    }

    public static /* synthetic */ long i(long j8, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = o(j8);
        }
        if ((i8 & 2) != 0) {
            f9 = p(j8);
        }
        return h(j8, f8, f9);
    }

    public static final long j(long j8, float f8) {
        return g.a(o(j8) / f8, p(j8) / f8);
    }

    public static boolean k(long j8, Object obj) {
        return (obj instanceof f) && j8 == ((f) obj).x();
    }

    public static final boolean l(long j8, long j9) {
        return j8 == j9;
    }

    public static final float m(long j8) {
        return (float) Math.sqrt((o(j8) * o(j8)) + (p(j8) * p(j8)));
    }

    public static final float n(long j8) {
        return (o(j8) * o(j8)) + (p(j8) * p(j8));
    }

    public static final float o(long j8) {
        if (j8 == f9085e) {
            throw new IllegalStateException("Offset is unspecified");
        }
        C2635m c2635m = C2635m.f28814a;
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    public static final float p(long j8) {
        if (j8 == f9085e) {
            throw new IllegalStateException("Offset is unspecified");
        }
        C2635m c2635m = C2635m.f28814a;
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    public static int q(long j8) {
        return Long.hashCode(j8);
    }

    public static final boolean r(long j8) {
        if (Float.isNaN(o(j8)) || Float.isNaN(p(j8))) {
            throw new IllegalStateException("Offset argument contained a NaN value.");
        }
        return true;
    }

    public static final long s(long j8, long j9) {
        return g.a(o(j8) - o(j9), p(j8) - p(j9));
    }

    public static final long t(long j8, long j9) {
        return g.a(o(j8) + o(j9), p(j8) + p(j9));
    }

    public static final long u(long j8, float f8) {
        return g.a(o(j8) * f8, p(j8) * f8);
    }

    public static String v(long j8) {
        if (!g.c(j8)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + c.a(o(j8), 1) + ", " + c.a(p(j8), 1) + ')';
    }

    public static final long w(long j8) {
        return g.a(-o(j8), -p(j8));
    }

    public boolean equals(Object obj) {
        return k(this.f9086a, obj);
    }

    public int hashCode() {
        return q(this.f9086a);
    }

    public String toString() {
        return v(this.f9086a);
    }

    public final /* synthetic */ long x() {
        return this.f9086a;
    }

    public static long g(long j8) {
        return j8;
    }
}
