package Q;

import A.AbstractC0890p0;
import A.G0;
import A.S0;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: Q.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C1570t implements S, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f9042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f9043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f9044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f9045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f9046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f9047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f9048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f9049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9050i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9051j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f9052k;

    /* JADX INFO: renamed from: Q.t$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static p142q.a f9053a = new p142q.a() { // from class: Q.s
            @Override // p142q.a
            public final Object apply(Object obj) {
                return new C1570t((A.J) obj);
            }
        };

        public static S a(A.J j8) {
            return (S) f9053a.apply(j8);
        }
    }

    /* JADX INFO: renamed from: Q.t$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class b {
        public static C1552a d(int i8, int i9, F1.c.a aVar) {
            return new C1552a(i8, i9, aVar);
        }

        public abstract F1.c.a a();

        public abstract int b();

        public abstract int c();
    }

    public C1570t(A.J j8) {
        this(j8, Collections.EMPTY_MAP);
    }

    public static /* synthetic */ void f(C1570t c1570t, S0 s8, SurfaceTexture surfaceTexture, Surface surface, S0.g gVar) {
        c1570t.getClass();
        s8.l();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        c1570t.f9050i--;
        c1570t.r();
    }

    public static /* synthetic */ void g(C1570t c1570t) {
        c1570t.f9051j = true;
        c1570t.r();
    }

    public static /* synthetic */ void h(C1570t c1570t, A.J j8, Map map, F1.c.a aVar) throws Throwable {
        c1570t.getClass();
        try {
            c1570t.f9042a.h(j8, map);
            aVar.c(null);
        } catch (RuntimeException e8) {
            aVar.f(e8);
        }
    }

    public static /* synthetic */ Object i(final C1570t c1570t, int i8, int i9, final F1.c.a aVar) {
        c1570t.getClass();
        final C1552a c1552aD = b.d(i8, i9, aVar);
        c1570t.t(new Runnable() { // from class: Q.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f9020a.f9052k.add(c1552aD);
            }
        }, new Runnable() { // from class: Q.i
            @Override // java.lang.Runnable
            public final void run() {
                aVar.f(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
            }
        });
        return "DefaultSurfaceProcessor#snapshot";
    }

    public static /* synthetic */ void j(C1570t c1570t, S0 s8, S0.h hVar) {
        c1570t.getClass();
        S.d.e eVar = S.d.e.DEFAULT;
        if (s8.o().d() && hVar.e()) {
            eVar = S.d.e.YUV;
        }
        c1570t.f9042a.o(eVar);
    }

    public static /* synthetic */ void k(final C1570t c1570t, final G0 g8) {
        Surface surfaceJ = g8.J(c1570t.f9044c, new T1.a() { // from class: Q.o
            @Override // T1.a
            public final void accept(Object obj) {
                C1570t.l(this.f9030a, g8, (G0.b) obj);
            }
        });
        c1570t.f9042a.j(surfaceJ);
        c1570t.f9049h.put(g8, surfaceJ);
    }

    public static /* synthetic */ void l(C1570t c1570t, G0 g8, G0.b bVar) {
        c1570t.getClass();
        g8.close();
        Surface surface = (Surface) c1570t.f9049h.remove(g8);
        if (surface != null) {
            c1570t.f9042a.r(surface);
        }
    }

    public static /* synthetic */ Object m(final C1570t c1570t, final A.J j8, final Map map, final F1.c.a aVar) {
        c1570t.getClass();
        c1570t.s(new Runnable() { // from class: Q.r
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C1570t.h(this.f9038a, j8, map, aVar);
            }
        });
        return "Init GlRenderer";
    }

    public static /* synthetic */ void p(final C1570t c1570t, final S0 s8) {
        c1570t.f9050i++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(c1570t.f9042a.g());
        surfaceTexture.setDefaultBufferSize(s8.p().getWidth(), s8.p().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        s8.u(c1570t.f9044c, new S0.i() { // from class: Q.p
            @Override // A.S0.i
            public final void a(S0.h hVar) {
                C1570t.j(this.f9032a, s8, hVar);
            }
        });
        s8.t(surface, c1570t.f9044c, new T1.a() { // from class: Q.q
            @Override // T1.a
            public final void accept(Object obj) {
                C1570t.f(this.f9034a, s8, surfaceTexture, surface, (S0.g) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(c1570t, c1570t.f9045d);
    }

    public static /* synthetic */ void q(C1570t c1570t, Runnable runnable, Runnable runnable2) {
        if (c1570t.f9051j) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    @Override // Q.S
    public void a() {
        if (this.f9046e.getAndSet(true)) {
            return;
        }
        s(new Runnable() { // from class: Q.n
            @Override // java.lang.Runnable
            public final void run() {
                C1570t.g(this.f9029a);
            }
        });
    }

    @Override // A.H0
    public void b(final G0 g8) {
        if (this.f9046e.get()) {
            g8.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: Q.j
            @Override // java.lang.Runnable
            public final void run() {
                C1570t.k(this.f9023a, g8);
            }
        };
        Objects.requireNonNull(g8);
        t(runnable, new RunnableC1562k(g8));
    }

    @Override // Q.S
    public Y4.a c(final int i8, final int i9) {
        return K.n.s(F1.c.a(new F1.c.InterfaceC0112c() { // from class: Q.g
            @Override // F1.c.InterfaceC0112c
            public final Object a(F1.c.a aVar) {
                return C1570t.i(this.f9017a, i8, i9, aVar);
            }
        }));
    }

    @Override // A.H0
    public void d(final S0 s8) {
        if (this.f9046e.get()) {
            s8.w();
            return;
        }
        Runnable runnable = new Runnable() { // from class: Q.l
            @Override // java.lang.Runnable
            public final void run() {
                C1570t.p(this.f9026a, s8);
            }
        };
        Objects.requireNonNull(s8);
        t(runnable, new RunnableC1564m(s8));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.f9046e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.f9047f);
        C6.u uVar = null;
        for (Map.Entry entry : this.f9049h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            G0 g8 = (G0) entry.getKey();
            g8.P(this.f9048g, this.f9047f);
            if (g8.getFormat() == 34) {
                try {
                    this.f9042a.n(surfaceTexture.getTimestamp(), this.f9048g, surface);
                } catch (RuntimeException e8) {
                    AbstractC0890p0.d("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e8);
                }
            } else {
                T1.f.j(g8.getFormat() == 256, "Unsupported format: " + g8.getFormat());
                T1.f.j(uVar == null, "Only one JPEG output is supported.");
                uVar = new C6.u(surface, g8.k(), (float[]) this.f9048g.clone());
            }
        }
        try {
            x(uVar);
        } catch (RuntimeException e9) {
            u(e9);
        }
    }

    public final void r() {
        if (this.f9051j && this.f9050i == 0) {
            Iterator it = this.f9049h.keySet().iterator();
            while (it.hasNext()) {
                ((G0) it.next()).close();
            }
            Iterator it2 = this.f9052k.iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).a().f(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.f9049h.clear();
            this.f9042a.k();
            this.f9043b.quit();
        }
    }

    public final void s(Runnable runnable) {
        t(runnable, new Runnable() { // from class: Q.e
            @Override // java.lang.Runnable
            public final void run() {
                C1570t.n();
            }
        });
    }

    public final void t(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f9044c.execute(new Runnable() { // from class: Q.f
                @Override // java.lang.Runnable
                public final void run() {
                    C1570t.q(this.f9014a, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e8) {
            AbstractC0890p0.m("DefaultSurfaceProcessor", "Unable to executor runnable", e8);
            runnable2.run();
        }
    }

    public final void u(Throwable th) {
        Iterator it = this.f9052k.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a().f(th);
        }
        this.f9052k.clear();
    }

    public final Bitmap v(Size size, float[] fArr, int i8) {
        float[] fArr2 = (float[]) fArr.clone();
        I.r.c(fArr2, i8, 0.5f, 0.5f);
        I.r.d(fArr2, 0.5f);
        return this.f9042a.p(I.x.o(size, i8), fArr2);
    }

    public final void w(final A.J j8, final Map map) {
        try {
            F1.c.a(new F1.c.InterfaceC0112c() { // from class: Q.d
                @Override // F1.c.InterfaceC0112c
                public final Object a(F1.c.a aVar) {
                    return C1570t.m(this.f9011a, j8, map, aVar);
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

    public final void x(C6.u uVar) {
        if (this.f9052k.isEmpty()) {
            return;
        }
        if (uVar == null) {
            u(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = this.f9052k.iterator();
                int iC = -1;
                int iB = -1;
                Bitmap bitmapV = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (iC != bVar.c() || bitmapV == null) {
                        iC = bVar.c();
                        if (bitmapV != null) {
                            bitmapV.recycle();
                        }
                        bitmapV = v((Size) uVar.e(), (float[]) uVar.f(), iC);
                        iB = -1;
                    }
                    if (iB != bVar.b()) {
                        byteArrayOutputStream.reset();
                        iB = bVar.b();
                        bitmapV.compress(Bitmap.CompressFormat.JPEG, iB, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                    }
                    Surface surface = (Surface) uVar.d();
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.q(surface, byteArray);
                    bVar.a().c(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e8) {
            u(e8);
        }
    }

    public C1570t(A.J j8, Map map) {
        this.f9046e = new AtomicBoolean(false);
        this.f9047f = new float[16];
        this.f9048g = new float[16];
        this.f9049h = new LinkedHashMap();
        this.f9050i = 0;
        this.f9051j = false;
        this.f9052k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f9043b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f9045d = handler;
        this.f9044c = J.a.e(handler);
        this.f9042a = new z();
        try {
            w(j8, map);
        } catch (RuntimeException e8) {
            a();
            throw e8;
        }
    }

    public static /* synthetic */ void n() {
    }
}
