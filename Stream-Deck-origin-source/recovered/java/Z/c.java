package Z;

import H.W0;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static List a(W0 w8) {
        ArrayList arrayList = new ArrayList();
        if (w8.a(SurfaceViewStretchedQuirk.class, SurfaceViewStretchedQuirk.g())) {
            arrayList.add(new SurfaceViewStretchedQuirk());
        }
        if (w8.a(SurfaceViewNotCroppedByParentQuirk.class, SurfaceViewNotCroppedByParentQuirk.d())) {
            arrayList.add(new SurfaceViewNotCroppedByParentQuirk());
        }
        return arrayList;
    }
}
