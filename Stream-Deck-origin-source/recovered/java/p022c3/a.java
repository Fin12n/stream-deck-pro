package p022c3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p004a3.AbstractC1699e;
import p004a3.J;
import p004a3.N;
import p031d3.c;
import p031d3.f;
import p031d3.q;
import p058g3.e;
import p067h3.d;
import p076i3.t;
import p121n3.i;
import p121n3.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements d3.a.b, k, e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J f16060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p085j3.b f16061f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f16063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f16064i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p031d3.a f16065j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p031d3.a f16066k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f16067l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p031d3.a f16068m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p031d3.a f16069n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p031d3.a f16070o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f16071p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public c f16072q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f16056a = new PathMeasure();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f16057b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f16058c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f16059d = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f16062g = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f16073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f16074b;

        public b(u uVar) {
            this.f16073a = new ArrayList();
            this.f16074b = uVar;
        }
    }

    public a(J j8, p085j3.b bVar, Paint.Cap cap, Paint.Join join, float f8, d dVar, p067h3.b bVar2, List list, p067h3.b bVar3) {
        p013b3.a aVar = new p013b3.a(1);
        this.f16064i = aVar;
        this.f16071p = 0.0f;
        this.f16060e = j8;
        this.f16061f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f8);
        this.f16066k = dVar.a();
        this.f16065j = bVar2.a();
        if (bVar3 == null) {
            this.f16068m = null;
        } else {
            this.f16068m = bVar3.a();
        }
        this.f16067l = new ArrayList(list.size());
        this.f16063h = new float[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f16067l.add(((p067h3.b) list.get(i8)).a());
        }
        bVar.i(this.f16066k);
        bVar.i(this.f16065j);
        for (int i9 = 0; i9 < this.f16067l.size(); i9++) {
            bVar.i((p031d3.a) this.f16067l.get(i9));
        }
        p031d3.a aVar2 = this.f16068m;
        if (aVar2 != null) {
            bVar.i(aVar2);
        }
        this.f16066k.a(this);
        this.f16065j.a(this);
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((p031d3.a) this.f16067l.get(i10)).a(this);
        }
        p031d3.a aVar3 = this.f16068m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
        if (bVar.x() != null) {
            p031d3.a aVarA = bVar.x().a().a();
            this.f16070o = aVarA;
            aVarA.a(this);
            bVar.i(this.f16070o);
        }
        if (bVar.z() != null) {
            this.f16072q = new c(this, bVar, bVar.z());
        }
    }

    @Override // d3.a.b
    public void a() {
        this.f16060e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[SYNTHETIC] */
    @Override // p022c3.c
    public void b(List list, List list2) {
        u uVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = (c) list.get(size);
            if (cVar instanceof u) {
                u uVar2 = (u) cVar;
                if (uVar2.j() == t.a.INDIVIDUALLY) {
                    uVar = uVar2;
                }
            }
        }
        if (uVar != null) {
            uVar.c(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            c cVar2 = (c) list2.get(size2);
            if (cVar2 instanceof u) {
                u uVar3 = (u) cVar2;
                if (uVar3.j() == t.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f16062g.add(bVar);
                    }
                    bVar = new b(uVar3);
                    uVar3.c(this);
                } else if (!(cVar2 instanceof m)) {
                    if (bVar == null) {
                        bVar = new b(uVar);
                    }
                    bVar.f16073a.add((m) cVar2);
                }
            } else if (!(cVar2 instanceof m)) {
                if (bVar == null) {
                    bVar = new b(uVar);
                }
                bVar.f16073a.add((m) cVar2);
            }
        }
        if (bVar != null) {
            this.f16062g.add(bVar);
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
            this.f16066k.o(cVar);
            return;
        }
        if (obj == N.f13165s) {
            this.f16065j.o(cVar);
            return;
        }
        if (obj == N.f13141K) {
            p031d3.a aVar = this.f16069n;
            if (aVar != null) {
                this.f16061f.H(aVar);
            }
            if (cVar == null) {
                this.f16069n = null;
                return;
            }
            q qVar = new q(cVar);
            this.f16069n = qVar;
            qVar.a(this);
            this.f16061f.i(this.f16069n);
            return;
        }
        if (obj == N.f13156j) {
            p031d3.a aVar2 = this.f16070o;
            if (aVar2 != null) {
                aVar2.o(cVar);
                return;
            }
            q qVar2 = new q(cVar);
            this.f16070o = qVar2;
            qVar2.a(this);
            this.f16061f.i(this.f16070o);
            return;
        }
        if (obj == N.f13151e && (cVar6 = this.f16072q) != null) {
            cVar6.c(cVar);
            return;
        }
        if (obj == N.f13137G && (cVar5 = this.f16072q) != null) {
            cVar5.f(cVar);
            return;
        }
        if (obj == N.f13138H && (cVar4 = this.f16072q) != null) {
            cVar4.d(cVar);
            return;
        }
        if (obj == N.f13139I && (cVar3 = this.f16072q) != null) {
            cVar3.e(cVar);
        } else {
            if (obj != N.f13140J || (cVar2 = this.f16072q) == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }

    @Override // p022c3.e
    public void d(RectF rectF, Matrix matrix, boolean z8) {
        AbstractC1699e.b("StrokeContent#getBounds");
        this.f16057b.reset();
        for (int i8 = 0; i8 < this.f16062g.size(); i8++) {
            b bVar = (b) this.f16062g.get(i8);
            for (int i9 = 0; i9 < bVar.f16073a.size(); i9++) {
                this.f16057b.addPath(((m) bVar.f16073a.get(i9)).w(), matrix);
            }
        }
        this.f16057b.computeBounds(this.f16059d, false);
        float fQ = ((p031d3.d) this.f16065j).q();
        RectF rectF2 = this.f16059d;
        float f8 = fQ / 2.0f;
        rectF2.set(rectF2.left - f8, rectF2.top - f8, rectF2.right + f8, rectF2.bottom + f8);
        rectF.set(this.f16059d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        AbstractC1699e.c("StrokeContent#getBounds");
    }

    public final void e(Matrix matrix) {
        AbstractC1699e.b("StrokeContent#applyDashPattern");
        if (this.f16067l.isEmpty()) {
            AbstractC1699e.c("StrokeContent#applyDashPattern");
            return;
        }
        float fG = j.g(matrix);
        for (int i8 = 0; i8 < this.f16067l.size(); i8++) {
            this.f16063h[i8] = ((Float) ((p031d3.a) this.f16067l.get(i8)).h()).floatValue();
            if (i8 % 2 == 0) {
                float[] fArr = this.f16063h;
                if (fArr[i8] < 1.0f) {
                    fArr[i8] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f16063h;
                if (fArr2[i8] < 0.1f) {
                    fArr2[i8] = 0.1f;
                }
            }
            float[] fArr3 = this.f16063h;
            fArr3[i8] = fArr3[i8] * fG;
        }
        p031d3.a aVar = this.f16068m;
        this.f16064i.setPathEffect(new DashPathEffect(this.f16063h, aVar == null ? 0.0f : fG * ((Float) aVar.h()).floatValue()));
        AbstractC1699e.c("StrokeContent#applyDashPattern");
    }

    @Override // p022c3.e
    public void f(Canvas canvas, Matrix matrix, int i8) {
        AbstractC1699e.b("StrokeContent#draw");
        if (j.h(matrix)) {
            AbstractC1699e.c("StrokeContent#draw");
            return;
        }
        this.f16064i.setAlpha(i.c((int) ((((i8 / 255.0f) * ((f) this.f16066k).q()) / 100.0f) * 255.0f), 0, 255));
        this.f16064i.setStrokeWidth(((p031d3.d) this.f16065j).q() * j.g(matrix));
        if (this.f16064i.getStrokeWidth() <= 0.0f) {
            AbstractC1699e.c("StrokeContent#draw");
            return;
        }
        e(matrix);
        p031d3.a aVar = this.f16069n;
        if (aVar != null) {
            this.f16064i.setColorFilter((ColorFilter) aVar.h());
        }
        p031d3.a aVar2 = this.f16070o;
        if (aVar2 != null) {
            float fFloatValue = ((Float) aVar2.h()).floatValue();
            if (fFloatValue == 0.0f) {
                this.f16064i.setMaskFilter(null);
            } else if (fFloatValue != this.f16071p) {
                this.f16064i.setMaskFilter(this.f16061f.y(fFloatValue));
            }
            this.f16071p = fFloatValue;
        }
        c cVar = this.f16072q;
        if (cVar != null) {
            cVar.b(this.f16064i);
        }
        for (int i9 = 0; i9 < this.f16062g.size(); i9++) {
            b bVar = (b) this.f16062g.get(i9);
            if (bVar.f16074b != null) {
                i(canvas, bVar, matrix);
            } else {
                AbstractC1699e.b("StrokeContent#buildPath");
                this.f16057b.reset();
                for (int size = bVar.f16073a.size() - 1; size >= 0; size--) {
                    this.f16057b.addPath(((m) bVar.f16073a.get(size)).w(), matrix);
                }
                AbstractC1699e.c("StrokeContent#buildPath");
                AbstractC1699e.b("StrokeContent#drawPath");
                canvas.drawPath(this.f16057b, this.f16064i);
                AbstractC1699e.c("StrokeContent#drawPath");
            }
        }
        AbstractC1699e.c("StrokeContent#draw");
    }

    @Override // p058g3.f
    public void g(e eVar, int i8, List list, e eVar2) {
        i.k(eVar, i8, list, eVar2, this);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x011c  */
    public final void i(Canvas canvas, b bVar, Matrix matrix) {
        float f8;
        AbstractC1699e.b("StrokeContent#applyTrimPath");
        if (bVar.f16074b == null) {
            AbstractC1699e.c("StrokeContent#applyTrimPath");
            return;
        }
        this.f16057b.reset();
        for (int size = bVar.f16073a.size() - 1; size >= 0; size--) {
            this.f16057b.addPath(((m) bVar.f16073a.get(size)).w(), matrix);
        }
        float fFloatValue = ((Float) bVar.f16074b.i().h()).floatValue() / 100.0f;
        float fFloatValue2 = ((Float) bVar.f16074b.e().h()).floatValue() / 100.0f;
        float fFloatValue3 = ((Float) bVar.f16074b.g().h()).floatValue() / 360.0f;
        if (fFloatValue < 0.01f && fFloatValue2 > 0.99f) {
            canvas.drawPath(this.f16057b, this.f16064i);
            AbstractC1699e.c("StrokeContent#applyTrimPath");
            return;
        }
        this.f16056a.setPath(this.f16057b, false);
        float length = this.f16056a.getLength();
        while (this.f16056a.nextContour()) {
            length += this.f16056a.getLength();
        }
        float f9 = fFloatValue3 * length;
        float f10 = (fFloatValue * length) + f9;
        float fMin = Math.min((fFloatValue2 * length) + f9, (f10 + length) - 1.0f);
        float f11 = 0.0f;
        for (int size2 = bVar.f16073a.size() - 1; size2 >= 0; size2--) {
            this.f16058c.set(((m) bVar.f16073a.get(size2)).w());
            this.f16058c.transform(matrix);
            this.f16056a.setPath(this.f16058c, false);
            float length2 = this.f16056a.getLength();
            if (fMin > length) {
                float f12 = fMin - length;
                if (f12 >= f11 + length2 || f11 >= f12) {
                    f8 = f11 + length2;
                    if (f8 < f10 && f11 <= fMin) {
                        if (f8 > fMin || f10 >= f11) {
                            j.a(this.f16058c, f10 < f11 ? 0.0f : (f10 - f11) / length2, fMin > f8 ? 1.0f : (fMin - f11) / length2, 0.0f);
                            canvas.drawPath(this.f16058c, this.f16064i);
                        } else {
                            canvas.drawPath(this.f16058c, this.f16064i);
                        }
                    }
                } else {
                    j.a(this.f16058c, f10 > length ? (f10 - length) / length2 : 0.0f, Math.min(f12 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f16058c, this.f16064i);
                }
            } else {
                f8 = f11 + length2;
                if (f8 < f10) {
                }
            }
            f11 += length2;
        }
        AbstractC1699e.c("StrokeContent#applyTrimPath");
    }
}
