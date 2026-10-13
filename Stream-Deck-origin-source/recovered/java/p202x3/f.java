package p202x3;

import A1.h;
import A1.r;
import C6.G;
import L0.i;
import Q6.k;
import Q6.o;
import Q6.p;
import android.content.res.Configuration;
import androidx.compose.animation.g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p028d0.AbstractC2203e;
import p028d0.InterfaceC2204f;
import p037e0.AbstractC2214j;
import p038e1.AbstractC2252x;
import p038e1.H;
import p038e1.InterfaceC2247s;
import p056g1.InterfaceC2343g;
import p082j0.AbstractC2607k;
import p082j0.C2598b;
import p082j0.C2609m;
import p082j0.InterfaceC2608l;
import p082j0.J;
import p082j0.S;
import p082j0.T;
import p082j0.U;
import p082j0.X;
import p082j0.d0;
import p082j0.j0;
import p191w0.AbstractC3086t0;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.InterfaceC3184w;
import p215z0.P0;
import p215z0.R0;
import p215z0.l1;
import p215z0.v1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q3.e f37255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f37256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function0 f37257c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f37258d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i f37259e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f37260f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Q3.e eVar, k kVar, Function0 function0, boolean z8, i iVar, int i8) {
            super(2);
            this.f37255a = eVar;
            this.f37256b = kVar;
            this.f37257c = function0;
            this.f37258d = z8;
            this.f37259e = iVar;
            this.f37260f = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            f.a(this.f37255a, this.f37256b, this.f37257c, this.f37258d, this.f37259e, interfaceC3163l, F0.a(this.f37260f | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f37261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C3.b f37262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Q3.b f37263c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f37264d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ o f37265e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Function0 f37266f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f37267g;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3164l0 f37268a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3164l0 interfaceC3164l0) {
                super(1);
                this.f37268a = interfaceC3164l0;
            }

            public final void b(InterfaceC2247s it) {
                t.g(it, "it");
                this.f37268a.setValue(r.b(it.a()));
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((InterfaceC2247s) obj);
                return G.f1419a;
            }
        }

        /* JADX INFO: renamed from: x3.f$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0828b extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3164l0 f37269a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0828b(InterfaceC3164l0 interfaceC3164l0) {
                super(1);
                this.f37269a = interfaceC3164l0;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(C3.b it) {
                t.g(it, "it");
                return Integer.valueOf(it.e(((r) this.f37269a.getValue()).j()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, C3.b bVar, Q3.b bVar2, k kVar, o oVar, Function0 function0, InterfaceC3164l0 interfaceC3164l0) {
            super(3);
            this.f37261a = iVar;
            this.f37262b = bVar;
            this.f37263c = bVar2;
            this.f37264d = kVar;
            this.f37265e = oVar;
            this.f37266f = function0;
            this.f37267g = interfaceC3164l0;
        }

        public final void b(J padding, InterfaceC3163l interfaceC3163l, int i8) {
            int i9;
            t.g(padding, "padding");
            if ((i8 & 14) == 0) {
                i9 = (interfaceC3163l.R(padding) ? 4 : 2) | i8;
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1782563471, i9, -1, "com.elgato.streamdeck.keypad.KeypadScreenContent.<anonymous> (KeypadScreen.kt:203)");
            }
            i iVar = this.f37261a;
            interfaceC3163l.f(-747528323);
            InterfaceC3164l0 interfaceC3164l0 = this.f37267g;
            Object objG = interfaceC3163l.g();
            InterfaceC3163l.a aVar = InterfaceC3163l.f38803a;
            if (objG == aVar.a()) {
                objG = new a(interfaceC3164l0);
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            i iVarA = androidx.compose.ui.layout.c.a(iVar, (k) objG);
            C3.b bVar = this.f37262b;
            interfaceC3163l.f(-747528234);
            InterfaceC3164l0 interfaceC3164l1 = this.f37267g;
            Object objG2 = interfaceC3163l.g();
            if (objG2 == aVar.a()) {
                objG2 = new C0828b(interfaceC3164l1);
                interfaceC3163l.H(objG2);
            }
            interfaceC3163l.N();
            J3.k.a(iVarA, bVar, (k) objG2, null, interfaceC3163l, 384, 8);
            f.c(this.f37263c, this.f37264d, this.f37265e, this.f37266f, androidx.compose.foundation.layout.e.h(i.f4836a, padding), interfaceC3163l, 0, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((J) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f37270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q3.b f37271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C3.b f37272c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f37273d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ o f37274e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Function0 f37275f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f37276g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f37277h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i iVar, Q3.b bVar, C3.b bVar2, k kVar, o oVar, Function0 function0, int i8, int i9) {
            super(2);
            this.f37270a = iVar;
            this.f37271b = bVar;
            this.f37272c = bVar2;
            this.f37273d = kVar;
            this.f37274e = oVar;
            this.f37275f = function0;
            this.f37276g = i8;
            this.f37277h = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            f.b(this.f37270a, this.f37271b, this.f37272c, this.f37273d, this.f37274e, this.f37275f, interfaceC3163l, F0.a(this.f37276g | 1), this.f37277h);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f37278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f37279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f37280c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f37281d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f37282e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Q3.b f37283f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ o f37284g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ k f37285h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f37286i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i iVar, float f8, float f9, float f10, float f11, Q3.b bVar, o oVar, k kVar, Function0 function0) {
            super(3);
            this.f37278a = iVar;
            this.f37279b = f8;
            this.f37280c = f9;
            this.f37281d = f10;
            this.f37282e = f11;
            this.f37283f = bVar;
            this.f37284g = oVar;
            this.f37285h = kVar;
            this.f37286i = function0;
        }

        public final void b(InterfaceC2204f AnimatedVisibility, InterfaceC3163l interfaceC3163l, int i8) {
            t.g(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-536298368, i8, -1, "com.elgato.streamdeck.keypad.KeypadUi.<anonymous> (KeypadScreen.kt:132)");
            }
            if (((Configuration) interfaceC3163l.e(AndroidCompositionLocals_androidKt.f())).orientation == 2) {
                interfaceC3163l.f(460998807);
                i iVarJ = androidx.compose.foundation.layout.e.j(this.f37278a, this.f37279b, this.f37280c);
                C2598b c2598b = C2598b.f27914a;
                C2598b.e eVarN = c2598b.n(this.f37281d);
                L0.c.a aVar = L0.c.f4806a;
                L0.c.InterfaceC0174c interfaceC0174cG = aVar.g();
                float f8 = this.f37282e;
                Q3.b bVar = this.f37283f;
                o oVar = this.f37284g;
                k kVar = this.f37285h;
                Function0 function0 = this.f37286i;
                interfaceC3163l.f(693286680);
                H hA = S.a(eVarN, interfaceC0174cG, interfaceC3163l, 48);
                interfaceC3163l.f(-1323940314);
                int iA = AbstractC3157i.a(interfaceC3163l, 0);
                InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
                InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
                Function0 function0A = aVar2.a();
                p pVarB = AbstractC2252x.b(iVarJ);
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
                o oVarB = aVar2.b();
                if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                }
                pVarB.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
                interfaceC3163l.f(2058660585);
                U u8 = U.f27892a;
                i.a aVar3 = i.f4836a;
                i iVarB = T.b(u8, aVar3, 1.0f, false, 2, null);
                C2598b.e eVarB = c2598b.b();
                L0.c.b bVarF = aVar.f();
                interfaceC3163l.f(-483455358);
                H hA2 = AbstractC2607k.a(eVarB, bVarF, interfaceC3163l, 54);
                interfaceC3163l.f(-1323940314);
                int iA2 = AbstractC3157i.a(interfaceC3163l, 0);
                InterfaceC3184w interfaceC3184wE2 = interfaceC3163l.E();
                Function0 function0A2 = aVar2.a();
                p pVarB2 = AbstractC2252x.b(iVarB);
                if (interfaceC3163l.t() == null) {
                    AbstractC3157i.c();
                }
                interfaceC3163l.r();
                if (interfaceC3163l.m()) {
                    interfaceC3163l.w(function0A2);
                } else {
                    interfaceC3163l.G();
                }
                InterfaceC3163l interfaceC3163lA2 = v1.a(interfaceC3163l);
                v1.b(interfaceC3163lA2, hA2, aVar2.c());
                v1.b(interfaceC3163lA2, interfaceC3184wE2, aVar2.e());
                o oVarB2 = aVar2.b();
                if (interfaceC3163lA2.m() || !t.c(interfaceC3163lA2.g(), Integer.valueOf(iA2))) {
                    interfaceC3163lA2.H(Integer.valueOf(iA2));
                    interfaceC3163lA2.A(Integer.valueOf(iA2), oVarB2);
                }
                pVarB2.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
                interfaceC3163l.f(2058660585);
                C2609m c2609m = C2609m.f28036a;
                p202x3.c.a(null, bVar.c(), oVar, interfaceC3163l, 0, 1);
                interfaceC3163l.N();
                interfaceC3163l.O();
                interfaceC3163l.N();
                interfaceC3163l.N();
                i iVarP = androidx.compose.foundation.layout.f.p(aVar3, f8);
                interfaceC3163l.f(-483455358);
                H hA3 = AbstractC2607k.a(c2598b.g(), aVar.i(), interfaceC3163l, 0);
                interfaceC3163l.f(-1323940314);
                int iA3 = AbstractC3157i.a(interfaceC3163l, 0);
                InterfaceC3184w interfaceC3184wE3 = interfaceC3163l.E();
                Function0 function0A3 = aVar2.a();
                p pVarB3 = AbstractC2252x.b(iVarP);
                if (interfaceC3163l.t() == null) {
                    AbstractC3157i.c();
                }
                interfaceC3163l.r();
                if (interfaceC3163l.m()) {
                    interfaceC3163l.w(function0A3);
                } else {
                    interfaceC3163l.G();
                }
                InterfaceC3163l interfaceC3163lA3 = v1.a(interfaceC3163l);
                v1.b(interfaceC3163lA3, hA3, aVar2.c());
                v1.b(interfaceC3163lA3, interfaceC3184wE3, aVar2.e());
                o oVarB3 = aVar2.b();
                if (interfaceC3163lA3.m() || !t.c(interfaceC3163lA3.g(), Integer.valueOf(iA3))) {
                    interfaceC3163lA3.H(Integer.valueOf(iA3));
                    interfaceC3163lA3.A(Integer.valueOf(iA3), oVarB3);
                }
                pVarB3.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
                interfaceC3163l.f(2058660585);
                f.a(bVar.d(), kVar, function0, true, InterfaceC2608l.c(c2609m, aVar3, 1.0f, false, 2, null), interfaceC3163l, 3072);
                interfaceC3163l.N();
                interfaceC3163l.O();
                interfaceC3163l.N();
                interfaceC3163l.N();
                interfaceC3163l.N();
                interfaceC3163l.O();
                interfaceC3163l.N();
                interfaceC3163l.N();
                interfaceC3163l.N();
            } else {
                interfaceC3163l.f(460999926);
                i iVarJ2 = androidx.compose.foundation.layout.e.j(this.f37278a, this.f37280c, this.f37279b);
                C2598b c2598b2 = C2598b.f27914a;
                C2598b.e eVarN2 = c2598b2.n(this.f37281d);
                L0.c.a aVar4 = L0.c.f4806a;
                L0.c.b bVarF2 = aVar4.f();
                float f9 = this.f37282e;
                Q3.b bVar2 = this.f37283f;
                k kVar2 = this.f37285h;
                Function0 function1 = this.f37286i;
                o oVar2 = this.f37284g;
                interfaceC3163l.f(-483455358);
                H hA4 = AbstractC2607k.a(eVarN2, bVarF2, interfaceC3163l, 48);
                interfaceC3163l.f(-1323940314);
                int iA4 = AbstractC3157i.a(interfaceC3163l, 0);
                InterfaceC3184w interfaceC3184wE4 = interfaceC3163l.E();
                InterfaceC2343g.a aVar5 = InterfaceC2343g.f23596Q;
                Function0 function0A4 = aVar5.a();
                p pVarB4 = AbstractC2252x.b(iVarJ2);
                if (interfaceC3163l.t() == null) {
                    AbstractC3157i.c();
                }
                interfaceC3163l.r();
                if (interfaceC3163l.m()) {
                    interfaceC3163l.w(function0A4);
                } else {
                    interfaceC3163l.G();
                }
                InterfaceC3163l interfaceC3163lA4 = v1.a(interfaceC3163l);
                v1.b(interfaceC3163lA4, hA4, aVar5.c());
                v1.b(interfaceC3163lA4, interfaceC3184wE4, aVar5.e());
                o oVarB4 = aVar5.b();
                if (interfaceC3163lA4.m() || !t.c(interfaceC3163lA4.g(), Integer.valueOf(iA4))) {
                    interfaceC3163lA4.H(Integer.valueOf(iA4));
                    interfaceC3163lA4.A(Integer.valueOf(iA4), oVarB4);
                }
                pVarB4.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
                interfaceC3163l.f(2058660585);
                C2609m c2609m2 = C2609m.f28036a;
                i.a aVar6 = i.f4836a;
                i iVarI = androidx.compose.foundation.layout.f.i(aVar6, f9);
                interfaceC3163l.f(693286680);
                H hA5 = S.a(c2598b2.f(), aVar4.j(), interfaceC3163l, 0);
                interfaceC3163l.f(-1323940314);
                int iA5 = AbstractC3157i.a(interfaceC3163l, 0);
                InterfaceC3184w interfaceC3184wE5 = interfaceC3163l.E();
                Function0 function0A5 = aVar5.a();
                p pVarB5 = AbstractC2252x.b(iVarI);
                if (interfaceC3163l.t() == null) {
                    AbstractC3157i.c();
                }
                interfaceC3163l.r();
                if (interfaceC3163l.m()) {
                    interfaceC3163l.w(function0A5);
                } else {
                    interfaceC3163l.G();
                }
                InterfaceC3163l interfaceC3163lA5 = v1.a(interfaceC3163l);
                v1.b(interfaceC3163lA5, hA5, aVar5.c());
                v1.b(interfaceC3163lA5, interfaceC3184wE5, aVar5.e());
                o oVarB5 = aVar5.b();
                if (interfaceC3163lA5.m() || !t.c(interfaceC3163lA5.g(), Integer.valueOf(iA5))) {
                    interfaceC3163lA5.H(Integer.valueOf(iA5));
                    interfaceC3163lA5.A(Integer.valueOf(iA5), oVarB5);
                }
                pVarB5.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
                interfaceC3163l.f(2058660585);
                f.a(bVar2.d(), kVar2, function1, false, T.b(U.f27892a, aVar6, 1.0f, false, 2, null), interfaceC3163l, 3072);
                interfaceC3163l.N();
                interfaceC3163l.O();
                interfaceC3163l.N();
                interfaceC3163l.N();
                i iVarC = InterfaceC2608l.c(c2609m2, aVar6, 1.0f, false, 2, null);
                C2598b.e eVarB2 = c2598b2.b();
                L0.c.InterfaceC0174c interfaceC0174cG2 = aVar4.g();
                interfaceC3163l.f(693286680);
                H hA6 = S.a(eVarB2, interfaceC0174cG2, interfaceC3163l, 54);
                interfaceC3163l.f(-1323940314);
                int iA6 = AbstractC3157i.a(interfaceC3163l, 0);
                InterfaceC3184w interfaceC3184wE6 = interfaceC3163l.E();
                Function0 function0A6 = aVar5.a();
                p pVarB6 = AbstractC2252x.b(iVarC);
                if (interfaceC3163l.t() == null) {
                    AbstractC3157i.c();
                }
                interfaceC3163l.r();
                if (interfaceC3163l.m()) {
                    interfaceC3163l.w(function0A6);
                } else {
                    interfaceC3163l.G();
                }
                InterfaceC3163l interfaceC3163lA6 = v1.a(interfaceC3163l);
                v1.b(interfaceC3163lA6, hA6, aVar5.c());
                v1.b(interfaceC3163lA6, interfaceC3184wE6, aVar5.e());
                o oVarB6 = aVar5.b();
                if (interfaceC3163lA6.m() || !t.c(interfaceC3163lA6.g(), Integer.valueOf(iA6))) {
                    interfaceC3163lA6.H(Integer.valueOf(iA6));
                    interfaceC3163lA6.A(Integer.valueOf(iA6), oVarB6);
                }
                pVarB6.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
                interfaceC3163l.f(2058660585);
                p202x3.c.a(null, bVar2.c(), oVar2, interfaceC3163l, 0, 1);
                interfaceC3163l.N();
                interfaceC3163l.O();
                interfaceC3163l.N();
                interfaceC3163l.N();
                interfaceC3163l.N();
                interfaceC3163l.O();
                interfaceC3163l.N();
                interfaceC3163l.N();
                interfaceC3163l.N();
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((InterfaceC2204f) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q3.b f37287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f37288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f37289c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f37290d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i f37291e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f37292f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f37293g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Q3.b bVar, k kVar, o oVar, Function0 function0, i iVar, int i8, int i9) {
            super(2);
            this.f37287a = bVar;
            this.f37288b = kVar;
            this.f37289c = oVar;
            this.f37290d = function0;
            this.f37291e = iVar;
            this.f37292f = i8;
            this.f37293g = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            f.c(this.f37287a, this.f37288b, this.f37289c, this.f37290d, this.f37291e, interfaceC3163l, F0.a(this.f37292f | 1), this.f37293g);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(Q3.e eVar, k kVar, Function0 function0, boolean z8, i iVar, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1174850257);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.R(eVar) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= interfaceC3163lP.l(kVar) ? 32 : 16;
        }
        if ((i8 & 896) == 0) {
            i9 |= interfaceC3163lP.l(function0) ? 256 : 128;
        }
        if ((i8 & 7168) == 0) {
            i9 |= interfaceC3163lP.c(z8) ? 2048 : 1024;
        }
        if ((57344 & i8) == 0) {
            i9 |= interfaceC3163lP.R(iVar) ? 16384 : 8192;
        }
        int i10 = i9;
        if ((46811 & i10) == 9362 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1174850257, i10, -1, "com.elgato.streamdeck.keypad.Controls (KeypadScreen.kt:91)");
            }
            interfaceC3163lP.f(2119734532);
            if (eVar.b()) {
                p202x3.d.a(null, eVar, z8, kVar, interfaceC3163lP, ((i10 << 3) & 112) | ((i10 >> 3) & 896) | ((i10 << 6) & 7168), 1);
                K3.a.a(eVar.a(), 0, p101l1.f.c(p194w3.b.f37035l, new Object[]{Integer.valueOf(eVar.a() + 1), Integer.valueOf(eVar.c())}, interfaceC3163lP, 64), interfaceC3163lP, 48, 0);
            }
            interfaceC3163lP.N();
            X.a(iVar, interfaceC3163lP, (i10 >> 12) & 14);
            i.a aVar = i.f4836a;
            J3.p.a(z8 ? androidx.compose.foundation.layout.f.h(aVar, 0.0f, 1, null) : androidx.compose.foundation.layout.f.d(aVar, 0.0f, 1, null), function0, interfaceC3163lP, (i10 >> 3) & 112, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new a(eVar, kVar, function0, z8, iVar, i8));
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00de  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:77:0x0100  */
    /* JADX WARN: Code duplicated, block: B:80:0x014b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0154  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void b(i iVar, Q3.b keypad, C3.b faceplate, k onPage, o onKeyState, Function0 goToSettings, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        i iVar2;
        int i10;
        int i11;
        i iVar3;
        Object objG;
        InterfaceC3163l interfaceC3163l2;
        P0 p0V;
        t.g(keypad, "keypad");
        t.g(faceplate, "faceplate");
        t.g(onPage, "onPage");
        t.g(onKeyState, "onKeyState");
        t.g(goToSettings, "goToSettings");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-70949570);
        int i12 = i9 & 1;
        if (i12 != 0) {
            i10 = i8 | 6;
            iVar2 = iVar;
        } else if ((i8 & 14) == 0) {
            iVar2 = iVar;
            i10 = (interfaceC3163lP.R(iVar2) ? 4 : 2) | i8;
        } else {
            iVar2 = iVar;
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            i10 |= interfaceC3163lP.R(keypad) ? 32 : 16;
        }
        if ((i9 & 4) != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            i10 |= interfaceC3163lP.R(faceplate) ? 256 : 128;
        }
        if ((i9 & 8) != 0) {
            i10 |= 3072;
        } else if ((i8 & 7168) == 0) {
            i10 |= interfaceC3163lP.l(onPage) ? 2048 : 1024;
        }
        if ((i9 & 16) != 0) {
            i10 |= 24576;
        } else if ((57344 & i8) == 0) {
            i10 |= interfaceC3163lP.l(onKeyState) ? 16384 : 8192;
        }
        if ((i9 & 32) == 0) {
            if ((458752 & i8) == 0) {
                i11 = interfaceC3163lP.l(goToSettings) ? 131072 : 65536;
            }
            if ((374491 & i10) == 74898 || !interfaceC3163lP.s()) {
                if (i12 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-70949570, i10, -1, "com.elgato.streamdeck.keypad.KeypadScreenContent (KeypadScreen.kt:195)");
                }
                interfaceC3163lP.f(-870242816);
                objG = interfaceC3163lP.g();
                if (objG == InterfaceC3163l.f38803a.a()) {
                    objG = l1.e(r.b(r.f455b.a()), null, 2, null);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                interfaceC3163l2 = interfaceC3163lP;
                AbstractC3086t0.b(null, null, null, null, null, 0, 0L, 0L, j0.b(d0.f27940a, interfaceC3163lP, 8), H0.c.b(interfaceC3163lP, 1782563471, true, new b(iVar3, faceplate, keypad, onPage, onKeyState, goToSettings, (InterfaceC3164l0) objG)), interfaceC3163l2, 805306368, 255);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            } else {
                interfaceC3163lP.z();
                interfaceC3163l2 = interfaceC3163lP;
                iVar3 = iVar2;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new c(iVar3, keypad, faceplate, onPage, onKeyState, goToSettings, i8, i9));
            }
        }
        i11 = 196608;
        i10 |= i11;
        if ((374491 & i10) == 74898) {
            if (i12 != 0) {
                iVar3 = i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-70949570, i10, -1, "com.elgato.streamdeck.keypad.KeypadScreenContent (KeypadScreen.kt:195)");
            }
            interfaceC3163lP.f(-870242816);
            objG = interfaceC3163lP.g();
            if (objG == InterfaceC3163l.f38803a.a()) {
                objG = l1.e(r.b(r.f455b.a()), null, 2, null);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            interfaceC3163l2 = interfaceC3163lP;
            AbstractC3086t0.b(null, null, null, null, null, 0, 0L, 0L, j0.b(d0.f27940a, interfaceC3163lP, 8), H0.c.b(interfaceC3163lP, 1782563471, true, new b(iVar3, faceplate, keypad, onPage, onKeyState, goToSettings, (InterfaceC3164l0) objG)), interfaceC3163l2, 805306368, 255);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        } else {
            if (i12 != 0) {
                iVar3 = i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-70949570, i10, -1, "com.elgato.streamdeck.keypad.KeypadScreenContent (KeypadScreen.kt:195)");
            }
            interfaceC3163lP.f(-870242816);
            objG = interfaceC3163lP.g();
            if (objG == InterfaceC3163l.f38803a.a()) {
                objG = l1.e(r.b(r.f455b.a()), null, 2, null);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            interfaceC3163l2 = interfaceC3163lP;
            AbstractC3086t0.b(null, null, null, null, null, 0, 0L, 0L, j0.b(d0.f27940a, interfaceC3163lP, 8), H0.c.b(interfaceC3163lP, 1782563471, true, new b(iVar3, faceplate, keypad, onPage, onKeyState, goToSettings, (InterfaceC3164l0) objG)), interfaceC3163l2, 805306368, 255);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new c(iVar3, keypad, faceplate, onPage, onKeyState, goToSettings, i8, i9));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x011d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0127  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void c(Q3.b bVar, k kVar, o oVar, Function0 function0, i iVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        Q3.b bVar2;
        int i10;
        k kVar2;
        o oVar2;
        int i11;
        Function0 function1;
        int i12;
        int i13;
        i iVar2;
        int i14;
        i iVar3;
        i iVar4;
        P0 p0V;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1708987304);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
            bVar2 = bVar;
        } else if ((i8 & 14) == 0) {
            bVar2 = bVar;
            i10 = (interfaceC3163lP.R(bVar2) ? 4 : 2) | i8;
        } else {
            bVar2 = bVar;
            i10 = i8;
        }
        if ((i9 & 2) == 0) {
            if ((i8 & 112) == 0) {
                kVar2 = kVar;
                i10 |= interfaceC3163lP.l(kVar2) ? 32 : 16;
            }
            if ((i9 & 4) != 0) {
                if ((i8 & 896) == 0) {
                    oVar2 = oVar;
                    if (interfaceC3163lP.l(oVar2)) {
                        i11 = 256;
                    } else {
                        i11 = 128;
                    }
                    i10 |= i11;
                }
                if ((i9 & 8) != 0) {
                    if ((i8 & 7168) == 0) {
                        function1 = function0;
                        if (interfaceC3163lP.l(function1)) {
                            i12 = 2048;
                        } else {
                            i12 = 1024;
                        }
                        i10 |= i12;
                    }
                    i13 = i9 & 16;
                    if (i13 != 0) {
                        if ((57344 & i8) == 0) {
                            iVar2 = iVar;
                            if (interfaceC3163lP.R(iVar2)) {
                                i14 = 16384;
                            } else {
                                i14 = 8192;
                            }
                            i10 |= i14;
                        }
                        if ((46811 & i10) == 9362 || !interfaceC3163lP.s()) {
                            if (i13 != 0) {
                                iVar3 = i.f4836a;
                            } else {
                                iVar3 = iVar2;
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                            }
                            W3.c cVar = W3.c.f11463a;
                            float fH = cVar.h();
                            float fJ = cVar.j();
                            float fK = cVar.k();
                            float fM = h.m(44);
                            boolean z8 = !bVar2.c().e().isEmpty();
                            androidx.compose.animation.f fVarM = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                            g gVarO = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                            d dVar = new d(iVar3, fH, fJ, fK, fM, bVar2, oVar2, kVar2, function1);
                            i iVar5 = iVar3;
                            AbstractC2203e.e(z8, null, fVarM, gVarO, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar), interfaceC3163lP, 200064, 18);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            iVar4 = iVar5;
                        } else {
                            interfaceC3163lP.z();
                            iVar4 = iVar2;
                        }
                        p0V = interfaceC3163lP.v();
                        if (p0V != null) {
                            p0V.a(new e(bVar, kVar, oVar, function0, iVar4, i8, i9));
                        }
                    }
                    i10 |= 24576;
                    iVar2 = iVar;
                    if ((46811 & i10) == 9362) {
                        if (i13 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                        }
                        W3.c cVar2 = W3.c.f11463a;
                        float fH2 = cVar2.h();
                        float fJ2 = cVar2.j();
                        float fK2 = cVar2.k();
                        float fM2 = h.m(44);
                        boolean z9 = !bVar2.c().e().isEmpty();
                        androidx.compose.animation.f fVarM2 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                        g gVarO2 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                        d dVar2 = new d(iVar3, fH2, fJ2, fK2, fM2, bVar2, oVar2, kVar2, function1);
                        i iVar6 = iVar3;
                        AbstractC2203e.e(z9, null, fVarM2, gVarO2, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar2), interfaceC3163lP, 200064, 18);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar4 = iVar6;
                    } else {
                        if (i13 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                        }
                        W3.c cVar3 = W3.c.f11463a;
                        float fH3 = cVar3.h();
                        float fJ3 = cVar3.j();
                        float fK3 = cVar3.k();
                        float fM3 = h.m(44);
                        boolean z10 = !bVar2.c().e().isEmpty();
                        androidx.compose.animation.f fVarM3 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                        g gVarO3 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                        d dVar3 = new d(iVar3, fH3, fJ3, fK3, fM3, bVar2, oVar2, kVar2, function1);
                        i iVar7 = iVar3;
                        AbstractC2203e.e(z10, null, fVarM3, gVarO3, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar3), interfaceC3163lP, 200064, 18);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar4 = iVar7;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new e(bVar, kVar, oVar, function0, iVar4, i8, i9));
                    }
                }
                i10 |= 3072;
                function1 = function0;
                i13 = i9 & 16;
                if (i13 != 0) {
                    if ((57344 & i8) == 0) {
                        iVar2 = iVar;
                        if (interfaceC3163lP.R(iVar2)) {
                            i14 = 16384;
                        } else {
                            i14 = 8192;
                        }
                        i10 |= i14;
                    }
                    if ((46811 & i10) == 9362) {
                        if (i13 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                        }
                        W3.c cVar4 = W3.c.f11463a;
                        float fH4 = cVar4.h();
                        float fJ4 = cVar4.j();
                        float fK4 = cVar4.k();
                        float fM4 = h.m(44);
                        boolean z11 = !bVar2.c().e().isEmpty();
                        androidx.compose.animation.f fVarM4 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                        g gVarO4 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                        d dVar4 = new d(iVar3, fH4, fJ4, fK4, fM4, bVar2, oVar2, kVar2, function1);
                        i iVar8 = iVar3;
                        AbstractC2203e.e(z11, null, fVarM4, gVarO4, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar4), interfaceC3163lP, 200064, 18);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar4 = iVar8;
                    } else {
                        if (i13 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                        }
                        W3.c cVar5 = W3.c.f11463a;
                        float fH5 = cVar5.h();
                        float fJ5 = cVar5.j();
                        float fK5 = cVar5.k();
                        float fM5 = h.m(44);
                        boolean z12 = !bVar2.c().e().isEmpty();
                        androidx.compose.animation.f fVarM5 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                        g gVarO5 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                        d dVar5 = new d(iVar3, fH5, fJ5, fK5, fM5, bVar2, oVar2, kVar2, function1);
                        i iVar9 = iVar3;
                        AbstractC2203e.e(z12, null, fVarM5, gVarO5, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar5), interfaceC3163lP, 200064, 18);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar4 = iVar9;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new e(bVar, kVar, oVar, function0, iVar4, i8, i9));
                    }
                }
                i10 |= 24576;
                iVar2 = iVar;
                if ((46811 & i10) == 9362) {
                    if (i13 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                    }
                    W3.c cVar6 = W3.c.f11463a;
                    float fH6 = cVar6.h();
                    float fJ6 = cVar6.j();
                    float fK6 = cVar6.k();
                    float fM6 = h.m(44);
                    boolean z13 = !bVar2.c().e().isEmpty();
                    androidx.compose.animation.f fVarM6 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                    g gVarO6 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                    d dVar6 = new d(iVar3, fH6, fJ6, fK6, fM6, bVar2, oVar2, kVar2, function1);
                    i iVar10 = iVar3;
                    AbstractC2203e.e(z13, null, fVarM6, gVarO6, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar6), interfaceC3163lP, 200064, 18);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar10;
                } else {
                    if (i13 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                    }
                    W3.c cVar7 = W3.c.f11463a;
                    float fH7 = cVar7.h();
                    float fJ7 = cVar7.j();
                    float fK7 = cVar7.k();
                    float fM7 = h.m(44);
                    boolean z14 = !bVar2.c().e().isEmpty();
                    androidx.compose.animation.f fVarM7 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                    g gVarO7 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                    d dVar7 = new d(iVar3, fH7, fJ7, fK7, fM7, bVar2, oVar2, kVar2, function1);
                    i iVar11 = iVar3;
                    AbstractC2203e.e(z14, null, fVarM7, gVarO7, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar7), interfaceC3163lP, 200064, 18);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar11;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new e(bVar, kVar, oVar, function0, iVar4, i8, i9));
                }
            }
            i10 |= 384;
            oVar2 = oVar;
            if ((i9 & 8) != 0) {
                if ((i8 & 7168) == 0) {
                    function1 = function0;
                    if (interfaceC3163lP.l(function1)) {
                        i12 = 2048;
                    } else {
                        i12 = 1024;
                    }
                    i10 |= i12;
                }
                i13 = i9 & 16;
                if (i13 != 0) {
                    if ((57344 & i8) == 0) {
                        iVar2 = iVar;
                        if (interfaceC3163lP.R(iVar2)) {
                            i14 = 16384;
                        } else {
                            i14 = 8192;
                        }
                        i10 |= i14;
                    }
                    if ((46811 & i10) == 9362) {
                        if (i13 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                        }
                        W3.c cVar8 = W3.c.f11463a;
                        float fH8 = cVar8.h();
                        float fJ8 = cVar8.j();
                        float fK8 = cVar8.k();
                        float fM8 = h.m(44);
                        boolean z15 = !bVar2.c().e().isEmpty();
                        androidx.compose.animation.f fVarM8 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                        g gVarO8 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                        d dVar8 = new d(iVar3, fH8, fJ8, fK8, fM8, bVar2, oVar2, kVar2, function1);
                        i iVar12 = iVar3;
                        AbstractC2203e.e(z15, null, fVarM8, gVarO8, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar8), interfaceC3163lP, 200064, 18);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar4 = iVar12;
                    } else {
                        if (i13 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                        }
                        W3.c cVar9 = W3.c.f11463a;
                        float fH9 = cVar9.h();
                        float fJ9 = cVar9.j();
                        float fK9 = cVar9.k();
                        float fM9 = h.m(44);
                        boolean z16 = !bVar2.c().e().isEmpty();
                        androidx.compose.animation.f fVarM9 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                        g gVarO9 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                        d dVar9 = new d(iVar3, fH9, fJ9, fK9, fM9, bVar2, oVar2, kVar2, function1);
                        i iVar13 = iVar3;
                        AbstractC2203e.e(z16, null, fVarM9, gVarO9, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar9), interfaceC3163lP, 200064, 18);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar4 = iVar13;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new e(bVar, kVar, oVar, function0, iVar4, i8, i9));
                    }
                }
                i10 |= 24576;
                iVar2 = iVar;
                if ((46811 & i10) == 9362) {
                    if (i13 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                    }
                    W3.c cVar10 = W3.c.f11463a;
                    float fH10 = cVar10.h();
                    float fJ10 = cVar10.j();
                    float fK10 = cVar10.k();
                    float fM10 = h.m(44);
                    boolean z17 = !bVar2.c().e().isEmpty();
                    androidx.compose.animation.f fVarM10 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                    g gVarO10 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                    d dVar10 = new d(iVar3, fH10, fJ10, fK10, fM10, bVar2, oVar2, kVar2, function1);
                    i iVar14 = iVar3;
                    AbstractC2203e.e(z17, null, fVarM10, gVarO10, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar10), interfaceC3163lP, 200064, 18);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar14;
                } else {
                    if (i13 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                    }
                    W3.c cVar11 = W3.c.f11463a;
                    float fH11 = cVar11.h();
                    float fJ11 = cVar11.j();
                    float fK11 = cVar11.k();
                    float fM11 = h.m(44);
                    boolean z18 = !bVar2.c().e().isEmpty();
                    androidx.compose.animation.f fVarM11 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                    g gVarO11 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                    d dVar11 = new d(iVar3, fH11, fJ11, fK11, fM11, bVar2, oVar2, kVar2, function1);
                    i iVar15 = iVar3;
                    AbstractC2203e.e(z18, null, fVarM11, gVarO11, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar11), interfaceC3163lP, 200064, 18);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar15;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new e(bVar, kVar, oVar, function0, iVar4, i8, i9));
                }
            }
            i10 |= 3072;
            function1 = function0;
            i13 = i9 & 16;
            if (i13 != 0) {
                if ((57344 & i8) == 0) {
                    iVar2 = iVar;
                    if (interfaceC3163lP.R(iVar2)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i10 |= i14;
                }
                if ((46811 & i10) == 9362) {
                    if (i13 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                    }
                    W3.c cVar12 = W3.c.f11463a;
                    float fH12 = cVar12.h();
                    float fJ12 = cVar12.j();
                    float fK12 = cVar12.k();
                    float fM12 = h.m(44);
                    boolean z19 = !bVar2.c().e().isEmpty();
                    androidx.compose.animation.f fVarM12 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                    g gVarO12 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                    d dVar12 = new d(iVar3, fH12, fJ12, fK12, fM12, bVar2, oVar2, kVar2, function1);
                    i iVar16 = iVar3;
                    AbstractC2203e.e(z19, null, fVarM12, gVarO12, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar12), interfaceC3163lP, 200064, 18);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar16;
                } else {
                    if (i13 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                    }
                    W3.c cVar13 = W3.c.f11463a;
                    float fH13 = cVar13.h();
                    float fJ13 = cVar13.j();
                    float fK13 = cVar13.k();
                    float fM13 = h.m(44);
                    boolean z110 = !bVar2.c().e().isEmpty();
                    androidx.compose.animation.f fVarM13 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                    g gVarO13 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                    d dVar13 = new d(iVar3, fH13, fJ13, fK13, fM13, bVar2, oVar2, kVar2, function1);
                    i iVar17 = iVar3;
                    AbstractC2203e.e(z110, null, fVarM13, gVarO13, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar13), interfaceC3163lP, 200064, 18);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar17;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new e(bVar, kVar, oVar, function0, iVar4, i8, i9));
                }
            }
            i10 |= 24576;
            iVar2 = iVar;
            if ((46811 & i10) == 9362) {
                if (i13 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                }
                W3.c cVar14 = W3.c.f11463a;
                float fH14 = cVar14.h();
                float fJ14 = cVar14.j();
                float fK14 = cVar14.k();
                float fM14 = h.m(44);
                boolean z111 = !bVar2.c().e().isEmpty();
                androidx.compose.animation.f fVarM14 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                g gVarO14 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                d dVar14 = new d(iVar3, fH14, fJ14, fK14, fM14, bVar2, oVar2, kVar2, function1);
                i iVar18 = iVar3;
                AbstractC2203e.e(z111, null, fVarM14, gVarO14, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar14), interfaceC3163lP, 200064, 18);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar18;
            } else {
                if (i13 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                }
                W3.c cVar15 = W3.c.f11463a;
                float fH15 = cVar15.h();
                float fJ15 = cVar15.j();
                float fK15 = cVar15.k();
                float fM15 = h.m(44);
                boolean z112 = !bVar2.c().e().isEmpty();
                androidx.compose.animation.f fVarM15 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                g gVarO15 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                d dVar15 = new d(iVar3, fH15, fJ15, fK15, fM15, bVar2, oVar2, kVar2, function1);
                i iVar19 = iVar3;
                AbstractC2203e.e(z112, null, fVarM15, gVarO15, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar15), interfaceC3163lP, 200064, 18);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar19;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new e(bVar, kVar, oVar, function0, iVar4, i8, i9));
            }
        }
        i10 |= 48;
        kVar2 = kVar;
        if ((i9 & 4) != 0) {
            if ((i8 & 896) == 0) {
                oVar2 = oVar;
                if (interfaceC3163lP.l(oVar2)) {
                    i11 = 256;
                } else {
                    i11 = 128;
                }
                i10 |= i11;
            }
            if ((i9 & 8) != 0) {
                if ((i8 & 7168) == 0) {
                    function1 = function0;
                    if (interfaceC3163lP.l(function1)) {
                        i12 = 2048;
                    } else {
                        i12 = 1024;
                    }
                    i10 |= i12;
                }
                i13 = i9 & 16;
                if (i13 != 0) {
                    if ((57344 & i8) == 0) {
                        iVar2 = iVar;
                        if (interfaceC3163lP.R(iVar2)) {
                            i14 = 16384;
                        } else {
                            i14 = 8192;
                        }
                        i10 |= i14;
                    }
                    if ((46811 & i10) == 9362) {
                        if (i13 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                        }
                        W3.c cVar16 = W3.c.f11463a;
                        float fH16 = cVar16.h();
                        float fJ16 = cVar16.j();
                        float fK16 = cVar16.k();
                        float fM16 = h.m(44);
                        boolean z113 = !bVar2.c().e().isEmpty();
                        androidx.compose.animation.f fVarM16 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                        g gVarO16 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                        d dVar16 = new d(iVar3, fH16, fJ16, fK16, fM16, bVar2, oVar2, kVar2, function1);
                        i iVar110 = iVar3;
                        AbstractC2203e.e(z113, null, fVarM16, gVarO16, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar16), interfaceC3163lP, 200064, 18);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar4 = iVar110;
                    } else {
                        if (i13 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                        }
                        W3.c cVar17 = W3.c.f11463a;
                        float fH17 = cVar17.h();
                        float fJ17 = cVar17.j();
                        float fK17 = cVar17.k();
                        float fM17 = h.m(44);
                        boolean z114 = !bVar2.c().e().isEmpty();
                        androidx.compose.animation.f fVarM17 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                        g gVarO17 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                        d dVar17 = new d(iVar3, fH17, fJ17, fK17, fM17, bVar2, oVar2, kVar2, function1);
                        i iVar111 = iVar3;
                        AbstractC2203e.e(z114, null, fVarM17, gVarO17, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar17), interfaceC3163lP, 200064, 18);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar4 = iVar111;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new e(bVar, kVar, oVar, function0, iVar4, i8, i9));
                    }
                }
                i10 |= 24576;
                iVar2 = iVar;
                if ((46811 & i10) == 9362) {
                    if (i13 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                    }
                    W3.c cVar18 = W3.c.f11463a;
                    float fH18 = cVar18.h();
                    float fJ18 = cVar18.j();
                    float fK18 = cVar18.k();
                    float fM18 = h.m(44);
                    boolean z115 = !bVar2.c().e().isEmpty();
                    androidx.compose.animation.f fVarM18 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                    g gVarO18 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                    d dVar18 = new d(iVar3, fH18, fJ18, fK18, fM18, bVar2, oVar2, kVar2, function1);
                    i iVar112 = iVar3;
                    AbstractC2203e.e(z115, null, fVarM18, gVarO18, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar18), interfaceC3163lP, 200064, 18);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar112;
                } else {
                    if (i13 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                    }
                    W3.c cVar19 = W3.c.f11463a;
                    float fH19 = cVar19.h();
                    float fJ19 = cVar19.j();
                    float fK19 = cVar19.k();
                    float fM19 = h.m(44);
                    boolean z116 = !bVar2.c().e().isEmpty();
                    androidx.compose.animation.f fVarM19 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                    g gVarO19 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                    d dVar19 = new d(iVar3, fH19, fJ19, fK19, fM19, bVar2, oVar2, kVar2, function1);
                    i iVar113 = iVar3;
                    AbstractC2203e.e(z116, null, fVarM19, gVarO19, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar19), interfaceC3163lP, 200064, 18);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar113;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new e(bVar, kVar, oVar, function0, iVar4, i8, i9));
                }
            }
            i10 |= 3072;
            function1 = function0;
            i13 = i9 & 16;
            if (i13 != 0) {
                if ((57344 & i8) == 0) {
                    iVar2 = iVar;
                    if (interfaceC3163lP.R(iVar2)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i10 |= i14;
                }
                if ((46811 & i10) == 9362) {
                    if (i13 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                    }
                    W3.c cVar110 = W3.c.f11463a;
                    float fH110 = cVar110.h();
                    float fJ110 = cVar110.j();
                    float fK110 = cVar110.k();
                    float fM110 = h.m(44);
                    boolean z117 = !bVar2.c().e().isEmpty();
                    androidx.compose.animation.f fVarM110 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                    g gVarO110 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                    d dVar110 = new d(iVar3, fH110, fJ110, fK110, fM110, bVar2, oVar2, kVar2, function1);
                    i iVar114 = iVar3;
                    AbstractC2203e.e(z117, null, fVarM110, gVarO110, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar110), interfaceC3163lP, 200064, 18);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar114;
                } else {
                    if (i13 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                    }
                    W3.c cVar111 = W3.c.f11463a;
                    float fH111 = cVar111.h();
                    float fJ111 = cVar111.j();
                    float fK111 = cVar111.k();
                    float fM111 = h.m(44);
                    boolean z118 = !bVar2.c().e().isEmpty();
                    androidx.compose.animation.f fVarM111 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                    g gVarO111 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                    d dVar111 = new d(iVar3, fH111, fJ111, fK111, fM111, bVar2, oVar2, kVar2, function1);
                    i iVar115 = iVar3;
                    AbstractC2203e.e(z118, null, fVarM111, gVarO111, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar111), interfaceC3163lP, 200064, 18);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar115;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new e(bVar, kVar, oVar, function0, iVar4, i8, i9));
                }
            }
            i10 |= 24576;
            iVar2 = iVar;
            if ((46811 & i10) == 9362) {
                if (i13 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                }
                W3.c cVar112 = W3.c.f11463a;
                float fH112 = cVar112.h();
                float fJ112 = cVar112.j();
                float fK112 = cVar112.k();
                float fM112 = h.m(44);
                boolean z119 = !bVar2.c().e().isEmpty();
                androidx.compose.animation.f fVarM112 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                g gVarO112 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                d dVar112 = new d(iVar3, fH112, fJ112, fK112, fM112, bVar2, oVar2, kVar2, function1);
                i iVar116 = iVar3;
                AbstractC2203e.e(z119, null, fVarM112, gVarO112, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar112), interfaceC3163lP, 200064, 18);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar116;
            } else {
                if (i13 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                }
                W3.c cVar113 = W3.c.f11463a;
                float fH113 = cVar113.h();
                float fJ113 = cVar113.j();
                float fK113 = cVar113.k();
                float fM113 = h.m(44);
                boolean z1110 = !bVar2.c().e().isEmpty();
                androidx.compose.animation.f fVarM113 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                g gVarO113 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                d dVar113 = new d(iVar3, fH113, fJ113, fK113, fM113, bVar2, oVar2, kVar2, function1);
                i iVar117 = iVar3;
                AbstractC2203e.e(z1110, null, fVarM113, gVarO113, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar113), interfaceC3163lP, 200064, 18);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar117;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new e(bVar, kVar, oVar, function0, iVar4, i8, i9));
            }
        }
        i10 |= 384;
        oVar2 = oVar;
        if ((i9 & 8) != 0) {
            if ((i8 & 7168) == 0) {
                function1 = function0;
                if (interfaceC3163lP.l(function1)) {
                    i12 = 2048;
                } else {
                    i12 = 1024;
                }
                i10 |= i12;
            }
            i13 = i9 & 16;
            if (i13 != 0) {
                if ((57344 & i8) == 0) {
                    iVar2 = iVar;
                    if (interfaceC3163lP.R(iVar2)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i10 |= i14;
                }
                if ((46811 & i10) == 9362) {
                    if (i13 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                    }
                    W3.c cVar114 = W3.c.f11463a;
                    float fH114 = cVar114.h();
                    float fJ114 = cVar114.j();
                    float fK114 = cVar114.k();
                    float fM114 = h.m(44);
                    boolean z1111 = !bVar2.c().e().isEmpty();
                    androidx.compose.animation.f fVarM114 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                    g gVarO114 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                    d dVar114 = new d(iVar3, fH114, fJ114, fK114, fM114, bVar2, oVar2, kVar2, function1);
                    i iVar118 = iVar3;
                    AbstractC2203e.e(z1111, null, fVarM114, gVarO114, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar114), interfaceC3163lP, 200064, 18);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar118;
                } else {
                    if (i13 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                    }
                    W3.c cVar115 = W3.c.f11463a;
                    float fH115 = cVar115.h();
                    float fJ115 = cVar115.j();
                    float fK115 = cVar115.k();
                    float fM115 = h.m(44);
                    boolean z1112 = !bVar2.c().e().isEmpty();
                    androidx.compose.animation.f fVarM115 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                    g gVarO115 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                    d dVar115 = new d(iVar3, fH115, fJ115, fK115, fM115, bVar2, oVar2, kVar2, function1);
                    i iVar119 = iVar3;
                    AbstractC2203e.e(z1112, null, fVarM115, gVarO115, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar115), interfaceC3163lP, 200064, 18);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar119;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new e(bVar, kVar, oVar, function0, iVar4, i8, i9));
                }
            }
            i10 |= 24576;
            iVar2 = iVar;
            if ((46811 & i10) == 9362) {
                if (i13 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                }
                W3.c cVar116 = W3.c.f11463a;
                float fH116 = cVar116.h();
                float fJ116 = cVar116.j();
                float fK116 = cVar116.k();
                float fM116 = h.m(44);
                boolean z1113 = !bVar2.c().e().isEmpty();
                androidx.compose.animation.f fVarM116 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                g gVarO116 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                d dVar116 = new d(iVar3, fH116, fJ116, fK116, fM116, bVar2, oVar2, kVar2, function1);
                i iVar1110 = iVar3;
                AbstractC2203e.e(z1113, null, fVarM116, gVarO116, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar116), interfaceC3163lP, 200064, 18);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar1110;
            } else {
                if (i13 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                }
                W3.c cVar117 = W3.c.f11463a;
                float fH117 = cVar117.h();
                float fJ117 = cVar117.j();
                float fK117 = cVar117.k();
                float fM117 = h.m(44);
                boolean z1114 = !bVar2.c().e().isEmpty();
                androidx.compose.animation.f fVarM117 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                g gVarO117 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                d dVar117 = new d(iVar3, fH117, fJ117, fK117, fM117, bVar2, oVar2, kVar2, function1);
                i iVar1111 = iVar3;
                AbstractC2203e.e(z1114, null, fVarM117, gVarO117, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar117), interfaceC3163lP, 200064, 18);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar1111;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new e(bVar, kVar, oVar, function0, iVar4, i8, i9));
            }
        }
        i10 |= 3072;
        function1 = function0;
        i13 = i9 & 16;
        if (i13 != 0) {
            if ((57344 & i8) == 0) {
                iVar2 = iVar;
                if (interfaceC3163lP.R(iVar2)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i10 |= i14;
            }
            if ((46811 & i10) == 9362) {
                if (i13 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                }
                W3.c cVar118 = W3.c.f11463a;
                float fH118 = cVar118.h();
                float fJ118 = cVar118.j();
                float fK118 = cVar118.k();
                float fM118 = h.m(44);
                boolean z1115 = !bVar2.c().e().isEmpty();
                androidx.compose.animation.f fVarM118 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                g gVarO118 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                d dVar118 = new d(iVar3, fH118, fJ118, fK118, fM118, bVar2, oVar2, kVar2, function1);
                i iVar1112 = iVar3;
                AbstractC2203e.e(z1115, null, fVarM118, gVarO118, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar118), interfaceC3163lP, 200064, 18);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar1112;
            } else {
                if (i13 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
                }
                W3.c cVar119 = W3.c.f11463a;
                float fH119 = cVar119.h();
                float fJ119 = cVar119.j();
                float fK119 = cVar119.k();
                float fM119 = h.m(44);
                boolean z1116 = !bVar2.c().e().isEmpty();
                androidx.compose.animation.f fVarM119 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
                g gVarO119 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
                d dVar119 = new d(iVar3, fH119, fJ119, fK119, fM119, bVar2, oVar2, kVar2, function1);
                i iVar1113 = iVar3;
                AbstractC2203e.e(z1116, null, fVarM119, gVarO119, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar119), interfaceC3163lP, 200064, 18);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar1113;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new e(bVar, kVar, oVar, function0, iVar4, i8, i9));
            }
        }
        i10 |= 24576;
        iVar2 = iVar;
        if ((46811 & i10) == 9362) {
            if (i13 != 0) {
                iVar3 = i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
            }
            W3.c cVar1110 = W3.c.f11463a;
            float fH1110 = cVar1110.h();
            float fJ1110 = cVar1110.j();
            float fK1110 = cVar1110.k();
            float fM1110 = h.m(44);
            boolean z1117 = !bVar2.c().e().isEmpty();
            androidx.compose.animation.f fVarM1110 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
            g gVarO1110 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
            d dVar1110 = new d(iVar3, fH1110, fJ1110, fK1110, fM1110, bVar2, oVar2, kVar2, function1);
            i iVar1114 = iVar3;
            AbstractC2203e.e(z1117, null, fVarM1110, gVarO1110, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar1110), interfaceC3163lP, 200064, 18);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar4 = iVar1114;
        } else {
            if (i13 != 0) {
                iVar3 = i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1708987304, i10, -1, "com.elgato.streamdeck.keypad.KeypadUi (KeypadScreen.kt:121)");
            }
            W3.c cVar1111 = W3.c.f11463a;
            float fH1111 = cVar1111.h();
            float fJ1111 = cVar1111.j();
            float fK1111 = cVar1111.k();
            float fM1111 = h.m(44);
            boolean z1118 = !bVar2.c().e().isEmpty();
            androidx.compose.animation.f fVarM1111 = androidx.compose.animation.e.m(AbstractC2214j.i(500, 0, null, 6, null), 0.0f, 2, null);
            g gVarO1111 = androidx.compose.animation.e.o(null, 0.0f, 3, null);
            d dVar1111 = new d(iVar3, fH1111, fJ1111, fK1111, fM1111, bVar2, oVar2, kVar2, function1);
            i iVar1115 = iVar3;
            AbstractC2203e.e(z1118, null, fVarM1111, gVarO1111, null, H0.c.b(interfaceC3163lP, -536298368, true, dVar1111), interfaceC3163lP, 200064, 18);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar4 = iVar1115;
        }
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new e(bVar, kVar, oVar, function0, iVar4, i8, i9));
        }
    }
}
