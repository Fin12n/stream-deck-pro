package D3;

import C6.G;
import D6.C0937q;
import D6.z;
import Q6.k;
import Q6.o;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p101l1.g;
import p154r3.h;
import p191w0.O;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3160j0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.X0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1827a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static o f1828b = H0.c.c(1996039621, false, C0069a.f1831a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static o f1829c = H0.c.c(1739180924, false, b.f1832a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static o f1830d = H0.c.c(320458930, false, c.f1833a);

    /* JADX INFO: renamed from: D3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0069a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0069a f1831a = new C0069a();

        public C0069a() {
            super(2);
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1996039621, i8, -1, "com.elgato.streamdeck.settings.layout.ComposableSingletons$KeypadLayoutSelectionKt.lambda-1.<anonymous> (KeypadLayoutSelection.kt:223)");
            }
            O.b(g.b(V0.d.f10289k, h.f32462M, interfaceC3163l, 8), null, null, 0L, interfaceC3163l, 48, 12);
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
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f1832a = new b();

        public b() {
            super(2);
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1739180924, i8, -1, "com.elgato.streamdeck.settings.layout.ComposableSingletons$KeypadLayoutSelectionKt.lambda-2.<anonymous> (KeypadLayoutSelection.kt:238)");
            }
            O.b(g.b(V0.d.f10289k, h.f32489g0, interfaceC3163l, 8), null, null, 0L, interfaceC3163l, 48, 12);
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
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f1833a = new c();

        /* JADX INFO: renamed from: D3.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0070a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3164l0 f1834a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3160j0 f1835b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3160j0 f1836c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0070a(InterfaceC3164l0 interfaceC3164l0, InterfaceC3160j0 interfaceC3160j0, InterfaceC3160j0 interfaceC3160j1) {
                super(1);
                this.f1834a = interfaceC3164l0;
                this.f1835b = interfaceC3160j0;
                this.f1836c = interfaceC3160j1;
            }

            public final void b(D3.b it) {
                t.g(it, "it");
                this.f1834a.setValue(it);
                if (it instanceof D3.b.c) {
                    c.f(this.f1835b, it.b());
                    c.h(this.f1836c, it.d());
                }
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((D3.b) obj);
                return G.f1419a;
            }
        }

        public c() {
            super(2);
        }

        public static final int e(InterfaceC3160j0 interfaceC3160j0) {
            return interfaceC3160j0.f();
        }

        public static final void f(InterfaceC3160j0 interfaceC3160j0, int i8) {
            interfaceC3160j0.p(i8);
        }

        public static final int g(InterfaceC3160j0 interfaceC3160j0) {
            return interfaceC3160j0.f();
        }

        public static final void h(InterfaceC3160j0 interfaceC3160j0, int i8) {
            interfaceC3160j0.p(i8);
        }

        public final void d(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(320458930, i8, -1, "com.elgato.streamdeck.settings.layout.ComposableSingletons$KeypadLayoutSelectionKt.lambda-3.<anonymous> (KeypadLayoutSelection.kt:249)");
            }
            interfaceC3163l.f(-99717748);
            Object objG = interfaceC3163l.g();
            InterfaceC3163l.a aVar = InterfaceC3163l.f38803a;
            if (objG == aVar.a()) {
                objG = l1.e(new D3.b.c(5, 5), null, 2, null);
                interfaceC3163l.H(objG);
            }
            InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) objG;
            interfaceC3163l.N();
            interfaceC3163l.f(-99717639);
            Object objG2 = interfaceC3163l.g();
            if (objG2 == aVar.a()) {
                objG2 = X0.a(7);
                interfaceC3163l.H(objG2);
            }
            InterfaceC3160j0 interfaceC3160j0 = (InterfaceC3160j0) objG2;
            interfaceC3163l.N();
            interfaceC3163l.f(-99717583);
            Object objG3 = interfaceC3163l.g();
            if (objG3 == aVar.a()) {
                objG3 = X0.a(5);
                interfaceC3163l.H(objG3);
            }
            InterfaceC3160j0 interfaceC3160j1 = (InterfaceC3160j0) objG3;
            interfaceC3163l.N();
            e.a aVar2 = new e.a(z.B0(D3.b.f1837d.b(), C0937q.e(new D3.b.c(e(interfaceC3160j0), g(interfaceC3160j1)))), (D3.b) interfaceC3164l0.getValue(), e(interfaceC3160j0), g(interfaceC3160j1));
            interfaceC3163l.f(-99717149);
            Object objG4 = interfaceC3163l.g();
            if (objG4 == aVar.a()) {
                objG4 = new C0070a(interfaceC3164l0, interfaceC3160j0, interfaceC3160j1);
                interfaceC3163l.H(objG4);
            }
            interfaceC3163l.N();
            D3.c.b(aVar2, (k) objG4, interfaceC3163l, 48);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            d((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public final o a() {
        return f1828b;
    }

    public final o b() {
        return f1829c;
    }
}
