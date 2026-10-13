package A1;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2635m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f441b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f443d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f444a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final long a() {
            return k.f443d;
        }

        public final long b() {
            return k.f442c;
        }

        public a() {
        }
    }

    static {
        float f8 = 0;
        f442c = i.b(h.m(f8), h.m(f8));
        h.a aVar = h.f432b;
        f443d = i.b(aVar.c(), aVar.c());
    }

    public /* synthetic */ k(long j8) {
        this.f444a = j8;
    }

    public static final /* synthetic */ k c(long j8) {
        return new k(j8);
    }

    public static boolean e(long j8, Object obj) {
        return (obj instanceof k) && j8 == ((k) obj).k();
    }

    public static final boolean f(long j8, long j9) {
        return j8 == j9;
    }

    public static final float g(long j8) {
        if (j8 == f443d) {
            throw new IllegalStateException("DpSize is unspecified");
        }
        C2635m c2635m = C2635m.f28814a;
        return h.m(Float.intBitsToFloat((int) (j8 & 4294967295L)));
    }

    public static final float h(long j8) {
        if (j8 == f443d) {
            throw new IllegalStateException("DpSize is unspecified");
        }
        C2635m c2635m = C2635m.f28814a;
        return h.m(Float.intBitsToFloat((int) (j8 >> 32)));
    }

    public static int i(long j8) {
        return Long.hashCode(j8);
    }

    public static String j(long j8) {
        if (j8 == f441b.a()) {
            return "DpSize.Unspecified";
        }
        return ((Object) h.v(h(j8))) + " x " + ((Object) h.v(g(j8)));
    }

    public boolean equals(Object obj) {
        return e(this.f444a, obj);
    }

    public int hashCode() {
        return i(this.f444a);
    }

    public final /* synthetic */ long k() {
        return this.f444a;
    }

    public String toString() {
        return j(this.f444a);
    }

    public static long d(long j8) {
        return j8;
    }
}
