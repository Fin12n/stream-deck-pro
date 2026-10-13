package p100l0;

import Q6.k;
import X6.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.u;
import p109m0.K;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q1 f29028a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q1 q1Var) {
            super(0);
            this.f29028a = q1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final j invoke() {
            return new j((k) this.f29028a.getValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q1 f29029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ G f29030b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q1 q1Var, G g8) {
            super(0);
            this.f29029a = q1Var;
            this.f29030b = g8;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            j jVar = (j) this.f29029a.getValue();
            return new o(this.f29030b, jVar, new K(this.f29030b.q(), jVar));
        }
    }

    public static final Function0 a(G g8, k kVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-1898306282);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1898306282, i8, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProviderLambda (LazyGridItemProvider.kt:40)");
        }
        q1 q1VarP = g1.p(kVar, interfaceC3163l, (i8 >> 3) & 14);
        interfaceC3163l.f(1157296644);
        boolean zR = interfaceC3163l.R(g8);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = new B(g1.e(g1.o(), new c(g1.e(g1.o(), new b(q1VarP)), g8))) { // from class: l0.p.a
                @Override // kotlin.jvm.internal.B, X6.j
                public Object get() {
                    return ((q1) this.receiver).getValue();
                }
            };
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        j jVar = (j) objG;
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return jVar;
    }
}
