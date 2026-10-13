package Q0;

import M6.eLZq.eGwOBWCdOTaKus;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2635m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9103b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f9104c = m.a(0.0f, 0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f9105d = m.a(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9106a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final long a() {
            return l.f9105d;
        }

        public final long b() {
            return l.f9104c;
        }

        public a() {
        }
    }

    public /* synthetic */ l(long j8) {
        this.f9106a = j8;
    }

    public static final /* synthetic */ l c(long j8) {
        return new l(j8);
    }

    public static long d(long j8) {
        return j8;
    }

    public static boolean e(long j8, Object obj) {
        return (obj instanceof l) && j8 == ((l) obj).m();
    }

    public static final boolean f(long j8, long j9) {
        return j8 == j9;
    }

    public static final float g(long j8) {
        if (j8 == f9105d) {
            throw new IllegalStateException("Size is unspecified");
        }
        C2635m c2635m = C2635m.f28814a;
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    public static final float h(long j8) {
        return Math.min(Math.abs(i(j8)), Math.abs(g(j8)));
    }

    public static final float i(long j8) {
        if (j8 == f9105d) {
            throw new IllegalStateException("Size is unspecified");
        }
        C2635m c2635m = C2635m.f28814a;
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    public static int j(long j8) {
        return Long.hashCode(j8);
    }

    public static final boolean k(long j8) {
        return i(j8) <= 0.0f || g(j8) <= 0.0f;
    }

    public boolean equals(Object obj) {
        return e(this.f9106a, obj);
    }

    public int hashCode() {
        return j(this.f9106a);
    }

    public final /* synthetic */ long m() {
        return this.f9106a;
    }

    public String toString() {
        return l(this.f9106a);
    }

    public static String l(long j8) {
        if (j8 == f9103b.a()) {
            return eGwOBWCdOTaKus.zLtLt;
        }
        return "Size(" + c.a(i(j8), 1) + ", " + c.a(g(j8), 1) + ')';
    }
}
