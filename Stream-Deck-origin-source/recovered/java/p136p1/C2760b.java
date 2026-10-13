package p136p1;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: p1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2760b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2760b f31040a = new C2760b();

    public static final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i8, Layout.Alignment alignment, float f8, float f9, BoringLayout.Metrics metrics, boolean z8, boolean z9, TextUtils.TruncateAt truncateAt, int i9) {
        return AbstractC2759a.a(charSequence, textPaint, i8, alignment, f8, f9, metrics, z8, truncateAt, i9, z9);
    }

    public static final BoringLayout.Metrics b(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public final boolean c(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }
}
