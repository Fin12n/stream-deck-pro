package p202x3;

import C6.G;
import L0.i;
import Q6.k;
import Q6.o;
import Q6.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2252x;
import p038e1.H;
import p056g1.InterfaceC2343g;
import p082j0.AbstractC2601e;
import p082j0.AbstractC2607k;
import p082j0.C2598b;
import p082j0.C2609m;
import p082j0.InterfaceC2608l;
import p082j0.S;
import p082j0.U;
import p110m1.n;
import p110m1.x;
import p191w0.AbstractC3085t;
import p191w0.O;
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
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f37226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f37227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f37228c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z8, int i8, k kVar) {
            super(3);
            this.f37226a = z8;
            this.f37227b = i8;
            this.f37228c = kVar;
        }

        public final void b(InterfaceC2608l Card, InterfaceC3163l interfaceC3163l, int i8) {
            t.g(Card, "$this$Card");
            if ((i8 & 81) == 16 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1004644721, i8, -1, "com.elgato.streamdeck.keypad.KeypadPaging.<anonymous> (KeypadPaging.kt:47)");
            }
            if (this.f37226a) {
                interfaceC3163l.f(911076619);
                L0.c.b bVarF = L0.c.f4806a.f();
                int i9 = this.f37227b;
                k kVar = this.f37228c;
                interfaceC3163l.f(-483455358);
                i.a aVar = i.f4836a;
                H hA = AbstractC2607k.a(C2598b.f27914a.g(), bVarF, interfaceC3163l, 48);
                interfaceC3163l.f(-1323940314);
                int iA = AbstractC3157i.a(interfaceC3163l, 0);
                InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
                InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
                Function0 function0A = aVar2.a();
                p pVarB = AbstractC2252x.b(aVar);
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
                C2609m c2609m = C2609m.f28036a;
                d.c(p154r3.h.f32468S, p154r3.h.f32465P, 0.8f, i9, kVar, interfaceC3163l, 384);
                interfaceC3163l.N();
                interfaceC3163l.O();
                interfaceC3163l.N();
                interfaceC3163l.N();
                interfaceC3163l.N();
            } else {
                interfaceC3163l.f(911077076);
                L0.c.InterfaceC0174c interfaceC0174cG = L0.c.f4806a.g();
                int i10 = this.f37227b;
                k kVar2 = this.f37228c;
                interfaceC3163l.f(693286680);
                i.a aVar3 = i.f4836a;
                H hA2 = S.a(C2598b.f27914a.f(), interfaceC0174cG, interfaceC3163l, 48);
                interfaceC3163l.f(-1323940314);
                int iA2 = AbstractC3157i.a(interfaceC3163l, 0);
                InterfaceC3184w interfaceC3184wE2 = interfaceC3163l.E();
                InterfaceC2343g.a aVar4 = InterfaceC2343g.f23596Q;
                Function0 function0A2 = aVar4.a();
                p pVarB2 = AbstractC2252x.b(aVar3);
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
                v1.b(interfaceC3163lA2, hA2, aVar4.c());
                v1.b(interfaceC3163lA2, interfaceC3184wE2, aVar4.e());
                o oVarB2 = aVar4.b();
                if (interfaceC3163lA2.m() || !t.c(interfaceC3163lA2.g(), Integer.valueOf(iA2))) {
                    interfaceC3163lA2.H(Integer.valueOf(iA2));
                    interfaceC3163lA2.A(Integer.valueOf(iA2), oVarB2);
                }
                pVarB2.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
                interfaceC3163l.f(2058660585);
                U u8 = U.f27892a;
                d.c(p154r3.h.f32466Q, p154r3.h.f32467R, 1.5f, i10, kVar2, interfaceC3163l, 384);
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
            b((InterfaceC2608l) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f37229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q3.e f37230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f37231c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f37232d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f37233e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f37234f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, Q3.e eVar, boolean z8, k kVar, int i8, int i9) {
            super(2);
            this.f37229a = iVar;
            this.f37230b = eVar;
            this.f37231c = z8;
            this.f37232d = kVar;
            this.f37233e = i8;
            this.f37234f = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            d.a(this.f37229a, this.f37230b, this.f37231c, this.f37232d, interfaceC3163l, F0.a(this.f37233e | 1), this.f37234f);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f37235a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.f37235a = str;
        }

        public final void b(x clearAndSetSemantics) {
            t.g(clearAndSetSemantics, "$this$clearAndSetSemantics");
            p110m1.u.M(clearAndSetSemantics, this.f37235a);
            p110m1.u.S(clearAndSetSemantics, p110m1.h.f29507b.a());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((x) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: x3.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0826d extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f37236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f37237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f37238c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f37239d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f37240e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f37241f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0826d(i iVar, int i8, String str, Function0 function0, int i9, int i10) {
            super(2);
            this.f37236a = iVar;
            this.f37237b = i8;
            this.f37238c = str;
            this.f37239d = function0;
            this.f37240e = i9;
            this.f37241f = i10;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            d.b(this.f37236a, this.f37237b, this.f37238c, this.f37239d, interfaceC3163l, F0.a(this.f37240e | 1), this.f37241f);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f37242a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(k kVar) {
            super(0);
            this.f37242a = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m287invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m287invoke() {
            this.f37242a.invoke(Boolean.FALSE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f37243a = new f();

        public f() {
            super(1);
        }

        public final void b(x clearAndSetSemantics) {
            t.g(clearAndSetSemantics, "$this$clearAndSetSemantics");
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((x) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f37244a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(k kVar) {
            super(0);
            this.f37244a = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m288invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m288invoke() {
            this.f37244a.invoke(Boolean.TRUE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f37245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f37246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f37247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f37248d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ k f37249e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f37250f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i8, int i9, float f8, int i10, k kVar, int i11) {
            super(2);
            this.f37245a = i8;
            this.f37246b = i9;
            this.f37247c = f8;
            this.f37248d = i10;
            this.f37249e = kVar;
            this.f37250f = i11;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            d.c(this.f37245a, this.f37246b, this.f37247c, this.f37248d, this.f37249e, interfaceC3163l, F0.a(this.f37250f | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(i iVar, Q3.e pageInfo, boolean z8, k onPage, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        t.g(pageInfo, "pageInfo");
        t.g(onPage, "onPage");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(660866205);
        int i11 = i9 & 1;
        if (i11 != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.R(iVar) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            i10 |= interfaceC3163lP.R(pageInfo) ? 32 : 16;
        }
        if ((i9 & 4) != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            i10 |= interfaceC3163lP.c(z8) ? 256 : 128;
        }
        if ((i9 & 8) != 0) {
            i10 |= 3072;
        } else if ((i8 & 7168) == 0) {
            i10 |= interfaceC3163lP.l(onPage) ? 2048 : 1024;
        }
        if ((i10 & 5851) == 1170 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (i11 != 0) {
                iVar = i.f4836a;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(660866205, i10, -1, "com.elgato.streamdeck.keypad.KeypadPaging (KeypadPaging.kt:41)");
            }
            int iA = pageInfo.a() + 1;
            AbstractC3085t.a(K3.c.b(iVar, p194w3.b.f37035l, new Object[]{Integer.valueOf(iA), Integer.valueOf(pageInfo.c())}, interfaceC3163lP, (i10 & 14) | 512), p135p0.g.f(), null, null, null, H0.c.b(interfaceC3163lP, -1004644721, true, new a(z8, iA, onPage)), interfaceC3163lP, 196608, 28);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        i iVar2 = iVar;
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(iVar2, pageInfo, z8, onPage, i8, i9));
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x0106  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    /* JADX WARN: Code duplicated, block: B:71:0x0116  */
    /* JADX WARN: Code duplicated, block: B:74:0x0135  */
    /* JADX WARN: Code duplicated, block: B:76:0x0143  */
    /* JADX WARN: Code duplicated, block: B:79:0x0198  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final void b(i iVar, int i8, String str, Function0 function0, InterfaceC3163l interfaceC3163l, int i9, int i10) {
        i iVar2;
        int i11;
        Function0 function1;
        i iVar3;
        boolean z8;
        Object objG;
        int iA;
        Function0 function0A;
        InterfaceC3163l interfaceC3163lA;
        o oVarB;
        P0 p0V;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1388349739);
        int i12 = i10 & 1;
        if (i12 != 0) {
            i11 = i9 | 6;
            iVar2 = iVar;
        } else if ((i9 & 14) == 0) {
            iVar2 = iVar;
            i11 = (interfaceC3163lP.R(iVar2) ? 4 : 2) | i9;
        } else {
            iVar2 = iVar;
            i11 = i9;
        }
        if ((i10 & 2) != 0) {
            i11 |= 48;
        } else if ((i9 & 112) == 0) {
            i11 |= interfaceC3163lP.i(i8) ? 32 : 16;
        }
        if ((i10 & 4) != 0) {
            i11 |= 384;
        } else if ((i9 & 896) == 0) {
            i11 |= interfaceC3163lP.R(str) ? 256 : 128;
        }
        if ((i10 & 8) == 0) {
            if ((i9 & 7168) == 0) {
                function1 = function0;
                i11 |= interfaceC3163lP.l(function1) ? 2048 : 1024;
            }
            if ((i11 & 5851) == 1170 || !interfaceC3163lP.s()) {
                if (i12 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1388349739, i11, -1, "com.elgato.streamdeck.keypad.PagingButton (KeypadPaging.kt:108)");
                }
                interfaceC3163lP.f(-550470681);
                if ((i11 & 896) == 256) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                objG = interfaceC3163lP.g();
                if (z8 || objG == InterfaceC3163l.f38803a.a()) {
                    objG = new c(str);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                i iVarE = androidx.compose.foundation.d.e(n.a(iVar3, (k) objG), false, null, null, function1, 7, null);
                L0.c cVarE = L0.c.f4806a.e();
                interfaceC3163lP.f(733328855);
                H hG = AbstractC2601e.g(cVarE, false, interfaceC3163lP, 6);
                interfaceC3163lP.f(-1323940314);
                iA = AbstractC3157i.a(interfaceC3163lP, 0);
                InterfaceC3184w interfaceC3184wE = interfaceC3163lP.E();
                InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
                function0A = aVar.a();
                p pVarB = AbstractC2252x.b(iVarE);
                if (interfaceC3163lP.t() == null) {
                    AbstractC3157i.c();
                }
                interfaceC3163lP.r();
                if (interfaceC3163lP.m()) {
                    interfaceC3163lP.w(function0A);
                } else {
                    interfaceC3163lP.G();
                }
                interfaceC3163lA = v1.a(interfaceC3163lP);
                v1.b(interfaceC3163lA, hG, aVar.c());
                v1.b(interfaceC3163lA, interfaceC3184wE, aVar.e());
                oVarB = aVar.b();
                if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                }
                pVarB.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                interfaceC3163lP.f(2058660585);
                androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f14485a;
                O.a(p101l1.c.d(i8, interfaceC3163lP, (i11 >> 3) & 14), "Page arrow", androidx.compose.foundation.layout.f.l(i.f4836a, A1.h.m(32)), 0L, interfaceC3163lP, 440, 8);
                interfaceC3163lP.N();
                interfaceC3163lP.O();
                interfaceC3163lP.N();
                interfaceC3163lP.N();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            } else {
                interfaceC3163lP.z();
                iVar3 = iVar2;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new C0826d(iVar3, i8, str, function0, i9, i10));
            }
        }
        i11 |= 3072;
        function1 = function0;
        if ((i11 & 5851) == 1170) {
            if (i12 != 0) {
                iVar3 = i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1388349739, i11, -1, "com.elgato.streamdeck.keypad.PagingButton (KeypadPaging.kt:108)");
            }
            interfaceC3163lP.f(-550470681);
            if ((i11 & 896) == 256) {
                z8 = true;
            } else {
                z8 = false;
            }
            objG = interfaceC3163lP.g();
            if (z8) {
                objG = new c(str);
                interfaceC3163lP.H(objG);
            } else {
                objG = new c(str);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            i iVarE2 = androidx.compose.foundation.d.e(n.a(iVar3, (k) objG), false, null, null, function1, 7, null);
            L0.c cVarE2 = L0.c.f4806a.e();
            interfaceC3163lP.f(733328855);
            H hG2 = AbstractC2601e.g(cVarE2, false, interfaceC3163lP, 6);
            interfaceC3163lP.f(-1323940314);
            iA = AbstractC3157i.a(interfaceC3163lP, 0);
            InterfaceC3184w interfaceC3184wE2 = interfaceC3163lP.E();
            InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
            function0A = aVar2.a();
            p pVarB2 = AbstractC2252x.b(iVarE2);
            if (interfaceC3163lP.t() == null) {
                AbstractC3157i.c();
            }
            interfaceC3163lP.r();
            if (interfaceC3163lP.m()) {
                interfaceC3163lP.w(function0A);
            } else {
                interfaceC3163lP.G();
            }
            interfaceC3163lA = v1.a(interfaceC3163lP);
            v1.b(interfaceC3163lA, hG2, aVar2.c());
            v1.b(interfaceC3163lA, interfaceC3184wE2, aVar2.e());
            oVarB = aVar2.b();
            if (interfaceC3163lA.m()) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            } else {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB2.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
            interfaceC3163lP.f(2058660585);
            androidx.compose.foundation.layout.b bVar2 = androidx.compose.foundation.layout.b.f14485a;
            O.a(p101l1.c.d(i8, interfaceC3163lP, (i11 >> 3) & 14), "Page arrow", androidx.compose.foundation.layout.f.l(i.f4836a, A1.h.m(32)), 0L, interfaceC3163lP, 440, 8);
            interfaceC3163lP.N();
            interfaceC3163lP.O();
            interfaceC3163lP.N();
            interfaceC3163lP.N();
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
                AbstractC3169o.W(1388349739, i11, -1, "com.elgato.streamdeck.keypad.PagingButton (KeypadPaging.kt:108)");
            }
            interfaceC3163lP.f(-550470681);
            if ((i11 & 896) == 256) {
                z8 = true;
            } else {
                z8 = false;
            }
            objG = interfaceC3163lP.g();
            if (z8) {
                objG = new c(str);
                interfaceC3163lP.H(objG);
            } else {
                objG = new c(str);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            i iVarE3 = androidx.compose.foundation.d.e(n.a(iVar3, (k) objG), false, null, null, function1, 7, null);
            L0.c cVarE3 = L0.c.f4806a.e();
            interfaceC3163lP.f(733328855);
            H hG3 = AbstractC2601e.g(cVarE3, false, interfaceC3163lP, 6);
            interfaceC3163lP.f(-1323940314);
            iA = AbstractC3157i.a(interfaceC3163lP, 0);
            InterfaceC3184w interfaceC3184wE3 = interfaceC3163lP.E();
            InterfaceC2343g.a aVar3 = InterfaceC2343g.f23596Q;
            function0A = aVar3.a();
            p pVarB3 = AbstractC2252x.b(iVarE3);
            if (interfaceC3163lP.t() == null) {
                AbstractC3157i.c();
            }
            interfaceC3163lP.r();
            if (interfaceC3163lP.m()) {
                interfaceC3163lP.w(function0A);
            } else {
                interfaceC3163lP.G();
            }
            interfaceC3163lA = v1.a(interfaceC3163lP);
            v1.b(interfaceC3163lA, hG3, aVar3.c());
            v1.b(interfaceC3163lA, interfaceC3184wE3, aVar3.e());
            oVarB = aVar3.b();
            if (interfaceC3163lA.m()) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            } else {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB3.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
            interfaceC3163lP.f(2058660585);
            androidx.compose.foundation.layout.b bVar3 = androidx.compose.foundation.layout.b.f14485a;
            O.a(p101l1.c.d(i8, interfaceC3163lP, (i11 >> 3) & 14), "Page arrow", androidx.compose.foundation.layout.f.l(i.f4836a, A1.h.m(32)), 0L, interfaceC3163lP, 440, 8);
            interfaceC3163lP.N();
            interfaceC3163lP.O();
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new C0826d(iVar3, i8, str, function0, i9, i10));
        }
    }

    public static final void c(int i8, int i9, float f8, int i10, k kVar, InterfaceC3163l interfaceC3163l, int i11) {
        int i12;
        int i13;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(465815235);
        if ((i11 & 14) == 0) {
            i12 = i8;
            i13 = (interfaceC3163lP.i(i12) ? 4 : 2) | i11;
        } else {
            i12 = i8;
            i13 = i11;
        }
        if ((i11 & 112) == 0) {
            i13 |= interfaceC3163lP.i(i9) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i13 |= interfaceC3163lP.h(f8) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i13 |= interfaceC3163lP.i(i10) ? 2048 : 1024;
        }
        if ((i11 & 57344) == 0) {
            i13 |= interfaceC3163lP.l(kVar) ? 16384 : 8192;
        }
        if ((46811 & i13) == 9362 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(465815235, i13, -1, "com.elgato.streamdeck.keypad.PagingElements (KeypadPaging.kt:82)");
            }
            i.a aVar = i.f4836a;
            i iVarB = androidx.compose.foundation.layout.a.b(aVar, f8, false, 2, null);
            String strB = p101l1.f.b(p194w3.b.f37032k, interfaceC3163lP, 0);
            interfaceC3163lP.f(-995030517);
            int i14 = 57344 & i13;
            boolean z8 = i14 == 16384;
            Object objG = interfaceC3163lP.g();
            if (z8 || objG == InterfaceC3163l.f38803a.a()) {
                objG = new e(kVar);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            b(iVarB, i12, strB, (Function0) objG, interfaceC3163lP, (i13 << 3) & 112, 0);
            p191w0.P0.b(String.valueOf(i10), n.a(aVar, f.f37243a), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC3163lP, 0, 0, 131068);
            interfaceC3163lP = interfaceC3163lP;
            String strB2 = p101l1.f.b(p194w3.b.f37029j, interfaceC3163lP, 0);
            interfaceC3163lP.f(-995030208);
            boolean z9 = i14 == 16384;
            Object objG2 = interfaceC3163lP.g();
            if (z9 || objG2 == InterfaceC3163l.f38803a.a()) {
                objG2 = new g(kVar);
                interfaceC3163lP.H(objG2);
            }
            interfaceC3163lP.N();
            b(iVarB, i9, strB2, (Function0) objG2, interfaceC3163lP, i13 & 112, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new h(i8, i9, f8, i10, kVar, i11));
        }
    }
}
