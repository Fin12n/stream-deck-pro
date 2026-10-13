package W2;

import C6.G;
import Q6.k;
import Q6.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f10831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ V2.b f10832b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, V2.b bVar) {
            super(0);
            this.f10831a = kVar;
            this.f10832b = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m78invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m78invoke() {
            V2.b bVarM;
            if (!((Boolean) this.f10831a.invoke(this.f10832b.k())).booleanValue() || this.f10832b.n() || (bVarM = this.f10832b.m()) == null) {
                return;
            }
            bVarM.n();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V2.b f10833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f10834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f10835c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(V2.b bVar, k kVar, int i8) {
            super(2);
            this.f10833a = bVar;
            this.f10834b = kVar;
            this.f10835c = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            d.a(this.f10833a, this.f10834b, interfaceC3163l, F0.a(this.f10835c | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    public static final void a(V2.b navigator, k kVar, InterfaceC3163l interfaceC3163l, int i8) {
        boolean z8;
        t.g(navigator, "navigator");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-329039035);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-329039035, i8, -1, "cafe.adriel.voyager.navigator.internal.NavigatorBackHandler (NavigatorBackHandler.kt:15)");
        }
        if (kVar != null) {
            if (navigator.e()) {
                z8 = true;
            } else {
                V2.b bVarM = navigator.m();
                if (bVarM != null ? bVarM.e() : false) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            }
            W2.a.a(z8, new a(kVar, navigator), interfaceC3163lP, 0);
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(navigator, kVar, i8));
        }
    }
}
