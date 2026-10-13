package p215z0;

import D6.C0934n;
import J0.v;
import J0.x;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class l1 {
    public static final v a() {
        return new v();
    }

    public static final v b(Object... objArr) {
        v vVar = new v();
        vVar.addAll(C0934n.r0(objArr));
        return vVar;
    }

    public static final x c() {
        return new x();
    }

    public static final InterfaceC3164l0 d(Object obj, f1 f1Var) {
        return AbstractC3143b.d(obj, f1Var);
    }

    public static /* synthetic */ InterfaceC3164l0 e(Object obj, f1 f1Var, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            f1Var = g1.r();
        }
        return g1.i(obj, f1Var);
    }

    public static final q1 f(Object obj, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-1058319986);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1058319986, i8, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:303)");
        }
        interfaceC3163l.f(-492369756);
        Object objG = interfaceC3163l.g();
        if (objG == InterfaceC3163l.f38803a.a()) {
            objG = e(obj, null, 2, null);
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) objG;
        interfaceC3164l0.setValue(obj);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return interfaceC3164l0;
    }

    public static final v g(Collection collection) {
        v vVar = new v();
        vVar.addAll(collection);
        return vVar;
    }
}
