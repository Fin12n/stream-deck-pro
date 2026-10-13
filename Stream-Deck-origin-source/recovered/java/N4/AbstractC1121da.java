package N4;

import android.graphics.Point;
import java.util.Iterator;

/* JADX INFO: renamed from: N4.da, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1121da {
    public static AbstractC1121da f(Iterable iterable, int i8, int i9, float f8) {
        Iterator it = iterable.iterator();
        int iMax = 0;
        int iMin = i8;
        int iMin2 = i9;
        int iMax2 = 0;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            iMin = Math.min(iMin, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax = Math.max(iMax, point.x);
            iMax2 = Math.max(iMax2, point.y);
        }
        float f9 = i8;
        float f10 = i9;
        return new C1097ba((iMin + 0.0f) / f9, (iMin2 + 0.0f) / f10, (iMax + 0.0f) / f9, (iMax2 + 0.0f) / f10, 0.0f);
    }

    public abstract float a();

    public abstract float b();

    public abstract float c();

    public abstract float d();

    public abstract float e();
}
