package A;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class V implements H.A0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S.a f201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile int f202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f203c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Executor f207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.camera.core.f f208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageWriter f209i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ByteBuffer f214n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ByteBuffer f215o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ByteBuffer f216p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ByteBuffer f217q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ByteBuffer f218r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ByteBuffer f219s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f204d = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Rect f210j = new Rect();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f211k = new Rect();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Matrix f212l = new Matrix();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Matrix f213m = new Matrix();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f220t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f221u = true;

    public static /* synthetic */ void b(V v8, androidx.camera.core.d dVar, Matrix matrix, androidx.camera.core.d dVar2, Rect rect, S.a aVar, F1.c.a aVar2) {
        if (!v8.f221u) {
            aVar2.f(new P1.j("ImageAnalysis is detached"));
            return;
        }
        E0 e8 = new E0(dVar2, AbstractC0884m0.f(dVar.e1().b(), dVar.e1().a(), v8.f205e ? 0 : v8.f202b, matrix, dVar.e1().c()));
        if (!rect.isEmpty()) {
            e8.d1(rect);
        }
        aVar.c(e8);
        aVar2.c(null);
    }

    public static /* synthetic */ Object c(final V v8, Executor executor, final androidx.camera.core.d dVar, final Matrix matrix, final androidx.camera.core.d dVar2, final Rect rect, final S.a aVar, final F1.c.a aVar2) {
        v8.getClass();
        executor.execute(new Runnable() { // from class: A.U
            @Override // java.lang.Runnable
            public final void run() {
                V.b(this.f194a, dVar, matrix, dVar2, rect, aVar, aVar2);
            }
        });
        return "analyzeImage";
    }

    public static androidx.camera.core.f h(int i8, int i9, int i10, int i11, int i12) {
        boolean z8 = i10 == 90 || i10 == 270;
        int i13 = z8 ? i9 : i8;
        if (!z8) {
            i8 = i9;
        }
        return new androidx.camera.core.f(AbstractC0882l0.a(i13, i8, i11, i12));
    }

    public static Matrix j(int i8, int i9, int i10, int i11, int i12) {
        Matrix matrix = new Matrix();
        if (i12 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i8, i9), I.x.f3673a, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i12);
            matrix.postConcat(I.x.c(new RectF(0.0f, 0.0f, i10, i11)));
        }
        return matrix;
    }

    public static Rect k(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    @Override // H.A0.a
    public void a(H.A0 a8) {
        try {
            androidx.camera.core.d dVarD = d(a8);
            if (dVarD != null) {
                l(dVarD);
            }
        } catch (IllegalStateException e8) {
            AbstractC0890p0.d("ImageAnalysisAnalyzer", "Failed to acquire image.", e8);
        }
    }

    public abstract androidx.camera.core.d d(H.A0 a8);

    public Y4.a e(final androidx.camera.core.d dVar) throws Throwable {
        Object obj;
        final Executor executor;
        final S.a aVar;
        boolean z8;
        androidx.camera.core.f fVar;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ByteBuffer byteBuffer5;
        ByteBuffer byteBuffer6;
        androidx.camera.core.d dVarO;
        androidx.camera.core.d dVar2;
        int i8 = this.f205e ? this.f202b : 0;
        Object obj2 = this.f220t;
        synchronized (obj2) {
            try {
                try {
                    executor = this.f207g;
                    aVar = this.f201a;
                    z8 = this.f205e && i8 != this.f203c;
                    if (z8) {
                        n(dVar, i8);
                    }
                    if (this.f205e || this.f204d == 3) {
                        g(dVar);
                    }
                    try {
                        fVar = this.f208h;
                        try {
                            imageWriter = this.f209i;
                            byteBuffer = this.f214n;
                            byteBuffer2 = this.f215o;
                            byteBuffer3 = this.f216p;
                            byteBuffer4 = this.f217q;
                            byteBuffer5 = this.f218r;
                            byteBuffer6 = this.f219s;
                        } catch (Throwable th) {
                            th = th;
                            obj = obj2;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
            }
        }
        if (aVar == null || executor == null || !this.f221u) {
            return K.n.n(new P1.j("No analyzer or executor currently set."));
        }
        if (fVar != null) {
            if (this.f204d == 2) {
                dVarO = ImageProcessingUtil.g(dVar, fVar, byteBuffer, i8, this.f206f);
            } else {
                if (this.f204d == 1) {
                    if (this.f206f) {
                        ImageProcessingUtil.c(dVar);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        dVarO = ImageProcessingUtil.n(dVar, fVar, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i8);
                    }
                }
                dVar2 = null;
            }
            dVar2 = dVarO;
        } else {
            if (this.f204d == 3) {
                if (this.f206f) {
                    ImageProcessingUtil.c(dVar);
                }
                if (byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null) {
                    dVarO = ImageProcessingUtil.o(dVar, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5, byteBuffer6, i8);
                    dVar2 = dVarO;
                }
            }
            dVar2 = null;
        }
        boolean z9 = dVar2 == null;
        final androidx.camera.core.d dVar3 = z9 ? dVar : dVar2;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.f220t) {
            if (z8 && !z9) {
                try {
                    m(dVar.g(), dVar.f(), dVar3.g(), dVar3.f());
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            this.f203c = i8;
            rect.set(this.f211k);
            matrix.set(this.f213m);
        }
        return F1.c.a(new F1.c.InterfaceC0112c() { // from class: A.T
            @Override // F1.c.InterfaceC0112c
            public final Object a(F1.c.a aVar2) {
                return V.c(this.f166a, executor, dVar, matrix, dVar3, rect, aVar, aVar2);
            }
        });
    }

    public abstract void f();

    public final void g(androidx.camera.core.d dVar) {
        if (this.f204d != 1 && this.f204d != 3) {
            if (this.f204d == 2 && this.f214n == null) {
                this.f214n = ByteBuffer.allocateDirect(dVar.g() * dVar.f() * 4);
                return;
            }
            return;
        }
        if (this.f215o == null) {
            this.f215o = ByteBuffer.allocateDirect(dVar.g() * dVar.f());
        }
        this.f215o.position(0);
        if (this.f216p == null) {
            this.f216p = ByteBuffer.allocateDirect((dVar.g() * dVar.f()) / 4);
        }
        this.f216p.position(0);
        if (this.f217q == null) {
            this.f217q = ByteBuffer.allocateDirect((dVar.g() * dVar.f()) / 4);
        }
        this.f217q.position(0);
        if (this.f204d == 3) {
            if (this.f218r == null) {
                this.f218r = ByteBuffer.allocateDirect(dVar.g() * dVar.f());
            }
            this.f218r.position(0);
            if (this.f219s == null) {
                this.f219s = ByteBuffer.allocateDirect((dVar.g() * dVar.f()) / 2);
            }
            this.f219s.position(0);
        }
    }

    public void i() {
        this.f221u = false;
        f();
    }

    public abstract void l(androidx.camera.core.d dVar);

    public final void m(int i8, int i9, int i10, int i11) {
        Matrix matrixJ = j(i8, i9, i10, i11, this.f202b);
        this.f211k = k(this.f210j, matrixJ);
        this.f213m.setConcat(this.f212l, matrixJ);
    }

    public final void n(androidx.camera.core.d dVar, int i8) {
        androidx.camera.core.f fVar = this.f208h;
        if (fVar == null) {
            return;
        }
        fVar.d();
        this.f208h = h(dVar.g(), dVar.f(), i8, this.f208h.j(), this.f208h.l());
        if (this.f204d == 1) {
            ImageWriter imageWriter = this.f209i;
            if (imageWriter != null) {
                M.a.a(imageWriter);
            }
            this.f209i = M.a.c(this.f208h.getSurface(), this.f208h.l());
        }
    }

    public void o(Executor executor, S.a aVar) {
        if (aVar == null) {
            f();
        }
        synchronized (this.f220t) {
            this.f201a = aVar;
            this.f207g = executor;
        }
    }

    public void p(boolean z8) {
        this.f206f = z8;
    }

    public void q(int i8) {
        this.f204d = i8;
    }

    public void r(boolean z8) {
        this.f205e = z8;
    }

    public void s(androidx.camera.core.f fVar) {
        synchronized (this.f220t) {
            this.f208h = fVar;
        }
    }

    public void t(int i8) {
        this.f202b = i8;
    }

    public void u(Matrix matrix) {
        synchronized (this.f220t) {
            this.f212l = matrix;
            this.f213m = new Matrix(this.f212l);
        }
    }

    public void v(Rect rect) {
        synchronized (this.f220t) {
            this.f210j = rect;
            this.f211k = new Rect(this.f210j);
        }
    }
}
