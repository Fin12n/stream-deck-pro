package p091k0;

import A1.n;
import A1.o;
import L0.c;
import Q6.k;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import p038e1.a0;
import p109m0.AbstractC2669g;
import p109m0.C2668f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class t implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f28503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f28504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.b f28505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.InterfaceC0174c f28506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final A1.t f28507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f28508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f28509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f28510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f28511j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f28512k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f28513l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f28514m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f28515n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f28516o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f28517p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f28518q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f28519r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f28520s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f28521t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f28522u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f28523v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f28524w;

    public /* synthetic */ t(int i8, List list, boolean z8, c.b bVar, c.InterfaceC0174c interfaceC0174c, A1.t tVar, boolean z9, int i9, int i10, int i11, long j8, Object obj, Object obj2, j jVar, AbstractC2633k abstractC2633k) {
        this(i8, list, z8, bVar, interfaceC0174c, tVar, z9, i9, i10, i11, j8, obj, obj2, jVar);
    }

    public final void a(int i8, boolean z8) {
        if (this.f28520s) {
            return;
        }
        this.f28516o = getOffset() + i8;
        int length = this.f28524w.length;
        for (int i9 = 0; i9 < length; i9++) {
            boolean z9 = this.f28504c;
            if ((z9 && i9 % 2 == 1) || (!z9 && i9 % 2 == 0)) {
                int[] iArr = this.f28524w;
                iArr[i9] = iArr[i9] + i8;
            }
        }
        if (z8) {
            int i10 = i();
            for (int i11 = 0; i11 < i10; i11++) {
                C2668f c2668fA = this.f28515n.a(c(), i11);
                if (c2668fA != null) {
                    long jN = c2668fA.n();
                    int iJ = this.f28504c ? n.j(jN) : Integer.valueOf(n.j(jN) + i8).intValue();
                    boolean z10 = this.f28504c;
                    int iK = n.k(jN);
                    if (z10) {
                        iK += i8;
                    }
                    c2668fA.x(o.a(iJ, iK));
                }
            }
        }
    }

    public final int b() {
        return this.f28519r;
    }

    public Object c() {
        return this.f28513l;
    }

    public final int d(long j8) {
        return this.f28504c ? n.k(j8) : n.j(j8);
    }

    public final int e(a0 a0Var) {
        return this.f28504c ? a0Var.h0() : a0Var.y0();
    }

    public final boolean f() {
        return this.f28520s;
    }

    public final long g(int i8) {
        int[] iArr = this.f28524w;
        int i9 = i8 * 2;
        return o.a(iArr[i9], iArr[i9 + 1]);
    }

    @Override // p091k0.l
    public int getIndex() {
        return this.f28502a;
    }

    @Override // p091k0.l
    public int getOffset() {
        return this.f28516o;
    }

    public final Object h(int i8) {
        return ((a0) this.f28503b.get(i8)).e();
    }

    public final int i() {
        return this.f28503b.size();
    }

    public final int j() {
        return this.f28518q;
    }

    @Override // p091k0.l
    public int k() {
        return this.f28517p;
    }

    public final boolean l() {
        return this.f28504c;
    }

    public final void m(a0.a aVar, boolean z8) {
        k kVarB;
        a0.a aVar2;
        int iJ;
        int iK;
        if (this.f28521t == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int i8 = i();
        int i9 = 0;
        while (i9 < i8) {
            a0 a0Var = (a0) this.f28503b.get(i9);
            int iE = this.f28522u - e(a0Var);
            int i10 = this.f28523v;
            long jG = g(i9);
            C2668f c2668fA = this.f28515n.a(c(), i9);
            if (c2668fA != null) {
                if (z8) {
                    c2668fA.t(jG);
                } else {
                    if (!n.i(c2668fA.l(), C2668f.f29376m.a())) {
                        jG = c2668fA.l();
                    }
                    long jM = c2668fA.m();
                    long jA = o.a(n.j(jG) + n.j(jM), n.k(jG) + n.k(jM));
                    if ((d(jG) <= iE && d(jA) <= iE) || (d(jG) >= i10 && d(jA) >= i10)) {
                        c2668fA.j();
                    }
                    jG = jA;
                }
                kVarB = c2668fA.k();
            } else {
                kVarB = AbstractC2669g.b();
            }
            k kVar = kVarB;
            if (this.f28508g) {
                if (this.f28504c) {
                    iJ = n.j(jG);
                } else {
                    iJ = (this.f28521t - n.j(jG)) - e(a0Var);
                }
                if (this.f28504c) {
                    iK = (this.f28521t - n.k(jG)) - e(a0Var);
                } else {
                    iK = n.k(jG);
                }
                jG = o.a(iJ, iK);
            }
            long j8 = this.f28512k;
            long jA2 = o.a(n.j(jG) + n.j(j8), n.k(jG) + n.k(j8));
            if (this.f28504c) {
                aVar2 = aVar;
                a0.a.t(aVar2, a0Var, jA2, 0.0f, kVar, 2, null);
            } else {
                aVar2 = aVar;
                a0.a.p(aVar2, a0Var, jA2, 0.0f, kVar, 2, null);
            }
            i9++;
            aVar = aVar2;
        }
    }

    public final void n(int i8, int i9, int i10) {
        int iY0;
        this.f28516o = i8;
        this.f28521t = this.f28504c ? i10 : i9;
        List list = this.f28503b;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            a0 a0Var = (a0) list.get(i11);
            int i12 = i11 * 2;
            if (this.f28504c) {
                int[] iArr = this.f28524w;
                c.b bVar = this.f28505d;
                if (bVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true");
                }
                iArr[i12] = bVar.a(a0Var.y0(), i9, this.f28507f);
                this.f28524w[i12 + 1] = i8;
                iY0 = a0Var.h0();
            } else {
                int[] iArr2 = this.f28524w;
                iArr2[i12] = i8;
                int i13 = i12 + 1;
                c.InterfaceC0174c interfaceC0174c = this.f28506e;
                if (interfaceC0174c == null) {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false");
                }
                iArr2[i13] = interfaceC0174c.a(a0Var.h0(), i10);
                iY0 = a0Var.y0();
            }
            i8 += iY0;
        }
        this.f28522u = -this.f28509h;
        this.f28523v = this.f28521t + this.f28510i;
    }

    public final void o(boolean z8) {
        this.f28520s = z8;
    }

    public t(int i8, List list, boolean z8, c.b bVar, c.InterfaceC0174c interfaceC0174c, A1.t tVar, boolean z9, int i9, int i10, int i11, long j8, Object obj, Object obj2, j jVar) {
        this.f28502a = i8;
        this.f28503b = list;
        this.f28504c = z8;
        this.f28505d = bVar;
        this.f28506e = interfaceC0174c;
        this.f28507f = tVar;
        this.f28508g = z9;
        this.f28509h = i9;
        this.f28510i = i10;
        this.f28511j = i11;
        this.f28512k = j8;
        this.f28513l = obj;
        this.f28514m = obj2;
        this.f28515n = jVar;
        this.f28521t = Integer.MIN_VALUE;
        int size = list.size();
        int iH0 = 0;
        int iMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            a0 a0Var = (a0) list.get(i12);
            iH0 += this.f28504c ? a0Var.h0() : a0Var.y0();
            iMax = Math.max(iMax, !this.f28504c ? a0Var.h0() : a0Var.y0());
        }
        this.f28517p = iH0;
        this.f28518q = W6.n.d(k() + this.f28511j, 0);
        this.f28519r = iMax;
        this.f28524w = new int[this.f28503b.size() * 2];
    }
}
