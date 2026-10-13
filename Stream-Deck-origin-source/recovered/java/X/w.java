package X;

import A.AbstractC0890p0;
import A.S0;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p179u4.eubL.OjEsfyJYzbPn;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class w extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SurfaceView f11638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f11639f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static void a(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Size f11640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public S0 f11641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public S0 f11642c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public n.a f11643d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Size f11644e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f11645f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f11646g = false;

        public b() {
        }

        public static /* synthetic */ void a(n.a aVar, S0.g gVar) {
            AbstractC0890p0.a("SurfaceViewImpl", "Safe to release surface.");
            if (aVar != null) {
                aVar.a();
            }
        }

        public final boolean b() {
            return (this.f11645f || this.f11641b == null || !Objects.equals(this.f11640a, this.f11644e)) ? false : true;
        }

        public final void c() {
            n.a aVar;
            if (this.f11641b != null) {
                AbstractC0890p0.a("SurfaceViewImpl", "Request canceled: " + this.f11641b);
                if (!this.f11641b.w() || (aVar = this.f11643d) == null) {
                    return;
                }
                aVar.a();
            }
        }

        public final void d() {
            if (this.f11641b != null) {
                AbstractC0890p0.a("SurfaceViewImpl", "Surface closed " + this.f11641b);
                this.f11641b.n().d();
            }
        }

        public void e(S0 s8, n.a aVar) {
            c();
            if (this.f11646g) {
                this.f11646g = false;
                s8.r();
                return;
            }
            this.f11641b = s8;
            this.f11643d = aVar;
            Size sizeP = s8.p();
            this.f11640a = sizeP;
            this.f11645f = false;
            if (f()) {
                return;
            }
            AbstractC0890p0.a("SurfaceViewImpl", "Wait for new Surface creation.");
            w.this.f11638e.getHolder().setFixedSize(sizeP.getWidth(), sizeP.getHeight());
        }

        public final boolean f() {
            Surface surface = w.this.f11638e.getHolder().getSurface();
            if (!b()) {
                return false;
            }
            AbstractC0890p0.a("SurfaceViewImpl", "Surface set on Preview.");
            final n.a aVar = this.f11643d;
            S0 s8 = this.f11641b;
            Objects.requireNonNull(s8);
            s8.t(surface, I1.a.e(w.this.f11638e.getContext()), new T1.a() { // from class: X.x
                @Override // T1.a
                public final void accept(Object obj) {
                    w.b.a(aVar, (S0.g) obj);
                }
            });
            this.f11645f = true;
            w.this.f();
            return true;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            S0 s8;
            AbstractC0890p0.a("SurfaceViewImpl", "Surface created.");
            if (!this.f11646g || (s8 = this.f11642c) == null) {
                return;
            }
            s8.r();
            this.f11642c = null;
            this.f11646g = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            AbstractC0890p0.a("SurfaceViewImpl", "Surface destroyed.");
            if (this.f11645f) {
                d();
            } else {
                c();
            }
            this.f11646g = true;
            S0 s8 = this.f11641b;
            if (s8 != null) {
                this.f11642c = s8;
            }
            this.f11645f = false;
            this.f11641b = null;
            this.f11643d = null;
            this.f11644e = null;
            this.f11640a = null;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i8, int i9, int i10) {
            AbstractC0890p0.a("SurfaceViewImpl", OjEsfyJYzbPn.ahkpgT + i9 + "x" + i10);
            this.f11644e = new Size(i9, i10);
            f();
        }
    }

    public w(FrameLayout frameLayout, f fVar) {
        super(frameLayout, fVar);
        this.f11639f = new b();
    }

    public static /* synthetic */ void k(Semaphore semaphore, int i8) {
        if (i8 == 0) {
            AbstractC0890p0.a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
        } else {
            AbstractC0890p0.c("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i8);
        }
        semaphore.release();
    }

    public static boolean m(SurfaceView surfaceView, Size size, S0 s8) {
        return surfaceView != null && Objects.equals(size, s8.p());
    }

    @Override // X.n
    public View b() {
        return this.f11638e;
    }

    @Override // X.n
    public Bitmap c() {
        SurfaceView surfaceView = this.f11638e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f11638e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f11638e.getWidth(), this.f11638e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        a.a(this.f11638e, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: X.v
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i8) {
                w.k(semaphore, i8);
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                AbstractC0890p0.c("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
            }
            return bitmapCreateBitmap;
        } catch (InterruptedException e8) {
            AbstractC0890p0.d("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e8);
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // X.n
    public void g(final S0 s8, final n.a aVar) {
        if (!m(this.f11638e, this.f11613a, s8)) {
            this.f11613a = s8.p();
            l();
        }
        if (aVar != null) {
            s8.k(I1.a.e(this.f11638e.getContext()), new Runnable() { // from class: X.t
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a();
                }
            });
        }
        this.f11638e.post(new Runnable() { // from class: X.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f11634a.f11639f.e(s8, aVar);
            }
        });
    }

    @Override // X.n
    public Y4.a i() {
        return K.n.p(null);
    }

    public void l() {
        T1.f.g(this.f11614b);
        T1.f.g(this.f11613a);
        SurfaceView surfaceView = new SurfaceView(this.f11614b.getContext());
        this.f11638e = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f11613a.getWidth(), this.f11613a.getHeight()));
        this.f11614b.removeAllViews();
        this.f11614b.addView(this.f11638e);
        this.f11638e.getHolder().addCallback(this.f11639f);
    }

    @Override // X.n
    public void d() {
    }

    @Override // X.n
    public void e() {
    }
}
