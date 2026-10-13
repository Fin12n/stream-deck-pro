package p018c;

import C6.G;
import H1.b;
import p036e.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f15996a;

    public final void a(Object obj, b bVar) {
        G g8;
        c cVar = this.f15996a;
        if (cVar != null) {
            cVar.b(obj, bVar);
            g8 = G.f1419a;
        } else {
            g8 = null;
        }
        if (g8 == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    public final void b(c cVar) {
        this.f15996a = cVar;
    }

    public final void c() {
        G g8;
        c cVar = this.f15996a;
        if (cVar != null) {
            cVar.c();
            g8 = G.f1419a;
        } else {
            g8 = null;
        }
        if (g8 == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
