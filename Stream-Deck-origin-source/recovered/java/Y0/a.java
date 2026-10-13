package Y0;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0304a f12080b = new C0304a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12081c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f12082d = d(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12083a;

    /* JADX INFO: renamed from: Y0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0304a {
        public /* synthetic */ C0304a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return a.f12082d;
        }

        public final int b() {
            return a.f12081c;
        }

        public C0304a() {
        }
    }

    public /* synthetic */ a(int i8) {
        this.f12083a = i8;
    }

    public static final /* synthetic */ a c(int i8) {
        return new a(i8);
    }

    public static boolean e(int i8, Object obj) {
        return (obj instanceof a) && i8 == ((a) obj).i();
    }

    public static final boolean f(int i8, int i9) {
        return i8 == i9;
    }

    public static int g(int i8) {
        return Integer.hashCode(i8);
    }

    public static String h(int i8) {
        if (f(i8, f12081c)) {
            return "Touch";
        }
        return f(i8, f12082d) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return e(this.f12083a, obj);
    }

    public int hashCode() {
        return g(this.f12083a);
    }

    public final /* synthetic */ int i() {
        return this.f12083a;
    }

    public String toString() {
        return h(this.f12083a);
    }

    public static int d(int i8) {
        return i8;
    }
}
