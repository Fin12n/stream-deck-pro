package p110m1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f29507b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f29508c = i(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f29509d = i(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f29510e = i(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f29511f = i(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f29512g = i(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f29513h = i(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f29514i = i(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29515a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return h.f29508c;
        }

        public final int b() {
            return h.f29509d;
        }

        public final int c() {
            return h.f29514i;
        }

        public final int d() {
            return h.f29513h;
        }

        public final int e() {
            return h.f29511f;
        }

        public final int f() {
            return h.f29510e;
        }

        public final int g() {
            return h.f29512g;
        }

        public a() {
        }
    }

    public /* synthetic */ h(int i8) {
        this.f29515a = i8;
    }

    public static final /* synthetic */ h h(int i8) {
        return new h(i8);
    }

    public static boolean j(int i8, Object obj) {
        return (obj instanceof h) && i8 == ((h) obj).n();
    }

    public static final boolean k(int i8, int i9) {
        return i8 == i9;
    }

    public static int l(int i8) {
        return Integer.hashCode(i8);
    }

    public static String m(int i8) {
        if (k(i8, f29508c)) {
            return "Button";
        }
        if (k(i8, f29509d)) {
            return "Checkbox";
        }
        if (k(i8, f29510e)) {
            return "Switch";
        }
        if (k(i8, f29511f)) {
            return "RadioButton";
        }
        if (k(i8, f29512g)) {
            return "Tab";
        }
        if (k(i8, f29513h)) {
            return "Image";
        }
        return k(i8, f29514i) ? "DropdownList" : "Unknown";
    }

    public boolean equals(Object obj) {
        return j(this.f29515a, obj);
    }

    public int hashCode() {
        return l(this.f29515a);
    }

    public final /* synthetic */ int n() {
        return this.f29515a;
    }

    public String toString() {
        return m(this.f29515a);
    }

    public static int i(int i8) {
        return i8;
    }
}
