package p174u;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class w extends v {
    public w(Context context) {
        super(context);
    }

    @Override // p174u.x, u.t.a
    public Set f() throws e {
        try {
            return this.f34330a.getConcurrentCameraIds();
        } catch (CameraAccessException e8) {
            throw e.e(e8);
        }
    }
}
