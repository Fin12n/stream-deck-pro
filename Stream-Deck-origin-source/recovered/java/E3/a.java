package E3;

import C6.G;
import J3.n;
import Q6.o;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2163a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static o f2164b = H0.c.c(-536351380, false, C0096a.f2166a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static o f2165c = H0.c.c(337337615, false, b.f2167a);

    /* JADX INFO: renamed from: E3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0096a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0096a f2166a = new C0096a();

        public C0096a() {
            super(2);
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-536351380, i8, -1, "com.elgato.streamdeck.settings.license.ComposableSingletons$LicenseScreenKt.lambda-1.<anonymous> (LicenseScreen.kt:94)");
            }
            n.b(p101l1.f.b(p194w3.b.f37043n1, interfaceC3163l, 0), null, null, interfaceC3163l, 0, 6);
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
        public static final b f2167a = new b();

        public b() {
            super(2);
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(337337615, i8, -1, "com.elgato.streamdeck.settings.license.ComposableSingletons$LicenseScreenKt.lambda-2.<anonymous> (LicenseScreen.kt:168)");
            }
            d.b(p218z3.c.a(), interfaceC3163l, 8);
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
        return f2164b;
    }
}
