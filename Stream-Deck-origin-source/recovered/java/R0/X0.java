package R0;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9380a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f9381b = e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f9382c = e(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f9383d = e(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f9384e = e(3);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return X0.f9381b;
        }

        public final int b() {
            return X0.f9384e;
        }

        public final int c() {
            return X0.f9383d;
        }

        public final int d() {
            return X0.f9382c;
        }

        public a() {
        }
    }

    public static final boolean f(int i8, int i9) {
        return i8 == i9;
    }

    public static int g(int i8) {
        return Integer.hashCode(i8);
    }

    public static String h(int i8) {
        if (f(i8, f9381b)) {
            return "Clamp";
        }
        if (f(i8, f9382c)) {
            return "Repeated";
        }
        if (f(i8, f9383d)) {
            return "Mirror";
        }
        return f(i8, f9384e) ? "Decal" : "Unknown";
    }

    public static int e(int i8) {
        return i8;
    }
}
