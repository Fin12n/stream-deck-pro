package androidx.camera.camera2.internal.compat.quirk;

import H.V0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p166t.C2984w;
import p174u.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class TorchFlashRequiredFor3aUpdateQuirk implements V0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f14113b = Arrays.asList("PIXEL 6A", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7A", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f14114a;

    public TorchFlashRequiredFor3aUpdateQuirk(n nVar) {
        this.f14114a = nVar;
    }

    public static boolean d(n nVar) {
        return e() && h(nVar);
    }

    private static boolean e() {
        Iterator it = f14113b.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).equals((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(n nVar) {
        return C2984w.F(nVar, 5) == 5;
    }

    public static boolean h(n nVar) {
        return ((Integer) nVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }

    public static boolean i(n nVar) {
        return d(nVar);
    }

    public boolean g() {
        return !f(this.f14114a);
    }
}
