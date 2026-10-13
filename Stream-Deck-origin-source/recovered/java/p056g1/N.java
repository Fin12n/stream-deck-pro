package p056g1;

import A1.n;
import Q0.f;
import Q0.g;
import java.util.Map;
import kotlin.jvm.internal.t;
import p038e1.AbstractC2230a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class N extends AbstractC2337a {
    public N(InterfaceC2338b interfaceC2338b) {
        super(interfaceC2338b, null);
    }

    @Override // p056g1.AbstractC2337a
    public long d(X x8, long j8) {
        P pE2 = x8.e2();
        t.d(pE2);
        long jF1 = pE2.f1();
        return f.t(g.a(n.j(jF1), n.k(jF1)), j8);
    }

    @Override // p056g1.AbstractC2337a
    public Map e(X x8) {
        P pE2 = x8.e2();
        t.d(pE2);
        return pE2.T0().c();
    }

    @Override // p056g1.AbstractC2337a
    public int i(X x8, AbstractC2230a abstractC2230a) {
        P pE2 = x8.e2();
        t.d(pE2);
        return pE2.Q(abstractC2230a);
    }
}
