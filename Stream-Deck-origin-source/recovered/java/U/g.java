package U;

import A.AbstractC0890p0;
import A.I;
import A.M;
import A.T0;
import H.InterfaceC0984i0;
import H.InterfaceC1015y0;
import H.InterfaceC1017z0;
import H.J;
import H.N0;
import H.O0;
import H.c1;
import H.g1;
import H.h1;
import H.u1;
import H.v1;
import I.w;
import Q.C1570t;
import Q.N;
import Q.W;
import R.r;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Log;
import android.util.Size;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class g extends T0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public N f9955A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public N f9956B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public N f9957C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public N f9958D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public N f9959E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public c1.b f9960F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public c1.b f9961G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public c1.c f9962H;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f9963r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k f9964s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final I f9965t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final I f9966u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public W f9967v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public W f9968w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public r f9969x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public W f9970y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public N f9971z;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        Y4.a a(int i8, int i9);
    }

    public g(J j8, J j9, I i8, I i9, Set<T0> set, v1 v1Var) {
        super(r0(set));
        this.f9963r = r0(set);
        this.f9965t = i8;
        this.f9966u = i9;
        this.f9964s = new k(j8, j9, set, v1Var, new a() { // from class: U.e
            @Override // U.g.a
            public final Y4.a a(int i10, int i11) {
                return g.e0(this.f9948a, i10, i11);
            }
        });
        y0(set);
    }

    public static /* synthetic */ void d0(g gVar, String str, String str2, u1 u1Var, g1 g1Var, g1 g1Var2, c1 c1Var, c1.g gVar2) {
        if (gVar.i() == null) {
            return;
        }
        gVar.g0();
        gVar.a0(gVar.j0(str, str2, u1Var, g1Var, g1Var2));
        gVar.K();
        gVar.f9964s.N();
    }

    public static /* synthetic */ Y4.a e0(g gVar, int i8, int i9) {
        W w8 = gVar.f9968w;
        return w8 != null ? w8.e().c(i8, i9) : K.n.n(new Exception("Failed to take picture: pipeline is not ready."));
    }

    private void g0() {
        c1.c cVar = this.f9962H;
        if (cVar != null) {
            cVar.b();
            this.f9962H = null;
        }
        N n8 = this.f9971z;
        if (n8 != null) {
            n8.i();
            this.f9971z = null;
        }
        N n9 = this.f9955A;
        if (n9 != null) {
            n9.i();
            this.f9955A = null;
        }
        N n10 = this.f9956B;
        if (n10 != null) {
            n10.i();
            this.f9956B = null;
        }
        N n11 = this.f9957C;
        if (n11 != null) {
            n11.i();
            this.f9957C = null;
        }
        N n12 = this.f9958D;
        if (n12 != null) {
            n12.i();
            this.f9958D = null;
        }
        N n13 = this.f9959E;
        if (n13 != null) {
            n13.i();
            this.f9959E = null;
        }
        W w8 = this.f9968w;
        if (w8 != null) {
            w8.f();
            this.f9968w = null;
        }
        r rVar = this.f9969x;
        if (rVar != null) {
            rVar.d();
            this.f9969x = null;
        }
        W w9 = this.f9967v;
        if (w9 != null) {
            w9.f();
            this.f9967v = null;
        }
        W w10 = this.f9970y;
        if (w10 != null) {
            w10.f();
            this.f9970y = null;
        }
    }

    public static List n0(T0 t8) {
        ArrayList arrayList = new ArrayList();
        if (!t0(t8)) {
            arrayList.add(t8.l().O());
            return arrayList;
        }
        Iterator it = ((g) t8).p0().iterator();
        while (it.hasNext()) {
            arrayList.add(((T0) it.next()).l().O());
        }
        return arrayList;
    }

    public static int o0(T0 t8) {
        return t8.l().A().p();
    }

    private Rect q0(Size size) {
        return E() != null ? E() : new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    public static i r0(Set set) {
        N0 n0A = new h().a();
        n0A.L(InterfaceC1015y0.f3283j, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            T0 t8 = (T0) it.next();
            if (t8.l().e(u1.f3222G)) {
                arrayList.add(t8.l().O());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        n0A.L(i.f9973Q, arrayList);
        n0A.L(InterfaceC1017z0.f3289p, 2);
        n0A.L(u1.f3226K, h1.PREVIEW_VIDEO_STILL);
        return new i(H.T0.h0(n0A));
    }

    public static boolean t0(T0 t8) {
        return t8 instanceof g;
    }

    @Override // A.T0
    public Set A(H.I i8) {
        Set setP0 = p0();
        HashSet hashSet = null;
        if (setP0.isEmpty()) {
            return null;
        }
        Iterator it = setP0.iterator();
        while (it.hasNext()) {
            Set setA = ((T0) it.next()).A(i8);
            if (setA != null) {
                if (hashSet == null) {
                    hashSet = new HashSet(setA);
                } else {
                    hashSet.retainAll(setA);
                }
            }
        }
        return hashSet;
    }

    @Override // A.T0
    public Set B() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // A.T0
    public u1.b D(InterfaceC0984i0 interfaceC0984i0) {
        return new h(O0.j0(interfaceC0984i0));
    }

    @Override // A.T0
    public void M() {
        super.M();
        this.f9964s.s();
    }

    @Override // A.T0
    public void N() {
        super.N();
        this.f9964s.K();
    }

    @Override // A.T0
    public u1 O(H.I i8, u1.b bVar) {
        this.f9964s.J(bVar.a());
        return bVar.b();
    }

    @Override // A.T0
    public void P() {
        super.P();
        this.f9964s.L();
    }

    @Override // A.T0
    public void Q() {
        super.Q();
        this.f9964s.M();
    }

    @Override // A.T0
    public g1 R(InterfaceC0984i0 interfaceC0984i0) {
        this.f9960F.g(interfaceC0984i0);
        a0(M.a(new Object[]{this.f9960F.p()}));
        return g().i().d(interfaceC0984i0).a();
    }

    @Override // A.T0
    public g1 S(g1 g1Var, g1 g1Var2) {
        AbstractC0890p0.a("StreamSharing", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + g1Var + ", secondaryStreamSpec " + g1Var2);
        a0(j0(k(), w(), l(), g1Var, g1Var2));
        I();
        return g1Var;
    }

    @Override // A.T0
    public void T() {
        super.T();
        g0();
        this.f9964s.S();
    }

    public final void f0(c1.b bVar, final String str, final String str2, final u1 u1Var, final g1 g1Var, final g1 g1Var2) {
        c1.c cVar = this.f9962H;
        if (cVar != null) {
            cVar.b();
        }
        c1.c cVar2 = new c1.c(new c1.d() { // from class: U.f
            @Override // H.c1.d
            public final void a(c1 c1Var, c1.g gVar) {
                g.d0(this.f9949a, str, str2, u1Var, g1Var, g1Var2, c1Var, gVar);
            }
        });
        this.f9962H = cVar2;
        bVar.r(cVar2);
    }

    public final r h0(J j8, J j9, g1 g1Var, I i8, I i9) {
        return new r(j8, j9, R.o.a.a(g1Var.b(), i8, i9));
    }

    public final W i0(J j8, g1 g1Var) {
        n();
        return new W(j8, C1570t.a.a(g1Var.b()));
    }

    public final List j0(String str, String str2, u1 u1Var, g1 g1Var, g1 g1Var2) {
        w.b();
        if (g1Var2 != null) {
            N nK0 = k0(str, str2, u1Var, g1Var, g1Var2);
            N nL0 = l0(str, str2, u1Var, g1Var, g1Var2);
            r rVarH0 = h0(i(), v(), g1Var, this.f9965t, this.f9966u);
            this.f9969x = rVarH0;
            x0(nK0, nL0, rVarH0, g1Var);
            return M.a(new Object[]{this.f9960F.p(), this.f9961G.p()});
        }
        N nK1 = k0(str, str2, u1Var, g1Var, null);
        J jI = i();
        Objects.requireNonNull(jI);
        W wI0 = i0(jI, g1Var);
        this.f9968w = wI0;
        w0(nK1, wI0, false);
        return M.a(new Object[]{this.f9960F.p()});
    }

    public final N k0(String str, String str2, u1 u1Var, g1 g1Var, g1 g1Var2) {
        Matrix matrixY = y();
        J jI = i();
        Objects.requireNonNull(jI);
        boolean zP = jI.p();
        Rect rectQ0 = q0(g1Var.f());
        Objects.requireNonNull(rectQ0);
        J jI2 = i();
        Objects.requireNonNull(jI2);
        int iT = t(jI2);
        J jI3 = i();
        Objects.requireNonNull(jI3);
        N n8 = new N(3, 34, g1Var, matrixY, zP, rectQ0, iT, -1, G(jI3));
        this.f9971z = n8;
        boolean z8 = str2 != null;
        J jI4 = i();
        Objects.requireNonNull(jI4);
        this.f9956B = s0(n8, jI4, z8);
        c1.b bVarM0 = m0(this.f9971z, u1Var, g1Var);
        this.f9960F = bVarM0;
        f0(bVarM0, str, str2, u1Var, g1Var, g1Var2);
        return this.f9956B;
    }

    public final N l0(String str, String str2, u1 u1Var, g1 g1Var, g1 g1Var2) {
        Matrix matrixY = y();
        J jV = v();
        Objects.requireNonNull(jV);
        boolean zP = jV.p();
        Rect rectQ0 = q0(g1Var2.f());
        Objects.requireNonNull(rectQ0);
        J jV2 = v();
        Objects.requireNonNull(jV2);
        int iT = t(jV2);
        J jV3 = v();
        Objects.requireNonNull(jV3);
        N n8 = new N(3, 34, g1Var2, matrixY, zP, rectQ0, iT, -1, G(jV3));
        this.f9955A = n8;
        J jV4 = v();
        Objects.requireNonNull(jV4);
        this.f9957C = s0(n8, jV4, true);
        c1.b bVarM0 = m0(this.f9955A, u1Var, g1Var2);
        this.f9961G = bVarM0;
        f0(bVarM0, str, str2, u1Var, g1Var, g1Var2);
        return this.f9957C;
    }

    @Override // A.T0
    public u1 m(boolean z8, v1 v1Var) {
        InterfaceC0984i0 interfaceC0984i0A = v1Var.a(this.f9963r.O(), 1);
        if (z8) {
            interfaceC0984i0A = InterfaceC0984i0.p(interfaceC0984i0A, this.f9963r.q());
        }
        if (interfaceC0984i0A == null) {
            return null;
        }
        return D(interfaceC0984i0A).b();
    }

    public final c1.b m0(N n8, u1 u1Var, g1 g1Var) {
        c1.b bVarQ = c1.b.q(u1Var, g1Var.f());
        v0(bVarQ);
        u0(g1Var.f(), bVarQ);
        bVarQ.n(n8.o(), g1Var.b(), null, -1);
        bVarQ.j(this.f9964s.F());
        if (g1Var.d() != null) {
            bVarQ.g(g1Var.d());
        }
        bVarQ.x(g1Var.g());
        b(bVarQ, g1Var);
        return bVarQ;
    }

    public Set p0() {
        return this.f9964s.B();
    }

    public final N s0(N n8, J j8, boolean z8) {
        n();
        return n8;
    }

    public final void u0(Size size, c1.b bVar) {
        Iterator it = p0().iterator();
        while (it.hasNext()) {
            c1 c1VarP = c1.b.q(((T0) it.next()).l(), size).p();
            bVar.c(c1VarP.j());
            bVar.a(c1VarP.n());
            bVar.d(c1VarP.l());
            bVar.b(c1VarP.c());
            bVar.g(c1VarP.g());
        }
    }

    public final void v0(c1.b bVar) {
        Iterator it = p0().iterator();
        int iF = -1;
        while (it.hasNext()) {
            iF = c1.f(iF, o0((T0) it.next()));
        }
        if (iF != -1) {
            bVar.y(iF);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w0(N n8, W w8, boolean z8) {
        boolean z9 = E() != null;
        Map mapC = this.f9964s.C(n8, C(), z9, z8);
        W.c cVarJ = w8.j(W.b.c(n8, new ArrayList(mapC.values())));
        HashMap map = new HashMap();
        for (Map.Entry entry : mapC.entrySet()) {
            map.put((T0) entry.getKey(), (N) cVarJ.get(entry.getValue()));
        }
        this.f9964s.Q(map, this.f9964s.G(n8, z9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x0(N n8, N n9, r rVar, g1 g1Var) {
        n();
        boolean z8 = E() != null;
        Map mapD = this.f9964s.D(n8, n9, C(), z8);
        r.c cVarG = this.f9969x.g(r.b.d(n8, n9, new ArrayList(mapD.values())));
        HashMap map = new HashMap();
        for (Map.Entry entry : mapD.entrySet()) {
            map.put((T0) entry.getKey(), (N) cVarG.get(entry.getValue()));
        }
        this.f9964s.Q(map, this.f9964s.G(n8, z8));
    }

    public void y0(Set set) {
        W(((T0) set.iterator().next()).o());
    }
}
