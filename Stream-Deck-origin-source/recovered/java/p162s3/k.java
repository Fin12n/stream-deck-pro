package p162s3;

import A1.n;
import A1.r;
import C6.G;
import C6.v;
import J3.j;
import L0.i;
import Q6.o;
import Q6.p;
import com.elgato.streamdeck.vsd2.KnownHost;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p028d0.AbstractC2203e;
import p028d0.InterfaceC2204f;
import p037e0.AbstractC2214j;
import p038e1.AbstractC2252x;
import p038e1.U;
import p055g0.AbstractC2324e;
import p055g0.B;
import p055g0.C2325f;
import p055g0.s;
import p056g1.InterfaceC2343g;
import p065h1.I0;
import p065h1.X;
import p082j0.AbstractC2601e;
import p082j0.AbstractC2607k;
import p082j0.C2598b;
import p082j0.C2609m;
import p082j0.InterfaceC2608l;
import p154r3.h;
import p191w0.AbstractC3085t;
import p191w0.N;
import p191w0.O;
import p191w0.Z;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.InterfaceC3184w;
import p215z0.P0;
import p215z0.R0;
import p215z0.l1;
import p215z0.v1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f32985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N3.f.b f32986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Q6.k f32987c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C2325f f32988d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ A1.d f32989e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f32990f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Q6.k f32991g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Q6.k f32992h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f32993i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ o f32994j;

        /* JADX INFO: renamed from: s3.k$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0744a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C2325f f32995a;

            /* JADX INFO: renamed from: s3.k$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0745a extends u implements Q6.k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ long f32996a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0745a(long j8) {
                    super(1);
                    this.f32996a = j8;
                }

                public final void b(s DraggableAnchors) {
                    t.g(DraggableAnchors, "$this$DraggableAnchors");
                    DraggableAnchors.a(j.Start, -r.g(this.f32996a));
                    DraggableAnchors.a(j.Center, 0.0f);
                }

                @Override // Q6.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((s) obj);
                    return G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0744a(C2325f c2325f) {
                super(1);
                this.f32995a = c2325f;
            }

            public final void b(long j8) {
                C2325f.F(this.f32995a, AbstractC2324e.a(new C0745a(j8)), null, 2, null);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((r) obj).j());
                return G.f1419a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ N3.f.b f32997a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Q6.k f32998b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(N3.f.b bVar, Q6.k kVar) {
                super(0);
                this.f32997a = bVar;
                this.f32998b = kVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m258invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m258invoke() {
                V3.f.b(k.c(this.f32997a.j()));
                this.f32998b.invoke(this.f32997a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C2325f f32999a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C2325f c2325f) {
                super(1);
                this.f32999a = c2325f;
            }

            public final long b(A1.d offset) {
                t.g(offset, "$this$offset");
                return A1.o.a(S6.c.d(this.f32999a.w()), 0);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return n.b(b((A1.d) obj));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class d extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ A1.d f33000a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f33001b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(A1.d dVar, H h8) {
                super(1);
                this.f33000a = dVar;
                this.f33001b = h8;
            }

            public final void b(long j8) {
                int iF = (int) ((r.f(j8) * 1.0f) / this.f33000a.getDensity());
                H h8 = this.f33001b;
                if (iF != h8.f28777a) {
                    h8.f28777a = iF;
                }
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((r) obj).j());
                return G.f1419a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class e extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3164l0 f33002a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ N3.f.b f33003b;

            /* JADX INFO: renamed from: s3.k$a$e$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0746a extends u implements Function0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ InterfaceC3164l0 f33004a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0746a(InterfaceC3164l0 interfaceC3164l0) {
                    super(0);
                    this.f33004a = interfaceC3164l0;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m259invoke();
                    return G.f1419a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m259invoke() {
                    InterfaceC3164l0 interfaceC3164l0 = this.f33004a;
                    interfaceC3164l0.setValue(Boolean.valueOf(!((Boolean) interfaceC3164l0.getValue()).booleanValue()));
                }
            }

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class b extends u implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ InterfaceC3164l0 f33005a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(InterfaceC3164l0 interfaceC3164l0) {
                    super(2);
                    this.f33005a = interfaceC3164l0;
                }

                public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                    U0.b bVarD;
                    if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                        interfaceC3163l.z();
                        return;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-1288340825, i8, -1, "com.elgato.streamdeck.discovery.KnownHostCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (KnownHostCard.kt:135)");
                    }
                    if (((Boolean) this.f33005a.getValue()).booleanValue()) {
                        interfaceC3163l.f(534943635);
                        bVarD = p101l1.c.d(h.f32468S, interfaceC3163l, 0);
                        interfaceC3163l.N();
                    } else {
                        interfaceC3163l.f(534943748);
                        bVarD = p101l1.c.d(h.f32467R, interfaceC3163l, 0);
                        interfaceC3163l.N();
                    }
                    O.a(bVarD, p101l1.f.b(p194w3.b.f37074y, interfaceC3163l, 0), null, 0L, interfaceC3163l, 8, 12);
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
            public e(InterfaceC3164l0 interfaceC3164l0, N3.f.b bVar) {
                super(2);
                this.f33002a = interfaceC3164l0;
                this.f33003b = bVar;
            }

            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(393584612, i8, -1, "com.elgato.streamdeck.discovery.KnownHostCard.<anonymous>.<anonymous>.<anonymous> (KnownHostCard.kt:131)");
                }
                interfaceC3163l.f(-875365017);
                boolean zR = interfaceC3163l.R(this.f33002a);
                InterfaceC3164l0 interfaceC3164l0 = this.f33002a;
                Object objG = interfaceC3163l.g();
                if (zR || objG == InterfaceC3163l.f38803a.a()) {
                    objG = new C0746a(interfaceC3164l0);
                    interfaceC3163l.H(objG);
                }
                interfaceC3163l.N();
                N.a((Function0) objG, I0.a(i.f4836a, I3.a.f3771a.c(this.f33003b.e())), false, null, null, H0.c.b(interfaceC3163l, -1288340825, true, new b(this.f33002a)), interfaceC3163l, 196608, 28);
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
        public static final class f extends u implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ N3.f.b f33006a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f33007b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Q6.k f33008c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Q6.k f33009d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f33010e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ o f33011f;

            /* JADX INFO: renamed from: s3.k$a$f$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0747a extends u implements Function0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Q6.k f33012a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ N3.f.b f33013b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0747a(Q6.k kVar, N3.f.b bVar) {
                    super(0);
                    this.f33012a = kVar;
                    this.f33013b = bVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m260invoke();
                    return G.f1419a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m260invoke() {
                    this.f33012a.invoke(this.f33013b);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class b extends u implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ N3.f.b f33014a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(N3.f.b bVar) {
                    super(2);
                    this.f33014a = bVar;
                }

                public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                    if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                        interfaceC3163l.z();
                        return;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-886465086, i8, -1, "com.elgato.streamdeck.discovery.KnownHostCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (KnownHostCard.kt:193)");
                    }
                    O.a(p101l1.c.d(h.f32462M, interfaceC3163l, 0), p101l1.f.b(p194w3.b.f37068w, interfaceC3163l, 0), I0.a(androidx.compose.foundation.layout.f.l(i.f4836a, A1.h.m(24)), I3.a.f3771a.a(this.f33014a.e())), 0L, interfaceC3163l, 8, 8);
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
            public f(N3.f.b bVar, boolean z8, Q6.k kVar, Q6.k kVar2, String str, o oVar) {
                super(3);
                this.f33006a = bVar;
                this.f33007b = z8;
                this.f33008c = kVar;
                this.f33009d = kVar2;
                this.f33010e = str;
                this.f33011f = oVar;
            }

            public final void b(InterfaceC2204f AnimatedVisibility, InterfaceC3163l interfaceC3163l, int i8) {
                t.g(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(966195919, i8, -1, "com.elgato.streamdeck.discovery.KnownHostCard.<anonymous>.<anonymous> (KnownHostCard.kt:169)");
                }
                N3.f.b bVar = this.f33006a;
                boolean z8 = this.f33007b;
                Q6.k kVar = this.f33008c;
                Q6.k kVar2 = this.f33009d;
                String str = this.f33010e;
                o oVar = this.f33011f;
                interfaceC3163l.f(-483455358);
                i.a aVar = i.f4836a;
                p038e1.H hA = AbstractC2607k.a(C2598b.f27914a.g(), L0.c.f4806a.i(), interfaceC3163l, 0);
                interfaceC3163l.f(-1323940314);
                int iA = AbstractC3157i.a(interfaceC3163l, 0);
                InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
                InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
                Function0 function0A = aVar2.a();
                p pVarB = AbstractC2252x.b(aVar);
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
                interfaceC3163l.f(-875363264);
                int i9 = 0;
                for (Object obj : bVar.d()) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        D6.r.x();
                    }
                    KnownHost.Device device = (KnownHost.Device) obj;
                    interfaceC3163l.f(-875363214);
                    if (i9 < bVar.d().size()) {
                        j.a(0.0f, interfaceC3163l, 0, 1);
                    }
                    interfaceC3163l.N();
                    t.d(device);
                    p162s3.d.a(device, bVar, z8, kVar2, str == null ? false : P3.b.d(str, P3.f.e(device)), oVar, interfaceC3163l, 0, 0);
                    i9 = i10;
                }
                interfaceC3163l.N();
                interfaceC3163l.f(-1862827074);
                if (bVar.t()) {
                    j.a(0.0f, interfaceC3163l, 0, 1);
                    String strB = p101l1.f.b(p194w3.b.f37065v, interfaceC3163l, 0);
                    boolean z9 = !z8;
                    i iVarB = androidx.compose.foundation.c.b(i.f4836a, Z.f35786a.a(interfaceC3163l, Z.f35787b).G(), null, 2, null);
                    boolean z10 = !z8;
                    interfaceC3163l.f(-875362309);
                    boolean zR = interfaceC3163l.R(kVar) | interfaceC3163l.R(bVar);
                    Object objG = interfaceC3163l.g();
                    if (zR || objG == InterfaceC3163l.f38803a.a()) {
                        objG = new C0747a(kVar, bVar);
                        interfaceC3163l.H(objG);
                    }
                    interfaceC3163l.N();
                    p162s3.e.a(strB, androidx.compose.foundation.d.e(iVarB, z10, null, null, (Function0) objG, 6, null), null, z9, null, H0.c.b(interfaceC3163l, -886465086, true, new b(bVar)), null, interfaceC3163l, 196608, 84);
                }
                interfaceC3163l.N();
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
                b((InterfaceC2204f) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3164l0 interfaceC3164l0, N3.f.b bVar, Q6.k kVar, C2325f c2325f, A1.d dVar, boolean z8, Q6.k kVar2, Q6.k kVar3, String str, o oVar) {
            super(3);
            this.f32985a = interfaceC3164l0;
            this.f32986b = bVar;
            this.f32987c = kVar;
            this.f32988d = c2325f;
            this.f32989e = dVar;
            this.f32990f = z8;
            this.f32991g = kVar2;
            this.f32992h = kVar3;
            this.f32993i = str;
            this.f32994j = oVar;
        }

        public final void b(InterfaceC2608l Card, InterfaceC3163l interfaceC3163l, int i8) {
            int i9;
            t.g(Card, "$this$Card");
            if ((i8 & 14) == 0) {
                i9 = i8 | (interfaceC3163l.R(Card) ? 4 : 2);
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1540756647, i9, -1, "com.elgato.streamdeck.discovery.KnownHostCard.<anonymous> (KnownHostCard.kt:93)");
            }
            i.a aVar = i.f4836a;
            i iVarH = androidx.compose.foundation.layout.f.h(aVar, 0.0f, 1, null);
            N3.f.b bVar = this.f32986b;
            Q6.k kVar = this.f32987c;
            C2325f c2325f = this.f32988d;
            A1.d dVar = this.f32989e;
            InterfaceC3164l0 interfaceC3164l0 = this.f32985a;
            interfaceC3163l.f(733328855);
            L0.c.a aVar2 = L0.c.f4806a;
            p038e1.H hG = AbstractC2601e.g(aVar2.m(), false, interfaceC3163l, 0);
            interfaceC3163l.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163l, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
            InterfaceC2343g.a aVar3 = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar3.a();
            p pVarB = AbstractC2252x.b(iVarH);
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
            v1.b(interfaceC3163lA, hG, aVar3.c());
            v1.b(interfaceC3163lA, interfaceC3184wE, aVar3.e());
            o oVarB = aVar3.b();
            if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
            interfaceC3163l.f(2058660585);
            androidx.compose.foundation.layout.b bVar2 = androidx.compose.foundation.layout.b.f14485a;
            H h8 = new H();
            h8.f28777a = 72;
            int i10 = p194w3.b.f37056s;
            i iVarI = androidx.compose.foundation.layout.f.i(bVar2.c(aVar, aVar2.l()), A1.h.m(h8.f28777a));
            interfaceC3163l.f(-1862830451);
            Object objG = interfaceC3163l.g();
            InterfaceC3163l.a aVar4 = InterfaceC3163l.f38803a;
            if (objG == aVar4.a()) {
                objG = new C0744a(c2325f);
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            i iVarA = U.a(iVarI, (Q6.k) objG);
            J3.d dVar2 = J3.d.DANGER;
            float f8 = 0;
            p135p0.f fVar = new p135p0.f(p135p0.c.b(A1.h.m(f8)), p135p0.c.b(A1.h.m(16)), p135p0.c.b(A1.h.m(f8)), p135p0.c.b(A1.h.m(f8)));
            interfaceC3163l.f(-1862829920);
            boolean zR = interfaceC3163l.R(bVar) | interfaceC3163l.R(kVar);
            Object objG2 = interfaceC3163l.g();
            if (zR || objG2 == aVar4.a()) {
                objG2 = new b(bVar, kVar);
                interfaceC3163l.H(objG2);
            }
            interfaceC3163l.N();
            int i11 = i9;
            J3.b.a(i10, iVarA, null, dVar2, null, fVar, false, (Function0) objG2, interfaceC3163l, 3072, 84);
            String strE = bVar.e();
            String strA = p101l1.f.a(p194w3.a.f36922a, bVar.d().size(), new Object[]{Integer.valueOf(bVar.d().size())}, interfaceC3163l, 512);
            boolean zT = bVar.t();
            interfaceC3163l.f(-1862828599);
            Object objG3 = interfaceC3163l.g();
            if (objG3 == aVar4.a()) {
                objG3 = new c(c2325f);
                interfaceC3163l.H(objG3);
            }
            interfaceC3163l.N();
            p162s3.e.a(strE, U.a(AbstractC2324e.e(androidx.compose.foundation.layout.d.a(aVar, (Q6.k) objG3), c2325f, B.Horizontal, false, false, null, false, 60, null), new d(dVar, h8)), strA, zT, null, null, H0.c.b(interfaceC3163l, 393584612, true, new e(interfaceC3164l0, bVar)), interfaceC3163l, 1572864, 48);
            interfaceC3163l.N();
            interfaceC3163l.O();
            interfaceC3163l.N();
            interfaceC3163l.N();
            AbstractC2203e.d(Card, ((Boolean) this.f32985a.getValue()).booleanValue(), null, null, null, null, H0.c.b(interfaceC3163l, 966195919, true, new f(this.f32986b, this.f32990f, this.f32991g, this.f32992h, this.f32993i, this.f32994j)), interfaceC3163l, (i11 & 14) | 1572864, 30);
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
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ N3.f.b f33015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f33016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f33017c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Q6.k f33018d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Q6.k f33019e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ o f33020f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Q6.k f33021g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ i f33022h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f33023i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f33024j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(N3.f.b bVar, String str, boolean z8, Q6.k kVar, Q6.k kVar2, o oVar, Q6.k kVar3, i iVar, int i8, int i9) {
            super(2);
            this.f33015a = bVar;
            this.f33016b = str;
            this.f33017c = z8;
            this.f33018d = kVar;
            this.f33019e = kVar2;
            this.f33020f = oVar;
            this.f33021g = kVar3;
            this.f33022h = iVar;
            this.f33023i = i8;
            this.f33024j = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            k.a(this.f33015a, this.f33016b, this.f33017c, this.f33018d, this.f33019e, this.f33020f, this.f33021g, this.f33022h, interfaceC3163l, F0.a(this.f33023i | 1), this.f33024j);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ A1.d f33025a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(A1.d dVar) {
            super(1);
            this.f33025a = dVar;
        }

        public final void b(s DraggableAnchors) {
            t.g(DraggableAnchors, "$this$DraggableAnchors");
            DraggableAnchors.a(j.Start, -this.f33025a.E0(A1.h.m(100)));
            DraggableAnchors.a(j.Center, 0.0f);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((s) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f33026a = new d();

        public d() {
            super(1);
        }

        public final Float b(float f8) {
            return Float.valueOf(f8 * 0.5f);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ A1.d f33027a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(A1.d dVar) {
            super(0);
            this.f33027a = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.f33027a.E0(A1.h.m(100)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f33028a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3164l0 invoke() {
            return l1.e(Boolean.TRUE, null, 2, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x015f  */
    /* JADX WARN: Code duplicated, block: B:105:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:55:0x00af  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:90:0x010b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x011b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0120  */
    /* JADX WARN: Code duplicated, block: B:99:0x0128  */
    public static final void a(N3.f.b host, String str, boolean z8, Q6.k onDeviceSelected, Q6.k onAddDevice, o onDeviceInfo, Q6.k onDeleteHost, i iVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        boolean z9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        i iVar2;
        int i16;
        i iVar3;
        A1.d dVar;
        Object objG;
        InterfaceC3163l interfaceC3163l2;
        i iVar4;
        P0 p0V;
        t.g(host, "host");
        t.g(onDeviceSelected, "onDeviceSelected");
        t.g(onAddDevice, "onAddDevice");
        t.g(onDeviceInfo, "onDeviceInfo");
        t.g(onDeleteHost, "onDeleteHost");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1520354215);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.R(host) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            i10 |= interfaceC3163lP.R(str != null ? P3.b.a(str) : null) ? 32 : 16;
        }
        if ((i9 & 4) == 0) {
            if ((i8 & 896) == 0) {
                z9 = z8;
                i10 |= interfaceC3163lP.c(z9) ? 256 : 128;
            }
            if ((i9 & 8) != 0) {
                i10 |= 3072;
            } else if ((i8 & 7168) == 0) {
                if (interfaceC3163lP.l(onDeviceSelected)) {
                    i11 = 2048;
                } else {
                    i11 = 1024;
                }
                i10 |= i11;
            }
            if ((i9 & 16) != 0) {
                i10 |= 24576;
            } else if ((57344 & i8) == 0) {
                if (interfaceC3163lP.l(onAddDevice)) {
                    i12 = 16384;
                } else {
                    i12 = 8192;
                }
                i10 |= i12;
            }
            if ((i9 & 32) != 0) {
                i10 |= 196608;
            } else if ((458752 & i8) == 0) {
                if (interfaceC3163lP.l(onDeviceInfo)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i10 |= i13;
            }
            if ((i9 & 64) != 0) {
                if ((3670016 & i8) == 0) {
                    if (interfaceC3163lP.l(onDeleteHost)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                }
                i15 = i9 & 128;
                if (i15 != 0) {
                    if ((29360128 & i8) == 0) {
                        iVar2 = iVar;
                        if (interfaceC3163lP.R(iVar2)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i10 |= i16;
                    }
                    if ((23967451 & i10) == 4793490 || !interfaceC3163lP.s()) {
                        if (i15 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-1520354215, i10, -1, "com.elgato.streamdeck.discovery.KnownHostCard (KnownHostCard.kt:71)");
                        }
                        InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], null, null, f.f33028a, interfaceC3163lP, 3080, 6);
                        dVar = (A1.d) interfaceC3163lP.e(X.d());
                        interfaceC3163lP.f(-1078742755);
                        objG = interfaceC3163lP.g();
                        if (objG == InterfaceC3163l.f38803a.a()) {
                            objG = new C2325f(j.Center, AbstractC2324e.a(new c(dVar)), d.f33026a, new e(dVar), AbstractC2214j.i(0, 0, null, 7, null), null, 32, null);
                            interfaceC3163lP.H(objG);
                        }
                        interfaceC3163lP.N();
                        interfaceC3163l2 = interfaceC3163lP;
                        i iVar5 = iVar3;
                        AbstractC3085t.a(iVar5, null, null, null, null, H0.c.b(interfaceC3163lP, 1540756647, true, new a(interfaceC3164l0, host, onDeleteHost, (C2325f) objG, dVar, z9, onAddDevice, onDeviceSelected, str, onDeviceInfo)), interfaceC3163l2, ((i10 >> 21) & 14) | 196608, 30);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        iVar4 = iVar5;
                    } else {
                        interfaceC3163lP.z();
                        interfaceC3163l2 = interfaceC3163lP;
                        iVar4 = iVar2;
                    }
                    p0V = interfaceC3163l2.v();
                    if (p0V != null) {
                        p0V.a(new b(host, str, z8, onDeviceSelected, onAddDevice, onDeviceInfo, onDeleteHost, iVar4, i8, i9));
                    }
                }
                i10 |= 12582912;
                iVar2 = iVar;
                if ((23967451 & i10) == 4793490) {
                    if (i15 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-1520354215, i10, -1, "com.elgato.streamdeck.discovery.KnownHostCard (KnownHostCard.kt:71)");
                    }
                    InterfaceC3164l0 interfaceC3164l1 = (InterfaceC3164l0) I0.b.b(new Object[0], null, null, f.f33028a, interfaceC3163lP, 3080, 6);
                    dVar = (A1.d) interfaceC3163lP.e(X.d());
                    interfaceC3163lP.f(-1078742755);
                    objG = interfaceC3163lP.g();
                    if (objG == InterfaceC3163l.f38803a.a()) {
                        objG = new C2325f(j.Center, AbstractC2324e.a(new c(dVar)), d.f33026a, new e(dVar), AbstractC2214j.i(0, 0, null, 7, null), null, 32, null);
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC3163lP.N();
                    interfaceC3163l2 = interfaceC3163lP;
                    i iVar6 = iVar3;
                    AbstractC3085t.a(iVar6, null, null, null, null, H0.c.b(interfaceC3163lP, 1540756647, true, new a(interfaceC3164l1, host, onDeleteHost, (C2325f) objG, dVar, z9, onAddDevice, onDeviceSelected, str, onDeviceInfo)), interfaceC3163l2, ((i10 >> 21) & 14) | 196608, 30);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar6;
                } else {
                    if (i15 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-1520354215, i10, -1, "com.elgato.streamdeck.discovery.KnownHostCard (KnownHostCard.kt:71)");
                    }
                    InterfaceC3164l0 interfaceC3164l2 = (InterfaceC3164l0) I0.b.b(new Object[0], null, null, f.f33028a, interfaceC3163lP, 3080, 6);
                    dVar = (A1.d) interfaceC3163lP.e(X.d());
                    interfaceC3163lP.f(-1078742755);
                    objG = interfaceC3163lP.g();
                    if (objG == InterfaceC3163l.f38803a.a()) {
                        objG = new C2325f(j.Center, AbstractC2324e.a(new c(dVar)), d.f33026a, new e(dVar), AbstractC2214j.i(0, 0, null, 7, null), null, 32, null);
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC3163lP.N();
                    interfaceC3163l2 = interfaceC3163lP;
                    i iVar7 = iVar3;
                    AbstractC3085t.a(iVar7, null, null, null, null, H0.c.b(interfaceC3163lP, 1540756647, true, new a(interfaceC3164l2, host, onDeleteHost, (C2325f) objG, dVar, z9, onAddDevice, onDeviceSelected, str, onDeviceInfo)), interfaceC3163l2, ((i10 >> 21) & 14) | 196608, 30);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar7;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new b(host, str, z8, onDeviceSelected, onAddDevice, onDeviceInfo, onDeleteHost, iVar4, i8, i9));
                }
            }
            i14 = 1572864;
            i10 |= i14;
            i15 = i9 & 128;
            if (i15 != 0) {
                if ((29360128 & i8) == 0) {
                    iVar2 = iVar;
                    if (interfaceC3163lP.R(iVar2)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i10 |= i16;
                }
                if ((23967451 & i10) == 4793490) {
                    if (i15 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-1520354215, i10, -1, "com.elgato.streamdeck.discovery.KnownHostCard (KnownHostCard.kt:71)");
                    }
                    InterfaceC3164l0 interfaceC3164l3 = (InterfaceC3164l0) I0.b.b(new Object[0], null, null, f.f33028a, interfaceC3163lP, 3080, 6);
                    dVar = (A1.d) interfaceC3163lP.e(X.d());
                    interfaceC3163lP.f(-1078742755);
                    objG = interfaceC3163lP.g();
                    if (objG == InterfaceC3163l.f38803a.a()) {
                        objG = new C2325f(j.Center, AbstractC2324e.a(new c(dVar)), d.f33026a, new e(dVar), AbstractC2214j.i(0, 0, null, 7, null), null, 32, null);
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC3163lP.N();
                    interfaceC3163l2 = interfaceC3163lP;
                    i iVar8 = iVar3;
                    AbstractC3085t.a(iVar8, null, null, null, null, H0.c.b(interfaceC3163lP, 1540756647, true, new a(interfaceC3164l3, host, onDeleteHost, (C2325f) objG, dVar, z9, onAddDevice, onDeviceSelected, str, onDeviceInfo)), interfaceC3163l2, ((i10 >> 21) & 14) | 196608, 30);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar8;
                } else {
                    if (i15 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-1520354215, i10, -1, "com.elgato.streamdeck.discovery.KnownHostCard (KnownHostCard.kt:71)");
                    }
                    InterfaceC3164l0 interfaceC3164l4 = (InterfaceC3164l0) I0.b.b(new Object[0], null, null, f.f33028a, interfaceC3163lP, 3080, 6);
                    dVar = (A1.d) interfaceC3163lP.e(X.d());
                    interfaceC3163lP.f(-1078742755);
                    objG = interfaceC3163lP.g();
                    if (objG == InterfaceC3163l.f38803a.a()) {
                        objG = new C2325f(j.Center, AbstractC2324e.a(new c(dVar)), d.f33026a, new e(dVar), AbstractC2214j.i(0, 0, null, 7, null), null, 32, null);
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC3163lP.N();
                    interfaceC3163l2 = interfaceC3163lP;
                    i iVar9 = iVar3;
                    AbstractC3085t.a(iVar9, null, null, null, null, H0.c.b(interfaceC3163lP, 1540756647, true, new a(interfaceC3164l4, host, onDeleteHost, (C2325f) objG, dVar, z9, onAddDevice, onDeviceSelected, str, onDeviceInfo)), interfaceC3163l2, ((i10 >> 21) & 14) | 196608, 30);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar9;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new b(host, str, z8, onDeviceSelected, onAddDevice, onDeviceInfo, onDeleteHost, iVar4, i8, i9));
                }
            }
            i10 |= 12582912;
            iVar2 = iVar;
            if ((23967451 & i10) == 4793490) {
                if (i15 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1520354215, i10, -1, "com.elgato.streamdeck.discovery.KnownHostCard (KnownHostCard.kt:71)");
                }
                InterfaceC3164l0 interfaceC3164l5 = (InterfaceC3164l0) I0.b.b(new Object[0], null, null, f.f33028a, interfaceC3163lP, 3080, 6);
                dVar = (A1.d) interfaceC3163lP.e(X.d());
                interfaceC3163lP.f(-1078742755);
                objG = interfaceC3163lP.g();
                if (objG == InterfaceC3163l.f38803a.a()) {
                    objG = new C2325f(j.Center, AbstractC2324e.a(new c(dVar)), d.f33026a, new e(dVar), AbstractC2214j.i(0, 0, null, 7, null), null, 32, null);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                interfaceC3163l2 = interfaceC3163lP;
                i iVar10 = iVar3;
                AbstractC3085t.a(iVar10, null, null, null, null, H0.c.b(interfaceC3163lP, 1540756647, true, new a(interfaceC3164l5, host, onDeleteHost, (C2325f) objG, dVar, z9, onAddDevice, onDeviceSelected, str, onDeviceInfo)), interfaceC3163l2, ((i10 >> 21) & 14) | 196608, 30);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar10;
            } else {
                if (i15 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1520354215, i10, -1, "com.elgato.streamdeck.discovery.KnownHostCard (KnownHostCard.kt:71)");
                }
                InterfaceC3164l0 interfaceC3164l6 = (InterfaceC3164l0) I0.b.b(new Object[0], null, null, f.f33028a, interfaceC3163lP, 3080, 6);
                dVar = (A1.d) interfaceC3163lP.e(X.d());
                interfaceC3163lP.f(-1078742755);
                objG = interfaceC3163lP.g();
                if (objG == InterfaceC3163l.f38803a.a()) {
                    objG = new C2325f(j.Center, AbstractC2324e.a(new c(dVar)), d.f33026a, new e(dVar), AbstractC2214j.i(0, 0, null, 7, null), null, 32, null);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                interfaceC3163l2 = interfaceC3163lP;
                i iVar11 = iVar3;
                AbstractC3085t.a(iVar11, null, null, null, null, H0.c.b(interfaceC3163lP, 1540756647, true, new a(interfaceC3164l6, host, onDeleteHost, (C2325f) objG, dVar, z9, onAddDevice, onDeviceSelected, str, onDeviceInfo)), interfaceC3163l2, ((i10 >> 21) & 14) | 196608, 30);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar11;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new b(host, str, z8, onDeviceSelected, onAddDevice, onDeviceInfo, onDeleteHost, iVar4, i8, i9));
            }
        }
        i10 |= 384;
        z9 = z8;
        if ((i9 & 8) != 0) {
            i10 |= 3072;
        } else if ((i8 & 7168) == 0) {
            if (interfaceC3163lP.l(onDeviceSelected)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i10 |= i11;
        }
        if ((i9 & 16) != 0) {
            i10 |= 24576;
        } else if ((57344 & i8) == 0) {
            if (interfaceC3163lP.l(onAddDevice)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i10 |= i12;
        }
        if ((i9 & 32) != 0) {
            i10 |= 196608;
        } else if ((458752 & i8) == 0) {
            if (interfaceC3163lP.l(onDeviceInfo)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i10 |= i13;
        }
        if ((i9 & 64) != 0) {
            if ((3670016 & i8) == 0) {
                if (interfaceC3163lP.l(onDeleteHost)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
            }
            i15 = i9 & 128;
            if (i15 != 0) {
                if ((29360128 & i8) == 0) {
                    iVar2 = iVar;
                    if (interfaceC3163lP.R(iVar2)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i10 |= i16;
                }
                if ((23967451 & i10) == 4793490) {
                    if (i15 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-1520354215, i10, -1, "com.elgato.streamdeck.discovery.KnownHostCard (KnownHostCard.kt:71)");
                    }
                    InterfaceC3164l0 interfaceC3164l7 = (InterfaceC3164l0) I0.b.b(new Object[0], null, null, f.f33028a, interfaceC3163lP, 3080, 6);
                    dVar = (A1.d) interfaceC3163lP.e(X.d());
                    interfaceC3163lP.f(-1078742755);
                    objG = interfaceC3163lP.g();
                    if (objG == InterfaceC3163l.f38803a.a()) {
                        objG = new C2325f(j.Center, AbstractC2324e.a(new c(dVar)), d.f33026a, new e(dVar), AbstractC2214j.i(0, 0, null, 7, null), null, 32, null);
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC3163lP.N();
                    interfaceC3163l2 = interfaceC3163lP;
                    i iVar12 = iVar3;
                    AbstractC3085t.a(iVar12, null, null, null, null, H0.c.b(interfaceC3163lP, 1540756647, true, new a(interfaceC3164l7, host, onDeleteHost, (C2325f) objG, dVar, z9, onAddDevice, onDeviceSelected, str, onDeviceInfo)), interfaceC3163l2, ((i10 >> 21) & 14) | 196608, 30);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar12;
                } else {
                    if (i15 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-1520354215, i10, -1, "com.elgato.streamdeck.discovery.KnownHostCard (KnownHostCard.kt:71)");
                    }
                    InterfaceC3164l0 interfaceC3164l8 = (InterfaceC3164l0) I0.b.b(new Object[0], null, null, f.f33028a, interfaceC3163lP, 3080, 6);
                    dVar = (A1.d) interfaceC3163lP.e(X.d());
                    interfaceC3163lP.f(-1078742755);
                    objG = interfaceC3163lP.g();
                    if (objG == InterfaceC3163l.f38803a.a()) {
                        objG = new C2325f(j.Center, AbstractC2324e.a(new c(dVar)), d.f33026a, new e(dVar), AbstractC2214j.i(0, 0, null, 7, null), null, 32, null);
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC3163lP.N();
                    interfaceC3163l2 = interfaceC3163lP;
                    i iVar13 = iVar3;
                    AbstractC3085t.a(iVar13, null, null, null, null, H0.c.b(interfaceC3163lP, 1540756647, true, new a(interfaceC3164l8, host, onDeleteHost, (C2325f) objG, dVar, z9, onAddDevice, onDeviceSelected, str, onDeviceInfo)), interfaceC3163l2, ((i10 >> 21) & 14) | 196608, 30);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    iVar4 = iVar13;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new b(host, str, z8, onDeviceSelected, onAddDevice, onDeviceInfo, onDeleteHost, iVar4, i8, i9));
                }
            }
            i10 |= 12582912;
            iVar2 = iVar;
            if ((23967451 & i10) == 4793490) {
                if (i15 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1520354215, i10, -1, "com.elgato.streamdeck.discovery.KnownHostCard (KnownHostCard.kt:71)");
                }
                InterfaceC3164l0 interfaceC3164l9 = (InterfaceC3164l0) I0.b.b(new Object[0], null, null, f.f33028a, interfaceC3163lP, 3080, 6);
                dVar = (A1.d) interfaceC3163lP.e(X.d());
                interfaceC3163lP.f(-1078742755);
                objG = interfaceC3163lP.g();
                if (objG == InterfaceC3163l.f38803a.a()) {
                    objG = new C2325f(j.Center, AbstractC2324e.a(new c(dVar)), d.f33026a, new e(dVar), AbstractC2214j.i(0, 0, null, 7, null), null, 32, null);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                interfaceC3163l2 = interfaceC3163lP;
                i iVar14 = iVar3;
                AbstractC3085t.a(iVar14, null, null, null, null, H0.c.b(interfaceC3163lP, 1540756647, true, new a(interfaceC3164l9, host, onDeleteHost, (C2325f) objG, dVar, z9, onAddDevice, onDeviceSelected, str, onDeviceInfo)), interfaceC3163l2, ((i10 >> 21) & 14) | 196608, 30);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar14;
            } else {
                if (i15 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1520354215, i10, -1, "com.elgato.streamdeck.discovery.KnownHostCard (KnownHostCard.kt:71)");
                }
                InterfaceC3164l0 interfaceC3164l10 = (InterfaceC3164l0) I0.b.b(new Object[0], null, null, f.f33028a, interfaceC3163lP, 3080, 6);
                dVar = (A1.d) interfaceC3163lP.e(X.d());
                interfaceC3163lP.f(-1078742755);
                objG = interfaceC3163lP.g();
                if (objG == InterfaceC3163l.f38803a.a()) {
                    objG = new C2325f(j.Center, AbstractC2324e.a(new c(dVar)), d.f33026a, new e(dVar), AbstractC2214j.i(0, 0, null, 7, null), null, 32, null);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                interfaceC3163l2 = interfaceC3163lP;
                i iVar15 = iVar3;
                AbstractC3085t.a(iVar15, null, null, null, null, H0.c.b(interfaceC3163lP, 1540756647, true, new a(interfaceC3164l10, host, onDeleteHost, (C2325f) objG, dVar, z9, onAddDevice, onDeviceSelected, str, onDeviceInfo)), interfaceC3163l2, ((i10 >> 21) & 14) | 196608, 30);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar15;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new b(host, str, z8, onDeviceSelected, onAddDevice, onDeviceInfo, onDeleteHost, iVar4, i8, i9));
            }
        }
        i14 = 1572864;
        i10 |= i14;
        i15 = i9 & 128;
        if (i15 != 0) {
            if ((29360128 & i8) == 0) {
                iVar2 = iVar;
                if (interfaceC3163lP.R(iVar2)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i10 |= i16;
            }
            if ((23967451 & i10) == 4793490) {
                if (i15 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1520354215, i10, -1, "com.elgato.streamdeck.discovery.KnownHostCard (KnownHostCard.kt:71)");
                }
                InterfaceC3164l0 interfaceC3164l11 = (InterfaceC3164l0) I0.b.b(new Object[0], null, null, f.f33028a, interfaceC3163lP, 3080, 6);
                dVar = (A1.d) interfaceC3163lP.e(X.d());
                interfaceC3163lP.f(-1078742755);
                objG = interfaceC3163lP.g();
                if (objG == InterfaceC3163l.f38803a.a()) {
                    objG = new C2325f(j.Center, AbstractC2324e.a(new c(dVar)), d.f33026a, new e(dVar), AbstractC2214j.i(0, 0, null, 7, null), null, 32, null);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                interfaceC3163l2 = interfaceC3163lP;
                i iVar16 = iVar3;
                AbstractC3085t.a(iVar16, null, null, null, null, H0.c.b(interfaceC3163lP, 1540756647, true, new a(interfaceC3164l11, host, onDeleteHost, (C2325f) objG, dVar, z9, onAddDevice, onDeviceSelected, str, onDeviceInfo)), interfaceC3163l2, ((i10 >> 21) & 14) | 196608, 30);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar16;
            } else {
                if (i15 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1520354215, i10, -1, "com.elgato.streamdeck.discovery.KnownHostCard (KnownHostCard.kt:71)");
                }
                InterfaceC3164l0 interfaceC3164l12 = (InterfaceC3164l0) I0.b.b(new Object[0], null, null, f.f33028a, interfaceC3163lP, 3080, 6);
                dVar = (A1.d) interfaceC3163lP.e(X.d());
                interfaceC3163lP.f(-1078742755);
                objG = interfaceC3163lP.g();
                if (objG == InterfaceC3163l.f38803a.a()) {
                    objG = new C2325f(j.Center, AbstractC2324e.a(new c(dVar)), d.f33026a, new e(dVar), AbstractC2214j.i(0, 0, null, 7, null), null, 32, null);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                interfaceC3163l2 = interfaceC3163lP;
                i iVar17 = iVar3;
                AbstractC3085t.a(iVar17, null, null, null, null, H0.c.b(interfaceC3163lP, 1540756647, true, new a(interfaceC3164l12, host, onDeleteHost, (C2325f) objG, dVar, z9, onAddDevice, onDeviceSelected, str, onDeviceInfo)), interfaceC3163l2, ((i10 >> 21) & 14) | 196608, 30);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar17;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new b(host, str, z8, onDeviceSelected, onAddDevice, onDeviceInfo, onDeleteHost, iVar4, i8, i9));
            }
        }
        i10 |= 12582912;
        iVar2 = iVar;
        if ((23967451 & i10) == 4793490) {
            if (i15 != 0) {
                iVar3 = i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1520354215, i10, -1, "com.elgato.streamdeck.discovery.KnownHostCard (KnownHostCard.kt:71)");
            }
            InterfaceC3164l0 interfaceC3164l13 = (InterfaceC3164l0) I0.b.b(new Object[0], null, null, f.f33028a, interfaceC3163lP, 3080, 6);
            dVar = (A1.d) interfaceC3163lP.e(X.d());
            interfaceC3163lP.f(-1078742755);
            objG = interfaceC3163lP.g();
            if (objG == InterfaceC3163l.f38803a.a()) {
                objG = new C2325f(j.Center, AbstractC2324e.a(new c(dVar)), d.f33026a, new e(dVar), AbstractC2214j.i(0, 0, null, 7, null), null, 32, null);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            interfaceC3163l2 = interfaceC3163lP;
            i iVar18 = iVar3;
            AbstractC3085t.a(iVar18, null, null, null, null, H0.c.b(interfaceC3163lP, 1540756647, true, new a(interfaceC3164l13, host, onDeleteHost, (C2325f) objG, dVar, z9, onAddDevice, onDeviceSelected, str, onDeviceInfo)), interfaceC3163l2, ((i10 >> 21) & 14) | 196608, 30);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar4 = iVar18;
        } else {
            if (i15 != 0) {
                iVar3 = i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1520354215, i10, -1, "com.elgato.streamdeck.discovery.KnownHostCard (KnownHostCard.kt:71)");
            }
            InterfaceC3164l0 interfaceC3164l14 = (InterfaceC3164l0) I0.b.b(new Object[0], null, null, f.f33028a, interfaceC3163lP, 3080, 6);
            dVar = (A1.d) interfaceC3163lP.e(X.d());
            interfaceC3163lP.f(-1078742755);
            objG = interfaceC3163lP.g();
            if (objG == InterfaceC3163l.f38803a.a()) {
                objG = new C2325f(j.Center, AbstractC2324e.a(new c(dVar)), d.f33026a, new e(dVar), AbstractC2214j.i(0, 0, null, 7, null), null, 32, null);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            interfaceC3163l2 = interfaceC3163lP;
            i iVar19 = iVar3;
            AbstractC3085t.a(iVar19, null, null, null, null, H0.c.b(interfaceC3163lP, 1540756647, true, new a(interfaceC3164l14, host, onDeleteHost, (C2325f) objG, dVar, z9, onAddDevice, onDeviceSelected, str, onDeviceInfo)), interfaceC3163l2, ((i10 >> 21) & 14) | 196608, 30);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar4 = iVar19;
        }
        p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new b(host, str, z8, onDeviceSelected, onAddDevice, onDeviceInfo, onDeleteHost, iVar4, i8, i9));
        }
    }

    public static final V3.h.a c(String str) {
        return new V3.h.a(V3.c.b.DELETE_HOST.b(), new C6.o[]{v.a("screen_name", V3.c.d.DISCOVERY.b()), v.a("workstation_id", str)}, (V3.a) null, 4, (AbstractC2633k) null);
    }
}
