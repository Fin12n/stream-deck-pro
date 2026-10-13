package p198x;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import p158s.a;
import p190w.e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class j {
    public void a(int i8, a.C0723a c0723a) {
        if (((ImageCapturePixelHDRPlusQuirk) e.b(ImageCapturePixelHDRPlusQuirk.class)) == null) {
            return;
        }
        if (i8 == 0) {
            c0723a.f(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
        } else {
            if (i8 != 1) {
                return;
            }
            c0723a.f(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
        }
    }
}
