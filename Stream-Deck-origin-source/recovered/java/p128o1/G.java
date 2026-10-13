package p128o1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30758b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f30759c = H.a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30760a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final long a() {
            return G.f30759c;
        }

        public a() {
        }
    }

    public /* synthetic */ G(long j8) {
        this.f30760a = j8;
    }

    public static final /* synthetic */ G b(long j8) {
        return new G(j8);
    }

    public static final boolean d(long j8, long j9) {
        return l(j8) <= l(j9) && k(j9) <= k(j8);
    }

    public static final boolean e(long j8, int i8) {
        return i8 < k(j8) && l(j8) <= i8;
    }

    public static boolean f(long j8, Object obj) {
        return (obj instanceof G) && j8 == ((G) obj).r();
    }

    public static final boolean g(long j8, long j9) {
        return j8 == j9;
    }

    public static final boolean h(long j8) {
        return n(j8) == i(j8);
    }

    public static final int i(long j8) {
        return (int) (j8 & 4294967295L);
    }

    public static final int j(long j8) {
        return k(j8) - l(j8);
    }

    public static final int k(long j8) {
        return n(j8) > i(j8) ? n(j8) : i(j8);
    }

    public static final int l(long j8) {
        return n(j8) > i(j8) ? i(j8) : n(j8);
    }

    public static final boolean m(long j8) {
        return n(j8) > i(j8);
    }

    public static final int n(long j8) {
        return (int) (j8 >> 32);
    }

    public static int o(long j8) {
        return Long.hashCode(j8);
    }

    public static final boolean p(long j8, long j9) {
        return l(j8) < k(j9) && l(j9) < k(j8);
    }

    public static String q(long j8) {
        return "TextRange(" + n(j8) + ", " + i(j8) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f30760a, obj);
    }

    public int hashCode() {
        return o(this.f30760a);
    }

    public final /* synthetic */ long r() {
        return this.f30760a;
    }

    public String toString() {
        return q(this.f30760a);
    }

    public static long c(long j8) {
        return j8;
    }
}
