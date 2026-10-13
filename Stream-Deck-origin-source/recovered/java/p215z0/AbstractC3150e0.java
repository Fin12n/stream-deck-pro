package p215z0;

import G6.d;
import G6.g;
import Q6.k;
import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;

/* JADX INFO: renamed from: z0.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3150e0 {
    public static final Object b(k kVar, d dVar) {
        return a(dVar.getContext()).V0(new C3148d0(kVar), dVar);
    }

    public static final Object c(k kVar, d dVar) {
        return a(dVar.getContext()).V0(kVar, dVar);
    }

    public static final InterfaceC3146c0 a(g gVar) {
        InterfaceC3146c0 interfaceC3146c0 = (InterfaceC3146c0) gVar.A(InterfaceC3146c0.f38734U);
        if (interfaceC3146c0 != null) {
            return interfaceC3146c0;
        }
        throw new IllegalStateException(LYdqVGvOGMNr.ecR);
    }
}
