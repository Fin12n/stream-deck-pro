package p154r3;

import A5.f;
import A5.h;
import C6.G;
import C6.r;
import I6.d;
import L3.e;
import Q6.o;
import com.elgato.streamdeck.DiKt;
import com.elgato.streamdeck.vsd2.AppSettings;
import com.elgato.streamdeck.vsd2.AppSettingsStore;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f32347a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i8) {
            super(2);
            this.f32347a = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) throws f {
            b.a(interfaceC3163l, F0.a(this.f32347a | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws f {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: r3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0706b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f32348a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0706b(int i8) {
            super(2);
            this.f32348a = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            b.c(interfaceC3163l, F0.a(this.f32348a | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f32349a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f32350a;

            /* JADX INFO: renamed from: r3.b$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0707a extends d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f32351a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f32352b;

                public C0707a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f32351a = obj;
                    this.f32352b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2261g interfaceC2261g) {
                this.f32350a = interfaceC2261g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, G6.d dVar) {
                C0707a c0707a;
                if (dVar instanceof C0707a) {
                    c0707a = (C0707a) dVar;
                    int i8 = c0707a.f32352b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0707a.f32352b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0707a = new C0707a(dVar);
                    }
                } else {
                    c0707a = new C0707a(dVar);
                }
                Object obj2 = c0707a.f32351a;
                Object objF = H6.c.f();
                int i9 = c0707a.f32352b;
                if (i9 == 0) {
                    r.b(obj2);
                    InterfaceC2261g interfaceC2261g = this.f32350a;
                    Boolean boolA = I6.b.a(((AppSettings) obj).getAppMetrics().hasLastSeenOnboardingVersion());
                    c0707a.f32352b = 1;
                    if (interfaceC2261g.emit(boolA, c0707a) == objF) {
                        return objF;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return G.f1419a;
            }
        }

        public c(InterfaceC2260f interfaceC2260f) {
            this.f32349a = interfaceC2260f;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f32349a.collect(new a(interfaceC2261g), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    public static final void a(InterfaceC3163l interfaceC3163l, int i8) throws f {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1957060419);
        if (i8 == 0 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1957060419, i8, -1, "com.elgato.streamdeck.HandleUpdateDialog (MainActivity.kt:82)");
            }
            interfaceC3163lP.f(1853070191);
            A5.a aVar = new A5.a(e.class, false, null, null);
            h hVar = (h) interfaceC3163lP.e(DiKt.d());
            interfaceC3163lP.f(1468160259);
            Object objG = interfaceC3163lP.g();
            if (objG == InterfaceC3163l.f38803a.a()) {
                objG = hVar.h(aVar, null);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            q1 q1VarB = p137p2.a.b(((e) objG).h(), null, null, null, interfaceC3163lP, 8, 7);
            if (b(q1VarB).e() instanceof L3.b.d) {
                interfaceC3163lP.f(919309274);
                c(interfaceC3163lP, 0);
                interfaceC3163lP.N();
            } else {
                interfaceC3163lP.f(919309319);
                p154r3.c.a(interfaceC3163lP, 0);
                interfaceC3163lP.N();
            }
            if (b(q1VarB).f()) {
                L3.h.a(b(q1VarB), interfaceC3163lP, 0);
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new a(i8));
        }
    }

    public static final e.a b(q1 q1Var) {
        return (e.a) q1Var.getValue();
    }

    public static final void c(InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(984036163);
        if (i8 == 0 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(984036163, i8, -1, "com.elgato.streamdeck.ShowFullScreenSurface (MainActivity.kt:101)");
            }
            p014b4.a.a(false, null, null, 0L, false, p154r3.a.f32339a.c(), interfaceC3163lP, 196608, 31);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new C0706b(i8));
        }
    }

    public static final InterfaceC2260f f(AppSettingsStore appSettingsStore) {
        t.g(appSettingsStore, "<this>");
        return AbstractC2262h.p(new c(appSettingsStore.getData()));
    }
}
