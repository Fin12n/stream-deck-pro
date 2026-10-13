package p166t;

import H.AbstractC0995o;
import android.hardware.camera2.CameraCaptureSession;

/* JADX INFO: renamed from: t.a1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2921a1 extends AbstractC0995o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraCaptureSession.CaptureCallback f33609a;

    public C2921a1(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f33609a = captureCallback;
    }

    public static C2921a1 e(CameraCaptureSession.CaptureCallback captureCallback) {
        return new C2921a1(captureCallback);
    }

    public CameraCaptureSession.CaptureCallback f() {
        return this.f33609a;
    }
}
