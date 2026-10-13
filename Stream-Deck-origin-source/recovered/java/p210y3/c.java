package p210y3;

import C6.G;
import L0.i;
import Q6.o;
import Q6.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2252x;
import p038e1.H;
import p056g1.InterfaceC2343g;
import p082j0.AbstractC2607k;
import p082j0.C2598b;
import p082j0.C2609m;
import p101l1.f;
import p128o1.I;
import p191w0.U0;
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
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f38269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Integer f38270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f38271c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f38272d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i8, Integer num, int i9, int i10) {
            super(2);
            this.f38269a = i8;
            this.f38270b = num;
            this.f38271c = i9;
            this.f38272d = i10;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            c.a(this.f38269a, this.f38270b, interfaceC3163l, F0.a(this.f38271c | 1), this.f38272d);
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
        public final /* synthetic */ String f38273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f38274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f38275c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f38276d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, int i8, int i9) {
            super(2);
            this.f38273a = str;
            this.f38274b = str2;
            this.f38275c = i8;
            this.f38276d = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            c.b(this.f38273a, this.f38274b, interfaceC3163l, F0.a(this.f38275c | 1), this.f38276d);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(int i8, Integer num, InterfaceC3163l interfaceC3163l, int i9, int i10) {
        int i11;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-885306461);
        if ((i10 & 1) != 0) {
            i11 = i9 | 6;
        } else if ((i9 & 14) == 0) {
            i11 = (interfaceC3163lP.i(i8) ? 4 : 2) | i9;
        } else {
            i11 = i9;
        }
        int i12 = i10 & 2;
        if (i12 != 0) {
            i11 |= 48;
        } else if ((i9 & 112) == 0) {
            i11 |= interfaceC3163lP.R(num) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (i12 != 0) {
                num = null;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-885306461, i11, -1, "com.elgato.streamdeck.navigation.DefaultTopBarTitle (TopBarScreen.kt:25)");
            }
            String strB = f.b(i8, interfaceC3163lP, i11 & 14);
            interfaceC3163lP.f(-1008039888);
            String strB2 = num != null ? f.b(num.intValue(), interfaceC3163lP, 0) : null;
            interfaceC3163lP.N();
            b(strB, strB2, interfaceC3163lP, 0, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new a(i8, num, i9, i10));
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:50:0x0160  */
    /* JADX WARN: Code duplicated, block: B:51:0x0197  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    public static final void b(String title, String str, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        String str2;
        String str3;
        int iA;
        Function0 function0A;
        InterfaceC3163l interfaceC3163lA;
        o oVarB;
        Z z8;
        int i11;
        int i12;
        InterfaceC3163l interfaceC3163l2;
        String str4;
        P0 p0V;
        t.g(title, "title");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-2001437175);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = i8 | (interfaceC3163lP.R(title) ? 4 : 2);
        } else {
            i10 = i8;
        }
        int i13 = i9 & 2;
        if (i13 == 0) {
            if ((i8 & 112) == 0) {
                str2 = str;
                i10 |= interfaceC3163lP.R(str2) ? 32 : 16;
            }
            if ((i10 & 91) == 18 || !interfaceC3163lP.s()) {
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-2001437175, i10, -1, "com.elgato.streamdeck.navigation.DefaultTopBarTitle (TopBarScreen.kt:33)");
                }
                interfaceC3163lP.f(-483455358);
                i.a aVar = i.f4836a;
                H hA = AbstractC2607k.a(C2598b.f27914a.g(), L0.c.f4806a.i(), interfaceC3163lP, 0);
                interfaceC3163lP.f(-1323940314);
                iA = AbstractC3157i.a(interfaceC3163lP, 0);
                InterfaceC3184w interfaceC3184wE = interfaceC3163lP.E();
                InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
                function0A = aVar2.a();
                p pVarB = AbstractC2252x.b(aVar);
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
                v1.b(interfaceC3163lA, hA, aVar2.c());
                v1.b(interfaceC3163lA, interfaceC3184wE, aVar2.e());
                oVarB = aVar2.b();
                if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                }
                pVarB.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                interfaceC3163lP.f(2058660585);
                C2609m c2609m = C2609m.f28036a;
                int iB = p216z1.t.f39054a.b();
                z8 = Z.f35786a;
                i11 = Z.f35787b;
                i12 = i10;
                p191w0.P0.b(title, null, 0L, 0L, null, null, null, 0L, null, null, 0L, iB, false, 1, 0, null, d(z8.c(interfaceC3163lP, i11)), interfaceC3163lP, i10 & 14, 3120, 55294);
                interfaceC3163lP.f(-1008039581);
                if (str3 != null) {
                    str4 = str3;
                    p191w0.P0.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c(z8.c(interfaceC3163lP, i11)), interfaceC3163lP, (i12 >> 3) & 14, 0, 65534);
                    interfaceC3163l2 = interfaceC3163lP;
                } else {
                    interfaceC3163l2 = interfaceC3163lP;
                    str4 = str3;
                }
                interfaceC3163l2.N();
                interfaceC3163l2.N();
                interfaceC3163l2.O();
                interfaceC3163l2.N();
                interfaceC3163l2.N();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            } else {
                interfaceC3163lP.z();
                interfaceC3163l2 = interfaceC3163lP;
                str4 = str2;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new b(title, str4, i8, i9));
            }
        }
        i10 |= 48;
        str2 = str;
        if ((i10 & 91) == 18) {
            if (i13 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-2001437175, i10, -1, "com.elgato.streamdeck.navigation.DefaultTopBarTitle (TopBarScreen.kt:33)");
            }
            interfaceC3163lP.f(-483455358);
            i.a aVar3 = i.f4836a;
            H hA2 = AbstractC2607k.a(C2598b.f27914a.g(), L0.c.f4806a.i(), interfaceC3163lP, 0);
            interfaceC3163lP.f(-1323940314);
            iA = AbstractC3157i.a(interfaceC3163lP, 0);
            InterfaceC3184w interfaceC3184wE2 = interfaceC3163lP.E();
            InterfaceC2343g.a aVar4 = InterfaceC2343g.f23596Q;
            function0A = aVar4.a();
            p pVarB2 = AbstractC2252x.b(aVar3);
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
            v1.b(interfaceC3163lA, hA2, aVar4.c());
            v1.b(interfaceC3163lA, interfaceC3184wE2, aVar4.e());
            oVarB = aVar4.b();
            if (interfaceC3163lA.m()) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            } else {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB2.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
            interfaceC3163lP.f(2058660585);
            C2609m c2609m2 = C2609m.f28036a;
            int iB2 = p216z1.t.f39054a.b();
            z8 = Z.f35786a;
            i11 = Z.f35787b;
            i12 = i10;
            p191w0.P0.b(title, null, 0L, 0L, null, null, null, 0L, null, null, 0L, iB2, false, 1, 0, null, d(z8.c(interfaceC3163lP, i11)), interfaceC3163lP, i10 & 14, 3120, 55294);
            interfaceC3163lP.f(-1008039581);
            if (str3 != null) {
                str4 = str3;
                p191w0.P0.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c(z8.c(interfaceC3163lP, i11)), interfaceC3163lP, (i12 >> 3) & 14, 0, 65534);
                interfaceC3163l2 = interfaceC3163lP;
            } else {
                interfaceC3163l2 = interfaceC3163lP;
                str4 = str3;
            }
            interfaceC3163l2.N();
            interfaceC3163l2.N();
            interfaceC3163l2.O();
            interfaceC3163l2.N();
            interfaceC3163l2.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        } else {
            if (i13 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-2001437175, i10, -1, "com.elgato.streamdeck.navigation.DefaultTopBarTitle (TopBarScreen.kt:33)");
            }
            interfaceC3163lP.f(-483455358);
            i.a aVar5 = i.f4836a;
            H hA3 = AbstractC2607k.a(C2598b.f27914a.g(), L0.c.f4806a.i(), interfaceC3163lP, 0);
            interfaceC3163lP.f(-1323940314);
            iA = AbstractC3157i.a(interfaceC3163lP, 0);
            InterfaceC3184w interfaceC3184wE3 = interfaceC3163lP.E();
            InterfaceC2343g.a aVar6 = InterfaceC2343g.f23596Q;
            function0A = aVar6.a();
            p pVarB3 = AbstractC2252x.b(aVar5);
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
            v1.b(interfaceC3163lA, hA3, aVar6.c());
            v1.b(interfaceC3163lA, interfaceC3184wE3, aVar6.e());
            oVarB = aVar6.b();
            if (interfaceC3163lA.m()) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            } else {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB3.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
            interfaceC3163lP.f(2058660585);
            C2609m c2609m3 = C2609m.f28036a;
            int iB3 = p216z1.t.f39054a.b();
            z8 = Z.f35786a;
            i11 = Z.f35787b;
            i12 = i10;
            p191w0.P0.b(title, null, 0L, 0L, null, null, null, 0L, null, null, 0L, iB3, false, 1, 0, null, d(z8.c(interfaceC3163lP, i11)), interfaceC3163lP, i10 & 14, 3120, 55294);
            interfaceC3163lP.f(-1008039581);
            if (str3 != null) {
                str4 = str3;
                p191w0.P0.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c(z8.c(interfaceC3163lP, i11)), interfaceC3163lP, (i12 >> 3) & 14, 0, 65534);
                interfaceC3163l2 = interfaceC3163lP;
            } else {
                interfaceC3163l2 = interfaceC3163lP;
                str4 = str3;
            }
            interfaceC3163l2.N();
            interfaceC3163l2.N();
            interfaceC3163l2.O();
            interfaceC3163l2.N();
            interfaceC3163l2.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new b(title, str4, i8, i9));
        }
    }

    public static final I c(U0 u8) {
        t.g(u8, "<this>");
        return u8.n();
    }

    public static final I d(U0 u8) {
        t.g(u8, "<this>");
        return u8.g();
    }
}
