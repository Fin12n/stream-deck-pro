package androidx.camera.camera2.internal.compat.quirk;

import H.V0;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class PreviewPixelHDRnetQuirk implements V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f14109a = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    public static boolean d() {
        return "Google".equals(Build.MANUFACTURER) && f14109a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
