package R0;

import R0.pkXL.Oitvkwcwn;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9346a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f9347b = d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f9348c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f9349d = d(2);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return W0.f9349d;
        }

        public final int b() {
            return W0.f9347b;
        }

        public final int c() {
            return W0.f9348c;
        }

        public a() {
        }
    }

    public static int d(int i8) {
        return i8;
    }

    public static final boolean e(int i8, int i9) {
        return i8 == i9;
    }

    public static int f(int i8) {
        return Integer.hashCode(i8);
    }

    public static String g(int i8) {
        if (e(i8, f9347b)) {
            return "Miter";
        }
        if (e(i8, f9348c)) {
            return Oitvkwcwn.qcPbOUYBs;
        }
        return e(i8, f9349d) ? "Bevel" : "Unknown";
    }
}
