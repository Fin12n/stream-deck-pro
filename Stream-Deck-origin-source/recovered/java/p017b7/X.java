package p017b7;

import C6.G;
import C6.q;
import C6.r;
import G6.d;
import G6.g;
import kotlin.jvm.internal.t;
import p062g7.C2372k;
import p062g7.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class X {
    public static final void a(W w8, int i8) {
        d dVarB = w8.b();
        boolean z8 = i8 == 4;
        if (z8 || !(dVarB instanceof C2372k) || b(i8) != b(w8.f15923c)) {
            d(w8, dVarB, z8);
            return;
        }
        F f8 = ((C2372k) dVarB).f23844d;
        g context = dVarB.getContext();
        if (f8.g1(context)) {
            f8.L0(context, w8);
        } else {
            e(w8);
        }
    }

    public static final boolean b(int i8) {
        return i8 == 1 || i8 == 2;
    }

    public static final boolean c(int i8) {
        return i8 == 2;
    }

    public static final void d(W w8, d dVar, boolean z8) {
        Object objE;
        Object objH = w8.h();
        Throwable thC = w8.c(objH);
        if (thC != null) {
            q.a aVar = q.f1441b;
            objE = r.a(thC);
        } else {
            q.a aVar2 = q.f1441b;
            objE = w8.e(objH);
        }
        Object objB = q.b(objE);
        if (!z8) {
            dVar.resumeWith(objB);
            return;
        }
        t.e(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C2372k c2372k = (C2372k) dVar;
        d dVar2 = c2372k.f23845e;
        Object obj = c2372k.f23847g;
        g context = dVar2.getContext();
        Object objC = K.c(context, obj);
        Z0 z0G = objC != K.f23821a ? E.g(dVar2, context, objC) : null;
        try {
            c2372k.f23845e.resumeWith(objB);
            G g8 = G.f1419a;
        } finally {
            if (z0G == null || z0G.d1()) {
                K.a(context, objC);
            }
        }
    }

    public static final void e(W w8) {
        AbstractC1784f0 abstractC1784f0B = U0.f15919a.b();
        if (abstractC1784f0B.b2()) {
            abstractC1784f0B.M1(w8);
            return;
        }
        abstractC1784f0B.Z1(true);
        try {
            d(w8, w8.b(), true);
            do {
            } while (abstractC1784f0B.e2());
        } catch (Throwable th) {
            try {
                w8.g(th, null);
            } finally {
                abstractC1784f0B.o1(true);
            }
        }
    }
}
