package androidx.camera.camera2.internal.compat.quirk;

import H.V0;
import android.os.Build;
import p174u.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk implements V0 {
    public static boolean d(n nVar) {
        return e(nVar);
    }

    public static boolean e(n nVar) {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && nVar.b().equals("1");
    }
}
