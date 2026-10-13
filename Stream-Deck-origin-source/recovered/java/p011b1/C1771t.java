package p011b1;

import C6.G;
import L0.i;
import Q6.k;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p056g1.AbstractC2345i;
import p056g1.InterfaceC2344h;
import p056g1.m0;
import p056g1.t0;
import p056g1.u0;
import p056g1.v0;
import p065h1.X;

/* JADX INFO: renamed from: b1.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1771t extends i.c implements u0, m0, InterfaceC2344h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f15782n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC1772u f15783o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f15784p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f15785q;

    /* JADX INFO: renamed from: b1.t$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J f15786a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(J j8) {
            super(1);
            this.f15786a = j8;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C1771t c1771t) {
            if (this.f15786a.f28779a == null && c1771t.f15785q) {
                this.f15786a.f28779a = c1771t;
            } else if (this.f15786a.f28779a != null && c1771t.l2() && c1771t.f15785q) {
                this.f15786a.f28779a = c1771t;
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: b1.t$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ F f15787a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(F f8) {
            super(1);
            this.f15787a = f8;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t0 invoke(C1771t c1771t) {
            if (!c1771t.f15785q) {
                return t0.ContinueTraversal;
            }
            this.f15787a.f28775a = false;
            return t0.CancelTraversal;
        }
    }

    /* JADX INFO: renamed from: b1.t$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J f15788a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(J j8) {
            super(1);
            this.f15788a = j8;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t0 invoke(C1771t c1771t) {
            t0 t0Var = t0.ContinueTraversal;
            if (c1771t.f15785q) {
                this.f15788a.f28779a = c1771t;
                if (c1771t.l2()) {
                    return t0.SkipSubtreeAndContinueTraversal;
                }
            }
            return t0Var;
        }
    }

    /* JADX INFO: renamed from: b1.t$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J f15789a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(J j8) {
            super(1);
            this.f15789a = j8;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C1771t c1771t) {
            if (c1771t.l2() && c1771t.f15785q) {
                this.f15789a.f28779a = c1771t;
            }
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ C1771t(InterfaceC1772u interfaceC1772u, boolean z8, int i8, AbstractC2633k abstractC2633k) {
        this(interfaceC1772u, (i8 & 2) != 0 ? false : z8);
    }

    private final w m2() {
        return (w) AbstractC2345i.a(this, X.j());
    }

    @Override // L0.i.c
    public void O1() {
        this.f15785q = false;
        g2();
        super.O1();
    }

    public final void e2() {
        w wVarM2 = m2();
        if (wVarM2 != null) {
            wVarM2.a(null);
        }
    }

    public final void f2() {
        InterfaceC1772u interfaceC1772u;
        C1771t c1771tK2 = k2();
        if (c1771tK2 == null || (interfaceC1772u = c1771tK2.f15783o) == null) {
            interfaceC1772u = this.f15783o;
        }
        w wVarM2 = m2();
        if (wVarM2 != null) {
            wVarM2.a(interfaceC1772u);
        }
    }

    public final void g2() {
        G g8;
        J j8 = new J();
        v0.a(this, new a(j8));
        C1771t c1771t = (C1771t) j8.f28779a;
        if (c1771t != null) {
            c1771t.f2();
            g8 = G.f1419a;
        } else {
            g8 = null;
        }
        if (g8 == null) {
            e2();
        }
    }

    public final void h2() {
        C1771t c1771tJ2;
        if (this.f15785q) {
            if (this.f15784p || (c1771tJ2 = j2()) == null) {
                c1771tJ2 = this;
            }
            c1771tJ2.f2();
        }
    }

    public final void i2() {
        F f8 = new F();
        f8.f28775a = true;
        if (!this.f15784p) {
            v0.d(this, new b(f8));
        }
        if (f8.f28775a) {
            f2();
        }
    }

    public final C1771t j2() {
        J j8 = new J();
        v0.d(this, new c(j8));
        return (C1771t) j8.f28779a;
    }

    public final C1771t k2() {
        J j8 = new J();
        v0.a(this, new d(j8));
        return (C1771t) j8.f28779a;
    }

    public final boolean l2() {
        return this.f15784p;
    }

    @Override // p056g1.u0
    /* JADX INFO: renamed from: n2, reason: merged with bridge method [inline-methods] */
    public String C() {
        return this.f15782n;
    }

    public final void o2(InterfaceC1772u interfaceC1772u) {
        if (t.c(this.f15783o, interfaceC1772u)) {
            return;
        }
        this.f15783o = interfaceC1772u;
        if (this.f15785q) {
            i2();
        }
    }

    public final void p2(boolean z8) {
        if (this.f15784p != z8) {
            this.f15784p = z8;
            if (z8) {
                if (this.f15785q) {
                    f2();
                }
            } else if (this.f15785q) {
                h2();
            }
        }
    }

    @Override // p056g1.m0
    public void y0(C1766n c1766n, EnumC1768p enumC1768p, long j8) {
        if (enumC1768p == EnumC1768p.Main) {
            int iF = c1766n.f();
            r.a aVar = r.f15774a;
            if (r.i(iF, aVar.a())) {
                this.f15785q = true;
                i2();
            } else if (r.i(c1766n.f(), aVar.b())) {
                this.f15785q = false;
                g2();
            }
        }
    }

    public C1771t(InterfaceC1772u interfaceC1772u, boolean z8) {
        this.f15782n = "androidx.compose.ui.input.pointer.PointerHoverIcon";
        this.f15783o = interfaceC1772u;
        this.f15784p = z8;
    }

    @Override // p056g1.m0
    public void f0() {
    }
}
