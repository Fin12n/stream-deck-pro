package androidx.camera.camera2.internal.compat.quirk;

import H.V0;
import Z6.v;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class PreviewUnderExposureQuirk implements V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PreviewUnderExposureQuirk f14110a = new PreviewUnderExposureQuirk();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f14111b = v.v(Build.BRAND, "TCL", true);

    private PreviewUnderExposureQuirk() {
    }

    public static final boolean d() {
        return f14111b;
    }
}
