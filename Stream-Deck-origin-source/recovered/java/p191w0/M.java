package p191w0;

import R0.C1598l0;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M f35570a = new M();

    public final L a(C3089v c3089v, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(1437915677);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1437915677, i8, -1, "androidx.compose.material3.IconButtonDefaults.<get-defaultIconButtonColors> (IconButton.kt:589)");
        }
        L lF = c3089v.f();
        if (lF == null) {
            long jY = ((C1598l0) interfaceC3163l.e(B.a())).y();
            C1598l0.a aVar = C1598l0.f9405b;
            L l8 = new L(aVar.d(), jY, aVar.d(), C1598l0.o(jY, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            c3089v.W(l8);
            lF = l8;
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return lF;
    }

    public final L b(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-1519621781);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1519621781, i8, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:551)");
        }
        L lA = a(Z.f35786a.a(interfaceC3163l, 6), interfaceC3163l, (i8 << 3) & 112);
        long jY = ((C1598l0) interfaceC3163l.e(B.a())).y();
        if (C1598l0.q(lA.e(), jY)) {
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163l.N();
            return lA;
        }
        L lD = L.d(lA, 0L, jY, 0L, C1598l0.o(jY, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return lD;
    }
}
