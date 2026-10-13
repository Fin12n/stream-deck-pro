package p174u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f34317a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        CameraCaptureSession a();

        int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int c(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int d(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);
    }

    public f(CameraCaptureSession cameraCaptureSession, Handler handler) {
        this.f34317a = new g(cameraCaptureSession);
    }

    public static f e(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new f(cameraCaptureSession, handler);
    }

    public int a(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f34317a.c(list, executor, captureCallback);
    }

    public int b(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f34317a.d(list, executor, captureCallback);
    }

    public int c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f34317a.b(captureRequest, executor, captureCallback);
    }

    public CameraCaptureSession d() {
        return this.f34317a.a();
    }
}
