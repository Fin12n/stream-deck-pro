package androidx.camera.core.internal.compat.quirk;

import A.C0864c0;
import A.C0903w0;
import A.T0;
import H.V0;
import H.u1;
import H.v1;
import android.os.Build;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f14170a = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    public static boolean d() {
        return "oneplus".equalsIgnoreCase(Build.BRAND) && "cph2583".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean e() {
        return "google".equalsIgnoreCase(Build.BRAND) && f14170a.contains(Build.MODEL.toLowerCase());
    }

    public static boolean g() {
        return d() || e();
    }

    public final boolean f(Collection collection) {
        if (collection.size() != 3) {
            return false;
        }
        Iterator it = collection.iterator();
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (it.hasNext()) {
            T0 t8 = (T0) it.next();
            if (t8 instanceof C0903w0) {
                z8 = true;
            } else if (t8 instanceof C0864c0) {
                z10 = true;
            } else if (t8.l().e(u1.f3222G)) {
                z9 = t8.l().O() == v1.b.VIDEO_CAPTURE;
            }
        }
        return z8 && z9 && z10;
    }

    public boolean h(String str, Collection collection) {
        if (d()) {
            return i(str, collection);
        }
        if (e()) {
            return j(str, collection);
        }
        return false;
    }

    public final boolean i(String str, Collection collection) {
        return str.equals("1") && f(collection);
    }

    public final boolean j(String str, Collection collection) {
        return str.equals("1") && f(collection);
    }
}
