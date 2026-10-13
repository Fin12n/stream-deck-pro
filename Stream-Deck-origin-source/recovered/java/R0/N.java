package R0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class N implements H0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f9325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RectF f9326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f9327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Matrix f9328e;

    /* JADX WARN: Multi-variable type inference failed */
    public N() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // R0.H0
    public boolean a() {
        return this.f9325b.isConvex();
    }

    @Override // R0.H0
    public void b(float f8, float f9) {
        this.f9325b.rMoveTo(f8, f9);
    }

    @Override // R0.H0
    public void c(float f8, float f9, float f10, float f11, float f12, float f13) {
        this.f9325b.rCubicTo(f8, f9, f10, f11, f12, f13);
    }

    @Override // R0.H0
    public void close() {
        this.f9325b.close();
    }

    @Override // R0.H0
    public void d(float f8, float f9, float f10, float f11) {
        this.f9325b.quadTo(f8, f9, f10, f11);
    }

    @Override // R0.H0
    public void e(float f8, float f9, float f10, float f11) {
        this.f9325b.rQuadTo(f8, f9, f10, f11);
    }

    @Override // R0.H0
    public void f(int i8) {
        this.f9325b.setFillType(J0.d(i8, J0.f9308a.a()) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // R0.H0
    public int g() {
        return this.f9325b.getFillType() == Path.FillType.EVEN_ODD ? J0.f9308a.a() : J0.f9308a.b();
    }

    @Override // R0.H0
    public Q0.h getBounds() {
        if (this.f9326c == null) {
            this.f9326c = new RectF();
        }
        RectF rectF = this.f9326c;
        kotlin.jvm.internal.t.d(rectF);
        this.f9325b.computeBounds(rectF, true);
        return new Q0.h(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // R0.H0
    public boolean h(H0 h8, H0 h9, int i8) {
        Path.Op op;
        L0.a aVar = L0.f9316a;
        if (L0.f(i8, aVar.a())) {
            op = Path.Op.DIFFERENCE;
        } else if (L0.f(i8, aVar.b())) {
            op = Path.Op.INTERSECT;
        } else if (L0.f(i8, aVar.c())) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = L0.f(i8, aVar.d()) ? Path.Op.UNION : Path.Op.XOR;
        }
        Path path = this.f9325b;
        if (!(h8 instanceof N)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path pathT = ((N) h8).t();
        if (h9 instanceof N) {
            return path.op(pathT, ((N) h9).t(), op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // R0.H0
    public void i(Q0.j jVar) {
        if (this.f9326c == null) {
            this.f9326c = new RectF();
        }
        RectF rectF = this.f9326c;
        kotlin.jvm.internal.t.d(rectF);
        rectF.set(jVar.e(), jVar.g(), jVar.f(), jVar.a());
        if (this.f9327d == null) {
            this.f9327d = new float[8];
        }
        float[] fArr = this.f9327d;
        kotlin.jvm.internal.t.d(fArr);
        fArr[0] = Q0.a.d(jVar.h());
        fArr[1] = Q0.a.e(jVar.h());
        fArr[2] = Q0.a.d(jVar.i());
        fArr[3] = Q0.a.e(jVar.i());
        fArr[4] = Q0.a.d(jVar.c());
        fArr[5] = Q0.a.e(jVar.c());
        fArr[6] = Q0.a.d(jVar.b());
        fArr[7] = Q0.a.e(jVar.b());
        Path path = this.f9325b;
        RectF rectF2 = this.f9326c;
        kotlin.jvm.internal.t.d(rectF2);
        float[] fArr2 = this.f9327d;
        kotlin.jvm.internal.t.d(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    @Override // R0.H0
    public boolean isEmpty() {
        return this.f9325b.isEmpty();
    }

    @Override // R0.H0
    public void j(float f8, float f9) {
        this.f9325b.moveTo(f8, f9);
    }

    @Override // R0.H0
    public void k(float f8, float f9, float f10, float f11, float f12, float f13) {
        this.f9325b.cubicTo(f8, f9, f10, f11, f12, f13);
    }

    @Override // R0.H0
    public void l() {
        this.f9325b.rewind();
    }

    @Override // R0.H0
    public void m(long j8) {
        Matrix matrix = this.f9328e;
        if (matrix == null) {
            this.f9328e = new Matrix();
        } else {
            kotlin.jvm.internal.t.d(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.f9328e;
        kotlin.jvm.internal.t.d(matrix2);
        matrix2.setTranslate(Q0.f.o(j8), Q0.f.p(j8));
        Path path = this.f9325b;
        Matrix matrix3 = this.f9328e;
        kotlin.jvm.internal.t.d(matrix3);
        path.transform(matrix3);
    }

    @Override // R0.H0
    public void o(float f8, float f9) {
        this.f9325b.rLineTo(f8, f9);
    }

    @Override // R0.H0
    public void p(H0 h8, long j8) {
        Path path = this.f9325b;
        if (!(h8 instanceof N)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path.addPath(((N) h8).t(), Q0.f.o(j8), Q0.f.p(j8));
    }

    @Override // R0.H0
    public void q(Q0.h hVar) {
        if (!s(hVar)) {
            throw new IllegalStateException("invalid rect");
        }
        if (this.f9326c == null) {
            this.f9326c = new RectF();
        }
        RectF rectF = this.f9326c;
        kotlin.jvm.internal.t.d(rectF);
        rectF.set(hVar.i(), hVar.l(), hVar.j(), hVar.e());
        Path path = this.f9325b;
        RectF rectF2 = this.f9326c;
        kotlin.jvm.internal.t.d(rectF2);
        path.addRect(rectF2, Path.Direction.CCW);
    }

    @Override // R0.H0
    public void r(float f8, float f9) {
        this.f9325b.lineTo(f8, f9);
    }

    @Override // R0.H0
    public void reset() {
        this.f9325b.reset();
    }

    public final boolean s(Q0.h hVar) {
        if (Float.isNaN(hVar.i())) {
            throw new IllegalStateException("Rect.left is NaN");
        }
        if (Float.isNaN(hVar.l())) {
            throw new IllegalStateException("Rect.top is NaN");
        }
        if (Float.isNaN(hVar.j())) {
            throw new IllegalStateException("Rect.right is NaN");
        }
        if (Float.isNaN(hVar.e())) {
            throw new IllegalStateException("Rect.bottom is NaN");
        }
        return true;
    }

    public final Path t() {
        return this.f9325b;
    }

    public N(Path path) {
        this.f9325b = path;
    }

    public /* synthetic */ N(Path path, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? new Path() : path);
    }
}
