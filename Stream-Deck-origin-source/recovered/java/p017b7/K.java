package p017b7;

import G6.d;
import G6.g;
import H6.c;
import I6.h;
import Q6.o;
import java.util.concurrent.CancellationException;
import p062g7.C;
import p062g7.C2368g;
import p071h7.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class K {
    public static final J a(g gVar) {
        if (gVar.A(InterfaceC1815v0.f15985O) == null) {
            gVar = gVar.P1(B0.b(null, 1, null));
        }
        return new C2368g(gVar);
    }

    public static final J b() {
        return new C2368g(S0.b(null, 1, null).P1(Z.c()));
    }

    public static final void c(J j8, String str, Throwable th) {
        d(j8, AbstractC1794k0.a(str, th));
    }

    public static final void d(J j8, CancellationException cancellationException) {
        InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) j8.getCoroutineContext().A(InterfaceC1815v0.f15985O);
        if (interfaceC1815v0 != null) {
            interfaceC1815v0.z(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + j8).toString());
    }

    public static /* synthetic */ void e(J j8, CancellationException cancellationException, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cancellationException = null;
        }
        d(j8, cancellationException);
    }

    public static final Object f(o oVar, d dVar) {
        C c8 = new C(dVar.getContext(), dVar);
        Object objB = b.b(c8, c8, oVar);
        if (objB == c.f()) {
            h.c(dVar);
        }
        return objB;
    }

    public static final void g(J j8) {
        AbstractC1823z0.l(j8.getCoroutineContext());
    }

    public static final boolean h(J j8) {
        InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) j8.getCoroutineContext().A(InterfaceC1815v0.f15985O);
        if (interfaceC1815v0 != null) {
            return interfaceC1815v0.b();
        }
        return true;
    }
}
