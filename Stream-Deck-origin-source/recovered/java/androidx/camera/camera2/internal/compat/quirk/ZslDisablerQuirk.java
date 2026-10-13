package androidx.camera.camera2.internal.compat.quirk;

import H.V0;
import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class ZslDisablerQuirk implements V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f14116a = Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1", "SM-F721U1", "SM-S928U1");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f14117b = Arrays.asList("MI 8");

    public static boolean d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean e() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && d(f14116a);
    }

    public static boolean f() {
        return "xiaomi".equalsIgnoreCase(Build.BRAND) && d(f14117b);
    }

    public static boolean g() {
        return e() || f();
    }
}
