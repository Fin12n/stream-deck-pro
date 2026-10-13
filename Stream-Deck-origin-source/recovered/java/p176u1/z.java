package p176u1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f34485a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f34486b = e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f34487c = e(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f34488d = e(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f34489e = e(3);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return z.f34487c;
        }

        public final int b() {
            return z.f34486b;
        }

        public final int c() {
            return z.f34489e;
        }

        public final int d() {
            return z.f34488d;
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
        if (f(i8, f34486b)) {
            return "None";
        }
        if (f(i8, f34487c)) {
            return "Characters";
        }
        if (f(i8, f34488d)) {
            return "Words";
        }
        return f(i8, f34489e) ? "Sentences" : "Invalid";
    }

    public static int e(int i8) {
        return i8;
    }
}
