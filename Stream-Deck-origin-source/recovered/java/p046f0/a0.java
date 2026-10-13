package p046f0;

import C6.G;
import I0.j;
import I0.k;
import J0.AbstractC1028k;
import Q6.o;
import W6.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p055g0.M;
import p055g0.N;
import p073i0.l;
import p073i0.m;
import p215z0.InterfaceC3160j0;
import p215z0.X0;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements M {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f21407i = new c(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j f21408j = k.a(a.f21417a, b.f21418a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3160j0 f21409a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f21413e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3160j0 f21410b = X0.a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f21411c = l.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC3160j0 f21412d = X0.a(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M f21414f = N.a(new f());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q1 f21415g = g1.d(new e());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q1 f21416h = g1.d(new d());

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21417a = new a();

        public a() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(I0.l lVar, a0 a0Var) {
            return Integer.valueOf(a0Var.m());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f21418a = new b();

        public b() {
            super(1);
        }

        public final a0 b(int i8) {
            return new a0(i8);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {
        public /* synthetic */ c(AbstractC2633k abstractC2633k) {
            this();
        }

        public final j a() {
            return a0.f21408j;
        }

        public c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(a0.this.m() > 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(a0.this.m() < a0.this.l());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements Q6.k {
        public f() {
            super(1);
        }

        public final Float b(float f8) {
            float fM = a0.this.m() + f8 + a0.this.f21413e;
            float fJ = n.j(fM, 0.0f, a0.this.l());
            boolean z8 = fM == fJ;
            float fM2 = fJ - a0.this.m();
            int iD = S6.c.d(fM2);
            a0 a0Var = a0.this;
            a0Var.o(a0Var.m() + iD);
            a0.this.f21413e = fM2 - iD;
            if (!z8) {
                f8 = fM2;
            }
            return Float.valueOf(f8);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).floatValue());
        }
    }

    public a0(int i8) {
        this.f21409a = X0.a(i8);
    }

    @Override // p055g0.M
    public boolean a() {
        return ((Boolean) this.f21415g.getValue()).booleanValue();
    }

    @Override // p055g0.M
    public boolean b() {
        return this.f21414f.b();
    }

    @Override // p055g0.M
    public boolean d() {
        return ((Boolean) this.f21416h.getValue()).booleanValue();
    }

    @Override // p055g0.M
    public float e(float f8) {
        return this.f21414f.e(f8);
    }

    @Override // p055g0.M
    public Object f(K k8, o oVar, G6.d dVar) {
        Object objF = this.f21414f.f(k8, oVar, dVar);
        return objF == H6.c.f() ? objF : G.f1419a;
    }

    public final m k() {
        return this.f21411c;
    }

    public final int l() {
        return this.f21412d.f();
    }

    public final int m() {
        return this.f21409a.f();
    }

    public final void n(int i8) {
        this.f21412d.p(i8);
        AbstractC1028k abstractC1028kC = AbstractC1028k.f3974e.c();
        try {
            AbstractC1028k abstractC1028kL = abstractC1028kC.l();
            try {
                if (m() > i8) {
                    o(i8);
                }
                G g8 = G.f1419a;
                abstractC1028kC.s(abstractC1028kL);
                abstractC1028kC.d();
            } catch (Throwable th) {
                abstractC1028kC.s(abstractC1028kL);
                throw th;
            }
        } catch (Throwable th2) {
            abstractC1028kC.d();
            throw th2;
        }
    }

    public final void o(int i8) {
        this.f21409a.p(i8);
    }

    public final void p(int i8) {
        this.f21410b.p(i8);
    }
}
