package p031d3;

import java.util.List;
import p121n3.i;
import p130o3.a;
import p130o3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class f extends g {
    public f(List<a> list) {
        super(list);
    }

    public int q() {
        return r(b(), d());
    }

    public int r(a aVar, float f8) {
        float f9;
        if (aVar.f30872b == null || aVar.f30873c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        c cVar = this.f19749e;
        if (cVar != null) {
            f9 = f8;
            Integer num = (Integer) cVar.b(aVar.f30877g, aVar.f30878h.floatValue(), (Integer) aVar.f30872b, (Integer) aVar.f30873c, f9, e(), f());
            if (num != null) {
                return num.intValue();
            }
        } else {
            f9 = f8;
        }
        return i.j(aVar.h(), aVar.e(), f9);
    }

    @Override // p031d3.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer i(a aVar, float f8) {
        return Integer.valueOf(r(aVar, f8));
    }
}
