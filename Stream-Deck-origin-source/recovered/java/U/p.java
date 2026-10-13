package U;

import G.InterfaceC0950i;
import H.C0980g0;
import H.C1005t0;
import H.F;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class p extends C1005t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g.a f9999c;

    public p(F f8, g.a aVar) {
        super(f8);
        this.f9999c = aVar;
    }

    @Override // H.C1005t0, H.F
    public Y4.a c(final List list, int i8, int i9) {
        T1.f.b(list.size() == 1, "Only support one capture config.");
        final Y4.a aVarE = e(i8, 1);
        return K.n.k(Collections.singletonList(K.d.b(aVarE).f(new K.a() { // from class: U.m
            @Override // K.a
            public final Y4.a apply(Object obj) {
                return ((InterfaceC0950i) aVarE.get()).a();
            }
        }, J.a.a()).f(new K.a() { // from class: U.n
            @Override // K.a
            public final Y4.a apply(Object obj) {
                p pVar = this.f9996a;
                List list2 = list;
                return pVar.f9999c.a(pVar.m((C0980g0) list2.get(0)), pVar.n((C0980g0) list2.get(0)));
            }
        }, J.a.a()).f(new K.a() { // from class: U.o
            @Override // K.a
            public final Y4.a apply(Object obj) {
                return ((InterfaceC0950i) aVarE.get()).b();
            }
        }, J.a.a())));
    }

    public final int m(C0980g0 c0980g0) {
        Integer num = (Integer) c0980g0.g().f(C0980g0.f3015j, 100);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int n(C0980g0 c0980g0) {
        Integer num = (Integer) c0980g0.g().f(C0980g0.f3014i, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
