package K;

import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class d implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4.a f4451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public F1.c.a f4452b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements F1.c.InterfaceC0112c {
        public a() {
        }

        @Override // F1.c.InterfaceC0112c
        public Object a(F1.c.a aVar) {
            T1.f.j(d.this.f4452b == null, uYOhHhTXuF.CdsXTLFBL);
            d.this.f4452b = aVar;
            return "FutureChain[" + d.this + "]";
        }
    }

    public d(Y4.a aVar) {
        this.f4451a = (Y4.a) T1.f.g(aVar);
    }

    public static d b(Y4.a aVar) {
        return aVar instanceof d ? (d) aVar : new d(aVar);
    }

    @Override // Y4.a
    public void a(Runnable runnable, Executor executor) {
        this.f4451a.a(runnable, executor);
    }

    public boolean c(Object obj) {
        F1.c.a aVar = this.f4452b;
        if (aVar != null) {
            return aVar.c(obj);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z8) {
        return this.f4451a.cancel(z8);
    }

    public boolean d(Throwable th) {
        F1.c.a aVar = this.f4452b;
        if (aVar != null) {
            return aVar.f(th);
        }
        return false;
    }

    public final d e(p142q.a aVar, Executor executor) {
        return (d) n.x(this, aVar, executor);
    }

    public final d f(K.a aVar, Executor executor) {
        return (d) n.y(this, aVar, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f4451a.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f4451a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f4451a.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j8, TimeUnit timeUnit) {
        return this.f4451a.get(j8, timeUnit);
    }

    public d() {
        this.f4451a = F1.c.a(new a());
    }
}
