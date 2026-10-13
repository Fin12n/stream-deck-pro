package p082j0;

import L0.h;
import L0.i;
import Q6.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p056g1.InterfaceC2343g;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3184w;
import p215z0.v1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class X {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f27902a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0 function0) {
            super(0);
            this.f27902a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f27902a.invoke();
        }
    }

    public static final void a(i iVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-72882467);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-72882467, i8, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:38)");
        }
        Y y8 = Y.f27903a;
        interfaceC3163l.f(544976794);
        int iA = AbstractC3157i.a(interfaceC3163l, 0);
        i iVarC = h.c(interfaceC3163l, iVar);
        InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
        InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
        Function0 function0A = aVar.a();
        interfaceC3163l.f(1405779621);
        if (interfaceC3163l.t() == null) {
            AbstractC3157i.c();
        }
        interfaceC3163l.r();
        if (interfaceC3163l.m()) {
            interfaceC3163l.w(new a(function0A));
        } else {
            interfaceC3163l.G();
        }
        InterfaceC3163l interfaceC3163lA = v1.a(interfaceC3163l);
        v1.b(interfaceC3163lA, y8, aVar.c());
        v1.b(interfaceC3163lA, interfaceC3184wE, aVar.e());
        v1.b(interfaceC3163lA, iVarC, aVar.d());
        o oVarB = aVar.b();
        if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
            interfaceC3163lA.H(Integer.valueOf(iA));
            interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
        }
        interfaceC3163l.O();
        interfaceC3163l.N();
        interfaceC3163l.N();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
    }
}
