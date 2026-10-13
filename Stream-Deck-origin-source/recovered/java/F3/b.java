package F3;

import A1.h;
import B3.j;
import C6.G;
import C6.v;
import D6.r;
import J3.m;
import L0.i;
import Q6.k;
import Q6.o;
import Q6.p;
import R0.C1598l0;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.elgato.streamdeck.vsd2.KnownHost;
import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p004a3.C1705k;
import p038e1.AbstractC2252x;
import p038e1.H;
import p040e3.q;
import p046f0.AbstractC2281i;
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
import p191w0.AbstractC3085t;
import p191w0.AbstractC3086t0;
import p191w0.C3080q;
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

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f2376a = r.q(KnownHost.Device.KeypadOrientationOption.DYNAMIC, KnownHost.Device.KeypadOrientationOption.FIXED);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f2377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f2379c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f2380d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, int i8, int i9, int i10) {
            super(2);
            this.f2377a = iVar;
            this.f2378b = i8;
            this.f2379c = i9;
            this.f2380d = i10;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            b.a(this.f2377a, this.f2378b, interfaceC3163l, F0.a(this.f2379c | 1), this.f2380d);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: F3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0114b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f2381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ KnownHost.Device.KeypadOrientationOption f2382b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0114b(k kVar, KnownHost.Device.KeypadOrientationOption keypadOrientationOption) {
            super(0);
            this.f2381a = kVar;
            this.f2382b = keypadOrientationOption;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m58invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m58invoke() {
            this.f2381a.invoke(this.f2382b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KnownHost.Device.KeypadOrientationOption f2383a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(KnownHost.Device.KeypadOrientationOption keypadOrientationOption) {
            super(3);
            this.f2383a = keypadOrientationOption;
        }

        public final void b(InterfaceC2608l Card, InterfaceC3163l interfaceC3163l, int i8) {
            t.g(Card, "$this$Card");
            if ((i8 & 81) == 16 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1994135093, i8, -1, "com.elgato.streamdeck.settings.orientation.Option.<anonymous> (OrientationSelectionScreen.kt:193)");
            }
            i.a aVar = i.f4836a;
            W3.c cVar = W3.c.f11463a;
            i iVarM = androidx.compose.foundation.layout.e.m(aVar, 0.0f, cVar.k(), 0.0f, cVar.k(), 5, null);
            L0.c.b bVarF = L0.c.f4806a.f();
            KnownHost.Device.KeypadOrientationOption keypadOrientationOption = this.f2383a;
            interfaceC3163l.f(-483455358);
            H hA = AbstractC2607k.a(C2598b.f27914a.g(), bVarF, interfaceC3163l, 48);
            interfaceC3163l.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163l, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
            InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar2.a();
            p pVarB = AbstractC2252x.b(iVarM);
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
            v1.b(interfaceC3163lA, hA, aVar2.c());
            v1.b(interfaceC3163lA, interfaceC3184wE, aVar2.e());
            o oVarB = aVar2.b();
            if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
            interfaceC3163l.f(2058660585);
            C2609m c2609m = C2609m.f28036a;
            b.a(androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.f.i(aVar, h.m(150)), 0.0f, 1, null), j.c(keypadOrientationOption, interfaceC3163l, 0), interfaceC3163l, 6, 0);
            P0.b(p101l1.f.b(j.e(keypadOrientationOption), interfaceC3163l, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, Z.f35786a.c(interfaceC3163l, Z.f35787b).n(), interfaceC3163l, 0, 0, 65534);
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
            b((InterfaceC2608l) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KnownHost.Device.KeypadOrientationOption f2384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f2385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f2386c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f2387d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f2388e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f2389f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(KnownHost.Device.KeypadOrientationOption keypadOrientationOption, boolean z8, i iVar, k kVar, int i8, int i9) {
            super(2);
            this.f2384a = keypadOrientationOption;
            this.f2385b = z8;
            this.f2386c = iVar;
            this.f2387d = kVar;
            this.f2388e = i8;
            this.f2389f = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            b.c(this.f2384a, this.f2385b, this.f2386c, this.f2387d, interfaceC3163l, F0.a(this.f2388e | 1), this.f2389f);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KnownHost.Device.KeypadOrientationOption f2390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f2391b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f2392a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KnownHost.Device.KeypadOrientationOption f2393b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f2394c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, KnownHost.Device.KeypadOrientationOption keypadOrientationOption, k kVar) {
                super(2);
                this.f2392a = iVar;
                this.f2393b = keypadOrientationOption;
                this.f2394c = kVar;
            }

            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-953361768, i8, -1, "com.elgato.streamdeck.settings.orientation.OrientationSelectionScreenContent.<anonymous>.<anonymous> (OrientationSelectionScreen.kt:141)");
                }
                if (((Configuration) interfaceC3163l.e(AndroidCompositionLocals_androidKt.f())).orientation == 1) {
                    interfaceC3163l.f(682518683);
                    i iVar = this.f2392a;
                    C2598b.e eVarN = C2598b.f27914a.n(m.i(W3.c.f11463a));
                    KnownHost.Device.KeypadOrientationOption keypadOrientationOption = this.f2393b;
                    k kVar = this.f2394c;
                    interfaceC3163l.f(-483455358);
                    H hA = AbstractC2607k.a(eVarN, L0.c.f4806a.i(), interfaceC3163l, 0);
                    interfaceC3163l.f(-1323940314);
                    int iA = AbstractC3157i.a(interfaceC3163l, 0);
                    InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
                    InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
                    Function0 function0A = aVar.a();
                    p pVarB = AbstractC2252x.b(iVar);
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
                    v1.b(interfaceC3163lA, hA, aVar.c());
                    v1.b(interfaceC3163lA, interfaceC3184wE, aVar.e());
                    o oVarB = aVar.b();
                    if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                        interfaceC3163lA.H(Integer.valueOf(iA));
                        interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                    }
                    pVarB.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
                    interfaceC3163l.f(2058660585);
                    C2609m c2609m = C2609m.f28036a;
                    P0.b(p101l1.f.b(p194w3.b.f37036l0, interfaceC3163l, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC3163l, 0, 0, 131070);
                    b.e(keypadOrientationOption, kVar, null, interfaceC3163l, 0, 1);
                    interfaceC3163l.N();
                    interfaceC3163l.O();
                    interfaceC3163l.N();
                    interfaceC3163l.N();
                    interfaceC3163l.N();
                } else {
                    interfaceC3163l.f(682519018);
                    i iVar2 = this.f2392a;
                    C2598b c2598b = C2598b.f27914a;
                    W3.c cVar = W3.c.f11463a;
                    C2598b.e eVarN2 = c2598b.n(m.i(cVar));
                    KnownHost.Device.KeypadOrientationOption keypadOrientationOption2 = this.f2393b;
                    k kVar2 = this.f2394c;
                    interfaceC3163l.f(-483455358);
                    L0.c.a aVar2 = L0.c.f4806a;
                    H hA2 = AbstractC2607k.a(eVarN2, aVar2.i(), interfaceC3163l, 0);
                    interfaceC3163l.f(-1323940314);
                    int iA2 = AbstractC3157i.a(interfaceC3163l, 0);
                    InterfaceC3184w interfaceC3184wE2 = interfaceC3163l.E();
                    InterfaceC2343g.a aVar3 = InterfaceC2343g.f23596Q;
                    Function0 function0A2 = aVar3.a();
                    p pVarB2 = AbstractC2252x.b(iVar2);
                    if (interfaceC3163l.t() == null) {
                        AbstractC3157i.c();
                    }
                    interfaceC3163l.r();
                    if (interfaceC3163l.m()) {
                        interfaceC3163l.w(function0A2);
                    } else {
                        interfaceC3163l.G();
                    }
                    InterfaceC3163l interfaceC3163lA2 = v1.a(interfaceC3163l);
                    v1.b(interfaceC3163lA2, hA2, aVar3.c());
                    v1.b(interfaceC3163lA2, interfaceC3184wE2, aVar3.e());
                    o oVarB2 = aVar3.b();
                    if (interfaceC3163lA2.m() || !t.c(interfaceC3163lA2.g(), Integer.valueOf(iA2))) {
                        interfaceC3163lA2.H(Integer.valueOf(iA2));
                        interfaceC3163lA2.A(Integer.valueOf(iA2), oVarB2);
                    }
                    pVarB2.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
                    interfaceC3163l.f(2058660585);
                    C2609m c2609m2 = C2609m.f28036a;
                    P0.b(p101l1.f.b(p194w3.b.f37036l0, interfaceC3163l, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC3163l, 0, 0, 131070);
                    i.a aVar4 = i.f4836a;
                    i iVarH = androidx.compose.foundation.layout.f.h(aVar4, 0.0f, 1, null);
                    C2598b.e eVarN3 = c2598b.n(cVar.k());
                    interfaceC3163l.f(693286680);
                    H hA3 = S.a(eVarN3, aVar2.j(), interfaceC3163l, 0);
                    interfaceC3163l.f(-1323940314);
                    int iA3 = AbstractC3157i.a(interfaceC3163l, 0);
                    InterfaceC3184w interfaceC3184wE3 = interfaceC3163l.E();
                    Function0 function0A3 = aVar3.a();
                    p pVarB3 = AbstractC2252x.b(iVarH);
                    if (interfaceC3163l.t() == null) {
                        AbstractC3157i.c();
                    }
                    interfaceC3163l.r();
                    if (interfaceC3163l.m()) {
                        interfaceC3163l.w(function0A3);
                    } else {
                        interfaceC3163l.G();
                    }
                    InterfaceC3163l interfaceC3163lA3 = v1.a(interfaceC3163l);
                    v1.b(interfaceC3163lA3, hA3, aVar3.c());
                    v1.b(interfaceC3163lA3, interfaceC3184wE3, aVar3.e());
                    o oVarB3 = aVar3.b();
                    if (interfaceC3163lA3.m() || !t.c(interfaceC3163lA3.g(), Integer.valueOf(iA3))) {
                        interfaceC3163lA3.H(Integer.valueOf(iA3));
                        interfaceC3163lA3.A(Integer.valueOf(iA3), oVarB3);
                    }
                    pVarB3.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
                    interfaceC3163l.f(2058660585);
                    b.e(keypadOrientationOption2, kVar2, T.b(U.f27892a, aVar4, 1.0f, false, 2, null), interfaceC3163l, 0, 0);
                    interfaceC3163l.N();
                    interfaceC3163l.O();
                    interfaceC3163l.N();
                    interfaceC3163l.N();
                    interfaceC3163l.N();
                    interfaceC3163l.O();
                    interfaceC3163l.N();
                    interfaceC3163l.N();
                    interfaceC3163l.N();
                }
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(KnownHost.Device.KeypadOrientationOption keypadOrientationOption, k kVar) {
            super(3);
            this.f2390a = keypadOrientationOption;
            this.f2391b = kVar;
        }

        public final void b(J j8, InterfaceC3163l interfaceC3163l, int i8) {
            int i9;
            t.g(j8, LYdqVGvOGMNr.jpjRRVJmmrsjE);
            if ((i8 & 14) == 0) {
                i9 = i8 | (interfaceC3163l.R(j8) ? 4 : 2);
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-991233027, i9, -1, "com.elgato.streamdeck.settings.orientation.OrientationSelectionScreenContent.<anonymous> (OrientationSelectionScreen.kt:133)");
            }
            i.a aVar = i.f4836a;
            p191w0.F0.a(androidx.compose.foundation.layout.f.f(aVar, 0.0f, 1, null), null, m.c(Z.f35786a.a(interfaceC3163l, Z.f35787b), interfaceC3163l, 0), 0L, 0.0f, 0.0f, null, H0.c.b(interfaceC3163l, -953361768, true, new a(androidx.compose.foundation.layout.e.h(androidx.compose.foundation.layout.e.h(aVar, j8), m.g(W3.c.f11463a)), this.f2390a, this.f2391b)), interfaceC3163l, 12582918, 122);
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

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KnownHost.Device.KeypadOrientationOption f2395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f2396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f2397c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(KnownHost.Device.KeypadOrientationOption keypadOrientationOption, k kVar, int i8) {
            super(2);
            this.f2395a = keypadOrientationOption;
            this.f2396b = kVar;
            this.f2397c = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            b.d(this.f2395a, this.f2396b, interfaceC3163l, F0.a(this.f2397c | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(i iVar, int i8, InterfaceC3163l interfaceC3163l, int i9, int i10) {
        i iVar2;
        int i11;
        InterfaceC3163l interfaceC3163l2;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(725573721);
        int i12 = i10 & 1;
        if (i12 != 0) {
            i11 = i9 | 6;
            iVar2 = iVar;
        } else if ((i9 & 14) == 0) {
            iVar2 = iVar;
            i11 = (interfaceC3163lP.R(iVar2) ? 4 : 2) | i9;
        } else {
            iVar2 = iVar;
            i11 = i9;
        }
        if ((i10 & 2) != 0) {
            i11 |= 48;
        } else if ((i9 & 112) == 0) {
            i11 |= interfaceC3163lP.i(i8) ? 32 : 16;
        }
        int i13 = i11;
        if ((i13 & 91) == 18 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
            interfaceC3163l2 = interfaceC3163lP;
        } else {
            i iVar3 = i12 != 0 ? i.f4836a : iVar2;
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(725573721, i13, -1, "com.elgato.streamdeck.settings.orientation.Animation (OrientationSelectionScreen.kt:211)");
            }
            interfaceC3163l2 = interfaceC3163lP;
            iVar2 = iVar3;
            p040e3.e.a(b(q.r(e3.m.a.a(e3.m.a.b(i8)), null, null, null, null, null, interfaceC3163lP, 0, 62)), iVar2, false, false, null, 2.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, null, false, false, null, false, null, interfaceC3163l2, ((i13 << 3) & 112) | 1769480, 0, 0, 2097052);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        p215z0.P0 p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new a(iVar2, i8, i9, i10));
        }
    }

    public static final C1705k b(p040e3.k kVar) {
        return (C1705k) kVar.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:72:0x0106  */
    /* JADX WARN: Code duplicated, block: B:75:0x0139  */
    /* JADX WARN: Code duplicated, block: B:76:0x014f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0196  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void c(KnownHost.Device.KeypadOrientationOption keypadOrientationOption, boolean z8, i iVar, k kVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        i iVar2;
        int i11;
        i iVar3;
        boolean z9;
        boolean z10;
        Object objG;
        long jA;
        InterfaceC3163l interfaceC3163l2;
        long jO;
        i iVar4;
        p215z0.P0 p0V;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1242067843);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.R(keypadOrientationOption) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            i10 |= interfaceC3163lP.c(z8) ? 32 : 16;
        }
        int i12 = i9 & 4;
        if (i12 == 0) {
            if ((i8 & 896) == 0) {
                iVar2 = iVar;
                i10 |= interfaceC3163lP.R(iVar2) ? 256 : 128;
            }
            if ((i9 & 8) != 0) {
                i10 |= 3072;
            } else if ((i8 & 7168) == 0) {
                if (interfaceC3163lP.l(kVar)) {
                    i11 = 2048;
                } else {
                    i11 = 1024;
                }
                i10 |= i11;
            }
            if ((i10 & 5851) == 1170 || !interfaceC3163lP.s()) {
                if (i12 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1242067843, i10, -1, "com.elgato.streamdeck.settings.orientation.Option (OrientationSelectionScreen.kt:174)");
                }
                p191w0.r rVar = p191w0.r.f36360a;
                int i13 = p191w0.r.f36361b;
                i iVarA = O0.f.a(iVar3, rVar.e(interfaceC3163lP, i13));
                p110m1.h hVarH = p110m1.h.h(p110m1.h.f29507b.e());
                interfaceC3163lP.f(-1825908250);
                if ((i10 & 7168) == 2048) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z9 | ((i10 & 14) == 4);
                objG = interfaceC3163lP.g();
                if (z10 || objG == InterfaceC3163l.f38803a.a()) {
                    objG = new C0114b(kVar, keypadOrientationOption);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                i iVarA2 = I0.a(p127o0.a.c(iVarA, z8, true, hVarH, (Function0) objG), I3.e.f3775a.b(keypadOrientationOption));
                if (z8) {
                    interfaceC3163lP.f(-1825908053);
                    jA = Z.f35786a.a(interfaceC3163lP, Z.f35787b).B();
                } else {
                    interfaceC3163lP.f(-1825908014);
                    jA = Z.f35786a.a(interfaceC3163lP, Z.f35787b).a();
                }
                interfaceC3163lP.N();
                i iVar5 = iVar3;
                interfaceC3163l2 = interfaceC3163lP;
                C3080q c3080qB = rVar.b(jA, 0L, 0L, 0L, interfaceC3163l2, i13 << 12, 14);
                float fM = h.m(1);
                if (z8) {
                    interfaceC3163l2.f(-1825907889);
                    jO = Z.f35786a.a(interfaceC3163l2, Z.f35787b).v();
                    interfaceC3163l2.N();
                } else {
                    interfaceC3163l2.f(-1825907830);
                    jO = C1598l0.o(Z.f35786a.a(interfaceC3163l2, Z.f35787b).v(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                    interfaceC3163l2.N();
                }
                AbstractC3085t.a(iVarA2, null, c3080qB, null, AbstractC2281i.a(fM, jO), H0.c.b(interfaceC3163l2, -1994135093, true, new c(keypadOrientationOption)), interfaceC3163l2, 196608, 10);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar5;
            } else {
                interfaceC3163lP.z();
                iVar4 = iVar2;
                interfaceC3163l2 = interfaceC3163lP;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new d(keypadOrientationOption, z8, iVar4, kVar, i8, i9));
            }
        }
        i10 |= 384;
        iVar2 = iVar;
        if ((i9 & 8) != 0) {
            i10 |= 3072;
        } else if ((i8 & 7168) == 0) {
            if (interfaceC3163lP.l(kVar)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i10 |= i11;
        }
        if ((i10 & 5851) == 1170) {
            if (i12 != 0) {
                iVar3 = i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1242067843, i10, -1, "com.elgato.streamdeck.settings.orientation.Option (OrientationSelectionScreen.kt:174)");
            }
            p191w0.r rVar2 = p191w0.r.f36360a;
            int i14 = p191w0.r.f36361b;
            i iVarA3 = O0.f.a(iVar3, rVar2.e(interfaceC3163lP, i14));
            p110m1.h hVarH2 = p110m1.h.h(p110m1.h.f29507b.e());
            interfaceC3163lP.f(-1825908250);
            if ((i10 & 7168) == 2048) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = z9 | ((i10 & 14) == 4);
            objG = interfaceC3163lP.g();
            if (z10) {
                objG = new C0114b(kVar, keypadOrientationOption);
                interfaceC3163lP.H(objG);
            } else {
                objG = new C0114b(kVar, keypadOrientationOption);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            i iVarA4 = I0.a(p127o0.a.c(iVarA3, z8, true, hVarH2, (Function0) objG), I3.e.f3775a.b(keypadOrientationOption));
            if (z8) {
                interfaceC3163lP.f(-1825908053);
                jA = Z.f35786a.a(interfaceC3163lP, Z.f35787b).B();
            } else {
                interfaceC3163lP.f(-1825908014);
                jA = Z.f35786a.a(interfaceC3163lP, Z.f35787b).a();
            }
            interfaceC3163lP.N();
            i iVar6 = iVar3;
            interfaceC3163l2 = interfaceC3163lP;
            C3080q c3080qB2 = rVar2.b(jA, 0L, 0L, 0L, interfaceC3163l2, i14 << 12, 14);
            float fM2 = h.m(1);
            if (z8) {
                interfaceC3163l2.f(-1825907889);
                jO = Z.f35786a.a(interfaceC3163l2, Z.f35787b).v();
                interfaceC3163l2.N();
            } else {
                interfaceC3163l2.f(-1825907830);
                jO = C1598l0.o(Z.f35786a.a(interfaceC3163l2, Z.f35787b).v(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                interfaceC3163l2.N();
            }
            AbstractC3085t.a(iVarA4, null, c3080qB2, null, AbstractC2281i.a(fM2, jO), H0.c.b(interfaceC3163l2, -1994135093, true, new c(keypadOrientationOption)), interfaceC3163l2, 196608, 10);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar4 = iVar6;
        } else {
            if (i12 != 0) {
                iVar3 = i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1242067843, i10, -1, "com.elgato.streamdeck.settings.orientation.Option (OrientationSelectionScreen.kt:174)");
            }
            p191w0.r rVar3 = p191w0.r.f36360a;
            int i15 = p191w0.r.f36361b;
            i iVarA5 = O0.f.a(iVar3, rVar3.e(interfaceC3163lP, i15));
            p110m1.h hVarH3 = p110m1.h.h(p110m1.h.f29507b.e());
            interfaceC3163lP.f(-1825908250);
            if ((i10 & 7168) == 2048) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = z9 | ((i10 & 14) == 4);
            objG = interfaceC3163lP.g();
            if (z10) {
                objG = new C0114b(kVar, keypadOrientationOption);
                interfaceC3163lP.H(objG);
            } else {
                objG = new C0114b(kVar, keypadOrientationOption);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            i iVarA6 = I0.a(p127o0.a.c(iVarA5, z8, true, hVarH3, (Function0) objG), I3.e.f3775a.b(keypadOrientationOption));
            if (z8) {
                interfaceC3163lP.f(-1825908053);
                jA = Z.f35786a.a(interfaceC3163lP, Z.f35787b).B();
            } else {
                interfaceC3163lP.f(-1825908014);
                jA = Z.f35786a.a(interfaceC3163lP, Z.f35787b).a();
            }
            interfaceC3163lP.N();
            i iVar7 = iVar3;
            interfaceC3163l2 = interfaceC3163lP;
            C3080q c3080qB3 = rVar3.b(jA, 0L, 0L, 0L, interfaceC3163l2, i15 << 12, 14);
            float fM3 = h.m(1);
            if (z8) {
                interfaceC3163l2.f(-1825907889);
                jO = Z.f35786a.a(interfaceC3163l2, Z.f35787b).v();
                interfaceC3163l2.N();
            } else {
                interfaceC3163l2.f(-1825907830);
                jO = C1598l0.o(Z.f35786a.a(interfaceC3163l2, Z.f35787b).v(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                interfaceC3163l2.N();
            }
            AbstractC3085t.a(iVarA6, null, c3080qB3, null, AbstractC2281i.a(fM3, jO), H0.c.b(interfaceC3163l2, -1994135093, true, new c(keypadOrientationOption)), interfaceC3163l2, 196608, 10);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar4 = iVar7;
        }
        p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new d(keypadOrientationOption, z8, iVar4, kVar, i8, i9));
        }
    }

    public static final void d(KnownHost.Device.KeypadOrientationOption keypadOrientationOption, k kVar, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        InterfaceC3163l interfaceC3163l2;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-908365524);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.R(keypadOrientationOption) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= interfaceC3163lP.l(kVar) ? 32 : 16;
        }
        if ((i9 & 91) == 18 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
            interfaceC3163l2 = interfaceC3163lP;
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-908365524, i9, -1, "com.elgato.streamdeck.settings.orientation.OrientationSelectionScreenContent (OrientationSelectionScreen.kt:119)");
            }
            interfaceC3163l2 = interfaceC3163lP;
            AbstractC3086t0.b(null, null, null, null, null, 0, 0L, 0L, null, H0.c.b(interfaceC3163lP, -991233027, true, new e(keypadOrientationOption, kVar)), interfaceC3163l2, 805306368, 511);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        p215z0.P0 p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new f(keypadOrientationOption, kVar, i8));
        }
    }

    public static final void e(KnownHost.Device.KeypadOrientationOption keypadOrientationOption, k kVar, i iVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        interfaceC3163l.f(-1347095651);
        if ((i9 & 1) != 0) {
            iVar = i.f4836a;
        }
        i iVar2 = iVar;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1347095651, i8, -1, "com.elgato.streamdeck.settings.orientation.OrientationSelectionScreenContent.Options (OrientationSelectionScreen.kt:121)");
        }
        for (KnownHost.Device.KeypadOrientationOption keypadOrientationOption2 : f2376a) {
            c(keypadOrientationOption2, keypadOrientationOption2 == keypadOrientationOption, iVar2, kVar, interfaceC3163l, (i8 << 6) & 896, 0);
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
    }

    public static final V3.h.a j(F3.a.C0113a eventVirtualDeviceSettingChanged, String trackingTitle, String str, String str2) {
        t.g(eventVirtualDeviceSettingChanged, "$this$eventVirtualDeviceSettingChanged");
        t.g(trackingTitle, "trackingTitle");
        String strB = V3.c.b.VIRTUAL_DEVICE_SETTING_CHANGED.b();
        C6.o oVarA = v.a("selection", trackingTitle);
        if (str == null) {
            str = "-1";
        }
        C6.o oVarA2 = v.a("device_id", str);
        if (str2 == null) {
            str2 = "-1";
        }
        return new V3.h.a(strB, new C6.o[]{oVarA, oVarA2, v.a("workstation_id", str2)}, (V3.a) null, 4, (AbstractC2633k) null);
    }
}
