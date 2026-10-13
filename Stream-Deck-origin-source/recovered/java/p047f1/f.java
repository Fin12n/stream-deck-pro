package p047f1;

import B0.d;
import C6.G;
import L0.i;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p056g1.AbstractC2347k;
import p056g1.AbstractC2348l;
import p056g1.C2339c;
import p056g1.F;
import p056g1.Z;
import p056g1.h0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f21526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f21527b = new d(new C2339c[16], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f21528c = new d(new c[16], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f21529d = new d(new F[16], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f21530e = new d(new c[16], 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21531f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m196invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m196invoke() {
            f.this.e();
        }
    }

    public f(h0 h0Var) {
        this.f21526a = h0Var;
    }

    public final void a(C2339c c2339c, c cVar) {
        this.f21527b.d(c2339c);
        this.f21528c.d(cVar);
        b();
    }

    public final void b() {
        if (this.f21531f) {
            return;
        }
        this.f21531f = true;
        this.f21526a.r(new a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [L0.i$c] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
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
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void c(i.c cVar, c cVar2, Set set) {
        int iA = Z.a(32);
        if (!cVar.I0().K1()) {
            throw new IllegalStateException("visitSubtreeIf called on an unattached node");
        }
        d dVar = new d(new i.c[16], 0);
        i.c cVarB1 = cVar.I0().B1();
        if (cVarB1 == null) {
            AbstractC2347k.c(dVar, cVar.I0());
        } else {
            dVar.d(cVarB1);
        }
        while (dVar.v()) {
            i.c cVar3 = (i.c) dVar.D(dVar.s() - 1);
            if ((cVar3.A1() & iA) != 0) {
                i.c cVarB2 = cVar3;
                while (true) {
                    if (cVarB2 != null) {
                        if ((cVarB2.F1() & iA) != 0) {
                            ?? G8 = cVarB2;
                            ?? dVar2 = 0;
                            while (G8 != 0) {
                                if (G8 instanceof h) {
                                    h hVar = (h) G8;
                                    if (hVar instanceof C2339c) {
                                        C2339c c2339c = (C2339c) hVar;
                                        if ((c2339c.d2() instanceof d) && c2339c.e2().contains(cVar2)) {
                                            set.add(hVar);
                                        }
                                    }
                                    if (hVar.u0().a(cVar2)) {
                                        break;
                                    }
                                } else if ((G8.F1() & iA) != 0 && (G8 instanceof AbstractC2348l)) {
                                    i.c cVarE2 = ((AbstractC2348l) G8).e2();
                                    int i8 = 0;
                                    while (cVarE2 != null) {
                                        if ((cVarE2.F1() & iA) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                G8 = G8;
                                                dVar2 = dVar2;
                                                dVar2 = dVar2;
                                                G8 = cVarE2;
                                            } else {
                                                if (dVar2 == 0) {
                                                    dVar2 = new d(new i.c[16], 0);
                                                }
                                                if (G8 != 0) {
                                                    dVar2.d(G8);
                                                    G8 = 0;
                                                }
                                                dVar2.d(cVarE2);
                                            }
                                        } else {
                                            G8 = G8;
                                            dVar2 = dVar2;
                                        }
                                        cVarE2 = cVarE2.B1();
                                        G8 = G8;
                                        dVar2 = dVar2;
                                    }
                                    if (i8 == 1) {
                                        G8 = G8;
                                        dVar2 = dVar2;
                                    } else {
                                        G8 = G8;
                                        dVar2 = dVar2;
                                    }
                                }
                                G8 = AbstractC2347k.g(dVar2);
                            }
                        }
                        cVarB2 = cVarB2.B1();
                    }
                }
            }
            AbstractC2347k.c(dVar, cVar3);
        }
    }

    public final void d(C2339c c2339c, c cVar) {
        this.f21529d.d(AbstractC2347k.k(c2339c));
        this.f21530e.d(cVar);
        b();
    }

    public final void e() {
        int i8 = 0;
        this.f21531f = false;
        HashSet hashSet = new HashSet();
        d dVar = this.f21529d;
        int iS = dVar.s();
        if (iS > 0) {
            Object[] objArrR = dVar.r();
            int i9 = 0;
            do {
                F f8 = (F) objArrR[i9];
                c cVar = (c) this.f21530e.r()[i9];
                if (f8.j0().k().K1()) {
                    c(f8.j0().k(), cVar, hashSet);
                }
                i9++;
            } while (i9 < iS);
        }
        this.f21529d.m();
        this.f21530e.m();
        d dVar2 = this.f21527b;
        int iS2 = dVar2.s();
        if (iS2 > 0) {
            Object[] objArrR2 = dVar2.r();
            do {
                C2339c c2339c = (C2339c) objArrR2[i8];
                c cVar2 = (c) this.f21528c.r()[i8];
                if (c2339c.K1()) {
                    c(c2339c, cVar2, hashSet);
                }
                i8++;
            } while (i8 < iS2);
        }
        this.f21527b.m();
        this.f21528c.m();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C2339c) it.next()).j2();
        }
    }

    public final void f(C2339c c2339c, c cVar) {
        this.f21527b.d(c2339c);
        this.f21528c.d(cVar);
        b();
    }
}
