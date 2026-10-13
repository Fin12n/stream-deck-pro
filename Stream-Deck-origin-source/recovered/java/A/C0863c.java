package A;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: A.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C0863c implements H.A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageReader f240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f241b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f242c = true;

    public C0863c(ImageReader imageReader) {
        this.f240a = imageReader;
    }

    public static /* synthetic */ void a(final C0863c c0863c, Executor executor, final H.A0.a aVar, ImageReader imageReader) {
        synchronized (c0863c.f241b) {
            try {
                if (!c0863c.f242c) {
                    executor.execute(new Runnable() { // from class: A.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0863c.b(this.f238a, aVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void b(C0863c c0863c, H.A0.a aVar) {
        c0863c.getClass();
        aVar.a(c0863c);
    }

    public final boolean c(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    @Override // H.A0
    public void close() {
        synchronized (this.f241b) {
            this.f240a.close();
        }
    }

    @Override // H.A0
    public int f() {
        int height;
        synchronized (this.f241b) {
            height = this.f240a.getHeight();
        }
        return height;
    }

    @Override // H.A0
    public int g() {
        int width;
        synchronized (this.f241b) {
            width = this.f240a.getWidth();
        }
        return width;
    }

    @Override // H.A0
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f241b) {
            surface = this.f240a.getSurface();
        }
        return surface;
    }

    @Override // H.A0
    public androidx.camera.core.d h() {
        Image imageAcquireLatestImage;
        synchronized (this.f241b) {
            try {
                imageAcquireLatestImage = this.f240a.acquireLatestImage();
            } catch (RuntimeException e8) {
                if (!c(e8)) {
                    throw e8;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new androidx.camera.core.a(imageAcquireLatestImage);
        }
    }

    @Override // H.A0
    public void i(final H.A0.a aVar, final Executor executor) {
        synchronized (this.f241b) {
            this.f242c = false;
            this.f240a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: A.a
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    C0863c.a(this.f234a, executor, aVar, imageReader);
                }
            }, I.m.a());
        }
    }

    @Override // H.A0
    public int j() {
        int imageFormat;
        synchronized (this.f241b) {
            imageFormat = this.f240a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // H.A0
    public void k() {
        synchronized (this.f241b) {
            this.f242c = true;
            this.f240a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // H.A0
    public int l() {
        int maxImages;
        synchronized (this.f241b) {
            maxImages = this.f240a.getMaxImages();
        }
        return maxImages;
    }

    @Override // H.A0
    public androidx.camera.core.d m() {
        Image imageAcquireNextImage;
        synchronized (this.f241b) {
            try {
                imageAcquireNextImage = this.f240a.acquireNextImage();
            } catch (RuntimeException e8) {
                if (!c(e8)) {
                    throw e8;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new androidx.camera.core.a(imageAcquireNextImage);
        }
    }
}
