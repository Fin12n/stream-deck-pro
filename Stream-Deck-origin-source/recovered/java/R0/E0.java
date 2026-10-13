package R0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class E0 {
    public static final void b(T0.f fVar, D0 d8, AbstractC1582d0 abstractC1582d0, float f8, T0.g gVar, C1600m0 c1600m0, int i8) {
        if (d8 instanceof D0.b) {
            Q0.h hVarA = ((D0.b) d8).a();
            fVar.y1(abstractC1582d0, i(hVarA), g(hVarA), f8, gVar, c1600m0, i8);
            return;
        }
        if (!(d8 instanceof D0.c)) {
            if (!(d8 instanceof D0.a)) {
                throw new C6.m();
            }
            fVar.A0(((D0.a) d8).a(), abstractC1582d0, f8, gVar, c1600m0, i8);
            return;
        }
        D0.c cVar = (D0.c) d8;
        H0 h0B = cVar.b();
        if (h0B != null) {
            fVar.A0(h0B, abstractC1582d0, f8, gVar, c1600m0, i8);
            return;
        }
        Q0.j jVarA = cVar.a();
        fVar.z(abstractC1582d0, j(jVarA), h(jVarA), Q0.b.b(Q0.a.d(jVarA.b()), 0.0f, 2, null), f8, gVar, c1600m0, i8);
    }

    public static /* synthetic */ void c(T0.f fVar, D0 d8, AbstractC1582d0 abstractC1582d0, float f8, T0.g gVar, C1600m0 c1600m0, int i8, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            f8 = 1.0f;
        }
        float f9 = f8;
        if ((i9 & 8) != 0) {
            gVar = T0.j.f9812a;
        }
        T0.g gVar2 = gVar;
        if ((i9 & 16) != 0) {
            c1600m0 = null;
        }
        C1600m0 c1600m1 = c1600m0;
        if ((i9 & 32) != 0) {
            i8 = T0.f.f9808L.a();
        }
        b(fVar, d8, abstractC1582d0, f9, gVar2, c1600m1, i8);
    }

    public static final void d(T0.f fVar, D0 d8, long j8, float f8, T0.g gVar, C1600m0 c1600m0, int i8) {
        if (d8 instanceof D0.b) {
            Q0.h hVarA = ((D0.b) d8).a();
            fVar.U(j8, i(hVarA), g(hVarA), f8, gVar, c1600m0, i8);
            return;
        }
        if (!(d8 instanceof D0.c)) {
            if (!(d8 instanceof D0.a)) {
                throw new C6.m();
            }
            fVar.z1(((D0.a) d8).a(), j8, f8, gVar, c1600m0, i8);
            return;
        }
        D0.c cVar = (D0.c) d8;
        H0 h0B = cVar.b();
        if (h0B != null) {
            fVar.z1(h0B, j8, f8, gVar, c1600m0, i8);
            return;
        }
        Q0.j jVarA = cVar.a();
        fVar.u1(j8, j(jVarA), h(jVarA), Q0.b.b(Q0.a.d(jVarA.b()), 0.0f, 2, null), gVar, f8, c1600m0, i8);
    }

    public static /* synthetic */ void e(T0.f fVar, D0 d8, long j8, float f8, T0.g gVar, C1600m0 c1600m0, int i8, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            f8 = 1.0f;
        }
        float f9 = f8;
        if ((i9 & 8) != 0) {
            gVar = T0.j.f9812a;
        }
        T0.g gVar2 = gVar;
        if ((i9 & 16) != 0) {
            c1600m0 = null;
        }
        d(fVar, d8, j8, f9, gVar2, c1600m0, (i9 & 32) != 0 ? T0.f.f9808L.a() : i8);
    }

    public static final boolean f(Q0.j jVar) {
        return ((Q0.a.d(jVar.b()) > Q0.a.d(jVar.c()) ? 1 : (Q0.a.d(jVar.b()) == Q0.a.d(jVar.c()) ? 0 : -1)) == 0 && (Q0.a.d(jVar.c()) > Q0.a.d(jVar.i()) ? 1 : (Q0.a.d(jVar.c()) == Q0.a.d(jVar.i()) ? 0 : -1)) == 0 && (Q0.a.d(jVar.i()) > Q0.a.d(jVar.h()) ? 1 : (Q0.a.d(jVar.i()) == Q0.a.d(jVar.h()) ? 0 : -1)) == 0) && ((Q0.a.e(jVar.b()) > Q0.a.e(jVar.c()) ? 1 : (Q0.a.e(jVar.b()) == Q0.a.e(jVar.c()) ? 0 : -1)) == 0 && (Q0.a.e(jVar.c()) > Q0.a.e(jVar.i()) ? 1 : (Q0.a.e(jVar.c()) == Q0.a.e(jVar.i()) ? 0 : -1)) == 0 && (Q0.a.e(jVar.i()) > Q0.a.e(jVar.h()) ? 1 : (Q0.a.e(jVar.i()) == Q0.a.e(jVar.h()) ? 0 : -1)) == 0);
    }

    public static final long g(Q0.h hVar) {
        return Q0.m.a(hVar.n(), hVar.h());
    }

    public static final long h(Q0.j jVar) {
        return Q0.m.a(jVar.j(), jVar.d());
    }

    public static final long i(Q0.h hVar) {
        return Q0.g.a(hVar.i(), hVar.l());
    }

    public static final long j(Q0.j jVar) {
        return Q0.g.a(jVar.e(), jVar.g());
    }
}
