package p162s3;

import C6.G;
import P2.Lsk.mHPawN;
import Q6.o;
import com.elgato.streamdeck.DiKt;
import com.elgato.streamdeck.vsd2.KnownHost;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2623a;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p027d.LrLN.vHKCAgr;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f extends p210y3.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f32934b = new a(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class b extends C2623a implements Q6.k {
        public b(Object obj) {
            super(1, obj, N3.i.class, "authenticate", "authenticate(Lcom/elgato/streamdeck/vsd2/discovery/DiscoveryService$DiscoveryHost;)Lkotlinx/coroutines/Deferred;", 8);
        }

        public final void b(N3.f.b p8) {
            t.g(p8, "p0");
            ((N3.i) this.f28792a).f(p8);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((N3.f.b) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class c extends C2639q implements Function0 {
        public c(Object obj) {
            super(0, obj, N3.i.class, "dismissError", "dismissError()V", 0);
        }

        public final void h() {
            ((N3.i) this.receiver).j();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            h();
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f32936b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i8) {
            super(2);
            this.f32936b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
            f.this.m(interfaceC3163l, F0.a(this.f32936b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws A5.f {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class e extends C2639q implements Function0 {
        public e(Object obj) {
            super(0, obj, N3.i.class, "cancelAuthenticate", "cancelAuthenticate()V", 0);
        }

        public final void h() {
            ((N3.i) this.receiver).g();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            h();
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: s3.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C0740f extends C2623a implements Q6.k {
        public C0740f(Object obj) {
            super(1, obj, N3.i.class, "open", "open(Lcom/elgato/streamdeck/vsd2/KnownHost$Device;)Lkotlinx/coroutines/Job;", 8);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((KnownHost.Device) obj);
            return G.f1419a;
        }

        public final void b(KnownHost.Device device) {
            t.g(device, vHKCAgr.zVTCNHuRLYMsbtf);
            ((N3.i) this.f28792a).n(device);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class h extends C2639q implements Q6.k {
        public h(Object obj) {
            super(1, obj, N3.i.class, "deleteHost", "deleteHost(Lcom/elgato/streamdeck/vsd2/discovery/DiscoveryService$DiscoveryHost;)V", 0);
        }

        public final void h(N3.f.b p8) {
            t.g(p8, "p0");
            ((N3.i) this.receiver).h(p8);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            h((N3.f.b) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class i extends C2639q implements Q6.k {
        public i(Object obj) {
            super(1, obj, N3.i.class, "newDevice", "newDevice(Lcom/elgato/streamdeck/vsd2/discovery/DiscoveryService$DiscoveryHost;)V", 0);
        }

        public final void h(N3.f.b p8) {
            t.g(p8, "p0");
            ((N3.i) this.receiver).m(p8);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            h((N3.f.b) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class j extends C2639q implements o {
        public j(Object obj) {
            super(2, obj, N3.i.class, "showDeviceInfo", "showDeviceInfo(Lcom/elgato/streamdeck/vsd2/discovery/DiscoveryService$DiscoveryHost;Lcom/elgato/streamdeck/vsd2/KnownHost$Device;)V", 0);
        }

        public final void h(N3.f.b p8, KnownHost.Device p9) {
            t.g(p8, "p0");
            t.g(p9, "p1");
            ((N3.i) this.receiver).o(p8, p9);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            h((N3.f.b) obj, (KnownHost.Device) obj2);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class k extends C2639q implements Function0 {
        public k(Object obj) {
            super(0, obj, B3.i.class, "show", "show()V", 0);
        }

        public final void h() {
            ((B3.i) this.receiver).j();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            h();
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class l extends C2639q implements Function0 {
        public final void h() {
            ((N3.i) this.receiver).i();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            h();
            return G.f1419a;
        }

        public l(Object obj) {
            super(0, obj, N3.i.class, mHPawN.ULc, "dismissDeviceSettings()V", 0);
        }
    }

    @Override // T2.a
    public void m(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1459075493);
        if ((i8 & 1) == 0 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1459075493, i8, -1, "com.elgato.streamdeck.discovery.DiscoveryScreen.Content (DiscoveryScreen.kt:23)");
            }
            interfaceC3163lP.f(1853070191);
            A5.a aVar = new A5.a(N3.i.class, false, null, null);
            A5.h hVar = (A5.h) interfaceC3163lP.e(DiKt.d());
            interfaceC3163lP.f(1468160259);
            Object objG = interfaceC3163lP.g();
            InterfaceC3163l.a aVar2 = InterfaceC3163l.f38803a;
            if (objG == aVar2.a()) {
                objG = hVar.h(aVar, null);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            N3.i iVar = (N3.i) objG;
            interfaceC3163lP.f(1853070191);
            A5.a aVar3 = new A5.a(O3.b.class, false, null, null);
            A5.h hVar2 = (A5.h) interfaceC3163lP.e(DiKt.d());
            interfaceC3163lP.f(1468160259);
            Object objG2 = interfaceC3163lP.g();
            if (objG2 == aVar2.a()) {
                objG2 = hVar2.h(aVar3, null);
                interfaceC3163lP.H(objG2);
            }
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            O3.b bVar = (O3.b) objG2;
            N3.i.d dVar = (N3.i.d) p137p2.a.b(iVar.l(), null, null, null, interfaceC3163lP, 8, 7).getValue();
            V2.b bVar2 = (V2.b) V2.d.e(V2.d.f(), interfaceC3163lP, 0);
            interfaceC3163lP.f(1853070191);
            A5.a aVar4 = new A5.a(B3.i.class, false, null, null);
            A5.h hVar3 = (A5.h) interfaceC3163lP.e(DiKt.d());
            interfaceC3163lP.f(1468160259);
            Object objG3 = interfaceC3163lP.g();
            if (objG3 == aVar2.a()) {
                objG3 = hVar3.h(aVar4, null);
                interfaceC3163lP.H(objG3);
            }
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            B3.i iVar2 = (B3.i) objG3;
            H3.e.b(p162s3.i.a(f32934b), interfaceC3163lP, 8);
            interfaceC3163lP.f(-280735591);
            boolean zR = interfaceC3163lP.R(iVar);
            Object objG4 = interfaceC3163lP.g();
            if (zR || objG4 == aVar2.a()) {
                objG4 = new b(iVar);
                interfaceC3163lP.H(objG4);
            }
            Q6.k kVar = (Q6.k) objG4;
            interfaceC3163lP.N();
            interfaceC3163lP.f(-280735522);
            boolean zR2 = interfaceC3163lP.R(iVar);
            Object objG5 = interfaceC3163lP.g();
            if (zR2 || objG5 == aVar2.a()) {
                objG5 = new e(iVar);
                interfaceC3163lP.H(objG5);
            }
            interfaceC3163lP.N();
            Function0 function0 = (Function0) ((X6.h) objG5);
            interfaceC3163lP.f(-280735451);
            boolean zR3 = interfaceC3163lP.R(iVar);
            Object objG6 = interfaceC3163lP.g();
            if (zR3 || objG6 == aVar2.a()) {
                objG6 = new C0740f(iVar);
                interfaceC3163lP.H(objG6);
            }
            Q6.k kVar2 = (Q6.k) objG6;
            interfaceC3163lP.N();
            g gVar = new g(bVar2);
            interfaceC3163lP.f(-280735334);
            boolean zR4 = interfaceC3163lP.R(iVar);
            Object objG7 = interfaceC3163lP.g();
            if (zR4 || objG7 == aVar2.a()) {
                objG7 = new h(iVar);
                interfaceC3163lP.H(objG7);
            }
            interfaceC3163lP.N();
            Q6.k kVar3 = (Q6.k) ((X6.h) objG7);
            interfaceC3163lP.f(-280735276);
            boolean zR5 = interfaceC3163lP.R(iVar);
            Object objG8 = interfaceC3163lP.g();
            if (zR5 || objG8 == aVar2.a()) {
                objG8 = new i(iVar);
                interfaceC3163lP.H(objG8);
            }
            interfaceC3163lP.N();
            Q6.k kVar4 = (Q6.k) ((X6.h) objG8);
            interfaceC3163lP.f(-280735218);
            boolean zR6 = interfaceC3163lP.R(iVar);
            Object objG9 = interfaceC3163lP.g();
            if (zR6 || objG9 == aVar2.a()) {
                objG9 = new j(iVar);
                interfaceC3163lP.H(objG9);
            }
            interfaceC3163lP.N();
            o oVar = (o) ((X6.h) objG9);
            interfaceC3163lP.f(-280735153);
            boolean zR7 = interfaceC3163lP.R(iVar2);
            Object objG10 = interfaceC3163lP.g();
            if (zR7 || objG10 == aVar2.a()) {
                objG10 = new k(iVar2);
                interfaceC3163lP.H(objG10);
            }
            interfaceC3163lP.N();
            p162s3.g.d(new p162s3.h(dVar, kVar, function0, kVar2, gVar, kVar3, kVar4, oVar, (Function0) ((X6.h) objG10)), null, interfaceC3163lP, 0, 1);
            interfaceC3163lP.f(-280735094);
            if (dVar.i() != null) {
                p pVar = new p();
                interfaceC3163lP.f(-280734921);
                boolean zR8 = interfaceC3163lP.R(iVar);
                Object objG11 = interfaceC3163lP.g();
                if (zR8 || objG11 == aVar2.a()) {
                    objG11 = new l(iVar);
                    interfaceC3163lP.H(objG11);
                }
                interfaceC3163lP.N();
                J3.a.c(pVar, (Function0) ((X6.h) objG11), interfaceC3163lP, 0);
            }
            interfaceC3163lP.N();
            Throwable thC = dVar.c();
            if (thC != null) {
                interfaceC3163lP.f(-280734747);
                boolean zR9 = interfaceC3163lP.R(iVar);
                Object objG12 = interfaceC3163lP.g();
                if (zR9 || objG12 == aVar2.a()) {
                    objG12 = new c(iVar);
                    interfaceC3163lP.H(objG12);
                }
                interfaceC3163lP.N();
                p178u3.b.d(bVar, thC, (Function0) ((X6.h) objG12));
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new d(i8));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V2.b f32937a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(V2.b bVar) {
            super(0);
            this.f32937a = bVar;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m254invoke() {
            V2.b bVar = this.f32937a;
            p170t3.e eVar = new p170t3.e();
            if (bVar.l() instanceof p170t3.e) {
                return;
            }
            bVar.o(eVar);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m254invoke();
            return G.f1419a;
        }
    }
}
