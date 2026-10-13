package p038e1;

import C6.G;
import Q6.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u;
import p056g1.F;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends F.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f20464b = new e0();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f20466a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a0 a0Var) {
            super(1);
            this.f20466a = a0Var;
        }

        public final void b(a0.a aVar) {
            a0.a.n(aVar, this.f20466a, 0, 0, 0.0f, null, 12, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f20467a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(1);
            this.f20467a = list;
        }

        public final void b(a0.a aVar) {
            List list = this.f20467a;
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                a0.a.n(aVar, (a0) list.get(i8), 0, 0, 0.0f, null, 12, null);
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    public e0() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // p038e1.H
    public I d(J j8, List list, long j9) {
        if (list.isEmpty()) {
            return J.X0(j8, A1.b.p(j9), A1.b.o(j9), null, a.f20465a, 4, null);
        }
        if (list.size() == 1) {
            a0 a0VarJ = ((G) list.get(0)).J(j9);
            return J.X0(j8, A1.c.g(j9, a0VarJ.y0()), A1.c.f(j9, a0VarJ.h0()), null, new b(a0VarJ), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(((G) list.get(i8)).J(j9));
        }
        int size2 = arrayList.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i9 = 0; i9 < size2; i9++) {
            a0 a0Var = (a0) arrayList.get(i9);
            iMax = Math.max(a0Var.y0(), iMax);
            iMax2 = Math.max(a0Var.h0(), iMax2);
        }
        return J.X0(j8, A1.c.g(j9, iMax), A1.c.f(j9, iMax2), null, new c(arrayList), 4, null);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f20465a = new a();

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
