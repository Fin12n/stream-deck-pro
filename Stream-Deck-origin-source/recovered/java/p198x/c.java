package p198x;

import H.Z0;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static boolean a(Z0 z8) {
        return z8.a(LegacyCameraOutputConfigNullPointerQuirk.class) || z8.a(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class);
    }
}
