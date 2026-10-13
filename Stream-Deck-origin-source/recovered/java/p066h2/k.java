package p066h2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.emoji2.text.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class k extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Paint f24409g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextPaint f24410f;

    public k(j jVar) {
        super(jVar);
    }

    public static Paint e() {
        if (f24409g == null) {
            TextPaint textPaint = new TextPaint();
            f24409g = textPaint;
            textPaint.setColor(c.c().e());
            f24409g.setStyle(Paint.Style.FILL);
        }
        return f24409g;
    }

    public final TextPaint c(CharSequence charSequence, int i8, int i9, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i8, i9, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.f24410f;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.f24410f = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    characterStyle.updateDrawState(textPaint);
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    public void d(Canvas canvas, TextPaint textPaint, float f8, float f9, float f10, float f11) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f8, f10, f9, f11, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i8, int i9, float f8, int i10, int i11, int i12, Paint paint) {
        TextPaint textPaintC = c(charSequence, i8, i9, paint);
        if (textPaintC != null && textPaintC.bgColor != 0) {
            d(canvas, textPaintC, f8, f8 + b(), i10, i12);
        }
        Paint paint2 = textPaintC;
        if (c.c().l()) {
            canvas.drawRect(f8, i10, f8 + b(), i12, e());
        }
        j jVarA = a();
        float f9 = i11;
        if (paint2 == null) {
            paint2 = paint;
        }
        jVarA.a(canvas, f8, f9, paint2);
    }
}
