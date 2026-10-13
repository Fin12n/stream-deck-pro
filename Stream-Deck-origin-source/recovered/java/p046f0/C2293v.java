package p046f0;

import C6.G;
import C6.r;
import P0.c;
import P0.l;
import Q6.o;
import kotlin.jvm.internal.t;
import p017b7.AbstractC1789i;
import p017b7.J;
import p038e1.InterfaceC2247s;
import p056g1.AbstractC2348l;
import p056g1.InterfaceC2354s;
import p056g1.InterfaceC2361z;
import p056g1.p0;
import p056g1.q0;
import p073i0.m;
import p110m1.x;
import p118n0.d;
import p118n0.f;

/* JADX INFO: renamed from: f0.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2293v extends AbstractC2348l implements c, InterfaceC2361z, p0, InterfaceC2354s {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l f21503p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C2292u f21505r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final d f21508u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f f21509v;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C2295x f21504q = (C2295x) d2(new C2295x());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C2294w f21506s = (C2294w) d2(new C2294w());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C2297z f21507t = (C2297z) d2(new C2297z());

    /* JADX INFO: renamed from: f0.v$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21510a;

        public a(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return C2293v.this.new a(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f21510a;
            if (i8 == 0) {
                r.b(obj);
                d dVar = C2293v.this.f21508u;
                this.f21510a = 1;
                if (d.b(dVar, null, this, 1, null) == objF) {
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

    public C2293v(m mVar) {
        this.f21505r = (C2292u) d2(new C2292u(mVar));
        d dVarA = androidx.compose.foundation.relocation.a.a();
        this.f21508u = dVarA;
        this.f21509v = (f) d2(new f(dVarA));
    }

    @Override // P0.c
    public void J(l lVar) {
        if (t.c(this.f21503p, lVar)) {
            return;
        }
        boolean zA = lVar.a();
        if (zA) {
            AbstractC1789i.d(D1(), null, null, new a(null), 3, null);
        }
        if (K1()) {
            q0.b(this);
        }
        this.f21505r.f2(zA);
        this.f21507t.f2(zA);
        this.f21506s.e2(zA);
        this.f21504q.d2(zA);
        this.f21503p = lVar;
    }

    @Override // p056g1.p0
    public void Q(x xVar) {
        this.f21504q.Q(xVar);
    }

    @Override // p056g1.InterfaceC2361z
    public void R(InterfaceC2247s interfaceC2247s) {
        this.f21509v.R(interfaceC2247s);
    }

    public final void j2(m mVar) {
        this.f21505r.g2(mVar);
    }

    @Override // p056g1.InterfaceC2354s
    public void m(InterfaceC2247s interfaceC2247s) {
        this.f21507t.m(interfaceC2247s);
    }
}
