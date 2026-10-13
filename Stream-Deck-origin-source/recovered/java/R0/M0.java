package R0;

import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class M0 {
    public static final RectF a(Q0.h hVar) {
        return new RectF(hVar.i(), hVar.l(), hVar.j(), hVar.e());
    }

    public static final Q0.h b(Rect rect) {
        return new Q0.h(rect.left, rect.top, rect.right, rect.bottom);
    }
}
