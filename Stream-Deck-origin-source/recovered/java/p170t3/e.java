package p170t3;

import C6.G;
import N3.m;
import Q6.k;
import Q6.o;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.elgato.streamdeck.DiKt;
import com.elgato.streamdeck.vsd2.PermissionRepository;
import com.elgato.streamdeck.vsd2.PermissionState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e extends p210y3.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34208b = new a(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class b extends C2639q implements k {
        public b(Object obj) {
            super(1, obj, m.class, "startMonitoringPermission", "startMonitoringPermission(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final Object invoke(G6.d dVar) {
            return ((m) this.receiver).l(dVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class c extends C2639q implements o {
        public c(Object obj) {
            super(2, obj, m.class, "updatePermission", "updatePermission(Lcom/elgato/streamdeck/vsd2/PermissionRepository$Permission;Lcom/elgato/streamdeck/vsd2/PermissionState;)V", 0);
        }

        public final void h(PermissionRepository.Permission p8, PermissionState p9) {
            t.g(p8, "p0");
            t.g(p9, "p1");
            ((m) this.receiver).o(p8, p9);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            h((PermissionRepository.Permission) obj, (PermissionState) obj2);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class d extends C2639q implements Function0 {
        public d(Object obj) {
            super(0, obj, m.class, "rationaleConfirmed", "rationaleConfirmed()V", 0);
        }

        public final void h() {
            ((m) this.receiver).k();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            h();
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: t3.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0770e extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f34209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f34210b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0770e(m mVar, Context context) {
            super(0);
            this.f34209a = mVar;
            this.f34210b = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m278invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m278invoke() {
            this.f34209a.j();
            G3.g.b(p186v3.a.b(this.f34210b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f34211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ V2.b f34212b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(m mVar, V2.b bVar) {
            super(0);
            this.f34211a = mVar;
            this.f34212b = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m279invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m279invoke() {
            this.f34211a.j();
            this.f34212b.n();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class g extends C2639q implements Function0 {
        public g(Object obj) {
            super(0, obj, m.class, "dismissError", "dismissError()V", 0);
        }

        public final void h() {
            ((m) this.receiver).h();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            h();
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f34214b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i8) {
            super(2);
            this.f34214b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
            e.this.m(interfaceC3163l, F0.a(this.f34214b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws A5.f {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    @Override // T2.a
    public void m(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(462699387);
        if ((i8 & 1) == 0 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(462699387, i8, -1, "com.elgato.streamdeck.discovery.qr_scanner.QRScanScreen.Content (QRScanScreen.kt:80)");
            }
            interfaceC3163lP.f(1853070191);
            A5.a aVar = new A5.a(m.class, false, null, null);
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
            m mVar = (m) objG;
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
            q1 q1VarB = p137p2.a.b(mVar.i(), null, null, null, interfaceC3163lP, 8, 7);
            V2.b bVar2 = (V2.b) V2.d.e(V2.d.f(), interfaceC3163lP, 0);
            Context context = (Context) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.g());
            H3.e.b(p170t3.f.b(f34208b), interfaceC3163lP, 8);
            m.d dVar = (m.d) q1VarB.getValue();
            interfaceC3163lP.f(-1209499798);
            boolean zR = interfaceC3163lP.R(mVar);
            Object objG3 = interfaceC3163lP.g();
            if (zR || objG3 == aVar2.a()) {
                objG3 = new b(mVar);
                interfaceC3163lP.H(objG3);
            }
            interfaceC3163lP.N();
            k kVar = (k) ((X6.h) objG3);
            interfaceC3163lP.f(-1209499727);
            boolean zR2 = interfaceC3163lP.R(mVar);
            Object objG4 = interfaceC3163lP.g();
            if (zR2 || objG4 == aVar2.a()) {
                objG4 = new c(mVar);
                interfaceC3163lP.H(objG4);
            }
            interfaceC3163lP.N();
            o oVar = (o) ((X6.h) objG4);
            interfaceC3163lP.f(-1209499665);
            boolean zR3 = interfaceC3163lP.R(mVar);
            Object objG5 = interfaceC3163lP.g();
            if (zR3 || objG5 == aVar2.a()) {
                objG5 = new d(mVar);
                interfaceC3163lP.H(objG5);
            }
            interfaceC3163lP.N();
            Function0 function0 = (Function0) ((X6.h) objG5);
            C0770e c0770e = new C0770e(mVar, context);
            f fVar = new f(mVar, bVar2);
            interfaceC3163lP.f(-1209499341);
            boolean zR4 = interfaceC3163lP.R(mVar);
            Object objG6 = interfaceC3163lP.g();
            if (zR4 || objG6 == aVar2.a()) {
                objG6 = new g(mVar);
                interfaceC3163lP.H(objG6);
            }
            interfaceC3163lP.N();
            p170t3.f.a(dVar, kVar, oVar, function0, c0770e, fVar, (Function0) ((X6.h) objG6), bVar, null, null, interfaceC3163lP, 64, 768);
            interfaceC3163lP = interfaceC3163lP;
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new h(i8));
        }
    }
}
