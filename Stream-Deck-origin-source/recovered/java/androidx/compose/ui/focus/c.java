package androidx.compose.ui.focus;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14597b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f14598c = j(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f14599d = j(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f14600e = j(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f14601f = j(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f14602g = j(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f14603h = j(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f14604i = j(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f14605j = j(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14606a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return c.f14603h;
        }

        public final int b() {
            return c.f14604i;
        }

        public final int c() {
            return c.f14605j;
        }

        public final int d() {
            return c.f14600e;
        }

        public final int e() {
            return c.f14598c;
        }

        public final int f() {
            return c.f14599d;
        }

        public final int g() {
            return c.f14601f;
        }

        public final int h() {
            return c.f14602g;
        }

        public a() {
        }
    }

    public /* synthetic */ c(int i8) {
        this.f14606a = i8;
    }

    public static final /* synthetic */ c i(int i8) {
        return new c(i8);
    }

    public static boolean k(int i8, Object obj) {
        return (obj instanceof c) && i8 == ((c) obj).o();
    }

    public static final boolean l(int i8, int i9) {
        return i8 == i9;
    }

    public static int m(int i8) {
        return Integer.hashCode(i8);
    }

    public static String n(int i8) {
        if (l(i8, f14598c)) {
            return "Next";
        }
        if (l(i8, f14599d)) {
            return "Previous";
        }
        if (l(i8, f14600e)) {
            return "Left";
        }
        if (l(i8, f14601f)) {
            return "Right";
        }
        if (l(i8, f14602g)) {
            return "Up";
        }
        if (l(i8, f14603h)) {
            return "Down";
        }
        if (l(i8, f14604i)) {
            return "Enter";
        }
        return l(i8, f14605j) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return k(this.f14606a, obj);
    }

    public int hashCode() {
        return m(this.f14606a);
    }

    public final /* synthetic */ int o() {
        return this.f14606a;
    }

    public String toString() {
        return n(this.f14606a);
    }

    public static int j(int i8) {
        return i8;
    }
}
