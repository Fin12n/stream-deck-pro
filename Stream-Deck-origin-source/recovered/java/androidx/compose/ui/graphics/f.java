package androidx.compose.ui.graphics;

import R0.a1;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2635m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14706b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f14707c = a1.a(0.5f, 0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14708a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final long a() {
            return f.f14707c;
        }

        public a() {
        }
    }

    public /* synthetic */ f(long j8) {
        this.f14708a = j8;
    }

    public static final /* synthetic */ f b(long j8) {
        return new f(j8);
    }

    public static boolean d(long j8, Object obj) {
        return (obj instanceof f) && j8 == ((f) obj).j();
    }

    public static final boolean e(long j8, long j9) {
        return j8 == j9;
    }

    public static final float f(long j8) {
        C2635m c2635m = C2635m.f28814a;
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    public static final float g(long j8) {
        C2635m c2635m = C2635m.f28814a;
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    public static int h(long j8) {
        return Long.hashCode(j8);
    }

    public static String i(long j8) {
        return "TransformOrigin(packedValue=" + j8 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f14708a, obj);
    }

    public int hashCode() {
        return h(this.f14708a);
    }

    public final /* synthetic */ long j() {
        return this.f14708a;
    }

    public String toString() {
        return i(this.f14708a);
    }

    public static long c(long j8) {
        return j8;
    }
}
