package p191w0;

import A1.h;
import R0.C1598l0;
import R0.U0;
import p037e0.AbstractC2207c;
import p037e0.AbstractC2214j;
import p046f0.C2280h;
import p073i0.f;
import p073i0.k;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class J0 {
    public static final q1 b(boolean z8, boolean z9, k kVar, H0 h8, float f8, float f9, InterfaceC3163l interfaceC3163l, int i8) {
        q1 q1VarP;
        interfaceC3163l.f(-1633063017);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1633063017, i8, -1, "androidx.compose.material3.animateBorderStrokeAsState (TextFieldDefaults.kt:2386)");
        }
        q1 q1VarA = f.a(kVar, interfaceC3163l, (i8 >> 6) & 14);
        q1 q1VarH = h8.h(z8, z9, kVar, interfaceC3163l, i8 & 8190);
        float f10 = c(q1VarA) ? f8 : f9;
        if (z8) {
            interfaceC3163l.f(-1927721478);
            q1VarP = AbstractC2207c.c(f10, AbstractC2214j.i(150, 0, null, 6, null), null, null, interfaceC3163l, 48, 12);
            interfaceC3163l.N();
        } else {
            interfaceC3163l.f(-1927721380);
            q1VarP = g1.p(h.d(f9), interfaceC3163l, (i8 >> 15) & 14);
            interfaceC3163l.N();
        }
        q1 q1VarP2 = g1.p(new C2280h(((h) q1VarP.getValue()).w(), new U0(((C1598l0) q1VarH.getValue()).y(), null), null), interfaceC3163l, 0);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return q1VarP2;
    }

    public static final boolean c(q1 q1Var) {
        return ((Boolean) q1Var.getValue()).booleanValue();
    }
}
