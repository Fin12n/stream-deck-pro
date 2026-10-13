package p199x0;

import K2.c;
import R0.M0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final d a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (t.c(cVar.d(), c.b.f4560d) && t.c(cVar.a(), c.C0164c.f4564d)) {
                z8 = true;
            }
            arrayList.add(new c(M0.b(cVar.getBounds()), t.c(cVar.a(), c.C0164c.f4563c), t.c(cVar.d(), c.b.f4559c), cVar.b(), t.c(cVar.c(), c.a.f4556d)));
        }
        return new d(z8, arrayList);
    }
}
