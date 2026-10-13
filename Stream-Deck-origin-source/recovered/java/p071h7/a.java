package p071h7;

import C6.G;
import C6.q;
import C6.r;
import G6.d;
import H6.b;
import Q6.k;
import Q6.o;
import p062g7.AbstractC2373l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final void a(d dVar, Throwable th) throws Throwable {
        q.a aVar = q.f1441b;
        dVar.resumeWith(q.b(r.a(th)));
        throw th;
    }

    public static final void b(d dVar, d dVar2) throws Throwable {
        try {
            d dVarC = b.c(dVar);
            q.a aVar = q.f1441b;
            AbstractC2373l.c(dVarC, q.b(G.f1419a), null, 2, null);
        } catch (Throwable th) {
            a(dVar2, th);
        }
    }

    public static final void c(o oVar, Object obj, d dVar, k kVar) throws Throwable {
        try {
            d dVarC = b.c(b.a(oVar, obj, dVar));
            q.a aVar = q.f1441b;
            AbstractC2373l.b(dVarC, q.b(G.f1419a), kVar);
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static /* synthetic */ void d(o oVar, Object obj, d dVar, k kVar, int i8, Object obj2) throws Throwable {
        if ((i8 & 4) != 0) {
            kVar = null;
        }
        c(oVar, obj, dVar, kVar);
    }
}
