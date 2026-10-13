package p191w0;

import A1.h;
import C6.G;
import L0.i;
import Q6.k;
import Q6.o;
import R0.C1598l0;
import R0.T0;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.layout.f;
import kotlin.jvm.internal.u;
import p082j0.AbstractC2601e;
import p082j0.d0;
import p082j0.f0;
import p082j0.i0;
import p110m1.n;
import p110m1.x;
import p207y0.r;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: renamed from: w0.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3070l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3070l f36205a = new C3070l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f36206b = r.f38077a.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f36207c = h.m(56);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f36208d = h.m(640);

    /* JADX INFO: renamed from: w0.l$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f36209a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f36209a = str;
        }

        public final void b(x xVar) {
            p110m1.u.M(xVar, this.f36209a);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((x) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: w0.l$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f36210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f36211b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f8, float f9) {
            super(2);
            this.f36210a = f8;
            this.f36211b = f9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 3) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1039573072, i8, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle.<anonymous> (SheetDefaults.kt:405)");
            }
            AbstractC2601e.a(f.m(i.f4836a, this.f36210a, this.f36211b), interfaceC3163l, 0);
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

    /* JADX INFO: renamed from: w0.l$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f36213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f36214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f36215d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ T0 f36216e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f36217f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f36218g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f36219h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i iVar, float f8, float f9, T0 t8, long j8, int i8, int i9) {
            super(2);
            this.f36213b = iVar;
            this.f36214c = f8;
            this.f36215d = f9;
            this.f36216e = t8;
            this.f36217f = j8;
            this.f36218g = i8;
            this.f36219h = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            C3070l.this.a(this.f36213b, this.f36214c, this.f36215d, this.f36216e, this.f36217f, interfaceC3163l, F0.a(this.f36218g | 1), this.f36219h);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0198  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:92:0x0124  */
    /* JADX WARN: Code duplicated, block: B:95:0x0154  */
    /* JADX WARN: Code duplicated, block: B:97:0x015c  */
    public final void a(i iVar, float f8, float f9, T0 t8, long j8, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        i iVar2;
        int i10;
        float fE;
        int i11;
        float fD;
        int i12;
        T0 t0A;
        long jO;
        i iVar3;
        String strA;
        boolean zR;
        Object objG;
        InterfaceC3163l interfaceC3163l2;
        float f10;
        float f11;
        T0 t9;
        long j9;
        P0 p0V;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1364277227);
        int i13 = i9 & 1;
        if (i13 != 0) {
            i10 = i8 | 6;
            iVar2 = iVar;
        } else if ((i8 & 6) == 0) {
            iVar2 = iVar;
            i10 = (interfaceC3163lP.R(iVar2) ? 4 : 2) | i8;
        } else {
            iVar2 = iVar;
            i10 = i8;
        }
        int i14 = i9 & 2;
        if (i14 == 0) {
            if ((i8 & 48) == 0) {
                fE = f8;
                i10 |= interfaceC3163lP.h(fE) ? 32 : 16;
            }
            i11 = i9 & 4;
            if (i11 != 0) {
                if ((i8 & 384) == 0) {
                    fD = f9;
                    if (interfaceC3163lP.h(fD)) {
                        i12 = 256;
                    } else {
                        i12 = 128;
                    }
                    i10 |= i12;
                }
                if ((i8 & 3072) == 0) {
                    if ((i9 & 8) == 0) {
                        t0A = t8;
                        int i15 = interfaceC3163lP.R(t0A) ? 2048 : 1024;
                        i10 |= i15;
                    } else {
                        t0A = t8;
                    }
                    i10 |= i15;
                } else {
                    t0A = t8;
                }
                if ((i8 & 24576) == 0) {
                    if ((i9 & 16) == 0) {
                        jO = j8;
                        int i16 = interfaceC3163lP.j(jO) ? 16384 : 8192;
                        i10 |= i16;
                    } else {
                        jO = j8;
                    }
                    i10 |= i16;
                } else {
                    jO = j8;
                }
                if ((i10 & 9363) == 9362 || !interfaceC3163lP.s()) {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0 || interfaceC3163lP.F()) {
                        if (i13 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i14 != 0) {
                            fE = r.f38077a.e();
                        }
                        if (i11 != 0) {
                            fD = r.f38077a.d();
                        }
                        if ((i9 & 8) != 0) {
                            i10 &= -7169;
                            t0A = Z.f35786a.b(interfaceC3163lP, 6).a();
                        }
                        if ((i9 & 16) != 0) {
                            jO = C1598l0.o(AbstractC3091w.i(r.f38077a.c(), interfaceC3163lP, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                            i10 &= -57345;
                        }
                    } else {
                        interfaceC3163lP.z();
                        if ((i9 & 8) != 0) {
                            i10 &= -7169;
                        }
                        if ((i9 & 16) != 0) {
                            i10 &= -57345;
                        }
                        iVar3 = iVar2;
                    }
                    float f12 = fD;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-1364277227, i10, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:396)");
                    }
                    D0.a aVar = D0.f35229a;
                    strA = E0.a(D0.a(AbstractC3082r0.f36364c), interfaceC3163lP, 0);
                    i iVarK = e.k(iVar3, 0.0f, A0.f35199a, 1, null);
                    interfaceC3163lP.f(-363350248);
                    zR = interfaceC3163lP.R(strA);
                    objG = interfaceC3163lP.g();
                    if (zR || objG == InterfaceC3163l.f38803a.a()) {
                        objG = new a(strA);
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC3163lP.N();
                    int i17 = i10 >> 6;
                    interfaceC3163l2 = interfaceC3163lP;
                    F0.a(n.d(iVarK, false, (k) objG, 1, null), t0A, jO, 0L, 0.0f, 0.0f, null, H0.c.b(interfaceC3163lP, -1039573072, true, new b(fE, f12)), interfaceC3163l2, (i17 & 112) | 12582912 | (i17 & 896), 120);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    f10 = f12;
                } else {
                    interfaceC3163lP.z();
                    interfaceC3163l2 = interfaceC3163lP;
                    iVar3 = iVar2;
                    f10 = fD;
                }
                f11 = fE;
                t9 = t0A;
                j9 = jO;
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new c(iVar3, f11, f10, t9, j9, i8, i9));
                }
            }
            i10 |= 384;
            fD = f9;
            if ((i8 & 3072) == 0) {
                if ((i9 & 8) == 0) {
                    t0A = t8;
                    if (interfaceC3163lP.R(t0A)) {
                    }
                    i10 |= i15;
                } else {
                    t0A = t8;
                }
                i10 |= i15;
            } else {
                t0A = t8;
            }
            if ((i8 & 24576) == 0) {
                if ((i9 & 16) == 0) {
                    jO = j8;
                    if (interfaceC3163lP.j(jO)) {
                    }
                    i10 |= i16;
                } else {
                    jO = j8;
                }
                i10 |= i16;
            } else {
                jO = j8;
            }
            if ((i10 & 9363) == 9362) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i13 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i14 != 0) {
                        fE = r.f38077a.e();
                    }
                    if (i11 != 0) {
                        fD = r.f38077a.d();
                    }
                    if ((i9 & 8) != 0) {
                        i10 &= -7169;
                        t0A = Z.f35786a.b(interfaceC3163lP, 6).a();
                    }
                    if ((i9 & 16) != 0) {
                        jO = C1598l0.o(AbstractC3091w.i(r.f38077a.c(), interfaceC3163lP, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        i10 &= -57345;
                    }
                } else {
                    if (i13 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i14 != 0) {
                        fE = r.f38077a.e();
                    }
                    if (i11 != 0) {
                        fD = r.f38077a.d();
                    }
                    if ((i9 & 8) != 0) {
                        i10 &= -7169;
                        t0A = Z.f35786a.b(interfaceC3163lP, 6).a();
                    }
                    if ((i9 & 16) != 0) {
                        jO = C1598l0.o(AbstractC3091w.i(r.f38077a.c(), interfaceC3163lP, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        i10 &= -57345;
                    }
                }
                float f13 = fD;
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1364277227, i10, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:396)");
                }
                D0.a aVar2 = D0.f35229a;
                strA = E0.a(D0.a(AbstractC3082r0.f36364c), interfaceC3163lP, 0);
                i iVarK2 = e.k(iVar3, 0.0f, A0.f35199a, 1, null);
                interfaceC3163lP.f(-363350248);
                zR = interfaceC3163lP.R(strA);
                objG = interfaceC3163lP.g();
                if (zR) {
                    objG = new a(strA);
                    interfaceC3163lP.H(objG);
                } else {
                    objG = new a(strA);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                int i18 = i10 >> 6;
                interfaceC3163l2 = interfaceC3163lP;
                F0.a(n.d(iVarK2, false, (k) objG, 1, null), t0A, jO, 0L, 0.0f, 0.0f, null, H0.c.b(interfaceC3163lP, -1039573072, true, new b(fE, f13)), interfaceC3163l2, (i18 & 112) | 12582912 | (i18 & 896), 120);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                f10 = f13;
            } else {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i13 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i14 != 0) {
                        fE = r.f38077a.e();
                    }
                    if (i11 != 0) {
                        fD = r.f38077a.d();
                    }
                    if ((i9 & 8) != 0) {
                        i10 &= -7169;
                        t0A = Z.f35786a.b(interfaceC3163lP, 6).a();
                    }
                    if ((i9 & 16) != 0) {
                        jO = C1598l0.o(AbstractC3091w.i(r.f38077a.c(), interfaceC3163lP, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        i10 &= -57345;
                    }
                } else {
                    if (i13 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i14 != 0) {
                        fE = r.f38077a.e();
                    }
                    if (i11 != 0) {
                        fD = r.f38077a.d();
                    }
                    if ((i9 & 8) != 0) {
                        i10 &= -7169;
                        t0A = Z.f35786a.b(interfaceC3163lP, 6).a();
                    }
                    if ((i9 & 16) != 0) {
                        jO = C1598l0.o(AbstractC3091w.i(r.f38077a.c(), interfaceC3163lP, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        i10 &= -57345;
                    }
                }
                float f14 = fD;
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1364277227, i10, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:396)");
                }
                D0.a aVar3 = D0.f35229a;
                strA = E0.a(D0.a(AbstractC3082r0.f36364c), interfaceC3163lP, 0);
                i iVarK3 = e.k(iVar3, 0.0f, A0.f35199a, 1, null);
                interfaceC3163lP.f(-363350248);
                zR = interfaceC3163lP.R(strA);
                objG = interfaceC3163lP.g();
                if (zR) {
                    objG = new a(strA);
                    interfaceC3163lP.H(objG);
                } else {
                    objG = new a(strA);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                int i19 = i10 >> 6;
                interfaceC3163l2 = interfaceC3163lP;
                F0.a(n.d(iVarK3, false, (k) objG, 1, null), t0A, jO, 0L, 0.0f, 0.0f, null, H0.c.b(interfaceC3163lP, -1039573072, true, new b(fE, f14)), interfaceC3163l2, (i19 & 112) | 12582912 | (i19 & 896), 120);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                f10 = f14;
            }
            f11 = fE;
            t9 = t0A;
            j9 = jO;
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new c(iVar3, f11, f10, t9, j9, i8, i9));
            }
        }
        i10 |= 48;
        fE = f8;
        i11 = i9 & 4;
        if (i11 != 0) {
            if ((i8 & 384) == 0) {
                fD = f9;
                if (interfaceC3163lP.h(fD)) {
                    i12 = 256;
                } else {
                    i12 = 128;
                }
                i10 |= i12;
            }
            if ((i8 & 3072) == 0) {
                if ((i9 & 8) == 0) {
                    t0A = t8;
                    if (interfaceC3163lP.R(t0A)) {
                    }
                    i10 |= i15;
                } else {
                    t0A = t8;
                }
                i10 |= i15;
            } else {
                t0A = t8;
            }
            if ((i8 & 24576) == 0) {
                if ((i9 & 16) == 0) {
                    jO = j8;
                    if (interfaceC3163lP.j(jO)) {
                    }
                    i10 |= i16;
                } else {
                    jO = j8;
                }
                i10 |= i16;
            } else {
                jO = j8;
            }
            if ((i10 & 9363) == 9362) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i13 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i14 != 0) {
                        fE = r.f38077a.e();
                    }
                    if (i11 != 0) {
                        fD = r.f38077a.d();
                    }
                    if ((i9 & 8) != 0) {
                        i10 &= -7169;
                        t0A = Z.f35786a.b(interfaceC3163lP, 6).a();
                    }
                    if ((i9 & 16) != 0) {
                        jO = C1598l0.o(AbstractC3091w.i(r.f38077a.c(), interfaceC3163lP, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        i10 &= -57345;
                    }
                } else {
                    if (i13 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i14 != 0) {
                        fE = r.f38077a.e();
                    }
                    if (i11 != 0) {
                        fD = r.f38077a.d();
                    }
                    if ((i9 & 8) != 0) {
                        i10 &= -7169;
                        t0A = Z.f35786a.b(interfaceC3163lP, 6).a();
                    }
                    if ((i9 & 16) != 0) {
                        jO = C1598l0.o(AbstractC3091w.i(r.f38077a.c(), interfaceC3163lP, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        i10 &= -57345;
                    }
                }
                float f15 = fD;
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1364277227, i10, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:396)");
                }
                D0.a aVar4 = D0.f35229a;
                strA = E0.a(D0.a(AbstractC3082r0.f36364c), interfaceC3163lP, 0);
                i iVarK4 = e.k(iVar3, 0.0f, A0.f35199a, 1, null);
                interfaceC3163lP.f(-363350248);
                zR = interfaceC3163lP.R(strA);
                objG = interfaceC3163lP.g();
                if (zR) {
                    objG = new a(strA);
                    interfaceC3163lP.H(objG);
                } else {
                    objG = new a(strA);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                int i110 = i10 >> 6;
                interfaceC3163l2 = interfaceC3163lP;
                F0.a(n.d(iVarK4, false, (k) objG, 1, null), t0A, jO, 0L, 0.0f, 0.0f, null, H0.c.b(interfaceC3163lP, -1039573072, true, new b(fE, f15)), interfaceC3163l2, (i110 & 112) | 12582912 | (i110 & 896), 120);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                f10 = f15;
            } else {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i13 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i14 != 0) {
                        fE = r.f38077a.e();
                    }
                    if (i11 != 0) {
                        fD = r.f38077a.d();
                    }
                    if ((i9 & 8) != 0) {
                        i10 &= -7169;
                        t0A = Z.f35786a.b(interfaceC3163lP, 6).a();
                    }
                    if ((i9 & 16) != 0) {
                        jO = C1598l0.o(AbstractC3091w.i(r.f38077a.c(), interfaceC3163lP, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        i10 &= -57345;
                    }
                } else {
                    if (i13 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i14 != 0) {
                        fE = r.f38077a.e();
                    }
                    if (i11 != 0) {
                        fD = r.f38077a.d();
                    }
                    if ((i9 & 8) != 0) {
                        i10 &= -7169;
                        t0A = Z.f35786a.b(interfaceC3163lP, 6).a();
                    }
                    if ((i9 & 16) != 0) {
                        jO = C1598l0.o(AbstractC3091w.i(r.f38077a.c(), interfaceC3163lP, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        i10 &= -57345;
                    }
                }
                float f16 = fD;
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1364277227, i10, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:396)");
                }
                D0.a aVar5 = D0.f35229a;
                strA = E0.a(D0.a(AbstractC3082r0.f36364c), interfaceC3163lP, 0);
                i iVarK5 = e.k(iVar3, 0.0f, A0.f35199a, 1, null);
                interfaceC3163lP.f(-363350248);
                zR = interfaceC3163lP.R(strA);
                objG = interfaceC3163lP.g();
                if (zR) {
                    objG = new a(strA);
                    interfaceC3163lP.H(objG);
                } else {
                    objG = new a(strA);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                int i111 = i10 >> 6;
                interfaceC3163l2 = interfaceC3163lP;
                F0.a(n.d(iVarK5, false, (k) objG, 1, null), t0A, jO, 0L, 0.0f, 0.0f, null, H0.c.b(interfaceC3163lP, -1039573072, true, new b(fE, f16)), interfaceC3163l2, (i111 & 112) | 12582912 | (i111 & 896), 120);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                f10 = f16;
            }
            f11 = fE;
            t9 = t0A;
            j9 = jO;
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new c(iVar3, f11, f10, t9, j9, i8, i9));
            }
        }
        i10 |= 384;
        fD = f9;
        if ((i8 & 3072) == 0) {
            if ((i9 & 8) == 0) {
                t0A = t8;
                if (interfaceC3163lP.R(t0A)) {
                }
                i10 |= i15;
            } else {
                t0A = t8;
            }
            i10 |= i15;
        } else {
            t0A = t8;
        }
        if ((i8 & 24576) == 0) {
            if ((i9 & 16) == 0) {
                jO = j8;
                if (interfaceC3163lP.j(jO)) {
                }
                i10 |= i16;
            } else {
                jO = j8;
            }
            i10 |= i16;
        } else {
            jO = j8;
        }
        if ((i10 & 9363) == 9362) {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i13 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i14 != 0) {
                    fE = r.f38077a.e();
                }
                if (i11 != 0) {
                    fD = r.f38077a.d();
                }
                if ((i9 & 8) != 0) {
                    i10 &= -7169;
                    t0A = Z.f35786a.b(interfaceC3163lP, 6).a();
                }
                if ((i9 & 16) != 0) {
                    jO = C1598l0.o(AbstractC3091w.i(r.f38077a.c(), interfaceC3163lP, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                    i10 &= -57345;
                }
            } else {
                if (i13 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i14 != 0) {
                    fE = r.f38077a.e();
                }
                if (i11 != 0) {
                    fD = r.f38077a.d();
                }
                if ((i9 & 8) != 0) {
                    i10 &= -7169;
                    t0A = Z.f35786a.b(interfaceC3163lP, 6).a();
                }
                if ((i9 & 16) != 0) {
                    jO = C1598l0.o(AbstractC3091w.i(r.f38077a.c(), interfaceC3163lP, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                    i10 &= -57345;
                }
            }
            float f17 = fD;
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1364277227, i10, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:396)");
            }
            D0.a aVar6 = D0.f35229a;
            strA = E0.a(D0.a(AbstractC3082r0.f36364c), interfaceC3163lP, 0);
            i iVarK6 = e.k(iVar3, 0.0f, A0.f35199a, 1, null);
            interfaceC3163lP.f(-363350248);
            zR = interfaceC3163lP.R(strA);
            objG = interfaceC3163lP.g();
            if (zR) {
                objG = new a(strA);
                interfaceC3163lP.H(objG);
            } else {
                objG = new a(strA);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            int i112 = i10 >> 6;
            interfaceC3163l2 = interfaceC3163lP;
            F0.a(n.d(iVarK6, false, (k) objG, 1, null), t0A, jO, 0L, 0.0f, 0.0f, null, H0.c.b(interfaceC3163lP, -1039573072, true, new b(fE, f17)), interfaceC3163l2, (i112 & 112) | 12582912 | (i112 & 896), 120);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            f10 = f17;
        } else {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i13 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i14 != 0) {
                    fE = r.f38077a.e();
                }
                if (i11 != 0) {
                    fD = r.f38077a.d();
                }
                if ((i9 & 8) != 0) {
                    i10 &= -7169;
                    t0A = Z.f35786a.b(interfaceC3163lP, 6).a();
                }
                if ((i9 & 16) != 0) {
                    jO = C1598l0.o(AbstractC3091w.i(r.f38077a.c(), interfaceC3163lP, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                    i10 &= -57345;
                }
            } else {
                if (i13 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i14 != 0) {
                    fE = r.f38077a.e();
                }
                if (i11 != 0) {
                    fD = r.f38077a.d();
                }
                if ((i9 & 8) != 0) {
                    i10 &= -7169;
                    t0A = Z.f35786a.b(interfaceC3163lP, 6).a();
                }
                if ((i9 & 16) != 0) {
                    jO = C1598l0.o(AbstractC3091w.i(r.f38077a.c(), interfaceC3163lP, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                    i10 &= -57345;
                }
            }
            float f18 = fD;
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1364277227, i10, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:396)");
            }
            D0.a aVar7 = D0.f35229a;
            strA = E0.a(D0.a(AbstractC3082r0.f36364c), interfaceC3163lP, 0);
            i iVarK7 = e.k(iVar3, 0.0f, A0.f35199a, 1, null);
            interfaceC3163lP.f(-363350248);
            zR = interfaceC3163lP.R(strA);
            objG = interfaceC3163lP.g();
            if (zR) {
                objG = new a(strA);
                interfaceC3163lP.H(objG);
            } else {
                objG = new a(strA);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            int i113 = i10 >> 6;
            interfaceC3163l2 = interfaceC3163lP;
            F0.a(n.d(iVarK7, false, (k) objG, 1, null), t0A, jO, 0L, 0.0f, 0.0f, null, H0.c.b(interfaceC3163lP, -1039573072, true, new b(fE, f18)), interfaceC3163l2, (i113 & 112) | 12582912 | (i113 & 896), 120);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            f10 = f18;
        }
        f11 = fE;
        t9 = t0A;
        j9 = jO;
        p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new c(iVar3, f11, f10, t9, j9, i8, i9));
        }
    }

    public final long b(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(433375448);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(433375448, i8, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ContainerColor> (SheetDefaults.kt:358)");
        }
        long jI = AbstractC3091w.i(r.f38077a.a(), interfaceC3163l, 6);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return jI;
    }

    public final float c() {
        return f36206b;
    }

    public final T0 d(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(1683783414);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1683783414, i8, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ExpandedShape> (SheetDefaults.kt:353)");
        }
        T0 t0D = z0.d(r.f38077a.b(), interfaceC3163l, 6);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return t0D;
    }

    public final long e(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-2040719176);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-2040719176, i8, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ScrimColor> (SheetDefaults.kt:366)");
        }
        long jO = C1598l0.o(AbstractC3091w.i(p207y0.o.f38051a.a(), interfaceC3163l, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return jO;
    }

    public final float f() {
        return f36208d;
    }

    public final d0 g(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-511309409);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-511309409, i8, -1, "androidx.compose.material3.BottomSheetDefaults.<get-windowInsets> (SheetDefaults.kt:383)");
        }
        d0 d0VarD = f0.d(G0.a(d0.f27940a, interfaceC3163l, 6), i0.f28011a.h());
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return d0VarD;
    }
}
