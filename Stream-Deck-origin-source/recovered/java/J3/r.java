package J3;

import C6.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p082j0.J;
import p128o1.I;
import p191w0.Z;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f4302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L0.i f4303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ J f4304c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ I f4305d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Function0 f4306e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f4307f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f4308g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i8, L0.i iVar, J j8, I i9, Function0 function0, int i10, int i11) {
            super(2);
            this.f4302a = i8;
            this.f4303b = iVar;
            this.f4304c = j8;
            this.f4305d = i9;
            this.f4306e = function0;
            this.f4307f = i10;
            this.f4308g = i11;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            r.a(this.f4302a, this.f4303b, this.f4304c, this.f4305d, this.f4306e, interfaceC3163l, F0.a(this.f4307f | 1), this.f4308g);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x0101  */
    /* JADX WARN: Code duplicated, block: B:88:0x010e  */
    /* JADX WARN: Code duplicated, block: B:91:0x016e  */
    /* JADX WARN: Code duplicated, block: B:95:0x017b  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public static final void a(int i8, L0.i iVar, J j8, I i9, Function0 onClick, InterfaceC3163l interfaceC3163l, int i10, int i11) {
        int i12;
        L0.i iVar2;
        J j9;
        I i13;
        int i14;
        L0.i iVar3;
        J jA;
        int i15;
        L0.i iVar4;
        J j10;
        I iC;
        InterfaceC3163l interfaceC3163l2;
        L0.i iVar5;
        I i16;
        J j11;
        P0 p0V;
        t.g(onClick, "onClick");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-901318509);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (interfaceC3163lP.i(i8) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 112) == 0) {
                iVar2 = iVar;
                i12 |= interfaceC3163lP.R(iVar2) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                if ((i11 & 4) == 0) {
                    j9 = j8;
                    int i18 = interfaceC3163lP.R(j9) ? 256 : 128;
                    i12 |= i18;
                } else {
                    j9 = j8;
                }
                i12 |= i18;
            } else {
                j9 = j8;
            }
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    i13 = i9;
                    int i19 = interfaceC3163lP.R(i13) ? 2048 : 1024;
                    i12 |= i19;
                } else {
                    i13 = i9;
                }
                i12 |= i19;
            } else {
                i13 = i9;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (interfaceC3163lP.l(onClick)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((46811 & i12) == 9362 || !interfaceC3163lP.s()) {
                interfaceC3163lP.o();
                if ((i10 & 1) != 0 || interfaceC3163lP.F()) {
                    if (i17 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if ((i11 & 4) != 0) {
                        jA = androidx.compose.foundation.layout.e.a(W3.c.f11463a.h());
                        i12 &= -897;
                    } else {
                        jA = j9;
                    }
                    if ((i11 & 8) != 0) {
                        i15 = i12 & (-7169);
                        iVar4 = iVar3;
                        j10 = jA;
                        iC = Z.f35786a.c(interfaceC3163lP, Z.f35787b).c();
                    } else {
                        i15 = i12;
                        iVar4 = iVar3;
                        j10 = jA;
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-901318509, i15, -1, "com.elgato.streamdeck.ui.components.UnderlinedTextButton (UnderlinedTextButton.kt:27)");
                    }
                    int i20 = (i15 << 9) & 3670016;
                    interfaceC3163l2 = interfaceC3163lP;
                    iVar5 = iVar4;
                    J j12 = j10;
                    p191w0.P0.b(p101l1.f.b(i8, interfaceC3163lP, i15 & 14), androidx.compose.foundation.d.e(androidx.compose.foundation.layout.e.h(iVar4, j10), false, null, null, onClick, 7, null), 0L, 0L, null, null, null, 0L, p216z1.k.f39019b.d(), null, 0L, 0, false, 0, 0, null, iC, interfaceC3163l2, 100663296, i20, 65276);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    i16 = iC;
                    j11 = j12;
                } else {
                    interfaceC3163lP.z();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    i15 = i12;
                    iVar4 = iVar2;
                    j10 = j9;
                }
                iC = i13;
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-901318509, i15, -1, "com.elgato.streamdeck.ui.components.UnderlinedTextButton (UnderlinedTextButton.kt:27)");
                }
                int i21 = (i15 << 9) & 3670016;
                interfaceC3163l2 = interfaceC3163lP;
                iVar5 = iVar4;
                J j13 = j10;
                p191w0.P0.b(p101l1.f.b(i8, interfaceC3163lP, i15 & 14), androidx.compose.foundation.d.e(androidx.compose.foundation.layout.e.h(iVar4, j10), false, null, null, onClick, 7, null), 0L, 0L, null, null, null, 0L, p216z1.k.f39019b.d(), null, 0L, 0, false, 0, 0, null, iC, interfaceC3163l2, 100663296, i21, 65276);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                i16 = iC;
                j11 = j13;
            } else {
                interfaceC3163lP.z();
                iVar5 = iVar2;
                j11 = j9;
                i16 = i13;
                interfaceC3163l2 = interfaceC3163lP;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new a(i8, iVar5, j11, i16, onClick, i10, i11));
            }
        }
        i12 |= 48;
        iVar2 = iVar;
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                j9 = j8;
                if (interfaceC3163lP.R(j9)) {
                }
                i12 |= i18;
            } else {
                j9 = j8;
            }
            i12 |= i18;
        } else {
            j9 = j8;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                i13 = i9;
                if (interfaceC3163lP.R(i13)) {
                }
                i12 |= i19;
            } else {
                i13 = i9;
            }
            i12 |= i19;
        } else {
            i13 = i9;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (interfaceC3163lP.l(onClick)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i12 |= i14;
        }
        if ((46811 & i12) == 9362) {
            interfaceC3163lP.o();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if ((i11 & 4) != 0) {
                    jA = androidx.compose.foundation.layout.e.a(W3.c.f11463a.h());
                    i12 &= -897;
                } else {
                    jA = j9;
                }
                if ((i11 & 8) != 0) {
                    i15 = i12 & (-7169);
                    iVar4 = iVar3;
                    j10 = jA;
                    iC = Z.f35786a.c(interfaceC3163lP, Z.f35787b).c();
                } else {
                    i15 = i12;
                    iVar4 = iVar3;
                    j10 = jA;
                    iC = i13;
                }
            } else {
                if (i17 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if ((i11 & 4) != 0) {
                    jA = androidx.compose.foundation.layout.e.a(W3.c.f11463a.h());
                    i12 &= -897;
                } else {
                    jA = j9;
                }
                if ((i11 & 8) != 0) {
                    i15 = i12 & (-7169);
                    iVar4 = iVar3;
                    j10 = jA;
                    iC = Z.f35786a.c(interfaceC3163lP, Z.f35787b).c();
                } else {
                    i15 = i12;
                    iVar4 = iVar3;
                    j10 = jA;
                    iC = i13;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-901318509, i15, -1, "com.elgato.streamdeck.ui.components.UnderlinedTextButton (UnderlinedTextButton.kt:27)");
            }
            int i22 = (i15 << 9) & 3670016;
            interfaceC3163l2 = interfaceC3163lP;
            iVar5 = iVar4;
            J j14 = j10;
            p191w0.P0.b(p101l1.f.b(i8, interfaceC3163lP, i15 & 14), androidx.compose.foundation.d.e(androidx.compose.foundation.layout.e.h(iVar4, j10), false, null, null, onClick, 7, null), 0L, 0L, null, null, null, 0L, p216z1.k.f39019b.d(), null, 0L, 0, false, 0, 0, null, iC, interfaceC3163l2, 100663296, i22, 65276);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            i16 = iC;
            j11 = j14;
        } else {
            interfaceC3163lP.o();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if ((i11 & 4) != 0) {
                    jA = androidx.compose.foundation.layout.e.a(W3.c.f11463a.h());
                    i12 &= -897;
                } else {
                    jA = j9;
                }
                if ((i11 & 8) != 0) {
                    i15 = i12 & (-7169);
                    iVar4 = iVar3;
                    j10 = jA;
                    iC = Z.f35786a.c(interfaceC3163lP, Z.f35787b).c();
                } else {
                    i15 = i12;
                    iVar4 = iVar3;
                    j10 = jA;
                    iC = i13;
                }
            } else {
                if (i17 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if ((i11 & 4) != 0) {
                    jA = androidx.compose.foundation.layout.e.a(W3.c.f11463a.h());
                    i12 &= -897;
                } else {
                    jA = j9;
                }
                if ((i11 & 8) != 0) {
                    i15 = i12 & (-7169);
                    iVar4 = iVar3;
                    j10 = jA;
                    iC = Z.f35786a.c(interfaceC3163lP, Z.f35787b).c();
                } else {
                    i15 = i12;
                    iVar4 = iVar3;
                    j10 = jA;
                    iC = i13;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-901318509, i15, -1, "com.elgato.streamdeck.ui.components.UnderlinedTextButton (UnderlinedTextButton.kt:27)");
            }
            int i23 = (i15 << 9) & 3670016;
            interfaceC3163l2 = interfaceC3163lP;
            iVar5 = iVar4;
            J j15 = j10;
            p191w0.P0.b(p101l1.f.b(i8, interfaceC3163lP, i15 & 14), androidx.compose.foundation.d.e(androidx.compose.foundation.layout.e.h(iVar4, j10), false, null, null, onClick, 7, null), 0L, 0L, null, null, null, 0L, p216z1.k.f39019b.d(), null, 0L, 0, false, 0, 0, null, iC, interfaceC3163l2, 100663296, i23, 65276);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            i16 = iC;
            j11 = j15;
        }
        p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new a(i8, iVar5, j11, i16, onClick, i10, i11));
        }
    }
}
