package p174u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class g extends h {
    public g(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // u.f.a
    public int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f34318a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }

    @Override // u.f.a
    public int c(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f34318a.captureBurstRequests(list, executor, captureCallback);
    }

    @Override // u.f.a
    public int d(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f34318a.setRepeatingBurstRequests(list, executor, captureCallback);
    }
}
