package p174u;

import T1.f;
import android.hardware.camera2.CameraCaptureSession;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraCaptureSession f34318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f34319b;

    public h(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f34318a = (CameraCaptureSession) f.g(cameraCaptureSession);
        this.f34319b = obj;
    }

    @Override // u.f.a
    public CameraCaptureSession a() {
        return this.f34318a;
    }
}
