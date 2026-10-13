package K3;

import A1.h;
import kotlin.jvm.internal.t;
import p065h1.X;
import p082j0.J;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final J a(J j8, J paddingValues, InterfaceC3163l interfaceC3163l, int i8) {
        t.g(j8, "<this>");
        t.g(paddingValues, "paddingValues");
        interfaceC3163l.f(463214167);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(463214167, i8, -1, "com.elgato.streamdeck.ui.helper.plus (PaddingValuesExt.kt:9)");
        }
        A1.t tVar = (A1.t) interfaceC3163l.e(X.i());
        J jD = androidx.compose.foundation.layout.e.d(h.m(androidx.compose.foundation.layout.e.g(j8, tVar) + androidx.compose.foundation.layout.e.g(paddingValues, tVar)), h.m(j8.d() + paddingValues.d()), h.m(androidx.compose.foundation.layout.e.f(j8, tVar) + androidx.compose.foundation.layout.e.f(paddingValues, tVar)), h.m(j8.a() + paddingValues.a()));
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return jD;
    }
}
