package p174u;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class x implements t.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraManager f34330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f34331b;

    public x(Context context, Object obj) {
        this.f34330a = (CameraManager) context.getSystemService("camera");
        this.f34331b = obj;
    }

    @Override // u.t.a
    public CameraManager a() {
        return this.f34330a;
    }

    @Override // u.t.a
    public CameraCharacteristics d(String str) throws e {
        try {
            return this.f34330a.getCameraCharacteristics(str);
        } catch (CameraAccessException e8) {
            throw e.e(e8);
        }
    }

    @Override // u.t.a
    public Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // u.t.a
    public String[] h() throws e {
        try {
            return this.f34330a.getCameraIdList();
        } catch (CameraAccessException e8) {
            throw e.e(e8);
        }
    }
}
