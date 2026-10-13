package p109m0;

import C6.G;
import D6.M;
import I0.f;
import I0.g;
import I0.i;
import Q6.o;
import Q6.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3182v;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ G f29348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f29349b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(G g8, p pVar) {
            super(2);
            this.f29348a = g8;
            this.f29349b = pVar;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1863926504, i8, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
            }
            this.f29348a.i(f.a(interfaceC3163l, 0));
            this.f29349b.invoke(this.f29348a, interfaceC3163l, 8);
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
        public final /* synthetic */ p f29350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f29351b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p pVar, int i8) {
            super(2);
            this.f29350a = pVar;
            this.f29351b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            H.a(this.f29350a, interfaceC3163l, F0.a(this.f29351b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f29352a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g gVar) {
            super(0);
            this.f29352a = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final G invoke() {
            return new G(this.f29352a, M.g());
        }
    }

    public static final void a(p pVar, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(674185128);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.l(pVar) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(674185128, i9, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)");
            }
            g gVar = (g) interfaceC3163lP.e(i.b());
            G g8 = (G) I0.b.b(new Object[]{gVar}, G.f29333d.a(gVar), null, new c(gVar), interfaceC3163lP, 72, 4);
            AbstractC3182v.a(i.b().c(g8), H0.c.b(interfaceC3163lP, 1863926504, true, new a(g8, pVar)), interfaceC3163lP, 56);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(pVar, i8));
        }
    }
}
