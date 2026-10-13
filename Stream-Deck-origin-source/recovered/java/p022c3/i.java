package p022c3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import p004a3.J;
import p004a3.N;
import p010b0.m;
import p031d3.a;
import p031d3.q;
import p076i3.d;
import p076i3.f;
import p076i3.g;
import p085j3.b;
import p130o3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class i extends a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final a f16129A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public q f16130B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f16131r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f16132s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m f16133t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final m f16134u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f16135v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final g f16136w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f16137x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a f16138y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a f16139z;

    public i(J j8, b bVar, f fVar) {
        super(j8, bVar, fVar.b().b(), fVar.g().b(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.f16133t = new m();
        this.f16134u = new m();
        this.f16135v = new RectF();
        this.f16131r = fVar.j();
        this.f16136w = fVar.f();
        this.f16132s = fVar.n();
        this.f16137x = (int) (j8.J().d() / 32.0f);
        a aVarA = fVar.e().a();
        this.f16138y = aVarA;
        aVarA.a(this);
        bVar.i(aVarA);
        a aVarA2 = fVar.l().a();
        this.f16139z = aVarA2;
        aVarA2.a(this);
        bVar.i(aVarA2);
        a aVarA3 = fVar.d().a();
        this.f16129A = aVarA3;
        aVarA3.a(this);
        bVar.i(aVarA3);
    }

    @Override // p022c3.a, p058g3.f
    public void c(Object obj, c cVar) {
        super.c(obj, cVar);
        if (obj == N.f13142L) {
            q qVar = this.f16130B;
            if (qVar != null) {
                this.f16061f.H(qVar);
            }
            if (cVar == null) {
                this.f16130B = null;
                return;
            }
            q qVar2 = new q(cVar);
            this.f16130B = qVar2;
            qVar2.a(this);
            this.f16061f.i(this.f16130B);
        }
    }

    @Override // p022c3.a, p022c3.e
    public void f(Canvas canvas, Matrix matrix, int i8) {
        if (this.f16132s) {
            return;
        }
        d(this.f16135v, matrix, false);
        Shader shaderL = this.f16136w == g.LINEAR ? l() : m();
        shaderL.setLocalMatrix(matrix);
        this.f16064i.setShader(shaderL);
        super.f(canvas, matrix, i8);
    }

    @Override // p022c3.c
    public String getName() {
        return this.f16131r;
    }

    public final int[] j(int[] iArr) {
        q qVar = this.f16130B;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i8 = 0;
            if (iArr.length == numArr.length) {
                while (i8 < iArr.length) {
                    iArr[i8] = numArr[i8].intValue();
                    i8++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i8 < numArr.length) {
                    iArr[i8] = numArr[i8].intValue();
                    i8++;
                }
            }
        }
        return iArr;
    }

    public final int k() {
        int iRound = Math.round(this.f16139z.f() * this.f16137x);
        int iRound2 = Math.round(this.f16129A.f() * this.f16137x);
        int iRound3 = Math.round(this.f16138y.f() * this.f16137x);
        int i8 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i8 = i8 * 31 * iRound2;
        }
        return iRound3 != 0 ? i8 * 31 * iRound3 : i8;
    }

    public final LinearGradient l() {
        long jK = k();
        LinearGradient linearGradient = (LinearGradient) this.f16133t.e(jK);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f16139z.h();
        PointF pointF2 = (PointF) this.f16129A.h();
        d dVar = (d) this.f16138y.h();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, j(dVar.d()), dVar.e(), Shader.TileMode.CLAMP);
        this.f16133t.i(jK, linearGradient2);
        return linearGradient2;
    }

    public final RadialGradient m() {
        long jK = k();
        RadialGradient radialGradient = (RadialGradient) this.f16134u.e(jK);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f16139z.h();
        PointF pointF2 = (PointF) this.f16129A.h();
        d dVar = (d) this.f16138y.h();
        int[] iArrJ = j(dVar.d());
        float[] fArrE = dVar.e();
        float f8 = pointF.x;
        float f9 = pointF.y;
        RadialGradient radialGradient2 = new RadialGradient(f8, f9, (float) Math.hypot(pointF2.x - f8, pointF2.y - f9), iArrJ, fArrE, Shader.TileMode.CLAMP);
        this.f16134u.i(jK, radialGradient2);
        return radialGradient2;
    }
}
