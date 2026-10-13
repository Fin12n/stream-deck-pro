package p136p1;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.AbstractC2633k;
import p143q0.nKy.bGZGhbtQmA;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f31077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextPaint f31080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f31081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextDirectionHeuristic f31082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Layout.Alignment f31083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f31084h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextUtils.TruncateAt f31085i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f31086j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f31087k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f31088l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f31089m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f31090n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f31091o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f31092p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f31093q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f31094r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f31095s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f31096t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f31097u;

    public w(CharSequence charSequence, int i8, int i9, TextPaint textPaint, int i10, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i11, TextUtils.TruncateAt truncateAt, int i12, float f8, float f9, int i13, boolean z8, boolean z9, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2) {
        this.f31077a = charSequence;
        this.f31078b = i8;
        this.f31079c = i9;
        this.f31080d = textPaint;
        this.f31081e = i10;
        this.f31082f = textDirectionHeuristic;
        this.f31083g = alignment;
        this.f31084h = i11;
        this.f31085i = truncateAt;
        this.f31086j = i12;
        this.f31087k = f8;
        this.f31088l = f9;
        this.f31089m = i13;
        this.f31090n = z8;
        this.f31091o = z9;
        this.f31092p = i14;
        this.f31093q = i15;
        this.f31094r = i16;
        this.f31095s = i17;
        this.f31096t = iArr;
        this.f31097u = iArr2;
        if (i8 < 0 || i8 > i9) {
            throw new IllegalArgumentException("invalid start value");
        }
        int length = charSequence.length();
        if (i9 < 0 || i9 > length) {
            throw new IllegalArgumentException("invalid end value");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("invalid maxLines value");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("invalid width value");
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("invalid ellipsizedWidth value");
        }
        if (f8 < 0.0f) {
            throw new IllegalArgumentException(bGZGhbtQmA.aPLmWerPdDDQ);
        }
    }

    public final Layout.Alignment a() {
        return this.f31083g;
    }

    public final int b() {
        return this.f31092p;
    }

    public final TextUtils.TruncateAt c() {
        return this.f31085i;
    }

    public final int d() {
        return this.f31086j;
    }

    public final int e() {
        return this.f31079c;
    }

    public final int f() {
        return this.f31095s;
    }

    public final boolean g() {
        return this.f31090n;
    }

    public final int h() {
        return this.f31089m;
    }

    public final int[] i() {
        return this.f31096t;
    }

    public final int j() {
        return this.f31093q;
    }

    public final int k() {
        return this.f31094r;
    }

    public final float l() {
        return this.f31088l;
    }

    public final float m() {
        return this.f31087k;
    }

    public final int n() {
        return this.f31084h;
    }

    public final TextPaint o() {
        return this.f31080d;
    }

    public final int[] p() {
        return this.f31097u;
    }

    public final int q() {
        return this.f31078b;
    }

    public final CharSequence r() {
        return this.f31077a;
    }

    public final TextDirectionHeuristic s() {
        return this.f31082f;
    }

    public final boolean t() {
        return this.f31091o;
    }

    public final int u() {
        return this.f31081e;
    }

    public /* synthetic */ w(CharSequence charSequence, int i8, int i9, TextPaint textPaint, int i10, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i11, TextUtils.TruncateAt truncateAt, int i12, float f8, float f9, int i13, boolean z8, boolean z9, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, int i18, AbstractC2633k abstractC2633k) {
        this(charSequence, (i18 & 2) != 0 ? 0 : i8, i9, textPaint, i10, textDirectionHeuristic, alignment, i11, truncateAt, i12, f8, f9, i13, z8, z9, i14, i15, i16, i17, iArr, iArr2);
    }
}
