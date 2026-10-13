package p166t;

import H.Z0;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p174u.f;
import p182v.o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface S1 {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        o c(int i8, List list, c cVar);

        Executor f();

        Y4.a k(CameraDevice cameraDevice, o oVar, List list);

        Y4.a o(List list, long j8);

        boolean stop();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f33467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ScheduledExecutorService f33468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f33469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C2957m1 f33470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Z0 f33471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Z0 f33472f;

        public b(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, C2957m1 c2957m1, Z0 z8, Z0 z9) {
            this.f33467a = executor;
            this.f33468b = scheduledExecutorService;
            this.f33469c = handler;
            this.f33470d = c2957m1;
            this.f33471e = z8;
            this.f33472f = z9;
        }

        public a a() {
            return new c2(this.f33471e, this.f33472f, this.f33470d, this.f33467a, this.f33468b, this.f33469c);
        }
    }

    void a();

    int b(List list, CameraCaptureSession.CaptureCallback captureCallback);

    void close();

    int d(List list, CameraCaptureSession.CaptureCallback captureCallback);

    f e();

    void g(int i8);

    void h();

    CameraDevice i();

    int j(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    c l();

    List m(CaptureRequest captureRequest);

    void n();

    Y4.a p();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class c {
        public void q(S1 s8) {
        }

        public void r(S1 s8) {
        }

        public void s(S1 s8) {
        }

        public void t(S1 s8) {
        }

        public void u(S1 s8) {
        }

        public void v(S1 s8) {
        }

        public void w(S1 s8) {
        }

        public void x(S1 s8, Surface surface) {
        }
    }
}
