package N3;

import D6.C0938s;
import D6.L;
import D6.U;
import D6.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static final List a(List list, List other) {
        t.g(list, "<this>");
        t.g(other, "other");
        LinkedHashMap linkedHashMap = new LinkedHashMap(W6.n.d(L.d(C0938s.y(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(P3.i.a(((p) obj).f()), obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(W6.n.d(L.d(C0938s.y(other, 10)), 16));
        for (Object obj2 : other) {
            linkedHashMap2.put(P3.i.a(((p) obj2).f()), obj2);
        }
        Set setI = U.i(z.W0(linkedHashMap.keySet()), z.W0(linkedHashMap2.keySet()));
        ArrayList arrayList = new ArrayList();
        Iterator it = setI.iterator();
        while (it.hasNext()) {
            String strG = ((P3.i) it.next()).g();
            p pVarB = (p) linkedHashMap.get(P3.i.a(strG));
            p pVar = (p) linkedHashMap2.get(P3.i.a(strG));
            if (pVar != null && pVarB != null) {
                pVarB = p.b(pVar, null, null, P3.c.c(pVarB.e(), pVar.e()), 3, null);
            } else if (pVar != null) {
                pVarB = pVar;
            }
            if (pVarB != null) {
                arrayList.add(pVarB);
            }
        }
        return arrayList;
    }
}
