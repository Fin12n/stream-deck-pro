package p166t;

import H.C0980g0;
import H.InterfaceC0984i0;
import H.T0;
import H.u1;
import p158s.a;

/* JADX INFO: renamed from: t.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2920a0 implements C0980g0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2920a0 f33608a = new C2920a0();

    @Override // H.C0980g0.b
    public void a(u1 u1Var, C0980g0.a aVar) {
        C0980g0 c0980g0G = u1Var.G(null);
        InterfaceC0984i0 interfaceC0984i0G0 = T0.g0();
        int iK = C0980g0.b().k();
        if (c0980g0G != null) {
            iK = c0980g0G.k();
            aVar.a(c0980g0G.c());
            interfaceC0984i0G0 = c0980g0G.g();
        }
        aVar.q(interfaceC0984i0G0);
        a aVar2 = new a(u1Var);
        aVar.t(aVar2.h0(iK));
        aVar.c(C2921a1.e(aVar2.k0(Z.c())));
        aVar.e(aVar2.g0());
    }
}
