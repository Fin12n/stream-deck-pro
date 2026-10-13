package io.sentry;

import io.sentry.util.C2569a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p143q0.nKy.bGZGhbtQmA;

/* JADX INFO: renamed from: io.sentry.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2547q implements v3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f27521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final J2 f27522g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2569a f27516a = new C2569a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Timer f27517b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f27518c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f27523h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f27524i = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f27519d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f27520e = new ArrayList();

    /* JADX INFO: renamed from: io.sentry.q$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Iterator it = C2547q.this.f27519d.iterator();
            while (it.hasNext()) {
                ((U) it.next()).e();
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.q$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C2547q.this.f27524i < 10) {
                return;
            }
            C2547q.this.f27524i = jCurrentTimeMillis;
            C2485c1 c2485c1 = new C2485c1();
            Iterator it = C2547q.this.f27519d.iterator();
            while (it.hasNext()) {
                ((U) it.next()).c(c2485c1);
            }
            Iterator it2 = C2547q.this.f27518c.values().iterator();
            while (it2.hasNext()) {
                ((List) it2.next()).add(c2485c1);
            }
        }
    }

    @Override // io.sentry.v3
    public void a(InterfaceC2488d0 interfaceC2488d0) {
        Iterator it = this.f27520e.iterator();
        while (it.hasNext()) {
            ((T) it.next()).a(interfaceC2488d0);
        }
    }

    @Override // io.sentry.v3
    public void b(InterfaceC2488d0 interfaceC2488d0) {
        Iterator it = this.f27520e.iterator();
        while (it.hasNext()) {
            ((T) it.next()).b(interfaceC2488d0);
        }
    }

    @Override // io.sentry.v3
    public List c(InterfaceC2496f0 interfaceC2496f0) {
        this.f27522g.getLogger().c(EnumC2596z2.DEBUG, "stop collecting performance info for transactions %s (%s)", interfaceC2496f0.getName(), interfaceC2496f0.p().n().toString());
        List list = (List) this.f27518c.remove(interfaceC2496f0.n().toString());
        Iterator it = this.f27520e.iterator();
        while (it.hasNext()) {
            ((T) it.next()).a(interfaceC2496f0);
        }
        if (this.f27518c.isEmpty()) {
            close();
        }
        return list;
    }

    @Override // io.sentry.v3
    public void close() {
        this.f27522g.getLogger().c(EnumC2596z2.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.f27518c.clear();
        Iterator it = this.f27520e.iterator();
        while (it.hasNext()) {
            ((T) it.next()).clear();
        }
        if (this.f27523h.getAndSet(false)) {
            InterfaceC2480b0 interfaceC2480b0A = this.f27516a.a();
            try {
                if (this.f27517b != null) {
                    this.f27517b.cancel();
                    this.f27517b = null;
                }
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                }
            } catch (Throwable th) {
                if (interfaceC2480b0A != null) {
                    try {
                        interfaceC2480b0A.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    @Override // io.sentry.v3
    public void d(final InterfaceC2496f0 interfaceC2496f0) {
        if (this.f27521f) {
            this.f27522g.getLogger().c(EnumC2596z2.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator it = this.f27520e.iterator();
        while (it.hasNext()) {
            ((T) it.next()).b(interfaceC2496f0);
        }
        if (!this.f27518c.containsKey(interfaceC2496f0.n().toString())) {
            this.f27518c.put(interfaceC2496f0.n().toString(), new ArrayList());
            try {
                this.f27522g.getExecutorService().b(new Runnable() { // from class: io.sentry.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27268a.c(interfaceC2496f0);
                    }
                }, 30000L);
            } catch (RejectedExecutionException e8) {
                this.f27522g.getLogger().b(EnumC2596z2.ERROR, "Failed to call the executor. Performance collector will not be automatically finished. Did you call Sentry.close()?", e8);
            }
        }
        if (this.f27523h.getAndSet(true)) {
            return;
        }
        InterfaceC2480b0 interfaceC2480b0A = this.f27516a.a();
        try {
            if (this.f27517b == null) {
                this.f27517b = new Timer(true);
            }
            this.f27517b.schedule(new a(), 0L);
            this.f27517b.scheduleAtFixedRate(new b(), 100L, 100L);
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC2480b0A == null) {
                throw th;
            }
            try {
                interfaceC2480b0A.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public C2547q(J2 j8) {
        boolean z8 = false;
        this.f27522g = (J2) io.sentry.util.u.c(j8, bGZGhbtQmA.PuiwYrKiAmfD);
        for (S s8 : j8.getPerformanceCollectors()) {
            if (s8 instanceof U) {
                this.f27519d.add((U) s8);
            }
            if (s8 instanceof T) {
                this.f27520e.add((T) s8);
            }
        }
        if (this.f27519d.isEmpty() && this.f27520e.isEmpty()) {
            z8 = true;
        }
        this.f27521f = z8;
    }
}
