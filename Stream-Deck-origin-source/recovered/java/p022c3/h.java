package p022c3;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import p004a3.AbstractC1699e;
import p004a3.C1705k;
import p004a3.J;
import p004a3.N;
import p010b0.m;
import p031d3.a;
import p031d3.c;
import p031d3.q;
import p076i3.d;
import p076i3.e;
import p076i3.g;
import p085j3.b;
import p121n3.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class h implements e, a.b, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f16110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f16111d = new m();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f16112e = new m();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f16113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f16114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f16115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f16116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f16117j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f16118k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f16119l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f16120m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f16121n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f16122o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public q f16123p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final J f16124q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f16125r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a f16126s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f16127t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f16128u;

    public h(J j8, C1705k c1705k, b bVar, e eVar) {
        Path path = new Path();
        this.f16113f = path;
        this.f16114g = new p013b3.a(1);
        this.f16115h = new RectF();
        this.f16116i = new ArrayList();
        this.f16127t = 0.0f;
        this.f16110c = bVar;
        this.f16108a = eVar.f();
        this.f16109b = eVar.i();
        this.f16124q = j8;
        this.f16117j = eVar.e();
        path.setFillType(eVar.c());
        this.f16125r = (int) (c1705k.d() / 32.0f);
        a aVarA = eVar.d().a();
        this.f16118k = aVarA;
        aVarA.a(this);
        bVar.i(aVarA);
        a aVarA2 = eVar.g().a();
        this.f16119l = aVarA2;
        aVarA2.a(this);
        bVar.i(aVarA2);
        a aVarA3 = eVar.h().a();
        this.f16120m = aVarA3;
        aVarA3.a(this);
        bVar.i(aVarA3);
        a aVarA4 = eVar.b().a();
        this.f16121n = aVarA4;
        aVarA4.a(this);
        bVar.i(aVarA4);
        if (bVar.x() != null) {
            a aVarA5 = bVar.x().a().a();
            this.f16126s = aVarA5;
            aVarA5.a(this);
            bVar.i(this.f16126s);
        }
        if (bVar.z() != null) {
            this.f16128u = new c(this, bVar, bVar.z());
        }
    }

    private int[] e(int[] iArr) {
        q qVar = this.f16123p;
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

    private int i() {
        int iRound = Math.round(this.f16120m.f() * this.f16125r);
        int iRound2 = Math.round(this.f16121n.f() * this.f16125r);
        int iRound3 = Math.round(this.f16118k.f() * this.f16125r);
        int i8 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i8 = i8 * 31 * iRound2;
        }
        return iRound3 != 0 ? i8 * 31 * iRound3 : i8;
    }

    private LinearGradient j() {
        long jI = i();
        LinearGradient linearGradient = (LinearGradient) this.f16111d.e(jI);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f16120m.h();
        PointF pointF2 = (PointF) this.f16121n.h();
        d dVar = (d) this.f16118k.h();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, e(dVar.d()), dVar.e(), Shader.TileMode.CLAMP);
        this.f16111d.i(jI, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient k() {
        long jI = i();
        RadialGradient radialGradient = (RadialGradient) this.f16112e.e(jI);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f16120m.h();
        PointF pointF2 = (PointF) this.f16121n.h();
        d dVar = (d) this.f16118k.h();
        int[] iArrE = e(dVar.d());
        float[] fArrE = dVar.e();
        float f8 = pointF.x;
        float f9 = pointF.y;
        float fHypot = (float) Math.hypot(pointF2.x - f8, pointF2.y - f9);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f8, f9, fHypot, iArrE, fArrE, Shader.TileMode.CLAMP);
        this.f16112e.i(jI, radialGradient2);
        return radialGradient2;
    }

    @Override // d3.a.b
    public void a() {
        this.f16124q.invalidateSelf();
    }

    @Override // p022c3.c
    public void b(List list, List list2) {
        for (int i8 = 0; i8 < list2.size(); i8++) {
            c cVar = (c) list2.get(i8);
            if (cVar instanceof m) {
                this.f16116i.add((m) cVar);
            }
        }
    }

    @Override // p058g3.f
    public void c(Object obj, p130o3.c cVar) {
        c cVar2;
        c cVar3;
        c cVar4;
        c cVar5;
        c cVar6;
        if (obj == N.f13150d) {
            this.f16119l.o(cVar);
            return;
        }
        if (obj == N.f13141K) {
            a aVar = this.f16122o;
            if (aVar != null) {
                this.f16110c.H(aVar);
            }
            if (cVar == null) {
                this.f16122o = null;
                return;
            }
            q qVar = new q(cVar);
            this.f16122o = qVar;
            qVar.a(this);
            this.f16110c.i(this.f16122o);
            return;
        }
        if (obj == N.f13142L) {
            q qVar2 = this.f16123p;
            if (qVar2 != null) {
                this.f16110c.H(qVar2);
            }
            if (cVar == null) {
                this.f16123p = null;
                return;
            }
            this.f16111d.a();
            this.f16112e.a();
            q qVar3 = new q(cVar);
            this.f16123p = qVar3;
            qVar3.a(this);
            this.f16110c.i(this.f16123p);
            return;
        }
        if (obj == N.f13156j) {
            a aVar2 = this.f16126s;
            if (aVar2 != null) {
                aVar2.o(cVar);
                return;
            }
            q qVar4 = new q(cVar);
            this.f16126s = qVar4;
            qVar4.a(this);
            this.f16110c.i(this.f16126s);
            return;
        }
        if (obj == N.f13151e && (cVar6 = this.f16128u) != null) {
            cVar6.c(cVar);
            return;
        }
        if (obj == N.f13137G && (cVar5 = this.f16128u) != null) {
            cVar5.f(cVar);
            return;
        }
        if (obj == N.f13138H && (cVar4 = this.f16128u) != null) {
            cVar4.d(cVar);
            return;
        }
        if (obj == N.f13139I && (cVar3 = this.f16128u) != null) {
            cVar3.e(cVar);
        } else {
            if (obj != N.f13140J || (cVar2 = this.f16128u) == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }

    @Override // p022c3.e
    public void d(RectF rectF, Matrix matrix, boolean z8) {
        this.f16113f.reset();
        for (int i8 = 0; i8 < this.f16116i.size(); i8++) {
            this.f16113f.addPath(((m) this.f16116i.get(i8)).w(), matrix);
        }
        this.f16113f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // p022c3.e
    public void f(Canvas canvas, Matrix matrix, int i8) {
        if (this.f16109b) {
            return;
        }
        AbstractC1699e.b("GradientFillContent#draw");
        this.f16113f.reset();
        for (int i9 = 0; i9 < this.f16116i.size(); i9++) {
            this.f16113f.addPath(((m) this.f16116i.get(i9)).w(), matrix);
        }
        this.f16113f.computeBounds(this.f16115h, false);
        Shader shaderJ = this.f16117j == g.LINEAR ? j() : k();
        shaderJ.setLocalMatrix(matrix);
        this.f16114g.setShader(shaderJ);
        a aVar = this.f16122o;
        if (aVar != null) {
            this.f16114g.setColorFilter((ColorFilter) aVar.h());
        }
        a aVar2 = this.f16126s;
        if (aVar2 != null) {
            float fFloatValue = ((Float) aVar2.h()).floatValue();
            if (fFloatValue == 0.0f) {
                this.f16114g.setMaskFilter(null);
            } else if (fFloatValue != this.f16127t) {
                this.f16114g.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f16127t = fFloatValue;
        }
        c cVar = this.f16128u;
        if (cVar != null) {
            cVar.b(this.f16114g);
        }
        this.f16114g.setAlpha(i.c((int) ((((i8 / 255.0f) * ((Integer) this.f16119l.h()).intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f16113f, this.f16114g);
        AbstractC1699e.c("GradientFillContent#draw");
    }

    @Override // p058g3.f
    public void g(p058g3.e eVar, int i8, List list, p058g3.e eVar2) {
        i.k(eVar, i8, list, eVar2, this);
    }

    @Override // p022c3.c
    public String getName() {
        return this.f16108a;
    }
}
