package p216z1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f38993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f38994d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f38995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38996b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0855a f38997a = new C0855a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final float f38998b = c(0.0f);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final float f38999c = c(0.5f);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final float f39000d = c(-1.0f);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final float f39001e = c(1.0f);

        /* JADX INFO: renamed from: z1.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0855a {
            public /* synthetic */ C0855a(AbstractC2633k abstractC2633k) {
                this();
            }

            public final float a() {
                return a.f38999c;
            }

            public final float b() {
                return a.f39000d;
            }

            public C0855a() {
            }
        }

        public static float c(float f8) {
            if ((0.0f > f8 || f8 > 1.0f) && f8 != -1.0f) {
                throw new IllegalStateException("topRatio should be in [0..1] range or -1");
            }
            return f8;
        }

        public static final boolean d(float f8, float f9) {
            return Float.compare(f8, f9) == 0;
        }

        public static int e(float f8) {
            return Float.hashCode(f8);
        }

        public static String f(float f8) {
            if (f8 == f38998b) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f8 == f38999c) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f8 == f39000d) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f8 == f39001e) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f8 + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final h a() {
            return h.f38994d;
        }

        public b() {
        }
    }

    static {
        AbstractC2633k abstractC2633k = null;
        f38993c = new b(abstractC2633k);
        f38994d = new h(a.f38997a.b(), c.f39002a.a(), abstractC2633k);
    }

    public /* synthetic */ h(float f8, int i8, AbstractC2633k abstractC2633k) {
        this(f8, i8);
    }

    public final float b() {
        return this.f38995a;
    }

    public final int c() {
        return this.f38996b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return a.d(this.f38995a, hVar.f38995a) && c.d(this.f38996b, hVar.f38996b);
    }

    public int hashCode() {
        return (a.e(this.f38995a) * 31) + c.e(this.f38996b);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) a.f(this.f38995a)) + ", trim=" + ((Object) c.h(this.f38996b)) + ')';
    }

    public h(float f8, int i8) {
        this.f38995a = f8;
        this.f38996b = i8;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f39002a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f39003b = c(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f39004c = c(16);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f39005d = c(17);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f39006e = c(0);

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a {
            public /* synthetic */ a(AbstractC2633k abstractC2633k) {
                this();
            }

            public final int a() {
                return c.f39005d;
            }

            public final int b() {
                return c.f39006e;
            }

            public a() {
            }
        }

        public static final boolean d(int i8, int i9) {
            return i8 == i9;
        }

        public static int e(int i8) {
            return Integer.hashCode(i8);
        }

        public static final boolean f(int i8) {
            return (i8 & 1) > 0;
        }

        public static final boolean g(int i8) {
            return (i8 & 16) > 0;
        }

        public static String h(int i8) {
            if (i8 == f39003b) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if (i8 == f39004c) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            if (i8 == f39005d) {
                return "LineHeightStyle.Trim.Both";
            }
            return i8 == f39006e ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public static int c(int i8) {
            return i8;
        }
    }
}
