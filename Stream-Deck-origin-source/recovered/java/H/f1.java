package H;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f1 implements R0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f2992b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2991a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2993c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2994d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f2995e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet f2996f = new CopyOnWriteArraySet();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class a {
        public static a b(Throwable th) {
            return new C0989l(th);
        }

        public abstract Throwable a();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Object f2997h = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f2998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final R0.a f2999b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReference f3001d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f3000c = new AtomicBoolean(true);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f3002e = f2997h;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3003f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f3004g = false;

        public b(AtomicReference atomicReference, Executor executor, R0.a aVar) {
            this.f3001d = atomicReference;
            this.f2998a = executor;
            this.f2999b = aVar;
        }

        public void a() {
            this.f3000c.set(false);
        }

        public void b(int i8) {
            synchronized (this) {
                try {
                    if (this.f3000c.get()) {
                        if (i8 <= this.f3003f) {
                            return;
                        }
                        this.f3003f = i8;
                        if (this.f3004g) {
                            return;
                        }
                        this.f3004g = true;
                        try {
                            this.f2998a.execute(this);
                        } catch (Throwable unused) {
                            synchronized (this) {
                                this.f3004g = false;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                try {
                    if (!this.f3000c.get()) {
                        this.f3004g = false;
                        return;
                    }
                    Object obj = this.f3001d.get();
                    int i8 = this.f3003f;
                    while (true) {
                        if (!Objects.equals(this.f3002e, obj)) {
                            this.f3002e = obj;
                            if (obj instanceof a) {
                                this.f2999b.onError(((a) obj).a());
                            } else {
                                this.f2999b.a(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i8 == this.f3003f || !this.f3000c.get()) {
                                    break;
                                    break;
                                } else {
                                    obj = this.f3001d.get();
                                    i8 = this.f3003f;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    this.f3004g = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public f1(Object obj, boolean z8) {
        if (!z8) {
            this.f2992b = new AtomicReference(obj);
        } else {
            T1.f.b(obj instanceof Throwable, "Initial errors must be Throwable");
            this.f2992b = new AtomicReference(a.b((Throwable) obj));
        }
    }

    @Override // H.R0
    public Y4.a a() {
        Object obj = this.f2992b.get();
        return obj instanceof a ? K.n.n(((a) obj).a()) : K.n.p(obj);
    }

    @Override // H.R0
    public void b(Executor executor, R0.a aVar) {
        b bVar;
        synchronized (this.f2991a) {
            d(aVar);
            bVar = new b(this.f2992b, executor, aVar);
            this.f2995e.put(aVar, bVar);
            this.f2996f.add(bVar);
        }
        bVar.b(0);
    }

    @Override // H.R0
    public void c(R0.a aVar) {
        synchronized (this.f2991a) {
            d(aVar);
        }
    }

    public final void d(R0.a aVar) {
        b bVar = (b) this.f2995e.remove(aVar);
        if (bVar != null) {
            bVar.a();
            this.f2996f.remove(bVar);
        }
    }

    public void e(Object obj) {
        f(obj);
    }

    public final void f(Object obj) {
        Iterator it;
        int i8;
        synchronized (this.f2991a) {
            try {
                if (Objects.equals(this.f2992b.getAndSet(obj), obj)) {
                    return;
                }
                int i9 = this.f2993c + 1;
                this.f2993c = i9;
                if (this.f2994d) {
                    return;
                }
                this.f2994d = true;
                Iterator it2 = this.f2996f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ((b) it2.next()).b(i9);
                    } else {
                        synchronized (this.f2991a) {
                            try {
                                if (this.f2993c == i9) {
                                    this.f2994d = false;
                                    return;
                                } else {
                                    it = this.f2996f.iterator();
                                    i8 = this.f2993c;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        it2 = it;
                        i9 = i8;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
