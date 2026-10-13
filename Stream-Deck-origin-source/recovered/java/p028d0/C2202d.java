package p028d0;

import A1.s;
import C6.G;
import D6.r;
import Q6.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u;
import p038e1.H;
import p038e1.I;
import p038e1.InterfaceC2243n;
import p038e1.InterfaceC2244o;
import p038e1.J;
import p038e1.a0;

/* JADX INFO: renamed from: d0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2202d implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f19618a;

    /* JADX INFO: renamed from: d0.d$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f19619a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list) {
            super(1);
            this.f19619a = list;
        }

        public final void b(a0.a aVar) {
            List list = this.f19619a;
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                a0.a.f(aVar, (a0) list.get(i8), 0, 0, 0.0f, 4, null);
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    public C2202d(g gVar) {
        this.f19618a = gVar;
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
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(((p038e1.G) list.get(i8)).J(j9));
        }
        Object obj2 = null;
        int i9 = 1;
        if (!arrayList.isEmpty()) {
            obj = arrayList.get(0);
            int iY0 = ((a0) obj).y0();
            int iP = r.p(arrayList);
            if (1 <= iP) {
                int i10 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i10);
                    int iY1 = ((a0) obj3).y0();
                    if (iY0 < iY1) {
                        obj = obj3;
                        iY0 = iY1;
                    }
                    if (i10 == iP) {
                        break;
                    }
                    i10++;
                }
            }
        } else {
            obj = null;
        }
        a0 a0Var = (a0) obj;
        int iY2 = a0Var != null ? a0Var.y0() : 0;
        if (!arrayList.isEmpty()) {
            Object obj4 = arrayList.get(0);
            int iH0 = ((a0) obj4).h0();
            int iP2 = r.p(arrayList);
            if (1 <= iP2) {
                while (true) {
                    Object obj5 = arrayList.get(i9);
                    int iH1 = ((a0) obj5).h0();
                    if (iH0 < iH1) {
                        obj4 = obj5;
                        iH0 = iH1;
                    }
                    if (i9 == iP2) {
                        break;
                    }
                    i9++;
                }
            }
            obj2 = obj4;
        }
        a0 a0Var2 = (a0) obj2;
        int iH2 = a0Var2 != null ? a0Var2.h0() : 0;
        this.f19618a.b().setValue(A1.r.b(s.a(iY2, iH2)));
        return J.X0(j8, iY2, iH2, null, new a(arrayList), 4, null);
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
}
