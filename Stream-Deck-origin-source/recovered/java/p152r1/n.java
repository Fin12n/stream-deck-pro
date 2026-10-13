package p152r1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class n extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f32331b;

    public n(boolean z8, boolean z9) {
        this.f32330a = z8;
        this.f32331b = z9;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f32330a);
        textPaint.setStrikeThruText(this.f32331b);
    }
}
