package p168t1;

import Q6.k;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p215z0.q1;

/* JADX INFO: renamed from: t1.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3011p implements AbstractC3009n.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f34087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f34088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f34089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3015u f34090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final G f34091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f34092f;

    /* JADX INFO: renamed from: t1.p$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {
        public a() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(S s8) {
            return C3011p.this.h(S.b(s8, null, null, 0, 0, null, 30, null)).getValue();
        }
    }

    /* JADX INFO: renamed from: t1.p$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ S f34095b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(S s8) {
            super(1);
            this.f34095b = s8;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U invoke(k kVar) {
            U uA = C3011p.this.f34090d.a(this.f34095b, C3011p.this.g(), kVar, C3011p.this.f34092f);
            if (uA != null) {
                return uA;
            }
            U uA2 = C3011p.this.f34091e.a(this.f34095b, C3011p.this.g(), kVar, C3011p.this.f34092f);
            if (uA2 != null) {
                return uA2;
            }
            throw new IllegalStateException("Could not load font");
        }
    }

    public C3011p(H h8, I i8, T t8, C3015u c3015u, G g8) {
        this.f34087a = h8;
        this.f34088b = i8;
        this.f34089c = t8;
        this.f34090d = c3015u;
        this.f34091e = g8;
        this.f34092f = new a();
    }

    @Override // p168t1.AbstractC3009n.b
    public q1 b(AbstractC3009n abstractC3009n, C c8, int i8, int i9) {
        return h(new S(this.f34088b.d(abstractC3009n), this.f34088b.c(c8), this.f34088b.a(i8), this.f34088b.b(i9), this.f34087a.c(), null));
    }

    public final H g() {
        return this.f34087a;
    }

    public final q1 h(S s8) {
        return this.f34089c.c(s8, new b(s8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C3011p(H h8, I i8, T t8, C3015u c3015u, G g8, int i9, AbstractC2633k abstractC2633k) {
        this(h8, (i9 & 2) != 0 ? I.f34004a.a() : i8, (i9 & 4) != 0 ? AbstractC3012q.b() : t8, (i9 & 8) != 0 ? new C3015u(AbstractC3012q.a(), null, 2, 0 == true ? 1 : 0) : c3015u, (i9 & 16) != 0 ? new G() : g8);
    }
}
