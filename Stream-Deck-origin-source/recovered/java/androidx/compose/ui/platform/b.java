package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b extends androidx.compose.ui.platform.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14891d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f14892e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static b f14893f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BreakIterator f14894c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final b a(Locale locale) {
            if (b.f14893f == null) {
                b.f14893f = new b(locale, null);
            }
            b bVar = b.f14893f;
            t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return bVar;
        }

        public a() {
        }
    }

    public /* synthetic */ b(Locale locale, AbstractC2633k abstractC2633k) {
        this(locale);
    }

    @Override // p065h1.InterfaceC2380b
    public int[] a(int i8) {
        int length = d().length();
        if (length <= 0 || i8 >= length) {
            return null;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        do {
            BreakIterator breakIterator = this.f14894c;
            if (breakIterator == null) {
                t.t("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i8)) {
                BreakIterator breakIterator2 = this.f14894c;
                if (breakIterator2 == null) {
                    t.t("impl");
                    breakIterator2 = null;
                }
                int iFollowing = breakIterator2.following(i8);
                if (iFollowing == -1) {
                    return null;
                }
                return c(i8, iFollowing);
            }
            BreakIterator breakIterator3 = this.f14894c;
            if (breakIterator3 == null) {
                t.t("impl");
                breakIterator3 = null;
            }
            i8 = breakIterator3.following(i8);
        } while (i8 != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.f14894c;
            if (breakIterator == null) {
                t.t("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i8)) {
                BreakIterator breakIterator2 = this.f14894c;
                if (breakIterator2 == null) {
                    t.t("impl");
                    breakIterator2 = null;
                }
                int iPreceding = breakIterator2.preceding(i8);
                if (iPreceding == -1) {
                    return null;
                }
                return c(iPreceding, i8);
            }
            BreakIterator breakIterator3 = this.f14894c;
            if (breakIterator3 == null) {
                t.t("impl");
                breakIterator3 = null;
            }
            i8 = breakIterator3.preceding(i8);
        } while (i8 != -1);
        return null;
    }

    @Override // androidx.compose.ui.platform.a
    public void e(String str) {
        super.e(str);
        BreakIterator breakIterator = this.f14894c;
        if (breakIterator == null) {
            t.t("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    public final void i(Locale locale) {
        this.f14894c = BreakIterator.getCharacterInstance(locale);
    }

    public b(Locale locale) {
        i(locale);
    }
}
