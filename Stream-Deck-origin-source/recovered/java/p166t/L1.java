package p166t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import kotlin.jvm.internal.t;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class L1 extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptureRequest f33385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraCaptureSession.CaptureCallback f33386b;

    public L1(CaptureRequest forwardedRequest, CameraCaptureSession.CaptureCallback delegate) {
        t.g(forwardedRequest, "forwardedRequest");
        t.g(delegate, "delegate");
        this.f33385a = forwardedRequest;
        this.f33386b = delegate;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession session, CaptureRequest request, Surface target, long j8) {
        t.g(session, "session");
        t.g(request, "request");
        t.g(target, "target");
        this.f33386b.onCaptureBufferLost(session, this.f33385a, target, j8);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession session, CaptureRequest request, TotalCaptureResult result) {
        t.g(session, "session");
        t.g(request, "request");
        t.g(result, "result");
        this.f33386b.onCaptureCompleted(session, this.f33385a, result);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession session, CaptureRequest request, CaptureFailure failure) {
        t.g(session, "session");
        t.g(request, "request");
        t.g(failure, "failure");
        this.f33386b.onCaptureFailed(session, this.f33385a, failure);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession session, CaptureRequest request, CaptureResult partialResult) {
        t.g(session, "session");
        t.g(request, "request");
        t.g(partialResult, "partialResult");
        this.f33386b.onCaptureProgressed(session, this.f33385a, partialResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession session, int i8) {
        t.g(session, "session");
        this.f33386b.onCaptureSequenceAborted(session, i8);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession session, CaptureRequest request, long j8, long j9) {
        t.g(session, "session");
        t.g(request, "request");
        this.f33386b.onCaptureStarted(session, this.f33385a, j8, j9);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onReadoutStarted(CameraCaptureSession session, CaptureRequest request, long j8, long j9) {
        t.g(session, "session");
        t.g(request, "request");
        this.f33386b.onReadoutStarted(session, this.f33385a, j8, j9);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i8, long j8) {
        t.g(cameraCaptureSession, hJroAgFztiMK.utmaRlxfE);
        this.f33386b.onCaptureSequenceCompleted(cameraCaptureSession, i8, j8);
    }
}
