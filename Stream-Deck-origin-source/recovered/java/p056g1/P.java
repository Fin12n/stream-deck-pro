package p056g1;

import A1.n;
import A1.o;
import A1.r;
import A1.s;
import Q6.k;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;
import p038e1.AbstractC2230a;
import p038e1.C;
import p038e1.G;
import p038e1.I;
import p038e1.InterfaceC2247s;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class P extends O implements G {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final X f23472i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Map f23474k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public I f23476m;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f23473j = n.f446b.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C f23475l = new C(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map f23477n = new LinkedHashMap();

    public P(X x8) {
        this.f23472i = x8;
    }

    @Override // p056g1.O, p038e1.InterfaceC2244o
    public boolean B0() {
        return true;
    }

    public InterfaceC2338b C1() {
        InterfaceC2338b interfaceC2338bB = this.f23472i.h1().T().B();
        t.d(interfaceC2338bB);
        return interfaceC2338bB;
    }

    @Override // p038e1.a0
    public final void D0(long j8, float f8, k kVar) {
        J1(j8);
        if (n1()) {
            return;
        }
        I1();
    }

    public final int D1(AbstractC2230a abstractC2230a) {
        Integer num = (Integer) this.f23477n.get(abstractC2230a);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    public final Map E1() {
        return this.f23477n;
    }

    public int F(int i8) {
        X xJ2 = this.f23472i.j2();
        t.d(xJ2);
        P pE2 = xJ2.e2();
        t.d(pE2);
        return pE2.F(i8);
    }

    public InterfaceC2247s F1() {
        return this.f23475l;
    }

    public int G(int i8) {
        X xJ2 = this.f23472i.j2();
        t.d(xJ2);
        P pE2 = xJ2.e2();
        t.d(pE2);
        return pE2.G(i8);
    }

    public final X G1() {
        return this.f23472i;
    }

    public final C H1() {
        return this.f23475l;
    }

    public void I1() {
        T0().d();
    }

    public final void J1(long j8) {
        if (n.i(f1(), j8)) {
            return;
        }
        M1(j8);
        K.a aVarE = h1().T().E();
        if (aVarE != null) {
            aVarE.C1();
        }
        g1(this.f23472i);
    }

    public final void K1(long j8) {
        long jG0 = g0();
        J1(o.a(n.j(j8) + n.j(jG0), n.k(j8) + n.k(jG0)));
    }

    public final long L1(P p8) {
        long jA = n.f446b.a();
        P pE2 = this;
        while (!t.c(pE2, p8)) {
            long jF1 = pE2.f1();
            jA = o.a(n.j(jA) + n.j(jF1), n.k(jA) + n.k(jF1));
            X xK2 = pE2.f23472i.k2();
            t.d(xK2);
            pE2 = xK2.e2();
            t.d(pE2);
        }
        return jA;
    }

    public void M1(long j8) {
        this.f23473j = j8;
    }

    public final void N1(I i8) {
        C6.G g8;
        Map map;
        if (i8 != null) {
            I0(s.a(i8.g(), i8.f()));
            g8 = C6.G.f1419a;
        } else {
            g8 = null;
        }
        if (g8 == null) {
            I0(r.f455b.a());
        }
        if (!t.c(this.f23476m, i8) && i8 != null && ((((map = this.f23474k) != null && !map.isEmpty()) || !i8.c().isEmpty()) && !t.c(i8.c(), this.f23474k))) {
            C1().c().m();
            Map linkedHashMap = this.f23474k;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.f23474k = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(i8.c());
        }
        this.f23476m = i8;
    }

    @Override // p056g1.O
    public O O0() {
        X xJ2 = this.f23472i.j2();
        if (xJ2 != null) {
            return xJ2.e2();
        }
        return null;
    }

    @Override // p056g1.O
    public boolean Q0() {
        return this.f23476m != null;
    }

    @Override // p056g1.O
    public I T0() {
        I i8 = this.f23476m;
        if (i8 != null) {
            return i8;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    public int W(int i8) {
        X xJ2 = this.f23472i.j2();
        t.d(xJ2);
        P pE2 = xJ2.e2();
        t.d(pE2);
        return pE2.W(i8);
    }

    @Override // p038e1.K, p038e1.InterfaceC2243n
    public Object e() {
        return this.f23472i.e();
    }

    @Override // p056g1.O
    public long f1() {
        return this.f23473j;
    }

    public int g(int i8) {
        X xJ2 = this.f23472i.j2();
        t.d(xJ2);
        P pE2 = xJ2.e2();
        t.d(pE2);
        return pE2.g(i8);
    }

    @Override // A1.d
    public float getDensity() {
        return this.f23472i.getDensity();
    }

    @Override // p038e1.InterfaceC2244o
    public A1.t getLayoutDirection() {
        return this.f23472i.getLayoutDirection();
    }

    @Override // p056g1.S
    public F h1() {
        return this.f23472i.h1();
    }

    @Override // p056g1.O
    public void o1() {
        D0(f1(), 0.0f, null);
    }

    @Override // A1.l
    public float x0() {
        return this.f23472i.x0();
    }
}
