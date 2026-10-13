package androidx.compose.ui.input.key;

import L0.i;
import Q6.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final i a(i iVar, k kVar) {
        return iVar.j(new KeyInputElement(kVar, null));
    }

    public static final i b(i iVar, k kVar) {
        return iVar.j(new KeyInputElement(null, kVar));
    }
}
