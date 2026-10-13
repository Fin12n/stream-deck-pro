package R0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class E implements InterfaceC1586f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f9298a = F.f9301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f9299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f9300c;

    public final Region.Op A(int i8) {
        return AbstractC1596k0.d(i8, AbstractC1596k0.f9402a.a()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    public final Canvas a() {
        return this.f9298a;
    }

    @Override // R0.InterfaceC1586f0
    public void b(H0 h8, int i8) {
        Canvas canvas = this.f9298a;
        if (!(h8 instanceof N)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((N) h8).t(), A(i8));
    }

    @Override // R0.InterfaceC1586f0
    public void c(float f8, float f9, float f10, float f11, int i8) {
        this.f9298a.clipRect(f8, f9, f10, f11, A(i8));
    }

    @Override // R0.InterfaceC1586f0
    public void d(float f8, float f9) {
        this.f9298a.translate(f8, f9);
    }

    @Override // R0.InterfaceC1586f0
    public void e(H0 h8, F0 f8) {
        Canvas canvas = this.f9298a;
        if (!(h8 instanceof N)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((N) h8).t(), f8.k());
    }

    @Override // R0.InterfaceC1586f0
    public void f(Q0.h hVar, F0 f8) {
        this.f9298a.saveLayer(hVar.i(), hVar.l(), hVar.j(), hVar.e(), f8.k(), 31);
    }

    @Override // R0.InterfaceC1586f0
    public void g(float f8, float f9) {
        this.f9298a.scale(f8, f9);
    }

    @Override // R0.InterfaceC1586f0
    public void h(float f8) {
        this.f9298a.rotate(f8);
    }

    @Override // R0.InterfaceC1586f0
    public void j(float f8, float f9, float f10, float f11, float f12, float f13, boolean z8, F0 f14) {
        this.f9298a.drawArc(f8, f9, f10, f11, f12, f13, z8, f14.k());
    }

    @Override // R0.InterfaceC1586f0
    public void k() {
        this.f9298a.save();
    }

    @Override // R0.InterfaceC1586f0
    public void l() {
        C1592i0.f9397a.a(this.f9298a, false);
    }

    @Override // R0.InterfaceC1586f0
    public void n(InterfaceC1621x0 interfaceC1621x0, long j8, F0 f8) {
        this.f9298a.drawBitmap(J.b(interfaceC1621x0), Q0.f.o(j8), Q0.f.p(j8), f8.k());
    }

    @Override // R0.InterfaceC1586f0
    public void o(float[] fArr) {
        if (C0.c(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        K.a(matrix, fArr);
        this.f9298a.concat(matrix);
    }

    @Override // R0.InterfaceC1586f0
    public void p(InterfaceC1621x0 interfaceC1621x0, long j8, long j9, long j10, long j11, F0 f8) {
        if (this.f9299b == null) {
            this.f9299b = new Rect();
            this.f9300c = new Rect();
        }
        Canvas canvas = this.f9298a;
        Bitmap bitmapB = J.b(interfaceC1621x0);
        Rect rect = this.f9299b;
        kotlin.jvm.internal.t.d(rect);
        rect.left = A1.n.j(j8);
        rect.top = A1.n.k(j8);
        rect.right = A1.n.j(j8) + A1.r.g(j9);
        rect.bottom = A1.n.k(j8) + A1.r.f(j9);
        C6.G g8 = C6.G.f1419a;
        Rect rect2 = this.f9300c;
        kotlin.jvm.internal.t.d(rect2);
        rect2.left = A1.n.j(j10);
        rect2.top = A1.n.k(j10);
        rect2.right = A1.n.j(j10) + A1.r.g(j11);
        rect2.bottom = A1.n.k(j10) + A1.r.f(j11);
        canvas.drawBitmap(bitmapB, rect, rect2, f8.k());
    }

    @Override // R0.InterfaceC1586f0
    public void r(long j8, float f8, F0 f9) {
        this.f9298a.drawCircle(Q0.f.o(j8), Q0.f.p(j8), f8, f9.k());
    }

    @Override // R0.InterfaceC1586f0
    public void s(float f8, float f9, float f10, float f11, F0 f12) {
        this.f9298a.drawRect(f8, f9, f10, f11, f12.k());
    }

    @Override // R0.InterfaceC1586f0
    public void t(long j8, long j9, F0 f8) {
        this.f9298a.drawLine(Q0.f.o(j8), Q0.f.p(j8), Q0.f.o(j9), Q0.f.p(j9), f8.k());
    }

    @Override // R0.InterfaceC1586f0
    public void u(float f8, float f9, float f10, float f11, float f12, float f13, F0 f14) {
        this.f9298a.drawRoundRect(f8, f9, f10, f11, f12, f13, f14.k());
    }

    @Override // R0.InterfaceC1586f0
    public void x() {
        this.f9298a.restore();
    }

    @Override // R0.InterfaceC1586f0
    public void y() {
        C1592i0.f9397a.a(this.f9298a, true);
    }

    public final void z(Canvas canvas) {
        this.f9298a = canvas;
    }
}
