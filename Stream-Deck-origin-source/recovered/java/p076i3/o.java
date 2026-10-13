package p076i3;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p058g3.a;
import p121n3.d;
import p121n3.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PointF f24686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24687c;

    public o(PointF pointF, boolean z8, List<a> list) {
        this.f24686b = pointF;
        this.f24687c = z8;
        this.f24685a = new ArrayList(list);
    }

    public List a() {
        return this.f24685a;
    }

    public PointF b() {
        return this.f24686b;
    }

    public void c(o oVar, o oVar2, float f8) {
        if (this.f24686b == null) {
            this.f24686b = new PointF();
        }
        this.f24687c = oVar.d() || oVar2.d();
        if (oVar.a().size() != oVar2.a().size()) {
            d.c("Curves must have the same number of control points. Shape 1: " + oVar.a().size() + "\tShape 2: " + oVar2.a().size());
        }
        int iMin = Math.min(oVar.a().size(), oVar2.a().size());
        if (this.f24685a.size() < iMin) {
            for (int size = this.f24685a.size(); size < iMin; size++) {
                this.f24685a.add(new a());
            }
        } else if (this.f24685a.size() > iMin) {
            for (int size2 = this.f24685a.size() - 1; size2 >= iMin; size2--) {
                List list = this.f24685a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFB = oVar.b();
        PointF pointFB2 = oVar2.b();
        f(i.i(pointFB.x, pointFB2.x, f8), i.i(pointFB.y, pointFB2.y, f8));
        for (int size3 = this.f24685a.size() - 1; size3 >= 0; size3--) {
            a aVar = (a) oVar.a().get(size3);
            a aVar2 = (a) oVar2.a().get(size3);
            PointF pointFA = aVar.a();
            PointF pointFB3 = aVar.b();
            PointF pointFC = aVar.c();
            PointF pointFA2 = aVar2.a();
            PointF pointFB4 = aVar2.b();
            PointF pointFC2 = aVar2.c();
            ((a) this.f24685a.get(size3)).d(i.i(pointFA.x, pointFA2.x, f8), i.i(pointFA.y, pointFA2.y, f8));
            ((a) this.f24685a.get(size3)).e(i.i(pointFB3.x, pointFB4.x, f8), i.i(pointFB3.y, pointFB4.y, f8));
            ((a) this.f24685a.get(size3)).f(i.i(pointFC.x, pointFC2.x, f8), i.i(pointFC.y, pointFC2.y, f8));
        }
    }

    public boolean d() {
        return this.f24687c;
    }

    public void e(boolean z8) {
        this.f24687c = z8;
    }

    public void f(float f8, float f9) {
        if (this.f24686b == null) {
            this.f24686b = new PointF();
        }
        this.f24686b.set(f8, f9);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f24685a.size() + "closed=" + this.f24687c + '}';
    }

    public o() {
        this.f24685a = new ArrayList();
    }
}
