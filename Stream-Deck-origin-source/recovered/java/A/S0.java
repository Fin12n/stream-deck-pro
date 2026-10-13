package A;

import H.AbstractC0994n0;
import H.g1;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class S0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Range f136q = g1.f3033a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Range f140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final H.J f141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Y4.a f144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final F1.c.a f145i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Y4.a f146j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final F1.c.a f147k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final F1.c.a f148l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AbstractC0994n0 f149m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h f150n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i f151o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Executor f152p;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements K.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ F1.c.a f153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y4.a f154b;

        public a(F1.c.a aVar, Y4.a aVar2) {
            this.f153a = aVar;
            this.f154b = aVar2;
        }

        @Override // K.c
        public void b(Throwable th) {
            if (th instanceof f) {
                T1.f.i(this.f154b.cancel(false));
            } else {
                T1.f.i(this.f153a.c(null));
            }
        }

        @Override // K.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r8) {
            T1.f.i(this.f153a.c(null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b extends AbstractC0994n0 {
        public b(Size size, int i8) {
            super(size, i8);
        }

        @Override // H.AbstractC0994n0
        public Y4.a o() {
            return S0.this.f144h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c implements K.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y4.a f157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ F1.c.a f158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f159c;

        public c(Y4.a aVar, F1.c.a aVar2, String str) {
            this.f157a = aVar;
            this.f158b = aVar2;
            this.f159c = str;
        }

        @Override // K.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Surface surface) {
            K.n.t(this.f157a, this.f158b);
        }

        @Override // K.c
        public void b(Throwable th) {
            if (!(th instanceof CancellationException)) {
                this.f158b.c(null);
                return;
            }
            T1.f.i(this.f158b.f(new f(this.f159c + jULK.ArVufgFTWSK, th)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class d implements K.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T1.a f161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Surface f162b;

        public d(T1.a aVar, Surface surface) {
            this.f161a = aVar;
            this.f162b = surface;
        }

        @Override // K.c
        public void b(Throwable th) {
            T1.f.j(th instanceof f, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th);
            this.f161a.accept(g.c(1, this.f162b));
        }

        @Override // K.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r8) {
            this.f161a.accept(g.c(0, this.f162b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends RuntimeException {
        public f(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class g {
        public static g c(int i8, Surface surface) {
            return new C0877j(i8, surface);
        }

        public abstract int a();

        public abstract Surface b();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class h {
        public static h g(Rect rect, int i8, int i9, boolean z8, Matrix matrix, boolean z9) {
            return new C0879k(rect, i8, i9, z8, matrix, z9);
        }

        public abstract Rect a();

        public abstract int b();

        public abstract Matrix c();

        public abstract int d();

        public abstract boolean e();

        public abstract boolean f();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface i {
        void a(h hVar);
    }

    public S0(Size size, H.J j8, Runnable runnable) {
        this(size, j8, J.f88d, f136q, runnable);
    }

    public static /* synthetic */ Object a(AtomicReference atomicReference, String str, F1.c.a aVar) {
        atomicReference.set(aVar);
        return str + "-cancellation";
    }

    public static /* synthetic */ Object c(AtomicReference atomicReference, String str, F1.c.a aVar) {
        atomicReference.set(aVar);
        return str + "-Surface";
    }

    public static /* synthetic */ Object g(S0 s8, AtomicReference atomicReference, F1.c.a aVar) {
        s8.getClass();
        atomicReference.set(aVar);
        return "SurfaceRequest-surface-recreation(" + s8.hashCode() + ")";
    }

    public static /* synthetic */ Object j(AtomicReference atomicReference, String str, F1.c.a aVar) {
        atomicReference.set(aVar);
        return str + "-status";
    }

    public void k(Executor executor, Runnable runnable) {
        this.f148l.a(runnable, executor);
    }

    public void l() {
        synchronized (this.f137a) {
            this.f151o = null;
            this.f152p = null;
        }
    }

    public H.J m() {
        return this.f141e;
    }

    public AbstractC0994n0 n() {
        return this.f149m;
    }

    public J o() {
        return this.f139c;
    }

    public Size p() {
        return this.f138b;
    }

    public final F1.c.a q(Executor executor, Runnable runnable) {
        final AtomicReference atomicReference = new AtomicReference(null);
        K.n.j(F1.c.a(new F1.c.InterfaceC0112c() { // from class: A.N0
            @Override // F1.c.InterfaceC0112c
            public final Object a(F1.c.a aVar) {
                return S0.g(this.f105a, atomicReference, aVar);
            }
        }), new e(runnable), executor);
        return (F1.c.a) T1.f.g((F1.c.a) atomicReference.get());
    }

    public boolean r() {
        w();
        return this.f147k.c(null);
    }

    public boolean s() {
        return this.f142f;
    }

    public void t(final Surface surface, Executor executor, final T1.a aVar) {
        if (!surface.isValid()) {
            executor.execute(new Runnable() { // from class: A.P0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.accept(S0.g.c(2, surface));
                }
            });
            return;
        }
        if (this.f145i.c(surface) || this.f144h.isCancelled()) {
            K.n.j(this.f146j, new d(aVar, surface), executor);
            return;
        }
        T1.f.i(this.f144h.isDone());
        try {
            this.f144h.get();
            executor.execute(new Runnable() { // from class: A.Q0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.accept(S0.g.c(3, surface));
                }
            });
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new Runnable() { // from class: A.R0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.accept(S0.g.c(4, surface));
                }
            });
        }
    }

    public void u(Executor executor, final i iVar) {
        final h hVar;
        synchronized (this.f137a) {
            this.f151o = iVar;
            this.f152p = executor;
            hVar = this.f150n;
        }
        if (hVar != null) {
            executor.execute(new Runnable() { // from class: A.O0
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.a(hVar);
                }
            });
        }
    }

    public void v(final h hVar) {
        final i iVar;
        Executor executor;
        synchronized (this.f137a) {
            this.f150n = hVar;
            iVar = this.f151o;
            executor = this.f152p;
        }
        if (iVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: A.M0
            @Override // java.lang.Runnable
            public final void run() {
                iVar.a(hVar);
            }
        });
    }

    public boolean w() {
        return this.f145i.f(new AbstractC0994n0.b("Surface request will not complete."));
    }

    public S0(Size size, H.J j8, J j9, Range<Integer> range, Runnable runnable) {
        this(size, j8, true, j9, 0, range, runnable);
    }

    public S0(Size size, H.J j8, boolean z8, J j9, int i8, Range<Integer> range, Runnable runnable) {
        this.f137a = new Object();
        this.f138b = size;
        this.f141e = j8;
        this.f142f = z8;
        T1.f.b(j9.e(), "SurfaceRequest's DynamicRange must always be fully specified.");
        this.f139c = j9;
        this.f143g = i8;
        this.f140d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + yOZfxp.oZyelSfiAPACpy;
        final AtomicReference atomicReference = new AtomicReference(null);
        Y4.a aVarA = F1.c.a(new F1.c.InterfaceC0112c() { // from class: A.I0
            @Override // F1.c.InterfaceC0112c
            public final Object a(F1.c.a aVar) {
                return S0.a(atomicReference, str, aVar);
            }
        });
        F1.c.a aVar = (F1.c.a) T1.f.g((F1.c.a) atomicReference.get());
        this.f148l = aVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        Y4.a aVarA2 = F1.c.a(new F1.c.InterfaceC0112c() { // from class: A.J0
            @Override // F1.c.InterfaceC0112c
            public final Object a(F1.c.a aVar2) {
                return S0.j(atomicReference2, str, aVar2);
            }
        });
        this.f146j = aVarA2;
        K.n.j(aVarA2, new a(aVar, aVarA), J.a.a());
        F1.c.a aVar2 = (F1.c.a) T1.f.g((F1.c.a) atomicReference2.get());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        Y4.a aVarA3 = F1.c.a(new F1.c.InterfaceC0112c() { // from class: A.K0
            @Override // F1.c.InterfaceC0112c
            public final Object a(F1.c.a aVar3) {
                return S0.c(atomicReference3, str, aVar3);
            }
        });
        this.f144h = aVarA3;
        this.f145i = (F1.c.a) T1.f.g((F1.c.a) atomicReference3.get());
        b bVar = new b(size, 34);
        this.f149m = bVar;
        Y4.a aVarK = bVar.k();
        K.n.j(aVarA3, new c(aVarK, aVar2, str), J.a.a());
        aVarK.a(new Runnable() { // from class: A.L0
            @Override // java.lang.Runnable
            public final void run() {
                this.f101a.f144h.cancel(true);
            }
        }, J.a.a());
        this.f147k = q(J.a.a(), runnable);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class e implements K.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f164a;

        public e(Runnable runnable) {
            this.f164a = runnable;
        }

        @Override // K.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r8) {
            this.f164a.run();
        }

        @Override // K.c
        public void b(Throwable th) {
        }
    }
}
