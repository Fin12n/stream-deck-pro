package p162s3;

import C6.G;
import H0.c;
import L0.i;
import Q6.o;
import V0.d;
import kotlin.jvm.internal.u;
import p101l1.f;
import p101l1.g;
import p154r3.h;
import p191w0.O;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f32885a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static o f32886b = c.c(-1828996614, false, a.f32887a);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32887a = new a();

        public a() {
            super(2);
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1828996614, i8, -1, "com.elgato.streamdeck.discovery.ComposableSingletons$UnknownHostsCardKt.lambda-1.<anonymous> (UnknownHostsCard.kt:66)");
            }
            O.b(g.b(d.f10289k, h.f32481c0, interfaceC3163l, 8), f.b(p194w3.b.f37062u, interfaceC3163l, 0), androidx.compose.foundation.layout.f.l(i.f4836a, A1.h.m(24)), 0L, interfaceC3163l, 384, 8);
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
        return f32886b;
    }
}
