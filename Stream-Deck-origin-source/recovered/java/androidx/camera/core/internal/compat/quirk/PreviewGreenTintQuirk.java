package androidx.camera.core.internal.compat.quirk;

import A.C0903w0;
import A.T0;
import H.V0;
import H.u1;
import H.v1;
import Z6.v;
import android.os.Build;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class PreviewGreenTintQuirk implements V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PreviewGreenTintQuirk f14175a = new PreviewGreenTintQuirk();

    private PreviewGreenTintQuirk() {
    }

    public static final boolean e() {
        return f14175a.d();
    }

    public static final boolean f(String cameraId, Collection appUseCases) {
        t.g(cameraId, "cameraId");
        t.g(appUseCases, "appUseCases");
        PreviewGreenTintQuirk previewGreenTintQuirk = f14175a;
        if (previewGreenTintQuirk.d()) {
            return previewGreenTintQuirk.g(cameraId, appUseCases);
        }
        return false;
    }

    public final boolean d() {
        return v.v("motorola", Build.BRAND, true) && v.v("moto e20", Build.MODEL, true);
    }

    public final boolean g(String str, Collection collection) {
        boolean z8;
        boolean z9;
        if (t.c(str, "0") && collection.size() == 2) {
            Collection collection2 = collection;
            boolean z10 = collection2 instanceof Collection;
            if (!z10 || !collection2.isEmpty()) {
                Iterator it = collection2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z8 = false;
                        break;
                    }
                    if (((T0) it.next()) instanceof C0903w0) {
                        z8 = true;
                        break;
                    }
                }
            } else {
                z8 = false;
                break;
            }
            if (!z10 || !collection2.isEmpty()) {
                Iterator it2 = collection2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z9 = false;
                        break;
                    }
                    T0 t8 = (T0) it2.next();
                    if (t8.l().e(u1.f3222G) && t8.l().O() == v1.b.VIDEO_CAPTURE) {
                        z9 = true;
                        break;
                    }
                }
            } else {
                z9 = false;
                break;
            }
            if (z8 && z9) {
                return true;
            }
        }
        return false;
    }
}
