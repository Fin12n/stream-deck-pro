package androidx.camera.camera2.internal.compat.quirk;

import H.V0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p174u.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureFailWithAutoFlashQuirk implements V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f14096a = Arrays.asList("sm-j700f", "sm-j710f");

    public static boolean d(n nVar) {
        return f14096a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) nVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
