package p003a2;

import T1.f;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        public static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        public static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        public static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        public static void e(TextView textView, int i8) {
            textView.setBreakStrategy(i8);
        }

        public static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        public static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        public static void h(TextView textView, int i8) {
            textView.setHyphenationFrequency(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c {
        public static void a(TextView textView, int i8, float f8) {
            textView.setLineHeight(i8, f8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d implements ActionMode.Callback {
        public abstract ActionMode.Callback a();
    }

    public static int a(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int b(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int c(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    public static S1.b.a d(TextView textView) {
        return new S1.b.a(b.c(textView));
    }

    public static void e(TextView textView, ColorStateList colorStateList) {
        f.g(textView);
        a.f(textView, colorStateList);
    }

    public static void f(TextView textView, PorterDuff.Mode mode) {
        f.g(textView);
        a.g(textView, mode);
    }

    public static void g(TextView textView, int i8) {
        f.d(i8);
        b.d(textView, i8);
    }

    public static void h(TextView textView, int i8) {
        f.d(i8);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i9 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i8 > Math.abs(i9)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i8 - i9);
        }
    }

    public static void i(TextView textView, int i8) {
        f.d(i8);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i8 != fontMetricsInt) {
            textView.setLineSpacing(i8 - fontMetricsInt, 1.0f);
        }
    }

    public static void j(TextView textView, int i8, float f8) {
        if (Build.VERSION.SDK_INT >= 34) {
            c.a(textView, i8, f8);
        } else {
            i(textView, Math.round(TypedValue.applyDimension(i8, f8, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void k(TextView textView, S1.b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        d(textView);
        throw null;
    }

    public static void l(TextView textView, S1.b.a aVar) {
        textView.setTextDirection(c(aVar.d()));
        textView.getPaint().set(aVar.e());
        a.e(textView, aVar.b());
        a.h(textView, aVar.c());
    }

    public static ActionMode.Callback m(ActionMode.Callback callback) {
        return callback instanceof d ? ((d) callback).a() : callback;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {
        public static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        public static PrecomputedText.Params c(TextView textView) {
            return textView.getTextMetricsParams();
        }

        public static void d(TextView textView, int i8) {
            textView.setFirstBaselineToTopHeight(i8);
        }

        public static CharSequence a(PrecomputedText precomputedText) {
            return precomputedText;
        }
    }

    public static ActionMode.Callback n(TextView textView, ActionMode.Callback callback) {
        return callback;
    }
}
