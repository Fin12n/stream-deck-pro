package H;

import android.util.ArrayMap;
import android.util.Pair;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class m1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m1 f3135b = new m1(new ArrayMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f3136a;

    public m1(Map map) {
        this.f3136a = map;
    }

    public static m1 a(Pair pair) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        return new m1(arrayMap);
    }

    public static m1 b() {
        return f3135b;
    }

    public static m1 c(m1 m1Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : m1Var.e()) {
            arrayMap.put(str, m1Var.d(str));
        }
        return new m1(arrayMap);
    }

    public Object d(String str) {
        return this.f3136a.get(str);
    }

    public Set e() {
        return this.f3136a.keySet();
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
