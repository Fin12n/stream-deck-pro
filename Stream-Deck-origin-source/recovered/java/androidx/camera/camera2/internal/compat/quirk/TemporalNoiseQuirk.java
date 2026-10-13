package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import p174u.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class TemporalNoiseQuirk implements CaptureIntentPreviewQuirk {
    public static boolean d() {
        return "Pixel 8".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean e(n nVar) {
        return d() && ((Integer) nVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
