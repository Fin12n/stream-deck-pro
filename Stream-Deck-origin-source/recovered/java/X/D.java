package X;

import A.AbstractC0890p0;
import A.S0;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class D extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextureView f11532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SurfaceTexture f11533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Y4.a f11534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public S0 f11535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f11536i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SurfaceTexture f11537j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AtomicReference f11538k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n.a f11539l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Executor f11540m;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements TextureView.SurfaceTextureListener {

        /* JADX INFO: renamed from: X.D$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class C0298a implements K.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SurfaceTexture f11542a;

            public C0298a(SurfaceTexture surfaceTexture) {
                this.f11542a = surfaceTexture;
            }

            @Override // K.c
            public void b(Throwable th) {
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
            }

            @Override // K.c
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(S0.g gVar) {
                T1.f.j(gVar.a() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                AbstractC0890p0.a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                this.f11542a.release();
                D d8 = D.this;
                if (d8.f11537j != null) {
                    d8.f11537j = null;
                }
            }
        }

        public a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i8, int i9) {
            AbstractC0890p0.a("TextureViewImpl", "SurfaceTexture available. Size: " + i8 + "x" + i9);
            D d8 = D.this;
            d8.f11533f = surfaceTexture;
            if (d8.f11534g == null) {
                d8.q();
                return;
            }
            T1.f.g(d8.f11535h);
            AbstractC0890p0.a("TextureViewImpl", "Surface invalidated " + D.this.f11535h);
            D.this.f11535h.n().d();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            D d8 = D.this;
            d8.f11533f = null;
            Y4.a aVar = d8.f11534g;
            if (aVar == null) {
                AbstractC0890p0.a("TextureViewImpl", "SurfaceTexture about to be destroyed");
                return true;
            }
            K.n.j(aVar, new C0298a(surfaceTexture), I1.a.e(D.this.f11532e.getContext()));
            D.this.f11537j = surfaceTexture;
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i8, int i9) {
            AbstractC0890p0.a("TextureViewImpl", "SurfaceTexture size changed: " + i8 + "x" + i9);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            F1.c.a aVar = (F1.c.a) D.this.f11538k.getAndSet(null);
            if (aVar != null) {
                aVar.c(null);
            }
            D.this.getClass();
            Executor executor = D.this.f11540m;
        }
    }

    public D(FrameLayout frameLayout, f fVar) {
        super(frameLayout, fVar);
        this.f11536i = false;
        this.f11538k = new AtomicReference();
    }

    public static /* synthetic */ Object j(D d8, Surface surface, final F1.c.a aVar) {
        d8.getClass();
        AbstractC0890p0.a("TextureViewImpl", "Surface set on Preview.");
        S0 s8 = d8.f11535h;
        Executor executorA = J.a.a();
        Objects.requireNonNull(aVar);
        s8.t(surface, executorA, new T1.a() { // from class: X.C
            @Override // T1.a
            public final void accept(Object obj) {
                aVar.c((S0.g) obj);
            }
        });
        return "provideSurface[request=" + d8.f11535h + " surface=" + surface + "]";
    }

    public static /* synthetic */ void k(D d8, Surface surface, Y4.a aVar, S0 s8) {
        d8.getClass();
        AbstractC0890p0.a("TextureViewImpl", "Safe to release surface.");
        d8.o();
        surface.release();
        if (d8.f11534g == aVar) {
            d8.f11534g = null;
        }
        if (d8.f11535h == s8) {
            d8.f11535h = null;
        }
    }

    public static /* synthetic */ void l(D d8, S0 s8) {
        S0 s9 = d8.f11535h;
        if (s9 != null && s9 == s8) {
            d8.f11535h = null;
            d8.f11534g = null;
        }
        d8.o();
    }

    public static /* synthetic */ Object m(D d8, F1.c.a aVar) {
        d8.f11538k.set(aVar);
        return "textureViewImpl_waitForNextFrame";
    }

    @Override // X.n
    public View b() {
        return this.f11532e;
    }

    @Override // X.n
    public Bitmap c() {
        TextureView textureView = this.f11532e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f11532e.getBitmap();
    }

    @Override // X.n
    public void d() {
        p();
    }

    @Override // X.n
    public void e() {
        this.f11536i = true;
    }

    @Override // X.n
    public void g(final S0 s8, n.a aVar) {
        this.f11613a = s8.p();
        n();
        S0 s9 = this.f11535h;
        if (s9 != null && s9.w()) {
            o();
        }
        this.f11535h = s8;
        this.f11539l = aVar;
        s8.k(I1.a.e(this.f11532e.getContext()), new Runnable() { // from class: X.y
            @Override // java.lang.Runnable
            public final void run() {
                D.l(this.f11649a, s8);
            }
        });
        q();
    }

    @Override // X.n
    public Y4.a i() {
        return F1.c.a(new F1.c.InterfaceC0112c() { // from class: X.z
            @Override // F1.c.InterfaceC0112c
            public final Object a(F1.c.a aVar) {
                return D.m(this.f11651a, aVar);
            }
        });
    }

    public void n() {
        T1.f.g(this.f11614b);
        T1.f.g(this.f11613a);
        TextureView textureView = new TextureView(this.f11614b.getContext());
        this.f11532e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f11613a.getWidth(), this.f11613a.getHeight()));
        this.f11532e.setSurfaceTextureListener(new a());
        this.f11614b.removeAllViews();
        this.f11614b.addView(this.f11532e);
    }

    public final void o() {
        n.a aVar = this.f11539l;
        if (aVar != null) {
            aVar.a();
            this.f11539l = null;
        }
    }

    public final void p() {
        if (!this.f11536i || this.f11537j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f11532e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f11537j;
        if (surfaceTexture != surfaceTexture2) {
            this.f11532e.setSurfaceTexture(surfaceTexture2);
            this.f11537j = null;
            this.f11536i = false;
        }
    }

    public void q() {
        SurfaceTexture surfaceTexture;
        Size size = this.f11613a;
        if (size == null || (surfaceTexture = this.f11533f) == null || this.f11535h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f11613a.getHeight());
        final Surface surface = new Surface(this.f11533f);
        final S0 s8 = this.f11535h;
        final Y4.a aVarA = F1.c.a(new F1.c.InterfaceC0112c() { // from class: X.A
            @Override // F1.c.InterfaceC0112c
            public final Object a(F1.c.a aVar) {
                return D.j(this.f11525a, surface, aVar);
            }
        });
        this.f11534g = aVarA;
        aVarA.a(new Runnable() { // from class: X.B
            @Override // java.lang.Runnable
            public final void run() {
                D.k(this.f11527a, surface, aVarA, s8);
            }
        }, I1.a.e(this.f11532e.getContext()));
        f();
    }
}
