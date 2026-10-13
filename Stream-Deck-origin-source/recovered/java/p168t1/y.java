package p168t1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34112b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f34113c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f34114d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34115a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return y.f34114d;
        }

        public final int b() {
            return y.f34113c;
        }

        public a() {
        }
    }

    public /* synthetic */ y(int i8) {
        this.f34115a = i8;
    }

    public static final /* synthetic */ y c(int i8) {
        return new y(i8);
    }

    public static boolean e(int i8, Object obj) {
        return (obj instanceof y) && i8 == ((y) obj).i();
    }

    public static final boolean f(int i8, int i9) {
        return i8 == i9;
    }

    public static int g(int i8) {
        return Integer.hashCode(i8);
    }

    public static String h(int i8) {
        if (f(i8, f34113c)) {
            return "Normal";
        }
        return f(i8, f34114d) ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return e(this.f34115a, obj);
    }

    public int hashCode() {
        return g(this.f34115a);
    }

    public final /* synthetic */ int i() {
        return this.f34115a;
    }

    public String toString() {
        return h(this.f34115a);
    }

    public static int d(int i8) {
        return i8;
    }
}
