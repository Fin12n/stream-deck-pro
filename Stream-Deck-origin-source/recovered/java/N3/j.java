package N3;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final boolean b(List list, String str) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!P3.i.d(((f.b) next).j(), str));
        f.b bVar = (f.b) next;
        return bVar != null && bVar.t();
    }
}
