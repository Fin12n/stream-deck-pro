package J3;

import C6.G;
import R0.T0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2252x;
import p038e1.H;
import p056g1.InterfaceC2343g;
import p082j0.AbstractC2601e;
import p082j0.J;
import p082j0.T;
import p082j0.X;
import p191w0.AbstractC3078p;
import p191w0.C3072m;
import p191w0.O;
import p191w0.P0;
import p191w0.Z;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3184w;
import p215z0.R0;
import p215z0.v1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f4119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L0.i f4120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ V0.d f4121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f4122d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ J3.c f4123e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ T0 f4124f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f4125g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Function0 f4126h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f4127i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f4128j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i8, L0.i iVar, V0.d dVar, d dVar2, J3.c cVar, T0 t8, boolean z8, Function0 function0, int i9, int i10) {
            super(2);
            this.f4119a = i8;
            this.f4120b = iVar;
            this.f4121c = dVar;
            this.f4122d = dVar2;
            this.f4123e = cVar;
            this.f4124f = t8;
            this.f4125g = z8;
            this.f4126h = function0;
            this.f4127i = i9;
            this.f4128j = i10;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            b.a(this.f4119a, this.f4120b, this.f4121c, this.f4122d, this.f4123e, this.f4124f, this.f4125g, this.f4126h, interfaceC3163l, F0.a(this.f4127i | 1), this.f4128j);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: J3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0156b extends u implements Q6.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V0.d f4129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J3.c f4130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f4131c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0156b(V0.d dVar, J3.c cVar, String str) {
            super(3);
            this.f4129a = dVar;
            this.f4130b = cVar;
            this.f4131c = str;
        }

        public final void b(T Button, InterfaceC3163l interfaceC3163l, int i8) {
            t.g(Button, "$this$Button");
            if ((i8 & 81) == 16 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(81630879, i8, -1, "com.elgato.streamdeck.ui.components.Button.<anonymous> (Button.kt:148)");
            }
            V0.d dVar = this.f4129a;
            interfaceC3163l.f(1471066803);
            if (dVar != null) {
                J3.c cVar = this.f4130b;
                L0.i.a aVar = L0.i.f4836a;
                O.b(dVar, null, androidx.compose.foundation.layout.f.l(aVar, cVar.c(interfaceC3163l, 0)), 0L, interfaceC3163l, 48, 8);
                X.a(androidx.compose.foundation.layout.f.p(aVar, W3.c.f11463a.h()), interfaceC3163l, 0);
                G g8 = G.f1419a;
            }
            interfaceC3163l.N();
            L0.i iVarB = androidx.compose.foundation.layout.f.b(L0.i.f4836a, 0.0f, this.f4130b.c(interfaceC3163l, 0), 1, null);
            L0.c cVarE = L0.c.f4806a.e();
            String str = this.f4131c;
            V0.d dVar2 = this.f4129a;
            J3.c cVar2 = this.f4130b;
            interfaceC3163l.f(733328855);
            H hG = AbstractC2601e.g(cVarE, false, interfaceC3163l, 6);
            interfaceC3163l.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163l, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
            InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar2.a();
            Q6.p pVarB = AbstractC2252x.b(iVarB);
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
            v1.b(interfaceC3163lA, hG, aVar2.c());
            v1.b(interfaceC3163lA, interfaceC3184wE, aVar2.e());
            Q6.o oVarB = aVar2.b();
            if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
            interfaceC3163l.f(2058660585);
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f14485a;
            P0.b(str, null, 0L, 0L, null, null, null, 0L, null, dVar2 == null ? p216z1.j.h(p216z1.j.f39010b.a()) : null, 0L, 0, false, 0, 0, null, cVar2.d(interfaceC3163l, 0), interfaceC3163l, 0, 0, 65022);
            interfaceC3163l.N();
            interfaceC3163l.O();
            interfaceC3163l.N();
            interfaceC3163l.N();
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

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f4132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L0.i f4133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ V0.d f4134c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f4135d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ J3.c f4136e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ T0 f4137f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f4138g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Function0 f4139h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f4140i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f4141j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, L0.i iVar, V0.d dVar, d dVar2, J3.c cVar, T0 t8, boolean z8, Function0 function0, int i8, int i9) {
            super(2);
            this.f4132a = str;
            this.f4133b = iVar;
            this.f4134c = dVar;
            this.f4135d = dVar2;
            this.f4136e = cVar;
            this.f4137f = t8;
            this.f4138g = z8;
            this.f4139h = function0;
            this.f4140i = i8;
            this.f4141j = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            b.b(this.f4132a, this.f4133b, this.f4134c, this.f4135d, this.f4136e, this.f4137f, this.f4138g, this.f4139h, interfaceC3163l, F0.a(this.f4140i | 1), this.f4141j);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0127 A[PHI: r3 r5 r7 r11 r14 r15
      0x0127: PHI (r3v27 int) = (r3v22 int), (r3v21 int), (r3v28 int) binds: [B:115:0x0155, B:100:0x0124, B:101:0x0126] A[DONT_GENERATE, DONT_INLINE]
      0x0127: PHI (r5v8 L0.i) = (r5v3 L0.i), (r5v2 L0.i), (r5v2 L0.i) binds: [B:115:0x0155, B:100:0x0124, B:101:0x0126] A[DONT_GENERATE, DONT_INLINE]
      0x0127: PHI (r7v8 V0.d) = (r7v3 V0.d), (r7v2 V0.d), (r7v2 V0.d) binds: [B:115:0x0155, B:100:0x0124, B:101:0x0126] A[DONT_GENERATE, DONT_INLINE]
      0x0127: PHI (r11v8 J3.d) = (r11v3 J3.d), (r11v2 J3.d), (r11v2 J3.d) binds: [B:115:0x0155, B:100:0x0124, B:101:0x0126] A[DONT_GENERATE, DONT_INLINE]
      0x0127: PHI (r14v7 J3.c) = (r14v4 J3.c), (r14v3 J3.c), (r14v3 J3.c) binds: [B:115:0x0155, B:100:0x0124, B:101:0x0126] A[DONT_GENERATE, DONT_INLINE]
      0x0127: PHI (r15v11 R0.T0) = (r15v8 R0.T0), (r15v7 R0.T0), (r15v7 R0.T0) binds: [B:115:0x0155, B:100:0x0124, B:101:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0132  */
    /* JADX WARN: Code duplicated, block: B:107:0x0137  */
    /* JADX WARN: Code duplicated, block: B:109:0x013b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0140  */
    /* JADX WARN: Code duplicated, block: B:114:0x0147  */
    /* JADX WARN: Code duplicated, block: B:116:0x0157  */
    /* JADX WARN: Code duplicated, block: B:119:0x0163  */
    /* JADX WARN: Code duplicated, block: B:122:0x0183  */
    /* JADX WARN: Code duplicated, block: B:126:0x0192  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:94:0x010e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0118  */
    public static final void a(int i8, L0.i iVar, V0.d dVar, d dVar2, J3.c cVar, T0 t8, boolean z8, Function0 onClick, InterfaceC3163l interfaceC3163l, int i9, int i10) {
        int i11;
        L0.i iVar2;
        int i12;
        V0.d dVar3;
        int i13;
        int i14;
        d dVar4;
        int i15;
        int i16;
        J3.c cVar2;
        int i17;
        T0 t0E;
        int i18;
        int i19;
        int i20;
        boolean z9;
        int i21;
        L0.i iVar3;
        V0.d dVar5;
        d dVar6;
        J3.c cVar3;
        T0 t9;
        boolean z10;
        p215z0.P0 p0V;
        t.g(onClick, "onClick");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-809291203);
        if ((i10 & 1) != 0) {
            i11 = i9 | 6;
        } else if ((i9 & 14) == 0) {
            i11 = (interfaceC3163lP.i(i8) ? 4 : 2) | i9;
        } else {
            i11 = i9;
        }
        int i22 = i10 & 2;
        if (i22 == 0) {
            if ((i9 & 112) == 0) {
                iVar2 = iVar;
                i11 |= interfaceC3163lP.R(iVar2) ? 32 : 16;
            }
            i12 = i10 & 4;
            if (i12 != 0) {
                if ((i9 & 896) == 0) {
                    dVar3 = dVar;
                    if (interfaceC3163lP.R(dVar3)) {
                        i13 = 256;
                    } else {
                        i13 = 128;
                    }
                    i11 |= i13;
                }
                i14 = i10 & 8;
                if (i14 != 0) {
                    if ((i9 & 7168) == 0) {
                        dVar4 = dVar2;
                        if (interfaceC3163lP.R(dVar4)) {
                            i15 = 2048;
                        } else {
                            i15 = 1024;
                        }
                        i11 |= i15;
                    }
                    i16 = i10 & 16;
                    if (i16 != 0) {
                        if ((57344 & i9) == 0) {
                            cVar2 = cVar;
                            if (interfaceC3163lP.R(cVar2)) {
                                i17 = 16384;
                            } else {
                                i17 = 8192;
                            }
                            i11 |= i17;
                        }
                        if ((458752 & i9) == 0) {
                            if ((i10 & 32) == 0) {
                                t0E = t8;
                                int i23 = interfaceC3163lP.R(t0E) ? 131072 : 65536;
                                i11 |= i23;
                            } else {
                                t0E = t8;
                            }
                            i11 |= i23;
                        } else {
                            t0E = t8;
                        }
                        i18 = i10 & 64;
                        if (i18 != 0) {
                            i11 |= 1572864;
                        } else if ((i9 & 3670016) == 0) {
                            if (interfaceC3163lP.c(z8)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i11 |= i19;
                        }
                        if ((i10 & 128) != 0) {
                            if ((i9 & 29360128) == 0) {
                                if (interfaceC3163lP.l(onClick)) {
                                    i20 = 8388608;
                                } else {
                                    i20 = 4194304;
                                }
                            }
                            if ((23967451 & i11) == 4793490 || !interfaceC3163lP.s()) {
                                interfaceC3163lP.o();
                                if ((i9 & 1) != 0 || interfaceC3163lP.F()) {
                                    if (i22 != 0) {
                                        iVar2 = L0.i.f4836a;
                                    }
                                    if (i12 != 0) {
                                        dVar3 = null;
                                    }
                                    if (i14 != 0) {
                                        dVar4 = d.f4150c;
                                    }
                                    if (i16 != 0) {
                                        cVar2 = J3.c.M;
                                    }
                                    if ((i10 & 32) != 0) {
                                        i11 &= -458753;
                                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                    }
                                    if (i18 != 0) {
                                        z9 = true;
                                    }
                                    i21 = i11;
                                    L0.i iVar4 = iVar2;
                                    V0.d dVar7 = dVar3;
                                    d dVar8 = dVar4;
                                    J3.c cVar4 = cVar2;
                                    T0 t10 = t0E;
                                    interfaceC3163lP.Q();
                                    if (AbstractC3169o.K()) {
                                        AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                                    }
                                    b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar4, dVar7, dVar8, cVar4, t10, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                                    if (AbstractC3169o.K()) {
                                        AbstractC3169o.V();
                                    }
                                    iVar3 = iVar4;
                                    dVar5 = dVar7;
                                    dVar6 = dVar8;
                                    cVar3 = cVar4;
                                    t9 = t10;
                                    z10 = z9;
                                } else {
                                    interfaceC3163lP.z();
                                    if ((i10 & 32) != 0) {
                                        i11 &= -458753;
                                    }
                                }
                                z9 = z8;
                                i21 = i11;
                                L0.i iVar5 = iVar2;
                                V0.d dVar9 = dVar3;
                                d dVar10 = dVar4;
                                J3.c cVar5 = cVar2;
                                T0 t11 = t0E;
                                interfaceC3163lP.Q();
                                if (AbstractC3169o.K()) {
                                    AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                                }
                                b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar5, dVar9, dVar10, cVar5, t11, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                                if (AbstractC3169o.K()) {
                                    AbstractC3169o.V();
                                }
                                iVar3 = iVar5;
                                dVar5 = dVar9;
                                dVar6 = dVar10;
                                cVar3 = cVar5;
                                t9 = t11;
                                z10 = z9;
                            } else {
                                interfaceC3163lP.z();
                                iVar3 = iVar2;
                                dVar5 = dVar3;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                t9 = t0E;
                                z10 = z8;
                            }
                            p0V = interfaceC3163lP.v();
                            if (p0V != null) {
                                p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                            }
                        }
                        i20 = 12582912;
                        i11 |= i20;
                        if ((23967451 & i11) == 4793490) {
                            interfaceC3163lP.o();
                            if ((i9 & 1) != 0) {
                                if (i22 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i12 != 0) {
                                    dVar3 = null;
                                }
                                if (i14 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i16 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i10 & 32) != 0) {
                                    i11 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i18 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                            } else {
                                if (i22 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i12 != 0) {
                                    dVar3 = null;
                                }
                                if (i14 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i16 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i10 & 32) != 0) {
                                    i11 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i18 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                            }
                            i21 = i11;
                            L0.i iVar6 = iVar2;
                            V0.d dVar11 = dVar3;
                            d dVar12 = dVar4;
                            J3.c cVar6 = cVar2;
                            T0 t12 = t0E;
                            interfaceC3163lP.Q();
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                            }
                            b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar6, dVar11, dVar12, cVar6, t12, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            iVar3 = iVar6;
                            dVar5 = dVar11;
                            dVar6 = dVar12;
                            cVar3 = cVar6;
                            t9 = t12;
                            z10 = z9;
                        } else {
                            interfaceC3163lP.o();
                            if ((i9 & 1) != 0) {
                                if (i22 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i12 != 0) {
                                    dVar3 = null;
                                }
                                if (i14 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i16 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i10 & 32) != 0) {
                                    i11 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i18 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                            } else {
                                if (i22 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i12 != 0) {
                                    dVar3 = null;
                                }
                                if (i14 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i16 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i10 & 32) != 0) {
                                    i11 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i18 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                            }
                            i21 = i11;
                            L0.i iVar7 = iVar2;
                            V0.d dVar13 = dVar3;
                            d dVar14 = dVar4;
                            J3.c cVar7 = cVar2;
                            T0 t13 = t0E;
                            interfaceC3163lP.Q();
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                            }
                            b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar7, dVar13, dVar14, cVar7, t13, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            iVar3 = iVar7;
                            dVar5 = dVar13;
                            dVar6 = dVar14;
                            cVar3 = cVar7;
                            t9 = t13;
                            z10 = z9;
                        }
                        p0V = interfaceC3163lP.v();
                        if (p0V != null) {
                            p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                        }
                    }
                    i11 |= 24576;
                    cVar2 = cVar;
                    if ((458752 & i9) == 0) {
                        if ((i10 & 32) == 0) {
                            t0E = t8;
                            if (interfaceC3163lP.R(t0E)) {
                            }
                            i11 |= i23;
                        } else {
                            t0E = t8;
                        }
                        i11 |= i23;
                    } else {
                        t0E = t8;
                    }
                    i18 = i10 & 64;
                    if (i18 != 0) {
                        i11 |= 1572864;
                    } else if ((i9 & 3670016) == 0) {
                        if (interfaceC3163lP.c(z8)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i11 |= i19;
                    }
                    if ((i10 & 128) != 0) {
                        if ((i9 & 29360128) == 0) {
                            if (interfaceC3163lP.l(onClick)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                        }
                        if ((23967451 & i11) == 4793490) {
                            interfaceC3163lP.o();
                            if ((i9 & 1) != 0) {
                                if (i22 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i12 != 0) {
                                    dVar3 = null;
                                }
                                if (i14 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i16 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i10 & 32) != 0) {
                                    i11 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i18 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                            } else {
                                if (i22 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i12 != 0) {
                                    dVar3 = null;
                                }
                                if (i14 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i16 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i10 & 32) != 0) {
                                    i11 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i18 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                            }
                            i21 = i11;
                            L0.i iVar8 = iVar2;
                            V0.d dVar15 = dVar3;
                            d dVar16 = dVar4;
                            J3.c cVar8 = cVar2;
                            T0 t14 = t0E;
                            interfaceC3163lP.Q();
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                            }
                            b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar8, dVar15, dVar16, cVar8, t14, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            iVar3 = iVar8;
                            dVar5 = dVar15;
                            dVar6 = dVar16;
                            cVar3 = cVar8;
                            t9 = t14;
                            z10 = z9;
                        } else {
                            interfaceC3163lP.o();
                            if ((i9 & 1) != 0) {
                                if (i22 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i12 != 0) {
                                    dVar3 = null;
                                }
                                if (i14 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i16 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i10 & 32) != 0) {
                                    i11 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i18 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                            } else {
                                if (i22 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i12 != 0) {
                                    dVar3 = null;
                                }
                                if (i14 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i16 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i10 & 32) != 0) {
                                    i11 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i18 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                            }
                            i21 = i11;
                            L0.i iVar9 = iVar2;
                            V0.d dVar17 = dVar3;
                            d dVar18 = dVar4;
                            J3.c cVar9 = cVar2;
                            T0 t15 = t0E;
                            interfaceC3163lP.Q();
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                            }
                            b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar9, dVar17, dVar18, cVar9, t15, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            iVar3 = iVar9;
                            dVar5 = dVar17;
                            dVar6 = dVar18;
                            cVar3 = cVar9;
                            t9 = t15;
                            z10 = z9;
                        }
                        p0V = interfaceC3163lP.v();
                        if (p0V != null) {
                            p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                        }
                    }
                    i20 = 12582912;
                    i11 |= i20;
                    if ((23967451 & i11) == 4793490) {
                        interfaceC3163lP.o();
                        if ((i9 & 1) != 0) {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        } else {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        }
                        i21 = i11;
                        L0.i iVar10 = iVar2;
                        V0.d dVar19 = dVar3;
                        d dVar110 = dVar4;
                        J3.c cVar10 = cVar2;
                        T0 t16 = t0E;
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                        }
                        b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar10, dVar19, dVar110, cVar10, t16, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar3 = iVar10;
                        dVar5 = dVar19;
                        dVar6 = dVar110;
                        cVar3 = cVar10;
                        t9 = t16;
                        z10 = z9;
                    } else {
                        interfaceC3163lP.o();
                        if ((i9 & 1) != 0) {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        } else {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        }
                        i21 = i11;
                        L0.i iVar11 = iVar2;
                        V0.d dVar111 = dVar3;
                        d dVar112 = dVar4;
                        J3.c cVar11 = cVar2;
                        T0 t17 = t0E;
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                        }
                        b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar11, dVar111, dVar112, cVar11, t17, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar3 = iVar11;
                        dVar5 = dVar111;
                        dVar6 = dVar112;
                        cVar3 = cVar11;
                        t9 = t17;
                        z10 = z9;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                    }
                }
                i11 |= 3072;
                dVar4 = dVar2;
                i16 = i10 & 16;
                if (i16 != 0) {
                    if ((57344 & i9) == 0) {
                        cVar2 = cVar;
                        if (interfaceC3163lP.R(cVar2)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i11 |= i17;
                    }
                    if ((458752 & i9) == 0) {
                        if ((i10 & 32) == 0) {
                            t0E = t8;
                            if (interfaceC3163lP.R(t0E)) {
                            }
                            i11 |= i23;
                        } else {
                            t0E = t8;
                        }
                        i11 |= i23;
                    } else {
                        t0E = t8;
                    }
                    i18 = i10 & 64;
                    if (i18 != 0) {
                        i11 |= 1572864;
                    } else if ((i9 & 3670016) == 0) {
                        if (interfaceC3163lP.c(z8)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i11 |= i19;
                    }
                    if ((i10 & 128) != 0) {
                        if ((i9 & 29360128) == 0) {
                            if (interfaceC3163lP.l(onClick)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                        }
                        if ((23967451 & i11) == 4793490) {
                            interfaceC3163lP.o();
                            if ((i9 & 1) != 0) {
                                if (i22 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i12 != 0) {
                                    dVar3 = null;
                                }
                                if (i14 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i16 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i10 & 32) != 0) {
                                    i11 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i18 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                            } else {
                                if (i22 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i12 != 0) {
                                    dVar3 = null;
                                }
                                if (i14 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i16 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i10 & 32) != 0) {
                                    i11 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i18 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                            }
                            i21 = i11;
                            L0.i iVar12 = iVar2;
                            V0.d dVar113 = dVar3;
                            d dVar114 = dVar4;
                            J3.c cVar12 = cVar2;
                            T0 t18 = t0E;
                            interfaceC3163lP.Q();
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                            }
                            b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar12, dVar113, dVar114, cVar12, t18, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            iVar3 = iVar12;
                            dVar5 = dVar113;
                            dVar6 = dVar114;
                            cVar3 = cVar12;
                            t9 = t18;
                            z10 = z9;
                        } else {
                            interfaceC3163lP.o();
                            if ((i9 & 1) != 0) {
                                if (i22 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i12 != 0) {
                                    dVar3 = null;
                                }
                                if (i14 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i16 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i10 & 32) != 0) {
                                    i11 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i18 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                            } else {
                                if (i22 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i12 != 0) {
                                    dVar3 = null;
                                }
                                if (i14 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i16 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i10 & 32) != 0) {
                                    i11 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i18 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                            }
                            i21 = i11;
                            L0.i iVar13 = iVar2;
                            V0.d dVar115 = dVar3;
                            d dVar116 = dVar4;
                            J3.c cVar13 = cVar2;
                            T0 t19 = t0E;
                            interfaceC3163lP.Q();
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                            }
                            b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar13, dVar115, dVar116, cVar13, t19, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            iVar3 = iVar13;
                            dVar5 = dVar115;
                            dVar6 = dVar116;
                            cVar3 = cVar13;
                            t9 = t19;
                            z10 = z9;
                        }
                        p0V = interfaceC3163lP.v();
                        if (p0V != null) {
                            p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                        }
                    }
                    i20 = 12582912;
                    i11 |= i20;
                    if ((23967451 & i11) == 4793490) {
                        interfaceC3163lP.o();
                        if ((i9 & 1) != 0) {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        } else {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        }
                        i21 = i11;
                        L0.i iVar14 = iVar2;
                        V0.d dVar117 = dVar3;
                        d dVar118 = dVar4;
                        J3.c cVar14 = cVar2;
                        T0 t110 = t0E;
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                        }
                        b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar14, dVar117, dVar118, cVar14, t110, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar3 = iVar14;
                        dVar5 = dVar117;
                        dVar6 = dVar118;
                        cVar3 = cVar14;
                        t9 = t110;
                        z10 = z9;
                    } else {
                        interfaceC3163lP.o();
                        if ((i9 & 1) != 0) {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        } else {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        }
                        i21 = i11;
                        L0.i iVar15 = iVar2;
                        V0.d dVar119 = dVar3;
                        d dVar1110 = dVar4;
                        J3.c cVar15 = cVar2;
                        T0 t111 = t0E;
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                        }
                        b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar15, dVar119, dVar1110, cVar15, t111, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar3 = iVar15;
                        dVar5 = dVar119;
                        dVar6 = dVar1110;
                        cVar3 = cVar15;
                        t9 = t111;
                        z10 = z9;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                    }
                }
                i11 |= 24576;
                cVar2 = cVar;
                if ((458752 & i9) == 0) {
                    if ((i10 & 32) == 0) {
                        t0E = t8;
                        if (interfaceC3163lP.R(t0E)) {
                        }
                        i11 |= i23;
                    } else {
                        t0E = t8;
                    }
                    i11 |= i23;
                } else {
                    t0E = t8;
                }
                i18 = i10 & 64;
                if (i18 != 0) {
                    i11 |= 1572864;
                } else if ((i9 & 3670016) == 0) {
                    if (interfaceC3163lP.c(z8)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i11 |= i19;
                }
                if ((i10 & 128) != 0) {
                    if ((i9 & 29360128) == 0) {
                        if (interfaceC3163lP.l(onClick)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                    }
                    if ((23967451 & i11) == 4793490) {
                        interfaceC3163lP.o();
                        if ((i9 & 1) != 0) {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        } else {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        }
                        i21 = i11;
                        L0.i iVar16 = iVar2;
                        V0.d dVar1111 = dVar3;
                        d dVar1112 = dVar4;
                        J3.c cVar16 = cVar2;
                        T0 t112 = t0E;
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                        }
                        b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar16, dVar1111, dVar1112, cVar16, t112, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar3 = iVar16;
                        dVar5 = dVar1111;
                        dVar6 = dVar1112;
                        cVar3 = cVar16;
                        t9 = t112;
                        z10 = z9;
                    } else {
                        interfaceC3163lP.o();
                        if ((i9 & 1) != 0) {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        } else {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        }
                        i21 = i11;
                        L0.i iVar17 = iVar2;
                        V0.d dVar1113 = dVar3;
                        d dVar1114 = dVar4;
                        J3.c cVar17 = cVar2;
                        T0 t113 = t0E;
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                        }
                        b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar17, dVar1113, dVar1114, cVar17, t113, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar3 = iVar17;
                        dVar5 = dVar1113;
                        dVar6 = dVar1114;
                        cVar3 = cVar17;
                        t9 = t113;
                        z10 = z9;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                    }
                }
                i20 = 12582912;
                i11 |= i20;
                if ((23967451 & i11) == 4793490) {
                    interfaceC3163lP.o();
                    if ((i9 & 1) != 0) {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    } else {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    }
                    i21 = i11;
                    L0.i iVar18 = iVar2;
                    V0.d dVar1115 = dVar3;
                    d dVar1116 = dVar4;
                    J3.c cVar18 = cVar2;
                    T0 t114 = t0E;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                    }
                    b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar18, dVar1115, dVar1116, cVar18, t114, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar3 = iVar18;
                    dVar5 = dVar1115;
                    dVar6 = dVar1116;
                    cVar3 = cVar18;
                    t9 = t114;
                    z10 = z9;
                } else {
                    interfaceC3163lP.o();
                    if ((i9 & 1) != 0) {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    } else {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    }
                    i21 = i11;
                    L0.i iVar19 = iVar2;
                    V0.d dVar1117 = dVar3;
                    d dVar1118 = dVar4;
                    J3.c cVar19 = cVar2;
                    T0 t115 = t0E;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                    }
                    b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar19, dVar1117, dVar1118, cVar19, t115, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar3 = iVar19;
                    dVar5 = dVar1117;
                    dVar6 = dVar1118;
                    cVar3 = cVar19;
                    t9 = t115;
                    z10 = z9;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                }
            }
            i11 |= 384;
            dVar3 = dVar;
            i14 = i10 & 8;
            if (i14 != 0) {
                if ((i9 & 7168) == 0) {
                    dVar4 = dVar2;
                    if (interfaceC3163lP.R(dVar4)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i11 |= i15;
                }
                i16 = i10 & 16;
                if (i16 != 0) {
                    if ((57344 & i9) == 0) {
                        cVar2 = cVar;
                        if (interfaceC3163lP.R(cVar2)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i11 |= i17;
                    }
                    if ((458752 & i9) == 0) {
                        if ((i10 & 32) == 0) {
                            t0E = t8;
                            if (interfaceC3163lP.R(t0E)) {
                            }
                            i11 |= i23;
                        } else {
                            t0E = t8;
                        }
                        i11 |= i23;
                    } else {
                        t0E = t8;
                    }
                    i18 = i10 & 64;
                    if (i18 != 0) {
                        i11 |= 1572864;
                    } else if ((i9 & 3670016) == 0) {
                        if (interfaceC3163lP.c(z8)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i11 |= i19;
                    }
                    if ((i10 & 128) != 0) {
                        if ((i9 & 29360128) == 0) {
                            if (interfaceC3163lP.l(onClick)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                        }
                        if ((23967451 & i11) == 4793490) {
                            interfaceC3163lP.o();
                            if ((i9 & 1) != 0) {
                                if (i22 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i12 != 0) {
                                    dVar3 = null;
                                }
                                if (i14 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i16 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i10 & 32) != 0) {
                                    i11 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i18 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                            } else {
                                if (i22 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i12 != 0) {
                                    dVar3 = null;
                                }
                                if (i14 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i16 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i10 & 32) != 0) {
                                    i11 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i18 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                            }
                            i21 = i11;
                            L0.i iVar110 = iVar2;
                            V0.d dVar1119 = dVar3;
                            d dVar11110 = dVar4;
                            J3.c cVar110 = cVar2;
                            T0 t116 = t0E;
                            interfaceC3163lP.Q();
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                            }
                            b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar110, dVar1119, dVar11110, cVar110, t116, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            iVar3 = iVar110;
                            dVar5 = dVar1119;
                            dVar6 = dVar11110;
                            cVar3 = cVar110;
                            t9 = t116;
                            z10 = z9;
                        } else {
                            interfaceC3163lP.o();
                            if ((i9 & 1) != 0) {
                                if (i22 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i12 != 0) {
                                    dVar3 = null;
                                }
                                if (i14 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i16 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i10 & 32) != 0) {
                                    i11 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i18 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                            } else {
                                if (i22 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i12 != 0) {
                                    dVar3 = null;
                                }
                                if (i14 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i16 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i10 & 32) != 0) {
                                    i11 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i18 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                            }
                            i21 = i11;
                            L0.i iVar111 = iVar2;
                            V0.d dVar11111 = dVar3;
                            d dVar11112 = dVar4;
                            J3.c cVar111 = cVar2;
                            T0 t117 = t0E;
                            interfaceC3163lP.Q();
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                            }
                            b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar111, dVar11111, dVar11112, cVar111, t117, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            iVar3 = iVar111;
                            dVar5 = dVar11111;
                            dVar6 = dVar11112;
                            cVar3 = cVar111;
                            t9 = t117;
                            z10 = z9;
                        }
                        p0V = interfaceC3163lP.v();
                        if (p0V != null) {
                            p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                        }
                    }
                    i20 = 12582912;
                    i11 |= i20;
                    if ((23967451 & i11) == 4793490) {
                        interfaceC3163lP.o();
                        if ((i9 & 1) != 0) {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        } else {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        }
                        i21 = i11;
                        L0.i iVar112 = iVar2;
                        V0.d dVar11113 = dVar3;
                        d dVar11114 = dVar4;
                        J3.c cVar112 = cVar2;
                        T0 t118 = t0E;
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                        }
                        b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar112, dVar11113, dVar11114, cVar112, t118, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar3 = iVar112;
                        dVar5 = dVar11113;
                        dVar6 = dVar11114;
                        cVar3 = cVar112;
                        t9 = t118;
                        z10 = z9;
                    } else {
                        interfaceC3163lP.o();
                        if ((i9 & 1) != 0) {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        } else {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        }
                        i21 = i11;
                        L0.i iVar113 = iVar2;
                        V0.d dVar11115 = dVar3;
                        d dVar11116 = dVar4;
                        J3.c cVar113 = cVar2;
                        T0 t119 = t0E;
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                        }
                        b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar113, dVar11115, dVar11116, cVar113, t119, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar3 = iVar113;
                        dVar5 = dVar11115;
                        dVar6 = dVar11116;
                        cVar3 = cVar113;
                        t9 = t119;
                        z10 = z9;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                    }
                }
                i11 |= 24576;
                cVar2 = cVar;
                if ((458752 & i9) == 0) {
                    if ((i10 & 32) == 0) {
                        t0E = t8;
                        if (interfaceC3163lP.R(t0E)) {
                        }
                        i11 |= i23;
                    } else {
                        t0E = t8;
                    }
                    i11 |= i23;
                } else {
                    t0E = t8;
                }
                i18 = i10 & 64;
                if (i18 != 0) {
                    i11 |= 1572864;
                } else if ((i9 & 3670016) == 0) {
                    if (interfaceC3163lP.c(z8)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i11 |= i19;
                }
                if ((i10 & 128) != 0) {
                    if ((i9 & 29360128) == 0) {
                        if (interfaceC3163lP.l(onClick)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                    }
                    if ((23967451 & i11) == 4793490) {
                        interfaceC3163lP.o();
                        if ((i9 & 1) != 0) {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        } else {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        }
                        i21 = i11;
                        L0.i iVar114 = iVar2;
                        V0.d dVar11117 = dVar3;
                        d dVar11118 = dVar4;
                        J3.c cVar114 = cVar2;
                        T0 t1110 = t0E;
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                        }
                        b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar114, dVar11117, dVar11118, cVar114, t1110, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar3 = iVar114;
                        dVar5 = dVar11117;
                        dVar6 = dVar11118;
                        cVar3 = cVar114;
                        t9 = t1110;
                        z10 = z9;
                    } else {
                        interfaceC3163lP.o();
                        if ((i9 & 1) != 0) {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        } else {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        }
                        i21 = i11;
                        L0.i iVar115 = iVar2;
                        V0.d dVar11119 = dVar3;
                        d dVar111110 = dVar4;
                        J3.c cVar115 = cVar2;
                        T0 t1111 = t0E;
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                        }
                        b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar115, dVar11119, dVar111110, cVar115, t1111, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar3 = iVar115;
                        dVar5 = dVar11119;
                        dVar6 = dVar111110;
                        cVar3 = cVar115;
                        t9 = t1111;
                        z10 = z9;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                    }
                }
                i20 = 12582912;
                i11 |= i20;
                if ((23967451 & i11) == 4793490) {
                    interfaceC3163lP.o();
                    if ((i9 & 1) != 0) {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    } else {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    }
                    i21 = i11;
                    L0.i iVar116 = iVar2;
                    V0.d dVar111111 = dVar3;
                    d dVar111112 = dVar4;
                    J3.c cVar116 = cVar2;
                    T0 t1112 = t0E;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                    }
                    b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar116, dVar111111, dVar111112, cVar116, t1112, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar3 = iVar116;
                    dVar5 = dVar111111;
                    dVar6 = dVar111112;
                    cVar3 = cVar116;
                    t9 = t1112;
                    z10 = z9;
                } else {
                    interfaceC3163lP.o();
                    if ((i9 & 1) != 0) {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    } else {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    }
                    i21 = i11;
                    L0.i iVar117 = iVar2;
                    V0.d dVar111113 = dVar3;
                    d dVar111114 = dVar4;
                    J3.c cVar117 = cVar2;
                    T0 t1113 = t0E;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                    }
                    b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar117, dVar111113, dVar111114, cVar117, t1113, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar3 = iVar117;
                    dVar5 = dVar111113;
                    dVar6 = dVar111114;
                    cVar3 = cVar117;
                    t9 = t1113;
                    z10 = z9;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                }
            }
            i11 |= 3072;
            dVar4 = dVar2;
            i16 = i10 & 16;
            if (i16 != 0) {
                if ((57344 & i9) == 0) {
                    cVar2 = cVar;
                    if (interfaceC3163lP.R(cVar2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i11 |= i17;
                }
                if ((458752 & i9) == 0) {
                    if ((i10 & 32) == 0) {
                        t0E = t8;
                        if (interfaceC3163lP.R(t0E)) {
                        }
                        i11 |= i23;
                    } else {
                        t0E = t8;
                    }
                    i11 |= i23;
                } else {
                    t0E = t8;
                }
                i18 = i10 & 64;
                if (i18 != 0) {
                    i11 |= 1572864;
                } else if ((i9 & 3670016) == 0) {
                    if (interfaceC3163lP.c(z8)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i11 |= i19;
                }
                if ((i10 & 128) != 0) {
                    if ((i9 & 29360128) == 0) {
                        if (interfaceC3163lP.l(onClick)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                    }
                    if ((23967451 & i11) == 4793490) {
                        interfaceC3163lP.o();
                        if ((i9 & 1) != 0) {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        } else {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        }
                        i21 = i11;
                        L0.i iVar118 = iVar2;
                        V0.d dVar111115 = dVar3;
                        d dVar111116 = dVar4;
                        J3.c cVar118 = cVar2;
                        T0 t1114 = t0E;
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                        }
                        b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar118, dVar111115, dVar111116, cVar118, t1114, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar3 = iVar118;
                        dVar5 = dVar111115;
                        dVar6 = dVar111116;
                        cVar3 = cVar118;
                        t9 = t1114;
                        z10 = z9;
                    } else {
                        interfaceC3163lP.o();
                        if ((i9 & 1) != 0) {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        } else {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        }
                        i21 = i11;
                        L0.i iVar119 = iVar2;
                        V0.d dVar111117 = dVar3;
                        d dVar111118 = dVar4;
                        J3.c cVar119 = cVar2;
                        T0 t1115 = t0E;
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                        }
                        b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar119, dVar111117, dVar111118, cVar119, t1115, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar3 = iVar119;
                        dVar5 = dVar111117;
                        dVar6 = dVar111118;
                        cVar3 = cVar119;
                        t9 = t1115;
                        z10 = z9;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                    }
                }
                i20 = 12582912;
                i11 |= i20;
                if ((23967451 & i11) == 4793490) {
                    interfaceC3163lP.o();
                    if ((i9 & 1) != 0) {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    } else {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    }
                    i21 = i11;
                    L0.i iVar1110 = iVar2;
                    V0.d dVar111119 = dVar3;
                    d dVar1111110 = dVar4;
                    J3.c cVar1110 = cVar2;
                    T0 t1116 = t0E;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                    }
                    b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar1110, dVar111119, dVar1111110, cVar1110, t1116, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar3 = iVar1110;
                    dVar5 = dVar111119;
                    dVar6 = dVar1111110;
                    cVar3 = cVar1110;
                    t9 = t1116;
                    z10 = z9;
                } else {
                    interfaceC3163lP.o();
                    if ((i9 & 1) != 0) {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    } else {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    }
                    i21 = i11;
                    L0.i iVar1111 = iVar2;
                    V0.d dVar1111111 = dVar3;
                    d dVar1111112 = dVar4;
                    J3.c cVar1111 = cVar2;
                    T0 t1117 = t0E;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                    }
                    b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar1111, dVar1111111, dVar1111112, cVar1111, t1117, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar3 = iVar1111;
                    dVar5 = dVar1111111;
                    dVar6 = dVar1111112;
                    cVar3 = cVar1111;
                    t9 = t1117;
                    z10 = z9;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                }
            }
            i11 |= 24576;
            cVar2 = cVar;
            if ((458752 & i9) == 0) {
                if ((i10 & 32) == 0) {
                    t0E = t8;
                    if (interfaceC3163lP.R(t0E)) {
                    }
                    i11 |= i23;
                } else {
                    t0E = t8;
                }
                i11 |= i23;
            } else {
                t0E = t8;
            }
            i18 = i10 & 64;
            if (i18 != 0) {
                i11 |= 1572864;
            } else if ((i9 & 3670016) == 0) {
                if (interfaceC3163lP.c(z8)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i11 |= i19;
            }
            if ((i10 & 128) != 0) {
                if ((i9 & 29360128) == 0) {
                    if (interfaceC3163lP.l(onClick)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                }
                if ((23967451 & i11) == 4793490) {
                    interfaceC3163lP.o();
                    if ((i9 & 1) != 0) {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    } else {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    }
                    i21 = i11;
                    L0.i iVar1112 = iVar2;
                    V0.d dVar1111113 = dVar3;
                    d dVar1111114 = dVar4;
                    J3.c cVar1112 = cVar2;
                    T0 t1118 = t0E;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                    }
                    b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar1112, dVar1111113, dVar1111114, cVar1112, t1118, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar3 = iVar1112;
                    dVar5 = dVar1111113;
                    dVar6 = dVar1111114;
                    cVar3 = cVar1112;
                    t9 = t1118;
                    z10 = z9;
                } else {
                    interfaceC3163lP.o();
                    if ((i9 & 1) != 0) {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    } else {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    }
                    i21 = i11;
                    L0.i iVar1113 = iVar2;
                    V0.d dVar1111115 = dVar3;
                    d dVar1111116 = dVar4;
                    J3.c cVar1113 = cVar2;
                    T0 t1119 = t0E;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                    }
                    b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar1113, dVar1111115, dVar1111116, cVar1113, t1119, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar3 = iVar1113;
                    dVar5 = dVar1111115;
                    dVar6 = dVar1111116;
                    cVar3 = cVar1113;
                    t9 = t1119;
                    z10 = z9;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                }
            }
            i20 = 12582912;
            i11 |= i20;
            if ((23967451 & i11) == 4793490) {
                interfaceC3163lP.o();
                if ((i9 & 1) != 0) {
                    if (i22 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i12 != 0) {
                        dVar3 = null;
                    }
                    if (i14 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i16 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i18 != 0) {
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                } else {
                    if (i22 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i12 != 0) {
                        dVar3 = null;
                    }
                    if (i14 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i16 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i18 != 0) {
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                }
                i21 = i11;
                L0.i iVar1114 = iVar2;
                V0.d dVar1111117 = dVar3;
                d dVar1111118 = dVar4;
                J3.c cVar1114 = cVar2;
                T0 t11110 = t0E;
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                }
                b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar1114, dVar1111117, dVar1111118, cVar1114, t11110, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar3 = iVar1114;
                dVar5 = dVar1111117;
                dVar6 = dVar1111118;
                cVar3 = cVar1114;
                t9 = t11110;
                z10 = z9;
            } else {
                interfaceC3163lP.o();
                if ((i9 & 1) != 0) {
                    if (i22 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i12 != 0) {
                        dVar3 = null;
                    }
                    if (i14 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i16 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i18 != 0) {
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                } else {
                    if (i22 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i12 != 0) {
                        dVar3 = null;
                    }
                    if (i14 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i16 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i18 != 0) {
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                }
                i21 = i11;
                L0.i iVar1115 = iVar2;
                V0.d dVar1111119 = dVar3;
                d dVar11111110 = dVar4;
                J3.c cVar1115 = cVar2;
                T0 t11111 = t0E;
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                }
                b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar1115, dVar1111119, dVar11111110, cVar1115, t11111, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar3 = iVar1115;
                dVar5 = dVar1111119;
                dVar6 = dVar11111110;
                cVar3 = cVar1115;
                t9 = t11111;
                z10 = z9;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
            }
        }
        i11 |= 48;
        iVar2 = iVar;
        i12 = i10 & 4;
        if (i12 != 0) {
            if ((i9 & 896) == 0) {
                dVar3 = dVar;
                if (interfaceC3163lP.R(dVar3)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i11 |= i13;
            }
            i14 = i10 & 8;
            if (i14 != 0) {
                if ((i9 & 7168) == 0) {
                    dVar4 = dVar2;
                    if (interfaceC3163lP.R(dVar4)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i11 |= i15;
                }
                i16 = i10 & 16;
                if (i16 != 0) {
                    if ((57344 & i9) == 0) {
                        cVar2 = cVar;
                        if (interfaceC3163lP.R(cVar2)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i11 |= i17;
                    }
                    if ((458752 & i9) == 0) {
                        if ((i10 & 32) == 0) {
                            t0E = t8;
                            if (interfaceC3163lP.R(t0E)) {
                            }
                            i11 |= i23;
                        } else {
                            t0E = t8;
                        }
                        i11 |= i23;
                    } else {
                        t0E = t8;
                    }
                    i18 = i10 & 64;
                    if (i18 != 0) {
                        i11 |= 1572864;
                    } else if ((i9 & 3670016) == 0) {
                        if (interfaceC3163lP.c(z8)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i11 |= i19;
                    }
                    if ((i10 & 128) != 0) {
                        if ((i9 & 29360128) == 0) {
                            if (interfaceC3163lP.l(onClick)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                        }
                        if ((23967451 & i11) == 4793490) {
                            interfaceC3163lP.o();
                            if ((i9 & 1) != 0) {
                                if (i22 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i12 != 0) {
                                    dVar3 = null;
                                }
                                if (i14 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i16 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i10 & 32) != 0) {
                                    i11 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i18 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                            } else {
                                if (i22 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i12 != 0) {
                                    dVar3 = null;
                                }
                                if (i14 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i16 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i10 & 32) != 0) {
                                    i11 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i18 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                            }
                            i21 = i11;
                            L0.i iVar1116 = iVar2;
                            V0.d dVar11111111 = dVar3;
                            d dVar11111112 = dVar4;
                            J3.c cVar1116 = cVar2;
                            T0 t11112 = t0E;
                            interfaceC3163lP.Q();
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                            }
                            b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar1116, dVar11111111, dVar11111112, cVar1116, t11112, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            iVar3 = iVar1116;
                            dVar5 = dVar11111111;
                            dVar6 = dVar11111112;
                            cVar3 = cVar1116;
                            t9 = t11112;
                            z10 = z9;
                        } else {
                            interfaceC3163lP.o();
                            if ((i9 & 1) != 0) {
                                if (i22 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i12 != 0) {
                                    dVar3 = null;
                                }
                                if (i14 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i16 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i10 & 32) != 0) {
                                    i11 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i18 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                            } else {
                                if (i22 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i12 != 0) {
                                    dVar3 = null;
                                }
                                if (i14 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i16 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i10 & 32) != 0) {
                                    i11 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i18 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                            }
                            i21 = i11;
                            L0.i iVar1117 = iVar2;
                            V0.d dVar11111113 = dVar3;
                            d dVar11111114 = dVar4;
                            J3.c cVar1117 = cVar2;
                            T0 t11113 = t0E;
                            interfaceC3163lP.Q();
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                            }
                            b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar1117, dVar11111113, dVar11111114, cVar1117, t11113, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            iVar3 = iVar1117;
                            dVar5 = dVar11111113;
                            dVar6 = dVar11111114;
                            cVar3 = cVar1117;
                            t9 = t11113;
                            z10 = z9;
                        }
                        p0V = interfaceC3163lP.v();
                        if (p0V != null) {
                            p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                        }
                    }
                    i20 = 12582912;
                    i11 |= i20;
                    if ((23967451 & i11) == 4793490) {
                        interfaceC3163lP.o();
                        if ((i9 & 1) != 0) {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        } else {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        }
                        i21 = i11;
                        L0.i iVar1118 = iVar2;
                        V0.d dVar11111115 = dVar3;
                        d dVar11111116 = dVar4;
                        J3.c cVar1118 = cVar2;
                        T0 t11114 = t0E;
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                        }
                        b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar1118, dVar11111115, dVar11111116, cVar1118, t11114, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar3 = iVar1118;
                        dVar5 = dVar11111115;
                        dVar6 = dVar11111116;
                        cVar3 = cVar1118;
                        t9 = t11114;
                        z10 = z9;
                    } else {
                        interfaceC3163lP.o();
                        if ((i9 & 1) != 0) {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        } else {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        }
                        i21 = i11;
                        L0.i iVar1119 = iVar2;
                        V0.d dVar11111117 = dVar3;
                        d dVar11111118 = dVar4;
                        J3.c cVar1119 = cVar2;
                        T0 t11115 = t0E;
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                        }
                        b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar1119, dVar11111117, dVar11111118, cVar1119, t11115, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar3 = iVar1119;
                        dVar5 = dVar11111117;
                        dVar6 = dVar11111118;
                        cVar3 = cVar1119;
                        t9 = t11115;
                        z10 = z9;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                    }
                }
                i11 |= 24576;
                cVar2 = cVar;
                if ((458752 & i9) == 0) {
                    if ((i10 & 32) == 0) {
                        t0E = t8;
                        if (interfaceC3163lP.R(t0E)) {
                        }
                        i11 |= i23;
                    } else {
                        t0E = t8;
                    }
                    i11 |= i23;
                } else {
                    t0E = t8;
                }
                i18 = i10 & 64;
                if (i18 != 0) {
                    i11 |= 1572864;
                } else if ((i9 & 3670016) == 0) {
                    if (interfaceC3163lP.c(z8)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i11 |= i19;
                }
                if ((i10 & 128) != 0) {
                    if ((i9 & 29360128) == 0) {
                        if (interfaceC3163lP.l(onClick)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                    }
                    if ((23967451 & i11) == 4793490) {
                        interfaceC3163lP.o();
                        if ((i9 & 1) != 0) {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        } else {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        }
                        i21 = i11;
                        L0.i iVar11110 = iVar2;
                        V0.d dVar11111119 = dVar3;
                        d dVar111111110 = dVar4;
                        J3.c cVar11110 = cVar2;
                        T0 t11116 = t0E;
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                        }
                        b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar11110, dVar11111119, dVar111111110, cVar11110, t11116, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar3 = iVar11110;
                        dVar5 = dVar11111119;
                        dVar6 = dVar111111110;
                        cVar3 = cVar11110;
                        t9 = t11116;
                        z10 = z9;
                    } else {
                        interfaceC3163lP.o();
                        if ((i9 & 1) != 0) {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        } else {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        }
                        i21 = i11;
                        L0.i iVar11111 = iVar2;
                        V0.d dVar111111111 = dVar3;
                        d dVar111111112 = dVar4;
                        J3.c cVar11111 = cVar2;
                        T0 t11117 = t0E;
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                        }
                        b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar11111, dVar111111111, dVar111111112, cVar11111, t11117, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar3 = iVar11111;
                        dVar5 = dVar111111111;
                        dVar6 = dVar111111112;
                        cVar3 = cVar11111;
                        t9 = t11117;
                        z10 = z9;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                    }
                }
                i20 = 12582912;
                i11 |= i20;
                if ((23967451 & i11) == 4793490) {
                    interfaceC3163lP.o();
                    if ((i9 & 1) != 0) {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    } else {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    }
                    i21 = i11;
                    L0.i iVar11112 = iVar2;
                    V0.d dVar111111113 = dVar3;
                    d dVar111111114 = dVar4;
                    J3.c cVar11112 = cVar2;
                    T0 t11118 = t0E;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                    }
                    b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar11112, dVar111111113, dVar111111114, cVar11112, t11118, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar3 = iVar11112;
                    dVar5 = dVar111111113;
                    dVar6 = dVar111111114;
                    cVar3 = cVar11112;
                    t9 = t11118;
                    z10 = z9;
                } else {
                    interfaceC3163lP.o();
                    if ((i9 & 1) != 0) {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    } else {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    }
                    i21 = i11;
                    L0.i iVar11113 = iVar2;
                    V0.d dVar111111115 = dVar3;
                    d dVar111111116 = dVar4;
                    J3.c cVar11113 = cVar2;
                    T0 t11119 = t0E;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                    }
                    b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar11113, dVar111111115, dVar111111116, cVar11113, t11119, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar3 = iVar11113;
                    dVar5 = dVar111111115;
                    dVar6 = dVar111111116;
                    cVar3 = cVar11113;
                    t9 = t11119;
                    z10 = z9;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                }
            }
            i11 |= 3072;
            dVar4 = dVar2;
            i16 = i10 & 16;
            if (i16 != 0) {
                if ((57344 & i9) == 0) {
                    cVar2 = cVar;
                    if (interfaceC3163lP.R(cVar2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i11 |= i17;
                }
                if ((458752 & i9) == 0) {
                    if ((i10 & 32) == 0) {
                        t0E = t8;
                        if (interfaceC3163lP.R(t0E)) {
                        }
                        i11 |= i23;
                    } else {
                        t0E = t8;
                    }
                    i11 |= i23;
                } else {
                    t0E = t8;
                }
                i18 = i10 & 64;
                if (i18 != 0) {
                    i11 |= 1572864;
                } else if ((i9 & 3670016) == 0) {
                    if (interfaceC3163lP.c(z8)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i11 |= i19;
                }
                if ((i10 & 128) != 0) {
                    if ((i9 & 29360128) == 0) {
                        if (interfaceC3163lP.l(onClick)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                    }
                    if ((23967451 & i11) == 4793490) {
                        interfaceC3163lP.o();
                        if ((i9 & 1) != 0) {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        } else {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        }
                        i21 = i11;
                        L0.i iVar11114 = iVar2;
                        V0.d dVar111111117 = dVar3;
                        d dVar111111118 = dVar4;
                        J3.c cVar11114 = cVar2;
                        T0 t111110 = t0E;
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                        }
                        b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar11114, dVar111111117, dVar111111118, cVar11114, t111110, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar3 = iVar11114;
                        dVar5 = dVar111111117;
                        dVar6 = dVar111111118;
                        cVar3 = cVar11114;
                        t9 = t111110;
                        z10 = z9;
                    } else {
                        interfaceC3163lP.o();
                        if ((i9 & 1) != 0) {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        } else {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        }
                        i21 = i11;
                        L0.i iVar11115 = iVar2;
                        V0.d dVar111111119 = dVar3;
                        d dVar1111111110 = dVar4;
                        J3.c cVar11115 = cVar2;
                        T0 t111111 = t0E;
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                        }
                        b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar11115, dVar111111119, dVar1111111110, cVar11115, t111111, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar3 = iVar11115;
                        dVar5 = dVar111111119;
                        dVar6 = dVar1111111110;
                        cVar3 = cVar11115;
                        t9 = t111111;
                        z10 = z9;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                    }
                }
                i20 = 12582912;
                i11 |= i20;
                if ((23967451 & i11) == 4793490) {
                    interfaceC3163lP.o();
                    if ((i9 & 1) != 0) {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    } else {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    }
                    i21 = i11;
                    L0.i iVar11116 = iVar2;
                    V0.d dVar1111111111 = dVar3;
                    d dVar1111111112 = dVar4;
                    J3.c cVar11116 = cVar2;
                    T0 t111112 = t0E;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                    }
                    b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar11116, dVar1111111111, dVar1111111112, cVar11116, t111112, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar3 = iVar11116;
                    dVar5 = dVar1111111111;
                    dVar6 = dVar1111111112;
                    cVar3 = cVar11116;
                    t9 = t111112;
                    z10 = z9;
                } else {
                    interfaceC3163lP.o();
                    if ((i9 & 1) != 0) {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    } else {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    }
                    i21 = i11;
                    L0.i iVar11117 = iVar2;
                    V0.d dVar1111111113 = dVar3;
                    d dVar1111111114 = dVar4;
                    J3.c cVar11117 = cVar2;
                    T0 t111113 = t0E;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                    }
                    b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar11117, dVar1111111113, dVar1111111114, cVar11117, t111113, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar3 = iVar11117;
                    dVar5 = dVar1111111113;
                    dVar6 = dVar1111111114;
                    cVar3 = cVar11117;
                    t9 = t111113;
                    z10 = z9;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                }
            }
            i11 |= 24576;
            cVar2 = cVar;
            if ((458752 & i9) == 0) {
                if ((i10 & 32) == 0) {
                    t0E = t8;
                    if (interfaceC3163lP.R(t0E)) {
                    }
                    i11 |= i23;
                } else {
                    t0E = t8;
                }
                i11 |= i23;
            } else {
                t0E = t8;
            }
            i18 = i10 & 64;
            if (i18 != 0) {
                i11 |= 1572864;
            } else if ((i9 & 3670016) == 0) {
                if (interfaceC3163lP.c(z8)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i11 |= i19;
            }
            if ((i10 & 128) != 0) {
                if ((i9 & 29360128) == 0) {
                    if (interfaceC3163lP.l(onClick)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                }
                if ((23967451 & i11) == 4793490) {
                    interfaceC3163lP.o();
                    if ((i9 & 1) != 0) {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    } else {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    }
                    i21 = i11;
                    L0.i iVar11118 = iVar2;
                    V0.d dVar1111111115 = dVar3;
                    d dVar1111111116 = dVar4;
                    J3.c cVar11118 = cVar2;
                    T0 t111114 = t0E;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                    }
                    b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar11118, dVar1111111115, dVar1111111116, cVar11118, t111114, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar3 = iVar11118;
                    dVar5 = dVar1111111115;
                    dVar6 = dVar1111111116;
                    cVar3 = cVar11118;
                    t9 = t111114;
                    z10 = z9;
                } else {
                    interfaceC3163lP.o();
                    if ((i9 & 1) != 0) {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    } else {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    }
                    i21 = i11;
                    L0.i iVar11119 = iVar2;
                    V0.d dVar1111111117 = dVar3;
                    d dVar1111111118 = dVar4;
                    J3.c cVar11119 = cVar2;
                    T0 t111115 = t0E;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                    }
                    b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar11119, dVar1111111117, dVar1111111118, cVar11119, t111115, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar3 = iVar11119;
                    dVar5 = dVar1111111117;
                    dVar6 = dVar1111111118;
                    cVar3 = cVar11119;
                    t9 = t111115;
                    z10 = z9;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                }
            }
            i20 = 12582912;
            i11 |= i20;
            if ((23967451 & i11) == 4793490) {
                interfaceC3163lP.o();
                if ((i9 & 1) != 0) {
                    if (i22 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i12 != 0) {
                        dVar3 = null;
                    }
                    if (i14 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i16 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i18 != 0) {
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                } else {
                    if (i22 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i12 != 0) {
                        dVar3 = null;
                    }
                    if (i14 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i16 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i18 != 0) {
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                }
                i21 = i11;
                L0.i iVar111110 = iVar2;
                V0.d dVar1111111119 = dVar3;
                d dVar11111111110 = dVar4;
                J3.c cVar111110 = cVar2;
                T0 t111116 = t0E;
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                }
                b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar111110, dVar1111111119, dVar11111111110, cVar111110, t111116, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar3 = iVar111110;
                dVar5 = dVar1111111119;
                dVar6 = dVar11111111110;
                cVar3 = cVar111110;
                t9 = t111116;
                z10 = z9;
            } else {
                interfaceC3163lP.o();
                if ((i9 & 1) != 0) {
                    if (i22 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i12 != 0) {
                        dVar3 = null;
                    }
                    if (i14 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i16 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i18 != 0) {
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                } else {
                    if (i22 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i12 != 0) {
                        dVar3 = null;
                    }
                    if (i14 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i16 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i18 != 0) {
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                }
                i21 = i11;
                L0.i iVar111111 = iVar2;
                V0.d dVar11111111111 = dVar3;
                d dVar11111111112 = dVar4;
                J3.c cVar111111 = cVar2;
                T0 t111117 = t0E;
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                }
                b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar111111, dVar11111111111, dVar11111111112, cVar111111, t111117, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar3 = iVar111111;
                dVar5 = dVar11111111111;
                dVar6 = dVar11111111112;
                cVar3 = cVar111111;
                t9 = t111117;
                z10 = z9;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
            }
        }
        i11 |= 384;
        dVar3 = dVar;
        i14 = i10 & 8;
        if (i14 != 0) {
            if ((i9 & 7168) == 0) {
                dVar4 = dVar2;
                if (interfaceC3163lP.R(dVar4)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i11 |= i15;
            }
            i16 = i10 & 16;
            if (i16 != 0) {
                if ((57344 & i9) == 0) {
                    cVar2 = cVar;
                    if (interfaceC3163lP.R(cVar2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i11 |= i17;
                }
                if ((458752 & i9) == 0) {
                    if ((i10 & 32) == 0) {
                        t0E = t8;
                        if (interfaceC3163lP.R(t0E)) {
                        }
                        i11 |= i23;
                    } else {
                        t0E = t8;
                    }
                    i11 |= i23;
                } else {
                    t0E = t8;
                }
                i18 = i10 & 64;
                if (i18 != 0) {
                    i11 |= 1572864;
                } else if ((i9 & 3670016) == 0) {
                    if (interfaceC3163lP.c(z8)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i11 |= i19;
                }
                if ((i10 & 128) != 0) {
                    if ((i9 & 29360128) == 0) {
                        if (interfaceC3163lP.l(onClick)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                    }
                    if ((23967451 & i11) == 4793490) {
                        interfaceC3163lP.o();
                        if ((i9 & 1) != 0) {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        } else {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        }
                        i21 = i11;
                        L0.i iVar111112 = iVar2;
                        V0.d dVar11111111113 = dVar3;
                        d dVar11111111114 = dVar4;
                        J3.c cVar111112 = cVar2;
                        T0 t111118 = t0E;
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                        }
                        b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar111112, dVar11111111113, dVar11111111114, cVar111112, t111118, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar3 = iVar111112;
                        dVar5 = dVar11111111113;
                        dVar6 = dVar11111111114;
                        cVar3 = cVar111112;
                        t9 = t111118;
                        z10 = z9;
                    } else {
                        interfaceC3163lP.o();
                        if ((i9 & 1) != 0) {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        } else {
                            if (i22 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i12 != 0) {
                                dVar3 = null;
                            }
                            if (i14 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i16 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i10 & 32) != 0) {
                                i11 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i18 != 0) {
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                        }
                        i21 = i11;
                        L0.i iVar111113 = iVar2;
                        V0.d dVar11111111115 = dVar3;
                        d dVar11111111116 = dVar4;
                        J3.c cVar111113 = cVar2;
                        T0 t111119 = t0E;
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                        }
                        b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar111113, dVar11111111115, dVar11111111116, cVar111113, t111119, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar3 = iVar111113;
                        dVar5 = dVar11111111115;
                        dVar6 = dVar11111111116;
                        cVar3 = cVar111113;
                        t9 = t111119;
                        z10 = z9;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                    }
                }
                i20 = 12582912;
                i11 |= i20;
                if ((23967451 & i11) == 4793490) {
                    interfaceC3163lP.o();
                    if ((i9 & 1) != 0) {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    } else {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    }
                    i21 = i11;
                    L0.i iVar111114 = iVar2;
                    V0.d dVar11111111117 = dVar3;
                    d dVar11111111118 = dVar4;
                    J3.c cVar111114 = cVar2;
                    T0 t1111110 = t0E;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                    }
                    b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar111114, dVar11111111117, dVar11111111118, cVar111114, t1111110, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar3 = iVar111114;
                    dVar5 = dVar11111111117;
                    dVar6 = dVar11111111118;
                    cVar3 = cVar111114;
                    t9 = t1111110;
                    z10 = z9;
                } else {
                    interfaceC3163lP.o();
                    if ((i9 & 1) != 0) {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    } else {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    }
                    i21 = i11;
                    L0.i iVar111115 = iVar2;
                    V0.d dVar11111111119 = dVar3;
                    d dVar111111111110 = dVar4;
                    J3.c cVar111115 = cVar2;
                    T0 t1111111 = t0E;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                    }
                    b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar111115, dVar11111111119, dVar111111111110, cVar111115, t1111111, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar3 = iVar111115;
                    dVar5 = dVar11111111119;
                    dVar6 = dVar111111111110;
                    cVar3 = cVar111115;
                    t9 = t1111111;
                    z10 = z9;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                }
            }
            i11 |= 24576;
            cVar2 = cVar;
            if ((458752 & i9) == 0) {
                if ((i10 & 32) == 0) {
                    t0E = t8;
                    if (interfaceC3163lP.R(t0E)) {
                    }
                    i11 |= i23;
                } else {
                    t0E = t8;
                }
                i11 |= i23;
            } else {
                t0E = t8;
            }
            i18 = i10 & 64;
            if (i18 != 0) {
                i11 |= 1572864;
            } else if ((i9 & 3670016) == 0) {
                if (interfaceC3163lP.c(z8)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i11 |= i19;
            }
            if ((i10 & 128) != 0) {
                if ((i9 & 29360128) == 0) {
                    if (interfaceC3163lP.l(onClick)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                }
                if ((23967451 & i11) == 4793490) {
                    interfaceC3163lP.o();
                    if ((i9 & 1) != 0) {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    } else {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    }
                    i21 = i11;
                    L0.i iVar111116 = iVar2;
                    V0.d dVar111111111111 = dVar3;
                    d dVar111111111112 = dVar4;
                    J3.c cVar111116 = cVar2;
                    T0 t1111112 = t0E;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                    }
                    b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar111116, dVar111111111111, dVar111111111112, cVar111116, t1111112, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar3 = iVar111116;
                    dVar5 = dVar111111111111;
                    dVar6 = dVar111111111112;
                    cVar3 = cVar111116;
                    t9 = t1111112;
                    z10 = z9;
                } else {
                    interfaceC3163lP.o();
                    if ((i9 & 1) != 0) {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    } else {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    }
                    i21 = i11;
                    L0.i iVar111117 = iVar2;
                    V0.d dVar111111111113 = dVar3;
                    d dVar111111111114 = dVar4;
                    J3.c cVar111117 = cVar2;
                    T0 t1111113 = t0E;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                    }
                    b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar111117, dVar111111111113, dVar111111111114, cVar111117, t1111113, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar3 = iVar111117;
                    dVar5 = dVar111111111113;
                    dVar6 = dVar111111111114;
                    cVar3 = cVar111117;
                    t9 = t1111113;
                    z10 = z9;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                }
            }
            i20 = 12582912;
            i11 |= i20;
            if ((23967451 & i11) == 4793490) {
                interfaceC3163lP.o();
                if ((i9 & 1) != 0) {
                    if (i22 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i12 != 0) {
                        dVar3 = null;
                    }
                    if (i14 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i16 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i18 != 0) {
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                } else {
                    if (i22 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i12 != 0) {
                        dVar3 = null;
                    }
                    if (i14 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i16 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i18 != 0) {
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                }
                i21 = i11;
                L0.i iVar111118 = iVar2;
                V0.d dVar111111111115 = dVar3;
                d dVar111111111116 = dVar4;
                J3.c cVar111118 = cVar2;
                T0 t1111114 = t0E;
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                }
                b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar111118, dVar111111111115, dVar111111111116, cVar111118, t1111114, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar3 = iVar111118;
                dVar5 = dVar111111111115;
                dVar6 = dVar111111111116;
                cVar3 = cVar111118;
                t9 = t1111114;
                z10 = z9;
            } else {
                interfaceC3163lP.o();
                if ((i9 & 1) != 0) {
                    if (i22 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i12 != 0) {
                        dVar3 = null;
                    }
                    if (i14 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i16 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i18 != 0) {
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                } else {
                    if (i22 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i12 != 0) {
                        dVar3 = null;
                    }
                    if (i14 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i16 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i18 != 0) {
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                }
                i21 = i11;
                L0.i iVar111119 = iVar2;
                V0.d dVar111111111117 = dVar3;
                d dVar111111111118 = dVar4;
                J3.c cVar111119 = cVar2;
                T0 t1111115 = t0E;
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                }
                b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar111119, dVar111111111117, dVar111111111118, cVar111119, t1111115, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar3 = iVar111119;
                dVar5 = dVar111111111117;
                dVar6 = dVar111111111118;
                cVar3 = cVar111119;
                t9 = t1111115;
                z10 = z9;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
            }
        }
        i11 |= 3072;
        dVar4 = dVar2;
        i16 = i10 & 16;
        if (i16 != 0) {
            if ((57344 & i9) == 0) {
                cVar2 = cVar;
                if (interfaceC3163lP.R(cVar2)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i11 |= i17;
            }
            if ((458752 & i9) == 0) {
                if ((i10 & 32) == 0) {
                    t0E = t8;
                    if (interfaceC3163lP.R(t0E)) {
                    }
                    i11 |= i23;
                } else {
                    t0E = t8;
                }
                i11 |= i23;
            } else {
                t0E = t8;
            }
            i18 = i10 & 64;
            if (i18 != 0) {
                i11 |= 1572864;
            } else if ((i9 & 3670016) == 0) {
                if (interfaceC3163lP.c(z8)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i11 |= i19;
            }
            if ((i10 & 128) != 0) {
                if ((i9 & 29360128) == 0) {
                    if (interfaceC3163lP.l(onClick)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                }
                if ((23967451 & i11) == 4793490) {
                    interfaceC3163lP.o();
                    if ((i9 & 1) != 0) {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    } else {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    }
                    i21 = i11;
                    L0.i iVar1111110 = iVar2;
                    V0.d dVar111111111119 = dVar3;
                    d dVar1111111111110 = dVar4;
                    J3.c cVar1111110 = cVar2;
                    T0 t1111116 = t0E;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                    }
                    b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar1111110, dVar111111111119, dVar1111111111110, cVar1111110, t1111116, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar3 = iVar1111110;
                    dVar5 = dVar111111111119;
                    dVar6 = dVar1111111111110;
                    cVar3 = cVar1111110;
                    t9 = t1111116;
                    z10 = z9;
                } else {
                    interfaceC3163lP.o();
                    if ((i9 & 1) != 0) {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    } else {
                        if (i22 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i12 != 0) {
                            dVar3 = null;
                        }
                        if (i14 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i16 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i10 & 32) != 0) {
                            i11 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i18 != 0) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                    }
                    i21 = i11;
                    L0.i iVar1111111 = iVar2;
                    V0.d dVar1111111111111 = dVar3;
                    d dVar1111111111112 = dVar4;
                    J3.c cVar1111111 = cVar2;
                    T0 t1111117 = t0E;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                    }
                    b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar1111111, dVar1111111111111, dVar1111111111112, cVar1111111, t1111117, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar3 = iVar1111111;
                    dVar5 = dVar1111111111111;
                    dVar6 = dVar1111111111112;
                    cVar3 = cVar1111111;
                    t9 = t1111117;
                    z10 = z9;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
                }
            }
            i20 = 12582912;
            i11 |= i20;
            if ((23967451 & i11) == 4793490) {
                interfaceC3163lP.o();
                if ((i9 & 1) != 0) {
                    if (i22 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i12 != 0) {
                        dVar3 = null;
                    }
                    if (i14 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i16 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i18 != 0) {
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                } else {
                    if (i22 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i12 != 0) {
                        dVar3 = null;
                    }
                    if (i14 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i16 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i18 != 0) {
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                }
                i21 = i11;
                L0.i iVar1111112 = iVar2;
                V0.d dVar1111111111113 = dVar3;
                d dVar1111111111114 = dVar4;
                J3.c cVar1111112 = cVar2;
                T0 t1111118 = t0E;
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                }
                b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar1111112, dVar1111111111113, dVar1111111111114, cVar1111112, t1111118, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar3 = iVar1111112;
                dVar5 = dVar1111111111113;
                dVar6 = dVar1111111111114;
                cVar3 = cVar1111112;
                t9 = t1111118;
                z10 = z9;
            } else {
                interfaceC3163lP.o();
                if ((i9 & 1) != 0) {
                    if (i22 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i12 != 0) {
                        dVar3 = null;
                    }
                    if (i14 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i16 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i18 != 0) {
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                } else {
                    if (i22 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i12 != 0) {
                        dVar3 = null;
                    }
                    if (i14 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i16 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i18 != 0) {
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                }
                i21 = i11;
                L0.i iVar1111113 = iVar2;
                V0.d dVar1111111111115 = dVar3;
                d dVar1111111111116 = dVar4;
                J3.c cVar1111113 = cVar2;
                T0 t1111119 = t0E;
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                }
                b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar1111113, dVar1111111111115, dVar1111111111116, cVar1111113, t1111119, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar3 = iVar1111113;
                dVar5 = dVar1111111111115;
                dVar6 = dVar1111111111116;
                cVar3 = cVar1111113;
                t9 = t1111119;
                z10 = z9;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
            }
        }
        i11 |= 24576;
        cVar2 = cVar;
        if ((458752 & i9) == 0) {
            if ((i10 & 32) == 0) {
                t0E = t8;
                if (interfaceC3163lP.R(t0E)) {
                }
                i11 |= i23;
            } else {
                t0E = t8;
            }
            i11 |= i23;
        } else {
            t0E = t8;
        }
        i18 = i10 & 64;
        if (i18 != 0) {
            i11 |= 1572864;
        } else if ((i9 & 3670016) == 0) {
            if (interfaceC3163lP.c(z8)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i11 |= i19;
        }
        if ((i10 & 128) != 0) {
            if ((i9 & 29360128) == 0) {
                if (interfaceC3163lP.l(onClick)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
            }
            if ((23967451 & i11) == 4793490) {
                interfaceC3163lP.o();
                if ((i9 & 1) != 0) {
                    if (i22 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i12 != 0) {
                        dVar3 = null;
                    }
                    if (i14 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i16 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i18 != 0) {
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                } else {
                    if (i22 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i12 != 0) {
                        dVar3 = null;
                    }
                    if (i14 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i16 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i18 != 0) {
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                }
                i21 = i11;
                L0.i iVar1111114 = iVar2;
                V0.d dVar1111111111117 = dVar3;
                d dVar1111111111118 = dVar4;
                J3.c cVar1111114 = cVar2;
                T0 t11111110 = t0E;
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                }
                b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar1111114, dVar1111111111117, dVar1111111111118, cVar1111114, t11111110, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar3 = iVar1111114;
                dVar5 = dVar1111111111117;
                dVar6 = dVar1111111111118;
                cVar3 = cVar1111114;
                t9 = t11111110;
                z10 = z9;
            } else {
                interfaceC3163lP.o();
                if ((i9 & 1) != 0) {
                    if (i22 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i12 != 0) {
                        dVar3 = null;
                    }
                    if (i14 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i16 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i18 != 0) {
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                } else {
                    if (i22 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i12 != 0) {
                        dVar3 = null;
                    }
                    if (i14 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i16 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i10 & 32) != 0) {
                        i11 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i18 != 0) {
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                }
                i21 = i11;
                L0.i iVar1111115 = iVar2;
                V0.d dVar1111111111119 = dVar3;
                d dVar11111111111110 = dVar4;
                J3.c cVar1111115 = cVar2;
                T0 t11111111 = t0E;
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
                }
                b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar1111115, dVar1111111111119, dVar11111111111110, cVar1111115, t11111111, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar3 = iVar1111115;
                dVar5 = dVar1111111111119;
                dVar6 = dVar11111111111110;
                cVar3 = cVar1111115;
                t9 = t11111111;
                z10 = z9;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
            }
        }
        i20 = 12582912;
        i11 |= i20;
        if ((23967451 & i11) == 4793490) {
            interfaceC3163lP.o();
            if ((i9 & 1) != 0) {
                if (i22 != 0) {
                    iVar2 = L0.i.f4836a;
                }
                if (i12 != 0) {
                    dVar3 = null;
                }
                if (i14 != 0) {
                    dVar4 = d.f4150c;
                }
                if (i16 != 0) {
                    cVar2 = J3.c.M;
                }
                if ((i10 & 32) != 0) {
                    i11 &= -458753;
                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                }
                if (i18 != 0) {
                    z9 = true;
                } else {
                    z9 = z8;
                }
            } else {
                if (i22 != 0) {
                    iVar2 = L0.i.f4836a;
                }
                if (i12 != 0) {
                    dVar3 = null;
                }
                if (i14 != 0) {
                    dVar4 = d.f4150c;
                }
                if (i16 != 0) {
                    cVar2 = J3.c.M;
                }
                if ((i10 & 32) != 0) {
                    i11 &= -458753;
                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                }
                if (i18 != 0) {
                    z9 = true;
                } else {
                    z9 = z8;
                }
            }
            i21 = i11;
            L0.i iVar1111116 = iVar2;
            V0.d dVar11111111111111 = dVar3;
            d dVar11111111111112 = dVar4;
            J3.c cVar1111116 = cVar2;
            T0 t11111112 = t0E;
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
            }
            b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar1111116, dVar11111111111111, dVar11111111111112, cVar1111116, t11111112, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar3 = iVar1111116;
            dVar5 = dVar11111111111111;
            dVar6 = dVar11111111111112;
            cVar3 = cVar1111116;
            t9 = t11111112;
            z10 = z9;
        } else {
            interfaceC3163lP.o();
            if ((i9 & 1) != 0) {
                if (i22 != 0) {
                    iVar2 = L0.i.f4836a;
                }
                if (i12 != 0) {
                    dVar3 = null;
                }
                if (i14 != 0) {
                    dVar4 = d.f4150c;
                }
                if (i16 != 0) {
                    cVar2 = J3.c.M;
                }
                if ((i10 & 32) != 0) {
                    i11 &= -458753;
                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                }
                if (i18 != 0) {
                    z9 = true;
                } else {
                    z9 = z8;
                }
            } else {
                if (i22 != 0) {
                    iVar2 = L0.i.f4836a;
                }
                if (i12 != 0) {
                    dVar3 = null;
                }
                if (i14 != 0) {
                    dVar4 = d.f4150c;
                }
                if (i16 != 0) {
                    cVar2 = J3.c.M;
                }
                if ((i10 & 32) != 0) {
                    i11 &= -458753;
                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                }
                if (i18 != 0) {
                    z9 = true;
                } else {
                    z9 = z8;
                }
            }
            i21 = i11;
            L0.i iVar1111117 = iVar2;
            V0.d dVar11111111111113 = dVar3;
            d dVar11111111111114 = dVar4;
            J3.c cVar1111117 = cVar2;
            T0 t11111113 = t0E;
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-809291203, i21, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:119)");
            }
            b(p101l1.f.b(i8, interfaceC3163lP, i21 & 14), iVar1111117, dVar11111111111113, dVar11111111111114, cVar1111117, t11111113, z9, onClick, interfaceC3163lP, i21 & 33554416, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar3 = iVar1111117;
            dVar5 = dVar11111111111113;
            dVar6 = dVar11111111111114;
            cVar3 = cVar1111117;
            t9 = t11111113;
            z10 = z9;
        }
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new a(i8, iVar3, dVar5, dVar6, cVar3, t9, z10, onClick, i9, i10));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x012d A[PHI: r3 r5 r7 r10 r13 r14
      0x012d: PHI (r3v28 int) = (r3v22 int), (r3v21 int), (r3v30 int) binds: [B:114:0x015c, B:100:0x0129, B:101:0x012b] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r5v9 L0.i) = (r5v3 L0.i), (r5v2 L0.i), (r5v2 L0.i) binds: [B:114:0x015c, B:100:0x0129, B:101:0x012b] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r7v9 V0.d) = (r7v3 V0.d), (r7v2 V0.d), (r7v2 V0.d) binds: [B:114:0x015c, B:100:0x0129, B:101:0x012b] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r10v13 J3.d) = (r10v3 J3.d), (r10v2 J3.d), (r10v2 J3.d) binds: [B:114:0x015c, B:100:0x0129, B:101:0x012b] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r13v9 J3.c) = (r13v4 J3.c), (r13v3 J3.c), (r13v3 J3.c) binds: [B:114:0x015c, B:100:0x0129, B:101:0x012b] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r14v12 R0.T0) = (r14v8 R0.T0), (r14v7 R0.T0), (r14v7 R0.T0) binds: [B:114:0x015c, B:100:0x0129, B:101:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:103:0x0136 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0138  */
    /* JADX WARN: Code duplicated, block: B:106:0x013d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0141  */
    /* JADX WARN: Code duplicated, block: B:110:0x0146  */
    /* JADX WARN: Code duplicated, block: B:113:0x014d  */
    /* JADX WARN: Code duplicated, block: B:115:0x015e  */
    /* JADX WARN: Code duplicated, block: B:118:0x016e  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:125:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:94:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x011d  */
    public static final void b(String text, L0.i iVar, V0.d dVar, d dVar2, J3.c cVar, T0 t8, boolean z8, Function0 onClick, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        L0.i iVar2;
        int i11;
        V0.d dVar3;
        int i12;
        int i13;
        d dVar4;
        int i14;
        int i15;
        J3.c cVar2;
        int i16;
        T0 t0E;
        int i17;
        int i18;
        int i19;
        int i20;
        V0.d dVar5;
        L0.i iVar3;
        d dVar6;
        J3.c cVar3;
        boolean z9;
        V0.d dVar7;
        boolean z10;
        T0 t9;
        L0.i iVar4;
        J3.c cVar4;
        d dVar8;
        p215z0.P0 p0V;
        t.g(text, "text");
        t.g(onClick, "onClick");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-517481809);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.R(text) ? 4 : 2) | i8;
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
                if ((i8 & 896) == 0) {
                    dVar3 = dVar;
                    if (interfaceC3163lP.R(dVar3)) {
                        i12 = 256;
                    } else {
                        i12 = 128;
                    }
                    i10 |= i12;
                }
                i13 = i9 & 8;
                if (i13 != 0) {
                    if ((i8 & 7168) == 0) {
                        dVar4 = dVar2;
                        if (interfaceC3163lP.R(dVar4)) {
                            i14 = 2048;
                        } else {
                            i14 = 1024;
                        }
                        i10 |= i14;
                    }
                    i15 = i9 & 16;
                    if (i15 != 0) {
                        if ((57344 & i8) == 0) {
                            cVar2 = cVar;
                            if (interfaceC3163lP.R(cVar2)) {
                                i16 = 16384;
                            } else {
                                i16 = 8192;
                            }
                            i10 |= i16;
                        }
                        if ((458752 & i8) == 0) {
                            if ((i9 & 32) == 0) {
                                t0E = t8;
                                int i22 = interfaceC3163lP.R(t0E) ? 131072 : 65536;
                                i10 |= i22;
                            } else {
                                t0E = t8;
                            }
                            i10 |= i22;
                        } else {
                            t0E = t8;
                        }
                        i17 = i9 & 64;
                        if (i17 != 0) {
                            i10 |= 1572864;
                        } else if ((i8 & 3670016) == 0) {
                            if (interfaceC3163lP.c(z8)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i10 |= i18;
                        }
                        if ((i9 & 128) != 0) {
                            if ((i8 & 29360128) == 0) {
                                if (interfaceC3163lP.l(onClick)) {
                                    i19 = 8388608;
                                } else {
                                    i19 = 4194304;
                                }
                            }
                            if ((23967451 & i10) == 4793490 || !interfaceC3163lP.s()) {
                                interfaceC3163lP.o();
                                if ((i8 & 1) != 0 || interfaceC3163lP.F()) {
                                    if (i21 != 0) {
                                        iVar2 = L0.i.f4836a;
                                    }
                                    if (i11 != 0) {
                                        dVar3 = null;
                                    }
                                    if (i13 != 0) {
                                        dVar4 = d.f4150c;
                                    }
                                    if (i15 != 0) {
                                        cVar2 = J3.c.M;
                                    }
                                    if ((i9 & 32) != 0) {
                                        i10 &= -458753;
                                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                    }
                                    if (i17 != 0) {
                                        V0.d dVar9 = dVar3;
                                        i20 = i10;
                                        dVar5 = dVar9;
                                        iVar3 = iVar2;
                                        dVar6 = dVar4;
                                        cVar3 = cVar2;
                                        z9 = true;
                                    }
                                    interfaceC3163lP.Q();
                                    if (AbstractC3169o.K()) {
                                        AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                                    }
                                    L0.i iVarA = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                                    C3072m c3072mB = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                                    int i23 = i20 >> 12;
                                    J jB = cVar3.b(interfaceC3163lP, i23 & 14);
                                    L0.i iVar5 = iVar3;
                                    H0.a aVarB = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                                    int i24 = ((i20 >> 21) & 14) | 805306368 | (i23 & 896) | ((i20 >> 6) & 7168);
                                    J3.c cVar5 = cVar3;
                                    T0 t10 = t0E;
                                    d dVar10 = dVar6;
                                    boolean z11 = z9;
                                    V0.d dVar11 = dVar5;
                                    AbstractC3078p.a(onClick, iVarA, z11, t10, c3072mB, null, null, jB, null, aVarB, interfaceC3163lP, i24, 352);
                                    if (AbstractC3169o.K()) {
                                        AbstractC3169o.V();
                                    }
                                    dVar7 = dVar11;
                                    z10 = z11;
                                    t9 = t10;
                                    iVar4 = iVar5;
                                    cVar4 = cVar5;
                                    dVar8 = dVar10;
                                } else {
                                    interfaceC3163lP.z();
                                    if ((i9 & 32) != 0) {
                                        i10 &= -458753;
                                    }
                                }
                                V0.d dVar12 = dVar3;
                                i20 = i10;
                                dVar5 = dVar12;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                interfaceC3163lP.Q();
                                if (AbstractC3169o.K()) {
                                    AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                                }
                                L0.i iVarA2 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                                C3072m c3072mB2 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                                int i25 = i20 >> 12;
                                J jB2 = cVar3.b(interfaceC3163lP, i25 & 14);
                                L0.i iVar6 = iVar3;
                                H0.a aVarB2 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                                int i26 = ((i20 >> 21) & 14) | 805306368 | (i25 & 896) | ((i20 >> 6) & 7168);
                                J3.c cVar6 = cVar3;
                                T0 t11 = t0E;
                                d dVar13 = dVar6;
                                boolean z12 = z9;
                                V0.d dVar14 = dVar5;
                                AbstractC3078p.a(onClick, iVarA2, z12, t11, c3072mB2, null, null, jB2, null, aVarB2, interfaceC3163lP, i26, 352);
                                if (AbstractC3169o.K()) {
                                    AbstractC3169o.V();
                                }
                                dVar7 = dVar14;
                                z10 = z12;
                                t9 = t11;
                                iVar4 = iVar6;
                                cVar4 = cVar6;
                                dVar8 = dVar13;
                            } else {
                                interfaceC3163lP.z();
                                iVar4 = iVar2;
                                dVar7 = dVar3;
                                dVar8 = dVar4;
                                cVar4 = cVar2;
                                t9 = t0E;
                                z10 = z8;
                            }
                            p0V = interfaceC3163lP.v();
                            if (p0V != null) {
                                p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                            }
                        }
                        i19 = 12582912;
                        i10 |= i19;
                        if ((23967451 & i10) == 4793490) {
                            interfaceC3163lP.o();
                            if ((i8 & 1) != 0) {
                                if (i21 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i11 != 0) {
                                    dVar3 = null;
                                }
                                if (i13 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i15 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i9 & 32) != 0) {
                                    i10 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i17 != 0) {
                                    V0.d dVar15 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar15;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                    z9 = true;
                                } else {
                                    V0.d dVar16 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar16;
                                    z9 = z8;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                }
                            } else {
                                if (i21 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i11 != 0) {
                                    dVar3 = null;
                                }
                                if (i13 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i15 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i9 & 32) != 0) {
                                    i10 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i17 != 0) {
                                    V0.d dVar17 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar17;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                    z9 = true;
                                } else {
                                    V0.d dVar18 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar18;
                                    z9 = z8;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                }
                            }
                            interfaceC3163lP.Q();
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                            }
                            L0.i iVarA3 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                            C3072m c3072mB3 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                            int i27 = i20 >> 12;
                            J jB3 = cVar3.b(interfaceC3163lP, i27 & 14);
                            L0.i iVar7 = iVar3;
                            H0.a aVarB3 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                            int i28 = ((i20 >> 21) & 14) | 805306368 | (i27 & 896) | ((i20 >> 6) & 7168);
                            J3.c cVar7 = cVar3;
                            T0 t12 = t0E;
                            d dVar19 = dVar6;
                            boolean z13 = z9;
                            V0.d dVar110 = dVar5;
                            AbstractC3078p.a(onClick, iVarA3, z13, t12, c3072mB3, null, null, jB3, null, aVarB3, interfaceC3163lP, i28, 352);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            dVar7 = dVar110;
                            z10 = z13;
                            t9 = t12;
                            iVar4 = iVar7;
                            cVar4 = cVar7;
                            dVar8 = dVar19;
                        } else {
                            interfaceC3163lP.o();
                            if ((i8 & 1) != 0) {
                                if (i21 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i11 != 0) {
                                    dVar3 = null;
                                }
                                if (i13 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i15 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i9 & 32) != 0) {
                                    i10 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i17 != 0) {
                                    V0.d dVar111 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar111;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                    z9 = true;
                                } else {
                                    V0.d dVar112 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar112;
                                    z9 = z8;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                }
                            } else {
                                if (i21 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i11 != 0) {
                                    dVar3 = null;
                                }
                                if (i13 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i15 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i9 & 32) != 0) {
                                    i10 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i17 != 0) {
                                    V0.d dVar113 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar113;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                    z9 = true;
                                } else {
                                    V0.d dVar114 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar114;
                                    z9 = z8;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                }
                            }
                            interfaceC3163lP.Q();
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                            }
                            L0.i iVarA4 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                            C3072m c3072mB4 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                            int i29 = i20 >> 12;
                            J jB4 = cVar3.b(interfaceC3163lP, i29 & 14);
                            L0.i iVar8 = iVar3;
                            H0.a aVarB4 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                            int i210 = ((i20 >> 21) & 14) | 805306368 | (i29 & 896) | ((i20 >> 6) & 7168);
                            J3.c cVar8 = cVar3;
                            T0 t13 = t0E;
                            d dVar115 = dVar6;
                            boolean z14 = z9;
                            V0.d dVar116 = dVar5;
                            AbstractC3078p.a(onClick, iVarA4, z14, t13, c3072mB4, null, null, jB4, null, aVarB4, interfaceC3163lP, i210, 352);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            dVar7 = dVar116;
                            z10 = z14;
                            t9 = t13;
                            iVar4 = iVar8;
                            cVar4 = cVar8;
                            dVar8 = dVar115;
                        }
                        p0V = interfaceC3163lP.v();
                        if (p0V != null) {
                            p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                        }
                    }
                    i10 |= 24576;
                    cVar2 = cVar;
                    if ((458752 & i8) == 0) {
                        if ((i9 & 32) == 0) {
                            t0E = t8;
                            if (interfaceC3163lP.R(t0E)) {
                            }
                            i10 |= i22;
                        } else {
                            t0E = t8;
                        }
                        i10 |= i22;
                    } else {
                        t0E = t8;
                    }
                    i17 = i9 & 64;
                    if (i17 != 0) {
                        i10 |= 1572864;
                    } else if ((i8 & 3670016) == 0) {
                        if (interfaceC3163lP.c(z8)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i10 |= i18;
                    }
                    if ((i9 & 128) != 0) {
                        if ((i8 & 29360128) == 0) {
                            if (interfaceC3163lP.l(onClick)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                        }
                        if ((23967451 & i10) == 4793490) {
                            interfaceC3163lP.o();
                            if ((i8 & 1) != 0) {
                                if (i21 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i11 != 0) {
                                    dVar3 = null;
                                }
                                if (i13 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i15 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i9 & 32) != 0) {
                                    i10 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i17 != 0) {
                                    V0.d dVar117 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar117;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                    z9 = true;
                                } else {
                                    V0.d dVar118 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar118;
                                    z9 = z8;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                }
                            } else {
                                if (i21 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i11 != 0) {
                                    dVar3 = null;
                                }
                                if (i13 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i15 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i9 & 32) != 0) {
                                    i10 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i17 != 0) {
                                    V0.d dVar119 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar119;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                    z9 = true;
                                } else {
                                    V0.d dVar1110 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar1110;
                                    z9 = z8;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                }
                            }
                            interfaceC3163lP.Q();
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                            }
                            L0.i iVarA5 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                            C3072m c3072mB5 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                            int i211 = i20 >> 12;
                            J jB5 = cVar3.b(interfaceC3163lP, i211 & 14);
                            L0.i iVar9 = iVar3;
                            H0.a aVarB5 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                            int i212 = ((i20 >> 21) & 14) | 805306368 | (i211 & 896) | ((i20 >> 6) & 7168);
                            J3.c cVar9 = cVar3;
                            T0 t14 = t0E;
                            d dVar1111 = dVar6;
                            boolean z15 = z9;
                            V0.d dVar1112 = dVar5;
                            AbstractC3078p.a(onClick, iVarA5, z15, t14, c3072mB5, null, null, jB5, null, aVarB5, interfaceC3163lP, i212, 352);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            dVar7 = dVar1112;
                            z10 = z15;
                            t9 = t14;
                            iVar4 = iVar9;
                            cVar4 = cVar9;
                            dVar8 = dVar1111;
                        } else {
                            interfaceC3163lP.o();
                            if ((i8 & 1) != 0) {
                                if (i21 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i11 != 0) {
                                    dVar3 = null;
                                }
                                if (i13 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i15 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i9 & 32) != 0) {
                                    i10 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i17 != 0) {
                                    V0.d dVar1113 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar1113;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                    z9 = true;
                                } else {
                                    V0.d dVar1114 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar1114;
                                    z9 = z8;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                }
                            } else {
                                if (i21 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i11 != 0) {
                                    dVar3 = null;
                                }
                                if (i13 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i15 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i9 & 32) != 0) {
                                    i10 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i17 != 0) {
                                    V0.d dVar1115 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar1115;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                    z9 = true;
                                } else {
                                    V0.d dVar1116 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar1116;
                                    z9 = z8;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                }
                            }
                            interfaceC3163lP.Q();
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                            }
                            L0.i iVarA6 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                            C3072m c3072mB6 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                            int i213 = i20 >> 12;
                            J jB6 = cVar3.b(interfaceC3163lP, i213 & 14);
                            L0.i iVar10 = iVar3;
                            H0.a aVarB6 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                            int i214 = ((i20 >> 21) & 14) | 805306368 | (i213 & 896) | ((i20 >> 6) & 7168);
                            J3.c cVar10 = cVar3;
                            T0 t15 = t0E;
                            d dVar1117 = dVar6;
                            boolean z16 = z9;
                            V0.d dVar1118 = dVar5;
                            AbstractC3078p.a(onClick, iVarA6, z16, t15, c3072mB6, null, null, jB6, null, aVarB6, interfaceC3163lP, i214, 352);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            dVar7 = dVar1118;
                            z10 = z16;
                            t9 = t15;
                            iVar4 = iVar10;
                            cVar4 = cVar10;
                            dVar8 = dVar1117;
                        }
                        p0V = interfaceC3163lP.v();
                        if (p0V != null) {
                            p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                        }
                    }
                    i19 = 12582912;
                    i10 |= i19;
                    if ((23967451 & i10) == 4793490) {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar1119 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1119;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar11110 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11110;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        } else {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar11111 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11111;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar11112 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11112;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                        }
                        L0.i iVarA7 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                        C3072m c3072mB7 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                        int i215 = i20 >> 12;
                        J jB7 = cVar3.b(interfaceC3163lP, i215 & 14);
                        L0.i iVar11 = iVar3;
                        H0.a aVarB7 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                        int i216 = ((i20 >> 21) & 14) | 805306368 | (i215 & 896) | ((i20 >> 6) & 7168);
                        J3.c cVar11 = cVar3;
                        T0 t16 = t0E;
                        d dVar11113 = dVar6;
                        boolean z17 = z9;
                        V0.d dVar11114 = dVar5;
                        AbstractC3078p.a(onClick, iVarA7, z17, t16, c3072mB7, null, null, jB7, null, aVarB7, interfaceC3163lP, i216, 352);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        dVar7 = dVar11114;
                        z10 = z17;
                        t9 = t16;
                        iVar4 = iVar11;
                        cVar4 = cVar11;
                        dVar8 = dVar11113;
                    } else {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar11115 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11115;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar11116 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11116;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        } else {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar11117 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11117;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar11118 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11118;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                        }
                        L0.i iVarA8 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                        C3072m c3072mB8 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                        int i217 = i20 >> 12;
                        J jB8 = cVar3.b(interfaceC3163lP, i217 & 14);
                        L0.i iVar12 = iVar3;
                        H0.a aVarB8 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                        int i218 = ((i20 >> 21) & 14) | 805306368 | (i217 & 896) | ((i20 >> 6) & 7168);
                        J3.c cVar12 = cVar3;
                        T0 t17 = t0E;
                        d dVar11119 = dVar6;
                        boolean z18 = z9;
                        V0.d dVar111110 = dVar5;
                        AbstractC3078p.a(onClick, iVarA8, z18, t17, c3072mB8, null, null, jB8, null, aVarB8, interfaceC3163lP, i218, 352);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        dVar7 = dVar111110;
                        z10 = z18;
                        t9 = t17;
                        iVar4 = iVar12;
                        cVar4 = cVar12;
                        dVar8 = dVar11119;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                    }
                }
                i10 |= 3072;
                dVar4 = dVar2;
                i15 = i9 & 16;
                if (i15 != 0) {
                    if ((57344 & i8) == 0) {
                        cVar2 = cVar;
                        if (interfaceC3163lP.R(cVar2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i10 |= i16;
                    }
                    if ((458752 & i8) == 0) {
                        if ((i9 & 32) == 0) {
                            t0E = t8;
                            if (interfaceC3163lP.R(t0E)) {
                            }
                            i10 |= i22;
                        } else {
                            t0E = t8;
                        }
                        i10 |= i22;
                    } else {
                        t0E = t8;
                    }
                    i17 = i9 & 64;
                    if (i17 != 0) {
                        i10 |= 1572864;
                    } else if ((i8 & 3670016) == 0) {
                        if (interfaceC3163lP.c(z8)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i10 |= i18;
                    }
                    if ((i9 & 128) != 0) {
                        if ((i8 & 29360128) == 0) {
                            if (interfaceC3163lP.l(onClick)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                        }
                        if ((23967451 & i10) == 4793490) {
                            interfaceC3163lP.o();
                            if ((i8 & 1) != 0) {
                                if (i21 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i11 != 0) {
                                    dVar3 = null;
                                }
                                if (i13 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i15 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i9 & 32) != 0) {
                                    i10 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i17 != 0) {
                                    V0.d dVar111111 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar111111;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                    z9 = true;
                                } else {
                                    V0.d dVar111112 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar111112;
                                    z9 = z8;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                }
                            } else {
                                if (i21 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i11 != 0) {
                                    dVar3 = null;
                                }
                                if (i13 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i15 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i9 & 32) != 0) {
                                    i10 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i17 != 0) {
                                    V0.d dVar111113 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar111113;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                    z9 = true;
                                } else {
                                    V0.d dVar111114 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar111114;
                                    z9 = z8;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                }
                            }
                            interfaceC3163lP.Q();
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                            }
                            L0.i iVarA9 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                            C3072m c3072mB9 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                            int i219 = i20 >> 12;
                            J jB9 = cVar3.b(interfaceC3163lP, i219 & 14);
                            L0.i iVar13 = iVar3;
                            H0.a aVarB9 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                            int i2110 = ((i20 >> 21) & 14) | 805306368 | (i219 & 896) | ((i20 >> 6) & 7168);
                            J3.c cVar13 = cVar3;
                            T0 t18 = t0E;
                            d dVar111115 = dVar6;
                            boolean z19 = z9;
                            V0.d dVar111116 = dVar5;
                            AbstractC3078p.a(onClick, iVarA9, z19, t18, c3072mB9, null, null, jB9, null, aVarB9, interfaceC3163lP, i2110, 352);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            dVar7 = dVar111116;
                            z10 = z19;
                            t9 = t18;
                            iVar4 = iVar13;
                            cVar4 = cVar13;
                            dVar8 = dVar111115;
                        } else {
                            interfaceC3163lP.o();
                            if ((i8 & 1) != 0) {
                                if (i21 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i11 != 0) {
                                    dVar3 = null;
                                }
                                if (i13 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i15 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i9 & 32) != 0) {
                                    i10 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i17 != 0) {
                                    V0.d dVar111117 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar111117;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                    z9 = true;
                                } else {
                                    V0.d dVar111118 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar111118;
                                    z9 = z8;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                }
                            } else {
                                if (i21 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i11 != 0) {
                                    dVar3 = null;
                                }
                                if (i13 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i15 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i9 & 32) != 0) {
                                    i10 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i17 != 0) {
                                    V0.d dVar111119 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar111119;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                    z9 = true;
                                } else {
                                    V0.d dVar1111110 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar1111110;
                                    z9 = z8;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                }
                            }
                            interfaceC3163lP.Q();
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                            }
                            L0.i iVarA10 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                            C3072m c3072mB10 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                            int i2111 = i20 >> 12;
                            J jB10 = cVar3.b(interfaceC3163lP, i2111 & 14);
                            L0.i iVar14 = iVar3;
                            H0.a aVarB10 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                            int i2112 = ((i20 >> 21) & 14) | 805306368 | (i2111 & 896) | ((i20 >> 6) & 7168);
                            J3.c cVar14 = cVar3;
                            T0 t19 = t0E;
                            d dVar1111111 = dVar6;
                            boolean z110 = z9;
                            V0.d dVar1111112 = dVar5;
                            AbstractC3078p.a(onClick, iVarA10, z110, t19, c3072mB10, null, null, jB10, null, aVarB10, interfaceC3163lP, i2112, 352);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            dVar7 = dVar1111112;
                            z10 = z110;
                            t9 = t19;
                            iVar4 = iVar14;
                            cVar4 = cVar14;
                            dVar8 = dVar1111111;
                        }
                        p0V = interfaceC3163lP.v();
                        if (p0V != null) {
                            p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                        }
                    }
                    i19 = 12582912;
                    i10 |= i19;
                    if ((23967451 & i10) == 4793490) {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar1111113 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111113;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar1111114 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111114;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        } else {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar1111115 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111115;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar1111116 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111116;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                        }
                        L0.i iVarA11 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                        C3072m c3072mB11 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                        int i2113 = i20 >> 12;
                        J jB11 = cVar3.b(interfaceC3163lP, i2113 & 14);
                        L0.i iVar15 = iVar3;
                        H0.a aVarB11 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                        int i2114 = ((i20 >> 21) & 14) | 805306368 | (i2113 & 896) | ((i20 >> 6) & 7168);
                        J3.c cVar15 = cVar3;
                        T0 t110 = t0E;
                        d dVar1111117 = dVar6;
                        boolean z111 = z9;
                        V0.d dVar1111118 = dVar5;
                        AbstractC3078p.a(onClick, iVarA11, z111, t110, c3072mB11, null, null, jB11, null, aVarB11, interfaceC3163lP, i2114, 352);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        dVar7 = dVar1111118;
                        z10 = z111;
                        t9 = t110;
                        iVar4 = iVar15;
                        cVar4 = cVar15;
                        dVar8 = dVar1111117;
                    } else {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar1111119 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111119;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar11111110 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11111110;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        } else {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar11111111 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11111111;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar11111112 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11111112;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                        }
                        L0.i iVarA12 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                        C3072m c3072mB12 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                        int i2115 = i20 >> 12;
                        J jB12 = cVar3.b(interfaceC3163lP, i2115 & 14);
                        L0.i iVar16 = iVar3;
                        H0.a aVarB12 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                        int i2116 = ((i20 >> 21) & 14) | 805306368 | (i2115 & 896) | ((i20 >> 6) & 7168);
                        J3.c cVar16 = cVar3;
                        T0 t111 = t0E;
                        d dVar11111113 = dVar6;
                        boolean z112 = z9;
                        V0.d dVar11111114 = dVar5;
                        AbstractC3078p.a(onClick, iVarA12, z112, t111, c3072mB12, null, null, jB12, null, aVarB12, interfaceC3163lP, i2116, 352);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        dVar7 = dVar11111114;
                        z10 = z112;
                        t9 = t111;
                        iVar4 = iVar16;
                        cVar4 = cVar16;
                        dVar8 = dVar11111113;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                    }
                }
                i10 |= 24576;
                cVar2 = cVar;
                if ((458752 & i8) == 0) {
                    if ((i9 & 32) == 0) {
                        t0E = t8;
                        if (interfaceC3163lP.R(t0E)) {
                        }
                        i10 |= i22;
                    } else {
                        t0E = t8;
                    }
                    i10 |= i22;
                } else {
                    t0E = t8;
                }
                i17 = i9 & 64;
                if (i17 != 0) {
                    i10 |= 1572864;
                } else if ((i8 & 3670016) == 0) {
                    if (interfaceC3163lP.c(z8)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i10 |= i18;
                }
                if ((i9 & 128) != 0) {
                    if ((i8 & 29360128) == 0) {
                        if (interfaceC3163lP.l(onClick)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                    }
                    if ((23967451 & i10) == 4793490) {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar11111115 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11111115;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar11111116 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11111116;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        } else {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar11111117 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11111117;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar11111118 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11111118;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                        }
                        L0.i iVarA13 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                        C3072m c3072mB13 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                        int i2117 = i20 >> 12;
                        J jB13 = cVar3.b(interfaceC3163lP, i2117 & 14);
                        L0.i iVar17 = iVar3;
                        H0.a aVarB13 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                        int i2118 = ((i20 >> 21) & 14) | 805306368 | (i2117 & 896) | ((i20 >> 6) & 7168);
                        J3.c cVar17 = cVar3;
                        T0 t112 = t0E;
                        d dVar11111119 = dVar6;
                        boolean z113 = z9;
                        V0.d dVar111111110 = dVar5;
                        AbstractC3078p.a(onClick, iVarA13, z113, t112, c3072mB13, null, null, jB13, null, aVarB13, interfaceC3163lP, i2118, 352);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        dVar7 = dVar111111110;
                        z10 = z113;
                        t9 = t112;
                        iVar4 = iVar17;
                        cVar4 = cVar17;
                        dVar8 = dVar11111119;
                    } else {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar111111111 = dVar3;
                                i20 = i10;
                                dVar5 = dVar111111111;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar111111112 = dVar3;
                                i20 = i10;
                                dVar5 = dVar111111112;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        } else {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar111111113 = dVar3;
                                i20 = i10;
                                dVar5 = dVar111111113;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar111111114 = dVar3;
                                i20 = i10;
                                dVar5 = dVar111111114;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                        }
                        L0.i iVarA14 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                        C3072m c3072mB14 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                        int i2119 = i20 >> 12;
                        J jB14 = cVar3.b(interfaceC3163lP, i2119 & 14);
                        L0.i iVar18 = iVar3;
                        H0.a aVarB14 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                        int i21110 = ((i20 >> 21) & 14) | 805306368 | (i2119 & 896) | ((i20 >> 6) & 7168);
                        J3.c cVar18 = cVar3;
                        T0 t113 = t0E;
                        d dVar111111115 = dVar6;
                        boolean z114 = z9;
                        V0.d dVar111111116 = dVar5;
                        AbstractC3078p.a(onClick, iVarA14, z114, t113, c3072mB14, null, null, jB14, null, aVarB14, interfaceC3163lP, i21110, 352);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        dVar7 = dVar111111116;
                        z10 = z114;
                        t9 = t113;
                        iVar4 = iVar18;
                        cVar4 = cVar18;
                        dVar8 = dVar111111115;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                    }
                }
                i19 = 12582912;
                i10 |= i19;
                if ((23967451 & i10) == 4793490) {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar111111117 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111117;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar111111118 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111118;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    } else {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar111111119 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111119;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar1111111110 = dVar3;
                            i20 = i10;
                            dVar5 = dVar1111111110;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                    }
                    L0.i iVarA15 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                    C3072m c3072mB15 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                    int i21111 = i20 >> 12;
                    J jB15 = cVar3.b(interfaceC3163lP, i21111 & 14);
                    L0.i iVar19 = iVar3;
                    H0.a aVarB15 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                    int i21112 = ((i20 >> 21) & 14) | 805306368 | (i21111 & 896) | ((i20 >> 6) & 7168);
                    J3.c cVar19 = cVar3;
                    T0 t114 = t0E;
                    d dVar1111111111 = dVar6;
                    boolean z115 = z9;
                    V0.d dVar1111111112 = dVar5;
                    AbstractC3078p.a(onClick, iVarA15, z115, t114, c3072mB15, null, null, jB15, null, aVarB15, interfaceC3163lP, i21112, 352);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    dVar7 = dVar1111111112;
                    z10 = z115;
                    t9 = t114;
                    iVar4 = iVar19;
                    cVar4 = cVar19;
                    dVar8 = dVar1111111111;
                } else {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar1111111113 = dVar3;
                            i20 = i10;
                            dVar5 = dVar1111111113;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar1111111114 = dVar3;
                            i20 = i10;
                            dVar5 = dVar1111111114;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    } else {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar1111111115 = dVar3;
                            i20 = i10;
                            dVar5 = dVar1111111115;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar1111111116 = dVar3;
                            i20 = i10;
                            dVar5 = dVar1111111116;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                    }
                    L0.i iVarA16 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                    C3072m c3072mB16 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                    int i21113 = i20 >> 12;
                    J jB16 = cVar3.b(interfaceC3163lP, i21113 & 14);
                    L0.i iVar110 = iVar3;
                    H0.a aVarB16 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                    int i21114 = ((i20 >> 21) & 14) | 805306368 | (i21113 & 896) | ((i20 >> 6) & 7168);
                    J3.c cVar110 = cVar3;
                    T0 t115 = t0E;
                    d dVar1111111117 = dVar6;
                    boolean z116 = z9;
                    V0.d dVar1111111118 = dVar5;
                    AbstractC3078p.a(onClick, iVarA16, z116, t115, c3072mB16, null, null, jB16, null, aVarB16, interfaceC3163lP, i21114, 352);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    dVar7 = dVar1111111118;
                    z10 = z116;
                    t9 = t115;
                    iVar4 = iVar110;
                    cVar4 = cVar110;
                    dVar8 = dVar1111111117;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                }
            }
            i10 |= 384;
            dVar3 = dVar;
            i13 = i9 & 8;
            if (i13 != 0) {
                if ((i8 & 7168) == 0) {
                    dVar4 = dVar2;
                    if (interfaceC3163lP.R(dVar4)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i10 |= i14;
                }
                i15 = i9 & 16;
                if (i15 != 0) {
                    if ((57344 & i8) == 0) {
                        cVar2 = cVar;
                        if (interfaceC3163lP.R(cVar2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i10 |= i16;
                    }
                    if ((458752 & i8) == 0) {
                        if ((i9 & 32) == 0) {
                            t0E = t8;
                            if (interfaceC3163lP.R(t0E)) {
                            }
                            i10 |= i22;
                        } else {
                            t0E = t8;
                        }
                        i10 |= i22;
                    } else {
                        t0E = t8;
                    }
                    i17 = i9 & 64;
                    if (i17 != 0) {
                        i10 |= 1572864;
                    } else if ((i8 & 3670016) == 0) {
                        if (interfaceC3163lP.c(z8)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i10 |= i18;
                    }
                    if ((i9 & 128) != 0) {
                        if ((i8 & 29360128) == 0) {
                            if (interfaceC3163lP.l(onClick)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                        }
                        if ((23967451 & i10) == 4793490) {
                            interfaceC3163lP.o();
                            if ((i8 & 1) != 0) {
                                if (i21 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i11 != 0) {
                                    dVar3 = null;
                                }
                                if (i13 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i15 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i9 & 32) != 0) {
                                    i10 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i17 != 0) {
                                    V0.d dVar1111111119 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar1111111119;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                    z9 = true;
                                } else {
                                    V0.d dVar11111111110 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar11111111110;
                                    z9 = z8;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                }
                            } else {
                                if (i21 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i11 != 0) {
                                    dVar3 = null;
                                }
                                if (i13 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i15 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i9 & 32) != 0) {
                                    i10 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i17 != 0) {
                                    V0.d dVar11111111111 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar11111111111;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                    z9 = true;
                                } else {
                                    V0.d dVar11111111112 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar11111111112;
                                    z9 = z8;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                }
                            }
                            interfaceC3163lP.Q();
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                            }
                            L0.i iVarA17 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                            C3072m c3072mB17 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                            int i21115 = i20 >> 12;
                            J jB17 = cVar3.b(interfaceC3163lP, i21115 & 14);
                            L0.i iVar111 = iVar3;
                            H0.a aVarB17 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                            int i21116 = ((i20 >> 21) & 14) | 805306368 | (i21115 & 896) | ((i20 >> 6) & 7168);
                            J3.c cVar111 = cVar3;
                            T0 t116 = t0E;
                            d dVar11111111113 = dVar6;
                            boolean z117 = z9;
                            V0.d dVar11111111114 = dVar5;
                            AbstractC3078p.a(onClick, iVarA17, z117, t116, c3072mB17, null, null, jB17, null, aVarB17, interfaceC3163lP, i21116, 352);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            dVar7 = dVar11111111114;
                            z10 = z117;
                            t9 = t116;
                            iVar4 = iVar111;
                            cVar4 = cVar111;
                            dVar8 = dVar11111111113;
                        } else {
                            interfaceC3163lP.o();
                            if ((i8 & 1) != 0) {
                                if (i21 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i11 != 0) {
                                    dVar3 = null;
                                }
                                if (i13 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i15 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i9 & 32) != 0) {
                                    i10 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i17 != 0) {
                                    V0.d dVar11111111115 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar11111111115;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                    z9 = true;
                                } else {
                                    V0.d dVar11111111116 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar11111111116;
                                    z9 = z8;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                }
                            } else {
                                if (i21 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i11 != 0) {
                                    dVar3 = null;
                                }
                                if (i13 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i15 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i9 & 32) != 0) {
                                    i10 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i17 != 0) {
                                    V0.d dVar11111111117 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar11111111117;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                    z9 = true;
                                } else {
                                    V0.d dVar11111111118 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar11111111118;
                                    z9 = z8;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                }
                            }
                            interfaceC3163lP.Q();
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                            }
                            L0.i iVarA18 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                            C3072m c3072mB18 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                            int i21117 = i20 >> 12;
                            J jB18 = cVar3.b(interfaceC3163lP, i21117 & 14);
                            L0.i iVar112 = iVar3;
                            H0.a aVarB18 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                            int i21118 = ((i20 >> 21) & 14) | 805306368 | (i21117 & 896) | ((i20 >> 6) & 7168);
                            J3.c cVar112 = cVar3;
                            T0 t117 = t0E;
                            d dVar11111111119 = dVar6;
                            boolean z118 = z9;
                            V0.d dVar111111111110 = dVar5;
                            AbstractC3078p.a(onClick, iVarA18, z118, t117, c3072mB18, null, null, jB18, null, aVarB18, interfaceC3163lP, i21118, 352);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            dVar7 = dVar111111111110;
                            z10 = z118;
                            t9 = t117;
                            iVar4 = iVar112;
                            cVar4 = cVar112;
                            dVar8 = dVar11111111119;
                        }
                        p0V = interfaceC3163lP.v();
                        if (p0V != null) {
                            p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                        }
                    }
                    i19 = 12582912;
                    i10 |= i19;
                    if ((23967451 & i10) == 4793490) {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar111111111111 = dVar3;
                                i20 = i10;
                                dVar5 = dVar111111111111;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar111111111112 = dVar3;
                                i20 = i10;
                                dVar5 = dVar111111111112;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        } else {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar111111111113 = dVar3;
                                i20 = i10;
                                dVar5 = dVar111111111113;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar111111111114 = dVar3;
                                i20 = i10;
                                dVar5 = dVar111111111114;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                        }
                        L0.i iVarA19 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                        C3072m c3072mB19 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                        int i21119 = i20 >> 12;
                        J jB19 = cVar3.b(interfaceC3163lP, i21119 & 14);
                        L0.i iVar113 = iVar3;
                        H0.a aVarB19 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                        int i211110 = ((i20 >> 21) & 14) | 805306368 | (i21119 & 896) | ((i20 >> 6) & 7168);
                        J3.c cVar113 = cVar3;
                        T0 t118 = t0E;
                        d dVar111111111115 = dVar6;
                        boolean z119 = z9;
                        V0.d dVar111111111116 = dVar5;
                        AbstractC3078p.a(onClick, iVarA19, z119, t118, c3072mB19, null, null, jB19, null, aVarB19, interfaceC3163lP, i211110, 352);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        dVar7 = dVar111111111116;
                        z10 = z119;
                        t9 = t118;
                        iVar4 = iVar113;
                        cVar4 = cVar113;
                        dVar8 = dVar111111111115;
                    } else {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar111111111117 = dVar3;
                                i20 = i10;
                                dVar5 = dVar111111111117;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar111111111118 = dVar3;
                                i20 = i10;
                                dVar5 = dVar111111111118;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        } else {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar111111111119 = dVar3;
                                i20 = i10;
                                dVar5 = dVar111111111119;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar1111111111110 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111111111110;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                        }
                        L0.i iVarA110 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                        C3072m c3072mB110 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                        int i211111 = i20 >> 12;
                        J jB110 = cVar3.b(interfaceC3163lP, i211111 & 14);
                        L0.i iVar114 = iVar3;
                        H0.a aVarB110 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                        int i211112 = ((i20 >> 21) & 14) | 805306368 | (i211111 & 896) | ((i20 >> 6) & 7168);
                        J3.c cVar114 = cVar3;
                        T0 t119 = t0E;
                        d dVar1111111111111 = dVar6;
                        boolean z1110 = z9;
                        V0.d dVar1111111111112 = dVar5;
                        AbstractC3078p.a(onClick, iVarA110, z1110, t119, c3072mB110, null, null, jB110, null, aVarB110, interfaceC3163lP, i211112, 352);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        dVar7 = dVar1111111111112;
                        z10 = z1110;
                        t9 = t119;
                        iVar4 = iVar114;
                        cVar4 = cVar114;
                        dVar8 = dVar1111111111111;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                    }
                }
                i10 |= 24576;
                cVar2 = cVar;
                if ((458752 & i8) == 0) {
                    if ((i9 & 32) == 0) {
                        t0E = t8;
                        if (interfaceC3163lP.R(t0E)) {
                        }
                        i10 |= i22;
                    } else {
                        t0E = t8;
                    }
                    i10 |= i22;
                } else {
                    t0E = t8;
                }
                i17 = i9 & 64;
                if (i17 != 0) {
                    i10 |= 1572864;
                } else if ((i8 & 3670016) == 0) {
                    if (interfaceC3163lP.c(z8)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i10 |= i18;
                }
                if ((i9 & 128) != 0) {
                    if ((i8 & 29360128) == 0) {
                        if (interfaceC3163lP.l(onClick)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                    }
                    if ((23967451 & i10) == 4793490) {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar1111111111113 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111111111113;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar1111111111114 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111111111114;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        } else {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar1111111111115 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111111111115;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar1111111111116 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111111111116;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                        }
                        L0.i iVarA111 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                        C3072m c3072mB111 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                        int i211113 = i20 >> 12;
                        J jB111 = cVar3.b(interfaceC3163lP, i211113 & 14);
                        L0.i iVar115 = iVar3;
                        H0.a aVarB111 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                        int i211114 = ((i20 >> 21) & 14) | 805306368 | (i211113 & 896) | ((i20 >> 6) & 7168);
                        J3.c cVar115 = cVar3;
                        T0 t1110 = t0E;
                        d dVar1111111111117 = dVar6;
                        boolean z1111 = z9;
                        V0.d dVar1111111111118 = dVar5;
                        AbstractC3078p.a(onClick, iVarA111, z1111, t1110, c3072mB111, null, null, jB111, null, aVarB111, interfaceC3163lP, i211114, 352);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        dVar7 = dVar1111111111118;
                        z10 = z1111;
                        t9 = t1110;
                        iVar4 = iVar115;
                        cVar4 = cVar115;
                        dVar8 = dVar1111111111117;
                    } else {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar1111111111119 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111111111119;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar11111111111110 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11111111111110;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        } else {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar11111111111111 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11111111111111;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar11111111111112 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11111111111112;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                        }
                        L0.i iVarA112 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                        C3072m c3072mB112 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                        int i211115 = i20 >> 12;
                        J jB112 = cVar3.b(interfaceC3163lP, i211115 & 14);
                        L0.i iVar116 = iVar3;
                        H0.a aVarB112 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                        int i211116 = ((i20 >> 21) & 14) | 805306368 | (i211115 & 896) | ((i20 >> 6) & 7168);
                        J3.c cVar116 = cVar3;
                        T0 t1111 = t0E;
                        d dVar11111111111113 = dVar6;
                        boolean z1112 = z9;
                        V0.d dVar11111111111114 = dVar5;
                        AbstractC3078p.a(onClick, iVarA112, z1112, t1111, c3072mB112, null, null, jB112, null, aVarB112, interfaceC3163lP, i211116, 352);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        dVar7 = dVar11111111111114;
                        z10 = z1112;
                        t9 = t1111;
                        iVar4 = iVar116;
                        cVar4 = cVar116;
                        dVar8 = dVar11111111111113;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                    }
                }
                i19 = 12582912;
                i10 |= i19;
                if ((23967451 & i10) == 4793490) {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar11111111111115 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111115;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar11111111111116 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111116;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    } else {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar11111111111117 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111117;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar11111111111118 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111118;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                    }
                    L0.i iVarA113 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                    C3072m c3072mB113 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                    int i211117 = i20 >> 12;
                    J jB113 = cVar3.b(interfaceC3163lP, i211117 & 14);
                    L0.i iVar117 = iVar3;
                    H0.a aVarB113 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                    int i211118 = ((i20 >> 21) & 14) | 805306368 | (i211117 & 896) | ((i20 >> 6) & 7168);
                    J3.c cVar117 = cVar3;
                    T0 t1112 = t0E;
                    d dVar11111111111119 = dVar6;
                    boolean z1113 = z9;
                    V0.d dVar111111111111110 = dVar5;
                    AbstractC3078p.a(onClick, iVarA113, z1113, t1112, c3072mB113, null, null, jB113, null, aVarB113, interfaceC3163lP, i211118, 352);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    dVar7 = dVar111111111111110;
                    z10 = z1113;
                    t9 = t1112;
                    iVar4 = iVar117;
                    cVar4 = cVar117;
                    dVar8 = dVar11111111111119;
                } else {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar111111111111111 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar111111111111112 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111112;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    } else {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar111111111111113 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111113;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar111111111111114 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111114;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                    }
                    L0.i iVarA114 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                    C3072m c3072mB114 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                    int i211119 = i20 >> 12;
                    J jB114 = cVar3.b(interfaceC3163lP, i211119 & 14);
                    L0.i iVar118 = iVar3;
                    H0.a aVarB114 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                    int i2111110 = ((i20 >> 21) & 14) | 805306368 | (i211119 & 896) | ((i20 >> 6) & 7168);
                    J3.c cVar118 = cVar3;
                    T0 t1113 = t0E;
                    d dVar111111111111115 = dVar6;
                    boolean z1114 = z9;
                    V0.d dVar111111111111116 = dVar5;
                    AbstractC3078p.a(onClick, iVarA114, z1114, t1113, c3072mB114, null, null, jB114, null, aVarB114, interfaceC3163lP, i2111110, 352);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    dVar7 = dVar111111111111116;
                    z10 = z1114;
                    t9 = t1113;
                    iVar4 = iVar118;
                    cVar4 = cVar118;
                    dVar8 = dVar111111111111115;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                }
            }
            i10 |= 3072;
            dVar4 = dVar2;
            i15 = i9 & 16;
            if (i15 != 0) {
                if ((57344 & i8) == 0) {
                    cVar2 = cVar;
                    if (interfaceC3163lP.R(cVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i10 |= i16;
                }
                if ((458752 & i8) == 0) {
                    if ((i9 & 32) == 0) {
                        t0E = t8;
                        if (interfaceC3163lP.R(t0E)) {
                        }
                        i10 |= i22;
                    } else {
                        t0E = t8;
                    }
                    i10 |= i22;
                } else {
                    t0E = t8;
                }
                i17 = i9 & 64;
                if (i17 != 0) {
                    i10 |= 1572864;
                } else if ((i8 & 3670016) == 0) {
                    if (interfaceC3163lP.c(z8)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i10 |= i18;
                }
                if ((i9 & 128) != 0) {
                    if ((i8 & 29360128) == 0) {
                        if (interfaceC3163lP.l(onClick)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                    }
                    if ((23967451 & i10) == 4793490) {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar111111111111117 = dVar3;
                                i20 = i10;
                                dVar5 = dVar111111111111117;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar111111111111118 = dVar3;
                                i20 = i10;
                                dVar5 = dVar111111111111118;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        } else {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar111111111111119 = dVar3;
                                i20 = i10;
                                dVar5 = dVar111111111111119;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar1111111111111110 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111111111111110;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                        }
                        L0.i iVarA115 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                        C3072m c3072mB115 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                        int i2111111 = i20 >> 12;
                        J jB115 = cVar3.b(interfaceC3163lP, i2111111 & 14);
                        L0.i iVar119 = iVar3;
                        H0.a aVarB115 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                        int i2111112 = ((i20 >> 21) & 14) | 805306368 | (i2111111 & 896) | ((i20 >> 6) & 7168);
                        J3.c cVar119 = cVar3;
                        T0 t1114 = t0E;
                        d dVar1111111111111111 = dVar6;
                        boolean z1115 = z9;
                        V0.d dVar1111111111111112 = dVar5;
                        AbstractC3078p.a(onClick, iVarA115, z1115, t1114, c3072mB115, null, null, jB115, null, aVarB115, interfaceC3163lP, i2111112, 352);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        dVar7 = dVar1111111111111112;
                        z10 = z1115;
                        t9 = t1114;
                        iVar4 = iVar119;
                        cVar4 = cVar119;
                        dVar8 = dVar1111111111111111;
                    } else {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar1111111111111113 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111111111111113;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar1111111111111114 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111111111111114;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        } else {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar1111111111111115 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111111111111115;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar1111111111111116 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111111111111116;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                        }
                        L0.i iVarA116 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                        C3072m c3072mB116 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                        int i2111113 = i20 >> 12;
                        J jB116 = cVar3.b(interfaceC3163lP, i2111113 & 14);
                        L0.i iVar1110 = iVar3;
                        H0.a aVarB116 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                        int i2111114 = ((i20 >> 21) & 14) | 805306368 | (i2111113 & 896) | ((i20 >> 6) & 7168);
                        J3.c cVar1110 = cVar3;
                        T0 t1115 = t0E;
                        d dVar1111111111111117 = dVar6;
                        boolean z1116 = z9;
                        V0.d dVar1111111111111118 = dVar5;
                        AbstractC3078p.a(onClick, iVarA116, z1116, t1115, c3072mB116, null, null, jB116, null, aVarB116, interfaceC3163lP, i2111114, 352);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        dVar7 = dVar1111111111111118;
                        z10 = z1116;
                        t9 = t1115;
                        iVar4 = iVar1110;
                        cVar4 = cVar1110;
                        dVar8 = dVar1111111111111117;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                    }
                }
                i19 = 12582912;
                i10 |= i19;
                if ((23967451 & i10) == 4793490) {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar1111111111111119 = dVar3;
                            i20 = i10;
                            dVar5 = dVar1111111111111119;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar11111111111111110 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111110;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    } else {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar11111111111111111 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111111;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar11111111111111112 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111112;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                    }
                    L0.i iVarA117 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                    C3072m c3072mB117 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                    int i2111115 = i20 >> 12;
                    J jB117 = cVar3.b(interfaceC3163lP, i2111115 & 14);
                    L0.i iVar1111 = iVar3;
                    H0.a aVarB117 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                    int i2111116 = ((i20 >> 21) & 14) | 805306368 | (i2111115 & 896) | ((i20 >> 6) & 7168);
                    J3.c cVar1111 = cVar3;
                    T0 t1116 = t0E;
                    d dVar11111111111111113 = dVar6;
                    boolean z1117 = z9;
                    V0.d dVar11111111111111114 = dVar5;
                    AbstractC3078p.a(onClick, iVarA117, z1117, t1116, c3072mB117, null, null, jB117, null, aVarB117, interfaceC3163lP, i2111116, 352);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    dVar7 = dVar11111111111111114;
                    z10 = z1117;
                    t9 = t1116;
                    iVar4 = iVar1111;
                    cVar4 = cVar1111;
                    dVar8 = dVar11111111111111113;
                } else {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar11111111111111115 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111115;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar11111111111111116 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111116;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    } else {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar11111111111111117 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111117;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar11111111111111118 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111118;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                    }
                    L0.i iVarA118 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                    C3072m c3072mB118 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                    int i2111117 = i20 >> 12;
                    J jB118 = cVar3.b(interfaceC3163lP, i2111117 & 14);
                    L0.i iVar1112 = iVar3;
                    H0.a aVarB118 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                    int i2111118 = ((i20 >> 21) & 14) | 805306368 | (i2111117 & 896) | ((i20 >> 6) & 7168);
                    J3.c cVar1112 = cVar3;
                    T0 t1117 = t0E;
                    d dVar11111111111111119 = dVar6;
                    boolean z1118 = z9;
                    V0.d dVar111111111111111110 = dVar5;
                    AbstractC3078p.a(onClick, iVarA118, z1118, t1117, c3072mB118, null, null, jB118, null, aVarB118, interfaceC3163lP, i2111118, 352);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    dVar7 = dVar111111111111111110;
                    z10 = z1118;
                    t9 = t1117;
                    iVar4 = iVar1112;
                    cVar4 = cVar1112;
                    dVar8 = dVar11111111111111119;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                }
            }
            i10 |= 24576;
            cVar2 = cVar;
            if ((458752 & i8) == 0) {
                if ((i9 & 32) == 0) {
                    t0E = t8;
                    if (interfaceC3163lP.R(t0E)) {
                    }
                    i10 |= i22;
                } else {
                    t0E = t8;
                }
                i10 |= i22;
            } else {
                t0E = t8;
            }
            i17 = i9 & 64;
            if (i17 != 0) {
                i10 |= 1572864;
            } else if ((i8 & 3670016) == 0) {
                if (interfaceC3163lP.c(z8)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i10 |= i18;
            }
            if ((i9 & 128) != 0) {
                if ((i8 & 29360128) == 0) {
                    if (interfaceC3163lP.l(onClick)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                }
                if ((23967451 & i10) == 4793490) {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar111111111111111111 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111111;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar111111111111111112 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111112;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    } else {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar111111111111111113 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111113;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar111111111111111114 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111114;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                    }
                    L0.i iVarA119 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                    C3072m c3072mB119 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                    int i2111119 = i20 >> 12;
                    J jB119 = cVar3.b(interfaceC3163lP, i2111119 & 14);
                    L0.i iVar1113 = iVar3;
                    H0.a aVarB119 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                    int i21111110 = ((i20 >> 21) & 14) | 805306368 | (i2111119 & 896) | ((i20 >> 6) & 7168);
                    J3.c cVar1113 = cVar3;
                    T0 t1118 = t0E;
                    d dVar111111111111111115 = dVar6;
                    boolean z1119 = z9;
                    V0.d dVar111111111111111116 = dVar5;
                    AbstractC3078p.a(onClick, iVarA119, z1119, t1118, c3072mB119, null, null, jB119, null, aVarB119, interfaceC3163lP, i21111110, 352);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    dVar7 = dVar111111111111111116;
                    z10 = z1119;
                    t9 = t1118;
                    iVar4 = iVar1113;
                    cVar4 = cVar1113;
                    dVar8 = dVar111111111111111115;
                } else {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar111111111111111117 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111117;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar111111111111111118 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111118;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    } else {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar111111111111111119 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111119;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar1111111111111111110 = dVar3;
                            i20 = i10;
                            dVar5 = dVar1111111111111111110;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                    }
                    L0.i iVarA1110 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                    C3072m c3072mB1110 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                    int i21111111 = i20 >> 12;
                    J jB1110 = cVar3.b(interfaceC3163lP, i21111111 & 14);
                    L0.i iVar1114 = iVar3;
                    H0.a aVarB1110 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                    int i21111112 = ((i20 >> 21) & 14) | 805306368 | (i21111111 & 896) | ((i20 >> 6) & 7168);
                    J3.c cVar1114 = cVar3;
                    T0 t1119 = t0E;
                    d dVar1111111111111111111 = dVar6;
                    boolean z11110 = z9;
                    V0.d dVar1111111111111111112 = dVar5;
                    AbstractC3078p.a(onClick, iVarA1110, z11110, t1119, c3072mB1110, null, null, jB1110, null, aVarB1110, interfaceC3163lP, i21111112, 352);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    dVar7 = dVar1111111111111111112;
                    z10 = z11110;
                    t9 = t1119;
                    iVar4 = iVar1114;
                    cVar4 = cVar1114;
                    dVar8 = dVar1111111111111111111;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                }
            }
            i19 = 12582912;
            i10 |= i19;
            if ((23967451 & i10) == 4793490) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i21 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i11 != 0) {
                        dVar3 = null;
                    }
                    if (i13 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i15 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i17 != 0) {
                        V0.d dVar1111111111111111113 = dVar3;
                        i20 = i10;
                        dVar5 = dVar1111111111111111113;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                        z9 = true;
                    } else {
                        V0.d dVar1111111111111111114 = dVar3;
                        i20 = i10;
                        dVar5 = dVar1111111111111111114;
                        z9 = z8;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                    }
                } else {
                    if (i21 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i11 != 0) {
                        dVar3 = null;
                    }
                    if (i13 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i15 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i17 != 0) {
                        V0.d dVar1111111111111111115 = dVar3;
                        i20 = i10;
                        dVar5 = dVar1111111111111111115;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                        z9 = true;
                    } else {
                        V0.d dVar1111111111111111116 = dVar3;
                        i20 = i10;
                        dVar5 = dVar1111111111111111116;
                        z9 = z8;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                }
                L0.i iVarA1111 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                C3072m c3072mB1111 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                int i21111113 = i20 >> 12;
                J jB1111 = cVar3.b(interfaceC3163lP, i21111113 & 14);
                L0.i iVar1115 = iVar3;
                H0.a aVarB1111 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                int i21111114 = ((i20 >> 21) & 14) | 805306368 | (i21111113 & 896) | ((i20 >> 6) & 7168);
                J3.c cVar1115 = cVar3;
                T0 t11110 = t0E;
                d dVar1111111111111111117 = dVar6;
                boolean z11111 = z9;
                V0.d dVar1111111111111111118 = dVar5;
                AbstractC3078p.a(onClick, iVarA1111, z11111, t11110, c3072mB1111, null, null, jB1111, null, aVarB1111, interfaceC3163lP, i21111114, 352);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                dVar7 = dVar1111111111111111118;
                z10 = z11111;
                t9 = t11110;
                iVar4 = iVar1115;
                cVar4 = cVar1115;
                dVar8 = dVar1111111111111111117;
            } else {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i21 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i11 != 0) {
                        dVar3 = null;
                    }
                    if (i13 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i15 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i17 != 0) {
                        V0.d dVar1111111111111111119 = dVar3;
                        i20 = i10;
                        dVar5 = dVar1111111111111111119;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                        z9 = true;
                    } else {
                        V0.d dVar11111111111111111110 = dVar3;
                        i20 = i10;
                        dVar5 = dVar11111111111111111110;
                        z9 = z8;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                    }
                } else {
                    if (i21 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i11 != 0) {
                        dVar3 = null;
                    }
                    if (i13 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i15 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i17 != 0) {
                        V0.d dVar11111111111111111111 = dVar3;
                        i20 = i10;
                        dVar5 = dVar11111111111111111111;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                        z9 = true;
                    } else {
                        V0.d dVar11111111111111111112 = dVar3;
                        i20 = i10;
                        dVar5 = dVar11111111111111111112;
                        z9 = z8;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                }
                L0.i iVarA1112 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                C3072m c3072mB1112 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                int i21111115 = i20 >> 12;
                J jB1112 = cVar3.b(interfaceC3163lP, i21111115 & 14);
                L0.i iVar1116 = iVar3;
                H0.a aVarB1112 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                int i21111116 = ((i20 >> 21) & 14) | 805306368 | (i21111115 & 896) | ((i20 >> 6) & 7168);
                J3.c cVar1116 = cVar3;
                T0 t11111 = t0E;
                d dVar11111111111111111113 = dVar6;
                boolean z11112 = z9;
                V0.d dVar11111111111111111114 = dVar5;
                AbstractC3078p.a(onClick, iVarA1112, z11112, t11111, c3072mB1112, null, null, jB1112, null, aVarB1112, interfaceC3163lP, i21111116, 352);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                dVar7 = dVar11111111111111111114;
                z10 = z11112;
                t9 = t11111;
                iVar4 = iVar1116;
                cVar4 = cVar1116;
                dVar8 = dVar11111111111111111113;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
            }
        }
        i10 |= 48;
        iVar2 = iVar;
        i11 = i9 & 4;
        if (i11 != 0) {
            if ((i8 & 896) == 0) {
                dVar3 = dVar;
                if (interfaceC3163lP.R(dVar3)) {
                    i12 = 256;
                } else {
                    i12 = 128;
                }
                i10 |= i12;
            }
            i13 = i9 & 8;
            if (i13 != 0) {
                if ((i8 & 7168) == 0) {
                    dVar4 = dVar2;
                    if (interfaceC3163lP.R(dVar4)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i10 |= i14;
                }
                i15 = i9 & 16;
                if (i15 != 0) {
                    if ((57344 & i8) == 0) {
                        cVar2 = cVar;
                        if (interfaceC3163lP.R(cVar2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i10 |= i16;
                    }
                    if ((458752 & i8) == 0) {
                        if ((i9 & 32) == 0) {
                            t0E = t8;
                            if (interfaceC3163lP.R(t0E)) {
                            }
                            i10 |= i22;
                        } else {
                            t0E = t8;
                        }
                        i10 |= i22;
                    } else {
                        t0E = t8;
                    }
                    i17 = i9 & 64;
                    if (i17 != 0) {
                        i10 |= 1572864;
                    } else if ((i8 & 3670016) == 0) {
                        if (interfaceC3163lP.c(z8)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i10 |= i18;
                    }
                    if ((i9 & 128) != 0) {
                        if ((i8 & 29360128) == 0) {
                            if (interfaceC3163lP.l(onClick)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                        }
                        if ((23967451 & i10) == 4793490) {
                            interfaceC3163lP.o();
                            if ((i8 & 1) != 0) {
                                if (i21 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i11 != 0) {
                                    dVar3 = null;
                                }
                                if (i13 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i15 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i9 & 32) != 0) {
                                    i10 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i17 != 0) {
                                    V0.d dVar11111111111111111115 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar11111111111111111115;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                    z9 = true;
                                } else {
                                    V0.d dVar11111111111111111116 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar11111111111111111116;
                                    z9 = z8;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                }
                            } else {
                                if (i21 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i11 != 0) {
                                    dVar3 = null;
                                }
                                if (i13 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i15 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i9 & 32) != 0) {
                                    i10 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i17 != 0) {
                                    V0.d dVar11111111111111111117 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar11111111111111111117;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                    z9 = true;
                                } else {
                                    V0.d dVar11111111111111111118 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar11111111111111111118;
                                    z9 = z8;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                }
                            }
                            interfaceC3163lP.Q();
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                            }
                            L0.i iVarA1113 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                            C3072m c3072mB1113 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                            int i21111117 = i20 >> 12;
                            J jB1113 = cVar3.b(interfaceC3163lP, i21111117 & 14);
                            L0.i iVar1117 = iVar3;
                            H0.a aVarB1113 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                            int i21111118 = ((i20 >> 21) & 14) | 805306368 | (i21111117 & 896) | ((i20 >> 6) & 7168);
                            J3.c cVar1117 = cVar3;
                            T0 t11112 = t0E;
                            d dVar11111111111111111119 = dVar6;
                            boolean z11113 = z9;
                            V0.d dVar111111111111111111110 = dVar5;
                            AbstractC3078p.a(onClick, iVarA1113, z11113, t11112, c3072mB1113, null, null, jB1113, null, aVarB1113, interfaceC3163lP, i21111118, 352);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            dVar7 = dVar111111111111111111110;
                            z10 = z11113;
                            t9 = t11112;
                            iVar4 = iVar1117;
                            cVar4 = cVar1117;
                            dVar8 = dVar11111111111111111119;
                        } else {
                            interfaceC3163lP.o();
                            if ((i8 & 1) != 0) {
                                if (i21 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i11 != 0) {
                                    dVar3 = null;
                                }
                                if (i13 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i15 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i9 & 32) != 0) {
                                    i10 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i17 != 0) {
                                    V0.d dVar111111111111111111111 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar111111111111111111111;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                    z9 = true;
                                } else {
                                    V0.d dVar111111111111111111112 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar111111111111111111112;
                                    z9 = z8;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                }
                            } else {
                                if (i21 != 0) {
                                    iVar2 = L0.i.f4836a;
                                }
                                if (i11 != 0) {
                                    dVar3 = null;
                                }
                                if (i13 != 0) {
                                    dVar4 = d.f4150c;
                                }
                                if (i15 != 0) {
                                    cVar2 = J3.c.M;
                                }
                                if ((i9 & 32) != 0) {
                                    i10 &= -458753;
                                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                                }
                                if (i17 != 0) {
                                    V0.d dVar111111111111111111113 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar111111111111111111113;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                    z9 = true;
                                } else {
                                    V0.d dVar111111111111111111114 = dVar3;
                                    i20 = i10;
                                    dVar5 = dVar111111111111111111114;
                                    z9 = z8;
                                    iVar3 = iVar2;
                                    dVar6 = dVar4;
                                    cVar3 = cVar2;
                                }
                            }
                            interfaceC3163lP.Q();
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                            }
                            L0.i iVarA1114 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                            C3072m c3072mB1114 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                            int i21111119 = i20 >> 12;
                            J jB1114 = cVar3.b(interfaceC3163lP, i21111119 & 14);
                            L0.i iVar1118 = iVar3;
                            H0.a aVarB1114 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                            int i211111110 = ((i20 >> 21) & 14) | 805306368 | (i21111119 & 896) | ((i20 >> 6) & 7168);
                            J3.c cVar1118 = cVar3;
                            T0 t11113 = t0E;
                            d dVar111111111111111111115 = dVar6;
                            boolean z11114 = z9;
                            V0.d dVar111111111111111111116 = dVar5;
                            AbstractC3078p.a(onClick, iVarA1114, z11114, t11113, c3072mB1114, null, null, jB1114, null, aVarB1114, interfaceC3163lP, i211111110, 352);
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            dVar7 = dVar111111111111111111116;
                            z10 = z11114;
                            t9 = t11113;
                            iVar4 = iVar1118;
                            cVar4 = cVar1118;
                            dVar8 = dVar111111111111111111115;
                        }
                        p0V = interfaceC3163lP.v();
                        if (p0V != null) {
                            p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                        }
                    }
                    i19 = 12582912;
                    i10 |= i19;
                    if ((23967451 & i10) == 4793490) {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar111111111111111111117 = dVar3;
                                i20 = i10;
                                dVar5 = dVar111111111111111111117;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar111111111111111111118 = dVar3;
                                i20 = i10;
                                dVar5 = dVar111111111111111111118;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        } else {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar111111111111111111119 = dVar3;
                                i20 = i10;
                                dVar5 = dVar111111111111111111119;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar1111111111111111111110 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111111111111111111110;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                        }
                        L0.i iVarA1115 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                        C3072m c3072mB1115 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                        int i211111111 = i20 >> 12;
                        J jB1115 = cVar3.b(interfaceC3163lP, i211111111 & 14);
                        L0.i iVar1119 = iVar3;
                        H0.a aVarB1115 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                        int i211111112 = ((i20 >> 21) & 14) | 805306368 | (i211111111 & 896) | ((i20 >> 6) & 7168);
                        J3.c cVar1119 = cVar3;
                        T0 t11114 = t0E;
                        d dVar1111111111111111111111 = dVar6;
                        boolean z11115 = z9;
                        V0.d dVar1111111111111111111112 = dVar5;
                        AbstractC3078p.a(onClick, iVarA1115, z11115, t11114, c3072mB1115, null, null, jB1115, null, aVarB1115, interfaceC3163lP, i211111112, 352);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        dVar7 = dVar1111111111111111111112;
                        z10 = z11115;
                        t9 = t11114;
                        iVar4 = iVar1119;
                        cVar4 = cVar1119;
                        dVar8 = dVar1111111111111111111111;
                    } else {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar1111111111111111111113 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111111111111111111113;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar1111111111111111111114 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111111111111111111114;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        } else {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar1111111111111111111115 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111111111111111111115;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar1111111111111111111116 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111111111111111111116;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                        }
                        L0.i iVarA1116 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                        C3072m c3072mB1116 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                        int i211111113 = i20 >> 12;
                        J jB1116 = cVar3.b(interfaceC3163lP, i211111113 & 14);
                        L0.i iVar11110 = iVar3;
                        H0.a aVarB1116 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                        int i211111114 = ((i20 >> 21) & 14) | 805306368 | (i211111113 & 896) | ((i20 >> 6) & 7168);
                        J3.c cVar11110 = cVar3;
                        T0 t11115 = t0E;
                        d dVar1111111111111111111117 = dVar6;
                        boolean z11116 = z9;
                        V0.d dVar1111111111111111111118 = dVar5;
                        AbstractC3078p.a(onClick, iVarA1116, z11116, t11115, c3072mB1116, null, null, jB1116, null, aVarB1116, interfaceC3163lP, i211111114, 352);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        dVar7 = dVar1111111111111111111118;
                        z10 = z11116;
                        t9 = t11115;
                        iVar4 = iVar11110;
                        cVar4 = cVar11110;
                        dVar8 = dVar1111111111111111111117;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                    }
                }
                i10 |= 24576;
                cVar2 = cVar;
                if ((458752 & i8) == 0) {
                    if ((i9 & 32) == 0) {
                        t0E = t8;
                        if (interfaceC3163lP.R(t0E)) {
                        }
                        i10 |= i22;
                    } else {
                        t0E = t8;
                    }
                    i10 |= i22;
                } else {
                    t0E = t8;
                }
                i17 = i9 & 64;
                if (i17 != 0) {
                    i10 |= 1572864;
                } else if ((i8 & 3670016) == 0) {
                    if (interfaceC3163lP.c(z8)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i10 |= i18;
                }
                if ((i9 & 128) != 0) {
                    if ((i8 & 29360128) == 0) {
                        if (interfaceC3163lP.l(onClick)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                    }
                    if ((23967451 & i10) == 4793490) {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar1111111111111111111119 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111111111111111111119;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar11111111111111111111110 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11111111111111111111110;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        } else {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar11111111111111111111111 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11111111111111111111111;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar11111111111111111111112 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11111111111111111111112;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                        }
                        L0.i iVarA1117 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                        C3072m c3072mB1117 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                        int i211111115 = i20 >> 12;
                        J jB1117 = cVar3.b(interfaceC3163lP, i211111115 & 14);
                        L0.i iVar11111 = iVar3;
                        H0.a aVarB1117 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                        int i211111116 = ((i20 >> 21) & 14) | 805306368 | (i211111115 & 896) | ((i20 >> 6) & 7168);
                        J3.c cVar11111 = cVar3;
                        T0 t11116 = t0E;
                        d dVar11111111111111111111113 = dVar6;
                        boolean z11117 = z9;
                        V0.d dVar11111111111111111111114 = dVar5;
                        AbstractC3078p.a(onClick, iVarA1117, z11117, t11116, c3072mB1117, null, null, jB1117, null, aVarB1117, interfaceC3163lP, i211111116, 352);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        dVar7 = dVar11111111111111111111114;
                        z10 = z11117;
                        t9 = t11116;
                        iVar4 = iVar11111;
                        cVar4 = cVar11111;
                        dVar8 = dVar11111111111111111111113;
                    } else {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar11111111111111111111115 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11111111111111111111115;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar11111111111111111111116 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11111111111111111111116;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        } else {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar11111111111111111111117 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11111111111111111111117;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar11111111111111111111118 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11111111111111111111118;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                        }
                        L0.i iVarA1118 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                        C3072m c3072mB1118 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                        int i211111117 = i20 >> 12;
                        J jB1118 = cVar3.b(interfaceC3163lP, i211111117 & 14);
                        L0.i iVar11112 = iVar3;
                        H0.a aVarB1118 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                        int i211111118 = ((i20 >> 21) & 14) | 805306368 | (i211111117 & 896) | ((i20 >> 6) & 7168);
                        J3.c cVar11112 = cVar3;
                        T0 t11117 = t0E;
                        d dVar11111111111111111111119 = dVar6;
                        boolean z11118 = z9;
                        V0.d dVar111111111111111111111110 = dVar5;
                        AbstractC3078p.a(onClick, iVarA1118, z11118, t11117, c3072mB1118, null, null, jB1118, null, aVarB1118, interfaceC3163lP, i211111118, 352);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        dVar7 = dVar111111111111111111111110;
                        z10 = z11118;
                        t9 = t11117;
                        iVar4 = iVar11112;
                        cVar4 = cVar11112;
                        dVar8 = dVar11111111111111111111119;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                    }
                }
                i19 = 12582912;
                i10 |= i19;
                if ((23967451 & i10) == 4793490) {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar111111111111111111111111 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111111111111;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar111111111111111111111112 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111111111112;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    } else {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar111111111111111111111113 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111111111113;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar111111111111111111111114 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111111111114;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                    }
                    L0.i iVarA1119 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                    C3072m c3072mB1119 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                    int i211111119 = i20 >> 12;
                    J jB1119 = cVar3.b(interfaceC3163lP, i211111119 & 14);
                    L0.i iVar11113 = iVar3;
                    H0.a aVarB1119 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                    int i2111111110 = ((i20 >> 21) & 14) | 805306368 | (i211111119 & 896) | ((i20 >> 6) & 7168);
                    J3.c cVar11113 = cVar3;
                    T0 t11118 = t0E;
                    d dVar111111111111111111111115 = dVar6;
                    boolean z11119 = z9;
                    V0.d dVar111111111111111111111116 = dVar5;
                    AbstractC3078p.a(onClick, iVarA1119, z11119, t11118, c3072mB1119, null, null, jB1119, null, aVarB1119, interfaceC3163lP, i2111111110, 352);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    dVar7 = dVar111111111111111111111116;
                    z10 = z11119;
                    t9 = t11118;
                    iVar4 = iVar11113;
                    cVar4 = cVar11113;
                    dVar8 = dVar111111111111111111111115;
                } else {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar111111111111111111111117 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111111111117;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar111111111111111111111118 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111111111118;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    } else {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar111111111111111111111119 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111111111119;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar1111111111111111111111110 = dVar3;
                            i20 = i10;
                            dVar5 = dVar1111111111111111111111110;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                    }
                    L0.i iVarA11110 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                    C3072m c3072mB11110 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                    int i2111111111 = i20 >> 12;
                    J jB11110 = cVar3.b(interfaceC3163lP, i2111111111 & 14);
                    L0.i iVar11114 = iVar3;
                    H0.a aVarB11110 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                    int i2111111112 = ((i20 >> 21) & 14) | 805306368 | (i2111111111 & 896) | ((i20 >> 6) & 7168);
                    J3.c cVar11114 = cVar3;
                    T0 t11119 = t0E;
                    d dVar1111111111111111111111111 = dVar6;
                    boolean z111110 = z9;
                    V0.d dVar1111111111111111111111112 = dVar5;
                    AbstractC3078p.a(onClick, iVarA11110, z111110, t11119, c3072mB11110, null, null, jB11110, null, aVarB11110, interfaceC3163lP, i2111111112, 352);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    dVar7 = dVar1111111111111111111111112;
                    z10 = z111110;
                    t9 = t11119;
                    iVar4 = iVar11114;
                    cVar4 = cVar11114;
                    dVar8 = dVar1111111111111111111111111;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                }
            }
            i10 |= 3072;
            dVar4 = dVar2;
            i15 = i9 & 16;
            if (i15 != 0) {
                if ((57344 & i8) == 0) {
                    cVar2 = cVar;
                    if (interfaceC3163lP.R(cVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i10 |= i16;
                }
                if ((458752 & i8) == 0) {
                    if ((i9 & 32) == 0) {
                        t0E = t8;
                        if (interfaceC3163lP.R(t0E)) {
                        }
                        i10 |= i22;
                    } else {
                        t0E = t8;
                    }
                    i10 |= i22;
                } else {
                    t0E = t8;
                }
                i17 = i9 & 64;
                if (i17 != 0) {
                    i10 |= 1572864;
                } else if ((i8 & 3670016) == 0) {
                    if (interfaceC3163lP.c(z8)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i10 |= i18;
                }
                if ((i9 & 128) != 0) {
                    if ((i8 & 29360128) == 0) {
                        if (interfaceC3163lP.l(onClick)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                    }
                    if ((23967451 & i10) == 4793490) {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar1111111111111111111111113 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111111111111111111111113;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar1111111111111111111111114 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111111111111111111111114;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        } else {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar1111111111111111111111115 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111111111111111111111115;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar1111111111111111111111116 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111111111111111111111116;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                        }
                        L0.i iVarA11111 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                        C3072m c3072mB11111 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                        int i2111111113 = i20 >> 12;
                        J jB11111 = cVar3.b(interfaceC3163lP, i2111111113 & 14);
                        L0.i iVar11115 = iVar3;
                        H0.a aVarB11111 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                        int i2111111114 = ((i20 >> 21) & 14) | 805306368 | (i2111111113 & 896) | ((i20 >> 6) & 7168);
                        J3.c cVar11115 = cVar3;
                        T0 t111110 = t0E;
                        d dVar1111111111111111111111117 = dVar6;
                        boolean z111111 = z9;
                        V0.d dVar1111111111111111111111118 = dVar5;
                        AbstractC3078p.a(onClick, iVarA11111, z111111, t111110, c3072mB11111, null, null, jB11111, null, aVarB11111, interfaceC3163lP, i2111111114, 352);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        dVar7 = dVar1111111111111111111111118;
                        z10 = z111111;
                        t9 = t111110;
                        iVar4 = iVar11115;
                        cVar4 = cVar11115;
                        dVar8 = dVar1111111111111111111111117;
                    } else {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar1111111111111111111111119 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111111111111111111111119;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar11111111111111111111111110 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11111111111111111111111110;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        } else {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar11111111111111111111111111 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11111111111111111111111111;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar11111111111111111111111112 = dVar3;
                                i20 = i10;
                                dVar5 = dVar11111111111111111111111112;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                        }
                        L0.i iVarA11112 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                        C3072m c3072mB11112 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                        int i2111111115 = i20 >> 12;
                        J jB11112 = cVar3.b(interfaceC3163lP, i2111111115 & 14);
                        L0.i iVar11116 = iVar3;
                        H0.a aVarB11112 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                        int i2111111116 = ((i20 >> 21) & 14) | 805306368 | (i2111111115 & 896) | ((i20 >> 6) & 7168);
                        J3.c cVar11116 = cVar3;
                        T0 t111111 = t0E;
                        d dVar11111111111111111111111113 = dVar6;
                        boolean z111112 = z9;
                        V0.d dVar11111111111111111111111114 = dVar5;
                        AbstractC3078p.a(onClick, iVarA11112, z111112, t111111, c3072mB11112, null, null, jB11112, null, aVarB11112, interfaceC3163lP, i2111111116, 352);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        dVar7 = dVar11111111111111111111111114;
                        z10 = z111112;
                        t9 = t111111;
                        iVar4 = iVar11116;
                        cVar4 = cVar11116;
                        dVar8 = dVar11111111111111111111111113;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                    }
                }
                i19 = 12582912;
                i10 |= i19;
                if ((23967451 & i10) == 4793490) {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar11111111111111111111111115 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111111111111115;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar11111111111111111111111116 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111111111111116;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    } else {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar11111111111111111111111117 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111111111111117;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar11111111111111111111111118 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111111111111118;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                    }
                    L0.i iVarA11113 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                    C3072m c3072mB11113 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                    int i2111111117 = i20 >> 12;
                    J jB11113 = cVar3.b(interfaceC3163lP, i2111111117 & 14);
                    L0.i iVar11117 = iVar3;
                    H0.a aVarB11113 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                    int i2111111118 = ((i20 >> 21) & 14) | 805306368 | (i2111111117 & 896) | ((i20 >> 6) & 7168);
                    J3.c cVar11117 = cVar3;
                    T0 t111112 = t0E;
                    d dVar11111111111111111111111119 = dVar6;
                    boolean z111113 = z9;
                    V0.d dVar111111111111111111111111110 = dVar5;
                    AbstractC3078p.a(onClick, iVarA11113, z111113, t111112, c3072mB11113, null, null, jB11113, null, aVarB11113, interfaceC3163lP, i2111111118, 352);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    dVar7 = dVar111111111111111111111111110;
                    z10 = z111113;
                    t9 = t111112;
                    iVar4 = iVar11117;
                    cVar4 = cVar11117;
                    dVar8 = dVar11111111111111111111111119;
                } else {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar111111111111111111111111111 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111111111111111;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar111111111111111111111111112 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111111111111112;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    } else {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar111111111111111111111111113 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111111111111113;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar111111111111111111111111114 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111111111111114;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                    }
                    L0.i iVarA11114 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                    C3072m c3072mB11114 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                    int i2111111119 = i20 >> 12;
                    J jB11114 = cVar3.b(interfaceC3163lP, i2111111119 & 14);
                    L0.i iVar11118 = iVar3;
                    H0.a aVarB11114 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                    int i21111111110 = ((i20 >> 21) & 14) | 805306368 | (i2111111119 & 896) | ((i20 >> 6) & 7168);
                    J3.c cVar11118 = cVar3;
                    T0 t111113 = t0E;
                    d dVar111111111111111111111111115 = dVar6;
                    boolean z111114 = z9;
                    V0.d dVar111111111111111111111111116 = dVar5;
                    AbstractC3078p.a(onClick, iVarA11114, z111114, t111113, c3072mB11114, null, null, jB11114, null, aVarB11114, interfaceC3163lP, i21111111110, 352);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    dVar7 = dVar111111111111111111111111116;
                    z10 = z111114;
                    t9 = t111113;
                    iVar4 = iVar11118;
                    cVar4 = cVar11118;
                    dVar8 = dVar111111111111111111111111115;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                }
            }
            i10 |= 24576;
            cVar2 = cVar;
            if ((458752 & i8) == 0) {
                if ((i9 & 32) == 0) {
                    t0E = t8;
                    if (interfaceC3163lP.R(t0E)) {
                    }
                    i10 |= i22;
                } else {
                    t0E = t8;
                }
                i10 |= i22;
            } else {
                t0E = t8;
            }
            i17 = i9 & 64;
            if (i17 != 0) {
                i10 |= 1572864;
            } else if ((i8 & 3670016) == 0) {
                if (interfaceC3163lP.c(z8)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i10 |= i18;
            }
            if ((i9 & 128) != 0) {
                if ((i8 & 29360128) == 0) {
                    if (interfaceC3163lP.l(onClick)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                }
                if ((23967451 & i10) == 4793490) {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar111111111111111111111111117 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111111111111117;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar111111111111111111111111118 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111111111111118;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    } else {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar111111111111111111111111119 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111111111111119;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar1111111111111111111111111110 = dVar3;
                            i20 = i10;
                            dVar5 = dVar1111111111111111111111111110;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                    }
                    L0.i iVarA11115 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                    C3072m c3072mB11115 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                    int i21111111111 = i20 >> 12;
                    J jB11115 = cVar3.b(interfaceC3163lP, i21111111111 & 14);
                    L0.i iVar11119 = iVar3;
                    H0.a aVarB11115 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                    int i21111111112 = ((i20 >> 21) & 14) | 805306368 | (i21111111111 & 896) | ((i20 >> 6) & 7168);
                    J3.c cVar11119 = cVar3;
                    T0 t111114 = t0E;
                    d dVar1111111111111111111111111111 = dVar6;
                    boolean z111115 = z9;
                    V0.d dVar1111111111111111111111111112 = dVar5;
                    AbstractC3078p.a(onClick, iVarA11115, z111115, t111114, c3072mB11115, null, null, jB11115, null, aVarB11115, interfaceC3163lP, i21111111112, 352);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    dVar7 = dVar1111111111111111111111111112;
                    z10 = z111115;
                    t9 = t111114;
                    iVar4 = iVar11119;
                    cVar4 = cVar11119;
                    dVar8 = dVar1111111111111111111111111111;
                } else {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar1111111111111111111111111113 = dVar3;
                            i20 = i10;
                            dVar5 = dVar1111111111111111111111111113;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar1111111111111111111111111114 = dVar3;
                            i20 = i10;
                            dVar5 = dVar1111111111111111111111111114;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    } else {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar1111111111111111111111111115 = dVar3;
                            i20 = i10;
                            dVar5 = dVar1111111111111111111111111115;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar1111111111111111111111111116 = dVar3;
                            i20 = i10;
                            dVar5 = dVar1111111111111111111111111116;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                    }
                    L0.i iVarA11116 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                    C3072m c3072mB11116 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                    int i21111111113 = i20 >> 12;
                    J jB11116 = cVar3.b(interfaceC3163lP, i21111111113 & 14);
                    L0.i iVar111110 = iVar3;
                    H0.a aVarB11116 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                    int i21111111114 = ((i20 >> 21) & 14) | 805306368 | (i21111111113 & 896) | ((i20 >> 6) & 7168);
                    J3.c cVar111110 = cVar3;
                    T0 t111115 = t0E;
                    d dVar1111111111111111111111111117 = dVar6;
                    boolean z111116 = z9;
                    V0.d dVar1111111111111111111111111118 = dVar5;
                    AbstractC3078p.a(onClick, iVarA11116, z111116, t111115, c3072mB11116, null, null, jB11116, null, aVarB11116, interfaceC3163lP, i21111111114, 352);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    dVar7 = dVar1111111111111111111111111118;
                    z10 = z111116;
                    t9 = t111115;
                    iVar4 = iVar111110;
                    cVar4 = cVar111110;
                    dVar8 = dVar1111111111111111111111111117;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                }
            }
            i19 = 12582912;
            i10 |= i19;
            if ((23967451 & i10) == 4793490) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i21 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i11 != 0) {
                        dVar3 = null;
                    }
                    if (i13 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i15 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i17 != 0) {
                        V0.d dVar1111111111111111111111111119 = dVar3;
                        i20 = i10;
                        dVar5 = dVar1111111111111111111111111119;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                        z9 = true;
                    } else {
                        V0.d dVar11111111111111111111111111110 = dVar3;
                        i20 = i10;
                        dVar5 = dVar11111111111111111111111111110;
                        z9 = z8;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                    }
                } else {
                    if (i21 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i11 != 0) {
                        dVar3 = null;
                    }
                    if (i13 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i15 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i17 != 0) {
                        V0.d dVar11111111111111111111111111111 = dVar3;
                        i20 = i10;
                        dVar5 = dVar11111111111111111111111111111;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                        z9 = true;
                    } else {
                        V0.d dVar11111111111111111111111111112 = dVar3;
                        i20 = i10;
                        dVar5 = dVar11111111111111111111111111112;
                        z9 = z8;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                }
                L0.i iVarA11117 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                C3072m c3072mB11117 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                int i21111111115 = i20 >> 12;
                J jB11117 = cVar3.b(interfaceC3163lP, i21111111115 & 14);
                L0.i iVar111111 = iVar3;
                H0.a aVarB11117 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                int i21111111116 = ((i20 >> 21) & 14) | 805306368 | (i21111111115 & 896) | ((i20 >> 6) & 7168);
                J3.c cVar111111 = cVar3;
                T0 t111116 = t0E;
                d dVar11111111111111111111111111113 = dVar6;
                boolean z111117 = z9;
                V0.d dVar11111111111111111111111111114 = dVar5;
                AbstractC3078p.a(onClick, iVarA11117, z111117, t111116, c3072mB11117, null, null, jB11117, null, aVarB11117, interfaceC3163lP, i21111111116, 352);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                dVar7 = dVar11111111111111111111111111114;
                z10 = z111117;
                t9 = t111116;
                iVar4 = iVar111111;
                cVar4 = cVar111111;
                dVar8 = dVar11111111111111111111111111113;
            } else {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i21 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i11 != 0) {
                        dVar3 = null;
                    }
                    if (i13 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i15 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i17 != 0) {
                        V0.d dVar11111111111111111111111111115 = dVar3;
                        i20 = i10;
                        dVar5 = dVar11111111111111111111111111115;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                        z9 = true;
                    } else {
                        V0.d dVar11111111111111111111111111116 = dVar3;
                        i20 = i10;
                        dVar5 = dVar11111111111111111111111111116;
                        z9 = z8;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                    }
                } else {
                    if (i21 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i11 != 0) {
                        dVar3 = null;
                    }
                    if (i13 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i15 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i17 != 0) {
                        V0.d dVar11111111111111111111111111117 = dVar3;
                        i20 = i10;
                        dVar5 = dVar11111111111111111111111111117;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                        z9 = true;
                    } else {
                        V0.d dVar11111111111111111111111111118 = dVar3;
                        i20 = i10;
                        dVar5 = dVar11111111111111111111111111118;
                        z9 = z8;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                }
                L0.i iVarA11118 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                C3072m c3072mB11118 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                int i21111111117 = i20 >> 12;
                J jB11118 = cVar3.b(interfaceC3163lP, i21111111117 & 14);
                L0.i iVar111112 = iVar3;
                H0.a aVarB11118 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                int i21111111118 = ((i20 >> 21) & 14) | 805306368 | (i21111111117 & 896) | ((i20 >> 6) & 7168);
                J3.c cVar111112 = cVar3;
                T0 t111117 = t0E;
                d dVar11111111111111111111111111119 = dVar6;
                boolean z111118 = z9;
                V0.d dVar111111111111111111111111111110 = dVar5;
                AbstractC3078p.a(onClick, iVarA11118, z111118, t111117, c3072mB11118, null, null, jB11118, null, aVarB11118, interfaceC3163lP, i21111111118, 352);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                dVar7 = dVar111111111111111111111111111110;
                z10 = z111118;
                t9 = t111117;
                iVar4 = iVar111112;
                cVar4 = cVar111112;
                dVar8 = dVar11111111111111111111111111119;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
            }
        }
        i10 |= 384;
        dVar3 = dVar;
        i13 = i9 & 8;
        if (i13 != 0) {
            if ((i8 & 7168) == 0) {
                dVar4 = dVar2;
                if (interfaceC3163lP.R(dVar4)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i10 |= i14;
            }
            i15 = i9 & 16;
            if (i15 != 0) {
                if ((57344 & i8) == 0) {
                    cVar2 = cVar;
                    if (interfaceC3163lP.R(cVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i10 |= i16;
                }
                if ((458752 & i8) == 0) {
                    if ((i9 & 32) == 0) {
                        t0E = t8;
                        if (interfaceC3163lP.R(t0E)) {
                        }
                        i10 |= i22;
                    } else {
                        t0E = t8;
                    }
                    i10 |= i22;
                } else {
                    t0E = t8;
                }
                i17 = i9 & 64;
                if (i17 != 0) {
                    i10 |= 1572864;
                } else if ((i8 & 3670016) == 0) {
                    if (interfaceC3163lP.c(z8)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i10 |= i18;
                }
                if ((i9 & 128) != 0) {
                    if ((i8 & 29360128) == 0) {
                        if (interfaceC3163lP.l(onClick)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                    }
                    if ((23967451 & i10) == 4793490) {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar111111111111111111111111111111 = dVar3;
                                i20 = i10;
                                dVar5 = dVar111111111111111111111111111111;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar111111111111111111111111111112 = dVar3;
                                i20 = i10;
                                dVar5 = dVar111111111111111111111111111112;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        } else {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar111111111111111111111111111113 = dVar3;
                                i20 = i10;
                                dVar5 = dVar111111111111111111111111111113;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar111111111111111111111111111114 = dVar3;
                                i20 = i10;
                                dVar5 = dVar111111111111111111111111111114;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                        }
                        L0.i iVarA11119 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                        C3072m c3072mB11119 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                        int i21111111119 = i20 >> 12;
                        J jB11119 = cVar3.b(interfaceC3163lP, i21111111119 & 14);
                        L0.i iVar111113 = iVar3;
                        H0.a aVarB11119 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                        int i211111111110 = ((i20 >> 21) & 14) | 805306368 | (i21111111119 & 896) | ((i20 >> 6) & 7168);
                        J3.c cVar111113 = cVar3;
                        T0 t111118 = t0E;
                        d dVar111111111111111111111111111115 = dVar6;
                        boolean z111119 = z9;
                        V0.d dVar111111111111111111111111111116 = dVar5;
                        AbstractC3078p.a(onClick, iVarA11119, z111119, t111118, c3072mB11119, null, null, jB11119, null, aVarB11119, interfaceC3163lP, i211111111110, 352);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        dVar7 = dVar111111111111111111111111111116;
                        z10 = z111119;
                        t9 = t111118;
                        iVar4 = iVar111113;
                        cVar4 = cVar111113;
                        dVar8 = dVar111111111111111111111111111115;
                    } else {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0) {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar111111111111111111111111111117 = dVar3;
                                i20 = i10;
                                dVar5 = dVar111111111111111111111111111117;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar111111111111111111111111111118 = dVar3;
                                i20 = i10;
                                dVar5 = dVar111111111111111111111111111118;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        } else {
                            if (i21 != 0) {
                                iVar2 = L0.i.f4836a;
                            }
                            if (i11 != 0) {
                                dVar3 = null;
                            }
                            if (i13 != 0) {
                                dVar4 = d.f4150c;
                            }
                            if (i15 != 0) {
                                cVar2 = J3.c.M;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                                t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                            }
                            if (i17 != 0) {
                                V0.d dVar111111111111111111111111111119 = dVar3;
                                i20 = i10;
                                dVar5 = dVar111111111111111111111111111119;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                                z9 = true;
                            } else {
                                V0.d dVar1111111111111111111111111111110 = dVar3;
                                i20 = i10;
                                dVar5 = dVar1111111111111111111111111111110;
                                z9 = z8;
                                iVar3 = iVar2;
                                dVar6 = dVar4;
                                cVar3 = cVar2;
                            }
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                        }
                        L0.i iVarA111110 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                        C3072m c3072mB111110 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                        int i211111111111 = i20 >> 12;
                        J jB111110 = cVar3.b(interfaceC3163lP, i211111111111 & 14);
                        L0.i iVar111114 = iVar3;
                        H0.a aVarB111110 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                        int i211111111112 = ((i20 >> 21) & 14) | 805306368 | (i211111111111 & 896) | ((i20 >> 6) & 7168);
                        J3.c cVar111114 = cVar3;
                        T0 t111119 = t0E;
                        d dVar1111111111111111111111111111111 = dVar6;
                        boolean z1111110 = z9;
                        V0.d dVar1111111111111111111111111111112 = dVar5;
                        AbstractC3078p.a(onClick, iVarA111110, z1111110, t111119, c3072mB111110, null, null, jB111110, null, aVarB111110, interfaceC3163lP, i211111111112, 352);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        dVar7 = dVar1111111111111111111111111111112;
                        z10 = z1111110;
                        t9 = t111119;
                        iVar4 = iVar111114;
                        cVar4 = cVar111114;
                        dVar8 = dVar1111111111111111111111111111111;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                    }
                }
                i19 = 12582912;
                i10 |= i19;
                if ((23967451 & i10) == 4793490) {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar1111111111111111111111111111113 = dVar3;
                            i20 = i10;
                            dVar5 = dVar1111111111111111111111111111113;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar1111111111111111111111111111114 = dVar3;
                            i20 = i10;
                            dVar5 = dVar1111111111111111111111111111114;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    } else {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar1111111111111111111111111111115 = dVar3;
                            i20 = i10;
                            dVar5 = dVar1111111111111111111111111111115;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar1111111111111111111111111111116 = dVar3;
                            i20 = i10;
                            dVar5 = dVar1111111111111111111111111111116;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                    }
                    L0.i iVarA111111 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                    C3072m c3072mB111111 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                    int i211111111113 = i20 >> 12;
                    J jB111111 = cVar3.b(interfaceC3163lP, i211111111113 & 14);
                    L0.i iVar111115 = iVar3;
                    H0.a aVarB111111 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                    int i211111111114 = ((i20 >> 21) & 14) | 805306368 | (i211111111113 & 896) | ((i20 >> 6) & 7168);
                    J3.c cVar111115 = cVar3;
                    T0 t1111110 = t0E;
                    d dVar1111111111111111111111111111117 = dVar6;
                    boolean z1111111 = z9;
                    V0.d dVar1111111111111111111111111111118 = dVar5;
                    AbstractC3078p.a(onClick, iVarA111111, z1111111, t1111110, c3072mB111111, null, null, jB111111, null, aVarB111111, interfaceC3163lP, i211111111114, 352);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    dVar7 = dVar1111111111111111111111111111118;
                    z10 = z1111111;
                    t9 = t1111110;
                    iVar4 = iVar111115;
                    cVar4 = cVar111115;
                    dVar8 = dVar1111111111111111111111111111117;
                } else {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar1111111111111111111111111111119 = dVar3;
                            i20 = i10;
                            dVar5 = dVar1111111111111111111111111111119;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar11111111111111111111111111111110 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111111111111111111110;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    } else {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar11111111111111111111111111111111 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111111111111111111111;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar11111111111111111111111111111112 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111111111111111111112;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                    }
                    L0.i iVarA111112 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                    C3072m c3072mB111112 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                    int i211111111115 = i20 >> 12;
                    J jB111112 = cVar3.b(interfaceC3163lP, i211111111115 & 14);
                    L0.i iVar111116 = iVar3;
                    H0.a aVarB111112 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                    int i211111111116 = ((i20 >> 21) & 14) | 805306368 | (i211111111115 & 896) | ((i20 >> 6) & 7168);
                    J3.c cVar111116 = cVar3;
                    T0 t1111111 = t0E;
                    d dVar11111111111111111111111111111113 = dVar6;
                    boolean z1111112 = z9;
                    V0.d dVar11111111111111111111111111111114 = dVar5;
                    AbstractC3078p.a(onClick, iVarA111112, z1111112, t1111111, c3072mB111112, null, null, jB111112, null, aVarB111112, interfaceC3163lP, i211111111116, 352);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    dVar7 = dVar11111111111111111111111111111114;
                    z10 = z1111112;
                    t9 = t1111111;
                    iVar4 = iVar111116;
                    cVar4 = cVar111116;
                    dVar8 = dVar11111111111111111111111111111113;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                }
            }
            i10 |= 24576;
            cVar2 = cVar;
            if ((458752 & i8) == 0) {
                if ((i9 & 32) == 0) {
                    t0E = t8;
                    if (interfaceC3163lP.R(t0E)) {
                    }
                    i10 |= i22;
                } else {
                    t0E = t8;
                }
                i10 |= i22;
            } else {
                t0E = t8;
            }
            i17 = i9 & 64;
            if (i17 != 0) {
                i10 |= 1572864;
            } else if ((i8 & 3670016) == 0) {
                if (interfaceC3163lP.c(z8)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i10 |= i18;
            }
            if ((i9 & 128) != 0) {
                if ((i8 & 29360128) == 0) {
                    if (interfaceC3163lP.l(onClick)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                }
                if ((23967451 & i10) == 4793490) {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar11111111111111111111111111111115 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111111111111111111115;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar11111111111111111111111111111116 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111111111111111111116;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    } else {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar11111111111111111111111111111117 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111111111111111111117;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar11111111111111111111111111111118 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111111111111111111118;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                    }
                    L0.i iVarA111113 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                    C3072m c3072mB111113 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                    int i211111111117 = i20 >> 12;
                    J jB111113 = cVar3.b(interfaceC3163lP, i211111111117 & 14);
                    L0.i iVar111117 = iVar3;
                    H0.a aVarB111113 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                    int i211111111118 = ((i20 >> 21) & 14) | 805306368 | (i211111111117 & 896) | ((i20 >> 6) & 7168);
                    J3.c cVar111117 = cVar3;
                    T0 t1111112 = t0E;
                    d dVar11111111111111111111111111111119 = dVar6;
                    boolean z1111113 = z9;
                    V0.d dVar111111111111111111111111111111110 = dVar5;
                    AbstractC3078p.a(onClick, iVarA111113, z1111113, t1111112, c3072mB111113, null, null, jB111113, null, aVarB111113, interfaceC3163lP, i211111111118, 352);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    dVar7 = dVar111111111111111111111111111111110;
                    z10 = z1111113;
                    t9 = t1111112;
                    iVar4 = iVar111117;
                    cVar4 = cVar111117;
                    dVar8 = dVar11111111111111111111111111111119;
                } else {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar111111111111111111111111111111111 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111111111111111111111;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar111111111111111111111111111111112 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111111111111111111112;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    } else {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar111111111111111111111111111111113 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111111111111111111113;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar111111111111111111111111111111114 = dVar3;
                            i20 = i10;
                            dVar5 = dVar111111111111111111111111111111114;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                    }
                    L0.i iVarA111114 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                    C3072m c3072mB111114 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                    int i211111111119 = i20 >> 12;
                    J jB111114 = cVar3.b(interfaceC3163lP, i211111111119 & 14);
                    L0.i iVar111118 = iVar3;
                    H0.a aVarB111114 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                    int i2111111111110 = ((i20 >> 21) & 14) | 805306368 | (i211111111119 & 896) | ((i20 >> 6) & 7168);
                    J3.c cVar111118 = cVar3;
                    T0 t1111113 = t0E;
                    d dVar111111111111111111111111111111115 = dVar6;
                    boolean z1111114 = z9;
                    V0.d dVar111111111111111111111111111111116 = dVar5;
                    AbstractC3078p.a(onClick, iVarA111114, z1111114, t1111113, c3072mB111114, null, null, jB111114, null, aVarB111114, interfaceC3163lP, i2111111111110, 352);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    dVar7 = dVar111111111111111111111111111111116;
                    z10 = z1111114;
                    t9 = t1111113;
                    iVar4 = iVar111118;
                    cVar4 = cVar111118;
                    dVar8 = dVar111111111111111111111111111111115;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                }
            }
            i19 = 12582912;
            i10 |= i19;
            if ((23967451 & i10) == 4793490) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i21 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i11 != 0) {
                        dVar3 = null;
                    }
                    if (i13 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i15 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i17 != 0) {
                        V0.d dVar111111111111111111111111111111117 = dVar3;
                        i20 = i10;
                        dVar5 = dVar111111111111111111111111111111117;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                        z9 = true;
                    } else {
                        V0.d dVar111111111111111111111111111111118 = dVar3;
                        i20 = i10;
                        dVar5 = dVar111111111111111111111111111111118;
                        z9 = z8;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                    }
                } else {
                    if (i21 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i11 != 0) {
                        dVar3 = null;
                    }
                    if (i13 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i15 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i17 != 0) {
                        V0.d dVar111111111111111111111111111111119 = dVar3;
                        i20 = i10;
                        dVar5 = dVar111111111111111111111111111111119;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                        z9 = true;
                    } else {
                        V0.d dVar1111111111111111111111111111111110 = dVar3;
                        i20 = i10;
                        dVar5 = dVar1111111111111111111111111111111110;
                        z9 = z8;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                }
                L0.i iVarA111115 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                C3072m c3072mB111115 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                int i2111111111111 = i20 >> 12;
                J jB111115 = cVar3.b(interfaceC3163lP, i2111111111111 & 14);
                L0.i iVar111119 = iVar3;
                H0.a aVarB111115 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                int i2111111111112 = ((i20 >> 21) & 14) | 805306368 | (i2111111111111 & 896) | ((i20 >> 6) & 7168);
                J3.c cVar111119 = cVar3;
                T0 t1111114 = t0E;
                d dVar1111111111111111111111111111111111 = dVar6;
                boolean z1111115 = z9;
                V0.d dVar1111111111111111111111111111111112 = dVar5;
                AbstractC3078p.a(onClick, iVarA111115, z1111115, t1111114, c3072mB111115, null, null, jB111115, null, aVarB111115, interfaceC3163lP, i2111111111112, 352);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                dVar7 = dVar1111111111111111111111111111111112;
                z10 = z1111115;
                t9 = t1111114;
                iVar4 = iVar111119;
                cVar4 = cVar111119;
                dVar8 = dVar1111111111111111111111111111111111;
            } else {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i21 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i11 != 0) {
                        dVar3 = null;
                    }
                    if (i13 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i15 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i17 != 0) {
                        V0.d dVar1111111111111111111111111111111113 = dVar3;
                        i20 = i10;
                        dVar5 = dVar1111111111111111111111111111111113;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                        z9 = true;
                    } else {
                        V0.d dVar1111111111111111111111111111111114 = dVar3;
                        i20 = i10;
                        dVar5 = dVar1111111111111111111111111111111114;
                        z9 = z8;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                    }
                } else {
                    if (i21 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i11 != 0) {
                        dVar3 = null;
                    }
                    if (i13 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i15 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i17 != 0) {
                        V0.d dVar1111111111111111111111111111111115 = dVar3;
                        i20 = i10;
                        dVar5 = dVar1111111111111111111111111111111115;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                        z9 = true;
                    } else {
                        V0.d dVar1111111111111111111111111111111116 = dVar3;
                        i20 = i10;
                        dVar5 = dVar1111111111111111111111111111111116;
                        z9 = z8;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                }
                L0.i iVarA111116 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                C3072m c3072mB111116 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                int i2111111111113 = i20 >> 12;
                J jB111116 = cVar3.b(interfaceC3163lP, i2111111111113 & 14);
                L0.i iVar1111110 = iVar3;
                H0.a aVarB111116 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                int i2111111111114 = ((i20 >> 21) & 14) | 805306368 | (i2111111111113 & 896) | ((i20 >> 6) & 7168);
                J3.c cVar1111110 = cVar3;
                T0 t1111115 = t0E;
                d dVar1111111111111111111111111111111117 = dVar6;
                boolean z1111116 = z9;
                V0.d dVar1111111111111111111111111111111118 = dVar5;
                AbstractC3078p.a(onClick, iVarA111116, z1111116, t1111115, c3072mB111116, null, null, jB111116, null, aVarB111116, interfaceC3163lP, i2111111111114, 352);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                dVar7 = dVar1111111111111111111111111111111118;
                z10 = z1111116;
                t9 = t1111115;
                iVar4 = iVar1111110;
                cVar4 = cVar1111110;
                dVar8 = dVar1111111111111111111111111111111117;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
            }
        }
        i10 |= 3072;
        dVar4 = dVar2;
        i15 = i9 & 16;
        if (i15 != 0) {
            if ((57344 & i8) == 0) {
                cVar2 = cVar;
                if (interfaceC3163lP.R(cVar2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i10 |= i16;
            }
            if ((458752 & i8) == 0) {
                if ((i9 & 32) == 0) {
                    t0E = t8;
                    if (interfaceC3163lP.R(t0E)) {
                    }
                    i10 |= i22;
                } else {
                    t0E = t8;
                }
                i10 |= i22;
            } else {
                t0E = t8;
            }
            i17 = i9 & 64;
            if (i17 != 0) {
                i10 |= 1572864;
            } else if ((i8 & 3670016) == 0) {
                if (interfaceC3163lP.c(z8)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i10 |= i18;
            }
            if ((i9 & 128) != 0) {
                if ((i8 & 29360128) == 0) {
                    if (interfaceC3163lP.l(onClick)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                }
                if ((23967451 & i10) == 4793490) {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar1111111111111111111111111111111119 = dVar3;
                            i20 = i10;
                            dVar5 = dVar1111111111111111111111111111111119;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar11111111111111111111111111111111110 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111111111111111111111110;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    } else {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar11111111111111111111111111111111111 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111111111111111111111111;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar11111111111111111111111111111111112 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111111111111111111111112;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                    }
                    L0.i iVarA111117 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                    C3072m c3072mB111117 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                    int i2111111111115 = i20 >> 12;
                    J jB111117 = cVar3.b(interfaceC3163lP, i2111111111115 & 14);
                    L0.i iVar1111111 = iVar3;
                    H0.a aVarB111117 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                    int i2111111111116 = ((i20 >> 21) & 14) | 805306368 | (i2111111111115 & 896) | ((i20 >> 6) & 7168);
                    J3.c cVar1111111 = cVar3;
                    T0 t1111116 = t0E;
                    d dVar11111111111111111111111111111111113 = dVar6;
                    boolean z1111117 = z9;
                    V0.d dVar11111111111111111111111111111111114 = dVar5;
                    AbstractC3078p.a(onClick, iVarA111117, z1111117, t1111116, c3072mB111117, null, null, jB111117, null, aVarB111117, interfaceC3163lP, i2111111111116, 352);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    dVar7 = dVar11111111111111111111111111111111114;
                    z10 = z1111117;
                    t9 = t1111116;
                    iVar4 = iVar1111111;
                    cVar4 = cVar1111111;
                    dVar8 = dVar11111111111111111111111111111111113;
                } else {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar11111111111111111111111111111111115 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111111111111111111111115;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar11111111111111111111111111111111116 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111111111111111111111116;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    } else {
                        if (i21 != 0) {
                            iVar2 = L0.i.f4836a;
                        }
                        if (i11 != 0) {
                            dVar3 = null;
                        }
                        if (i13 != 0) {
                            dVar4 = d.f4150c;
                        }
                        if (i15 != 0) {
                            cVar2 = J3.c.M;
                        }
                        if ((i9 & 32) != 0) {
                            i10 &= -458753;
                            t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                        }
                        if (i17 != 0) {
                            V0.d dVar11111111111111111111111111111111117 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111111111111111111111117;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                            z9 = true;
                        } else {
                            V0.d dVar11111111111111111111111111111111118 = dVar3;
                            i20 = i10;
                            dVar5 = dVar11111111111111111111111111111111118;
                            z9 = z8;
                            iVar3 = iVar2;
                            dVar6 = dVar4;
                            cVar3 = cVar2;
                        }
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                    }
                    L0.i iVarA111118 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                    C3072m c3072mB111118 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                    int i2111111111117 = i20 >> 12;
                    J jB111118 = cVar3.b(interfaceC3163lP, i2111111111117 & 14);
                    L0.i iVar1111112 = iVar3;
                    H0.a aVarB111118 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                    int i2111111111118 = ((i20 >> 21) & 14) | 805306368 | (i2111111111117 & 896) | ((i20 >> 6) & 7168);
                    J3.c cVar1111112 = cVar3;
                    T0 t1111117 = t0E;
                    d dVar11111111111111111111111111111111119 = dVar6;
                    boolean z1111118 = z9;
                    V0.d dVar111111111111111111111111111111111110 = dVar5;
                    AbstractC3078p.a(onClick, iVarA111118, z1111118, t1111117, c3072mB111118, null, null, jB111118, null, aVarB111118, interfaceC3163lP, i2111111111118, 352);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    dVar7 = dVar111111111111111111111111111111111110;
                    z10 = z1111118;
                    t9 = t1111117;
                    iVar4 = iVar1111112;
                    cVar4 = cVar1111112;
                    dVar8 = dVar11111111111111111111111111111111119;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
                }
            }
            i19 = 12582912;
            i10 |= i19;
            if ((23967451 & i10) == 4793490) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i21 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i11 != 0) {
                        dVar3 = null;
                    }
                    if (i13 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i15 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i17 != 0) {
                        V0.d dVar111111111111111111111111111111111111 = dVar3;
                        i20 = i10;
                        dVar5 = dVar111111111111111111111111111111111111;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                        z9 = true;
                    } else {
                        V0.d dVar111111111111111111111111111111111112 = dVar3;
                        i20 = i10;
                        dVar5 = dVar111111111111111111111111111111111112;
                        z9 = z8;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                    }
                } else {
                    if (i21 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i11 != 0) {
                        dVar3 = null;
                    }
                    if (i13 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i15 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i17 != 0) {
                        V0.d dVar111111111111111111111111111111111113 = dVar3;
                        i20 = i10;
                        dVar5 = dVar111111111111111111111111111111111113;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                        z9 = true;
                    } else {
                        V0.d dVar111111111111111111111111111111111114 = dVar3;
                        i20 = i10;
                        dVar5 = dVar111111111111111111111111111111111114;
                        z9 = z8;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                }
                L0.i iVarA111119 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                C3072m c3072mB111119 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                int i2111111111119 = i20 >> 12;
                J jB111119 = cVar3.b(interfaceC3163lP, i2111111111119 & 14);
                L0.i iVar1111113 = iVar3;
                H0.a aVarB111119 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                int i21111111111110 = ((i20 >> 21) & 14) | 805306368 | (i2111111111119 & 896) | ((i20 >> 6) & 7168);
                J3.c cVar1111113 = cVar3;
                T0 t1111118 = t0E;
                d dVar111111111111111111111111111111111115 = dVar6;
                boolean z1111119 = z9;
                V0.d dVar111111111111111111111111111111111116 = dVar5;
                AbstractC3078p.a(onClick, iVarA111119, z1111119, t1111118, c3072mB111119, null, null, jB111119, null, aVarB111119, interfaceC3163lP, i21111111111110, 352);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                dVar7 = dVar111111111111111111111111111111111116;
                z10 = z1111119;
                t9 = t1111118;
                iVar4 = iVar1111113;
                cVar4 = cVar1111113;
                dVar8 = dVar111111111111111111111111111111111115;
            } else {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i21 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i11 != 0) {
                        dVar3 = null;
                    }
                    if (i13 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i15 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i17 != 0) {
                        V0.d dVar111111111111111111111111111111111117 = dVar3;
                        i20 = i10;
                        dVar5 = dVar111111111111111111111111111111111117;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                        z9 = true;
                    } else {
                        V0.d dVar111111111111111111111111111111111118 = dVar3;
                        i20 = i10;
                        dVar5 = dVar111111111111111111111111111111111118;
                        z9 = z8;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                    }
                } else {
                    if (i21 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i11 != 0) {
                        dVar3 = null;
                    }
                    if (i13 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i15 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i17 != 0) {
                        V0.d dVar111111111111111111111111111111111119 = dVar3;
                        i20 = i10;
                        dVar5 = dVar111111111111111111111111111111111119;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                        z9 = true;
                    } else {
                        V0.d dVar1111111111111111111111111111111111110 = dVar3;
                        i20 = i10;
                        dVar5 = dVar1111111111111111111111111111111111110;
                        z9 = z8;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                }
                L0.i iVarA1111110 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                C3072m c3072mB1111110 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                int i21111111111111 = i20 >> 12;
                J jB1111110 = cVar3.b(interfaceC3163lP, i21111111111111 & 14);
                L0.i iVar1111114 = iVar3;
                H0.a aVarB1111110 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                int i21111111111112 = ((i20 >> 21) & 14) | 805306368 | (i21111111111111 & 896) | ((i20 >> 6) & 7168);
                J3.c cVar1111114 = cVar3;
                T0 t1111119 = t0E;
                d dVar1111111111111111111111111111111111111 = dVar6;
                boolean z11111110 = z9;
                V0.d dVar1111111111111111111111111111111111112 = dVar5;
                AbstractC3078p.a(onClick, iVarA1111110, z11111110, t1111119, c3072mB1111110, null, null, jB1111110, null, aVarB1111110, interfaceC3163lP, i21111111111112, 352);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                dVar7 = dVar1111111111111111111111111111111111112;
                z10 = z11111110;
                t9 = t1111119;
                iVar4 = iVar1111114;
                cVar4 = cVar1111114;
                dVar8 = dVar1111111111111111111111111111111111111;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
            }
        }
        i10 |= 24576;
        cVar2 = cVar;
        if ((458752 & i8) == 0) {
            if ((i9 & 32) == 0) {
                t0E = t8;
                if (interfaceC3163lP.R(t0E)) {
                }
                i10 |= i22;
            } else {
                t0E = t8;
            }
            i10 |= i22;
        } else {
            t0E = t8;
        }
        i17 = i9 & 64;
        if (i17 != 0) {
            i10 |= 1572864;
        } else if ((i8 & 3670016) == 0) {
            if (interfaceC3163lP.c(z8)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i10 |= i18;
        }
        if ((i9 & 128) != 0) {
            if ((i8 & 29360128) == 0) {
                if (interfaceC3163lP.l(onClick)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
            }
            if ((23967451 & i10) == 4793490) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i21 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i11 != 0) {
                        dVar3 = null;
                    }
                    if (i13 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i15 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i17 != 0) {
                        V0.d dVar1111111111111111111111111111111111113 = dVar3;
                        i20 = i10;
                        dVar5 = dVar1111111111111111111111111111111111113;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                        z9 = true;
                    } else {
                        V0.d dVar1111111111111111111111111111111111114 = dVar3;
                        i20 = i10;
                        dVar5 = dVar1111111111111111111111111111111111114;
                        z9 = z8;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                    }
                } else {
                    if (i21 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i11 != 0) {
                        dVar3 = null;
                    }
                    if (i13 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i15 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i17 != 0) {
                        V0.d dVar1111111111111111111111111111111111115 = dVar3;
                        i20 = i10;
                        dVar5 = dVar1111111111111111111111111111111111115;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                        z9 = true;
                    } else {
                        V0.d dVar1111111111111111111111111111111111116 = dVar3;
                        i20 = i10;
                        dVar5 = dVar1111111111111111111111111111111111116;
                        z9 = z8;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                }
                L0.i iVarA1111111 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                C3072m c3072mB1111111 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                int i21111111111113 = i20 >> 12;
                J jB1111111 = cVar3.b(interfaceC3163lP, i21111111111113 & 14);
                L0.i iVar1111115 = iVar3;
                H0.a aVarB1111111 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                int i21111111111114 = ((i20 >> 21) & 14) | 805306368 | (i21111111111113 & 896) | ((i20 >> 6) & 7168);
                J3.c cVar1111115 = cVar3;
                T0 t11111110 = t0E;
                d dVar1111111111111111111111111111111111117 = dVar6;
                boolean z11111111 = z9;
                V0.d dVar1111111111111111111111111111111111118 = dVar5;
                AbstractC3078p.a(onClick, iVarA1111111, z11111111, t11111110, c3072mB1111111, null, null, jB1111111, null, aVarB1111111, interfaceC3163lP, i21111111111114, 352);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                dVar7 = dVar1111111111111111111111111111111111118;
                z10 = z11111111;
                t9 = t11111110;
                iVar4 = iVar1111115;
                cVar4 = cVar1111115;
                dVar8 = dVar1111111111111111111111111111111111117;
            } else {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i21 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i11 != 0) {
                        dVar3 = null;
                    }
                    if (i13 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i15 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i17 != 0) {
                        V0.d dVar1111111111111111111111111111111111119 = dVar3;
                        i20 = i10;
                        dVar5 = dVar1111111111111111111111111111111111119;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                        z9 = true;
                    } else {
                        V0.d dVar11111111111111111111111111111111111110 = dVar3;
                        i20 = i10;
                        dVar5 = dVar11111111111111111111111111111111111110;
                        z9 = z8;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                    }
                } else {
                    if (i21 != 0) {
                        iVar2 = L0.i.f4836a;
                    }
                    if (i11 != 0) {
                        dVar3 = null;
                    }
                    if (i13 != 0) {
                        dVar4 = d.f4150c;
                    }
                    if (i15 != 0) {
                        cVar2 = J3.c.M;
                    }
                    if ((i9 & 32) != 0) {
                        i10 &= -458753;
                        t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                    }
                    if (i17 != 0) {
                        V0.d dVar11111111111111111111111111111111111111 = dVar3;
                        i20 = i10;
                        dVar5 = dVar11111111111111111111111111111111111111;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                        z9 = true;
                    } else {
                        V0.d dVar11111111111111111111111111111111111112 = dVar3;
                        i20 = i10;
                        dVar5 = dVar11111111111111111111111111111111111112;
                        z9 = z8;
                        iVar3 = iVar2;
                        dVar6 = dVar4;
                        cVar3 = cVar2;
                    }
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
                }
                L0.i iVarA1111112 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
                C3072m c3072mB1111112 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
                int i21111111111115 = i20 >> 12;
                J jB1111112 = cVar3.b(interfaceC3163lP, i21111111111115 & 14);
                L0.i iVar1111116 = iVar3;
                H0.a aVarB1111112 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
                int i21111111111116 = ((i20 >> 21) & 14) | 805306368 | (i21111111111115 & 896) | ((i20 >> 6) & 7168);
                J3.c cVar1111116 = cVar3;
                T0 t11111111 = t0E;
                d dVar11111111111111111111111111111111111113 = dVar6;
                boolean z11111112 = z9;
                V0.d dVar11111111111111111111111111111111111114 = dVar5;
                AbstractC3078p.a(onClick, iVarA1111112, z11111112, t11111111, c3072mB1111112, null, null, jB1111112, null, aVarB1111112, interfaceC3163lP, i21111111111116, 352);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                dVar7 = dVar11111111111111111111111111111111111114;
                z10 = z11111112;
                t9 = t11111111;
                iVar4 = iVar1111116;
                cVar4 = cVar1111116;
                dVar8 = dVar11111111111111111111111111111111111113;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
            }
        }
        i19 = 12582912;
        i10 |= i19;
        if ((23967451 & i10) == 4793490) {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i21 != 0) {
                    iVar2 = L0.i.f4836a;
                }
                if (i11 != 0) {
                    dVar3 = null;
                }
                if (i13 != 0) {
                    dVar4 = d.f4150c;
                }
                if (i15 != 0) {
                    cVar2 = J3.c.M;
                }
                if ((i9 & 32) != 0) {
                    i10 &= -458753;
                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                }
                if (i17 != 0) {
                    V0.d dVar11111111111111111111111111111111111115 = dVar3;
                    i20 = i10;
                    dVar5 = dVar11111111111111111111111111111111111115;
                    iVar3 = iVar2;
                    dVar6 = dVar4;
                    cVar3 = cVar2;
                    z9 = true;
                } else {
                    V0.d dVar11111111111111111111111111111111111116 = dVar3;
                    i20 = i10;
                    dVar5 = dVar11111111111111111111111111111111111116;
                    z9 = z8;
                    iVar3 = iVar2;
                    dVar6 = dVar4;
                    cVar3 = cVar2;
                }
            } else {
                if (i21 != 0) {
                    iVar2 = L0.i.f4836a;
                }
                if (i11 != 0) {
                    dVar3 = null;
                }
                if (i13 != 0) {
                    dVar4 = d.f4150c;
                }
                if (i15 != 0) {
                    cVar2 = J3.c.M;
                }
                if ((i9 & 32) != 0) {
                    i10 &= -458753;
                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                }
                if (i17 != 0) {
                    V0.d dVar11111111111111111111111111111111111117 = dVar3;
                    i20 = i10;
                    dVar5 = dVar11111111111111111111111111111111111117;
                    iVar3 = iVar2;
                    dVar6 = dVar4;
                    cVar3 = cVar2;
                    z9 = true;
                } else {
                    V0.d dVar11111111111111111111111111111111111118 = dVar3;
                    i20 = i10;
                    dVar5 = dVar11111111111111111111111111111111111118;
                    z9 = z8;
                    iVar3 = iVar2;
                    dVar6 = dVar4;
                    cVar3 = cVar2;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
            }
            L0.i iVarA1111113 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
            C3072m c3072mB1111113 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
            int i21111111111117 = i20 >> 12;
            J jB1111113 = cVar3.b(interfaceC3163lP, i21111111111117 & 14);
            L0.i iVar1111117 = iVar3;
            H0.a aVarB1111113 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
            int i21111111111118 = ((i20 >> 21) & 14) | 805306368 | (i21111111111117 & 896) | ((i20 >> 6) & 7168);
            J3.c cVar1111117 = cVar3;
            T0 t11111112 = t0E;
            d dVar11111111111111111111111111111111111119 = dVar6;
            boolean z11111113 = z9;
            V0.d dVar111111111111111111111111111111111111110 = dVar5;
            AbstractC3078p.a(onClick, iVarA1111113, z11111113, t11111112, c3072mB1111113, null, null, jB1111113, null, aVarB1111113, interfaceC3163lP, i21111111111118, 352);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            dVar7 = dVar111111111111111111111111111111111111110;
            z10 = z11111113;
            t9 = t11111112;
            iVar4 = iVar1111117;
            cVar4 = cVar1111117;
            dVar8 = dVar11111111111111111111111111111111111119;
        } else {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i21 != 0) {
                    iVar2 = L0.i.f4836a;
                }
                if (i11 != 0) {
                    dVar3 = null;
                }
                if (i13 != 0) {
                    dVar4 = d.f4150c;
                }
                if (i15 != 0) {
                    cVar2 = J3.c.M;
                }
                if ((i9 & 32) != 0) {
                    i10 &= -458753;
                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                }
                if (i17 != 0) {
                    V0.d dVar111111111111111111111111111111111111111 = dVar3;
                    i20 = i10;
                    dVar5 = dVar111111111111111111111111111111111111111;
                    iVar3 = iVar2;
                    dVar6 = dVar4;
                    cVar3 = cVar2;
                    z9 = true;
                } else {
                    V0.d dVar111111111111111111111111111111111111112 = dVar3;
                    i20 = i10;
                    dVar5 = dVar111111111111111111111111111111111111112;
                    z9 = z8;
                    iVar3 = iVar2;
                    dVar6 = dVar4;
                    cVar3 = cVar2;
                }
            } else {
                if (i21 != 0) {
                    iVar2 = L0.i.f4836a;
                }
                if (i11 != 0) {
                    dVar3 = null;
                }
                if (i13 != 0) {
                    dVar4 = d.f4150c;
                }
                if (i15 != 0) {
                    cVar2 = J3.c.M;
                }
                if ((i9 & 32) != 0) {
                    i10 &= -458753;
                    t0E = Z.f35786a.b(interfaceC3163lP, Z.f35787b).e();
                }
                if (i17 != 0) {
                    V0.d dVar111111111111111111111111111111111111113 = dVar3;
                    i20 = i10;
                    dVar5 = dVar111111111111111111111111111111111111113;
                    iVar3 = iVar2;
                    dVar6 = dVar4;
                    cVar3 = cVar2;
                    z9 = true;
                } else {
                    V0.d dVar111111111111111111111111111111111111114 = dVar3;
                    i20 = i10;
                    dVar5 = dVar111111111111111111111111111111111111114;
                    z9 = z8;
                    iVar3 = iVar2;
                    dVar6 = dVar4;
                    cVar3 = cVar2;
                }
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-517481809, i20, -1, "com.elgato.streamdeck.ui.components.Button (Button.kt:139)");
            }
            L0.i iVarA1111114 = androidx.compose.foundation.layout.f.a(iVar3, A1.h.m(44), A1.h.m(28));
            C3072m c3072mB1111114 = dVar6.b(interfaceC3163lP, (i20 >> 9) & 14);
            int i21111111111119 = i20 >> 12;
            J jB1111114 = cVar3.b(interfaceC3163lP, i21111111111119 & 14);
            L0.i iVar1111118 = iVar3;
            H0.a aVarB1111114 = H0.c.b(interfaceC3163lP, 81630879, true, new C0156b(dVar5, cVar3, text));
            int i211111111111110 = ((i20 >> 21) & 14) | 805306368 | (i21111111111119 & 896) | ((i20 >> 6) & 7168);
            J3.c cVar1111118 = cVar3;
            T0 t11111113 = t0E;
            d dVar111111111111111111111111111111111111115 = dVar6;
            boolean z11111114 = z9;
            V0.d dVar111111111111111111111111111111111111116 = dVar5;
            AbstractC3078p.a(onClick, iVarA1111114, z11111114, t11111113, c3072mB1111114, null, null, jB1111114, null, aVarB1111114, interfaceC3163lP, i211111111111110, 352);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            dVar7 = dVar111111111111111111111111111111111111116;
            z10 = z11111114;
            t9 = t11111113;
            iVar4 = iVar1111118;
            cVar4 = cVar1111118;
            dVar8 = dVar111111111111111111111111111111111111115;
        }
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new c(text, iVar4, dVar7, dVar8, cVar4, t9, z10, onClick, i8, i9));
        }
    }
}
