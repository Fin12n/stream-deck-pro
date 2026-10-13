package p216z1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39054a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f39055b = d(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39056c = d(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39057d = d(3);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return t.f39055b;
        }

        public final int b() {
            return t.f39056c;
        }

        public final int c() {
            return t.f39057d;
        }

        public a() {
        }
    }

    public static final boolean e(int i8, int i9) {
        return i8 == i9;
    }

    public static int f(int i8) {
        return Integer.hashCode(i8);
    }

    public static String g(int i8) {
        if (e(i8, f39055b)) {
            return "Clip";
        }
        if (e(i8, f39056c)) {
            return "Ellipsis";
        }
        return e(i8, f39057d) ? "Visible" : "Invalid";
    }

    public static int d(int i8) {
        return i8;
    }
}
