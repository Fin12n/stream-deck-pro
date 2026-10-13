package G6;

import C6.G;
import C6.q;
import Q6.o;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public static final d a(o oVar, Object obj, d completion) {
        t.g(oVar, "<this>");
        t.g(completion, "completion");
        return new i(H6.b.c(H6.b.a(oVar, obj, completion)), H6.c.f());
    }

    public static final void b(o oVar, Object obj, d completion) {
        t.g(oVar, "<this>");
        t.g(completion, "completion");
        d dVarC = H6.b.c(H6.b.a(oVar, obj, completion));
        q.a aVar = q.f1441b;
        dVarC.resumeWith(q.b(G.f1419a));
    }
}
