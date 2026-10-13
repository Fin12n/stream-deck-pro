package p136p1;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f31042a = new d();

    public static final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i8, Layout.Alignment alignment, float f8, float f9, BoringLayout.Metrics metrics, boolean z8, TextUtils.TruncateAt truncateAt, int i9) {
        return new BoringLayout(charSequence, textPaint, i8, alignment, f8, f9, metrics, z8, truncateAt, i9);
    }

    public static final BoringLayout.Metrics b(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, textPaint, null);
    }
}
