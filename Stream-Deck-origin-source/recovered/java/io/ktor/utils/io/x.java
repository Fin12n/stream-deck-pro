package io.ktor.utils.io;

import C6.G;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class x {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25574c;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25573b = obj;
            this.f25574c |= Integer.MIN_VALUE;
            return x.f(null, 0, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25577c;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25576b = obj;
            this.f25577c |= Integer.MIN_VALUE;
            return x.g(null, 0, this);
        }
    }

    public static final Object c(g gVar, p205x6.a aVar, int i8, G6.d dVar) {
        if (i8 < 0) {
            throw new IllegalStateException(("bytesRead shouldn't be negative: " + i8).toString());
        }
        A aD = d(gVar);
        if (aD != null) {
            aD.h(i8);
            if (gVar instanceof t) {
                ((t) gVar).F();
            }
            return G.f1419a;
        }
        if (aVar instanceof p213y6.a) {
            y6.a.d dVar2 = p213y6.a.f38436j;
            if (aVar != dVar2.a()) {
                ((p213y6.a) aVar).F(dVar2.c());
                Object objB = gVar.B(i8, dVar);
                return objB == H6.c.f() ? objB : G.f1419a;
            }
        }
        return G.f1419a;
    }

    public static final A d(g gVar) {
        if (gVar instanceof t) {
            return ((t) gVar).u();
        }
        return null;
    }

    public static final Object e(g gVar, int i8, G6.d dVar) {
        A aU;
        if (gVar instanceof A) {
            aU = (A) gVar;
        } else {
            aU = gVar instanceof t ? ((t) gVar).u() : null;
        }
        if (aU == null) {
            return f(gVar, i8, dVar);
        }
        p213y6.a aVarW = aU.w(W6.n.g(i8, 8));
        return aVarW != null ? aVarW : g(aU, i8, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object f(g gVar, int i8, G6.d dVar) {
        a aVar;
        p213y6.a aVar2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i9 = aVar.f25574c;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                aVar.f25574c = i9 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        a aVar3 = aVar;
        Object obj = aVar3.f25573b;
        Object objF = H6.c.f();
        int i10 = aVar3.f25574c;
        if (i10 == 0) {
            C6.r.b(obj);
            p213y6.a aVar4 = (p213y6.a) p213y6.a.f38436j.c().b0();
            long jG = aVar4.g() - aVar4.k();
            aVar3.f25572a = aVar4;
            aVar3.f25574c = 1;
            Object objS = gVar.s(aVar4.h(), aVar4.k(), 0L, i8, jG, aVar3);
            if (objS == objF) {
                return objF;
            }
            obj = objS;
            aVar2 = aVar4;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (p213y6.a) aVar3.f25572a;
            C6.r.b(obj);
        }
        aVar2.a((int) ((Number) obj).longValue());
        return aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g(A a8, int i8, G6.d dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i9 = bVar.f25577c;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                bVar.f25577c = i9 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f25576b;
        Object objF = H6.c.f();
        int i10 = bVar.f25577c;
        if (i10 == 0) {
            C6.r.b(obj);
            bVar.f25575a = a8;
            bVar.f25577c = 1;
            if (a8.n(i8, bVar) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a8 = (A) bVar.f25575a;
            C6.r.b(obj);
        }
        return a8.w(1);
    }
}
