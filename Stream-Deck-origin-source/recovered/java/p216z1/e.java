package p216z1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f38967b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f38968c = e(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f38969d = e(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f38970e = e(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38971a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return e.f38969d;
        }

        public final int b() {
            return e.f38968c;
        }

        public final int c() {
            return e.f38970e;
        }

        public a() {
        }
    }

    public /* synthetic */ e(int i8) {
        this.f38971a = i8;
    }

    public static final /* synthetic */ e d(int i8) {
        return new e(i8);
    }

    public static boolean f(int i8, Object obj) {
        return (obj instanceof e) && i8 == ((e) obj).j();
    }

    public static final boolean g(int i8, int i9) {
        return i8 == i9;
    }

    public static int h(int i8) {
        return Integer.hashCode(i8);
    }

    public static String i(int i8) {
        if (g(i8, f38968c)) {
            return "Hyphens.None";
        }
        if (g(i8, f38969d)) {
            return "Hyphens.Auto";
        }
        return g(i8, f38970e) ? "Hyphens.Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f38971a, obj);
    }

    public int hashCode() {
        return h(this.f38971a);
    }

    public final /* synthetic */ int j() {
        return this.f38971a;
    }

    public String toString() {
        return i(this.f38971a);
    }

    public static int e(int i8) {
        return i8;
    }
}
