package R0;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class L implements F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f9311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Shader f9313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1600m0 f9314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public I0 f9315e;

    public L(Paint paint) {
        this.f9311a = paint;
        this.f9312b = X.f9354a.B();
    }

    @Override // R0.F0
    public void b(float f8) {
        M.k(this.f9311a, f8);
    }

    @Override // R0.F0
    public float c() {
        return M.c(this.f9311a);
    }

    @Override // R0.F0
    public long d() {
        return M.d(this.f9311a);
    }

    @Override // R0.F0
    public void e(I0 i8) {
        M.p(this.f9311a, i8);
        this.f9315e = i8;
    }

    @Override // R0.F0
    public int f() {
        return M.g(this.f9311a);
    }

    @Override // R0.F0
    public void g(int i8) {
        M.r(this.f9311a, i8);
    }

    @Override // R0.F0
    public void h(int i8) {
        if (X.E(this.f9312b, i8)) {
            return;
        }
        this.f9312b = i8;
        M.l(this.f9311a, i8);
    }

    @Override // R0.F0
    public float i() {
        return M.h(this.f9311a);
    }

    @Override // R0.F0
    public C1600m0 j() {
        return this.f9314d;
    }

    @Override // R0.F0
    public Paint k() {
        return this.f9311a;
    }

    @Override // R0.F0
    public void l(Shader shader) {
        this.f9313c = shader;
        M.q(this.f9311a, shader);
    }

    @Override // R0.F0
    public Shader m() {
        return this.f9313c;
    }

    @Override // R0.F0
    public void n(float f8) {
        M.t(this.f9311a, f8);
    }

    @Override // R0.F0
    public void o(int i8) {
        M.o(this.f9311a, i8);
    }

    @Override // R0.F0
    public int p() {
        return M.e(this.f9311a);
    }

    @Override // R0.F0
    public int q() {
        return M.f(this.f9311a);
    }

    @Override // R0.F0
    public void r(int i8) {
        M.s(this.f9311a, i8);
    }

    @Override // R0.F0
    public void s(int i8) {
        M.v(this.f9311a, i8);
    }

    @Override // R0.F0
    public void t(long j8) {
        M.m(this.f9311a, j8);
    }

    @Override // R0.F0
    public I0 u() {
        return this.f9315e;
    }

    @Override // R0.F0
    public void v(C1600m0 c1600m0) {
        this.f9314d = c1600m0;
        M.n(this.f9311a, c1600m0);
    }

    @Override // R0.F0
    public void w(float f8) {
        M.u(this.f9311a, f8);
    }

    @Override // R0.F0
    public float x() {
        return M.i(this.f9311a);
    }

    @Override // R0.F0
    public int y() {
        return this.f9312b;
    }

    public L() {
        this(M.j());
    }
}
