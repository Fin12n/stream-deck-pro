package p066h2;

import T1.f;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f24392b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f24391a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public short f24393c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public short f24394d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f24395e = 1.0f;

    public e(j jVar) {
        f.h(jVar, "rasterizer cannot be null");
        this.f24392b = jVar;
    }

    public final j a() {
        return this.f24392b;
    }

    public final int b() {
        return this.f24393c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i8, int i9, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f24391a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f24391a;
        this.f24395e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f24392b.e();
        this.f24394d = (short) (this.f24392b.e() * this.f24395e);
        short sI = (short) (this.f24392b.i() * this.f24395e);
        this.f24393c = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f24391a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}
