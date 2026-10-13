package p065h1;

import Q6.o;
import R0.B0;
import R0.K;
import android.graphics.Matrix;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: h1.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2411q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f24317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Matrix f24318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Matrix f24319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f24320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f24321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f24322f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24323g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f24324h = true;

    public C2411q0(o oVar) {
        this.f24317a = oVar;
    }

    public final float[] a(Object obj) {
        float[] fArrC = this.f24321e;
        if (fArrC == null) {
            fArrC = B0.c(null, 1, null);
            this.f24321e = fArrC;
        }
        if (this.f24323g) {
            this.f24324h = AbstractC2407o0.a(b(obj), fArrC);
            this.f24323g = false;
        }
        if (this.f24324h) {
            return fArrC;
        }
        return null;
    }

    public final float[] b(Object obj) {
        float[] fArrC = this.f24320d;
        if (fArrC == null) {
            fArrC = B0.c(null, 1, null);
            this.f24320d = fArrC;
        }
        if (!this.f24322f) {
            return fArrC;
        }
        Matrix matrix = this.f24318b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f24318b = matrix;
        }
        this.f24317a.invoke(obj, matrix);
        Matrix matrix2 = this.f24319c;
        if (matrix2 == null || !t.c(matrix, matrix2)) {
            K.b(fArrC, matrix);
            this.f24318b = matrix2;
            this.f24319c = matrix;
        }
        this.f24322f = false;
        return fArrC;
    }

    public final void c() {
        this.f24322f = true;
        this.f24323g = true;
    }
}
