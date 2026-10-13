package D6;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class S {
    public static Set a(Set builder) {
        kotlin.jvm.internal.t.g(builder, "builder");
        return ((E6.h) builder).o();
    }

    public static Set b() {
        return new E6.h();
    }

    public static Set c(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        kotlin.jvm.internal.t.f(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
