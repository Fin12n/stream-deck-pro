package p174u;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f34325a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        void a(p182v.o oVar);
    }

    public o(CameraDevice cameraDevice, Handler handler) {
        this.f34325a = new r(cameraDevice);
    }

    public static o b(CameraDevice cameraDevice, Handler handler) {
        return new o(cameraDevice, handler);
    }

    public void a(p182v.o oVar) {
        this.f34325a.a(oVar);
    }
}
