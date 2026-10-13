package androidx.compose.ui.input.nestedscroll;

import L0.i;
import p002a1.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final i a(i iVar, p002a1.a aVar, b bVar) {
        return iVar.j(new NestedScrollElement(aVar, bVar));
    }

    public static /* synthetic */ i b(i iVar, p002a1.a aVar, b bVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            bVar = null;
        }
        return a(iVar, aVar, bVar);
    }
}
