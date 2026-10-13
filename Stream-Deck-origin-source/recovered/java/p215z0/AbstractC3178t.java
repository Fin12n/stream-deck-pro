package p215z0;

import B0.b;
import C6.G;

/* JADX INFO: renamed from: z0.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3178t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f38928a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final A f38929b = new a();

    /* JADX INFO: renamed from: z0.t$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements A {
    }

    public static final InterfaceC3171p a(InterfaceC3149e interfaceC3149e, AbstractC3173q abstractC3173q) {
        return new C3176s(abstractC3173q, interfaceC3149e, null, 4, null);
    }

    public static final N0 b(InterfaceC3149e interfaceC3149e, AbstractC3173q abstractC3173q) {
        return new C3176s(abstractC3173q, interfaceC3149e, null, 4, null);
    }

    public static final void e(B0.a aVar, Object obj, Object obj2) {
        if (aVar.b(obj)) {
            b bVar = (b) aVar.e(obj);
            if (bVar != null) {
                bVar.add(obj2);
                return;
            }
            return;
        }
        b bVar2 = new b();
        bVar2.add(obj2);
        G g8 = G.f1419a;
        aVar.j(obj, bVar2);
    }
}
