package J3;

import C6.G;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2252x;
import p038e1.H;
import p056g1.InterfaceC2343g;
import p082j0.AbstractC2607k;
import p082j0.C2598b;
import p082j0.C2609m;
import p082j0.S;
import p082j0.U;
import p110m1.x;
import p128o1.I;
import p191w0.AbstractC3091w;
import p191w0.O;
import p191w0.P0;
import p191w0.Z;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3182v;
import p215z0.C0;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3184w;
import p215z0.R0;
import p215z0.v1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L0.i f4209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f4210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ J3.d f4211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f4212d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L0.i iVar, String str, J3.d dVar, Function0 function0) {
            super(2);
            this.f4209a = iVar;
            this.f4210b = str;
            this.f4211c = dVar;
            this.f4212d = function0;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1341251774, i8, -1, "com.elgato.streamdeck.ui.components.DialogButton.<anonymous> (DialogContent.kt:136)");
            }
            J3.b.b(this.f4210b, androidx.compose.foundation.layout.f.h(this.f4209a, 0.0f, 1, null), null, this.f4211c, J3.c.M, null, false, this.f4212d, interfaceC3163l, 24576, 100);
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

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f4213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J3.d f4214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ L0.i f4215c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f4216d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f4217e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, J3.d dVar, L0.i iVar, Function0 function0, int i8) {
            super(2);
            this.f4213a = str;
            this.f4214b = dVar;
            this.f4215c = iVar;
            this.f4216d = function0;
            this.f4217e = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            i.a(this.f4213a, this.f4214b, this.f4215c, this.f4216d, interfaceC3163l, F0.a(this.f4217e | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Integer f4218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f4219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Q6.o f4220c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f4221d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f4222e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f4223f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f4224g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Function0 f4225h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f4226i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Function0 f4227j;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f4228a = new a();

            public a() {
                super(1);
            }

            public final void b(x semantics) {
                t.g(semantics, "$this$semantics");
                p110m1.u.X(semantics, "destructive_button");
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((x) obj);
                return G.f1419a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f4229a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m64invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m64invoke() {
            }
        }

        /* JADX INFO: renamed from: J3.i$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0157c extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0157c f4230a = new C0157c();

            public C0157c() {
                super(1);
            }

            public final void b(x semantics) {
                t.g(semantics, "$this$semantics");
                p110m1.u.X(semantics, "secondary_button");
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((x) obj);
                return G.f1419a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class d extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f4231a = new d();

            public d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m65invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m65invoke() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class e extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f4232a = new e();

            public e() {
                super(1);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((x) obj);
                return G.f1419a;
            }

            public final void b(x xVar) {
                t.g(xVar, yOZfxp.HBiB);
                p110m1.u.X(xVar, "primary_button");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class f extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f4233a = new f();

            public f() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m66invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m66invoke() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Integer num, String str, Q6.o oVar, String str2, String str3, String str4, String str5, Function0 function0, Function0 function1, Function0 function2) {
            super(2);
            this.f4218a = num;
            this.f4219b = str;
            this.f4220c = oVar;
            this.f4221d = str2;
            this.f4222e = str3;
            this.f4223f = str4;
            this.f4224g = str5;
            this.f4225h = function0;
            this.f4226i = function1;
            this.f4227j = function2;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            String str;
            Function0 function0;
            String str2;
            Integer num;
            L0.i.a aVar;
            Object obj;
            int i9;
            InterfaceC3163l interfaceC3163l2 = interfaceC3163l;
            if ((i8 & 11) == 2 && interfaceC3163l2.s()) {
                interfaceC3163l2.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1796588356, i8, -1, "com.elgato.streamdeck.ui.components.DialogContent.<anonymous> (DialogContent.kt:55)");
            }
            L0.i.a aVar2 = L0.i.f4836a;
            W3.c cVar = W3.c.f11463a;
            L0.i iVarI = androidx.compose.foundation.layout.e.i(aVar2, cVar.j());
            C2598b c2598b = C2598b.f27914a;
            C2598b.e eVarN = c2598b.n(cVar.j());
            Integer num2 = this.f4218a;
            String str3 = this.f4219b;
            Q6.o oVar = this.f4220c;
            String str4 = this.f4221d;
            String str5 = this.f4222e;
            String str6 = this.f4223f;
            String str7 = this.f4224g;
            Function0 function1 = this.f4225h;
            Function0 function2 = this.f4226i;
            Function0 function3 = this.f4227j;
            interfaceC3163l2.f(-483455358);
            L0.c.a aVar3 = L0.c.f4806a;
            H hA = AbstractC2607k.a(eVarN, aVar3.i(), interfaceC3163l2, 0);
            interfaceC3163l2.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163l2, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163l2.E();
            InterfaceC2343g.a aVar4 = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar4.a();
            Q6.p pVarB = AbstractC2252x.b(iVarI);
            if (interfaceC3163l2.t() == null) {
                AbstractC3157i.c();
            }
            interfaceC3163l2.r();
            if (interfaceC3163l2.m()) {
                interfaceC3163l2.w(function0A);
            } else {
                interfaceC3163l2.G();
            }
            InterfaceC3163l interfaceC3163lA = v1.a(interfaceC3163l2);
            v1.b(interfaceC3163lA, hA, aVar4.c());
            v1.b(interfaceC3163lA, interfaceC3184wE, aVar4.e());
            Q6.o oVarB = aVar4.b();
            if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB.invoke(R0.a(R0.b(interfaceC3163l2)), interfaceC3163l2, 0);
            interfaceC3163l2.f(2058660585);
            C2609m c2609m = C2609m.f28036a;
            interfaceC3163l2.f(1089600000);
            if (num2 == null) {
                str2 = str5;
                str = str7;
                function0 = function1;
            } else {
                int iIntValue = num2.intValue();
                C2598b.e eVarB = c2598b.b();
                L0.i iVarH = androidx.compose.foundation.layout.f.h(aVar2, 0.0f, 1, null);
                interfaceC3163l2.f(693286680);
                H hA2 = S.a(eVarB, aVar3.j(), interfaceC3163l2, 6);
                interfaceC3163l2.f(-1323940314);
                int iA2 = AbstractC3157i.a(interfaceC3163l2, 0);
                InterfaceC3184w interfaceC3184wE2 = interfaceC3163l2.E();
                Function0 function0A2 = aVar4.a();
                Q6.p pVarB2 = AbstractC2252x.b(iVarH);
                if (interfaceC3163l2.t() == null) {
                    AbstractC3157i.c();
                }
                interfaceC3163l2.r();
                if (interfaceC3163l2.m()) {
                    interfaceC3163l2.w(function0A2);
                } else {
                    interfaceC3163l2.G();
                }
                InterfaceC3163l interfaceC3163lA2 = v1.a(interfaceC3163l2);
                v1.b(interfaceC3163lA2, hA2, aVar4.c());
                v1.b(interfaceC3163lA2, interfaceC3184wE2, aVar4.e());
                Q6.o oVarB2 = aVar4.b();
                if (interfaceC3163lA2.m() || !t.c(interfaceC3163lA2.g(), Integer.valueOf(iA2))) {
                    interfaceC3163lA2.H(Integer.valueOf(iA2));
                    interfaceC3163lA2.A(Integer.valueOf(iA2), oVarB2);
                }
                pVarB2.invoke(R0.a(R0.b(interfaceC3163l2)), interfaceC3163l2, 0);
                interfaceC3163l2.f(2058660585);
                U u8 = U.f27892a;
                str = str7;
                function0 = function1;
                str2 = str5;
                O.b(p101l1.g.b(V0.d.f10289k, iIntValue, interfaceC3163l2, 8), null, androidx.compose.foundation.layout.f.l(aVar2, A1.h.m(72)), 0L, interfaceC3163l, 432, 8);
                interfaceC3163l2 = interfaceC3163l;
                interfaceC3163l2.N();
                interfaceC3163l2.O();
                interfaceC3163l2.N();
                interfaceC3163l2.N();
                G g8 = G.f1419a;
            }
            interfaceC3163l2.N();
            Z z8 = Z.f35786a;
            int i10 = Z.f35787b;
            I iH = z8.c(interfaceC3163l2, i10).h();
            z1.j.a aVar5 = p216z1.j.f39010b;
            Function0 function4 = function0;
            P0.b(str3, null, 0L, 0L, null, null, null, 0L, null, p216z1.j.h(aVar5.d()), 0L, 0, false, 0, 0, null, iH, interfaceC3163l, 0, 0, 65022);
            InterfaceC3163l interfaceC3163l3 = interfaceC3163l;
            if (oVar != null) {
                interfaceC3163l3.f(1089600649);
                oVar.invoke(interfaceC3163l3, 0);
                interfaceC3163l3.N();
                num = 0;
            } else {
                interfaceC3163l3.f(1089600703);
                num = 0;
                P0.b(str4, null, 0L, 0L, null, null, null, 0L, null, p216z1.j.h(aVar5.d()), 0L, 0, false, 0, 0, null, z8.c(interfaceC3163l3, i10).b(), interfaceC3163l, 0, 0, 65022);
                interfaceC3163l3 = interfaceC3163l;
                interfaceC3163l3.N();
            }
            C2598b.e eVarN2 = c2598b.n(cVar.g());
            interfaceC3163l3.f(-483455358);
            H hA3 = AbstractC2607k.a(eVarN2, aVar3.i(), interfaceC3163l3, 0);
            interfaceC3163l3.f(-1323940314);
            int iA3 = AbstractC3157i.a(interfaceC3163l3, 0);
            InterfaceC3184w interfaceC3184wE3 = interfaceC3163l3.E();
            Function0 function0A3 = aVar4.a();
            Q6.p pVarB3 = AbstractC2252x.b(aVar2);
            if (interfaceC3163l3.t() == null) {
                AbstractC3157i.c();
            }
            interfaceC3163l3.r();
            if (interfaceC3163l3.m()) {
                interfaceC3163l3.w(function0A3);
            } else {
                interfaceC3163l3.G();
            }
            InterfaceC3163l interfaceC3163lA3 = v1.a(interfaceC3163l3);
            v1.b(interfaceC3163lA3, hA3, aVar4.c());
            v1.b(interfaceC3163lA3, interfaceC3184wE3, aVar4.e());
            Q6.o oVarB3 = aVar4.b();
            if (interfaceC3163lA3.m() || !t.c(interfaceC3163lA3.g(), Integer.valueOf(iA3))) {
                interfaceC3163lA3.H(Integer.valueOf(iA3));
                interfaceC3163lA3.A(Integer.valueOf(iA3), oVarB3);
            }
            pVarB3.invoke(R0.a(R0.b(interfaceC3163l3)), interfaceC3163l3, num);
            interfaceC3163l3.f(2058660585);
            interfaceC3163l3.f(-99454578);
            if (str2 == null) {
                aVar = aVar2;
                obj = null;
                i9 = 1;
            } else {
                aVar = aVar2;
                obj = null;
                i9 = 1;
                i.a(str2, J3.d.DANGER, p110m1.n.d(aVar, false, a.f4228a, 1, null), function4 == null ? b.f4229a : function4, interfaceC3163l3, 48);
                G g9 = G.f1419a;
            }
            interfaceC3163l3.N();
            interfaceC3163l3.f(-99454177);
            if (str6 != 0) {
                i.a(str6, J3.d.f4151d, p110m1.n.d(aVar, false, C0157c.f4230a, i9, obj), function2 == null ? d.f4231a : function2, interfaceC3163l3, 48);
                G g10 = G.f1419a;
            }
            interfaceC3163l3.N();
            interfaceC3163l3.f(1089601812);
            if (str != null) {
                i.a(str, J3.d.ACCENT, p110m1.n.d(aVar, false, e.f4232a, i9, obj), function3 == null ? f.f4233a : function3, interfaceC3163l3, 48);
                G g11 = G.f1419a;
            }
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

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f4234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f4235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ L0.i f4236c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Integer f4237d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f4238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Function0 f4239f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f4240g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Function0 f4241h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f4242i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Function0 f4243j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Q6.o f4244k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f4245l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f4246m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f4247n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, L0.i iVar, Integer num, String str3, Function0 function0, String str4, Function0 function1, String str5, Function0 function2, Q6.o oVar, int i8, int i9, int i10) {
            super(2);
            this.f4234a = str;
            this.f4235b = str2;
            this.f4236c = iVar;
            this.f4237d = num;
            this.f4238e = str3;
            this.f4239f = function0;
            this.f4240g = str4;
            this.f4241h = function1;
            this.f4242i = str5;
            this.f4243j = function2;
            this.f4244k = oVar;
            this.f4245l = i8;
            this.f4246m = i9;
            this.f4247n = i10;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            i.b(this.f4234a, this.f4235b, this.f4236c, this.f4237d, this.f4238e, this.f4239f, this.f4240g, this.f4241h, this.f4242i, this.f4243j, this.f4244k, interfaceC3163l, F0.a(this.f4245l | 1), F0.a(this.f4246m), this.f4247n);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(String str, J3.d dVar, L0.i iVar, Function0 function0, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1154802690);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.R(str) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= interfaceC3163lP.R(dVar) ? 32 : 16;
        }
        if ((i8 & 896) == 0) {
            i9 |= interfaceC3163lP.R(iVar) ? 256 : 128;
        }
        if ((i8 & 7168) == 0) {
            i9 |= interfaceC3163lP.l(function0) ? 2048 : 1024;
        }
        if ((i9 & 5851) == 1170 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1154802690, i9, -1, "com.elgato.streamdeck.ui.components.DialogButton (DialogContent.kt:131)");
            }
            AbstractC3182v.b(new C0[]{p191w0.F0.f().c(A1.h.d(A1.h.m(0))), AbstractC3091w.h().c(Boolean.FALSE)}, H0.c.b(interfaceC3163lP, 1341251774, true, new a(iVar, str, dVar, function0)), interfaceC3163lP, 56);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        p215z0.P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(str, dVar, iVar, function0, i8));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0133  */
    /* JADX WARN: Code duplicated, block: B:105:0x013d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0140  */
    /* JADX WARN: Code duplicated, block: B:110:0x0148  */
    /* JADX WARN: Code duplicated, block: B:111:0x0151  */
    /* JADX WARN: Code duplicated, block: B:113:0x0155  */
    /* JADX WARN: Code duplicated, block: B:115:0x015f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0162  */
    /* JADX WARN: Code duplicated, block: B:118:0x0169  */
    /* JADX WARN: Code duplicated, block: B:121:0x0179  */
    /* JADX WARN: Code duplicated, block: B:127:0x019a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x019c  */
    /* JADX WARN: Code duplicated, block: B:129:0x019f  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:136:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:139:0x01af  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:145:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:146:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:152:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:158:0x022a  */
    /* JADX WARN: Code duplicated, block: B:162:0x023d  */
    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x0109  */
    /* JADX WARN: Code duplicated, block: B:92:0x010f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0119  */
    /* JADX WARN: Code duplicated, block: B:95:0x011c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0124  */
    public static final void b(String title, String message, L0.i iVar, Integer num, String str, Function0 function0, String str2, Function0 function1, String str3, Function0 function2, Q6.o oVar, InterfaceC3163l interfaceC3163l, int i8, int i9, int i10) {
        int i11;
        L0.i iVar2;
        int i12;
        Integer num2;
        int i13;
        int i14;
        String str4;
        int i15;
        int i16;
        Function0 function3;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        L0.i iVar3;
        String str5;
        Function0 function4;
        String str6;
        Function0 function5;
        String str7;
        Function0 function6;
        Q6.o oVar2;
        InterfaceC3163l interfaceC3163l2;
        String str8;
        String str9;
        String str10;
        Function0 function7;
        Function0 function8;
        Function0 function9;
        Integer num3;
        Q6.o oVar3;
        L0.i iVar4;
        p215z0.P0 p0V;
        t.g(title, "title");
        t.g(message, "message");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1921333311);
        if ((i10 & 1) != 0) {
            i11 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i11 = (interfaceC3163lP.R(title) ? 4 : 2) | i8;
        } else {
            i11 = i8;
        }
        if ((i10 & 2) != 0) {
            i11 |= 48;
        } else if ((i8 & 112) == 0) {
            i11 |= interfaceC3163lP.R(message) ? 32 : 16;
        }
        int i29 = i10 & 4;
        if (i29 == 0) {
            if ((i8 & 896) == 0) {
                iVar2 = iVar;
                i11 |= interfaceC3163lP.R(iVar2) ? 256 : 128;
            }
            i12 = i10 & 8;
            if (i12 != 0) {
                if ((i8 & 7168) == 0) {
                    num2 = num;
                    if (interfaceC3163lP.R(num2)) {
                        i13 = 2048;
                    } else {
                        i13 = 1024;
                    }
                    i11 |= i13;
                }
                i14 = i10 & 16;
                if (i14 != 0) {
                    if ((57344 & i8) == 0) {
                        str4 = str;
                        if (interfaceC3163lP.R(str4)) {
                            i15 = 16384;
                        } else {
                            i15 = 8192;
                        }
                        i11 |= i15;
                    }
                    i16 = i10 & 32;
                    if (i16 != 0) {
                        i11 |= 196608;
                        function3 = function0;
                    } else {
                        function3 = function0;
                        if ((i8 & 458752) == 0) {
                            if (interfaceC3163lP.l(function3)) {
                                i17 = 131072;
                            } else {
                                i17 = 65536;
                            }
                            i11 |= i17;
                        }
                    }
                    i18 = i10 & 64;
                    if (i18 != 0) {
                        i11 |= 1572864;
                    } else if ((i8 & 3670016) == 0) {
                        if (interfaceC3163lP.R(str2)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i11 |= i19;
                    }
                    i20 = i10 & 128;
                    if (i20 != 0) {
                        i11 |= 12582912;
                    } else if ((i8 & 29360128) == 0) {
                        if (interfaceC3163lP.l(function1)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i11 |= i21;
                    }
                    i22 = i10 & 256;
                    if (i22 != 0) {
                        if ((i8 & 234881024) == 0) {
                            if (interfaceC3163lP.R(str3)) {
                                i23 = 67108864;
                            } else {
                                i23 = 33554432;
                            }
                            i11 |= i23;
                        }
                        i24 = i10 & 512;
                        if (i24 != 0) {
                            if ((i8 & 1879048192) == 0) {
                                if (interfaceC3163lP.l(function2)) {
                                    i25 = 536870912;
                                } else {
                                    i25 = 268435456;
                                }
                                i11 |= i25;
                            }
                            i26 = i10 & 1024;
                            if (i26 != 0) {
                                i27 = i9 | 6;
                            } else if ((i9 & 14) == 0) {
                                if (interfaceC3163lP.l(oVar)) {
                                    i28 = 4;
                                } else {
                                    i28 = 2;
                                }
                                i27 = i9 | i28;
                            } else {
                                i27 = i9;
                            }
                            if ((i11 & 1533916891) != 306783378 && (i27 & 11) == 2 && interfaceC3163lP.s()) {
                                interfaceC3163lP.z();
                                function9 = function1;
                                function8 = function2;
                                function7 = function3;
                                iVar4 = iVar2;
                                num3 = num2;
                                interfaceC3163l2 = interfaceC3163lP;
                                str9 = str4;
                                str10 = str2;
                                str8 = str3;
                                oVar3 = oVar;
                            } else {
                                if (i29 != 0) {
                                    iVar3 = L0.i.f4836a;
                                } else {
                                    iVar3 = iVar2;
                                }
                                if (i12 != 0) {
                                    num2 = null;
                                }
                                if (i14 != 0) {
                                    str5 = null;
                                } else {
                                    str5 = str4;
                                }
                                if (i16 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function3;
                                }
                                if (i18 != 0) {
                                    str6 = null;
                                } else {
                                    str6 = str2;
                                }
                                if (i20 != 0) {
                                    function5 = null;
                                } else {
                                    function5 = function1;
                                }
                                if (i22 != 0) {
                                    str7 = null;
                                } else {
                                    str7 = str3;
                                }
                                if (i24 != 0) {
                                    function6 = null;
                                } else {
                                    function6 = function2;
                                }
                                if (i26 != 0) {
                                    oVar2 = null;
                                } else {
                                    oVar2 = oVar;
                                }
                                if (AbstractC3169o.K()) {
                                    AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                                }
                                Q6.o oVar4 = oVar2;
                                L0.i iVar5 = iVar3;
                                Integer num4 = num2;
                                Function0 function10 = function5;
                                interfaceC3163l2 = interfaceC3163lP;
                                p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num4, title, oVar4, message, str7, str6, str5, function6, function10, function4)), interfaceC3163l2, 12607488, 104);
                                if (AbstractC3169o.K()) {
                                    AbstractC3169o.V();
                                }
                                str8 = str7;
                                str9 = str5;
                                str10 = str6;
                                function7 = function4;
                                function8 = function6;
                                function9 = function10;
                                num3 = num4;
                                oVar3 = oVar4;
                                iVar4 = iVar5;
                            }
                            p0V = interfaceC3163l2.v();
                            if (p0V != null) {
                                p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                            }
                        }
                        i11 |= 805306368;
                        i26 = i10 & 1024;
                        if (i26 != 0) {
                            i27 = i9 | 6;
                        } else if ((i9 & 14) == 0) {
                            if (interfaceC3163lP.l(oVar)) {
                                i28 = 4;
                            } else {
                                i28 = 2;
                            }
                            i27 = i9 | i28;
                        } else {
                            i27 = i9;
                        }
                        if ((i11 & 1533916891) != 306783378) {
                            if (i29 != 0) {
                                iVar3 = L0.i.f4836a;
                            } else {
                                iVar3 = iVar2;
                            }
                            if (i12 != 0) {
                                num2 = null;
                            }
                            if (i14 != 0) {
                                str5 = null;
                            } else {
                                str5 = str4;
                            }
                            if (i16 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if (i18 != 0) {
                                str6 = null;
                            } else {
                                str6 = str2;
                            }
                            if (i20 != 0) {
                                function5 = null;
                            } else {
                                function5 = function1;
                            }
                            if (i22 != 0) {
                                str7 = null;
                            } else {
                                str7 = str3;
                            }
                            if (i24 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i26 != 0) {
                                oVar2 = null;
                            } else {
                                oVar2 = oVar;
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                            }
                            Q6.o oVar5 = oVar2;
                            L0.i iVar6 = iVar3;
                            Integer num5 = num2;
                            Function0 function11 = function5;
                            interfaceC3163l2 = interfaceC3163lP;
                            p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num5, title, oVar5, message, str7, str6, str5, function6, function11, function4)), interfaceC3163l2, 12607488, 104);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            str8 = str7;
                            str9 = str5;
                            str10 = str6;
                            function7 = function4;
                            function8 = function6;
                            function9 = function11;
                            num3 = num5;
                            oVar3 = oVar5;
                            iVar4 = iVar6;
                        } else {
                            if (i29 != 0) {
                                iVar3 = L0.i.f4836a;
                            } else {
                                iVar3 = iVar2;
                            }
                            if (i12 != 0) {
                                num2 = null;
                            }
                            if (i14 != 0) {
                                str5 = null;
                            } else {
                                str5 = str4;
                            }
                            if (i16 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if (i18 != 0) {
                                str6 = null;
                            } else {
                                str6 = str2;
                            }
                            if (i20 != 0) {
                                function5 = null;
                            } else {
                                function5 = function1;
                            }
                            if (i22 != 0) {
                                str7 = null;
                            } else {
                                str7 = str3;
                            }
                            if (i24 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i26 != 0) {
                                oVar2 = null;
                            } else {
                                oVar2 = oVar;
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                            }
                            Q6.o oVar6 = oVar2;
                            L0.i iVar7 = iVar3;
                            Integer num6 = num2;
                            Function0 function12 = function5;
                            interfaceC3163l2 = interfaceC3163lP;
                            p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num6, title, oVar6, message, str7, str6, str5, function6, function12, function4)), interfaceC3163l2, 12607488, 104);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            str8 = str7;
                            str9 = str5;
                            str10 = str6;
                            function7 = function4;
                            function8 = function6;
                            function9 = function12;
                            num3 = num6;
                            oVar3 = oVar6;
                            iVar4 = iVar7;
                        }
                        p0V = interfaceC3163l2.v();
                        if (p0V != null) {
                            p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                        }
                    }
                    i11 |= 100663296;
                    i24 = i10 & 512;
                    if (i24 != 0) {
                        if ((i8 & 1879048192) == 0) {
                            if (interfaceC3163lP.l(function2)) {
                                i25 = 536870912;
                            } else {
                                i25 = 268435456;
                            }
                            i11 |= i25;
                        }
                        i26 = i10 & 1024;
                        if (i26 != 0) {
                            i27 = i9 | 6;
                        } else if ((i9 & 14) == 0) {
                            if (interfaceC3163lP.l(oVar)) {
                                i28 = 4;
                            } else {
                                i28 = 2;
                            }
                            i27 = i9 | i28;
                        } else {
                            i27 = i9;
                        }
                        if ((i11 & 1533916891) != 306783378) {
                            if (i29 != 0) {
                                iVar3 = L0.i.f4836a;
                            } else {
                                iVar3 = iVar2;
                            }
                            if (i12 != 0) {
                                num2 = null;
                            }
                            if (i14 != 0) {
                                str5 = null;
                            } else {
                                str5 = str4;
                            }
                            if (i16 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if (i18 != 0) {
                                str6 = null;
                            } else {
                                str6 = str2;
                            }
                            if (i20 != 0) {
                                function5 = null;
                            } else {
                                function5 = function1;
                            }
                            if (i22 != 0) {
                                str7 = null;
                            } else {
                                str7 = str3;
                            }
                            if (i24 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i26 != 0) {
                                oVar2 = null;
                            } else {
                                oVar2 = oVar;
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                            }
                            Q6.o oVar7 = oVar2;
                            L0.i iVar8 = iVar3;
                            Integer num7 = num2;
                            Function0 function13 = function5;
                            interfaceC3163l2 = interfaceC3163lP;
                            p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num7, title, oVar7, message, str7, str6, str5, function6, function13, function4)), interfaceC3163l2, 12607488, 104);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            str8 = str7;
                            str9 = str5;
                            str10 = str6;
                            function7 = function4;
                            function8 = function6;
                            function9 = function13;
                            num3 = num7;
                            oVar3 = oVar7;
                            iVar4 = iVar8;
                        } else {
                            if (i29 != 0) {
                                iVar3 = L0.i.f4836a;
                            } else {
                                iVar3 = iVar2;
                            }
                            if (i12 != 0) {
                                num2 = null;
                            }
                            if (i14 != 0) {
                                str5 = null;
                            } else {
                                str5 = str4;
                            }
                            if (i16 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if (i18 != 0) {
                                str6 = null;
                            } else {
                                str6 = str2;
                            }
                            if (i20 != 0) {
                                function5 = null;
                            } else {
                                function5 = function1;
                            }
                            if (i22 != 0) {
                                str7 = null;
                            } else {
                                str7 = str3;
                            }
                            if (i24 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i26 != 0) {
                                oVar2 = null;
                            } else {
                                oVar2 = oVar;
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                            }
                            Q6.o oVar8 = oVar2;
                            L0.i iVar9 = iVar3;
                            Integer num8 = num2;
                            Function0 function14 = function5;
                            interfaceC3163l2 = interfaceC3163lP;
                            p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num8, title, oVar8, message, str7, str6, str5, function6, function14, function4)), interfaceC3163l2, 12607488, 104);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            str8 = str7;
                            str9 = str5;
                            str10 = str6;
                            function7 = function4;
                            function8 = function6;
                            function9 = function14;
                            num3 = num8;
                            oVar3 = oVar8;
                            iVar4 = iVar9;
                        }
                        p0V = interfaceC3163l2.v();
                        if (p0V != null) {
                            p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                        }
                    }
                    i11 |= 805306368;
                    i26 = i10 & 1024;
                    if (i26 != 0) {
                        i27 = i9 | 6;
                    } else if ((i9 & 14) == 0) {
                        if (interfaceC3163lP.l(oVar)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i9 | i28;
                    } else {
                        i27 = i9;
                    }
                    if ((i11 & 1533916891) != 306783378) {
                        if (i29 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i12 != 0) {
                            num2 = null;
                        }
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i16 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i18 != 0) {
                            str6 = null;
                        } else {
                            str6 = str2;
                        }
                        if (i20 != 0) {
                            function5 = null;
                        } else {
                            function5 = function1;
                        }
                        if (i22 != 0) {
                            str7 = null;
                        } else {
                            str7 = str3;
                        }
                        if (i24 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i26 != 0) {
                            oVar2 = null;
                        } else {
                            oVar2 = oVar;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                        }
                        Q6.o oVar9 = oVar2;
                        L0.i iVar10 = iVar3;
                        Integer num9 = num2;
                        Function0 function15 = function5;
                        interfaceC3163l2 = interfaceC3163lP;
                        p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num9, title, oVar9, message, str7, str6, str5, function6, function15, function4)), interfaceC3163l2, 12607488, 104);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        str8 = str7;
                        str9 = str5;
                        str10 = str6;
                        function7 = function4;
                        function8 = function6;
                        function9 = function15;
                        num3 = num9;
                        oVar3 = oVar9;
                        iVar4 = iVar10;
                    } else {
                        if (i29 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i12 != 0) {
                            num2 = null;
                        }
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i16 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i18 != 0) {
                            str6 = null;
                        } else {
                            str6 = str2;
                        }
                        if (i20 != 0) {
                            function5 = null;
                        } else {
                            function5 = function1;
                        }
                        if (i22 != 0) {
                            str7 = null;
                        } else {
                            str7 = str3;
                        }
                        if (i24 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i26 != 0) {
                            oVar2 = null;
                        } else {
                            oVar2 = oVar;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                        }
                        Q6.o oVar10 = oVar2;
                        L0.i iVar11 = iVar3;
                        Integer num10 = num2;
                        Function0 function16 = function5;
                        interfaceC3163l2 = interfaceC3163lP;
                        p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num10, title, oVar10, message, str7, str6, str5, function6, function16, function4)), interfaceC3163l2, 12607488, 104);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        str8 = str7;
                        str9 = str5;
                        str10 = str6;
                        function7 = function4;
                        function8 = function6;
                        function9 = function16;
                        num3 = num10;
                        oVar3 = oVar10;
                        iVar4 = iVar11;
                    }
                    p0V = interfaceC3163l2.v();
                    if (p0V != null) {
                        p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                    }
                }
                i11 |= 24576;
                str4 = str;
                i16 = i10 & 32;
                if (i16 != 0) {
                    i11 |= 196608;
                    function3 = function0;
                } else {
                    function3 = function0;
                    if ((i8 & 458752) == 0) {
                        if (interfaceC3163lP.l(function3)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i11 |= i17;
                    }
                }
                i18 = i10 & 64;
                if (i18 != 0) {
                    i11 |= 1572864;
                } else if ((i8 & 3670016) == 0) {
                    if (interfaceC3163lP.R(str2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i11 |= i19;
                }
                i20 = i10 & 128;
                if (i20 != 0) {
                    i11 |= 12582912;
                } else if ((i8 & 29360128) == 0) {
                    if (interfaceC3163lP.l(function1)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i11 |= i21;
                }
                i22 = i10 & 256;
                if (i22 != 0) {
                    if ((i8 & 234881024) == 0) {
                        if (interfaceC3163lP.R(str3)) {
                            i23 = 67108864;
                        } else {
                            i23 = 33554432;
                        }
                        i11 |= i23;
                    }
                    i24 = i10 & 512;
                    if (i24 != 0) {
                        if ((i8 & 1879048192) == 0) {
                            if (interfaceC3163lP.l(function2)) {
                                i25 = 536870912;
                            } else {
                                i25 = 268435456;
                            }
                            i11 |= i25;
                        }
                        i26 = i10 & 1024;
                        if (i26 != 0) {
                            i27 = i9 | 6;
                        } else if ((i9 & 14) == 0) {
                            if (interfaceC3163lP.l(oVar)) {
                                i28 = 4;
                            } else {
                                i28 = 2;
                            }
                            i27 = i9 | i28;
                        } else {
                            i27 = i9;
                        }
                        if ((i11 & 1533916891) != 306783378) {
                            if (i29 != 0) {
                                iVar3 = L0.i.f4836a;
                            } else {
                                iVar3 = iVar2;
                            }
                            if (i12 != 0) {
                                num2 = null;
                            }
                            if (i14 != 0) {
                                str5 = null;
                            } else {
                                str5 = str4;
                            }
                            if (i16 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if (i18 != 0) {
                                str6 = null;
                            } else {
                                str6 = str2;
                            }
                            if (i20 != 0) {
                                function5 = null;
                            } else {
                                function5 = function1;
                            }
                            if (i22 != 0) {
                                str7 = null;
                            } else {
                                str7 = str3;
                            }
                            if (i24 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i26 != 0) {
                                oVar2 = null;
                            } else {
                                oVar2 = oVar;
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                            }
                            Q6.o oVar11 = oVar2;
                            L0.i iVar12 = iVar3;
                            Integer num11 = num2;
                            Function0 function17 = function5;
                            interfaceC3163l2 = interfaceC3163lP;
                            p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num11, title, oVar11, message, str7, str6, str5, function6, function17, function4)), interfaceC3163l2, 12607488, 104);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            str8 = str7;
                            str9 = str5;
                            str10 = str6;
                            function7 = function4;
                            function8 = function6;
                            function9 = function17;
                            num3 = num11;
                            oVar3 = oVar11;
                            iVar4 = iVar12;
                        } else {
                            if (i29 != 0) {
                                iVar3 = L0.i.f4836a;
                            } else {
                                iVar3 = iVar2;
                            }
                            if (i12 != 0) {
                                num2 = null;
                            }
                            if (i14 != 0) {
                                str5 = null;
                            } else {
                                str5 = str4;
                            }
                            if (i16 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if (i18 != 0) {
                                str6 = null;
                            } else {
                                str6 = str2;
                            }
                            if (i20 != 0) {
                                function5 = null;
                            } else {
                                function5 = function1;
                            }
                            if (i22 != 0) {
                                str7 = null;
                            } else {
                                str7 = str3;
                            }
                            if (i24 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i26 != 0) {
                                oVar2 = null;
                            } else {
                                oVar2 = oVar;
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                            }
                            Q6.o oVar12 = oVar2;
                            L0.i iVar13 = iVar3;
                            Integer num12 = num2;
                            Function0 function18 = function5;
                            interfaceC3163l2 = interfaceC3163lP;
                            p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num12, title, oVar12, message, str7, str6, str5, function6, function18, function4)), interfaceC3163l2, 12607488, 104);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            str8 = str7;
                            str9 = str5;
                            str10 = str6;
                            function7 = function4;
                            function8 = function6;
                            function9 = function18;
                            num3 = num12;
                            oVar3 = oVar12;
                            iVar4 = iVar13;
                        }
                        p0V = interfaceC3163l2.v();
                        if (p0V != null) {
                            p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                        }
                    }
                    i11 |= 805306368;
                    i26 = i10 & 1024;
                    if (i26 != 0) {
                        i27 = i9 | 6;
                    } else if ((i9 & 14) == 0) {
                        if (interfaceC3163lP.l(oVar)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i9 | i28;
                    } else {
                        i27 = i9;
                    }
                    if ((i11 & 1533916891) != 306783378) {
                        if (i29 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i12 != 0) {
                            num2 = null;
                        }
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i16 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i18 != 0) {
                            str6 = null;
                        } else {
                            str6 = str2;
                        }
                        if (i20 != 0) {
                            function5 = null;
                        } else {
                            function5 = function1;
                        }
                        if (i22 != 0) {
                            str7 = null;
                        } else {
                            str7 = str3;
                        }
                        if (i24 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i26 != 0) {
                            oVar2 = null;
                        } else {
                            oVar2 = oVar;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                        }
                        Q6.o oVar13 = oVar2;
                        L0.i iVar14 = iVar3;
                        Integer num13 = num2;
                        Function0 function19 = function5;
                        interfaceC3163l2 = interfaceC3163lP;
                        p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num13, title, oVar13, message, str7, str6, str5, function6, function19, function4)), interfaceC3163l2, 12607488, 104);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        str8 = str7;
                        str9 = str5;
                        str10 = str6;
                        function7 = function4;
                        function8 = function6;
                        function9 = function19;
                        num3 = num13;
                        oVar3 = oVar13;
                        iVar4 = iVar14;
                    } else {
                        if (i29 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i12 != 0) {
                            num2 = null;
                        }
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i16 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i18 != 0) {
                            str6 = null;
                        } else {
                            str6 = str2;
                        }
                        if (i20 != 0) {
                            function5 = null;
                        } else {
                            function5 = function1;
                        }
                        if (i22 != 0) {
                            str7 = null;
                        } else {
                            str7 = str3;
                        }
                        if (i24 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i26 != 0) {
                            oVar2 = null;
                        } else {
                            oVar2 = oVar;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                        }
                        Q6.o oVar14 = oVar2;
                        L0.i iVar15 = iVar3;
                        Integer num14 = num2;
                        Function0 function110 = function5;
                        interfaceC3163l2 = interfaceC3163lP;
                        p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num14, title, oVar14, message, str7, str6, str5, function6, function110, function4)), interfaceC3163l2, 12607488, 104);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        str8 = str7;
                        str9 = str5;
                        str10 = str6;
                        function7 = function4;
                        function8 = function6;
                        function9 = function110;
                        num3 = num14;
                        oVar3 = oVar14;
                        iVar4 = iVar15;
                    }
                    p0V = interfaceC3163l2.v();
                    if (p0V != null) {
                        p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                    }
                }
                i11 |= 100663296;
                i24 = i10 & 512;
                if (i24 != 0) {
                    if ((i8 & 1879048192) == 0) {
                        if (interfaceC3163lP.l(function2)) {
                            i25 = 536870912;
                        } else {
                            i25 = 268435456;
                        }
                        i11 |= i25;
                    }
                    i26 = i10 & 1024;
                    if (i26 != 0) {
                        i27 = i9 | 6;
                    } else if ((i9 & 14) == 0) {
                        if (interfaceC3163lP.l(oVar)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i9 | i28;
                    } else {
                        i27 = i9;
                    }
                    if ((i11 & 1533916891) != 306783378) {
                        if (i29 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i12 != 0) {
                            num2 = null;
                        }
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i16 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i18 != 0) {
                            str6 = null;
                        } else {
                            str6 = str2;
                        }
                        if (i20 != 0) {
                            function5 = null;
                        } else {
                            function5 = function1;
                        }
                        if (i22 != 0) {
                            str7 = null;
                        } else {
                            str7 = str3;
                        }
                        if (i24 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i26 != 0) {
                            oVar2 = null;
                        } else {
                            oVar2 = oVar;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                        }
                        Q6.o oVar15 = oVar2;
                        L0.i iVar16 = iVar3;
                        Integer num15 = num2;
                        Function0 function111 = function5;
                        interfaceC3163l2 = interfaceC3163lP;
                        p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num15, title, oVar15, message, str7, str6, str5, function6, function111, function4)), interfaceC3163l2, 12607488, 104);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        str8 = str7;
                        str9 = str5;
                        str10 = str6;
                        function7 = function4;
                        function8 = function6;
                        function9 = function111;
                        num3 = num15;
                        oVar3 = oVar15;
                        iVar4 = iVar16;
                    } else {
                        if (i29 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i12 != 0) {
                            num2 = null;
                        }
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i16 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i18 != 0) {
                            str6 = null;
                        } else {
                            str6 = str2;
                        }
                        if (i20 != 0) {
                            function5 = null;
                        } else {
                            function5 = function1;
                        }
                        if (i22 != 0) {
                            str7 = null;
                        } else {
                            str7 = str3;
                        }
                        if (i24 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i26 != 0) {
                            oVar2 = null;
                        } else {
                            oVar2 = oVar;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                        }
                        Q6.o oVar16 = oVar2;
                        L0.i iVar17 = iVar3;
                        Integer num16 = num2;
                        Function0 function112 = function5;
                        interfaceC3163l2 = interfaceC3163lP;
                        p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num16, title, oVar16, message, str7, str6, str5, function6, function112, function4)), interfaceC3163l2, 12607488, 104);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        str8 = str7;
                        str9 = str5;
                        str10 = str6;
                        function7 = function4;
                        function8 = function6;
                        function9 = function112;
                        num3 = num16;
                        oVar3 = oVar16;
                        iVar4 = iVar17;
                    }
                    p0V = interfaceC3163l2.v();
                    if (p0V != null) {
                        p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                    }
                }
                i11 |= 805306368;
                i26 = i10 & 1024;
                if (i26 != 0) {
                    i27 = i9 | 6;
                } else if ((i9 & 14) == 0) {
                    if (interfaceC3163lP.l(oVar)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i9 | i28;
                } else {
                    i27 = i9;
                }
                if ((i11 & 1533916891) != 306783378) {
                    if (i29 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i12 != 0) {
                        num2 = null;
                    }
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i16 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i18 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i22 != 0) {
                        str7 = null;
                    } else {
                        str7 = str3;
                    }
                    if (i24 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i26 != 0) {
                        oVar2 = null;
                    } else {
                        oVar2 = oVar;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                    }
                    Q6.o oVar17 = oVar2;
                    L0.i iVar18 = iVar3;
                    Integer num17 = num2;
                    Function0 function113 = function5;
                    interfaceC3163l2 = interfaceC3163lP;
                    p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num17, title, oVar17, message, str7, str6, str5, function6, function113, function4)), interfaceC3163l2, 12607488, 104);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    str8 = str7;
                    str9 = str5;
                    str10 = str6;
                    function7 = function4;
                    function8 = function6;
                    function9 = function113;
                    num3 = num17;
                    oVar3 = oVar17;
                    iVar4 = iVar18;
                } else {
                    if (i29 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i12 != 0) {
                        num2 = null;
                    }
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i16 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i18 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i22 != 0) {
                        str7 = null;
                    } else {
                        str7 = str3;
                    }
                    if (i24 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i26 != 0) {
                        oVar2 = null;
                    } else {
                        oVar2 = oVar;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                    }
                    Q6.o oVar18 = oVar2;
                    L0.i iVar19 = iVar3;
                    Integer num18 = num2;
                    Function0 function114 = function5;
                    interfaceC3163l2 = interfaceC3163lP;
                    p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num18, title, oVar18, message, str7, str6, str5, function6, function114, function4)), interfaceC3163l2, 12607488, 104);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    str8 = str7;
                    str9 = str5;
                    str10 = str6;
                    function7 = function4;
                    function8 = function6;
                    function9 = function114;
                    num3 = num18;
                    oVar3 = oVar18;
                    iVar4 = iVar19;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                }
            }
            i11 |= 3072;
            num2 = num;
            i14 = i10 & 16;
            if (i14 != 0) {
                if ((57344 & i8) == 0) {
                    str4 = str;
                    if (interfaceC3163lP.R(str4)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i11 |= i15;
                }
                i16 = i10 & 32;
                if (i16 != 0) {
                    i11 |= 196608;
                    function3 = function0;
                } else {
                    function3 = function0;
                    if ((i8 & 458752) == 0) {
                        if (interfaceC3163lP.l(function3)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i11 |= i17;
                    }
                }
                i18 = i10 & 64;
                if (i18 != 0) {
                    i11 |= 1572864;
                } else if ((i8 & 3670016) == 0) {
                    if (interfaceC3163lP.R(str2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i11 |= i19;
                }
                i20 = i10 & 128;
                if (i20 != 0) {
                    i11 |= 12582912;
                } else if ((i8 & 29360128) == 0) {
                    if (interfaceC3163lP.l(function1)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i11 |= i21;
                }
                i22 = i10 & 256;
                if (i22 != 0) {
                    if ((i8 & 234881024) == 0) {
                        if (interfaceC3163lP.R(str3)) {
                            i23 = 67108864;
                        } else {
                            i23 = 33554432;
                        }
                        i11 |= i23;
                    }
                    i24 = i10 & 512;
                    if (i24 != 0) {
                        if ((i8 & 1879048192) == 0) {
                            if (interfaceC3163lP.l(function2)) {
                                i25 = 536870912;
                            } else {
                                i25 = 268435456;
                            }
                            i11 |= i25;
                        }
                        i26 = i10 & 1024;
                        if (i26 != 0) {
                            i27 = i9 | 6;
                        } else if ((i9 & 14) == 0) {
                            if (interfaceC3163lP.l(oVar)) {
                                i28 = 4;
                            } else {
                                i28 = 2;
                            }
                            i27 = i9 | i28;
                        } else {
                            i27 = i9;
                        }
                        if ((i11 & 1533916891) != 306783378) {
                            if (i29 != 0) {
                                iVar3 = L0.i.f4836a;
                            } else {
                                iVar3 = iVar2;
                            }
                            if (i12 != 0) {
                                num2 = null;
                            }
                            if (i14 != 0) {
                                str5 = null;
                            } else {
                                str5 = str4;
                            }
                            if (i16 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if (i18 != 0) {
                                str6 = null;
                            } else {
                                str6 = str2;
                            }
                            if (i20 != 0) {
                                function5 = null;
                            } else {
                                function5 = function1;
                            }
                            if (i22 != 0) {
                                str7 = null;
                            } else {
                                str7 = str3;
                            }
                            if (i24 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i26 != 0) {
                                oVar2 = null;
                            } else {
                                oVar2 = oVar;
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                            }
                            Q6.o oVar19 = oVar2;
                            L0.i iVar110 = iVar3;
                            Integer num19 = num2;
                            Function0 function115 = function5;
                            interfaceC3163l2 = interfaceC3163lP;
                            p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num19, title, oVar19, message, str7, str6, str5, function6, function115, function4)), interfaceC3163l2, 12607488, 104);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            str8 = str7;
                            str9 = str5;
                            str10 = str6;
                            function7 = function4;
                            function8 = function6;
                            function9 = function115;
                            num3 = num19;
                            oVar3 = oVar19;
                            iVar4 = iVar110;
                        } else {
                            if (i29 != 0) {
                                iVar3 = L0.i.f4836a;
                            } else {
                                iVar3 = iVar2;
                            }
                            if (i12 != 0) {
                                num2 = null;
                            }
                            if (i14 != 0) {
                                str5 = null;
                            } else {
                                str5 = str4;
                            }
                            if (i16 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if (i18 != 0) {
                                str6 = null;
                            } else {
                                str6 = str2;
                            }
                            if (i20 != 0) {
                                function5 = null;
                            } else {
                                function5 = function1;
                            }
                            if (i22 != 0) {
                                str7 = null;
                            } else {
                                str7 = str3;
                            }
                            if (i24 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i26 != 0) {
                                oVar2 = null;
                            } else {
                                oVar2 = oVar;
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                            }
                            Q6.o oVar110 = oVar2;
                            L0.i iVar111 = iVar3;
                            Integer num110 = num2;
                            Function0 function116 = function5;
                            interfaceC3163l2 = interfaceC3163lP;
                            p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num110, title, oVar110, message, str7, str6, str5, function6, function116, function4)), interfaceC3163l2, 12607488, 104);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            str8 = str7;
                            str9 = str5;
                            str10 = str6;
                            function7 = function4;
                            function8 = function6;
                            function9 = function116;
                            num3 = num110;
                            oVar3 = oVar110;
                            iVar4 = iVar111;
                        }
                        p0V = interfaceC3163l2.v();
                        if (p0V != null) {
                            p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                        }
                    }
                    i11 |= 805306368;
                    i26 = i10 & 1024;
                    if (i26 != 0) {
                        i27 = i9 | 6;
                    } else if ((i9 & 14) == 0) {
                        if (interfaceC3163lP.l(oVar)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i9 | i28;
                    } else {
                        i27 = i9;
                    }
                    if ((i11 & 1533916891) != 306783378) {
                        if (i29 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i12 != 0) {
                            num2 = null;
                        }
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i16 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i18 != 0) {
                            str6 = null;
                        } else {
                            str6 = str2;
                        }
                        if (i20 != 0) {
                            function5 = null;
                        } else {
                            function5 = function1;
                        }
                        if (i22 != 0) {
                            str7 = null;
                        } else {
                            str7 = str3;
                        }
                        if (i24 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i26 != 0) {
                            oVar2 = null;
                        } else {
                            oVar2 = oVar;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                        }
                        Q6.o oVar111 = oVar2;
                        L0.i iVar112 = iVar3;
                        Integer num111 = num2;
                        Function0 function117 = function5;
                        interfaceC3163l2 = interfaceC3163lP;
                        p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num111, title, oVar111, message, str7, str6, str5, function6, function117, function4)), interfaceC3163l2, 12607488, 104);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        str8 = str7;
                        str9 = str5;
                        str10 = str6;
                        function7 = function4;
                        function8 = function6;
                        function9 = function117;
                        num3 = num111;
                        oVar3 = oVar111;
                        iVar4 = iVar112;
                    } else {
                        if (i29 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i12 != 0) {
                            num2 = null;
                        }
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i16 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i18 != 0) {
                            str6 = null;
                        } else {
                            str6 = str2;
                        }
                        if (i20 != 0) {
                            function5 = null;
                        } else {
                            function5 = function1;
                        }
                        if (i22 != 0) {
                            str7 = null;
                        } else {
                            str7 = str3;
                        }
                        if (i24 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i26 != 0) {
                            oVar2 = null;
                        } else {
                            oVar2 = oVar;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                        }
                        Q6.o oVar112 = oVar2;
                        L0.i iVar113 = iVar3;
                        Integer num112 = num2;
                        Function0 function118 = function5;
                        interfaceC3163l2 = interfaceC3163lP;
                        p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num112, title, oVar112, message, str7, str6, str5, function6, function118, function4)), interfaceC3163l2, 12607488, 104);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        str8 = str7;
                        str9 = str5;
                        str10 = str6;
                        function7 = function4;
                        function8 = function6;
                        function9 = function118;
                        num3 = num112;
                        oVar3 = oVar112;
                        iVar4 = iVar113;
                    }
                    p0V = interfaceC3163l2.v();
                    if (p0V != null) {
                        p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                    }
                }
                i11 |= 100663296;
                i24 = i10 & 512;
                if (i24 != 0) {
                    if ((i8 & 1879048192) == 0) {
                        if (interfaceC3163lP.l(function2)) {
                            i25 = 536870912;
                        } else {
                            i25 = 268435456;
                        }
                        i11 |= i25;
                    }
                    i26 = i10 & 1024;
                    if (i26 != 0) {
                        i27 = i9 | 6;
                    } else if ((i9 & 14) == 0) {
                        if (interfaceC3163lP.l(oVar)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i9 | i28;
                    } else {
                        i27 = i9;
                    }
                    if ((i11 & 1533916891) != 306783378) {
                        if (i29 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i12 != 0) {
                            num2 = null;
                        }
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i16 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i18 != 0) {
                            str6 = null;
                        } else {
                            str6 = str2;
                        }
                        if (i20 != 0) {
                            function5 = null;
                        } else {
                            function5 = function1;
                        }
                        if (i22 != 0) {
                            str7 = null;
                        } else {
                            str7 = str3;
                        }
                        if (i24 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i26 != 0) {
                            oVar2 = null;
                        } else {
                            oVar2 = oVar;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                        }
                        Q6.o oVar113 = oVar2;
                        L0.i iVar114 = iVar3;
                        Integer num113 = num2;
                        Function0 function119 = function5;
                        interfaceC3163l2 = interfaceC3163lP;
                        p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num113, title, oVar113, message, str7, str6, str5, function6, function119, function4)), interfaceC3163l2, 12607488, 104);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        str8 = str7;
                        str9 = str5;
                        str10 = str6;
                        function7 = function4;
                        function8 = function6;
                        function9 = function119;
                        num3 = num113;
                        oVar3 = oVar113;
                        iVar4 = iVar114;
                    } else {
                        if (i29 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i12 != 0) {
                            num2 = null;
                        }
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i16 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i18 != 0) {
                            str6 = null;
                        } else {
                            str6 = str2;
                        }
                        if (i20 != 0) {
                            function5 = null;
                        } else {
                            function5 = function1;
                        }
                        if (i22 != 0) {
                            str7 = null;
                        } else {
                            str7 = str3;
                        }
                        if (i24 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i26 != 0) {
                            oVar2 = null;
                        } else {
                            oVar2 = oVar;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                        }
                        Q6.o oVar114 = oVar2;
                        L0.i iVar115 = iVar3;
                        Integer num114 = num2;
                        Function0 function1110 = function5;
                        interfaceC3163l2 = interfaceC3163lP;
                        p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num114, title, oVar114, message, str7, str6, str5, function6, function1110, function4)), interfaceC3163l2, 12607488, 104);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        str8 = str7;
                        str9 = str5;
                        str10 = str6;
                        function7 = function4;
                        function8 = function6;
                        function9 = function1110;
                        num3 = num114;
                        oVar3 = oVar114;
                        iVar4 = iVar115;
                    }
                    p0V = interfaceC3163l2.v();
                    if (p0V != null) {
                        p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                    }
                }
                i11 |= 805306368;
                i26 = i10 & 1024;
                if (i26 != 0) {
                    i27 = i9 | 6;
                } else if ((i9 & 14) == 0) {
                    if (interfaceC3163lP.l(oVar)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i9 | i28;
                } else {
                    i27 = i9;
                }
                if ((i11 & 1533916891) != 306783378) {
                    if (i29 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i12 != 0) {
                        num2 = null;
                    }
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i16 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i18 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i22 != 0) {
                        str7 = null;
                    } else {
                        str7 = str3;
                    }
                    if (i24 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i26 != 0) {
                        oVar2 = null;
                    } else {
                        oVar2 = oVar;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                    }
                    Q6.o oVar115 = oVar2;
                    L0.i iVar116 = iVar3;
                    Integer num115 = num2;
                    Function0 function1111 = function5;
                    interfaceC3163l2 = interfaceC3163lP;
                    p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num115, title, oVar115, message, str7, str6, str5, function6, function1111, function4)), interfaceC3163l2, 12607488, 104);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    str8 = str7;
                    str9 = str5;
                    str10 = str6;
                    function7 = function4;
                    function8 = function6;
                    function9 = function1111;
                    num3 = num115;
                    oVar3 = oVar115;
                    iVar4 = iVar116;
                } else {
                    if (i29 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i12 != 0) {
                        num2 = null;
                    }
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i16 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i18 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i22 != 0) {
                        str7 = null;
                    } else {
                        str7 = str3;
                    }
                    if (i24 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i26 != 0) {
                        oVar2 = null;
                    } else {
                        oVar2 = oVar;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                    }
                    Q6.o oVar116 = oVar2;
                    L0.i iVar117 = iVar3;
                    Integer num116 = num2;
                    Function0 function1112 = function5;
                    interfaceC3163l2 = interfaceC3163lP;
                    p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num116, title, oVar116, message, str7, str6, str5, function6, function1112, function4)), interfaceC3163l2, 12607488, 104);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    str8 = str7;
                    str9 = str5;
                    str10 = str6;
                    function7 = function4;
                    function8 = function6;
                    function9 = function1112;
                    num3 = num116;
                    oVar3 = oVar116;
                    iVar4 = iVar117;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                }
            }
            i11 |= 24576;
            str4 = str;
            i16 = i10 & 32;
            if (i16 != 0) {
                i11 |= 196608;
                function3 = function0;
            } else {
                function3 = function0;
                if ((i8 & 458752) == 0) {
                    if (interfaceC3163lP.l(function3)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i11 |= i17;
                }
            }
            i18 = i10 & 64;
            if (i18 != 0) {
                i11 |= 1572864;
            } else if ((i8 & 3670016) == 0) {
                if (interfaceC3163lP.R(str2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i11 |= i19;
            }
            i20 = i10 & 128;
            if (i20 != 0) {
                i11 |= 12582912;
            } else if ((i8 & 29360128) == 0) {
                if (interfaceC3163lP.l(function1)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i11 |= i21;
            }
            i22 = i10 & 256;
            if (i22 != 0) {
                if ((i8 & 234881024) == 0) {
                    if (interfaceC3163lP.R(str3)) {
                        i23 = 67108864;
                    } else {
                        i23 = 33554432;
                    }
                    i11 |= i23;
                }
                i24 = i10 & 512;
                if (i24 != 0) {
                    if ((i8 & 1879048192) == 0) {
                        if (interfaceC3163lP.l(function2)) {
                            i25 = 536870912;
                        } else {
                            i25 = 268435456;
                        }
                        i11 |= i25;
                    }
                    i26 = i10 & 1024;
                    if (i26 != 0) {
                        i27 = i9 | 6;
                    } else if ((i9 & 14) == 0) {
                        if (interfaceC3163lP.l(oVar)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i9 | i28;
                    } else {
                        i27 = i9;
                    }
                    if ((i11 & 1533916891) != 306783378) {
                        if (i29 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i12 != 0) {
                            num2 = null;
                        }
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i16 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i18 != 0) {
                            str6 = null;
                        } else {
                            str6 = str2;
                        }
                        if (i20 != 0) {
                            function5 = null;
                        } else {
                            function5 = function1;
                        }
                        if (i22 != 0) {
                            str7 = null;
                        } else {
                            str7 = str3;
                        }
                        if (i24 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i26 != 0) {
                            oVar2 = null;
                        } else {
                            oVar2 = oVar;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                        }
                        Q6.o oVar117 = oVar2;
                        L0.i iVar118 = iVar3;
                        Integer num117 = num2;
                        Function0 function1113 = function5;
                        interfaceC3163l2 = interfaceC3163lP;
                        p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num117, title, oVar117, message, str7, str6, str5, function6, function1113, function4)), interfaceC3163l2, 12607488, 104);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        str8 = str7;
                        str9 = str5;
                        str10 = str6;
                        function7 = function4;
                        function8 = function6;
                        function9 = function1113;
                        num3 = num117;
                        oVar3 = oVar117;
                        iVar4 = iVar118;
                    } else {
                        if (i29 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i12 != 0) {
                            num2 = null;
                        }
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i16 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i18 != 0) {
                            str6 = null;
                        } else {
                            str6 = str2;
                        }
                        if (i20 != 0) {
                            function5 = null;
                        } else {
                            function5 = function1;
                        }
                        if (i22 != 0) {
                            str7 = null;
                        } else {
                            str7 = str3;
                        }
                        if (i24 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i26 != 0) {
                            oVar2 = null;
                        } else {
                            oVar2 = oVar;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                        }
                        Q6.o oVar118 = oVar2;
                        L0.i iVar119 = iVar3;
                        Integer num118 = num2;
                        Function0 function1114 = function5;
                        interfaceC3163l2 = interfaceC3163lP;
                        p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num118, title, oVar118, message, str7, str6, str5, function6, function1114, function4)), interfaceC3163l2, 12607488, 104);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        str8 = str7;
                        str9 = str5;
                        str10 = str6;
                        function7 = function4;
                        function8 = function6;
                        function9 = function1114;
                        num3 = num118;
                        oVar3 = oVar118;
                        iVar4 = iVar119;
                    }
                    p0V = interfaceC3163l2.v();
                    if (p0V != null) {
                        p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                    }
                }
                i11 |= 805306368;
                i26 = i10 & 1024;
                if (i26 != 0) {
                    i27 = i9 | 6;
                } else if ((i9 & 14) == 0) {
                    if (interfaceC3163lP.l(oVar)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i9 | i28;
                } else {
                    i27 = i9;
                }
                if ((i11 & 1533916891) != 306783378) {
                    if (i29 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i12 != 0) {
                        num2 = null;
                    }
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i16 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i18 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i22 != 0) {
                        str7 = null;
                    } else {
                        str7 = str3;
                    }
                    if (i24 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i26 != 0) {
                        oVar2 = null;
                    } else {
                        oVar2 = oVar;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                    }
                    Q6.o oVar119 = oVar2;
                    L0.i iVar1110 = iVar3;
                    Integer num119 = num2;
                    Function0 function1115 = function5;
                    interfaceC3163l2 = interfaceC3163lP;
                    p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num119, title, oVar119, message, str7, str6, str5, function6, function1115, function4)), interfaceC3163l2, 12607488, 104);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    str8 = str7;
                    str9 = str5;
                    str10 = str6;
                    function7 = function4;
                    function8 = function6;
                    function9 = function1115;
                    num3 = num119;
                    oVar3 = oVar119;
                    iVar4 = iVar1110;
                } else {
                    if (i29 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i12 != 0) {
                        num2 = null;
                    }
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i16 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i18 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i22 != 0) {
                        str7 = null;
                    } else {
                        str7 = str3;
                    }
                    if (i24 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i26 != 0) {
                        oVar2 = null;
                    } else {
                        oVar2 = oVar;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                    }
                    Q6.o oVar1110 = oVar2;
                    L0.i iVar1111 = iVar3;
                    Integer num1110 = num2;
                    Function0 function1116 = function5;
                    interfaceC3163l2 = interfaceC3163lP;
                    p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num1110, title, oVar1110, message, str7, str6, str5, function6, function1116, function4)), interfaceC3163l2, 12607488, 104);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    str8 = str7;
                    str9 = str5;
                    str10 = str6;
                    function7 = function4;
                    function8 = function6;
                    function9 = function1116;
                    num3 = num1110;
                    oVar3 = oVar1110;
                    iVar4 = iVar1111;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                }
            }
            i11 |= 100663296;
            i24 = i10 & 512;
            if (i24 != 0) {
                if ((i8 & 1879048192) == 0) {
                    if (interfaceC3163lP.l(function2)) {
                        i25 = 536870912;
                    } else {
                        i25 = 268435456;
                    }
                    i11 |= i25;
                }
                i26 = i10 & 1024;
                if (i26 != 0) {
                    i27 = i9 | 6;
                } else if ((i9 & 14) == 0) {
                    if (interfaceC3163lP.l(oVar)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i9 | i28;
                } else {
                    i27 = i9;
                }
                if ((i11 & 1533916891) != 306783378) {
                    if (i29 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i12 != 0) {
                        num2 = null;
                    }
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i16 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i18 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i22 != 0) {
                        str7 = null;
                    } else {
                        str7 = str3;
                    }
                    if (i24 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i26 != 0) {
                        oVar2 = null;
                    } else {
                        oVar2 = oVar;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                    }
                    Q6.o oVar1111 = oVar2;
                    L0.i iVar1112 = iVar3;
                    Integer num1111 = num2;
                    Function0 function1117 = function5;
                    interfaceC3163l2 = interfaceC3163lP;
                    p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num1111, title, oVar1111, message, str7, str6, str5, function6, function1117, function4)), interfaceC3163l2, 12607488, 104);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    str8 = str7;
                    str9 = str5;
                    str10 = str6;
                    function7 = function4;
                    function8 = function6;
                    function9 = function1117;
                    num3 = num1111;
                    oVar3 = oVar1111;
                    iVar4 = iVar1112;
                } else {
                    if (i29 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i12 != 0) {
                        num2 = null;
                    }
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i16 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i18 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i22 != 0) {
                        str7 = null;
                    } else {
                        str7 = str3;
                    }
                    if (i24 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i26 != 0) {
                        oVar2 = null;
                    } else {
                        oVar2 = oVar;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                    }
                    Q6.o oVar1112 = oVar2;
                    L0.i iVar1113 = iVar3;
                    Integer num1112 = num2;
                    Function0 function1118 = function5;
                    interfaceC3163l2 = interfaceC3163lP;
                    p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num1112, title, oVar1112, message, str7, str6, str5, function6, function1118, function4)), interfaceC3163l2, 12607488, 104);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    str8 = str7;
                    str9 = str5;
                    str10 = str6;
                    function7 = function4;
                    function8 = function6;
                    function9 = function1118;
                    num3 = num1112;
                    oVar3 = oVar1112;
                    iVar4 = iVar1113;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                }
            }
            i11 |= 805306368;
            i26 = i10 & 1024;
            if (i26 != 0) {
                i27 = i9 | 6;
            } else if ((i9 & 14) == 0) {
                if (interfaceC3163lP.l(oVar)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i9 | i28;
            } else {
                i27 = i9;
            }
            if ((i11 & 1533916891) != 306783378) {
                if (i29 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i12 != 0) {
                    num2 = null;
                }
                if (i14 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i16 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i18 != 0) {
                    str6 = null;
                } else {
                    str6 = str2;
                }
                if (i20 != 0) {
                    function5 = null;
                } else {
                    function5 = function1;
                }
                if (i22 != 0) {
                    str7 = null;
                } else {
                    str7 = str3;
                }
                if (i24 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i26 != 0) {
                    oVar2 = null;
                } else {
                    oVar2 = oVar;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                }
                Q6.o oVar1113 = oVar2;
                L0.i iVar1114 = iVar3;
                Integer num1113 = num2;
                Function0 function1119 = function5;
                interfaceC3163l2 = interfaceC3163lP;
                p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num1113, title, oVar1113, message, str7, str6, str5, function6, function1119, function4)), interfaceC3163l2, 12607488, 104);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                str8 = str7;
                str9 = str5;
                str10 = str6;
                function7 = function4;
                function8 = function6;
                function9 = function1119;
                num3 = num1113;
                oVar3 = oVar1113;
                iVar4 = iVar1114;
            } else {
                if (i29 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i12 != 0) {
                    num2 = null;
                }
                if (i14 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i16 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i18 != 0) {
                    str6 = null;
                } else {
                    str6 = str2;
                }
                if (i20 != 0) {
                    function5 = null;
                } else {
                    function5 = function1;
                }
                if (i22 != 0) {
                    str7 = null;
                } else {
                    str7 = str3;
                }
                if (i24 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i26 != 0) {
                    oVar2 = null;
                } else {
                    oVar2 = oVar;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                }
                Q6.o oVar1114 = oVar2;
                L0.i iVar1115 = iVar3;
                Integer num1114 = num2;
                Function0 function11110 = function5;
                interfaceC3163l2 = interfaceC3163lP;
                p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num1114, title, oVar1114, message, str7, str6, str5, function6, function11110, function4)), interfaceC3163l2, 12607488, 104);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                str8 = str7;
                str9 = str5;
                str10 = str6;
                function7 = function4;
                function8 = function6;
                function9 = function11110;
                num3 = num1114;
                oVar3 = oVar1114;
                iVar4 = iVar1115;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
            }
        }
        i11 |= 384;
        iVar2 = iVar;
        i12 = i10 & 8;
        if (i12 != 0) {
            if ((i8 & 7168) == 0) {
                num2 = num;
                if (interfaceC3163lP.R(num2)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i11 |= i13;
            }
            i14 = i10 & 16;
            if (i14 != 0) {
                if ((57344 & i8) == 0) {
                    str4 = str;
                    if (interfaceC3163lP.R(str4)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i11 |= i15;
                }
                i16 = i10 & 32;
                if (i16 != 0) {
                    i11 |= 196608;
                    function3 = function0;
                } else {
                    function3 = function0;
                    if ((i8 & 458752) == 0) {
                        if (interfaceC3163lP.l(function3)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i11 |= i17;
                    }
                }
                i18 = i10 & 64;
                if (i18 != 0) {
                    i11 |= 1572864;
                } else if ((i8 & 3670016) == 0) {
                    if (interfaceC3163lP.R(str2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i11 |= i19;
                }
                i20 = i10 & 128;
                if (i20 != 0) {
                    i11 |= 12582912;
                } else if ((i8 & 29360128) == 0) {
                    if (interfaceC3163lP.l(function1)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i11 |= i21;
                }
                i22 = i10 & 256;
                if (i22 != 0) {
                    if ((i8 & 234881024) == 0) {
                        if (interfaceC3163lP.R(str3)) {
                            i23 = 67108864;
                        } else {
                            i23 = 33554432;
                        }
                        i11 |= i23;
                    }
                    i24 = i10 & 512;
                    if (i24 != 0) {
                        if ((i8 & 1879048192) == 0) {
                            if (interfaceC3163lP.l(function2)) {
                                i25 = 536870912;
                            } else {
                                i25 = 268435456;
                            }
                            i11 |= i25;
                        }
                        i26 = i10 & 1024;
                        if (i26 != 0) {
                            i27 = i9 | 6;
                        } else if ((i9 & 14) == 0) {
                            if (interfaceC3163lP.l(oVar)) {
                                i28 = 4;
                            } else {
                                i28 = 2;
                            }
                            i27 = i9 | i28;
                        } else {
                            i27 = i9;
                        }
                        if ((i11 & 1533916891) != 306783378) {
                            if (i29 != 0) {
                                iVar3 = L0.i.f4836a;
                            } else {
                                iVar3 = iVar2;
                            }
                            if (i12 != 0) {
                                num2 = null;
                            }
                            if (i14 != 0) {
                                str5 = null;
                            } else {
                                str5 = str4;
                            }
                            if (i16 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if (i18 != 0) {
                                str6 = null;
                            } else {
                                str6 = str2;
                            }
                            if (i20 != 0) {
                                function5 = null;
                            } else {
                                function5 = function1;
                            }
                            if (i22 != 0) {
                                str7 = null;
                            } else {
                                str7 = str3;
                            }
                            if (i24 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i26 != 0) {
                                oVar2 = null;
                            } else {
                                oVar2 = oVar;
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                            }
                            Q6.o oVar1115 = oVar2;
                            L0.i iVar1116 = iVar3;
                            Integer num1115 = num2;
                            Function0 function11111 = function5;
                            interfaceC3163l2 = interfaceC3163lP;
                            p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num1115, title, oVar1115, message, str7, str6, str5, function6, function11111, function4)), interfaceC3163l2, 12607488, 104);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            str8 = str7;
                            str9 = str5;
                            str10 = str6;
                            function7 = function4;
                            function8 = function6;
                            function9 = function11111;
                            num3 = num1115;
                            oVar3 = oVar1115;
                            iVar4 = iVar1116;
                        } else {
                            if (i29 != 0) {
                                iVar3 = L0.i.f4836a;
                            } else {
                                iVar3 = iVar2;
                            }
                            if (i12 != 0) {
                                num2 = null;
                            }
                            if (i14 != 0) {
                                str5 = null;
                            } else {
                                str5 = str4;
                            }
                            if (i16 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if (i18 != 0) {
                                str6 = null;
                            } else {
                                str6 = str2;
                            }
                            if (i20 != 0) {
                                function5 = null;
                            } else {
                                function5 = function1;
                            }
                            if (i22 != 0) {
                                str7 = null;
                            } else {
                                str7 = str3;
                            }
                            if (i24 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i26 != 0) {
                                oVar2 = null;
                            } else {
                                oVar2 = oVar;
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                            }
                            Q6.o oVar1116 = oVar2;
                            L0.i iVar1117 = iVar3;
                            Integer num1116 = num2;
                            Function0 function11112 = function5;
                            interfaceC3163l2 = interfaceC3163lP;
                            p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num1116, title, oVar1116, message, str7, str6, str5, function6, function11112, function4)), interfaceC3163l2, 12607488, 104);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            str8 = str7;
                            str9 = str5;
                            str10 = str6;
                            function7 = function4;
                            function8 = function6;
                            function9 = function11112;
                            num3 = num1116;
                            oVar3 = oVar1116;
                            iVar4 = iVar1117;
                        }
                        p0V = interfaceC3163l2.v();
                        if (p0V != null) {
                            p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                        }
                    }
                    i11 |= 805306368;
                    i26 = i10 & 1024;
                    if (i26 != 0) {
                        i27 = i9 | 6;
                    } else if ((i9 & 14) == 0) {
                        if (interfaceC3163lP.l(oVar)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i9 | i28;
                    } else {
                        i27 = i9;
                    }
                    if ((i11 & 1533916891) != 306783378) {
                        if (i29 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i12 != 0) {
                            num2 = null;
                        }
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i16 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i18 != 0) {
                            str6 = null;
                        } else {
                            str6 = str2;
                        }
                        if (i20 != 0) {
                            function5 = null;
                        } else {
                            function5 = function1;
                        }
                        if (i22 != 0) {
                            str7 = null;
                        } else {
                            str7 = str3;
                        }
                        if (i24 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i26 != 0) {
                            oVar2 = null;
                        } else {
                            oVar2 = oVar;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                        }
                        Q6.o oVar1117 = oVar2;
                        L0.i iVar1118 = iVar3;
                        Integer num1117 = num2;
                        Function0 function11113 = function5;
                        interfaceC3163l2 = interfaceC3163lP;
                        p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num1117, title, oVar1117, message, str7, str6, str5, function6, function11113, function4)), interfaceC3163l2, 12607488, 104);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        str8 = str7;
                        str9 = str5;
                        str10 = str6;
                        function7 = function4;
                        function8 = function6;
                        function9 = function11113;
                        num3 = num1117;
                        oVar3 = oVar1117;
                        iVar4 = iVar1118;
                    } else {
                        if (i29 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i12 != 0) {
                            num2 = null;
                        }
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i16 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i18 != 0) {
                            str6 = null;
                        } else {
                            str6 = str2;
                        }
                        if (i20 != 0) {
                            function5 = null;
                        } else {
                            function5 = function1;
                        }
                        if (i22 != 0) {
                            str7 = null;
                        } else {
                            str7 = str3;
                        }
                        if (i24 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i26 != 0) {
                            oVar2 = null;
                        } else {
                            oVar2 = oVar;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                        }
                        Q6.o oVar1118 = oVar2;
                        L0.i iVar1119 = iVar3;
                        Integer num1118 = num2;
                        Function0 function11114 = function5;
                        interfaceC3163l2 = interfaceC3163lP;
                        p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num1118, title, oVar1118, message, str7, str6, str5, function6, function11114, function4)), interfaceC3163l2, 12607488, 104);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        str8 = str7;
                        str9 = str5;
                        str10 = str6;
                        function7 = function4;
                        function8 = function6;
                        function9 = function11114;
                        num3 = num1118;
                        oVar3 = oVar1118;
                        iVar4 = iVar1119;
                    }
                    p0V = interfaceC3163l2.v();
                    if (p0V != null) {
                        p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                    }
                }
                i11 |= 100663296;
                i24 = i10 & 512;
                if (i24 != 0) {
                    if ((i8 & 1879048192) == 0) {
                        if (interfaceC3163lP.l(function2)) {
                            i25 = 536870912;
                        } else {
                            i25 = 268435456;
                        }
                        i11 |= i25;
                    }
                    i26 = i10 & 1024;
                    if (i26 != 0) {
                        i27 = i9 | 6;
                    } else if ((i9 & 14) == 0) {
                        if (interfaceC3163lP.l(oVar)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i9 | i28;
                    } else {
                        i27 = i9;
                    }
                    if ((i11 & 1533916891) != 306783378) {
                        if (i29 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i12 != 0) {
                            num2 = null;
                        }
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i16 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i18 != 0) {
                            str6 = null;
                        } else {
                            str6 = str2;
                        }
                        if (i20 != 0) {
                            function5 = null;
                        } else {
                            function5 = function1;
                        }
                        if (i22 != 0) {
                            str7 = null;
                        } else {
                            str7 = str3;
                        }
                        if (i24 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i26 != 0) {
                            oVar2 = null;
                        } else {
                            oVar2 = oVar;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                        }
                        Q6.o oVar1119 = oVar2;
                        L0.i iVar11110 = iVar3;
                        Integer num1119 = num2;
                        Function0 function11115 = function5;
                        interfaceC3163l2 = interfaceC3163lP;
                        p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num1119, title, oVar1119, message, str7, str6, str5, function6, function11115, function4)), interfaceC3163l2, 12607488, 104);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        str8 = str7;
                        str9 = str5;
                        str10 = str6;
                        function7 = function4;
                        function8 = function6;
                        function9 = function11115;
                        num3 = num1119;
                        oVar3 = oVar1119;
                        iVar4 = iVar11110;
                    } else {
                        if (i29 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i12 != 0) {
                            num2 = null;
                        }
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i16 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i18 != 0) {
                            str6 = null;
                        } else {
                            str6 = str2;
                        }
                        if (i20 != 0) {
                            function5 = null;
                        } else {
                            function5 = function1;
                        }
                        if (i22 != 0) {
                            str7 = null;
                        } else {
                            str7 = str3;
                        }
                        if (i24 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i26 != 0) {
                            oVar2 = null;
                        } else {
                            oVar2 = oVar;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                        }
                        Q6.o oVar11110 = oVar2;
                        L0.i iVar11111 = iVar3;
                        Integer num11110 = num2;
                        Function0 function11116 = function5;
                        interfaceC3163l2 = interfaceC3163lP;
                        p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num11110, title, oVar11110, message, str7, str6, str5, function6, function11116, function4)), interfaceC3163l2, 12607488, 104);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        str8 = str7;
                        str9 = str5;
                        str10 = str6;
                        function7 = function4;
                        function8 = function6;
                        function9 = function11116;
                        num3 = num11110;
                        oVar3 = oVar11110;
                        iVar4 = iVar11111;
                    }
                    p0V = interfaceC3163l2.v();
                    if (p0V != null) {
                        p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                    }
                }
                i11 |= 805306368;
                i26 = i10 & 1024;
                if (i26 != 0) {
                    i27 = i9 | 6;
                } else if ((i9 & 14) == 0) {
                    if (interfaceC3163lP.l(oVar)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i9 | i28;
                } else {
                    i27 = i9;
                }
                if ((i11 & 1533916891) != 306783378) {
                    if (i29 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i12 != 0) {
                        num2 = null;
                    }
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i16 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i18 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i22 != 0) {
                        str7 = null;
                    } else {
                        str7 = str3;
                    }
                    if (i24 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i26 != 0) {
                        oVar2 = null;
                    } else {
                        oVar2 = oVar;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                    }
                    Q6.o oVar11111 = oVar2;
                    L0.i iVar11112 = iVar3;
                    Integer num11111 = num2;
                    Function0 function11117 = function5;
                    interfaceC3163l2 = interfaceC3163lP;
                    p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num11111, title, oVar11111, message, str7, str6, str5, function6, function11117, function4)), interfaceC3163l2, 12607488, 104);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    str8 = str7;
                    str9 = str5;
                    str10 = str6;
                    function7 = function4;
                    function8 = function6;
                    function9 = function11117;
                    num3 = num11111;
                    oVar3 = oVar11111;
                    iVar4 = iVar11112;
                } else {
                    if (i29 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i12 != 0) {
                        num2 = null;
                    }
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i16 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i18 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i22 != 0) {
                        str7 = null;
                    } else {
                        str7 = str3;
                    }
                    if (i24 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i26 != 0) {
                        oVar2 = null;
                    } else {
                        oVar2 = oVar;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                    }
                    Q6.o oVar11112 = oVar2;
                    L0.i iVar11113 = iVar3;
                    Integer num11112 = num2;
                    Function0 function11118 = function5;
                    interfaceC3163l2 = interfaceC3163lP;
                    p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num11112, title, oVar11112, message, str7, str6, str5, function6, function11118, function4)), interfaceC3163l2, 12607488, 104);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    str8 = str7;
                    str9 = str5;
                    str10 = str6;
                    function7 = function4;
                    function8 = function6;
                    function9 = function11118;
                    num3 = num11112;
                    oVar3 = oVar11112;
                    iVar4 = iVar11113;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                }
            }
            i11 |= 24576;
            str4 = str;
            i16 = i10 & 32;
            if (i16 != 0) {
                i11 |= 196608;
                function3 = function0;
            } else {
                function3 = function0;
                if ((i8 & 458752) == 0) {
                    if (interfaceC3163lP.l(function3)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i11 |= i17;
                }
            }
            i18 = i10 & 64;
            if (i18 != 0) {
                i11 |= 1572864;
            } else if ((i8 & 3670016) == 0) {
                if (interfaceC3163lP.R(str2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i11 |= i19;
            }
            i20 = i10 & 128;
            if (i20 != 0) {
                i11 |= 12582912;
            } else if ((i8 & 29360128) == 0) {
                if (interfaceC3163lP.l(function1)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i11 |= i21;
            }
            i22 = i10 & 256;
            if (i22 != 0) {
                if ((i8 & 234881024) == 0) {
                    if (interfaceC3163lP.R(str3)) {
                        i23 = 67108864;
                    } else {
                        i23 = 33554432;
                    }
                    i11 |= i23;
                }
                i24 = i10 & 512;
                if (i24 != 0) {
                    if ((i8 & 1879048192) == 0) {
                        if (interfaceC3163lP.l(function2)) {
                            i25 = 536870912;
                        } else {
                            i25 = 268435456;
                        }
                        i11 |= i25;
                    }
                    i26 = i10 & 1024;
                    if (i26 != 0) {
                        i27 = i9 | 6;
                    } else if ((i9 & 14) == 0) {
                        if (interfaceC3163lP.l(oVar)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i9 | i28;
                    } else {
                        i27 = i9;
                    }
                    if ((i11 & 1533916891) != 306783378) {
                        if (i29 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i12 != 0) {
                            num2 = null;
                        }
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i16 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i18 != 0) {
                            str6 = null;
                        } else {
                            str6 = str2;
                        }
                        if (i20 != 0) {
                            function5 = null;
                        } else {
                            function5 = function1;
                        }
                        if (i22 != 0) {
                            str7 = null;
                        } else {
                            str7 = str3;
                        }
                        if (i24 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i26 != 0) {
                            oVar2 = null;
                        } else {
                            oVar2 = oVar;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                        }
                        Q6.o oVar11113 = oVar2;
                        L0.i iVar11114 = iVar3;
                        Integer num11113 = num2;
                        Function0 function11119 = function5;
                        interfaceC3163l2 = interfaceC3163lP;
                        p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num11113, title, oVar11113, message, str7, str6, str5, function6, function11119, function4)), interfaceC3163l2, 12607488, 104);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        str8 = str7;
                        str9 = str5;
                        str10 = str6;
                        function7 = function4;
                        function8 = function6;
                        function9 = function11119;
                        num3 = num11113;
                        oVar3 = oVar11113;
                        iVar4 = iVar11114;
                    } else {
                        if (i29 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i12 != 0) {
                            num2 = null;
                        }
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i16 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i18 != 0) {
                            str6 = null;
                        } else {
                            str6 = str2;
                        }
                        if (i20 != 0) {
                            function5 = null;
                        } else {
                            function5 = function1;
                        }
                        if (i22 != 0) {
                            str7 = null;
                        } else {
                            str7 = str3;
                        }
                        if (i24 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i26 != 0) {
                            oVar2 = null;
                        } else {
                            oVar2 = oVar;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                        }
                        Q6.o oVar11114 = oVar2;
                        L0.i iVar11115 = iVar3;
                        Integer num11114 = num2;
                        Function0 function111110 = function5;
                        interfaceC3163l2 = interfaceC3163lP;
                        p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num11114, title, oVar11114, message, str7, str6, str5, function6, function111110, function4)), interfaceC3163l2, 12607488, 104);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        str8 = str7;
                        str9 = str5;
                        str10 = str6;
                        function7 = function4;
                        function8 = function6;
                        function9 = function111110;
                        num3 = num11114;
                        oVar3 = oVar11114;
                        iVar4 = iVar11115;
                    }
                    p0V = interfaceC3163l2.v();
                    if (p0V != null) {
                        p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                    }
                }
                i11 |= 805306368;
                i26 = i10 & 1024;
                if (i26 != 0) {
                    i27 = i9 | 6;
                } else if ((i9 & 14) == 0) {
                    if (interfaceC3163lP.l(oVar)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i9 | i28;
                } else {
                    i27 = i9;
                }
                if ((i11 & 1533916891) != 306783378) {
                    if (i29 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i12 != 0) {
                        num2 = null;
                    }
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i16 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i18 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i22 != 0) {
                        str7 = null;
                    } else {
                        str7 = str3;
                    }
                    if (i24 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i26 != 0) {
                        oVar2 = null;
                    } else {
                        oVar2 = oVar;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                    }
                    Q6.o oVar11115 = oVar2;
                    L0.i iVar11116 = iVar3;
                    Integer num11115 = num2;
                    Function0 function111111 = function5;
                    interfaceC3163l2 = interfaceC3163lP;
                    p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num11115, title, oVar11115, message, str7, str6, str5, function6, function111111, function4)), interfaceC3163l2, 12607488, 104);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    str8 = str7;
                    str9 = str5;
                    str10 = str6;
                    function7 = function4;
                    function8 = function6;
                    function9 = function111111;
                    num3 = num11115;
                    oVar3 = oVar11115;
                    iVar4 = iVar11116;
                } else {
                    if (i29 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i12 != 0) {
                        num2 = null;
                    }
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i16 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i18 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i22 != 0) {
                        str7 = null;
                    } else {
                        str7 = str3;
                    }
                    if (i24 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i26 != 0) {
                        oVar2 = null;
                    } else {
                        oVar2 = oVar;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                    }
                    Q6.o oVar11116 = oVar2;
                    L0.i iVar11117 = iVar3;
                    Integer num11116 = num2;
                    Function0 function111112 = function5;
                    interfaceC3163l2 = interfaceC3163lP;
                    p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num11116, title, oVar11116, message, str7, str6, str5, function6, function111112, function4)), interfaceC3163l2, 12607488, 104);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    str8 = str7;
                    str9 = str5;
                    str10 = str6;
                    function7 = function4;
                    function8 = function6;
                    function9 = function111112;
                    num3 = num11116;
                    oVar3 = oVar11116;
                    iVar4 = iVar11117;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                }
            }
            i11 |= 100663296;
            i24 = i10 & 512;
            if (i24 != 0) {
                if ((i8 & 1879048192) == 0) {
                    if (interfaceC3163lP.l(function2)) {
                        i25 = 536870912;
                    } else {
                        i25 = 268435456;
                    }
                    i11 |= i25;
                }
                i26 = i10 & 1024;
                if (i26 != 0) {
                    i27 = i9 | 6;
                } else if ((i9 & 14) == 0) {
                    if (interfaceC3163lP.l(oVar)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i9 | i28;
                } else {
                    i27 = i9;
                }
                if ((i11 & 1533916891) != 306783378) {
                    if (i29 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i12 != 0) {
                        num2 = null;
                    }
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i16 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i18 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i22 != 0) {
                        str7 = null;
                    } else {
                        str7 = str3;
                    }
                    if (i24 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i26 != 0) {
                        oVar2 = null;
                    } else {
                        oVar2 = oVar;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                    }
                    Q6.o oVar11117 = oVar2;
                    L0.i iVar11118 = iVar3;
                    Integer num11117 = num2;
                    Function0 function111113 = function5;
                    interfaceC3163l2 = interfaceC3163lP;
                    p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num11117, title, oVar11117, message, str7, str6, str5, function6, function111113, function4)), interfaceC3163l2, 12607488, 104);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    str8 = str7;
                    str9 = str5;
                    str10 = str6;
                    function7 = function4;
                    function8 = function6;
                    function9 = function111113;
                    num3 = num11117;
                    oVar3 = oVar11117;
                    iVar4 = iVar11118;
                } else {
                    if (i29 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i12 != 0) {
                        num2 = null;
                    }
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i16 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i18 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i22 != 0) {
                        str7 = null;
                    } else {
                        str7 = str3;
                    }
                    if (i24 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i26 != 0) {
                        oVar2 = null;
                    } else {
                        oVar2 = oVar;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                    }
                    Q6.o oVar11118 = oVar2;
                    L0.i iVar11119 = iVar3;
                    Integer num11118 = num2;
                    Function0 function111114 = function5;
                    interfaceC3163l2 = interfaceC3163lP;
                    p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num11118, title, oVar11118, message, str7, str6, str5, function6, function111114, function4)), interfaceC3163l2, 12607488, 104);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    str8 = str7;
                    str9 = str5;
                    str10 = str6;
                    function7 = function4;
                    function8 = function6;
                    function9 = function111114;
                    num3 = num11118;
                    oVar3 = oVar11118;
                    iVar4 = iVar11119;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                }
            }
            i11 |= 805306368;
            i26 = i10 & 1024;
            if (i26 != 0) {
                i27 = i9 | 6;
            } else if ((i9 & 14) == 0) {
                if (interfaceC3163lP.l(oVar)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i9 | i28;
            } else {
                i27 = i9;
            }
            if ((i11 & 1533916891) != 306783378) {
                if (i29 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i12 != 0) {
                    num2 = null;
                }
                if (i14 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i16 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i18 != 0) {
                    str6 = null;
                } else {
                    str6 = str2;
                }
                if (i20 != 0) {
                    function5 = null;
                } else {
                    function5 = function1;
                }
                if (i22 != 0) {
                    str7 = null;
                } else {
                    str7 = str3;
                }
                if (i24 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i26 != 0) {
                    oVar2 = null;
                } else {
                    oVar2 = oVar;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                }
                Q6.o oVar11119 = oVar2;
                L0.i iVar111110 = iVar3;
                Integer num11119 = num2;
                Function0 function111115 = function5;
                interfaceC3163l2 = interfaceC3163lP;
                p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num11119, title, oVar11119, message, str7, str6, str5, function6, function111115, function4)), interfaceC3163l2, 12607488, 104);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                str8 = str7;
                str9 = str5;
                str10 = str6;
                function7 = function4;
                function8 = function6;
                function9 = function111115;
                num3 = num11119;
                oVar3 = oVar11119;
                iVar4 = iVar111110;
            } else {
                if (i29 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i12 != 0) {
                    num2 = null;
                }
                if (i14 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i16 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i18 != 0) {
                    str6 = null;
                } else {
                    str6 = str2;
                }
                if (i20 != 0) {
                    function5 = null;
                } else {
                    function5 = function1;
                }
                if (i22 != 0) {
                    str7 = null;
                } else {
                    str7 = str3;
                }
                if (i24 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i26 != 0) {
                    oVar2 = null;
                } else {
                    oVar2 = oVar;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                }
                Q6.o oVar111110 = oVar2;
                L0.i iVar111111 = iVar3;
                Integer num111110 = num2;
                Function0 function111116 = function5;
                interfaceC3163l2 = interfaceC3163lP;
                p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num111110, title, oVar111110, message, str7, str6, str5, function6, function111116, function4)), interfaceC3163l2, 12607488, 104);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                str8 = str7;
                str9 = str5;
                str10 = str6;
                function7 = function4;
                function8 = function6;
                function9 = function111116;
                num3 = num111110;
                oVar3 = oVar111110;
                iVar4 = iVar111111;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
            }
        }
        i11 |= 3072;
        num2 = num;
        i14 = i10 & 16;
        if (i14 != 0) {
            if ((57344 & i8) == 0) {
                str4 = str;
                if (interfaceC3163lP.R(str4)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i11 |= i15;
            }
            i16 = i10 & 32;
            if (i16 != 0) {
                i11 |= 196608;
                function3 = function0;
            } else {
                function3 = function0;
                if ((i8 & 458752) == 0) {
                    if (interfaceC3163lP.l(function3)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i11 |= i17;
                }
            }
            i18 = i10 & 64;
            if (i18 != 0) {
                i11 |= 1572864;
            } else if ((i8 & 3670016) == 0) {
                if (interfaceC3163lP.R(str2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i11 |= i19;
            }
            i20 = i10 & 128;
            if (i20 != 0) {
                i11 |= 12582912;
            } else if ((i8 & 29360128) == 0) {
                if (interfaceC3163lP.l(function1)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i11 |= i21;
            }
            i22 = i10 & 256;
            if (i22 != 0) {
                if ((i8 & 234881024) == 0) {
                    if (interfaceC3163lP.R(str3)) {
                        i23 = 67108864;
                    } else {
                        i23 = 33554432;
                    }
                    i11 |= i23;
                }
                i24 = i10 & 512;
                if (i24 != 0) {
                    if ((i8 & 1879048192) == 0) {
                        if (interfaceC3163lP.l(function2)) {
                            i25 = 536870912;
                        } else {
                            i25 = 268435456;
                        }
                        i11 |= i25;
                    }
                    i26 = i10 & 1024;
                    if (i26 != 0) {
                        i27 = i9 | 6;
                    } else if ((i9 & 14) == 0) {
                        if (interfaceC3163lP.l(oVar)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i9 | i28;
                    } else {
                        i27 = i9;
                    }
                    if ((i11 & 1533916891) != 306783378) {
                        if (i29 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i12 != 0) {
                            num2 = null;
                        }
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i16 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i18 != 0) {
                            str6 = null;
                        } else {
                            str6 = str2;
                        }
                        if (i20 != 0) {
                            function5 = null;
                        } else {
                            function5 = function1;
                        }
                        if (i22 != 0) {
                            str7 = null;
                        } else {
                            str7 = str3;
                        }
                        if (i24 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i26 != 0) {
                            oVar2 = null;
                        } else {
                            oVar2 = oVar;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                        }
                        Q6.o oVar111111 = oVar2;
                        L0.i iVar111112 = iVar3;
                        Integer num111111 = num2;
                        Function0 function111117 = function5;
                        interfaceC3163l2 = interfaceC3163lP;
                        p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num111111, title, oVar111111, message, str7, str6, str5, function6, function111117, function4)), interfaceC3163l2, 12607488, 104);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        str8 = str7;
                        str9 = str5;
                        str10 = str6;
                        function7 = function4;
                        function8 = function6;
                        function9 = function111117;
                        num3 = num111111;
                        oVar3 = oVar111111;
                        iVar4 = iVar111112;
                    } else {
                        if (i29 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i12 != 0) {
                            num2 = null;
                        }
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str4;
                        }
                        if (i16 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i18 != 0) {
                            str6 = null;
                        } else {
                            str6 = str2;
                        }
                        if (i20 != 0) {
                            function5 = null;
                        } else {
                            function5 = function1;
                        }
                        if (i22 != 0) {
                            str7 = null;
                        } else {
                            str7 = str3;
                        }
                        if (i24 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i26 != 0) {
                            oVar2 = null;
                        } else {
                            oVar2 = oVar;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                        }
                        Q6.o oVar111112 = oVar2;
                        L0.i iVar111113 = iVar3;
                        Integer num111112 = num2;
                        Function0 function111118 = function5;
                        interfaceC3163l2 = interfaceC3163lP;
                        p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num111112, title, oVar111112, message, str7, str6, str5, function6, function111118, function4)), interfaceC3163l2, 12607488, 104);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        str8 = str7;
                        str9 = str5;
                        str10 = str6;
                        function7 = function4;
                        function8 = function6;
                        function9 = function111118;
                        num3 = num111112;
                        oVar3 = oVar111112;
                        iVar4 = iVar111113;
                    }
                    p0V = interfaceC3163l2.v();
                    if (p0V != null) {
                        p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                    }
                }
                i11 |= 805306368;
                i26 = i10 & 1024;
                if (i26 != 0) {
                    i27 = i9 | 6;
                } else if ((i9 & 14) == 0) {
                    if (interfaceC3163lP.l(oVar)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i9 | i28;
                } else {
                    i27 = i9;
                }
                if ((i11 & 1533916891) != 306783378) {
                    if (i29 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i12 != 0) {
                        num2 = null;
                    }
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i16 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i18 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i22 != 0) {
                        str7 = null;
                    } else {
                        str7 = str3;
                    }
                    if (i24 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i26 != 0) {
                        oVar2 = null;
                    } else {
                        oVar2 = oVar;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                    }
                    Q6.o oVar111113 = oVar2;
                    L0.i iVar111114 = iVar3;
                    Integer num111113 = num2;
                    Function0 function111119 = function5;
                    interfaceC3163l2 = interfaceC3163lP;
                    p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num111113, title, oVar111113, message, str7, str6, str5, function6, function111119, function4)), interfaceC3163l2, 12607488, 104);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    str8 = str7;
                    str9 = str5;
                    str10 = str6;
                    function7 = function4;
                    function8 = function6;
                    function9 = function111119;
                    num3 = num111113;
                    oVar3 = oVar111113;
                    iVar4 = iVar111114;
                } else {
                    if (i29 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i12 != 0) {
                        num2 = null;
                    }
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i16 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i18 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i22 != 0) {
                        str7 = null;
                    } else {
                        str7 = str3;
                    }
                    if (i24 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i26 != 0) {
                        oVar2 = null;
                    } else {
                        oVar2 = oVar;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                    }
                    Q6.o oVar111114 = oVar2;
                    L0.i iVar111115 = iVar3;
                    Integer num111114 = num2;
                    Function0 function1111110 = function5;
                    interfaceC3163l2 = interfaceC3163lP;
                    p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num111114, title, oVar111114, message, str7, str6, str5, function6, function1111110, function4)), interfaceC3163l2, 12607488, 104);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    str8 = str7;
                    str9 = str5;
                    str10 = str6;
                    function7 = function4;
                    function8 = function6;
                    function9 = function1111110;
                    num3 = num111114;
                    oVar3 = oVar111114;
                    iVar4 = iVar111115;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                }
            }
            i11 |= 100663296;
            i24 = i10 & 512;
            if (i24 != 0) {
                if ((i8 & 1879048192) == 0) {
                    if (interfaceC3163lP.l(function2)) {
                        i25 = 536870912;
                    } else {
                        i25 = 268435456;
                    }
                    i11 |= i25;
                }
                i26 = i10 & 1024;
                if (i26 != 0) {
                    i27 = i9 | 6;
                } else if ((i9 & 14) == 0) {
                    if (interfaceC3163lP.l(oVar)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i9 | i28;
                } else {
                    i27 = i9;
                }
                if ((i11 & 1533916891) != 306783378) {
                    if (i29 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i12 != 0) {
                        num2 = null;
                    }
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i16 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i18 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i22 != 0) {
                        str7 = null;
                    } else {
                        str7 = str3;
                    }
                    if (i24 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i26 != 0) {
                        oVar2 = null;
                    } else {
                        oVar2 = oVar;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                    }
                    Q6.o oVar111115 = oVar2;
                    L0.i iVar111116 = iVar3;
                    Integer num111115 = num2;
                    Function0 function1111111 = function5;
                    interfaceC3163l2 = interfaceC3163lP;
                    p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num111115, title, oVar111115, message, str7, str6, str5, function6, function1111111, function4)), interfaceC3163l2, 12607488, 104);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    str8 = str7;
                    str9 = str5;
                    str10 = str6;
                    function7 = function4;
                    function8 = function6;
                    function9 = function1111111;
                    num3 = num111115;
                    oVar3 = oVar111115;
                    iVar4 = iVar111116;
                } else {
                    if (i29 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i12 != 0) {
                        num2 = null;
                    }
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i16 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i18 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i22 != 0) {
                        str7 = null;
                    } else {
                        str7 = str3;
                    }
                    if (i24 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i26 != 0) {
                        oVar2 = null;
                    } else {
                        oVar2 = oVar;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                    }
                    Q6.o oVar111116 = oVar2;
                    L0.i iVar111117 = iVar3;
                    Integer num111116 = num2;
                    Function0 function1111112 = function5;
                    interfaceC3163l2 = interfaceC3163lP;
                    p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num111116, title, oVar111116, message, str7, str6, str5, function6, function1111112, function4)), interfaceC3163l2, 12607488, 104);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    str8 = str7;
                    str9 = str5;
                    str10 = str6;
                    function7 = function4;
                    function8 = function6;
                    function9 = function1111112;
                    num3 = num111116;
                    oVar3 = oVar111116;
                    iVar4 = iVar111117;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                }
            }
            i11 |= 805306368;
            i26 = i10 & 1024;
            if (i26 != 0) {
                i27 = i9 | 6;
            } else if ((i9 & 14) == 0) {
                if (interfaceC3163lP.l(oVar)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i9 | i28;
            } else {
                i27 = i9;
            }
            if ((i11 & 1533916891) != 306783378) {
                if (i29 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i12 != 0) {
                    num2 = null;
                }
                if (i14 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i16 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i18 != 0) {
                    str6 = null;
                } else {
                    str6 = str2;
                }
                if (i20 != 0) {
                    function5 = null;
                } else {
                    function5 = function1;
                }
                if (i22 != 0) {
                    str7 = null;
                } else {
                    str7 = str3;
                }
                if (i24 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i26 != 0) {
                    oVar2 = null;
                } else {
                    oVar2 = oVar;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                }
                Q6.o oVar111117 = oVar2;
                L0.i iVar111118 = iVar3;
                Integer num111117 = num2;
                Function0 function1111113 = function5;
                interfaceC3163l2 = interfaceC3163lP;
                p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num111117, title, oVar111117, message, str7, str6, str5, function6, function1111113, function4)), interfaceC3163l2, 12607488, 104);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                str8 = str7;
                str9 = str5;
                str10 = str6;
                function7 = function4;
                function8 = function6;
                function9 = function1111113;
                num3 = num111117;
                oVar3 = oVar111117;
                iVar4 = iVar111118;
            } else {
                if (i29 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i12 != 0) {
                    num2 = null;
                }
                if (i14 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i16 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i18 != 0) {
                    str6 = null;
                } else {
                    str6 = str2;
                }
                if (i20 != 0) {
                    function5 = null;
                } else {
                    function5 = function1;
                }
                if (i22 != 0) {
                    str7 = null;
                } else {
                    str7 = str3;
                }
                if (i24 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i26 != 0) {
                    oVar2 = null;
                } else {
                    oVar2 = oVar;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                }
                Q6.o oVar111118 = oVar2;
                L0.i iVar111119 = iVar3;
                Integer num111118 = num2;
                Function0 function1111114 = function5;
                interfaceC3163l2 = interfaceC3163lP;
                p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num111118, title, oVar111118, message, str7, str6, str5, function6, function1111114, function4)), interfaceC3163l2, 12607488, 104);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                str8 = str7;
                str9 = str5;
                str10 = str6;
                function7 = function4;
                function8 = function6;
                function9 = function1111114;
                num3 = num111118;
                oVar3 = oVar111118;
                iVar4 = iVar111119;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
            }
        }
        i11 |= 24576;
        str4 = str;
        i16 = i10 & 32;
        if (i16 != 0) {
            i11 |= 196608;
            function3 = function0;
        } else {
            function3 = function0;
            if ((i8 & 458752) == 0) {
                if (interfaceC3163lP.l(function3)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i11 |= i17;
            }
        }
        i18 = i10 & 64;
        if (i18 != 0) {
            i11 |= 1572864;
        } else if ((i8 & 3670016) == 0) {
            if (interfaceC3163lP.R(str2)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i11 |= i19;
        }
        i20 = i10 & 128;
        if (i20 != 0) {
            i11 |= 12582912;
        } else if ((i8 & 29360128) == 0) {
            if (interfaceC3163lP.l(function1)) {
                i21 = 8388608;
            } else {
                i21 = 4194304;
            }
            i11 |= i21;
        }
        i22 = i10 & 256;
        if (i22 != 0) {
            if ((i8 & 234881024) == 0) {
                if (interfaceC3163lP.R(str3)) {
                    i23 = 67108864;
                } else {
                    i23 = 33554432;
                }
                i11 |= i23;
            }
            i24 = i10 & 512;
            if (i24 != 0) {
                if ((i8 & 1879048192) == 0) {
                    if (interfaceC3163lP.l(function2)) {
                        i25 = 536870912;
                    } else {
                        i25 = 268435456;
                    }
                    i11 |= i25;
                }
                i26 = i10 & 1024;
                if (i26 != 0) {
                    i27 = i9 | 6;
                } else if ((i9 & 14) == 0) {
                    if (interfaceC3163lP.l(oVar)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i9 | i28;
                } else {
                    i27 = i9;
                }
                if ((i11 & 1533916891) != 306783378) {
                    if (i29 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i12 != 0) {
                        num2 = null;
                    }
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i16 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i18 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i22 != 0) {
                        str7 = null;
                    } else {
                        str7 = str3;
                    }
                    if (i24 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i26 != 0) {
                        oVar2 = null;
                    } else {
                        oVar2 = oVar;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                    }
                    Q6.o oVar111119 = oVar2;
                    L0.i iVar1111110 = iVar3;
                    Integer num111119 = num2;
                    Function0 function1111115 = function5;
                    interfaceC3163l2 = interfaceC3163lP;
                    p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num111119, title, oVar111119, message, str7, str6, str5, function6, function1111115, function4)), interfaceC3163l2, 12607488, 104);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    str8 = str7;
                    str9 = str5;
                    str10 = str6;
                    function7 = function4;
                    function8 = function6;
                    function9 = function1111115;
                    num3 = num111119;
                    oVar3 = oVar111119;
                    iVar4 = iVar1111110;
                } else {
                    if (i29 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i12 != 0) {
                        num2 = null;
                    }
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i16 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i18 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (i22 != 0) {
                        str7 = null;
                    } else {
                        str7 = str3;
                    }
                    if (i24 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i26 != 0) {
                        oVar2 = null;
                    } else {
                        oVar2 = oVar;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                    }
                    Q6.o oVar1111110 = oVar2;
                    L0.i iVar1111111 = iVar3;
                    Integer num1111110 = num2;
                    Function0 function1111116 = function5;
                    interfaceC3163l2 = interfaceC3163lP;
                    p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num1111110, title, oVar1111110, message, str7, str6, str5, function6, function1111116, function4)), interfaceC3163l2, 12607488, 104);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    str8 = str7;
                    str9 = str5;
                    str10 = str6;
                    function7 = function4;
                    function8 = function6;
                    function9 = function1111116;
                    num3 = num1111110;
                    oVar3 = oVar1111110;
                    iVar4 = iVar1111111;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
                }
            }
            i11 |= 805306368;
            i26 = i10 & 1024;
            if (i26 != 0) {
                i27 = i9 | 6;
            } else if ((i9 & 14) == 0) {
                if (interfaceC3163lP.l(oVar)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i9 | i28;
            } else {
                i27 = i9;
            }
            if ((i11 & 1533916891) != 306783378) {
                if (i29 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i12 != 0) {
                    num2 = null;
                }
                if (i14 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i16 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i18 != 0) {
                    str6 = null;
                } else {
                    str6 = str2;
                }
                if (i20 != 0) {
                    function5 = null;
                } else {
                    function5 = function1;
                }
                if (i22 != 0) {
                    str7 = null;
                } else {
                    str7 = str3;
                }
                if (i24 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i26 != 0) {
                    oVar2 = null;
                } else {
                    oVar2 = oVar;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                }
                Q6.o oVar1111111 = oVar2;
                L0.i iVar1111112 = iVar3;
                Integer num1111111 = num2;
                Function0 function1111117 = function5;
                interfaceC3163l2 = interfaceC3163lP;
                p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num1111111, title, oVar1111111, message, str7, str6, str5, function6, function1111117, function4)), interfaceC3163l2, 12607488, 104);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                str8 = str7;
                str9 = str5;
                str10 = str6;
                function7 = function4;
                function8 = function6;
                function9 = function1111117;
                num3 = num1111111;
                oVar3 = oVar1111111;
                iVar4 = iVar1111112;
            } else {
                if (i29 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i12 != 0) {
                    num2 = null;
                }
                if (i14 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i16 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i18 != 0) {
                    str6 = null;
                } else {
                    str6 = str2;
                }
                if (i20 != 0) {
                    function5 = null;
                } else {
                    function5 = function1;
                }
                if (i22 != 0) {
                    str7 = null;
                } else {
                    str7 = str3;
                }
                if (i24 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i26 != 0) {
                    oVar2 = null;
                } else {
                    oVar2 = oVar;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                }
                Q6.o oVar1111112 = oVar2;
                L0.i iVar1111113 = iVar3;
                Integer num1111112 = num2;
                Function0 function1111118 = function5;
                interfaceC3163l2 = interfaceC3163lP;
                p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num1111112, title, oVar1111112, message, str7, str6, str5, function6, function1111118, function4)), interfaceC3163l2, 12607488, 104);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                str8 = str7;
                str9 = str5;
                str10 = str6;
                function7 = function4;
                function8 = function6;
                function9 = function1111118;
                num3 = num1111112;
                oVar3 = oVar1111112;
                iVar4 = iVar1111113;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
            }
        }
        i11 |= 100663296;
        i24 = i10 & 512;
        if (i24 != 0) {
            if ((i8 & 1879048192) == 0) {
                if (interfaceC3163lP.l(function2)) {
                    i25 = 536870912;
                } else {
                    i25 = 268435456;
                }
                i11 |= i25;
            }
            i26 = i10 & 1024;
            if (i26 != 0) {
                i27 = i9 | 6;
            } else if ((i9 & 14) == 0) {
                if (interfaceC3163lP.l(oVar)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i9 | i28;
            } else {
                i27 = i9;
            }
            if ((i11 & 1533916891) != 306783378) {
                if (i29 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i12 != 0) {
                    num2 = null;
                }
                if (i14 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i16 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i18 != 0) {
                    str6 = null;
                } else {
                    str6 = str2;
                }
                if (i20 != 0) {
                    function5 = null;
                } else {
                    function5 = function1;
                }
                if (i22 != 0) {
                    str7 = null;
                } else {
                    str7 = str3;
                }
                if (i24 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i26 != 0) {
                    oVar2 = null;
                } else {
                    oVar2 = oVar;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                }
                Q6.o oVar1111113 = oVar2;
                L0.i iVar1111114 = iVar3;
                Integer num1111113 = num2;
                Function0 function1111119 = function5;
                interfaceC3163l2 = interfaceC3163lP;
                p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num1111113, title, oVar1111113, message, str7, str6, str5, function6, function1111119, function4)), interfaceC3163l2, 12607488, 104);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                str8 = str7;
                str9 = str5;
                str10 = str6;
                function7 = function4;
                function8 = function6;
                function9 = function1111119;
                num3 = num1111113;
                oVar3 = oVar1111113;
                iVar4 = iVar1111114;
            } else {
                if (i29 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i12 != 0) {
                    num2 = null;
                }
                if (i14 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i16 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i18 != 0) {
                    str6 = null;
                } else {
                    str6 = str2;
                }
                if (i20 != 0) {
                    function5 = null;
                } else {
                    function5 = function1;
                }
                if (i22 != 0) {
                    str7 = null;
                } else {
                    str7 = str3;
                }
                if (i24 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i26 != 0) {
                    oVar2 = null;
                } else {
                    oVar2 = oVar;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
                }
                Q6.o oVar1111114 = oVar2;
                L0.i iVar1111115 = iVar3;
                Integer num1111114 = num2;
                Function0 function11111110 = function5;
                interfaceC3163l2 = interfaceC3163lP;
                p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num1111114, title, oVar1111114, message, str7, str6, str5, function6, function11111110, function4)), interfaceC3163l2, 12607488, 104);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                str8 = str7;
                str9 = str5;
                str10 = str6;
                function7 = function4;
                function8 = function6;
                function9 = function11111110;
                num3 = num1111114;
                oVar3 = oVar1111114;
                iVar4 = iVar1111115;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
            }
        }
        i11 |= 805306368;
        i26 = i10 & 1024;
        if (i26 != 0) {
            i27 = i9 | 6;
        } else if ((i9 & 14) == 0) {
            if (interfaceC3163lP.l(oVar)) {
                i28 = 4;
            } else {
                i28 = 2;
            }
            i27 = i9 | i28;
        } else {
            i27 = i9;
        }
        if ((i11 & 1533916891) != 306783378) {
            if (i29 != 0) {
                iVar3 = L0.i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (i12 != 0) {
                num2 = null;
            }
            if (i14 != 0) {
                str5 = null;
            } else {
                str5 = str4;
            }
            if (i16 != 0) {
                function4 = null;
            } else {
                function4 = function3;
            }
            if (i18 != 0) {
                str6 = null;
            } else {
                str6 = str2;
            }
            if (i20 != 0) {
                function5 = null;
            } else {
                function5 = function1;
            }
            if (i22 != 0) {
                str7 = null;
            } else {
                str7 = str3;
            }
            if (i24 != 0) {
                function6 = null;
            } else {
                function6 = function2;
            }
            if (i26 != 0) {
                oVar2 = null;
            } else {
                oVar2 = oVar;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
            }
            Q6.o oVar1111115 = oVar2;
            L0.i iVar1111116 = iVar3;
            Integer num1111115 = num2;
            Function0 function11111111 = function5;
            interfaceC3163l2 = interfaceC3163lP;
            p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num1111115, title, oVar1111115, message, str7, str6, str5, function6, function11111111, function4)), interfaceC3163l2, 12607488, 104);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            str8 = str7;
            str9 = str5;
            str10 = str6;
            function7 = function4;
            function8 = function6;
            function9 = function11111111;
            num3 = num1111115;
            oVar3 = oVar1111115;
            iVar4 = iVar1111116;
        } else {
            if (i29 != 0) {
                iVar3 = L0.i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (i12 != 0) {
                num2 = null;
            }
            if (i14 != 0) {
                str5 = null;
            } else {
                str5 = str4;
            }
            if (i16 != 0) {
                function4 = null;
            } else {
                function4 = function3;
            }
            if (i18 != 0) {
                str6 = null;
            } else {
                str6 = str2;
            }
            if (i20 != 0) {
                function5 = null;
            } else {
                function5 = function1;
            }
            if (i22 != 0) {
                str7 = null;
            } else {
                str7 = str3;
            }
            if (i24 != 0) {
                function6 = null;
            } else {
                function6 = function2;
            }
            if (i26 != 0) {
                oVar2 = null;
            } else {
                oVar2 = oVar;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1921333311, i11, i27, "com.elgato.streamdeck.ui.components.DialogContent (DialogContent.kt:46)");
            }
            Q6.o oVar1111116 = oVar2;
            L0.i iVar1111117 = iVar3;
            Integer num1111116 = num2;
            Function0 function11111112 = function5;
            interfaceC3163l2 = interfaceC3163lP;
            p191w0.F0.a(androidx.compose.foundation.layout.f.t(androidx.compose.foundation.layout.f.v(iVar3, null, false, 3, null), null, false, 3, null), p135p0.g.c(W3.c.f11463a.b()), Z.f35786a.a(interfaceC3163lP, Z.f35787b).G(), 0L, A1.h.m(0), 0.0f, null, H0.c.b(interfaceC3163lP, 1796588356, true, new c(num1111116, title, oVar1111116, message, str7, str6, str5, function6, function11111112, function4)), interfaceC3163l2, 12607488, 104);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            str8 = str7;
            str9 = str5;
            str10 = str6;
            function7 = function4;
            function8 = function6;
            function9 = function11111112;
            num3 = num1111116;
            oVar3 = oVar1111116;
            iVar4 = iVar1111117;
        }
        p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new d(title, message, iVar4, num3, str9, function7, str10, function9, str8, function8, oVar3, i8, i9, i10));
        }
    }
}
