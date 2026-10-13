package p082j0;

import A1.c;
import A1.n;
import C6.G;
import L0.i;
import Q6.k;
import kotlin.jvm.internal.u;
import p038e1.I;
import p038e1.InterfaceC2243n;
import p038e1.InterfaceC2244o;
import p038e1.J;
import p038e1.a0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class A extends i.c implements p056g1.A {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f27827a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a0 a0Var) {
            super(1);
            this.f27827a = a0Var;
        }

        public final void b(a0.a aVar) {
            a0.a.l(aVar, this.f27827a, n.f446b.a(), 0.0f, 2, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    @Override // p056g1.A
    public final I c(J j8, p038e1.G g8, long j9) {
        long jD2 = d2(j8, g8, j9);
        if (e2()) {
            jD2 = c.e(j9, jD2);
        }
        a0 a0VarJ = g8.J(jD2);
        return J.X0(j8, a0VarJ.y0(), a0VarJ.h0(), null, new a(a0VarJ), 4, null);
    }

    public abstract long d2(J j8, p038e1.G g8, long j9);

    public abstract boolean e2();

    @Override // p056g1.A
    public int g(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return interfaceC2243n.G(i8);
    }

    @Override // p056g1.A
    public int n(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return interfaceC2243n.W(i8);
    }

    @Override // p056g1.A
    public int o(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return interfaceC2243n.F(i8);
    }

    @Override // p056g1.A
    public int t(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return interfaceC2243n.g(i8);
    }
}
