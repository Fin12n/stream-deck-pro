package p011b1;

import B0.d;
import L0.i;
import Q0.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;
import p010b0.m;
import p020c1.b;
import p038e1.InterfaceC2247s;
import p056g1.AbstractC2347k;
import p056g1.AbstractC2348l;
import p056g1.Z;
import p056g1.m0;
import p056g1.n0;

/* JADX INFO: renamed from: b1.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1763k extends C1764l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i.c f15754c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC2247s f15757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1766n f15758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15759h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f15755d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f15756e = new m(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15760i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15761j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f15762k = new d(new Long[16], 0);

    public C1763k(i.c cVar) {
        this.f15754c = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0204  */
    /* JADX WARN: Code duplicated, block: B:93:0x0224  */
    /* JADX WARN: Code duplicated, block: B:95:0x0232  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r5v2, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v3, types: [L0.i$c] */
    @Override // p011b1.C1764l
    public boolean a(m mVar, InterfaceC2247s interfaceC2247s, C1760h c1760h, boolean z8) {
        int i8;
        Object obj;
        boolean z9;
        int iF;
        r.a aVar;
        boolean zA = super.a(mVar, interfaceC2247s, c1760h, z8);
        boolean z10 = true;
        if (!this.f15754c.K1()) {
            return true;
        }
        ?? G8 = this.f15754c;
        int iA = Z.a(16);
        ?? dVar = 0;
        while (true) {
            i8 = 0;
            if (G8 == 0) {
                break;
            }
            if (G8 instanceof m0) {
                this.f15757f = n0.a((m0) G8);
            } else if ((G8.F1() & iA) != 0 && (G8 instanceof AbstractC2348l)) {
                i.c cVarE2 = ((AbstractC2348l) G8).e2();
                int i9 = 0;
                while (cVarE2 != null) {
                    if ((cVarE2.F1() & iA) != 0) {
                        i9++;
                        if (i9 == 1) {
                            G8 = G8;
                            dVar = dVar;
                            dVar = dVar;
                            G8 = cVarE2;
                        } else {
                            if (dVar == 0) {
                                dVar = new d(new i.c[16], 0);
                            }
                            if (G8 != 0) {
                                dVar.d(G8);
                                G8 = 0;
                            }
                            dVar.d(cVarE2);
                        }
                    } else {
                        G8 = G8;
                        dVar = dVar;
                    }
                    cVarE2 = cVarE2.B1();
                    G8 = G8;
                    dVar = dVar;
                }
                if (i9 == 1) {
                    G8 = G8;
                    dVar = dVar;
                } else {
                    G8 = G8;
                    dVar = dVar;
                }
            }
            G8 = AbstractC2347k.g(dVar);
        }
        int iL = mVar.l();
        int i10 = 0;
        while (i10 < iL) {
            long jH = mVar.h(i10);
            z zVar = (z) mVar.m(i10);
            if (this.f15755d.d(jH)) {
                ArrayList arrayList = new ArrayList(zVar.f().size());
                List listF = zVar.f();
                int size = listF.size();
                int i11 = i8;
                while (i11 < size) {
                    C1758f c1758f = (C1758f) listF.get(i11);
                    long jC = c1758f.c();
                    InterfaceC2247s interfaceC2247s2 = this.f15757f;
                    t.d(interfaceC2247s2);
                    arrayList.add(new C1758f(jC, interfaceC2247s2.o(interfaceC2247s, c1758f.b()), c1758f.a(), null));
                    i11++;
                    jH = jH;
                }
                m mVar2 = this.f15756e;
                InterfaceC2247s interfaceC2247s3 = this.f15757f;
                t.d(interfaceC2247s3);
                long jO = interfaceC2247s3.o(interfaceC2247s, zVar.l());
                InterfaceC2247s interfaceC2247s4 = this.f15757f;
                t.d(interfaceC2247s4);
                mVar2.i(jH, z.e(zVar, 0L, 0L, interfaceC2247s4.o(interfaceC2247s, zVar.i()), false, 0L, jO, false, 0, arrayList, 0L, 731, null));
            }
            i10++;
            z10 = z10;
            i8 = 0;
        }
        boolean z11 = z10;
        if (this.f15756e.g()) {
            this.f15755d.c();
            g().m();
            return z11;
        }
        int iF2 = this.f15755d.f();
        while (true) {
            iF2--;
            if (-1 >= iF2) {
                break;
            }
            if (!mVar.d(this.f15755d.e(iF2))) {
                this.f15755d.j(iF2);
            }
        }
        ArrayList arrayList2 = new ArrayList(this.f15756e.l());
        int iL2 = this.f15756e.l();
        for (int i12 = 0; i12 < iL2; i12++) {
            arrayList2.add(this.f15756e.m(i12));
        }
        C1766n c1766n = new C1766n(arrayList2, c1760h);
        List listC = c1766n.c();
        int size2 = listC.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                obj = null;
                break;
            }
            Object obj2 = listC.get(i13);
            if (c1760h.d(((z) obj2).g())) {
                obj = obj2;
                break;
            }
            i13++;
        }
        z zVar2 = (z) obj;
        if (zVar2 != null) {
            if (z8) {
                z9 = false;
                if (!this.f15760i && (zVar2.j() || zVar2.m())) {
                    InterfaceC2247s interfaceC2247s5 = this.f15757f;
                    t.d(interfaceC2247s5);
                    this.f15760i = !AbstractC1767o.e(zVar2, interfaceC2247s5.a());
                }
            } else {
                z9 = false;
                this.f15760i = false;
            }
            if (this.f15760i != this.f15759h) {
                int iF3 = c1766n.f();
                r.a aVar2 = r.f15774a;
                if (r.i(iF3, aVar2.c()) || r.i(c1766n.f(), aVar2.a()) || r.i(c1766n.f(), aVar2.b())) {
                    c1766n.g(this.f15760i ? aVar2.a() : aVar2.b());
                } else {
                    iF = c1766n.f();
                    aVar = r.f15774a;
                    if (!r.i(iF, aVar.a()) && this.f15759h && !this.f15761j) {
                        c1766n.g(aVar.c());
                    } else if (r.i(c1766n.f(), aVar.b()) && this.f15760i && zVar2.j()) {
                        c1766n.g(aVar.c());
                    }
                }
            } else {
                iF = c1766n.f();
                aVar = r.f15774a;
                if (!r.i(iF, aVar.a())) {
                    if (r.i(c1766n.f(), aVar.b())) {
                        c1766n.g(aVar.c());
                    }
                } else if (r.i(c1766n.f(), aVar.b())) {
                    c1766n.g(aVar.c());
                }
            }
        } else {
            z9 = false;
        }
        boolean z12 = (zA || !r.i(c1766n.f(), r.f15774a.c()) || l(this.f15758g, c1766n)) ? z11 : z9;
        this.f15758g = c1766n;
        return z12;
    }

    @Override // p011b1.C1764l
    public void b(C1760h c1760h) {
        super.b(c1760h);
        C1766n c1766n = this.f15758g;
        if (c1766n == null) {
            return;
        }
        this.f15759h = this.f15760i;
        List listC = c1766n.c();
        int size = listC.size();
        for (int i8 = 0; i8 < size; i8++) {
            z zVar = (z) listC.get(i8);
            if (!zVar.j() && (!c1760h.d(zVar.g()) || !this.f15760i)) {
                this.f15755d.i(zVar.g());
            }
        }
        this.f15760i = false;
        this.f15761j = r.i(c1766n.f(), r.f15774a.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Override // p011b1.C1764l
    public void d() {
        d dVarG = g();
        int iS = dVarG.s();
        if (iS > 0) {
            Object[] objArrR = dVarG.r();
            int i8 = 0;
            do {
                ((C1763k) objArrR[i8]).d();
                i8++;
            } while (i8 < iS);
        }
        ?? G8 = this.f15754c;
        int iA = Z.a(16);
        ?? dVar = 0;
        while (G8 != 0) {
            if (G8 instanceof m0) {
                ((m0) G8).f0();
            } else if ((G8.F1() & iA) != 0 && (G8 instanceof AbstractC2348l)) {
                i.c cVarE2 = ((AbstractC2348l) G8).e2();
                int i9 = 0;
                while (cVarE2 != null) {
                    if ((cVarE2.F1() & iA) != 0) {
                        i9++;
                        if (i9 == 1) {
                            G8 = G8;
                            dVar = dVar;
                            dVar = dVar;
                            G8 = cVarE2;
                        } else {
                            if (dVar == 0) {
                                dVar = new d(new i.c[16], 0);
                            }
                            if (G8 != 0) {
                                dVar.d(G8);
                                G8 = 0;
                            }
                            dVar.d(cVarE2);
                        }
                    } else {
                        G8 = G8;
                        dVar = dVar;
                    }
                    cVarE2 = cVarE2.B1();
                    G8 = G8;
                    dVar = dVar;
                }
                if (i9 == 1) {
                    G8 = G8;
                    dVar = dVar;
                } else {
                    G8 = G8;
                    dVar = dVar;
                }
            }
            G8 = AbstractC2347k.g(dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r4v0, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // p011b1.C1764l
    public boolean e(C1760h c1760h) {
        d dVarG;
        int iS;
        boolean z8 = false;
        int i8 = 0;
        z8 = false;
        if (!this.f15756e.g() && this.f15754c.K1()) {
            C1766n c1766n = this.f15758g;
            t.d(c1766n);
            InterfaceC2247s interfaceC2247s = this.f15757f;
            t.d(interfaceC2247s);
            long jA = interfaceC2247s.a();
            ?? G8 = this.f15754c;
            int iA = Z.a(16);
            ?? dVar = 0;
            while (G8 != 0) {
                if (G8 instanceof m0) {
                    ((m0) G8).y0(c1766n, EnumC1768p.Final, jA);
                } else if ((G8.F1() & iA) != 0 && (G8 instanceof AbstractC2348l)) {
                    i.c cVarE2 = ((AbstractC2348l) G8).e2();
                    int i9 = 0;
                    while (cVarE2 != null) {
                        if ((cVarE2.F1() & iA) != 0) {
                            i9++;
                            if (i9 == 1) {
                                G8 = G8;
                                dVar = dVar;
                                dVar = dVar;
                                G8 = cVarE2;
                            } else {
                                if (dVar == 0) {
                                    dVar = new d(new i.c[16], 0);
                                }
                                if (G8 != 0) {
                                    dVar.d(G8);
                                    G8 = 0;
                                }
                                dVar.d(cVarE2);
                            }
                        } else {
                            G8 = G8;
                            dVar = dVar;
                        }
                        cVarE2 = cVarE2.B1();
                        G8 = G8;
                        dVar = dVar;
                    }
                    if (i9 == 1) {
                        G8 = G8;
                        dVar = dVar;
                    } else {
                        G8 = G8;
                        dVar = dVar;
                    }
                }
                G8 = AbstractC2347k.g(dVar);
            }
            if (this.f15754c.K1() && (iS = (dVarG = g()).s()) > 0) {
                Object[] objArrR = dVarG.r();
                do {
                    ((C1763k) objArrR[i8]).e(c1760h);
                    i8++;
                } while (i8 < iS);
            }
            z8 = true;
        }
        b(c1760h);
        i();
        return z8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v3, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r14v4, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r2v1, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r2v10, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [B0.d] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // p011b1.C1764l
    public boolean f(m mVar, InterfaceC2247s interfaceC2247s, C1760h c1760h, boolean z8) {
        d dVarG;
        int iS;
        if (this.f15756e.g() || !this.f15754c.K1()) {
            return false;
        }
        C1766n c1766n = this.f15758g;
        t.d(c1766n);
        InterfaceC2247s interfaceC2247s2 = this.f15757f;
        t.d(interfaceC2247s2);
        long jA = interfaceC2247s2.a();
        ?? G8 = this.f15754c;
        int iA = Z.a(16);
        ?? dVar = 0;
        while (G8 != 0) {
            if (G8 instanceof m0) {
                ((m0) G8).y0(c1766n, EnumC1768p.Initial, jA);
            } else if ((G8.F1() & iA) != 0 && (G8 instanceof AbstractC2348l)) {
                i.c cVarE2 = ((AbstractC2348l) G8).e2();
                int i8 = 0;
                while (cVarE2 != null) {
                    if ((cVarE2.F1() & iA) != 0) {
                        i8++;
                        if (i8 == 1) {
                            G8 = G8;
                            dVar = dVar;
                            dVar = dVar;
                            G8 = cVarE2;
                        } else {
                            if (dVar == 0) {
                                dVar = new d(new i.c[16], 0);
                            }
                            if (G8 != 0) {
                                dVar.d(G8);
                                G8 = 0;
                            }
                            dVar.d(cVarE2);
                        }
                    } else {
                        G8 = G8;
                        dVar = dVar;
                    }
                    cVarE2 = cVarE2.B1();
                    G8 = G8;
                    dVar = dVar;
                }
                if (i8 == 1) {
                    G8 = G8;
                    dVar = dVar;
                } else {
                    G8 = G8;
                    dVar = dVar;
                }
            }
            G8 = AbstractC2347k.g(dVar);
        }
        if (this.f15754c.K1() && (iS = (dVarG = g()).s()) > 0) {
            Object[] objArrR = dVarG.r();
            int i9 = 0;
            do {
                C1763k c1763k = (C1763k) objArrR[i9];
                m mVar2 = this.f15756e;
                InterfaceC2247s interfaceC2247s3 = this.f15757f;
                t.d(interfaceC2247s3);
                c1763k.f(mVar2, interfaceC2247s3, c1760h, z8);
                i9++;
            } while (i9 < iS);
        }
        if (this.f15754c.K1()) {
            ?? G9 = this.f15754c;
            int iA2 = Z.a(16);
            ?? dVar2 = 0;
            while (G9 != 0) {
                if (G9 instanceof m0) {
                    ((m0) G9).y0(c1766n, EnumC1768p.Main, jA);
                } else if ((G9.F1() & iA2) != 0 && (G9 instanceof AbstractC2348l)) {
                    i.c cVarE3 = ((AbstractC2348l) G9).e2();
                    int i10 = 0;
                    while (cVarE3 != null) {
                        if ((cVarE3.F1() & iA2) != 0) {
                            i10++;
                            if (i10 == 1) {
                                dVar2 = dVar2;
                                G9 = G9;
                                dVar2 = dVar2;
                                G9 = cVarE3;
                            } else {
                                if (dVar2 == 0) {
                                    dVar2 = new d(new i.c[16], 0);
                                }
                                if (G9 != 0) {
                                    dVar2.d(G9);
                                    G9 = 0;
                                }
                                dVar2.d(cVarE3);
                            }
                        } else {
                            dVar2 = dVar2;
                            G9 = G9;
                        }
                        cVarE3 = cVarE3.B1();
                        dVar2 = dVar2;
                        G9 = G9;
                    }
                    if (i10 == 1) {
                        dVar2 = dVar2;
                        G9 = G9;
                    } else {
                        dVar2 = dVar2;
                        G9 = G9;
                    }
                }
                G9 = AbstractC2347k.g(dVar2);
            }
        }
        return true;
    }

    public final void i() {
        this.f15756e.a();
        this.f15757f = null;
    }

    public final i.c j() {
        return this.f15754c;
    }

    public final b k() {
        return this.f15755d;
    }

    public final boolean l(C1766n c1766n, C1766n c1766n2) {
        if (c1766n == null || c1766n.c().size() != c1766n2.c().size()) {
            return true;
        }
        int size = c1766n2.c().size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!f.l(((z) c1766n.c().get(i8)).i(), ((z) c1766n2.c().get(i8)).i())) {
                return true;
            }
        }
        return false;
    }

    public final void m() {
        this.f15760i = true;
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.f15754c + ", children=" + g() + ", pointerIds=" + this.f15755d + ')';
    }
}
