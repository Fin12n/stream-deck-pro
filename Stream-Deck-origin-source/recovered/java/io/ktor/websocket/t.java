package io.ktor.websocket;

import D6.C0938s;
import D6.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class t {
    public static final List a(String value) {
        kotlin.jvm.internal.t.g(value, "value");
        List listA0 = Z6.w.A0(value, new String[]{com.amazon.a.a.o.b.f.f16777a}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(C0938s.y(listA0, 10));
        Iterator it = listA0.iterator();
        while (it.hasNext()) {
            List listA1 = Z6.w.A0((String) it.next(), new String[]{";"}, false, 0, 6, null);
            String string = Z6.w.W0((String) z.i0(listA1)).toString();
            List listD0 = z.d0(listA1, 1);
            ArrayList arrayList2 = new ArrayList(C0938s.y(listD0, 10));
            Iterator it2 = listD0.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Z6.w.W0((String) it2.next()).toString());
            }
            arrayList.add(new s(string, arrayList2));
        }
        return arrayList;
    }
}
