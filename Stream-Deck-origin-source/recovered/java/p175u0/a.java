package p175u0;

import A1.h;
import R0.C1598l0;
import R0.U0;
import R0.V0;
import R0.W0;
import V0.d;
import V0.f;
import V0.o;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static d f34337a;

    public static final d a(p167t0.a.C0757a c0757a) {
        d dVar = f34337a;
        if (dVar != null) {
            t.d(dVar);
            return dVar;
        }
        d.a aVar = new d.a("Filled.DoNotDisturbOn", h.m(24.0f), h.m(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int iB = o.b();
        U0 u8 = new U0(C1598l0.f9405b.a(), null);
        int iA = V0.f9341a.a();
        int iA2 = W0.f9346a.a();
        f fVar = new f();
        fVar.h(12.0f, 2.0f);
        fVar.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        fVar.j(4.48f, 10.0f, 10.0f, 10.0f);
        fVar.j(10.0f, -4.48f, 10.0f, -10.0f);
        fVar.i(17.52f, 2.0f, 12.0f, 2.0f);
        fVar.a();
        fVar.h(17.0f, 13.0f);
        fVar.f(7.0f, 13.0f);
        fVar.k(-2.0f);
        fVar.e(10.0f);
        fVar.k(2.0f);
        fVar.a();
        d dVarF = aVar.c(fVar.d(), (14336 & 2) != 0 ? o.b() : iB, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : u8, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? o.c() : iA, (14336 & 512) != 0 ? o.d() : iA2, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).f();
        f34337a = dVarF;
        t.d(dVarF);
        return dVarF;
    }
}
