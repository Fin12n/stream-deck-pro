package p215z0;

import D6.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f38622a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f38623b = new Object();

    public static final boolean a(Map map, Object obj, Object obj2) {
        Object arrayList = map.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(obj, arrayList);
        }
        return ((List) arrayList).add(obj2);
    }

    public static final Object b(Map map, Object obj) {
        List list = (List) map.get(obj);
        if (list == null) {
            return null;
        }
        Object objM = w.M(list);
        if (list.isEmpty()) {
            map.remove(obj);
        }
        return objM;
    }
}
