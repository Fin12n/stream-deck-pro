package p022c3;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
import p004a3.J;
import p004a3.N;
import p031d3.a;
import p031d3.d;
import p058g3.e;
import p076i3.l;
import p076i3.t;
import p085j3.b;
import p121n3.i;
import p130o3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class o implements a.b, k, m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f16169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J f16170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f16171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f16172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f16173h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f16176k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f16166a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f16167b = new RectF();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f16174i = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f16175j = null;

    public o(J j8, b bVar, l lVar) {
        this.f16168c = lVar.c();
        this.f16169d = lVar.f();
        this.f16170e = j8;
        a aVarA = lVar.d().a();
        this.f16171f = aVarA;
        a aVarA2 = lVar.e().a();
        this.f16172g = aVarA2;
        a aVarA3 = lVar.b().a();
        this.f16173h = aVarA3;
        bVar.i(aVarA);
        bVar.i(aVarA2);
        bVar.i(aVarA3);
        aVarA.a(this);
        aVarA2.a(this);
        aVarA3.a(this);
    }

    private void e() {
        this.f16176k = false;
        this.f16170e.invalidateSelf();
    }

    @Override // d3.a.b
    public void a() {
        e();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[SYNTHETIC] */
    @Override // p022c3.c
    public void b(List list, List list2) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            c cVar = (c) list.get(i8);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.j() == t.a.SIMULTANEOUSLY) {
                    this.f16174i.a(uVar);
                    uVar.c(this);
                } else if (cVar instanceof q) {
                    this.f16175j = ((q) cVar).g();
                }
            } else if (cVar instanceof q) {
                this.f16175j = ((q) cVar).g();
            }
        }
    }

    @Override // p058g3.f
    public void c(Object obj, c cVar) {
        if (obj == N.f13158l) {
            this.f16172g.o(cVar);
        } else if (obj == N.f13160n) {
            this.f16171f.o(cVar);
        } else if (obj == N.f13159m) {
            this.f16173h.o(cVar);
        }
    }

    @Override // p058g3.f
    public void g(e eVar, int i8, List list, e eVar2) {
        i.k(eVar, i8, list, eVar2, this);
    }

    @Override // p022c3.c
    public String getName() {
        return this.f16168c;
    }

    @Override // p022c3.m
    public Path w() {
        a aVar;
        if (this.f16176k) {
            return this.f16166a;
        }
        this.f16166a.reset();
        if (this.f16169d) {
            this.f16176k = true;
            return this.f16166a;
        }
        PointF pointF = (PointF) this.f16172g.h();
        float f8 = pointF.x / 2.0f;
        float f9 = pointF.y / 2.0f;
        a aVar2 = this.f16173h;
        float fQ = aVar2 == null ? 0.0f : ((d) aVar2).q();
        if (fQ == 0.0f && (aVar = this.f16175j) != null) {
            fQ = Math.min(((Float) aVar.h()).floatValue(), Math.min(f8, f9));
        }
        float fMin = Math.min(f8, f9);
        if (fQ > fMin) {
            fQ = fMin;
        }
        PointF pointF2 = (PointF) this.f16171f.h();
        this.f16166a.moveTo(pointF2.x + f8, (pointF2.y - f9) + fQ);
        this.f16166a.lineTo(pointF2.x + f8, (pointF2.y + f9) - fQ);
        if (fQ > 0.0f) {
            RectF rectF = this.f16167b;
            float f10 = pointF2.x;
            float f11 = fQ * 2.0f;
            float f12 = pointF2.y;
            rectF.set((f10 + f8) - f11, (f12 + f9) - f11, f10 + f8, f12 + f9);
            this.f16166a.arcTo(this.f16167b, 0.0f, 90.0f, false);
        }
        this.f16166a.lineTo((pointF2.x - f8) + fQ, pointF2.y + f9);
        if (fQ > 0.0f) {
            RectF rectF2 = this.f16167b;
            float f13 = pointF2.x;
            float f14 = pointF2.y;
            float f15 = fQ * 2.0f;
            rectF2.set(f13 - f8, (f14 + f9) - f15, (f13 - f8) + f15, f14 + f9);
            this.f16166a.arcTo(this.f16167b, 90.0f, 90.0f, false);
        }
        this.f16166a.lineTo(pointF2.x - f8, (pointF2.y - f9) + fQ);
        if (fQ > 0.0f) {
            RectF rectF3 = this.f16167b;
            float f16 = pointF2.x;
            float f17 = pointF2.y;
            float f18 = fQ * 2.0f;
            rectF3.set(f16 - f8, f17 - f9, (f16 - f8) + f18, (f17 - f9) + f18);
            this.f16166a.arcTo(this.f16167b, 180.0f, 90.0f, false);
        }
        this.f16166a.lineTo((pointF2.x + f8) - fQ, pointF2.y - f9);
        if (fQ > 0.0f) {
            RectF rectF4 = this.f16167b;
            float f19 = pointF2.x;
            float f20 = fQ * 2.0f;
            float f21 = pointF2.y;
            rectF4.set((f19 + f8) - f20, f21 - f9, f19 + f8, (f21 - f9) + f20);
            this.f16166a.arcTo(this.f16167b, 270.0f, 90.0f, false);
        }
        this.f16166a.close();
        this.f16174i.b(this.f16166a);
        this.f16176k = true;
        return this.f16166a;
    }
}
