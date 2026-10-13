package androidx.window.layout.adapter.sidecar;

import C6.G;
import D6.r;
import E4.JFpq.XRlnZWSrAFn;
import I2.k;
import K2.j;
import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b implements L2.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile b f15442d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.window.layout.adapter.sidecar.a f15444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f15445b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15441c = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ReentrantLock f15443e = new ReentrantLock();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final b a(Context context) {
            t.g(context, "context");
            if (b.f15442d == null) {
                ReentrantLock reentrantLock = b.f15443e;
                reentrantLock.lock();
                try {
                    if (b.f15442d == null) {
                        b.f15442d = new b(b.f15441c.b(context));
                    }
                    G g8 = G.f1419a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            b bVar = b.f15442d;
            t.d(bVar);
            return bVar;
        }

        public final androidx.window.layout.adapter.sidecar.a b(Context context) {
            t.g(context, "context");
            try {
                if (c(SidecarCompat.f15429f.c())) {
                    SidecarCompat sidecarCompat = new SidecarCompat(context);
                    if (sidecarCompat.n()) {
                        return sidecarCompat;
                    }
                    return null;
                }
            } catch (Throwable unused) {
            }
            return null;
        }

        public final boolean c(k kVar) {
            return kVar != null && kVar.compareTo(k.f3760f.a()) >= 0;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: androidx.window.layout.adapter.sidecar.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class C0388b implements androidx.window.layout.adapter.sidecar.a.InterfaceC0387a {
        public C0388b() {
        }

        @Override // androidx.window.layout.adapter.sidecar.a.InterfaceC0387a
        public void a(Activity activity, j newLayout) {
            t.g(activity, "activity");
            t.g(newLayout, "newLayout");
            for (c cVar : b.this.g()) {
                if (t.c(cVar.d(), activity)) {
                    cVar.b(newLayout);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f15447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f15448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T1.a f15449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public j f15450d;

        public static final void c(c this$0, j newLayoutInfo) {
            t.g(this$0, "this$0");
            t.g(newLayoutInfo, "$newLayoutInfo");
            this$0.f15449c.accept(newLayoutInfo);
        }

        public final void b(final j newLayoutInfo) {
            t.g(newLayoutInfo, "newLayoutInfo");
            this.f15450d = newLayoutInfo;
            this.f15448b.execute(new Runnable() { // from class: N2.c
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.window.layout.adapter.sidecar.b.c.c(this.f5828a, newLayoutInfo);
                }
            });
        }

        public final Activity d() {
            return this.f15447a;
        }

        public final T1.a e() {
            return this.f15449c;
        }

        public final j f() {
            return this.f15450d;
        }

        public c(Activity activity, Executor executor, T1.a aVar) {
            t.g(activity, "activity");
            t.g(executor, "executor");
            t.g(aVar, XRlnZWSrAFn.mDsShyQKz);
            this.f15447a = activity;
            this.f15448b = executor;
            this.f15449c = aVar;
        }
    }

    public b(androidx.window.layout.adapter.sidecar.a aVar) {
        this.f15444a = aVar;
        androidx.window.layout.adapter.sidecar.a aVar2 = this.f15444a;
        if (aVar2 != null) {
            aVar2.a(new C0388b());
        }
    }

    @Override // L2.a
    public void a(T1.a callback) {
        t.g(callback, "callback");
        synchronized (f15443e) {
            try {
                if (this.f15444a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (c callbackWrapper : this.f15445b) {
                    if (callbackWrapper.e() == callback) {
                        t.f(callbackWrapper, "callbackWrapper");
                        arrayList.add(callbackWrapper);
                    }
                }
                this.f15445b.removeAll(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f(((c) it.next()).d());
                }
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // L2.a
    public void b(Context context, Executor executor, T1.a callback) {
        Object next;
        t.g(context, "context");
        t.g(executor, "executor");
        t.g(callback, "callback");
        G g8 = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            ReentrantLock reentrantLock = f15443e;
            reentrantLock.lock();
            try {
                androidx.window.layout.adapter.sidecar.a aVar = this.f15444a;
                if (aVar == null) {
                    callback.accept(new j(r.n()));
                    reentrantLock.unlock();
                    return;
                }
                boolean zH = h(activity);
                c cVar = new c(activity, executor, callback);
                this.f15445b.add(cVar);
                if (zH) {
                    Iterator it = this.f15445b.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!t.c(activity, ((c) next).d()));
                    c cVar2 = (c) next;
                    j jVarF = cVar2 != null ? cVar2.f() : null;
                    if (jVarF != null) {
                        cVar.b(jVarF);
                    }
                } else {
                    aVar.b(activity);
                }
                G g9 = G.f1419a;
                reentrantLock.unlock();
                g8 = G.f1419a;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        if (g8 == null) {
            callback.accept(new j(r.n()));
        }
    }

    public final void f(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15445b;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (t.c(((c) it.next()).d(), activity)) {
                    return;
                }
            }
        }
        androidx.window.layout.adapter.sidecar.a aVar = this.f15444a;
        if (aVar != null) {
            aVar.c(activity);
        }
    }

    public final CopyOnWriteArrayList g() {
        return this.f15445b;
    }

    public final boolean h(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15445b;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (t.c(((c) it.next()).d(), activity)) {
                return true;
            }
        }
        return false;
    }
}
