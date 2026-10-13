package androidx.camera.core.internal.compat.quirk;

import H.V0;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class LowMemoryQuirk implements V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f14174a = new HashSet(Arrays.asList("SM-A520W", "MOTOG3"));

    public static boolean d() {
        return f14174a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
