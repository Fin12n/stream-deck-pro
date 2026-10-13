package p154r3;

import A1.h;
import A5.f;
import C6.G;
import L0.i;
import Q6.k;
import Q6.o;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p110m1.n;
import p110m1.v;
import p110m1.x;
import p191w0.F0;
import p191w0.Z;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f32339a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static o f32340b = H0.c.c(-1790266232, false, C0704a.f32343a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static o f32341c = H0.c.c(309699645, false, b.f32344a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static o f32342d = H0.c.c(138539064, false, c.f32345a);

    /* JADX INFO: renamed from: r3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0704a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0704a f32343a = new C0704a();

        public C0704a() {
            super(2);
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) throws f {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1790266232, i8, -1, "com.elgato.streamdeck.ComposableSingletons$MainActivityKt.lambda-1.<anonymous> (MainActivity.kt:73)");
            }
            p154r3.b.a(interfaceC3163l, 0);
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
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32344a = new b();

        public b() {
            super(2);
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(309699645, i8, -1, "com.elgato.streamdeck.ComposableSingletons$MainActivityKt.lambda-2.<anonymous> (MainActivity.kt:109)");
            }
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
        public static final c f32345a = new c();

        /* JADX INFO: renamed from: r3.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0705a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0705a f32346a = new C0705a();

            public C0705a() {
                super(1);
            }

            public final void b(x semantics) {
                t.g(semantics, "$this$semantics");
                v.a(semantics, true);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((x) obj);
                return G.f1419a;
            }
        }

        public c() {
            super(2);
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(138539064, i8, -1, "com.elgato.streamdeck.ComposableSingletons$MainActivityKt.lambda-3.<anonymous> (MainActivity.kt:103)");
            }
            F0.a(n.d(androidx.compose.foundation.layout.f.f(i.f4836a, 0.0f, 1, null), false, C0705a.f32346a, 1, null), null, Z.f35786a.a(interfaceC3163l, Z.f35787b).B(), 0L, h.m(0), 0.0f, null, a.f32339a.b(), interfaceC3163l, 12607488, 106);
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

    public final o a() {
        return f32340b;
    }

    public final o b() {
        return f32341c;
    }

    public final o c() {
        return f32342d;
    }
}
