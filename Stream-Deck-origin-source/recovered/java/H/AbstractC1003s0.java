package H;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: H.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1003s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f3191a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f3192b = new HashMap();

    public static D a(Object obj) {
        D d8;
        synchronized (f3191a) {
            d8 = (D) f3192b.get(obj);
        }
        return d8 == null ? D.f2835a : d8;
    }
}
