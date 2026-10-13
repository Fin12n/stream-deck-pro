package p191w0;

import A1.h;
import C6.G;
import L0.i;
import Q6.k;
import Q6.o;
import Q6.p;
import R0.C1598l0;
import R0.a1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2635m;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p037e0.AbstractC2214j;
import p037e0.D;
import p037e0.E;
import p037e0.S;
import p037e0.f0;
import p037e0.g0;
import p037e0.i0;
import p037e0.j0;
import p037e0.l0;
import p038e1.AbstractC2252x;
import p038e1.H;
import p046f0.Z;
import p046f0.a0;
import p056g1.InterfaceC2343g;
import p082j0.AbstractC2601e;
import p082j0.AbstractC2607k;
import p082j0.C2598b;
import p082j0.C2609m;
import p082j0.EnumC2621z;
import p082j0.J;
import p082j0.T;
import p082j0.U;
import p183v0.n;
import p207y0.m;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3182v;
import p215z0.C0;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.InterfaceC3184w;
import p215z0.P0;
import p215z0.R0;
import p215z0.q1;
import p215z0.v1;

/* JADX INFO: renamed from: w0.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3055d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f35817a = h.m(48);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f35818b = h.m(12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f35819c = h.m(8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f35820d = h.m(112);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f35821e = h.m(280);

    /* JADX INFO: renamed from: w0.d0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f35822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q1 f35823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q1 f35824c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3164l0 interfaceC3164l0, q1 q1Var, q1 q1Var2) {
            super(1);
            this.f35822a = interfaceC3164l0;
            this.f35823b = q1Var;
            this.f35824c = q1Var2;
        }

        public final void b(androidx.compose.ui.graphics.c cVar) {
            cVar.p(AbstractC3055d0.b(this.f35823b));
            cVar.k(AbstractC3055d0.b(this.f35823b));
            cVar.b(AbstractC3055d0.c(this.f35824c));
            cVar.W0(((androidx.compose.ui.graphics.f) this.f35822a.getValue()).j());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((androidx.compose.ui.graphics.c) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: w0.d0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f35825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a0 f35826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f35827c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, a0 a0Var, p pVar) {
            super(2);
            this.f35825a = iVar;
            this.f35826b = a0Var;
            this.f35827c = pVar;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 3) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1266256833, i8, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:283)");
            }
            i iVarD = Z.d(androidx.compose.foundation.layout.c.a(androidx.compose.foundation.layout.e.k(this.f35825a, 0.0f, AbstractC3055d0.i(), 1, null), EnumC2621z.Max), this.f35826b, false, null, false, 14, null);
            p pVar = this.f35827c;
            interfaceC3163l.f(-483455358);
            H hA = AbstractC2607k.a(C2598b.f27914a.g(), L0.c.f4806a.i(), interfaceC3163l, 0);
            interfaceC3163l.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163l, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
            InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar.a();
            p pVarB = AbstractC2252x.b(iVarD);
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
            v1.b(interfaceC3163lA, hA, aVar.c());
            v1.b(interfaceC3163lA, interfaceC3184wE, aVar.e());
            o oVarB = aVar.b();
            if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
            interfaceC3163l.f(2058660585);
            pVar.invoke(C2609m.f28036a, interfaceC3163l, 6);
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

    /* JADX INFO: renamed from: w0.d0$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ S f35828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f35829b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a0 f35830c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f35831d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p f35832e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f35833f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f35834g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(S s8, InterfaceC3164l0 interfaceC3164l0, a0 a0Var, i iVar, p pVar, int i8, int i9) {
            super(2);
            this.f35828a = s8;
            this.f35829b = interfaceC3164l0;
            this.f35830c = a0Var;
            this.f35831d = iVar;
            this.f35832e = pVar;
            this.f35833f = i8;
            this.f35834g = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            AbstractC3055d0.a(this.f35828a, this.f35829b, this.f35830c, this.f35831d, this.f35832e, interfaceC3163l, F0.a(this.f35833f | 1), this.f35834g);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: w0.d0$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f35835a = new d();

        public d() {
            super(3);
        }

        public final E b(f0.b bVar, InterfaceC3163l interfaceC3163l, int i8) {
            interfaceC3163l.f(-1498621383);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1498621383, i8, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:259)");
            }
            i0 i0VarI = bVar.b(Boolean.FALSE, Boolean.TRUE) ? AbstractC2214j.i(30, 0, null, 6, null) : AbstractC2214j.i(75, 0, null, 6, null);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163l.N();
            return i0VarI;
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((f0.b) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: w0.d0$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f35836a = new e();

        public e() {
            super(3);
        }

        public final E b(f0.b bVar, InterfaceC3163l interfaceC3163l, int i8) {
            interfaceC3163l.f(-952455731);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-952455731, i8, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:239)");
            }
            i0 i0VarI = bVar.b(Boolean.FALSE, Boolean.TRUE) ? AbstractC2214j.i(120, 0, D.f(), 2, null) : AbstractC2214j.i(1, 74, null, 4, null);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163l.N();
            return i0VarI;
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((f0.b) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: w0.d0$f */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f35837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C3053c0 f35838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f35839c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o f35840d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ T f35841e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ o f35842f;

        /* JADX INFO: renamed from: w0.d0$f$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o f35843a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o oVar) {
                super(2);
                this.f35843a = oVar;
            }

            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                if ((i8 & 3) == 2 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(2035552199, i8, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:329)");
                }
                i iVarB = androidx.compose.foundation.layout.f.b(i.f4836a, m.f37934a.k(), 0.0f, 2, null);
                o oVar = this.f35843a;
                interfaceC3163l.f(733328855);
                H hG = AbstractC2601e.g(L0.c.f4806a.m(), false, interfaceC3163l, 0);
                interfaceC3163l.f(-1323940314);
                int iA = AbstractC3157i.a(interfaceC3163l, 0);
                InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
                InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
                Function0 function0A = aVar.a();
                p pVarB = AbstractC2252x.b(iVarB);
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
                v1.b(interfaceC3163lA, hG, aVar.c());
                v1.b(interfaceC3163lA, interfaceC3184wE, aVar.e());
                o oVarB = aVar.b();
                if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                }
                pVarB.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
                interfaceC3163l.f(2058660585);
                androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f14485a;
                oVar.invoke(interfaceC3163l, 0);
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

        /* JADX INFO: renamed from: w0.d0$f$b */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ T f35844a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f35845b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f35846c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o f35847d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(T t8, o oVar, o oVar2, o oVar3) {
                super(2);
                this.f35844a = t8;
                this.f35845b = oVar;
                this.f35846c = oVar2;
                this.f35847d = oVar3;
            }

            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                if ((i8 & 3) == 2 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1728894036, i8, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:335)");
                }
                i iVarM = androidx.compose.foundation.layout.e.m(T.b(this.f35844a, i.f4836a, 1.0f, false, 2, null), this.f35845b != null ? AbstractC3055d0.f35818b : h.m(0), 0.0f, this.f35846c != null ? AbstractC3055d0.f35818b : h.m(0), 0.0f, 10, null);
                o oVar = this.f35847d;
                interfaceC3163l.f(733328855);
                H hG = AbstractC2601e.g(L0.c.f4806a.m(), false, interfaceC3163l, 0);
                interfaceC3163l.f(-1323940314);
                int iA = AbstractC3157i.a(interfaceC3163l, 0);
                InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
                InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
                Function0 function0A = aVar.a();
                p pVarB = AbstractC2252x.b(iVarM);
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
                v1.b(interfaceC3163lA, hG, aVar.c());
                v1.b(interfaceC3163lA, interfaceC3184wE, aVar.e());
                o oVarB = aVar.b();
                if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                }
                pVarB.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
                interfaceC3163l.f(2058660585);
                androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f14485a;
                oVar.invoke(interfaceC3163l, 0);
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

        /* JADX INFO: renamed from: w0.d0$f$c */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o f35848a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(o oVar) {
                super(2);
                this.f35848a = oVar;
            }

            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                if ((i8 & 3) == 2 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(580312062, i8, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:358)");
                }
                i iVarB = androidx.compose.foundation.layout.f.b(i.f4836a, m.f37934a.m(), 0.0f, 2, null);
                o oVar = this.f35848a;
                interfaceC3163l.f(733328855);
                H hG = AbstractC2601e.g(L0.c.f4806a.m(), false, interfaceC3163l, 0);
                interfaceC3163l.f(-1323940314);
                int iA = AbstractC3157i.a(interfaceC3163l, 0);
                InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
                InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
                Function0 function0A = aVar.a();
                p pVarB = AbstractC2252x.b(iVarB);
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
                v1.b(interfaceC3163lA, hG, aVar.c());
                v1.b(interfaceC3163lA, interfaceC3184wE, aVar.e());
                o oVarB = aVar.b();
                if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                }
                pVarB.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
                interfaceC3163l.f(2058660585);
                androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f14485a;
                oVar.invoke(interfaceC3163l, 0);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(o oVar, C3053c0 c3053c0, boolean z8, o oVar2, T t8, o oVar3) {
            super(2);
            this.f35837a = oVar;
            this.f35838b = c3053c0;
            this.f35839c = z8;
            this.f35840d = oVar2;
            this.f35841e = t8;
            this.f35842f = oVar3;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 3) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1065051884, i8, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:325)");
            }
            interfaceC3163l.f(1426260804);
            if (this.f35837a != null) {
                AbstractC3182v.a(B.a().c(C1598l0.g(this.f35838b.a(this.f35839c, interfaceC3163l, 0))), H0.c.b(interfaceC3163l, 2035552199, true, new a(this.f35837a)), interfaceC3163l, C0.f38510d | 48);
            }
            interfaceC3163l.N();
            C0 c0C = B.a().c(this.f35838b.b(this.f35839c, interfaceC3163l, 0).getValue());
            H0.a aVarB = H0.c.b(interfaceC3163l, -1728894036, true, new b(this.f35841e, this.f35837a, this.f35840d, this.f35842f));
            int i9 = C0.f38510d;
            AbstractC3182v.a(c0C, aVarB, interfaceC3163l, i9 | 48);
            if (this.f35840d != null) {
                AbstractC3182v.a(B.a().c(C1598l0.g(this.f35838b.c(this.f35839c, interfaceC3163l, 0))), H0.c.b(interfaceC3163l, 580312062, true, new c(this.f35840d)), interfaceC3163l, i9 | 48);
            }
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

    /* JADX INFO: renamed from: w0.d0$g */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f35849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f35850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f35851c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o f35852d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ o f35853e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f35854f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ C3053c0 f35855g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ J f35856h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ p073i0.m f35857i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f35858j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(o oVar, Function0 function0, i iVar, o oVar2, o oVar3, boolean z8, C3053c0 c3053c0, J j8, p073i0.m mVar, int i8) {
            super(2);
            this.f35849a = oVar;
            this.f35850b = function0;
            this.f35851c = iVar;
            this.f35852d = oVar2;
            this.f35853e = oVar3;
            this.f35854f = z8;
            this.f35855g = c3053c0;
            this.f35856h = j8;
            this.f35857i = mVar;
            this.f35858j = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            AbstractC3055d0.d(this.f35849a, this.f35850b, this.f35851c, this.f35852d, this.f35853e, this.f35854f, this.f35855g, this.f35856h, this.f35857i, interfaceC3163l, F0.a(this.f35858j | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:104:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:107:0x0209  */
    /* JADX WARN: Code duplicated, block: B:110:0x0211  */
    /* JADX WARN: Code duplicated, block: B:112:0x0219  */
    /* JADX WARN: Code duplicated, block: B:115:0x0271  */
    /* JADX WARN: Code duplicated, block: B:118:0x027a  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:74:0x0102  */
    /* JADX WARN: Code duplicated, block: B:75:0x0105  */
    /* JADX WARN: Code duplicated, block: B:78:0x010d  */
    /* JADX WARN: Code duplicated, block: B:81:0x012a  */
    /* JADX WARN: Code duplicated, block: B:83:0x012f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0137  */
    /* JADX WARN: Code duplicated, block: B:89:0x0190  */
    /* JADX WARN: Code duplicated, block: B:91:0x0196  */
    /* JADX WARN: Code duplicated, block: B:92:0x0199  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:98:0x01be  */
    public static final void a(S s8, InterfaceC3164l0 interfaceC3164l0, a0 a0Var, i iVar, p pVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        i iVar2;
        int i11;
        i iVar3;
        boolean zBooleanValue;
        float f8;
        q1 q1VarC;
        boolean zBooleanValue2;
        float f9;
        q1 q1VarC2;
        boolean zR;
        Object objG;
        i iVar4;
        P0 p0V;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1289304092);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 6) == 0) {
            i10 = ((i8 & 8) == 0 ? interfaceC3163lP.R(s8) : interfaceC3163lP.l(s8) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 48) == 0) {
            i10 |= interfaceC3163lP.R(interfaceC3164l0) ? 32 : 16;
        }
        if ((i9 & 4) != 0) {
            i10 |= 384;
        } else if ((i8 & 384) == 0) {
            i10 |= interfaceC3163lP.R(a0Var) ? 256 : 128;
        }
        int i12 = i9 & 8;
        if (i12 == 0) {
            if ((i8 & 3072) == 0) {
                iVar2 = iVar;
                i10 |= interfaceC3163lP.R(iVar2) ? 2048 : 1024;
            }
            if ((i9 & 16) != 0) {
                i10 |= 24576;
            } else if ((i8 & 24576) == 0) {
                if (interfaceC3163lP.l(pVar)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i10 |= i11;
            }
            if ((i10 & 9363) == 9362 || !interfaceC3163lP.s()) {
                if (i12 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1289304092, i10, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:232)");
                }
                f0 f0VarE = g0.e(s8, "DropDownMenu", interfaceC3163lP, S.f20059d | 48 | (i10 & 14), 0);
                e eVar = e.f35836a;
                interfaceC3163lP.f(-1338768149);
                C2635m c2635m = C2635m.f28814a;
                j0 j0VarI = l0.i(c2635m);
                interfaceC3163lP.f(-142660079);
                zBooleanValue = ((Boolean) f0VarE.h()).booleanValue();
                interfaceC3163lP.f(2092995144);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(2092995144, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:254)");
                }
                if (zBooleanValue) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.8f;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                interfaceC3163lP.N();
                Float fValueOf = Float.valueOf(f8);
                boolean zBooleanValue3 = ((Boolean) f0VarE.n()).booleanValue();
                interfaceC3163lP.f(2092995144);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(2092995144, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:254)");
                }
                float f10 = zBooleanValue3 ? 1.0f : 0.8f;
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                interfaceC3163lP.N();
                int i13 = i10;
                i iVar5 = iVar3;
                q1VarC = g0.c(f0VarE, fValueOf, Float.valueOf(f10), (E) eVar.invoke(f0VarE.l(), interfaceC3163lP, 0), j0VarI, "FloatAnimation", interfaceC3163lP, 0);
                interfaceC3163lP.N();
                interfaceC3163lP.N();
                d dVar = d.f35835a;
                interfaceC3163lP.f(-1338768149);
                j0 j0VarI2 = l0.i(c2635m);
                interfaceC3163lP.f(-142660079);
                zBooleanValue2 = ((Boolean) f0VarE.h()).booleanValue();
                interfaceC3163lP.f(1546829492);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1546829492, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:268)");
                }
                if (zBooleanValue2) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                interfaceC3163lP.N();
                Float fValueOf2 = Float.valueOf(f9);
                boolean zBooleanValue4 = ((Boolean) f0VarE.n()).booleanValue();
                interfaceC3163lP.f(1546829492);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1546829492, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:268)");
                }
                float f11 = zBooleanValue4 ? 1.0f : 0.0f;
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                interfaceC3163lP.N();
                q1VarC2 = g0.c(f0VarE, fValueOf2, Float.valueOf(f11), (E) dVar.invoke(f0VarE.l(), interfaceC3163lP, 0), j0VarI2, "FloatAnimation", interfaceC3163lP, 0);
                interfaceC3163lP.N();
                interfaceC3163lP.N();
                i.a aVar = i.f4836a;
                interfaceC3163lP.f(1402453378);
                zR = ((i13 & 112) == 32) | interfaceC3163lP.R(q1VarC) | interfaceC3163lP.R(q1VarC2);
                objG = interfaceC3163lP.g();
                if (zR || objG == InterfaceC3163l.f38803a.a()) {
                    objG = new a(interfaceC3164l0, q1VarC, q1VarC2);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                i iVarA = androidx.compose.ui.graphics.b.a(aVar, (k) objG);
                m mVar = m.f37934a;
                iVar4 = iVar5;
                F0.a(iVarA, z0.d(mVar.c(), interfaceC3163lP, 6), AbstractC3091w.f(Z.f35786a.a(interfaceC3163lP, 6), mVar.a()), 0L, mVar.b(), mVar.b(), null, H0.c.b(interfaceC3163lP, -1266256833, true, new b(iVar4, a0Var, pVar)), interfaceC3163lP, 12804096, 72);
                interfaceC3163lP = interfaceC3163lP;
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            } else {
                interfaceC3163lP.z();
                iVar4 = iVar2;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new c(s8, interfaceC3164l0, a0Var, iVar4, pVar, i8, i9));
            }
        }
        i10 |= 3072;
        iVar2 = iVar;
        if ((i9 & 16) != 0) {
            i10 |= 24576;
        } else if ((i8 & 24576) == 0) {
            if (interfaceC3163lP.l(pVar)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i10 |= i11;
        }
        if ((i10 & 9363) == 9362) {
            if (i12 != 0) {
                iVar3 = i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1289304092, i10, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:232)");
            }
            f0 f0VarE2 = g0.e(s8, "DropDownMenu", interfaceC3163lP, S.f20059d | 48 | (i10 & 14), 0);
            e eVar2 = e.f35836a;
            interfaceC3163lP.f(-1338768149);
            C2635m c2635m2 = C2635m.f28814a;
            j0 j0VarI3 = l0.i(c2635m2);
            interfaceC3163lP.f(-142660079);
            zBooleanValue = ((Boolean) f0VarE2.h()).booleanValue();
            interfaceC3163lP.f(2092995144);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(2092995144, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:254)");
            }
            if (zBooleanValue) {
                f8 = 1.0f;
            } else {
                f8 = 0.8f;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163lP.N();
            Float fValueOf3 = Float.valueOf(f8);
            boolean zBooleanValue5 = ((Boolean) f0VarE2.n()).booleanValue();
            interfaceC3163lP.f(2092995144);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(2092995144, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:254)");
            }
            if (zBooleanValue5) {
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163lP.N();
            int i14 = i10;
            i iVar6 = iVar3;
            q1VarC = g0.c(f0VarE2, fValueOf3, Float.valueOf(f10), (E) eVar2.invoke(f0VarE2.l(), interfaceC3163lP, 0), j0VarI3, "FloatAnimation", interfaceC3163lP, 0);
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            d dVar2 = d.f35835a;
            interfaceC3163lP.f(-1338768149);
            j0 j0VarI4 = l0.i(c2635m2);
            interfaceC3163lP.f(-142660079);
            zBooleanValue2 = ((Boolean) f0VarE2.h()).booleanValue();
            interfaceC3163lP.f(1546829492);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1546829492, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:268)");
            }
            if (zBooleanValue2) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163lP.N();
            Float fValueOf4 = Float.valueOf(f9);
            boolean zBooleanValue6 = ((Boolean) f0VarE2.n()).booleanValue();
            interfaceC3163lP.f(1546829492);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1546829492, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:268)");
            }
            if (zBooleanValue6) {
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163lP.N();
            q1VarC2 = g0.c(f0VarE2, fValueOf4, Float.valueOf(f11), (E) dVar2.invoke(f0VarE2.l(), interfaceC3163lP, 0), j0VarI4, "FloatAnimation", interfaceC3163lP, 0);
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            i.a aVar2 = i.f4836a;
            interfaceC3163lP.f(1402453378);
            zR = ((i14 & 112) == 32) | interfaceC3163lP.R(q1VarC) | interfaceC3163lP.R(q1VarC2);
            objG = interfaceC3163lP.g();
            if (zR) {
                objG = new a(interfaceC3164l0, q1VarC, q1VarC2);
                interfaceC3163lP.H(objG);
            } else {
                objG = new a(interfaceC3164l0, q1VarC, q1VarC2);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            i iVarA2 = androidx.compose.ui.graphics.b.a(aVar2, (k) objG);
            m mVar2 = m.f37934a;
            iVar4 = iVar6;
            F0.a(iVarA2, z0.d(mVar2.c(), interfaceC3163lP, 6), AbstractC3091w.f(Z.f35786a.a(interfaceC3163lP, 6), mVar2.a()), 0L, mVar2.b(), mVar2.b(), null, H0.c.b(interfaceC3163lP, -1266256833, true, new b(iVar4, a0Var, pVar)), interfaceC3163lP, 12804096, 72);
            interfaceC3163lP = interfaceC3163lP;
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
                AbstractC3169o.W(-1289304092, i10, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:232)");
            }
            f0 f0VarE3 = g0.e(s8, "DropDownMenu", interfaceC3163lP, S.f20059d | 48 | (i10 & 14), 0);
            e eVar3 = e.f35836a;
            interfaceC3163lP.f(-1338768149);
            C2635m c2635m3 = C2635m.f28814a;
            j0 j0VarI5 = l0.i(c2635m3);
            interfaceC3163lP.f(-142660079);
            zBooleanValue = ((Boolean) f0VarE3.h()).booleanValue();
            interfaceC3163lP.f(2092995144);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(2092995144, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:254)");
            }
            if (zBooleanValue) {
                f8 = 1.0f;
            } else {
                f8 = 0.8f;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163lP.N();
            Float fValueOf5 = Float.valueOf(f8);
            boolean zBooleanValue7 = ((Boolean) f0VarE3.n()).booleanValue();
            interfaceC3163lP.f(2092995144);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(2092995144, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:254)");
            }
            if (zBooleanValue7) {
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163lP.N();
            int i15 = i10;
            i iVar7 = iVar3;
            q1VarC = g0.c(f0VarE3, fValueOf5, Float.valueOf(f10), (E) eVar3.invoke(f0VarE3.l(), interfaceC3163lP, 0), j0VarI5, "FloatAnimation", interfaceC3163lP, 0);
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            d dVar3 = d.f35835a;
            interfaceC3163lP.f(-1338768149);
            j0 j0VarI6 = l0.i(c2635m3);
            interfaceC3163lP.f(-142660079);
            zBooleanValue2 = ((Boolean) f0VarE3.h()).booleanValue();
            interfaceC3163lP.f(1546829492);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1546829492, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:268)");
            }
            if (zBooleanValue2) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163lP.N();
            Float fValueOf6 = Float.valueOf(f9);
            boolean zBooleanValue8 = ((Boolean) f0VarE3.n()).booleanValue();
            interfaceC3163lP.f(1546829492);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1546829492, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:268)");
            }
            if (zBooleanValue8) {
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163lP.N();
            q1VarC2 = g0.c(f0VarE3, fValueOf6, Float.valueOf(f11), (E) dVar3.invoke(f0VarE3.l(), interfaceC3163lP, 0), j0VarI6, "FloatAnimation", interfaceC3163lP, 0);
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            i.a aVar3 = i.f4836a;
            interfaceC3163lP.f(1402453378);
            zR = ((i15 & 112) == 32) | interfaceC3163lP.R(q1VarC) | interfaceC3163lP.R(q1VarC2);
            objG = interfaceC3163lP.g();
            if (zR) {
                objG = new a(interfaceC3164l0, q1VarC, q1VarC2);
                interfaceC3163lP.H(objG);
            } else {
                objG = new a(interfaceC3164l0, q1VarC, q1VarC2);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            i iVarA3 = androidx.compose.ui.graphics.b.a(aVar3, (k) objG);
            m mVar3 = m.f37934a;
            iVar4 = iVar7;
            F0.a(iVarA3, z0.d(mVar3.c(), interfaceC3163lP, 6), AbstractC3091w.f(Z.f35786a.a(interfaceC3163lP, 6), mVar3.a()), 0L, mVar3.b(), mVar3.b(), null, H0.c.b(interfaceC3163lP, -1266256833, true, new b(iVar4, a0Var, pVar)), interfaceC3163lP, 12804096, 72);
            interfaceC3163lP = interfaceC3163lP;
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new c(s8, interfaceC3164l0, a0Var, iVar4, pVar, i8, i9));
        }
    }

    public static final float b(q1 q1Var) {
        return ((Number) q1Var.getValue()).floatValue();
    }

    public static final float c(q1 q1Var) {
        return ((Number) q1Var.getValue()).floatValue();
    }

    public static final void d(o oVar, Function0 function0, i iVar, o oVar2, o oVar3, boolean z8, C3053c0 c3053c0, J j8, p073i0.m mVar, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1564716777);
        if ((i8 & 6) == 0) {
            i9 = (interfaceC3163lP.l(oVar) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            i9 |= interfaceC3163lP.l(function0) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i9 |= interfaceC3163lP.R(iVar) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i9 |= interfaceC3163lP.l(oVar2) ? 2048 : 1024;
        }
        if ((i8 & 24576) == 0) {
            i9 |= interfaceC3163lP.l(oVar3) ? 16384 : 8192;
        }
        if ((196608 & i8) == 0) {
            i9 |= interfaceC3163lP.c(z8) ? 131072 : 65536;
        }
        if ((1572864 & i8) == 0) {
            i9 |= interfaceC3163lP.R(c3053c0) ? 1048576 : 524288;
        }
        if ((12582912 & i8) == 0) {
            i9 |= interfaceC3163lP.R(j8) ? 8388608 : 4194304;
        }
        if ((100663296 & i8) == 0) {
            i9 |= interfaceC3163lP.R(mVar) ? 67108864 : 33554432;
        }
        if ((38347923 & i9) == 38347922 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1564716777, i9, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:304)");
            }
            i iVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.d.c(iVar, mVar, n.e(true, 0.0f, 0L, interfaceC3163lP, 6, 6), z8, null, null, function0, 24, null), 0.0f, 1, null);
            float f8 = f35820d;
            float f9 = f35821e;
            m mVar2 = m.f37934a;
            i iVarH2 = androidx.compose.foundation.layout.e.h(androidx.compose.foundation.layout.f.o(iVarH, f8, mVar2.d(), f9, 0.0f, 8, null), j8);
            L0.c.InterfaceC0174c interfaceC0174cG = L0.c.f4806a.g();
            interfaceC3163lP.f(693286680);
            H hA = p082j0.S.a(C2598b.f27914a.f(), interfaceC0174cG, interfaceC3163lP, 48);
            interfaceC3163lP.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163lP, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163lP.E();
            InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar.a();
            p pVarB = AbstractC2252x.b(iVarH2);
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
            v1.b(interfaceC3163lA, hA, aVar.c());
            v1.b(interfaceC3163lA, interfaceC3184wE, aVar.e());
            o oVarB = aVar.b();
            if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
            interfaceC3163lP.f(2058660585);
            P0.a(V0.a(Z.f35786a.c(interfaceC3163lP, 6), mVar2.i()), H0.c.b(interfaceC3163lP, 1065051884, true, new f(oVar2, c3053c0, z8, oVar3, U.f27892a, oVar)), interfaceC3163lP, 48);
            interfaceC3163lP.N();
            interfaceC3163lP.O();
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new g(oVar, function0, iVar, oVar2, oVar3, z8, c3053c0, j8, mVar, i8));
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0053  */
    /* JADX WARN: Code duplicated, block: B:4:0x000d  */
    public static final long h(A1.p pVar, A1.p pVar2) {
        float fMax;
        float fMax2 = 1.0f;
        if (pVar2.d() >= pVar.e()) {
            fMax = 0.0f;
        } else if (pVar2.e() <= pVar.d()) {
            fMax = 1.0f;
        } else if (pVar2.g() == 0) {
            fMax = 0.0f;
        } else {
            fMax = (((Math.max(pVar.d(), pVar2.d()) + Math.min(pVar.e(), pVar2.e())) / 2) - pVar2.d()) / pVar2.g();
        }
        if (pVar2.f() >= pVar.a()) {
            fMax2 = 0.0f;
        } else if (pVar2.a() > pVar.f()) {
            if (pVar2.c() == 0) {
                fMax2 = 0.0f;
            } else {
                fMax2 = (((Math.max(pVar.f(), pVar2.f()) + Math.min(pVar.a(), pVar2.a())) / 2) - pVar2.f()) / pVar2.c();
            }
        }
        return a1.a(fMax, fMax2);
    }

    public static final float i() {
        return f35819c;
    }

    public static final float j() {
        return f35817a;
    }
}
