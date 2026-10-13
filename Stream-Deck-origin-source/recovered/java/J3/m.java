package J3;

import C6.G;
import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p082j0.C2598b;
import p082j0.J;
import p091k0.AbstractC2622a;
import p091k0.y;
import p091k0.z;
import p128o1.I;
import p191w0.C3089v;
import p191w0.T;
import p191w0.U;
import p191w0.U0;
import p191w0.Z;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L0.i f4266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J f4267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y f4268c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Q6.k f4269d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f4270e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f4271f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L0.i iVar, J j8, y yVar, Q6.k kVar, int i8, int i9) {
            super(2);
            this.f4266a = iVar;
            this.f4267b = j8;
            this.f4268c = yVar;
            this.f4269d = kVar;
            this.f4270e = i8;
            this.f4271f = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            m.a(this.f4266a, this.f4267b, this.f4268c, this.f4269d, interfaceC3163l, F0.a(this.f4270e | 1), this.f4271f);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x0134  */
    /* JADX WARN: Code duplicated, block: B:79:0x0140  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public static final void a(L0.i iVar, J j8, y yVar, Q6.k content, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        L0.i iVar2;
        int i10;
        J j9;
        y yVarC;
        int i11;
        L0.i iVar3;
        J jA;
        L0.i iVar4;
        J j10;
        y yVar2;
        L0.i iVar5;
        J j11;
        P0 p0V;
        t.g(content, "content");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-2043727708);
        int i12 = i9 & 1;
        if (i12 != 0) {
            i10 = i8 | 6;
            iVar2 = iVar;
        } else if ((i8 & 14) == 0) {
            iVar2 = iVar;
            i10 = (interfaceC3163lP.R(iVar2) ? 4 : 2) | i8;
        } else {
            iVar2 = iVar;
            i10 = i8;
        }
        int i13 = i9 & 2;
        if (i13 == 0) {
            if ((i8 & 112) == 0) {
                j9 = j8;
                i10 |= interfaceC3163lP.R(j9) ? 32 : 16;
            }
            if ((i8 & 896) == 0) {
                if ((i9 & 4) == 0) {
                    yVarC = yVar;
                    int i14 = interfaceC3163lP.R(yVarC) ? 256 : 128;
                    i10 |= i14;
                } else {
                    yVarC = yVar;
                }
                i10 |= i14;
            } else {
                yVarC = yVar;
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
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i13 != 0) {
                        jA = androidx.compose.foundation.layout.e.a(A1.h.m(0));
                    } else {
                        jA = j9;
                    }
                    if ((i9 & 4) != 0) {
                        i10 &= -897;
                        iVar4 = iVar3;
                        j10 = jA;
                        yVarC = z.c(0, 0, interfaceC3163lP, 0, 3);
                    } else {
                        iVar4 = iVar3;
                        j10 = jA;
                    }
                } else {
                    interfaceC3163lP.z();
                    if ((i9 & 4) != 0) {
                        i10 &= -897;
                    }
                    iVar4 = iVar2;
                    j10 = j9;
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-2043727708, i10, -1, "com.elgato.streamdeck.ui.components.LazyColumnForm (LazyColumnForm.kt:27)");
                }
                L0.i iVarF = androidx.compose.foundation.layout.f.f(androidx.compose.foundation.c.b(iVar4, c(Z.f35786a.a(interfaceC3163lP, Z.f35787b), interfaceC3163lP, 0), null, 2, null), 0.0f, 1, null);
                W3.c cVar = W3.c.f11463a;
                int i15 = i10 >> 3;
                J j12 = j10;
                y yVar3 = yVarC;
                AbstractC2622a.a(iVarF, yVar3, K3.d.a(j10, g(cVar), interfaceC3163lP, i15 & 14), false, C2598b.f27914a.n(i(cVar)), null, null, false, content, interfaceC3163lP, (i15 & 112) | ((i10 << 15) & 234881024), 232);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                yVar2 = yVar3;
                iVar5 = iVar4;
                j11 = j12;
            } else {
                interfaceC3163lP.z();
                iVar5 = iVar2;
                j11 = j9;
                yVar2 = yVarC;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new a(iVar5, j11, yVar2, content, i8, i9));
            }
        }
        i10 |= 48;
        j9 = j8;
        if ((i8 & 896) == 0) {
            if ((i9 & 4) == 0) {
                yVarC = yVar;
                if (interfaceC3163lP.R(yVarC)) {
                }
                i10 |= i14;
            } else {
                yVarC = yVar;
            }
            i10 |= i14;
        } else {
            yVarC = yVar;
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
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i13 != 0) {
                    jA = androidx.compose.foundation.layout.e.a(A1.h.m(0));
                } else {
                    jA = j9;
                }
                if ((i9 & 4) != 0) {
                    i10 &= -897;
                    iVar4 = iVar3;
                    j10 = jA;
                    yVarC = z.c(0, 0, interfaceC3163lP, 0, 3);
                } else {
                    iVar4 = iVar3;
                    j10 = jA;
                }
            } else {
                if (i12 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i13 != 0) {
                    jA = androidx.compose.foundation.layout.e.a(A1.h.m(0));
                } else {
                    jA = j9;
                }
                if ((i9 & 4) != 0) {
                    i10 &= -897;
                    iVar4 = iVar3;
                    j10 = jA;
                    yVarC = z.c(0, 0, interfaceC3163lP, 0, 3);
                } else {
                    iVar4 = iVar3;
                    j10 = jA;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-2043727708, i10, -1, "com.elgato.streamdeck.ui.components.LazyColumnForm (LazyColumnForm.kt:27)");
            }
            L0.i iVarF2 = androidx.compose.foundation.layout.f.f(androidx.compose.foundation.c.b(iVar4, c(Z.f35786a.a(interfaceC3163lP, Z.f35787b), interfaceC3163lP, 0), null, 2, null), 0.0f, 1, null);
            W3.c cVar2 = W3.c.f11463a;
            int i16 = i10 >> 3;
            J j13 = j10;
            y yVar4 = yVarC;
            AbstractC2622a.a(iVarF2, yVar4, K3.d.a(j10, g(cVar2), interfaceC3163lP, i16 & 14), false, C2598b.f27914a.n(i(cVar2)), null, null, false, content, interfaceC3163lP, (i16 & 112) | ((i10 << 15) & 234881024), 232);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            yVar2 = yVar4;
            iVar5 = iVar4;
            j11 = j13;
        } else {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i12 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i13 != 0) {
                    jA = androidx.compose.foundation.layout.e.a(A1.h.m(0));
                } else {
                    jA = j9;
                }
                if ((i9 & 4) != 0) {
                    i10 &= -897;
                    iVar4 = iVar3;
                    j10 = jA;
                    yVarC = z.c(0, 0, interfaceC3163lP, 0, 3);
                } else {
                    iVar4 = iVar3;
                    j10 = jA;
                }
            } else {
                if (i12 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i13 != 0) {
                    jA = androidx.compose.foundation.layout.e.a(A1.h.m(0));
                } else {
                    jA = j9;
                }
                if ((i9 & 4) != 0) {
                    i10 &= -897;
                    iVar4 = iVar3;
                    j10 = jA;
                    yVarC = z.c(0, 0, interfaceC3163lP, 0, 3);
                } else {
                    iVar4 = iVar3;
                    j10 = jA;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-2043727708, i10, -1, "com.elgato.streamdeck.ui.components.LazyColumnForm (LazyColumnForm.kt:27)");
            }
            L0.i iVarF3 = androidx.compose.foundation.layout.f.f(androidx.compose.foundation.c.b(iVar4, c(Z.f35786a.a(interfaceC3163lP, Z.f35787b), interfaceC3163lP, 0), null, 2, null), 0.0f, 1, null);
            W3.c cVar3 = W3.c.f11463a;
            int i17 = i10 >> 3;
            J j14 = j10;
            y yVar5 = yVarC;
            AbstractC2622a.a(iVarF3, yVar5, K3.d.a(j10, g(cVar3), interfaceC3163lP, i17 & 14), false, C2598b.f27914a.n(i(cVar3)), null, null, false, content, interfaceC3163lP, (i17 & 112) | ((i10 << 15) & 234881024), 232);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            yVar2 = yVar5;
            iVar5 = iVar4;
            j11 = j14;
        }
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new a(iVar5, j11, yVar2, content, i8, i9));
        }
    }

    public static final long c(C3089v c3089v, InterfaceC3163l interfaceC3163l, int i8) {
        t.g(c3089v, "<this>");
        interfaceC3163l.f(-422622536);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-422622536, i8, -1, "com.elgato.streamdeck.ui.components.<get-formBackground> (LazyColumnForm.kt:58)");
        }
        long jG = ((p014b4.c) interfaceC3163l.e(p014b4.b.a())).a() ? c3089v.G() : c3089v.C();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return jG;
    }

    public static final long d(C3089v c3089v, InterfaceC3163l interfaceC3163l, int i8) {
        t.g(c3089v, "<this>");
        interfaceC3163l.f(-1600519342);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1600519342, i8, -1, "com.elgato.streamdeck.ui.components.<get-formGroupBackground> (LazyColumnForm.kt:62)");
        }
        long jC = ((p014b4.c) interfaceC3163l.e(p014b4.b.a())).a() ? c3089v.C() : c3089v.F();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return jC;
    }

    public static final long e(C3089v c3089v, InterfaceC3163l interfaceC3163l, int i8) {
        t.g(c3089v, "<this>");
        interfaceC3163l.f(1056200906);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1056200906, i8, -1, "com.elgato.streamdeck.ui.components.<get-formGroupButton> (LazyColumnForm.kt:66)");
        }
        long jG = ((p014b4.c) interfaceC3163l.e(p014b4.b.a())).a() ? c3089v.G() : c3089v.C();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return jG;
    }

    public static final float f(W3.c cVar) {
        t.g(cVar, "<this>");
        return cVar.k();
    }

    public static final J g(W3.c cVar) {
        t.g(cVar, "<this>");
        return androidx.compose.foundation.layout.e.b(f(cVar), h(cVar));
    }

    public static final float h(W3.c cVar) {
        t.g(cVar, "<this>");
        return cVar.m();
    }

    public static final float i(W3.c cVar) {
        t.g(cVar, "<this>");
        return cVar.m();
    }

    public static final I j(U0 u8) {
        t.g(u8, "<this>");
        return u8.a();
    }

    public static final T b(U u8, InterfaceC3163l interfaceC3163l, int i8) {
        t.g(u8, LYdqVGvOGMNr.wqh);
        interfaceC3163l.f(-580441068);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-580441068, i8, -1, "com.elgato.streamdeck.ui.components.formColors (LazyColumnForm.kt:40)");
        }
        T tA = u8.a(d(Z.f35786a.a(interfaceC3163l, Z.f35787b), interfaceC3163l, 0), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, interfaceC3163l, (U.f35702c << 27) | ((i8 << 27) & 1879048192), 510);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return tA;
    }
}
