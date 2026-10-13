package R0;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: R0.y0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1623y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9449b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f9450c = g(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f9451d = g(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f9452e = g(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f9453f = g(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f9454g = g(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9455a;

    /* JADX INFO: renamed from: R0.y0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return C1623y0.f9451d;
        }

        public final int b() {
            return C1623y0.f9450c;
        }

        public final int c() {
            return C1623y0.f9453f;
        }

        public final int d() {
            return C1623y0.f9454g;
        }

        public final int e() {
            return C1623y0.f9452e;
        }

        public a() {
        }
    }

    public /* synthetic */ C1623y0(int i8) {
        this.f9455a = i8;
    }

    public static final /* synthetic */ C1623y0 f(int i8) {
        return new C1623y0(i8);
    }

    public static boolean h(int i8, Object obj) {
        return (obj instanceof C1623y0) && i8 == ((C1623y0) obj).l();
    }

    public static final boolean i(int i8, int i9) {
        return i8 == i9;
    }

    public static int j(int i8) {
        return Integer.hashCode(i8);
    }

    public static String k(int i8) {
        if (i(i8, f9450c)) {
            return "Argb8888";
        }
        if (i(i8, f9451d)) {
            return "Alpha8";
        }
        if (i(i8, f9452e)) {
            return "Rgb565";
        }
        if (i(i8, f9453f)) {
            return "F16";
        }
        return i(i8, f9454g) ? "Gpu" : "Unknown";
    }

    public boolean equals(Object obj) {
        return h(this.f9455a, obj);
    }

    public int hashCode() {
        return j(this.f9455a);
    }

    public final /* synthetic */ int l() {
        return this.f9455a;
    }

    public String toString() {
        return k(this.f9455a);
    }

    public static int g(int i8) {
        return i8;
    }
}
