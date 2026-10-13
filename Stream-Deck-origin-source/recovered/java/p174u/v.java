package p174u;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class v extends u {
    public v(Context context) {
        super(context);
    }

    @Override // p174u.u, p174u.x, u.t.a
    public CameraCharacteristics d(String str) throws e {
        try {
            return this.f34330a.getCameraCharacteristics(str);
        } catch (CameraAccessException e8) {
            throw e.e(e8);
        }
    }

    @Override // p174u.u, u.t.a
    public void g(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws e {
        try {
            this.f34330a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e8) {
            throw e.e(e8);
        }
    }
}
