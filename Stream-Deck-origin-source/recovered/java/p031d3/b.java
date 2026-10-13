package p031d3;

import java.util.List;
import p121n3.i;
import p130o3.a;
import p130o3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b extends g {
    public b(List<a> list) {
        super(list);
    }

    public int q() {
        return r(b(), d());
    }

    public int r(a aVar, float f8) {
        float f9;
        Float f10;
        if (aVar.f30872b == null || aVar.f30873c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        c cVar = this.f19749e;
        if (cVar == null || (f10 = aVar.f30878h) == null) {
            f9 = f8;
        } else {
            f9 = f8;
            Integer num = (Integer) cVar.b(aVar.f30877g, f10.floatValue(), (Integer) aVar.f30872b, (Integer) aVar.f30873c, f9, e(), f());
            if (num != null) {
                return num.intValue();
            }
        }
        return p121n3.b.c(i.b(f9, 0.0f, 1.0f), ((Integer) aVar.f30872b).intValue(), ((Integer) aVar.f30873c).intValue());
    }

    @Override // p031d3.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer i(a aVar, float f8) {
        return Integer.valueOf(r(aVar, f8));
    }
}
