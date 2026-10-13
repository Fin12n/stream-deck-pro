package p056g1;

import L0.i;
import androidx.compose.ui.node.a;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: g1.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2348l extends i.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f23635n = a0.g(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i.c f23636o;

    @Override // L0.i.c
    public void L1() {
        super.L1();
        for (i.c cVarE2 = e2(); cVarE2 != null; cVarE2 = cVarE2.B1()) {
            cVarE2.c2(C1());
            if (!cVarE2.K1()) {
                cVarE2.L1();
            }
        }
    }

    @Override // L0.i.c
    public void M1() {
        for (i.c cVarE2 = e2(); cVarE2 != null; cVarE2 = cVarE2.B1()) {
            cVarE2.M1();
        }
        super.M1();
    }

    @Override // L0.i.c
    public void Q1() {
        super.Q1();
        for (i.c cVarE2 = e2(); cVarE2 != null; cVarE2 = cVarE2.B1()) {
            cVarE2.Q1();
        }
    }

    @Override // L0.i.c
    public void R1() {
        for (i.c cVarE2 = e2(); cVarE2 != null; cVarE2 = cVarE2.B1()) {
            cVarE2.R1();
        }
        super.R1();
    }

    @Override // L0.i.c
    public void S1() {
        super.S1();
        for (i.c cVarE2 = e2(); cVarE2 != null; cVarE2 = cVarE2.B1()) {
            cVarE2.S1();
        }
    }

    @Override // L0.i.c
    public void c2(X x8) {
        super.c2(x8);
        for (i.c cVarE2 = e2(); cVarE2 != null; cVarE2 = cVarE2.B1()) {
            cVarE2.c2(x8);
        }
    }

    public final InterfaceC2346j d2(InterfaceC2346j interfaceC2346j) {
        i.c cVarI0 = interfaceC2346j.I0();
        if (cVarI0 != interfaceC2346j) {
            i.c cVar = interfaceC2346j instanceof i.c ? (i.c) interfaceC2346j : null;
            i.c cVarH1 = cVar != null ? cVar.H1() : null;
            if (cVarI0 == I0() && t.c(cVarH1, this)) {
                return interfaceC2346j;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node");
        }
        if (cVarI0.K1()) {
            throw new IllegalStateException("Cannot delegate to an already attached node");
        }
        cVarI0.U1(I0());
        int iF1 = F1();
        int iH = a0.h(cVarI0);
        cVarI0.X1(iH);
        h2(iH, cVarI0);
        cVarI0.V1(this.f23636o);
        this.f23636o = cVarI0;
        cVarI0.Z1(this);
        g2(F1() | iH, false);
        if (K1()) {
            if ((iH & Z.a(2)) == 0 || (iF1 & Z.a(2)) != 0) {
                c2(C1());
            } else {
                a aVarJ0 = AbstractC2347k.k(this).j0();
                I0().c2(null);
                aVarJ0.D();
            }
            cVarI0.L1();
            cVarI0.R1();
            a0.a(cVarI0);
        }
        return interfaceC2346j;
    }

    public final i.c e2() {
        return this.f23636o;
    }

    public final int f2() {
        return this.f23635n;
    }

    public final void g2(int i8, boolean z8) {
        i.c cVarB1;
        int iF1 = F1();
        X1(i8);
        if (iF1 != i8) {
            if (AbstractC2347k.f(this)) {
                T1(i8);
            }
            if (K1()) {
                i.c cVarI0 = I0();
                i.c cVarH1 = this;
                while (cVarH1 != null) {
                    i8 |= cVarH1.F1();
                    cVarH1.X1(i8);
                    if (cVarH1 == cVarI0) {
                        break;
                    } else {
                        cVarH1 = cVarH1.H1();
                    }
                }
                if (z8 && cVarH1 == cVarI0) {
                    i8 = a0.h(cVarI0);
                    cVarI0.X1(i8);
                }
                int iA1 = i8 | ((cVarH1 == null || (cVarB1 = cVarH1.B1()) == null) ? 0 : cVarB1.A1());
                while (cVarH1 != null) {
                    iA1 |= cVarH1.F1();
                    cVarH1.T1(iA1);
                    cVarH1 = cVarH1.H1();
                }
            }
        }
    }

    public final void h2(int i8, i.c cVar) {
        int iF1 = F1();
        if ((i8 & Z.a(2)) == 0 || (Z.a(2) & iF1) == 0 || (this instanceof A)) {
            return;
        }
        throw new IllegalStateException(("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + cVar).toString());
    }
}
