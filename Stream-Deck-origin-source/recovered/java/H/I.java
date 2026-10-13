package H;

import A.AbstractC0890p0;
import A.InterfaceC0896t;
import A.InterfaceC0905y;
import android.graphics.Rect;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface I extends InterfaceC0896t {
    Set a();

    Set c();

    String e();

    void f(AbstractC0995o abstractC0995o);

    Rect h();

    List k(int i8);

    Object m();

    default boolean n(D.b bVar, A.D0 d8) {
        for (C.b bVar2 : bVar.a()) {
            if (!bVar2.d(this, d8)) {
                AbstractC0890p0.a("CameraInfoInternal", bVar2 + " is not supported.");
                return false;
            }
        }
        try {
            o1.c(this, d8, false, bVar);
            return true;
        } catch (L.f.a | IllegalArgumentException e8) {
            AbstractC0890p0.b("CameraInfoInternal", "CameraInfoInternal.isResolvedFeatureGroupSupported failed", e8);
            return false;
        }
    }

    Z0 o();

    List p(int i8);

    void q(Executor executor, AbstractC0995o abstractC0995o);

    default void r(InterfaceC0905y interfaceC0905y) {
        o1.b(interfaceC0905y);
    }

    Set s();

    default I g() {
        return this;
    }
}
