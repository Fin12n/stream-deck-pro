package p055g0;

import C6.G;
import C6.r;
import G6.d;
import H6.c;
import I6.l;
import Q6.k;
import Q6.o;
import p017b7.J;
import p046f0.K;
import p046f0.M;
import p215z0.InterfaceC3164l0;
import p215z0.l1;

/* JADX INFO: renamed from: g0.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2333n implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f23194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f23195b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f23196c = new M();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3164l0 f23197d = l1.e(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: g0.n$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23198a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ K f23200c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o f23201d;

        /* JADX INFO: renamed from: g0.n$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0539a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f23202a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f23203b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C2333n f23204c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o f23205d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0539a(C2333n c2333n, o oVar, d dVar) {
                super(2, dVar);
                this.f23204c = c2333n;
                this.f23205d = oVar;
            }

            @Override // I6.a
            public final d create(Object obj, d dVar) {
                C0539a c0539a = new C0539a(this.f23204c, this.f23205d, dVar);
                c0539a.f23203b = obj;
                return c0539a;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(I i8, d dVar) {
                return ((C0539a) create(i8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = c.f();
                int i8 = this.f23202a;
                try {
                    if (i8 == 0) {
                        r.b(obj);
                        I i9 = (I) this.f23203b;
                        this.f23204c.f23197d.setValue(I6.b.a(true));
                        o oVar = this.f23205d;
                        this.f23202a = 1;
                        if (oVar.invoke(i9, this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    this.f23204c.f23197d.setValue(I6.b.a(false));
                    return G.f1419a;
                } catch (Throwable th) {
                    this.f23204c.f23197d.setValue(I6.b.a(false));
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(K k8, o oVar, d dVar) {
            super(2, dVar);
            this.f23200c = k8;
            this.f23201d = oVar;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return C2333n.this.new a(this.f23200c, this.f23201d, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f23198a;
            if (i8 == 0) {
                r.b(obj);
                M m8 = C2333n.this.f23196c;
                I i9 = C2333n.this.f23195b;
                K k8 = this.f23200c;
                C0539a c0539a = new C0539a(C2333n.this, this.f23201d, null);
                this.f23198a = 1;
                if (m8.f(i9, k8, c0539a, this) == objF) {
                    return objF;
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

    /* JADX INFO: renamed from: g0.n$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements I {
        public b() {
        }

        @Override // p055g0.I
        public float a(float f8) {
            if (Float.isNaN(f8)) {
                return 0.0f;
            }
            return ((Number) C2333n.this.j().invoke(Float.valueOf(f8))).floatValue();
        }
    }

    public C2333n(k kVar) {
        this.f23194a = kVar;
    }

    @Override // p055g0.M
    public boolean b() {
        return ((Boolean) this.f23197d.getValue()).booleanValue();
    }

    @Override // p055g0.M
    public float e(float f8) {
        return ((Number) this.f23194a.invoke(Float.valueOf(f8))).floatValue();
    }

    @Override // p055g0.M
    public Object f(K k8, o oVar, d dVar) {
        Object objF = p017b7.K.f(new a(k8, oVar, null), dVar);
        return objF == c.f() ? objF : G.f1419a;
    }

    public final k j() {
        return this.f23194a;
    }
}
