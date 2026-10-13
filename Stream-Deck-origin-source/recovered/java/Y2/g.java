package Y2;

import A1.n;
import C6.G;
import C6.m;
import C6.v;
import L0.i;
import Q6.k;
import Q6.o;
import Q6.q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p037e0.AbstractC2214j;
import p037e0.E;
import p037e0.x0;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V2.b f12160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f12161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f12162c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ E f12163d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ q f12164e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f12165f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f12166g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(V2.b bVar, i iVar, f fVar, E e8, q qVar, int i8, int i9) {
            super(2);
            this.f12160a = bVar;
            this.f12161b = iVar;
            this.f12162c = fVar;
            this.f12163d = e8;
            this.f12164e = qVar;
            this.f12165f = i8;
            this.f12166g = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            g.b(this.f12160a, this.f12161b, this.f12162c, this.f12163d, this.f12164e, interfaceC3163l, F0.a(this.f12165f | 1), this.f12166g);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12167a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(T2.a it) {
            t.g(it, "it");
            return it.getKey();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V2.b f12168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f12169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ E f12170c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f12171a = new a();

            public a() {
                super(1);
            }

            public final Integer b(int i8) {
                return Integer.valueOf(-i8);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).intValue());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f12172a = new b();

            public b() {
                super(1);
            }

            public final Integer b(int i8) {
                return Integer.valueOf(i8);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).intValue());
            }
        }

        /* JADX INFO: renamed from: Y2.g$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0309c extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0309c f12173a = new C0309c();

            public C0309c() {
                super(1);
            }

            public final Integer b(int i8) {
                return Integer.valueOf(i8);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).intValue());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class d extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f12174a = new d();

            public d() {
                super(1);
            }

            public final Integer b(int i8) {
                return Integer.valueOf(-i8);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).intValue());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f12175a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f12176b;

            static {
                int[] iArr = new int[U2.c.values().length];
                try {
                    iArr[U2.c.Pop.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f12175a = iArr;
                int[] iArr2 = new int[f.values().length];
                try {
                    iArr2[f.Horizontal.ordinal()] = 1;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr2[f.Vertical.ordinal()] = 2;
                } catch (NoSuchFieldError unused3) {
                }
                f12176b = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(V2.b bVar, f fVar, E e8) {
            super(1);
            this.f12168a = bVar;
            this.f12169b = fVar;
            this.f12170c = e8;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p028d0.k invoke(androidx.compose.animation.c ScreenTransition) {
            t.g(ScreenTransition, "$this$ScreenTransition");
            C6.o oVarA = e.f12175a[this.f12168a.j().ordinal()] == 1 ? v.a(a.f12171a, b.f12172a) : v.a(C0309c.f12173a, d.f12174a);
            k kVar = (k) oVarA.a();
            k kVar2 = (k) oVarA.b();
            int i8 = e.f12176b[this.f12169b.ordinal()];
            if (i8 == 1) {
                return androidx.compose.animation.a.e(androidx.compose.animation.e.w(this.f12170c, kVar), androidx.compose.animation.e.A(this.f12170c, kVar2));
            }
            if (i8 == 2) {
                return androidx.compose.animation.a.e(androidx.compose.animation.e.y(this.f12170c, kVar), androidx.compose.animation.e.C(this.f12170c, kVar2));
            }
            throw new m();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V2.b f12177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f12178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f12179c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ E f12180d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ L0.c f12181e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f12182f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ k f12183g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ q f12184h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f12185i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f12186j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(V2.b bVar, i iVar, f fVar, E e8, L0.c cVar, boolean z8, k kVar, q qVar, int i8, int i9) {
            super(2);
            this.f12177a = bVar;
            this.f12178b = iVar;
            this.f12179c = fVar;
            this.f12180d = e8;
            this.f12181e = cVar;
            this.f12182f = z8;
            this.f12183g = kVar;
            this.f12184h = qVar;
            this.f12185i = i8;
            this.f12186j = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            g.a(this.f12177a, this.f12178b, this.f12179c, this.f12180d, this.f12181e, this.f12182f, this.f12183g, this.f12184h, interfaceC3163l, F0.a(this.f12185i | 1), this.f12186j);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x013e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0141  */
    /* JADX WARN: Code duplicated, block: B:104:0x0144  */
    /* JADX WARN: Code duplicated, block: B:106:0x0149  */
    /* JADX WARN: Code duplicated, block: B:107:0x0161  */
    /* JADX WARN: Code duplicated, block: B:109:0x0167  */
    /* JADX WARN: Code duplicated, block: B:111:0x0170  */
    /* JADX WARN: Code duplicated, block: B:113:0x0174  */
    /* JADX WARN: Code duplicated, block: B:115:0x0179  */
    /* JADX WARN: Code duplicated, block: B:116:0x0189  */
    /* JADX WARN: Code duplicated, block: B:119:0x019b  */
    /* JADX WARN: Code duplicated, block: B:122:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:126:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x0103  */
    /* JADX WARN: Code duplicated, block: B:89:0x0119  */
    /* JADX WARN: Code duplicated, block: B:92:0x0122  */
    public static final void a(V2.b navigator, i iVar, f fVar, E e8, L0.c cVar, boolean z8, k kVar, q qVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        i iVar2;
        int i11;
        f fVar2;
        int i12;
        int i13;
        int i14;
        L0.c cVarM;
        int i15;
        int i16;
        int i17;
        boolean z9;
        int i18;
        int i19;
        k kVar2;
        int i20;
        int i21;
        int i22;
        int i23;
        i iVar3;
        E eG;
        boolean z10;
        L0.c cVar2;
        k kVar3;
        E e9;
        int i24;
        f fVar3;
        i iVar4;
        q qVarB;
        q qVar2;
        boolean z11;
        k kVar4;
        E e10;
        L0.c cVar3;
        f fVar4;
        P0 p0V;
        t.g(navigator, "navigator");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-312399946);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.R(navigator) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        int i25 = i9 & 2;
        if (i25 == 0) {
            if ((i8 & 112) == 0) {
                iVar2 = iVar;
                i10 |= interfaceC3163lP.R(iVar2) ? 32 : 16;
            }
            i11 = i9 & 4;
            if (i11 != 0) {
                if ((i8 & 896) == 0) {
                    fVar2 = fVar;
                    if (interfaceC3163lP.R(fVar2)) {
                        i12 = 256;
                    } else {
                        i12 = 128;
                    }
                    i10 |= i12;
                }
                i13 = i9 & 8;
                if (i13 != 0) {
                    i10 |= 1024;
                }
                i14 = i9 & 16;
                if (i14 != 0) {
                    if ((i8 & 57344) == 0) {
                        cVarM = cVar;
                        if (interfaceC3163lP.R(cVarM)) {
                            i15 = 16384;
                        } else {
                            i15 = 8192;
                        }
                        i10 |= i15;
                    }
                    i16 = i9 & 32;
                    if (i16 != 0) {
                        i10 |= 196608;
                        i17 = 57344;
                        z9 = z8;
                    } else {
                        i17 = 57344;
                        z9 = z8;
                        if ((i8 & 458752) == 0) {
                            if (interfaceC3163lP.c(z9)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i10 |= i18;
                        }
                    }
                    i19 = i9 & 64;
                    if (i19 != 0) {
                        if ((i8 & 3670016) == 0) {
                            kVar2 = kVar;
                            if (interfaceC3163lP.l(kVar2)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i10 |= i20;
                        }
                        i21 = i9 & 128;
                        if (i21 != 0) {
                            i10 |= 12582912;
                        } else if ((i8 & 29360128) != 0) {
                            if (interfaceC3163lP.l(qVar)) {
                                i22 = 8388608;
                            } else {
                                i22 = 4194304;
                            }
                            i10 |= i22;
                        }
                        if (i13 == 8) {
                            i23 = i25;
                            if ((23967451 & i10) != 4793490 && interfaceC3163lP.s()) {
                                interfaceC3163lP.z();
                                qVar2 = qVar;
                                iVar4 = iVar2;
                                fVar4 = fVar2;
                                z11 = z9;
                                cVar3 = cVarM;
                                kVar4 = kVar2;
                                e10 = e8;
                            }
                            p0V = interfaceC3163lP.v();
                            if (p0V != null) {
                                p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                            }
                        }
                        i23 = i25;
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0 || interfaceC3163lP.F()) {
                            if (i23 != 0) {
                                iVar3 = i.f4836a;
                            } else {
                                iVar3 = iVar2;
                            }
                            if (i11 != 0) {
                                fVar2 = f.Horizontal;
                            }
                            if (i13 != 0) {
                                eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                                i10 &= -7169;
                            } else {
                                eG = e8;
                            }
                            if (i14 != 0) {
                                cVarM = L0.c.f4806a.m();
                            }
                            if (i16 != 0) {
                                z9 = false;
                            }
                            if (i19 != 0) {
                                kVar2 = b.f12167a;
                            }
                            if (i21 != 0) {
                                z10 = z9;
                                kVar3 = kVar2;
                                fVar3 = fVar2;
                                qVarB = Y2.c.f12102a.b();
                                cVar2 = cVarM;
                                e9 = eG;
                                i24 = i10;
                                iVar4 = iVar3;
                            } else {
                                z10 = z9;
                                cVar2 = cVarM;
                                kVar3 = kVar2;
                                e9 = eG;
                                i24 = i10;
                                fVar3 = fVar2;
                                iVar4 = iVar3;
                            }
                            interfaceC3163lP.Q();
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-312399946, i24, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:55)");
                            }
                            int i26 = i24;
                            c cVar4 = new c(navigator, fVar3, e9);
                            int i27 = V2.b.f10520j | (i26 & 14) | ((i26 << 3) & 896);
                            int i28 = i26 >> 3;
                            e.a(navigator, cVar4, iVar4, cVar2, z10, kVar3, qVarB, interfaceC3163lP, (i28 & 3670016) | i27 | (i28 & 7168) | (i28 & i17) | (i28 & 458752), 0);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            qVar2 = qVarB;
                            z11 = z10;
                            kVar4 = kVar3;
                            e10 = e9;
                            cVar3 = cVar2;
                            fVar4 = fVar3;
                            p0V = interfaceC3163lP.v();
                            if (p0V != null) {
                                p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                            }
                        }
                        interfaceC3163lP.z();
                        if (i13 != 0) {
                            i10 &= -7169;
                        }
                        i24 = i10;
                        iVar4 = iVar2;
                        z10 = z9;
                        cVar2 = cVarM;
                        kVar3 = kVar2;
                        e9 = e8;
                        fVar3 = fVar2;
                        qVarB = qVar;
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-312399946, i24, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:55)");
                        }
                        int i29 = i24;
                        c cVar5 = new c(navigator, fVar3, e9);
                        int i210 = V2.b.f10520j | (i29 & 14) | ((i29 << 3) & 896);
                        int i211 = i29 >> 3;
                        e.a(navigator, cVar5, iVar4, cVar2, z10, kVar3, qVarB, interfaceC3163lP, (i211 & 3670016) | i210 | (i211 & 7168) | (i211 & i17) | (i211 & 458752), 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        qVar2 = qVarB;
                        z11 = z10;
                        kVar4 = kVar3;
                        e10 = e9;
                        cVar3 = cVar2;
                        fVar4 = fVar3;
                        p0V = interfaceC3163lP.v();
                        if (p0V != null) {
                            p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                        }
                    }
                    i10 |= 1572864;
                    kVar2 = kVar;
                    i21 = i9 & 128;
                    if (i21 != 0) {
                        i10 |= 12582912;
                    } else if ((i8 & 29360128) != 0) {
                        if (interfaceC3163lP.l(qVar)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i10 |= i22;
                    }
                    if (i13 == 8) {
                        i23 = i25;
                        if ((23967451 & i10) != 4793490) {
                        }
                        p0V = interfaceC3163lP.v();
                        if (p0V != null) {
                            p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                        }
                    }
                    i23 = i25;
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i23 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            fVar2 = f.Horizontal;
                        }
                        if (i13 != 0) {
                            eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                            i10 &= -7169;
                        } else {
                            eG = e8;
                        }
                        if (i14 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i16 != 0) {
                            z9 = false;
                        }
                        if (i19 != 0) {
                            kVar2 = b.f12167a;
                        }
                        if (i21 != 0) {
                            z10 = z9;
                            kVar3 = kVar2;
                            fVar3 = fVar2;
                            qVarB = Y2.c.f12102a.b();
                            cVar2 = cVarM;
                            e9 = eG;
                            i24 = i10;
                            iVar4 = iVar3;
                        } else {
                            z10 = z9;
                            cVar2 = cVarM;
                            kVar3 = kVar2;
                            e9 = eG;
                            i24 = i10;
                            fVar3 = fVar2;
                            iVar4 = iVar3;
                            qVarB = qVar;
                        }
                    } else {
                        if (i23 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            fVar2 = f.Horizontal;
                        }
                        if (i13 != 0) {
                            eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                            i10 &= -7169;
                        } else {
                            eG = e8;
                        }
                        if (i14 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i16 != 0) {
                            z9 = false;
                        }
                        if (i19 != 0) {
                            kVar2 = b.f12167a;
                        }
                        if (i21 != 0) {
                            z10 = z9;
                            kVar3 = kVar2;
                            fVar3 = fVar2;
                            qVarB = Y2.c.f12102a.b();
                            cVar2 = cVarM;
                            e9 = eG;
                            i24 = i10;
                            iVar4 = iVar3;
                        } else {
                            z10 = z9;
                            cVar2 = cVarM;
                            kVar3 = kVar2;
                            e9 = eG;
                            i24 = i10;
                            fVar3 = fVar2;
                            iVar4 = iVar3;
                            qVarB = qVar;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-312399946, i24, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:55)");
                    }
                    int i212 = i24;
                    c cVar6 = new c(navigator, fVar3, e9);
                    int i213 = V2.b.f10520j | (i212 & 14) | ((i212 << 3) & 896);
                    int i214 = i212 >> 3;
                    e.a(navigator, cVar6, iVar4, cVar2, z10, kVar3, qVarB, interfaceC3163lP, (i214 & 3670016) | i213 | (i214 & 7168) | (i214 & i17) | (i214 & 458752), 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    qVar2 = qVarB;
                    z11 = z10;
                    kVar4 = kVar3;
                    e10 = e9;
                    cVar3 = cVar2;
                    fVar4 = fVar3;
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                    }
                }
                i10 |= 24576;
                cVarM = cVar;
                i16 = i9 & 32;
                if (i16 != 0) {
                    i10 |= 196608;
                    i17 = 57344;
                    z9 = z8;
                } else {
                    i17 = 57344;
                    z9 = z8;
                    if ((i8 & 458752) == 0) {
                        if (interfaceC3163lP.c(z9)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i10 |= i18;
                    }
                }
                i19 = i9 & 64;
                if (i19 != 0) {
                    if ((i8 & 3670016) == 0) {
                        kVar2 = kVar;
                        if (interfaceC3163lP.l(kVar2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i10 |= i20;
                    }
                    i21 = i9 & 128;
                    if (i21 != 0) {
                        i10 |= 12582912;
                    } else if ((i8 & 29360128) != 0) {
                        if (interfaceC3163lP.l(qVar)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i10 |= i22;
                    }
                    if (i13 == 8) {
                        i23 = i25;
                        if ((23967451 & i10) != 4793490) {
                        }
                        p0V = interfaceC3163lP.v();
                        if (p0V != null) {
                            p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                        }
                    }
                    i23 = i25;
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i23 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            fVar2 = f.Horizontal;
                        }
                        if (i13 != 0) {
                            eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                            i10 &= -7169;
                        } else {
                            eG = e8;
                        }
                        if (i14 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i16 != 0) {
                            z9 = false;
                        }
                        if (i19 != 0) {
                            kVar2 = b.f12167a;
                        }
                        if (i21 != 0) {
                            z10 = z9;
                            kVar3 = kVar2;
                            fVar3 = fVar2;
                            qVarB = Y2.c.f12102a.b();
                            cVar2 = cVarM;
                            e9 = eG;
                            i24 = i10;
                            iVar4 = iVar3;
                        } else {
                            z10 = z9;
                            cVar2 = cVarM;
                            kVar3 = kVar2;
                            e9 = eG;
                            i24 = i10;
                            fVar3 = fVar2;
                            iVar4 = iVar3;
                            qVarB = qVar;
                        }
                    } else {
                        if (i23 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            fVar2 = f.Horizontal;
                        }
                        if (i13 != 0) {
                            eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                            i10 &= -7169;
                        } else {
                            eG = e8;
                        }
                        if (i14 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i16 != 0) {
                            z9 = false;
                        }
                        if (i19 != 0) {
                            kVar2 = b.f12167a;
                        }
                        if (i21 != 0) {
                            z10 = z9;
                            kVar3 = kVar2;
                            fVar3 = fVar2;
                            qVarB = Y2.c.f12102a.b();
                            cVar2 = cVarM;
                            e9 = eG;
                            i24 = i10;
                            iVar4 = iVar3;
                        } else {
                            z10 = z9;
                            cVar2 = cVarM;
                            kVar3 = kVar2;
                            e9 = eG;
                            i24 = i10;
                            fVar3 = fVar2;
                            iVar4 = iVar3;
                            qVarB = qVar;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-312399946, i24, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:55)");
                    }
                    int i215 = i24;
                    c cVar7 = new c(navigator, fVar3, e9);
                    int i216 = V2.b.f10520j | (i215 & 14) | ((i215 << 3) & 896);
                    int i217 = i215 >> 3;
                    e.a(navigator, cVar7, iVar4, cVar2, z10, kVar3, qVarB, interfaceC3163lP, (i217 & 3670016) | i216 | (i217 & 7168) | (i217 & i17) | (i217 & 458752), 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    qVar2 = qVarB;
                    z11 = z10;
                    kVar4 = kVar3;
                    e10 = e9;
                    cVar3 = cVar2;
                    fVar4 = fVar3;
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                    }
                }
                i10 |= 1572864;
                kVar2 = kVar;
                i21 = i9 & 128;
                if (i21 != 0) {
                    i10 |= 12582912;
                } else if ((i8 & 29360128) != 0) {
                    if (interfaceC3163lP.l(qVar)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i10 |= i22;
                }
                if (i13 == 8) {
                    i23 = i25;
                    if ((23967451 & i10) != 4793490) {
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                    }
                }
                i23 = i25;
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i23 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        fVar2 = f.Horizontal;
                    }
                    if (i13 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                        i10 &= -7169;
                    } else {
                        eG = e8;
                    }
                    if (i14 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i16 != 0) {
                        z9 = false;
                    }
                    if (i19 != 0) {
                        kVar2 = b.f12167a;
                    }
                    if (i21 != 0) {
                        z10 = z9;
                        kVar3 = kVar2;
                        fVar3 = fVar2;
                        qVarB = Y2.c.f12102a.b();
                        cVar2 = cVarM;
                        e9 = eG;
                        i24 = i10;
                        iVar4 = iVar3;
                    } else {
                        z10 = z9;
                        cVar2 = cVarM;
                        kVar3 = kVar2;
                        e9 = eG;
                        i24 = i10;
                        fVar3 = fVar2;
                        iVar4 = iVar3;
                        qVarB = qVar;
                    }
                } else {
                    if (i23 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        fVar2 = f.Horizontal;
                    }
                    if (i13 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                        i10 &= -7169;
                    } else {
                        eG = e8;
                    }
                    if (i14 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i16 != 0) {
                        z9 = false;
                    }
                    if (i19 != 0) {
                        kVar2 = b.f12167a;
                    }
                    if (i21 != 0) {
                        z10 = z9;
                        kVar3 = kVar2;
                        fVar3 = fVar2;
                        qVarB = Y2.c.f12102a.b();
                        cVar2 = cVarM;
                        e9 = eG;
                        i24 = i10;
                        iVar4 = iVar3;
                    } else {
                        z10 = z9;
                        cVar2 = cVarM;
                        kVar3 = kVar2;
                        e9 = eG;
                        i24 = i10;
                        fVar3 = fVar2;
                        iVar4 = iVar3;
                        qVarB = qVar;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-312399946, i24, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:55)");
                }
                int i218 = i24;
                c cVar8 = new c(navigator, fVar3, e9);
                int i219 = V2.b.f10520j | (i218 & 14) | ((i218 << 3) & 896);
                int i2110 = i218 >> 3;
                e.a(navigator, cVar8, iVar4, cVar2, z10, kVar3, qVarB, interfaceC3163lP, (i2110 & 3670016) | i219 | (i2110 & 7168) | (i2110 & i17) | (i2110 & 458752), 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                qVar2 = qVarB;
                z11 = z10;
                kVar4 = kVar3;
                e10 = e9;
                cVar3 = cVar2;
                fVar4 = fVar3;
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                }
            }
            i10 |= 384;
            fVar2 = fVar;
            i13 = i9 & 8;
            if (i13 != 0) {
                i10 |= 1024;
            }
            i14 = i9 & 16;
            if (i14 != 0) {
                if ((i8 & 57344) == 0) {
                    cVarM = cVar;
                    if (interfaceC3163lP.R(cVarM)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i10 |= i15;
                }
                i16 = i9 & 32;
                if (i16 != 0) {
                    i10 |= 196608;
                    i17 = 57344;
                    z9 = z8;
                } else {
                    i17 = 57344;
                    z9 = z8;
                    if ((i8 & 458752) == 0) {
                        if (interfaceC3163lP.c(z9)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i10 |= i18;
                    }
                }
                i19 = i9 & 64;
                if (i19 != 0) {
                    if ((i8 & 3670016) == 0) {
                        kVar2 = kVar;
                        if (interfaceC3163lP.l(kVar2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i10 |= i20;
                    }
                    i21 = i9 & 128;
                    if (i21 != 0) {
                        i10 |= 12582912;
                    } else if ((i8 & 29360128) != 0) {
                        if (interfaceC3163lP.l(qVar)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i10 |= i22;
                    }
                    if (i13 == 8) {
                        i23 = i25;
                        if ((23967451 & i10) != 4793490) {
                        }
                        p0V = interfaceC3163lP.v();
                        if (p0V != null) {
                            p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                        }
                    }
                    i23 = i25;
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i23 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            fVar2 = f.Horizontal;
                        }
                        if (i13 != 0) {
                            eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                            i10 &= -7169;
                        } else {
                            eG = e8;
                        }
                        if (i14 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i16 != 0) {
                            z9 = false;
                        }
                        if (i19 != 0) {
                            kVar2 = b.f12167a;
                        }
                        if (i21 != 0) {
                            z10 = z9;
                            kVar3 = kVar2;
                            fVar3 = fVar2;
                            qVarB = Y2.c.f12102a.b();
                            cVar2 = cVarM;
                            e9 = eG;
                            i24 = i10;
                            iVar4 = iVar3;
                        } else {
                            z10 = z9;
                            cVar2 = cVarM;
                            kVar3 = kVar2;
                            e9 = eG;
                            i24 = i10;
                            fVar3 = fVar2;
                            iVar4 = iVar3;
                            qVarB = qVar;
                        }
                    } else {
                        if (i23 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            fVar2 = f.Horizontal;
                        }
                        if (i13 != 0) {
                            eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                            i10 &= -7169;
                        } else {
                            eG = e8;
                        }
                        if (i14 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i16 != 0) {
                            z9 = false;
                        }
                        if (i19 != 0) {
                            kVar2 = b.f12167a;
                        }
                        if (i21 != 0) {
                            z10 = z9;
                            kVar3 = kVar2;
                            fVar3 = fVar2;
                            qVarB = Y2.c.f12102a.b();
                            cVar2 = cVarM;
                            e9 = eG;
                            i24 = i10;
                            iVar4 = iVar3;
                        } else {
                            z10 = z9;
                            cVar2 = cVarM;
                            kVar3 = kVar2;
                            e9 = eG;
                            i24 = i10;
                            fVar3 = fVar2;
                            iVar4 = iVar3;
                            qVarB = qVar;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-312399946, i24, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:55)");
                    }
                    int i2111 = i24;
                    c cVar9 = new c(navigator, fVar3, e9);
                    int i2112 = V2.b.f10520j | (i2111 & 14) | ((i2111 << 3) & 896);
                    int i2113 = i2111 >> 3;
                    e.a(navigator, cVar9, iVar4, cVar2, z10, kVar3, qVarB, interfaceC3163lP, (i2113 & 3670016) | i2112 | (i2113 & 7168) | (i2113 & i17) | (i2113 & 458752), 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    qVar2 = qVarB;
                    z11 = z10;
                    kVar4 = kVar3;
                    e10 = e9;
                    cVar3 = cVar2;
                    fVar4 = fVar3;
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                    }
                }
                i10 |= 1572864;
                kVar2 = kVar;
                i21 = i9 & 128;
                if (i21 != 0) {
                    i10 |= 12582912;
                } else if ((i8 & 29360128) != 0) {
                    if (interfaceC3163lP.l(qVar)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i10 |= i22;
                }
                if (i13 == 8) {
                    i23 = i25;
                    if ((23967451 & i10) != 4793490) {
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                    }
                }
                i23 = i25;
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i23 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        fVar2 = f.Horizontal;
                    }
                    if (i13 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                        i10 &= -7169;
                    } else {
                        eG = e8;
                    }
                    if (i14 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i16 != 0) {
                        z9 = false;
                    }
                    if (i19 != 0) {
                        kVar2 = b.f12167a;
                    }
                    if (i21 != 0) {
                        z10 = z9;
                        kVar3 = kVar2;
                        fVar3 = fVar2;
                        qVarB = Y2.c.f12102a.b();
                        cVar2 = cVarM;
                        e9 = eG;
                        i24 = i10;
                        iVar4 = iVar3;
                    } else {
                        z10 = z9;
                        cVar2 = cVarM;
                        kVar3 = kVar2;
                        e9 = eG;
                        i24 = i10;
                        fVar3 = fVar2;
                        iVar4 = iVar3;
                        qVarB = qVar;
                    }
                } else {
                    if (i23 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        fVar2 = f.Horizontal;
                    }
                    if (i13 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                        i10 &= -7169;
                    } else {
                        eG = e8;
                    }
                    if (i14 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i16 != 0) {
                        z9 = false;
                    }
                    if (i19 != 0) {
                        kVar2 = b.f12167a;
                    }
                    if (i21 != 0) {
                        z10 = z9;
                        kVar3 = kVar2;
                        fVar3 = fVar2;
                        qVarB = Y2.c.f12102a.b();
                        cVar2 = cVarM;
                        e9 = eG;
                        i24 = i10;
                        iVar4 = iVar3;
                    } else {
                        z10 = z9;
                        cVar2 = cVarM;
                        kVar3 = kVar2;
                        e9 = eG;
                        i24 = i10;
                        fVar3 = fVar2;
                        iVar4 = iVar3;
                        qVarB = qVar;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-312399946, i24, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:55)");
                }
                int i2114 = i24;
                c cVar10 = new c(navigator, fVar3, e9);
                int i2115 = V2.b.f10520j | (i2114 & 14) | ((i2114 << 3) & 896);
                int i2116 = i2114 >> 3;
                e.a(navigator, cVar10, iVar4, cVar2, z10, kVar3, qVarB, interfaceC3163lP, (i2116 & 3670016) | i2115 | (i2116 & 7168) | (i2116 & i17) | (i2116 & 458752), 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                qVar2 = qVarB;
                z11 = z10;
                kVar4 = kVar3;
                e10 = e9;
                cVar3 = cVar2;
                fVar4 = fVar3;
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                }
            }
            i10 |= 24576;
            cVarM = cVar;
            i16 = i9 & 32;
            if (i16 != 0) {
                i10 |= 196608;
                i17 = 57344;
                z9 = z8;
            } else {
                i17 = 57344;
                z9 = z8;
                if ((i8 & 458752) == 0) {
                    if (interfaceC3163lP.c(z9)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i10 |= i18;
                }
            }
            i19 = i9 & 64;
            if (i19 != 0) {
                if ((i8 & 3670016) == 0) {
                    kVar2 = kVar;
                    if (interfaceC3163lP.l(kVar2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i10 |= i20;
                }
                i21 = i9 & 128;
                if (i21 != 0) {
                    i10 |= 12582912;
                } else if ((i8 & 29360128) != 0) {
                    if (interfaceC3163lP.l(qVar)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i10 |= i22;
                }
                if (i13 == 8) {
                    i23 = i25;
                    if ((23967451 & i10) != 4793490) {
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                    }
                }
                i23 = i25;
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i23 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        fVar2 = f.Horizontal;
                    }
                    if (i13 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                        i10 &= -7169;
                    } else {
                        eG = e8;
                    }
                    if (i14 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i16 != 0) {
                        z9 = false;
                    }
                    if (i19 != 0) {
                        kVar2 = b.f12167a;
                    }
                    if (i21 != 0) {
                        z10 = z9;
                        kVar3 = kVar2;
                        fVar3 = fVar2;
                        qVarB = Y2.c.f12102a.b();
                        cVar2 = cVarM;
                        e9 = eG;
                        i24 = i10;
                        iVar4 = iVar3;
                    } else {
                        z10 = z9;
                        cVar2 = cVarM;
                        kVar3 = kVar2;
                        e9 = eG;
                        i24 = i10;
                        fVar3 = fVar2;
                        iVar4 = iVar3;
                        qVarB = qVar;
                    }
                } else {
                    if (i23 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        fVar2 = f.Horizontal;
                    }
                    if (i13 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                        i10 &= -7169;
                    } else {
                        eG = e8;
                    }
                    if (i14 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i16 != 0) {
                        z9 = false;
                    }
                    if (i19 != 0) {
                        kVar2 = b.f12167a;
                    }
                    if (i21 != 0) {
                        z10 = z9;
                        kVar3 = kVar2;
                        fVar3 = fVar2;
                        qVarB = Y2.c.f12102a.b();
                        cVar2 = cVarM;
                        e9 = eG;
                        i24 = i10;
                        iVar4 = iVar3;
                    } else {
                        z10 = z9;
                        cVar2 = cVarM;
                        kVar3 = kVar2;
                        e9 = eG;
                        i24 = i10;
                        fVar3 = fVar2;
                        iVar4 = iVar3;
                        qVarB = qVar;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-312399946, i24, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:55)");
                }
                int i2117 = i24;
                c cVar11 = new c(navigator, fVar3, e9);
                int i2118 = V2.b.f10520j | (i2117 & 14) | ((i2117 << 3) & 896);
                int i2119 = i2117 >> 3;
                e.a(navigator, cVar11, iVar4, cVar2, z10, kVar3, qVarB, interfaceC3163lP, (i2119 & 3670016) | i2118 | (i2119 & 7168) | (i2119 & i17) | (i2119 & 458752), 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                qVar2 = qVarB;
                z11 = z10;
                kVar4 = kVar3;
                e10 = e9;
                cVar3 = cVar2;
                fVar4 = fVar3;
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                }
            }
            i10 |= 1572864;
            kVar2 = kVar;
            i21 = i9 & 128;
            if (i21 != 0) {
                i10 |= 12582912;
            } else if ((i8 & 29360128) != 0) {
                if (interfaceC3163lP.l(qVar)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i10 |= i22;
            }
            if (i13 == 8) {
                i23 = i25;
                if ((23967451 & i10) != 4793490) {
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                }
            }
            i23 = i25;
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i23 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    fVar2 = f.Horizontal;
                }
                if (i13 != 0) {
                    eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                    i10 &= -7169;
                } else {
                    eG = e8;
                }
                if (i14 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i16 != 0) {
                    z9 = false;
                }
                if (i19 != 0) {
                    kVar2 = b.f12167a;
                }
                if (i21 != 0) {
                    z10 = z9;
                    kVar3 = kVar2;
                    fVar3 = fVar2;
                    qVarB = Y2.c.f12102a.b();
                    cVar2 = cVarM;
                    e9 = eG;
                    i24 = i10;
                    iVar4 = iVar3;
                } else {
                    z10 = z9;
                    cVar2 = cVarM;
                    kVar3 = kVar2;
                    e9 = eG;
                    i24 = i10;
                    fVar3 = fVar2;
                    iVar4 = iVar3;
                    qVarB = qVar;
                }
            } else {
                if (i23 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    fVar2 = f.Horizontal;
                }
                if (i13 != 0) {
                    eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                    i10 &= -7169;
                } else {
                    eG = e8;
                }
                if (i14 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i16 != 0) {
                    z9 = false;
                }
                if (i19 != 0) {
                    kVar2 = b.f12167a;
                }
                if (i21 != 0) {
                    z10 = z9;
                    kVar3 = kVar2;
                    fVar3 = fVar2;
                    qVarB = Y2.c.f12102a.b();
                    cVar2 = cVarM;
                    e9 = eG;
                    i24 = i10;
                    iVar4 = iVar3;
                } else {
                    z10 = z9;
                    cVar2 = cVarM;
                    kVar3 = kVar2;
                    e9 = eG;
                    i24 = i10;
                    fVar3 = fVar2;
                    iVar4 = iVar3;
                    qVarB = qVar;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-312399946, i24, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:55)");
            }
            int i21110 = i24;
            c cVar12 = new c(navigator, fVar3, e9);
            int i21111 = V2.b.f10520j | (i21110 & 14) | ((i21110 << 3) & 896);
            int i21112 = i21110 >> 3;
            e.a(navigator, cVar12, iVar4, cVar2, z10, kVar3, qVarB, interfaceC3163lP, (i21112 & 3670016) | i21111 | (i21112 & 7168) | (i21112 & i17) | (i21112 & 458752), 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            qVar2 = qVarB;
            z11 = z10;
            kVar4 = kVar3;
            e10 = e9;
            cVar3 = cVar2;
            fVar4 = fVar3;
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
            }
        }
        i10 |= 48;
        iVar2 = iVar;
        i11 = i9 & 4;
        if (i11 != 0) {
            if ((i8 & 896) == 0) {
                fVar2 = fVar;
                if (interfaceC3163lP.R(fVar2)) {
                    i12 = 256;
                } else {
                    i12 = 128;
                }
                i10 |= i12;
            }
            i13 = i9 & 8;
            if (i13 != 0) {
                i10 |= 1024;
            }
            i14 = i9 & 16;
            if (i14 != 0) {
                if ((i8 & 57344) == 0) {
                    cVarM = cVar;
                    if (interfaceC3163lP.R(cVarM)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i10 |= i15;
                }
                i16 = i9 & 32;
                if (i16 != 0) {
                    i10 |= 196608;
                    i17 = 57344;
                    z9 = z8;
                } else {
                    i17 = 57344;
                    z9 = z8;
                    if ((i8 & 458752) == 0) {
                        if (interfaceC3163lP.c(z9)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i10 |= i18;
                    }
                }
                i19 = i9 & 64;
                if (i19 != 0) {
                    if ((i8 & 3670016) == 0) {
                        kVar2 = kVar;
                        if (interfaceC3163lP.l(kVar2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i10 |= i20;
                    }
                    i21 = i9 & 128;
                    if (i21 != 0) {
                        i10 |= 12582912;
                    } else if ((i8 & 29360128) != 0) {
                        if (interfaceC3163lP.l(qVar)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i10 |= i22;
                    }
                    if (i13 == 8) {
                        i23 = i25;
                        if ((23967451 & i10) != 4793490) {
                        }
                        p0V = interfaceC3163lP.v();
                        if (p0V != null) {
                            p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                        }
                    }
                    i23 = i25;
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i23 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            fVar2 = f.Horizontal;
                        }
                        if (i13 != 0) {
                            eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                            i10 &= -7169;
                        } else {
                            eG = e8;
                        }
                        if (i14 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i16 != 0) {
                            z9 = false;
                        }
                        if (i19 != 0) {
                            kVar2 = b.f12167a;
                        }
                        if (i21 != 0) {
                            z10 = z9;
                            kVar3 = kVar2;
                            fVar3 = fVar2;
                            qVarB = Y2.c.f12102a.b();
                            cVar2 = cVarM;
                            e9 = eG;
                            i24 = i10;
                            iVar4 = iVar3;
                        } else {
                            z10 = z9;
                            cVar2 = cVarM;
                            kVar3 = kVar2;
                            e9 = eG;
                            i24 = i10;
                            fVar3 = fVar2;
                            iVar4 = iVar3;
                            qVarB = qVar;
                        }
                    } else {
                        if (i23 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            fVar2 = f.Horizontal;
                        }
                        if (i13 != 0) {
                            eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                            i10 &= -7169;
                        } else {
                            eG = e8;
                        }
                        if (i14 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i16 != 0) {
                            z9 = false;
                        }
                        if (i19 != 0) {
                            kVar2 = b.f12167a;
                        }
                        if (i21 != 0) {
                            z10 = z9;
                            kVar3 = kVar2;
                            fVar3 = fVar2;
                            qVarB = Y2.c.f12102a.b();
                            cVar2 = cVarM;
                            e9 = eG;
                            i24 = i10;
                            iVar4 = iVar3;
                        } else {
                            z10 = z9;
                            cVar2 = cVarM;
                            kVar3 = kVar2;
                            e9 = eG;
                            i24 = i10;
                            fVar3 = fVar2;
                            iVar4 = iVar3;
                            qVarB = qVar;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-312399946, i24, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:55)");
                    }
                    int i21113 = i24;
                    c cVar13 = new c(navigator, fVar3, e9);
                    int i21114 = V2.b.f10520j | (i21113 & 14) | ((i21113 << 3) & 896);
                    int i21115 = i21113 >> 3;
                    e.a(navigator, cVar13, iVar4, cVar2, z10, kVar3, qVarB, interfaceC3163lP, (i21115 & 3670016) | i21114 | (i21115 & 7168) | (i21115 & i17) | (i21115 & 458752), 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    qVar2 = qVarB;
                    z11 = z10;
                    kVar4 = kVar3;
                    e10 = e9;
                    cVar3 = cVar2;
                    fVar4 = fVar3;
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                    }
                }
                i10 |= 1572864;
                kVar2 = kVar;
                i21 = i9 & 128;
                if (i21 != 0) {
                    i10 |= 12582912;
                } else if ((i8 & 29360128) != 0) {
                    if (interfaceC3163lP.l(qVar)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i10 |= i22;
                }
                if (i13 == 8) {
                    i23 = i25;
                    if ((23967451 & i10) != 4793490) {
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                    }
                }
                i23 = i25;
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i23 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        fVar2 = f.Horizontal;
                    }
                    if (i13 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                        i10 &= -7169;
                    } else {
                        eG = e8;
                    }
                    if (i14 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i16 != 0) {
                        z9 = false;
                    }
                    if (i19 != 0) {
                        kVar2 = b.f12167a;
                    }
                    if (i21 != 0) {
                        z10 = z9;
                        kVar3 = kVar2;
                        fVar3 = fVar2;
                        qVarB = Y2.c.f12102a.b();
                        cVar2 = cVarM;
                        e9 = eG;
                        i24 = i10;
                        iVar4 = iVar3;
                    } else {
                        z10 = z9;
                        cVar2 = cVarM;
                        kVar3 = kVar2;
                        e9 = eG;
                        i24 = i10;
                        fVar3 = fVar2;
                        iVar4 = iVar3;
                        qVarB = qVar;
                    }
                } else {
                    if (i23 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        fVar2 = f.Horizontal;
                    }
                    if (i13 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                        i10 &= -7169;
                    } else {
                        eG = e8;
                    }
                    if (i14 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i16 != 0) {
                        z9 = false;
                    }
                    if (i19 != 0) {
                        kVar2 = b.f12167a;
                    }
                    if (i21 != 0) {
                        z10 = z9;
                        kVar3 = kVar2;
                        fVar3 = fVar2;
                        qVarB = Y2.c.f12102a.b();
                        cVar2 = cVarM;
                        e9 = eG;
                        i24 = i10;
                        iVar4 = iVar3;
                    } else {
                        z10 = z9;
                        cVar2 = cVarM;
                        kVar3 = kVar2;
                        e9 = eG;
                        i24 = i10;
                        fVar3 = fVar2;
                        iVar4 = iVar3;
                        qVarB = qVar;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-312399946, i24, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:55)");
                }
                int i21116 = i24;
                c cVar14 = new c(navigator, fVar3, e9);
                int i21117 = V2.b.f10520j | (i21116 & 14) | ((i21116 << 3) & 896);
                int i21118 = i21116 >> 3;
                e.a(navigator, cVar14, iVar4, cVar2, z10, kVar3, qVarB, interfaceC3163lP, (i21118 & 3670016) | i21117 | (i21118 & 7168) | (i21118 & i17) | (i21118 & 458752), 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                qVar2 = qVarB;
                z11 = z10;
                kVar4 = kVar3;
                e10 = e9;
                cVar3 = cVar2;
                fVar4 = fVar3;
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                }
            }
            i10 |= 24576;
            cVarM = cVar;
            i16 = i9 & 32;
            if (i16 != 0) {
                i10 |= 196608;
                i17 = 57344;
                z9 = z8;
            } else {
                i17 = 57344;
                z9 = z8;
                if ((i8 & 458752) == 0) {
                    if (interfaceC3163lP.c(z9)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i10 |= i18;
                }
            }
            i19 = i9 & 64;
            if (i19 != 0) {
                if ((i8 & 3670016) == 0) {
                    kVar2 = kVar;
                    if (interfaceC3163lP.l(kVar2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i10 |= i20;
                }
                i21 = i9 & 128;
                if (i21 != 0) {
                    i10 |= 12582912;
                } else if ((i8 & 29360128) != 0) {
                    if (interfaceC3163lP.l(qVar)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i10 |= i22;
                }
                if (i13 == 8) {
                    i23 = i25;
                    if ((23967451 & i10) != 4793490) {
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                    }
                }
                i23 = i25;
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i23 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        fVar2 = f.Horizontal;
                    }
                    if (i13 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                        i10 &= -7169;
                    } else {
                        eG = e8;
                    }
                    if (i14 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i16 != 0) {
                        z9 = false;
                    }
                    if (i19 != 0) {
                        kVar2 = b.f12167a;
                    }
                    if (i21 != 0) {
                        z10 = z9;
                        kVar3 = kVar2;
                        fVar3 = fVar2;
                        qVarB = Y2.c.f12102a.b();
                        cVar2 = cVarM;
                        e9 = eG;
                        i24 = i10;
                        iVar4 = iVar3;
                    } else {
                        z10 = z9;
                        cVar2 = cVarM;
                        kVar3 = kVar2;
                        e9 = eG;
                        i24 = i10;
                        fVar3 = fVar2;
                        iVar4 = iVar3;
                        qVarB = qVar;
                    }
                } else {
                    if (i23 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        fVar2 = f.Horizontal;
                    }
                    if (i13 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                        i10 &= -7169;
                    } else {
                        eG = e8;
                    }
                    if (i14 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i16 != 0) {
                        z9 = false;
                    }
                    if (i19 != 0) {
                        kVar2 = b.f12167a;
                    }
                    if (i21 != 0) {
                        z10 = z9;
                        kVar3 = kVar2;
                        fVar3 = fVar2;
                        qVarB = Y2.c.f12102a.b();
                        cVar2 = cVarM;
                        e9 = eG;
                        i24 = i10;
                        iVar4 = iVar3;
                    } else {
                        z10 = z9;
                        cVar2 = cVarM;
                        kVar3 = kVar2;
                        e9 = eG;
                        i24 = i10;
                        fVar3 = fVar2;
                        iVar4 = iVar3;
                        qVarB = qVar;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-312399946, i24, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:55)");
                }
                int i21119 = i24;
                c cVar15 = new c(navigator, fVar3, e9);
                int i211110 = V2.b.f10520j | (i21119 & 14) | ((i21119 << 3) & 896);
                int i211111 = i21119 >> 3;
                e.a(navigator, cVar15, iVar4, cVar2, z10, kVar3, qVarB, interfaceC3163lP, (i211111 & 3670016) | i211110 | (i211111 & 7168) | (i211111 & i17) | (i211111 & 458752), 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                qVar2 = qVarB;
                z11 = z10;
                kVar4 = kVar3;
                e10 = e9;
                cVar3 = cVar2;
                fVar4 = fVar3;
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                }
            }
            i10 |= 1572864;
            kVar2 = kVar;
            i21 = i9 & 128;
            if (i21 != 0) {
                i10 |= 12582912;
            } else if ((i8 & 29360128) != 0) {
                if (interfaceC3163lP.l(qVar)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i10 |= i22;
            }
            if (i13 == 8) {
                i23 = i25;
                if ((23967451 & i10) != 4793490) {
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                }
            }
            i23 = i25;
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i23 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    fVar2 = f.Horizontal;
                }
                if (i13 != 0) {
                    eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                    i10 &= -7169;
                } else {
                    eG = e8;
                }
                if (i14 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i16 != 0) {
                    z9 = false;
                }
                if (i19 != 0) {
                    kVar2 = b.f12167a;
                }
                if (i21 != 0) {
                    z10 = z9;
                    kVar3 = kVar2;
                    fVar3 = fVar2;
                    qVarB = Y2.c.f12102a.b();
                    cVar2 = cVarM;
                    e9 = eG;
                    i24 = i10;
                    iVar4 = iVar3;
                } else {
                    z10 = z9;
                    cVar2 = cVarM;
                    kVar3 = kVar2;
                    e9 = eG;
                    i24 = i10;
                    fVar3 = fVar2;
                    iVar4 = iVar3;
                    qVarB = qVar;
                }
            } else {
                if (i23 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    fVar2 = f.Horizontal;
                }
                if (i13 != 0) {
                    eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                    i10 &= -7169;
                } else {
                    eG = e8;
                }
                if (i14 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i16 != 0) {
                    z9 = false;
                }
                if (i19 != 0) {
                    kVar2 = b.f12167a;
                }
                if (i21 != 0) {
                    z10 = z9;
                    kVar3 = kVar2;
                    fVar3 = fVar2;
                    qVarB = Y2.c.f12102a.b();
                    cVar2 = cVarM;
                    e9 = eG;
                    i24 = i10;
                    iVar4 = iVar3;
                } else {
                    z10 = z9;
                    cVar2 = cVarM;
                    kVar3 = kVar2;
                    e9 = eG;
                    i24 = i10;
                    fVar3 = fVar2;
                    iVar4 = iVar3;
                    qVarB = qVar;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-312399946, i24, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:55)");
            }
            int i211112 = i24;
            c cVar16 = new c(navigator, fVar3, e9);
            int i211113 = V2.b.f10520j | (i211112 & 14) | ((i211112 << 3) & 896);
            int i211114 = i211112 >> 3;
            e.a(navigator, cVar16, iVar4, cVar2, z10, kVar3, qVarB, interfaceC3163lP, (i211114 & 3670016) | i211113 | (i211114 & 7168) | (i211114 & i17) | (i211114 & 458752), 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            qVar2 = qVarB;
            z11 = z10;
            kVar4 = kVar3;
            e10 = e9;
            cVar3 = cVar2;
            fVar4 = fVar3;
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
            }
        }
        i10 |= 384;
        fVar2 = fVar;
        i13 = i9 & 8;
        if (i13 != 0) {
            i10 |= 1024;
        }
        i14 = i9 & 16;
        if (i14 != 0) {
            if ((i8 & 57344) == 0) {
                cVarM = cVar;
                if (interfaceC3163lP.R(cVarM)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i10 |= i15;
            }
            i16 = i9 & 32;
            if (i16 != 0) {
                i10 |= 196608;
                i17 = 57344;
                z9 = z8;
            } else {
                i17 = 57344;
                z9 = z8;
                if ((i8 & 458752) == 0) {
                    if (interfaceC3163lP.c(z9)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i10 |= i18;
                }
            }
            i19 = i9 & 64;
            if (i19 != 0) {
                if ((i8 & 3670016) == 0) {
                    kVar2 = kVar;
                    if (interfaceC3163lP.l(kVar2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i10 |= i20;
                }
                i21 = i9 & 128;
                if (i21 != 0) {
                    i10 |= 12582912;
                } else if ((i8 & 29360128) != 0) {
                    if (interfaceC3163lP.l(qVar)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i10 |= i22;
                }
                if (i13 == 8) {
                    i23 = i25;
                    if ((23967451 & i10) != 4793490) {
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                    }
                }
                i23 = i25;
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i23 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        fVar2 = f.Horizontal;
                    }
                    if (i13 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                        i10 &= -7169;
                    } else {
                        eG = e8;
                    }
                    if (i14 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i16 != 0) {
                        z9 = false;
                    }
                    if (i19 != 0) {
                        kVar2 = b.f12167a;
                    }
                    if (i21 != 0) {
                        z10 = z9;
                        kVar3 = kVar2;
                        fVar3 = fVar2;
                        qVarB = Y2.c.f12102a.b();
                        cVar2 = cVarM;
                        e9 = eG;
                        i24 = i10;
                        iVar4 = iVar3;
                    } else {
                        z10 = z9;
                        cVar2 = cVarM;
                        kVar3 = kVar2;
                        e9 = eG;
                        i24 = i10;
                        fVar3 = fVar2;
                        iVar4 = iVar3;
                        qVarB = qVar;
                    }
                } else {
                    if (i23 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        fVar2 = f.Horizontal;
                    }
                    if (i13 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                        i10 &= -7169;
                    } else {
                        eG = e8;
                    }
                    if (i14 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i16 != 0) {
                        z9 = false;
                    }
                    if (i19 != 0) {
                        kVar2 = b.f12167a;
                    }
                    if (i21 != 0) {
                        z10 = z9;
                        kVar3 = kVar2;
                        fVar3 = fVar2;
                        qVarB = Y2.c.f12102a.b();
                        cVar2 = cVarM;
                        e9 = eG;
                        i24 = i10;
                        iVar4 = iVar3;
                    } else {
                        z10 = z9;
                        cVar2 = cVarM;
                        kVar3 = kVar2;
                        e9 = eG;
                        i24 = i10;
                        fVar3 = fVar2;
                        iVar4 = iVar3;
                        qVarB = qVar;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-312399946, i24, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:55)");
                }
                int i211115 = i24;
                c cVar17 = new c(navigator, fVar3, e9);
                int i211116 = V2.b.f10520j | (i211115 & 14) | ((i211115 << 3) & 896);
                int i211117 = i211115 >> 3;
                e.a(navigator, cVar17, iVar4, cVar2, z10, kVar3, qVarB, interfaceC3163lP, (i211117 & 3670016) | i211116 | (i211117 & 7168) | (i211117 & i17) | (i211117 & 458752), 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                qVar2 = qVarB;
                z11 = z10;
                kVar4 = kVar3;
                e10 = e9;
                cVar3 = cVar2;
                fVar4 = fVar3;
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                }
            }
            i10 |= 1572864;
            kVar2 = kVar;
            i21 = i9 & 128;
            if (i21 != 0) {
                i10 |= 12582912;
            } else if ((i8 & 29360128) != 0) {
                if (interfaceC3163lP.l(qVar)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i10 |= i22;
            }
            if (i13 == 8) {
                i23 = i25;
                if ((23967451 & i10) != 4793490) {
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                }
            }
            i23 = i25;
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i23 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    fVar2 = f.Horizontal;
                }
                if (i13 != 0) {
                    eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                    i10 &= -7169;
                } else {
                    eG = e8;
                }
                if (i14 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i16 != 0) {
                    z9 = false;
                }
                if (i19 != 0) {
                    kVar2 = b.f12167a;
                }
                if (i21 != 0) {
                    z10 = z9;
                    kVar3 = kVar2;
                    fVar3 = fVar2;
                    qVarB = Y2.c.f12102a.b();
                    cVar2 = cVarM;
                    e9 = eG;
                    i24 = i10;
                    iVar4 = iVar3;
                } else {
                    z10 = z9;
                    cVar2 = cVarM;
                    kVar3 = kVar2;
                    e9 = eG;
                    i24 = i10;
                    fVar3 = fVar2;
                    iVar4 = iVar3;
                    qVarB = qVar;
                }
            } else {
                if (i23 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    fVar2 = f.Horizontal;
                }
                if (i13 != 0) {
                    eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                    i10 &= -7169;
                } else {
                    eG = e8;
                }
                if (i14 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i16 != 0) {
                    z9 = false;
                }
                if (i19 != 0) {
                    kVar2 = b.f12167a;
                }
                if (i21 != 0) {
                    z10 = z9;
                    kVar3 = kVar2;
                    fVar3 = fVar2;
                    qVarB = Y2.c.f12102a.b();
                    cVar2 = cVarM;
                    e9 = eG;
                    i24 = i10;
                    iVar4 = iVar3;
                } else {
                    z10 = z9;
                    cVar2 = cVarM;
                    kVar3 = kVar2;
                    e9 = eG;
                    i24 = i10;
                    fVar3 = fVar2;
                    iVar4 = iVar3;
                    qVarB = qVar;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-312399946, i24, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:55)");
            }
            int i211118 = i24;
            c cVar18 = new c(navigator, fVar3, e9);
            int i211119 = V2.b.f10520j | (i211118 & 14) | ((i211118 << 3) & 896);
            int i2111110 = i211118 >> 3;
            e.a(navigator, cVar18, iVar4, cVar2, z10, kVar3, qVarB, interfaceC3163lP, (i2111110 & 3670016) | i211119 | (i2111110 & 7168) | (i2111110 & i17) | (i2111110 & 458752), 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            qVar2 = qVarB;
            z11 = z10;
            kVar4 = kVar3;
            e10 = e9;
            cVar3 = cVar2;
            fVar4 = fVar3;
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
            }
        }
        i10 |= 24576;
        cVarM = cVar;
        i16 = i9 & 32;
        if (i16 != 0) {
            i10 |= 196608;
            i17 = 57344;
            z9 = z8;
        } else {
            i17 = 57344;
            z9 = z8;
            if ((i8 & 458752) == 0) {
                if (interfaceC3163lP.c(z9)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i10 |= i18;
            }
        }
        i19 = i9 & 64;
        if (i19 != 0) {
            if ((i8 & 3670016) == 0) {
                kVar2 = kVar;
                if (interfaceC3163lP.l(kVar2)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i10 |= i20;
            }
            i21 = i9 & 128;
            if (i21 != 0) {
                i10 |= 12582912;
            } else if ((i8 & 29360128) != 0) {
                if (interfaceC3163lP.l(qVar)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i10 |= i22;
            }
            if (i13 == 8) {
                i23 = i25;
                if ((23967451 & i10) != 4793490) {
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
                }
            }
            i23 = i25;
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i23 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    fVar2 = f.Horizontal;
                }
                if (i13 != 0) {
                    eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                    i10 &= -7169;
                } else {
                    eG = e8;
                }
                if (i14 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i16 != 0) {
                    z9 = false;
                }
                if (i19 != 0) {
                    kVar2 = b.f12167a;
                }
                if (i21 != 0) {
                    z10 = z9;
                    kVar3 = kVar2;
                    fVar3 = fVar2;
                    qVarB = Y2.c.f12102a.b();
                    cVar2 = cVarM;
                    e9 = eG;
                    i24 = i10;
                    iVar4 = iVar3;
                } else {
                    z10 = z9;
                    cVar2 = cVarM;
                    kVar3 = kVar2;
                    e9 = eG;
                    i24 = i10;
                    fVar3 = fVar2;
                    iVar4 = iVar3;
                    qVarB = qVar;
                }
            } else {
                if (i23 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    fVar2 = f.Horizontal;
                }
                if (i13 != 0) {
                    eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                    i10 &= -7169;
                } else {
                    eG = e8;
                }
                if (i14 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i16 != 0) {
                    z9 = false;
                }
                if (i19 != 0) {
                    kVar2 = b.f12167a;
                }
                if (i21 != 0) {
                    z10 = z9;
                    kVar3 = kVar2;
                    fVar3 = fVar2;
                    qVarB = Y2.c.f12102a.b();
                    cVar2 = cVarM;
                    e9 = eG;
                    i24 = i10;
                    iVar4 = iVar3;
                } else {
                    z10 = z9;
                    cVar2 = cVarM;
                    kVar3 = kVar2;
                    e9 = eG;
                    i24 = i10;
                    fVar3 = fVar2;
                    iVar4 = iVar3;
                    qVarB = qVar;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-312399946, i24, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:55)");
            }
            int i2111111 = i24;
            c cVar19 = new c(navigator, fVar3, e9);
            int i2111112 = V2.b.f10520j | (i2111111 & 14) | ((i2111111 << 3) & 896);
            int i2111113 = i2111111 >> 3;
            e.a(navigator, cVar19, iVar4, cVar2, z10, kVar3, qVarB, interfaceC3163lP, (i2111113 & 3670016) | i2111112 | (i2111113 & 7168) | (i2111113 & i17) | (i2111113 & 458752), 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            qVar2 = qVarB;
            z11 = z10;
            kVar4 = kVar3;
            e10 = e9;
            cVar3 = cVar2;
            fVar4 = fVar3;
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
            }
        }
        i10 |= 1572864;
        kVar2 = kVar;
        i21 = i9 & 128;
        if (i21 != 0) {
            i10 |= 12582912;
        } else if ((i8 & 29360128) != 0) {
            if (interfaceC3163lP.l(qVar)) {
                i22 = 8388608;
            } else {
                i22 = 4194304;
            }
            i10 |= i22;
        }
        if (i13 == 8) {
            i23 = i25;
            if ((23967451 & i10) != 4793490) {
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
            }
        }
        i23 = i25;
        interfaceC3163lP.o();
        if ((i8 & 1) != 0) {
            if (i23 != 0) {
                iVar3 = i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (i11 != 0) {
                fVar2 = f.Horizontal;
            }
            if (i13 != 0) {
                eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                i10 &= -7169;
            } else {
                eG = e8;
            }
            if (i14 != 0) {
                cVarM = L0.c.f4806a.m();
            }
            if (i16 != 0) {
                z9 = false;
            }
            if (i19 != 0) {
                kVar2 = b.f12167a;
            }
            if (i21 != 0) {
                z10 = z9;
                kVar3 = kVar2;
                fVar3 = fVar2;
                qVarB = Y2.c.f12102a.b();
                cVar2 = cVarM;
                e9 = eG;
                i24 = i10;
                iVar4 = iVar3;
            } else {
                z10 = z9;
                cVar2 = cVarM;
                kVar3 = kVar2;
                e9 = eG;
                i24 = i10;
                fVar3 = fVar2;
                iVar4 = iVar3;
                qVarB = qVar;
            }
        } else {
            if (i23 != 0) {
                iVar3 = i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (i11 != 0) {
                fVar2 = f.Horizontal;
            }
            if (i13 != 0) {
                eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                i10 &= -7169;
            } else {
                eG = e8;
            }
            if (i14 != 0) {
                cVarM = L0.c.f4806a.m();
            }
            if (i16 != 0) {
                z9 = false;
            }
            if (i19 != 0) {
                kVar2 = b.f12167a;
            }
            if (i21 != 0) {
                z10 = z9;
                kVar3 = kVar2;
                fVar3 = fVar2;
                qVarB = Y2.c.f12102a.b();
                cVar2 = cVarM;
                e9 = eG;
                i24 = i10;
                iVar4 = iVar3;
            } else {
                z10 = z9;
                cVar2 = cVarM;
                kVar3 = kVar2;
                e9 = eG;
                i24 = i10;
                fVar3 = fVar2;
                iVar4 = iVar3;
                qVarB = qVar;
            }
        }
        interfaceC3163lP.Q();
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-312399946, i24, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:55)");
        }
        int i2111114 = i24;
        c cVar110 = new c(navigator, fVar3, e9);
        int i2111115 = V2.b.f10520j | (i2111114 & 14) | ((i2111114 << 3) & 896);
        int i2111116 = i2111114 >> 3;
        e.a(navigator, cVar110, iVar4, cVar2, z10, kVar3, qVarB, interfaceC3163lP, (i2111116 & 3670016) | i2111115 | (i2111116 & 7168) | (i2111116 & i17) | (i2111116 & 458752), 0);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        qVar2 = qVarB;
        z11 = z10;
        kVar4 = kVar3;
        e10 = e9;
        cVar3 = cVar2;
        fVar4 = fVar3;
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new d(navigator, iVar4, fVar4, e10, cVar3, z11, kVar4, qVar2, i8, i9));
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x0068  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:83:0x0122  */
    /* JADX WARN: Code duplicated, block: B:87:0x012f  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public static final void b(V2.b navigator, i iVar, f fVar, E e8, q qVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        f fVar2;
        int i11;
        int i12;
        q qVar2;
        int i13;
        i iVar2;
        f fVar3;
        E eG;
        int i14;
        f fVar4;
        q qVarA;
        E e9;
        q qVar3;
        f fVar5;
        i iVar3;
        P0 p0V;
        t.g(navigator, "navigator");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1074102154);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.R(navigator) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        int i15 = i9 & 2;
        if (i15 != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            i10 |= interfaceC3163lP.R(iVar) ? 32 : 16;
        }
        int i16 = i9 & 4;
        if (i16 == 0) {
            if ((i8 & 896) == 0) {
                fVar2 = fVar;
                i10 |= interfaceC3163lP.R(fVar2) ? 256 : 128;
            }
            i11 = i9 & 8;
            if (i11 != 0) {
                i10 |= 1024;
            }
            i12 = i9 & 16;
            if (i12 != 0) {
                if ((57344 & i8) == 0) {
                    qVar2 = qVar;
                    if (interfaceC3163lP.l(qVar2)) {
                        i13 = 16384;
                    } else {
                        i13 = 8192;
                    }
                    i10 |= i13;
                }
                if (i11 != 8 && (46811 & i10) == 9362 && interfaceC3163lP.s()) {
                    interfaceC3163lP.z();
                    iVar3 = iVar;
                    e9 = e8;
                    fVar5 = fVar2;
                    qVar3 = qVar2;
                } else {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0 || interfaceC3163lP.F()) {
                        if (i15 != 0) {
                            iVar2 = i.f4836a;
                        } else {
                            iVar2 = iVar;
                        }
                        if (i16 != 0) {
                            fVar3 = f.Horizontal;
                        } else {
                            fVar3 = fVar2;
                        }
                        if (i11 != 0) {
                            eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                            i10 &= -7169;
                        } else {
                            eG = e8;
                        }
                        if (i12 != 0) {
                            f fVar6 = fVar3;
                            i14 = i10;
                            fVar4 = fVar6;
                            qVarA = Y2.c.f12102a.a();
                        } else {
                            f fVar7 = fVar3;
                            i14 = i10;
                            fVar4 = fVar7;
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-1074102154, i14, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:30)");
                        }
                        i iVar4 = iVar2;
                        E e10 = eG;
                        a(navigator, iVar4, fVar4, e10, null, false, null, qVarA, interfaceC3163lP, 200704 | V2.b.f10520j | (i14 & 14) | (i14 & 112) | (i14 & 896) | ((i14 << 9) & 29360128), 80);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        e9 = e10;
                        qVar3 = qVarA;
                        fVar5 = fVar4;
                        iVar3 = iVar4;
                    } else {
                        interfaceC3163lP.z();
                        if (i11 != 0) {
                            i10 &= -7169;
                        }
                        iVar2 = iVar;
                        eG = e8;
                        i14 = i10;
                        fVar4 = fVar2;
                    }
                    qVarA = qVar2;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-1074102154, i14, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:30)");
                    }
                    i iVar5 = iVar2;
                    E e11 = eG;
                    a(navigator, iVar5, fVar4, e11, null, false, null, qVarA, interfaceC3163lP, 200704 | V2.b.f10520j | (i14 & 14) | (i14 & 112) | (i14 & 896) | ((i14 << 9) & 29360128), 80);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    e9 = e11;
                    qVar3 = qVarA;
                    fVar5 = fVar4;
                    iVar3 = iVar5;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new a(navigator, iVar3, fVar5, e9, qVar3, i8, i9));
                }
            }
            i10 |= 24576;
            qVar2 = qVar;
            if (i11 != 8) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i15 != 0) {
                        iVar2 = i.f4836a;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i16 != 0) {
                        fVar3 = f.Horizontal;
                    } else {
                        fVar3 = fVar2;
                    }
                    if (i11 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                        i10 &= -7169;
                    } else {
                        eG = e8;
                    }
                    if (i12 != 0) {
                        f fVar8 = fVar3;
                        i14 = i10;
                        fVar4 = fVar8;
                        qVarA = Y2.c.f12102a.a();
                    } else {
                        f fVar9 = fVar3;
                        i14 = i10;
                        fVar4 = fVar9;
                        qVarA = qVar2;
                    }
                } else {
                    if (i15 != 0) {
                        iVar2 = i.f4836a;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i16 != 0) {
                        fVar3 = f.Horizontal;
                    } else {
                        fVar3 = fVar2;
                    }
                    if (i11 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                        i10 &= -7169;
                    } else {
                        eG = e8;
                    }
                    if (i12 != 0) {
                        f fVar10 = fVar3;
                        i14 = i10;
                        fVar4 = fVar10;
                        qVarA = Y2.c.f12102a.a();
                    } else {
                        f fVar11 = fVar3;
                        i14 = i10;
                        fVar4 = fVar11;
                        qVarA = qVar2;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1074102154, i14, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:30)");
                }
                i iVar6 = iVar2;
                E e12 = eG;
                a(navigator, iVar6, fVar4, e12, null, false, null, qVarA, interfaceC3163lP, 200704 | V2.b.f10520j | (i14 & 14) | (i14 & 112) | (i14 & 896) | ((i14 << 9) & 29360128), 80);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                e9 = e12;
                qVar3 = qVarA;
                fVar5 = fVar4;
                iVar3 = iVar6;
            } else {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i15 != 0) {
                        iVar2 = i.f4836a;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i16 != 0) {
                        fVar3 = f.Horizontal;
                    } else {
                        fVar3 = fVar2;
                    }
                    if (i11 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                        i10 &= -7169;
                    } else {
                        eG = e8;
                    }
                    if (i12 != 0) {
                        f fVar12 = fVar3;
                        i14 = i10;
                        fVar4 = fVar12;
                        qVarA = Y2.c.f12102a.a();
                    } else {
                        f fVar13 = fVar3;
                        i14 = i10;
                        fVar4 = fVar13;
                        qVarA = qVar2;
                    }
                } else {
                    if (i15 != 0) {
                        iVar2 = i.f4836a;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i16 != 0) {
                        fVar3 = f.Horizontal;
                    } else {
                        fVar3 = fVar2;
                    }
                    if (i11 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                        i10 &= -7169;
                    } else {
                        eG = e8;
                    }
                    if (i12 != 0) {
                        f fVar14 = fVar3;
                        i14 = i10;
                        fVar4 = fVar14;
                        qVarA = Y2.c.f12102a.a();
                    } else {
                        f fVar15 = fVar3;
                        i14 = i10;
                        fVar4 = fVar15;
                        qVarA = qVar2;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1074102154, i14, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:30)");
                }
                i iVar7 = iVar2;
                E e13 = eG;
                a(navigator, iVar7, fVar4, e13, null, false, null, qVarA, interfaceC3163lP, 200704 | V2.b.f10520j | (i14 & 14) | (i14 & 112) | (i14 & 896) | ((i14 << 9) & 29360128), 80);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                e9 = e13;
                qVar3 = qVarA;
                fVar5 = fVar4;
                iVar3 = iVar7;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new a(navigator, iVar3, fVar5, e9, qVar3, i8, i9));
            }
        }
        i10 |= 384;
        fVar2 = fVar;
        i11 = i9 & 8;
        if (i11 != 0) {
            i10 |= 1024;
        }
        i12 = i9 & 16;
        if (i12 != 0) {
            if ((57344 & i8) == 0) {
                qVar2 = qVar;
                if (interfaceC3163lP.l(qVar2)) {
                    i13 = 16384;
                } else {
                    i13 = 8192;
                }
                i10 |= i13;
            }
            if (i11 != 8) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i15 != 0) {
                        iVar2 = i.f4836a;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i16 != 0) {
                        fVar3 = f.Horizontal;
                    } else {
                        fVar3 = fVar2;
                    }
                    if (i11 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                        i10 &= -7169;
                    } else {
                        eG = e8;
                    }
                    if (i12 != 0) {
                        f fVar16 = fVar3;
                        i14 = i10;
                        fVar4 = fVar16;
                        qVarA = Y2.c.f12102a.a();
                    } else {
                        f fVar17 = fVar3;
                        i14 = i10;
                        fVar4 = fVar17;
                        qVarA = qVar2;
                    }
                } else {
                    if (i15 != 0) {
                        iVar2 = i.f4836a;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i16 != 0) {
                        fVar3 = f.Horizontal;
                    } else {
                        fVar3 = fVar2;
                    }
                    if (i11 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                        i10 &= -7169;
                    } else {
                        eG = e8;
                    }
                    if (i12 != 0) {
                        f fVar18 = fVar3;
                        i14 = i10;
                        fVar4 = fVar18;
                        qVarA = Y2.c.f12102a.a();
                    } else {
                        f fVar19 = fVar3;
                        i14 = i10;
                        fVar4 = fVar19;
                        qVarA = qVar2;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1074102154, i14, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:30)");
                }
                i iVar8 = iVar2;
                E e14 = eG;
                a(navigator, iVar8, fVar4, e14, null, false, null, qVarA, interfaceC3163lP, 200704 | V2.b.f10520j | (i14 & 14) | (i14 & 112) | (i14 & 896) | ((i14 << 9) & 29360128), 80);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                e9 = e14;
                qVar3 = qVarA;
                fVar5 = fVar4;
                iVar3 = iVar8;
            } else {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i15 != 0) {
                        iVar2 = i.f4836a;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i16 != 0) {
                        fVar3 = f.Horizontal;
                    } else {
                        fVar3 = fVar2;
                    }
                    if (i11 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                        i10 &= -7169;
                    } else {
                        eG = e8;
                    }
                    if (i12 != 0) {
                        f fVar110 = fVar3;
                        i14 = i10;
                        fVar4 = fVar110;
                        qVarA = Y2.c.f12102a.a();
                    } else {
                        f fVar111 = fVar3;
                        i14 = i10;
                        fVar4 = fVar111;
                        qVarA = qVar2;
                    }
                } else {
                    if (i15 != 0) {
                        iVar2 = i.f4836a;
                    } else {
                        iVar2 = iVar;
                    }
                    if (i16 != 0) {
                        fVar3 = f.Horizontal;
                    } else {
                        fVar3 = fVar2;
                    }
                    if (i11 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                        i10 &= -7169;
                    } else {
                        eG = e8;
                    }
                    if (i12 != 0) {
                        f fVar112 = fVar3;
                        i14 = i10;
                        fVar4 = fVar112;
                        qVarA = Y2.c.f12102a.a();
                    } else {
                        f fVar113 = fVar3;
                        i14 = i10;
                        fVar4 = fVar113;
                        qVarA = qVar2;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1074102154, i14, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:30)");
                }
                i iVar9 = iVar2;
                E e15 = eG;
                a(navigator, iVar9, fVar4, e15, null, false, null, qVarA, interfaceC3163lP, 200704 | V2.b.f10520j | (i14 & 14) | (i14 & 112) | (i14 & 896) | ((i14 << 9) & 29360128), 80);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                e9 = e15;
                qVar3 = qVarA;
                fVar5 = fVar4;
                iVar3 = iVar9;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new a(navigator, iVar3, fVar5, e9, qVar3, i8, i9));
            }
        }
        i10 |= 24576;
        qVar2 = qVar;
        if (i11 != 8) {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i15 != 0) {
                    iVar2 = i.f4836a;
                } else {
                    iVar2 = iVar;
                }
                if (i16 != 0) {
                    fVar3 = f.Horizontal;
                } else {
                    fVar3 = fVar2;
                }
                if (i11 != 0) {
                    eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                    i10 &= -7169;
                } else {
                    eG = e8;
                }
                if (i12 != 0) {
                    f fVar114 = fVar3;
                    i14 = i10;
                    fVar4 = fVar114;
                    qVarA = Y2.c.f12102a.a();
                } else {
                    f fVar115 = fVar3;
                    i14 = i10;
                    fVar4 = fVar115;
                    qVarA = qVar2;
                }
            } else {
                if (i15 != 0) {
                    iVar2 = i.f4836a;
                } else {
                    iVar2 = iVar;
                }
                if (i16 != 0) {
                    fVar3 = f.Horizontal;
                } else {
                    fVar3 = fVar2;
                }
                if (i11 != 0) {
                    eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                    i10 &= -7169;
                } else {
                    eG = e8;
                }
                if (i12 != 0) {
                    f fVar116 = fVar3;
                    i14 = i10;
                    fVar4 = fVar116;
                    qVarA = Y2.c.f12102a.a();
                } else {
                    f fVar117 = fVar3;
                    i14 = i10;
                    fVar4 = fVar117;
                    qVarA = qVar2;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1074102154, i14, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:30)");
            }
            i iVar10 = iVar2;
            E e16 = eG;
            a(navigator, iVar10, fVar4, e16, null, false, null, qVarA, interfaceC3163lP, 200704 | V2.b.f10520j | (i14 & 14) | (i14 & 112) | (i14 & 896) | ((i14 << 9) & 29360128), 80);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            e9 = e16;
            qVar3 = qVarA;
            fVar5 = fVar4;
            iVar3 = iVar10;
        } else {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i15 != 0) {
                    iVar2 = i.f4836a;
                } else {
                    iVar2 = iVar;
                }
                if (i16 != 0) {
                    fVar3 = f.Horizontal;
                } else {
                    fVar3 = fVar2;
                }
                if (i11 != 0) {
                    eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                    i10 &= -7169;
                } else {
                    eG = e8;
                }
                if (i12 != 0) {
                    f fVar118 = fVar3;
                    i14 = i10;
                    fVar4 = fVar118;
                    qVarA = Y2.c.f12102a.a();
                } else {
                    f fVar119 = fVar3;
                    i14 = i10;
                    fVar4 = fVar119;
                    qVarA = qVar2;
                }
            } else {
                if (i15 != 0) {
                    iVar2 = i.f4836a;
                } else {
                    iVar2 = iVar;
                }
                if (i16 != 0) {
                    fVar3 = f.Horizontal;
                } else {
                    fVar3 = fVar2;
                }
                if (i11 != 0) {
                    eG = AbstractC2214j.g(0.0f, 400.0f, n.b(x0.c(n.f446b)), 1, null);
                    i10 &= -7169;
                } else {
                    eG = e8;
                }
                if (i12 != 0) {
                    f fVar1110 = fVar3;
                    i14 = i10;
                    fVar4 = fVar1110;
                    qVarA = Y2.c.f12102a.a();
                } else {
                    f fVar1111 = fVar3;
                    i14 = i10;
                    fVar4 = fVar1111;
                    qVarA = qVar2;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1074102154, i14, -1, "cafe.adriel.voyager.transitions.SlideTransition (SlideTransition.kt:30)");
            }
            i iVar11 = iVar2;
            E e17 = eG;
            a(navigator, iVar11, fVar4, e17, null, false, null, qVarA, interfaceC3163lP, 200704 | V2.b.f10520j | (i14 & 14) | (i14 & 112) | (i14 & 896) | ((i14 << 9) & 29360128), 80);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            e9 = e17;
            qVar3 = qVarA;
            fVar5 = fVar4;
            iVar3 = iVar11;
        }
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new a(navigator, iVar3, fVar5, e9, qVar3, i8, i9));
        }
    }
}
