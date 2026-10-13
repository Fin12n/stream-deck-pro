package E1;

import C6.G;
import D6.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u;
import p038e1.H;
import p038e1.I;
import p038e1.J;
import p038e1.a0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f2085a = new c();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f2087a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a0 a0Var) {
            super(1);
            this.f2087a = a0Var;
        }

        public final void b(a0.a aVar) {
            a0.a.j(aVar, this.f2087a, 0, 0, 0.0f, 4, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: E1.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0095c extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f2088a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0095c(List<? extends a0> list) {
            super(1);
            this.f2088a = list;
        }

        public final void b(a0.a aVar) {
            int iP = r.p(this.f2088a);
            if (iP < 0) {
                return;
            }
            int i8 = 0;
            while (true) {
                a0.a aVar2 = aVar;
                a0.a.j(aVar2, (a0) this.f2088a.get(i8), 0, 0, 0.0f, 4, null);
                if (i8 == iP) {
                    return;
                }
                i8++;
                aVar = aVar2;
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    @Override // p038e1.H
    public final I d(J j8, List list, long j9) {
        int i8;
        int i9;
        int size = list.size();
        if (size == 0) {
            return J.X0(j8, 0, 0, null, a.f2086a, 4, null);
        }
        int i10 = 0;
        if (size == 1) {
            a0 a0VarJ = ((p038e1.G) list.get(0)).J(j9);
            return J.X0(j8, a0VarJ.y0(), a0VarJ.h0(), null, new b(a0VarJ), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList.add(((p038e1.G) list.get(i11)).J(j9));
        }
        int iP = r.p(arrayList);
        if (iP >= 0) {
            int iMax = 0;
            int iMax2 = 0;
            while (true) {
                a0 a0Var = (a0) arrayList.get(i10);
                iMax = Math.max(iMax, a0Var.y0());
                iMax2 = Math.max(iMax2, a0Var.h0());
                if (i10 == iP) {
                    break;
                }
                i10++;
            }
            i8 = iMax;
            i9 = iMax2;
        } else {
            i8 = 0;
            i9 = 0;
        }
        return J.X0(j8, i8, i9, null, new C0095c(arrayList), 4, null);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2086a = new a();

        public a() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }

        public final void b(a0.a aVar) {
        }
    }
}
