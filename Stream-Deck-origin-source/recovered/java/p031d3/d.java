package p031d3;

import java.util.List;
import p121n3.i;
import p130o3.a;
import p130o3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class d extends g {
    public d(List<a> list) {
        super(list);
    }

    public float q() {
        return r(b(), d());
    }

    public float r(a aVar, float f8) {
        float f9;
        if (aVar.f30872b == null || aVar.f30873c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        c cVar = this.f19749e;
        if (cVar != null) {
            f9 = f8;
            Float f10 = (Float) cVar.b(aVar.f30877g, aVar.f30878h.floatValue(), (Float) aVar.f30872b, (Float) aVar.f30873c, f9, e(), f());
            if (f10 != null) {
                return f10.floatValue();
            }
        } else {
            f9 = f8;
        }
        return i.i(aVar.g(), aVar.d(), f9);
    }

    @Override // p031d3.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Float i(a aVar, float f8) {
        return Float.valueOf(r(aVar, f8));
    }
}
