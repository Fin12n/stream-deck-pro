package N4;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: N4.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1340x extends I implements InterfaceC1243o0 {
    public AbstractC1340x(Map map) {
        super(map);
    }

    @Override // N4.InterfaceC1243o0
    public final List b(Object obj) {
        return (List) super.j(obj);
    }

    @Override // N4.I
    public final Collection h(Object obj, Collection collection) {
        return k(obj, (List) collection, null);
    }
}
