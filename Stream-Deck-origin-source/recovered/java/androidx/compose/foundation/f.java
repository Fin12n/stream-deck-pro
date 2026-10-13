package androidx.compose.foundation;

import A1.n;
import A1.s;
import C6.G;
import C6.r;
import I6.l;
import Q6.k;
import Q6.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p011b1.I;
import p055g0.D;
import p055g0.P;
import p073i0.m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f extends androidx.compose.foundation.b {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ long f14378c;

        public a(G6.d dVar) {
            super(3, dVar);
        }

        public final Object g(D d8, long j8, G6.d dVar) {
            a aVar = f.this.new a(dVar);
            aVar.f14377b = d8;
            aVar.f14378c = j8;
            return aVar.invokeSuspend(G.f1419a);
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return g((D) obj, ((Q0.f) obj2).x(), (G6.d) obj3);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f14376a;
            if (i8 == 0) {
                r.b(obj);
                D d8 = (D) this.f14377b;
                long j8 = this.f14378c;
                if (f.this.i2()) {
                    f fVar = f.this;
                    this.f14376a = 1;
                    if (fVar.l2(d8, j8, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {
        public b() {
            super(1);
        }

        public final void b(long j8) {
            if (f.this.i2()) {
                f.this.k2().invoke();
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((Q0.f) obj).x());
            return G.f1419a;
        }
    }

    public f(boolean z8, m mVar, Function0 function0, androidx.compose.foundation.a.C0354a c0354a) {
        super(z8, mVar, function0, c0354a, null);
    }

    @Override // androidx.compose.foundation.b
    public Object m2(I i8, G6.d dVar) {
        androidx.compose.foundation.a.C0354a c0354aJ2 = j2();
        long jB = s.b(i8.a());
        c0354aJ2.d(Q0.g.a(n.j(jB), n.k(jB)));
        Object objH = P.h(i8, new a(null), new b(), dVar);
        return objH == H6.c.f() ? objH : G.f1419a;
    }

    public final void q2(boolean z8, m mVar, Function0 function0) {
        n2(z8);
        p2(function0);
        o2(mVar);
    }
}
