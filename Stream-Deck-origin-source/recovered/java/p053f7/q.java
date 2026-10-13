package p053f7;

import G6.g;
import G6.h;
import p035d7.d;
import p044e7.InterfaceC2260f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface q extends InterfaceC2260f {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public static /* synthetic */ InterfaceC2260f a(q qVar, g gVar, int i8, d dVar, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i9 & 1) != 0) {
                gVar = h.f2820a;
            }
            if ((i9 & 2) != 0) {
                i8 = -3;
            }
            if ((i9 & 4) != 0) {
                dVar = d.SUSPEND;
            }
            return qVar.a(gVar, i8, dVar);
        }
    }

    InterfaceC2260f a(g gVar, int i8, d dVar);
}
