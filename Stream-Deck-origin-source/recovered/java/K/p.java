package K;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class p implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f4484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f4485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f4487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Y4.a f4488e = F1.c.a(new a());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public F1.c.a f4489f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements F1.c.InterfaceC0112c {
        public a() {
        }

        @Override // F1.c.InterfaceC0112c
        public Object a(F1.c.a aVar) {
            T1.f.j(p.this.f4489f == null, "The result can only set once!");
            p.this.f4489f = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p pVar = p.this;
            pVar.f4485b = null;
            pVar.f4484a = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f4492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y4.a f4493b;

        public c(int i8, Y4.a aVar) {
            this.f4492a = i8;
            this.f4493b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f(this.f4492a, this.f4493b);
        }
    }

    public p(List list, boolean z8, Executor executor) {
        this.f4484a = (List) T1.f.g(list);
        this.f4485b = new ArrayList(list.size());
        this.f4486c = z8;
        this.f4487d = new AtomicInteger(list.size());
        e(executor);
    }

    @Override // Y4.a
    public void a(Runnable runnable, Executor executor) {
        this.f4488e.a(runnable, executor);
    }

    public final void b() throws InterruptedException {
        List<Y4.a> list = this.f4484a;
        if (list == null || isDone()) {
            return;
        }
        for (Y4.a aVar : list) {
            while (!aVar.isDone()) {
                try {
                    aVar.get();
                } catch (Error e8) {
                    throw e8;
                } catch (InterruptedException e9) {
                    throw e9;
                } catch (Throwable unused) {
                    if (this.f4486c) {
                        return;
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public List get() throws InterruptedException {
        b();
        return (List) this.f4488e.get();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z8) {
        List list = this.f4484a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Y4.a) it.next()).cancel(z8);
            }
        }
        return this.f4488e.cancel(z8);
    }

    @Override // java.util.concurrent.Future
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public List get(long j8, TimeUnit timeUnit) {
        return (List) this.f4488e.get(j8, timeUnit);
    }

    public final void e(Executor executor) {
        a(new b(), J.a.a());
        if (this.f4484a.isEmpty()) {
            this.f4489f.c(new ArrayList(this.f4485b));
            return;
        }
        for (int i8 = 0; i8 < this.f4484a.size(); i8++) {
            this.f4485b.add(null);
        }
        List list = this.f4484a;
        for (int i9 = 0; i9 < list.size(); i9++) {
            Y4.a aVar = (Y4.a) list.get(i9);
            aVar.a(new c(i9, aVar), executor);
        }
    }

    public void f(int i8, Future future) {
        F1.c.a aVar;
        ArrayList arrayList;
        List list = this.f4485b;
        if (isDone() || list == null) {
            T1.f.j(this.f4486c, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    try {
                        try {
                            T1.f.j(future.isDone(), "Tried to set value from future which is not done");
                            list.set(i8, n.m(future));
                            int iDecrementAndGet = this.f4487d.decrementAndGet();
                            T1.f.j(iDecrementAndGet >= 0, "Less than 0 remaining futures");
                            if (iDecrementAndGet == 0) {
                                List list2 = this.f4485b;
                                if (list2 != null) {
                                    this.f4489f.c(new ArrayList(list2));
                                } else {
                                    T1.f.i(isDone());
                                }
                            }
                        } catch (ExecutionException e8) {
                            if (this.f4486c) {
                                this.f4489f.f(e8.getCause());
                            }
                            int iDecrementAndGet2 = this.f4487d.decrementAndGet();
                            T1.f.j(iDecrementAndGet2 >= 0, "Less than 0 remaining futures");
                            if (iDecrementAndGet2 == 0) {
                                List list3 = this.f4485b;
                                if (list3 != null) {
                                    aVar = this.f4489f;
                                    arrayList = new ArrayList(list3);
                                    aVar.c(arrayList);
                                    return;
                                }
                                T1.f.i(isDone());
                            }
                        }
                    } catch (CancellationException unused) {
                        if (this.f4486c) {
                            cancel(false);
                        }
                        int iDecrementAndGet3 = this.f4487d.decrementAndGet();
                        T1.f.j(iDecrementAndGet3 >= 0, "Less than 0 remaining futures");
                        if (iDecrementAndGet3 == 0) {
                            List list4 = this.f4485b;
                            if (list4 != null) {
                                aVar = this.f4489f;
                                arrayList = new ArrayList(list4);
                                aVar.c(arrayList);
                                return;
                            }
                            T1.f.i(isDone());
                        }
                    }
                } catch (Error e9) {
                    this.f4489f.f(e9);
                    int iDecrementAndGet4 = this.f4487d.decrementAndGet();
                    T1.f.j(iDecrementAndGet4 >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet4 == 0) {
                        List list5 = this.f4485b;
                        if (list5 != null) {
                            aVar = this.f4489f;
                            arrayList = new ArrayList(list5);
                            aVar.c(arrayList);
                            return;
                        }
                        T1.f.i(isDone());
                    }
                }
            } catch (RuntimeException e10) {
                if (this.f4486c) {
                    this.f4489f.f(e10);
                }
                int iDecrementAndGet5 = this.f4487d.decrementAndGet();
                T1.f.j(iDecrementAndGet5 >= 0, "Less than 0 remaining futures");
                if (iDecrementAndGet5 == 0) {
                    List list6 = this.f4485b;
                    if (list6 != null) {
                        aVar = this.f4489f;
                        arrayList = new ArrayList(list6);
                        aVar.c(arrayList);
                        return;
                    }
                    T1.f.i(isDone());
                }
            }
        } catch (Throwable th) {
            int iDecrementAndGet6 = this.f4487d.decrementAndGet();
            T1.f.j(iDecrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet6 == 0) {
                List list7 = this.f4485b;
                if (list7 != null) {
                    this.f4489f.c(new ArrayList(list7));
                } else {
                    T1.f.i(isDone());
                }
            }
            throw th;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f4488e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f4488e.isDone();
    }
}
