package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p174u.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class JpegCaptureDownsizingQuirk implements SoftwareJpegEncodingPreferredQuirk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f14106a = new HashSet(Arrays.asList("redmi note 8 pro"));

    public static boolean d(n nVar) {
        return f14106a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) nVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
