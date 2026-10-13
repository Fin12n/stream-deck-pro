package V0;

import C6.G;
import R0.C1598l0;
import R0.C1600m0;
import androidx.compose.ui.graphics.vector.VectorPainter;
import p065h1.X;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static final VectorPainter a(VectorPainter vectorPainter, long j8, long j9, String str, C1600m0 c1600m0, boolean z8) {
        vectorPainter.u(j8);
        vectorPainter.q(z8);
        vectorPainter.r(c1600m0);
        vectorPainter.v(j9);
        vectorPainter.t(str);
        return vectorPainter;
    }

    public static final C1600m0 b(long j8, int i8) {
        if (j8 != C1598l0.f9405b.e()) {
            return C1600m0.f9420b.a(j8, i8);
        }
        return null;
    }

    public static final c c(c cVar, n nVar) {
        int iE = nVar.E();
        for (int i8 = 0; i8 < iE; i8++) {
            p pVarM = nVar.m(i8);
            if (pVarM instanceof r) {
                g gVar = new g();
                r rVar = (r) pVarM;
                gVar.k(rVar.s());
                gVar.l(rVar.t());
                gVar.j(rVar.o());
                gVar.h(rVar.c());
                gVar.i(rVar.m());
                gVar.m(rVar.u());
                gVar.n(rVar.y());
                gVar.r(rVar.F());
                gVar.o(rVar.A());
                gVar.p(rVar.D());
                gVar.q(rVar.E());
                gVar.u(rVar.I());
                gVar.s(rVar.G());
                gVar.t(rVar.H());
                cVar.i(i8, gVar);
            } else if (pVarM instanceof n) {
                c cVar2 = new c();
                n nVar2 = (n) pVarM;
                cVar2.p(nVar2.s());
                cVar2.s(nVar2.y());
                cVar2.t(nVar2.A());
                cVar2.u(nVar2.D());
                cVar2.v(nVar2.F());
                cVar2.w(nVar2.G());
                cVar2.q(nVar2.t());
                cVar2.r(nVar2.u());
                cVar2.o(nVar2.o());
                c(cVar2, nVar2);
                cVar.i(i8, cVar2);
            }
        }
        return cVar;
    }

    public static final VectorPainter d(A1.d dVar, d dVar2, c cVar) {
        long jE = e(dVar, dVar2.e(), dVar2.d());
        return a(new VectorPainter(cVar), jE, f(jE, dVar2.l(), dVar2.k()), dVar2.g(), b(dVar2.j(), dVar2.i()), dVar2.c());
    }

    public static final long e(A1.d dVar, float f8, float f9) {
        return Q0.m.a(dVar.E0(f8), dVar.E0(f9));
    }

    public static final long f(long j8, float f8, float f9) {
        if (Float.isNaN(f8)) {
            f8 = Q0.l.i(j8);
        }
        if (Float.isNaN(f9)) {
            f9 = Q0.l.g(j8);
        }
        return Q0.m.a(f8, f9);
    }

    public static final VectorPainter g(d dVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(1413834416);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1413834416, i8, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:168)");
        }
        A1.d dVar2 = (A1.d) interfaceC3163l.e(X.d());
        Object objValueOf = Integer.valueOf(dVar.f());
        interfaceC3163l.f(511388516);
        boolean zR = interfaceC3163l.R(objValueOf) | interfaceC3163l.R(dVar2);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            c cVar = new c();
            c(cVar, dVar.h());
            G g8 = G.f1419a;
            objG = d(dVar2, dVar, cVar);
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        VectorPainter vectorPainter = (VectorPainter) objG;
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return vectorPainter;
    }
}
