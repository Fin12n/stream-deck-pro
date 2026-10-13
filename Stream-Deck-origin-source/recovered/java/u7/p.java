package u7;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f34797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ExecutorService f34798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f34799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f34800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f34801g;

    public p() {
        this.f34795a = 64;
        this.f34796b = 5;
        this.f34799e = new ArrayDeque();
        this.f34800f = new ArrayDeque();
        this.f34801g = new ArrayDeque();
    }

    public final void a(z7.e.a call) {
        z7.e.a aVarC;
        kotlin.jvm.internal.t.g(call, "call");
        synchronized (this) {
            try {
                this.f34799e.add(call);
                if (!call.b().p() && (aVarC = c(call.d())) != null) {
                    call.e(aVarC);
                }
                C6.G g8 = C6.G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
        f();
    }

    public final synchronized ExecutorService b() {
        ExecutorService executorService;
        try {
            if (this.f34798d == null) {
                this.f34798d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), v7.d.M(v7.d.f35187i + " Dispatcher", false));
            }
            executorService = this.f34798d;
            kotlin.jvm.internal.t.d(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public final z7.e.a c(String str) {
        for (z7.e.a aVar : this.f34800f) {
            if (kotlin.jvm.internal.t.c(aVar.d(), str)) {
                return aVar;
            }
        }
        for (z7.e.a aVar2 : this.f34799e) {
            if (kotlin.jvm.internal.t.c(aVar2.d(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    public final void d(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f34797c;
            C6.G g8 = C6.G.f1419a;
        }
        if (f() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public final void e(z7.e.a call) {
        kotlin.jvm.internal.t.g(call, "call");
        call.c().decrementAndGet();
        d(this.f34800f, call);
    }

    public final synchronized int g() {
        return this.f34800f.size() + this.f34801g.size();
    }

    public final boolean f() {
        int i8;
        boolean z8;
        if (v7.d.f35186h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + RaiWHuj.jvNyNQmhFbPDv + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f34799e.iterator();
                kotlin.jvm.internal.t.f(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    z7.e.a asyncCall = (z7.e.a) it.next();
                    if (this.f34800f.size() >= this.f34795a) {
                        break;
                    }
                    if (asyncCall.c().get() < this.f34796b) {
                        it.remove();
                        asyncCall.c().incrementAndGet();
                        kotlin.jvm.internal.t.f(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.f34800f.add(asyncCall);
                    }
                }
                z8 = g() > 0;
                C6.G g8 = C6.G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i8 = 0; i8 < size; i8++) {
            ((z7.e.a) arrayList.get(i8)).a(b());
        }
        return z8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(ExecutorService executorService) {
        this();
        kotlin.jvm.internal.t.g(executorService, "executorService");
        this.f34798d = executorService;
    }
}
