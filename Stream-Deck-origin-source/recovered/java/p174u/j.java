package p174u;

import android.hardware.camera2.CameraCharacteristics;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class j implements n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraCharacteristics f34320a;

    public j(CameraCharacteristics cameraCharacteristics) {
        this.f34320a = cameraCharacteristics;
    }

    @Override // u.n.a
    public CameraCharacteristics a() {
        return this.f34320a;
    }

    @Override // u.n.a
    public Object b(CameraCharacteristics.Key key) {
        return this.f34320a.get(key);
    }
}
