package E1;

import A1.r;
import A1.t;
import C6.G;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p017b7.J;
import p038e1.AbstractC2252x;
import p038e1.InterfaceC2247s;
import p038e1.U;
import p038e1.a0;
import p056g1.InterfaceC2343g;
import p065h1.X;
import p110m1.x;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3173q;
import p215z0.AbstractC3182v;
import p215z0.B0;
import p215z0.F0;
import p215z0.H;
import p215z0.I;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3184w;
import p215z0.K;
import p215z0.P0;
import p215z0.R0;
import p215z0.g1;
import p215z0.q1;
import p215z0.v1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B0 f2050a = AbstractC3182v.d(null, a.f2051a, 1, null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2051a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return LYdqVGvOGMNr.ZLSfxuOOsYtDVyD;
        }
    }

    /* JADX INFO: renamed from: E1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0093b extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ E1.i f2052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f2053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f2054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f2055d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ t f2056e;

        /* JADX INFO: renamed from: E1.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ E1.i f2057a;

            public a(E1.i iVar) {
                this.f2057a = iVar;
            }

            @Override // p215z0.H
            public void d() {
                this.f2057a.e();
                this.f2057a.n();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0093b(E1.i iVar, Function0 function0, o oVar, String str, t tVar) {
            super(1);
            this.f2052a = iVar;
            this.f2053b = function0;
            this.f2054c = oVar;
            this.f2055d = str;
            this.f2056e = tVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H invoke(I i8) {
            this.f2052a.q();
            this.f2052a.s(this.f2053b, this.f2054c, this.f2055d, this.f2056e);
            return new a(this.f2052a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ E1.i f2058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f2059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f2060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f2061d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ t f2062e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(E1.i iVar, Function0 function0, o oVar, String str, t tVar) {
            super(0);
            this.f2058a = iVar;
            this.f2059b = function0;
            this.f2060c = oVar;
            this.f2061d = str;
            this.f2062e = tVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m53invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m53invoke() {
            this.f2058a.s(this.f2059b, this.f2060c, this.f2061d, this.f2062e);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ E1.i f2069a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(E1.i iVar) {
            super(1);
            this.f2069a = iVar;
        }

        public final void b(InterfaceC2247s interfaceC2247s) {
            InterfaceC2247s interfaceC2247sN = interfaceC2247s.N();
            kotlin.jvm.internal.t.d(interfaceC2247sN);
            this.f2069a.u(interfaceC2247sN);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((InterfaceC2247s) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f2073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f2074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f2075c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Q6.o f2076d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f2077e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f2078f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(n nVar, Function0 function0, o oVar, Q6.o oVar2, int i8, int i9) {
            super(2);
            this.f2073a = nVar;
            this.f2074b = function0;
            this.f2075c = oVar;
            this.f2076d = oVar2;
            this.f2077e = i8;
            this.f2078f = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            b.a(this.f2073a, this.f2074b, this.f2075c, this.f2076d, interfaceC3163l, F0.a(this.f2077e | 1), this.f2078f);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f2079a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ E1.i f2080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q1 f2081b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f2082a = new a();

            public a() {
                super(1);
            }

            public final void b(x xVar) {
                p110m1.u.D(xVar);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((x) obj);
                return G.f1419a;
            }
        }

        /* JADX INFO: renamed from: E1.b$j$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0094b extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ E1.i f2083a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0094b(E1.i iVar) {
                super(1);
                this.f2083a = iVar;
            }

            public final void b(long j8) {
                this.f2083a.m55setPopupContentSizefhxjrPA(r.b(j8));
                this.f2083a.v();
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((r) obj).j());
                return G.f1419a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends u implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q1 f2084a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(q1 q1Var) {
                super(2);
                this.f2084a = q1Var;
            }

            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(606497925, i8, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:258)");
                }
                b.b(this.f2084a).invoke(interfaceC3163l, 0);
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
        public j(E1.i iVar, q1 q1Var) {
            super(2);
            this.f2080a = iVar;
            this.f2081b = q1Var;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1302892335, i8, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:247)");
            }
            L0.i iVarA = O0.a.a(U.a(p110m1.n.d(L0.i.f4836a, false, a.f2082a, 1, null), new C0094b(this.f2080a)), this.f2080a.getCanCalculatePosition() ? 1.0f : 0.0f);
            H0.a aVarB = H0.c.b(interfaceC3163l, 606497925, true, new c(this.f2081b));
            interfaceC3163l.f(1406149896);
            E1.c cVar = E1.c.f2085a;
            interfaceC3163l.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163l, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
            InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar.a();
            Q6.p pVarB = AbstractC2252x.b(iVarA);
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
            v1.b(interfaceC3163lA, cVar, aVar.c());
            v1.b(interfaceC3163lA, interfaceC3184wE, aVar.e());
            Q6.o oVarB = aVar.b();
            if (interfaceC3163lA.m() || !kotlin.jvm.internal.t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
            interfaceC3163l.f(2058660585);
            aVarB.invoke(interfaceC3163l, 6);
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

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x0068  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x0118  */
    /* JADX WARN: Code duplicated, block: B:64:0x0143  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x0216  */
    /* JADX WARN: Code duplicated, block: B:83:0x0223  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void a(n nVar, Function0 function0, o oVar, Q6.o oVar2, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        Function0 function1;
        int i11;
        o oVar3;
        int i12;
        int i13;
        int i14;
        Function0 function2;
        o oVar4;
        View view;
        A1.d dVar;
        String str;
        AbstractC3173q abstractC3173qD;
        q1 q1VarP;
        UUID uuid;
        Object objG;
        InterfaceC3163l interfaceC3163l2;
        int iA;
        Function0 function0A;
        InterfaceC3163l interfaceC3163lA;
        Q6.o oVarB;
        Function0 function3;
        o oVar5;
        P0 p0V;
        n nVar2 = nVar;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-830247068);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.R(nVar2) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        int i15 = i9 & 2;
        if (i15 == 0) {
            if ((i8 & 112) == 0) {
                function1 = function0;
                i10 |= interfaceC3163lP.l(function1) ? 32 : 16;
            }
            i11 = i9 & 4;
            if (i11 != 0) {
                if ((i8 & 896) == 0) {
                    oVar3 = oVar;
                    if (interfaceC3163lP.R(oVar3)) {
                        i12 = 256;
                    } else {
                        i12 = 128;
                    }
                    i10 |= i12;
                }
                if ((i9 & 8) != 0) {
                    i10 |= 3072;
                } else if ((i8 & 7168) == 0) {
                    if (interfaceC3163lP.l(oVar2)) {
                        i13 = 2048;
                    } else {
                        i13 = 1024;
                    }
                    i10 |= i13;
                }
                i14 = i10;
                if ((i14 & 5851) == 1170 || !interfaceC3163lP.s()) {
                    if (i15 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if (i11 != 0) {
                        oVar4 = new o(false, false, false, null, false, false, 63, null);
                    } else {
                        oVar4 = oVar3;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-830247068, i14, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:228)");
                    }
                    view = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
                    dVar = (A1.d) interfaceC3163lP.e(X.d());
                    str = (String) interfaceC3163lP.e(f2050a);
                    t tVar = (t) interfaceC3163lP.e(X.i());
                    abstractC3173qD = AbstractC3157i.d(interfaceC3163lP, 0);
                    q1VarP = g1.p(oVar2, interfaceC3163lP, (i14 >> 9) & 14);
                    uuid = (UUID) I0.b.b(new Object[0], null, null, i.f2079a, interfaceC3163lP, 3080, 6);
                    interfaceC3163lP.f(-492369756);
                    objG = interfaceC3163lP.g();
                    if (objG == InterfaceC3163l.f38803a.a()) {
                        interfaceC3163l2 = interfaceC3163lP;
                        E1.i iVar = new E1.i(function2, oVar4, str, view, dVar, nVar2, uuid, null, 128, null);
                        nVar2 = nVar2;
                        iVar.p(abstractC3173qD, H0.c.c(1302892335, true, new j(iVar, q1VarP)));
                        interfaceC3163l2.H(iVar);
                        objG = iVar;
                    } else {
                        interfaceC3163l2 = interfaceC3163lP;
                    }
                    interfaceC3163l2.N();
                    E1.i iVar2 = (E1.i) objG;
                    K.a(iVar2, new C0093b(iVar2, function2, oVar4, str, tVar), interfaceC3163l2, 8);
                    K.g(new c(iVar2, function2, oVar4, str, tVar), interfaceC3163l2, 0);
                    K.a(nVar2, new d(iVar2, nVar2), interfaceC3163l2, i14 & 14);
                    K.d(iVar2, new e(iVar2, null), interfaceC3163l2, 72);
                    L0.i iVarA = androidx.compose.ui.layout.c.a(L0.i.f4836a, new f(iVar2));
                    g gVar = new g(iVar2, tVar);
                    interfaceC3163l2.f(-1323940314);
                    iA = AbstractC3157i.a(interfaceC3163l2, 0);
                    InterfaceC3184w interfaceC3184wE = interfaceC3163l2.E();
                    InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
                    function0A = aVar.a();
                    Q6.p pVarB = AbstractC2252x.b(iVarA);
                    if (interfaceC3163l2.t() == null) {
                        AbstractC3157i.c();
                    }
                    interfaceC3163l2.r();
                    if (interfaceC3163l2.m()) {
                        interfaceC3163l2.w(function0A);
                    } else {
                        interfaceC3163l2.G();
                    }
                    interfaceC3163lA = v1.a(interfaceC3163l2);
                    v1.b(interfaceC3163lA, gVar, aVar.c());
                    v1.b(interfaceC3163lA, interfaceC3184wE, aVar.e());
                    oVarB = aVar.b();
                    if (interfaceC3163lA.m() || !kotlin.jvm.internal.t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                        interfaceC3163lA.H(Integer.valueOf(iA));
                        interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                    }
                    pVarB.invoke(R0.a(R0.b(interfaceC3163l2)), interfaceC3163l2, 0);
                    interfaceC3163l2.f(2058660585);
                    interfaceC3163l2.N();
                    interfaceC3163l2.O();
                    interfaceC3163l2.N();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    function3 = function2;
                    oVar5 = oVar4;
                } else {
                    interfaceC3163lP.z();
                    function3 = function1;
                    interfaceC3163l2 = interfaceC3163lP;
                    oVar5 = oVar3;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new h(nVar2, function3, oVar5, oVar2, i8, i9));
                }
            }
            i10 |= 384;
            oVar3 = oVar;
            if ((i9 & 8) != 0) {
                i10 |= 3072;
            } else if ((i8 & 7168) == 0) {
                if (interfaceC3163lP.l(oVar2)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i10 |= i13;
            }
            i14 = i10;
            if ((i14 & 5851) == 1170) {
                if (i15 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (i11 != 0) {
                    oVar4 = new o(false, false, false, null, false, false, 63, null);
                } else {
                    oVar4 = oVar3;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-830247068, i14, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:228)");
                }
                view = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
                dVar = (A1.d) interfaceC3163lP.e(X.d());
                str = (String) interfaceC3163lP.e(f2050a);
                t tVar2 = (t) interfaceC3163lP.e(X.i());
                abstractC3173qD = AbstractC3157i.d(interfaceC3163lP, 0);
                q1VarP = g1.p(oVar2, interfaceC3163lP, (i14 >> 9) & 14);
                uuid = (UUID) I0.b.b(new Object[0], null, null, i.f2079a, interfaceC3163lP, 3080, 6);
                interfaceC3163lP.f(-492369756);
                objG = interfaceC3163lP.g();
                if (objG == InterfaceC3163l.f38803a.a()) {
                    interfaceC3163l2 = interfaceC3163lP;
                    E1.i iVar3 = new E1.i(function2, oVar4, str, view, dVar, nVar2, uuid, null, 128, null);
                    nVar2 = nVar2;
                    iVar3.p(abstractC3173qD, H0.c.c(1302892335, true, new j(iVar3, q1VarP)));
                    interfaceC3163l2.H(iVar3);
                    objG = iVar3;
                } else {
                    interfaceC3163l2 = interfaceC3163lP;
                }
                interfaceC3163l2.N();
                E1.i iVar4 = (E1.i) objG;
                K.a(iVar4, new C0093b(iVar4, function2, oVar4, str, tVar2), interfaceC3163l2, 8);
                K.g(new c(iVar4, function2, oVar4, str, tVar2), interfaceC3163l2, 0);
                K.a(nVar2, new d(iVar4, nVar2), interfaceC3163l2, i14 & 14);
                K.d(iVar4, new e(iVar4, null), interfaceC3163l2, 72);
                L0.i iVarA2 = androidx.compose.ui.layout.c.a(L0.i.f4836a, new f(iVar4));
                g gVar2 = new g(iVar4, tVar2);
                interfaceC3163l2.f(-1323940314);
                iA = AbstractC3157i.a(interfaceC3163l2, 0);
                InterfaceC3184w interfaceC3184wE2 = interfaceC3163l2.E();
                InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
                function0A = aVar2.a();
                Q6.p pVarB2 = AbstractC2252x.b(iVarA2);
                if (interfaceC3163l2.t() == null) {
                    AbstractC3157i.c();
                }
                interfaceC3163l2.r();
                if (interfaceC3163l2.m()) {
                    interfaceC3163l2.w(function0A);
                } else {
                    interfaceC3163l2.G();
                }
                interfaceC3163lA = v1.a(interfaceC3163l2);
                v1.b(interfaceC3163lA, gVar2, aVar2.c());
                v1.b(interfaceC3163lA, interfaceC3184wE2, aVar2.e());
                oVarB = aVar2.b();
                if (interfaceC3163lA.m()) {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                } else {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                }
                pVarB2.invoke(R0.a(R0.b(interfaceC3163l2)), interfaceC3163l2, 0);
                interfaceC3163l2.f(2058660585);
                interfaceC3163l2.N();
                interfaceC3163l2.O();
                interfaceC3163l2.N();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                function3 = function2;
                oVar5 = oVar4;
            } else {
                if (i15 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (i11 != 0) {
                    oVar4 = new o(false, false, false, null, false, false, 63, null);
                } else {
                    oVar4 = oVar3;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-830247068, i14, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:228)");
                }
                view = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
                dVar = (A1.d) interfaceC3163lP.e(X.d());
                str = (String) interfaceC3163lP.e(f2050a);
                t tVar3 = (t) interfaceC3163lP.e(X.i());
                abstractC3173qD = AbstractC3157i.d(interfaceC3163lP, 0);
                q1VarP = g1.p(oVar2, interfaceC3163lP, (i14 >> 9) & 14);
                uuid = (UUID) I0.b.b(new Object[0], null, null, i.f2079a, interfaceC3163lP, 3080, 6);
                interfaceC3163lP.f(-492369756);
                objG = interfaceC3163lP.g();
                if (objG == InterfaceC3163l.f38803a.a()) {
                    interfaceC3163l2 = interfaceC3163lP;
                    E1.i iVar5 = new E1.i(function2, oVar4, str, view, dVar, nVar2, uuid, null, 128, null);
                    nVar2 = nVar2;
                    iVar5.p(abstractC3173qD, H0.c.c(1302892335, true, new j(iVar5, q1VarP)));
                    interfaceC3163l2.H(iVar5);
                    objG = iVar5;
                } else {
                    interfaceC3163l2 = interfaceC3163lP;
                }
                interfaceC3163l2.N();
                E1.i iVar6 = (E1.i) objG;
                K.a(iVar6, new C0093b(iVar6, function2, oVar4, str, tVar3), interfaceC3163l2, 8);
                K.g(new c(iVar6, function2, oVar4, str, tVar3), interfaceC3163l2, 0);
                K.a(nVar2, new d(iVar6, nVar2), interfaceC3163l2, i14 & 14);
                K.d(iVar6, new e(iVar6, null), interfaceC3163l2, 72);
                L0.i iVarA3 = androidx.compose.ui.layout.c.a(L0.i.f4836a, new f(iVar6));
                g gVar3 = new g(iVar6, tVar3);
                interfaceC3163l2.f(-1323940314);
                iA = AbstractC3157i.a(interfaceC3163l2, 0);
                InterfaceC3184w interfaceC3184wE3 = interfaceC3163l2.E();
                InterfaceC2343g.a aVar3 = InterfaceC2343g.f23596Q;
                function0A = aVar3.a();
                Q6.p pVarB3 = AbstractC2252x.b(iVarA3);
                if (interfaceC3163l2.t() == null) {
                    AbstractC3157i.c();
                }
                interfaceC3163l2.r();
                if (interfaceC3163l2.m()) {
                    interfaceC3163l2.w(function0A);
                } else {
                    interfaceC3163l2.G();
                }
                interfaceC3163lA = v1.a(interfaceC3163l2);
                v1.b(interfaceC3163lA, gVar3, aVar3.c());
                v1.b(interfaceC3163lA, interfaceC3184wE3, aVar3.e());
                oVarB = aVar3.b();
                if (interfaceC3163lA.m()) {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                } else {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                }
                pVarB3.invoke(R0.a(R0.b(interfaceC3163l2)), interfaceC3163l2, 0);
                interfaceC3163l2.f(2058660585);
                interfaceC3163l2.N();
                interfaceC3163l2.O();
                interfaceC3163l2.N();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                function3 = function2;
                oVar5 = oVar4;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new h(nVar2, function3, oVar5, oVar2, i8, i9));
            }
        }
        i10 |= 48;
        function1 = function0;
        i11 = i9 & 4;
        if (i11 != 0) {
            if ((i8 & 896) == 0) {
                oVar3 = oVar;
                if (interfaceC3163lP.R(oVar3)) {
                    i12 = 256;
                } else {
                    i12 = 128;
                }
                i10 |= i12;
            }
            if ((i9 & 8) != 0) {
                i10 |= 3072;
            } else if ((i8 & 7168) == 0) {
                if (interfaceC3163lP.l(oVar2)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i10 |= i13;
            }
            i14 = i10;
            if ((i14 & 5851) == 1170) {
                if (i15 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (i11 != 0) {
                    oVar4 = new o(false, false, false, null, false, false, 63, null);
                } else {
                    oVar4 = oVar3;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-830247068, i14, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:228)");
                }
                view = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
                dVar = (A1.d) interfaceC3163lP.e(X.d());
                str = (String) interfaceC3163lP.e(f2050a);
                t tVar4 = (t) interfaceC3163lP.e(X.i());
                abstractC3173qD = AbstractC3157i.d(interfaceC3163lP, 0);
                q1VarP = g1.p(oVar2, interfaceC3163lP, (i14 >> 9) & 14);
                uuid = (UUID) I0.b.b(new Object[0], null, null, i.f2079a, interfaceC3163lP, 3080, 6);
                interfaceC3163lP.f(-492369756);
                objG = interfaceC3163lP.g();
                if (objG == InterfaceC3163l.f38803a.a()) {
                    interfaceC3163l2 = interfaceC3163lP;
                    E1.i iVar7 = new E1.i(function2, oVar4, str, view, dVar, nVar2, uuid, null, 128, null);
                    nVar2 = nVar2;
                    iVar7.p(abstractC3173qD, H0.c.c(1302892335, true, new j(iVar7, q1VarP)));
                    interfaceC3163l2.H(iVar7);
                    objG = iVar7;
                } else {
                    interfaceC3163l2 = interfaceC3163lP;
                }
                interfaceC3163l2.N();
                E1.i iVar8 = (E1.i) objG;
                K.a(iVar8, new C0093b(iVar8, function2, oVar4, str, tVar4), interfaceC3163l2, 8);
                K.g(new c(iVar8, function2, oVar4, str, tVar4), interfaceC3163l2, 0);
                K.a(nVar2, new d(iVar8, nVar2), interfaceC3163l2, i14 & 14);
                K.d(iVar8, new e(iVar8, null), interfaceC3163l2, 72);
                L0.i iVarA4 = androidx.compose.ui.layout.c.a(L0.i.f4836a, new f(iVar8));
                g gVar4 = new g(iVar8, tVar4);
                interfaceC3163l2.f(-1323940314);
                iA = AbstractC3157i.a(interfaceC3163l2, 0);
                InterfaceC3184w interfaceC3184wE4 = interfaceC3163l2.E();
                InterfaceC2343g.a aVar4 = InterfaceC2343g.f23596Q;
                function0A = aVar4.a();
                Q6.p pVarB4 = AbstractC2252x.b(iVarA4);
                if (interfaceC3163l2.t() == null) {
                    AbstractC3157i.c();
                }
                interfaceC3163l2.r();
                if (interfaceC3163l2.m()) {
                    interfaceC3163l2.w(function0A);
                } else {
                    interfaceC3163l2.G();
                }
                interfaceC3163lA = v1.a(interfaceC3163l2);
                v1.b(interfaceC3163lA, gVar4, aVar4.c());
                v1.b(interfaceC3163lA, interfaceC3184wE4, aVar4.e());
                oVarB = aVar4.b();
                if (interfaceC3163lA.m()) {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                } else {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                }
                pVarB4.invoke(R0.a(R0.b(interfaceC3163l2)), interfaceC3163l2, 0);
                interfaceC3163l2.f(2058660585);
                interfaceC3163l2.N();
                interfaceC3163l2.O();
                interfaceC3163l2.N();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                function3 = function2;
                oVar5 = oVar4;
            } else {
                if (i15 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (i11 != 0) {
                    oVar4 = new o(false, false, false, null, false, false, 63, null);
                } else {
                    oVar4 = oVar3;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-830247068, i14, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:228)");
                }
                view = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
                dVar = (A1.d) interfaceC3163lP.e(X.d());
                str = (String) interfaceC3163lP.e(f2050a);
                t tVar5 = (t) interfaceC3163lP.e(X.i());
                abstractC3173qD = AbstractC3157i.d(interfaceC3163lP, 0);
                q1VarP = g1.p(oVar2, interfaceC3163lP, (i14 >> 9) & 14);
                uuid = (UUID) I0.b.b(new Object[0], null, null, i.f2079a, interfaceC3163lP, 3080, 6);
                interfaceC3163lP.f(-492369756);
                objG = interfaceC3163lP.g();
                if (objG == InterfaceC3163l.f38803a.a()) {
                    interfaceC3163l2 = interfaceC3163lP;
                    E1.i iVar9 = new E1.i(function2, oVar4, str, view, dVar, nVar2, uuid, null, 128, null);
                    nVar2 = nVar2;
                    iVar9.p(abstractC3173qD, H0.c.c(1302892335, true, new j(iVar9, q1VarP)));
                    interfaceC3163l2.H(iVar9);
                    objG = iVar9;
                } else {
                    interfaceC3163l2 = interfaceC3163lP;
                }
                interfaceC3163l2.N();
                E1.i iVar10 = (E1.i) objG;
                K.a(iVar10, new C0093b(iVar10, function2, oVar4, str, tVar5), interfaceC3163l2, 8);
                K.g(new c(iVar10, function2, oVar4, str, tVar5), interfaceC3163l2, 0);
                K.a(nVar2, new d(iVar10, nVar2), interfaceC3163l2, i14 & 14);
                K.d(iVar10, new e(iVar10, null), interfaceC3163l2, 72);
                L0.i iVarA5 = androidx.compose.ui.layout.c.a(L0.i.f4836a, new f(iVar10));
                g gVar5 = new g(iVar10, tVar5);
                interfaceC3163l2.f(-1323940314);
                iA = AbstractC3157i.a(interfaceC3163l2, 0);
                InterfaceC3184w interfaceC3184wE5 = interfaceC3163l2.E();
                InterfaceC2343g.a aVar5 = InterfaceC2343g.f23596Q;
                function0A = aVar5.a();
                Q6.p pVarB5 = AbstractC2252x.b(iVarA5);
                if (interfaceC3163l2.t() == null) {
                    AbstractC3157i.c();
                }
                interfaceC3163l2.r();
                if (interfaceC3163l2.m()) {
                    interfaceC3163l2.w(function0A);
                } else {
                    interfaceC3163l2.G();
                }
                interfaceC3163lA = v1.a(interfaceC3163l2);
                v1.b(interfaceC3163lA, gVar5, aVar5.c());
                v1.b(interfaceC3163lA, interfaceC3184wE5, aVar5.e());
                oVarB = aVar5.b();
                if (interfaceC3163lA.m()) {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                } else {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                }
                pVarB5.invoke(R0.a(R0.b(interfaceC3163l2)), interfaceC3163l2, 0);
                interfaceC3163l2.f(2058660585);
                interfaceC3163l2.N();
                interfaceC3163l2.O();
                interfaceC3163l2.N();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                function3 = function2;
                oVar5 = oVar4;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new h(nVar2, function3, oVar5, oVar2, i8, i9));
            }
        }
        i10 |= 384;
        oVar3 = oVar;
        if ((i9 & 8) != 0) {
            i10 |= 3072;
        } else if ((i8 & 7168) == 0) {
            if (interfaceC3163lP.l(oVar2)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i10 |= i13;
        }
        i14 = i10;
        if ((i14 & 5851) == 1170) {
            if (i15 != 0) {
                function2 = null;
            } else {
                function2 = function1;
            }
            if (i11 != 0) {
                oVar4 = new o(false, false, false, null, false, false, 63, null);
            } else {
                oVar4 = oVar3;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-830247068, i14, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:228)");
            }
            view = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
            dVar = (A1.d) interfaceC3163lP.e(X.d());
            str = (String) interfaceC3163lP.e(f2050a);
            t tVar6 = (t) interfaceC3163lP.e(X.i());
            abstractC3173qD = AbstractC3157i.d(interfaceC3163lP, 0);
            q1VarP = g1.p(oVar2, interfaceC3163lP, (i14 >> 9) & 14);
            uuid = (UUID) I0.b.b(new Object[0], null, null, i.f2079a, interfaceC3163lP, 3080, 6);
            interfaceC3163lP.f(-492369756);
            objG = interfaceC3163lP.g();
            if (objG == InterfaceC3163l.f38803a.a()) {
                interfaceC3163l2 = interfaceC3163lP;
                E1.i iVar11 = new E1.i(function2, oVar4, str, view, dVar, nVar2, uuid, null, 128, null);
                nVar2 = nVar2;
                iVar11.p(abstractC3173qD, H0.c.c(1302892335, true, new j(iVar11, q1VarP)));
                interfaceC3163l2.H(iVar11);
                objG = iVar11;
            } else {
                interfaceC3163l2 = interfaceC3163lP;
            }
            interfaceC3163l2.N();
            E1.i iVar12 = (E1.i) objG;
            K.a(iVar12, new C0093b(iVar12, function2, oVar4, str, tVar6), interfaceC3163l2, 8);
            K.g(new c(iVar12, function2, oVar4, str, tVar6), interfaceC3163l2, 0);
            K.a(nVar2, new d(iVar12, nVar2), interfaceC3163l2, i14 & 14);
            K.d(iVar12, new e(iVar12, null), interfaceC3163l2, 72);
            L0.i iVarA6 = androidx.compose.ui.layout.c.a(L0.i.f4836a, new f(iVar12));
            g gVar6 = new g(iVar12, tVar6);
            interfaceC3163l2.f(-1323940314);
            iA = AbstractC3157i.a(interfaceC3163l2, 0);
            InterfaceC3184w interfaceC3184wE6 = interfaceC3163l2.E();
            InterfaceC2343g.a aVar6 = InterfaceC2343g.f23596Q;
            function0A = aVar6.a();
            Q6.p pVarB6 = AbstractC2252x.b(iVarA6);
            if (interfaceC3163l2.t() == null) {
                AbstractC3157i.c();
            }
            interfaceC3163l2.r();
            if (interfaceC3163l2.m()) {
                interfaceC3163l2.w(function0A);
            } else {
                interfaceC3163l2.G();
            }
            interfaceC3163lA = v1.a(interfaceC3163l2);
            v1.b(interfaceC3163lA, gVar6, aVar6.c());
            v1.b(interfaceC3163lA, interfaceC3184wE6, aVar6.e());
            oVarB = aVar6.b();
            if (interfaceC3163lA.m()) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            } else {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB6.invoke(R0.a(R0.b(interfaceC3163l2)), interfaceC3163l2, 0);
            interfaceC3163l2.f(2058660585);
            interfaceC3163l2.N();
            interfaceC3163l2.O();
            interfaceC3163l2.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            function3 = function2;
            oVar5 = oVar4;
        } else {
            if (i15 != 0) {
                function2 = null;
            } else {
                function2 = function1;
            }
            if (i11 != 0) {
                oVar4 = new o(false, false, false, null, false, false, 63, null);
            } else {
                oVar4 = oVar3;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-830247068, i14, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:228)");
            }
            view = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
            dVar = (A1.d) interfaceC3163lP.e(X.d());
            str = (String) interfaceC3163lP.e(f2050a);
            t tVar7 = (t) interfaceC3163lP.e(X.i());
            abstractC3173qD = AbstractC3157i.d(interfaceC3163lP, 0);
            q1VarP = g1.p(oVar2, interfaceC3163lP, (i14 >> 9) & 14);
            uuid = (UUID) I0.b.b(new Object[0], null, null, i.f2079a, interfaceC3163lP, 3080, 6);
            interfaceC3163lP.f(-492369756);
            objG = interfaceC3163lP.g();
            if (objG == InterfaceC3163l.f38803a.a()) {
                interfaceC3163l2 = interfaceC3163lP;
                E1.i iVar13 = new E1.i(function2, oVar4, str, view, dVar, nVar2, uuid, null, 128, null);
                nVar2 = nVar2;
                iVar13.p(abstractC3173qD, H0.c.c(1302892335, true, new j(iVar13, q1VarP)));
                interfaceC3163l2.H(iVar13);
                objG = iVar13;
            } else {
                interfaceC3163l2 = interfaceC3163lP;
            }
            interfaceC3163l2.N();
            E1.i iVar14 = (E1.i) objG;
            K.a(iVar14, new C0093b(iVar14, function2, oVar4, str, tVar7), interfaceC3163l2, 8);
            K.g(new c(iVar14, function2, oVar4, str, tVar7), interfaceC3163l2, 0);
            K.a(nVar2, new d(iVar14, nVar2), interfaceC3163l2, i14 & 14);
            K.d(iVar14, new e(iVar14, null), interfaceC3163l2, 72);
            L0.i iVarA7 = androidx.compose.ui.layout.c.a(L0.i.f4836a, new f(iVar14));
            g gVar7 = new g(iVar14, tVar7);
            interfaceC3163l2.f(-1323940314);
            iA = AbstractC3157i.a(interfaceC3163l2, 0);
            InterfaceC3184w interfaceC3184wE7 = interfaceC3163l2.E();
            InterfaceC2343g.a aVar7 = InterfaceC2343g.f23596Q;
            function0A = aVar7.a();
            Q6.p pVarB7 = AbstractC2252x.b(iVarA7);
            if (interfaceC3163l2.t() == null) {
                AbstractC3157i.c();
            }
            interfaceC3163l2.r();
            if (interfaceC3163l2.m()) {
                interfaceC3163l2.w(function0A);
            } else {
                interfaceC3163l2.G();
            }
            interfaceC3163lA = v1.a(interfaceC3163l2);
            v1.b(interfaceC3163lA, gVar7, aVar7.c());
            v1.b(interfaceC3163lA, interfaceC3184wE7, aVar7.e());
            oVarB = aVar7.b();
            if (interfaceC3163lA.m()) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            } else {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB7.invoke(R0.a(R0.b(interfaceC3163l2)), interfaceC3163l2, 0);
            interfaceC3163l2.f(2058660585);
            interfaceC3163l2.N();
            interfaceC3163l2.O();
            interfaceC3163l2.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            function3 = function2;
            oVar5 = oVar4;
        }
        p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new h(nVar2, function3, oVar5, oVar2, i8, i9));
        }
    }

    public static final Q6.o b(q1 q1Var) {
        return (Q6.o) q1Var.getValue();
    }

    public static final boolean e(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    public static final A1.p f(Rect rect) {
        return new A1.p(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ E1.i f2063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f2064b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(E1.i iVar, n nVar) {
            super(1);
            this.f2063a = iVar;
            this.f2064b = nVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H invoke(I i8) {
            this.f2063a.setPositionProvider(this.f2064b);
            this.f2063a.v();
            return new a();
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements H {
            @Override // p215z0.H
            public void d() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f2066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ E1.i f2067c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(E1.i iVar, G6.d dVar) {
            super(2, dVar);
            this.f2067c = iVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            e eVar = new e(this.f2067c, dVar);
            eVar.f2066b = obj;
            return eVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((e) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0029  */
        /* JADX WARN: Code duplicated, block: B:13:0x0035 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:14:0x0036). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // I6.a
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = H6.c.f()
                int r1 = r3.f2065a
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r3.f2066b
                b7.J r1 = (p017b7.J) r1
                C6.r.b(r4)
                goto L36
            L13:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L1b:
                C6.r.b(r4)
                java.lang.Object r4 = r3.f2066b
                b7.J r4 = (p017b7.J) r4
                r1 = r4
            L23:
                boolean r4 = p017b7.K.h(r1)
                if (r4 == 0) goto L3c
                E1.b$e$a r4 = E1.b.e.a.f2068a
                r3.f2066b = r1
                r3.f2065a = r2
                java.lang.Object r4 = p065h1.AbstractC2395i0.a(r4, r3)
                if (r4 != r0) goto L36
                return r0
            L36:
                E1.i r4 = r3.f2067c
                r4.o()
                goto L23
            L3c:
                C6.G r4 = C6.G.f1419a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: E1.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f2068a = new a();

            public a() {
                super(1);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((Number) obj).longValue());
                return G.f1419a;
            }

            public final void b(long j8) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g implements p038e1.H {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ E1.i f2070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t f2071b;

        public g(E1.i iVar, t tVar) {
            this.f2070a = iVar;
            this.f2071b = tVar;
        }

        @Override // p038e1.H
        public final p038e1.I d(p038e1.J j8, List list, long j9) {
            this.f2070a.setParentLayoutDirection(this.f2071b);
            return p038e1.J.X0(j8, 0, 0, null, a.f2072a, 4, null);
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f2072a = new a();

            public a() {
                super(1);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((a0.a) obj);
                return G.f1419a;
            }

            public final void b(a0.a aVar) {
            }
        }
    }
}
