package p155r4;

import android.util.SparseArray;
import java.util.HashMap;
import p032d4.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SparseArray f32516a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static HashMap f32517b;

    static {
        HashMap map = new HashMap();
        f32517b = map;
        map.put(d.DEFAULT, 0);
        f32517b.put(d.VERY_LOW, 1);
        f32517b.put(d.HIGHEST, 2);
        for (d dVar : f32517b.keySet()) {
            f32516a.append(((Integer) f32517b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f32517b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i8) {
        d dVar = (d) f32516a.get(i8);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i8);
    }
}
