package p159s0;

import C6.G;
import Q6.k;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.u;
import p128o1.E;
import p216z1.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ F f32629a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(F f8) {
            super(1);
            this.f32629a = f8;
        }

        public final void b(C2891m c2891m) {
            if (c2891m.c().length() > 0) {
                this.f32629a.f28775a = false;
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2891m) obj);
            return G.f1419a;
        }
    }

    public static final i b(E e8, int i8) {
        return e(e8, i8) ? e8.y(i8) : e8.c(i8);
    }

    public static final z c(E e8, int i8, int i9, int i10, long j8, boolean z8, boolean z9) {
        return new G(z9, 1, 1, z8 ? null : new C2892n(new C2892n.a(b(e8, p128o1.G.n(j8)), p128o1.G.n(j8), 1L), new C2892n.a(b(e8, p128o1.G.i(j8)), p128o1.G.i(j8), 1L), p128o1.G.m(j8)), new C2891m(1L, 1, i8, i9, i10, e8));
    }

    public static final boolean d(C2892n c2892n, z zVar) {
        if (c2892n == null || zVar == null) {
            return true;
        }
        if (c2892n.e().d() == c2892n.c().d()) {
            return c2892n.e().c() == c2892n.c().c();
        }
        if ((c2892n.d() ? c2892n.e() : c2892n.c()).c() != 0) {
            return false;
        }
        if (zVar.d().l() != (c2892n.d() ? c2892n.c() : c2892n.e()).c()) {
            return false;
        }
        F f8 = new F();
        f8.f28775a = true;
        zVar.l(new a(f8));
        return f8.f28775a;
    }

    public static final boolean e(E e8, int i8) {
        if (e8.l().j().length() != 0) {
            int iQ = e8.q(i8);
            if (i8 != 0 && iQ == e8.q(i8 - 1)) {
                return false;
            }
            if (i8 != e8.l().j().length() && iQ == e8.q(i8 + 1)) {
                return false;
            }
        }
        return true;
    }
}
