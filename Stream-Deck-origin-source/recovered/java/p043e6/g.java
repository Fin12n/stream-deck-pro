package p043e6;

import Q6.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface g {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public static g a(g gVar, k block) {
            t.g(block, "block");
            r rVarA = gVar.b().a();
            t.e(rVarA, "null cannot be cast to non-null type Options of io.ktor.network.sockets.Configurable");
            block.invoke(rVarA);
            gVar.c(rVarA);
            t.e(gVar, "null cannot be cast to non-null type T of io.ktor.network.sockets.Configurable");
            return gVar;
        }
    }

    r b();

    void c(r rVar);

    g d(k kVar);
}
