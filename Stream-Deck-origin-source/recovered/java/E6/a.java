package E6;

import D6.AbstractC0927g;
import java.util.Map;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends AbstractC0927g {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return o((Map.Entry) obj);
        }
        return false;
    }

    public final boolean o(Map.Entry element) {
        t.g(element, "element");
        return t(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return y((Map.Entry) obj);
        }
        return false;
    }

    public abstract boolean t(Map.Entry entry);

    public /* bridge */ boolean y(Map.Entry entry) {
        return super.remove(entry);
    }
}
