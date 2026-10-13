package androidx.camera.camera2.internal.compat.quirk;

import H.V0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import p174u.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class CaptureNoResponseQuirk implements V0 {
    public static boolean d(n nVar) {
        String str = Build.HARDWARE;
        return ("samsungexynos7420".equalsIgnoreCase(str) || "universal7420".equalsIgnoreCase(str)) && ((Integer) nVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
