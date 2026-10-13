package E0;

import D6.AbstractC0927g;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends AbstractC0927g {
    public abstract boolean A(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return o((Map.Entry) obj);
        }
        return false;
    }

    public final boolean o(Map.Entry entry) {
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return t(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return y((Map.Entry) obj);
        }
        return false;
    }

    public abstract boolean t(Map.Entry entry);

    public final boolean y(Map.Entry entry) {
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return A(entry);
    }
}
