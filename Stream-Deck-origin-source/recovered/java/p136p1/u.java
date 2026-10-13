package p136p1;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f31074a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f31075b = new p();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f31076c = 8;

    public final StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i8, int i9, int i10, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i11, TextUtils.TruncateAt truncateAt, int i12, float f8, float f9, int i13, boolean z8, boolean z9, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2) {
        return f31075b.a(new w(charSequence, i9, i10, textPaint, i8, textDirectionHeuristic, alignment, i11, truncateAt, i12, f8, f9, i13, z8, z9, i14, i15, i16, i17, iArr, iArr2));
    }

    public final boolean c(StaticLayout staticLayout, boolean z8) {
        return f31075b.b(staticLayout, z8);
    }
}
