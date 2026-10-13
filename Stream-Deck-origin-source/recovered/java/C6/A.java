package C6;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class A implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1408b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1409a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ A(long j8) {
        this.f1409a = j8;
    }

    public static final /* synthetic */ A a(long j8) {
        return new A(j8);
    }

    public static boolean c(long j8, Object obj) {
        return (obj instanceof A) && j8 == ((A) obj).m();
    }

    public static final boolean d(long j8, long j9) {
        return j8 == j9;
    }

    public static int e(long j8) {
        return Long.hashCode(j8);
    }

    public static String j(long j8) {
        return I.d(j8, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return I.b(m(), ((A) obj).m());
    }

    public boolean equals(Object obj) {
        return c(this.f1409a, obj);
    }

    public int hashCode() {
        return e(this.f1409a);
    }

    public final /* synthetic */ long m() {
        return this.f1409a;
    }

    public String toString() {
        return j(this.f1409a);
    }

    public static long b(long j8) {
        return j8;
    }
}
