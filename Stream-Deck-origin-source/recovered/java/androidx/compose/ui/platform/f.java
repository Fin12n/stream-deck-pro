package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f extends androidx.compose.ui.platform.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14911d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f14912e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static f f14913f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BreakIterator f14914c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final f a(Locale locale) {
            if (f.f14913f == null) {
                f.f14913f = new f(locale, null);
            }
            f fVar = f.f14913f;
            t.e(fVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return fVar;
        }

        public a() {
        }
    }

    public /* synthetic */ f(Locale locale, AbstractC2633k abstractC2633k) {
        this(locale);
    }

    private final boolean i(int i8) {
        if (i8 <= 0 || !j(i8 - 1)) {
            return false;
        }
        return i8 == d().length() || !j(i8);
    }

    private final boolean k(int i8) {
        if (j(i8)) {
            return i8 == 0 || !j(i8 - 1);
        }
        return false;
    }

    private final void l(Locale locale) {
        this.f14914c = BreakIterator.getWordInstance(locale);
    }

    @Override // p065h1.InterfaceC2380b
    public int[] a(int i8) {
        if (d().length() <= 0 || i8 >= d().length()) {
            return null;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        while (!j(i8) && !k(i8)) {
            BreakIterator breakIterator = this.f14914c;
            if (breakIterator == null) {
                t.t("impl");
                breakIterator = null;
            }
            i8 = breakIterator.following(i8);
            if (i8 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f14914c;
        if (breakIterator2 == null) {
            t.t("impl");
            breakIterator2 = null;
        }
        int iFollowing = breakIterator2.following(i8);
        if (iFollowing == -1 || !i(iFollowing)) {
            return null;
        }
        return c(i8, iFollowing);
    }

    @Override // p065h1.InterfaceC2380b
    public int[] b(int i8) {
        int length = d().length();
        if (length <= 0 || i8 <= 0) {
            return null;
        }
        if (i8 > length) {
            i8 = length;
        }
        while (i8 > 0 && !j(i8 - 1) && !i(i8)) {
            BreakIterator breakIterator = this.f14914c;
            if (breakIterator == null) {
                t.t("impl");
                breakIterator = null;
            }
            i8 = breakIterator.preceding(i8);
            if (i8 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f14914c;
        if (breakIterator2 == null) {
            t.t("impl");
            breakIterator2 = null;
        }
        int iPreceding = breakIterator2.preceding(i8);
        if (iPreceding == -1 || !k(iPreceding)) {
            return null;
        }
        return c(iPreceding, i8);
    }

    @Override // androidx.compose.ui.platform.a
    public void e(String str) {
        super.e(str);
        BreakIterator breakIterator = this.f14914c;
        if (breakIterator == null) {
            t.t("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    public final boolean j(int i8) {
        if (i8 < 0 || i8 >= d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(d().codePointAt(i8));
    }

    public f(Locale locale) {
        l(locale);
    }
}
