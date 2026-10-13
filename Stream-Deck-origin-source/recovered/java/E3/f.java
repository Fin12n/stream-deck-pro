package E3;

import D6.C0938s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final String a(Map map, Map.Entry entry) {
        Object obj;
        String strB;
        t.g(map, "<this>");
        t.g(entry, "entry");
        List list = (List) map.get(entry.getKey());
        if (list == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList(C0938s.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((e) it.next()).c());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (t.c(((b) obj2).a(), entry.getKey())) {
                arrayList2.add(obj2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            if (it2.hasNext()) {
                int length = ((b) next).b().length();
                do {
                    Object next2 = it2.next();
                    int length2 = ((b) next2).b().length();
                    if (length < length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it2.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        return (bVar == null || (strB = bVar.b()) == null) ? "" : strB;
    }
}
