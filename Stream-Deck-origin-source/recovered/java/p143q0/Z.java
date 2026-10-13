package p143q0;

import A1.b;
import A1.c;
import A1.n;
import C6.G;
import C6.o;
import Q0.h;
import Q6.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p038e1.H;
import p038e1.I;
import p038e1.J;
import p038e1.a0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class Z implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f31549a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f31550a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list) {
            super(1);
            this.f31550a = list;
        }

        public final void b(a0.a aVar) {
            List list = this.f31550a;
            if (list != null) {
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    o oVar = (o) list.get(i8);
                    a0.a.h(aVar, (a0) oVar.a(), ((n) oVar.b()).n(), 0.0f, 2, null);
                }
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    public Z(Function0 function0) {
        this.f31549a = function0;
    }

    @Override // p038e1.H
    public I d(J j8, List list, long j9) {
        List list2 = (List) this.f31549a.invoke();
        ArrayList arrayList = null;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size = list2.size();
            for (int i8 = 0; i8 < size; i8++) {
                h hVar = (h) list2.get(i8);
                o oVar = hVar != null ? new o(((p038e1.G) list.get(i8)).J(c.b(0, (int) Math.floor(hVar.n()), 0, (int) Math.floor(hVar.h()), 5, null)), n.b(A1.o.a(S6.c.d(hVar.i()), S6.c.d(hVar.l())))) : null;
                if (oVar != null) {
                    arrayList2.add(oVar);
                }
            }
            arrayList = arrayList2;
        }
        return J.X0(j8, b.n(j9), b.m(j9), null, new a(arrayList), 4, null);
    }
}
