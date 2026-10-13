package p128o1;

import A1.c;
import A1.d;
import C6.InterfaceC0916e;
import D6.r;
import D6.w;
import D6.z;
import Q0.h;
import Q6.k;
import R0.AbstractC1582d0;
import R0.H0;
import R0.InterfaceC1586f0;
import R0.R0;
import R0.T;
import T0.f;
import T0.g;
import W6.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.u;
import p168t1.AbstractC3006k;
import p168t1.AbstractC3009n;
import p168t1.InterfaceC3008m;
import p216z1.i;

/* JADX INFO: renamed from: o1.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2744i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2745j f30807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f30810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f30811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f30812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f30813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f30814h;

    /* JADX INFO: renamed from: o1.i$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f30815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float[] f30816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ H f30817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ G f30818d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j8, float[] fArr, H h8, G g8) {
            super(1);
            this.f30815a = j8;
            this.f30816b = fArr;
            this.f30817c = h8;
            this.f30818d = g8;
        }

        public final void b(o oVar) {
            long j8 = this.f30815a;
            float[] fArr = this.f30816b;
            H h8 = this.f30817c;
            G g8 = this.f30818d;
            long jB = H.b(oVar.p(oVar.f() > G.l(j8) ? oVar.f() : G.l(j8)), oVar.p(oVar.b() < G.k(j8) ? oVar.b() : G.k(j8)));
            oVar.e().j(jB, fArr, h8.f28777a);
            int iJ = h8.f28777a + (G.j(jB) * 4);
            for (int i8 = h8.f28777a; i8 < iJ; i8 += 4) {
                int i9 = i8 + 1;
                float f8 = fArr[i9];
                float f9 = g8.f28776a;
                fArr[i9] = f8 + f9;
                int i10 = i8 + 3;
                fArr[i10] = fArr[i10] + f9;
            }
            h8.f28777a = iJ;
            g8.f28776a += oVar.e().f();
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((o) obj);
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: renamed from: o1.i$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ H0 f30819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f30820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f30821c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(H0 h8, int i8, int i9) {
            super(1);
            this.f30819a = h8;
            this.f30820b = i8;
            this.f30821c = i9;
        }

        public final void b(o oVar) {
            H0.n(this.f30819a, oVar.j(oVar.e().C(oVar.p(this.f30820b), oVar.p(this.f30821c))), 0L, 2, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((o) obj);
            return C6.G.f1419a;
        }
    }

    public /* synthetic */ C2744i(C2739d c2739d, I i8, long j8, d dVar, AbstractC3009n.b bVar, List list, int i9, boolean z8, AbstractC2633k abstractC2633k) {
        this(c2739d, i8, j8, dVar, bVar, list, i9, z8);
    }

    public static /* synthetic */ void F(C2744i c2744i, InterfaceC1586f0 interfaceC1586f0, AbstractC1582d0 abstractC1582d0, float f8, R0 r8, p216z1.k kVar, g gVar, int i8, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            f8 = Float.NaN;
        }
        c2744i.E(interfaceC1586f0, abstractC1582d0, f8, (i9 & 8) != 0 ? null : r8, (i9 & 16) != 0 ? null : kVar, (i9 & 32) != 0 ? null : gVar, (i9 & 64) != 0 ? f.f9808L.a() : i8);
    }

    public final long A(int i8) {
        H(i8);
        o oVar = (o) this.f30814h.get(i8 == b().length() ? r.p(this.f30814h) : AbstractC2747l.a(this.f30814h, i8));
        return oVar.k(oVar.e().n(oVar.p(i8)));
    }

    public final boolean B(int i8) {
        I(i8);
        return ((o) this.f30814h.get(AbstractC2747l.b(this.f30814h, i8))).e().u(i8);
    }

    public final void C(InterfaceC1586f0 interfaceC1586f0, long j8, R0 r8, p216z1.k kVar, g gVar, int i8) {
        interfaceC1586f0.k();
        List list = this.f30814h;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            o oVar = (o) list.get(i9);
            oVar.e().B(interfaceC1586f0, j8, r8, kVar, gVar, i8);
            interfaceC1586f0.d(0.0f, oVar.e().f());
        }
        interfaceC1586f0.x();
    }

    public final void E(InterfaceC1586f0 interfaceC1586f0, AbstractC1582d0 abstractC1582d0, float f8, R0 r8, p216z1.k kVar, g gVar, int i8) {
        p192w1.b.a(this, interfaceC1586f0, abstractC1582d0, f8, r8, kVar, gVar, i8);
    }

    public final void G(int i8) {
        if (i8 < 0 || i8 >= b().i().length()) {
            throw new IllegalArgumentException(("offset(" + i8 + ") is out of bounds [0, " + b().length() + ')').toString());
        }
    }

    public final void H(int i8) {
        if (i8 < 0 || i8 > b().i().length()) {
            throw new IllegalArgumentException(("offset(" + i8 + ") is out of bounds [0, " + b().length() + ']').toString());
        }
    }

    public final void I(int i8) {
        if (i8 < 0 || i8 >= this.f30812f) {
            throw new IllegalArgumentException(("lineIndex(" + i8 + ") is out of bounds [0, " + this.f30812f + ')').toString());
        }
    }

    public final float[] a(long j8, float[] fArr, int i8) {
        G(G.l(j8));
        H(G.k(j8));
        H h8 = new H();
        h8.f28777a = i8;
        AbstractC2747l.d(this.f30814h, j8, new a(j8, fArr, h8, new G()));
        return fArr;
    }

    public final C2739d b() {
        return this.f30807a.d();
    }

    public final i c(int i8) {
        H(i8);
        o oVar = (o) this.f30814h.get(i8 == b().length() ? r.p(this.f30814h) : AbstractC2747l.a(this.f30814h, i8));
        return oVar.e().q(oVar.p(i8));
    }

    public final h d(int i8) {
        G(i8);
        o oVar = (o) this.f30814h.get(AbstractC2747l.a(this.f30814h, i8));
        return oVar.i(oVar.e().s(oVar.p(i8)));
    }

    public final h e(int i8) {
        H(i8);
        o oVar = (o) this.f30814h.get(i8 == b().length() ? r.p(this.f30814h) : AbstractC2747l.a(this.f30814h, i8));
        return oVar.i(oVar.e().m(oVar.p(i8)));
    }

    public final boolean f() {
        return this.f30809c;
    }

    public final float g() {
        if (this.f30814h.isEmpty()) {
            return 0.0f;
        }
        return ((o) this.f30814h.get(0)).e().p();
    }

    public final float h() {
        return this.f30811e;
    }

    public final float i(int i8, boolean z8) {
        H(i8);
        o oVar = (o) this.f30814h.get(i8 == b().length() ? r.p(this.f30814h) : AbstractC2747l.a(this.f30814h, i8));
        return oVar.e().D(oVar.p(i8), z8);
    }

    public final C2745j j() {
        return this.f30807a;
    }

    public final float k() {
        if (this.f30814h.isEmpty()) {
            return 0.0f;
        }
        o oVar = (o) z.t0(this.f30814h);
        return oVar.n(oVar.e().l());
    }

    public final float l(int i8) {
        I(i8);
        o oVar = (o) this.f30814h.get(AbstractC2747l.b(this.f30814h, i8));
        return oVar.n(oVar.e().b(oVar.q(i8)));
    }

    public final int m() {
        return this.f30812f;
    }

    public final int n(int i8, boolean z8) {
        I(i8);
        o oVar = (o) this.f30814h.get(AbstractC2747l.b(this.f30814h, i8));
        return oVar.l(oVar.e().w(oVar.q(i8), z8));
    }

    public final int o(int i8) {
        int iA;
        if (i8 >= b().length()) {
            iA = r.p(this.f30814h);
        } else {
            iA = i8 < 0 ? 0 : AbstractC2747l.a(this.f30814h, i8);
        }
        o oVar = (o) this.f30814h.get(iA);
        return oVar.m(oVar.e().o(oVar.p(i8)));
    }

    public final int p(float f8) {
        int iP;
        if (f8 <= 0.0f) {
            iP = 0;
        } else {
            iP = f8 >= this.f30811e ? r.p(this.f30814h) : AbstractC2747l.c(this.f30814h, f8);
        }
        o oVar = (o) this.f30814h.get(iP);
        return oVar.d() == 0 ? oVar.g() : oVar.m(oVar.e().A(oVar.r(f8)));
    }

    public final float q(int i8) {
        I(i8);
        o oVar = (o) this.f30814h.get(AbstractC2747l.b(this.f30814h, i8));
        return oVar.e().E(oVar.q(i8));
    }

    public final float r(int i8) {
        I(i8);
        o oVar = (o) this.f30814h.get(AbstractC2747l.b(this.f30814h, i8));
        return oVar.e().x(oVar.q(i8));
    }

    public final int s(int i8) {
        I(i8);
        o oVar = (o) this.f30814h.get(AbstractC2747l.b(this.f30814h, i8));
        return oVar.l(oVar.e().d(oVar.q(i8)));
    }

    public final float t(int i8) {
        I(i8);
        o oVar = (o) this.f30814h.get(AbstractC2747l.b(this.f30814h, i8));
        return oVar.n(oVar.e().a(oVar.q(i8)));
    }

    public final int u(long j8) {
        int iP;
        if (Q0.f.p(j8) <= 0.0f) {
            iP = 0;
        } else {
            iP = Q0.f.p(j8) >= this.f30811e ? r.p(this.f30814h) : AbstractC2747l.c(this.f30814h, Q0.f.p(j8));
        }
        o oVar = (o) this.f30814h.get(iP);
        return oVar.d() == 0 ? oVar.f() : oVar.l(oVar.e().r(oVar.o(j8)));
    }

    public final i v(int i8) {
        H(i8);
        o oVar = (o) this.f30814h.get(i8 == b().length() ? r.p(this.f30814h) : AbstractC2747l.a(this.f30814h, i8));
        return oVar.e().k(oVar.p(i8));
    }

    public final List w() {
        return this.f30814h;
    }

    public final H0 x(int i8, int i9) {
        if (i8 >= 0 && i8 <= i9 && i9 <= b().i().length()) {
            if (i8 == i9) {
                return T.a();
            }
            H0 h0A = T.a();
            AbstractC2747l.d(this.f30814h, H.b(i8, i9), new b(h0A, i8, i9));
            return h0A;
        }
        throw new IllegalArgumentException(("Start(" + i8 + ") or End(" + i9 + ") is out of range [0.." + b().i().length() + "), or start > end!").toString());
    }

    public final List y() {
        return this.f30813g;
    }

    public final float z() {
        return this.f30810d;
    }

    public /* synthetic */ C2744i(C2745j c2745j, long j8, int i8, boolean z8, AbstractC2633k abstractC2633k) {
        this(c2745j, j8, i8, z8);
    }

    public C2744i(C2745j c2745j, long j8, int i8, boolean z8) {
        boolean z9;
        int iM;
        this.f30807a = c2745j;
        this.f30808b = i8;
        if (A1.b.p(j8) == 0 && A1.b.o(j8) == 0) {
            ArrayList arrayList = new ArrayList();
            List listE = c2745j.e();
            int size = listE.size();
            int i9 = 0;
            float f8 = 0.0f;
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z9 = false;
                    break;
                }
                p pVar = (p) listE.get(i10);
                q qVarB = pVar.b();
                int iN = A1.b.n(j8);
                if (A1.b.i(j8)) {
                    iM = n.d(A1.b.m(j8) - s.d(f8), 0);
                } else {
                    iM = A1.b.m(j8);
                }
                n nVarC = s.c(qVarB, c.b(0, iN, 0, iM, 5, null), this.f30808b - i9, z8);
                float f9 = f8 + nVarC.f();
                int iE = i9 + nVarC.e();
                arrayList.add(new o(nVarC, pVar.c(), pVar.a(), i9, iE, f8, f9));
                if (nVarC.z() || (iE == this.f30808b && i10 != r.p(this.f30807a.e()))) {
                    z9 = true;
                    i9 = iE;
                    f8 = f9;
                    break;
                } else {
                    i10++;
                    i9 = iE;
                    f8 = f9;
                }
            }
            this.f30811e = f8;
            this.f30812f = i9;
            this.f30809c = z9;
            this.f30814h = arrayList;
            this.f30810d = A1.b.n(j8);
            List arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                o oVar = (o) arrayList.get(i11);
                List listT = oVar.e().t();
                ArrayList arrayList3 = new ArrayList(listT.size());
                int size3 = listT.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    h hVar = (h) listT.get(i12);
                    arrayList3.add(hVar != null ? oVar.i(hVar) : null);
                }
                w.E(arrayList2, arrayList3);
            }
            if (arrayList2.size() < this.f30807a.f().size()) {
                int size4 = this.f30807a.f().size() - arrayList2.size();
                ArrayList arrayList4 = new ArrayList(size4);
                for (int i13 = 0; i13 < size4; i13++) {
                    arrayList4.add(null);
                }
                arrayList2 = z.B0(arrayList2, arrayList4);
            }
            this.f30813g = arrayList2;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
    }

    public /* synthetic */ C2744i(C2745j c2745j, long j8, int i8, boolean z8, int i9, AbstractC2633k abstractC2633k) {
        this(c2745j, j8, (i9 & 4) != 0 ? Integer.MAX_VALUE : i8, (i9 & 8) != 0 ? false : z8, null);
    }

    public /* synthetic */ C2744i(C2745j c2745j, int i8, boolean z8, float f8, int i9, AbstractC2633k abstractC2633k) {
        this(c2745j, (i9 & 2) != 0 ? Integer.MAX_VALUE : i8, (i9 & 4) != 0 ? false : z8, f8);
    }

    @InterfaceC0916e
    public C2744i(C2745j c2745j, int i8, boolean z8, float f8) {
        this(c2745j, c.b(0, s.d(f8), 0, 0, 13, null), i8, z8, null);
    }

    public /* synthetic */ C2744i(C2739d c2739d, I i8, List list, int i9, boolean z8, float f8, d dVar, InterfaceC3008m.a aVar, int i10, AbstractC2633k abstractC2633k) {
        this(c2739d, i8, (List<C2739d.b>) ((i10 & 4) != 0 ? r.n() : list), (i10 & 8) != 0 ? Integer.MAX_VALUE : i9, (i10 & 16) != 0 ? false : z8, f8, dVar, aVar);
    }

    @InterfaceC0916e
    public C2744i(C2739d c2739d, I i8, List<C2739d.b> list, int i9, boolean z8, float f8, d dVar, InterfaceC3008m.a aVar) {
        this(new C2745j(c2739d, i8, list, dVar, AbstractC3006k.a(aVar)), c.b(0, s.d(f8), 0, 0, 13, null), i9, z8, null);
    }

    public /* synthetic */ C2744i(C2739d c2739d, I i8, float f8, d dVar, AbstractC3009n.b bVar, List list, int i9, boolean z8, int i10, AbstractC2633k abstractC2633k) {
        this(c2739d, i8, f8, dVar, bVar, (List<C2739d.b>) ((i10 & 32) != 0 ? r.n() : list), (i10 & 64) != 0 ? Integer.MAX_VALUE : i9, (i10 & 128) != 0 ? false : z8);
    }

    @InterfaceC0916e
    public C2744i(C2739d c2739d, I i8, float f8, d dVar, AbstractC3009n.b bVar, List<C2739d.b> list, int i9, boolean z8) {
        this(new C2745j(c2739d, i8, list, dVar, bVar), c.b(0, s.d(f8), 0, 0, 13, null), i9, z8, null);
    }

    public /* synthetic */ C2744i(C2739d c2739d, I i8, long j8, d dVar, AbstractC3009n.b bVar, List list, int i9, boolean z8, int i10, AbstractC2633k abstractC2633k) {
        this(c2739d, i8, j8, dVar, bVar, (i10 & 32) != 0 ? r.n() : list, (i10 & 64) != 0 ? Integer.MAX_VALUE : i9, (i10 & 128) != 0 ? false : z8, null);
    }

    public C2744i(C2739d c2739d, I i8, long j8, d dVar, AbstractC3009n.b bVar, List list, int i9, boolean z8) {
        this(new C2745j(c2739d, i8, (List<C2739d.b>) list, dVar, bVar), j8, i9, z8, null);
    }
}
