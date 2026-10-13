package p031d3;

import android.graphics.PointF;
import java.util.Collections;
import p130o3.a;
import p130o3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class n extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PointF f19786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PointF f19787j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f19788k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f19789l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f19790m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c f19791n;

    public n(a aVar, a aVar2) {
        super(Collections.EMPTY_LIST);
        this.f19786i = new PointF();
        this.f19787j = new PointF();
        this.f19788k = aVar;
        this.f19789l = aVar2;
        n(f());
    }

    @Override // p031d3.a
    public void n(float f8) {
        this.f19788k.n(f8);
        this.f19789l.n(f8);
        this.f19786i.set(((Float) this.f19788k.h()).floatValue(), ((Float) this.f19789l.h()).floatValue());
        for (int i8 = 0; i8 < this.f19745a.size(); i8++) {
            ((a.b) this.f19745a.get(i8)).a();
        }
    }

    @Override // p031d3.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    @Override // p031d3.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF i(a aVar, float f8) {
        float f9;
        Float f10;
        a aVarB;
        a aVarB2;
        Float f11 = null;
        if (this.f19790m == null || (aVarB2 = this.f19788k.b()) == null) {
            f9 = f8;
            f10 = null;
        } else {
            float fD = this.f19788k.d();
            Float f12 = aVarB2.f30878h;
            c cVar = this.f19790m;
            float f13 = aVarB2.f30877g;
            f9 = f8;
            f10 = (Float) cVar.b(f13, f12 == null ? f13 : f12.floatValue(), (Float) aVarB2.f30872b, (Float) aVarB2.f30873c, f8, f8, fD);
        }
        if (this.f19791n != null && (aVarB = this.f19789l.b()) != null) {
            float fD2 = this.f19789l.d();
            Float f14 = aVarB.f30878h;
            c cVar2 = this.f19791n;
            float f15 = aVarB.f30877g;
            f11 = (Float) cVar2.b(f15, f14 == null ? f15 : f14.floatValue(), (Float) aVarB.f30872b, (Float) aVarB.f30873c, f9, f9, fD2);
        }
        if (f10 == null) {
            this.f19787j.set(this.f19786i.x, 0.0f);
        } else {
            this.f19787j.set(f10.floatValue(), 0.0f);
        }
        if (f11 == null) {
            PointF pointF = this.f19787j;
            pointF.set(pointF.x, this.f19786i.y);
        } else {
            PointF pointF2 = this.f19787j;
            pointF2.set(pointF2.x, f11.floatValue());
        }
        return this.f19787j;
    }

    public void s(c cVar) {
        c cVar2 = this.f19790m;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f19790m = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public void t(c cVar) {
        c cVar2 = this.f19791n;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f19791n = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
