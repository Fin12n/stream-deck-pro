package p144q1;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC2633k;
import p136p1.e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f31983e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f31984f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f31985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BreakIterator f31988d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final boolean a(int i8) {
            int type = Character.getType(i8);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        public a() {
        }
    }

    public b(CharSequence charSequence, int i8, int i9, Locale locale) {
        this.f31985a = charSequence;
        if (i8 < 0 || i8 > charSequence.length()) {
            throw new IllegalArgumentException("input start index is outside the CharSequence");
        }
        if (i9 < 0 || i9 > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f31988d = wordInstance;
        this.f31986b = Math.max(0, i8 - 50);
        this.f31987c = Math.min(charSequence.length(), i9 + 50);
        wordInstance.setText(new e(charSequence, i8, i9));
    }

    public final void a(int i8) {
        int i9 = this.f31986b;
        if (i8 > this.f31987c || i9 > i8) {
            throw new IllegalArgumentException(("Invalid offset: " + i8 + ". Valid range is [" + this.f31986b + " , " + this.f31987c + ']').toString());
        }
    }

    public final int b(int i8, boolean z8) {
        a(i8);
        if (j(i8)) {
            return (!this.f31988d.isBoundary(i8) || (h(i8) && z8)) ? this.f31988d.preceding(i8) : i8;
        }
        if (h(i8)) {
            return this.f31988d.preceding(i8);
        }
        return -1;
    }

    public final int c(int i8, boolean z8) {
        a(i8);
        if (h(i8)) {
            return (!this.f31988d.isBoundary(i8) || (j(i8) && z8)) ? this.f31988d.following(i8) : i8;
        }
        if (j(i8)) {
            return this.f31988d.following(i8);
        }
        return -1;
    }

    public final int d(int i8) {
        return c(i8, true);
    }

    public final int e(int i8) {
        return b(i8, true);
    }

    public final int f(int i8) {
        a(i8);
        while (i8 != -1 && !m(i8)) {
            i8 = o(i8);
        }
        return i8;
    }

    public final int g(int i8) {
        a(i8);
        while (i8 != -1 && !l(i8)) {
            i8 = n(i8);
        }
        return i8;
    }

    public final boolean h(int i8) {
        return i8 <= this.f31987c && this.f31986b + 1 <= i8 && Character.isLetterOrDigit(Character.codePointBefore(this.f31985a, i8));
    }

    public final boolean i(int i8) {
        int i9 = this.f31986b + 1;
        if (i8 > this.f31987c || i9 > i8) {
            return false;
        }
        return f31983e.a(Character.codePointBefore(this.f31985a, i8));
    }

    public final boolean j(int i8) {
        return i8 < this.f31987c && this.f31986b <= i8 && Character.isLetterOrDigit(Character.codePointAt(this.f31985a, i8));
    }

    public final boolean k(int i8) {
        int i9 = this.f31986b;
        if (i8 >= this.f31987c || i9 > i8) {
            return false;
        }
        return f31983e.a(Character.codePointAt(this.f31985a, i8));
    }

    public final boolean l(int i8) {
        return !k(i8) && i(i8);
    }

    public final boolean m(int i8) {
        return k(i8) && !i(i8);
    }

    public final int n(int i8) {
        a(i8);
        return this.f31988d.following(i8);
    }

    public final int o(int i8) {
        a(i8);
        return this.f31988d.preceding(i8);
    }
}
