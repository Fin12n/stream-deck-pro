package p028d0;

import A1.d;
import android.view.ViewConfiguration;
import p037e0.AbstractC2229z;
import p037e0.InterfaceC2227x;
import p065h1.X;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f19604a = ViewConfiguration.getScrollFriction();

    public static final float a() {
        return f19604a;
    }

    public static final InterfaceC2227x b(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(904445851);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(904445851, i8, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        d dVar = (d) interfaceC3163l.e(X.d());
        Float fValueOf = Float.valueOf(dVar.getDensity());
        interfaceC3163l.f(1157296644);
        boolean zR = interfaceC3163l.R(fValueOf);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = AbstractC2229z.a(new D(dVar));
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        InterfaceC2227x interfaceC2227x = (InterfaceC2227x) objG;
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return interfaceC2227x;
    }
}
