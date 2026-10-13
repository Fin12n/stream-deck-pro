package androidx.compose.animation;

import A1.n;
import A1.s;
import A1.t;
import C6.G;
import D6.C0934n;
import D6.r;
import Q6.k;
import W6.i;
import java.util.List;
import kotlin.jvm.internal.u;
import p038e1.H;
import p038e1.I;
import p038e1.InterfaceC2243n;
import p038e1.InterfaceC2244o;
import p038e1.J;
import p038e1.a0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f14226a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0[] f14227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f14228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f14229c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f14230d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a0[] a0VarArr, b bVar, int i8, int i9) {
            super(1);
            this.f14227a = a0VarArr;
            this.f14228b = bVar;
            this.f14229c = i8;
            this.f14230d = i9;
        }

        public final void b(a0.a aVar) {
            a0.a aVar2;
            a0[] a0VarArr = this.f14227a;
            b bVar = this.f14228b;
            int i8 = this.f14229c;
            int i9 = this.f14230d;
            int length = a0VarArr.length;
            int i10 = 0;
            while (i10 < length) {
                a0 a0Var = a0VarArr[i10];
                if (a0Var != null) {
                    long jA = bVar.f().g().a(s.a(a0Var.y0(), a0Var.h0()), s.a(i8, i9), t.Ltr);
                    aVar2 = aVar;
                    a0.a.f(aVar2, a0Var, n.j(jA), n.k(jA), 0.0f, 4, null);
                } else {
                    aVar2 = aVar;
                }
                i10++;
                aVar = aVar2;
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    public b(d dVar) {
        this.f14226a = dVar;
    }

    @Override // p038e1.H
    public int a(InterfaceC2244o interfaceC2244o, List list, int i8) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((InterfaceC2243n) list.get(0)).G(i8));
            int iP = r.p(list);
            int i9 = 1;
            if (1 <= iP) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC2243n) list.get(i9)).G(i8));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i9 == iP) {
                        break;
                    }
                    i9++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p038e1.H
    public int b(InterfaceC2244o interfaceC2244o, List list, int i8) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((InterfaceC2243n) list.get(0)).F(i8));
            int iP = r.p(list);
            int i9 = 1;
            if (1 <= iP) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC2243n) list.get(i9)).F(i8));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i9 == iP) {
                        break;
                    }
                    i9++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p038e1.H
    public int c(InterfaceC2244o interfaceC2244o, List list, int i8) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((InterfaceC2243n) list.get(0)).g(i8));
            int iP = r.p(list);
            int i9 = 1;
            if (1 <= iP) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC2243n) list.get(i9)).g(i8));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i9 == iP) {
                        break;
                    }
                    i9++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p038e1.H
    public I d(J j8, List list, long j9) {
        a0 a0Var;
        a0 a0Var2;
        int size = list.size();
        a0[] a0VarArr = new a0[size];
        int size2 = list.size();
        int i8 = 0;
        while (true) {
            a0Var = null;
            if (i8 >= size2) {
                break;
            }
            p038e1.G g8 = (p038e1.G) list.get(i8);
            Object objE = g8.e();
            d.a aVar = objE instanceof d.a ? (d.a) objE : null;
            if (aVar != null && aVar.k()) {
                a0VarArr[i8] = g8.J(j9);
            }
            i8++;
        }
        int size3 = list.size();
        for (int i9 = 0; i9 < size3; i9++) {
            p038e1.G g9 = (p038e1.G) list.get(i9);
            if (a0VarArr[i9] == null) {
                a0VarArr[i9] = g9.J(j9);
            }
        }
        if (size == 0) {
            a0Var2 = null;
        } else {
            a0Var2 = a0VarArr[0];
            int iT = C0934n.T(a0VarArr);
            if (iT != 0) {
                int iY0 = a0Var2 != null ? a0Var2.y0() : 0;
                D6.I it = new i(1, iT).iterator();
                while (it.hasNext()) {
                    a0 a0Var3 = a0VarArr[it.nextInt()];
                    int iY1 = a0Var3 != null ? a0Var3.y0() : 0;
                    if (iY0 < iY1) {
                        a0Var2 = a0Var3;
                        iY0 = iY1;
                    }
                }
            }
        }
        int iY2 = a0Var2 != null ? a0Var2.y0() : 0;
        if (size != 0) {
            a0Var = a0VarArr[0];
            int iT2 = C0934n.T(a0VarArr);
            if (iT2 != 0) {
                int iH0 = a0Var != null ? a0Var.h0() : 0;
                D6.I it2 = new i(1, iT2).iterator();
                while (it2.hasNext()) {
                    a0 a0Var4 = a0VarArr[it2.nextInt()];
                    int iH1 = a0Var4 != null ? a0Var4.h0() : 0;
                    if (iH0 < iH1) {
                        a0Var = a0Var4;
                        iH0 = iH1;
                    }
                }
            }
        }
        int iH2 = a0Var != null ? a0Var.h0() : 0;
        this.f14226a.l(s.a(iY2, iH2));
        return J.X0(j8, iY2, iH2, null, new a(a0VarArr, this, iY2, iH2), 4, null);
    }

    @Override // p038e1.H
    public int e(InterfaceC2244o interfaceC2244o, List list, int i8) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((InterfaceC2243n) list.get(0)).W(i8));
            int iP = r.p(list);
            int i9 = 1;
            if (1 <= iP) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC2243n) list.get(i9)).W(i8));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i9 == iP) {
                        break;
                    }
                    i9++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public final d f() {
        return this.f14226a;
    }
}
