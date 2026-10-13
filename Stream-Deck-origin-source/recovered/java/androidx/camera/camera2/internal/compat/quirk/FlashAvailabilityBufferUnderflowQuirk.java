package androidx.camera.camera2.internal.compat.quirk;

import H.V0;
import android.os.Build;
import android.util.Pair;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f14094a = new HashSet();

    static {
        d("sprd", "lemp");
        d("sprd", "DM20C");
    }

    public static void d(String str, String str2) {
        Set set = f14094a;
        Locale locale = Locale.US;
        set.add(new Pair(str.toLowerCase(locale), str2.toLowerCase(locale)));
    }

    public static boolean e() {
        Set set = f14094a;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return set.contains(new Pair(str.toLowerCase(locale), Build.MODEL.toLowerCase(locale)));
    }
}
