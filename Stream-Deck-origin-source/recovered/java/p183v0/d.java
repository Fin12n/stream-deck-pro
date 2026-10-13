package p183v0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC2633k;
import p073i0.k;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e {
    public /* synthetic */ d(boolean z8, float f8, q1 q1Var, AbstractC2633k abstractC2633k) {
        this(z8, f8, q1Var);
    }

    @Override // p183v0.e
    public m b(k kVar, boolean z8, float f8, q1 q1Var, q1 q1Var2, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(331259447);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(331259447, i8, -1, "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:63)");
        }
        ViewGroup viewGroupC = c(interfaceC3163l, (i8 >> 15) & 14);
        interfaceC3163l.f(1643267293);
        if (viewGroupC.isInEditMode()) {
            interfaceC3163l.f(511388516);
            boolean zR = interfaceC3163l.R(kVar) | interfaceC3163l.R(this);
            Object objG = interfaceC3163l.g();
            if (zR || objG == InterfaceC3163l.f38803a.a()) {
                b bVar = new b(z8, f8, q1Var, q1Var2, null);
                interfaceC3163l.H(bVar);
                objG = bVar;
            }
            interfaceC3163l.N();
            b bVar2 = (b) objG;
            interfaceC3163l.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163l.N();
            return bVar2;
        }
        interfaceC3163l.N();
        interfaceC3163l.f(1618982084);
        boolean zR2 = interfaceC3163l.R(kVar) | interfaceC3163l.R(this) | interfaceC3163l.R(viewGroupC);
        Object objG2 = interfaceC3163l.g();
        if (zR2 || objG2 == InterfaceC3163l.f38803a.a()) {
            a aVar = new a(z8, f8, q1Var, q1Var2, viewGroupC, null);
            interfaceC3163l.H(aVar);
            objG2 = aVar;
        }
        interfaceC3163l.N();
        a aVar2 = (a) objG2;
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return aVar2;
    }

    public final ViewGroup c(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-1737891121);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1737891121, i8, -1, "androidx.compose.material.ripple.PlatformRipple.findNearestViewGroup (Ripple.android.kt:86)");
        }
        Object objE = interfaceC3163l.e(AndroidCompositionLocals_androidKt.j());
        while (!(objE instanceof ViewGroup)) {
            ViewParent parent = ((View) objE).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + objE + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            objE = parent;
        }
        ViewGroup viewGroup = (ViewGroup) objE;
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return viewGroup;
    }

    public d(boolean z8, float f8, q1 q1Var) {
        super(z8, f8, q1Var, null);
    }
}
