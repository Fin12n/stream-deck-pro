package p065h1;

import C6.G;
import C6.j;
import C6.k;
import C6.r;
import D6.C0930j;
import G6.g;
import I6.l;
import P1.f;
import Q6.o;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1785g;
import p017b7.F;
import p017b7.J;
import p017b7.Z;
import p215z0.InterfaceC3146c0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class K extends F {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f24114m = new c(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f24115n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j f24116o = k.b(a.f24128a);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ThreadLocal f24117p = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Choreographer f24118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f24119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f24120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0930j f24121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f24122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f24123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f24124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f24125j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f24126k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC3146c0 f24127l;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24128a = new a();

        /* JADX INFO: renamed from: h1.K$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0556a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f24129a;

            public C0556a(G6.d dVar) {
                super(2, dVar);
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new C0556a(dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((C0556a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                H6.c.f();
                if (this.f24129a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return Choreographer.getInstance();
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            K k8 = new K(L.b() ? Choreographer.getInstance() : (Choreographer) AbstractC1785g.e(Z.c(), new C0556a(null)), f.a(Looper.getMainLooper()), null);
            return k8.P1(k8.d2());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread");
            }
            K k8 = new K(choreographer, f.a(looperMyLooper), null);
            return k8.P1(k8.d2());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {
        public /* synthetic */ c(AbstractC2633k abstractC2633k) {
            this();
        }

        public final g a() {
            if (L.b()) {
                return b();
            }
            g gVar = (g) K.f24117p.get();
            if (gVar != null) {
                return gVar;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread");
        }

        public final g b() {
            return (g) K.f24116o.getValue();
        }

        public c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements Choreographer.FrameCallback, Runnable {
        public d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j8) {
            K.this.f24119d.removeCallbacks(this);
            K.this.g2();
            K.this.f2(j8);
        }

        @Override // java.lang.Runnable
        public void run() {
            K.this.g2();
            Object obj = K.this.f24120e;
            K k8 = K.this;
            synchronized (obj) {
                try {
                    if (k8.f24122g.isEmpty()) {
                        k8.c2().removeFrameCallback(this);
                        k8.f24125j = false;
                    }
                    G g8 = G.f1419a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public /* synthetic */ K(Choreographer choreographer, Handler handler, AbstractC2633k abstractC2633k) {
        this(choreographer, handler);
    }

    @Override // p017b7.F
    public void L0(g gVar, Runnable runnable) {
        synchronized (this.f24120e) {
            try {
                this.f24121f.addLast(runnable);
                if (!this.f24124i) {
                    this.f24124i = true;
                    this.f24119d.post(this.f24126k);
                    if (!this.f24125j) {
                        this.f24125j = true;
                        this.f24118c.postFrameCallback(this.f24126k);
                    }
                }
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Choreographer c2() {
        return this.f24118c;
    }

    public final InterfaceC3146c0 d2() {
        return this.f24127l;
    }

    public final Runnable e2() {
        Runnable runnable;
        synchronized (this.f24120e) {
            runnable = (Runnable) this.f24121f.K();
        }
        return runnable;
    }

    public final void f2(long j8) {
        synchronized (this.f24120e) {
            if (this.f24125j) {
                this.f24125j = false;
                List list = this.f24122g;
                this.f24122g = this.f24123h;
                this.f24123h = list;
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((Choreographer.FrameCallback) list.get(i8)).doFrame(j8);
                }
                list.clear();
            }
        }
    }

    public final void g2() {
        boolean z8;
        do {
            Runnable runnableE2 = e2();
            while (runnableE2 != null) {
                runnableE2.run();
                runnableE2 = e2();
            }
            synchronized (this.f24120e) {
                if (this.f24121f.isEmpty()) {
                    z8 = false;
                    this.f24124i = false;
                } else {
                    z8 = true;
                }
            }
        } while (z8);
    }

    public final void h2(Choreographer.FrameCallback frameCallback) {
        synchronized (this.f24120e) {
            try {
                this.f24122g.add(frameCallback);
                if (!this.f24125j) {
                    this.f24125j = true;
                    this.f24118c.postFrameCallback(this.f24126k);
                }
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i2(Choreographer.FrameCallback frameCallback) {
        synchronized (this.f24120e) {
            this.f24122g.remove(frameCallback);
        }
    }

    public K(Choreographer choreographer, Handler handler) {
        this.f24118c = choreographer;
        this.f24119d = handler;
        this.f24120e = new Object();
        this.f24121f = new C0930j();
        this.f24122g = new ArrayList();
        this.f24123h = new ArrayList();
        this.f24126k = new d();
        this.f24127l = new M(choreographer, this);
    }
}
