package androidx.compose.foundation.gestures;

import C6.G;
import C6.r;
import G6.d;
import I6.l;
import P0.h;
import Q0.g;
import Q6.k;
import Q6.o;
import Z0.e;
import android.view.KeyEvent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.J;
import p028d0.C;
import p038e1.InterfaceC2247s;
import p046f0.A;
import p046f0.S;
import p055g0.B;
import p055g0.C2330k;
import p055g0.C2332m;
import p055g0.I;
import p055g0.InterfaceC2329j;
import p055g0.K;
import p055g0.L;
import p055g0.M;
import p055g0.O;
import p055g0.w;
import p055g0.z;
import p056g1.AbstractC2345i;
import p056g1.AbstractC2348l;
import p056g1.InterfaceC2344h;
import p056g1.c0;
import p056g1.d0;
import p065h1.X;
import p073i0.m;
import p118n0.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC2348l implements c0, InterfaceC2344h, h, e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C2330k f14411A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final z f14412B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final K f14413C;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public M f14414p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public B f14415q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public S f14416r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14417s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14418t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public w f14419u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m f14420v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p002a1.b f14421w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C2332m f14422x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final O f14423y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final L f14424z;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {
        public a() {
            super(1);
        }

        public final void b(InterfaceC2247s interfaceC2247s) {
            b.this.i2().y2(interfaceC2247s);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((InterfaceC2247s) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0358b extends u implements Function0 {
        public C0358b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m81invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m81invoke() {
            AbstractC2345i.a(b.this, X.d());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ O f14428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f14429c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f14430a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f14431b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ O f14432c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f14433d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(O o8, long j8, d dVar) {
                super(2, dVar);
                this.f14432c = o8;
                this.f14433d = j8;
            }

            @Override // I6.a
            public final d create(Object obj, d dVar) {
                a aVar = new a(this.f14432c, this.f14433d, dVar);
                aVar.f14431b = obj;
                return aVar;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(I i8, d dVar) {
                return ((a) create(i8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                H6.c.f();
                if (this.f14430a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                this.f14432c.c((I) this.f14431b, this.f14433d, p002a1.e.f13022a.c());
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(O o8, long j8, d dVar) {
            super(2, dVar);
            this.f14428b = o8;
            this.f14429c = j8;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return new c(this.f14428b, this.f14429c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((c) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f14427a;
            if (i8 == 0) {
                r.b(obj);
                M mE = this.f14428b.e();
                p046f0.K k8 = p046f0.K.UserInput;
                a aVar = new a(this.f14428b, this.f14429c, null);
                this.f14427a = 1;
                if (mE.f(k8, aVar, this) == objF) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public b(M m8, B b8, S s8, boolean z8, boolean z9, w wVar, m mVar, InterfaceC2329j interfaceC2329j) {
        this.f14414p = m8;
        this.f14415q = b8;
        this.f14416r = s8;
        this.f14417s = z8;
        this.f14418t = z9;
        this.f14419u = wVar;
        this.f14420v = mVar;
        p002a1.b bVar = new p002a1.b();
        this.f14421w = bVar;
        C2332m c2332m = new C2332m(C.c(androidx.compose.foundation.gestures.a.f14404g), null, 2, 0 == true ? 1 : 0);
        this.f14422x = c2332m;
        M m9 = this.f14414p;
        B b9 = this.f14415q;
        w wVar2 = c2332m;
        S s9 = this.f14416r;
        boolean z10 = this.f14418t;
        w wVar3 = this.f14419u;
        O o8 = new O(m9, b9, s9, z10, wVar3 != null ? wVar3 : wVar2, bVar);
        this.f14423y = o8;
        L l8 = new L(o8, this.f14417s);
        this.f14424z = l8;
        C2330k c2330k = (C2330k) d2(new C2330k(this.f14415q, this.f14414p, this.f14418t, interfaceC2329j));
        this.f14411A = c2330k;
        this.f14412B = (z) d2(new z(this.f14417s));
        d2(p002a1.d.b(l8, bVar));
        d2(P0.o.a());
        d2(new i(c2330k));
        d2(new A(new a()));
        this.f14413C = (K) d2(new K(o8, this.f14415q, this.f14417s, bVar, this.f14420v));
    }

    @Override // L0.i.c
    public void N1() {
        k2();
        d0.a(this, new C0358b());
    }

    @Override // p056g1.c0
    public void O0() {
        k2();
    }

    @Override // P0.h
    public void S(androidx.compose.ui.focus.e eVar) {
        eVar.l(false);
    }

    @Override // Z0.e
    public boolean W(KeyEvent keyEvent) {
        long jA;
        if (!this.f14417s) {
            return false;
        }
        long jA2 = Z0.d.a(keyEvent);
        Z0.a.C0318a c0318a = Z0.a.f12684b;
        if ((!Z0.a.p(jA2, c0318a.j()) && !Z0.a.p(Z0.d.a(keyEvent), c0318a.k())) || !Z0.c.e(Z0.d.b(keyEvent), Z0.c.f12836a.a()) || Z0.d.e(keyEvent)) {
            return false;
        }
        O o8 = this.f14423y;
        if (this.f14415q == B.Vertical) {
            int iF = A1.r.f(this.f14411A.u2());
            jA = g.a(0.0f, Z0.a.p(Z0.d.a(keyEvent), c0318a.k()) ? iF : -iF);
        } else {
            int iG = A1.r.g(this.f14411A.u2());
            jA = g.a(Z0.a.p(Z0.d.a(keyEvent), c0318a.k()) ? iG : -iG, 0.0f);
        }
        AbstractC1789i.d(D1(), null, null, new c(o8, jA, null), 3, null);
        return true;
    }

    public final C2330k i2() {
        return this.f14411A;
    }

    public final void j2(M m8, B b8, S s8, boolean z8, boolean z9, w wVar, m mVar, InterfaceC2329j interfaceC2329j) {
        if (this.f14417s != z8) {
            this.f14424z.a(z8);
            this.f14412B.d2(z8);
        }
        this.f14423y.r(m8, b8, s8, z9, wVar == null ? this.f14422x : wVar, this.f14421w);
        this.f14413C.k2(b8, z8, mVar);
        this.f14411A.A2(b8, m8, z9, interfaceC2329j);
        this.f14414p = m8;
        this.f14415q = b8;
        this.f14416r = s8;
        this.f14417s = z8;
        this.f14418t = z9;
        this.f14419u = wVar;
        this.f14420v = mVar;
    }

    public final void k2() {
        this.f14422x.d(C.c((A1.d) AbstractC2345i.a(this, X.d())));
    }

    @Override // Z0.e
    public boolean y(KeyEvent keyEvent) {
        return false;
    }
}
