package androidx.compose.ui.platform;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e extends androidx.compose.ui.platform.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14909c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static e f14910d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final e a() {
            if (e.f14910d == null) {
                e.f14910d = new e(null);
            }
            e eVar = e.f14910d;
            t.e(eVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
            return eVar;
        }

        public a() {
        }
    }

    public /* synthetic */ e(AbstractC2633k abstractC2633k) {
        this();
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
        while (i8 < length && d().charAt(i8) == '\n' && !j(i8)) {
            i8++;
        }
        if (i8 >= length) {
            return null;
        }
        int i9 = i8 + 1;
        while (i9 < length && !i(i9)) {
            i9++;
        }
        return c(i8, i9);
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
        while (i8 > 0 && d().charAt(i8 - 1) == '\n' && !i(i8)) {
            i8--;
        }
        if (i8 <= 0) {
            return null;
        }
        int i9 = i8 - 1;
        while (i9 > 0 && !j(i9)) {
            i9--;
        }
        return c(i9, i8);
    }

    public final boolean i(int i8) {
        if (i8 <= 0 || d().charAt(i8 - 1) == '\n') {
            return false;
        }
        return i8 == d().length() || d().charAt(i8) == '\n';
    }

    public final boolean j(int i8) {
        if (d().charAt(i8) != '\n') {
            return i8 == 0 || d().charAt(i8 - 1) == '\n';
        }
        return false;
    }

    public e() {
    }
}
