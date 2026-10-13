package A1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f446b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f447c = o.a(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f448a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final long a() {
            return n.f447c;
        }

        public a() {
        }
    }

    public /* synthetic */ n(long j8) {
        this.f448a = j8;
    }

    public static final /* synthetic */ n b(long j8) {
        return new n(j8);
    }

    public static final int c(long j8) {
        return j(j8);
    }

    public static final int d(long j8) {
        return k(j8);
    }

    public static final long f(long j8, int i8, int i9) {
        return o.a(i8, i9);
    }

    public static /* synthetic */ long g(long j8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = j(j8);
        }
        if ((i10 & 2) != 0) {
            i9 = k(j8);
        }
        return f(j8, i8, i9);
    }

    public static boolean h(long j8, Object obj) {
        return (obj instanceof n) && j8 == ((n) obj).n();
    }

    public static final boolean i(long j8, long j9) {
        return j8 == j9;
    }

    public static final int j(long j8) {
        return (int) (j8 >> 32);
    }

    public static final int k(long j8) {
        return (int) (j8 & 4294967295L);
    }

    public static int l(long j8) {
        return Long.hashCode(j8);
    }

    public static String m(long j8) {
        return '(' + j(j8) + ", " + k(j8) + ')';
    }

    public boolean equals(Object obj) {
        return h(this.f448a, obj);
    }

    public int hashCode() {
        return l(this.f448a);
    }

    public final /* synthetic */ long n() {
        return this.f448a;
    }

    public String toString() {
        return m(this.f448a);
    }

    public static long e(long j8) {
        return j8;
    }
}
