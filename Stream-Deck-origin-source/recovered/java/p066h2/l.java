package p066h2;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class l implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24411a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Spannable f24412b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        public static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {
        public abstract boolean a(CharSequence charSequence);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c extends b {
        @Override // h2.l.b
        public boolean a(CharSequence charSequence) {
            return charSequence instanceof PrecomputedText;
        }
    }

    public l(Spannable spannable) {
        this.f24412b = spannable;
    }

    public static b c() {
        return new c();
    }

    public final void a() {
        Spannable spannable = this.f24412b;
        if (!this.f24411a && c().a(spannable)) {
            this.f24412b = new SpannableString(spannable);
        }
        this.f24411a = true;
    }

    public Spannable b() {
        return this.f24412b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i8) {
        return this.f24412b.charAt(i8);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.f24412b);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.f24412b);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f24412b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f24412b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f24412b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i8, int i9, Class cls) {
        return this.f24412b.getSpans(i8, i9, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f24412b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i8, int i9, Class cls) {
        return this.f24412b.nextSpanTransition(i8, i9, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f24412b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i8, int i9, int i10) {
        a();
        this.f24412b.setSpan(obj, i8, i9, i10);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i8, int i9) {
        return this.f24412b.subSequence(i8, i9);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f24412b.toString();
    }

    public l(CharSequence charSequence) {
        this.f24412b = new SpannableString(charSequence);
    }
}
