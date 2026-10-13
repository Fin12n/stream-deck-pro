package B3;

import C6.G;
import Q6.o;
import Q6.p;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p082j0.T;
import p191w0.O;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f1002a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p f1003b = H0.c.c(-359707227, false, a.f1006a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static o f1004c = H0.c.c(428151181, false, b.f1007a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static o f1005d = H0.c.c(360379542, false, c.f1008a);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1006a = new a();

        public a() {
            super(3);
        }

        public final void b(T it, InterfaceC3163l interfaceC3163l, int i8) {
            t.g(it, "it");
            if ((i8 & 81) == 16 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-359707227, i8, -1, "com.elgato.streamdeck.settings.ComposableSingletons$SettingsTopBarKt.lambda-1.<anonymous> (SettingsTopBar.kt:21)");
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((T) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f1007a = new b();

        public b() {
            super(2);
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(428151181, i8, -1, "com.elgato.streamdeck.settings.ComposableSingletons$SettingsTopBarKt.lambda-2.<anonymous> (SettingsTopBar.kt:33)");
            }
            O.a(p101l1.c.d(p154r3.h.f32466Q, interfaceC3163l, 0), p101l1.f.b(p194w3.b.f37044o, interfaceC3163l, 0), null, 0L, interfaceC3163l, 8, 12);
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
        public static final c f1008a = new c();

        public c() {
            super(2);
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(360379542, i8, -1, "com.elgato.streamdeck.settings.ComposableSingletons$SettingsTopBarKt.lambda-3.<anonymous> (SettingsTopBar.kt:43)");
            }
            O.a(p101l1.c.d(p154r3.h.f32465P, interfaceC3163l, 0), p101l1.f.b(p194w3.b.f37050q, interfaceC3163l, 0), null, 0L, interfaceC3163l, 8, 12);
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

    public final p a() {
        return f1003b;
    }

    public final o b() {
        return f1004c;
    }

    public final o c() {
        return f1005d;
    }
}
