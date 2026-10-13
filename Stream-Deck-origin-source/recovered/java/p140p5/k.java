package p140p5;

import M4.AbstractC1069x;
import S4.AbstractC1630a;
import S4.C1631b;
import S4.l;
import S4.n;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p105l5.a;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f31263b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f31264c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f31262a = new n();

    public S4.k a(final Executor executor, final Callable callable, final AbstractC1630a abstractC1630a) {
        AbstractC3207p.m(this.f31263b.get() > 0);
        if (abstractC1630a.a()) {
            return n.b();
        }
        final C1631b c1631b = new C1631b();
        final l lVar = new l(c1631b.b());
        this.f31262a.a(new Executor() { // from class: p5.y
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e8) {
                    if (abstractC1630a.a()) {
                        c1631b.a();
                    } else {
                        lVar.b(e8);
                    }
                    throw e8;
                }
            }
        }, new Runnable() { // from class: p5.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f31316a.g(abstractC1630a, c1631b, callable, lVar);
            }
        });
        return lVar.a();
    }

    public abstract void b();

    public void c() {
        this.f31263b.incrementAndGet();
    }

    public abstract void d();

    public void e(Executor executor) {
        f(executor);
    }

    public S4.k f(Executor executor) {
        AbstractC3207p.m(this.f31263b.get() > 0);
        final l lVar = new l();
        this.f31262a.a(executor, new Runnable() { // from class: p5.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f31310a.h(lVar);
            }
        });
        return lVar.a();
    }

    public final /* synthetic */ void g(AbstractC1630a abstractC1630a, C1631b c1631b, Callable callable, l lVar) {
        try {
            if (abstractC1630a.a()) {
                c1631b.a();
                return;
            }
            try {
                if (!this.f31264c.get()) {
                    b();
                    this.f31264c.set(true);
                }
                if (abstractC1630a.a()) {
                    c1631b.a();
                    return;
                }
                Object objCall = callable.call();
                if (abstractC1630a.a()) {
                    c1631b.a();
                } else {
                    lVar.c(objCall);
                }
            } catch (RuntimeException e8) {
                throw new a("Internal error has occurred when executing ML Kit tasks", 13, e8);
            }
        } catch (Exception e9) {
            if (abstractC1630a.a()) {
                c1631b.a();
            } else {
                lVar.b(e9);
            }
        }
    }

    public final /* synthetic */ void h(l lVar) {
        int iDecrementAndGet = this.f31263b.decrementAndGet();
        AbstractC3207p.m(iDecrementAndGet >= 0);
        if (iDecrementAndGet == 0) {
            d();
            this.f31264c.set(false);
        }
        AbstractC1069x.a();
        lVar.c(null);
    }
}
