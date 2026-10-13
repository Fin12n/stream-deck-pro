package A3;

import C6.G;
import com.elgato.streamdeck.DiKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p082j0.InterfaceC2608l;
import p191w0.AbstractC3069k0;
import p191w0.B0;
import p191w0.Z;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a extends C2639q implements Function0 {
        public a(Object obj) {
            super(0, obj, p.class, "hidePaywall", "hidePaywall()V", 0);
        }

        public final void h() {
            ((p) this.receiver).i();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            h();
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f688a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l lVar) {
            super(2);
            this.f688a = lVar;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1518492487, i8, -1, "com.elgato.streamdeck.purchase.PurchaseSheet.<anonymous> (PurchaseSheet.kt:31)");
            }
            this.f688a.m(interfaceC3163l, 6);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws A5.f {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f689a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i8) {
            super(2);
            this.f689a = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            o.a(interfaceC3163l, F0.a(this.f689a | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f690a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m12invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m12invoke() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Q6.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.o f691a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Q6.o oVar) {
            super(3);
            this.f691a = oVar;
        }

        public final void b(InterfaceC2608l BottomSheet, InterfaceC3163l interfaceC3163l, int i8) {
            t.g(BottomSheet, "$this$BottomSheet");
            if ((i8 & 81) == 16 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1003396031, i8, -1, "com.elgato.streamdeck.purchase.PurchaseSheet.<anonymous> (PurchaseSheet.kt:51)");
            }
            this.f691a.invoke(interfaceC3163l, 0);
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
    public static final class f extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ B0 f694c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Q6.o f695d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f697f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z8, Function0 function0, B0 b8, Q6.o oVar, int i8, int i9) {
            super(2);
            this.f692a = z8;
            this.f693b = function0;
            this.f694c = b8;
            this.f695d = oVar;
            this.f696e = i8;
            this.f697f = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            o.b(this.f692a, this.f693b, this.f694c, this.f695d, interfaceC3163l, F0.a(this.f696e | 1), this.f697f);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-142080233);
        if (i8 == 0 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-142080233, i8, -1, "com.elgato.streamdeck.purchase.PurchaseSheet (PurchaseSheet.kt:23)");
            }
            interfaceC3163lP.f(1853070191);
            A5.a aVar = new A5.a(p.class, false, null, null);
            A5.h hVar = (A5.h) interfaceC3163lP.e(DiKt.d());
            interfaceC3163lP.f(1468160259);
            Object objG = interfaceC3163lP.g();
            InterfaceC3163l.a aVar2 = InterfaceC3163l.f38803a;
            if (objG == aVar2.a()) {
                objG = hVar.h(aVar, null);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            p pVar = (p) objG;
            interfaceC3163lP.f(-655807997);
            Object objG2 = interfaceC3163lP.g();
            if (objG2 == aVar2.a()) {
                objG2 = new l(null, 1, null);
                interfaceC3163lP.H(objG2);
            }
            l lVar = (l) objG2;
            interfaceC3163lP.N();
            boolean zBooleanValue = ((Boolean) pVar.j().getValue()).booleanValue();
            interfaceC3163lP.f(-655807870);
            boolean zR = interfaceC3163lP.R(pVar);
            Object objG3 = interfaceC3163lP.g();
            if (zR || objG3 == aVar2.a()) {
                objG3 = new a(pVar);
                interfaceC3163lP.H(objG3);
            }
            interfaceC3163lP.N();
            b(zBooleanValue, (Function0) ((X6.h) objG3), null, H0.c.b(interfaceC3163lP, 1518492487, true, new b(lVar)), interfaceC3163lP, 3072, 4);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new c(i8));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad A[PHI: r6 r7 r9
      0x00ad: PHI (r6v8 boolean) = (r6v4 boolean), (r6v3 boolean), (r6v3 boolean) binds: [B:65:0x00bb, B:57:0x00a9, B:58:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x00ad: PHI (r7v17 int) = (r7v11 int), (r7v11 int), (r7v18 int) binds: [B:65:0x00bb, B:57:0x00a9, B:58:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x00ad: PHI (r9v7 kotlin.jvm.functions.Function0) = (r9v3 kotlin.jvm.functions.Function0), (r9v2 kotlin.jvm.functions.Function0), (r9v2 kotlin.jvm.functions.Function0) binds: [B:65:0x00bb, B:57:0x00a9, B:58:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:72:0x0121  */
    /* JADX WARN: Code duplicated, block: B:75:0x0129  */
    /* JADX WARN: Code duplicated, block: B:79:0x0135  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public static final void b(boolean z8, Function0 function0, B0 b8, Q6.o content, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        boolean z9;
        int i10;
        Function0 function1;
        B0 b9;
        int i11;
        B0 b0N;
        boolean z10;
        Function0 function2;
        InterfaceC3163l interfaceC3163l2;
        boolean z11;
        Function0 function3;
        B0 b10;
        P0 p0V;
        t.g(content, "content");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-873470131);
        int i12 = i9 & 1;
        if (i12 != 0) {
            i10 = i8 | 6;
            z9 = z8;
        } else if ((i8 & 14) == 0) {
            z9 = z8;
            i10 = (interfaceC3163lP.c(z9) ? 4 : 2) | i8;
        } else {
            z9 = z8;
            i10 = i8;
        }
        int i13 = i9 & 2;
        if (i13 == 0) {
            if ((i8 & 112) == 0) {
                function1 = function0;
                i10 |= interfaceC3163lP.l(function1) ? 32 : 16;
            }
            if ((i8 & 896) == 0) {
                if ((i9 & 4) == 0) {
                    b9 = b8;
                    int i14 = interfaceC3163lP.R(b9) ? 256 : 128;
                    i10 |= i14;
                } else {
                    b9 = b8;
                }
                i10 |= i14;
            } else {
                b9 = b8;
            }
            if ((i9 & 8) != 0) {
                i10 |= 3072;
            } else if ((i8 & 7168) == 0) {
                if (interfaceC3163lP.l(content)) {
                    i11 = 2048;
                } else {
                    i11 = 1024;
                }
                i10 |= i11;
            }
            if ((i10 & 5851) == 1170 || !interfaceC3163lP.s()) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0 || interfaceC3163lP.F()) {
                    if (i12 != 0) {
                        z9 = true;
                    }
                    if (i13 != 0) {
                        function1 = d.f690a;
                    }
                    if ((i9 & 4) != 0) {
                        i10 &= -897;
                        Function0 function4 = function1;
                        b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, 6, 2);
                        z10 = z9;
                        function2 = function4;
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-873470131, i10, -1, "com.elgato.streamdeck.purchase.PurchaseSheet (PurchaseSheet.kt:42)");
                    }
                    if (z10) {
                        L0.i iVarC = androidx.compose.foundation.layout.f.c(L0.i.f4836a, 0.9f);
                        Z z12 = Z.f35786a;
                        int i15 = Z.f35787b;
                        interfaceC3163l2 = interfaceC3163lP;
                        J3.a.a(function2, iVarC, null, b0N, null, J3.m.c(z12.a(interfaceC3163lP, i15), interfaceC3163lP, 0), z12.a(interfaceC3163lP, i15).o(), null, H0.c.b(interfaceC3163lP, -1003396031, true, new e(content)), interfaceC3163l2, ((i10 >> 3) & 14) | 100663344 | ((i10 << 3) & 7168), 148);
                    } else {
                        interfaceC3163l2 = interfaceC3163lP;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    z11 = z10;
                    function3 = function2;
                    b10 = b0N;
                } else {
                    interfaceC3163lP.z();
                    if ((i9 & 4) != 0) {
                        i10 &= -897;
                    }
                }
                z10 = z9;
                function2 = function1;
                b0N = b9;
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-873470131, i10, -1, "com.elgato.streamdeck.purchase.PurchaseSheet (PurchaseSheet.kt:42)");
                }
                if (z10) {
                    L0.i iVarC2 = androidx.compose.foundation.layout.f.c(L0.i.f4836a, 0.9f);
                    Z z13 = Z.f35786a;
                    int i16 = Z.f35787b;
                    interfaceC3163l2 = interfaceC3163lP;
                    J3.a.a(function2, iVarC2, null, b0N, null, J3.m.c(z13.a(interfaceC3163lP, i16), interfaceC3163lP, 0), z13.a(interfaceC3163lP, i16).o(), null, H0.c.b(interfaceC3163lP, -1003396031, true, new e(content)), interfaceC3163l2, ((i10 >> 3) & 14) | 100663344 | ((i10 << 3) & 7168), 148);
                } else {
                    interfaceC3163l2 = interfaceC3163lP;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                z11 = z10;
                function3 = function2;
                b10 = b0N;
            } else {
                interfaceC3163lP.z();
                interfaceC3163l2 = interfaceC3163lP;
                z11 = z9;
                function3 = function1;
                b10 = b9;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new f(z11, function3, b10, content, i8, i9));
            }
        }
        i10 |= 48;
        function1 = function0;
        if ((i8 & 896) == 0) {
            if ((i9 & 4) == 0) {
                b9 = b8;
                if (interfaceC3163lP.R(b9)) {
                }
                i10 |= i14;
            } else {
                b9 = b8;
            }
            i10 |= i14;
        } else {
            b9 = b8;
        }
        if ((i9 & 8) != 0) {
            i10 |= 3072;
        } else if ((i8 & 7168) == 0) {
            if (interfaceC3163lP.l(content)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i10 |= i11;
        }
        if ((i10 & 5851) == 1170) {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i12 != 0) {
                    z9 = true;
                }
                if (i13 != 0) {
                    function1 = d.f690a;
                }
                if ((i9 & 4) != 0) {
                    i10 &= -897;
                    Function0 function5 = function1;
                    b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, 6, 2);
                    z10 = z9;
                    function2 = function5;
                } else {
                    z10 = z9;
                    function2 = function1;
                    b0N = b9;
                }
            } else {
                if (i12 != 0) {
                    z9 = true;
                }
                if (i13 != 0) {
                    function1 = d.f690a;
                }
                if ((i9 & 4) != 0) {
                    i10 &= -897;
                    Function0 function6 = function1;
                    b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, 6, 2);
                    z10 = z9;
                    function2 = function6;
                } else {
                    z10 = z9;
                    function2 = function1;
                    b0N = b9;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-873470131, i10, -1, "com.elgato.streamdeck.purchase.PurchaseSheet (PurchaseSheet.kt:42)");
            }
            if (z10) {
                L0.i iVarC3 = androidx.compose.foundation.layout.f.c(L0.i.f4836a, 0.9f);
                Z z14 = Z.f35786a;
                int i17 = Z.f35787b;
                interfaceC3163l2 = interfaceC3163lP;
                J3.a.a(function2, iVarC3, null, b0N, null, J3.m.c(z14.a(interfaceC3163lP, i17), interfaceC3163lP, 0), z14.a(interfaceC3163lP, i17).o(), null, H0.c.b(interfaceC3163lP, -1003396031, true, new e(content)), interfaceC3163l2, ((i10 >> 3) & 14) | 100663344 | ((i10 << 3) & 7168), 148);
            } else {
                interfaceC3163l2 = interfaceC3163lP;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            z11 = z10;
            function3 = function2;
            b10 = b0N;
        } else {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i12 != 0) {
                    z9 = true;
                }
                if (i13 != 0) {
                    function1 = d.f690a;
                }
                if ((i9 & 4) != 0) {
                    i10 &= -897;
                    Function0 function7 = function1;
                    b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, 6, 2);
                    z10 = z9;
                    function2 = function7;
                } else {
                    z10 = z9;
                    function2 = function1;
                    b0N = b9;
                }
            } else {
                if (i12 != 0) {
                    z9 = true;
                }
                if (i13 != 0) {
                    function1 = d.f690a;
                }
                if ((i9 & 4) != 0) {
                    i10 &= -897;
                    Function0 function8 = function1;
                    b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, 6, 2);
                    z10 = z9;
                    function2 = function8;
                } else {
                    z10 = z9;
                    function2 = function1;
                    b0N = b9;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-873470131, i10, -1, "com.elgato.streamdeck.purchase.PurchaseSheet (PurchaseSheet.kt:42)");
            }
            if (z10) {
                L0.i iVarC4 = androidx.compose.foundation.layout.f.c(L0.i.f4836a, 0.9f);
                Z z15 = Z.f35786a;
                int i18 = Z.f35787b;
                interfaceC3163l2 = interfaceC3163lP;
                J3.a.a(function2, iVarC4, null, b0N, null, J3.m.c(z15.a(interfaceC3163lP, i18), interfaceC3163lP, 0), z15.a(interfaceC3163lP, i18).o(), null, H0.c.b(interfaceC3163lP, -1003396031, true, new e(content)), interfaceC3163l2, ((i10 >> 3) & 14) | 100663344 | ((i10 << 3) & 7168), 148);
            } else {
                interfaceC3163l2 = interfaceC3163lP;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            z11 = z10;
            function3 = function2;
            b10 = b0N;
        }
        p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new f(z11, function3, b10, content, i8, i9));
        }
    }
}
