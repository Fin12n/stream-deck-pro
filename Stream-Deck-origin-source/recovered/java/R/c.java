package R;

import A.AbstractC0890p0;
import A.G0;
import A.I;
import A.J;
import Q.z;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c extends z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9237n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9238o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final I f9239p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final I f9240q;

    public c(I i8, I i9) {
        this.f9239p = i8;
        this.f9240q = i9;
    }

    public static float[] u(Size size, Size size2, I i8) {
        float[] fArrL = S.d.l();
        float[] fArrL2 = S.d.l();
        float[] fArrL3 = S.d.l();
        Matrix.scaleM(fArrL, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        if (((Float) i8.c().f9823a).floatValue() != 0.0f || ((Float) i8.c().f9824b).floatValue() != 0.0f) {
            Matrix.translateM(fArrL2, 0, ((Float) i8.b().f9823a).floatValue() / ((Float) i8.c().f9823a).floatValue(), ((Float) i8.b().f9824b).floatValue() / ((Float) i8.c().f9824b).floatValue(), 0.0f);
        }
        Matrix.multiplyMM(fArrL3, 0, fArrL, 0, fArrL2, 0);
        return fArrL3;
    }

    @Override // Q.z
    public S.e h(J j8, Map map) throws Throwable {
        S.e eVarH = super.h(j8, map);
        this.f9237n = S.d.p();
        this.f9238o = S.d.p();
        return eVarH;
    }

    @Override // Q.z
    public void k() {
        super.k();
        this.f9237n = -1;
        this.f9238o = -1;
    }

    public int t(boolean z8) {
        S.d.i(this.f9063a, true);
        S.d.h(this.f9065c);
        return z8 ? this.f9237n : this.f9238o;
    }

    public void v(long j8, Surface surface, G0 g8, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
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
        S.g gVar = gVarF;
        if (surface != this.f9071i) {
            i(gVar.a());
            this.f9071i = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        w(gVar, g8, surfaceTexture, this.f9239p, this.f9237n, true);
        w(gVar, g8, surfaceTexture2, this.f9240q, this.f9238o, false);
        EGLExt.eglPresentationTimeANDROID(this.f9066d, gVar.a(), j8);
        if (EGL14.eglSwapBuffers(this.f9066d, gVar.a())) {
            return;
        }
        AbstractC0890p0.l("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m(surface, false);
    }

    public final void w(S.g gVar, G0 g8, SurfaceTexture surfaceTexture, I i8, int i9, boolean z8) {
        s(i9);
        GLES20.glViewport(0, 0, gVar.c(), gVar.b());
        GLES20.glScissor(0, 0, gVar.c(), gVar.b());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        g8.O(fArr2, fArr, z8);
        S.d.f fVar = (S.d.f) T1.f.g(this.f9073k);
        if (fVar instanceof S.d.g) {
            ((S.d.g) fVar).h(fArr2);
        }
        fVar.e(u(new Size((int) (gVar.c() * ((Float) i8.c().f9823a).floatValue()), (int) (gVar.b() * ((Float) i8.c().f9824b).floatValue())), new Size(gVar.c(), gVar.b()), i8));
        fVar.d(i8.a());
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        S.d.g("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
