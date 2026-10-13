package p154r3;

import C6.G;
import C6.v;
import D6.L;
import J3.m;
import J3.q;
import Q6.o;
import Q6.p;
import R0.C1598l0;
import Z6.w;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.net.URL;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2252x;
import p038e1.H;
import p046f0.D;
import p056g1.InterfaceC2343g;
import p065h1.I0;
import p082j0.AbstractC2601e;
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
import p090k.zI.jULK;
import p116m7.kKPq.toqHM;
import p128o1.I;
import p191w0.AbstractC3086t0;
import p191w0.B;
import p191w0.Z;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3184w;
import p215z0.P0;
import p215z0.R0;
import p215z0.v1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p154r3.f f32429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f32430b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p154r3.f fVar, int i8) {
            super(2);
            this.f32429a = fVar;
            this.f32430b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            g.a(this.f32429a, interfaceC3163l, F0.a(this.f32430b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f32431a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i8) {
            super(2);
            this.f32431a = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            g.b(interfaceC3163l, F0.a(this.f32431a | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p154r3.f f32432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f32433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f32434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f32435d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p154r3.f fVar, int i8, int i9, int i10) {
            super(2);
            this.f32432a = fVar;
            this.f32433b = i8;
            this.f32434c = i9;
            this.f32435d = i10;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            g.c(this.f32432a, this.f32433b, interfaceC3163l, F0.a(this.f32434c | 1), this.f32435d);
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
        public final /* synthetic */ p154r3.f f32436a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(p154r3.f fVar) {
            super(3);
            this.f32436a = fVar;
        }

        public final void b(J paddingValues, InterfaceC3163l interfaceC3163l, int i8) {
            int i9;
            t.g(paddingValues, "paddingValues");
            if ((i8 & 14) == 0) {
                i9 = i8 | (interfaceC3163l.R(paddingValues) ? 4 : 2);
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-194810936, i9, -1, "com.elgato.streamdeck.LandscapeContent.<anonymous> (OnboardingScreen.kt:160)");
            }
            L0.i.a aVar = L0.i.f4836a;
            L0.i iVarF = androidx.compose.foundation.layout.f.f(androidx.compose.foundation.layout.e.h(aVar, paddingValues), 0.0f, 1, null);
            L0.c.a aVar2 = L0.c.f4806a;
            L0.c cVarE = aVar2.e();
            p154r3.f fVar = this.f32436a;
            interfaceC3163l.f(733328855);
            H hG = AbstractC2601e.g(cVarE, false, interfaceC3163l, 6);
            interfaceC3163l.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163l, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
            InterfaceC2343g.a aVar3 = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar3.a();
            p pVarB = AbstractC2252x.b(iVarF);
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
            v1.b(interfaceC3163lA, hG, aVar3.c());
            v1.b(interfaceC3163lA, interfaceC3184wE, aVar3.e());
            o oVarB = aVar3.b();
            if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
            interfaceC3163l.f(2058660585);
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f14485a;
            L0.i iVarO = androidx.compose.foundation.layout.f.o(aVar, 0.0f, 0.0f, A1.h.m(1000), A1.h.m(500), 3, null);
            W3.c cVar = W3.c.f11463a;
            L0.i iVarH = androidx.compose.foundation.layout.e.h(g.r(androidx.compose.foundation.layout.e.h(iVarO, m.g(cVar)), interfaceC3163l, 0), m.g(cVar));
            L0.c.InterfaceC0174c interfaceC0174cJ = aVar2.j();
            interfaceC3163l.f(693286680);
            C2598b c2598b = C2598b.f27914a;
            H hA = S.a(c2598b.f(), interfaceC0174cJ, interfaceC3163l, 48);
            interfaceC3163l.f(-1323940314);
            int iA2 = AbstractC3157i.a(interfaceC3163l, 0);
            InterfaceC3184w interfaceC3184wE2 = interfaceC3163l.E();
            Function0 function0A2 = aVar3.a();
            p pVarB2 = AbstractC2252x.b(iVarH);
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
            v1.b(interfaceC3163lA2, hA, aVar3.c());
            v1.b(interfaceC3163lA2, interfaceC3184wE2, aVar3.e());
            o oVarB2 = aVar3.b();
            if (interfaceC3163lA2.m() || !t.c(interfaceC3163lA2.g(), Integer.valueOf(iA2))) {
                interfaceC3163lA2.H(Integer.valueOf(iA2));
                interfaceC3163lA2.A(Integer.valueOf(iA2), oVarB2);
            }
            pVarB2.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
            interfaceC3163l.f(2058660585);
            U u8 = U.f27892a;
            L0.i iVarB = T.b(u8, aVar, 1.0f, false, 2, null);
            L0.c.b bVarF = aVar2.f();
            interfaceC3163l.f(-483455358);
            H hA2 = AbstractC2607k.a(c2598b.g(), bVarF, interfaceC3163l, 48);
            interfaceC3163l.f(-1323940314);
            int iA3 = AbstractC3157i.a(interfaceC3163l, 0);
            InterfaceC3184w interfaceC3184wE3 = interfaceC3163l.E();
            Function0 function0A3 = aVar3.a();
            p pVarB3 = AbstractC2252x.b(iVarB);
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
            v1.b(interfaceC3163lA3, hA2, aVar3.c());
            v1.b(interfaceC3163lA3, interfaceC3184wE3, aVar3.e());
            o oVarB3 = aVar3.b();
            if (interfaceC3163lA3.m() || !t.c(interfaceC3163lA3.g(), Integer.valueOf(iA3))) {
                interfaceC3163lA3.H(Integer.valueOf(iA3));
                interfaceC3163lA3.A(Integer.valueOf(iA3), oVarB3);
            }
            pVarB3.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
            interfaceC3163l.f(2058660585);
            C2609m c2609m = C2609m.f28036a;
            L0.i iVarC = InterfaceC2608l.c(c2609m, aVar, 1.0f, false, 2, null);
            L0.c cVarE2 = aVar2.e();
            interfaceC3163l.f(733328855);
            H hG2 = AbstractC2601e.g(cVarE2, false, interfaceC3163l, 6);
            interfaceC3163l.f(-1323940314);
            int iA4 = AbstractC3157i.a(interfaceC3163l, 0);
            InterfaceC3184w interfaceC3184wE4 = interfaceC3163l.E();
            Function0 function0A4 = aVar3.a();
            p pVarB4 = AbstractC2252x.b(iVarC);
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
            v1.b(interfaceC3163lA4, hG2, aVar3.c());
            v1.b(interfaceC3163lA4, interfaceC3184wE4, aVar3.e());
            o oVarB4 = aVar3.b();
            if (interfaceC3163lA4.m() || !t.c(interfaceC3163lA4.g(), Integer.valueOf(iA4))) {
                interfaceC3163lA4.H(Integer.valueOf(iA4));
                interfaceC3163lA4.A(Integer.valueOf(iA4), oVarB4);
            }
            pVarB4.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
            interfaceC3163l.f(2058660585);
            g.h(null, interfaceC3163l, 0, 1);
            interfaceC3163l.N();
            interfaceC3163l.O();
            interfaceC3163l.N();
            interfaceC3163l.N();
            g.g(fVar, interfaceC3163l, 0);
            interfaceC3163l.N();
            interfaceC3163l.O();
            interfaceC3163l.N();
            interfaceC3163l.N();
            X.a(androidx.compose.foundation.layout.f.p(aVar, m.f(cVar)), interfaceC3163l, 0);
            L0.i iVarD = androidx.compose.foundation.layout.f.d(T.b(u8, aVar, 1.0f, false, 2, null), 0.0f, 1, null);
            interfaceC3163l.f(-483455358);
            H hA3 = AbstractC2607k.a(c2598b.g(), aVar2.i(), interfaceC3163l, 0);
            interfaceC3163l.f(-1323940314);
            int iA5 = AbstractC3157i.a(interfaceC3163l, 0);
            InterfaceC3184w interfaceC3184wE5 = interfaceC3163l.E();
            Function0 function0A5 = aVar3.a();
            p pVarB5 = AbstractC2252x.b(iVarD);
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
            v1.b(interfaceC3163lA5, hA3, aVar3.c());
            v1.b(interfaceC3163lA5, interfaceC3184wE5, aVar3.e());
            o oVarB5 = aVar3.b();
            if (interfaceC3163lA5.m() || !t.c(interfaceC3163lA5.g(), Integer.valueOf(iA5))) {
                interfaceC3163lA5.H(Integer.valueOf(iA5));
                interfaceC3163lA5.A(Integer.valueOf(iA5), oVarB5);
            }
            pVarB5.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
            interfaceC3163l.f(2058660585);
            g.b(interfaceC3163l, 0);
            X.a(InterfaceC2608l.c(c2609m, aVar, 0.1f, false, 2, null), interfaceC3163l, 0);
            g.c(fVar, p216z1.j.f39010b.d(), interfaceC3163l, 0, 0);
            X.a(InterfaceC2608l.c(c2609m, aVar, 0.9f, false, 2, null), interfaceC3163l, 0);
            g.a(fVar, interfaceC3163l, 0);
            interfaceC3163l.N();
            interfaceC3163l.O();
            interfaceC3163l.N();
            interfaceC3163l.N();
            interfaceC3163l.N();
            interfaceC3163l.O();
            interfaceC3163l.N();
            interfaceC3163l.N();
            interfaceC3163l.N();
            interfaceC3163l.O();
            interfaceC3163l.N();
            interfaceC3163l.N();
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
    public static final class e extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p154r3.f f32437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f32438b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(p154r3.f fVar, int i8) {
            super(2);
            this.f32437a = fVar;
            this.f32438b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            g.d(this.f32437a, interfaceC3163l, F0.a(this.f32438b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f32439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p154r3.f f32440b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(float f8, p154r3.f fVar) {
            super(3);
            this.f32439a = f8;
            this.f32440b = fVar;
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((J) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }

        public final void b(J j8, InterfaceC3163l interfaceC3163l, int i8) {
            int i9;
            t.g(j8, toqHM.yej);
            if ((i8 & 14) == 0) {
                i9 = i8 | (interfaceC3163l.R(j8) ? 4 : 2);
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1577485934, i9, -1, "com.elgato.streamdeck.PortraitContent.<anonymous> (OnboardingScreen.kt:114)");
            }
            L0.i.a aVar = L0.i.f4836a;
            L0.i iVarF = androidx.compose.foundation.layout.f.f(aVar, 0.0f, 1, null);
            L0.c.a aVar2 = L0.c.f4806a;
            L0.c cVarE = aVar2.e();
            float f8 = this.f32439a;
            p154r3.f fVar = this.f32440b;
            interfaceC3163l.f(733328855);
            H hG = AbstractC2601e.g(cVarE, false, interfaceC3163l, 6);
            interfaceC3163l.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163l, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
            InterfaceC2343g.a aVar3 = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar3.a();
            p pVarB = AbstractC2252x.b(iVarF);
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
            v1.b(interfaceC3163lA, hG, aVar3.c());
            v1.b(interfaceC3163lA, interfaceC3184wE, aVar3.e());
            o oVarB = aVar3.b();
            if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
            interfaceC3163l.f(2058660585);
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f14485a;
            L0.i iVarF2 = androidx.compose.foundation.layout.f.f(androidx.compose.foundation.layout.f.o(androidx.compose.foundation.layout.e.h(aVar, j8), 0.0f, 0.0f, 0.0f, A1.h.m(750), 7, null), 0.0f, 1, null);
            L0.c cVarK = aVar2.k();
            interfaceC3163l.f(733328855);
            H hG2 = AbstractC2601e.g(cVarK, false, interfaceC3163l, 6);
            interfaceC3163l.f(-1323940314);
            int iA2 = AbstractC3157i.a(interfaceC3163l, 0);
            InterfaceC3184w interfaceC3184wE2 = interfaceC3163l.E();
            Function0 function0A2 = aVar3.a();
            p pVarB2 = AbstractC2252x.b(iVarF2);
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
            v1.b(interfaceC3163lA2, hG2, aVar3.c());
            v1.b(interfaceC3163lA2, interfaceC3184wE2, aVar3.e());
            o oVarB2 = aVar3.b();
            if (interfaceC3163lA2.m() || !t.c(interfaceC3163lA2.g(), Integer.valueOf(iA2))) {
                interfaceC3163lA2.H(Integer.valueOf(iA2));
                interfaceC3163lA2.A(Integer.valueOf(iA2), oVarB2);
            }
            pVarB2.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
            interfaceC3163l.f(2058660585);
            L0.i iVarC = bVar.c(androidx.compose.foundation.layout.f.o(aVar, 0.0f, 0.0f, A1.h.m(500), 0.0f, 11, null), aVar2.e());
            W3.c cVar = W3.c.f11463a;
            float f9 = f8 / 2;
            L0.i iVarM = androidx.compose.foundation.layout.e.m(androidx.compose.foundation.layout.e.h(g.r(androidx.compose.foundation.layout.e.l(iVarC, m.f(cVar), A1.h.m(f9), m.f(cVar), m.h(cVar)), interfaceC3163l, 0), m.g(cVar)), 0.0f, A1.h.m(f9), 0.0f, 0.0f, 13, null);
            L0.c.b bVarF = aVar2.f();
            C2598b.e eVarN = C2598b.f27914a.n(cVar.h());
            interfaceC3163l.f(-483455358);
            H hA = AbstractC2607k.a(eVarN, bVarF, interfaceC3163l, 48);
            interfaceC3163l.f(-1323940314);
            int iA3 = AbstractC3157i.a(interfaceC3163l, 0);
            InterfaceC3184w interfaceC3184wE3 = interfaceC3163l.E();
            Function0 function0A3 = aVar3.a();
            p pVarB3 = AbstractC2252x.b(iVarM);
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
            v1.b(interfaceC3163lA3, hA, aVar3.c());
            v1.b(interfaceC3163lA3, interfaceC3184wE3, aVar3.e());
            o oVarB3 = aVar3.b();
            if (interfaceC3163lA3.m() || !t.c(interfaceC3163lA3.g(), Integer.valueOf(iA3))) {
                interfaceC3163lA3.H(Integer.valueOf(iA3));
                interfaceC3163lA3.A(Integer.valueOf(iA3), oVarB3);
            }
            pVarB3.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
            interfaceC3163l.f(2058660585);
            C2609m c2609m = C2609m.f28036a;
            g.b(interfaceC3163l, 0);
            X.a(InterfaceC2608l.c(c2609m, aVar, 1.0f, false, 2, null), interfaceC3163l, 0);
            g.c(fVar, 0, interfaceC3163l, 0, 1);
            X.a(InterfaceC2608l.c(c2609m, aVar, 1.0f, false, 2, null), interfaceC3163l, 0);
            g.g(fVar, interfaceC3163l, 0);
            g.a(fVar, interfaceC3163l, 0);
            interfaceC3163l.N();
            interfaceC3163l.O();
            interfaceC3163l.N();
            interfaceC3163l.N();
            g.h(null, interfaceC3163l, 0, 1);
            interfaceC3163l.N();
            interfaceC3163l.O();
            interfaceC3163l.N();
            interfaceC3163l.N();
            interfaceC3163l.N();
            interfaceC3163l.O();
            interfaceC3163l.N();
            interfaceC3163l.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
    }

    /* JADX INFO: renamed from: r3.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0721g extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p154r3.f f32441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f32442b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0721g(p154r3.f fVar, int i8) {
            super(2);
            this.f32441a = fVar;
            this.f32442b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            g.e(this.f32441a, interfaceC3163l, F0.a(this.f32442b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p154r3.f f32443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f32444b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(p154r3.f fVar, int i8) {
            super(2);
            this.f32443a = fVar;
            this.f32444b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            g.f(this.f32443a, interfaceC3163l, F0.a(this.f32444b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p154r3.f f32445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f32446b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(p154r3.f fVar, int i8) {
            super(2);
            this.f32445a = fVar;
            this.f32446b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            g.g(this.f32445a, interfaceC3163l, F0.a(this.f32446b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L0.i f32447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f32448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f32449c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(L0.i iVar, int i8, int i9) {
            super(2);
            this.f32447a = iVar;
            this.f32448b = i8;
            this.f32449c = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            g.h(this.f32447a, interfaceC3163l, F0.a(this.f32448b | 1), this.f32449c);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(p154r3.f fVar, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-491268706);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.R(fVar) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-491268706, i9, -1, "com.elgato.streamdeck.ContinueButton (OnboardingScreen.kt:228)");
            }
            J3.b.a(p194w3.b.f37047p, I0.a(androidx.compose.foundation.layout.f.h(L0.i.f4836a, 0.0f, 1, null), "onboarding_continue_button"), null, J3.d.ACCENT, J3.c.L, null, false, fVar.a(), interfaceC3163lP, 27696, 100);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new a(fVar, i8));
        }
    }

    public static final void b(InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163l2;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-542662359);
        if (i8 == 0 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
            interfaceC3163l2 = interfaceC3163lP;
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-542662359, i8, -1, "com.elgato.streamdeck.Headline (OnboardingScreen.kt:203)");
            }
            String upperCase = p101l1.f.b(p194w3.b.f37060t0, interfaceC3163lP, 0).toUpperCase(Locale.ROOT);
            t.f(upperCase, "toUpperCase(...)");
            interfaceC3163l2 = interfaceC3163lP;
            p191w0.P0.b(upperCase, null, 0L, 0L, null, null, null, 0L, null, p216z1.j.h(p216z1.j.f39010b.a()), 0L, 0, false, 0, 0, null, Z.f35786a.c(interfaceC3163lP, Z.f35787b).d(), interfaceC3163l2, 0, 0, 65022);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new b(i8));
        }
    }

    public static final void c(p154r3.f fVar, int i8, InterfaceC3163l interfaceC3163l, int i9, int i10) {
        int i11;
        int iA;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(577667010);
        if ((Integer.MIN_VALUE & i10) != 0) {
            i11 = i9 | 6;
        } else if ((i9 & 14) == 0) {
            i11 = (interfaceC3163lP.R(fVar) ? 4 : 2) | i9;
        } else {
            i11 = i9;
        }
        if ((i9 & 112) == 0) {
            if ((i10 & 1) == 0) {
                iA = i8;
                int i12 = interfaceC3163lP.i(iA) ? 32 : 16;
                i11 |= i12;
            } else {
                iA = i8;
            }
            i11 |= i12;
        } else {
            iA = i8;
        }
        if ((i11 & 91) == 18 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            interfaceC3163lP.o();
            if ((i9 & 1) != 0 && !interfaceC3163lP.F()) {
                interfaceC3163lP.z();
                if ((i10 & 1) != 0) {
                    i11 &= -113;
                }
            } else if ((i10 & 1) != 0) {
                iA = p216z1.j.f39010b.a();
                i11 &= -113;
            }
            int i13 = iA;
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(577667010, i11, -1, "com.elgato.streamdeck.InfoText (OnboardingScreen.kt:240)");
            }
            q.a(p194w3.b.f37054r0, L.e(v.a(w.q0("https://elgato.com/s/downloads", "https://"), new URL("https://elgato.com/s/downloads"))), I.c((I) interfaceC3163lP.e(p191w0.P0.c()), ((C1598l0) interfaceC3163lP.e(B.a())).y(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, i13, 0, 0L, null, null, null, 0, 0, null, 16744446, null), null, fVar.b(), interfaceC3163lP, 64, 8);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iA = i13;
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new c(fVar, iA, i9, i10));
        }
    }

    public static final void d(p154r3.f fVar, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1392206919);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.R(fVar) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1392206919, i9, -1, "com.elgato.streamdeck.LandscapeContent (OnboardingScreen.kt:157)");
            }
            AbstractC3086t0.b(null, null, null, null, null, 0, 0L, 0L, j0.b(d0.f27940a, interfaceC3163lP, 8), H0.c.b(interfaceC3163lP, -194810936, true, new d(fVar)), interfaceC3163lP, 805306368, 255);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new e(fVar, i8));
        }
    }

    public static final void e(p154r3.f fVar, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1754658943);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.R(fVar) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1754658943, i9, -1, "com.elgato.streamdeck.PortraitContent (OnboardingScreen.kt:109)");
            }
            AbstractC3086t0.b(null, null, null, null, null, 0, 0L, 0L, j0.b(d0.f27940a, interfaceC3163lP, 8), H0.c.b(interfaceC3163lP, -1577485934, true, new f(A1.h.m(216), fVar)), interfaceC3163lP, 805306368, 255);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new C0721g(fVar, i8));
        }
    }

    public static final void f(p154r3.f fVar, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(768647506);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.R(fVar) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(768647506, i9, -1, "com.elgato.streamdeck.ScreenContent (OnboardingScreen.kt:103)");
            }
            if (((Configuration) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.f())).orientation == 2) {
                interfaceC3163lP.f(725866977);
                d(fVar, interfaceC3163lP, i9 & 14);
            } else {
                interfaceC3163lP.f(725867001);
                e(fVar, interfaceC3163lP, i9 & 14);
            }
            interfaceC3163lP.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new h(fVar, i8));
        }
    }

    public static final void g(p154r3.f fVar, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-130726578);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.R(fVar) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-130726578, i9, -1, "com.elgato.streamdeck.ShareButton (OnboardingScreen.kt:217)");
            }
            J3.b.a(p194w3.b.f37057s0, I0.a(androidx.compose.foundation.layout.f.h(L0.i.f4836a, 0.0f, 1, null), "onboarding_share_button"), p175u0.b.a(p167t0.a.f33968a.a()), null, J3.c.L, null, false, fVar.c(), interfaceC3163lP, 24624, 104);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new i(fVar, i8));
        }
    }

    public static final L0.i r(L0.i iVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-7041567);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-7041567, i8, -1, "com.elgato.streamdeck.background (OnboardingScreen.kt:253)");
        }
        L0.i iVarA = androidx.compose.foundation.c.a(iVar, Z.f35786a.a(interfaceC3163l, Z.f35787b).C(), p135p0.g.c(W3.c.f11463a.e()));
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return iVarA;
    }

    public static final V3.i s(r3.e.a aVar) {
        t.g(aVar, "<this>");
        return V3.d.c(V3.c.f10602a, V3.c.d.ONBOARDING, new C6.o[0]);
    }

    public static final V3.h.a t(r3.e.a aVar) {
        t.g(aVar, "<this>");
        return new V3.h.a(V3.c.b.f10621j.b(), new C6.o[]{v.a("screen_name", V3.c.d.ONBOARDING.b())}, (V3.a) null, 4, (AbstractC2633k) null);
    }

    public static final void h(L0.i iVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        int i11;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1906725263);
        int i12 = i9 & 1;
        if (i12 != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            if (interfaceC3163lP.R(iVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            i10 = i8;
        }
        if ((i10 & 11) == 2 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (i12 != 0) {
                iVar = L0.i.f4836a;
            }
            L0.i iVar2 = iVar;
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1906725263, i10, -1, jULK.npNJEzBHcUhXfY);
            }
            D.b(p101l1.g.b(V0.d.f10289k, p154r3.h.f32493i0, interfaceC3163lP, 8), null, iVar2, null, null, 0.0f, null, interfaceC3163lP, ((i10 << 6) & 896) | 48, 120);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar = iVar2;
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new j(iVar, i8, i9));
        }
    }
}
