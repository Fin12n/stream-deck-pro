package p031d3;

import java.util.List;
import p121n3.i;
import p130o3.a;
import p130o3.c;
import p130o3.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class l extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f19780i;

    public l(List<a> list) {
        super(list);
        this.f19780i = new d();
    }

    @Override // p031d3.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public d i(a aVar, float f8) {
        Object obj;
        float f9;
        Object obj2 = aVar.f30872b;
        if (obj2 == null || (obj = aVar.f30873c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        d dVar = (d) obj2;
        d dVar2 = (d) obj;
        c cVar = this.f19749e;
        if (cVar != null) {
            f9 = f8;
            d dVar3 = (d) cVar.b(aVar.f30877g, aVar.f30878h.floatValue(), dVar, dVar2, f9, e(), f());
            if (dVar3 != null) {
                return dVar3;
            }
        } else {
            f9 = f8;
        }
        this.f19780i.d(i.i(dVar.b(), dVar2.b(), f9), i.i(dVar.c(), dVar2.c(), f9));
        return this.f19780i;
    }
}
