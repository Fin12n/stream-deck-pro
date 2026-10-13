package p216z1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f39024b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39025c = h(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39026d = h(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f39027e = h(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f39028f = h(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f39029g = h(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f39030h = h(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39031a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return l.f39027e;
        }

        public final int b() {
            return l.f39028f;
        }

        public final int c() {
            return l.f39029g;
        }

        public final int d() {
            return l.f39025c;
        }

        public final int e() {
            return l.f39026d;
        }

        public final int f() {
            return l.f39030h;
        }

        public a() {
        }
    }

    public /* synthetic */ l(int i8) {
        this.f39031a = i8;
    }

    public static final /* synthetic */ l g(int i8) {
        return new l(i8);
    }

    public static boolean i(int i8, Object obj) {
        return (obj instanceof l) && i8 == ((l) obj).m();
    }

    public static final boolean j(int i8, int i9) {
        return i8 == i9;
    }

    public static int k(int i8) {
        return Integer.hashCode(i8);
    }

    public static String l(int i8) {
        if (j(i8, f39025c)) {
            return "Ltr";
        }
        if (j(i8, f39026d)) {
            return "Rtl";
        }
        if (j(i8, f39027e)) {
            return "Content";
        }
        if (j(i8, f39028f)) {
            return "ContentOrLtr";
        }
        if (j(i8, f39029g)) {
            return "ContentOrRtl";
        }
        return j(i8, f39030h) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return i(this.f39031a, obj);
    }

    public int hashCode() {
        return k(this.f39031a);
    }

    public final /* synthetic */ int m() {
        return this.f39031a;
    }

    public String toString() {
        return l(this.f39031a);
    }

    public static int h(int i8) {
        return i8;
    }
}
