package p176u1;

import p128o1.C2739d;
import p128o1.G;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class N {
    public static final C2739d a(M m8) {
        return m8.e().o(m8.g());
    }

    public static final C2739d b(M m8, int i8) {
        return m8.e().subSequence(G.k(m8.g()), Math.min(G.k(m8.g()) + i8, m8.h().length()));
    }

    public static final C2739d c(M m8, int i8) {
        return m8.e().subSequence(Math.max(0, G.l(m8.g()) - i8), G.l(m8.g()));
    }
}
