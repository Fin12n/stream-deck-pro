package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p174u.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureFlashNotFireQuirk implements UseTorchAsFlashQuirk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f14098a = Arrays.asList("itel w6004");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f14099b = Arrays.asList("sm-j700f", "sm-j710f");

    public static boolean d(n nVar) {
        List list = f14099b;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        return (list.contains(str.toLowerCase(locale)) && ((Integer) nVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) || f14098a.contains(str.toLowerCase(locale));
    }
}
