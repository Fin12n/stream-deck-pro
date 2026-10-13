package O;

import H.C0980g0;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b {
    public boolean a() {
        ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirk = (ImageCaptureRotationOptionQuirk) N.b.b(ImageCaptureRotationOptionQuirk.class);
        return imageCaptureRotationOptionQuirk == null || imageCaptureRotationOptionQuirk.h(C0980g0.f3014i);
    }

    public boolean b(androidx.camera.core.d dVar) {
        return a() && P.b.g(dVar.getFormat());
    }
}
