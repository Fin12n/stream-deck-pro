package A1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f455b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f456c = c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f457a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final long a() {
            return r.f456c;
        }

        public a() {
        }
    }

    public /* synthetic */ r(long j8) {
        this.f457a = j8;
    }

    public static final /* synthetic */ r b(long j8) {
        return new r(j8);
    }

    public static boolean d(long j8, Object obj) {
        return (obj instanceof r) && j8 == ((r) obj).j();
    }

    public static final boolean e(long j8, long j9) {
        return j8 == j9;
    }

    public static final int f(long j8) {
        return (int) (j8 & 4294967295L);
    }

    public static final int g(long j8) {
        return (int) (j8 >> 32);
    }

    public static int h(long j8) {
        return Long.hashCode(j8);
    }

    public static String i(long j8) {
        return g(j8) + " x " + f(j8);
    }

    public boolean equals(Object obj) {
        return d(this.f457a, obj);
    }

    public int hashCode() {
        return h(this.f457a);
    }

    public final /* synthetic */ long j() {
        return this.f457a;
    }

    public String toString() {
        return i(this.f457a);
    }

    public static long c(long j8) {
        return j8;
    }
}
