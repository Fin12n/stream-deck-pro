package H;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class L0 implements R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.x f2862a = new androidx.lifecycle.x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f2863b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.y f2864c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f2865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f2866b;

        public a(Object obj, Throwable th) {
            this.f2865a = obj;
            this.f2866b = th;
        }

        public static a b(Object obj) {
            return new a(obj, null);
        }

        public boolean a() {
            return this.f2866b == null;
        }

        public Throwable c() {
            return this.f2866b;
        }

        public Object d() {
            if (a()) {
                return this.f2865a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[Result: <");
            if (a()) {
                str = "Value: " + this.f2865a;
            } else {
                str = "Error: " + this.f2866b;
            }
            sb.append(str);
            sb.append(">]");
            return sb.toString();
        }
    }

    public static /* synthetic */ void d(L0 l8, final a aVar) {
        HashMap map;
        synchronized (l8.f2863b) {
            map = new HashMap(l8.f2863b);
        }
        for (final Map.Entry entry : map.entrySet()) {
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: H.K0
                @Override // java.lang.Runnable
                public final void run() {
                    L0.e(entry, aVar);
                }
            });
        }
    }

    public static /* synthetic */ void e(Map.Entry entry, a aVar) {
        R0.a aVar2 = (R0.a) entry.getKey();
        if (aVar.a()) {
            aVar2.a(aVar.d());
        } else {
            T1.f.g(aVar.c());
            aVar2.onError(aVar.c());
        }
    }

    public static /* synthetic */ Object f(final L0 l8, final F1.c.a aVar) {
        l8.getClass();
        J.a.d().execute(new Runnable() { // from class: H.I0
            @Override // java.lang.Runnable
            public final void run() {
                L0.j(this.f2847a, aVar);
            }
        });
        return l8 + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    public static /* synthetic */ void g(final L0 l8) {
        if (l8.f2864c == null) {
            l8.f2864c = new androidx.lifecycle.y() { // from class: H.J0
                @Override // androidx.lifecycle.y
                public final void a(Object obj) {
                    L0.d(this.f2859a, (L0.a) obj);
                }
            };
        }
        l8.f2862a.h(l8.f2864c);
    }

    public static /* synthetic */ void h(L0 l8) {
        androidx.lifecycle.y yVar = l8.f2864c;
        if (yVar != null) {
            l8.f2862a.l(yVar);
        }
    }

    public static /* synthetic */ void i(L0 l8, R0.a aVar) {
        a aVar2 = (a) l8.f2862a.e();
        if (aVar2 == null) {
            return;
        }
        if (aVar2.a()) {
            aVar.a(aVar2.d());
        } else {
            T1.f.g(aVar2.c());
            aVar.onError(aVar2.c());
        }
    }

    public static /* synthetic */ void j(L0 l8, F1.c.a aVar) {
        a aVar2 = (a) l8.f2862a.e();
        if (aVar2 == null) {
            aVar.f(new IllegalStateException("Observable has not yet been initialized with a value."));
        } else if (aVar2.a()) {
            aVar.c(aVar2.d());
        } else {
            T1.f.g(aVar2.c());
            aVar.f(aVar2.c());
        }
    }

    @Override // H.R0
    public Y4.a a() {
        return F1.c.a(new F1.c.InterfaceC0112c() { // from class: H.F0
            @Override // F1.c.InterfaceC0112c
            public final Object a(F1.c.a aVar) {
                return L0.f(this.f2844a, aVar);
            }
        });
    }

    @Override // H.R0
    public void b(Executor executor, final R0.a aVar) {
        synchronized (this.f2863b) {
            try {
                boolean zIsEmpty = this.f2863b.isEmpty();
                this.f2863b.put(aVar, executor);
                if (zIsEmpty) {
                    l();
                } else {
                    executor.execute(new Runnable() { // from class: H.E0
                        @Override // java.lang.Runnable
                        public final void run() {
                            L0.i(this.f2839a, aVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H.R0
    public void c(R0.a aVar) {
        synchronized (this.f2863b) {
            try {
                this.f2863b.remove(aVar);
                if (this.f2863b.isEmpty()) {
                    k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        J.a.d().execute(new Runnable() { // from class: H.G0
            @Override // java.lang.Runnable
            public final void run() {
                L0.h(this.f2845a);
            }
        });
    }

    public final void l() {
        J.a.d().execute(new Runnable() { // from class: H.H0
            @Override // java.lang.Runnable
            public final void run() {
                L0.g(this.f2846a);
            }
        });
    }

    public void m(Object obj) {
        this.f2862a.k(a.b(obj));
    }
}
