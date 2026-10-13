package p136p1;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f31041a = new c();

    public final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i8, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z8, boolean z9, TextUtils.TruncateAt truncateAt, int i9) {
        if (i8 < 0) {
            throw new IllegalArgumentException("negative width");
        }
        if (i9 >= 0) {
            return Build.VERSION.SDK_INT >= 33 ? C2760b.a(charSequence, textPaint, i8, alignment, 1.0f, 0.0f, metrics, z8, z9, truncateAt, i9) : d.a(charSequence, textPaint, i8, alignment, 1.0f, 0.0f, metrics, z8, truncateAt, i9);
        }
        throw new IllegalArgumentException("negative ellipsized width");
    }

    public final boolean b(BoringLayout boringLayout) {
        if (Build.VERSION.SDK_INT >= 33) {
            return C2760b.f31040a.c(boringLayout);
        }
        return false;
    }

    public final BoringLayout.Metrics c(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return Build.VERSION.SDK_INT >= 33 ? C2760b.b(charSequence, textPaint, textDirectionHeuristic) : d.b(charSequence, textPaint, textDirectionHeuristic);
    }
}
