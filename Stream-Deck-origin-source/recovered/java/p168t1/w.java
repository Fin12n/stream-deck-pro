package p168t1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f34108a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f34109b = d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f34110c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f34111d = d(2);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return w.f34111d;
        }

        public final int b() {
            return w.f34109b;
        }

        public final int c() {
            return w.f34110c;
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
        if (e(i8, f34109b)) {
            return "Blocking";
        }
        if (e(i8, f34110c)) {
            return "Optional";
        }
        if (e(i8, f34111d)) {
            return "Async";
        }
        return "Invalid(value=" + i8 + ')';
    }

    public static int d(int i8) {
        return i8;
    }
}
