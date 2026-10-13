package p136p1;

import D6.C0934n;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import kotlin.jvm.internal.t;
import p152r1.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f31038a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f31039b = a(0, 0);

    public static final long a(int i8, int i9) {
        return B.a((((long) i9) & 4294967295L) | (((long) i8) << 32));
    }

    public static final Paint.FontMetricsInt g(z zVar, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, h[] hVarArr) {
        int iL = zVar.l() - 1;
        if (zVar.h().getLineStart(iL) != zVar.h().getLineEnd(iL)) {
            return null;
        }
        if (hVarArr.length == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString("\u200b");
        h hVar = (h) C0934n.N(hVarArr);
        spannableString.setSpan(hVar.b(0, spannableString.length(), (iL == 0 || !hVar.e()) ? hVar.e() : false), 0, spannableString.length(), 33);
        StaticLayout staticLayoutA = u.f31074a.a(spannableString, textPaint, Integer.MAX_VALUE, (2072512 & 8) != 0 ? 0 : 0, (2072512 & 16) != 0 ? spannableString.length() : spannableString.length(), (2072512 & 32) != 0 ? g.f31050a.b() : textDirectionHeuristic, (2072512 & 64) != 0 ? g.f31050a.a() : null, (2072512 & 128) != 0 ? Integer.MAX_VALUE : 0, (2072512 & 256) != 0 ? null : null, (2072512 & 512) != 0 ? Integer.MAX_VALUE : 0, (2072512 & 1024) != 0 ? 1.0f : 0.0f, (2072512 & 2048) != 0 ? 0.0f : 0.0f, (2072512 & 4096) != 0 ? 0 : 0, (2072512 & 8192) != 0 ? false : zVar.g(), (2072512 & 16384) != 0 ? true : zVar.d(), (32768 & 2072512) != 0 ? 0 : 0, (65536 & 2072512) != 0 ? 0 : 0, (131072 & 2072512) != 0 ? 0 : 0, (262144 & 2072512) != 0 ? 0 : 0, (524288 & 2072512) != 0 ? null : null, (2072512 & 1048576) != 0 ? null : null);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = staticLayoutA.getLineAscent(0);
        fontMetricsInt.descent = staticLayoutA.getLineDescent(0);
        fontMetricsInt.top = staticLayoutA.getLineTop(0);
        fontMetricsInt.bottom = staticLayoutA.getLineBottom(0);
        return fontMetricsInt;
    }

    public static final long h(z zVar, h[] hVarArr) {
        int iMax = 0;
        int iMax2 = 0;
        for (h hVar : hVarArr) {
            if (hVar.c() < 0) {
                iMax = Math.max(iMax, Math.abs(hVar.c()));
            }
            if (hVar.d() < 0) {
                iMax2 = Math.max(iMax, Math.abs(hVar.d()));
            }
        }
        return (iMax == 0 && iMax2 == 0) ? f31039b : a(iMax, iMax2);
    }

    public static final h[] i(z zVar) {
        if (!(zVar.E() instanceof Spanned)) {
            return new h[0];
        }
        CharSequence charSequenceE = zVar.E();
        t.e(charSequenceE, "null cannot be cast to non-null type android.text.Spanned");
        h[] hVarArr = (h[]) ((Spanned) charSequenceE).getSpans(0, zVar.E().length(), h.class);
        return hVarArr.length == 0 ? new h[0] : hVarArr;
    }

    public static final TextDirectionHeuristic j(int i8) {
        if (i8 == 0) {
            return TextDirectionHeuristics.LTR;
        }
        if (i8 == 1) {
            return TextDirectionHeuristics.RTL;
        }
        if (i8 == 2) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i8 == 3) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (i8 != 4) {
            return i8 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.ANYRTL_LTR;
    }

    public static final long k(z zVar) {
        if (zVar.g() || zVar.F()) {
            return f31039b;
        }
        TextPaint paint = zVar.h().getPaint();
        CharSequence text = zVar.h().getText();
        Rect rectC = n.c(paint, text, zVar.h().getLineStart(0), zVar.h().getLineEnd(0));
        int lineAscent = zVar.h().getLineAscent(0);
        int i8 = rectC.top;
        int topPadding = i8 < lineAscent ? lineAscent - i8 : zVar.h().getTopPadding();
        if (zVar.l() != 1) {
            int iL = zVar.l() - 1;
            rectC = n.c(paint, text, zVar.h().getLineStart(iL), zVar.h().getLineEnd(iL));
        }
        int lineDescent = zVar.h().getLineDescent(zVar.l() - 1);
        int i9 = rectC.bottom;
        int bottomPadding = i9 > lineDescent ? i9 - lineDescent : zVar.h().getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? f31039b : a(topPadding, bottomPadding);
    }

    public static final boolean l(Layout layout, int i8) {
        return layout.getEllipsisCount(i8) > 0;
    }
}
