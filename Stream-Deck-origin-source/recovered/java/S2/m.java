package S2;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f9722a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final R2.a f9723b = new R2.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final R2.a f9724c = new R2.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f9725d = 8;

    public final i a(T2.a screen, X6.m screenDisposeListenerType, Q6.k factory) {
        t.g(screen, "screen");
        t.g(screenDisposeListenerType, "screenDisposeListenerType");
        t.g(factory, "factory");
        R2.a aVar = f9724c;
        String key = screen.getKey();
        Object obj = aVar.get(key);
        Object obj2 = obj;
        if (obj == null) {
            R2.a aVar2 = new R2.a();
            aVar2.put(screenDisposeListenerType, factory.invoke(screen.getKey()));
            aVar.put(key, aVar2);
            obj2 = aVar2;
        }
        Map map = (Map) obj2;
        Object obj3 = map.get(screenDisposeListenerType);
        if (obj3 == null) {
            obj3 = (i) factory.invoke(screen.getKey());
            map.put(screenDisposeListenerType, obj3);
        }
        return (i) obj3;
    }

    public final void b(T2.a screen) {
        t.g(screen, "screen");
        l lVar = (l) f9723b.remove(screen.getKey());
        if (lVar != null) {
            lVar.a(screen);
        }
        R2.a aVar = (R2.a) f9724c.remove(screen.getKey());
        if (aVar != null) {
            Iterator it = aVar.entrySet().iterator();
            while (it.hasNext()) {
                ((i) ((Map.Entry) it.next()).getValue()).a(screen);
            }
        }
    }
}
