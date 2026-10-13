package p170t3;

import C6.G;
import C6.r;
import I6.l;
import L0.i;
import N3.m;
import Q6.k;
import Q6.o;
import Q6.p;
import R0.C1598l0;
import android.R;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.C;
import androidx.lifecycle.InterfaceC1733p;
import com.elgato.streamdeck.vsd2.PermissionRepository;
import com.elgato.streamdeck.vsd2.PermissionState;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.J;
import p018c.h;
import p038e1.AbstractC2252x;
import p038e1.H;
import p056g1.InterfaceC2343g;
import p065h1.I0;
import p065h1.X;
import p082j0.AbstractC2607k;
import p082j0.C2598b;
import p082j0.C2609m;
import p082j0.InterfaceC2608l;
import p082j0.S;
import p082j0.T;
import p082j0.U;
import p082j0.d0;
import p082j0.j0;
import p191w0.AbstractC3068k;
import p191w0.AbstractC3086t0;
import p191w0.F0;
import p191w0.N;
import p191w0.Q0;
import p191w0.R0;
import p191w0.Z;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3184w;
import p215z0.K;
import p215z0.P0;
import p215z0.v1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m.d f34216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f34217c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m.d dVar, h hVar, G6.d dVar2) {
            super(2, dVar2);
            this.f34216b = dVar;
            this.f34217c = hVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new a(this.f34216b, this.f34217c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f34215a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            if (this.f34216b.f() == m.b.Request) {
                this.f34217c.a(G3.b.a(PermissionRepository.Permission.CAMERA));
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f34219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1733p f34220c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f34221d;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f34222a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC1733p f34223b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f34224c;

            /* JADX INFO: renamed from: t3.f$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0771a extends l implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f34225a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f34226b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0771a(k kVar, G6.d dVar) {
                    super(2, dVar);
                    this.f34226b = kVar;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    return new C0771a(this.f34226b, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, G6.d dVar) {
                    return ((C0771a) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = H6.c.f();
                    int i8 = this.f34225a;
                    if (i8 == 0) {
                        r.b(obj);
                        k kVar = this.f34226b;
                        this.f34225a = 1;
                        if (kVar.invoke(this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    return G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC1733p interfaceC1733p, k kVar, G6.d dVar) {
                super(2, dVar);
                this.f34223b = interfaceC1733p;
                this.f34224c = kVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new a(this.f34223b, this.f34224c, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f34222a;
                if (i8 == 0) {
                    r.b(obj);
                    AbstractC1726i abstractC1726iW = this.f34223b.w();
                    AbstractC1726i.b bVar = AbstractC1726i.b.STARTED;
                    C0771a c0771a = new C0771a(this.f34224c, null);
                    this.f34222a = 1;
                    if (C.a(abstractC1726iW, bVar, c0771a, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1733p interfaceC1733p, k kVar, G6.d dVar) {
            super(2, dVar);
            this.f34220c = interfaceC1733p;
            this.f34221d = kVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            b bVar = new b(this.f34220c, this.f34221d, dVar);
            bVar.f34219b = obj;
            return bVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f34218a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            AbstractC1789i.d((J) this.f34219b, null, null, new a(this.f34220c, this.f34221d, null), 3, null);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f34227a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function0 f34228a;

            /* JADX INFO: renamed from: t3.f$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0772a extends u implements Function0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Function0 f34229a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0772a(Function0 function0) {
                    super(0);
                    this.f34229a = function0;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m280invoke();
                    return G.f1419a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m280invoke() {
                    this.f34229a.invoke();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Function0 function0) {
                super(2);
                this.f34228a = function0;
            }

            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1429693790, i8, -1, "com.elgato.streamdeck.discovery.qr_scanner.ScanningScreenContent.<anonymous>.<anonymous> (QRScanScreen.kt:171)");
                }
                interfaceC3163l.f(1662823992);
                boolean zR = interfaceC3163l.R(this.f34228a);
                Function0 function0 = this.f34228a;
                Object objG = interfaceC3163l.g();
                if (zR || objG == InterfaceC3163l.f38803a.a()) {
                    objG = new C0772a(function0);
                    interfaceC3163l.H(objG);
                }
                interfaceC3163l.N();
                N.a((Function0) objG, null, false, null, null, p170t3.b.f34140a.b(), interfaceC3163l, 196608, 30);
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
        public c(Function0 function0) {
            super(2);
            this.f34227a = function0;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1176775324, i8, -1, "com.elgato.streamdeck.discovery.qr_scanner.ScanningScreenContent.<anonymous> (QRScanScreen.kt:163)");
            }
            o oVarA = p170t3.b.f34140a.a();
            H0.a aVarB = H0.c.b(interfaceC3163l, 1429693790, true, new a(this.f34227a));
            interfaceC3163l.f(979617027);
            Q0 q0A = R0.f35670a.a(interfaceC3163l, R0.f35671b);
            if (((Configuration) interfaceC3163l.e(AndroidCompositionLocals_androidKt.f())).orientation == 1) {
                long jD = C1598l0.f9405b.d();
                W3.b bVar = W3.b.f11304a;
                q0A = Q0.c(q0A, jD, 0L, bVar.f(), bVar.f(), 0L, 18, null);
            }
            interfaceC3163l.N();
            AbstractC3068k.d(oVarA, null, aVarB, null, null, q0A, null, interfaceC3163l, 390, 90);
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

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f34230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m.d f34231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function0 f34232c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f34233d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Function0 f34234e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ O3.b f34235f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Function0 f34236g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i iVar, m.d dVar, Function0 function0, Function0 function1, Function0 function2, O3.b bVar, Function0 function3) {
            super(3);
            this.f34230a = iVar;
            this.f34231b = dVar;
            this.f34232c = function0;
            this.f34233d = function1;
            this.f34234e = function2;
            this.f34235f = bVar;
            this.f34236g = function3;
        }

        public final void b(p082j0.J paddingValues, InterfaceC3163l interfaceC3163l, int i8) {
            int i9;
            InterfaceC3163l interfaceC3163l2;
            t.g(paddingValues, "paddingValues");
            if ((i8 & 14) == 0) {
                i9 = i8 | (interfaceC3163l.R(paddingValues) ? 4 : 2);
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(2084021359, i9, -1, "com.elgato.streamdeck.discovery.qr_scanner.ScanningScreenContent.<anonymous> (QRScanScreen.kt:194)");
            }
            i iVarD = androidx.compose.foundation.layout.f.d(androidx.compose.foundation.layout.e.m(this.f34230a, androidx.compose.foundation.layout.e.g(paddingValues, (A1.t) interfaceC3163l.e(X.i())), 0.0f, androidx.compose.foundation.layout.e.f(paddingValues, (A1.t) interfaceC3163l.e(X.i())), paddingValues.a(), 2, null), 0.0f, 1, null);
            m.d dVar = this.f34231b;
            interfaceC3163l.f(-483455358);
            C2598b c2598b = C2598b.f27914a;
            C2598b.l lVarG = c2598b.g();
            L0.c.a aVar = L0.c.f4806a;
            H hA = AbstractC2607k.a(lVarG, aVar.i(), interfaceC3163l, 0);
            interfaceC3163l.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163l, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
            InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar2.a();
            p pVarB = AbstractC2252x.b(iVarD);
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
            pVarB.invoke(p215z0.R0.a(p215z0.R0.b(interfaceC3163l)), interfaceC3163l, 0);
            interfaceC3163l.f(2058660585);
            C2609m c2609m = C2609m.f28036a;
            float fD = paddingValues.d();
            if (((Configuration) interfaceC3163l.e(AndroidCompositionLocals_androidKt.f())).orientation == 2) {
                interfaceC3163l.f(1662825681);
                interfaceC3163l.f(693286680);
                i.a aVar3 = i.f4836a;
                H hA2 = S.a(c2598b.f(), aVar.j(), interfaceC3163l, 0);
                interfaceC3163l.f(-1323940314);
                int iA2 = AbstractC3157i.a(interfaceC3163l, 0);
                InterfaceC3184w interfaceC3184wE2 = interfaceC3163l.E();
                Function0 function0A2 = aVar2.a();
                p pVarB2 = AbstractC2252x.b(aVar3);
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
                v1.b(interfaceC3163lA2, hA2, aVar2.c());
                v1.b(interfaceC3163lA2, interfaceC3184wE2, aVar2.e());
                o oVarB2 = aVar2.b();
                if (interfaceC3163lA2.m() || !t.c(interfaceC3163lA2.g(), Integer.valueOf(iA2))) {
                    interfaceC3163lA2.H(Integer.valueOf(iA2));
                    interfaceC3163lA2.A(Integer.valueOf(iA2), oVarB2);
                }
                pVarB2.invoke(p215z0.R0.a(p215z0.R0.b(interfaceC3163l)), interfaceC3163l, 0);
                interfaceC3163l.f(2058660585);
                U u8 = U.f27892a;
                p170t3.d.a(dVar.e(), paddingValues, T.b(u8, androidx.compose.foundation.layout.e.m(aVar3, 0.0f, A1.h.m(fD), 0.0f, 0.0f, 13, null), 1.0f, false, 2, null), interfaceC3163l, (i9 << 3) & 112, 0);
                interfaceC3163l2 = interfaceC3163l;
                p170t3.c.b(fD, dVar, androidx.compose.foundation.layout.f.d(T.b(u8, aVar3, 1.0f, false, 2, null), 0.0f, 1, null), interfaceC3163l2, 0, 0);
                interfaceC3163l2.N();
                interfaceC3163l2.O();
                interfaceC3163l2.N();
                interfaceC3163l2.N();
                interfaceC3163l2.N();
            } else {
                interfaceC3163l.f(1662826482);
                K3.e.a(C1598l0.f9405b.d(), false, null, false, interfaceC3163l, 54, 12);
                i.a aVar4 = i.f4836a;
                interfaceC3163l2 = interfaceC3163l;
                p170t3.c.b(fD, dVar, androidx.compose.foundation.layout.f.h(InterfaceC2608l.c(c2609m, aVar4, 0.85f, false, 2, null), 0.0f, 1, null), interfaceC3163l2, 0, 0);
                p170t3.d.a(dVar.e(), paddingValues, InterfaceC2608l.c(c2609m, androidx.compose.foundation.layout.f.b(aVar4, A1.h.m(RCHTTPStatusCodes.SUCCESS), 0.0f, 2, null), 1.0f, false, 2, null), interfaceC3163l2, (i9 << 3) & 112, 0);
                interfaceC3163l2.N();
            }
            interfaceC3163l2.N();
            interfaceC3163l2.O();
            interfaceC3163l2.N();
            interfaceC3163l2.N();
            interfaceC3163l2.f(979619829);
            if (this.f34231b.f() == m.b.Rationale) {
                Function0 function0 = this.f34232c;
                J3.h.a(function0, function0, this.f34233d, p194w3.b.f37004a1, p194w3.b.f37007b1, R.string.ok, 0, true, interfaceC3163l, 12779520, 64);
                interfaceC3163l2 = interfaceC3163l;
            }
            interfaceC3163l2.N();
            interfaceC3163l2.f(979620336);
            if (this.f34231b.f() == m.b.OpenSettings) {
                Function0 function1 = this.f34232c;
                J3.h.a(function1, function1, this.f34234e, p194w3.b.f37004a1, p194w3.b.f37001Z0, p194w3.b.f37063u0, 0, true, interfaceC3163l, 12582912, 64);
                interfaceC3163l2 = interfaceC3163l;
            }
            interfaceC3163l2.N();
            if (this.f34231b.h()) {
                F0.a(androidx.compose.foundation.layout.f.f(i.f4836a, 0.0f, 1, null), null, C1598l0.o(J3.m.c(Z.f35786a.a(interfaceC3163l2, Z.f35787b), interfaceC3163l2, 0), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, 0.0f, null, p170t3.b.f34140a.d(), interfaceC3163l, 12582918, 122);
            }
            m.c cVarD = this.f34231b.d();
            if (cVarD != null) {
                p178u3.b.g(this.f34235f, cVarD, this.f34236g);
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((p082j0.J) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m.d f34237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f34238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f34239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f34240d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Function0 f34241e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Function0 f34242f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Function0 f34243g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ O3.b f34244h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ i f34245i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1733p f34246j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f34247k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f34248l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(m.d dVar, k kVar, o oVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, O3.b bVar, i iVar, InterfaceC1733p interfaceC1733p, int i8, int i9) {
            super(2);
            this.f34237a = dVar;
            this.f34238b = kVar;
            this.f34239c = oVar;
            this.f34240d = function0;
            this.f34241e = function1;
            this.f34242f = function2;
            this.f34243g = function3;
            this.f34244h = bVar;
            this.f34245i = iVar;
            this.f34246j = interfaceC1733p;
            this.f34247k = i8;
            this.f34248l = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            f.a(this.f34237a, this.f34238b, this.f34239c, this.f34240d, this.f34241e, this.f34242f, this.f34243g, this.f34244h, this.f34245i, this.f34246j, interfaceC3163l, p215z0.F0.a(this.f34247k | 1), this.f34248l);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: t3.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0773f extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f34249a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0773f(o oVar) {
            super(1);
            this.f34249a = oVar;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return G.f1419a;
        }

        public final void invoke(boolean z8) {
            this.f34249a.invoke(PermissionRepository.Permission.CAMERA, z8 ? PermissionState.Granted.INSTANCE : PermissionState.Denied.INSTANCE);
        }
    }

    public static final void a(m.d viewState, k startMonitoringPermission, o onUpdatePermission, Function0 rationaleConfirmed, Function0 goToSettings, Function0 goBack, Function0 dismissError, O3.b errors, i iVar, InterfaceC1733p interfaceC1733p, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        InterfaceC1733p interfaceC1733p2;
        int i10;
        G6.d dVar;
        t.g(viewState, "viewState");
        t.g(startMonitoringPermission, "startMonitoringPermission");
        t.g(onUpdatePermission, "onUpdatePermission");
        t.g(rationaleConfirmed, "rationaleConfirmed");
        t.g(goToSettings, "goToSettings");
        t.g(goBack, "goBack");
        t.g(dismissError, "dismissError");
        t.g(errors, "errors");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1572982176);
        i iVar2 = (i9 & 256) != 0 ? i.f4836a : iVar;
        if ((i9 & 512) != 0) {
            interfaceC1733p2 = (InterfaceC1733p) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            i10 = (-1879048193) & i8;
        } else {
            interfaceC1733p2 = interfaceC1733p;
            i10 = i8;
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1572982176, i10, -1, "com.elgato.streamdeck.discovery.qr_scanner.ScanningScreenContent (QRScanScreen.kt:126)");
        }
        if (viewState.c()) {
            goBack.invoke();
        }
        interfaceC3163lP.f(-393172621);
        if (((View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j())).isInEditMode()) {
            dVar = null;
        } else {
            p045f.e eVar = new p045f.e();
            interfaceC3163lP.f(-393172377);
            boolean z8 = (((i8 & 896) ^ 384) > 256 && interfaceC3163lP.R(onUpdatePermission)) || (i8 & 384) == 256;
            Object objG = interfaceC3163lP.g();
            if (z8 || objG == InterfaceC3163l.f38803a.a()) {
                objG = new C0773f(onUpdatePermission);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            dVar = null;
            K.d(viewState.f(), new a(viewState, p018c.c.a(eVar, (k) objG, interfaceC3163lP, 8), null), interfaceC3163lP, 64);
        }
        interfaceC3163lP.N();
        K.d(interfaceC1733p2, new b(interfaceC1733p2, startMonitoringPermission, dVar), interfaceC3163lP, 72);
        i iVar3 = iVar2;
        InterfaceC1733p interfaceC1733p3 = interfaceC1733p2;
        AbstractC3086t0.b(I0.a(i.f4836a, "scanning_screen_content"), H0.c.b(interfaceC3163lP, -1176775324, true, new c(goBack)), null, null, null, 0, 0L, 0L, j0.b(d0.f27940a, interfaceC3163lP, 8), H0.c.b(interfaceC3163lP, 2084021359, true, new d(iVar3, viewState, goBack, rationaleConfirmed, goToSettings, errors, dismissError)), interfaceC3163lP, 805306422, 252);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new e(viewState, startMonitoringPermission, onUpdatePermission, rationaleConfirmed, goToSettings, goBack, dismissError, errors, iVar3, interfaceC1733p3, i8, i9));
        }
    }

    public static final V3.i b(t3.e.a aVar) {
        t.g(aVar, "<this>");
        return V3.d.c(V3.c.f10602a, V3.c.d.QR_CODE_SCANNER, new C6.o[0]);
    }
}
