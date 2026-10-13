package p004a3;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import p121n3.d;
import p121n3.e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class Q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Executor f13176e = Executors.newCachedThreadPool(new e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f13177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f13178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f13179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile O f13180d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends FutureTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Q f13181a;

        public a(Q q8, Callable callable) {
            super(callable);
            this.f13181a = q8;
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.f13181a.l((O) get());
                } catch (InterruptedException | ExecutionException e8) {
                    this.f13181a.l(new O(e8));
                }
            } finally {
                this.f13181a = null;
            }
        }
    }

    public Q(Callable<O> callable) {
        this(callable, false);
    }

    public synchronized Q c(L l8) {
        try {
            O o8 = this.f13180d;
            if (o8 != null && o8.a() != null) {
                l8.onResult(o8.a());
            }
            this.f13178b.add(l8);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized Q d(L l8) {
        try {
            O o8 = this.f13180d;
            if (o8 != null && o8.b() != null) {
                l8.onResult(o8.b());
            }
            this.f13177a.add(l8);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public O e() {
        return this.f13180d;
    }

    public final synchronized void f(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f13178b);
        if (arrayList.isEmpty()) {
            d.d("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((L) it.next()).onResult(th);
        }
    }

    public final void g() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            h();
        } else {
            this.f13179c.post(new Runnable() { // from class: a3.P
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13175a.h();
                }
            });
        }
    }

    public final void h() {
        O o8 = this.f13180d;
        if (o8 == null) {
            return;
        }
        if (o8.b() != null) {
            i(o8.b());
        } else {
            f(o8.a());
        }
    }

    public final synchronized void i(Object obj) {
        Iterator it = new ArrayList(this.f13177a).iterator();
        while (it.hasNext()) {
            ((L) it.next()).onResult(obj);
        }
    }

    public synchronized Q j(L l8) {
        this.f13178b.remove(l8);
        return this;
    }

    public synchronized Q k(L l8) {
        this.f13177a.remove(l8);
        return this;
    }

    public final void l(O o8) {
        if (this.f13180d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f13180d = o8;
        g();
    }

    public Q(Object obj) {
        this.f13177a = new LinkedHashSet(1);
        this.f13178b = new LinkedHashSet(1);
        this.f13179c = new Handler(Looper.getMainLooper());
        this.f13180d = null;
        l(new O(obj));
    }

    public Q(Callable callable, boolean z8) {
        this.f13177a = new LinkedHashSet(1);
        this.f13178b = new LinkedHashSet(1);
        this.f13179c = new Handler(Looper.getMainLooper());
        this.f13180d = null;
        if (z8) {
            try {
                l((O) callable.call());
                return;
            } catch (Throwable th) {
                l(new O(th));
                return;
            }
        }
        f13176e.execute(new a(this, callable));
    }
}
