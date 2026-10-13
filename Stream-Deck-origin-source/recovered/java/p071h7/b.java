package p071h7;

import C6.q;
import C6.r;
import G6.d;
import G6.g;
import H6.c;
import I6.a;
import I6.h;
import Q6.o;
import kotlin.jvm.internal.P;
import p017b7.C1822z;
import p017b7.E0;
import p017b7.V0;
import p062g7.C;
import p062g7.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final void a(o oVar, Object obj, d dVar) {
        d dVarA = h.a(dVar);
        try {
            g context = dVar.getContext();
            Object objC = K.c(context, null);
            try {
                Object objD = !(oVar instanceof a) ? H6.b.d(oVar, obj, dVarA) : ((o) P.e(oVar, 2)).invoke(obj, dVarA);
                K.a(context, objC);
                if (objD != c.f()) {
                    dVarA.resumeWith(q.b(objD));
                }
            } catch (Throwable th) {
                K.a(context, objC);
                throw th;
            }
        } catch (Throwable th2) {
            q.a aVar = q.f1441b;
            dVarA.resumeWith(q.b(r.a(th2)));
        }
    }

    public static final Object b(C c8, Object obj, o oVar) {
        Object c1822z;
        try {
            c1822z = !(oVar instanceof a) ? H6.b.d(oVar, obj, c8) : ((o) P.e(oVar, 2)).invoke(obj, c8);
        } catch (Throwable th) {
            c1822z = new C1822z(th, false, 2, null);
        }
        if (c1822z == c.f()) {
            return c.f();
        }
        Object objS0 = c8.s0(c1822z);
        if (objS0 == E0.f15888b) {
            return c.f();
        }
        if (objS0 instanceof C1822z) {
            throw ((C1822z) objS0).f15995a;
        }
        return E0.h(objS0);
    }

    public static final Object c(C c8, Object obj, o oVar) throws Throwable {
        Object c1822z;
        try {
            c1822z = !(oVar instanceof a) ? H6.b.d(oVar, obj, c8) : ((o) P.e(oVar, 2)).invoke(obj, c8);
        } catch (Throwable th) {
            c1822z = new C1822z(th, false, 2, null);
        }
        if (c1822z == c.f()) {
            return c.f();
        }
        Object objS0 = c8.s0(c1822z);
        if (objS0 == E0.f15888b) {
            return c.f();
        }
        if (objS0 instanceof C1822z) {
            Throwable th2 = ((C1822z) objS0).f15995a;
            if (!(th2 instanceof V0) || ((V0) th2).f15922a != c8) {
                throw th2;
            }
            if (c1822z instanceof C1822z) {
                throw ((C1822z) c1822z).f15995a;
            }
        } else {
            c1822z = E0.h(objS0);
        }
        return c1822z;
    }
}
