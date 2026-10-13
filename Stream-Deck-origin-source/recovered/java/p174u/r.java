package p174u;

import T1.f;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import p182v.o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class r extends q {
    public r(CameraDevice cameraDevice) {
        super((CameraDevice) f.g(cameraDevice), null);
    }

    @Override // u.o.a
    public void a(o oVar) throws e {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) oVar.e();
        f.g(sessionConfiguration);
        try {
            this.f34326a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e8) {
            throw e.e(e8);
        }
    }
}
