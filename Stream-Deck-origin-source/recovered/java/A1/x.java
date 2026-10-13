package A1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f466b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f467c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f468d = e(4294967296L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f469e = e(8589934592L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f470a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final long a() {
            return x.f469e;
        }

        public final long b() {
            return x.f468d;
        }

        public final long c() {
            return x.f467c;
        }

        public a() {
        }
    }

    public /* synthetic */ x(long j8) {
        this.f470a = j8;
    }

    public static final /* synthetic */ x d(long j8) {
        return new x(j8);
    }

    public static boolean f(long j8, Object obj) {
        return (obj instanceof x) && j8 == ((x) obj).j();
    }

    public static final boolean g(long j8, long j9) {
        return j8 == j9;
    }

    public static int h(long j8) {
        return Long.hashCode(j8);
    }

    public static String i(long j8) {
        if (g(j8, f467c)) {
            return "Unspecified";
        }
        if (g(j8, f468d)) {
            return "Sp";
        }
        return g(j8, f469e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f470a, obj);
    }

    public int hashCode() {
        return h(this.f470a);
    }

    public final /* synthetic */ long j() {
        return this.f470a;
    }

    public String toString() {
        return i(this.f470a);
    }

    public static long e(long j8) {
        return j8;
    }
}
