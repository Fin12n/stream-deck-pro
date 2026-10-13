package p038e1;

import C6.G;
import C6.InterfaceC0916e;
import Q6.o;
import kotlin.jvm.internal.u;
import p056g1.F;
import p215z0.AbstractC3173q;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f20495f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f20496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A f20497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f20498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f20499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f20500e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {
        public b() {
            super(2);
        }

        public final void b(F f8, AbstractC3173q abstractC3173q) {
            i0.this.h().I(abstractC3173q);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((F) obj, (AbstractC3173q) obj2);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {
        public c() {
            super(2);
        }

        public final void b(F f8, o oVar) {
            f8.m(i0.this.h().u(oVar));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((F) obj, (o) obj2);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements o {
        public d() {
            super(2);
        }

        public final void b(F f8, i0 i0Var) {
            i0 i0Var2 = i0.this;
            A aP0 = f8.p0();
            if (aP0 == null) {
                aP0 = new A(f8, i0.this.f20496a);
                f8.z1(aP0);
            }
            i0Var2.f20497b = aP0;
            i0.this.h().B();
            i0.this.h().J(i0.this.f20496a);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((F) obj, (i0) obj2);
            return G.f1419a;
        }
    }

    public i0(k0 k0Var) {
        this.f20496a = k0Var;
        this.f20498c = new d();
        this.f20499d = new b();
        this.f20500e = new c();
    }

    public final void d() {
        h().z();
    }

    public final o e() {
        return this.f20499d;
    }

    public final o f() {
        return this.f20500e;
    }

    public final o g() {
        return this.f20498c;
    }

    public final A h() {
        A a8 = this.f20497b;
        if (a8 != null) {
            return a8;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public final a i(Object obj, o oVar) {
        return h().G(obj, oVar);
    }

    public i0() {
        this(P.f20430a);
    }

    @InterfaceC0916e
    public i0(int i8) {
        this(h0.c(i8));
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        default int a() {
            return 0;
        }

        void d();

        default void b(int i8, long j8) {
        }
    }
}
