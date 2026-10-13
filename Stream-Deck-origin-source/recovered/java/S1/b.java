package S1;

import T1.d;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Spannable {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextPaint f9686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextDirectionHeuristic f9687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9688c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f9689d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final PrecomputedText.Params f9690e;

        public a(PrecomputedText.Params params) {
            this.f9686a = params.getTextPaint();
            this.f9687b = params.getTextDirection();
            this.f9688c = params.getBreakStrategy();
            this.f9689d = params.getHyphenationFrequency();
            this.f9690e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        public boolean a(a aVar) {
            if (this.f9688c != aVar.b() || this.f9689d != aVar.c() || this.f9686a.getTextSize() != aVar.e().getTextSize() || this.f9686a.getTextScaleX() != aVar.e().getTextScaleX() || this.f9686a.getTextSkewX() != aVar.e().getTextSkewX() || this.f9686a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f9686a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f9686a.getFlags() != aVar.e().getFlags() || !this.f9686a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return false;
            }
            if (this.f9686a.getTypeface() == null) {
                return aVar.e().getTypeface() == null;
            }
            return this.f9686a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f9688c;
        }

        public int c() {
            return this.f9689d;
        }

        public TextDirectionHeuristic d() {
            return this.f9687b;
        }

        public TextPaint e() {
            return this.f9686a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f9687b == aVar.d();
        }

        public int hashCode() {
            return d.b(Float.valueOf(this.f9686a.getTextSize()), Float.valueOf(this.f9686a.getTextScaleX()), Float.valueOf(this.f9686a.getTextSkewX()), Float.valueOf(this.f9686a.getLetterSpacing()), Integer.valueOf(this.f9686a.getFlags()), this.f9686a.getTextLocales(), this.f9686a.getTypeface(), Boolean.valueOf(this.f9686a.isElegantTextHeight()), this.f9687b, Integer.valueOf(this.f9688c), Integer.valueOf(this.f9689d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f9686a.getTextSize());
            sb.append(", textScaleX=" + this.f9686a.getTextScaleX());
            sb.append(", textSkewX=" + this.f9686a.getTextSkewX());
            sb.append(", letterSpacing=" + this.f9686a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f9686a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f9686a.getTextLocales());
            sb.append(", typeface=" + this.f9686a.getTypeface());
            sb.append(", variationSettings=" + this.f9686a.getFontVariationSettings());
            sb.append(", textDir=" + this.f9687b);
            sb.append(", breakStrategy=" + this.f9688c);
            sb.append(", hyphenationFrequency=" + this.f9689d);
            sb.append("}");
            return sb.toString();
        }
    }
}
