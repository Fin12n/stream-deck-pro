package H;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface a1 extends InterfaceC0984i0 {
    @Override // H.InterfaceC0984i0
    default void a(String str, InterfaceC0984i0.b bVar) {
        q().a(str, bVar);
    }

    @Override // H.InterfaceC0984i0
    default Object b(InterfaceC0984i0.a aVar, InterfaceC0984i0.c cVar) {
        return q().b(aVar, cVar);
    }

    @Override // H.InterfaceC0984i0
    default Set c() {
        return q().c();
    }

    @Override // H.InterfaceC0984i0
    default InterfaceC0984i0.c d(InterfaceC0984i0.a aVar) {
        return q().d(aVar);
    }

    @Override // H.InterfaceC0984i0
    default boolean e(InterfaceC0984i0.a aVar) {
        return q().e(aVar);
    }

    @Override // H.InterfaceC0984i0
    default Object f(InterfaceC0984i0.a aVar, Object obj) {
        return q().f(aVar, obj);
    }

    @Override // H.InterfaceC0984i0
    default Set g(InterfaceC0984i0.a aVar) {
        return q().g(aVar);
    }

    @Override // H.InterfaceC0984i0
    default Object h(InterfaceC0984i0.a aVar) {
        return q().h(aVar);
    }

    InterfaceC0984i0 q();
}
