package S4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class I extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9739a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f9740b = new E();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f9742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f9743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Exception f9744f;

    @Override // S4.k
    public final k a(Executor executor, InterfaceC1633d interfaceC1633d) {
        this.f9740b.a(new u(executor, interfaceC1633d));
        v();
        return this;
    }

    @Override // S4.k
    public final k b(InterfaceC1634e interfaceC1634e) {
        this.f9740b.a(new w(m.f9747a, interfaceC1634e));
        v();
        return this;
    }

    @Override // S4.k
    public final k c(Executor executor, InterfaceC1634e interfaceC1634e) {
        this.f9740b.a(new w(executor, interfaceC1634e));
        v();
        return this;
    }

    @Override // S4.k
    public final k d(InterfaceC1635f interfaceC1635f) {
        e(m.f9747a, interfaceC1635f);
        return this;
    }

    @Override // S4.k
    public final k e(Executor executor, InterfaceC1635f interfaceC1635f) {
        this.f9740b.a(new y(executor, interfaceC1635f));
        v();
        return this;
    }

    @Override // S4.k
    public final k f(InterfaceC1636g interfaceC1636g) {
        g(m.f9747a, interfaceC1636g);
        return this;
    }

    @Override // S4.k
    public final k g(Executor executor, InterfaceC1636g interfaceC1636g) {
        this.f9740b.a(new A(executor, interfaceC1636g));
        v();
        return this;
    }

    @Override // S4.k
    public final Exception h() {
        Exception exc;
        synchronized (this.f9739a) {
            exc = this.f9744f;
        }
        return exc;
    }

    @Override // S4.k
    public final Object i() {
        Object obj;
        synchronized (this.f9739a) {
            try {
                s();
                t();
                Exception exc = this.f9744f;
                if (exc != null) {
                    throw new C1638i(exc);
                }
                obj = this.f9743e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // S4.k
    public final boolean j() {
        return this.f9742d;
    }

    @Override // S4.k
    public final boolean k() {
        boolean z8;
        synchronized (this.f9739a) {
            z8 = this.f9741c;
        }
        return z8;
    }

    @Override // S4.k
    public final boolean l() {
        boolean z8;
        synchronized (this.f9739a) {
            try {
                z8 = false;
                if (this.f9741c && !this.f9742d && this.f9744f == null) {
                    z8 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z8;
    }

    @Override // S4.k
    public final k m(j jVar) {
        Executor executor = m.f9747a;
        I i8 = new I();
        this.f9740b.a(new C(executor, jVar, i8));
        v();
        return i8;
    }

    public final void n(Exception exc) {
        AbstractC3207p.l(exc, "Exception must not be null");
        synchronized (this.f9739a) {
            u();
            this.f9741c = true;
            this.f9744f = exc;
        }
        this.f9740b.b(this);
    }

    public final void o(Object obj) {
        synchronized (this.f9739a) {
            u();
            this.f9741c = true;
            this.f9743e = obj;
        }
        this.f9740b.b(this);
    }

    public final boolean p() {
        synchronized (this.f9739a) {
            try {
                if (this.f9741c) {
                    return false;
                }
                this.f9741c = true;
                this.f9742d = true;
                this.f9740b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean q(Exception exc) {
        AbstractC3207p.l(exc, "Exception must not be null");
        synchronized (this.f9739a) {
            try {
                if (this.f9741c) {
                    return false;
                }
                this.f9741c = true;
                this.f9744f = exc;
                this.f9740b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean r(Object obj) {
        synchronized (this.f9739a) {
            try {
                if (this.f9741c) {
                    return false;
                }
                this.f9741c = true;
                this.f9743e = obj;
                this.f9740b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s() {
        AbstractC3207p.n(this.f9741c, "Task is not yet complete");
    }

    public final void t() {
        if (this.f9742d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    public final void u() {
        if (this.f9741c) {
            throw C1632c.a(this);
        }
    }

    public final void v() {
        synchronized (this.f9739a) {
            try {
                if (this.f9741c) {
                    this.f9740b.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
