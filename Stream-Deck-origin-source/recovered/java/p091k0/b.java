package p091k0;

import L0.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface b {
    static /* synthetic */ i b(b bVar, i iVar, float f8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
        }
        if ((i8 & 1) != 0) {
            f8 = 1.0f;
        }
        return bVar.a(iVar, f8);
    }

    i a(i iVar, float f8);
}
