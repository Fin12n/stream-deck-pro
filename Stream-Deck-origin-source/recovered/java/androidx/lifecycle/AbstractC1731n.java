package androidx.lifecycle;

import p017b7.S0;
import p017b7.Z;

/* JADX INFO: renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1731n {
    public static final AbstractC1727j a(AbstractC1726i abstractC1726i) {
        C1728k c1728k;
        kotlin.jvm.internal.t.g(abstractC1726i, "<this>");
        do {
            C1728k c1728k2 = (C1728k) abstractC1726i.c().get();
            if (c1728k2 != null) {
                return c1728k2;
            }
            c1728k = new C1728k(abstractC1726i, S0.b(null, 1, null).P1(Z.c().o1()));
        } while (!X.i.a(abstractC1726i.c(), null, c1728k));
        c1728k.b();
        return c1728k;
    }
}
