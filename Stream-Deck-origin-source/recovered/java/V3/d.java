package V3;

import C6.o;
import D6.M;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final g a(g.b bVar, String str, Map map) {
        return new g.a(b.INFO, str, "navigation", "navigation", map);
    }

    public static final i b(c.a aVar, c.d screenView, Map data) {
        t.g(aVar, "<this>");
        t.g(screenView, "screenView");
        t.g(data, "data");
        return new i(new h.c(screenView.b(), (Map<String, String>) data), a(g.f10673a, screenView.b(), data));
    }

    public static final i c(c.a aVar, c.d screenView, o... data) {
        t.g(aVar, "<this>");
        t.g(screenView, "screenView");
        t.g(data, "data");
        return b(aVar, screenView, M.j((o[]) Arrays.copyOf(data, data.length)));
    }
}
