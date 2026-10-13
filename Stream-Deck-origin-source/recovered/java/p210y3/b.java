package p210y3;

import C6.G;
import Q6.o;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p082j0.T;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface b extends T2.a {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: y3.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0847a extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f38266a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ T f38267b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f38268c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0847a(b bVar, T t8, int i8) {
                super(2);
                this.f38266a = bVar;
                this.f38267b = t8;
                this.f38268c = i8;
            }

            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                this.f38266a.s(this.f38267b, interfaceC3163l, F0.a(this.f38268c | 1));
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((InterfaceC3163l) obj, ((Number) obj2).intValue());
                return G.f1419a;
            }
        }

        public static void a(b bVar, T rowScope, InterfaceC3163l interfaceC3163l, int i8) {
            t.g(rowScope, "rowScope");
            InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1640543163);
            if ((i8 & 1) == 0 && interfaceC3163lP.s()) {
                interfaceC3163lP.z();
            } else {
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1640543163, i8, -1, "com.elgato.streamdeck.navigation.TopBarScreen.Actions (TopBarScreen.kt:21)");
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            }
            P0 p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new C0847a(bVar, rowScope, i8));
            }
        }
    }

    @Override // T2.a
    /* synthetic */ String getKey();

    void s(T t8, InterfaceC3163l interfaceC3163l, int i8);

    void u(InterfaceC3163l interfaceC3163l, int i8);
}
