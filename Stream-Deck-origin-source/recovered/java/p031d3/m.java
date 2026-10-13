package p031d3;

import android.graphics.Path;
import java.util.List;
import p022c3.s;
import p076i3.o;
import p121n3.i;
import p130o3.a;
import p130o3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class m extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f19781i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f19782j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Path f19783k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Path f19784l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f19785m;

    public m(List<a> list) {
        super(list);
        this.f19781i = new o();
        this.f19782j = new Path();
    }

    @Override // p031d3.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Path i(a aVar, float f8) {
        o oVar = (o) aVar.f30872b;
        o oVar2 = (o) aVar.f30873c;
        this.f19781i.c(oVar, oVar2 == null ? oVar : oVar2, f8);
        o oVarH = this.f19781i;
        List list = this.f19785m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                oVarH = ((s) this.f19785m.get(size)).h(oVarH);
            }
        }
        i.h(oVarH, this.f19782j);
        if (this.f19749e == null) {
            return this.f19782j;
        }
        if (this.f19783k == null) {
            this.f19783k = new Path();
            this.f19784l = new Path();
        }
        i.h(oVar, this.f19783k);
        if (oVar2 != null) {
            i.h(oVar2, this.f19784l);
        }
        c cVar = this.f19749e;
        float f9 = aVar.f30877g;
        float fFloatValue = aVar.f30878h.floatValue();
        Path path = this.f19783k;
        return (Path) cVar.b(f9, fFloatValue, path, oVar2 == null ? path : this.f19784l, f8, e(), f());
    }

    public void r(List list) {
        this.f19785m = list;
    }
}
