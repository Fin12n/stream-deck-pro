package J3;

import C6.G;
import java.io.IOException;
import kotlin.jvm.internal.u;
import org.xmlpull.v1.XmlPullParserException;
import p191w0.O;
import p191w0.Z;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f4157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L0.i f4158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Integer f4159c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f4160d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f4161e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i8, L0.i iVar, Integer num, int i9, int i10) {
            super(2);
            this.f4157a = i8;
            this.f4158b = iVar;
            this.f4159c = num;
            this.f4160d = i9;
            this.f4161e = i10;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) throws XmlPullParserException, IOException {
            e.a(this.f4157a, this.f4158b, this.f4159c, interfaceC3163l, F0.a(this.f4160d | 1), this.f4161e);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static final void a(int i8, L0.i iVar, Integer num, InterfaceC3163l interfaceC3163l, int i9, int i10) throws XmlPullParserException, IOException {
        int i11;
        L0.i iVar2;
        int i12;
        Integer num2;
        int i13;
        L0.i iVar3;
        Integer num3;
        L0.i iVar4;
        Integer num4;
        P0 p0V;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-2084191033);
        if ((i10 & 1) != 0) {
            i11 = i9 | 6;
        } else if ((i9 & 14) == 0) {
            i11 = (interfaceC3163lP.i(i8) ? 4 : 2) | i9;
        } else {
            i11 = i9;
        }
        int i14 = i10 & 2;
        if (i14 == 0) {
            if ((i9 & 112) == 0) {
                iVar2 = iVar;
                i11 |= interfaceC3163lP.R(iVar2) ? 32 : 16;
            }
            i12 = i10 & 4;
            if (i12 != 0) {
                if ((i9 & 896) == 0) {
                    num2 = num;
                    if (interfaceC3163lP.R(num2)) {
                        i13 = 256;
                    } else {
                        i13 = 128;
                    }
                    i11 |= i13;
                }
                if ((i11 & 731) == 146 || !interfaceC3163lP.s()) {
                    if (i14 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i12 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-2084191033, i11, -1, "com.elgato.streamdeck.ui.components.CircleIcon (CircleIcon.kt:22)");
                    }
                    V0.d dVarB = p101l1.g.b(V0.d.f10289k, i8, interfaceC3163lP, ((i11 << 3) & 112) | 8);
                    interfaceC3163lP.f(-916050116);
                    String strB = num3 != null ? p101l1.f.b(num3.intValue(), interfaceC3163lP, 0) : null;
                    interfaceC3163lP.N();
                    Z z8 = Z.f35786a;
                    int i15 = Z.f35787b;
                    O.b(dVarB, strB, androidx.compose.foundation.layout.e.i(androidx.compose.foundation.c.b(O0.f.a(iVar3, p135p0.g.f()), z8.a(interfaceC3163lP, i15).B(), null, 2, null), A1.h.m(6)), z8.a(interfaceC3163lP, i15).r(), interfaceC3163lP, 0, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar3;
                    num4 = num3;
                } else {
                    interfaceC3163lP.z();
                    iVar4 = iVar2;
                    num4 = num2;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new a(i8, iVar4, num4, i9, i10));
                }
            }
            i11 |= 384;
            num2 = num;
            if ((i11 & 731) == 146) {
                if (i14 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i12 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-2084191033, i11, -1, "com.elgato.streamdeck.ui.components.CircleIcon (CircleIcon.kt:22)");
                }
                V0.d dVarB2 = p101l1.g.b(V0.d.f10289k, i8, interfaceC3163lP, ((i11 << 3) & 112) | 8);
                interfaceC3163lP.f(-916050116);
                String strB2 = num3 != null ? p101l1.f.b(num3.intValue(), interfaceC3163lP, 0) : null;
                interfaceC3163lP.N();
                Z z9 = Z.f35786a;
                int i16 = Z.f35787b;
                O.b(dVarB2, strB2, androidx.compose.foundation.layout.e.i(androidx.compose.foundation.c.b(O0.f.a(iVar3, p135p0.g.f()), z9.a(interfaceC3163lP, i16).B(), null, 2, null), A1.h.m(6)), z9.a(interfaceC3163lP, i16).r(), interfaceC3163lP, 0, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar3;
                num4 = num3;
            } else {
                if (i14 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i12 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-2084191033, i11, -1, "com.elgato.streamdeck.ui.components.CircleIcon (CircleIcon.kt:22)");
                }
                V0.d dVarB3 = p101l1.g.b(V0.d.f10289k, i8, interfaceC3163lP, ((i11 << 3) & 112) | 8);
                interfaceC3163lP.f(-916050116);
                String strB3 = num3 != null ? p101l1.f.b(num3.intValue(), interfaceC3163lP, 0) : null;
                interfaceC3163lP.N();
                Z z10 = Z.f35786a;
                int i17 = Z.f35787b;
                O.b(dVarB3, strB3, androidx.compose.foundation.layout.e.i(androidx.compose.foundation.c.b(O0.f.a(iVar3, p135p0.g.f()), z10.a(interfaceC3163lP, i17).B(), null, 2, null), A1.h.m(6)), z10.a(interfaceC3163lP, i17).r(), interfaceC3163lP, 0, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar3;
                num4 = num3;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new a(i8, iVar4, num4, i9, i10));
            }
        }
        i11 |= 48;
        iVar2 = iVar;
        i12 = i10 & 4;
        if (i12 != 0) {
            if ((i9 & 896) == 0) {
                num2 = num;
                if (interfaceC3163lP.R(num2)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i11 |= i13;
            }
            if ((i11 & 731) == 146) {
                if (i14 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i12 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-2084191033, i11, -1, "com.elgato.streamdeck.ui.components.CircleIcon (CircleIcon.kt:22)");
                }
                V0.d dVarB4 = p101l1.g.b(V0.d.f10289k, i8, interfaceC3163lP, ((i11 << 3) & 112) | 8);
                interfaceC3163lP.f(-916050116);
                String strB4 = num3 != null ? p101l1.f.b(num3.intValue(), interfaceC3163lP, 0) : null;
                interfaceC3163lP.N();
                Z z11 = Z.f35786a;
                int i18 = Z.f35787b;
                O.b(dVarB4, strB4, androidx.compose.foundation.layout.e.i(androidx.compose.foundation.c.b(O0.f.a(iVar3, p135p0.g.f()), z11.a(interfaceC3163lP, i18).B(), null, 2, null), A1.h.m(6)), z11.a(interfaceC3163lP, i18).r(), interfaceC3163lP, 0, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar3;
                num4 = num3;
            } else {
                if (i14 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i12 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-2084191033, i11, -1, "com.elgato.streamdeck.ui.components.CircleIcon (CircleIcon.kt:22)");
                }
                V0.d dVarB5 = p101l1.g.b(V0.d.f10289k, i8, interfaceC3163lP, ((i11 << 3) & 112) | 8);
                interfaceC3163lP.f(-916050116);
                String strB5 = num3 != null ? p101l1.f.b(num3.intValue(), interfaceC3163lP, 0) : null;
                interfaceC3163lP.N();
                Z z12 = Z.f35786a;
                int i19 = Z.f35787b;
                O.b(dVarB5, strB5, androidx.compose.foundation.layout.e.i(androidx.compose.foundation.c.b(O0.f.a(iVar3, p135p0.g.f()), z12.a(interfaceC3163lP, i19).B(), null, 2, null), A1.h.m(6)), z12.a(interfaceC3163lP, i19).r(), interfaceC3163lP, 0, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar3;
                num4 = num3;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new a(i8, iVar4, num4, i9, i10));
            }
        }
        i11 |= 384;
        num2 = num;
        if ((i11 & 731) == 146) {
            if (i14 != 0) {
                iVar3 = L0.i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (i12 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-2084191033, i11, -1, "com.elgato.streamdeck.ui.components.CircleIcon (CircleIcon.kt:22)");
            }
            V0.d dVarB6 = p101l1.g.b(V0.d.f10289k, i8, interfaceC3163lP, ((i11 << 3) & 112) | 8);
            interfaceC3163lP.f(-916050116);
            String strB6 = num3 != null ? p101l1.f.b(num3.intValue(), interfaceC3163lP, 0) : null;
            interfaceC3163lP.N();
            Z z13 = Z.f35786a;
            int i110 = Z.f35787b;
            O.b(dVarB6, strB6, androidx.compose.foundation.layout.e.i(androidx.compose.foundation.c.b(O0.f.a(iVar3, p135p0.g.f()), z13.a(interfaceC3163lP, i110).B(), null, 2, null), A1.h.m(6)), z13.a(interfaceC3163lP, i110).r(), interfaceC3163lP, 0, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar4 = iVar3;
            num4 = num3;
        } else {
            if (i14 != 0) {
                iVar3 = L0.i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (i12 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-2084191033, i11, -1, "com.elgato.streamdeck.ui.components.CircleIcon (CircleIcon.kt:22)");
            }
            V0.d dVarB7 = p101l1.g.b(V0.d.f10289k, i8, interfaceC3163lP, ((i11 << 3) & 112) | 8);
            interfaceC3163lP.f(-916050116);
            String strB7 = num3 != null ? p101l1.f.b(num3.intValue(), interfaceC3163lP, 0) : null;
            interfaceC3163lP.N();
            Z z14 = Z.f35786a;
            int i111 = Z.f35787b;
            O.b(dVarB7, strB7, androidx.compose.foundation.layout.e.i(androidx.compose.foundation.c.b(O0.f.a(iVar3, p135p0.g.f()), z14.a(interfaceC3163lP, i111).B(), null, 2, null), A1.h.m(6)), z14.a(interfaceC3163lP, i111).r(), interfaceC3163lP, 0, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar4 = iVar3;
            num4 = num3;
        }
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new a(i8, iVar4, num4, i9, i10));
        }
    }
}
