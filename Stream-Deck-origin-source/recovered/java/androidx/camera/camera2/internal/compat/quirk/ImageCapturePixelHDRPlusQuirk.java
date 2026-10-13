package androidx.camera.camera2.internal.compat.quirk;

import H.V0;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class ImageCapturePixelHDRPlusQuirk implements V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f14100a = Arrays.asList("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    public static boolean d() {
        return f14100a.contains(Build.MODEL) && "Google".equals(Build.MANUFACTURER);
    }
}
