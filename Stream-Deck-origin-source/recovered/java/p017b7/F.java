package p017b7;

import G6.b;
import G6.d;
import G6.e;
import G6.g;
import Q6.k;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p062g7.AbstractC2376o;
import p062g7.C2372k;
import p062g7.C2375n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class F extends G6.a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15894b = new a(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends b {

        /* JADX INFO: renamed from: b7.F$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0397a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0397a f15895a = new C0397a();

            public C0397a() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final F invoke(g.b bVar) {
                if (bVar instanceof F) {
                    return (F) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
            super(e.f2817J, C0397a.f15895a);
        }
    }

    public F() {
        super(e.f2817J);
    }

    @Override // G6.a, G6.g.b, G6.g
    public g.b A(g.c cVar) {
        return e.a.a(this, cVar);
    }

    @Override // G6.e
    public final void C1(d dVar) {
        t.e(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C2372k) dVar).p();
    }

    public abstract void L0(g gVar, Runnable runnable);

    public void T0(g gVar, Runnable runnable) {
        L0(gVar, runnable);
    }

    @Override // G6.e
    public final d U1(d dVar) {
        return new C2372k(this, dVar);
    }

    public boolean g1(g gVar) {
        return true;
    }

    @Override // G6.a, G6.g.b, G6.g
    public g j(g.c cVar) {
        return e.a.b(this, cVar);
    }

    public F k1(int i8) {
        AbstractC2376o.a(i8);
        return new C2375n(this, i8);
    }

    public String toString() {
        return N.a(this) + '@' + N.b(this);
    }
}
