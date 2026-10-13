package p190w;

import A.AbstractC0890p0;
import H.W0;
import H.X0;
import H.Z0;
import androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk;
import java.util.ArrayList;
import p174u.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static Z0 a(String str, n nVar) {
        W0 w0A = X0.b().a();
        ArrayList arrayList = new ArrayList();
        if (w0A.a(AeFpsRangeLegacyQuirk.class, AeFpsRangeLegacyQuirk.e(nVar))) {
            arrayList.add(new AeFpsRangeLegacyQuirk(nVar));
        }
        if (w0A.a(AspectRatioLegacyApi21Quirk.class, AspectRatioLegacyApi21Quirk.e(nVar))) {
            arrayList.add(new AspectRatioLegacyApi21Quirk());
        }
        if (w0A.a(JpegHalCorruptImageQuirk.class, JpegHalCorruptImageQuirk.d(nVar))) {
            arrayList.add(new JpegHalCorruptImageQuirk());
        }
        if (w0A.a(JpegCaptureDownsizingQuirk.class, JpegCaptureDownsizingQuirk.d(nVar))) {
            arrayList.add(new JpegCaptureDownsizingQuirk());
        }
        if (w0A.a(CamcorderProfileResolutionQuirk.class, CamcorderProfileResolutionQuirk.d(nVar))) {
            arrayList.add(new CamcorderProfileResolutionQuirk(nVar));
        }
        if (w0A.a(CaptureNoResponseQuirk.class, CaptureNoResponseQuirk.d(nVar))) {
            arrayList.add(new CaptureNoResponseQuirk());
        }
        if (w0A.a(LegacyCameraOutputConfigNullPointerQuirk.class, LegacyCameraOutputConfigNullPointerQuirk.d(nVar))) {
            arrayList.add(new LegacyCameraOutputConfigNullPointerQuirk());
        }
        if (w0A.a(LegacyCameraSurfaceCleanupQuirk.class, LegacyCameraSurfaceCleanupQuirk.e(nVar))) {
            arrayList.add(new LegacyCameraSurfaceCleanupQuirk());
        }
        if (w0A.a(ImageCaptureWashedOutImageQuirk.class, ImageCaptureWashedOutImageQuirk.d(nVar))) {
            arrayList.add(new ImageCaptureWashedOutImageQuirk());
        }
        if (w0A.a(CameraNoResponseWhenEnablingFlashQuirk.class, CameraNoResponseWhenEnablingFlashQuirk.d(nVar))) {
            arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
        }
        if (w0A.a(YuvImageOnePixelShiftQuirk.class, YuvImageOnePixelShiftQuirk.j(nVar))) {
            arrayList.add(new YuvImageOnePixelShiftQuirk());
        }
        if (w0A.a(FlashTooSlowQuirk.class, FlashTooSlowQuirk.e(nVar))) {
            arrayList.add(new FlashTooSlowQuirk());
        }
        if (w0A.a(AfRegionFlipHorizontallyQuirk.class, AfRegionFlipHorizontallyQuirk.d(nVar))) {
            arrayList.add(new AfRegionFlipHorizontallyQuirk());
        }
        if (w0A.a(ConfigureSurfaceToSecondarySessionFailQuirk.class, ConfigureSurfaceToSecondarySessionFailQuirk.d(nVar))) {
            arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
        }
        if (w0A.a(PreviewOrientationIncorrectQuirk.class, PreviewOrientationIncorrectQuirk.d(nVar))) {
            arrayList.add(new PreviewOrientationIncorrectQuirk());
        }
        if (w0A.a(CaptureSessionStuckQuirk.class, CaptureSessionStuckQuirk.d(nVar))) {
            arrayList.add(new CaptureSessionStuckQuirk());
        }
        if (w0A.a(ImageCaptureFlashNotFireQuirk.class, ImageCaptureFlashNotFireQuirk.d(nVar))) {
            arrayList.add(new ImageCaptureFlashNotFireQuirk());
        }
        if (w0A.a(ImageCaptureWithFlashUnderexposureQuirk.class, ImageCaptureWithFlashUnderexposureQuirk.d(nVar))) {
            arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
        }
        if (w0A.a(ImageCaptureFailWithAutoFlashQuirk.class, ImageCaptureFailWithAutoFlashQuirk.d(nVar))) {
            arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
        }
        if (w0A.a(IncorrectCaptureStateQuirk.class, IncorrectCaptureStateQuirk.d(nVar))) {
            arrayList.add(new IncorrectCaptureStateQuirk());
        }
        if (w0A.a(TorchFlashRequiredFor3aUpdateQuirk.class, TorchFlashRequiredFor3aUpdateQuirk.i(nVar))) {
            arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk(nVar));
        }
        if (w0A.a(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, PreviewStretchWhenVideoCaptureIsBoundQuirk.j())) {
            arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
        }
        if (w0A.a(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, PreviewDelayWhenVideoCaptureIsBoundQuirk.d())) {
            arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
        }
        if (w0A.a(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.k())) {
            arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
        }
        if (w0A.a(TemporalNoiseQuirk.class, TemporalNoiseQuirk.e(nVar))) {
            arrayList.add(new TemporalNoiseQuirk());
        }
        if (w0A.a(ImageCaptureFailedForVideoSnapshotQuirk.class, ImageCaptureFailedForVideoSnapshotQuirk.f())) {
            arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
        }
        if (w0A.a(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class, CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.d(nVar))) {
            arrayList.add(new CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk());
        }
        if (w0A.a(AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class, AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.e())) {
            arrayList.add(new AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk());
        }
        Z0 z8 = new Z0(arrayList);
        AbstractC0890p0.a("CameraQuirks", "camera2 CameraQuirks = " + Z0.d(z8));
        return z8;
    }
}
