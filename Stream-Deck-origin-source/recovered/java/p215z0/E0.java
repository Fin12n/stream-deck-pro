package p215z0;

import C6.G;
import Q6.k;
import Q6.o;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import p010b0.t;
import p010b0.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class E0 implements P0, D0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f38529h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f38530i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public G0 f38532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3147d f38533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f38534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t f38536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u f38537g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final void a(W0 w8, List list, G0 g8) {
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                Object objY0 = w8.Y0((C3147d) list.get(i8), 0);
                E0 e8 = objY0 instanceof E0 ? (E0) objY0 : null;
                if (e8 != null) {
                    e8.g(g8);
                }
            }
        }

        public final boolean b(T0 t8, List list) {
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    C3147d c3147d = (C3147d) list.get(i8);
                    if (t8.L(c3147d) && (t8.N(t8.m(c3147d), 0) instanceof E0)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f38539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f38540c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i8, t tVar) {
            super(1);
            this.f38539b = i8;
            this.f38540c = tVar;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00a2 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:39:0x00a4 A[LOOP:0: B:11:0x002e->B:39:0x00a4, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:45:0x00a9 A[EDGE_INSN: B:45:0x00a9->B:40:0x00a9 BREAK  A[LOOP:0: B:11:0x002e->B:39:0x00a4], SYNTHETIC] */
        public final void b(InterfaceC3171p interfaceC3171p) {
            int i8;
            InterfaceC3171p interfaceC3171p2 = interfaceC3171p;
            if (E0.this.f38535e == this.f38539b && kotlin.jvm.internal.t.c(this.f38540c, E0.this.f38536f) && (interfaceC3171p2 instanceof C3176s)) {
                t tVar = this.f38540c;
                int i9 = this.f38539b;
                E0 e8 = E0.this;
                long[] jArr = tVar.f15640a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j8 = jArr[i10];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i10 != length) {
                                break;
                                break;
                            } else {
                                i10++;
                                interfaceC3171p2 = interfaceC3171p;
                            }
                        } else {
                            int i11 = 8;
                            int i12 = 8 - ((~(i10 - length)) >>> 31);
                            int i13 = 0;
                            while (i13 < i12) {
                                if ((255 & j8) < 128) {
                                    int i14 = (i10 << 3) + i13;
                                    Object obj = tVar.f15641b[i14];
                                    i8 = i11;
                                    boolean z8 = tVar.f15642c[i14] != i9;
                                    if (z8) {
                                        C3176s c3176s = (C3176s) interfaceC3171p2;
                                        c3176s.M(obj, e8);
                                        E e9 = obj instanceof E ? (E) obj : null;
                                        if (e9 != null) {
                                            c3176s.L(e9);
                                            u uVar = e8.f38537g;
                                            if (uVar != null) {
                                                uVar.n(e9);
                                                if (uVar.d() == 0) {
                                                    e8.f38537g = null;
                                                }
                                            }
                                        }
                                    }
                                    if (z8) {
                                        tVar.o(i14);
                                    }
                                } else {
                                    i8 = i11;
                                }
                                j8 >>= i8;
                                i13++;
                                interfaceC3171p2 = interfaceC3171p;
                                i11 = i8;
                            }
                            if (i12 != i11) {
                                break;
                            }
                            if (i10 != length) {
                                break;
                            }
                            i10++;
                            interfaceC3171p2 = interfaceC3171p;
                        }
                    }
                }
                if (this.f38540c.e() == 0) {
                    E0.this.f38536f = null;
                }
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((InterfaceC3171p) obj);
            return G.f1419a;
        }
    }

    public E0(G0 g8) {
        this.f38532b = g8;
    }

    public final void A(C3147d c3147d) {
        this.f38533c = c3147d;
    }

    public final void B(boolean z8) {
        if (z8) {
            this.f38531a |= 2;
        } else {
            this.f38531a &= -3;
        }
    }

    public final void C(boolean z8) {
        if (z8) {
            this.f38531a |= 4;
        } else {
            this.f38531a &= -5;
        }
    }

    public final void D(boolean z8) {
        if (z8) {
            this.f38531a |= 64;
        } else {
            this.f38531a &= -65;
        }
    }

    public final void E(boolean z8) {
        if (z8) {
            this.f38531a |= 8;
        } else {
            this.f38531a &= -9;
        }
    }

    public final void F(boolean z8) {
        if (z8) {
            this.f38531a |= 32;
        } else {
            this.f38531a &= -33;
        }
    }

    public final void G(boolean z8) {
        if (z8) {
            this.f38531a |= 16;
        } else {
            this.f38531a &= -17;
        }
    }

    public final void H(boolean z8) {
        if (z8) {
            this.f38531a |= 1;
        } else {
            this.f38531a &= -2;
        }
    }

    public final void I(int i8) {
        this.f38535e = i8;
        G(false);
    }

    @Override // p215z0.P0
    public void a(o oVar) {
        this.f38534d = oVar;
    }

    public final void g(G0 g8) {
        this.f38532b = g8;
    }

    public final void h(InterfaceC3163l interfaceC3163l) {
        G g8;
        o oVar = this.f38534d;
        if (oVar != null) {
            oVar.invoke(interfaceC3163l, 1);
            g8 = G.f1419a;
        } else {
            g8 = null;
        }
        if (g8 == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0058 A[LOOP:0: B:9:0x001c->B:22:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[SYNTHETIC] */
    public final k i(int i8) {
        t tVar = this.f38536f;
        if (tVar != null && !q()) {
            Object[] objArr = tVar.f15641b;
            int[] iArr = tVar.f15642c;
            long[] jArr = tVar.f15640a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i9 = 0;
                while (true) {
                    long j8 = jArr[i9];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j8) < 128) {
                                int i12 = (i9 << 3) + i11;
                                Object obj = objArr[i12];
                                if (iArr[i12] != i8) {
                                    return new b(i8, tVar);
                                }
                            }
                            j8 >>= 8;
                        }
                        if (i10 == 8) {
                            if (i9 != length) {
                                i9++;
                            }
                        }
                    } else if (i9 != length) {
                        i9++;
                    }
                }
            }
        }
        return null;
    }

    @Override // p215z0.D0
    public void invalidate() {
        G0 g8 = this.f38532b;
        if (g8 != null) {
            g8.c(this, null);
        }
    }

    public final C3147d j() {
        return this.f38533c;
    }

    public final boolean k() {
        return this.f38534d != null;
    }

    public final boolean l() {
        return (this.f38531a & 2) != 0;
    }

    public final boolean m() {
        return (this.f38531a & 4) != 0;
    }

    public final boolean n() {
        return (this.f38531a & 64) != 0;
    }

    public final boolean o() {
        return (this.f38531a & 8) != 0;
    }

    public final boolean p() {
        return (this.f38531a & 32) != 0;
    }

    public final boolean q() {
        return (this.f38531a & 16) != 0;
    }

    public final boolean r() {
        return (this.f38531a & 1) != 0;
    }

    public final boolean s() {
        if (this.f38532b != null) {
            C3147d c3147d = this.f38533c;
            if (c3147d != null ? c3147d.b() : false) {
                return true;
            }
        }
        return false;
    }

    public final U t(Object obj) {
        U uC;
        G0 g8 = this.f38532b;
        return (g8 == null || (uC = g8.c(this, obj)) == null) ? U.IGNORED : uC;
    }

    public final boolean u() {
        return this.f38537g != null;
    }

    public final boolean v(B0.b bVar) {
        u uVar;
        if (bVar != null && (uVar = this.f38537g) != null && bVar.u()) {
            if (bVar.isEmpty()) {
                return false;
            }
            for (Object obj : bVar) {
                if (obj instanceof E) {
                    E e8 = (E) obj;
                    f1 f1VarD = e8.d();
                    if (f1VarD == null) {
                        f1VarD = g1.r();
                    }
                    if (f1VarD.a(e8.z().a(), uVar.b(e8))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean w(Object obj) {
        if (p()) {
            return false;
        }
        t tVar = this.f38536f;
        if (tVar == null) {
            tVar = new t(0, 1, null);
            this.f38536f = tVar;
        }
        if (tVar.n(obj, this.f38535e, -1) == this.f38535e) {
            return true;
        }
        if (obj instanceof E) {
            u uVar = this.f38537g;
            if (uVar == null) {
                uVar = new u(0, 1, null);
                this.f38537g = uVar;
            }
            uVar.q(obj, ((E) obj).z().a());
        }
        return false;
    }

    public final void x() {
        G0 g8 = this.f38532b;
        if (g8 != null) {
            g8.j(this);
        }
        this.f38532b = null;
        this.f38536f = null;
        this.f38537g = null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0055 A[LOOP:0: B:10:0x001b->B:23:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0058 A[EDGE_INSN: B:32:0x0058->B:24:0x0058 BREAK  A[LOOP:0: B:10:0x001b->B:23:0x0055], SYNTHETIC] */
    public final void y() {
        t tVar;
        G0 g8 = this.f38532b;
        if (g8 == null || (tVar = this.f38536f) == null) {
            return;
        }
        F(true);
        try {
            Object[] objArr = tVar.f15641b;
            int[] iArr = tVar.f15642c;
            long[] jArr = tVar.f15640a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i8 = 0;
                while (true) {
                    long j8 = jArr[i8];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i8 != length) {
                            break;
                            break;
                        }
                        i8++;
                    } else {
                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((255 & j8) < 128) {
                                int i11 = (i8 << 3) + i10;
                                Object obj = objArr[i11];
                                int i12 = iArr[i11];
                                g8.a(obj);
                            }
                            j8 >>= 8;
                        }
                        if (i9 != 8) {
                            break;
                        } else if (i8 != length) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
            }
        } finally {
            F(false);
        }
    }

    public final void z() {
        G(true);
    }
}
