package I;

import C6.G;
import androidx.lifecycle.AbstractC1737u;
import androidx.lifecycle.y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class q extends androidx.lifecycle.v {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f3666m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p142q.a f3667n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AbstractC1737u f3668o;

    public q(Object obj, p142q.a mapFunction) {
        kotlin.jvm.internal.t.g(mapFunction, "mapFunction");
        this.f3666m = obj;
        this.f3667n = mapFunction;
    }

    public static final void t(final q qVar, AbstractC1737u abstractC1737u) {
        final Q6.k kVar = new Q6.k() { // from class: I.o
            @Override // Q6.k
            public final Object invoke(Object obj) {
                return q.u(this.f3664a, obj);
            }
        };
        super.n(abstractC1737u, new y() { // from class: I.p
            @Override // androidx.lifecycle.y
            public final void a(Object obj) {
                q.v(kVar, obj);
            }
        });
    }

    public static final G u(q qVar, Object obj) {
        qVar.m(qVar.f3667n.apply(obj));
        return G.f1419a;
    }

    public static final void v(Q6.k kVar, Object obj) {
        kVar.invoke(obj);
    }

    @Override // androidx.lifecycle.AbstractC1737u
    public Object e() {
        AbstractC1737u abstractC1737u = this.f3668o;
        return abstractC1737u == null ? this.f3666m : this.f3667n.apply(abstractC1737u.e());
    }

    public final void s(final AbstractC1737u liveDataSource) {
        kotlin.jvm.internal.t.g(liveDataSource, "liveDataSource");
        AbstractC1737u abstractC1737u = this.f3668o;
        if (abstractC1737u != null) {
            kotlin.jvm.internal.t.d(abstractC1737u);
            super.o(abstractC1737u);
        }
        this.f3668o = liveDataSource;
        w.e(new Runnable() { // from class: I.n
            @Override // java.lang.Runnable
            public final void run() {
                q.t(this.f3662a, liveDataSource);
            }
        });
    }
}
