package A3;

import C6.G;
import Z6.w;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2252x;
import p038e1.H;
import p046f0.AbstractC2278f;
import p056g1.InterfaceC2343g;
import p082j0.AbstractC2607k;
import p082j0.C2598b;
import p082j0.C2609m;
import p082j0.X;
import p191w0.AbstractC3091w;
import p191w0.P0;
import p191w0.Z;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3184w;
import p215z0.R0;
import p215z0.v1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ L0.i f596c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f597d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f598e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, boolean z8, L0.i iVar, Function0 function0, int i8) {
            super(2);
            this.f594a = gVar;
            this.f595b = z8;
            this.f596c = iVar;
            this.f597d = function0;
            this.f598e = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            j.a(this.f594a, this.f595b, this.f596c, this.f597d, interfaceC3163l, F0.a(this.f598e | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(g product, boolean z8, L0.i modifier, Function0 onClick, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        long jK;
        InterfaceC3163l interfaceC3163l2;
        t.g(product, "product");
        t.g(modifier, "modifier");
        t.g(onClick, "onClick");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1869716175);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.R(product) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= interfaceC3163lP.c(z8) ? 32 : 16;
        }
        if ((i8 & 896) == 0) {
            i9 |= interfaceC3163lP.R(modifier) ? 256 : 128;
        }
        if ((i8 & 7168) == 0) {
            i9 |= interfaceC3163lP.l(onClick) ? 2048 : 1024;
        }
        if ((i9 & 5851) == 1170 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
            interfaceC3163l2 = interfaceC3163lP;
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1869716175, i9, -1, "com.elgato.streamdeck.purchase.ProductView (ProductView.kt:36)");
            }
            float f8 = 2;
            float fM = A1.h.m(f8);
            if (z8) {
                interfaceC3163lP.f(-1432133023);
                jK = Z.f35786a.a(interfaceC3163lP, Z.f35787b).B();
                interfaceC3163lP.N();
            } else {
                interfaceC3163lP.f(-1432132976);
                jK = Z.f35786a.a(interfaceC3163lP, Z.f35787b).K();
                interfaceC3163lP.N();
            }
            long jC = AbstractC3091w.c(jK, interfaceC3163lP, 0);
            interfaceC3163lP.f(-483455358);
            C2598b c2598b = C2598b.f27914a;
            C2598b.l lVarG = c2598b.g();
            L0.c.a aVar = L0.c.f4806a;
            H hA = AbstractC2607k.a(lVarG, aVar.i(), interfaceC3163lP, 0);
            interfaceC3163lP.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163lP, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163lP.E();
            InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar2.a();
            Q6.p pVarB = AbstractC2252x.b(modifier);
            if (interfaceC3163lP.t() == null) {
                AbstractC3157i.c();
            }
            interfaceC3163lP.r();
            if (interfaceC3163lP.m()) {
                interfaceC3163lP.w(function0A);
            } else {
                interfaceC3163lP.G();
            }
            InterfaceC3163l interfaceC3163lA = v1.a(interfaceC3163lP);
            v1.b(interfaceC3163lA, hA, aVar2.c());
            v1.b(interfaceC3163lA, interfaceC3184wE, aVar2.e());
            Q6.o oVarB = aVar2.b();
            if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
            interfaceC3163lP.f(2058660585);
            C2609m c2609m = C2609m.f28036a;
            String strC = product.c();
            if (strC == null || w.b0(strC)) {
                interfaceC3163l2 = interfaceC3163lP;
                long j8 = jK;
                interfaceC3163l2.f(1499364896);
                float f9 = 8;
                b(product, AbstractC2278f.f(androidx.compose.foundation.d.e(O0.f.a(L0.i.f4836a, p135p0.g.c(A1.h.m(f9))), false, null, null, onClick, 7, null), fM, j8, p135p0.g.c(A1.h.m(f9))), interfaceC3163l2, 0);
                interfaceC3163l2.N();
            } else {
                interfaceC3163lP.f(1499365166);
                L0.i.a aVar3 = L0.i.f4836a;
                L0.i iVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.e.i(androidx.compose.foundation.c.b(androidx.compose.foundation.d.e(O0.f.a(aVar3, p135p0.g.c(A1.h.m(8))), false, null, null, onClick, 7, null), jK, null, 2, null), A1.h.m(f8)), 0.0f, 1, null);
                L0.c.b bVarF = aVar.f();
                interfaceC3163lP.f(-483455358);
                H hA2 = AbstractC2607k.a(c2598b.g(), bVarF, interfaceC3163lP, 48);
                interfaceC3163lP.f(-1323940314);
                int iA2 = AbstractC3157i.a(interfaceC3163lP, 0);
                InterfaceC3184w interfaceC3184wE2 = interfaceC3163lP.E();
                Function0 function0A2 = aVar2.a();
                Q6.p pVarB2 = AbstractC2252x.b(iVarH);
                if (interfaceC3163lP.t() == null) {
                    AbstractC3157i.c();
                }
                interfaceC3163lP.r();
                if (interfaceC3163lP.m()) {
                    interfaceC3163lP.w(function0A2);
                } else {
                    interfaceC3163lP.G();
                }
                InterfaceC3163l interfaceC3163lA2 = v1.a(interfaceC3163lP);
                v1.b(interfaceC3163lA2, hA2, aVar2.c());
                v1.b(interfaceC3163lA2, interfaceC3184wE2, aVar2.e());
                Q6.o oVarB2 = aVar2.b();
                if (interfaceC3163lA2.m() || !t.c(interfaceC3163lA2.g(), Integer.valueOf(iA2))) {
                    interfaceC3163lA2.H(Integer.valueOf(iA2));
                    interfaceC3163lA2.A(Integer.valueOf(iA2), oVarB2);
                }
                pVarB2.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                interfaceC3163lP.f(2058660585);
                String upperCase = product.c().toUpperCase(Locale.ROOT);
                t.f(upperCase, "toUpperCase(...)");
                P0.b(upperCase, androidx.compose.foundation.layout.e.k(aVar3, 0.0f, A1.h.m(4), 1, null), jC, 0L, null, null, null, 0L, null, p216z1.j.h(p216z1.j.f39010b.a()), 0L, 0, false, 0, 0, null, Z.f35786a.c(interfaceC3163lP, Z.f35787b).f(), interfaceC3163lP, 48, 0, 65016);
                interfaceC3163l2 = interfaceC3163lP;
                b(product, O0.f.a(aVar3, p135p0.g.c(A1.h.m(6))), interfaceC3163l2, 0);
                interfaceC3163l2.N();
                interfaceC3163l2.O();
                interfaceC3163l2.N();
                interfaceC3163l2.N();
                interfaceC3163l2.N();
            }
            interfaceC3163l2.N();
            interfaceC3163l2.O();
            interfaceC3163l2.N();
            interfaceC3163l2.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        p215z0.P0 p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new a(product, z8, modifier, onClick, i8));
        }
    }

    public static final void b(g gVar, L0.i iVar, InterfaceC3163l interfaceC3163l, int i8) {
        L0.i.a aVar;
        Z z8;
        int i9;
        interfaceC3163l.f(1730107535);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1730107535, i8, -1, "com.elgato.streamdeck.purchase.ProductView.<anonymous>.Content (ProductView.kt:45)");
        }
        Z z9 = Z.f35786a;
        int i10 = Z.f35787b;
        L0.i iVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.c.b(iVar, z9.a(interfaceC3163l, i10).a(), null, 2, null), 0.0f, 1, null);
        W3.c cVar = W3.c.f11463a;
        L0.i iVarJ = androidx.compose.foundation.layout.e.j(iVarH, cVar.g(), cVar.h());
        C2598b.e eVarB = C2598b.f27914a.b();
        L0.c.b bVarF = L0.c.f4806a.f();
        interfaceC3163l.f(-483455358);
        H hA = AbstractC2607k.a(eVarB, bVarF, interfaceC3163l, 54);
        interfaceC3163l.f(-1323940314);
        int iA = AbstractC3157i.a(interfaceC3163l, 0);
        InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
        InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
        Function0 function0A = aVar2.a();
        Q6.p pVarB = AbstractC2252x.b(iVarJ);
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
        v1.b(interfaceC3163lA, hA, aVar2.c());
        v1.b(interfaceC3163lA, interfaceC3184wE, aVar2.e());
        Q6.o oVarB = aVar2.b();
        if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
            interfaceC3163lA.H(Integer.valueOf(iA));
            interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
        }
        pVarB.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
        interfaceC3163l.f(2058660585);
        C2609m c2609m = C2609m.f28036a;
        String upperCase = gVar.m().toUpperCase(Locale.ROOT);
        t.f(upperCase, "toUpperCase(...)");
        z1.j.a aVar3 = p216z1.j.f39010b;
        P0.b(upperCase, null, 0L, 0L, null, null, null, 0L, null, p216z1.j.h(aVar3.a()), 0L, 0, false, 0, 0, null, z9.c(interfaceC3163l, i10).f(), interfaceC3163l, 0, 0, 65022);
        InterfaceC3163l interfaceC3163l2 = interfaceC3163l;
        L0.i.a aVar4 = L0.i.f4836a;
        boolean z10 = false;
        X.a(androidx.compose.foundation.layout.f.i(aVar4, cVar.i()), interfaceC3163l2, 0);
        interfaceC3163l2.f(-1980836561);
        String strL = gVar.l();
        if (strL == null || w.b0(strL)) {
            aVar = aVar4;
            z8 = z9;
            i9 = i10;
        } else {
            z8 = z9;
            i9 = i10;
            P0.b(gVar.l(), null, 0L, 0L, null, null, null, 0L, null, p216z1.j.h(aVar3.a()), 0L, 0, false, 0, 0, null, z9.c(interfaceC3163l2, i10).n(), interfaceC3163l, 0, 0, 65022);
            interfaceC3163l2 = interfaceC3163l;
            aVar = aVar4;
            z10 = false;
            X.a(androidx.compose.foundation.layout.f.i(aVar, cVar.i()), interfaceC3163l2, 0);
        }
        interfaceC3163l2.N();
        Z z11 = z8;
        int i11 = i9;
        P0.b(gVar.a(), null, 0L, 0L, null, null, null, 0L, null, p216z1.j.h(aVar3.a()), 0L, 0, false, 0, 0, null, z11.c(interfaceC3163l2, i11).n(), interfaceC3163l, 0, 0, 65022);
        X.a(androidx.compose.foundation.layout.f.i(aVar, cVar.h()), interfaceC3163l, 0);
        P0.b(gVar.g(), null, 0L, 0L, null, null, null, 0L, null, p216z1.j.h(aVar3.a()), 0L, 0, false, 0, 0, null, z11.c(interfaceC3163l, i11).c(), interfaceC3163l, 0, 0, 65022);
        interfaceC3163l.N();
        interfaceC3163l.O();
        interfaceC3163l.N();
        interfaceC3163l.N();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
    }
}
