package p031d3;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;
import p004a3.N;
import p067h3.l;
import p085j3.b;
import p130o3.a;
import p130o3.c;
import p130o3.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f19796a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f19797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f19798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f19799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f19800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f19801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f19802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f19803h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f19804i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f19805j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f19806k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f19807l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f19808m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f19809n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f19810o;

    public p(l lVar) {
        this.f19801f = lVar.c() == null ? null : lVar.c().a();
        this.f19802g = lVar.f() == null ? null : lVar.f().a();
        this.f19803h = lVar.h() == null ? null : lVar.h().a();
        this.f19804i = lVar.g() == null ? null : lVar.g().a();
        this.f19806k = lVar.i() == null ? null : (d) lVar.i().a();
        this.f19810o = lVar.l();
        if (this.f19806k != null) {
            this.f19797b = new Matrix();
            this.f19798c = new Matrix();
            this.f19799d = new Matrix();
            this.f19800e = new float[9];
        } else {
            this.f19797b = null;
            this.f19798c = null;
            this.f19799d = null;
            this.f19800e = null;
        }
        this.f19807l = lVar.j() == null ? null : (d) lVar.j().a();
        if (lVar.e() != null) {
            this.f19805j = lVar.e().a();
        }
        if (lVar.k() != null) {
            this.f19808m = lVar.k().a();
        } else {
            this.f19808m = null;
        }
        if (lVar.d() != null) {
            this.f19809n = lVar.d().a();
        } else {
            this.f19809n = null;
        }
    }

    public void a(b bVar) {
        bVar.i(this.f19805j);
        bVar.i(this.f19808m);
        bVar.i(this.f19809n);
        bVar.i(this.f19801f);
        bVar.i(this.f19802g);
        bVar.i(this.f19803h);
        bVar.i(this.f19804i);
        bVar.i(this.f19806k);
        bVar.i(this.f19807l);
    }

    public void b(a.b bVar) {
        a aVar = this.f19805j;
        if (aVar != null) {
            aVar.a(bVar);
        }
        a aVar2 = this.f19808m;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        a aVar3 = this.f19809n;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        a aVar4 = this.f19801f;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        a aVar5 = this.f19802g;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        a aVar6 = this.f19803h;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        a aVar7 = this.f19804i;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        d dVar = this.f19806k;
        if (dVar != null) {
            dVar.a(bVar);
        }
        d dVar2 = this.f19807l;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
    }

    public boolean c(Object obj, c cVar) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (obj == N.f13152f) {
            a aVar = this.f19801f;
            if (aVar == null) {
                this.f19801f = new q(cVar, new PointF());
                return true;
            }
            aVar.o(cVar);
            return true;
        }
        if (obj == N.f13153g) {
            a aVar2 = this.f19802g;
            if (aVar2 == null) {
                this.f19802g = new q(cVar, new PointF());
                return true;
            }
            aVar2.o(cVar);
            return true;
        }
        if (obj == N.f13154h) {
            a aVar3 = this.f19802g;
            if (aVar3 instanceof n) {
                ((n) aVar3).s(cVar);
                return true;
            }
        }
        if (obj == N.f13155i) {
            a aVar4 = this.f19802g;
            if (aVar4 instanceof n) {
                ((n) aVar4).t(cVar);
                return true;
            }
        }
        if (obj == N.f13161o) {
            a aVar5 = this.f19803h;
            if (aVar5 == null) {
                this.f19803h = new q(cVar, new d());
                return true;
            }
            aVar5.o(cVar);
            return true;
        }
        if (obj == N.f13162p) {
            a aVar6 = this.f19804i;
            if (aVar6 == null) {
                this.f19804i = new q(cVar, fValueOf2);
                return true;
            }
            aVar6.o(cVar);
            return true;
        }
        if (obj == N.f13149c) {
            a aVar7 = this.f19805j;
            if (aVar7 == null) {
                this.f19805j = new q(cVar, 100);
                return true;
            }
            aVar7.o(cVar);
            return true;
        }
        if (obj == N.f13133C) {
            a aVar8 = this.f19808m;
            if (aVar8 == null) {
                this.f19808m = new q(cVar, fValueOf);
                return true;
            }
            aVar8.o(cVar);
            return true;
        }
        if (obj == N.f13134D) {
            a aVar9 = this.f19809n;
            if (aVar9 == null) {
                this.f19809n = new q(cVar, fValueOf);
                return true;
            }
            aVar9.o(cVar);
            return true;
        }
        if (obj == N.f13163q) {
            if (this.f19806k == null) {
                this.f19806k = new d(Collections.singletonList(new a(fValueOf2)));
            }
            this.f19806k.o(cVar);
            return true;
        }
        if (obj != N.f13164r) {
            return false;
        }
        if (this.f19807l == null) {
            this.f19807l = new d(Collections.singletonList(new a(fValueOf2)));
        }
        this.f19807l.o(cVar);
        return true;
    }

    public final void d() {
        for (int i8 = 0; i8 < 9; i8++) {
            this.f19800e[i8] = 0.0f;
        }
    }

    public a e() {
        return this.f19809n;
    }

    public Matrix f() {
        PointF pointF;
        d dVar;
        PointF pointF2;
        this.f19796a.reset();
        a aVar = this.f19802g;
        if (aVar != null && (pointF2 = (PointF) aVar.h()) != null) {
            float f8 = pointF2.x;
            if (f8 != 0.0f || pointF2.y != 0.0f) {
                this.f19796a.preTranslate(f8, pointF2.y);
            }
        }
        if (!this.f19810o) {
            a aVar2 = this.f19804i;
            if (aVar2 != null) {
                float fFloatValue = aVar2 instanceof q ? ((Float) aVar2.h()).floatValue() : ((d) aVar2).q();
                if (fFloatValue != 0.0f) {
                    this.f19796a.preRotate(fFloatValue);
                }
            }
        } else if (aVar != null) {
            float f9 = aVar.f();
            PointF pointF3 = (PointF) aVar.h();
            float f10 = pointF3.x;
            float f11 = pointF3.y;
            aVar.n(1.0E-4f + f9);
            PointF pointF4 = (PointF) aVar.h();
            aVar.n(f9);
            this.f19796a.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f11, pointF4.x - f10)));
        }
        d dVar2 = this.f19806k;
        if (dVar2 != null) {
            d dVar3 = this.f19807l;
            float fCos = dVar3 == null ? 0.0f : (float) Math.cos(Math.toRadians((-dVar3.q()) + 90.0f));
            d dVar4 = this.f19807l;
            float fSin = dVar4 == null ? 1.0f : (float) Math.sin(Math.toRadians((-dVar4.q()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(dVar2.q()));
            d();
            float[] fArr = this.f19800e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f12 = -fSin;
            fArr[3] = f12;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f19797b.setValues(fArr);
            d();
            float[] fArr2 = this.f19800e;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f19798c.setValues(fArr2);
            d();
            float[] fArr3 = this.f19800e;
            fArr3[0] = fCos;
            fArr3[1] = f12;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.f19799d.setValues(fArr3);
            this.f19798c.preConcat(this.f19797b);
            this.f19799d.preConcat(this.f19798c);
            this.f19796a.preConcat(this.f19799d);
        }
        a aVar3 = this.f19803h;
        if (aVar3 != null && (dVar = (d) aVar3.h()) != null && (dVar.b() != 1.0f || dVar.c() != 1.0f)) {
            this.f19796a.preScale(dVar.b(), dVar.c());
        }
        a aVar4 = this.f19801f;
        if (aVar4 != null && (pointF = (PointF) aVar4.h()) != null) {
            float f13 = pointF.x;
            if (f13 != 0.0f || pointF.y != 0.0f) {
                this.f19796a.preTranslate(-f13, -pointF.y);
            }
        }
        return this.f19796a;
    }

    public Matrix g(float f8) {
        a aVar = this.f19802g;
        PointF pointF = aVar == null ? null : (PointF) aVar.h();
        a aVar2 = this.f19803h;
        d dVar = aVar2 == null ? null : (d) aVar2.h();
        this.f19796a.reset();
        if (pointF != null) {
            this.f19796a.preTranslate(pointF.x * f8, pointF.y * f8);
        }
        if (dVar != null) {
            double d8 = f8;
            this.f19796a.preScale((float) Math.pow(dVar.b(), d8), (float) Math.pow(dVar.c(), d8));
        }
        a aVar3 = this.f19804i;
        if (aVar3 != null) {
            float fFloatValue = ((Float) aVar3.h()).floatValue();
            a aVar4 = this.f19801f;
            PointF pointF2 = aVar4 != null ? (PointF) aVar4.h() : null;
            this.f19796a.preRotate(fFloatValue * f8, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return this.f19796a;
    }

    public a h() {
        return this.f19805j;
    }

    public a i() {
        return this.f19808m;
    }

    public void j(float f8) {
        a aVar = this.f19805j;
        if (aVar != null) {
            aVar.n(f8);
        }
        a aVar2 = this.f19808m;
        if (aVar2 != null) {
            aVar2.n(f8);
        }
        a aVar3 = this.f19809n;
        if (aVar3 != null) {
            aVar3.n(f8);
        }
        a aVar4 = this.f19801f;
        if (aVar4 != null) {
            aVar4.n(f8);
        }
        a aVar5 = this.f19802g;
        if (aVar5 != null) {
            aVar5.n(f8);
        }
        a aVar6 = this.f19803h;
        if (aVar6 != null) {
            aVar6.n(f8);
        }
        a aVar7 = this.f19804i;
        if (aVar7 != null) {
            aVar7.n(f8);
        }
        d dVar = this.f19806k;
        if (dVar != null) {
            dVar.n(f8);
        }
        d dVar2 = this.f19807l;
        if (dVar2 != null) {
            dVar2.n(f8);
        }
    }
}
