package p198x;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import p190w.e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SmallDisplaySizeQuirk f37143a = (SmallDisplaySizeQuirk) e.b(SmallDisplaySizeQuirk.class);

    public Size a() {
        SmallDisplaySizeQuirk smallDisplaySizeQuirk = this.f37143a;
        if (smallDisplaySizeQuirk != null) {
            return smallDisplaySizeQuirk.d();
        }
        return null;
    }
}
