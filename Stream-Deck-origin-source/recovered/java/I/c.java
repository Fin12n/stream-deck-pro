package I;

import A.AbstractC0890p0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static int a(int i8, int i9, boolean z8) {
        int i10 = z8 ? ((i9 - i8) + 360) % 360 : (i9 + i8) % 360;
        if (AbstractC0890p0.h("CameraOrientationUtil")) {
            AbstractC0890p0.a("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i8), Integer.valueOf(i9), Boolean.valueOf(z8), Integer.valueOf(i10)));
        }
        return i10;
    }

    public static int b(int i8) {
        if (i8 == 0) {
            return 0;
        }
        if (i8 == 1) {
            return 90;
        }
        if (i8 == 2) {
            return 180;
        }
        if (i8 == 3) {
            return 270;
        }
        throw new IllegalArgumentException("Unsupported surface rotation: " + i8);
    }
}
