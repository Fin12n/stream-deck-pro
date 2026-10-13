package p022c3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p004a3.C1705k;
import p004a3.J;
import p031d3.a;
import p031d3.p;
import p058g3.e;
import p058g3.f;
import p067h3.l;
import p076i3.c;
import p076i3.q;
import p085j3.b;
import p121n3.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class d implements e, m, a.b, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f16076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f16077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f16078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Path f16079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f16080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f16081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f16082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f16083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final J f16084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f16085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p f16086k;

    public d(J j8, b bVar, q qVar, C1705k c1705k) {
        this(j8, bVar, qVar.c(), qVar.d(), e(j8, c1705k, bVar, qVar.b()), i(qVar.b()));
    }

    public static List e(J j8, C1705k c1705k, b bVar, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i8 = 0; i8 < list.size(); i8++) {
            c cVarA = ((c) list.get(i8)).a(j8, c1705k, bVar);
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return arrayList;
    }

    public static l i(List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            c cVar = (c) list.get(i8);
            if (cVar instanceof l) {
                return (l) cVar;
            }
        }
        return null;
    }

    @Override // d3.a.b
    public void a() {
        this.f16084i.invalidateSelf();
    }

    @Override // p022c3.c
    public void b(List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f16083h.size());
        arrayList.addAll(list);
        for (int size = this.f16083h.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f16083h.get(size);
            cVar.b(arrayList, this.f16083h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // p058g3.f
    public void c(Object obj, p130o3.c cVar) {
        p pVar = this.f16086k;
        if (pVar != null) {
            pVar.c(obj, cVar);
        }
    }

    @Override // p022c3.e
    public void d(RectF rectF, Matrix matrix, boolean z8) {
        this.f16078c.set(matrix);
        p pVar = this.f16086k;
        if (pVar != null) {
            this.f16078c.preConcat(pVar.f());
        }
        this.f16080e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f16083h.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f16083h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).d(this.f16080e, this.f16078c, z8);
                rectF.union(this.f16080e);
            }
        }
    }

    @Override // p022c3.e
    public void f(Canvas canvas, Matrix matrix, int i8) {
        if (this.f16082g) {
            return;
        }
        this.f16078c.set(matrix);
        p pVar = this.f16086k;
        if (pVar != null) {
            this.f16078c.preConcat(pVar.f());
            i8 = (int) (((((this.f16086k.h() == null ? 100 : ((Integer) this.f16086k.h().h()).intValue()) / 100.0f) * i8) / 255.0f) * 255.0f);
        }
        boolean z8 = this.f16084i.f0() && m() && i8 != 255;
        if (z8) {
            this.f16077b.set(0.0f, 0.0f, 0.0f, 0.0f);
            d(this.f16077b, this.f16078c, true);
            this.f16076a.setAlpha(i8);
            j.m(canvas, this.f16077b, this.f16076a);
        }
        if (z8) {
            i8 = 255;
        }
        for (int size = this.f16083h.size() - 1; size >= 0; size--) {
            Object obj = this.f16083h.get(size);
            if (obj instanceof e) {
                ((e) obj).f(canvas, this.f16078c, i8);
            }
        }
        if (z8) {
            canvas.restore();
        }
    }

    @Override // p058g3.f
    public void g(e eVar, int i8, List list, e eVar2) {
        if (eVar.g(getName(), i8) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i8)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i8)) {
                int iE = i8 + eVar.e(getName(), i8);
                for (int i9 = 0; i9 < this.f16083h.size(); i9++) {
                    c cVar = (c) this.f16083h.get(i9);
                    if (cVar instanceof f) {
                        ((f) cVar).g(eVar, iE, list, eVar2);
                    }
                }
            }
        }
    }

    @Override // p022c3.c
    public String getName() {
        return this.f16081f;
    }

    public List j() {
        return this.f16083h;
    }

    public List k() {
        if (this.f16085j == null) {
            this.f16085j = new ArrayList();
            for (int i8 = 0; i8 < this.f16083h.size(); i8++) {
                c cVar = (c) this.f16083h.get(i8);
                if (cVar instanceof m) {
                    this.f16085j.add((m) cVar);
                }
            }
        }
        return this.f16085j;
    }

    public Matrix l() {
        p pVar = this.f16086k;
        if (pVar != null) {
            return pVar.f();
        }
        this.f16078c.reset();
        return this.f16078c;
    }

    public final boolean m() {
        int i8 = 0;
        for (int i9 = 0; i9 < this.f16083h.size(); i9++) {
            if ((this.f16083h.get(i9) instanceof e) && (i8 = i8 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // p022c3.m
    public Path w() {
        this.f16078c.reset();
        p pVar = this.f16086k;
        if (pVar != null) {
            this.f16078c.set(pVar.f());
        }
        this.f16079d.reset();
        if (this.f16082g) {
            return this.f16079d;
        }
        for (int size = this.f16083h.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f16083h.get(size);
            if (cVar instanceof m) {
                this.f16079d.addPath(((m) cVar).w(), this.f16078c);
            }
        }
        return this.f16079d;
    }

    public d(J j8, b bVar, String str, boolean z8, List list, l lVar) {
        this.f16076a = new p013b3.a();
        this.f16077b = new RectF();
        this.f16078c = new Matrix();
        this.f16079d = new Path();
        this.f16080e = new RectF();
        this.f16081f = str;
        this.f16084i = j8;
        this.f16082g = z8;
        this.f16083h = list;
        if (lVar != null) {
            p pVarB = lVar.b();
            this.f16086k = pVarB;
            pVarB.a(bVar);
            this.f16086k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = (c) list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).e(list.listIterator(list.size()));
        }
    }
}
