package p056g1;

import A1.s;
import C6.G;
import L0.i;
import P0.c;
import P0.j;
import P0.l;
import androidx.compose.ui.focus.e;
import java.util.HashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p011b1.C1766n;
import p011b1.EnumC1768p;
import p038e1.I;
import p038e1.InterfaceC2243n;
import p038e1.InterfaceC2244o;
import p038e1.InterfaceC2247s;
import p038e1.InterfaceC2253y;
import p038e1.J;
import p038e1.Q;
import p038e1.T;
import p038e1.X;
import p038e1.d0;
import p047f1.d;
import p047f1.g;
import p047f1.h;
import p047f1.k;
import p110m1.m;
import p110m1.x;

/* JADX INFO: renamed from: g1.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2339c extends i.c implements A, InterfaceC2353q, p0, m0, h, k, k0, InterfaceC2361z, InterfaceC2354s, c, P0.h, j, i0, O0.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i.b f23572n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f23573o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p047f1.a f23574p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashSet f23575q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InterfaceC2247s f23576r;

    /* JADX INFO: renamed from: g1.c$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m213invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m213invoke() {
            C2339c.this.j2();
        }
    }

    /* JADX INFO: renamed from: g1.c$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m214invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m214invoke() {
            i.b bVarD2 = C2339c.this.d2();
            t.e(bVarD2, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
            ((d) bVarD2).d(C2339c.this);
        }
    }

    public C2339c(i.b bVar) {
        X1(a0.f(bVar));
        this.f23572n = bVar;
        this.f23573o = true;
        this.f23575q = new HashSet();
    }

    @Override // P0.c
    public void J(l lVar) {
        throw new IllegalStateException("onFocusEvent called on wrong node");
    }

    @Override // p056g1.i0
    public boolean L() {
        return K1();
    }

    @Override // L0.i.c
    public void N1() {
        f2(true);
    }

    @Override // L0.i.c
    public void O1() {
        i2();
    }

    @Override // p056g1.p0
    public void Q(x xVar) {
        i.b bVar = this.f23572n;
        t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        p110m1.k kVarL = ((m) bVar).l();
        t.e(xVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((p110m1.k) xVar).m(kVarL);
    }

    @Override // p056g1.InterfaceC2361z
    public void R(InterfaceC2247s interfaceC2247s) {
        this.f23576r = interfaceC2247s;
    }

    @Override // P0.h
    public void S(e eVar) {
        throw new IllegalStateException("applyFocusProperties called on wrong node");
    }

    @Override // p056g1.A
    public I c(J j8, p038e1.G g8, long j9) {
        i.b bVar = this.f23572n;
        t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC2253y) bVar).c(j8, g8, j9);
    }

    @Override // O0.b
    public long d() {
        return s.c(AbstractC2347k.h(this, Z.a(128)).a());
    }

    @Override // p056g1.m0
    public boolean d1() {
        i.b bVar = this.f23572n;
        t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((p011b1.G) bVar).i().c();
    }

    public final i.b d2() {
        return this.f23572n;
    }

    @Override // p056g1.InterfaceC2361z
    public void e(long j8) {
        i.b bVar = this.f23572n;
        if (bVar instanceof T) {
            ((T) bVar).e(j8);
        }
    }

    public final HashSet e2() {
        return this.f23575q;
    }

    @Override // p056g1.k0
    public Object f(A1.d dVar, Object obj) {
        i.b bVar = this.f23572n;
        t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((X) bVar).f(dVar, obj);
    }

    @Override // p056g1.m0
    public void f0() {
        i.b bVar = this.f23572n;
        t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((p011b1.G) bVar).i().d();
    }

    public final void f2(boolean z8) {
        if (!K1()) {
            throw new IllegalStateException("initializeModifier called on unattached node");
        }
        i.b bVar = this.f23572n;
        if ((Z.a(32) & F1()) != 0) {
            if (bVar instanceof d) {
                b2(new a());
            }
            if (bVar instanceof p047f1.j) {
                k2((p047f1.j) bVar);
            }
        }
        if ((Z.a(4) & F1()) != 0 && !z8) {
            D.a(this);
        }
        if ((Z.a(2) & F1()) != 0) {
            if (AbstractC2340d.d(this)) {
                X xC1 = C1();
                t.d(xC1);
                ((B) xC1).d3(this);
                xC1.y2();
            }
            if (!z8) {
                D.a(this);
                AbstractC2347k.k(this).E0();
            }
        }
        if (bVar instanceof d0) {
            ((d0) bVar).h(AbstractC2347k.k(this));
        }
        if ((Z.a(128) & F1()) != 0 && (bVar instanceof T) && AbstractC2340d.d(this)) {
            AbstractC2347k.k(this).E0();
        }
        if ((Z.a(256) & F1()) != 0 && (bVar instanceof Q) && AbstractC2340d.d(this)) {
            AbstractC2347k.k(this).E0();
        }
        if ((Z.a(16) & F1()) != 0 && (bVar instanceof p011b1.G)) {
            ((p011b1.G) bVar).i().f(C1());
        }
        if ((Z.a(8) & F1()) != 0) {
            AbstractC2347k.l(this).t();
        }
    }

    @Override // p056g1.A
    public int g(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        i.b bVar = this.f23572n;
        t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC2253y) bVar).g(interfaceC2244o, interfaceC2243n, i8);
    }

    public final void g2() {
        this.f23573o = true;
        r.a(this);
    }

    @Override // O0.b
    public A1.d getDensity() {
        return AbstractC2347k.k(this).I();
    }

    @Override // O0.b
    public A1.t getLayoutDirection() {
        return AbstractC2347k.k(this).getLayoutDirection();
    }

    @Override // p056g1.InterfaceC2353q
    public void h0() {
        this.f23573o = true;
        r.a(this);
    }

    public final void h2(i.b bVar) {
        if (K1()) {
            i2();
        }
        this.f23572n = bVar;
        X1(a0.f(bVar));
        if (K1()) {
            f2(false);
        }
    }

    public final void i2() {
        if (!K1()) {
            throw new IllegalStateException("unInitializeModifier called on unattached node");
        }
        i.b bVar = this.f23572n;
        if ((Z.a(32) & F1()) != 0) {
            if (bVar instanceof p047f1.j) {
                AbstractC2347k.l(this).getModifierLocalManager().d(this, ((p047f1.j) bVar).getKey());
            }
            if (bVar instanceof d) {
                ((d) bVar).d(AbstractC2340d.f23579a);
            }
        }
        if ((Z.a(8) & F1()) != 0) {
            AbstractC2347k.l(this).t();
        }
    }

    public final void j2() {
        if (K1()) {
            this.f23575q.clear();
            AbstractC2347k.l(this).getSnapshotObserver().i(this, AbstractC2340d.f23581c, new b());
        }
    }

    @Override // p056g1.m0
    public boolean k0() {
        i.b bVar = this.f23572n;
        t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((p011b1.G) bVar).i().a();
    }

    public final void k2(p047f1.j jVar) {
        p047f1.a aVar = this.f23574p;
        if (aVar != null && aVar.a(jVar.getKey())) {
            aVar.c(jVar);
            AbstractC2347k.l(this).getModifierLocalManager().f(this, jVar.getKey());
        } else {
            this.f23574p = new p047f1.a(jVar);
            if (AbstractC2340d.d(this)) {
                AbstractC2347k.l(this).getModifierLocalManager().a(this, jVar.getKey());
            }
        }
    }

    @Override // p056g1.InterfaceC2354s
    public void m(InterfaceC2247s interfaceC2247s) {
        i.b bVar = this.f23572n;
        t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((Q) bVar).m(interfaceC2247s);
    }

    @Override // p056g1.A
    public int n(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        i.b bVar = this.f23572n;
        t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC2253y) bVar).n(interfaceC2244o, interfaceC2243n, i8);
    }

    @Override // p056g1.A
    public int o(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        i.b bVar = this.f23572n;
        t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC2253y) bVar).o(interfaceC2244o, interfaceC2243n, i8);
    }

    @Override // p056g1.InterfaceC2353q
    public void q(T0.c cVar) {
        i.b bVar = this.f23572n;
        t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((O0.h) bVar).q(cVar);
    }

    @Override // p056g1.A
    public int t(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        i.b bVar = this.f23572n;
        t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC2253y) bVar).t(interfaceC2244o, interfaceC2243n, i8);
    }

    public String toString() {
        return this.f23572n.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // p047f1.h, p047f1.k
    public Object u(p047f1.c cVar) {
        androidx.compose.ui.node.a aVarJ0;
        this.f23575q.add(cVar);
        int iA = Z.a(32);
        if (!I0().K1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        i.c cVarH1 = I0().H1();
        F fK = AbstractC2347k.k(this);
        while (fK != null) {
            if ((fK.j0().k().A1() & iA) != 0) {
                while (cVarH1 != null) {
                    if ((cVarH1.F1() & iA) != 0) {
                        ?? G8 = cVarH1;
                        ?? dVar = 0;
                        while (G8 != 0) {
                            if (G8 instanceof h) {
                                h hVar = (h) G8;
                                if (hVar.u0().a(cVar)) {
                                    return hVar.u0().b(cVar);
                                }
                            } else if ((G8.F1() & iA) != 0 && (G8 instanceof AbstractC2348l)) {
                                i.c cVarE2 = ((AbstractC2348l) G8).e2();
                                int i8 = 0;
                                G8 = G8;
                                dVar = dVar;
                                while (cVarE2 != null) {
                                    if ((cVarE2.F1() & iA) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            dVar = dVar;
                                            G8 = cVarE2;
                                        } else {
                                            if (dVar == 0) {
                                                dVar = new B0.d(new i.c[16], 0);
                                            }
                                            if (G8 != 0) {
                                                dVar.d(G8);
                                                G8 = 0;
                                            }
                                            dVar.d(cVarE2);
                                        }
                                    }
                                    cVarE2 = cVarE2.B1();
                                    G8 = G8;
                                    dVar = dVar;
                                }
                                if (i8 == 1) {
                                }
                            }
                            G8 = AbstractC2347k.g(dVar);
                        }
                    }
                    cVarH1 = cVarH1.H1();
                }
            }
            fK = fK.m0();
            cVarH1 = (fK == null || (aVarJ0 = fK.j0()) == null) ? null : aVarJ0.p();
        }
        return cVar.a().invoke();
    }

    @Override // p047f1.h
    public g u0() {
        p047f1.a aVar = this.f23574p;
        return aVar != null ? aVar : p047f1.i.a();
    }

    @Override // p056g1.m0
    public void y0(C1766n c1766n, EnumC1768p enumC1768p, long j8) {
        i.b bVar = this.f23572n;
        t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((p011b1.G) bVar).i().e(c1766n, enumC1768p, j8);
    }
}
