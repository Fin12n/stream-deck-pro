package p192w1;

import S6.c;
import W6.n;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final void a(TextPaint textPaint, float f8) {
        if (Float.isNaN(f8)) {
            return;
        }
        textPaint.setAlpha(c.d(n.j(f8, 0.0f, 1.0f) * 255));
    }
}
