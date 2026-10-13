package p043e6;

import io.ktor.utils.io.InterfaceC2442c;
import io.ktor.utils.io.e;
import io.ktor.utils.io.g;
import io.ktor.utils.io.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class t {
    public static final i a(n nVar) {
        kotlin.jvm.internal.t.g(nVar, "<this>");
        return new i(nVar, b(nVar), d(nVar, false, 1, null));
    }

    public static final g b(a aVar) {
        kotlin.jvm.internal.t.g(aVar, "<this>");
        InterfaceC2442c interfaceC2442cA = e.a(false);
        aVar.b(interfaceC2442cA);
        return interfaceC2442cA;
    }

    public static final j c(c cVar, boolean z8) {
        kotlin.jvm.internal.t.g(cVar, "<this>");
        InterfaceC2442c interfaceC2442cA = e.a(z8);
        cVar.t(interfaceC2442cA);
        return interfaceC2442cA;
    }

    public static /* synthetic */ j d(c cVar, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return c(cVar, z8);
    }
}
