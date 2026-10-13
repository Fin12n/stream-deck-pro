package p100l0;

import C6.G;
import H0.c;
import kotlin.jvm.internal.u;
import p109m0.InterfaceC2666d;
import p109m0.t;
import p109m0.z;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f29019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f29020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f29021c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f29023b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i8) {
            super(2);
            this.f29023b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(726189336, i8, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item.<anonymous> (LazyGridItemProvider.kt:76)");
            }
            j jVar = o.this.f29020b;
            int i9 = this.f29023b;
            InterfaceC2666d.a aVar = jVar.j().get(i9);
            ((C2648i) aVar.c()).a().i(androidx.compose.foundation.lazy.grid.a.f14528a, Integer.valueOf(i9 - aVar.b()), interfaceC3163l, 6);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f29025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f29026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f29027d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i8, Object obj, int i9) {
            super(2);
            this.f29025b = i8;
            this.f29026c = obj;
            this.f29027d = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            o.this.i(this.f29025b, this.f29026c, interfaceC3163l, F0.a(this.f29027d | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public o(G g8, j jVar, t tVar) {
        this.f29019a = g8;
        this.f29020b = jVar;
        this.f29021c = tVar;
    }

    @Override // p109m0.q
    public Object a(int i8) {
        Object objA = b().a(i8);
        return objA == null ? this.f29020b.l(i8) : objA;
    }

    @Override // p100l0.n
    public t b() {
        return this.f29021c;
    }

    @Override // p109m0.q
    public int c(Object obj) {
        return b().c(obj);
    }

    @Override // p109m0.q
    public int d() {
        return this.f29020b.k();
    }

    @Override // p109m0.q
    public Object e(int i8) {
        return this.f29020b.i(i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return kotlin.jvm.internal.t.c(this.f29020b, ((o) obj).f29020b);
        }
        return false;
    }

    @Override // p100l0.n
    public F h() {
        return this.f29020b.o();
    }

    public int hashCode() {
        return this.f29020b.hashCode();
    }

    @Override // p109m0.q
    public void i(int i8, Object obj, InterfaceC3163l interfaceC3163l, int i9) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1493551140);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1493551140, i9, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:74)");
        }
        z.a(obj, i8, this.f29019a.r(), c.b(interfaceC3163lP, 726189336, true, new a(i8)), interfaceC3163lP, ((i9 << 3) & 112) | 3592);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(i8, obj, i9));
        }
    }
}
