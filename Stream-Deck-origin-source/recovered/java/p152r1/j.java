package p152r1;

import V.ocy.SVzBK;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class j extends ReplacementSpan {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f32313k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f32314l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f32315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f32317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f32319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f32320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Paint.FontMetricsInt f32321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f32322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f32323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f32324j;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public j(float f8, int i8, float f9, int i9, float f10, int i10) {
        this.f32315a = f8;
        this.f32316b = i8;
        this.f32317c = f9;
        this.f32318d = i9;
        this.f32319e = f10;
        this.f32320f = i10;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f32321g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        t.t("fontMetrics");
        return null;
    }

    public final int b() {
        if (this.f32324j) {
            return this.f32323i;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    public final int c() {
        return this.f32320f;
    }

    public final int d() {
        if (this.f32324j) {
            return this.f32322h;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i8, int i9, float f8, int i10, int i11, int i12, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i8, int i9, Paint.FontMetricsInt fontMetricsInt) {
        float f8;
        int iA;
        this.f32324j = true;
        float textSize = paint.getTextSize();
        this.f32321g = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        int i10 = this.f32316b;
        if (i10 == 0) {
            f8 = this.f32315a * this.f32319e;
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            f8 = this.f32315a * textSize;
        }
        this.f32322h = k.a(f8);
        int i11 = this.f32318d;
        if (i11 == 0) {
            iA = k.a(this.f32317c * this.f32319e);
        } else {
            if (i11 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            iA = k.a(this.f32317c * textSize);
        }
        this.f32323i = iA;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.f32320f) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        fontMetricsInt.ascent = -b();
                    }
                    break;
                case 1:
                case 4:
                    if (fontMetricsInt.ascent + b() > fontMetricsInt.descent) {
                        fontMetricsInt.descent = fontMetricsInt.ascent + b();
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int iB = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iB;
                        fontMetricsInt.descent = iB + b();
                    }
                    break;
                default:
                    throw new IllegalArgumentException(SVzBK.wiXKWfkYxoKs);
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return d();
    }
}
