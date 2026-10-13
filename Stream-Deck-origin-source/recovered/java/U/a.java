package U;

import A.J;
import H.u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static J a(List list) {
        if (list.isEmpty()) {
            return null;
        }
        J j8 = (J) list.get(0);
        Integer numValueOf = Integer.valueOf(j8.b());
        Integer numValueOf2 = Integer.valueOf(j8.a());
        for (int i8 = 1; i8 < list.size(); i8++) {
            J j9 = (J) list.get(i8);
            numValueOf = c(numValueOf, Integer.valueOf(j9.b()));
            numValueOf2 = b(numValueOf2, Integer.valueOf(j9.a()));
            if (numValueOf == null || numValueOf2 == null) {
                return null;
            }
        }
        return new J(numValueOf.intValue(), numValueOf2.intValue());
    }

    public static Integer b(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (num2.equals(0) || num.equals(num2)) {
            return num;
        }
        return null;
    }

    public static Integer c(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (!num2.equals(0)) {
            if (num.equals(2) && !num2.equals(1)) {
                return num2;
            }
            if ((!num2.equals(2) || num.equals(1)) && !num.equals(num2)) {
                return null;
            }
        }
        return num;
    }

    public static J d(Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((u1) it.next()).n());
        }
        return a(arrayList);
    }
}
