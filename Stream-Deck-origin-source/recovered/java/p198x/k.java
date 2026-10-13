package p198x;

import H.j1;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import p190w.e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExtraCroppingQuirk f37150a;

    public k() {
        this((ExtraCroppingQuirk) e.b(ExtraCroppingQuirk.class));
    }

    public Size a(Size size) {
        Size sizeD;
        ExtraCroppingQuirk extraCroppingQuirk = this.f37150a;
        return (extraCroppingQuirk == null || (sizeD = extraCroppingQuirk.d(j1.d.PRIV)) == null || sizeD.getWidth() * sizeD.getHeight() <= size.getWidth() * size.getHeight()) ? size : sizeD;
    }

    public k(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f37150a = extraCroppingQuirk;
    }
}
