package p017b7;

import G6.d;
import G6.e;
import G6.g;
import G6.h;
import H6.c;
import Q6.o;
import kotlin.jvm.internal.t;
import p062g7.C;
import p062g7.K;
import p071h7.a;
import p071h7.b;

/* JADX INFO: renamed from: b7.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1789i {
    public static final Q a(J j8, g gVar, L l8, o oVar) {
        g gVarE = E.e(j8, gVar);
        S f8 = l8.c() ? new F0(gVarE, oVar) : new S(gVarE, true);
        f8.c1(l8, f8, oVar);
        return f8;
    }

    public static /* synthetic */ Q b(J j8, g gVar, L l8, o oVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = h.f2820a;
        }
        if ((i8 & 2) != 0) {
            l8 = L.DEFAULT;
        }
        return AbstractC1785g.a(j8, gVar, l8, oVar);
    }

    public static final InterfaceC1815v0 c(J j8, g gVar, L l8, o oVar) {
        g gVarE = E.e(j8, gVar);
        Q0 g8 = l8.c() ? new G0(gVarE, oVar) : new Q0(gVarE, true);
        g8.c1(l8, g8, oVar);
        return g8;
    }

    public static /* synthetic */ InterfaceC1815v0 d(J j8, g gVar, L l8, o oVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = h.f2820a;
        }
        if ((i8 & 2) != 0) {
            l8 = L.DEFAULT;
        }
        return AbstractC1785g.c(j8, gVar, l8, oVar);
    }

    public static final Object e(g gVar, o oVar, d dVar) throws Throwable {
        Object objD1;
        g context = dVar.getContext();
        g gVarD = E.d(context, gVar);
        AbstractC1823z0.l(gVarD);
        if (gVarD == context) {
            C c8 = new C(gVarD, dVar);
            objD1 = b.b(c8, c8, oVar);
        } else {
            e.b bVar = e.f2817J;
            if (t.c(gVarD.A(bVar), context.A(bVar))) {
                Z0 z8 = new Z0(gVarD, dVar);
                g context2 = z8.getContext();
                Object objC = K.c(context2, null);
                try {
                    Object objB = b.b(z8, z8, oVar);
                    K.a(context2, objC);
                    objD1 = objB;
                } catch (Throwable th) {
                    K.a(context2, objC);
                    throw th;
                }
            } else {
                V v8 = new V(gVarD, dVar);
                a.d(oVar, v8, v8, null, 4, null);
                objD1 = v8.d1();
            }
        }
        if (objD1 == c.f()) {
            I6.h.c(dVar);
        }
        return objD1;
    }
}
