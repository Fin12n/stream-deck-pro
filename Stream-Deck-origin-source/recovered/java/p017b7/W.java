package p017b7;

import C6.C0918g;
import C6.G;
import C6.q;
import C6.r;
import G6.d;
import G6.g;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.t;
import p062g7.C2372k;
import p062g7.K;
import p080i7.h;
import p080i7.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class W extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15923c;

    public W(int i8) {
        this.f15923c = i8;
    }

    public abstract d b();

    public Throwable c(Object obj) {
        C1822z c1822z = obj instanceof C1822z ? (C1822z) obj : null;
        if (c1822z != null) {
            return c1822z.f15995a;
        }
        return null;
    }

    public final void g(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            C0918g.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        t.d(th);
        H.a(b().getContext(), new M("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        Object objB;
        Object objB2;
        i iVar = this.f24782b;
        try {
            d dVarB = b();
            t.e(dVarB, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C2372k c2372k = (C2372k) dVarB;
            d dVar = c2372k.f23845e;
            Object obj = c2372k.f23847g;
            g context = dVar.getContext();
            Object objC = K.c(context, obj);
            Z0 z0G = objC != K.f23821a ? E.g(dVar, context, objC) : null;
            try {
                g context2 = dVar.getContext();
                Object objH = h();
                Throwable thC = c(objH);
                InterfaceC1815v0 interfaceC1815v0 = (thC == null && X.b(this.f15923c)) ? (InterfaceC1815v0) context2.A(InterfaceC1815v0.f15985O) : null;
                if (interfaceC1815v0 != null && !interfaceC1815v0.b()) {
                    CancellationException cancellationExceptionR0 = interfaceC1815v0.r0();
                    a(objH, cancellationExceptionR0);
                    q.a aVar = q.f1441b;
                    dVar.resumeWith(q.b(r.a(cancellationExceptionR0)));
                } else if (thC != null) {
                    q.a aVar2 = q.f1441b;
                    dVar.resumeWith(q.b(r.a(thC)));
                } else {
                    q.a aVar3 = q.f1441b;
                    dVar.resumeWith(q.b(e(objH)));
                }
                G g8 = G.f1419a;
                if (z0G == null || z0G.d1()) {
                    K.a(context, objC);
                }
                try {
                    iVar.a();
                    objB2 = q.b(G.f1419a);
                } catch (Throwable th) {
                    q.a aVar4 = q.f1441b;
                    objB2 = q.b(r.a(th));
                }
                g(null, q.e(objB2));
            } catch (Throwable th2) {
                if (z0G == null || z0G.d1()) {
                    K.a(context, objC);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                q.a aVar5 = q.f1441b;
                iVar.a();
                objB = q.b(G.f1419a);
            } catch (Throwable th4) {
                q.a aVar6 = q.f1441b;
                objB = q.b(r.a(th4));
            }
            g(th3, q.e(objB));
        }
    }

    public Object e(Object obj) {
        return obj;
    }

    public void a(Object obj, Throwable th) {
    }
}
