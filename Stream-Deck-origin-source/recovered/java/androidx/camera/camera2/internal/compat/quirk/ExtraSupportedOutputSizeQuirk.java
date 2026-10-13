package androidx.camera.camera2.internal.compat.quirk;

import H.V0;
import android.os.Build;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedOutputSizeQuirk implements V0 {
    public static boolean f() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean g() {
        return f();
    }

    public Size[] d(int i8) {
        return (i8 == 34 && f()) ? e() : new Size[0];
    }

    public final Size[] e() {
        return new Size[]{new Size(1440, 1080), new Size(960, 720)};
    }
}
