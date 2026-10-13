package p216z1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f38972b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f38973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f38974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f38975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f38976f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38977a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return f.f38973c;
        }

        public final int b() {
            return f.f38976f;
        }

        public a() {
        }
    }

    static {
        b.a aVar = b.f38978a;
        int iC = aVar.c();
        c.a aVar2 = c.f38983a;
        int iC2 = aVar2.c();
        d.a aVar3 = d.f38989a;
        f38973c = d(g.e(iC, iC2, aVar3.a()));
        f38974d = d(g.e(aVar.a(), aVar2.b(), aVar3.b()));
        f38975e = d(g.e(aVar.b(), aVar2.d(), aVar3.a()));
        f38976f = d(0);
    }

    public /* synthetic */ f(int i8) {
        this.f38977a = i8;
    }

    public static final /* synthetic */ f c(int i8) {
        return new f(i8);
    }

    public static boolean e(int i8, Object obj) {
        return (obj instanceof f) && i8 == ((f) obj).l();
    }

    public static final boolean f(int i8, int i9) {
        return i8 == i9;
    }

    public static final int g(int i8) {
        return b.d(g.f(i8));
    }

    public static final int h(int i8) {
        return c.e(g.g(i8));
    }

    public static final int i(int i8) {
        return d.c(g.h(i8));
    }

    public static int j(int i8) {
        return Integer.hashCode(i8);
    }

    public static String k(int i8) {
        return "LineBreak(strategy=" + ((Object) b.f(g(i8))) + ", strictness=" + ((Object) c.g(h(i8))) + ", wordBreak=" + ((Object) d.e(i(i8))) + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f38977a, obj);
    }

    public int hashCode() {
        return j(this.f38977a);
    }

    public final /* synthetic */ int l() {
        return this.f38977a;
    }

    public String toString() {
        return k(this.f38977a);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f38978a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f38979b = d(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f38980c = d(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f38981d = d(3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f38982e = d(0);

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a {
            public /* synthetic */ a(AbstractC2633k abstractC2633k) {
                this();
            }

            public final int a() {
                return b.f38981d;
            }

            public final int b() {
                return b.f38980c;
            }

            public final int c() {
                return b.f38979b;
            }

            public a() {
            }
        }

        public static final boolean e(int i8, int i9) {
            return i8 == i9;
        }

        public static String f(int i8) {
            if (e(i8, f38979b)) {
                return "Strategy.Simple";
            }
            if (e(i8, f38980c)) {
                return "Strategy.HighQuality";
            }
            if (e(i8, f38981d)) {
                return "Strategy.Balanced";
            }
            return e(i8, f38982e) ? "Strategy.Unspecified" : "Invalid";
        }

        public static int d(int i8) {
            return i8;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f38983a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f38984b = e(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f38985c = e(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f38986d = e(3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f38987e = e(4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f38988f = e(0);

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a {
            public /* synthetic */ a(AbstractC2633k abstractC2633k) {
                this();
            }

            public final int a() {
                return c.f38984b;
            }

            public final int b() {
                return c.f38985c;
            }

            public final int c() {
                return c.f38986d;
            }

            public final int d() {
                return c.f38987e;
            }

            public a() {
            }
        }

        public static final boolean f(int i8, int i9) {
            return i8 == i9;
        }

        public static String g(int i8) {
            if (f(i8, f38984b)) {
                return "Strictness.None";
            }
            if (f(i8, f38985c)) {
                return "Strictness.Loose";
            }
            if (f(i8, f38986d)) {
                return "Strictness.Normal";
            }
            if (f(i8, f38987e)) {
                return "Strictness.Strict";
            }
            return f(i8, f38988f) ? "Strictness.Unspecified" : "Invalid";
        }

        public static int e(int i8) {
            return i8;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f38989a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f38990b = c(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f38991c = c(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f38992d = c(0);

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a {
            public /* synthetic */ a(AbstractC2633k abstractC2633k) {
                this();
            }

            public final int a() {
                return d.f38990b;
            }

            public final int b() {
                return d.f38991c;
            }

            public a() {
            }
        }

        public static final boolean d(int i8, int i9) {
            return i8 == i9;
        }

        public static String e(int i8) {
            if (d(i8, f38990b)) {
                return "WordBreak.None";
            }
            if (d(i8, f38991c)) {
                return "WordBreak.Phrase";
            }
            return d(i8, f38992d) ? "WordBreak.Unspecified" : "Invalid";
        }

        public static int c(int i8) {
            return i8;
        }
    }

    public static int d(int i8) {
        return i8;
    }
}
