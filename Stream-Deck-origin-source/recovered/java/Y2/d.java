package Y2;

import C6.G;
import L0.i;
import Q6.k;
import Q6.o;
import Q6.q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p037e0.AbstractC2214j;
import p037e0.E;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V2.b f12107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f12108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ E f12109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q f12110d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f12111e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f12112f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(V2.b bVar, i iVar, E e8, q qVar, int i8, int i9) {
            super(2);
            this.f12107a = bVar;
            this.f12108b = iVar;
            this.f12109c = e8;
            this.f12110d = qVar;
            this.f12111e = i8;
            this.f12112f = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            d.b(this.f12107a, this.f12108b, this.f12109c, this.f12110d, interfaceC3163l, F0.a(this.f12111e | 1), this.f12112f);
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
        public static final b f12113a = new b();

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
        public final /* synthetic */ E f12114a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(E e8) {
            super(1);
            this.f12114a = e8;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p028d0.k invoke(androidx.compose.animation.c ScreenTransition) {
            t.g(ScreenTransition, "$this$ScreenTransition");
            return androidx.compose.animation.a.e(androidx.compose.animation.e.m(this.f12114a, 0.0f, 2, null), androidx.compose.animation.e.o(this.f12114a, 0.0f, 2, null));
        }
    }

    /* JADX INFO: renamed from: Y2.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0307d extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V2.b f12115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f12116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ E f12117c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ L0.c f12118d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f12119e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ k f12120f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ q f12121g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f12122h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f12123i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0307d(V2.b bVar, i iVar, E e8, L0.c cVar, boolean z8, k kVar, q qVar, int i8, int i9) {
            super(2);
            this.f12115a = bVar;
            this.f12116b = iVar;
            this.f12117c = e8;
            this.f12118d = cVar;
            this.f12119e = z8;
            this.f12120f = kVar;
            this.f12121g = qVar;
            this.f12122h = i8;
            this.f12123i = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            d.a(this.f12115a, this.f12116b, this.f12117c, this.f12118d, this.f12119e, this.f12120f, this.f12121g, interfaceC3163l, F0.a(this.f12122h | 1), this.f12123i);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x016a  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:84:0x0101  */
    /* JADX WARN: Code duplicated, block: B:86:0x010a  */
    /* JADX WARN: Code duplicated, block: B:87:0x010c  */
    /* JADX WARN: Code duplicated, block: B:89:0x010f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0112  */
    /* JADX WARN: Code duplicated, block: B:92:0x0115  */
    /* JADX WARN: Code duplicated, block: B:93:0x011c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0123  */
    /* JADX WARN: Code duplicated, block: B:99:0x015a  */
    public static final void a(V2.b navigator, i iVar, E e8, L0.c cVar, boolean z8, k kVar, q qVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        i iVar2;
        int i11;
        int i12;
        L0.c cVarM;
        int i13;
        int i14;
        boolean z9;
        int i15;
        int i16;
        int i17;
        k kVar2;
        int i18;
        int i19;
        q qVar2;
        int i20;
        i iVar3;
        E eG;
        boolean z10;
        k kVar3;
        q qVarB;
        i iVar4;
        q qVar3;
        k kVar4;
        boolean z11;
        L0.c cVar2;
        E e9;
        P0 p0V;
        t.g(navigator, "navigator");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(33636071);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.R(navigator) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        int i21 = i9 & 2;
        if (i21 == 0) {
            if ((i8 & 112) == 0) {
                iVar2 = iVar;
                i10 |= interfaceC3163lP.R(iVar2) ? 32 : 16;
            }
            i11 = i9 & 4;
            if (i11 != 0) {
                i10 |= 128;
            }
            i12 = i9 & 8;
            if (i12 != 0) {
                if ((i8 & 7168) == 0) {
                    cVarM = cVar;
                    if (interfaceC3163lP.R(cVarM)) {
                        i13 = 2048;
                    } else {
                        i13 = 1024;
                    }
                    i10 |= i13;
                }
                i14 = i9 & 16;
                if (i14 != 0) {
                    if ((i8 & 57344) == 0) {
                        z9 = z8;
                        if (interfaceC3163lP.c(z9)) {
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
                        kVar2 = kVar;
                    } else {
                        i17 = 57344;
                        kVar2 = kVar;
                        if ((i8 & 458752) == 0) {
                            if (interfaceC3163lP.l(kVar2)) {
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
                            qVar2 = qVar;
                            if (interfaceC3163lP.l(qVar2)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i10 |= i20;
                        }
                        if (i11 != 4 && (2995931 & i10) == 599186 && interfaceC3163lP.s()) {
                            interfaceC3163lP.z();
                            e9 = e8;
                            iVar4 = iVar2;
                            cVar2 = cVarM;
                            kVar4 = kVar2;
                            z11 = z9;
                            qVar3 = qVar2;
                        } else {
                            if (i21 != 0) {
                                iVar3 = i.f4836a;
                            } else {
                                iVar3 = iVar2;
                            }
                            if (i11 != 0) {
                                eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                            } else {
                                eG = e8;
                            }
                            if (i12 != 0) {
                                cVarM = L0.c.f4806a.m();
                            }
                            if (i14 != 0) {
                                z10 = false;
                            } else {
                                z10 = z9;
                            }
                            if (i16 != 0) {
                                kVar3 = b.f12113a;
                            } else {
                                kVar3 = kVar2;
                            }
                            if (i19 != 0) {
                                qVarB = Y2.a.f12086a.b();
                            } else {
                                qVarB = qVar2;
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                            }
                            i iVar5 = iVar3;
                            E e10 = eG;
                            L0.c cVar3 = cVarM;
                            e.a(navigator, new c(eG), iVar5, cVar3, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            iVar4 = iVar5;
                            qVar3 = qVarB;
                            kVar4 = kVar3;
                            z11 = z10;
                            cVar2 = cVar3;
                            e9 = e10;
                        }
                        p0V = interfaceC3163lP.v();
                        if (p0V != null) {
                            p0V.a(new C0307d(navigator, iVar4, e9, cVar2, z11, kVar4, qVar3, i8, i9));
                        }
                    }
                    i10 |= 1572864;
                    qVar2 = qVar;
                    if (i11 != 4) {
                        if (i21 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                        } else {
                            eG = e8;
                        }
                        if (i12 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i14 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i16 != 0) {
                            kVar3 = b.f12113a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i19 != 0) {
                            qVarB = Y2.a.f12086a.b();
                        } else {
                            qVarB = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                        }
                        i iVar6 = iVar3;
                        E e11 = eG;
                        L0.c cVar4 = cVarM;
                        e.a(navigator, new c(eG), iVar6, cVar4, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar4 = iVar6;
                        qVar3 = qVarB;
                        kVar4 = kVar3;
                        z11 = z10;
                        cVar2 = cVar4;
                        e9 = e11;
                    } else {
                        if (i21 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                        } else {
                            eG = e8;
                        }
                        if (i12 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i14 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i16 != 0) {
                            kVar3 = b.f12113a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i19 != 0) {
                            qVarB = Y2.a.f12086a.b();
                        } else {
                            qVarB = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                        }
                        i iVar7 = iVar3;
                        E e12 = eG;
                        L0.c cVar5 = cVarM;
                        e.a(navigator, new c(eG), iVar7, cVar5, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar4 = iVar7;
                        qVar3 = qVarB;
                        kVar4 = kVar3;
                        z11 = z10;
                        cVar2 = cVar5;
                        e9 = e12;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new C0307d(navigator, iVar4, e9, cVar2, z11, kVar4, qVar3, i8, i9));
                    }
                }
                i10 |= 24576;
                z9 = z8;
                i16 = i9 & 32;
                if (i16 != 0) {
                    i10 |= 196608;
                    i17 = 57344;
                    kVar2 = kVar;
                } else {
                    i17 = 57344;
                    kVar2 = kVar;
                    if ((i8 & 458752) == 0) {
                        if (interfaceC3163lP.l(kVar2)) {
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
                        qVar2 = qVar;
                        if (interfaceC3163lP.l(qVar2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i10 |= i20;
                    }
                    if (i11 != 4) {
                        if (i21 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                        } else {
                            eG = e8;
                        }
                        if (i12 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i14 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i16 != 0) {
                            kVar3 = b.f12113a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i19 != 0) {
                            qVarB = Y2.a.f12086a.b();
                        } else {
                            qVarB = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                        }
                        i iVar8 = iVar3;
                        E e13 = eG;
                        L0.c cVar6 = cVarM;
                        e.a(navigator, new c(eG), iVar8, cVar6, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar4 = iVar8;
                        qVar3 = qVarB;
                        kVar4 = kVar3;
                        z11 = z10;
                        cVar2 = cVar6;
                        e9 = e13;
                    } else {
                        if (i21 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                        } else {
                            eG = e8;
                        }
                        if (i12 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i14 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i16 != 0) {
                            kVar3 = b.f12113a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i19 != 0) {
                            qVarB = Y2.a.f12086a.b();
                        } else {
                            qVarB = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                        }
                        i iVar9 = iVar3;
                        E e14 = eG;
                        L0.c cVar7 = cVarM;
                        e.a(navigator, new c(eG), iVar9, cVar7, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar4 = iVar9;
                        qVar3 = qVarB;
                        kVar4 = kVar3;
                        z11 = z10;
                        cVar2 = cVar7;
                        e9 = e14;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new C0307d(navigator, iVar4, e9, cVar2, z11, kVar4, qVar3, i8, i9));
                    }
                }
                i10 |= 1572864;
                qVar2 = qVar;
                if (i11 != 4) {
                    if (i21 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                    } else {
                        eG = e8;
                    }
                    if (i12 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i14 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i16 != 0) {
                        kVar3 = b.f12113a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i19 != 0) {
                        qVarB = Y2.a.f12086a.b();
                    } else {
                        qVarB = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                    }
                    i iVar10 = iVar3;
                    E e15 = eG;
                    L0.c cVar8 = cVarM;
                    e.a(navigator, new c(eG), iVar10, cVar8, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar10;
                    qVar3 = qVarB;
                    kVar4 = kVar3;
                    z11 = z10;
                    cVar2 = cVar8;
                    e9 = e15;
                } else {
                    if (i21 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                    } else {
                        eG = e8;
                    }
                    if (i12 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i14 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i16 != 0) {
                        kVar3 = b.f12113a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i19 != 0) {
                        qVarB = Y2.a.f12086a.b();
                    } else {
                        qVarB = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                    }
                    i iVar11 = iVar3;
                    E e16 = eG;
                    L0.c cVar9 = cVarM;
                    e.a(navigator, new c(eG), iVar11, cVar9, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar11;
                    qVar3 = qVarB;
                    kVar4 = kVar3;
                    z11 = z10;
                    cVar2 = cVar9;
                    e9 = e16;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new C0307d(navigator, iVar4, e9, cVar2, z11, kVar4, qVar3, i8, i9));
                }
            }
            i10 |= 3072;
            cVarM = cVar;
            i14 = i9 & 16;
            if (i14 != 0) {
                if ((i8 & 57344) == 0) {
                    z9 = z8;
                    if (interfaceC3163lP.c(z9)) {
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
                    kVar2 = kVar;
                } else {
                    i17 = 57344;
                    kVar2 = kVar;
                    if ((i8 & 458752) == 0) {
                        if (interfaceC3163lP.l(kVar2)) {
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
                        qVar2 = qVar;
                        if (interfaceC3163lP.l(qVar2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i10 |= i20;
                    }
                    if (i11 != 4) {
                        if (i21 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                        } else {
                            eG = e8;
                        }
                        if (i12 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i14 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i16 != 0) {
                            kVar3 = b.f12113a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i19 != 0) {
                            qVarB = Y2.a.f12086a.b();
                        } else {
                            qVarB = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                        }
                        i iVar12 = iVar3;
                        E e17 = eG;
                        L0.c cVar10 = cVarM;
                        e.a(navigator, new c(eG), iVar12, cVar10, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar4 = iVar12;
                        qVar3 = qVarB;
                        kVar4 = kVar3;
                        z11 = z10;
                        cVar2 = cVar10;
                        e9 = e17;
                    } else {
                        if (i21 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                        } else {
                            eG = e8;
                        }
                        if (i12 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i14 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i16 != 0) {
                            kVar3 = b.f12113a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i19 != 0) {
                            qVarB = Y2.a.f12086a.b();
                        } else {
                            qVarB = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                        }
                        i iVar13 = iVar3;
                        E e18 = eG;
                        L0.c cVar11 = cVarM;
                        e.a(navigator, new c(eG), iVar13, cVar11, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar4 = iVar13;
                        qVar3 = qVarB;
                        kVar4 = kVar3;
                        z11 = z10;
                        cVar2 = cVar11;
                        e9 = e18;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new C0307d(navigator, iVar4, e9, cVar2, z11, kVar4, qVar3, i8, i9));
                    }
                }
                i10 |= 1572864;
                qVar2 = qVar;
                if (i11 != 4) {
                    if (i21 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                    } else {
                        eG = e8;
                    }
                    if (i12 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i14 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i16 != 0) {
                        kVar3 = b.f12113a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i19 != 0) {
                        qVarB = Y2.a.f12086a.b();
                    } else {
                        qVarB = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                    }
                    i iVar14 = iVar3;
                    E e19 = eG;
                    L0.c cVar12 = cVarM;
                    e.a(navigator, new c(eG), iVar14, cVar12, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar14;
                    qVar3 = qVarB;
                    kVar4 = kVar3;
                    z11 = z10;
                    cVar2 = cVar12;
                    e9 = e19;
                } else {
                    if (i21 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                    } else {
                        eG = e8;
                    }
                    if (i12 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i14 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i16 != 0) {
                        kVar3 = b.f12113a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i19 != 0) {
                        qVarB = Y2.a.f12086a.b();
                    } else {
                        qVarB = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                    }
                    i iVar15 = iVar3;
                    E e110 = eG;
                    L0.c cVar13 = cVarM;
                    e.a(navigator, new c(eG), iVar15, cVar13, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar15;
                    qVar3 = qVarB;
                    kVar4 = kVar3;
                    z11 = z10;
                    cVar2 = cVar13;
                    e9 = e110;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new C0307d(navigator, iVar4, e9, cVar2, z11, kVar4, qVar3, i8, i9));
                }
            }
            i10 |= 24576;
            z9 = z8;
            i16 = i9 & 32;
            if (i16 != 0) {
                i10 |= 196608;
                i17 = 57344;
                kVar2 = kVar;
            } else {
                i17 = 57344;
                kVar2 = kVar;
                if ((i8 & 458752) == 0) {
                    if (interfaceC3163lP.l(kVar2)) {
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
                    qVar2 = qVar;
                    if (interfaceC3163lP.l(qVar2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i10 |= i20;
                }
                if (i11 != 4) {
                    if (i21 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                    } else {
                        eG = e8;
                    }
                    if (i12 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i14 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i16 != 0) {
                        kVar3 = b.f12113a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i19 != 0) {
                        qVarB = Y2.a.f12086a.b();
                    } else {
                        qVarB = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                    }
                    i iVar16 = iVar3;
                    E e111 = eG;
                    L0.c cVar14 = cVarM;
                    e.a(navigator, new c(eG), iVar16, cVar14, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar16;
                    qVar3 = qVarB;
                    kVar4 = kVar3;
                    z11 = z10;
                    cVar2 = cVar14;
                    e9 = e111;
                } else {
                    if (i21 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                    } else {
                        eG = e8;
                    }
                    if (i12 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i14 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i16 != 0) {
                        kVar3 = b.f12113a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i19 != 0) {
                        qVarB = Y2.a.f12086a.b();
                    } else {
                        qVarB = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                    }
                    i iVar17 = iVar3;
                    E e112 = eG;
                    L0.c cVar15 = cVarM;
                    e.a(navigator, new c(eG), iVar17, cVar15, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar17;
                    qVar3 = qVarB;
                    kVar4 = kVar3;
                    z11 = z10;
                    cVar2 = cVar15;
                    e9 = e112;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new C0307d(navigator, iVar4, e9, cVar2, z11, kVar4, qVar3, i8, i9));
                }
            }
            i10 |= 1572864;
            qVar2 = qVar;
            if (i11 != 4) {
                if (i21 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                } else {
                    eG = e8;
                }
                if (i12 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i14 != 0) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (i16 != 0) {
                    kVar3 = b.f12113a;
                } else {
                    kVar3 = kVar2;
                }
                if (i19 != 0) {
                    qVarB = Y2.a.f12086a.b();
                } else {
                    qVarB = qVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                }
                i iVar18 = iVar3;
                E e113 = eG;
                L0.c cVar16 = cVarM;
                e.a(navigator, new c(eG), iVar18, cVar16, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar18;
                qVar3 = qVarB;
                kVar4 = kVar3;
                z11 = z10;
                cVar2 = cVar16;
                e9 = e113;
            } else {
                if (i21 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                } else {
                    eG = e8;
                }
                if (i12 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i14 != 0) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (i16 != 0) {
                    kVar3 = b.f12113a;
                } else {
                    kVar3 = kVar2;
                }
                if (i19 != 0) {
                    qVarB = Y2.a.f12086a.b();
                } else {
                    qVarB = qVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                }
                i iVar19 = iVar3;
                E e114 = eG;
                L0.c cVar17 = cVarM;
                e.a(navigator, new c(eG), iVar19, cVar17, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar19;
                qVar3 = qVarB;
                kVar4 = kVar3;
                z11 = z10;
                cVar2 = cVar17;
                e9 = e114;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new C0307d(navigator, iVar4, e9, cVar2, z11, kVar4, qVar3, i8, i9));
            }
        }
        i10 |= 48;
        iVar2 = iVar;
        i11 = i9 & 4;
        if (i11 != 0) {
            i10 |= 128;
        }
        i12 = i9 & 8;
        if (i12 != 0) {
            if ((i8 & 7168) == 0) {
                cVarM = cVar;
                if (interfaceC3163lP.R(cVarM)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i10 |= i13;
            }
            i14 = i9 & 16;
            if (i14 != 0) {
                if ((i8 & 57344) == 0) {
                    z9 = z8;
                    if (interfaceC3163lP.c(z9)) {
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
                    kVar2 = kVar;
                } else {
                    i17 = 57344;
                    kVar2 = kVar;
                    if ((i8 & 458752) == 0) {
                        if (interfaceC3163lP.l(kVar2)) {
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
                        qVar2 = qVar;
                        if (interfaceC3163lP.l(qVar2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i10 |= i20;
                    }
                    if (i11 != 4) {
                        if (i21 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                        } else {
                            eG = e8;
                        }
                        if (i12 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i14 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i16 != 0) {
                            kVar3 = b.f12113a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i19 != 0) {
                            qVarB = Y2.a.f12086a.b();
                        } else {
                            qVarB = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                        }
                        i iVar110 = iVar3;
                        E e115 = eG;
                        L0.c cVar18 = cVarM;
                        e.a(navigator, new c(eG), iVar110, cVar18, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar4 = iVar110;
                        qVar3 = qVarB;
                        kVar4 = kVar3;
                        z11 = z10;
                        cVar2 = cVar18;
                        e9 = e115;
                    } else {
                        if (i21 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                        } else {
                            eG = e8;
                        }
                        if (i12 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i14 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i16 != 0) {
                            kVar3 = b.f12113a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i19 != 0) {
                            qVarB = Y2.a.f12086a.b();
                        } else {
                            qVarB = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                        }
                        i iVar111 = iVar3;
                        E e116 = eG;
                        L0.c cVar19 = cVarM;
                        e.a(navigator, new c(eG), iVar111, cVar19, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar4 = iVar111;
                        qVar3 = qVarB;
                        kVar4 = kVar3;
                        z11 = z10;
                        cVar2 = cVar19;
                        e9 = e116;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new C0307d(navigator, iVar4, e9, cVar2, z11, kVar4, qVar3, i8, i9));
                    }
                }
                i10 |= 1572864;
                qVar2 = qVar;
                if (i11 != 4) {
                    if (i21 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                    } else {
                        eG = e8;
                    }
                    if (i12 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i14 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i16 != 0) {
                        kVar3 = b.f12113a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i19 != 0) {
                        qVarB = Y2.a.f12086a.b();
                    } else {
                        qVarB = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                    }
                    i iVar112 = iVar3;
                    E e117 = eG;
                    L0.c cVar110 = cVarM;
                    e.a(navigator, new c(eG), iVar112, cVar110, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar112;
                    qVar3 = qVarB;
                    kVar4 = kVar3;
                    z11 = z10;
                    cVar2 = cVar110;
                    e9 = e117;
                } else {
                    if (i21 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                    } else {
                        eG = e8;
                    }
                    if (i12 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i14 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i16 != 0) {
                        kVar3 = b.f12113a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i19 != 0) {
                        qVarB = Y2.a.f12086a.b();
                    } else {
                        qVarB = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                    }
                    i iVar113 = iVar3;
                    E e118 = eG;
                    L0.c cVar111 = cVarM;
                    e.a(navigator, new c(eG), iVar113, cVar111, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar113;
                    qVar3 = qVarB;
                    kVar4 = kVar3;
                    z11 = z10;
                    cVar2 = cVar111;
                    e9 = e118;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new C0307d(navigator, iVar4, e9, cVar2, z11, kVar4, qVar3, i8, i9));
                }
            }
            i10 |= 24576;
            z9 = z8;
            i16 = i9 & 32;
            if (i16 != 0) {
                i10 |= 196608;
                i17 = 57344;
                kVar2 = kVar;
            } else {
                i17 = 57344;
                kVar2 = kVar;
                if ((i8 & 458752) == 0) {
                    if (interfaceC3163lP.l(kVar2)) {
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
                    qVar2 = qVar;
                    if (interfaceC3163lP.l(qVar2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i10 |= i20;
                }
                if (i11 != 4) {
                    if (i21 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                    } else {
                        eG = e8;
                    }
                    if (i12 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i14 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i16 != 0) {
                        kVar3 = b.f12113a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i19 != 0) {
                        qVarB = Y2.a.f12086a.b();
                    } else {
                        qVarB = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                    }
                    i iVar114 = iVar3;
                    E e119 = eG;
                    L0.c cVar112 = cVarM;
                    e.a(navigator, new c(eG), iVar114, cVar112, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar114;
                    qVar3 = qVarB;
                    kVar4 = kVar3;
                    z11 = z10;
                    cVar2 = cVar112;
                    e9 = e119;
                } else {
                    if (i21 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                    } else {
                        eG = e8;
                    }
                    if (i12 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i14 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i16 != 0) {
                        kVar3 = b.f12113a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i19 != 0) {
                        qVarB = Y2.a.f12086a.b();
                    } else {
                        qVarB = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                    }
                    i iVar115 = iVar3;
                    E e1110 = eG;
                    L0.c cVar113 = cVarM;
                    e.a(navigator, new c(eG), iVar115, cVar113, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar115;
                    qVar3 = qVarB;
                    kVar4 = kVar3;
                    z11 = z10;
                    cVar2 = cVar113;
                    e9 = e1110;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new C0307d(navigator, iVar4, e9, cVar2, z11, kVar4, qVar3, i8, i9));
                }
            }
            i10 |= 1572864;
            qVar2 = qVar;
            if (i11 != 4) {
                if (i21 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                } else {
                    eG = e8;
                }
                if (i12 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i14 != 0) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (i16 != 0) {
                    kVar3 = b.f12113a;
                } else {
                    kVar3 = kVar2;
                }
                if (i19 != 0) {
                    qVarB = Y2.a.f12086a.b();
                } else {
                    qVarB = qVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                }
                i iVar116 = iVar3;
                E e1111 = eG;
                L0.c cVar114 = cVarM;
                e.a(navigator, new c(eG), iVar116, cVar114, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar116;
                qVar3 = qVarB;
                kVar4 = kVar3;
                z11 = z10;
                cVar2 = cVar114;
                e9 = e1111;
            } else {
                if (i21 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                } else {
                    eG = e8;
                }
                if (i12 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i14 != 0) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (i16 != 0) {
                    kVar3 = b.f12113a;
                } else {
                    kVar3 = kVar2;
                }
                if (i19 != 0) {
                    qVarB = Y2.a.f12086a.b();
                } else {
                    qVarB = qVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                }
                i iVar117 = iVar3;
                E e1112 = eG;
                L0.c cVar115 = cVarM;
                e.a(navigator, new c(eG), iVar117, cVar115, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar117;
                qVar3 = qVarB;
                kVar4 = kVar3;
                z11 = z10;
                cVar2 = cVar115;
                e9 = e1112;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new C0307d(navigator, iVar4, e9, cVar2, z11, kVar4, qVar3, i8, i9));
            }
        }
        i10 |= 3072;
        cVarM = cVar;
        i14 = i9 & 16;
        if (i14 != 0) {
            if ((i8 & 57344) == 0) {
                z9 = z8;
                if (interfaceC3163lP.c(z9)) {
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
                kVar2 = kVar;
            } else {
                i17 = 57344;
                kVar2 = kVar;
                if ((i8 & 458752) == 0) {
                    if (interfaceC3163lP.l(kVar2)) {
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
                    qVar2 = qVar;
                    if (interfaceC3163lP.l(qVar2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i10 |= i20;
                }
                if (i11 != 4) {
                    if (i21 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                    } else {
                        eG = e8;
                    }
                    if (i12 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i14 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i16 != 0) {
                        kVar3 = b.f12113a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i19 != 0) {
                        qVarB = Y2.a.f12086a.b();
                    } else {
                        qVarB = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                    }
                    i iVar118 = iVar3;
                    E e1113 = eG;
                    L0.c cVar116 = cVarM;
                    e.a(navigator, new c(eG), iVar118, cVar116, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar118;
                    qVar3 = qVarB;
                    kVar4 = kVar3;
                    z11 = z10;
                    cVar2 = cVar116;
                    e9 = e1113;
                } else {
                    if (i21 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                    } else {
                        eG = e8;
                    }
                    if (i12 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i14 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i16 != 0) {
                        kVar3 = b.f12113a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i19 != 0) {
                        qVarB = Y2.a.f12086a.b();
                    } else {
                        qVarB = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                    }
                    i iVar119 = iVar3;
                    E e1114 = eG;
                    L0.c cVar117 = cVarM;
                    e.a(navigator, new c(eG), iVar119, cVar117, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar119;
                    qVar3 = qVarB;
                    kVar4 = kVar3;
                    z11 = z10;
                    cVar2 = cVar117;
                    e9 = e1114;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new C0307d(navigator, iVar4, e9, cVar2, z11, kVar4, qVar3, i8, i9));
                }
            }
            i10 |= 1572864;
            qVar2 = qVar;
            if (i11 != 4) {
                if (i21 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                } else {
                    eG = e8;
                }
                if (i12 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i14 != 0) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (i16 != 0) {
                    kVar3 = b.f12113a;
                } else {
                    kVar3 = kVar2;
                }
                if (i19 != 0) {
                    qVarB = Y2.a.f12086a.b();
                } else {
                    qVarB = qVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                }
                i iVar1110 = iVar3;
                E e1115 = eG;
                L0.c cVar118 = cVarM;
                e.a(navigator, new c(eG), iVar1110, cVar118, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar1110;
                qVar3 = qVarB;
                kVar4 = kVar3;
                z11 = z10;
                cVar2 = cVar118;
                e9 = e1115;
            } else {
                if (i21 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                } else {
                    eG = e8;
                }
                if (i12 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i14 != 0) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (i16 != 0) {
                    kVar3 = b.f12113a;
                } else {
                    kVar3 = kVar2;
                }
                if (i19 != 0) {
                    qVarB = Y2.a.f12086a.b();
                } else {
                    qVarB = qVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                }
                i iVar1111 = iVar3;
                E e1116 = eG;
                L0.c cVar119 = cVarM;
                e.a(navigator, new c(eG), iVar1111, cVar119, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar1111;
                qVar3 = qVarB;
                kVar4 = kVar3;
                z11 = z10;
                cVar2 = cVar119;
                e9 = e1116;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new C0307d(navigator, iVar4, e9, cVar2, z11, kVar4, qVar3, i8, i9));
            }
        }
        i10 |= 24576;
        z9 = z8;
        i16 = i9 & 32;
        if (i16 != 0) {
            i10 |= 196608;
            i17 = 57344;
            kVar2 = kVar;
        } else {
            i17 = 57344;
            kVar2 = kVar;
            if ((i8 & 458752) == 0) {
                if (interfaceC3163lP.l(kVar2)) {
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
                qVar2 = qVar;
                if (interfaceC3163lP.l(qVar2)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i10 |= i20;
            }
            if (i11 != 4) {
                if (i21 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                } else {
                    eG = e8;
                }
                if (i12 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i14 != 0) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (i16 != 0) {
                    kVar3 = b.f12113a;
                } else {
                    kVar3 = kVar2;
                }
                if (i19 != 0) {
                    qVarB = Y2.a.f12086a.b();
                } else {
                    qVarB = qVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                }
                i iVar1112 = iVar3;
                E e1117 = eG;
                L0.c cVar1110 = cVarM;
                e.a(navigator, new c(eG), iVar1112, cVar1110, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar1112;
                qVar3 = qVarB;
                kVar4 = kVar3;
                z11 = z10;
                cVar2 = cVar1110;
                e9 = e1117;
            } else {
                if (i21 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
                } else {
                    eG = e8;
                }
                if (i12 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i14 != 0) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (i16 != 0) {
                    kVar3 = b.f12113a;
                } else {
                    kVar3 = kVar2;
                }
                if (i19 != 0) {
                    qVarB = Y2.a.f12086a.b();
                } else {
                    qVarB = qVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
                }
                i iVar1113 = iVar3;
                E e1118 = eG;
                L0.c cVar1111 = cVarM;
                e.a(navigator, new c(eG), iVar1113, cVar1111, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar1113;
                qVar3 = qVarB;
                kVar4 = kVar3;
                z11 = z10;
                cVar2 = cVar1111;
                e9 = e1118;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new C0307d(navigator, iVar4, e9, cVar2, z11, kVar4, qVar3, i8, i9));
            }
        }
        i10 |= 1572864;
        qVar2 = qVar;
        if (i11 != 4) {
            if (i21 != 0) {
                iVar3 = i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (i11 != 0) {
                eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
            } else {
                eG = e8;
            }
            if (i12 != 0) {
                cVarM = L0.c.f4806a.m();
            }
            if (i14 != 0) {
                z10 = false;
            } else {
                z10 = z9;
            }
            if (i16 != 0) {
                kVar3 = b.f12113a;
            } else {
                kVar3 = kVar2;
            }
            if (i19 != 0) {
                qVarB = Y2.a.f12086a.b();
            } else {
                qVarB = qVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
            }
            i iVar1114 = iVar3;
            E e1119 = eG;
            L0.c cVar1112 = cVarM;
            e.a(navigator, new c(eG), iVar1114, cVar1112, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar4 = iVar1114;
            qVar3 = qVarB;
            kVar4 = kVar3;
            z11 = z10;
            cVar2 = cVar1112;
            e9 = e1119;
        } else {
            if (i21 != 0) {
                iVar3 = i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (i11 != 0) {
                eG = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
            } else {
                eG = e8;
            }
            if (i12 != 0) {
                cVarM = L0.c.f4806a.m();
            }
            if (i14 != 0) {
                z10 = false;
            } else {
                z10 = z9;
            }
            if (i16 != 0) {
                kVar3 = b.f12113a;
            } else {
                kVar3 = kVar2;
            }
            if (i19 != 0) {
                qVarB = Y2.a.f12086a.b();
            } else {
                qVarB = qVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(33636071, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:41)");
            }
            i iVar1115 = iVar3;
            E e11110 = eG;
            L0.c cVar1113 = cVarM;
            e.a(navigator, new c(eG), iVar1115, cVar1113, z10, kVar3, qVarB, interfaceC3163lP, (i10 & 3670016) | V2.b.f10520j | (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | (i10 & i17) | (i10 & 458752), 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar4 = iVar1115;
            qVar3 = qVarB;
            kVar4 = kVar3;
            z11 = z10;
            cVar2 = cVar1113;
            e9 = e11110;
        }
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new C0307d(navigator, iVar4, e9, cVar2, z11, kVar4, qVar3, i8, i9));
        }
    }

    public static final void b(V2.b navigator, i iVar, E e8, q qVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        E e9;
        q qVar2;
        i iVar2;
        t.g(navigator, "navigator");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(496259879);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.R(navigator) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        int i11 = i9 & 2;
        if (i11 != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            i10 |= interfaceC3163lP.R(iVar) ? 32 : 16;
        }
        int i12 = i9 & 4;
        if (i12 != 0) {
            i10 |= 128;
        }
        int i13 = i9 & 8;
        if (i13 != 0) {
            i10 |= 3072;
        } else if ((i8 & 7168) == 0) {
            i10 |= interfaceC3163lP.l(qVar) ? 2048 : 1024;
        }
        if (i12 == 4 && (i10 & 5851) == 1170 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
            iVar2 = iVar;
            e9 = e8;
            qVar2 = qVar;
        } else {
            i iVar3 = i11 != 0 ? i.f4836a : iVar;
            E eG = i12 != 0 ? AbstractC2214j.g(0.0f, 400.0f, null, 5, null) : e8;
            q qVarA = i13 != 0 ? Y2.a.f12086a.a() : qVar;
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(496259879, i10, -1, "cafe.adriel.voyager.transitions.FadeTransition (FadeTransition.kt:21)");
            }
            int i14 = V2.b.f10520j | 25088 | (i10 & 14) | (i10 & 112) | ((i10 << 9) & 3670016);
            i iVar4 = iVar3;
            E e10 = eG;
            a(navigator, iVar4, e10, null, false, null, qVarA, interfaceC3163lP, i14, 40);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            e9 = e10;
            qVar2 = qVarA;
            iVar2 = iVar4;
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new a(navigator, iVar2, e9, qVar2, i8, i9));
        }
    }
}
