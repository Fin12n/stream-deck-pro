package p191w0;

import C6.G;
import L0.i;
import Q0.l;
import Q6.k;
import Q6.o;
import R0.C1598l0;
import R0.C1600m0;
import V0.d;
import V0.q;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.graphics.vector.VectorPainter;
import kotlin.jvm.internal.u;
import p038e1.InterfaceC2235f;
import p082j0.AbstractC2601e;
import p110m1.h;
import p110m1.n;
import p110m1.x;
import p207y0.j;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f35615a = f.l(i.f4836a, j.f37858a.a());

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f35616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f35617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f35618c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f35619d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f35620e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f35621f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, String str, i iVar, long j8, int i8, int i9) {
            super(2);
            this.f35616a = dVar;
            this.f35617b = str;
            this.f35618c = iVar;
            this.f35619d = j8;
            this.f35620e = i8;
            this.f35621f = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            O.b(this.f35616a, this.f35617b, this.f35618c, this.f35619d, interfaceC3163l, F0.a(this.f35620e | 1), this.f35621f);
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
        public final /* synthetic */ U0.b f35622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f35623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f35624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f35625d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f35626e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f35627f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(U0.b bVar, String str, i iVar, long j8, int i8, int i9) {
            super(2);
            this.f35622a = bVar;
            this.f35623b = str;
            this.f35624c = iVar;
            this.f35625d = j8;
            this.f35626e = i8;
            this.f35627f = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            O.a(this.f35622a, this.f35623b, this.f35624c, this.f35625d, interfaceC3163l, F0.a(this.f35626e | 1), this.f35627f);
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
        public final /* synthetic */ String f35628a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.f35628a = str;
        }

        public final void b(x xVar) {
            p110m1.u.M(xVar, this.f35628a);
            p110m1.u.S(xVar, h.f29507b.d());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((x) obj);
            return G.f1419a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0184  */
    /* JADX WARN: Code duplicated, block: B:106:0x018f  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:83:0x0104  */
    /* JADX WARN: Code duplicated, block: B:84:0x0106  */
    /* JADX WARN: Code duplicated, block: B:88:0x0123  */
    /* JADX WARN: Code duplicated, block: B:90:0x012f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0131  */
    /* JADX WARN: Code duplicated, block: B:94:0x0138  */
    /* JADX WARN: Code duplicated, block: B:96:0x0140  */
    /* JADX WARN: Code duplicated, block: B:99:0x0154  */
    public static final void a(U0.b bVar, String str, i iVar, long j8, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        i iVar2;
        long j9;
        i iVar3;
        long jY;
        i iVar4;
        boolean z8;
        Object objG;
        i iVarD;
        i iVar5;
        long j10;
        boolean z9;
        Object objG2;
        P0 p0V;
        int i11;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-2142239481);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 6) == 0) {
            i10 = (interfaceC3163lP.l(bVar) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 48) == 0) {
            i10 |= interfaceC3163lP.R(str) ? 32 : 16;
        }
        int i12 = i9 & 4;
        if (i12 == 0) {
            if ((i8 & 384) == 0) {
                iVar2 = iVar;
                i10 |= interfaceC3163lP.R(iVar2) ? 256 : 128;
            }
            if ((i8 & 3072) == 0) {
                j9 = j8;
                if ((i9 & 8) == 0 || !interfaceC3163lP.j(j9)) {
                    i11 = 1024;
                } else {
                    i11 = 2048;
                }
                i10 |= i11;
            } else {
                j9 = j8;
            }
            if ((i10 & 1171) == 1170 || !interfaceC3163lP.s()) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0 || interfaceC3163lP.F()) {
                    if (i12 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if ((i9 & 8) != 0) {
                        i10 &= -7169;
                        iVar4 = iVar3;
                        jY = ((C1598l0) interfaceC3163lP.e(B.a())).y();
                    } else {
                        jY = j9;
                        iVar4 = iVar3;
                    }
                } else {
                    interfaceC3163lP.z();
                    if ((i9 & 8) != 0) {
                        i10 &= -7169;
                    }
                    jY = j9;
                    iVar4 = iVar2;
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-2142239481, i10, -1, "androidx.compose.material3.Icon (Icon.kt:136)");
                }
                interfaceC3163lP.f(69356724);
                z8 = (((i10 & 7168) ^ 3072) <= 2048 && interfaceC3163lP.j(jY)) || (i10 & 3072) == 2048;
                objG = interfaceC3163lP.g();
                if (z8 || objG == InterfaceC3163l.f38803a.a()) {
                    if (C1598l0.q(jY, C1598l0.f9405b.e())) {
                        objG = null;
                    } else {
                        objG = C1600m0.a.b(C1600m0.f9420b, jY, 0, 2, null);
                    }
                    interfaceC3163lP.H(objG);
                }
                C1600m0 c1600m0 = (C1600m0) objG;
                interfaceC3163lP.N();
                interfaceC3163lP.f(69356847);
                if (str != null) {
                    i.a aVar = i.f4836a;
                    interfaceC3163lP.f(69356912);
                    if ((i10 & 112) == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objG2 = interfaceC3163lP.g();
                    if (z9 || objG2 == InterfaceC3163l.f38803a.a()) {
                        objG2 = new c(str);
                        interfaceC3163lP.H(objG2);
                    }
                    interfaceC3163lP.N();
                    iVarD = n.d(aVar, false, (k) objG2, 1, null);
                } else {
                    iVarD = i.f4836a;
                }
                i iVar6 = iVarD;
                interfaceC3163lP.N();
                AbstractC2601e.a(androidx.compose.ui.draw.b.b(c(androidx.compose.ui.graphics.b.d(iVar4), bVar), bVar, false, null, InterfaceC2235f.f20468a.c(), 0.0f, c1600m0, 22, null).j(iVar6), interfaceC3163lP, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar5 = iVar4;
                j10 = jY;
            } else {
                interfaceC3163lP.z();
                iVar5 = iVar2;
                j10 = j9;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new b(bVar, str, iVar5, j10, i8, i9));
            }
        }
        i10 |= 384;
        iVar2 = iVar;
        if ((i8 & 3072) == 0) {
            j9 = j8;
            if ((i9 & 8) == 0) {
                i11 = 1024;
            } else {
                i11 = 1024;
            }
            i10 |= i11;
        } else {
            j9 = j8;
        }
        if ((i10 & 1171) == 1170) {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i12 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if ((i9 & 8) != 0) {
                    i10 &= -7169;
                    iVar4 = iVar3;
                    jY = ((C1598l0) interfaceC3163lP.e(B.a())).y();
                } else {
                    jY = j9;
                    iVar4 = iVar3;
                }
            } else {
                if (i12 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if ((i9 & 8) != 0) {
                    i10 &= -7169;
                    iVar4 = iVar3;
                    jY = ((C1598l0) interfaceC3163lP.e(B.a())).y();
                } else {
                    jY = j9;
                    iVar4 = iVar3;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-2142239481, i10, -1, "androidx.compose.material3.Icon (Icon.kt:136)");
            }
            interfaceC3163lP.f(69356724);
            if (((i10 & 7168) ^ 3072) <= 2048) {
            }
            objG = interfaceC3163lP.g();
            if (z8) {
                if (C1598l0.q(jY, C1598l0.f9405b.e())) {
                    objG = null;
                } else {
                    objG = C1600m0.a.b(C1600m0.f9420b, jY, 0, 2, null);
                }
                interfaceC3163lP.H(objG);
            } else {
                if (C1598l0.q(jY, C1598l0.f9405b.e())) {
                    objG = null;
                } else {
                    objG = C1600m0.a.b(C1600m0.f9420b, jY, 0, 2, null);
                }
                interfaceC3163lP.H(objG);
            }
            C1600m0 c1600m1 = (C1600m0) objG;
            interfaceC3163lP.N();
            interfaceC3163lP.f(69356847);
            if (str != null) {
                i.a aVar2 = i.f4836a;
                interfaceC3163lP.f(69356912);
                if ((i10 & 112) == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objG2 = interfaceC3163lP.g();
                if (z9) {
                    objG2 = new c(str);
                    interfaceC3163lP.H(objG2);
                } else {
                    objG2 = new c(str);
                    interfaceC3163lP.H(objG2);
                }
                interfaceC3163lP.N();
                iVarD = n.d(aVar2, false, (k) objG2, 1, null);
            } else {
                iVarD = i.f4836a;
            }
            i iVar7 = iVarD;
            interfaceC3163lP.N();
            AbstractC2601e.a(androidx.compose.ui.draw.b.b(c(androidx.compose.ui.graphics.b.d(iVar4), bVar), bVar, false, null, InterfaceC2235f.f20468a.c(), 0.0f, c1600m1, 22, null).j(iVar7), interfaceC3163lP, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar5 = iVar4;
            j10 = jY;
        } else {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i12 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if ((i9 & 8) != 0) {
                    i10 &= -7169;
                    iVar4 = iVar3;
                    jY = ((C1598l0) interfaceC3163lP.e(B.a())).y();
                } else {
                    jY = j9;
                    iVar4 = iVar3;
                }
            } else {
                if (i12 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if ((i9 & 8) != 0) {
                    i10 &= -7169;
                    iVar4 = iVar3;
                    jY = ((C1598l0) interfaceC3163lP.e(B.a())).y();
                } else {
                    jY = j9;
                    iVar4 = iVar3;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-2142239481, i10, -1, "androidx.compose.material3.Icon (Icon.kt:136)");
            }
            interfaceC3163lP.f(69356724);
            if (((i10 & 7168) ^ 3072) <= 2048) {
            }
            objG = interfaceC3163lP.g();
            if (z8) {
                if (C1598l0.q(jY, C1598l0.f9405b.e())) {
                    objG = null;
                } else {
                    objG = C1600m0.a.b(C1600m0.f9420b, jY, 0, 2, null);
                }
                interfaceC3163lP.H(objG);
            } else {
                if (C1598l0.q(jY, C1598l0.f9405b.e())) {
                    objG = null;
                } else {
                    objG = C1600m0.a.b(C1600m0.f9420b, jY, 0, 2, null);
                }
                interfaceC3163lP.H(objG);
            }
            C1600m0 c1600m2 = (C1600m0) objG;
            interfaceC3163lP.N();
            interfaceC3163lP.f(69356847);
            if (str != null) {
                i.a aVar3 = i.f4836a;
                interfaceC3163lP.f(69356912);
                if ((i10 & 112) == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objG2 = interfaceC3163lP.g();
                if (z9) {
                    objG2 = new c(str);
                    interfaceC3163lP.H(objG2);
                } else {
                    objG2 = new c(str);
                    interfaceC3163lP.H(objG2);
                }
                interfaceC3163lP.N();
                iVarD = n.d(aVar3, false, (k) objG2, 1, null);
            } else {
                iVarD = i.f4836a;
            }
            i iVar8 = iVarD;
            interfaceC3163lP.N();
            AbstractC2601e.a(androidx.compose.ui.draw.b.b(c(androidx.compose.ui.graphics.b.d(iVar4), bVar), bVar, false, null, InterfaceC2235f.f20468a.c(), 0.0f, c1600m2, 22, null).j(iVar8), interfaceC3163lP, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar5 = iVar4;
            j10 = jY;
        }
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(bVar, str, iVar5, j10, i8, i9));
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public static final void b(d dVar, String str, i iVar, long j8, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        String str2;
        i iVar2;
        long j9;
        i iVar3;
        i iVar4;
        long jY;
        P0 p0V;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-126890956);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 6) == 0) {
            i10 = (interfaceC3163lP.R(dVar) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
            str2 = str;
        } else {
            str2 = str;
            if ((i8 & 48) == 0) {
                i10 |= interfaceC3163lP.R(str2) ? 32 : 16;
            }
        }
        int i11 = i9 & 4;
        if (i11 == 0) {
            if ((i8 & 384) == 0) {
                iVar2 = iVar;
                i10 |= interfaceC3163lP.R(iVar2) ? 256 : 128;
            }
            if ((i8 & 3072) == 0) {
                if ((i9 & 8) == 0) {
                    j9 = j8;
                    int i12 = interfaceC3163lP.j(j9) ? 2048 : 1024;
                    i10 |= i12;
                } else {
                    j9 = j8;
                }
                i10 |= i12;
            } else {
                j9 = j8;
            }
            if ((i10 & 1171) == 1170 || !interfaceC3163lP.s()) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0 || interfaceC3163lP.F()) {
                    if (i11 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if ((i9 & 8) != 0) {
                        i10 &= -7169;
                        iVar4 = iVar3;
                        jY = ((C1598l0) interfaceC3163lP.e(B.a())).y();
                    } else {
                        iVar4 = iVar3;
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-126890956, i10, -1, "androidx.compose.material3.Icon (Icon.kt:65)");
                    }
                    a(q.g(dVar, interfaceC3163lP, i10 & 14), str2, iVar4, jY, interfaceC3163lP, VectorPainter.f14716n | (i10 & 112) | (i10 & 896) | (i10 & 7168), 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar2 = iVar4;
                    j9 = jY;
                } else {
                    interfaceC3163lP.z();
                    if ((i9 & 8) != 0) {
                        i10 &= -7169;
                    }
                    iVar4 = iVar2;
                }
                jY = j9;
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-126890956, i10, -1, "androidx.compose.material3.Icon (Icon.kt:65)");
                }
                a(q.g(dVar, interfaceC3163lP, i10 & 14), str2, iVar4, jY, interfaceC3163lP, VectorPainter.f14716n | (i10 & 112) | (i10 & 896) | (i10 & 7168), 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar2 = iVar4;
                j9 = jY;
            } else {
                interfaceC3163lP.z();
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new a(dVar, str, iVar2, j9, i8, i9));
            }
        }
        i10 |= 384;
        iVar2 = iVar;
        if ((i8 & 3072) == 0) {
            if ((i9 & 8) == 0) {
                j9 = j8;
                if (interfaceC3163lP.j(j9)) {
                }
                i10 |= i12;
            } else {
                j9 = j8;
            }
            i10 |= i12;
        } else {
            j9 = j8;
        }
        if ((i10 & 1171) == 1170) {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i11 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if ((i9 & 8) != 0) {
                    i10 &= -7169;
                    iVar4 = iVar3;
                    jY = ((C1598l0) interfaceC3163lP.e(B.a())).y();
                } else {
                    iVar4 = iVar3;
                    jY = j9;
                }
            } else {
                if (i11 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if ((i9 & 8) != 0) {
                    i10 &= -7169;
                    iVar4 = iVar3;
                    jY = ((C1598l0) interfaceC3163lP.e(B.a())).y();
                } else {
                    iVar4 = iVar3;
                    jY = j9;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-126890956, i10, -1, "androidx.compose.material3.Icon (Icon.kt:65)");
            }
            a(q.g(dVar, interfaceC3163lP, i10 & 14), str2, iVar4, jY, interfaceC3163lP, VectorPainter.f14716n | (i10 & 112) | (i10 & 896) | (i10 & 7168), 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar2 = iVar4;
            j9 = jY;
        } else {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i11 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if ((i9 & 8) != 0) {
                    i10 &= -7169;
                    iVar4 = iVar3;
                    jY = ((C1598l0) interfaceC3163lP.e(B.a())).y();
                } else {
                    iVar4 = iVar3;
                    jY = j9;
                }
            } else {
                if (i11 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if ((i9 & 8) != 0) {
                    i10 &= -7169;
                    iVar4 = iVar3;
                    jY = ((C1598l0) interfaceC3163lP.e(B.a())).y();
                } else {
                    iVar4 = iVar3;
                    jY = j9;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-126890956, i10, -1, "androidx.compose.material3.Icon (Icon.kt:65)");
            }
            a(q.g(dVar, interfaceC3163lP, i10 & 14), str2, iVar4, jY, interfaceC3163lP, VectorPainter.f14716n | (i10 & 112) | (i10 & 896) | (i10 & 7168), 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar2 = iVar4;
            j9 = jY;
        }
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new a(dVar, str, iVar2, j9, i8, i9));
        }
    }

    public static final i c(i iVar, U0.b bVar) {
        return iVar.j((l.f(bVar.h(), l.f9103b.a()) || d(bVar.h())) ? f35615a : i.f4836a);
    }

    public static final boolean d(long j8) {
        return Float.isInfinite(l.i(j8)) && Float.isInfinite(l.g(j8));
    }
}
