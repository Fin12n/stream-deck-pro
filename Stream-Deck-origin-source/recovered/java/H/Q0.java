package H;

import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class Q0 extends m1 {
    public Q0(Map map) {
        super(map);
    }

    public static Q0 g() {
        return new Q0(new ArrayMap());
    }

    public static Q0 h(m1 m1Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : m1Var.e()) {
            arrayMap.put(str, m1Var.d(str));
        }
        return new Q0(arrayMap);
    }

    public void f(m1 m1Var) {
        Map map;
        Map map2 = this.f3136a;
        if (map2 == null || (map = m1Var.f3136a) == null) {
            return;
        }
        map2.putAll(map);
    }

    public void i(String str, Object obj) {
        this.f3136a.put(str, obj);
    }
}
