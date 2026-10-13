package p021c2;

import U1.O;
import android.view.View;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f16051a = d.f16055b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16052b = d.f16054a;

    public static final void a(View view, b listener) {
        t.g(view, "<this>");
        t.g(listener, "listener");
        b(view).a(listener);
    }

    public static final c b(View view) {
        int i8 = f16051a;
        c cVar = (c) view.getTag(i8);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        view.setTag(i8, cVar2);
        return cVar2;
    }

    public static final boolean c(View view) {
        t.g(view, "<this>");
        Object tag = view.getTag(f16052b);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(View view) {
        t.g(view, "<this>");
        for (Object obj : O.a(view)) {
            if ((obj instanceof View) && c((View) obj)) {
                return true;
            }
        }
        return false;
    }

    public static final void e(View view, b listener) {
        t.g(view, "<this>");
        t.g(listener, "listener");
        b(view).b(listener);
    }
}
