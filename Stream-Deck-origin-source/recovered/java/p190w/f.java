package p190w;

import H.W0;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static List a(W0 w8) {
        ArrayList arrayList = new ArrayList();
        if (w8.a(ImageCapturePixelHDRPlusQuirk.class, ImageCapturePixelHDRPlusQuirk.d())) {
            arrayList.add(new ImageCapturePixelHDRPlusQuirk());
        }
        if (w8.a(ExtraCroppingQuirk.class, ExtraCroppingQuirk.f())) {
            arrayList.add(new ExtraCroppingQuirk());
        }
        if (w8.a(Nexus4AndroidLTargetAspectRatioQuirk.class, Nexus4AndroidLTargetAspectRatioQuirk.e())) {
            arrayList.add(new Nexus4AndroidLTargetAspectRatioQuirk());
        }
        if (w8.a(ExcludedSupportedSizesQuirk.class, ExcludedSupportedSizesQuirk.u())) {
            arrayList.add(new ExcludedSupportedSizesQuirk());
        }
        if (w8.a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.d())) {
            arrayList.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
        }
        if (w8.a(PreviewPixelHDRnetQuirk.class, PreviewPixelHDRnetQuirk.d())) {
            arrayList.add(new PreviewPixelHDRnetQuirk());
        }
        if (w8.a(StillCaptureFlashStopRepeatingQuirk.class, StillCaptureFlashStopRepeatingQuirk.d())) {
            arrayList.add(new StillCaptureFlashStopRepeatingQuirk());
        }
        if (w8.a(ExtraSupportedSurfaceCombinationsQuirk.class, ExtraSupportedSurfaceCombinationsQuirk.i())) {
            arrayList.add(new ExtraSupportedSurfaceCombinationsQuirk());
        }
        if (w8.a(FlashAvailabilityBufferUnderflowQuirk.class, FlashAvailabilityBufferUnderflowQuirk.e())) {
            arrayList.add(new FlashAvailabilityBufferUnderflowQuirk());
        }
        if (w8.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, RepeatingStreamConstraintForVideoRecordingQuirk.e())) {
            arrayList.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
        }
        if (w8.a(TextureViewIsClosedQuirk.class, TextureViewIsClosedQuirk.d())) {
            arrayList.add(new TextureViewIsClosedQuirk());
        }
        if (w8.a(CaptureSessionOnClosedNotCalledQuirk.class, CaptureSessionOnClosedNotCalledQuirk.d())) {
            arrayList.add(new CaptureSessionOnClosedNotCalledQuirk());
        }
        if (w8.a(TorchIsClosedAfterImageCapturingQuirk.class, TorchIsClosedAfterImageCapturingQuirk.d())) {
            arrayList.add(new TorchIsClosedAfterImageCapturingQuirk());
        }
        if (w8.a(ZslDisablerQuirk.class, ZslDisablerQuirk.g())) {
            arrayList.add(new ZslDisablerQuirk());
        }
        if (w8.a(ExtraSupportedOutputSizeQuirk.class, ExtraSupportedOutputSizeQuirk.g())) {
            arrayList.add(new ExtraSupportedOutputSizeQuirk());
        }
        if (w8.a(InvalidVideoProfilesQuirk.class, InvalidVideoProfilesQuirk.q())) {
            arrayList.add(new InvalidVideoProfilesQuirk());
        }
        if (w8.a(Preview3AThreadCrashQuirk.class, Preview3AThreadCrashQuirk.d())) {
            arrayList.add(new Preview3AThreadCrashQuirk());
        }
        if (w8.a(SmallDisplaySizeQuirk.class, SmallDisplaySizeQuirk.e())) {
            arrayList.add(new SmallDisplaySizeQuirk());
        }
        if (w8.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.d())) {
            arrayList.add(PreviewUnderExposureQuirk.f14110a);
        }
        if (w8.a(CaptureSessionShouldUseMrirQuirk.class, CaptureSessionShouldUseMrirQuirk.d())) {
            arrayList.add(new CaptureSessionShouldUseMrirQuirk());
        }
        return arrayList;
    }
}
