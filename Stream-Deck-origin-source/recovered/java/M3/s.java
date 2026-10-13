package M3;

import D6.z;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static final long a(List list) {
        kotlin.jvm.internal.t.g(list, "<this>");
        if (list.isEmpty()) {
            return 0L;
        }
        List listH0 = z.H0(list);
        int size = list.size() / 2;
        return list.size() % 2 == 0 ? (((Number) listH0.get(size - 1)).longValue() + ((Number) listH0.get(size)).longValue()) / ((long) 2) : ((Number) listH0.get(size)).longValue();
    }

    public static final List b(List start, List end) {
        kotlin.jvm.internal.t.g(start, "start");
        kotlin.jvm.internal.t.g(end, "end");
        return z.X0(start, end);
    }
}
