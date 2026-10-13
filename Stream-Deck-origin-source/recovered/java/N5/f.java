package N5;

import C6.G;
import C6.r;
import D6.U;
import D6.z;
import Q6.k;
import T0.Vl.PCRzgdeK;
import X5.AbstractC1687p;
import X5.AbstractC1691u;
import X5.C1685n;
import X5.C1688q;
import X5.InterfaceC1684m;
import X5.InterfaceC1690t;
import X5.Q;
import X5.T;
import X5.x;
import X5.y;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f7499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7500b;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f7499a = obj;
            this.f7500b |= Integer.MIN_VALUE;
            return f.b(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return F6.a.a(((N5.c) obj2).c().f(), ((N5.c) obj).c().f());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class c extends C2639q implements k {
        public c(Object obj) {
            super(1, obj, C1685n.class, com.amazon.a.a.o.b.au, "get(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final String invoke(String p8) {
            t.g(p8, "p0");
            return ((C1685n) this.receiver).i(p8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class d extends C2639q implements k {
        public d(Object obj) {
            super(1, obj, C1685n.class, "getAll", "getAll(Ljava/lang/String;)Ljava/util/List;", 0);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final List invoke(String p8) {
            t.g(p8, "p0");
            return ((C1685n) this.receiver).c(p8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class e extends C2639q implements k {
        public e(Object obj) {
            super(1, obj, InterfaceC1684m.class, com.amazon.a.a.o.b.au, "get(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            t.g(str, PCRzgdeK.RWF);
            return ((InterfaceC1684m) this.receiver).d(str);
        }
    }

    /* JADX INFO: renamed from: N5.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C0240f extends C2639q implements k {
        public C0240f(Object obj) {
            super(1, obj, InterfaceC1684m.class, "getAll", "getAll(Ljava/lang/String;)Ljava/util/List;", 0);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final List invoke(String p8) {
            t.g(p8, "p0");
            return ((InterfaceC1684m) this.receiver).c(p8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f7501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f7502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7503c;

        public g(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f7502b = obj;
            this.f7503c |= Integer.MIN_VALUE;
            return f.f(null, null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(N5.b bVar, U5.c cVar, G6.d dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f7500b;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f7500b = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objC = aVar.f7499a;
        Object objF = H6.c.f();
        int i9 = aVar.f7500b;
        if (i9 == 0) {
            r.b(objC);
            T5.c cVarF = cVar.g1().f();
            List listA = AbstractC1691u.a(cVar);
            List listA2 = AbstractC1691u.a(cVarF);
            N5.a aVar2 = N5.a.f7436a;
            O5.h hVarL = listA.contains(aVar2.e()) ? bVar.l() : bVar.m();
            if (listA.contains(aVar2.c()) || listA2.contains(aVar2.c())) {
                return cVar;
            }
            T tO = cVarF.o();
            boolean zN = bVar.n();
            aVar.f7500b = 1;
            objC = O5.i.c(hVarL, tO, cVar, zN, aVar);
            if (objC == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(objC);
        }
        return ((N5.c) objC).f();
    }

    public static final U5.c c(N5.b bVar, T5.c cVar, U5.c cVar2) {
        T tO = cVar2.g1().f().o();
        O5.h hVarL = AbstractC1691u.a(cVar2).contains(N5.a.f7436a.e()) ? bVar.l() : bVar.m();
        Map mapE = N5.d.e(cVar2);
        N5.c cVarD = d(bVar, hVarL, mapE, tO, cVar);
        if (cVarD == null) {
            return null;
        }
        if (mapE.isEmpty()) {
            mapE = cVarD.e();
        }
        hVarL.d(tO, new N5.c(N5.d.c(cVar2, bVar.n(), null, 2, null), mapE, cVarD.c(), cVarD.a()));
        return cVarD.f();
    }

    public static final N5.c d(N5.b bVar, O5.h hVar, Map map, T t8, T5.c cVar) {
        Object next;
        Map.Entry entry;
        String str;
        if (!map.isEmpty()) {
            return hVar.b(t8, map);
        }
        k kVarD = N5.e.d(cVar.T0(), new e(cVar.a()), new C0240f(cVar.a()));
        Iterator it = z.J0(hVar.c(t8), new b()).iterator();
        while (it.hasNext()) {
            next = it.next();
            Map mapE = ((N5.c) next).e();
            if (!mapE.isEmpty()) {
                Iterator it2 = mapE.entrySet().iterator();
                do {
                    if (it2.hasNext()) {
                        entry = (Map.Entry) it2.next();
                        str = (String) entry.getKey();
                    }
                } while (t.c(kVarD.invoke(str), (String) entry.getValue()));
            }
            return (N5.c) next;
        }
        next = null;
        return (N5.c) next;
    }

    public static final N5.c e(N5.b bVar, T5.d dVar, p007a6.c cVar) {
        T tC = Q.c(dVar.i());
        k kVarD = N5.e.d(cVar, new c(dVar.a()), new d(dVar.a()));
        for (N5.c cVar2 : U.i(bVar.l().c(tC), bVar.m().c(tC))) {
            Map mapE = cVar2.e();
            if (!mapE.isEmpty()) {
                if (mapE.isEmpty()) {
                    return cVar2;
                }
                for (Map.Entry entry : mapE.entrySet()) {
                    String str = (String) entry.getKey();
                    if (!t.c(kVarD.invoke(str), (String) entry.getValue())) {
                    }
                }
            }
            return cVar2;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r6.h((U5.c) r10, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        if (r6.h(r8, r0) == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(p173t6.e eVar, U5.c cVar, N5.b bVar, G5.a aVar, G6.d dVar) {
        g gVar;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i8 = gVar.f7503c;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                gVar.f7503c = i8 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object objB = gVar.f7502b;
        Object objF = H6.c.f();
        int i9 = gVar.f7503c;
        if (i9 != 0) {
            if (i9 == 1) {
                eVar = (p173t6.e) gVar.f7501a;
                r.b(objB);
                gVar.f7501a = null;
                gVar.f7503c = 2;
            } else {
                if (i9 != 2) {
                    if (i9 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(objB);
                    return G.f1419a;
                }
                r.b(objB);
            }
            return G.f1419a;
        }
        r.b(objB);
        if (y.b(cVar.g())) {
            gVar.f7501a = eVar;
            gVar.f7503c = 1;
            objB = b(bVar, cVar, gVar);
            if (objB != objF) {
                gVar.f7501a = null;
                gVar.f7503c = 2;
            }
        } else {
            if (!t.c(cVar.g(), x.f11997c.z())) {
                return G.f1419a;
            }
            U5.e.c(cVar);
            U5.c cVarC = c(bVar, cVar.g1().f(), cVar);
            if (cVarC == null) {
                throw new N5.g(cVar.g1().f().o());
            }
            aVar.y().a(N5.b.f7442g.d(), cVarC);
            gVar.f7503c = 3;
        }
        return objF;
    }

    public static final Object g(p173t6.e eVar, N5.b bVar, p007a6.c cVar, G5.a aVar, G6.d dVar) {
        Object objH;
        N5.c cVarE = e(bVar, (T5.d) eVar.d(), cVar);
        if (cVarE == null) {
            return (AbstractC1687p.c(((T5.d) eVar.d()).a().i(C1688q.f11910a.f())).contains(N5.a.f7436a.d()) && (objH = N5.b.f7442g.h(eVar, aVar, dVar)) == H6.c.f()) ? objH : G.f1419a;
        }
        H5.b bVarG1 = cVarE.f().g1();
        i iVarD = N5.d.d(cVarE.b(), cVarE.c().a(), (T5.d) eVar.d());
        if (iVarD == i.ShouldNotValidate) {
            Object objG = N5.b.f7442g.g(eVar, aVar, bVarG1, dVar);
            return objG == H6.c.f() ? objG : G.f1419a;
        }
        if (iVarD == i.ShouldWarn) {
            Object objH2 = h(eVar, bVarG1, aVar, dVar);
            return objH2 == H6.c.f() ? objH2 : G.f1419a;
        }
        InterfaceC1684m interfaceC1684mD = cVarE.d();
        C1688q c1688q = C1688q.f11910a;
        String strD = interfaceC1684mD.d(c1688q.m());
        if (strD != null) {
            T5.k.b((InterfaceC1690t) eVar.d(), c1688q.r(), strD);
        }
        String strD2 = cVarE.d().d(c1688q.t());
        if (strD2 != null) {
            T5.k.b((InterfaceC1690t) eVar.d(), c1688q.q(), strD2);
        }
        return G.f1419a;
    }

    public static final Object h(p173t6.e eVar, H5.b bVar, G5.a aVar, G6.d dVar) {
        T5.e eVarB = ((T5.d) eVar.d()).b();
        x xVarG = bVar.g().g();
        p141p6.c cVarD = bVar.g().d();
        InterfaceC1684m.a aVar2 = InterfaceC1684m.f11856a;
        C1685n c1685n = new C1685n(0, 1, null);
        c1685n.d(bVar.g().a());
        c1685n.f(C1688q.f11910a.F(), "110");
        G g8 = G.f1419a;
        H5.b bVar2 = new H5.b(aVar, eVarB, new T5.h(xVarG, cVarD, c1685n.o(), bVar.g().h(), bVar.g().b(), bVar.g().getCoroutineContext()));
        eVar.b();
        aVar.y().a(N5.b.f7442g.d(), bVar2.g());
        Object objH = eVar.h(bVar2, dVar);
        return objH == H6.c.f() ? objH : G.f1419a;
    }
}
