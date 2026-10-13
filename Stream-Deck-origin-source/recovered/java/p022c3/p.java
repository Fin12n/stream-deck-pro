package p022c3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import p004a3.J;
import p004a3.N;
import p031d3.a;
import p058g3.e;
import p076i3.m;
import p085j3.b;
import p121n3.i;
import p130o3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class p implements e, m, j, a.b, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f16177a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f16178b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f16179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f16180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f16182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f16183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f16184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p031d3.p f16185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f16186j;

    public p(J j8, b bVar, m mVar) {
        this.f16179c = j8;
        this.f16180d = bVar;
        this.f16181e = mVar.c();
        this.f16182f = mVar.f();
        a aVarA = mVar.b().a();
        this.f16183g = aVarA;
        bVar.i(aVarA);
        aVarA.a(this);
        a aVarA2 = mVar.d().a();
        this.f16184h = aVarA2;
        bVar.i(aVarA2);
        aVarA2.a(this);
        p031d3.p pVarB = mVar.e().b();
        this.f16185i = pVarB;
        pVarB.a(bVar);
        pVarB.b(this);
    }

    @Override // d3.a.b
    public void a() {
        this.f16179c.invalidateSelf();
    }

    @Override // p022c3.c
    public void b(List list, List list2) {
        this.f16186j.b(list, list2);
    }

    @Override // p058g3.f
    public void c(Object obj, c cVar) {
        if (this.f16185i.c(obj, cVar)) {
            return;
        }
        if (obj == N.f13167u) {
            this.f16183g.o(cVar);
        } else if (obj == N.f13168v) {
            this.f16184h.o(cVar);
        }
    }

    @Override // p022c3.e
    public void d(RectF rectF, Matrix matrix, boolean z8) {
        this.f16186j.d(rectF, matrix, z8);
    }

    @Override // p022c3.j
    public void e(ListIterator listIterator) {
        if (this.f16186j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((c) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f16186j = new d(this.f16179c, this.f16180d, "Repeater", this.f16182f, arrayList, null);
    }

    @Override // p022c3.e
    public void f(Canvas canvas, Matrix matrix, int i8) {
        float fFloatValue = ((Float) this.f16183g.h()).floatValue();
        float fFloatValue2 = ((Float) this.f16184h.h()).floatValue();
        float fFloatValue3 = ((Float) this.f16185i.i().h()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) this.f16185i.e().h()).floatValue() / 100.0f;
        for (int i9 = ((int) fFloatValue) - 1; i9 >= 0; i9--) {
            this.f16177a.set(matrix);
            float f8 = i9;
            this.f16177a.preConcat(this.f16185i.g(f8 + fFloatValue2));
            this.f16186j.f(canvas, this.f16177a, (int) (i8 * i.i(fFloatValue3, fFloatValue4, f8 / fFloatValue)));
        }
    }

    @Override // p058g3.f
    public void g(e eVar, int i8, List list, e eVar2) {
        i.k(eVar, i8, list, eVar2, this);
        for (int i9 = 0; i9 < this.f16186j.j().size(); i9++) {
            c cVar = (c) this.f16186j.j().get(i9);
            if (cVar instanceof k) {
                i.k(eVar, i8, list, eVar2, (k) cVar);
            }
        }
    }

    @Override // p022c3.c
    public String getName() {
        return this.f16181e;
    }

    @Override // p022c3.m
    public Path w() {
        Path pathW = this.f16186j.w();
        this.f16178b.reset();
        float fFloatValue = ((Float) this.f16183g.h()).floatValue();
        float fFloatValue2 = ((Float) this.f16184h.h()).floatValue();
        for (int i8 = ((int) fFloatValue) - 1; i8 >= 0; i8--) {
            this.f16177a.set(this.f16185i.g(i8 + fFloatValue2));
            this.f16178b.addPath(pathW, this.f16177a);
        }
        return this.f16178b;
    }
}
