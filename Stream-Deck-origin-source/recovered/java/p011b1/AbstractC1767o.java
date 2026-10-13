package p011b1;

import A1.r;
import Q0.f;
import Q0.l;

/* JADX INFO: renamed from: b1.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1767o {
    public static final boolean a(z zVar) {
        return (zVar.q() || zVar.m() || !zVar.j()) ? false : true;
    }

    public static final boolean b(z zVar) {
        return !zVar.m() && zVar.j();
    }

    public static final boolean c(z zVar) {
        return (zVar.q() || !zVar.m() || zVar.j()) ? false : true;
    }

    public static final boolean d(z zVar) {
        return zVar.m() && !zVar.j();
    }

    public static final boolean e(z zVar, long j8) {
        long jI = zVar.i();
        float fO = f.o(jI);
        float fP = f.p(jI);
        return fO < 0.0f || fO > ((float) r.g(j8)) || fP < 0.0f || fP > ((float) r.f(j8));
    }

    public static final boolean f(z zVar, long j8, long j9) {
        if (!N.g(zVar.o(), N.f15698a.d())) {
            return e(zVar, j8);
        }
        long jI = zVar.i();
        float fO = f.o(jI);
        float fP = f.p(jI);
        return fO < (-l.i(j9)) || fO > ((float) r.g(j8)) + l.i(j9) || fP < (-l.g(j9)) || fP > ((float) r.f(j8)) + l.g(j9);
    }

    public static final long g(z zVar) {
        return i(zVar, false);
    }

    public static final long h(z zVar) {
        return i(zVar, true);
    }

    public static final long i(z zVar, boolean z8) {
        return (z8 || !zVar.q()) ? f.s(zVar.i(), zVar.l()) : f.f9082b.c();
    }

    public static final boolean j(z zVar) {
        return !f.l(i(zVar, true), f.f9082b.c());
    }
}
