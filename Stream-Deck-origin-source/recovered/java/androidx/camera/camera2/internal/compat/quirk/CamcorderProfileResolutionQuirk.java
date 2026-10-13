package androidx.camera.camera2.internal.compat.quirk;

import H.V0;
import android.hardware.camera2.CameraCharacteristics;
import java.util.List;
import p174u.n;
import p174u.y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class CamcorderProfileResolutionQuirk implements V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f14084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f14085b = null;

    public CamcorderProfileResolutionQuirk(n nVar) {
        this.f14084a = nVar.e();
    }

    public static boolean d(n nVar) {
        Integer num = (Integer) nVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
