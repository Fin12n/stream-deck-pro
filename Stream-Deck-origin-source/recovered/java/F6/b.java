package F6;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class b extends a {
    public static float d(float f8, float... other) {
        t.g(other, "other");
        for (float f9 : other) {
            f8 = Math.max(f8, f9);
        }
        return f8;
    }

    public static int e(int i8, int... other) {
        t.g(other, "other");
        for (int i9 : other) {
            i8 = Math.max(i8, i9);
        }
        return i8;
    }

    public static float f(float f8, float... other) {
        t.g(other, "other");
        for (float f9 : other) {
            f8 = Math.min(f8, f9);
        }
        return f8;
    }
}
