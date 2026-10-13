package p118n0;

import Q0.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface d {
    static /* synthetic */ Object b(d dVar, h hVar, G6.d dVar2, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
        }
        if ((i8 & 1) != 0) {
            hVar = null;
        }
        return dVar.a(hVar, dVar2);
    }

    Object a(h hVar, G6.d dVar);
}
