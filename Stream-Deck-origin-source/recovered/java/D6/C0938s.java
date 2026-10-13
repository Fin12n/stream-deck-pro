package D6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: D6.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C0938s extends r {
    public static List A(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            w.E(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    public static int y(Iterable iterable, int i8) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i8;
    }

    public static final Integer z(Iterable iterable) {
        kotlin.jvm.internal.t.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }
}
