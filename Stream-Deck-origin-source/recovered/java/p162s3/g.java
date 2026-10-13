package p162s3;

import A1.h;
import C6.G;
import J3.l;
import J3.m;
import L0.i;
import Q6.k;
import Q6.o;
import Q6.p;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2252x;
import p038e1.H;
import p056g1.InterfaceC2343g;
import p065h1.I0;
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
import p091k0.v;
import p091k0.y;
import p091k0.z;
import p191w0.AbstractC3068k;
import p191w0.AbstractC3079p0;
import p191w0.AbstractC3086t0;
import p191w0.Z;
import p201x2.vAk.kDsnNkYbBsI;
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
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f32938a;

        /* JADX INFO: renamed from: s3.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0741a extends u implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ N3.f.b f32939a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f32940b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f32941c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0741a(N3.f.b bVar, h hVar, boolean z8) {
                super(3);
                this.f32939a = bVar;
                this.f32940b = hVar;
                this.f32941c = z8;
            }

            public final void b(p091k0.b item, InterfaceC3163l interfaceC3163l, int i8) {
                t.g(item, "$this$item");
                if ((i8 & 81) == 16 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(786887341, i8, -1, "com.elgato.streamdeck.discovery.DeviceList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DiscoveryScreenContent.kt:156)");
                }
                k.a(this.f32939a, this.f32940b.i().f(), this.f32941c, this.f32940b.g(), this.f32940b.a(), this.f32940b.f(), this.f32940b.e(), I0.a(i.f4836a, I3.a.f3771a.b(this.f32939a.j())), interfaceC3163l, 0, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            }

            @Override // Q6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((p091k0.b) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
                return G.f1419a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f32942a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(h hVar) {
                super(3);
                this.f32942a = hVar;
            }

            @Override // Q6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((p091k0.b) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
                return G.f1419a;
            }

            public final void b(p091k0.b bVar, InterfaceC3163l interfaceC3163l, int i8) {
                t.g(bVar, kDsnNkYbBsI.CLdyPLnJtB);
                if ((i8 & 81) == 16 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1740544233, i8, -1, "com.elgato.streamdeck.discovery.DeviceList.<anonymous>.<anonymous>.<anonymous> (DiscoveryScreenContent.kt:170)");
                }
                o.a(this.f32942a.i().j(), this.f32942a.i().h(), this.f32942a.c(), this.f32942a.b(), null, interfaceC3163l, 8, 16);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar) {
            super(1);
            this.f32938a = hVar;
        }

        public final void b(v LazyColumnForm) {
            t.g(LazyColumnForm, "$this$LazyColumnForm");
            boolean z8 = this.f32938a.i().h() != null;
            if (!this.f32938a.i().d().isEmpty()) {
                List listD = this.f32938a.i().d();
                h hVar = this.f32938a;
                Iterator it = listD.iterator();
                while (it.hasNext()) {
                    v.c(LazyColumnForm, null, null, H0.c.c(786887341, true, new C0741a((N3.f.b) it.next(), hVar, z8)), 3, null);
                }
            }
            v.c(LazyColumnForm, null, null, H0.c.c(1740544233, true, new b(this.f32938a)), 3, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((v) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f32943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f32944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y f32945c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f32946d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, i iVar, y yVar, int i8) {
            super(2);
            this.f32943a = hVar;
            this.f32944b = iVar;
            this.f32945c = yVar;
            this.f32946d = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            g.a(this.f32943a, this.f32944b, this.f32945c, interfaceC3163l, F0.a(this.f32946d | 1));
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
        public final /* synthetic */ h f32947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f32948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ J f32949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f32950d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f32951e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h hVar, i iVar, J j8, int i8, int i9) {
            super(2);
            this.f32947a = hVar;
            this.f32948b = iVar;
            this.f32949c = j8;
            this.f32950d = i8;
            this.f32951e = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            g.b(this.f32947a, this.f32948b, this.f32949c, interfaceC3163l, F0.a(this.f32950d | 1), this.f32951e);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f32952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f32953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f32954c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f32955d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i iVar, String str, int i8, int i9) {
            super(2);
            this.f32952a = iVar;
            this.f32953b = str;
            this.f32954c = i8;
            this.f32955d = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            g.c(this.f32952a, this.f32953b, interfaceC3163l, F0.a(this.f32954c | 1), this.f32955d);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f32956a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f32957a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h hVar) {
                super(3);
                this.f32957a = hVar;
            }

            public final void b(T TopAppBar, InterfaceC3163l interfaceC3163l, int i8) {
                int i9;
                t.g(TopAppBar, "$this$TopAppBar");
                if ((i8 & 14) == 0) {
                    i9 = i8 | (interfaceC3163l.R(TopAppBar) ? 4 : 2);
                } else {
                    i9 = i8;
                }
                if ((i9 & 91) == 18 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(2026850623, i9, -1, "com.elgato.streamdeck.discovery.ScreenContent.<anonymous>.<anonymous> (DiscoveryScreenContent.kt:76)");
                }
                i.a aVar = i.f4836a;
                W3.c cVar = W3.c.f11463a;
                AbstractC3079p0.a(K3.c.a(I0.a(TopAppBar.c(androidx.compose.foundation.layout.f.l(androidx.compose.foundation.layout.e.m(aVar, 0.0f, 0.0f, cVar.j(), 0.0f, 11, null), cVar.l()), L0.c.f4806a.g()), "discovery_progress"), p194w3.b.f37008c, interfaceC3163l, 0), Z.f35786a.a(interfaceC3163l, Z.f35787b).B(), 0.0f, W3.b.f11304a.m(), 0, interfaceC3163l, 0, 20);
                X.a(androidx.compose.foundation.layout.f.p(aVar, cVar.a()), interfaceC3163l, 0);
                J3.p.a(I0.a(androidx.compose.foundation.layout.f.l(aVar, h.m(44)), "settings_button"), this.f32957a.h(), interfaceC3163l, 6, 0);
                X.a(androidx.compose.foundation.layout.f.p(aVar, m.f(cVar)), interfaceC3163l, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            }

            @Override // Q6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((T) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(h hVar) {
            super(2);
            this.f32956a = hVar;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(730033422, i8, -1, "com.elgato.streamdeck.discovery.ScreenContent.<anonymous> (DiscoveryScreenContent.kt:68)");
            }
            AbstractC3068k.d(p162s3.a.f32880a.a(), null, null, H0.c.b(interfaceC3163l, 2026850623, true, new a(this.f32956a)), null, null, null, interfaceC3163l, 3078, 118);
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
    public static final class f extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f32958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f32959b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(h hVar, i iVar) {
            super(3);
            this.f32958a = hVar;
            this.f32959b = iVar;
        }

        public final void b(J paddingValues, InterfaceC3163l interfaceC3163l, int i8) {
            t.g(paddingValues, "paddingValues");
            if ((i8 & 14) == 0) {
                i8 |= interfaceC3163l.R(paddingValues) ? 4 : 2;
            }
            if ((i8 & 91) == 18 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(984827609, i8, -1, "com.elgato.streamdeck.discovery.ScreenContent.<anonymous> (DiscoveryScreenContent.kt:97)");
            }
            g.b(this.f32958a, androidx.compose.foundation.layout.f.f(androidx.compose.foundation.c.b(this.f32959b, m.c(Z.f35786a.a(interfaceC3163l, Z.f35787b), interfaceC3163l, 0), null, 2, null), 0.0f, 1, null), paddingValues, interfaceC3163l, (i8 << 6) & 896, 0);
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

    /* JADX INFO: renamed from: s3.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0742g extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f32960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f32961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f32962c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f32963d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0742g(h hVar, i iVar, int i8, int i9) {
            super(2);
            this.f32960a = hVar;
            this.f32961b = iVar;
            this.f32962c = i8;
            this.f32963d = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            g.d(this.f32960a, this.f32961b, interfaceC3163l, F0.a(this.f32962c | 1), this.f32963d);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(h hVar, i iVar, y yVar, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        y yVar2;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-812786052);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.R(hVar) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= interfaceC3163lP.R(iVar) ? 32 : 16;
        }
        if ((i8 & 896) == 0) {
            i9 |= interfaceC3163lP.R(yVar) ? 256 : 128;
        }
        if ((i9 & 731) == 146 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
            yVar2 = yVar;
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-812786052, i9, -1, "com.elgato.streamdeck.discovery.DeviceList (DiscoveryScreenContent.kt:145)");
            }
            i iVarA = I0.a(iVar, "discover_host_list");
            interfaceC3163lP.f(1281142237);
            boolean z8 = (i9 & 14) == 4;
            Object objG = interfaceC3163lP.g();
            if (z8 || objG == InterfaceC3163l.f38803a.a()) {
                objG = new a(hVar);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            yVar2 = yVar;
            m.a(iVarA, null, yVar2, (k) objG, interfaceC3163lP, i9 & 896, 2);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(hVar, iVar, yVar2, i8));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:60:0x010d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0119  */
    /* JADX WARN: Code duplicated, block: B:64:0x011d  */
    /* JADX WARN: Code duplicated, block: B:67:0x013c  */
    /* JADX WARN: Code duplicated, block: B:69:0x014a  */
    /* JADX WARN: Code duplicated, block: B:71:0x019a  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x020c  */
    /* JADX WARN: Code duplicated, block: B:86:0x021a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0274  */
    /* JADX WARN: Code duplicated, block: B:94:0x027e  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public static final void b(h hVar, i iVar, J j8, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        i iVar2;
        int i11;
        i iVar3;
        N3.i.b bVarG;
        y yVarC;
        boolean z8;
        L0.c.a aVar;
        L0.c.InterfaceC0174c interfaceC0174cJ;
        int iA;
        Function0 function0A;
        InterfaceC3163l interfaceC3163lA;
        o oVarB;
        i iVar4;
        int iA2;
        Function0 function0A2;
        InterfaceC3163l interfaceC3163lA2;
        o oVarB2;
        P0 p0V;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(2044026827);
        if ((i9 & Integer.MIN_VALUE) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.R(hVar) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        int i12 = i9 & 1;
        if (i12 == 0) {
            if ((i8 & 112) == 0) {
                iVar2 = iVar;
                i10 |= interfaceC3163lP.R(iVar2) ? 32 : 16;
            }
            if ((i9 & 2) != 0) {
                i10 |= 384;
            } else if ((i8 & 896) == 0) {
                if (interfaceC3163lP.R(j8)) {
                    i11 = 256;
                } else {
                    i11 = 128;
                }
                i10 |= i11;
            }
            if ((i10 & 731) == 146 || !interfaceC3163lP.s()) {
                if (i12 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(2044026827, i10, -1, "com.elgato.streamdeck.discovery.DiscoveryListView (DiscoveryScreenContent.kt:110)");
                }
                bVarG = hVar.i().g();
                interfaceC3163lP.f(-1361714580);
                if (bVarG != null) {
                    n.a(bVarG.b(), bVarG.a(), hVar.d(), interfaceC3163lP, 0);
                }
                interfaceC3163lP.N();
                yVarC = z.c(0, 0, interfaceC3163lP, 0, 3);
                if (!yVarC.a() || yVarC.d()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (((Configuration) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.f())).orientation == 1) {
                    interfaceC3163lP.f(-1361714131);
                    L0.c.b bVarF = L0.c.f4806a.f();
                    i iVarH = androidx.compose.foundation.layout.e.h(iVar3, j8);
                    interfaceC3163lP.f(-483455358);
                    H hA = AbstractC2607k.a(C2598b.f27914a.g(), bVarF, interfaceC3163lP, 48);
                    interfaceC3163lP.f(-1323940314);
                    iA2 = AbstractC3157i.a(interfaceC3163lP, 0);
                    InterfaceC3184w interfaceC3184wE = interfaceC3163lP.E();
                    InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
                    function0A2 = aVar2.a();
                    p pVarB = AbstractC2252x.b(iVarH);
                    if (interfaceC3163lP.t() == null) {
                        AbstractC3157i.c();
                    }
                    interfaceC3163lP.r();
                    if (interfaceC3163lP.m()) {
                        interfaceC3163lP.w(function0A2);
                    } else {
                        interfaceC3163lP.G();
                    }
                    interfaceC3163lA2 = v1.a(interfaceC3163lP);
                    v1.b(interfaceC3163lA2, hA, aVar2.c());
                    v1.b(interfaceC3163lA2, interfaceC3184wE, aVar2.e());
                    oVarB2 = aVar2.b();
                    if (interfaceC3163lA2.m() || !t.c(interfaceC3163lA2.g(), Integer.valueOf(iA2))) {
                        interfaceC3163lA2.H(Integer.valueOf(iA2));
                        interfaceC3163lA2.A(Integer.valueOf(iA2), oVarB2);
                    }
                    pVarB.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                    interfaceC3163lP.f(2058660585);
                    a(hVar, InterfaceC2608l.c(C2609m.f28036a, i.f4836a, 1.0f, false, 2, null), yVarC, interfaceC3163lP, i10 & 14);
                    c(null, hVar.i().e(), interfaceC3163lP, 0, 1);
                    interfaceC3163lP.N();
                    interfaceC3163lP.O();
                    interfaceC3163lP.N();
                    interfaceC3163lP.N();
                    interfaceC3163lP.N();
                } else {
                    interfaceC3163lP.f(-1361713825);
                    aVar = L0.c.f4806a;
                    if (z8) {
                        interfaceC0174cJ = aVar.a();
                    } else {
                        interfaceC0174cJ = aVar.j();
                    }
                    i iVarH2 = androidx.compose.foundation.layout.e.h(iVar3, j8);
                    interfaceC3163lP.f(693286680);
                    H hA2 = S.a(C2598b.f27914a.f(), interfaceC0174cJ, interfaceC3163lP, 0);
                    interfaceC3163lP.f(-1323940314);
                    iA = AbstractC3157i.a(interfaceC3163lP, 0);
                    InterfaceC3184w interfaceC3184wE2 = interfaceC3163lP.E();
                    InterfaceC2343g.a aVar3 = InterfaceC2343g.f23596Q;
                    function0A = aVar3.a();
                    p pVarB2 = AbstractC2252x.b(iVarH2);
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
                    v1.b(interfaceC3163lA, hA2, aVar3.c());
                    v1.b(interfaceC3163lA, interfaceC3184wE2, aVar3.e());
                    oVarB = aVar3.b();
                    if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                        interfaceC3163lA.H(Integer.valueOf(iA));
                        interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                    }
                    pVarB2.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                    interfaceC3163lP.f(2058660585);
                    U u8 = U.f27892a;
                    i.a aVar4 = i.f4836a;
                    a(hVar, T.b(u8, aVar4, 0.6f, false, 2, null), yVarC, interfaceC3163lP, i10 & 14);
                    c(T.b(u8, aVar4, 0.4f, false, 2, null), hVar.i().e(), interfaceC3163lP, 0, 0);
                    interfaceC3163lP.N();
                    interfaceC3163lP.O();
                    interfaceC3163lP.N();
                    interfaceC3163lP.N();
                    interfaceC3163lP.N();
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar3;
            } else {
                interfaceC3163lP.z();
                iVar4 = iVar2;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new c(hVar, iVar4, j8, i8, i9));
            }
        }
        i10 |= 48;
        iVar2 = iVar;
        if ((i9 & 2) != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            if (interfaceC3163lP.R(j8)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i10 |= i11;
        }
        if ((i10 & 731) == 146) {
            if (i12 != 0) {
                iVar3 = i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(2044026827, i10, -1, "com.elgato.streamdeck.discovery.DiscoveryListView (DiscoveryScreenContent.kt:110)");
            }
            bVarG = hVar.i().g();
            interfaceC3163lP.f(-1361714580);
            if (bVarG != null) {
                n.a(bVarG.b(), bVarG.a(), hVar.d(), interfaceC3163lP, 0);
            }
            interfaceC3163lP.N();
            yVarC = z.c(0, 0, interfaceC3163lP, 0, 3);
            if (yVarC.a()) {
                z8 = true;
            } else {
                z8 = true;
            }
            if (((Configuration) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.f())).orientation == 1) {
                interfaceC3163lP.f(-1361714131);
                L0.c.b bVarF2 = L0.c.f4806a.f();
                i iVarH3 = androidx.compose.foundation.layout.e.h(iVar3, j8);
                interfaceC3163lP.f(-483455358);
                H hA3 = AbstractC2607k.a(C2598b.f27914a.g(), bVarF2, interfaceC3163lP, 48);
                interfaceC3163lP.f(-1323940314);
                iA2 = AbstractC3157i.a(interfaceC3163lP, 0);
                InterfaceC3184w interfaceC3184wE3 = interfaceC3163lP.E();
                InterfaceC2343g.a aVar5 = InterfaceC2343g.f23596Q;
                function0A2 = aVar5.a();
                p pVarB3 = AbstractC2252x.b(iVarH3);
                if (interfaceC3163lP.t() == null) {
                    AbstractC3157i.c();
                }
                interfaceC3163lP.r();
                if (interfaceC3163lP.m()) {
                    interfaceC3163lP.w(function0A2);
                } else {
                    interfaceC3163lP.G();
                }
                interfaceC3163lA2 = v1.a(interfaceC3163lP);
                v1.b(interfaceC3163lA2, hA3, aVar5.c());
                v1.b(interfaceC3163lA2, interfaceC3184wE3, aVar5.e());
                oVarB2 = aVar5.b();
                if (interfaceC3163lA2.m()) {
                    interfaceC3163lA2.H(Integer.valueOf(iA2));
                    interfaceC3163lA2.A(Integer.valueOf(iA2), oVarB2);
                } else {
                    interfaceC3163lA2.H(Integer.valueOf(iA2));
                    interfaceC3163lA2.A(Integer.valueOf(iA2), oVarB2);
                }
                pVarB3.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                interfaceC3163lP.f(2058660585);
                a(hVar, InterfaceC2608l.c(C2609m.f28036a, i.f4836a, 1.0f, false, 2, null), yVarC, interfaceC3163lP, i10 & 14);
                c(null, hVar.i().e(), interfaceC3163lP, 0, 1);
                interfaceC3163lP.N();
                interfaceC3163lP.O();
                interfaceC3163lP.N();
                interfaceC3163lP.N();
                interfaceC3163lP.N();
            } else {
                interfaceC3163lP.f(-1361713825);
                aVar = L0.c.f4806a;
                if (z8) {
                    interfaceC0174cJ = aVar.a();
                } else {
                    interfaceC0174cJ = aVar.j();
                }
                i iVarH4 = androidx.compose.foundation.layout.e.h(iVar3, j8);
                interfaceC3163lP.f(693286680);
                H hA4 = S.a(C2598b.f27914a.f(), interfaceC0174cJ, interfaceC3163lP, 0);
                interfaceC3163lP.f(-1323940314);
                iA = AbstractC3157i.a(interfaceC3163lP, 0);
                InterfaceC3184w interfaceC3184wE4 = interfaceC3163lP.E();
                InterfaceC2343g.a aVar6 = InterfaceC2343g.f23596Q;
                function0A = aVar6.a();
                p pVarB4 = AbstractC2252x.b(iVarH4);
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
                v1.b(interfaceC3163lA, hA4, aVar6.c());
                v1.b(interfaceC3163lA, interfaceC3184wE4, aVar6.e());
                oVarB = aVar6.b();
                if (interfaceC3163lA.m()) {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                } else {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                }
                pVarB4.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                interfaceC3163lP.f(2058660585);
                U u9 = U.f27892a;
                i.a aVar7 = i.f4836a;
                a(hVar, T.b(u9, aVar7, 0.6f, false, 2, null), yVarC, interfaceC3163lP, i10 & 14);
                c(T.b(u9, aVar7, 0.4f, false, 2, null), hVar.i().e(), interfaceC3163lP, 0, 0);
                interfaceC3163lP.N();
                interfaceC3163lP.O();
                interfaceC3163lP.N();
                interfaceC3163lP.N();
                interfaceC3163lP.N();
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar4 = iVar3;
        } else {
            if (i12 != 0) {
                iVar3 = i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(2044026827, i10, -1, "com.elgato.streamdeck.discovery.DiscoveryListView (DiscoveryScreenContent.kt:110)");
            }
            bVarG = hVar.i().g();
            interfaceC3163lP.f(-1361714580);
            if (bVarG != null) {
                n.a(bVarG.b(), bVarG.a(), hVar.d(), interfaceC3163lP, 0);
            }
            interfaceC3163lP.N();
            yVarC = z.c(0, 0, interfaceC3163lP, 0, 3);
            if (yVarC.a()) {
                z8 = true;
            } else {
                z8 = true;
            }
            if (((Configuration) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.f())).orientation == 1) {
                interfaceC3163lP.f(-1361714131);
                L0.c.b bVarF3 = L0.c.f4806a.f();
                i iVarH5 = androidx.compose.foundation.layout.e.h(iVar3, j8);
                interfaceC3163lP.f(-483455358);
                H hA5 = AbstractC2607k.a(C2598b.f27914a.g(), bVarF3, interfaceC3163lP, 48);
                interfaceC3163lP.f(-1323940314);
                iA2 = AbstractC3157i.a(interfaceC3163lP, 0);
                InterfaceC3184w interfaceC3184wE5 = interfaceC3163lP.E();
                InterfaceC2343g.a aVar8 = InterfaceC2343g.f23596Q;
                function0A2 = aVar8.a();
                p pVarB5 = AbstractC2252x.b(iVarH5);
                if (interfaceC3163lP.t() == null) {
                    AbstractC3157i.c();
                }
                interfaceC3163lP.r();
                if (interfaceC3163lP.m()) {
                    interfaceC3163lP.w(function0A2);
                } else {
                    interfaceC3163lP.G();
                }
                interfaceC3163lA2 = v1.a(interfaceC3163lP);
                v1.b(interfaceC3163lA2, hA5, aVar8.c());
                v1.b(interfaceC3163lA2, interfaceC3184wE5, aVar8.e());
                oVarB2 = aVar8.b();
                if (interfaceC3163lA2.m()) {
                    interfaceC3163lA2.H(Integer.valueOf(iA2));
                    interfaceC3163lA2.A(Integer.valueOf(iA2), oVarB2);
                } else {
                    interfaceC3163lA2.H(Integer.valueOf(iA2));
                    interfaceC3163lA2.A(Integer.valueOf(iA2), oVarB2);
                }
                pVarB5.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                interfaceC3163lP.f(2058660585);
                a(hVar, InterfaceC2608l.c(C2609m.f28036a, i.f4836a, 1.0f, false, 2, null), yVarC, interfaceC3163lP, i10 & 14);
                c(null, hVar.i().e(), interfaceC3163lP, 0, 1);
                interfaceC3163lP.N();
                interfaceC3163lP.O();
                interfaceC3163lP.N();
                interfaceC3163lP.N();
                interfaceC3163lP.N();
            } else {
                interfaceC3163lP.f(-1361713825);
                aVar = L0.c.f4806a;
                if (z8) {
                    interfaceC0174cJ = aVar.a();
                } else {
                    interfaceC0174cJ = aVar.j();
                }
                i iVarH6 = androidx.compose.foundation.layout.e.h(iVar3, j8);
                interfaceC3163lP.f(693286680);
                H hA6 = S.a(C2598b.f27914a.f(), interfaceC0174cJ, interfaceC3163lP, 0);
                interfaceC3163lP.f(-1323940314);
                iA = AbstractC3157i.a(interfaceC3163lP, 0);
                InterfaceC3184w interfaceC3184wE6 = interfaceC3163lP.E();
                InterfaceC2343g.a aVar9 = InterfaceC2343g.f23596Q;
                function0A = aVar9.a();
                p pVarB6 = AbstractC2252x.b(iVarH6);
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
                v1.b(interfaceC3163lA, hA6, aVar9.c());
                v1.b(interfaceC3163lA, interfaceC3184wE6, aVar9.e());
                oVarB = aVar9.b();
                if (interfaceC3163lA.m()) {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                } else {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                }
                pVarB6.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                interfaceC3163lP.f(2058660585);
                U u10 = U.f27892a;
                i.a aVar10 = i.f4836a;
                a(hVar, T.b(u10, aVar10, 0.6f, false, 2, null), yVarC, interfaceC3163lP, i10 & 14);
                c(T.b(u10, aVar10, 0.4f, false, 2, null), hVar.i().e(), interfaceC3163lP, 0, 0);
                interfaceC3163lP.N();
                interfaceC3163lP.O();
                interfaceC3163lP.N();
                interfaceC3163lP.N();
                interfaceC3163lP.N();
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar4 = iVar3;
        }
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new c(hVar, iVar4, j8, i8, i9));
        }
    }

    public static final void c(i iVar, String str, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        i iVar2;
        int i10;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-603151712);
        int i11 = i9 & 1;
        if (i11 != 0) {
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
            i10 |= interfaceC3163lP.R(str) ? 32 : 16;
        }
        if ((i10 & 91) == 18 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            i iVar3 = i11 != 0 ? i.f4836a : iVar2;
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-603151712, i10, -1, "com.elgato.streamdeck.discovery.HelpPane (DiscoveryScreenContent.kt:184)");
            }
            W3.c cVar = W3.c.f11463a;
            i iVarH = androidx.compose.foundation.layout.e.h(iVar3, m.g(cVar));
            interfaceC3163lP.f(-483455358);
            H hA = AbstractC2607k.a(C2598b.f27914a.g(), L0.c.f4806a.i(), interfaceC3163lP, 0);
            interfaceC3163lP.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163lP, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163lP.E();
            InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar.a();
            p pVarB = AbstractC2252x.b(iVarH);
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
            C2609m c2609m = C2609m.f28036a;
            i iVar4 = iVar3;
            p191w0.P0.b(p101l1.f.c(p194w3.b.f37077z, new Object[]{str}, interfaceC3163lP, 64), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, Z.f35786a.c(interfaceC3163lP, Z.f35787b).b(), interfaceC3163lP, 0, 0, 65534);
            interfaceC3163lP = interfaceC3163lP;
            X.a(androidx.compose.foundation.layout.f.i(i.f4836a, cVar.k()), interfaceC3163lP, 0);
            l.a(null, interfaceC3163lP, 0, 1);
            interfaceC3163lP.N();
            interfaceC3163lP.O();
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar2 = iVar4;
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new d(iVar2, str, i8, i9));
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    public static final void d(h hVar, i iVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        i iVar2;
        i iVar3;
        InterfaceC3163l interfaceC3163l2;
        i iVar4;
        P0 p0V;
        t.g(hVar, "<this>");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1239815242);
        if ((Integer.MIN_VALUE & i9) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.R(hVar) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        int i11 = i9 & 1;
        if (i11 == 0) {
            if ((i8 & 112) == 0) {
                iVar2 = iVar;
                i10 |= interfaceC3163lP.R(iVar2) ? 32 : 16;
            }
            if ((i10 & 91) == 18 || !interfaceC3163lP.s()) {
                if (i11 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1239815242, i10, -1, "com.elgato.streamdeck.discovery.ScreenContent (DiscoveryScreenContent.kt:65)");
                }
                interfaceC3163l2 = interfaceC3163lP;
                iVar4 = iVar3;
                AbstractC3086t0.b(null, H0.c.b(interfaceC3163lP, 730033422, true, new e(hVar)), null, null, null, 0, 0L, 0L, j0.b(d0.f27940a, interfaceC3163lP, 8), H0.c.b(interfaceC3163lP, 984827609, true, new f(hVar, iVar3)), interfaceC3163l2, 805306416, 253);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            } else {
                interfaceC3163lP.z();
                interfaceC3163l2 = interfaceC3163lP;
                iVar4 = iVar2;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new C0742g(hVar, iVar4, i8, i9));
            }
        }
        i10 |= 48;
        iVar2 = iVar;
        if ((i10 & 91) == 18) {
            if (i11 != 0) {
                iVar3 = i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1239815242, i10, -1, "com.elgato.streamdeck.discovery.ScreenContent (DiscoveryScreenContent.kt:65)");
            }
            interfaceC3163l2 = interfaceC3163lP;
            iVar4 = iVar3;
            AbstractC3086t0.b(null, H0.c.b(interfaceC3163lP, 730033422, true, new e(hVar)), null, null, null, 0, 0L, 0L, j0.b(d0.f27940a, interfaceC3163lP, 8), H0.c.b(interfaceC3163lP, 984827609, true, new f(hVar, iVar3)), interfaceC3163l2, 805306416, 253);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        } else {
            if (i11 != 0) {
                iVar3 = i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1239815242, i10, -1, "com.elgato.streamdeck.discovery.ScreenContent (DiscoveryScreenContent.kt:65)");
            }
            interfaceC3163l2 = interfaceC3163lP;
            iVar4 = iVar3;
            AbstractC3086t0.b(null, H0.c.b(interfaceC3163lP, 730033422, true, new e(hVar)), null, null, null, 0, 0L, 0L, j0.b(d0.f27940a, interfaceC3163lP, 8), H0.c.b(interfaceC3163lP, 984827609, true, new f(hVar, iVar3)), interfaceC3163l2, 805306416, 253);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new C0742g(hVar, iVar4, i8, i9));
        }
    }
}
