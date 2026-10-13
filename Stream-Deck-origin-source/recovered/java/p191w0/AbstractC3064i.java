package p191w0;

import A1.h;
import C6.G;
import E1.g;
import L0.c;
import L0.i;
import Q6.k;
import Q6.o;
import Q6.p;
import androidx.compose.foundation.layout.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2252x;
import p038e1.H;
import p056g1.InterfaceC2343g;
import p082j0.AbstractC2601e;
import p110m1.n;
import p110m1.x;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3184w;
import p215z0.P0;
import p215z0.R0;
import p215z0.v1;

/* JADX INFO: renamed from: w0.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3064i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f35952a = h.m(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f35953b = h.m(12);

    /* JADX INFO: renamed from: w0.i$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f35954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f35955b;

        /* JADX INFO: renamed from: w0.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0800a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f35956a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0800a(String str) {
                super(1);
                this.f35956a = str;
            }

            public final void b(x xVar) {
                p110m1.u.Q(xVar, this.f35956a);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((x) obj);
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, o oVar) {
            super(2);
            this.f35954a = iVar;
            this.f35955b = oVar;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 3) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-777289724, i8, -1, "androidx.compose.material3.BasicAlertDialog.<anonymous> (AndroidAlertDialog.android.kt:160)");
            }
            D0.a aVar = D0.f35229a;
            String strA = E0.a(D0.a(AbstractC3082r0.f36367f), interfaceC3163l, 0);
            i iVarO = f.o(this.f35954a, AbstractC3048a.b(), 0.0f, AbstractC3048a.a(), 0.0f, 10, null);
            i.a aVar2 = i.f4836a;
            interfaceC3163l.f(-874813489);
            boolean zR = interfaceC3163l.R(strA);
            Object objG = interfaceC3163l.g();
            if (zR || objG == InterfaceC3163l.f38803a.a()) {
                objG = new C0800a(strA);
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            i iVarJ = iVarO.j(n.d(aVar2, false, (k) objG, 1, null));
            o oVar = this.f35955b;
            interfaceC3163l.f(733328855);
            H hG = AbstractC2601e.g(c.f4806a.m(), true, interfaceC3163l, 48);
            interfaceC3163l.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163l, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
            InterfaceC2343g.a aVar3 = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar3.a();
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

    /* JADX INFO: renamed from: w0.i$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f35957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f35958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f35959c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o f35960d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f35961e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f35962f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0 function0, i iVar, g gVar, o oVar, int i8, int i9) {
            super(2);
            this.f35957a = function0;
            this.f35958b = iVar;
            this.f35959c = gVar;
            this.f35960d = oVar;
            this.f35961e = i8;
            this.f35962f = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            AbstractC3064i.a(this.f35957a, this.f35958b, this.f35959c, this.f35960d, interfaceC3163l, F0.a(this.f35961e | 1), this.f35962f);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void a(Function0 function0, i iVar, g gVar, o oVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        Function0 function1;
        int i10;
        i iVar2;
        int i11;
        g gVar2;
        int i12;
        int i13;
        i iVar3;
        g gVar3;
        i iVar4;
        g gVar4;
        P0 p0V;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-543157267);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
            function1 = function0;
        } else if ((i8 & 6) == 0) {
            function1 = function0;
            i10 = (interfaceC3163lP.l(function1) ? 4 : 2) | i8;
        } else {
            function1 = function0;
            i10 = i8;
        }
        int i14 = i9 & 2;
        if (i14 == 0) {
            if ((i8 & 48) == 0) {
                iVar2 = iVar;
                i10 |= interfaceC3163lP.R(iVar2) ? 32 : 16;
            }
            i11 = i9 & 4;
            if (i11 != 0) {
                if ((i8 & 384) == 0) {
                    gVar2 = gVar;
                    if (interfaceC3163lP.R(gVar2)) {
                        i12 = 256;
                    } else {
                        i12 = 128;
                    }
                    i10 |= i12;
                }
                if ((i9 & 8) != 0) {
                    i10 |= 3072;
                } else if ((i8 & 3072) == 0) {
                    if (interfaceC3163lP.l(oVar)) {
                        i13 = 2048;
                    } else {
                        i13 = 1024;
                    }
                    i10 |= i13;
                }
                if ((i10 & 1171) == 1170 || !interfaceC3163lP.s()) {
                    if (i14 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        gVar3 = new g(false, false, (E1.p) null, 7, (AbstractC2633k) null);
                    } else {
                        gVar3 = gVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-543157267, i10, -1, "androidx.compose.material3.BasicAlertDialog (AndroidAlertDialog.android.kt:155)");
                    }
                    E1.a.a(function1, gVar3, H0.c.b(interfaceC3163lP, -777289724, true, new a(iVar3, oVar)), interfaceC3163lP, (i10 & 14) | 384 | ((i10 >> 3) & 112), 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar3;
                    gVar4 = gVar3;
                } else {
                    interfaceC3163lP.z();
                    iVar4 = iVar2;
                    gVar4 = gVar2;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new b(function0, iVar4, gVar4, oVar, i8, i9));
                }
            }
            i10 |= 384;
            gVar2 = gVar;
            if ((i9 & 8) != 0) {
                i10 |= 3072;
            } else if ((i8 & 3072) == 0) {
                if (interfaceC3163lP.l(oVar)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i10 |= i13;
            }
            if ((i10 & 1171) == 1170) {
                if (i14 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    gVar3 = new g(false, false, (E1.p) null, 7, (AbstractC2633k) null);
                } else {
                    gVar3 = gVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-543157267, i10, -1, "androidx.compose.material3.BasicAlertDialog (AndroidAlertDialog.android.kt:155)");
                }
                E1.a.a(function1, gVar3, H0.c.b(interfaceC3163lP, -777289724, true, new a(iVar3, oVar)), interfaceC3163lP, (i10 & 14) | 384 | ((i10 >> 3) & 112), 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar3;
                gVar4 = gVar3;
            } else {
                if (i14 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    gVar3 = new g(false, false, (E1.p) null, 7, (AbstractC2633k) null);
                } else {
                    gVar3 = gVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-543157267, i10, -1, "androidx.compose.material3.BasicAlertDialog (AndroidAlertDialog.android.kt:155)");
                }
                E1.a.a(function1, gVar3, H0.c.b(interfaceC3163lP, -777289724, true, new a(iVar3, oVar)), interfaceC3163lP, (i10 & 14) | 384 | ((i10 >> 3) & 112), 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar3;
                gVar4 = gVar3;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new b(function0, iVar4, gVar4, oVar, i8, i9));
            }
        }
        i10 |= 48;
        iVar2 = iVar;
        i11 = i9 & 4;
        if (i11 != 0) {
            if ((i8 & 384) == 0) {
                gVar2 = gVar;
                if (interfaceC3163lP.R(gVar2)) {
                    i12 = 256;
                } else {
                    i12 = 128;
                }
                i10 |= i12;
            }
            if ((i9 & 8) != 0) {
                i10 |= 3072;
            } else if ((i8 & 3072) == 0) {
                if (interfaceC3163lP.l(oVar)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i10 |= i13;
            }
            if ((i10 & 1171) == 1170) {
                if (i14 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    gVar3 = new g(false, false, (E1.p) null, 7, (AbstractC2633k) null);
                } else {
                    gVar3 = gVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-543157267, i10, -1, "androidx.compose.material3.BasicAlertDialog (AndroidAlertDialog.android.kt:155)");
                }
                E1.a.a(function1, gVar3, H0.c.b(interfaceC3163lP, -777289724, true, new a(iVar3, oVar)), interfaceC3163lP, (i10 & 14) | 384 | ((i10 >> 3) & 112), 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar3;
                gVar4 = gVar3;
            } else {
                if (i14 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    gVar3 = new g(false, false, (E1.p) null, 7, (AbstractC2633k) null);
                } else {
                    gVar3 = gVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-543157267, i10, -1, "androidx.compose.material3.BasicAlertDialog (AndroidAlertDialog.android.kt:155)");
                }
                E1.a.a(function1, gVar3, H0.c.b(interfaceC3163lP, -777289724, true, new a(iVar3, oVar)), interfaceC3163lP, (i10 & 14) | 384 | ((i10 >> 3) & 112), 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar3;
                gVar4 = gVar3;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new b(function0, iVar4, gVar4, oVar, i8, i9));
            }
        }
        i10 |= 384;
        gVar2 = gVar;
        if ((i9 & 8) != 0) {
            i10 |= 3072;
        } else if ((i8 & 3072) == 0) {
            if (interfaceC3163lP.l(oVar)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i10 |= i13;
        }
        if ((i10 & 1171) == 1170) {
            if (i14 != 0) {
                iVar3 = i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (i11 != 0) {
                gVar3 = new g(false, false, (E1.p) null, 7, (AbstractC2633k) null);
            } else {
                gVar3 = gVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-543157267, i10, -1, "androidx.compose.material3.BasicAlertDialog (AndroidAlertDialog.android.kt:155)");
            }
            E1.a.a(function1, gVar3, H0.c.b(interfaceC3163lP, -777289724, true, new a(iVar3, oVar)), interfaceC3163lP, (i10 & 14) | 384 | ((i10 >> 3) & 112), 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar4 = iVar3;
            gVar4 = gVar3;
        } else {
            if (i14 != 0) {
                iVar3 = i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (i11 != 0) {
                gVar3 = new g(false, false, (E1.p) null, 7, (AbstractC2633k) null);
            } else {
                gVar3 = gVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-543157267, i10, -1, "androidx.compose.material3.BasicAlertDialog (AndroidAlertDialog.android.kt:155)");
            }
            E1.a.a(function1, gVar3, H0.c.b(interfaceC3163lP, -777289724, true, new a(iVar3, oVar)), interfaceC3163lP, (i10 & 14) | 384 | ((i10 >> 3) & 112), 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar4 = iVar3;
            gVar4 = gVar3;
        }
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(function0, iVar4, gVar4, oVar, i8, i9));
        }
    }
}
