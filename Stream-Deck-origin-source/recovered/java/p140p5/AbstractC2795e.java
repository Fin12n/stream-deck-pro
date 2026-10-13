package p140p5;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: p5.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2795e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f31253a = new HashMap();

    public abstract Object a(Object obj);

    public Object b(Object obj) {
        synchronized (this.f31253a) {
            try {
                if (this.f31253a.containsKey(obj)) {
                    return this.f31253a.get(obj);
                }
                Object objA = a(obj);
                this.f31253a.put(obj, objA);
                return objA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
