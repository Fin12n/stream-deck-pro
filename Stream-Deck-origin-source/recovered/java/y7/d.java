package y7;

import C6.G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f38461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f38463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f38464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f38465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f38466f;

    public d(e taskRunner, String name) {
        t.g(taskRunner, "taskRunner");
        t.g(name, "name");
        this.f38461a = taskRunner;
        this.f38462b = name;
        this.f38465e = new ArrayList();
    }

    public static /* synthetic */ void j(d dVar, a aVar, long j8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j8 = 0;
        }
        dVar.i(aVar, j8);
    }

    public final void a() {
        if (v7.d.f35186h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f38461a) {
            try {
                if (b()) {
                    this.f38461a.h(this);
                }
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        a aVar = this.f38464d;
        if (aVar != null) {
            t.d(aVar);
            if (aVar.a()) {
                this.f38466f = true;
            }
        }
        boolean z8 = false;
        for (int size = this.f38465e.size() - 1; -1 < size; size--) {
            if (((a) this.f38465e.get(size)).a()) {
                a aVar2 = (a) this.f38465e.get(size);
                if (e.f38467h.a().isLoggable(Level.FINE)) {
                    b.c(aVar2, this, "canceled");
                }
                this.f38465e.remove(size);
                z8 = true;
            }
        }
        return z8;
    }

    public final a c() {
        return this.f38464d;
    }

    public final boolean d() {
        return this.f38466f;
    }

    public final List e() {
        return this.f38465e;
    }

    public final String f() {
        return this.f38462b;
    }

    public final boolean g() {
        return this.f38463c;
    }

    public final e h() {
        return this.f38461a;
    }

    public final void i(a task, long j8) {
        t.g(task, "task");
        synchronized (this.f38461a) {
            if (!this.f38463c) {
                if (k(task, j8, false)) {
                    this.f38461a.h(this);
                }
                G g8 = G.f1419a;
            } else if (task.a()) {
                if (e.f38467h.a().isLoggable(Level.FINE)) {
                    b.c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (e.f38467h.a().isLoggable(Level.FINE)) {
                    b.c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean k(a task, long j8, boolean z8) {
        String str;
        t.g(task, "task");
        task.e(this);
        long jB = this.f38461a.g().b();
        long j9 = jB + j8;
        int iIndexOf = this.f38465e.indexOf(task);
        if (iIndexOf != -1) {
            if (task.c() <= j9) {
                if (e.f38467h.a().isLoggable(Level.FINE)) {
                    b.c(task, this, "already scheduled");
                }
                return false;
            }
            this.f38465e.remove(iIndexOf);
        }
        task.g(j9);
        if (e.f38467h.a().isLoggable(Level.FINE)) {
            if (z8) {
                str = "run again after " + b.b(j9 - jB);
            } else {
                str = "scheduled after " + b.b(j9 - jB);
            }
            b.c(task, this, str);
        }
        Iterator it = this.f38465e.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((a) it.next()).c() - jB > j8) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f38465e.size();
        }
        this.f38465e.add(size, task);
        return size == 0;
    }

    public final void l(a aVar) {
        this.f38464d = aVar;
    }

    public final void m(boolean z8) {
        this.f38466f = z8;
    }

    public final void n() {
        if (v7.d.f35186h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f38461a) {
            try {
                this.f38463c = true;
                if (b()) {
                    this.f38461a.h(this);
                }
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return this.f38462b;
    }
}
