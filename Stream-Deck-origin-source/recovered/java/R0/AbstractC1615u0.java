package R0;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: R0.u0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1615u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9427a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f9428b = c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f9429c = c(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f9430d = c(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f9431e = c(3);

    /* JADX INFO: renamed from: R0.u0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return AbstractC1615u0.f9429c;
        }

        public final int b() {
            return AbstractC1615u0.f9428b;
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

    public static String f(int i8) {
        if (d(i8, f9428b)) {
            return "None";
        }
        if (d(i8, f9429c)) {
            return "Low";
        }
        if (d(i8, f9430d)) {
            return "Medium";
        }
        return d(i8, f9431e) ? "High" : "Unknown";
    }

    public static int c(int i8) {
        return i8;
    }
}
