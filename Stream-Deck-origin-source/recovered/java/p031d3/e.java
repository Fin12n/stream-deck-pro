package p031d3;

import java.util.List;
import p076i3.d;
import p130o3.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class e extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f19768i;

    public e(List<a> list) {
        super(list);
        int iMax = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            d dVar = (d) list.get(i8).f30872b;
            if (dVar != null) {
                iMax = Math.max(iMax, dVar.f());
            }
        }
        this.f19768i = new d(new float[iMax], new int[iMax]);
    }

    @Override // p031d3.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public d i(a aVar, float f8) {
        this.f19768i.g((d) aVar.f30872b, (d) aVar.f30873c, f8);
        return this.f19768i;
    }
}
