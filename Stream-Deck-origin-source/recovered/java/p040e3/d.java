package p040e3;

import C6.G;
import H6.c;
import p004a3.C1705k;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final b a() {
        return new c();
    }

    public static final float c(C1705k c1705k, j jVar, float f8) {
        if (f8 < 0.0f && c1705k == null) {
            return 1.0f;
        }
        if (c1705k == null) {
            return 0.0f;
        }
        if (f8 < 0.0f) {
            if (jVar != null) {
                return jVar.a(c1705k);
            }
            return 1.0f;
        }
        if (jVar != null) {
            return jVar.b(c1705k);
        }
        return 0.0f;
    }

    public static final b d(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(2024497114);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(2024497114, i8, -1, "com.airbnb.lottie.compose.rememberLottieAnimatable (LottieAnimatable.kt:28)");
        }
        interfaceC3163l.f(-610207850);
        Object objG = interfaceC3163l.g();
        if (objG == InterfaceC3163l.f38803a.a()) {
            objG = a();
            interfaceC3163l.H(objG);
        }
        b bVar = (b) objG;
        interfaceC3163l.N();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return bVar;
    }

    public static final Object e(b bVar, G6.d dVar) {
        Object objB = b.a.b(bVar, null, c(bVar.t(), bVar.u(), bVar.j()), 1, false, dVar, 9, null);
        return objB == c.f() ? objB : G.f1419a;
    }
}
