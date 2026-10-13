package F1;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p116m7.kKPq.toqHM;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Y4.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f2333d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", com.amazon.a.a.o.b.ag));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f2334e = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f2335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f2336g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f2337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile e f2338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile h f2339c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(a aVar, e eVar, e eVar2);

        public abstract boolean b(a aVar, Object obj, Object obj2);

        public abstract boolean c(a aVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f2340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f2341d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f2342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f2343b;

        static {
            if (a.f2333d) {
                f2341d = null;
                f2340c = null;
            } else {
                f2341d = new c(false, null);
                f2340c = new c(true, null);
            }
        }

        public c(boolean z8, Throwable th) {
            this.f2342a = z8;
            this.f2343b = th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f2344b = new d(new C0111a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f2345a;

        /* JADX INFO: renamed from: F1.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class C0111a extends Throwable {
            public C0111a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            this.f2345a = (Throwable) a.e(th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f2346d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f2347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f2348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e f2349c;

        public e(Runnable runnable, Executor executor) {
            this.f2347a = runnable;
            this.f2348b = executor;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f2350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f2351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f2352c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f2353d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f2354e;

        public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f2350a = atomicReferenceFieldUpdater;
            this.f2351b = atomicReferenceFieldUpdater2;
            this.f2352c = atomicReferenceFieldUpdater3;
            this.f2353d = atomicReferenceFieldUpdater4;
            this.f2354e = atomicReferenceFieldUpdater5;
        }

        @Override // F1.a.b
        public boolean a(a aVar, e eVar, e eVar2) {
            return F1.b.a(this.f2353d, aVar, eVar, eVar2);
        }

        @Override // F1.a.b
        public boolean b(a aVar, Object obj, Object obj2) {
            return F1.b.a(this.f2354e, aVar, obj, obj2);
        }

        @Override // F1.a.b
        public boolean c(a aVar, h hVar, h hVar2) {
            return F1.b.a(this.f2352c, aVar, hVar, hVar2);
        }

        @Override // F1.a.b
        public void d(h hVar, h hVar2) {
            this.f2351b.lazySet(hVar, hVar2);
        }

        @Override // F1.a.b
        public void e(h hVar, Thread thread) {
            this.f2350a.lazySet(hVar, thread);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends b {
        public g() {
            super();
        }

        @Override // F1.a.b
        public boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f2338b != eVar) {
                        return false;
                    }
                    aVar.f2338b = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // F1.a.b
        public boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f2337a != obj) {
                        return false;
                    }
                    aVar.f2337a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // F1.a.b
        public boolean c(a aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f2339c != hVar) {
                        return false;
                    }
                    aVar.f2339c = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // F1.a.b
        public void d(h hVar, h hVar2) {
            hVar.f2357b = hVar2;
        }

        @Override // F1.a.b
        public void e(h hVar, Thread thread) {
            hVar.f2356a = thread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f2355c = new h(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f2356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile h f2357b;

        public h(boolean z8) {
        }

        public void a(h hVar) {
            a.f2335f.d(this, hVar);
        }

        public void b() {
            Thread thread = this.f2356a;
            if (thread != null) {
                this.f2356a = null;
                LockSupport.unpark(thread);
            }
        }

        public h() {
            a.f2335f.e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f2335f = gVar;
        if (th != null) {
            f2334e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f2336g = new Object();
    }

    public static CancellationException d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void g(a aVar) {
        aVar.m();
        aVar.c();
        e eVarF = aVar.f(null);
        while (eVarF != null) {
            e eVar = eVarF.f2349c;
            h(eVarF.f2347a, eVarF.f2348b);
            eVarF = eVar;
        }
    }

    public static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e8) {
            f2334e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e8);
        }
    }

    public static Object j(Future future) {
        Object obj;
        boolean z8 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z8 = true;
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // Y4.a
    public final void a(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.f2338b;
        if (eVar != e.f2346d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f2349c = eVar;
                if (f2335f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f2338b;
                }
            } while (eVar != e.f2346d);
        }
        h(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object objJ = j(this);
            sb.append("SUCCESS, result=[");
            sb.append(q(objJ));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e8) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e8.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e9) {
            sb.append("FAILURE, cause=[");
            sb.append(e9.getCause());
            sb.append("]");
        }
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        c cVar;
        Object obj = this.f2337a;
        if (obj == null) {
            if (f2333d) {
                cVar = new c(z8, new CancellationException("Future.cancel() was called."));
            } else {
                cVar = z8 ? c.f2340c : c.f2341d;
            }
            if (f2335f.b(this, obj, cVar)) {
                if (z8) {
                    k();
                }
                g(this);
                return true;
            }
        }
        return false;
    }

    public final e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f2338b;
        } while (!f2335f.a(this, eVar2, e.f2346d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f2349c;
            eVar4.f2349c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j8);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f2337a;
        if (obj != null) {
            return i(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f2339c;
            if (hVar != h.f2355c) {
                h hVar2 = new h();
                while (true) {
                    hVar2.a(hVar);
                    if (f2335f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                n(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f2337a;
                            if (obj2 != null) {
                                return i(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        n(hVar2);
                        break;
                    }
                    hVar = this.f2339c;
                    if (hVar == h.f2355c) {
                    }
                }
            }
            return i(this.f2337a);
        }
        while (nanos > 0) {
            Object obj3 = this.f2337a;
            if (obj3 != null) {
                return i(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j8 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j9 = -nanos;
            long jConvert = timeUnit.convert(j9, TimeUnit.NANOSECONDS);
            long nanos2 = j9 - timeUnit.toNanos(jConvert);
            boolean z8 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z8) {
                    str3 = str3 + com.amazon.a.a.o.b.f.f16777a;
                }
                str2 = str3 + " ";
            }
            if (z8) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    public final Object i(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw d("Task was cancelled.", ((c) obj).f2343b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f2345a);
        }
        if (obj == f2336g) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2337a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f2337a != null;
    }

    public void k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String l() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void m() {
        h hVar;
        do {
            hVar = this.f2339c;
        } while (!f2335f.c(this, hVar, h.f2355c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f2357b;
        }
    }

    public final void n(h hVar) {
        hVar.f2356a = null;
        while (true) {
            h hVar2 = this.f2339c;
            if (hVar2 == h.f2355c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f2357b;
                if (hVar2.f2356a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f2357b = hVar4;
                    if (hVar3.f2356a == null) {
                    }
                } else if (!f2335f.c(this, hVar2, hVar4)) {
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    public boolean o(Object obj) {
        if (obj == null) {
            obj = f2336g;
        }
        if (!f2335f.b(this, null, obj)) {
            return false;
        }
        g(this);
        return true;
    }

    public boolean p(Throwable th) {
        if (!f2335f.b(this, null, new d((Throwable) e(th)))) {
            return false;
        }
        g(this);
        return true;
    }

    public final String q(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public String toString() {
        String strL;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(toqHM.oTnMAp);
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strL = l();
            } catch (RuntimeException e8) {
                strL = "Exception thrown from implementation: " + e8.getClass();
            }
            if (strL != null && !strL.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strL);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f2337a;
            if (obj2 != null) {
                return i(obj2);
            }
            h hVar = this.f2339c;
            if (hVar != h.f2355c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f2335f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f2337a;
                            } else {
                                n(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return i(obj);
                    }
                    hVar = this.f2339c;
                } while (hVar != h.f2355c);
            }
            return i(this.f2337a);
        }
        throw new InterruptedException();
    }
}
