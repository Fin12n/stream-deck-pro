package androidx.lifecycle;

import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1737u {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f15319k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p134p.b f15321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f15324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f15325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15328i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Runnable f15329j;

    /* JADX INFO: renamed from: androidx.lifecycle.u$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (AbstractC1737u.this.f15320a) {
                obj = AbstractC1737u.this.f15325f;
                AbstractC1737u.this.f15325f = AbstractC1737u.f15319k;
            }
            AbstractC1737u.this.m(obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.u$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b extends c {
        public b(y yVar) {
            super(yVar);
        }

        @Override // androidx.lifecycle.AbstractC1737u.c
        public boolean c() {
            return true;
        }
    }

    public AbstractC1737u(Object obj) {
        this.f15320a = new Object();
        this.f15321b = new p134p.b();
        this.f15322c = 0;
        this.f15325f = f15319k;
        this.f15329j = new a();
        this.f15324e = obj;
        this.f15326g = 0;
    }

    public static void a(String str) {
        if (p126o.c.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public void b(int i8) {
        int i9 = this.f15322c;
        this.f15322c = i8 + i9;
        if (this.f15323d) {
            return;
        }
        this.f15323d = true;
        while (true) {
            try {
                int i10 = this.f15322c;
                if (i9 == i10) {
                    this.f15323d = false;
                    return;
                }
                boolean z8 = i9 == 0 && i10 > 0;
                boolean z9 = i9 > 0 && i10 == 0;
                if (z8) {
                    i();
                } else if (z9) {
                    j();
                }
                i9 = i10;
            } catch (Throwable th) {
                this.f15323d = false;
                throw th;
            }
        }
    }

    public final void c(c cVar) {
        if (cVar.f15333b) {
            if (!cVar.c()) {
                cVar.a(false);
                return;
            }
            int i8 = cVar.f15334c;
            int i9 = this.f15326g;
            if (i8 >= i9) {
                return;
            }
            cVar.f15334c = i9;
            cVar.f15332a.a(this.f15324e);
        }
    }

    public void d(c cVar) {
        if (this.f15327h) {
            this.f15328i = true;
            return;
        }
        this.f15327h = true;
        do {
            this.f15328i = false;
            if (cVar != null) {
                c(cVar);
                cVar = null;
            } else {
                p.b.d dVarO = this.f15321b.o();
                while (dVarO.hasNext()) {
                    c((c) ((Map.Entry) dVarO.next()).getValue());
                    if (this.f15328i) {
                        break;
                    }
                }
            }
        } while (this.f15328i);
        this.f15327h = false;
    }

    public Object e() {
        Object obj = this.f15324e;
        if (obj != f15319k) {
            return obj;
        }
        return null;
    }

    public int f() {
        return this.f15326g;
    }

    public boolean g() {
        return this.f15322c > 0;
    }

    public void h(y yVar) {
        a("observeForever");
        b bVar = new b(yVar);
        if (((c) this.f15321b.u(yVar, bVar)) != null) {
            return;
        }
        bVar.a(true);
    }

    public void k(Object obj) {
        boolean z8;
        synchronized (this.f15320a) {
            z8 = this.f15325f == f15319k;
            this.f15325f = obj;
        }
        if (z8) {
            p126o.c.g().c(this.f15329j);
        }
    }

    public void l(y yVar) {
        a("removeObserver");
        c cVar = (c) this.f15321b.y(yVar);
        if (cVar == null) {
            return;
        }
        cVar.b();
        cVar.a(false);
    }

    public void m(Object obj) {
        a("setValue");
        this.f15326g++;
        this.f15324e = obj;
        d(null);
    }

    public AbstractC1737u() {
        this.f15320a = new Object();
        this.f15321b = new p134p.b();
        this.f15322c = 0;
        Object obj = f15319k;
        this.f15325f = obj;
        this.f15329j = new a();
        this.f15324e = obj;
        this.f15326g = -1;
    }

    /* JADX INFO: renamed from: androidx.lifecycle.u$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f15332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f15333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15334c = -1;

        public c(y yVar) {
            this.f15332a = yVar;
        }

        public void a(boolean z8) {
            if (z8 == this.f15333b) {
                return;
            }
            this.f15333b = z8;
            AbstractC1737u.this.b(z8 ? 1 : -1);
            if (this.f15333b) {
                AbstractC1737u.this.d(this);
            }
        }

        public abstract boolean c();

        public void b() {
        }
    }

    public void i() {
    }

    public void j() {
    }
}
