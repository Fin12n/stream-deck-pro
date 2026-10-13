package V;

import android.content.Context;
import android.hardware.camera2.CameraManager;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraManager f10254a;

    public c(Context context) {
        this.f10254a = (CameraManager) context.getSystemService(CameraManager.class);
    }

    @Override // V.f
    public d a(String str) {
        return new b(this.f10254a, str);
    }
}
