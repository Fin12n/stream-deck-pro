package A1;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2635m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f437b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f439d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f440a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final long a() {
            return j.f439d;
        }

        public a() {
        }
    }

    static {
        float f8 = 0;
        f438c = i.a(h.m(f8), h.m(f8));
        h.a aVar = h.f432b;
        f439d = i.a(aVar.c(), aVar.c());
    }

    public /* synthetic */ j(long j8) {
        this.f440a = j8;
    }

    public static final /* synthetic */ j b(long j8) {
        return new j(j8);
    }

    public static boolean d(long j8, Object obj) {
        return (obj instanceof j) && j8 == ((j) obj).j();
    }

    public static final boolean e(long j8, long j9) {
        return j8 == j9;
    }

    public static final float f(long j8) {
        if (j8 == f439d) {
            throw new IllegalStateException("DpOffset is unspecified");
        }
        C2635m c2635m = C2635m.f28814a;
        return h.m(Float.intBitsToFloat((int) (j8 >> 32)));
    }

    public static final float g(long j8) {
        if (j8 == f439d) {
            throw new IllegalStateException("DpOffset is unspecified");
        }
        C2635m c2635m = C2635m.f28814a;
        return h.m(Float.intBitsToFloat((int) (j8 & 4294967295L)));
    }

    public static int h(long j8) {
        return Long.hashCode(j8);
    }

    public static String i(long j8) {
        if (j8 == f437b.a()) {
            return "DpOffset.Unspecified";
        }
        return '(' + ((Object) h.v(f(j8))) + ", " + ((Object) h.v(g(j8))) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f440a, obj);
    }

    public int hashCode() {
        return h(this.f440a);
    }

    public final /* synthetic */ long j() {
        return this.f440a;
    }

    public String toString() {
        return i(this.f440a);
    }

    public static long c(long j8) {
        return j8;
    }
}
