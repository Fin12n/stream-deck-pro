package V0;

import C6.G;
import R0.AbstractC1582d0;
import R0.B0;
import R0.C1598l0;
import R0.H0;
import R0.T;
import R0.U0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f10270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f10271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f10274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public H0 f10276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Q6.k f10277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Q6.k f10278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f10279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f10280l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f10281m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f10282n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f10283o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f10284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f10285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f10286r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f10287s;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.k {
        public a() {
            super(1);
        }

        public final void b(l lVar) {
            c.this.n(lVar);
            Q6.k kVarB = c.this.b();
            if (kVarB != null) {
                kVarB.invoke(lVar);
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((l) obj);
            return G.f1419a;
        }
    }

    public c() {
        super(null);
        this.f10271c = new ArrayList();
        this.f10272d = true;
        this.f10273e = C1598l0.f9405b.e();
        this.f10274f = o.e();
        this.f10275g = true;
        this.f10278j = new a();
        this.f10279k = "";
        this.f10283o = 1.0f;
        this.f10284p = 1.0f;
        this.f10287s = true;
    }

    @Override // V0.l
    public void a(T0.f fVar) {
        if (this.f10287s) {
            y();
            this.f10287s = false;
        }
        if (this.f10275g) {
            x();
            this.f10275g = false;
        }
        T0.d dVarK0 = fVar.K0();
        long jD = dVarK0.d();
        dVarK0.c().k();
        T0.h hVarA = dVarK0.a();
        float[] fArr = this.f10270b;
        if (fArr != null) {
            hVarA.a(B0.a(fArr).o());
        }
        H0 h8 = this.f10276h;
        if (h() && h8 != null) {
            T0.h.e(hVarA, h8, 0, 2, null);
        }
        List list = this.f10271c;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((l) list.get(i8)).a(fVar);
        }
        dVarK0.c().x();
        dVarK0.b(jD);
    }

    @Override // V0.l
    public Q6.k b() {
        return this.f10277i;
    }

    @Override // V0.l
    public void d(Q6.k kVar) {
        this.f10277i = kVar;
    }

    public final int f() {
        return this.f10271c.size();
    }

    public final long g() {
        return this.f10273e;
    }

    public final boolean h() {
        return !this.f10274f.isEmpty();
    }

    public final void i(int i8, l lVar) {
        if (i8 < f()) {
            this.f10271c.set(i8, lVar);
        } else {
            this.f10271c.add(lVar);
        }
        n(lVar);
        lVar.d(this.f10278j);
        c();
    }

    public final boolean j() {
        return this.f10272d;
    }

    public final void k() {
        this.f10272d = false;
        this.f10273e = C1598l0.f9405b.e();
    }

    public final void l(AbstractC1582d0 abstractC1582d0) {
        if (this.f10272d && abstractC1582d0 != null) {
            if (abstractC1582d0 instanceof U0) {
                m(((U0) abstractC1582d0).b());
            } else {
                k();
            }
        }
    }

    public final void m(long j8) {
        if (this.f10272d) {
            C1598l0.a aVar = C1598l0.f9405b;
            if (j8 != aVar.e()) {
                if (this.f10273e == aVar.e()) {
                    this.f10273e = j8;
                } else {
                    if (o.f(this.f10273e, j8)) {
                        return;
                    }
                    k();
                }
            }
        }
    }

    public final void n(l lVar) {
        if (lVar instanceof g) {
            g gVar = (g) lVar;
            l(gVar.e());
            l(gVar.g());
        } else if (lVar instanceof c) {
            c cVar = (c) lVar;
            if (cVar.f10272d && this.f10272d) {
                m(cVar.f10273e);
            } else {
                k();
            }
        }
    }

    public final void o(List list) {
        this.f10274f = list;
        this.f10275g = true;
        c();
    }

    public final void p(String str) {
        this.f10279k = str;
        c();
    }

    public final void q(float f8) {
        this.f10281m = f8;
        this.f10287s = true;
        c();
    }

    public final void r(float f8) {
        this.f10282n = f8;
        this.f10287s = true;
        c();
    }

    public final void s(float f8) {
        this.f10280l = f8;
        this.f10287s = true;
        c();
    }

    public final void t(float f8) {
        this.f10283o = f8;
        this.f10287s = true;
        c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VGroup: ");
        sb.append(this.f10279k);
        List list = this.f10271c;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            l lVar = (l) list.get(i8);
            sb.append("\t");
            sb.append(lVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public final void u(float f8) {
        this.f10284p = f8;
        this.f10287s = true;
        c();
    }

    public final void v(float f8) {
        this.f10285q = f8;
        this.f10287s = true;
        c();
    }

    public final void w(float f8) {
        this.f10286r = f8;
        this.f10287s = true;
        c();
    }

    public final void x() {
        if (h()) {
            H0 h0A = this.f10276h;
            if (h0A == null) {
                h0A = T.a();
                this.f10276h = h0A;
            }
            k.c(this.f10274f, h0A);
        }
    }

    public final void y() {
        float[] fArrC = this.f10270b;
        if (fArrC == null) {
            fArrC = B0.c(null, 1, null);
            this.f10270b = fArrC;
        } else {
            B0.h(fArrC);
        }
        float[] fArr = fArrC;
        B0.n(fArr, this.f10281m + this.f10285q, this.f10282n + this.f10286r, 0.0f, 4, null);
        B0.i(fArr, this.f10280l);
        B0.j(fArr, this.f10283o, this.f10284p, 1.0f);
        B0.n(fArr, -this.f10281m, -this.f10282n, 0.0f, 4, null);
    }
}
