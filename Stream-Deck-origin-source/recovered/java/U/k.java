package U;

import A.AbstractC0890p0;
import A.C0864c0;
import A.C0903w0;
import A.T0;
import H.AbstractC0994n0;
import H.AbstractC0995o;
import H.InterfaceC1014y;
import H.InterfaceC1015y0;
import H.InterfaceC1017z0;
import H.J;
import H.N0;
import H.c1;
import H.g1;
import H.u1;
import H.v1;
import I.w;
import I.x;
import Q.N;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class k implements T0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f9979a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v1 f9983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final J f9984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final J f9985g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Set f9987i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f9988j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f9989k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f9990l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f9980b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f9981c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f9982d = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC0995o f9986h = u();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends AbstractC0995o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference f9991a;

        public a(k kVar) {
            this.f9991a = new WeakReference(kVar);
        }

        @Override // H.AbstractC0995o
        public void b(int i8, InterfaceC1014y interfaceC1014y) {
            k kVar = (k) this.f9991a.get();
            if (kVar != null) {
                Iterator it = kVar.f9979a.iterator();
                while (it.hasNext()) {
                    k.P(interfaceC1014y, ((T0) it.next()).z(), i8);
                }
            }
        }
    }

    public k(J j8, J j9, Set set, v1 v1Var, g.a aVar) {
        this.f9984f = j8;
        this.f9985g = j9;
        this.f9983e = v1Var;
        this.f9979a = set;
        Map mapR = R(j8, set, v1Var);
        this.f9988j = mapR;
        HashSet hashSet = new HashSet(mapR.values());
        this.f9987i = hashSet;
        this.f9989k = new c(j8, hashSet);
        if (j9 != null) {
            this.f9990l = new c(j9, hashSet);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            T0 t8 = (T0) it.next();
            this.f9982d.put(t8, Boolean.FALSE);
            this.f9981c.put(t8, new j(j8, this, aVar));
        }
    }

    public static int A(T0 t8) {
        if (t8 instanceof C0903w0) {
            return 1;
        }
        return t8 instanceof C0864c0 ? 4 : 2;
    }

    public static int E(Set set) {
        Iterator it = set.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((u1) it.next()).U(0));
        }
        return iMax;
    }

    public static Range O(Set set) {
        Range rangeIntersect = g1.f3033a;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Range rangeR = ((u1) it.next()).R(rangeIntersect);
            Objects.requireNonNull(rangeR);
            if (g1.f3033a.equals(rangeIntersect)) {
                rangeIntersect = rangeR;
            } else {
                try {
                    rangeIntersect = rangeIntersect.intersect(rangeR);
                } catch (IllegalArgumentException unused) {
                    AbstractC0890p0.a("VirtualCameraAdapter", "No intersected frame rate can be found from the target frame rate settings of the UseCases! Resolved: " + rangeIntersect + " <<>> " + rangeR);
                    return rangeIntersect.extend(rangeR);
                }
            }
        }
        return rangeIntersect;
    }

    public static void P(InterfaceC1014y interfaceC1014y, c1 c1Var, int i8) {
        Iterator it = c1Var.j().iterator();
        while (it.hasNext()) {
            ((AbstractC0995o) it.next()).b(i8, new l(c1Var.k().j(), interfaceC1014y));
        }
    }

    public static Map R(J j8, Set set, v1 v1Var) {
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            T0 t8 = (T0) it.next();
            map.put(t8, t8.H(j8.r(), null, t8.m(true, v1Var)));
        }
        return map;
    }

    public static void v(N n8, AbstractC0994n0 abstractC0994n0, c1 c1Var) {
        n8.u();
        try {
            n8.x(abstractC0994n0);
        } catch (AbstractC0994n0.a unused) {
            if (c1Var.d() != null) {
                c1Var.d().a(c1Var, c1.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    public static int w(T0 t8) {
        return t8 instanceof C0864c0 ? 256 : 34;
    }

    public static g1 y(T0 t8, g1 g1Var, Map map) {
        g1.a aVarI = g1Var.i();
        Size size = (Size) map.get(t8);
        if (size != null) {
            aVarI.e(size);
        }
        return aVarI.a();
    }

    public static AbstractC0994n0 z(T0 t8) {
        List listO = t8 instanceof C0864c0 ? t8.z().o() : t8.z().k().i();
        T1.f.i(listO.size() <= 1);
        if (listO.size() == 1) {
            return (AbstractC0994n0) listO.get(0);
        }
        return null;
    }

    public Set B() {
        return this.f9979a;
    }

    public Map C(N n8, int i8, boolean z8, boolean z9) {
        HashMap map = new HashMap();
        for (T0 t8 : this.f9979a) {
            N n9 = n8;
            S.f fVarT = t(t8, this.f9989k, this.f9984f, n9, i8, z8, z9);
            T(t8);
            map.put(t8, fVarT);
            n8 = n9;
        }
        return map;
    }

    public Map D(N n8, N n9, int i8, boolean z8) {
        HashMap map = new HashMap();
        for (T0 t8 : this.f9979a) {
            N n10 = n8;
            int i9 = i8;
            boolean z9 = z8;
            S.f fVarT = t(t8, this.f9989k, this.f9984f, n10, i9, z9, false);
            c cVar = this.f9990l;
            Objects.requireNonNull(cVar);
            J j8 = this.f9985g;
            Objects.requireNonNull(j8);
            N n11 = n9;
            S.f fVarT2 = t(t8, cVar, j8, n11, i9, z9, false);
            T(t8);
            map.put(t8, R.d.c(fVarT, fVarT2));
            n8 = n10;
            n9 = n11;
            i8 = i9;
            z8 = z9;
        }
        return map;
    }

    public AbstractC0995o F() {
        return this.f9986h;
    }

    public Map G(N n8, boolean z8) {
        HashMap map = new HashMap();
        for (T0 t8 : this.f9979a) {
            c cVar = this.f9989k;
            u1 u1Var = (u1) this.f9988j.get(t8);
            Objects.requireNonNull(u1Var);
            b bVarQ = cVar.q(u1Var, n8.n(), x.g(n8.q()), z8);
            map.put(t8, bVarQ.c());
            AbstractC0890p0.a("VirtualCameraAdapter", "Selected child size: " + bVarQ.c() + ", useCase: " + t8);
        }
        return map;
    }

    public final N H(T0 t8) {
        N n8 = (N) this.f9980b.get(t8);
        Objects.requireNonNull(n8);
        return n8;
    }

    public final boolean I(T0 t8) {
        Boolean bool = (Boolean) this.f9982d.get(t8);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public void J(N0 n8) {
        n8.L(InterfaceC1017z0.f3295v, this.f9989k.o(n8));
        n8.L(u1.f3216A, Integer.valueOf(E(this.f9987i)));
        A.J jD = U.a.d(this.f9987i);
        if (jD == null) {
            throw new IllegalArgumentException("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
        }
        n8.L(InterfaceC1015y0.f3285l, jD);
        n8.L(u1.f3218C, O(this.f9987i));
        Iterator it = this.f9979a.iterator();
        while (it.hasNext()) {
            u1 u1Var = (u1) this.f9988j.get((T0) it.next());
            Objects.requireNonNull(u1Var);
            u1 u1Var2 = u1Var;
            if (u1Var2.P() != 0) {
                n8.L(u1.f3224I, Integer.valueOf(u1Var2.P()));
            }
            if (u1Var2.W() != 0) {
                n8.L(u1.f3223H, Integer.valueOf(u1Var2.W()));
            }
        }
    }

    public void K() {
        Iterator it = this.f9979a.iterator();
        while (it.hasNext()) {
            ((T0) it.next()).N();
        }
    }

    public void L() {
        Iterator it = this.f9979a.iterator();
        while (it.hasNext()) {
            ((T0) it.next()).P();
        }
    }

    public void M() {
        Iterator it = this.f9979a.iterator();
        while (it.hasNext()) {
            ((T0) it.next()).Q();
        }
    }

    public void N() {
        w.b();
        Iterator it = this.f9979a.iterator();
        while (it.hasNext()) {
            f((T0) it.next());
        }
    }

    public void Q(Map map, Map map2) {
        this.f9980b.clear();
        this.f9980b.putAll(map);
        for (Map.Entry entry : this.f9980b.entrySet()) {
            T0 t8 = (T0) entry.getKey();
            N n8 = (N) entry.getValue();
            t8.Y(n8.n());
            t8.X(n8.q());
            t8.b0(y(t8, n8.r(), map2), null);
            t8.L();
        }
    }

    public void S() {
        for (T0 t8 : this.f9979a) {
            j jVar = (j) this.f9981c.get(t8);
            Objects.requireNonNull(jVar);
            t8.Z(jVar);
        }
    }

    public final void T(T0 t8) {
        int iX = x(t8, this.f9984f);
        j jVar = (j) this.f9981c.get(t8);
        Objects.requireNonNull(jVar);
        jVar.s(iX);
    }

    @Override // A.T0.c
    public void d(T0 t8) {
        w.b();
        if (I(t8)) {
            this.f9982d.put(t8, Boolean.FALSE);
            H(t8).m();
        }
    }

    @Override // A.T0.c
    public void f(T0 t8) {
        AbstractC0994n0 abstractC0994n0Z;
        w.b();
        N nH = H(t8);
        if (I(t8) && (abstractC0994n0Z = z(t8)) != null) {
            v(nH, abstractC0994n0Z, t8.z());
        }
    }

    @Override // A.T0.c
    public void i(T0 t8) {
        w.b();
        if (I(t8)) {
            N nH = H(t8);
            AbstractC0994n0 abstractC0994n0Z = z(t8);
            if (abstractC0994n0Z != null) {
                v(nH, abstractC0994n0Z, t8.z());
            } else {
                nH.m();
            }
        }
    }

    @Override // A.T0.c
    public void j(T0 t8) {
        w.b();
        if (I(t8)) {
            return;
        }
        this.f9982d.put(t8, Boolean.TRUE);
        AbstractC0994n0 abstractC0994n0Z = z(t8);
        if (abstractC0994n0Z != null) {
            v(H(t8), abstractC0994n0Z, t8.z());
        }
    }

    public void s() {
        for (T0 t8 : this.f9979a) {
            j jVar = (j) this.f9981c.get(t8);
            Objects.requireNonNull(jVar);
            t8.d(jVar, null, null, t8.m(true, this.f9983e));
        }
    }

    public final S.f t(T0 t8, c cVar, J j8, N n8, int i8, boolean z8, boolean z9) {
        int iL = j8.c().l(i8);
        boolean zL = x.l(n8.q());
        u1 u1Var = (u1) this.f9988j.get(t8);
        Objects.requireNonNull(u1Var);
        b bVarQ = cVar.q(u1Var, n8.n(), x.g(n8.q()), z8);
        Rect rectB = bVarQ.b();
        Size sizeA = bVarQ.a();
        int iU = x.u((n8.p() + x(t8, j8)) - iL);
        return S.f.h(A(t8), w(t8), rectB, x.o(sizeA, iU), iU, z9 ? false : t8.G(j8) ^ zL);
    }

    public AbstractC0995o u() {
        return new a(this);
    }

    public final int x(T0 t8, J j8) {
        return j8.c().l(((InterfaceC1017z0) t8.l()).d0(0));
    }
}
