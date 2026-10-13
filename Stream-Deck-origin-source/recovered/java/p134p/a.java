package p134p;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f31016e = new HashMap();

    public boolean contains(Object obj) {
        return this.f31016e.containsKey(obj);
    }

    @Override // p134p.b
    public b.c m(Object obj) {
        return (b.c) this.f31016e.get(obj);
    }

    @Override // p134p.b
    public Object u(Object obj, Object obj2) {
        b.c cVarM = m(obj);
        if (cVarM != null) {
            return cVarM.f31022b;
        }
        this.f31016e.put(obj, t(obj, obj2));
        return null;
    }

    @Override // p134p.b
    public Object y(Object obj) {
        Object objY = super.y(obj);
        this.f31016e.remove(obj);
        return objY;
    }

    public Map.Entry z(Object obj) {
        if (contains(obj)) {
            return ((b.c) this.f31016e.get(obj)).f31024d;
        }
        return null;
    }
}
