package p166t;

import H.AbstractC0995o;
import H.C0999q;
import H.m1;
import T1.f;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class Z0 extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0995o f33606a;

    public Z0(AbstractC0995o abstractC0995o) {
        if (abstractC0995o == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f33606a = abstractC0995o;
    }

    public final int a(CaptureRequest captureRequest) {
        Integer num;
        if ((captureRequest.getTag() instanceof m1) && (num = (Integer) ((m1) captureRequest.getTag()).d("CAPTURE_CONFIG_ID_KEY")) != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        m1 m1VarB;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            f.b(tag instanceof m1, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            m1VarB = (m1) tag;
        } else {
            m1VarB = m1.b();
        }
        this.f33606a.b(a(captureRequest), new C2940h(m1VarB, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f33606a.c(a(captureRequest), new C0999q(C0999q.a.ERROR));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j8, long j9) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j8, j9);
        this.f33606a.d(a(captureRequest));
    }
}
