package Q;

import A.AbstractC0890p0;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Thread f9065c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EGLConfig f9069g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Surface f9071i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f9063a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f9064b = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EGLDisplay f9066d = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EGLContext f9067e = EGL14.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f9068f = S.d.f9550a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EGLSurface f9070h = EGL14.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map f9072j = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public S.d.f f9073k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public S.d.e f9074l = S.d.e.UNKNOWN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9075m = -1;

    public final void a(int i8) {
        GLES20.glActiveTexture(33984);
        S.d.g("glActiveTexture");
        GLES20.glBindTexture(36197, i8);
        S.d.g("glBindTexture");
    }

    public final void b(A.J j8, S.e.a aVar) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f9066d = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f9066d, iArr, 0, iArr, 1)) {
            this.f9066d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (aVar != null) {
            aVar.c(iArr[0] + "." + iArr[1]);
        }
        int i8 = j8.d() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f9066d, new int[]{12324, i8, 12323, i8, 12322, i8, 12321, j8.d() ? 2 : 8, 12325, 0, 12326, 0, 12352, j8.d() ? 64 : 4, 12610, j8.d() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f9066d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, j8.d() ? 3 : 2, 12344}, 0);
        S.d.f("eglCreateContext");
        this.f9069g = eGLConfig;
        this.f9067e = eGLContextEglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.f9066d, eGLContextEglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    public S.g c(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f9066d;
            EGLConfig eGLConfig = this.f9069g;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceQ = S.d.q(eGLDisplay, eGLConfig, surface, this.f9068f);
            Size sizeX = S.d.x(this.f9066d, eGLSurfaceQ);
            return S.g.d(eGLSurfaceQ, sizeX.getWidth(), sizeX.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e8) {
            AbstractC0890p0.m("OpenGlRenderer", "Failed to create EGL surface: " + e8.getMessage(), e8);
            return null;
        }
    }

    public final void d() {
        EGLDisplay eGLDisplay = this.f9066d;
        EGLConfig eGLConfig = this.f9069g;
        Objects.requireNonNull(eGLConfig);
        this.f9070h = S.d.n(eGLDisplay, eGLConfig, 1, 1);
    }

    public final T1.e e(A.J j8) {
        S.d.i(this.f9063a, false);
        try {
            b(j8, null);
            d();
            i(this.f9070h);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString(this.f9066d, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new T1.e(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e8) {
            AbstractC0890p0.m("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e8.getMessage(), e8);
            return new T1.e("", "");
        } finally {
            l();
        }
    }

    public S.g f(Surface surface) {
        T1.f.j(this.f9064b.containsKey(surface), "The surface is not registered.");
        S.g gVar = (S.g) this.f9064b.get(surface);
        Objects.requireNonNull(gVar);
        return gVar;
    }

    public int g() {
        S.d.i(this.f9063a, true);
        S.d.h(this.f9065c);
        return this.f9075m;
    }

    public S.e h(A.J j8, Map map) throws Throwable {
        S.d.i(this.f9063a, false);
        S.e.a aVarA = S.e.a();
        try {
            if (j8.d()) {
                T1.e eVarE = e(j8);
                String str = (String) T1.f.g((String) eVarE.f9823a);
                String str2 = (String) T1.f.g((String) eVarE.f9824b);
                if (!str.contains("GL_EXT_YUV_target")) {
                    AbstractC0890p0.l("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    j8 = A.J.f88d;
                }
                this.f9068f = S.d.k(str2, j8);
                aVarA.d(str);
                aVarA.b(str2);
            }
            b(j8, aVarA);
            d();
            i(this.f9070h);
            aVarA.e(S.d.w());
            this.f9072j = S.d.o(j8, map);
            int iP = S.d.p();
            this.f9075m = iP;
            s(iP);
            this.f9065c = Thread.currentThread();
            this.f9063a.set(true);
            return aVarA.a();
        } catch (IllegalArgumentException e8) {
            e = e8;
            l();
            throw e;
        } catch (IllegalStateException e9) {
            e = e9;
            l();
            throw e;
        }
    }

    public void i(EGLSurface eGLSurface) {
        T1.f.g(this.f9066d);
        T1.f.g(this.f9067e);
        if (!EGL14.eglMakeCurrent(this.f9066d, eGLSurface, eGLSurface, this.f9067e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void j(Surface surface) {
        S.d.i(this.f9063a, true);
        S.d.h(this.f9065c);
        if (this.f9064b.containsKey(surface)) {
            return;
        }
        this.f9064b.put(surface, S.d.f9561l);
    }

    public void k() {
        if (this.f9063a.getAndSet(false)) {
            S.d.h(this.f9065c);
            l();
        }
    }

    public final void l() {
        Iterator it = this.f9072j.values().iterator();
        while (it.hasNext()) {
            ((S.d.f) it.next()).b();
        }
        this.f9072j = Collections.EMPTY_MAP;
        this.f9073k = null;
        if (!Objects.equals(this.f9066d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f9066d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (S.g gVar : this.f9064b.values()) {
                if (!Objects.equals(gVar.a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f9066d, gVar.a())) {
                    S.d.e("eglDestroySurface");
                }
            }
            this.f9064b.clear();
            if (!Objects.equals(this.f9070h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f9066d, this.f9070h);
                this.f9070h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f9067e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f9066d, this.f9067e);
                this.f9067e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f9066d);
            this.f9066d = EGL14.EGL_NO_DISPLAY;
        }
        this.f9069g = null;
        this.f9075m = -1;
        this.f9074l = S.d.e.UNKNOWN;
        this.f9071i = null;
        this.f9065c = null;
    }

    public void m(Surface surface, boolean z8) {
        if (this.f9071i == surface) {
            this.f9071i = null;
            i(this.f9070h);
        }
        S.g gVar = z8 ? (S.g) this.f9064b.remove(surface) : (S.g) this.f9064b.put(surface, S.d.f9561l);
        if (gVar == null || gVar == S.d.f9561l) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.f9066d, gVar.a());
        } catch (RuntimeException e8) {
            AbstractC0890p0.m("OpenGlRenderer", "Failed to destroy EGL surface: " + e8.getMessage(), e8);
        }
    }

    public void n(long j8, float[] fArr, Surface surface) {
        S.d.i(this.f9063a, true);
        S.d.h(this.f9065c);
        S.g gVarF = f(surface);
        if (gVarF == S.d.f9561l) {
            gVarF = c(surface);
            if (gVarF == null) {
                return;
            } else {
                this.f9064b.put(surface, gVarF);
            }
        }
        if (surface != this.f9071i) {
            i(gVarF.a());
            this.f9071i = surface;
            GLES20.glViewport(0, 0, gVarF.c(), gVarF.b());
            GLES20.glScissor(0, 0, gVarF.c(), gVarF.b());
        }
        S.d.f fVar = (S.d.f) T1.f.g(this.f9073k);
        if (fVar instanceof S.d.g) {
            ((S.d.g) fVar).h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        S.d.g("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f9066d, gVarF.a(), j8);
        if (EGL14.eglSwapBuffers(this.f9066d, gVarF.a())) {
            return;
        }
        AbstractC0890p0.l("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m(surface, false);
    }

    public void o(S.d.e eVar) {
        S.d.i(this.f9063a, true);
        S.d.h(this.f9065c);
        if (this.f9074l != eVar) {
            this.f9074l = eVar;
            s(this.f9075m);
        }
    }

    public Bitmap p(Size size, float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(size.getWidth() * size.getHeight() * 4);
        q(byteBufferAllocateDirect, size, fArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.j(bitmapCreateBitmap, byteBufferAllocateDirect, size.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public final void q(ByteBuffer byteBuffer, Size size, float[] fArr) {
        T1.f.b(byteBuffer.capacity() == (size.getWidth() * size.getHeight()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        T1.f.b(byteBuffer.isDirect(), "ByteBuffer is not direct.");
        int iU = S.d.u();
        GLES20.glActiveTexture(33985);
        S.d.g("glActiveTexture");
        GLES20.glBindTexture(3553, iU);
        S.d.g("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, size.getWidth(), size.getHeight(), 0, 6407, 5121, null);
        S.d.g("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int iT = S.d.t();
        GLES20.glBindFramebuffer(36160, iT);
        S.d.g("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iU, 0);
        S.d.g("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        S.d.g("glActiveTexture");
        GLES20.glBindTexture(36197, this.f9075m);
        S.d.g("glBindTexture");
        this.f9071i = null;
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        S.d.f fVar = (S.d.f) T1.f.g(this.f9073k);
        if (fVar instanceof S.d.g) {
            ((S.d.g) fVar).h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        S.d.g("glDrawArrays");
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, byteBuffer);
        S.d.g("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        S.d.s(iU);
        S.d.r(iT);
        a(this.f9075m);
    }

    public void r(Surface surface) {
        S.d.i(this.f9063a, true);
        S.d.h(this.f9065c);
        m(surface, true);
    }

    public void s(int i8) {
        S.d.f fVar = (S.d.f) this.f9072j.get(this.f9074l);
        if (fVar == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + this.f9074l);
        }
        if (this.f9073k != fVar) {
            this.f9073k = fVar;
            fVar.f();
            Log.d("OpenGlRenderer", "Using program for input format " + this.f9074l + ": " + this.f9073k);
        }
        a(i8);
    }
}
