package J3;

import C6.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2252x;
import p038e1.H;
import p056g1.InterfaceC2343g;
import p082j0.AbstractC2601e;
import p082j0.InterfaceC2608l;
import p191w0.F0;
import p191w0.O;
import p201x2.vAk.hJroAgFztiMK;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3184w;
import p215z0.R0;
import p215z0.v1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f4165a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Q6.p f4166b = H0.c.c(-2106609456, false, a.f4169a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Q6.o f4167c = H0.c.c(862815632, false, b.f4170a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Q6.o f4168d = H0.c.c(-338658421, false, c.f4172a);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4169a = new a();

        public a() {
            super(3);
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((InterfaceC2608l) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }

        public final void b(InterfaceC2608l interfaceC2608l, InterfaceC3163l interfaceC3163l, int i8) {
            t.g(interfaceC2608l, hJroAgFztiMK.CUlHOYTahLmgQIf);
            if ((i8 & 81) == 16 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-2106609456, i8, -1, "com.elgato.streamdeck.ui.components.ComposableSingletons$SettingsButtonKt.lambda-1.<anonymous> (SettingsButton.kt:46)");
            }
            O.a(p101l1.c.d(p154r3.h.f32485e0, interfaceC3163l, 0), "Settings Icon", androidx.compose.foundation.layout.e.i(androidx.compose.foundation.layout.f.f(L0.i.f4836a, 0.0f, 1, null), W3.c.f11463a.h()), 0L, interfaceC3163l, 56, 8);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f4170a = new b();

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f4171a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m63invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m63invoke() {
            }
        }

        public b() {
            super(2);
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(862815632, i8, -1, "com.elgato.streamdeck.ui.components.ComposableSingletons$SettingsButtonKt.lambda-2.<anonymous> (SettingsButton.kt:61)");
            }
            L0.i.a aVar = L0.i.f4836a;
            L0.i iVarL = androidx.compose.foundation.layout.f.l(aVar, A1.h.m(100));
            L0.c cVarE = L0.c.f4806a.e();
            interfaceC3163l.f(733328855);
            H hG = AbstractC2601e.g(cVarE, false, interfaceC3163l, 6);
            interfaceC3163l.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163l, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
            InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar2.a();
            Q6.p pVarB = AbstractC2252x.b(iVarL);
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
            p.a(androidx.compose.foundation.layout.f.l(aVar, A1.h.m(44)), a.f4171a, interfaceC3163l, 54, 0);
            interfaceC3163l.N();
            interfaceC3163l.O();
            interfaceC3163l.N();
            interfaceC3163l.N();
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
    public static final class c extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f4172a = new c();

        public c() {
            super(2);
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-338658421, i8, -1, "com.elgato.streamdeck.ui.components.ComposableSingletons$SettingsButtonKt.lambda-3.<anonymous> (SettingsButton.kt:60)");
            }
            F0.a(null, null, 0L, 0L, 0.0f, 0.0f, null, g.f4165a.b(), interfaceC3163l, 12582912, 127);
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

    public final Q6.p a() {
        return f4166b;
    }

    public final Q6.o b() {
        return f4167c;
    }
}
