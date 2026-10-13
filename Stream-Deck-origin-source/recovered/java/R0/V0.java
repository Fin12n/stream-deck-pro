package R0;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9341a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f9342b = d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f9343c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f9344d = d(2);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return V0.f9342b;
        }

        public final int b() {
            return V0.f9343c;
        }

        public final int c() {
            return V0.f9344d;
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
        if (e(i8, f9342b)) {
            return "Butt";
        }
        if (e(i8, f9343c)) {
            return "Round";
        }
        return e(i8, f9344d) ? "Square" : "Unknown";
    }

    public static int d(int i8) {
        return i8;
    }
}
