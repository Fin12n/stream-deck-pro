package U1;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: U1.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1650l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f10153a;

    /* JADX INFO: renamed from: U1.l$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        public static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    /* JADX INFO: renamed from: U1.l$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {
        public static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }

    /* JADX INFO: renamed from: U1.l$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c {
        public static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        public static Insets b(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    public C1650l(Rect rect, List<Rect> list) {
        this(a.a(rect, list));
    }

    public static DisplayCutout a(L1.h hVar, Rect rect, Rect rect2, Rect rect3, Rect rect4, L1.h hVar2) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            return c.a(hVar.e(), rect, rect2, rect3, rect4, hVar2.e());
        }
        if (i8 >= 29) {
            return b.a(hVar.e(), rect, rect2, rect3, rect4);
        }
        Rect rect5 = new Rect(hVar.f4939a, hVar.f4940b, hVar.f4941c, hVar.f4942d);
        ArrayList arrayList = new ArrayList();
        if (rect != null) {
            arrayList.add(rect);
        }
        if (rect2 != null) {
            arrayList.add(rect2);
        }
        if (rect3 != null) {
            arrayList.add(rect3);
        }
        if (rect4 != null) {
            arrayList.add(rect4);
        }
        return a.a(rect5, arrayList);
    }

    public static C1650l g(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C1650l(displayCutout);
    }

    public int b() {
        return a.c(this.f10153a);
    }

    public int c() {
        return a.d(this.f10153a);
    }

    public int d() {
        return a.e(this.f10153a);
    }

    public int e() {
        return a.f(this.f10153a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1650l.class != obj.getClass()) {
            return false;
        }
        return T1.d.a(this.f10153a, ((C1650l) obj).f10153a);
    }

    public L1.h f() {
        return Build.VERSION.SDK_INT >= 30 ? L1.h.d(c.b(this.f10153a)) : L1.h.f4938e;
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f10153a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f10153a + "}";
    }

    public C1650l(L1.h hVar, Rect rect, Rect rect2, Rect rect3, Rect rect4, L1.h hVar2) {
        this(a(hVar, rect, rect2, rect3, rect4, hVar2));
    }

    public C1650l(DisplayCutout displayCutout) {
        this.f10153a = displayCutout;
    }
}
