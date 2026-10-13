package J3;

import C6.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2252x;
import p038e1.H;
import p056g1.InterfaceC2343g;
import p082j0.AbstractC2607k;
import p082j0.C2598b;
import p082j0.C2609m;
import p082j0.J;
import p110m1.x;
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
public abstract class n {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4272a = new a();

        public a() {
            super(1);
        }

        public final void b(x semantics) {
            t.g(semantics, "$this$semantics");
            p110m1.u.q(semantics);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((x) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f4273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J f4274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Q6.o f4275c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f4276d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f4277e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, J j8, Q6.o oVar, int i8, int i9) {
            super(2);
            this.f4273a = str;
            this.f4274b = j8;
            this.f4275c = oVar;
            this.f4276d = i8;
            this.f4277e = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            n.b(this.f4273a, this.f4274b, this.f4275c, interfaceC3163l, F0.a(this.f4276d | 1), this.f4277e);
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
        public final /* synthetic */ int f4278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J f4279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f4280c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f4281d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i8, J j8, int i9, int i10) {
            super(2);
            this.f4278a = i8;
            this.f4279b = j8;
            this.f4280c = i9;
            this.f4281d = i10;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            n.a(this.f4278a, this.f4279b, interfaceC3163l, F0.a(this.f4280c | 1), this.f4281d);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(int i8, J j8, InterfaceC3163l interfaceC3163l, int i9, int i10) {
        int i11;
        J j9;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-325010724);
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
            i11 |= interfaceC3163lP.R(j8) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (i12 != 0) {
                j8 = null;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-325010724, i11, -1, "com.elgato.streamdeck.ui.components.ListGroupHeadline (ListGroupHeadline.kt:38)");
            }
            if (j8 == null) {
                interfaceC3163lP.f(1615102978);
                b(p101l1.f.b(i8, interfaceC3163lP, i11 & 14), null, null, interfaceC3163lP, 0, 6);
                interfaceC3163lP.N();
                j9 = j8;
            } else {
                interfaceC3163lP.f(1615103021);
                j9 = j8;
                b(p101l1.f.b(i8, interfaceC3163lP, i11 & 14), j9, null, interfaceC3163lP, i11 & 112, 4);
                interfaceC3163lP.N();
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            j8 = j9;
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new c(i8, j8, i9, i10));
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c A[PHI: r4 r5
      0x008c: PHI (r4v17 int) = (r4v12 int), (r4v11 int), (r4v19 int) binds: [B:53:0x00aa, B:47:0x0088, B:48:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x008c: PHI (r5v8 j0.J) = (r5v3 j0.J), (r5v2 j0.J), (r5v2 j0.J) binds: [B:53:0x00aa, B:47:0x0088, B:48:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:63:0x0106  */
    /* JADX WARN: Code duplicated, block: B:64:0x010a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0129  */
    /* JADX WARN: Code duplicated, block: B:69:0x0137  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public static final void b(String text, J j8, Q6.o oVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        J jE;
        Q6.o oVar2;
        int i11;
        J j9;
        int iA;
        Function0 function0A;
        InterfaceC3163l interfaceC3163lA;
        Q6.o oVarB;
        int i12;
        Q6.o oVar3;
        InterfaceC3163l interfaceC3163l2;
        Q6.o oVar4;
        J j10;
        P0 p0V;
        t.g(text, "text");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-35455412);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.R(text) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i8 & 112) == 0) {
            if ((i9 & 2) == 0) {
                jE = j8;
                int i13 = interfaceC3163lP.R(jE) ? 32 : 16;
                i10 |= i13;
            } else {
                jE = j8;
            }
            i10 |= i13;
        } else {
            jE = j8;
        }
        int i14 = i9 & 4;
        if (i14 == 0) {
            if ((i8 & 896) == 0) {
                oVar2 = oVar;
                i10 |= interfaceC3163lP.l(oVar2) ? 256 : 128;
            }
            if ((i10 & 731) == 146 || !interfaceC3163lP.s()) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0 || interfaceC3163lP.F()) {
                    if ((i9 & 2) != 0) {
                        W3.c cVar = W3.c.f11463a;
                        jE = androidx.compose.foundation.layout.e.e(cVar.j(), 0.0f, 0.0f, cVar.h(), 6, null);
                        i10 &= -113;
                    }
                    if (i14 != 0) {
                        J j11 = jE;
                        i11 = i10;
                        j9 = j11;
                        oVar2 = null;
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-35455412, i11, -1, "com.elgato.streamdeck.ui.components.ListGroupHeadline (ListGroupHeadline.kt:23)");
                    }
                    L0.i.a aVar = L0.i.f4836a;
                    L0.i iVarH = androidx.compose.foundation.layout.e.h(aVar, j9);
                    interfaceC3163lP.f(-483455358);
                    H hA = AbstractC2607k.a(C2598b.f27914a.g(), L0.c.f4806a.i(), interfaceC3163lP, 0);
                    interfaceC3163lP.f(-1323940314);
                    iA = AbstractC3157i.a(interfaceC3163lP, 0);
                    InterfaceC3184w interfaceC3184wE = interfaceC3163lP.E();
                    InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
                    function0A = aVar2.a();
                    Q6.p pVarB = AbstractC2252x.b(iVarH);
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
                    J j12 = j9;
                    i12 = i11;
                    oVar3 = oVar2;
                    p191w0.P0.b(text, p110m1.n.d(aVar, false, a.f4272a, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, Z.f35786a.c(interfaceC3163lP, Z.f35787b).n(), interfaceC3163lP, i11 & 14, 0, 65532);
                    interfaceC3163l2 = interfaceC3163lP;
                    interfaceC3163l2.f(1615102847);
                    if (oVar3 != null) {
                        oVar3.invoke(interfaceC3163l2, Integer.valueOf((i12 >> 6) & 14));
                    }
                    interfaceC3163l2.N();
                    interfaceC3163l2.N();
                    interfaceC3163l2.O();
                    interfaceC3163l2.N();
                    interfaceC3163l2.N();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    oVar4 = oVar3;
                    j10 = j12;
                } else {
                    interfaceC3163lP.z();
                    if ((i9 & 2) != 0) {
                        i10 &= -113;
                    }
                }
                J j13 = jE;
                i11 = i10;
                j9 = j13;
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-35455412, i11, -1, "com.elgato.streamdeck.ui.components.ListGroupHeadline (ListGroupHeadline.kt:23)");
                }
                L0.i.a aVar3 = L0.i.f4836a;
                L0.i iVarH2 = androidx.compose.foundation.layout.e.h(aVar3, j9);
                interfaceC3163lP.f(-483455358);
                H hA2 = AbstractC2607k.a(C2598b.f27914a.g(), L0.c.f4806a.i(), interfaceC3163lP, 0);
                interfaceC3163lP.f(-1323940314);
                iA = AbstractC3157i.a(interfaceC3163lP, 0);
                InterfaceC3184w interfaceC3184wE2 = interfaceC3163lP.E();
                InterfaceC2343g.a aVar4 = InterfaceC2343g.f23596Q;
                function0A = aVar4.a();
                Q6.p pVarB2 = AbstractC2252x.b(iVarH2);
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
                J j14 = j9;
                i12 = i11;
                oVar3 = oVar2;
                p191w0.P0.b(text, p110m1.n.d(aVar3, false, a.f4272a, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, Z.f35786a.c(interfaceC3163lP, Z.f35787b).n(), interfaceC3163lP, i11 & 14, 0, 65532);
                interfaceC3163l2 = interfaceC3163lP;
                interfaceC3163l2.f(1615102847);
                if (oVar3 != null) {
                    oVar3.invoke(interfaceC3163l2, Integer.valueOf((i12 >> 6) & 14));
                }
                interfaceC3163l2.N();
                interfaceC3163l2.N();
                interfaceC3163l2.O();
                interfaceC3163l2.N();
                interfaceC3163l2.N();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                oVar4 = oVar3;
                j10 = j14;
            } else {
                interfaceC3163lP.z();
                interfaceC3163l2 = interfaceC3163lP;
                j10 = jE;
                oVar4 = oVar2;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new b(text, j10, oVar4, i8, i9));
            }
        }
        i10 |= 384;
        oVar2 = oVar;
        if ((i10 & 731) == 146) {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if ((i9 & 2) != 0) {
                    W3.c cVar2 = W3.c.f11463a;
                    jE = androidx.compose.foundation.layout.e.e(cVar2.j(), 0.0f, 0.0f, cVar2.h(), 6, null);
                    i10 &= -113;
                }
                if (i14 != 0) {
                    J j15 = jE;
                    i11 = i10;
                    j9 = j15;
                    oVar2 = null;
                } else {
                    J j16 = jE;
                    i11 = i10;
                    j9 = j16;
                }
            } else {
                if ((i9 & 2) != 0) {
                    W3.c cVar3 = W3.c.f11463a;
                    jE = androidx.compose.foundation.layout.e.e(cVar3.j(), 0.0f, 0.0f, cVar3.h(), 6, null);
                    i10 &= -113;
                }
                if (i14 != 0) {
                    J j17 = jE;
                    i11 = i10;
                    j9 = j17;
                    oVar2 = null;
                } else {
                    J j18 = jE;
                    i11 = i10;
                    j9 = j18;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-35455412, i11, -1, "com.elgato.streamdeck.ui.components.ListGroupHeadline (ListGroupHeadline.kt:23)");
            }
            L0.i.a aVar5 = L0.i.f4836a;
            L0.i iVarH3 = androidx.compose.foundation.layout.e.h(aVar5, j9);
            interfaceC3163lP.f(-483455358);
            H hA3 = AbstractC2607k.a(C2598b.f27914a.g(), L0.c.f4806a.i(), interfaceC3163lP, 0);
            interfaceC3163lP.f(-1323940314);
            iA = AbstractC3157i.a(interfaceC3163lP, 0);
            InterfaceC3184w interfaceC3184wE3 = interfaceC3163lP.E();
            InterfaceC2343g.a aVar6 = InterfaceC2343g.f23596Q;
            function0A = aVar6.a();
            Q6.p pVarB3 = AbstractC2252x.b(iVarH3);
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
            J j19 = j9;
            i12 = i11;
            oVar3 = oVar2;
            p191w0.P0.b(text, p110m1.n.d(aVar5, false, a.f4272a, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, Z.f35786a.c(interfaceC3163lP, Z.f35787b).n(), interfaceC3163lP, i11 & 14, 0, 65532);
            interfaceC3163l2 = interfaceC3163lP;
            interfaceC3163l2.f(1615102847);
            if (oVar3 != null) {
                oVar3.invoke(interfaceC3163l2, Integer.valueOf((i12 >> 6) & 14));
            }
            interfaceC3163l2.N();
            interfaceC3163l2.N();
            interfaceC3163l2.O();
            interfaceC3163l2.N();
            interfaceC3163l2.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            oVar4 = oVar3;
            j10 = j19;
        } else {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if ((i9 & 2) != 0) {
                    W3.c cVar4 = W3.c.f11463a;
                    jE = androidx.compose.foundation.layout.e.e(cVar4.j(), 0.0f, 0.0f, cVar4.h(), 6, null);
                    i10 &= -113;
                }
                if (i14 != 0) {
                    J j110 = jE;
                    i11 = i10;
                    j9 = j110;
                    oVar2 = null;
                } else {
                    J j111 = jE;
                    i11 = i10;
                    j9 = j111;
                }
            } else {
                if ((i9 & 2) != 0) {
                    W3.c cVar5 = W3.c.f11463a;
                    jE = androidx.compose.foundation.layout.e.e(cVar5.j(), 0.0f, 0.0f, cVar5.h(), 6, null);
                    i10 &= -113;
                }
                if (i14 != 0) {
                    J j112 = jE;
                    i11 = i10;
                    j9 = j112;
                    oVar2 = null;
                } else {
                    J j113 = jE;
                    i11 = i10;
                    j9 = j113;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-35455412, i11, -1, "com.elgato.streamdeck.ui.components.ListGroupHeadline (ListGroupHeadline.kt:23)");
            }
            L0.i.a aVar7 = L0.i.f4836a;
            L0.i iVarH4 = androidx.compose.foundation.layout.e.h(aVar7, j9);
            interfaceC3163lP.f(-483455358);
            H hA4 = AbstractC2607k.a(C2598b.f27914a.g(), L0.c.f4806a.i(), interfaceC3163lP, 0);
            interfaceC3163lP.f(-1323940314);
            iA = AbstractC3157i.a(interfaceC3163lP, 0);
            InterfaceC3184w interfaceC3184wE4 = interfaceC3163lP.E();
            InterfaceC2343g.a aVar8 = InterfaceC2343g.f23596Q;
            function0A = aVar8.a();
            Q6.p pVarB4 = AbstractC2252x.b(iVarH4);
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
            v1.b(interfaceC3163lA, hA4, aVar8.c());
            v1.b(interfaceC3163lA, interfaceC3184wE4, aVar8.e());
            oVarB = aVar8.b();
            if (interfaceC3163lA.m()) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            } else {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB4.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
            interfaceC3163lP.f(2058660585);
            C2609m c2609m4 = C2609m.f28036a;
            J j114 = j9;
            i12 = i11;
            oVar3 = oVar2;
            p191w0.P0.b(text, p110m1.n.d(aVar7, false, a.f4272a, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, Z.f35786a.c(interfaceC3163lP, Z.f35787b).n(), interfaceC3163lP, i11 & 14, 0, 65532);
            interfaceC3163l2 = interfaceC3163lP;
            interfaceC3163l2.f(1615102847);
            if (oVar3 != null) {
                oVar3.invoke(interfaceC3163l2, Integer.valueOf((i12 >> 6) & 14));
            }
            interfaceC3163l2.N();
            interfaceC3163l2.N();
            interfaceC3163l2.O();
            interfaceC3163l2.N();
            interfaceC3163l2.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            oVar4 = oVar3;
            j10 = j114;
        }
        p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new b(text, j10, oVar4, i8, i9));
        }
    }
}
