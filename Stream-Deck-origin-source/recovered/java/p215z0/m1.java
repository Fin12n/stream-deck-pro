package p215z0;

import C6.G;
import H0.g;
import H0.h;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f38871a = new AtomicReference(h.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f38872b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f38873c;

    public final Object a() {
        return Thread.currentThread().getId() == AbstractC3143b.e() ? this.f38873c : ((g) this.f38871a.get()).b(Thread.currentThread().getId());
    }

    public final void b(Object obj) {
        long id = Thread.currentThread().getId();
        if (id == AbstractC3143b.e()) {
            this.f38873c = obj;
            return;
        }
        synchronized (this.f38872b) {
            g gVar = (g) this.f38871a.get();
            if (gVar.d(id, obj)) {
                return;
            }
            this.f38871a.set(gVar.c(id, obj));
            G g8 = G.f1419a;
        }
    }
}
