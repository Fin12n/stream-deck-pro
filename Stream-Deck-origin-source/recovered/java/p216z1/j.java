package p216z1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f39010b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39011c = i(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39012d = i(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f39013e = i(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f39014f = i(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f39015g = i(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f39016h = i(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f39017i = i(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39018a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return j.f39013e;
        }

        public final int b() {
            return j.f39016h;
        }

        public final int c() {
            return j.f39014f;
        }

        public final int d() {
            return j.f39011c;
        }

        public final int e() {
            return j.f39012d;
        }

        public final int f() {
            return j.f39015g;
        }

        public final int g() {
            return j.f39017i;
        }

        public a() {
        }
    }

    public /* synthetic */ j(int i8) {
        this.f39018a = i8;
    }

    public static final /* synthetic */ j h(int i8) {
        return new j(i8);
    }

    public static boolean j(int i8, Object obj) {
        return (obj instanceof j) && i8 == ((j) obj).n();
    }

    public static final boolean k(int i8, int i9) {
        return i8 == i9;
    }

    public static int l(int i8) {
        return Integer.hashCode(i8);
    }

    public static String m(int i8) {
        if (k(i8, f39011c)) {
            return "Left";
        }
        if (k(i8, f39012d)) {
            return "Right";
        }
        if (k(i8, f39013e)) {
            return "Center";
        }
        if (k(i8, f39014f)) {
            return "Justify";
        }
        if (k(i8, f39015g)) {
            return "Start";
        }
        if (k(i8, f39016h)) {
            return "End";
        }
        return k(i8, f39017i) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return j(this.f39018a, obj);
    }

    public int hashCode() {
        return l(this.f39018a);
    }

    public final /* synthetic */ int n() {
        return this.f39018a;
    }

    public String toString() {
        return m(this.f39018a);
    }

    public static int i(int i8) {
        return i8;
    }
}
