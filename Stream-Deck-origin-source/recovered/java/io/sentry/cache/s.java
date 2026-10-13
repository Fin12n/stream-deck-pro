package io.sentry.cache;

import io.sentry.AbstractC2552r1;
import io.sentry.EnumC2596z2;
import io.sentry.InterfaceC2524m0;
import io.sentry.J2;
import io.sentry.V;
import io.sentry.d3;
import io.sentry.protocol.C2541c;
import io.sentry.protocol.F;
import io.sentry.protocol.u;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends AbstractC2552r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2 f27045a;

    public s(J2 j8) {
        this.f27045a = j8;
    }

    public static void A(J2 j8, Object obj, String str) {
        d.d(j8, obj, ".scope-cache", str);
    }

    public static /* synthetic */ void e(s sVar, Runnable runnable) {
        sVar.getClass();
        try {
            runnable.run();
        } catch (Throwable th) {
            sVar.f27045a.getLogger().b(EnumC2596z2.ERROR, "Serialization task failed", th);
        }
    }

    public static /* synthetic */ void f(s sVar, d3 d3Var, V v8) {
        if (d3Var != null) {
            sVar.B(d3Var, "trace.json");
        } else {
            sVar.getClass();
            sVar.B(v8.u().g(), "trace.json");
        }
    }

    public static /* synthetic */ void q(s sVar, String str) {
        if (str == null) {
            sVar.w("transaction.json");
        } else {
            sVar.B(str, "transaction.json");
        }
    }

    public static /* synthetic */ void r(s sVar, F f8) {
        if (f8 == null) {
            sVar.w("user.json");
        } else {
            sVar.B(f8, "user.json");
        }
    }

    public static /* synthetic */ void u(s sVar, EnumC2596z2 enumC2596z2) {
        if (enumC2596z2 == null) {
            sVar.w("level.json");
        } else {
            sVar.B(enumC2596z2, "level.json");
        }
    }

    public static Object x(J2 j8, String str, Class cls) {
        return y(j8, str, cls, null);
    }

    public static Object y(J2 j8, String str, Class cls, InterfaceC2524m0 interfaceC2524m0) {
        return d.c(j8, ".scope-cache", str, cls, interfaceC2524m0);
    }

    public final void B(Object obj, String str) {
        A(this.f27045a, obj, str);
    }

    @Override // io.sentry.AbstractC2552r1, io.sentry.W
    public void b(final Map map) {
        z(new Runnable() { // from class: io.sentry.cache.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f27026a.B(map, "tags.json");
            }
        });
    }

    @Override // io.sentry.AbstractC2552r1, io.sentry.W
    public void c(final F f8) {
        z(new Runnable() { // from class: io.sentry.cache.m
            @Override // java.lang.Runnable
            public final void run() {
                s.r(this.f27032a, f8);
            }
        });
    }

    @Override // io.sentry.AbstractC2552r1, io.sentry.W
    public void g(final u uVar) {
        z(new Runnable() { // from class: io.sentry.cache.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f27041a.B(uVar, "replay.json");
            }
        });
    }

    @Override // io.sentry.AbstractC2552r1, io.sentry.W
    public void j(final Collection collection) {
        z(new Runnable() { // from class: io.sentry.cache.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f27039a.B(collection, "breadcrumbs.json");
            }
        });
    }

    @Override // io.sentry.AbstractC2552r1, io.sentry.W
    public void k(final Map map) {
        z(new Runnable() { // from class: io.sentry.cache.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f27028a.B(map, "extras.json");
            }
        });
    }

    @Override // io.sentry.AbstractC2552r1, io.sentry.W
    public void l(final EnumC2596z2 enumC2596z2) {
        z(new Runnable() { // from class: io.sentry.cache.i
            @Override // java.lang.Runnable
            public final void run() {
                s.u(this.f27024a, enumC2596z2);
            }
        });
    }

    @Override // io.sentry.AbstractC2552r1, io.sentry.W
    public void m(final d3 d3Var, final V v8) {
        z(new Runnable() { // from class: io.sentry.cache.o
            @Override // java.lang.Runnable
            public final void run() {
                s.f(this.f27036a, d3Var, v8);
            }
        });
    }

    @Override // io.sentry.AbstractC2552r1, io.sentry.W
    public void n(final C2541c c2541c) {
        z(new Runnable() { // from class: io.sentry.cache.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f27043a.B(c2541c, "contexts.json");
            }
        });
    }

    @Override // io.sentry.AbstractC2552r1, io.sentry.W
    public void o(final String str) {
        z(new Runnable() { // from class: io.sentry.cache.l
            @Override // java.lang.Runnable
            public final void run() {
                s.q(this.f27030a, str);
            }
        });
    }

    public final void w(String str) {
        d.a(this.f27045a, ".scope-cache", str);
    }

    public final void z(final Runnable runnable) {
        if (Thread.currentThread().getName().contains("SentryExecutor")) {
            runnable.run();
            return;
        }
        try {
            this.f27045a.getExecutorService().submit(new Runnable() { // from class: io.sentry.cache.n
                @Override // java.lang.Runnable
                public final void run() {
                    s.e(this.f27034a, runnable);
                }
            });
        } catch (Throwable th) {
            this.f27045a.getLogger().b(EnumC2596z2.ERROR, "Serialization task could not be scheduled", th);
        }
    }
}
