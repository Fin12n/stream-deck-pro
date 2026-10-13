package p176u1;

import D6.r;
import I0.j;
import I0.k;
import I0.l;
import Q6.o;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p128o1.A;
import p128o1.C2739d;
import p128o1.G;
import p128o1.H;
import p128o1.InterfaceC2748m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f34375d = new c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f34376e = k.a(a.f34380a, b.f34381a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2739d f34377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f34378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G f34379c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34380a = new a();

        public a() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l lVar, M m8) {
            return r.h(A.v(m8.e(), A.f(), lVar), A.v(G.b(m8.g()), A.l(G.f30758b), lVar));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f34381a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final M invoke(Object obj) {
            t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            j jVarF = A.f();
            Boolean bool = Boolean.FALSE;
            G g8 = null;
            C2739d c2739d = ((!t.c(obj2, bool) || (jVarF instanceof InterfaceC2748m)) && obj2 != null) ? (C2739d) jVarF.a(obj2) : null;
            t.d(c2739d);
            Object obj3 = list.get(1);
            j jVarL = A.l(G.f30758b);
            if ((!t.c(obj3, bool) || (jVarL instanceof InterfaceC2748m)) && obj3 != null) {
                g8 = (G) jVarL.a(obj3);
            }
            t.d(g8);
            return new M(c2739d, g8.r(), (G) null, 4, (AbstractC2633k) null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {
        public /* synthetic */ c(AbstractC2633k abstractC2633k) {
            this();
        }

        public c() {
        }
    }

    public /* synthetic */ M(String str, long j8, G g8, AbstractC2633k abstractC2633k) {
        this(str, j8, g8);
    }

    public static /* synthetic */ M c(M m8, String str, long j8, G g8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j8 = m8.f34378b;
        }
        if ((i8 & 4) != 0) {
            g8 = m8.f34379c;
        }
        return m8.a(str, j8, g8);
    }

    public static /* synthetic */ M d(M m8, C2739d c2739d, long j8, G g8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            c2739d = m8.f34377a;
        }
        if ((i8 & 2) != 0) {
            j8 = m8.f34378b;
        }
        if ((i8 & 4) != 0) {
            g8 = m8.f34379c;
        }
        return m8.b(c2739d, j8, g8);
    }

    public final M a(String str, long j8, G g8) {
        return new M(new C2739d(str, null, null, 6, null), j8, g8, (AbstractC2633k) null);
    }

    public final M b(C2739d c2739d, long j8, G g8) {
        return new M(c2739d, j8, g8, (AbstractC2633k) null);
    }

    public final C2739d e() {
        return this.f34377a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m8 = (M) obj;
        return G.g(this.f34378b, m8.f34378b) && t.c(this.f34379c, m8.f34379c) && t.c(this.f34377a, m8.f34377a);
    }

    public final G f() {
        return this.f34379c;
    }

    public final long g() {
        return this.f34378b;
    }

    public final String h() {
        return this.f34377a.i();
    }

    public int hashCode() {
        int iHashCode = ((this.f34377a.hashCode() * 31) + G.o(this.f34378b)) * 31;
        G g8 = this.f34379c;
        return iHashCode + (g8 != null ? G.o(g8.r()) : 0);
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.f34377a) + "', selection=" + ((Object) G.q(this.f34378b)) + ", composition=" + this.f34379c + ')';
    }

    public /* synthetic */ M(C2739d c2739d, long j8, G g8, AbstractC2633k abstractC2633k) {
        this(c2739d, j8, g8);
    }

    public M(C2739d c2739d, long j8, G g8) {
        this.f34377a = c2739d;
        this.f34378b = H.c(j8, 0, h().length());
        this.f34379c = g8 != null ? G.b(H.c(g8.r(), 0, h().length())) : null;
    }

    public /* synthetic */ M(C2739d c2739d, long j8, G g8, int i8, AbstractC2633k abstractC2633k) {
        this(c2739d, (i8 & 2) != 0 ? G.f30758b.a() : j8, (i8 & 4) != 0 ? null : g8, (AbstractC2633k) null);
    }

    public /* synthetic */ M(String str, long j8, G g8, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? G.f30758b.a() : j8, (i8 & 4) != 0 ? null : g8, (AbstractC2633k) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public M(String str, long j8, G g8) {
        AbstractC2633k abstractC2633k = null;
        this(new C2739d(str, null, null, 6, abstractC2633k), j8, g8, abstractC2633k);
    }
}
