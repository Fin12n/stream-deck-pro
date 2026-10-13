package J3;

import p082j0.J;
import p128o1.I;
import p191w0.Z;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public enum c {
    S,
    M,
    L;


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ J6.a f4146e = J6.b.a(a());

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4147a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.S.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.M.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.L.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4147a = iArr;
        }
    }

    public final J b(InterfaceC3163l interfaceC3163l, int i8) {
        J jB;
        interfaceC3163l.f(1649580165);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1649580165, i8, -1, "com.elgato.streamdeck.ui.components.ButtonSize.<get-contentPadding> (Button.kt:88)");
        }
        int i9 = a.f4147a[ordinal()];
        if (i9 == 1) {
            jB = androidx.compose.foundation.layout.e.b(W3.c.f11463a.h(), A1.h.m(6));
        } else if (i9 == 2) {
            W3.c cVar = W3.c.f11463a;
            jB = androidx.compose.foundation.layout.e.b(cVar.i(), cVar.h());
        } else {
            if (i9 != 3) {
                throw new C6.m();
            }
            W3.c cVar2 = W3.c.f11463a;
            jB = androidx.compose.foundation.layout.e.b(cVar2.j(), cVar2.i());
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return jB;
    }

    public final float c(InterfaceC3163l interfaceC3163l, int i8) {
        float fM;
        interfaceC3163l.f(-616350862);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-616350862, i8, -1, "com.elgato.streamdeck.ui.components.ButtonSize.<get-lineHeight> (Button.kt:95)");
        }
        int i9 = a.f4147a[ordinal()];
        if (i9 == 1) {
            fM = A1.h.m(20);
        } else {
            if (i9 != 2 && i9 != 3) {
                throw new C6.m();
            }
            fM = A1.h.m(24);
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return fM;
    }

    public final I d(InterfaceC3163l interfaceC3163l, int i8) {
        I iB;
        interfaceC3163l.f(1790787762);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1790787762, i8, -1, "com.elgato.streamdeck.ui.components.ButtonSize.<get-textStyle> (Button.kt:82)");
        }
        int i9 = a.f4147a[ordinal()];
        if (i9 == 1) {
            interfaceC3163l.f(2064601709);
            iB = Z.f35786a.c(interfaceC3163l, Z.f35787b).b();
            interfaceC3163l.N();
        } else {
            if (i9 != 2 && i9 != 3) {
                interfaceC3163l.f(2064598383);
                interfaceC3163l.N();
                throw new C6.m();
            }
            interfaceC3163l.f(2064601765);
            iB = Z.f35786a.c(interfaceC3163l, Z.f35787b).a();
            interfaceC3163l.N();
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return iB;
    }
}
