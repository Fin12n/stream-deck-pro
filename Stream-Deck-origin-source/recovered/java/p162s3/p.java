package p162s3;

import C6.G;
import N3.r;
import Q6.o;
import Z6.w;
import com.elgato.streamdeck.DiKt;
import com.elgato.streamdeck.vsd2.KnownHost;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p065h1.I0;
import p082j0.T;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class p extends p210y3.a implements p210y3.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f33082b = new c(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a extends C2639q implements Function0 {
        public a(Object obj) {
            super(0, obj, r.class, "createDevice", "createDevice()V", 0);
        }

        public final void h() {
            ((r) this.receiver).g();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            h();
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T f33084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f33085c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(T t8, int i8) {
            super(2);
            this.f33084b = t8;
            this.f33085c = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
            p.this.s(this.f33084b, interfaceC3163l, F0.a(this.f33085c | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws A5.f {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {
        public /* synthetic */ c(AbstractC2633k abstractC2633k) {
            this();
        }

        public c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f33087b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i8) {
            super(2);
            this.f33087b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
            p.this.m(interfaceC3163l, F0.a(this.f33087b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws A5.f {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class e extends C2639q implements Q6.k {
        public e(Object obj) {
            super(1, obj, r.class, "selectAppearance", "selectAppearance(Lcom/elgato/streamdeck/vsd2/KnownHost$Device$Appearance;)V", 0);
        }

        public final void h(KnownHost.Device.Appearance p8) {
            t.g(p8, "p0");
            ((r) this.receiver).n(p8);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            h((KnownHost.Device.Appearance) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class f extends C2639q implements Q6.k {
        public f(Object obj) {
            super(1, obj, r.class, "updateName", "updateName(Ljava/lang/String;)V", 0);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return G.f1419a;
        }

        public final void invoke(String p8) {
            t.g(p8, "p0");
            ((r) this.receiver).o(p8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class g extends C2639q implements Function0 {
        public g(Object obj) {
            super(0, obj, r.class, "deleteDevice", "deleteDevice()V", 0);
        }

        public final void h() {
            ((r) this.receiver).h();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            h();
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class h extends C2639q implements Function0 {
        public h(Object obj) {
            super(0, obj, r.class, "deleteDeviceConfirmed", "deleteDeviceConfirmed()V", 0);
        }

        public final void h() {
            ((r) this.receiver).i();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            h();
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class i extends C2639q implements Function0 {
        public i(Object obj) {
            super(0, obj, r.class, "dismissAlert", "dismissAlert()V", 0);
        }

        public final void h() {
            ((r) this.receiver).k();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            h();
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V2.b f33088a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(V2.b bVar) {
            super(0);
            this.f33088a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m263invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m263invoke() {
            V2.b bVar = this.f33088a;
            D3.d dVar = new D3.d();
            if (bVar.l() instanceof D3.d) {
                return;
            }
            bVar.o(dVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class k extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V2.b f33089a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(V2.b bVar) {
            super(0);
            this.f33089a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m264invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m264invoke() {
            V2.b bVar = this.f33089a;
            F3.a aVar = new F3.a();
            if (bVar.l() instanceof F3.a) {
                return;
            }
            bVar.o(aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V2.b f33090a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(V2.b bVar) {
            super(0);
            this.f33090a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m265invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m265invoke() {
            V2.b bVar = this.f33090a;
            C3.j jVar = new C3.j();
            if (bVar.l() instanceof C3.j) {
                return;
            }
            bVar.o(jVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class m extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f33092b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(int i8) {
            super(2);
            this.f33092b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
            p.this.u(interfaceC3163l, F0.a(this.f33092b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws A5.f {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    @Override // T2.a
    public void m(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-313015259);
        if ((i8 & 1) == 0 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-313015259, i8, -1, "com.elgato.streamdeck.discovery.VirtualDeviceSettingsScreen.Content (VirtualDeviceSettingsScreen.kt:114)");
            }
            V2.b bVar = (V2.b) V2.d.e(V2.d.f(), interfaceC3163lP, 0);
            interfaceC3163lP.f(1853070191);
            A5.a aVar = new A5.a(r.class, false, null, null);
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
            r rVar = (r) objG;
            q1 q1VarB = p137p2.a.b(rVar.l(), null, null, null, interfaceC3163lP, 8, 7);
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
            O3.b bVar2 = (O3.b) objG2;
            if (((r.d) q1VarB.getValue()).e()) {
                rVar.j();
                bVar.n();
            }
            T3.a.C0274a c0274aC = ((r.d) q1VarB.getValue()).c();
            interfaceC3163lP.f(-1440316798);
            if (c0274aC != null) {
                if (P3.f.l(c0274aC.a())) {
                    interfaceC3163lP.f(220608629);
                    H3.e.b(q.b(f33082b, P3.f.j(c0274aC.a())), interfaceC3163lP, 8);
                    interfaceC3163lP.N();
                } else {
                    interfaceC3163lP.f(220608747);
                    H3.e.b(q.c(f33082b, P3.f.h(c0274aC.a()), P3.f.j(c0274aC.a())), interfaceC3163lP, 8);
                    interfaceC3163lP.N();
                }
                G g8 = G.f1419a;
            }
            interfaceC3163lP.N();
            r.d dVar = (r.d) q1VarB.getValue();
            interfaceC3163lP.f(-1440316356);
            boolean zR = interfaceC3163lP.R(rVar);
            Object objG3 = interfaceC3163lP.g();
            if (zR || objG3 == aVar2.a()) {
                objG3 = new e(rVar);
                interfaceC3163lP.H(objG3);
            }
            X6.h hVar3 = (X6.h) objG3;
            interfaceC3163lP.N();
            interfaceC3163lP.f(-1440316064);
            boolean zR2 = interfaceC3163lP.R(rVar);
            Object objG4 = interfaceC3163lP.g();
            if (zR2 || objG4 == aVar2.a()) {
                objG4 = new f(rVar);
                interfaceC3163lP.H(objG4);
            }
            X6.h hVar4 = (X6.h) objG4;
            interfaceC3163lP.N();
            interfaceC3163lP.f(-1440316018);
            boolean zR3 = interfaceC3163lP.R(rVar);
            Object objG5 = interfaceC3163lP.g();
            if (zR3 || objG5 == aVar2.a()) {
                objG5 = new g(rVar);
                interfaceC3163lP.H(objG5);
            }
            X6.h hVar5 = (X6.h) objG5;
            interfaceC3163lP.N();
            interfaceC3163lP.f(-1440315961);
            boolean zR4 = interfaceC3163lP.R(rVar);
            Object objG6 = interfaceC3163lP.g();
            if (zR4 || objG6 == aVar2.a()) {
                objG6 = new h(rVar);
                interfaceC3163lP.H(objG6);
            }
            X6.h hVar6 = (X6.h) objG6;
            interfaceC3163lP.N();
            interfaceC3163lP.f(-1440315898);
            boolean zR5 = interfaceC3163lP.R(rVar);
            Object objG7 = interfaceC3163lP.g();
            if (zR5 || objG7 == aVar2.a()) {
                objG7 = new i(rVar);
                interfaceC3163lP.H(objG7);
            }
            interfaceC3163lP.N();
            q.a(dVar, new j(bVar), (Q6.k) hVar3, new k(bVar), (Q6.k) hVar4, new l(bVar), null, (Function0) hVar5, (Function0) hVar6, (Function0) ((X6.h) objG7), bVar2, interfaceC3163lP, 0, 0, 64);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new d(i8));
        }
    }

    @Override // p210y3.b
    public void s(T rowScope, InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
        t.g(rowScope, "rowScope");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1285760431);
        if ((i8 & 1) == 0 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1285760431, i8, -1, "com.elgato.streamdeck.discovery.VirtualDeviceSettingsScreen.Actions (VirtualDeviceSettingsScreen.kt:94)");
            }
            interfaceC3163lP.f(1853070191);
            A5.a aVar = new A5.a(r.class, false, null, null);
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
            r rVar = (r) objG;
            r.d dVar = (r.d) p137p2.a.b(rVar.l(), null, null, null, interfaceC3163lP, 8, 7).getValue();
            T3.a.C0274a c0274aC = dVar.c();
            if (c0274aC != null) {
                interfaceC3163lP.f(1765800596);
                if (P3.f.l(c0274aC.a())) {
                    int i9 = p194w3.b.f37053r;
                    L0.i iVarA = I0.a(androidx.compose.foundation.layout.e.k(L0.i.f4836a, W3.c.f11463a.h(), 0.0f, 2, null), "connect_button");
                    J3.d dVar2 = J3.d.ACCENT;
                    J3.c cVar = J3.c.L;
                    boolean zA = dVar.a();
                    interfaceC3163lP.f(-1411803142);
                    boolean zR = interfaceC3163lP.R(rVar);
                    Object objG2 = interfaceC3163lP.g();
                    if (zR || objG2 == aVar2.a()) {
                        objG2 = new a(rVar);
                        interfaceC3163lP.H(objG2);
                    }
                    interfaceC3163lP.N();
                    J3.b.a(i9, iVarA, null, dVar2, cVar, null, zA, (Function0) ((X6.h) objG2), interfaceC3163lP, 27648, 36);
                    interfaceC3163lP = interfaceC3163lP;
                }
                interfaceC3163lP.N();
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(rowScope, i8));
        }
    }

    @Override // p210y3.b
    public void u(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1163107460);
        if ((i8 & 1) == 0 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1163107460, i8, -1, "com.elgato.streamdeck.discovery.VirtualDeviceSettingsScreen.Title (VirtualDeviceSettingsScreen.kt:73)");
            }
            interfaceC3163lP.f(1853070191);
            A5.a aVar = new A5.a(r.class, false, null, null);
            A5.h hVar = (A5.h) interfaceC3163lP.e(DiKt.d());
            interfaceC3163lP.f(1468160259);
            Object objG = interfaceC3163lP.g();
            if (objG == InterfaceC3163l.f38803a.a()) {
                objG = hVar.h(aVar, null);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            T3.a.C0274a c0274aC = ((r.d) p137p2.a.b(((r) objG).l(), null, null, null, interfaceC3163lP, 8, 7).getValue()).c();
            if (c0274aC != null) {
                if (P3.f.l(c0274aC.a())) {
                    interfaceC3163lP.f(-1973797664);
                    p210y3.c.b(p101l1.f.b(p194w3.b.f37065v, interfaceC3163lP, 0), c0274aC.b().getDisplayName(), interfaceC3163lP, 0, 0);
                    interfaceC3163lP.N();
                } else {
                    interfaceC3163lP.f(-1973797449);
                    String displayName = c0274aC.b().getDisplayName();
                    t.f(displayName, "getDisplayName(...)");
                    String displayName2 = c0274aC.a().getDisplayName();
                    p210y3.c.b(displayName, displayName2 == null || w.b0(displayName2) ? null : displayName2, interfaceC3163lP, 0, 0);
                    interfaceC3163lP.N();
                }
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new m(i8));
        }
    }
}
