package p170t3;

import A.C0900v;
import A.C0903w0;
import A.S;
import A.T0;
import A5.f;
import A5.h;
import C6.G;
import C6.r;
import I6.l;
import L0.i;
import Q0.g;
import Q6.k;
import Q6.o;
import R0.C1598l0;
import R0.InterfaceC1586f0;
import R0.M;
import R0.X;
import X.m;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC1733p;
import com.elgato.streamdeck.DiKt;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.J;
import p191w0.Z;
import p215z0.AbstractC3169o;
import p215z0.C3190z;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.K;
import p215z0.P0;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J f34173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f34174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q1 f34175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ T0[] f34176d;

        /* JADX INFO: renamed from: t3.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0767a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f34177a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f34178b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f34179c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ h f34180d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ q1 f34181e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ T0[] f34182f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ m f34183g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0767a(h hVar, q1 q1Var, T0[] t0Arr, m mVar, G6.d dVar) {
                super(2, dVar);
                this.f34180d = hVar;
                this.f34181e = q1Var;
                this.f34182f = t0Arr;
                this.f34183g = mVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new C0767a(this.f34180d, this.f34181e, this.f34182f, this.f34183g, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((C0767a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                C0903w0 c0903w0C;
                C0900v c0900v;
                Object objF = H6.c.f();
                int i8 = this.f34179c;
                if (i8 == 0) {
                    r.b(obj);
                    c0903w0C = new C0903w0.a().c();
                    t.f(c0903w0C, "build(...)");
                    C0900v c0900vA = new C0900v.a().b(1).a();
                    t.f(c0900vA, "build(...)");
                    G3.e eVar = (G3.e) this.f34180d.h(new A5.a(G3.e.class, false, null, null), null);
                    this.f34177a = c0903w0C;
                    this.f34178b = c0900vA;
                    this.f34179c = 1;
                    obj = eVar.a(this);
                    if (obj == objF) {
                        return objF;
                    }
                    c0900v = c0900vA;
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0900v = (C0900v) this.f34178b;
                    c0903w0C = (C0903w0) this.f34177a;
                    r.b(obj);
                }
                W.k kVar = (W.k) obj;
                kVar.e();
                kVar.c((InterfaceC1733p) this.f34181e.getValue(), c0900v, c0903w0C);
                T0[] t0Arr = this.f34182f;
                q1 q1Var = this.f34181e;
                for (T0 t8 : t0Arr) {
                    kVar.c((InterfaceC1733p) q1Var.getValue(), c0900v, t8);
                }
                c0903w0C.l0(this.f34183g.getSurfaceProvider());
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(J j8, h hVar, q1 q1Var, T0[] t0Arr) {
            super(1);
            this.f34173a = j8;
            this.f34174b = hVar;
            this.f34175c = q1Var;
            this.f34176d = t0Arr;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m invoke(Context context) {
            t.g(context, "context");
            m mVar = new m(context);
            AbstractC1789i.d(this.f34173a, null, null, new C0767a(this.f34174b, this.f34175c, this.f34176d, mVar, null), 3, null);
            return mVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T0[] f34184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f34185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f34186c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f34187d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(T0[] t0Arr, h hVar, int i8, int i9) {
            super(2);
            this.f34184a = t0Arr;
            this.f34185b = hVar;
            this.f34186c = i8;
            this.f34187d = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            T0[] t0Arr = this.f34184a;
            c.a((T0[]) Arrays.copyOf(t0Arr, t0Arr.length), this.f34185b, interfaceC3163l, F0.a(this.f34186c | 1), this.f34187d);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: t3.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0768c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f34188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f34189b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0768c(float f8, long j8) {
            super(1);
            this.f34188a = f8;
            this.f34189b = j8;
        }

        public final void b(T0.c drawWithContent) {
            t.g(drawWithContent, "$this$drawWithContent");
            c.e(drawWithContent, this.f34188a, this.f34189b);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((T0.c) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ N3.m.d f34190a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(N3.m.d dVar) {
            super(2);
            this.f34190a = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b(InterfaceC3163l interfaceC3163l, int i8) throws f {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1372240232, i8, -1, "com.elgato.streamdeck.discovery.qr_scanner.QRScanCameraView.<anonymous> (QRScanCameraView.kt:52)");
            }
            if (this.f34190a.g()) {
                T0[] t0Arr = new T0[1];
                interfaceC3163l.f(1853070191);
                A5.a aVar = new A5.a(S.class, false, null, null);
                h hVar = (h) interfaceC3163l.e(DiKt.d());
                interfaceC3163l.f(1468160259);
                Object objG = interfaceC3163l.g();
                if (objG == InterfaceC3163l.f38803a.a()) {
                    objG = hVar.h(aVar, null);
                    interfaceC3163l.H(objG);
                }
                interfaceC3163l.N();
                interfaceC3163l.N();
                t0Arr[0] = objG;
                c.a(t0Arr, null, interfaceC3163l, 8, 2);
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws f {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f34191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N3.m.d f34192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f34193c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f34194d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f34195e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(float f8, N3.m.d dVar, i iVar, int i8, int i9) {
            super(2);
            this.f34191a = f8;
            this.f34192b = dVar;
            this.f34193c = iVar;
            this.f34194d = i8;
            this.f34195e = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            c.b(this.f34191a, this.f34192b, this.f34193c, interfaceC3163l, F0.a(this.f34194d | 1), this.f34195e);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(T0[] t0Arr, h hVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-591841690);
        if ((i9 & 2) != 0) {
            hVar = (h) interfaceC3163lP.e(DiKt.d());
            i10 = i8 & (-113);
        } else {
            i10 = i8;
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-591841690, i10, -1, "com.elgato.streamdeck.discovery.qr_scanner.BackCameraPreviewView (QRScanCameraView.kt:135)");
        }
        interfaceC3163lP.f(773894976);
        interfaceC3163lP.f(-492369756);
        Object objG = interfaceC3163lP.g();
        if (objG == InterfaceC3163l.f38803a.a()) {
            C3190z c3190z = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
            interfaceC3163lP.H(c3190z);
            objG = c3190z;
        }
        interfaceC3163lP.N();
        J jA = ((C3190z) objG).a();
        interfaceC3163lP.N();
        D1.e.b(new a(jA, hVar, g1.p(interfaceC3163lP.e(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), interfaceC3163lP, 8), t0Arr), null, null, interfaceC3163lP, 0, 6);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(t0Arr, hVar, i8, i9));
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x009a  */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static final void b(float f8, N3.m.d viewState, i iVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        i iVar2;
        i iVar3;
        long jB;
        boolean z8;
        boolean zJ;
        Object objG;
        i iVar4;
        P0 p0V;
        t.g(viewState, "viewState");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(118898771);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.h(f8) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            i10 |= interfaceC3163lP.R(viewState) ? 32 : 16;
        }
        int i11 = i9 & 4;
        if (i11 == 0) {
            if ((i8 & 896) == 0) {
                iVar2 = iVar;
                i10 |= interfaceC3163lP.R(iVar2) ? 256 : 128;
            }
            if ((i10 & 731) == 146 || !interfaceC3163lP.s()) {
                if (i11 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(118898771, i10, -1, "com.elgato.streamdeck.discovery.qr_scanner.QRScanCameraView (QRScanCameraView.kt:44)");
                }
                jB = Z.f35786a.a(interfaceC3163lP, Z.f35787b).B();
                interfaceC3163lP.f(1315601154);
                if ((i10 & 14) == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zJ = z8 | interfaceC3163lP.j(jB);
                objG = interfaceC3163lP.g();
                if (zJ || objG == InterfaceC3163l.f38803a.a()) {
                    objG = new C0768c(f8, jB);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                i iVar5 = iVar3;
                p191w0.F0.a(androidx.compose.ui.draw.a.d(iVar3, (k) objG), null, 0L, 0L, 0.0f, 0.0f, null, H0.c.b(interfaceC3163lP, -1372240232, true, new d(viewState)), interfaceC3163lP, 12582912, 126);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar5;
            } else {
                interfaceC3163lP.z();
                iVar4 = iVar2;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new e(f8, viewState, iVar4, i8, i9));
            }
        }
        i10 |= 384;
        iVar2 = iVar;
        if ((i10 & 731) == 146) {
            if (i11 != 0) {
                iVar3 = i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(118898771, i10, -1, "com.elgato.streamdeck.discovery.qr_scanner.QRScanCameraView (QRScanCameraView.kt:44)");
            }
            jB = Z.f35786a.a(interfaceC3163lP, Z.f35787b).B();
            interfaceC3163lP.f(1315601154);
            if ((i10 & 14) == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            zJ = z8 | interfaceC3163lP.j(jB);
            objG = interfaceC3163lP.g();
            if (zJ) {
                objG = new C0768c(f8, jB);
                interfaceC3163lP.H(objG);
            } else {
                objG = new C0768c(f8, jB);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            i iVar6 = iVar3;
            p191w0.F0.a(androidx.compose.ui.draw.a.d(iVar3, (k) objG), null, 0L, 0L, 0.0f, 0.0f, null, H0.c.b(interfaceC3163lP, -1372240232, true, new d(viewState)), interfaceC3163lP, 12582912, 126);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar4 = iVar6;
        } else {
            if (i11 != 0) {
                iVar3 = i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(118898771, i10, -1, "com.elgato.streamdeck.discovery.qr_scanner.QRScanCameraView (QRScanCameraView.kt:44)");
            }
            jB = Z.f35786a.a(interfaceC3163lP, Z.f35787b).B();
            interfaceC3163lP.f(1315601154);
            if ((i10 & 14) == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            zJ = z8 | interfaceC3163lP.j(jB);
            objG = interfaceC3163lP.g();
            if (zJ) {
                objG = new C0768c(f8, jB);
                interfaceC3163lP.H(objG);
            } else {
                objG = new C0768c(f8, jB);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            i iVar7 = iVar3;
            p191w0.F0.a(androidx.compose.ui.draw.a.d(iVar3, (k) objG), null, 0L, 0L, 0.0f, 0.0f, null, H0.c.b(interfaceC3163lP, -1372240232, true, new d(viewState)), interfaceC3163lP, 12582912, 126);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar4 = iVar7;
        }
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new e(f8, viewState, iVar4, i8, i9));
        }
    }

    public static final void e(T0.c cVar, float f8, long j8) {
        float fMin = Math.min(Q0.l.i(cVar.d()), Q0.l.g(cVar.d())) * 0.6f;
        cVar.v1();
        T0.f.w1(cVar, W3.b.f11304a.l(), 0L, 0L, 0.0f, null, null, 0, 126, null);
        float f9 = 2;
        float fI = (Q0.l.i(cVar.d()) - fMin) / f9;
        float fG = ((Q0.l.g(cVar.d()) - fMin) / f9) + f8;
        long jA = g.a(fI, fG);
        long jA2 = Q0.m.a(fMin, fMin);
        C1598l0.a aVar = C1598l0.f9405b;
        long jD = aVar.d();
        X.a aVar2 = X.f9354a;
        int iZ = aVar2.z();
        W3.c cVar2 = W3.c.f11463a;
        T0.f.G0(cVar, jD, jA, jA2, Q0.b.b(cVar2.b(), 0.0f, 2, null), null, 0.0f, null, iZ, 112, null);
        InterfaceC1586f0 interfaceC1586f0C = cVar.K0().c();
        float f10 = 13;
        long jA3 = g.a(fI - f10, fG - f10);
        float f11 = 26;
        float f12 = fMin + f11;
        long jA4 = Q0.m.a(f12, f12);
        try {
            interfaceC1586f0C.f(Q0.i.b(jA3, jA4), M.a());
            T0.f.G0(cVar, j8, jA3, jA4, Q0.b.b(cVar2.e(), 0.0f, 2, null), null, 0.0f, null, 0, 240, null);
            float f13 = fMin - f11;
            T0.f.w1(cVar, aVar.d(), g.a(fI + f10, f10 + fG), Q0.m.a(f13, f13), 0.0f, null, null, aVar2.z(), 56, null);
            float f14 = (0.39999998f * fMin) / f9;
            float f15 = fMin * 0.6f;
            T0.f.w1(cVar, aVar.d(), g.a(fI + f14, 0.0f), Q0.m.a(f15, Q0.l.g(cVar.d())), 0.0f, null, null, aVar2.z(), 56, null);
            T0.f.w1(cVar, aVar.d(), g.a(0.0f, fG + f14), Q0.m.a(Q0.l.i(cVar.d()), f15), 0.0f, null, null, aVar2.z(), 56, null);
        } finally {
            interfaceC1586f0C.x();
        }
    }
}
