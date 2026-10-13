package p176u1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: u1.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3035t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34463b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f34464c = j(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f34465d = j(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f34466e = j(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f34467f = j(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f34468g = j(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f34469h = j(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f34470i = j(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f34471j = j(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34472a;

    /* JADX INFO: renamed from: u1.t$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return C3035t.f34464c;
        }

        public final int b() {
            return C3035t.f34471j;
        }

        public final int c() {
            return C3035t.f34466e;
        }

        public final int d() {
            return C3035t.f34470i;
        }

        public final int e() {
            return C3035t.f34465d;
        }

        public final int f() {
            return C3035t.f34469h;
        }

        public final int g() {
            return C3035t.f34467f;
        }

        public final int h() {
            return C3035t.f34468g;
        }

        public a() {
        }
    }

    public /* synthetic */ C3035t(int i8) {
        this.f34472a = i8;
    }

    public static final /* synthetic */ C3035t i(int i8) {
        return new C3035t(i8);
    }

    public static boolean k(int i8, Object obj) {
        return (obj instanceof C3035t) && i8 == ((C3035t) obj).o();
    }

    public static final boolean l(int i8, int i9) {
        return i8 == i9;
    }

    public static int m(int i8) {
        return Integer.hashCode(i8);
    }

    public static String n(int i8) {
        if (l(i8, f34465d)) {
            return "None";
        }
        if (l(i8, f34464c)) {
            return "Default";
        }
        if (l(i8, f34466e)) {
            return "Go";
        }
        if (l(i8, f34467f)) {
            return "Search";
        }
        if (l(i8, f34468g)) {
            return "Send";
        }
        if (l(i8, f34469h)) {
            return "Previous";
        }
        if (l(i8, f34470i)) {
            return "Next";
        }
        return l(i8, f34471j) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return k(this.f34472a, obj);
    }

    public int hashCode() {
        return m(this.f34472a);
    }

    public final /* synthetic */ int o() {
        return this.f34472a;
    }

    public String toString() {
        return n(this.f34472a);
    }

    public static int j(int i8) {
        return i8;
    }
}
