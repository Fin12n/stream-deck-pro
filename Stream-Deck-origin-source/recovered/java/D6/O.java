package D6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class O extends N {
    public static List z(Map map) {
        kotlin.jvm.internal.t.g(map, "<this>");
        if (map.size() == 0) {
            return r.n();
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return r.n();
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return C0937q.e(new C6.o(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C6.o(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new C6.o(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
