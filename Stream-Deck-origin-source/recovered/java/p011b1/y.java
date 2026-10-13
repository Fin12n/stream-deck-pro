package p011b1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15800a;

    public /* synthetic */ y(long j8) {
        this.f15800a = j8;
    }

    public static final /* synthetic */ y a(long j8) {
        return new y(j8);
    }

    public static boolean c(long j8, Object obj) {
        return (obj instanceof y) && j8 == ((y) obj).g();
    }

    public static final boolean d(long j8, long j9) {
        return j8 == j9;
    }

    public static int e(long j8) {
        return Long.hashCode(j8);
    }

    public static String f(long j8) {
        return "PointerId(value=" + j8 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f15800a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f15800a;
    }

    public int hashCode() {
        return e(this.f15800a);
    }

    public String toString() {
        return f(this.f15800a);
    }

    public static long b(long j8) {
        return j8;
    }
}
