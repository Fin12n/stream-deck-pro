package p028d0;

import Q6.k;
import R0.AbstractC1602n0;
import R0.C1598l0;
import S0.AbstractC1628c;
import S0.g;
import W6.n;
import kotlin.jvm.internal.u;
import p037e0.C2220p;
import p037e0.j0;
import p037e0.l0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f19676a = a.f19677a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19677a = new a();

        /* JADX INFO: renamed from: d0.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0457a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0457a f19678a = new C0457a();

            public C0457a() {
                super(1);
            }

            public final C2220p b(long j8) {
                long jM = C1598l0.m(j8, g.f9615a.t());
                return new C2220p(C1598l0.k(jM), C1598l0.h(jM), C1598l0.i(jM), C1598l0.j(jM));
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((C1598l0) obj).y());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AbstractC1628c f19679a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AbstractC1628c abstractC1628c) {
                super(1);
                this.f19679a = abstractC1628c;
            }

            public final long b(C2220p c2220p) {
                return C1598l0.m(AbstractC1602n0.a(n.j(c2220p.g(), 0.0f, 1.0f), n.j(c2220p.h(), -0.5f, 0.5f), n.j(c2220p.i(), -0.5f, 0.5f), n.j(c2220p.f(), 0.0f, 1.0f), g.f9615a.t()), this.f19679a);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return C1598l0.g(b((C2220p) obj));
            }
        }

        public a() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final j0 invoke(AbstractC1628c abstractC1628c) {
            return l0.a(C0457a.f19678a, new b(abstractC1628c));
        }
    }

    public static final k a(C1598l0.a aVar) {
        return f19676a;
    }
}
