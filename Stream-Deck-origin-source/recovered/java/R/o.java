package R;

import A.AbstractC0890p0;
import A.G0;
import A.I;
import A.J;
import A.S0;
import Q.RunnableC1562k;
import Q.RunnableC1564m;
import Q.S;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class o implements S, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f9261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f9262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f9263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f9264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f9267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f9268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SurfaceTexture f9269i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SurfaceTexture f9270j;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Q6.p f9271a = new Q6.p() { // from class: R.n
            @Override // Q6.p
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return new o((J) obj, (I) obj2, (I) obj3);
            }
        };

        public static S a(J j8, I i8, I i9) {
            return (S) f9271a.invoke(j8, i8, i9);
        }
    }

    public o(J j8, I i8, I i9) {
        this(j8, Collections.EMPTY_MAP, i8, i9);
    }

    public static /* synthetic */ void e(o oVar, Runnable runnable, Runnable runnable2) {
        if (oVar.f9266f) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    public static /* synthetic */ void g(o oVar, SurfaceTexture surfaceTexture, Surface surface, S0.g gVar) {
        oVar.getClass();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        oVar.f9265e--;
        oVar.n();
    }

    public static /* synthetic */ void h(o oVar) {
        oVar.f9266f = true;
        oVar.n();
    }

    public static /* synthetic */ void i(o oVar, G0 g8, G0.b bVar) {
        oVar.getClass();
        g8.close();
        Surface surface = (Surface) oVar.f9268h.remove(g8);
        if (surface != null) {
            oVar.f9261a.r(surface);
        }
    }

    public static /* synthetic */ void j(final o oVar, final G0 g8) {
        Surface surfaceJ = g8.J(oVar.f9263c, new T1.a() { // from class: R.j
            @Override // T1.a
            public final void accept(Object obj) {
                o.i(this.f9253a, g8, (G0.b) obj);
            }
        });
        oVar.f9261a.j(surfaceJ);
        oVar.f9268h.put(g8, surfaceJ);
    }

    public static /* synthetic */ void k(final o oVar, S0 s8) {
        oVar.f9265e++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(oVar.f9261a.t(s8.s()));
        surfaceTexture.setDefaultBufferSize(s8.p().getWidth(), s8.p().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        s8.t(surface, oVar.f9263c, new T1.a() { // from class: R.m
            @Override // T1.a
            public final void accept(Object obj) {
                o.g(this.f9258a, surfaceTexture, surface, (S0.g) obj);
            }
        });
        if (s8.s()) {
            oVar.f9269i = surfaceTexture;
        } else {
            oVar.f9270j = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(oVar, oVar.f9264d);
        }
    }

    public static /* synthetic */ void l(o oVar, J j8, Map map, F1.c.a aVar) throws Throwable {
        oVar.getClass();
        try {
            oVar.f9261a.h(j8, map);
            aVar.c(null);
        } catch (RuntimeException e8) {
            aVar.f(e8);
        }
    }

    public static /* synthetic */ Object m(final o oVar, final J j8, final Map map, final F1.c.a aVar) {
        oVar.getClass();
        oVar.o(new Runnable() { // from class: R.i
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                o.l(this.f9249a, j8, map, aVar);
            }
        });
        return "Init GlRenderer";
    }

    private void n() {
        if (this.f9266f && this.f9265e == 0) {
            Iterator it = this.f9268h.keySet().iterator();
            while (it.hasNext()) {
                ((G0) it.next()).close();
            }
            this.f9268h.clear();
            this.f9261a.k();
            this.f9262b.quit();
        }
    }

    private void o(Runnable runnable) {
        p(runnable, new Runnable() { // from class: R.l
            @Override // java.lang.Runnable
            public final void run() {
                o.f();
            }
        });
    }

    private void p(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f9263c.execute(new Runnable() { // from class: R.k
                @Override // java.lang.Runnable
                public final void run() {
                    o.e(this.f9255a, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e8) {
            AbstractC0890p0.m("DualSurfaceProcessor", "Unable to executor runnable", e8);
            runnable2.run();
        }
    }

    private void q(final J j8, final Map map) {
        try {
            F1.c.a(new F1.c.InterfaceC0112c() { // from class: R.g
                @Override // F1.c.InterfaceC0112c
                public final Object a(F1.c.a aVar) {
                    return o.m(this.f9244a, j8, map, aVar);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e8) {
            e = e8;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (!(e instanceof RuntimeException)) {
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
            throw ((RuntimeException) e);
        }
    }

    @Override // Q.S
    public void a() {
        if (this.f9267g.getAndSet(true)) {
            return;
        }
        o(new Runnable() { // from class: R.e
            @Override // java.lang.Runnable
            public final void run() {
                o.h(this.f9241a);
            }
        });
    }

    @Override // A.H0
    public void b(final G0 g8) {
        if (this.f9267g.get()) {
            g8.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: R.h
            @Override // java.lang.Runnable
            public final void run() {
                o.j(this.f9247a, g8);
            }
        };
        Objects.requireNonNull(g8);
        p(runnable, new RunnableC1562k(g8));
    }

    @Override // A.H0
    public void d(final S0 s8) {
        if (this.f9267g.get()) {
            s8.w();
            return;
        }
        Runnable runnable = new Runnable() { // from class: R.f
            @Override // java.lang.Runnable
            public final void run() {
                o.k(this.f9242a, s8);
            }
        };
        Objects.requireNonNull(s8);
        p(runnable, new RunnableC1564m(s8));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f9267g.get() || (surfaceTexture2 = this.f9269i) == null || this.f9270j == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f9270j.updateTexImage();
        for (Map.Entry entry : this.f9268h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            G0 g8 = (G0) entry.getKey();
            if (g8.getFormat() == 34) {
                try {
                    this.f9261a.v(surfaceTexture.getTimestamp(), surface, g8, this.f9269i, this.f9270j);
                } catch (RuntimeException e8) {
                    AbstractC0890p0.d("DualSurfaceProcessor", "Failed to render with OpenGL.", e8);
                }
            }
        }
    }

    public o(J j8, Map map, I i8, I i9) {
        this.f9265e = 0;
        this.f9266f = false;
        this.f9267g = new AtomicBoolean(false);
        this.f9268h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f9262b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f9264d = handler;
        this.f9263c = J.a.e(handler);
        this.f9261a = new c(i8, i9);
        try {
            q(j8, map);
        } catch (RuntimeException e8) {
            a();
            throw e8;
        }
    }

    public static /* synthetic */ void f() {
    }
}
