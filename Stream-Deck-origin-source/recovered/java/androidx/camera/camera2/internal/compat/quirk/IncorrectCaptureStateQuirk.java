package androidx.camera.camera2.internal.compat.quirk;

import H.V0;
import android.hardware.camera2.CameraCharacteristics;
import p174u.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class IncorrectCaptureStateQuirk implements V0 {
    public static boolean d(n nVar) {
        Integer num = (Integer) nVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
