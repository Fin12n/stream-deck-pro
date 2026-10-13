package J0;

import C6.C0920i;
import D6.C0933m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: J0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C1020c extends AbstractC1028k {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f3951p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f3952q = 8;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f3953r = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Q6.k f3954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Q6.k f3955h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3956i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public B0.b f3957j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f3958k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n f3959l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f3960m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3961n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f3962o;

    /* JADX INFO: renamed from: J0.c$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public C1020c(int i8, n nVar, Q6.k kVar, Q6.k kVar2) {
        super(i8, nVar, null);
        this.f3954g = kVar;
        this.f3955h = kVar2;
        this.f3959l = n.f3987e.a();
        this.f3960m = f3953r;
        this.f3961n = 1;
    }

    public final void A() {
        B0.b bVarE = E();
        if (bVarE != null) {
            Q();
            O(null);
            int iF = f();
            Object[] objArrT = bVarE.t();
            int size = bVarE.size();
            for (int i8 = 0; i8 < size; i8++) {
                Object obj = objArrT[i8];
                kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                for (I iC = ((G) obj).c(); iC != null; iC = iC.e()) {
                    if (iC.f() == iF || D6.z.b0(this.f3959l, Integer.valueOf(iC.f()))) {
                        iC.h(0);
                    }
                }
            }
        }
        b();
    }

    public final void B() {
        I(f());
        C6.G g8 = C6.G.f1419a;
        if (D() || e()) {
            return;
        }
        int iF = f();
        synchronized (p.I()) {
            int i8 = p.f4003e;
            p.f4003e = i8 + 1;
            u(i8);
            p.f4002d = p.f4002d.F(f());
        }
        v(p.z(g(), iF + 1, f()));
    }

    public AbstractC1029l C() {
        B0.b bVarE;
        B0.b bVarE2 = E();
        Map mapR = bVarE2 != null ? p.R((C1020c) p.f4008j.get(), this, p.f4002d.y(((C1018a) p.f4008j.get()).f())) : null;
        List listN = D6.r.n();
        synchronized (p.I()) {
            try {
                p.g0(this);
                if (bVarE2 == null || bVarE2.size() == 0) {
                    c();
                    C1018a c1018a = (C1018a) p.f4008j.get();
                    p.a0(c1018a, p.f3999a);
                    bVarE = c1018a.E();
                    if (bVarE == null || bVarE.isEmpty()) {
                        bVarE = null;
                    } else {
                        listN = p.f4006h;
                    }
                } else {
                    C1018a c1018a2 = (C1018a) p.f4008j.get();
                    AbstractC1029l abstractC1029lH = H(p.f4003e, mapR, p.f4002d.y(c1018a2.f()));
                    if (!kotlin.jvm.internal.t.c(abstractC1029lH, AbstractC1029l.b.f3981a)) {
                        return abstractC1029lH;
                    }
                    c();
                    p.a0(c1018a2, p.f3999a);
                    bVarE = c1018a2.E();
                    O(null);
                    c1018a2.O(null);
                    listN = p.f4006h;
                }
                C6.G g8 = C6.G.f1419a;
                this.f3962o = true;
                if (bVarE != null && !bVarE.isEmpty()) {
                    kotlin.jvm.internal.t.d(bVarE);
                    int size = listN.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        ((Q6.o) listN.get(i8)).invoke(bVarE, this);
                    }
                }
                if (bVarE2 != null && !bVarE2.isEmpty()) {
                    int size2 = listN.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        ((Q6.o) listN.get(i9)).invoke(bVarE2, this);
                    }
                }
                synchronized (p.I()) {
                    try {
                        r();
                        p.C();
                        if (bVarE != null) {
                            Object[] objArrT = bVarE.t();
                            int size3 = bVarE.size();
                            for (int i10 = 0; i10 < size3; i10++) {
                                Object obj = objArrT[i10];
                                kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                p.U((G) obj);
                            }
                        }
                        if (bVarE2 != null) {
                            Object[] objArrT2 = bVarE2.t();
                            int size4 = bVarE2.size();
                            for (int i11 = 0; i11 < size4; i11++) {
                                Object obj2 = objArrT2[i11];
                                kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                p.U((G) obj2);
                            }
                        }
                        List list = this.f3958k;
                        if (list != null) {
                            int size5 = list.size();
                            for (int i12 = 0; i12 < size5; i12++) {
                                p.U((G) list.get(i12));
                            }
                        }
                        this.f3958k = null;
                        C6.G g9 = C6.G.f1419a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return AbstractC1029l.b.f3981a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean D() {
        return this.f3962o;
    }

    public B0.b E() {
        return this.f3957j;
    }

    public final n F() {
        return this.f3959l;
    }

    public final int[] G() {
        return this.f3960m;
    }

    public final AbstractC1029l H(int i8, Map map, n nVar) {
        n nVar2;
        I iW;
        I iS;
        n nVarE = g().F(f()).E(this.f3959l);
        B0.b bVarE = E();
        kotlin.jvm.internal.t.d(bVarE);
        Object[] objArrT = bVarE.t();
        int size = bVarE.size();
        ArrayList arrayList = null;
        List listB0 = null;
        int i9 = 0;
        while (i9 < size) {
            Object obj = objArrT[i9];
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            G g8 = (G) obj;
            I iC = g8.c();
            I iW2 = p.W(iC, i8, nVar);
            if (iW2 == null || (iW = p.W(iC, f(), nVarE)) == null || kotlin.jvm.internal.t.c(iW2, iW)) {
                nVar2 = nVarE;
            } else {
                nVar2 = nVarE;
                I iW3 = p.W(iC, f(), g());
                if (iW3 == null) {
                    p.V();
                    throw new C0920i();
                }
                if (map == null || (iS = (I) map.get(iW2)) == null) {
                    iS = g8.s(iW, iW2, iW3);
                }
                if (iS == null) {
                    return new AbstractC1029l.a(this);
                }
                if (!kotlin.jvm.internal.t.c(iS, iW3)) {
                    if (kotlin.jvm.internal.t.c(iS, iW2)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(C6.v.a(g8, iW2.d()));
                        if (listB0 == null) {
                            listB0 = new ArrayList();
                        }
                        listB0.add(g8);
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(!kotlin.jvm.internal.t.c(iS, iW) ? C6.v.a(g8, iS) : C6.v.a(g8, iW.d()));
                    }
                }
            }
            i9++;
            nVarE = nVar2;
        }
        if (arrayList != null) {
            B();
            int size2 = arrayList.size();
            for (int i10 = 0; i10 < size2; i10++) {
                C6.o oVar = (C6.o) arrayList.get(i10);
                G g9 = (G) oVar.a();
                I i11 = (I) oVar.b();
                i11.h(f());
                synchronized (p.I()) {
                    i11.g(g9.c());
                    g9.o(i11);
                    C6.G g10 = C6.G.f1419a;
                }
            }
        }
        if (listB0 != null) {
            int size3 = listB0.size();
            for (int i12 = 0; i12 < size3; i12++) {
                bVarE.remove((G) listB0.get(i12));
            }
            List list = this.f3958k;
            if (list != null) {
                listB0 = D6.z.B0(list, listB0);
            }
            this.f3958k = listB0;
        }
        return AbstractC1029l.b.f3981a;
    }

    public final void I(int i8) {
        synchronized (p.I()) {
            this.f3959l = this.f3959l.F(i8);
            C6.G g8 = C6.G.f1419a;
        }
    }

    public final void J(n nVar) {
        synchronized (p.I()) {
            this.f3959l = this.f3959l.E(nVar);
            C6.G g8 = C6.G.f1419a;
        }
    }

    public final void K(int i8) {
        if (i8 >= 0) {
            this.f3960m = C0933m.y(this.f3960m, i8);
        }
    }

    public final void L(int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        int[] iArr2 = this.f3960m;
        if (iArr2.length != 0) {
            iArr = C0933m.z(iArr2, iArr);
        }
        this.f3960m = iArr;
    }

    public final void M() {
        int length = this.f3960m.length;
        for (int i8 = 0; i8 < length; i8++) {
            p.Y(this.f3960m[i8]);
        }
    }

    public final void N(boolean z8) {
        this.f3962o = z8;
    }

    public void O(B0.b bVar) {
        this.f3957j = bVar;
    }

    public C1020c P(Q6.k kVar, Q6.k kVar2) throws Throwable {
        z();
        R();
        I(f());
        synchronized (p.I()) {
            try {
                int i8 = p.f4003e;
                p.f4003e = i8 + 1;
                p.f4002d = p.f4002d.F(i8);
                n nVarG = g();
                v(nVarG.F(i8));
                try {
                    C1021d c1021d = new C1021d(i8, p.z(nVarG, f() + 1, i8), p.L(kVar, h(), false, 4, null), p.M(kVar2, k()), this);
                    if (D() || e()) {
                        return c1021d;
                    }
                    int iF = f();
                    synchronized (p.I()) {
                        int i9 = p.f4003e;
                        p.f4003e = i9 + 1;
                        u(i9);
                        p.f4002d = p.f4002d.F(f());
                        C6.G g8 = C6.G.f1419a;
                    }
                    v(p.z(g(), iF + 1, f()));
                    return c1021d;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void Q() {
        if (this.f3962o) {
            throw new IllegalStateException("Unsupported operation on a snapshot that has been applied");
        }
    }

    public final void R() {
        if (this.f3962o && this.f3979d < 0) {
            throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot");
        }
    }

    @Override // J0.AbstractC1028k
    public void c() {
        p.f4002d = p.f4002d.y(f()).u(this.f3959l);
    }

    @Override // J0.AbstractC1028k
    public void d() {
        if (e()) {
            return;
        }
        super.d();
        n(this);
    }

    @Override // J0.AbstractC1028k
    public Q6.k h() {
        return this.f3954g;
    }

    @Override // J0.AbstractC1028k
    public boolean i() {
        return false;
    }

    @Override // J0.AbstractC1028k
    public int j() {
        return this.f3956i;
    }

    @Override // J0.AbstractC1028k
    public Q6.k k() {
        return this.f3955h;
    }

    @Override // J0.AbstractC1028k
    public void m(AbstractC1028k abstractC1028k) {
        this.f3961n++;
    }

    @Override // J0.AbstractC1028k
    public void n(AbstractC1028k abstractC1028k) {
        int i8 = this.f3961n;
        if (i8 <= 0) {
            throw new IllegalArgumentException("no pending nested snapshots");
        }
        int i9 = i8 - 1;
        this.f3961n = i9;
        if (i9 != 0 || this.f3962o) {
            return;
        }
        A();
    }

    @Override // J0.AbstractC1028k
    public void o() {
        if (this.f3962o || e()) {
            return;
        }
        B();
    }

    @Override // J0.AbstractC1028k
    public void p(G g8) {
        B0.b bVarE = E();
        if (bVarE == null) {
            bVarE = new B0.b();
            O(bVarE);
        }
        bVarE.add(g8);
    }

    @Override // J0.AbstractC1028k
    public void r() {
        M();
        super.r();
    }

    @Override // J0.AbstractC1028k
    public void w(int i8) {
        this.f3956i = i8;
    }

    @Override // J0.AbstractC1028k
    public AbstractC1028k x(Q6.k kVar) {
        C1022e c1022e;
        z();
        R();
        int iF = f();
        I(f());
        synchronized (p.I()) {
            int i8 = p.f4003e;
            p.f4003e = i8 + 1;
            p.f4002d = p.f4002d.F(i8);
            c1022e = new C1022e(i8, p.z(g(), iF + 1, i8), kVar, this);
        }
        if (D() || e()) {
            return c1022e;
        }
        int iF2 = f();
        synchronized (p.I()) {
            int i9 = p.f4003e;
            p.f4003e = i9 + 1;
            u(i9);
            p.f4002d = p.f4002d.F(f());
            C6.G g8 = C6.G.f1419a;
        }
        v(p.z(g(), iF2 + 1, f()));
        return c1022e;
    }
}
