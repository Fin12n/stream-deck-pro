package p100l0;

/* JADX INFO: renamed from: l0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2641b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28966a;

    public /* synthetic */ C2641b(long j8) {
        this.f28966a = j8;
    }

    public static final /* synthetic */ C2641b a(long j8) {
        return new C2641b(j8);
    }

    public static boolean c(long j8, Object obj) {
        return (obj instanceof C2641b) && j8 == ((C2641b) obj).g();
    }

    public static final int d(long j8) {
        return (int) j8;
    }

    public static int e(long j8) {
        return Long.hashCode(j8);
    }

    public static String f(long j8) {
        return "GridItemSpan(packedValue=" + j8 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f28966a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f28966a;
    }

    public int hashCode() {
        return e(this.f28966a);
    }

    public String toString() {
        return f(this.f28966a);
    }

    public static long b(long j8) {
        return j8;
    }
}
