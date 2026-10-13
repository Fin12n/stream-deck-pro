package androidx.camera.core.internal.compat.quirk;

import H.C0980g0;
import H.InterfaceC0984i0;
import H.V0;
import android.os.Build;
import io.jentz.winter.js.HRHLwtyqJWz;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureRotationOptionQuirk implements V0 {
    public static boolean e() {
        d();
        return false;
    }

    public static boolean f() {
        return "HONOR".equalsIgnoreCase(Build.BRAND) && "STK-LX1".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean g() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "SNE-LX1".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean i() {
        return g() || f() || e();
    }

    public boolean h(InterfaceC0984i0.a aVar) {
        return aVar != C0980g0.f3014i;
    }

    public static boolean d() {
        String str = Build.FINGERPRINT;
        if (str.startsWith("generic") || str.startsWith("unknown")) {
            return true;
        }
        String str2 = Build.MODEL;
        if (str2.contains("google_sdk") || str2.contains("Emulator") || str2.contains(HRHLwtyqJWz.UoyDFe) || str2.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
            return true;
        }
        return (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || Build.PRODUCT.equals("google_sdk") || Build.HARDWARE.contains("ranchu");
    }
}
