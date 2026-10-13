package O;

import A.C0903w0;
import H.AbstractC0994n0;
import H.c1;
import android.media.MediaCodec;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7537a;

    public g() {
        this.f7537a = N.b.b(SurfaceOrderQuirk.class) != null;
    }

    public static /* synthetic */ int a(g gVar, c1.f fVar, c1.f fVar2) {
        gVar.getClass();
        return gVar.b(fVar.f()) - gVar.b(fVar2.f());
    }

    public final int b(AbstractC0994n0 abstractC0994n0) {
        if (abstractC0994n0.g() == MediaCodec.class) {
            return 2;
        }
        return (abstractC0994n0.g() == C0903w0.class || abstractC0994n0.g() == U.g.class) ? 0 : 1;
    }

    public void c(List list) {
        if (this.f7537a) {
            Collections.sort(list, new Comparator() { // from class: O.f
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return g.a(this.f7536a, (c1.f) obj, (c1.f) obj2);
                }
            });
        }
    }
}
