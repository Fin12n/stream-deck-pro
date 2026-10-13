package p065h1;

import C6.m;
import Q0.a;
import Q0.h;
import Q0.j;
import R0.D0;
import R0.H0;
import R0.L0;
import R0.T;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class G0 {
    public static final boolean a(j jVar) {
        return a.d(jVar.h()) + a.d(jVar.i()) <= jVar.j() && a.d(jVar.b()) + a.d(jVar.c()) <= jVar.j() && a.e(jVar.h()) + a.e(jVar.b()) <= jVar.d() && a.e(jVar.i()) + a.e(jVar.c()) <= jVar.d();
    }

    public static final boolean b(D0 d8, float f8, float f9, H0 h8, H0 h9) {
        if (d8 instanceof D0.b) {
            return d(((D0.b) d8).a(), f8, f9);
        }
        if (d8 instanceof D0.c) {
            return e((D0.c) d8, f8, f9, h8, h9);
        }
        if (d8 instanceof D0.a) {
            return c(((D0.a) d8).a(), f8, f9, h8, h9);
        }
        throw new m();
    }

    public static final boolean c(H0 h8, float f8, float f9, H0 h9, H0 h10) {
        h hVar = new h(f8 - 0.005f, f9 - 0.005f, f8 + 0.005f, f9 + 0.005f);
        if (h9 == null) {
            h9 = T.a();
        }
        h9.q(hVar);
        if (h10 == null) {
            h10 = T.a();
        }
        h10.h(h8, h9, L0.f9316a.b());
        boolean zIsEmpty = h10.isEmpty();
        h10.reset();
        h9.reset();
        return !zIsEmpty;
    }

    public static final boolean d(h hVar, float f8, float f9) {
        return hVar.i() <= f8 && f8 < hVar.j() && hVar.l() <= f9 && f9 < hVar.e();
    }

    public static final boolean e(D0.c cVar, float f8, float f9, H0 h8, H0 h9) {
        j jVarA = cVar.a();
        if (f8 < jVarA.e() || f8 >= jVarA.f() || f9 < jVarA.g() || f9 >= jVarA.a()) {
            return false;
        }
        if (!a(jVarA)) {
            H0 h0A = h9 == null ? T.a() : h9;
            h0A.i(jVarA);
            return c(h0A, f8, f9, h8, h9);
        }
        float fD = a.d(jVarA.h()) + jVarA.e();
        float fE = a.e(jVarA.h()) + jVarA.g();
        float f10 = jVarA.f() - a.d(jVarA.i());
        float fG = jVarA.g() + a.e(jVarA.i());
        float f11 = jVarA.f() - a.d(jVarA.c());
        float fA = jVarA.a() - a.e(jVarA.c());
        float fA2 = jVarA.a() - a.e(jVarA.b());
        float fE2 = jVarA.e() + a.d(jVarA.b());
        if (f8 < fD && f9 < fE) {
            return f(f8, f9, jVarA.h(), fD, fE);
        }
        if (f8 < fE2 && f9 > fA2) {
            return f(f8, f9, jVarA.b(), fE2, fA2);
        }
        if (f8 > f10 && f9 < fG) {
            return f(f8, f9, jVarA.i(), f10, fG);
        }
        if (f8 <= f11 || f9 <= fA) {
            return true;
        }
        return f(f8, f9, jVarA.c(), f11, fA);
    }

    public static final boolean f(float f8, float f9, long j8, float f10, float f11) {
        float f12 = f8 - f10;
        float f13 = f9 - f11;
        float fD = a.d(j8);
        float fE = a.e(j8);
        return ((f12 * f12) / (fD * fD)) + ((f13 * f13) / (fE * fE)) <= 1.0f;
    }
}
