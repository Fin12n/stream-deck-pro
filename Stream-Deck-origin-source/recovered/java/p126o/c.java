package p126o;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile c f30632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Executor f30633d = new Executor() { // from class: o.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g().c(runnable);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Executor f30634e = new Executor() { // from class: o.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g().a(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f30635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f30636b;

    public c() {
        d dVar = new d();
        this.f30636b = dVar;
        this.f30635a = dVar;
    }

    public static Executor f() {
        return f30634e;
    }

    public static c g() {
        if (f30632c != null) {
            return f30632c;
        }
        synchronized (c.class) {
            try {
                if (f30632c == null) {
                    f30632c = new c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f30632c;
    }

    @Override // p126o.e
    public void a(Runnable runnable) {
        this.f30635a.a(runnable);
    }

    @Override // p126o.e
    public boolean b() {
        return this.f30635a.b();
    }

    @Override // p126o.e
    public void c(Runnable runnable) {
        this.f30635a.c(runnable);
    }
}
