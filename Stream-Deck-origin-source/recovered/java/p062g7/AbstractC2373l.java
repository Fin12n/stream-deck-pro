package p062g7;

import C6.G;
import C6.q;
import C6.r;
import G6.d;
import G6.g;
import Q6.k;
import java.util.concurrent.CancellationException;
import p017b7.AbstractC1784f0;
import p017b7.C;
import p017b7.E;
import p017b7.InterfaceC1815v0;
import p017b7.U0;
import p017b7.Z0;

/* JADX INFO: renamed from: g7.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2373l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G f23848a = new G("UNDEFINED");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G f23849b = new G("REUSABLE_CLAIMED");

    public static final void b(d dVar, Object obj, k kVar) {
        if (!(dVar instanceof C2372k)) {
            dVar.resumeWith(obj);
            return;
        }
        C2372k c2372k = (C2372k) dVar;
        Object objB = C.b(obj, kVar);
        if (c2372k.f23844d.g1(c2372k.getContext())) {
            c2372k.f23846f = objB;
            c2372k.f15923c = 1;
            c2372k.f23844d.L0(c2372k.getContext(), c2372k);
            return;
        }
        AbstractC1784f0 abstractC1784f0B = U0.f15919a.b();
        if (abstractC1784f0B.b2()) {
            c2372k.f23846f = objB;
            c2372k.f15923c = 1;
            abstractC1784f0B.M1(c2372k);
            return;
        }
        abstractC1784f0B.Z1(true);
        try {
            InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) c2372k.getContext().A(InterfaceC1815v0.f15985O);
            if (interfaceC1815v0 == null || interfaceC1815v0.b()) {
                d dVar2 = c2372k.f23845e;
                Object obj2 = c2372k.f23847g;
                g context = dVar2.getContext();
                Object objC = K.c(context, obj2);
                Z0 z0G = objC != K.f23821a ? E.g(dVar2, context, objC) : null;
                try {
                    c2372k.f23845e.resumeWith(obj);
                    G g8 = G.f1419a;
                    if (z0G == null || z0G.d1()) {
                        K.a(context, objC);
                    }
                } catch (Throwable th) {
                    if (z0G == null || z0G.d1()) {
                        K.a(context, objC);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionR0 = interfaceC1815v0.r0();
                c2372k.a(objB, cancellationExceptionR0);
                q.a aVar = q.f1441b;
                c2372k.resumeWith(q.b(r.a(cancellationExceptionR0)));
            }
            while (abstractC1784f0B.e2()) {
            }
        } catch (Throwable th2) {
            try {
                c2372k.g(th2, null);
            } finally {
                abstractC1784f0B.o1(true);
            }
        }
    }

    public static /* synthetic */ void c(d dVar, Object obj, k kVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            kVar = null;
        }
        b(dVar, obj, kVar);
    }

    public static final boolean d(C2372k c2372k) {
        G g8 = G.f1419a;
        AbstractC1784f0 abstractC1784f0B = U0.f15919a.b();
        if (abstractC1784f0B.c2()) {
            return false;
        }
        if (abstractC1784f0B.b2()) {
            c2372k.f23846f = g8;
            c2372k.f15923c = 1;
            abstractC1784f0B.M1(c2372k);
            return true;
        }
        abstractC1784f0B.Z1(true);
        try {
            c2372k.run();
            do {
            } while (abstractC1784f0B.e2());
        } catch (Throwable th) {
            try {
                c2372k.g(th, null);
            } finally {
                abstractC1784f0B.o1(true);
            }
        }
        return false;
    }
}
