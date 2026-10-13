package p166t;

import H.InterfaceC0984i0;
import H.O0;
import H.T0;
import H.U0;
import H.c1;
import H.u1;
import android.util.Size;
import p158s.a;
import p198x.o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class Q0 implements c1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q0 f33421a = new Q0();

    @Override // H.c1.e
    public void a(Size size, u1 u1Var, c1.b bVar) {
        c1 c1VarM = u1Var.m(null);
        InterfaceC0984i0 interfaceC0984i0G0 = T0.g0();
        int iP = c1.b().p();
        if (c1VarM != null) {
            iP = c1VarM.p();
            bVar.b(c1VarM.c());
            bVar.d(c1VarM.l());
            bVar.c(c1VarM.j());
            interfaceC0984i0G0 = c1VarM.g();
        }
        bVar.t(interfaceC0984i0G0);
        if (u1Var instanceof U0) {
            o.b(size, bVar);
        }
        a aVar = new a(u1Var);
        bVar.y(aVar.h0(iP));
        bVar.f(aVar.i0(U0.b()));
        bVar.k(aVar.l0(T0.b()));
        bVar.e(C2921a1.e(aVar.k0(Z.c())));
        bVar.z(u1Var.P());
        bVar.w(u1Var.W());
        O0 o0I0 = O0.i0();
        o0I0.L(a.f32610W, aVar.j0(null));
        o0I0.L(a.f32605R, Long.valueOf(aVar.m0(-1L)));
        bVar.g(o0I0);
        bVar.g(aVar.g0());
    }
}
