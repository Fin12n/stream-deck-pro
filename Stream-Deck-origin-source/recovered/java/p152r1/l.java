package p152r1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class l extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f32326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f32327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f32328d;

    public l(int i8, float f8, float f9, float f10) {
        this.f32325a = i8;
        this.f32326b = f8;
        this.f32327c = f9;
        this.f32328d = f10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f32328d, this.f32326b, this.f32327c, this.f32325a);
    }
}
