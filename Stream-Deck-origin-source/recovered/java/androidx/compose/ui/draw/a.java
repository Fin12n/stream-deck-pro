package androidx.compose.ui.draw;

import L0.i;
import O0.c;
import O0.d;
import O0.e;
import Q6.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final c a(k kVar) {
        return new d(new e(), kVar);
    }

    public static final i b(i iVar, k kVar) {
        return iVar.j(new DrawBehindElement(kVar));
    }

    public static final i c(i iVar, k kVar) {
        return iVar.j(new DrawWithCacheElement(kVar));
    }

    public static final i d(i iVar, k kVar) {
        return iVar.j(new DrawWithContentElement(kVar));
    }
}
