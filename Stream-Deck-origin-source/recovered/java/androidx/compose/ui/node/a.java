package androidx.compose.ui.node;

import B0.d;
import D6.r;
import L0.i;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.amazon.a.a.o.b.f;
import java.util.List;
import kotlin.jvm.internal.t;
import p038e1.M;
import p056g1.A;
import p056g1.AbstractC2347k;
import p056g1.B;
import p056g1.C2339c;
import p056g1.C2357v;
import p056g1.F;
import p056g1.InterfaceC2351o;
import p056g1.U;
import p056g1.W;
import p056g1.X;
import p056g1.Z;
import p056g1.a0;
import p056g1.g0;
import p056g1.s0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f14741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2357v f14742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public X f14743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i.c f14744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i.c f14745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f14746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f14747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0363a f14748h;

    /* JADX INFO: renamed from: androidx.compose.ui.node.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class C0363a implements InterfaceC2351o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i.c f14749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f14751c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f14752d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f14753e;

        public C0363a(i.c cVar, int i8, d dVar, d dVar2, boolean z8) {
            this.f14749a = cVar;
            this.f14750b = i8;
            this.f14751c = dVar;
            this.f14752d = dVar2;
            this.f14753e = z8;
        }

        @Override // p056g1.InterfaceC2351o
        public void a(int i8, int i9) {
            i.c cVarB1 = this.f14749a.B1();
            t.d(cVarB1);
            a.d(a.this);
            if ((Z.a(2) & cVarB1.F1()) != 0) {
                X xC1 = cVarB1.C1();
                t.d(xC1);
                X xK2 = xC1.k2();
                X xJ2 = xC1.j2();
                t.d(xJ2);
                if (xK2 != null) {
                    xK2.L2(xJ2);
                }
                xJ2.M2(xK2);
                a.this.w(this.f14749a, xJ2);
            }
            this.f14749a = a.this.h(cVarB1);
        }

        @Override // p056g1.InterfaceC2351o
        public boolean b(int i8, int i9) {
            return androidx.compose.ui.node.b.d((i.b) this.f14751c.r()[this.f14750b + i8], (i.b) this.f14752d.r()[this.f14750b + i9]) != 0;
        }

        @Override // p056g1.InterfaceC2351o
        public void c(int i8, int i9) {
            i.c cVarB1 = this.f14749a.B1();
            t.d(cVarB1);
            this.f14749a = cVarB1;
            d dVar = this.f14751c;
            i.b bVar = (i.b) dVar.r()[this.f14750b + i8];
            d dVar2 = this.f14752d;
            i.b bVar2 = (i.b) dVar2.r()[this.f14750b + i9];
            if (t.c(bVar, bVar2)) {
                a.d(a.this);
            } else {
                a.this.G(bVar, bVar2, this.f14749a);
                a.d(a.this);
            }
        }

        @Override // p056g1.InterfaceC2351o
        public void d(int i8) {
            int i9 = this.f14750b + i8;
            this.f14749a = a.this.g((i.b) this.f14752d.r()[i9], this.f14749a);
            a.d(a.this);
            if (!this.f14753e) {
                this.f14749a.W1(true);
                return;
            }
            i.c cVarB1 = this.f14749a.B1();
            t.d(cVarB1);
            X xC1 = cVarB1.C1();
            t.d(xC1);
            A aD = AbstractC2347k.d(this.f14749a);
            if (aD != null) {
                B b8 = new B(a.this.m(), aD);
                this.f14749a.c2(b8);
                a.this.w(this.f14749a, b8);
                b8.M2(xC1.k2());
                b8.L2(xC1);
                xC1.M2(b8);
            } else {
                this.f14749a.c2(xC1);
            }
            this.f14749a.L1();
            this.f14749a.R1();
            a0.a(this.f14749a);
        }

        public final void e(d dVar) {
            this.f14752d = dVar;
        }

        public final void f(d dVar) {
            this.f14751c = dVar;
        }

        public final void g(i.c cVar) {
            this.f14749a = cVar;
        }

        public final void h(int i8) {
            this.f14750b = i8;
        }

        public final void i(boolean z8) {
            this.f14753e = z8;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
    }

    public a(F f8) {
        this.f14741a = f8;
        C2357v c2357v = new C2357v(f8);
        this.f14742b = c2357v;
        this.f14743c = c2357v;
        s0 s0VarZ2 = c2357v.i2();
        this.f14744d = s0VarZ2;
        this.f14745e = s0VarZ2;
    }

    public static final /* synthetic */ b d(a aVar) {
        aVar.getClass();
        return null;
    }

    public final void A() {
        for (i.c cVarP = p(); cVarP != null; cVarP = cVarP.H1()) {
            if (cVarP.K1()) {
                cVarP.S1();
            }
        }
    }

    public final void B(int i8, d dVar, d dVar2, i.c cVar, boolean z8) {
        W.e(dVar.s() - i8, dVar2.s() - i8, j(cVar, i8, dVar, dVar2, z8));
        C();
    }

    public final void C() {
        int iF1 = 0;
        for (i.c cVarH1 = this.f14744d.H1(); cVarH1 != null && cVarH1 != androidx.compose.ui.node.b.f14755a; cVarH1 = cVarH1.H1()) {
            iF1 |= cVarH1.F1();
            cVarH1.T1(iF1);
        }
    }

    public final void D() {
        X b8;
        X x8 = this.f14742b;
        for (i.c cVarH1 = this.f14744d.H1(); cVarH1 != null; cVarH1 = cVarH1.H1()) {
            A aD = AbstractC2347k.d(cVarH1);
            if (aD != null) {
                if (cVarH1.C1() != null) {
                    X xC1 = cVarH1.C1();
                    t.e(xC1, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    b8 = (B) xC1;
                    A aB3 = b8.b3();
                    b8.d3(aD);
                    if (aB3 != cVarH1) {
                        b8.y2();
                    }
                } else {
                    b8 = new B(this.f14741a, aD);
                    cVarH1.c2(b8);
                }
                x8.M2(b8);
                b8.L2(x8);
                x8 = b8;
            } else {
                cVarH1.c2(x8);
            }
        }
        F fM0 = this.f14741a.m0();
        x8.M2(fM0 != null ? fM0.O() : null);
        this.f14743c = x8;
    }

    public final i.c E(i.c cVar) {
        if (cVar != androidx.compose.ui.node.b.f14755a) {
            throw new IllegalStateException("trimChain called on already trimmed chain");
        }
        i.c cVarB1 = androidx.compose.ui.node.b.f14755a.B1();
        if (cVarB1 == null) {
            cVarB1 = this.f14744d;
        }
        cVarB1.Z1(null);
        androidx.compose.ui.node.b.f14755a.V1(null);
        androidx.compose.ui.node.b.f14755a.T1(-1);
        androidx.compose.ui.node.b.f14755a.c2(null);
        if (cVarB1 != androidx.compose.ui.node.b.f14755a) {
            return cVarB1;
        }
        throw new IllegalStateException("trimChain did not update the head");
    }

    public final void F(i iVar) {
        a aVar;
        i.c cVarV = v();
        d dVar = this.f14746f;
        int i8 = 0;
        int iS = dVar != null ? dVar.s() : 0;
        d dVar2 = this.f14747g;
        if (dVar2 == null) {
            dVar2 = new d(new i.b[16], 0);
        }
        d dVarE = androidx.compose.ui.node.b.e(iVar, dVar2);
        d dVar3 = null;
        if (dVarE.s() == iS) {
            i.c cVarB1 = cVarV.B1();
            int i9 = 0;
            while (cVarB1 != null && i9 < iS) {
                if (dVar == null) {
                    throw new IllegalStateException("expected prior modifier list to be non-empty");
                }
                i.b bVar = (i.b) dVar.r()[i9];
                i.b bVar2 = (i.b) dVarE.r()[i9];
                int iD = androidx.compose.ui.node.b.d(bVar, bVar2);
                if (iD == 0) {
                    cVarB1 = cVarB1.H1();
                    break;
                }
                if (iD == 1) {
                    G(bVar, bVar2, cVarB1);
                }
                cVarB1 = cVarB1.B1();
                i9++;
            }
            i.c cVar = cVarB1;
            if (i9 >= iS) {
                aVar = this;
            } else {
                if (dVar == null) {
                    throw new IllegalStateException("expected prior modifier list to be non-empty");
                }
                if (cVar == null) {
                    throw new IllegalStateException("structuralUpdate requires a non-null tail");
                }
                aVar = this;
                aVar.B(i9, dVar, dVarE, cVar, this.f14741a.I0());
                i8 = 1;
            }
        } else {
            aVar = this;
            if (!aVar.f14741a.I0() && iS == 0) {
                i.c cVarG = cVarV;
                while (i8 < dVarE.s()) {
                    cVarG = g((i.b) dVarE.r()[i8], cVarG);
                    i8++;
                }
                C();
            } else if (dVarE.s() != 0) {
                if (dVar == null) {
                    dVar = new d(new i.b[16], 0);
                }
                d dVar4 = dVar;
                aVar.B(0, dVar4, dVarE, cVarV, aVar.f14741a.I0());
                aVar = aVar;
                dVar = dVar4;
            } else {
                if (dVar == null) {
                    throw new IllegalStateException("expected prior modifier list to be non-empty");
                }
                i.c cVarB2 = cVarV.B1();
                for (int i10 = 0; cVarB2 != null && i10 < dVar.s(); i10++) {
                    cVarB2 = h(cVarB2).B1();
                }
                C2357v c2357v = aVar.f14742b;
                F fM0 = aVar.f14741a.m0();
                c2357v.M2(fM0 != null ? fM0.O() : null);
                aVar.f14743c = aVar.f14742b;
            }
            i8 = 1;
        }
        aVar.f14746f = dVarE;
        if (dVar != null) {
            dVar.m();
            dVar3 = dVar;
        }
        aVar.f14747g = dVar3;
        aVar.f14745e = E(cVarV);
        if (i8 != 0) {
            D();
        }
    }

    public final void G(i.b bVar, i.b bVar2, i.c cVar) {
        if ((bVar instanceof U) && (bVar2 instanceof U)) {
            androidx.compose.ui.node.b.f((U) bVar2, cVar);
            if (cVar.K1()) {
                a0.e(cVar);
                return;
            } else {
                cVar.a2(true);
                return;
            }
        }
        if (!(cVar instanceof C2339c)) {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        ((C2339c) cVar).h2(bVar2);
        if (cVar.K1()) {
            a0.e(cVar);
        } else {
            cVar.a2(true);
        }
    }

    public final i.c g(i.b bVar, i.c cVar) {
        i.c c2339c;
        if (bVar instanceof U) {
            c2339c = ((U) bVar).k();
            c2339c.X1(a0.h(c2339c));
        } else {
            c2339c = new C2339c(bVar);
        }
        if (c2339c.K1()) {
            throw new IllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        c2339c.W1(true);
        return s(c2339c, cVar);
    }

    public final i.c h(i.c cVar) {
        if (cVar.K1()) {
            a0.d(cVar);
            cVar.S1();
            cVar.M1();
        }
        return x(cVar);
    }

    public final int i() {
        return this.f14745e.A1();
    }

    public final C0363a j(i.c cVar, int i8, d dVar, d dVar2, boolean z8) {
        C0363a c0363a = this.f14748h;
        if (c0363a == null) {
            C0363a c0363a2 = new C0363a(cVar, i8, dVar, dVar2, z8);
            this.f14748h = c0363a2;
            return c0363a2;
        }
        c0363a.g(cVar);
        c0363a.h(i8);
        c0363a.f(dVar);
        c0363a.e(dVar2);
        c0363a.i(z8);
        return c0363a;
    }

    public final i.c k() {
        return this.f14745e;
    }

    public final C2357v l() {
        return this.f14742b;
    }

    public final F m() {
        return this.f14741a;
    }

    public final List n() {
        d dVar = this.f14746f;
        if (dVar == null) {
            return r.n();
        }
        int i8 = 0;
        d dVar2 = new d(new M[dVar.s()], 0);
        i.c cVarK = k();
        while (cVarK != null && cVarK != p()) {
            X xC1 = cVarK.C1();
            if (xC1 == null) {
                throw new IllegalArgumentException("getModifierInfo called on node with no coordinator");
            }
            g0 g0VarD2 = xC1.d2();
            g0 g0VarD3 = this.f14742b.d2();
            i.c cVarB1 = cVarK.B1();
            if (cVarB1 != this.f14744d || cVarK.C1() == cVarB1.C1()) {
                g0VarD3 = null;
            }
            if (g0VarD2 == null) {
                g0VarD2 = g0VarD3;
            }
            dVar2.d(new M((i) dVar.r()[i8], xC1, g0VarD2));
            cVarK = cVarK.B1();
            i8++;
        }
        return dVar2.k();
    }

    public final X o() {
        return this.f14743c;
    }

    public final i.c p() {
        return this.f14744d;
    }

    public final boolean q(int i8) {
        return (i8 & i()) != 0;
    }

    public final boolean r(int i8) {
        return (i8 & i()) != 0;
    }

    public final i.c s(i.c cVar, i.c cVar2) {
        i.c cVarB1 = cVar2.B1();
        if (cVarB1 != null) {
            cVarB1.Z1(cVar);
            cVar.V1(cVarB1);
        }
        cVar2.V1(cVar);
        cVar.Z1(cVar2);
        return cVar;
    }

    public final void t() {
        for (i.c cVarK = k(); cVarK != null; cVarK = cVarK.B1()) {
            cVarK.L1();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (this.f14745e == this.f14744d) {
            sb.append("]");
        } else {
            for (i.c cVarK = k(); cVarK != null && cVarK != p(); cVarK = cVarK.B1()) {
                sb.append(String.valueOf(cVarK));
                if (cVarK.B1() == this.f14744d) {
                    sb.append("]");
                    break;
                }
                sb.append(f.f16777a);
            }
        }
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void u() {
        for (i.c cVarP = p(); cVarP != null; cVarP = cVarP.H1()) {
            if (cVarP.K1()) {
                cVarP.M1();
            }
        }
    }

    public final i.c v() {
        if (this.f14745e == androidx.compose.ui.node.b.f14755a) {
            throw new IllegalStateException("padChain called on already padded chain");
        }
        i.c cVar = this.f14745e;
        cVar.Z1(androidx.compose.ui.node.b.f14755a);
        androidx.compose.ui.node.b.f14755a.V1(cVar);
        return androidx.compose.ui.node.b.f14755a;
    }

    public final void w(i.c cVar, X x8) {
        for (i.c cVarH1 = cVar.H1(); cVarH1 != null; cVarH1 = cVarH1.H1()) {
            if (cVarH1 == androidx.compose.ui.node.b.f14755a) {
                F fM0 = this.f14741a.m0();
                x8.M2(fM0 != null ? fM0.O() : null);
                this.f14743c = x8;
                return;
            } else {
                if ((Z.a(2) & cVarH1.F1()) != 0) {
                    return;
                }
                cVarH1.c2(x8);
            }
        }
    }

    public final i.c x(i.c cVar) {
        i.c cVarB1 = cVar.B1();
        i.c cVarH1 = cVar.H1();
        if (cVarB1 != null) {
            cVarB1.Z1(cVarH1);
            cVar.V1(null);
        }
        if (cVarH1 != null) {
            cVarH1.V1(cVarB1);
            cVar.Z1(null);
        }
        t.d(cVarH1);
        return cVarH1;
    }

    public final void y() {
        int iS;
        for (i.c cVarP = p(); cVarP != null; cVarP = cVarP.H1()) {
            if (cVarP.K1()) {
                cVarP.Q1();
            }
        }
        d dVar = this.f14746f;
        if (dVar != null && (iS = dVar.s()) > 0) {
            Object[] objArrR = dVar.r();
            int i8 = 0;
            do {
                i.b bVar = (i.b) objArrR[i8];
                if (bVar instanceof SuspendPointerInputElement) {
                    dVar.G(i8, new ForceUpdateElement((U) bVar));
                }
                i8++;
            } while (i8 < iS);
        }
        A();
        u();
    }

    public final void z() {
        for (i.c cVarK = k(); cVarK != null; cVarK = cVarK.B1()) {
            cVarK.R1();
            if (cVarK.E1()) {
                a0.a(cVarK);
            }
            if (cVarK.J1()) {
                a0.e(cVarK);
            }
            cVarK.W1(false);
            cVarK.a2(false);
        }
    }
}
