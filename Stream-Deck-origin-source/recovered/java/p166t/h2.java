package p166t;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import p174u.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h2 {
    public static boolean a(n nVar) {
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 33 && (iArr = (int[]) nVar.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) != null && iArr.length != 0) {
            for (int i8 : iArr) {
                if (i8 == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
