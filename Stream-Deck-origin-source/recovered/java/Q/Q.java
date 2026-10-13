package Q;

import A.AbstractC0890p0;
import A.G0;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class Q implements G0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Surface f8970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f8973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final G0.a f8974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final G0.a f8975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f8976h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f8977i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f8978j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f8979k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public T1.a f8980l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Executor f8981m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Y4.a f8984p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public F1.c.a f8985q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Matrix f8986r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8969a = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8982n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8983o = false;

    public Q(Surface surface, int i8, int i9, Size size, G0.a aVar, G0.a aVar2, Matrix matrix) {
        float[] fArr = new float[16];
        this.f8976h = fArr;
        float[] fArr2 = new float[16];
        this.f8977i = fArr2;
        float[] fArr3 = new float[16];
        this.f8978j = fArr3;
        float[] fArr4 = new float[16];
        this.f8979k = fArr4;
        this.f8970b = surface;
        this.f8971c = i8;
        this.f8972d = i9;
        this.f8973e = size;
        this.f8974f = aVar;
        this.f8975g = aVar2;
        this.f8986r = matrix;
        j(fArr, fArr3, aVar);
        j(fArr2, fArr4, aVar2);
        this.f8984p = F1.c.a(new F1.c.InterfaceC0112c() { // from class: Q.O
            @Override // F1.c.InterfaceC0112c
            public final Object a(F1.c.a aVar3) {
                return Q.b(this.f8966a, aVar3);
            }
        });
    }

    public static /* synthetic */ Object b(Q q8, F1.c.a aVar) {
        q8.f8985q = aVar;
        return "SurfaceOutputImpl close future complete";
    }

    public static /* synthetic */ void c(Q q8, AtomicReference atomicReference) {
        q8.getClass();
        ((T1.a) atomicReference.get()).accept(G0.b.c(0, q8));
    }

    public static void j(float[] fArr, float[] fArr2, G0.a aVar) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (aVar == null) {
            return;
        }
        I.r.d(fArr, 0.5f);
        I.r.c(fArr, aVar.e(), 0.5f, 0.5f);
        if (aVar.d()) {
            android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeO = I.x.o(aVar.c(), aVar.e());
        Matrix matrixE = I.x.e(I.x.r(aVar.c()), I.x.r(sizeO), aVar.e(), aVar.d());
        RectF rectF = new RectF(aVar.b());
        matrixE.mapRect(rectF);
        float width = rectF.left / sizeO.getWidth();
        float height = ((sizeO.getHeight() - rectF.height()) - rectF.top) / sizeO.getHeight();
        float fWidth = rectF.width() / sizeO.getWidth();
        float fHeight = rectF.height() / sizeO.getHeight();
        android.opengl.Matrix.translateM(fArr, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        o(fArr2, aVar.a());
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    public static void o(float[] fArr, H.J j8) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        I.r.d(fArr, 0.5f);
        if (j8 != null) {
            T1.f.j(j8.p(), "Camera has no transform.");
            I.r.c(fArr, j8.c().d(), 0.5f, 0.5f);
            if (j8.e()) {
                android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }

    @Override // A.G0
    public Surface J(Executor executor, T1.a aVar) {
        boolean z8;
        synchronized (this.f8969a) {
            this.f8981m = executor;
            this.f8980l = aVar;
            z8 = this.f8982n;
        }
        if (z8) {
            v();
        }
        return this.f8970b;
    }

    @Override // A.G0
    public void O(float[] fArr, float[] fArr2, boolean z8) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, z8 ? this.f8976h : this.f8977i, 0);
    }

    @Override // A.G0
    public void P(float[] fArr, float[] fArr2) {
        O(fArr, fArr2, true);
    }

    @Override // A.G0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f8969a) {
            try {
                if (!this.f8983o) {
                    this.f8983o = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f8985q.c(null);
    }

    @Override // A.G0
    public int getFormat() {
        return this.f8972d;
    }

    @Override // A.G0
    public Size k() {
        return this.f8973e;
    }

    public Y4.a t() {
        return this.f8984p;
    }

    public void v() {
        Executor executor;
        T1.a aVar;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f8969a) {
            try {
                if (this.f8981m == null || (aVar = this.f8980l) == null) {
                    this.f8982n = true;
                } else if (!this.f8983o) {
                    atomicReference.set(aVar);
                    executor = this.f8981m;
                    this.f8982n = false;
                }
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: Q.P
                    @Override // java.lang.Runnable
                    public final void run() {
                        Q.c(this.f8967a, atomicReference);
                    }
                });
            } catch (RejectedExecutionException e8) {
                AbstractC0890p0.b("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e8);
            }
        }
    }
}
