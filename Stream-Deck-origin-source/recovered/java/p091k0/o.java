package p091k0;

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
public abstract class o {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q1 f28437a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q1 q1Var) {
            super(0);
            this.f28437a = q1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i invoke() {
            return new i((k) this.f28437a.getValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q1 f28438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y f28439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.lazy.a f28440c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q1 q1Var, y yVar, androidx.compose.foundation.lazy.a aVar) {
            super(0);
            this.f28438a = q1Var;
            this.f28439b = yVar;
            this.f28440c = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n invoke() {
            i iVar = (i) this.f28438a.getValue();
            return new n(this.f28439b, iVar, this.f28440c, new K(this.f28439b.v(), iVar));
        }
    }

    public static final Function0 a(y yVar, k kVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-343736148);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-343736148, i8, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:43)");
        }
        q1 q1VarP = g1.p(kVar, interfaceC3163l, (i8 >> 3) & 14);
        interfaceC3163l.f(1157296644);
        boolean zR = interfaceC3163l.R(yVar);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            androidx.compose.foundation.lazy.a aVar = new androidx.compose.foundation.lazy.a();
            objG = new B(g1.e(g1.o(), new c(g1.e(g1.o(), new b(q1VarP)), yVar, aVar))) { // from class: k0.o.a
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
