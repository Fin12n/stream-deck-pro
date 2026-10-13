package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1733p;
import io.sentry.C2491e;
import io.sentry.EnumC2596z2;
import io.sentry.InterfaceC2480b0;
import io.sentry.InterfaceC2549q1;
import io.sentry.Y2;
import io.sentry.util.C2569a;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class k0 implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f26476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimerTask f26478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Timer f26479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2569a f26480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final io.sentry.X f26481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f26482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f26483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final io.sentry.transport.p f26484i;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (k0.this.f26482g) {
                k0.this.f26481f.j();
            }
            k0.this.f26481f.b().getReplayController().stop();
        }
    }

    public k0(io.sentry.X x8, long j8, boolean z8, boolean z9) {
        this(x8, j8, z8, z9, io.sentry.transport.n.a());
    }

    public static /* synthetic */ void a(k0 k0Var, io.sentry.V v8) {
        Y2 y2Q;
        if (k0Var.f26476a.get() != 0 || (y2Q = v8.q()) == null || y2Q.k() == null) {
            return;
        }
        k0Var.f26476a.set(y2Q.k().getTime());
    }

    public final void d(String str) {
        if (this.f26483h) {
            C2491e c2491e = new C2491e();
            c2491e.C("navigation");
            c2491e.z("state", str);
            c2491e.y("app.lifecycle");
            c2491e.A(EnumC2596z2.INFO);
            this.f26481f.i(c2491e);
        }
    }

    public final void e() {
        InterfaceC2480b0 interfaceC2480b0A = this.f26480e.a();
        try {
            TimerTask timerTask = this.f26478c;
            if (timerTask != null) {
                timerTask.cancel();
                this.f26478c = null;
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

    public final void f() {
        InterfaceC2480b0 interfaceC2480b0A = this.f26480e.a();
        try {
            e();
            if (this.f26479d != null) {
                a aVar = new a();
                this.f26478c = aVar;
                this.f26479d.schedule(aVar, this.f26477b);
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

    public final void g() {
        e();
        long currentTimeMillis = this.f26484i.getCurrentTimeMillis();
        this.f26481f.u(new InterfaceC2549q1() { // from class: io.sentry.android.core.j0
            @Override // io.sentry.InterfaceC2549q1
            public final void a(io.sentry.V v8) {
                k0.a(this.f26472a, v8);
            }
        });
        long j8 = this.f26476a.get();
        if (j8 == 0 || j8 + this.f26477b <= currentTimeMillis) {
            if (this.f26482g) {
                this.f26481f.k();
            }
            this.f26481f.b().getReplayController().start();
        }
        this.f26481f.b().getReplayController().h();
        this.f26476a.set(currentTimeMillis);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(InterfaceC1733p interfaceC1733p) {
        g();
        d("foreground");
        P.a().c(false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(InterfaceC1733p interfaceC1733p) {
        this.f26476a.set(this.f26484i.getCurrentTimeMillis());
        this.f26481f.b().getReplayController().i();
        f();
        P.a().c(true);
        d("background");
    }

    public k0(io.sentry.X x8, long j8, boolean z8, boolean z9, io.sentry.transport.p pVar) {
        this.f26476a = new AtomicLong(0L);
        this.f26479d = new Timer(true);
        this.f26480e = new C2569a();
        this.f26477b = j8;
        this.f26482g = z8;
        this.f26483h = z9;
        this.f26481f = x8;
        this.f26484i = pVar;
    }
}
