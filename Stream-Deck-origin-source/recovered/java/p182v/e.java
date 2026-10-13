package p182v;

import A.J;
import T1.f;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import java.util.Set;
import p158s.d;
import p174u.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f34932a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        DynamicRangeProfiles a();

        Set b(J j8);

        Set c();
    }

    public e(a aVar) {
        this.f34932a = aVar;
    }

    public static e a(n nVar) {
        e eVarE = Build.VERSION.SDK_INT >= 33 ? e(d.a(nVar.a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) : null;
        return eVarE == null ? g.f34934a : eVarE;
    }

    public static e e(DynamicRangeProfiles dynamicRangeProfiles) {
        if (dynamicRangeProfiles == null) {
            return null;
        }
        f.j(Build.VERSION.SDK_INT >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
        return new e(new f(dynamicRangeProfiles));
    }

    public Set b(J j8) {
        return this.f34932a.b(j8);
    }

    public Set c() {
        return this.f34932a.c();
    }

    public DynamicRangeProfiles d() {
        f.j(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.f34932a.a();
    }
}
