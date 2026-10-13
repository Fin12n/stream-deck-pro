package L;

import A.AbstractC0890p0;
import A.C0864c0;
import A.C0894s;
import A.C0903w0;
import A.I;
import A.InterfaceC0881l;
import A.InterfaceC0896t;
import A.S0;
import A.T0;
import A.V0;
import H.B;
import H.C0973d;
import H.C0975e;
import H.C1013x0;
import H.E;
import H.F;
import H.InterfaceC0984i0;
import H.J;
import H.O0;
import H.c1;
import H.g1;
import H.u1;
import H.v1;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f implements InterfaceC0881l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0975e f4747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0975e f4748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v1 f4749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0894s f4750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f4751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f4752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final B.a f4753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public V0 f4754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f4755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Range f4757k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final B f4758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f4759m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4760n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC0984i0 f4761o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public T0 f4762p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public U.g f4763q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final I f4764r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final I f4765s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final O.e f4766t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final m f4767u;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends Exception {
        public a() {
        }

        public a(String str) {
            super(str);
        }

        public a(Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public u1 f4768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public u1 f4769b;

        public b(u1 u1Var, u1 u1Var2) {
            this.f4768a = u1Var;
            this.f4769b = u1Var2;
        }
    }

    public f(J j8, B.a aVar, m mVar, v1 v1Var) {
        C0973d c0973d = new C0973d(j8.r(), E.a());
        I i8 = I.f78d;
        this(j8, null, c0973d, null, i8, i8, aVar, mVar, v1Var);
    }

    public static Matrix A(Rect rect, Size size) {
        T1.f.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static void C(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((T0) it.next()).W(null);
        }
    }

    public static u1 H(v1 v1Var, U.g gVar) {
        u1 u1VarM = new C0903w0.a().c().m(false, v1Var);
        if (u1VarM == null) {
            return null;
        }
        O0 o0J0 = O0.j0(u1VarM);
        o0J0.k0(q.f4795N);
        return gVar.D(o0J0).b();
    }

    private int J() {
        synchronized (this.f4759m) {
            try {
                return this.f4753g.c() == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Map K(Collection collection, v1 v1Var, v1 v1Var2, int i8, Range range) {
        HashMap map = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            T0 t8 = (T0) it.next();
            map.put(t8, new b(U.g.t0(t8) ? H(v1Var, (U.g) t8) : t8.m(false, v1Var), u(t8, t8.m(true, v1Var2), i8, range)));
        }
        return map;
    }

    public static boolean P(g1 g1Var, c1 c1Var) {
        InterfaceC0984i0 interfaceC0984i0D = g1Var.d();
        InterfaceC0984i0 interfaceC0984i0G = c1Var.g();
        Objects.requireNonNull(interfaceC0984i0D);
        if (interfaceC0984i0D.c().size() != c1Var.g().c().size()) {
            return true;
        }
        for (InterfaceC0984i0.a aVar : interfaceC0984i0D.c()) {
            if (!interfaceC0984i0G.e(aVar) || !Objects.equals(interfaceC0984i0G.h(aVar), interfaceC0984i0D.h(aVar))) {
                return true;
            }
        }
        return false;
    }

    public static boolean Q(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (Z(((T0) it.next()).l().n())) {
                return true;
            }
        }
        return false;
    }

    public static boolean R(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            T0 t8 = (T0) it.next();
            if (Y(t8)) {
                u1 u1VarL = t8.l();
                InterfaceC0984i0.a aVar = C1013x0.f3273U;
                if (u1VarL.e(aVar) && ((Integer) T1.f.g((Integer) u1VarL.h(aVar))).intValue() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean S(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            T0 t8 = (T0) it.next();
            if (Y(t8)) {
                u1 u1VarL = t8.l();
                InterfaceC0984i0.a aVar = C1013x0.f3273U;
                if (u1VarL.e(aVar) && ((Integer) T1.f.g((Integer) u1VarL.h(aVar))).intValue() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean T(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (d0((T0) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean V(Collection collection) {
        Iterator it = collection.iterator();
        boolean z8 = false;
        boolean z9 = false;
        while (it.hasNext()) {
            T0 t8 = (T0) it.next();
            if (a0(t8) || U.g.t0(t8)) {
                z8 = true;
            } else if (Y(t8)) {
                z9 = true;
            }
        }
        return z8 && !z9;
    }

    public static boolean W(Collection collection) {
        Iterator it = collection.iterator();
        boolean z8 = false;
        boolean z9 = false;
        while (it.hasNext()) {
            T0 t8 = (T0) it.next();
            if (a0(t8) || U.g.t0(t8)) {
                z9 = true;
            } else if (Y(t8)) {
                z8 = true;
            }
        }
        return z8 && !z9;
    }

    public static boolean X(List... listArr) {
        boolean z8 = false;
        for (List list : listArr) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((T0) it.next()).o() != null) {
                    z8 = true;
                    break;
                }
            }
            if (z8) {
                return z8;
            }
        }
        return z8;
    }

    public static boolean Y(T0 t8) {
        return t8 instanceof C0864c0;
    }

    public static boolean Z(A.J j8) {
        return (j8.a() == 10) || (j8.b() != 1 && j8.b() != 0);
    }

    public static boolean a0(T0 t8) {
        return t8 instanceof C0903w0;
    }

    public static boolean c0(Collection collection) {
        int[] iArr = {1, 2, 4};
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            T0 t8 = (T0) it.next();
            for (int i8 = 0; i8 < 3; i8++) {
                int i9 = iArr[i8];
                if (t8.F(i9)) {
                    if (hashSet.contains(Integer.valueOf(i9))) {
                        return false;
                    }
                    hashSet.add(Integer.valueOf(i9));
                }
            }
        }
        return true;
    }

    public static /* synthetic */ void d(S0 s8) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(s8.p().getWidth(), s8.p().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        s8.t(surface, J.a.a(), new T1.a() { // from class: L.e
            @Override // T1.a
            public final void accept(Object obj) {
                f.f(surface, surfaceTexture, (S0.g) obj);
            }
        });
    }

    public static boolean d0(T0 t8) {
        if (t8 != null) {
            if (t8.l().e(u1.f3222G)) {
                return t8.l().O() == v1.b.VIDEO_CAPTURE;
            }
            Log.e("CameraUseCaseAdapter", t8 + " UseCase does not have capture type.");
        }
        return false;
    }

    public static /* synthetic */ void f(Surface surface, SurfaceTexture surfaceTexture, S0.g gVar) {
        surface.release();
        surfaceTexture.release();
    }

    public static void f0(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            ((T0) entry.getKey()).W((Set) entry.getValue());
        }
    }

    public static List i0(List list, Collection collection) {
        ArrayList arrayList = new ArrayList(list);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((T0) it.next()).V(null);
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                p063h.s.a(it2.next());
                throw null;
            }
        }
        return arrayList;
    }

    public static void o0(List list, Collection collection, Collection collection2) {
        List listI0 = i0(list, collection);
        ArrayList arrayList = new ArrayList(collection2);
        arrayList.removeAll(collection);
        List listI1 = i0(listI0, arrayList);
        if (listI1.isEmpty()) {
            return;
        }
        AbstractC0890p0.l("CameraUseCaseAdapter", "Unused effects: " + listI1);
    }

    public static Map t(Collection collection, D.b bVar) {
        HashMap map = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            T0 t8 = (T0) it.next();
            map.put(t8, t8.o());
            t8.W(bVar != null ? bVar.a() : null);
        }
        return map;
    }

    public static u1 u(T0 t8, u1 u1Var, int i8, Range range) {
        O0 o0J0 = u1Var != null ? O0.j0(u1Var) : O0.i0();
        o0J0.L(u1.f3217B, Integer.valueOf(i8));
        if (!g1.f3033a.equals(range)) {
            o0J0.K(u1.f3218C, InterfaceC0984i0.c.HIGH_PRIORITY_REQUIRED, range);
            o0J0.L(u1.f3219D, Boolean.TRUE);
        }
        return t8.D(o0J0).b();
    }

    public static Collection y(Collection collection, T0 t8, U.g gVar) {
        ArrayList arrayList = new ArrayList(collection);
        if (t8 != null) {
            arrayList.add(t8);
        }
        if (gVar != null) {
            arrayList.add(gVar);
            arrayList.removeAll(gVar.p0());
        }
        return arrayList;
    }

    public final void B(Collection collection) {
        if (O()) {
            if (Q(collection)) {
                throw new IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
            }
            if (R(collection)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Raw image capture.");
            }
        }
        synchronized (this.f4759m) {
            try {
                if (!this.f4755i.isEmpty() && (S(collection) || R(collection))) {
                    throw new IllegalArgumentException("Ultra HDR image and Raw capture does not support for use with CameraEffect.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0864c0 D() {
        return new C0864c0.b().n("ImageCapture-Extra").c();
    }

    public final C0903w0 E() {
        C0903w0 c0903w0C = new C0903w0.a().m("Preview-Extra").c();
        c0903w0C.l0(new C0903w0.c() { // from class: L.d
            @Override // A.C0903w0.c
            public final void a(S0 s8) {
                f.d(s8);
            }
        });
        return c0903w0C;
    }

    public final U.g F(Collection collection, boolean z8) {
        synchronized (this.f4759m) {
            try {
                Set setM = M(collection, z8);
                if (setM.size() >= 2 || (O() && T(setM))) {
                    U.g gVar = this.f4763q;
                    if (gVar == null || !gVar.p0().equals(setM)) {
                        if (!c0(setM)) {
                            return null;
                        }
                        return new U.g(this.f4747a, this.f4748b, this.f4764r, this.f4765s, setM, this.f4749c);
                    }
                    this.f4763q.y0(setM);
                    U.g gVar2 = this.f4763q;
                    Objects.requireNonNull(gVar2);
                    return gVar2;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void G() {
        synchronized (this.f4759m) {
            try {
                if (this.f4760n) {
                    this.f4747a.n(new ArrayList(this.f4752f));
                    C0975e c0975e = this.f4748b;
                    if (c0975e != null) {
                        c0975e.n(new ArrayList(this.f4752f));
                    }
                    w();
                    this.f4760n = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C0894s I() {
        return this.f4750d;
    }

    public final int L(boolean z8) {
        int i8;
        synchronized (this.f4759m) {
            try {
                Iterator it = this.f4755i.iterator();
                if (it.hasNext()) {
                    p063h.s.a(it.next());
                    throw null;
                }
                i8 = z8 ? 3 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i8;
    }

    public final Set M(Collection collection, boolean z8) {
        HashSet hashSet = new HashSet();
        int iL = L(z8);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            T0 t8 = (T0) it.next();
            T1.f.b(!U.g.t0(t8), "Only support one level of sharing for now.");
            if (t8.F(iL)) {
                hashSet.add(t8);
            }
        }
        return hashSet;
    }

    public List N() {
        ArrayList arrayList;
        synchronized (this.f4759m) {
            arrayList = new ArrayList(this.f4751e);
        }
        return arrayList;
    }

    public final boolean O() {
        synchronized (this.f4759m) {
            this.f4758l.M(null);
        }
        return false;
    }

    public final boolean U() {
        boolean z8;
        synchronized (this.f4759m) {
            z8 = true;
            if (this.f4758l.I() != 1) {
                z8 = false;
            }
        }
        return z8;
    }

    public final boolean b0() {
        return (O() || this.f4748b != null || this.f4756j == 1) ? false : true;
    }

    @Override // A.InterfaceC0881l
    public InterfaceC0896t c() {
        return this.f4747a.c();
    }

    public void e0(Collection collection) {
        synchronized (this.f4759m) {
            C(collection);
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f4751e);
            linkedHashSet.removeAll(collection);
            j(x(linkedHashSet, this.f4748b != null, false));
        }
    }

    public final void g0() {
        synchronized (this.f4759m) {
            try {
                if (this.f4761o != null) {
                    this.f4747a.g().h(this.f4761o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h0(List list) {
        synchronized (this.f4759m) {
            this.f4755i = list;
        }
    }

    public void i(Collection collection, D.b bVar) {
        AbstractC0890p0.a("CameraUseCaseAdapter", "addUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + bVar);
        synchronized (this.f4759m) {
            try {
                s();
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f4751e);
                linkedHashSet.addAll(collection);
                Map mapT = t(linkedHashSet, bVar);
                try {
                    j(x(linkedHashSet, this.f4748b != null, false));
                } catch (IllegalArgumentException e8) {
                    f0(mapT);
                    throw new a(e8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(L.b bVar) {
        p0(bVar.g().b(), bVar.b());
        o0(this.f4755i, bVar.b(), bVar.a());
        Iterator it = bVar.d().iterator();
        while (it.hasNext()) {
            ((T0) it.next()).Z(this.f4747a);
        }
        this.f4747a.n(bVar.d());
        if (this.f4748b != null) {
            for (T0 t8 : bVar.d()) {
                C0975e c0975e = this.f4748b;
                Objects.requireNonNull(c0975e);
                t8.Z(c0975e);
            }
            C0975e c0975e2 = this.f4748b;
            Objects.requireNonNull(c0975e2);
            c0975e2.n(bVar.d());
        }
        if (bVar.d().isEmpty()) {
            for (T0 t9 : bVar.e()) {
                Map mapB = bVar.g().b();
                if (mapB.containsKey(t9)) {
                    g1 g1Var = (g1) mapB.get(t9);
                    Objects.requireNonNull(g1Var);
                    InterfaceC0984i0 interfaceC0984i0D = g1Var.d();
                    if (interfaceC0984i0D != null && P(g1Var, t9.z())) {
                        t9.c0(interfaceC0984i0D);
                        if (this.f4760n) {
                            this.f4747a.i(t9);
                            C0975e c0975e3 = this.f4748b;
                            if (c0975e3 != null) {
                                Objects.requireNonNull(c0975e3);
                                c0975e3.i(t9);
                            }
                        }
                    }
                }
            }
        }
        for (T0 t10 : bVar.c()) {
            b bVar2 = (b) bVar.j().get(t10);
            Objects.requireNonNull(bVar2);
            C0975e c0975e4 = this.f4748b;
            if (c0975e4 != null) {
                C0975e c0975e5 = this.f4747a;
                Objects.requireNonNull(c0975e4);
                t10.d(c0975e5, c0975e4, bVar2.f4768a, bVar2.f4769b);
                t10.b0((g1) T1.f.g((g1) bVar.g().b().get(t10)), (g1) ((l) T1.f.g(bVar.h())).b().get(t10));
            } else {
                t10.d(this.f4747a, null, bVar2.f4768a, bVar2.f4769b);
                t10.b0((g1) T1.f.g((g1) bVar.g().b().get(t10)), null);
            }
        }
        if (this.f4760n) {
            this.f4747a.m(bVar.c());
            C0975e c0975e6 = this.f4748b;
            if (c0975e6 != null) {
                Objects.requireNonNull(c0975e6);
                c0975e6.m(bVar.c());
            }
        }
        Iterator it2 = bVar.c().iterator();
        while (it2.hasNext()) {
            ((T0) it2.next()).L();
        }
        this.f4751e.clear();
        this.f4751e.addAll(bVar.a());
        this.f4752f.clear();
        this.f4752f.addAll(bVar.b());
        this.f4762p = bVar.f();
        this.f4763q = bVar.i();
    }

    public void j0(Range range) {
        synchronized (this.f4759m) {
            this.f4757k = range;
        }
    }

    public void k0(int i8) {
        synchronized (this.f4759m) {
            this.f4756j = i8;
        }
    }

    public void l(boolean z8) {
        this.f4747a.l(z8);
    }

    public void l0(V0 v8) {
        synchronized (this.f4759m) {
            this.f4754h = v8;
        }
    }

    public final boolean m0(Collection collection) {
        if (O() && T(collection)) {
            return true;
        }
        return this.f4766t.a(this.f4747a.r().e(), collection);
    }

    public L.b n0(Collection collection, D.b bVar, boolean z8) {
        L.b bVarX;
        AbstractC0890p0.a("CameraUseCaseAdapter", "simulateAddUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + bVar);
        synchronized (this.f4759m) {
            s();
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f4751e);
            linkedHashSet.addAll(collection);
            Map mapT = t(linkedHashSet, bVar);
            try {
                try {
                    bVarX = x(linkedHashSet, this.f4748b != null, z8);
                    f0(mapT);
                } catch (IllegalArgumentException e8) {
                    throw new a(e8);
                }
            } catch (Throwable th) {
                f0(mapT);
                throw th;
            }
        }
        return bVarX;
    }

    public final void p0(Map map, Collection collection) {
        Map map2;
        synchronized (this.f4759m) {
            try {
                if (this.f4754h == null || collection.isEmpty()) {
                    map2 = map;
                } else {
                    map2 = map;
                    Map mapA = s.a(this.f4747a.r().h(), this.f4747a.r().i() == 0, this.f4754h.a(), this.f4747a.r().l(this.f4754h.c()), this.f4754h.d(), this.f4754h.b(), map2);
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        T0 t8 = (T0) it.next();
                        t8.Y((Rect) T1.f.g((Rect) mapA.get(t8)));
                    }
                }
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    T0 t9 = (T0) it2.next();
                    t9.X(A(this.f4747a.r().h(), ((g1) T1.f.g((g1) map2.get(t9))).f()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s() {
        this.f4747a.k(this.f4758l);
        C0975e c0975e = this.f4748b;
        if (c0975e != null) {
            c0975e.k(this.f4758l);
        }
    }

    public void v() {
        synchronized (this.f4759m) {
            try {
                if (!this.f4760n) {
                    if (!this.f4752f.isEmpty()) {
                        this.f4747a.k(this.f4758l);
                        C0975e c0975e = this.f4748b;
                        if (c0975e != null) {
                            c0975e.k(this.f4758l);
                        }
                    }
                    this.f4747a.m(this.f4752f);
                    C0975e c0975e2 = this.f4748b;
                    if (c0975e2 != null) {
                        c0975e2.m(this.f4752f);
                    }
                    g0();
                    Iterator it = this.f4752f.iterator();
                    while (it.hasNext()) {
                        ((T0) it.next()).L();
                    }
                    this.f4760n = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w() {
        synchronized (this.f4759m) {
            F fG = this.f4747a.g();
            this.f4761o = fG.f();
            fG.i();
        }
    }

    public final L.b x(Collection collection, boolean z8, boolean z9) {
        l lVarA;
        boolean z10 = z9;
        B(collection);
        if (!z8 && m0(collection)) {
            return x(collection, true, z10);
        }
        U.g gVarF = F(collection, z8);
        T0 t0Z = z(collection, gVarF);
        Collection<?> collectionY = y(collection, t0Z, gVarF);
        ArrayList arrayList = new ArrayList(collectionY);
        arrayList.removeAll(this.f4752f);
        ArrayList arrayList2 = new ArrayList(collectionY);
        arrayList2.retainAll(this.f4752f);
        ArrayList arrayList3 = new ArrayList(this.f4752f);
        arrayList3.removeAll(collectionY);
        Map mapK = K(arrayList, this.f4758l.j(), this.f4749c, this.f4756j, this.f4757k);
        boolean zX = X(arrayList, arrayList2);
        try {
            l lVarA2 = this.f4767u.a(J(), this.f4747a.r(), arrayList, arrayList2, this.f4758l, this.f4756j, this.f4757k, zX, z10);
            try {
                if (this.f4748b != null) {
                    m mVar = this.f4767u;
                    int iJ = J();
                    C0975e c0975e = this.f4748b;
                    Objects.requireNonNull(c0975e);
                    z10 = z9;
                    lVarA = mVar.a(iJ, c0975e.r(), arrayList, arrayList2, this.f4758l, this.f4756j, this.f4757k, zX, z10);
                } else {
                    lVarA = null;
                }
                return new L.b(collection, collectionY, arrayList, arrayList2, arrayList3, gVarF, t0Z, mapK, lVarA2, lVarA);
            } catch (IllegalArgumentException e8) {
                e = e8;
                z10 = z9;
                if (z8 || !b0()) {
                    throw e;
                }
                return x(collection, true, z10);
            }
        } catch (IllegalArgumentException e9) {
            e = e9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    public final T0 z(Collection collection, U.g gVar) {
        T0 t0D;
        synchronized (this.f4759m) {
            try {
                ArrayList arrayList = new ArrayList(collection);
                if (gVar != null) {
                    arrayList.add(gVar);
                    arrayList.removeAll(gVar.p0());
                }
                if (!U()) {
                    t0D = null;
                } else if (W(arrayList)) {
                    t0D = a0(this.f4762p) ? this.f4762p : E();
                } else if (V(arrayList)) {
                    t0D = Y(this.f4762p) ? this.f4762p : D();
                } else {
                    t0D = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t0D;
    }

    public f(J j8, J j9, C0973d c0973d, C0973d c0973d2, I i8, I i9, B.a aVar, m mVar, v1 v1Var) {
        this.f4751e = new ArrayList();
        this.f4752f = new ArrayList();
        this.f4755i = Collections.EMPTY_LIST;
        this.f4756j = 0;
        this.f4757k = g1.f3033a;
        this.f4759m = new Object();
        this.f4760n = true;
        this.f4761o = null;
        this.f4766t = new O.e();
        this.f4758l = c0973d.t();
        this.f4747a = new C0975e(j8, c0973d);
        if (j9 != null && c0973d2 != null) {
            this.f4748b = new C0975e(j9, c0973d2);
        } else {
            this.f4748b = null;
        }
        this.f4764r = i8;
        this.f4765s = i9;
        this.f4753g = aVar;
        this.f4749c = v1Var;
        this.f4750d = C0894s.b(c0973d, c0973d2);
        this.f4767u = mVar;
    }
}
