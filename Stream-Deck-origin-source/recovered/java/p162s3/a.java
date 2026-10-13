package p162s3;

import C6.G;
import H0.c;
import L0.i;
import Q6.o;
import kotlin.jvm.internal.u;
import p101l1.f;
import p191w0.P0;
import p191w0.Z;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f32880a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static o f32881b = c.c(1233688266, false, C0736a.f32883a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static o f32882c = c.c(2074543371, false, b.f32884a);

    /* JADX INFO: renamed from: s3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0736a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0736a f32883a = new C0736a();

        public C0736a() {
            super(2);
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1233688266, i8, -1, "com.elgato.streamdeck.discovery.ComposableSingletons$DiscoveryScreenContentKt.lambda-1.<anonymous> (DiscoveryScreenContent.kt:70)");
            }
            P0.b(f.b(p194w3.b.f36937C, interfaceC3163l, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p210y3.c.d(Z.f35786a.c(interfaceC3163l, Z.f35787b)), interfaceC3163l, 0, 0, 65534);
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
        public static final b f32884a = new b();

        public b() {
            super(2);
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(2074543371, i8, -1, "com.elgato.streamdeck.discovery.ComposableSingletons$DiscoveryScreenContentKt.lambda-2.<anonymous> (DiscoveryScreenContent.kt:201)");
            }
            g.d(new h(p218z3.b.a(), null, null, null, null, null, null, null, null, 510, null), androidx.compose.foundation.layout.f.f(i.f4836a, 0.0f, 1, null), interfaceC3163l, 48, 0);
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
        return f32881b;
    }
}
