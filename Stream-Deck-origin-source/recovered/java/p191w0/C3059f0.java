package p191w0;

import C6.G;
import L0.i;
import Q6.k;
import S6.c;
import kotlin.jvm.internal.u;
import p038e1.I;
import p038e1.J;
import p038e1.a0;
import p056g1.A;
import p056g1.AbstractC2345i;
import p056g1.InterfaceC2344h;

/* JADX INFO: renamed from: w0.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3059f0 extends i.c implements InterfaceC2344h, A {

    /* JADX INFO: renamed from: w0.f0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f35862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a0 f35863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f35864c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i8, a0 a0Var, int i9) {
            super(1);
            this.f35862a = i8;
            this.f35863b = a0Var;
            this.f35864c = i9;
        }

        public final void b(a0.a aVar) {
            a0.a.f(aVar, this.f35863b, c.d((this.f35862a - this.f35863b.y0()) / 2.0f), c.d((this.f35864c - this.f35863b.h0()) / 2.0f), 0.0f, 4, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    @Override // p056g1.A
    public I c(J j8, p038e1.G g8, long j9) {
        long j10 = Q.f35663c;
        a0 a0VarJ = g8.J(j9);
        boolean z8 = K1() && ((Boolean) AbstractC2345i.a(this, Q.b())).booleanValue();
        int iMax = z8 ? Math.max(a0VarJ.y0(), j8.V0(A1.k.h(j10))) : a0VarJ.y0();
        int iMax2 = z8 ? Math.max(a0VarJ.h0(), j8.V0(A1.k.g(j10))) : a0VarJ.h0();
        return J.X0(j8, iMax, iMax2, null, new a(iMax, a0VarJ, iMax2), 4, null);
    }
}
