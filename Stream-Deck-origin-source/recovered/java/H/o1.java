package H;

import A.InterfaceC0905y;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o1 f3167a = new o1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static InterfaceC0905y f3168b;

    public static final InterfaceC0905y a() {
        InterfaceC0905y interfaceC0905y = f3168b;
        if (interfaceC0905y != null) {
            return interfaceC0905y;
        }
        kotlin.jvm.internal.t.t("cameraUseCaseAdapterProvider");
        return null;
    }

    public static final void b(InterfaceC0905y interfaceC0905y) {
        kotlin.jvm.internal.t.g(interfaceC0905y, "<set-?>");
        f3168b = interfaceC0905y;
    }

    public static final L.b c(I cameraInfoInternal, A.D0 sessionConfig, boolean z8, D.b bVar) {
        kotlin.jvm.internal.t.g(cameraInfoInternal, "cameraInfoInternal");
        kotlin.jvm.internal.t.g(sessionConfig, "sessionConfig");
        if (f3168b == null) {
            throw new IllegalStateException("mCameraUseCaseAdapterProvider must be initialized first!");
        }
        InterfaceC0905y interfaceC0905yA = a();
        String strE = cameraInfoInternal.e();
        kotlin.jvm.internal.t.f(strE, "getCameraId(...)");
        L.f fVarB = interfaceC0905yA.b(strE);
        fVarB.l0(sessionConfig.l());
        fVarB.h0(sessionConfig.c());
        fVarB.k0(sessionConfig.i());
        fVarB.j0(sessionConfig.f());
        List listK = sessionConfig.k();
        if (bVar == null) {
            bVar = D.b.a.c(D.b.f1669b, sessionConfig, cameraInfoInternal, null, 2, null);
        }
        L.b bVarN0 = fVarB.n0(listK, bVar, z8);
        kotlin.jvm.internal.t.f(bVarN0, "simulateAddUseCases(...)");
        return bVarN0;
    }
}
