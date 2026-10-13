package p159s0;

import Q0.f;
import Q0.g;
import p128o1.E;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class O {
    public static final float a(E e8, int i8, boolean z8, boolean z9) {
        return e8.j(i8, e8.c(((!z8 || z9) && (z8 || !z9)) ? Math.max(i8 + (-1), 0) : i8) == e8.y(i8));
    }

    public static final long b(E e8, int i8, boolean z8, boolean z9) {
        int iQ = e8.q(i8);
        return iQ >= e8.n() ? f.f9082b.b() : g.a(a(e8, i8, z8, z9), e8.m(iQ));
    }
}
