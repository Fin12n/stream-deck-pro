package p152r1;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f32301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f32304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f32305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f32306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f32307g = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f32308h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f32309i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f32310j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f32311k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f32312l;

    public h(float f8, int i8, int i9, boolean z8, boolean z9, float f9) {
        this.f32301a = f8;
        this.f32302b = i8;
        this.f32303c = i9;
        this.f32304d = z8;
        this.f32305e = z9;
        this.f32306f = f9;
        if ((0.0f > f9 || f9 > 1.0f) && f9 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    public final void a(Paint.FontMetricsInt fontMetricsInt) {
        int iA = i.a(fontMetricsInt);
        int iCeil = (int) Math.ceil(this.f32301a);
        int i8 = iCeil - iA;
        float fAbs = this.f32306f;
        if (fAbs == -1.0f) {
            fAbs = Math.abs(fontMetricsInt.ascent) / i.a(fontMetricsInt);
        }
        int iCeil2 = (int) (i8 <= 0 ? Math.ceil(i8 * fAbs) : Math.ceil(i8 * (1.0f - fAbs)));
        int i9 = fontMetricsInt.descent;
        int i10 = iCeil2 + i9;
        this.f32309i = i10;
        int i11 = i10 - iCeil;
        this.f32308h = i11;
        if (this.f32304d) {
            i11 = fontMetricsInt.ascent;
        }
        this.f32307g = i11;
        if (this.f32305e) {
            i10 = i9;
        }
        this.f32310j = i10;
        this.f32311k = fontMetricsInt.ascent - i11;
        this.f32312l = i10 - i9;
    }

    public final h b(int i8, int i9, boolean z8) {
        return new h(this.f32301a, i8, i9, z8, this.f32305e, this.f32306f);
    }

    public final int c() {
        return this.f32311k;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i8, int i9, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (i.a(fontMetricsInt) <= 0) {
            return;
        }
        boolean z8 = i8 == this.f32302b;
        boolean z9 = i9 == this.f32303c;
        if (z8 && z9 && this.f32304d && this.f32305e) {
            return;
        }
        if (this.f32307g == Integer.MIN_VALUE) {
            a(fontMetricsInt);
        }
        fontMetricsInt.ascent = z8 ? this.f32307g : this.f32308h;
        fontMetricsInt.descent = z9 ? this.f32310j : this.f32309i;
    }

    public final int d() {
        return this.f32312l;
    }

    public final boolean e() {
        return this.f32305e;
    }
}
