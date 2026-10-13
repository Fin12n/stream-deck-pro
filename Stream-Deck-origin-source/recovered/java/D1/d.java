package D1;

import android.view.View;
import p038e1.AbstractC2248t;
import p056g1.F;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1774a = new a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements p002a1.a {
    }

    public static final void f(View view, F f8) {
        long jE = AbstractC2248t.e(f8.g());
        int iD = S6.c.d(Q0.f.o(jE));
        int iD2 = S6.c.d(Q0.f.p(jE));
        view.layout(iD, iD2, view.getMeasuredWidth() + iD, view.getMeasuredHeight() + iD2);
    }

    public static final float g(int i8) {
        return i8 * (-1);
    }

    public static final float h(float f8) {
        return f8 * (-1.0f);
    }

    public static final int i(int i8) {
        return i8 == 0 ? p002a1.e.f13022a.a() : p002a1.e.f13022a.b();
    }
}
