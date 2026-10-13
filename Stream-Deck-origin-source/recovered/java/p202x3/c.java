package p202x3;

import A1.h;
import C6.G;
import L0.i;
import Q3.d;
import Q6.k;
import Q6.o;
import Q6.p;
import androidx.compose.foundation.layout.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2252x;
import p038e1.H;
import p056g1.InterfaceC2343g;
import p082j0.AbstractC2607k;
import p082j0.C2598b;
import p082j0.C2609m;
import p082j0.S;
import p082j0.U;
import p110m1.n;
import p110m1.x;
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
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f37220a = new a();

        public a() {
            super(1);
        }

        public final void b(x semantics) {
            t.g(semantics, "$this$semantics");
            p110m1.u.X(semantics, "keypad_grid");
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((x) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f37221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f37222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f37223c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f37224d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f37225e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, d dVar, o oVar, int i8, int i9) {
            super(2);
            this.f37221a = iVar;
            this.f37222b = dVar;
            this.f37223c = oVar;
            this.f37224d = i8;
            this.f37225e = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            c.a(this.f37221a, this.f37222b, this.f37223c, interfaceC3163l, F0.a(this.f37224d | 1), this.f37225e);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r5v12, types: [j0.l] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    public static final void a(i iVar, d keys, o oVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        i iVar2;
        int i10;
        i iVar3;
        o onKeyState = oVar;
        ?? r8 = 0;
        t.g(keys, "keys");
        t.g(onKeyState, "onKeyState");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(922114286);
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
            i10 |= interfaceC3163lP.R(keys) ? 32 : 16;
        }
        if ((i9 & 4) != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            i10 |= interfaceC3163lP.l(onKeyState) ? 256 : 128;
        }
        int i12 = i10;
        if ((i12 & 731) == 146 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
            iVar3 = iVar2;
        } else {
            i iVar4 = i11 != 0 ? i.f4836a : iVar2;
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(922114286, i12, -1, "com.elgato.streamdeck.keypad.KeypadLayoutView (KeypadLayoutView.kt:24)");
            }
            float fM = h.m(0);
            float fM2 = h.m(148);
            i iVarD = n.d(iVar4, false, a.f37220a, 1, null);
            C2598b.e eVarN = C2598b.f27914a.n(fM);
            interfaceC3163lP.f(-483455358);
            H hA = AbstractC2607k.a(eVarN, L0.c.f4806a.i(), interfaceC3163lP, 6);
            interfaceC3163lP.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163lP, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163lP.E();
            InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar.a();
            p pVarB = AbstractC2252x.b(iVarD);
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
            interfaceC3163lP.f(-381049089);
            int iF = keys.f();
            int i13 = 0;
            ?? r9 = c2609m;
            while (i13 < iF) {
                i iVarA = r9.a(i.f4836a, 1.0f, r8);
                C2598b.e eVarN2 = C2598b.f27914a.n(fM);
                interfaceC3163lP.f(693286680);
                H hA2 = S.a(eVarN2, L0.c.f4806a.j(), interfaceC3163lP, 6);
                interfaceC3163lP.f(-1323940314);
                int iA2 = AbstractC3157i.a(interfaceC3163lP, r8);
                InterfaceC3184w interfaceC3184wE2 = interfaceC3163lP.E();
                InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
                Function0 function0A2 = aVar2.a();
                p pVarB2 = AbstractC2252x.b(iVarA);
                if (interfaceC3163lP.t() == null) {
                    AbstractC3157i.c();
                }
                interfaceC3163lP.r();
                if (interfaceC3163lP.m()) {
                    interfaceC3163lP.w(function0A2);
                } else {
                    interfaceC3163lP.G();
                }
                InterfaceC3163l interfaceC3163lA2 = v1.a(interfaceC3163lP);
                v1.b(interfaceC3163lA2, hA2, aVar2.c());
                v1.b(interfaceC3163lA2, interfaceC3184wE2, aVar2.e());
                o oVarB2 = aVar2.b();
                if (interfaceC3163lA2.m() || !t.c(interfaceC3163lA2.g(), Integer.valueOf(iA2))) {
                    interfaceC3163lA2.H(Integer.valueOf(iA2));
                    interfaceC3163lA2.A(Integer.valueOf(iA2), oVarB2);
                }
                pVarB2.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                char c8 = 43753;
                interfaceC3163lP.f(2058660585);
                U u8 = U.f27892a;
                interfaceC3163lP.f(-202769041);
                int iD = keys.d();
                int i14 = 0;
                ?? r10 = r9;
                while (i14 < iD) {
                    interfaceC3163lP.q(-1877349941, interfaceC3163lP.x(Integer.valueOf(i13), Integer.valueOf(i14)));
                    p202x3.b.a(f.o(u8.a(i.f4836a, 1.0f, false), 0.0f, 0.0f, fM2, fM2, 3, null), (Q3.a) keys.c(i13, i14), onKeyState, interfaceC3163lP, i12 & 896, 0);
                    interfaceC3163lP.L();
                    r10 = r10;
                    u8 = u8;
                    iF = iF;
                    c8 = 43753;
                    i13 = i13;
                    iD = iD;
                    i14++;
                    onKeyState = oVar;
                }
                interfaceC3163lP.N();
                interfaceC3163lP.N();
                interfaceC3163lP.O();
                interfaceC3163lP.N();
                interfaceC3163lP.N();
                i13++;
                onKeyState = oVar;
                r8 = 0;
                r9 = r10;
            }
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            interfaceC3163lP.O();
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar3 = iVar4;
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(iVar3, keys, oVar, i8, i9));
        }
    }
}
