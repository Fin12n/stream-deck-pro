package R0;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class G {
    public static final ColorFilter a(long j8, int i8) {
        return Build.VERSION.SDK_INT >= 29 ? C1578b0.f9388a.a(j8, i8) : new PorterDuffColorFilter(AbstractC1602n0.j(j8), D.c(i8));
    }

    public static final ColorFilter b(C1600m0 c1600m0) {
        return c1600m0.a();
    }
}
