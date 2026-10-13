package A1;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2635m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f471b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f472c = z.a(0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f473a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final long a() {
            return y.f472c;
        }

        public a() {
        }
    }

    public /* synthetic */ y(long j8) {
        this.f473a = j8;
    }

    public static final /* synthetic */ y b(long j8) {
        return new y(j8);
    }

    public static final long d(long j8, float f8, float f9) {
        return z.a(f8, f9);
    }

    public static /* synthetic */ long e(long j8, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = h(j8);
        }
        if ((i8 & 2) != 0) {
            f9 = i(j8);
        }
        return d(j8, f8, f9);
    }

    public static boolean f(long j8, Object obj) {
        return (obj instanceof y) && j8 == ((y) obj).o();
    }

    public static final boolean g(long j8, long j9) {
        return j8 == j9;
    }

    public static final float h(long j8) {
        C2635m c2635m = C2635m.f28814a;
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    public static final float i(long j8) {
        C2635m c2635m = C2635m.f28814a;
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    public static int j(long j8) {
        return Long.hashCode(j8);
    }

    public static final long k(long j8, long j9) {
        return z.a(h(j8) - h(j9), i(j8) - i(j9));
    }

    public static final long l(long j8, long j9) {
        return z.a(h(j8) + h(j9), i(j8) + i(j9));
    }

    public static final long m(long j8, float f8) {
        return z.a(h(j8) * f8, i(j8) * f8);
    }

    public static String n(long j8) {
        return '(' + h(j8) + ", " + i(j8) + ") px/sec";
    }

    public boolean equals(Object obj) {
        return f(this.f473a, obj);
    }

    public int hashCode() {
        return j(this.f473a);
    }

    public final /* synthetic */ long o() {
        return this.f473a;
    }

    public String toString() {
        return n(this.f473a);
    }

    public static long c(long j8) {
        return j8;
    }
}
