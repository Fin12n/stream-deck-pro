package N;

import H.W0;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static List a(W0 w8) {
        ArrayList arrayList = new ArrayList();
        if (w8.a(ImageCaptureRotationOptionQuirk.class, ImageCaptureRotationOptionQuirk.i())) {
            arrayList.add(new ImageCaptureRotationOptionQuirk());
        }
        if (w8.a(SurfaceOrderQuirk.class, SurfaceOrderQuirk.d())) {
            arrayList.add(new SurfaceOrderQuirk());
        }
        if (w8.a(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.e())) {
            arrayList.add(new CaptureFailedRetryQuirk());
        }
        if (w8.a(LowMemoryQuirk.class, LowMemoryQuirk.d())) {
            arrayList.add(new LowMemoryQuirk());
        }
        if (w8.a(LargeJpegImageQuirk.class, LargeJpegImageQuirk.g())) {
            arrayList.add(new LargeJpegImageQuirk());
        }
        if (w8.a(IncorrectJpegMetadataQuirk.class, IncorrectJpegMetadataQuirk.h())) {
            arrayList.add(new IncorrectJpegMetadataQuirk());
        }
        if (w8.a(ImageCaptureFailedForSpecificCombinationQuirk.class, ImageCaptureFailedForSpecificCombinationQuirk.g())) {
            arrayList.add(new ImageCaptureFailedForSpecificCombinationQuirk());
        }
        if (w8.a(PreviewGreenTintQuirk.class, PreviewGreenTintQuirk.e())) {
            arrayList.add(PreviewGreenTintQuirk.f14175a);
        }
        return arrayList;
    }
}
