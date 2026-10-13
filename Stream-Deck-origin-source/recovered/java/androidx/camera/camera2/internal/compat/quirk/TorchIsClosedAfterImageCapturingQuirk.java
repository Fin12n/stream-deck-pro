package androidx.camera.camera2.internal.compat.quirk;

import H.V0;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class TorchIsClosedAfterImageCapturingQuirk implements V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f14115a = Arrays.asList("mi a1", "mi a2", "mi a2 lite", "redmi 4x", "redmi 5a", "redmi note 5", "redmi note 5 pro", "redmi 6 pro", "redmi note 6 pro");

    public static boolean d() {
        return f14115a.contains(Build.MODEL.toLowerCase(Locale.US));
    }
}
