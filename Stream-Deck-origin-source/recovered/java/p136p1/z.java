package p136p1;

import C6.j;
import C6.k;
import C6.l;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p152r1.d;
import p152r1.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f31103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f31104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f31105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Layout f31106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f31107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f31108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f31109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f31110i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f31111j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f31112k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint.FontMetricsInt f31113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f31114m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h[] f31115n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f31116o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f31117p;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i invoke() {
            return new i(z.this.h());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    public z(CharSequence charSequence, float f8, TextPaint textPaint, int i8, TextUtils.TruncateAt truncateAt, int i9, float f9, float f10, boolean z8, boolean z9, int i10, int i11, int i12, int i13, int i14, int i15, int[] iArr, int[] iArr2, j jVar) {
        int i16;
        boolean z10;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutA;
        this.f31102a = z8;
        this.f31103b = z9;
        this.f31104c = jVar;
        this.f31116o = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicJ = A.j(i9);
        Layout.Alignment alignmentA = x.f31098a.a(i8);
        boolean z11 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, p152r1.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = jVar.a();
            double d8 = f8;
            int iCeil = (int) Math.ceil(d8);
            if (metricsA == null || jVar.b() > f8 || z11) {
                this.f31112k = false;
                u uVar = u.f31074a;
                int length2 = charSequence.length();
                int iCeil2 = (int) Math.ceil(d8);
                i16 = i10;
                z10 = false;
                textDirectionHeuristic = textDirectionHeuristicJ;
                layoutA = uVar.a(charSequence, textPaint, iCeil, 0, length2, textDirectionHeuristic, alignmentA, i16, truncateAt, iCeil2, f9, f10, i15, z8, z9, i11, i12, i13, i14, iArr, iArr2);
            } else {
                this.f31112k = true;
                i16 = i10;
                layoutA = c.f31041a.a(charSequence, textPaint, iCeil, metricsA, alignmentA, z8, z9, truncateAt, iCeil);
                textDirectionHeuristic = textDirectionHeuristicJ;
                z10 = false;
            }
            this.f31106e = layoutA;
            Trace.endSection();
            int iMin = Math.min(layoutA.getLineCount(), i16);
            this.f31107f = iMin;
            int i17 = iMin - 1;
            this.f31105d = (iMin >= i16 && (layoutA.getEllipsisCount(i17) > 0 || layoutA.getLineEnd(i17) != charSequence.length())) ? true : z10;
            long jK = A.k(this);
            h[] hVarArrI = A.i(this);
            this.f31115n = hVarArrI;
            long jH = A.h(this, hVarArrI);
            this.f31108g = Math.max(B.c(jK), B.c(jH));
            this.f31109h = Math.max(B.b(jK), B.b(jH));
            Paint.FontMetricsInt fontMetricsIntG = A.g(this, textPaint, textDirectionHeuristic, hVarArrI);
            this.f31114m = fontMetricsIntG != null ? fontMetricsIntG.bottom - ((int) r(i17)) : z10;
            this.f31113l = fontMetricsIntG;
            this.f31110i = d.b(layoutA, i17, null, 2, null);
            this.f31111j = d.d(layoutA, i17, null, 2, null);
            this.f31117p = k.a(l.NONE, new a());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static /* synthetic */ float A(z zVar, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        return zVar.z(i8, z8);
    }

    public static /* synthetic */ float C(z zVar, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        return zVar.B(i8, z8);
    }

    public final float B(int i8, boolean z8) {
        return i().c(i8, false, z8) + f(p(i8));
    }

    public final void D(int i8, int i9, Path path) {
        this.f31106e.getSelectionPath(i8, i9, path);
        if (this.f31108g == 0 || path.isEmpty()) {
            return;
        }
        path.offset(0.0f, this.f31108g);
    }

    public final CharSequence E() {
        return this.f31106e.getText();
    }

    public final boolean F() {
        if (this.f31112k) {
            c cVar = c.f31041a;
            Layout layout = this.f31106e;
            t.e(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return cVar.b((BoringLayout) layout);
        }
        u uVar = u.f31074a;
        Layout layout2 = this.f31106e;
        t.e(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return uVar.c((StaticLayout) layout2, this.f31103b);
    }

    public final boolean G(int i8) {
        return A.l(this.f31106e, i8);
    }

    public final boolean H(int i8) {
        return this.f31106e.isRtlCharAt(i8);
    }

    public final void I(Canvas canvas) {
        if (canvas.getClipBounds(this.f31116o)) {
            int i8 = this.f31108g;
            if (i8 != 0) {
                canvas.translate(0.0f, i8);
            }
            y yVar = A.f31038a;
            yVar.a(canvas);
            this.f31106e.draw(yVar);
            int i9 = this.f31108g;
            if (i9 != 0) {
                canvas.translate(0.0f, (-1) * i9);
            }
        }
    }

    public final void a(int i8, int i9, float[] fArr, int i10) {
        float fD;
        float fE;
        int length = E().length();
        if (i8 < 0) {
            throw new IllegalArgumentException("startOffset must be > 0");
        }
        if (i8 >= length) {
            throw new IllegalArgumentException("startOffset must be less than text length");
        }
        if (i9 <= i8) {
            throw new IllegalArgumentException("endOffset must be greater than startOffset");
        }
        if (i9 > length) {
            throw new IllegalArgumentException("endOffset must be smaller or equal to text length");
        }
        if (fArr.length - i10 < (i9 - i8) * 4) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int iP = p(i8);
        int iP2 = p(i9 - 1);
        f fVar = new f(this);
        if (iP > iP2) {
            return;
        }
        while (true) {
            int iU = u(iP);
            int iO = o(iP);
            int iMin = Math.min(i9, iO);
            float fV = v(iP);
            float fK = k(iP);
            boolean z8 = y(iP) == 1;
            for (int iMax = Math.max(i8, iU); iMax < iMin; iMax++) {
                boolean zH = H(iMax);
                if (z8 && !zH) {
                    fD = fVar.b(iMax);
                    fE = fVar.c(iMax + 1);
                } else if (z8 && zH) {
                    fE = fVar.d(iMax);
                    fD = fVar.e(iMax + 1);
                } else if (z8 || !zH) {
                    fD = fVar.d(iMax);
                    fE = fVar.e(iMax + 1);
                } else {
                    fE = fVar.b(iMax);
                    fD = fVar.c(iMax + 1);
                }
                fArr[i10] = fD;
                fArr[i10 + 1] = fV;
                fArr[i10 + 2] = fE;
                fArr[i10 + 3] = fK;
                i10 += 4;
            }
            if (iP == iP2) {
                return;
            } else {
                iP++;
            }
        }
    }

    public final RectF b(int i8) {
        float fB;
        float fB2;
        float fZ;
        float fZ2;
        int iP = p(i8);
        float fV = v(iP);
        float fK = k(iP);
        boolean z8 = y(iP) == 1;
        boolean zIsRtlCharAt = this.f31106e.isRtlCharAt(i8);
        if (!z8 || zIsRtlCharAt) {
            if (z8 && zIsRtlCharAt) {
                fZ = B(i8, false);
                fZ2 = B(i8 + 1, true);
            } else if (zIsRtlCharAt) {
                fZ = z(i8, false);
                fZ2 = z(i8 + 1, true);
            } else {
                fB = B(i8, false);
                fB2 = B(i8 + 1, true);
            }
            float f8 = fZ;
            fB = fZ2;
            fB2 = f8;
        } else {
            fB = z(i8, false);
            fB2 = z(i8 + 1, true);
        }
        return new RectF(fB, fV, fB2, fK);
    }

    public final boolean c() {
        return this.f31105d;
    }

    public final boolean d() {
        return this.f31103b;
    }

    public final int e() {
        return (this.f31105d ? this.f31106e.getLineBottom(this.f31107f - 1) : this.f31106e.getHeight()) + this.f31108g + this.f31109h + this.f31114m;
    }

    public final float f(int i8) {
        if (i8 == this.f31107f - 1) {
            return this.f31110i + this.f31111j;
        }
        return 0.0f;
    }

    public final boolean g() {
        return this.f31102a;
    }

    public final Layout h() {
        return this.f31106e;
    }

    public final i i() {
        return (i) this.f31117p.getValue();
    }

    public final float j(int i8) {
        return this.f31108g + ((i8 != this.f31107f + (-1) || this.f31113l == null) ? this.f31106e.getLineBaseline(i8) : v(i8) - this.f31113l.ascent);
    }

    public final float k(int i8) {
        if (i8 != this.f31107f - 1 || this.f31113l == null) {
            return this.f31108g + this.f31106e.getLineBottom(i8) + (i8 == this.f31107f + (-1) ? this.f31109h : 0);
        }
        return this.f31106e.getLineBottom(i8 - 1) + this.f31113l.bottom;
    }

    public final int l() {
        return this.f31107f;
    }

    public final int m(int i8) {
        return this.f31106e.getEllipsisCount(i8);
    }

    public final int n(int i8) {
        return this.f31106e.getEllipsisStart(i8);
    }

    public final int o(int i8) {
        return this.f31106e.getEllipsisStart(i8) == 0 ? this.f31106e.getLineEnd(i8) : this.f31106e.getText().length();
    }

    public final int p(int i8) {
        return this.f31106e.getLineForOffset(i8);
    }

    public final int q(int i8) {
        return this.f31106e.getLineForVertical(i8 - this.f31108g);
    }

    public final float r(int i8) {
        return k(i8) - v(i8);
    }

    public final float s(int i8) {
        return this.f31106e.getLineLeft(i8) + (i8 == this.f31107f + (-1) ? this.f31110i : 0.0f);
    }

    public final float t(int i8) {
        return this.f31106e.getLineRight(i8) + (i8 == this.f31107f + (-1) ? this.f31111j : 0.0f);
    }

    public final int u(int i8) {
        return this.f31106e.getLineStart(i8);
    }

    public final float v(int i8) {
        return this.f31106e.getLineTop(i8) + (i8 == 0 ? 0 : this.f31108g);
    }

    public final int w(int i8) {
        return this.f31106e.getEllipsisStart(i8) == 0 ? i().d(i8) : this.f31106e.getLineStart(i8) + this.f31106e.getEllipsisStart(i8);
    }

    public final int x(int i8, float f8) {
        return this.f31106e.getOffsetForHorizontal(i8, f8 + ((-1) * f(i8)));
    }

    public final int y(int i8) {
        return this.f31106e.getParagraphDirection(i8);
    }

    public final float z(int i8, boolean z8) {
        return i().c(i8, true, z8) + f(p(i8));
    }

    public /* synthetic */ z(CharSequence charSequence, float f8, TextPaint textPaint, int i8, TextUtils.TruncateAt truncateAt, int i9, float f9, float f10, boolean z8, boolean z9, int i10, int i11, int i12, int i13, int i14, int i15, int[] iArr, int[] iArr2, j jVar, int i16, AbstractC2633k abstractC2633k) {
        CharSequence charSequence2;
        TextPaint textPaint2;
        j jVar2;
        int i17 = (i16 & 8) != 0 ? 0 : i8;
        TextUtils.TruncateAt truncateAt2 = (i16 & 16) != 0 ? null : truncateAt;
        int i18 = (i16 & 32) != 0 ? 2 : i9;
        float f11 = (i16 & 64) != 0 ? 1.0f : f9;
        float f12 = (i16 & 128) != 0 ? 0.0f : f10;
        boolean z10 = (i16 & 256) != 0 ? false : z8;
        boolean z11 = (i16 & 512) != 0 ? true : z9;
        int i19 = (i16 & 1024) != 0 ? Integer.MAX_VALUE : i10;
        int i20 = (i16 & 2048) != 0 ? 0 : i11;
        int i21 = (i16 & 4096) != 0 ? 0 : i12;
        int i22 = (i16 & 8192) != 0 ? 0 : i13;
        int i23 = (i16 & 16384) != 0 ? 0 : i14;
        int i24 = (32768 & i16) != 0 ? 0 : i15;
        int[] iArr3 = (65536 & i16) != 0 ? null : iArr;
        int[] iArr4 = (131072 & i16) != 0 ? null : iArr2;
        if ((i16 & 262144) != 0) {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            jVar2 = new j(charSequence2, textPaint2, i18);
        } else {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            jVar2 = jVar;
        }
        this(charSequence2, f8, textPaint2, i17, truncateAt2, i18, f11, f12, z10, z11, i19, i20, i21, i22, i23, i24, iArr3, iArr4, jVar2);
    }
}
