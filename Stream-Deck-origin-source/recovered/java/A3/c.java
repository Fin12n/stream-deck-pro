package A3;

import C6.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2252x;
import p038e1.H;
import p056g1.InterfaceC2343g;
import p082j0.AbstractC2601e;
import p191w0.AbstractC3079p0;
import p191w0.Z;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3184w;
import p215z0.R0;
import p215z0.v1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f515a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Q6.o f516b = H0.c.c(-1105075328, false, a.f517a);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f517a = new a();

        public a() {
            super(2);
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1105075328, i8, -1, "com.elgato.streamdeck.purchase.ComposableSingletons$PurchaseScreenKt.lambda-1.<anonymous> (PurchaseScreen.kt:220)");
            }
            L0.c cVarE = L0.c.f4806a.e();
            interfaceC3163l.f(733328855);
            L0.i.a aVar = L0.i.f4836a;
            H hG = AbstractC2601e.g(cVarE, false, interfaceC3163l, 6);
            interfaceC3163l.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163l, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
            InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar2.a();
            Q6.p pVarB = AbstractC2252x.b(aVar);
            if (interfaceC3163l.t() == null) {
                AbstractC3157i.c();
            }
            interfaceC3163l.r();
            if (interfaceC3163l.m()) {
                interfaceC3163l.w(function0A);
            } else {
                interfaceC3163l.G();
            }
            InterfaceC3163l interfaceC3163lA = v1.a(interfaceC3163l);
            v1.b(interfaceC3163lA, hG, aVar2.c());
            v1.b(interfaceC3163lA, interfaceC3184wE, aVar2.e());
            Q6.o oVarB = aVar2.b();
            if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
            interfaceC3163l.f(2058660585);
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f14485a;
            L0.i iVarP = androidx.compose.foundation.layout.f.p(aVar, A1.h.m(64));
            Z z8 = Z.f35786a;
            int i9 = Z.f35787b;
            AbstractC3079p0.a(iVarP, z8.a(interfaceC3163l, i9).B(), 0.0f, z8.a(interfaceC3163l, i9).P(), 0, interfaceC3163l, 6, 20);
            interfaceC3163l.N();
            interfaceC3163l.O();
            interfaceC3163l.N();
            interfaceC3163l.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public final Q6.o a() {
        return f516b;
    }
}
