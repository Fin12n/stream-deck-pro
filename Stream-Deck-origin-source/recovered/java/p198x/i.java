package p198x;

import A.AbstractC0890p0;
import H.AbstractC0994n0;
import H.Z0;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f37148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f37149c;

    public i(Z0 z8, Z0 z9) {
        this.f37147a = z9.a(TextureViewIsClosedQuirk.class);
        this.f37148b = z8.a(PreviewOrientationIncorrectQuirk.class);
        this.f37149c = z8.a(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    public void a(List list) {
        if (!b() || list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC0994n0) it.next()).d();
        }
        AbstractC0890p0.a("ForceCloseDeferrableSurface", "deferrableSurface closed");
    }

    public boolean b() {
        return this.f37147a || this.f37148b || this.f37149c;
    }
}
