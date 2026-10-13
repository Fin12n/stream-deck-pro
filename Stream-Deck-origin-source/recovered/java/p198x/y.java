package p198x;

import H.Z0;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f37173b;

    public y(Z0 z8) {
        this.f37172a = CaptureIntentPreviewQuirk.c(z8);
        this.f37173b = z8.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    public Map a(int i8) {
        if (i8 == 3 && this.f37172a) {
            HashMap map = new HashMap();
            map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            return Collections.unmodifiableMap(map);
        }
        if (i8 != 4 || !this.f37173b) {
            return Collections.EMPTY_MAP;
        }
        HashMap map2 = new HashMap();
        map2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
        return Collections.unmodifiableMap(map2);
    }
}
