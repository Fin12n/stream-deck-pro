package p128o1;

import A1.v;
import A1.w;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p216z1.e;
import p216z1.f;
import p216z1.h;
import p216z1.j;
import p216z1.l;
import p216z1.q;
import p216z1.r;
import p216z1.s;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f30848a = v.f462b.a();

    public static final t a(t tVar, int i8, int i9, long j8, q qVar, x xVar, h hVar, int i10, int i11, s sVar) {
        long j9;
        int iH = i8;
        q qVarJ = qVar;
        j.a aVar = j.f39010b;
        if (j.k(iH, aVar.g()) || j.k(iH, tVar.h())) {
            if (w.g(j8)) {
                j9 = j8;
            } else {
                j9 = j8;
                if (v.e(j9, tVar.e())) {
                }
            }
            if ((qVarJ == null || t.c(qVarJ, tVar.j())) && ((l.j(i9, l.f39024b.f()) || l.j(i9, tVar.i())) && ((xVar == null || t.c(xVar, tVar.g())) && ((hVar == null || t.c(hVar, tVar.f())) && ((f.f(i10, f.f38972b.b()) || f.f(i10, tVar.d())) && ((e.g(i11, e.f38967b.c()) || e.g(i11, tVar.c())) && (sVar == null || t.c(sVar, tVar.k())))))))) {
                return tVar;
            }
        } else {
            j9 = j8;
        }
        long jE = w.g(j9) ? tVar.e() : j9;
        if (qVarJ == null) {
            qVarJ = tVar.j();
        }
        q qVar2 = qVarJ;
        if (j.k(iH, aVar.g())) {
            iH = tVar.h();
        }
        return new t(iH, !l.j(i9, l.f39024b.f()) ? i9 : tVar.i(), jE, qVar2, d(tVar, xVar), hVar == null ? tVar.f() : hVar, !f.f(i10, f.f38972b.b()) ? i10 : tVar.d(), !e.g(i11, e.f38967b.c()) ? i11 : tVar.c(), sVar == null ? tVar.k() : sVar, (AbstractC2633k) null);
    }

    public static final t b(t tVar, t tVar2, float f8) {
        int iN = ((j) C.d(j.h(tVar.h()), j.h(tVar2.h()), f8)).n();
        int iM = ((l) C.d(l.g(tVar.i()), l.g(tVar2.i()), f8)).m();
        long jF = C.f(tVar.e(), tVar2.e(), f8);
        q qVarJ = tVar.j();
        if (qVarJ == null) {
            qVarJ = q.f39041c.a();
        }
        q qVarJ2 = tVar2.j();
        if (qVarJ2 == null) {
            qVarJ2 = q.f39041c.a();
        }
        return new t(iN, iM, jF, r.a(qVarJ, qVarJ2, f8), c(tVar.g(), tVar2.g(), f8), (h) C.d(tVar.f(), tVar2.f(), f8), ((f) C.d(f.c(tVar.d()), f.c(tVar2.d()), f8)).l(), ((e) C.d(e.d(tVar.c()), e.d(tVar2.c()), f8)).j(), (s) C.d(tVar.k(), tVar2.k(), f8), (AbstractC2633k) null);
    }

    public static final x c(x xVar, x xVar2, float f8) {
        if (xVar == null && xVar2 == null) {
            return null;
        }
        if (xVar == null) {
            xVar = x.f30860c.a();
        }
        if (xVar2 == null) {
            xVar2 = x.f30860c.a();
        }
        return AbstractC2738c.b(xVar, xVar2, f8);
    }

    public static final x d(t tVar, x xVar) {
        if (tVar.g() == null) {
            return xVar;
        }
        return xVar == null ? tVar.g() : tVar.g().d(xVar);
    }

    public static final t e(t tVar, A1.t tVar2) {
        int iH = tVar.h();
        j.a aVar = j.f39010b;
        int iF = j.k(iH, aVar.g()) ? aVar.f() : tVar.h();
        int iE = J.e(tVar2, tVar.i());
        long jE = w.g(tVar.e()) ? f30848a : tVar.e();
        q qVarJ = tVar.j();
        if (qVarJ == null) {
            qVarJ = q.f39041c.a();
        }
        q qVar = qVarJ;
        x xVarG = tVar.g();
        h hVarF = tVar.f();
        int iD = tVar.d();
        f.a aVar2 = f.f38972b;
        int iA = f.f(iD, aVar2.b()) ? aVar2.a() : tVar.d();
        int iC = tVar.c();
        e.a aVar3 = e.f38967b;
        int iB = e.g(iC, aVar3.c()) ? aVar3.b() : tVar.c();
        s sVarK = tVar.k();
        if (sVarK == null) {
            sVarK = s.f39045c.a();
        }
        return new t(iF, iE, jE, qVar, xVarG, hVarF, iA, iB, sVarK, (AbstractC2633k) null);
    }
}
