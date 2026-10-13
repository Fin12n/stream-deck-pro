package S4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n {
    public static Object a(k kVar) throws InterruptedException {
        AbstractC3207p.i();
        AbstractC3207p.g();
        AbstractC3207p.l(kVar, "Task must not be null");
        if (kVar.k()) {
            return e(kVar);
        }
        q qVar = new q(null);
        f(kVar, qVar);
        qVar.c();
        return e(kVar);
    }

    public static k b() {
        I i8 = new I();
        i8.p();
        return i8;
    }

    public static k c(Exception exc) {
        I i8 = new I();
        i8.n(exc);
        return i8;
    }

    public static k d(Object obj) {
        I i8 = new I();
        i8.o(obj);
        return i8;
    }

    public static Object e(k kVar) throws ExecutionException {
        if (kVar.l()) {
            return kVar.i();
        }
        if (kVar.j()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(kVar.h());
    }

    public static void f(k kVar, r rVar) {
        Executor executor = m.f9748b;
        kVar.g(executor, rVar);
        kVar.e(executor, rVar);
        kVar.a(executor, rVar);
    }
}
