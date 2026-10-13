package p168t1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34116b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f34117c = f(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f34118d = f(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f34119e = f(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f34120f = f(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34121a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return z.f34118d;
        }

        public final int b() {
            return z.f34117c;
        }

        public final int c() {
            return z.f34120f;
        }

        public final int d() {
            return z.f34119e;
        }

        public a() {
        }
    }

    public /* synthetic */ z(int i8) {
        this.f34121a = i8;
    }

    public static final /* synthetic */ z e(int i8) {
        return new z(i8);
    }

    public static boolean g(int i8, Object obj) {
        return (obj instanceof z) && i8 == ((z) obj).m();
    }

    public static final boolean h(int i8, int i9) {
        return i8 == i9;
    }

    public static int i(int i8) {
        return Integer.hashCode(i8);
    }

    public static final boolean j(int i8) {
        return h(i8, f34118d) || h(i8, f34120f);
    }

    public static final boolean k(int i8) {
        return h(i8, f34118d) || h(i8, f34119e);
    }

    public static String l(int i8) {
        if (h(i8, f34117c)) {
            return "None";
        }
        if (h(i8, f34118d)) {
            return "All";
        }
        if (h(i8, f34119e)) {
            return "Weight";
        }
        return h(i8, f34120f) ? "Style" : "Invalid";
    }

    public boolean equals(Object obj) {
        return g(this.f34121a, obj);
    }

    public int hashCode() {
        return i(this.f34121a);
    }

    public final /* synthetic */ int m() {
        return this.f34121a;
    }

    public String toString() {
        return l(this.f34121a);
    }

    public static int f(int i8) {
        return i8;
    }
}
