package F1;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f2358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d f2359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public F1.d f2360c = F1.d.r();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2361d;

        public void a(Runnable runnable, Executor executor) {
            F1.d dVar = this.f2360c;
            if (dVar != null) {
                dVar.a(runnable, executor);
            }
        }

        public void b() {
            this.f2358a = null;
            this.f2359b = null;
            this.f2360c.o(null);
        }

        public boolean c(Object obj) {
            this.f2361d = true;
            d dVar = this.f2359b;
            boolean z8 = dVar != null && dVar.c(obj);
            if (z8) {
                e();
            }
            return z8;
        }

        public boolean d() {
            this.f2361d = true;
            d dVar = this.f2359b;
            boolean z8 = dVar != null && dVar.b(true);
            if (z8) {
                e();
            }
            return z8;
        }

        public final void e() {
            this.f2358a = null;
            this.f2359b = null;
            this.f2360c = null;
        }

        public boolean f(Throwable th) {
            this.f2361d = true;
            d dVar = this.f2359b;
            boolean z8 = dVar != null && dVar.d(th);
            if (z8) {
                e();
            }
            return z8;
        }

        public void finalize() {
            F1.d dVar;
            d dVar2 = this.f2359b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.d(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f2358a));
            }
            if (this.f2361d || (dVar = this.f2360c) == null) {
                return;
            }
            dVar.o(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends Throwable {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: F1.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface InterfaceC0112c {
        Object a(a aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements Y4.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference f2362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final F1.a f2363b = new a();

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a extends F1.a {
            public a() {
            }

            @Override // F1.a
            public String l() {
                a aVar = (a) d.this.f2362a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f2358a + "]";
            }
        }

        public d(a aVar) {
            this.f2362a = new WeakReference(aVar);
        }

        @Override // Y4.a
        public void a(Runnable runnable, Executor executor) {
            this.f2363b.a(runnable, executor);
        }

        public boolean b(boolean z8) {
            return this.f2363b.cancel(z8);
        }

        public boolean c(Object obj) {
            return this.f2363b.o(obj);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z8) {
            a aVar = (a) this.f2362a.get();
            boolean zCancel = this.f2363b.cancel(z8);
            if (zCancel && aVar != null) {
                aVar.b();
            }
            return zCancel;
        }

        public boolean d(Throwable th) {
            return this.f2363b.p(th);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f2363b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f2363b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f2363b.isDone();
        }

        public String toString() {
            return this.f2363b.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j8, TimeUnit timeUnit) {
            return this.f2363b.get(j8, timeUnit);
        }
    }

    public static Y4.a a(InterfaceC0112c interfaceC0112c) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.f2359b = dVar;
        aVar.f2358a = interfaceC0112c.getClass();
        try {
            Object objA = interfaceC0112c.a(aVar);
            if (objA == null) {
                return dVar;
            }
            aVar.f2358a = objA;
            return dVar;
        } catch (Exception e8) {
            dVar.d(e8);
            return dVar;
        }
    }
}
