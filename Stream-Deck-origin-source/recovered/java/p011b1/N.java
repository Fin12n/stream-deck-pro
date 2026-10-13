package p011b1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15698a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15699b = f(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f15700c = f(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f15701d = f(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f15702e = f(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f15703f = f(4);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return N.f15703f;
        }

        public final int b() {
            return N.f15701d;
        }

        public final int c() {
            return N.f15702e;
        }

        public final int d() {
            return N.f15700c;
        }

        public final int e() {
            return N.f15699b;
        }

        public a() {
        }
    }

    public static final boolean g(int i8, int i9) {
        return i8 == i9;
    }

    public static int h(int i8) {
        return Integer.hashCode(i8);
    }

    public static String i(int i8) {
        if (i8 == 1) {
            return "Touch";
        }
        if (i8 == 2) {
            return "Mouse";
        }
        if (i8 != 3) {
            return i8 != 4 ? "Unknown" : "Eraser";
        }
        return "Stylus";
    }

    public static int f(int i8) {
        return i8;
    }
}
