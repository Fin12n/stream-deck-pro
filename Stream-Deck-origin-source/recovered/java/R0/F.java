package R0;

import android.graphics.Canvas;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Canvas f9301a = new Canvas();

    public static final InterfaceC1586f0 a(InterfaceC1621x0 interfaceC1621x0) {
        E e8 = new E();
        e8.z(new Canvas(J.b(interfaceC1621x0)));
        return e8;
    }

    public static final InterfaceC1586f0 b(Canvas canvas) {
        E e8 = new E();
        e8.z(canvas);
        return e8;
    }

    public static final Canvas d(InterfaceC1586f0 interfaceC1586f0) {
        kotlin.jvm.internal.t.e(interfaceC1586f0, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((E) interfaceC1586f0).a();
    }
}
