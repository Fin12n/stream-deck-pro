package H;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p179u4.eubL.OjEsfyJYzbPn;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class Z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2928a;

    public Z0(List<V0> list) {
        this.f2928a = new ArrayList(list);
    }

    public boolean a(Class cls) {
        Iterator it = this.f2928a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((V0) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public V0 b(Class cls) {
        for (V0 v8 : this.f2928a) {
            if (v8.getClass() == cls) {
                return v8;
            }
        }
        return null;
    }

    public List c(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (V0 v8 : this.f2928a) {
            if (cls.isAssignableFrom(v8.getClass())) {
                arrayList.add(v8);
            }
        }
        return arrayList;
    }

    public static String d(Z0 z8) {
        ArrayList arrayList = new ArrayList();
        Iterator it = z8.f2928a.iterator();
        while (it.hasNext()) {
            arrayList.add(((V0) it.next()).getClass().getSimpleName());
        }
        return String.join(OjEsfyJYzbPn.YwGTeY, arrayList);
    }
}
