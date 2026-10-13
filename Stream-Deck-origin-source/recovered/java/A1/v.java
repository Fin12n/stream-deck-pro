package A1;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2635m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f462b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x[] f463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f464d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f465a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final long a() {
            return v.f464d;
        }

        public a() {
        }
    }

    static {
        x.a aVar = x.f466b;
        f463c = new x[]{x.d(aVar.c()), x.d(aVar.b()), x.d(aVar.a())};
        f464d = w.i(0L, Float.NaN);
    }

    public /* synthetic */ v(long j8) {
        this.f465a = j8;
    }

    public static final /* synthetic */ v b(long j8) {
        return new v(j8);
    }

    public static boolean d(long j8, Object obj) {
        return (obj instanceof v) && j8 == ((v) obj).k();
    }

    public static final boolean e(long j8, long j9) {
        return j8 == j9;
    }

    public static final long f(long j8) {
        return j8 & 1095216660480L;
    }

    public static final long g(long j8) {
        return f463c[(int) (f(j8) >>> 32)].j();
    }

    public static final float h(long j8) {
        C2635m c2635m = C2635m.f28814a;
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    public static int i(long j8) {
        return Long.hashCode(j8);
    }

    public static String j(long j8) {
        long jG = g(j8);
        x.a aVar = x.f466b;
        if (x.g(jG, aVar.c())) {
            return "Unspecified";
        }
        if (x.g(jG, aVar.b())) {
            return h(j8) + ".sp";
        }
        if (!x.g(jG, aVar.a())) {
            return "Invalid";
        }
        return h(j8) + ".em";
    }

    public boolean equals(Object obj) {
        return d(this.f465a, obj);
    }

    public int hashCode() {
        return i(this.f465a);
    }

    public final /* synthetic */ long k() {
        return this.f465a;
    }

    public String toString() {
        return j(this.f465a);
    }

    public static long c(long j8) {
        return j8;
    }
}
