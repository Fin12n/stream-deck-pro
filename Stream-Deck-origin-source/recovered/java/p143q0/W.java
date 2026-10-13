package p143q0;

import A1.b;
import A1.d;
import A1.t;
import java.util.List;
import p128o1.C2739d;
import p128o1.D;
import p128o1.E;
import p128o1.I;
import p168t1.AbstractC3009n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class W {
    public static final boolean a(E e8, C2739d c2739d, I i8, List list, int i9, boolean z8, int i10, d dVar, t tVar, AbstractC3009n.b bVar, long j8) {
        D dL = e8.l();
        if (e8.w().j().a() || !kotlin.jvm.internal.t.c(dL.j(), c2739d) || !dL.i().G(i8) || !kotlin.jvm.internal.t.c(dL.g(), list) || dL.e() != i9 || dL.h() != z8 || !p216z1.t.e(dL.f(), i10) || !kotlin.jvm.internal.t.c(dL.b(), dVar) || dL.d() != tVar || !kotlin.jvm.internal.t.c(dL.c(), bVar) || b.p(j8) != b.p(dL.a())) {
            return false;
        }
        if (z8 || p216z1.t.e(i10, p216z1.t.f39054a.b())) {
            return b.n(j8) == b.n(dL.a()) && b.m(j8) == b.m(dL.a());
        }
        return true;
    }
}
