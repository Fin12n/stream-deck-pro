package B3;

import C6.G;
import Q6.o;
import R0.C1600m0;
import com.elgato.streamdeck.vsd2.KnownHost;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p046f0.D;
import p191w0.Z;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f974a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static o f975b = H0.c.c(796304901, false, a.f978a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static o f976c = H0.c.c(-2120243025, false, C0029b.f979a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static o f977d = H0.c.c(1450083740, false, c.f980a);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f978a = new a();

        public a() {
            super(2);
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(796304901, i8, -1, "com.elgato.streamdeck.settings.ComposableSingletons$AppearanceRowKt.lambda-1.<anonymous> (AppearanceRow.kt:51)");
            }
            D.a(p101l1.c.d(p154r3.h.f32465P, interfaceC3163l, 0), null, null, null, null, 0.0f, C1600m0.a.b(C1600m0.f9420b, Z.f35786a.a(interfaceC3163l, Z.f35787b).v(), 0, 2, null), interfaceC3163l, 56, 60);
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

    /* JADX INFO: renamed from: B3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0029b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0029b f979a = new C0029b();

        public C0029b() {
            super(2);
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-2120243025, i8, -1, "com.elgato.streamdeck.settings.ComposableSingletons$AppearanceRowKt.lambda-2.<anonymous> (AppearanceRow.kt:72)");
            }
            D.a(p101l1.c.d(p154r3.h.f32464O, interfaceC3163l, 0), null, null, null, null, 0.0f, null, interfaceC3163l, 56, 124);
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
        public static final c f980a = new c();

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f981a = new a();

            public a() {
                super(1);
            }

            public final void b(KnownHost.Device.Appearance it) {
                t.g(it, "it");
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((KnownHost.Device.Appearance) obj);
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
                AbstractC3169o.W(1450083740, i8, -1, "com.elgato.streamdeck.settings.ComposableSingletons$AppearanceRowKt.lambda-3.<anonymous> (AppearanceRow.kt:86)");
            }
            B3.a.a(KnownHost.Device.Appearance.SYSTEM, a.f981a, null, interfaceC3163l, 54, 4);
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
        return f975b;
    }

    public final o b() {
        return f976c;
    }
}
