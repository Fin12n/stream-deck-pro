package p022c3;

import L1.i;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p004a3.AbstractC1699e;
import p004a3.J;
import p004a3.N;
import p031d3.a;
import p031d3.c;
import p031d3.q;
import p058g3.e;
import p076i3.p;
import p085j3.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class g implements e, a.b, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f16095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f16096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f16097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f16100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f16101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f16102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f16103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final J f16104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f16105k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f16106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f16107m;

    public g(J j8, b bVar, p pVar) {
        Path path = new Path();
        this.f16095a = path;
        p013b3.a aVar = new p013b3.a(1);
        this.f16096b = aVar;
        this.f16100f = new ArrayList();
        this.f16097c = bVar;
        this.f16098d = pVar.d();
        this.f16099e = pVar.f();
        this.f16104j = j8;
        if (bVar.x() != null) {
            a aVarA = bVar.x().a().a();
            this.f16105k = aVarA;
            aVarA.a(this);
            bVar.i(this.f16105k);
        }
        if (bVar.z() != null) {
            this.f16107m = new c(this, bVar, bVar.z());
        }
        if (pVar.b() == null || pVar.e() == null) {
            this.f16101g = null;
            this.f16102h = null;
            return;
        }
        i.b(aVar, bVar.v().b());
        path.setFillType(pVar.c());
        a aVarA2 = pVar.b().a();
        this.f16101g = aVarA2;
        aVarA2.a(this);
        bVar.i(aVarA2);
        a aVarA3 = pVar.e().a();
        this.f16102h = aVarA3;
        aVarA3.a(this);
        bVar.i(aVarA3);
    }

    @Override // d3.a.b
    public void a() {
        this.f16104j.invalidateSelf();
    }

    @Override // p022c3.c
    public void b(List list, List list2) {
        for (int i8 = 0; i8 < list2.size(); i8++) {
            c cVar = (c) list2.get(i8);
            if (cVar instanceof m) {
                this.f16100f.add((m) cVar);
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
        if (obj == N.f13147a) {
            this.f16101g.o(cVar);
            return;
        }
        if (obj == N.f13150d) {
            this.f16102h.o(cVar);
            return;
        }
        if (obj == N.f13141K) {
            a aVar = this.f16103i;
            if (aVar != null) {
                this.f16097c.H(aVar);
            }
            if (cVar == null) {
                this.f16103i = null;
                return;
            }
            q qVar = new q(cVar);
            this.f16103i = qVar;
            qVar.a(this);
            this.f16097c.i(this.f16103i);
            return;
        }
        if (obj == N.f13156j) {
            a aVar2 = this.f16105k;
            if (aVar2 != null) {
                aVar2.o(cVar);
                return;
            }
            q qVar2 = new q(cVar);
            this.f16105k = qVar2;
            qVar2.a(this);
            this.f16097c.i(this.f16105k);
            return;
        }
        if (obj == N.f13151e && (cVar6 = this.f16107m) != null) {
            cVar6.c(cVar);
            return;
        }
        if (obj == N.f13137G && (cVar5 = this.f16107m) != null) {
            cVar5.f(cVar);
            return;
        }
        if (obj == N.f13138H && (cVar4 = this.f16107m) != null) {
            cVar4.d(cVar);
            return;
        }
        if (obj == N.f13139I && (cVar3 = this.f16107m) != null) {
            cVar3.e(cVar);
        } else {
            if (obj != N.f13140J || (cVar2 = this.f16107m) == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }

    @Override // p022c3.e
    public void d(RectF rectF, Matrix matrix, boolean z8) {
        this.f16095a.reset();
        for (int i8 = 0; i8 < this.f16100f.size(); i8++) {
            this.f16095a.addPath(((m) this.f16100f.get(i8)).w(), matrix);
        }
        this.f16095a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // p022c3.e
    public void f(Canvas canvas, Matrix matrix, int i8) {
        if (this.f16099e) {
            return;
        }
        AbstractC1699e.b("FillContent#draw");
        this.f16096b.setColor((p121n3.i.c((int) ((((i8 / 255.0f) * ((Integer) this.f16102h.h()).intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((p031d3.b) this.f16101g).q() & 16777215));
        a aVar = this.f16103i;
        if (aVar != null) {
            this.f16096b.setColorFilter((ColorFilter) aVar.h());
        }
        a aVar2 = this.f16105k;
        if (aVar2 != null) {
            float fFloatValue = ((Float) aVar2.h()).floatValue();
            if (fFloatValue == 0.0f) {
                this.f16096b.setMaskFilter(null);
            } else if (fFloatValue != this.f16106l) {
                this.f16096b.setMaskFilter(this.f16097c.y(fFloatValue));
            }
            this.f16106l = fFloatValue;
        }
        c cVar = this.f16107m;
        if (cVar != null) {
            cVar.b(this.f16096b);
        }
        this.f16095a.reset();
        for (int i9 = 0; i9 < this.f16100f.size(); i9++) {
            this.f16095a.addPath(((m) this.f16100f.get(i9)).w(), matrix);
        }
        canvas.drawPath(this.f16095a, this.f16096b);
        AbstractC1699e.c("FillContent#draw");
    }

    @Override // p058g3.f
    public void g(e eVar, int i8, List list, e eVar2) {
        p121n3.i.k(eVar, i8, list, eVar2, this);
    }

    @Override // p022c3.c
    public String getName() {
        return this.f16098d;
    }
}
