package p017b7;

import C6.G;
import C6.o;
import C6.v;
import G6.d;
import G6.e;
import G6.g;
import p062g7.C;
import p062g7.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Z0 extends C {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ThreadLocal f15936e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public Z0(g gVar, d<Object> dVar) {
        a1 a1Var = a1.f15939a;
        super(gVar.A(a1Var) == null ? gVar.P1(a1Var) : gVar, dVar);
        this.f15936e = new ThreadLocal();
        if (dVar.getContext().A(e.f2817J) instanceof F) {
            return;
        }
        Object objC = K.c(gVar, null);
        K.a(gVar, objC);
        e1(gVar, objC);
    }

    @Override // p062g7.C, p017b7.AbstractC1773a
    public void Y0(Object obj) {
        if (this.threadLocalIsSet) {
            o oVar = (o) this.f15936e.get();
            if (oVar != null) {
                K.a((g) oVar.a(), oVar.b());
            }
            this.f15936e.remove();
        }
        Object objA = C.a(obj, this.f23813d);
        d dVar = this.f23813d;
        g context = dVar.getContext();
        Object objC = K.c(context, null);
        Z0 z0G = objC != K.f23821a ? E.g(dVar, context, objC) : null;
        try {
            this.f23813d.resumeWith(objA);
            G g8 = G.f1419a;
        } finally {
            if (z0G == null || z0G.d1()) {
                K.a(context, objC);
            }
        }
    }

    public final boolean d1() {
        boolean z8 = this.threadLocalIsSet && this.f15936e.get() == null;
        this.f15936e.remove();
        return !z8;
    }

    public final void e1(g gVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f15936e.set(v.a(gVar, obj));
    }
}
