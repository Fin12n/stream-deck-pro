package p215z0;

import G6.g;
import Q6.k;
import Q6.o;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import p017b7.AbstractC1823z0;
import p017b7.B0;
import p017b7.InterfaceC1815v0;
import p017b7.InterfaceC1818x;
import p017b7.J;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f38626a = new I();

    public static final void a(Object obj, k kVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-1371986847);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1371986847, i8, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:155)");
        }
        interfaceC3163l.f(1157296644);
        boolean zR = interfaceC3163l.R(obj);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            interfaceC3163l.H(new G(kVar));
        }
        interfaceC3163l.N();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
    }

    public static final void b(Object obj, Object obj2, k kVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(1429097729);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1429097729, i8, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:195)");
        }
        interfaceC3163l.f(511388516);
        boolean zR = interfaceC3163l.R(obj) | interfaceC3163l.R(obj2);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            interfaceC3163l.H(new G(kVar));
        }
        interfaceC3163l.N();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
    }

    public static final void c(Object obj, Object obj2, Object obj3, k kVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-1239538271);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1239538271, i8, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:236)");
        }
        interfaceC3163l.f(1618982084);
        boolean zR = interfaceC3163l.R(obj) | interfaceC3163l.R(obj2) | interfaceC3163l.R(obj3);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            interfaceC3163l.H(new G(kVar));
        }
        interfaceC3163l.N();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
    }

    public static final void d(Object obj, o oVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(1179185413);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1179185413, i8, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:337)");
        }
        g gVarC = interfaceC3163l.C();
        interfaceC3163l.f(1157296644);
        boolean zR = interfaceC3163l.R(obj);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            interfaceC3163l.H(new Y(gVarC, oVar));
        }
        interfaceC3163l.N();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
    }

    public static final void e(Object obj, Object obj2, o oVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(590241125);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(590241125, i8, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        g gVarC = interfaceC3163l.C();
        interfaceC3163l.f(511388516);
        boolean zR = interfaceC3163l.R(obj) | interfaceC3163l.R(obj2);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            interfaceC3163l.H(new Y(gVarC, oVar));
        }
        interfaceC3163l.N();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
    }

    public static final void f(Object[] objArr, o oVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-139560008);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-139560008, i8, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:417)");
        }
        g gVarC = interfaceC3163l.C();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        interfaceC3163l.f(-568225417);
        boolean zR = false;
        for (Object obj : objArrCopyOf) {
            zR |= interfaceC3163l.R(obj);
        }
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            interfaceC3163l.H(new Y(gVarC, oVar));
        }
        interfaceC3163l.N();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
    }

    public static final void g(Function0 function0, InterfaceC3163l interfaceC3163l, int i8) {
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1288466761, i8, -1, "androidx.compose.runtime.SideEffect (Effects.kt:48)");
        }
        interfaceC3163l.S(function0);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
    }

    public static final J i(g gVar, InterfaceC3163l interfaceC3163l) {
        InterfaceC1815v0.b bVar = InterfaceC1815v0.f15985O;
        if (gVar.A(bVar) == null) {
            g gVarC = interfaceC3163l.C();
            return p017b7.K.a(gVarC.P1(AbstractC1823z0.a((InterfaceC1815v0) gVarC.A(bVar))).P1(gVar));
        }
        InterfaceC1818x interfaceC1818xB = B0.b(null, 1, null);
        interfaceC1818xB.v(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return p017b7.K.a(interfaceC1818xB);
    }
}
