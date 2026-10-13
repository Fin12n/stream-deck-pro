package p055g0;

import C6.G;
import C6.r;
import G6.d;
import H6.c;
import I6.l;
import Q6.k;
import Q6.o;
import Q6.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import p046f0.K;
import p073i0.m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class u extends AbstractC2321b {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public v f23284D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public B f23285E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public InterfaceC2336q f23286F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final a f23287G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C f23288H;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2320a {
        public a() {
        }

        @Override // p055g0.InterfaceC2320a
        public void a(long j8) {
            u.this.O2().b(t.n(j8, u.this.f23285E));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f23291b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o f23293d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o oVar, d dVar) {
            super(2, dVar);
            this.f23293d = oVar;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            b bVar = u.this.new b(this.f23293d, dVar);
            bVar.f23291b = obj;
            return bVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2336q interfaceC2336q, d dVar) {
            return ((b) create(interfaceC2336q, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f23290a;
            if (i8 == 0) {
                r.b(obj);
                u.this.P2((InterfaceC2336q) this.f23291b);
                o oVar = this.f23293d;
                a aVar = u.this.f23287G;
                this.f23290a = 1;
                if (oVar.invoke(aVar, this) == objF) {
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

    public u(v vVar, k kVar, B b8, boolean z8, m mVar, Function0 function0, p pVar, p pVar2, boolean z9) {
        super(kVar, z8, mVar, function0, pVar, pVar2, z9);
        this.f23284D = vVar;
        this.f23285E = b8;
        this.f23286F = t.f23251a;
        this.f23287G = new a();
        this.f23288H = AbstractC2335p.i(this.f23285E);
    }

    public final InterfaceC2336q O2() {
        return this.f23286F;
    }

    public final void P2(InterfaceC2336q interfaceC2336q) {
        this.f23286F = interfaceC2336q;
    }

    public final void Q2(v vVar, k kVar, B b8, boolean z8, m mVar, Function0 function0, p pVar, p pVar2, boolean z9) {
        boolean z10;
        boolean z11 = true;
        if (t.c(this.f23284D, vVar)) {
            z10 = false;
        } else {
            this.f23284D = vVar;
            z10 = true;
        }
        E2(kVar);
        if (this.f23285E != b8) {
            this.f23285E = b8;
            z10 = true;
        }
        if (v2() != z8) {
            F2(z8);
            if (!z8) {
                r2();
            }
            z10 = true;
        }
        if (!t.c(w2(), mVar)) {
            r2();
            G2(mVar);
        }
        K2(function0);
        H2(pVar);
        I2(pVar2);
        if (z2() != z9) {
            J2(z9);
        } else {
            z11 = z10;
        }
        if (z11) {
            y2().t1();
        }
    }

    @Override // p055g0.AbstractC2321b
    public Object s2(o oVar, d dVar) {
        Object objA = this.f23284D.a(K.UserInput, new b(oVar, null), dVar);
        return objA == c.f() ? objA : G.f1419a;
    }

    @Override // p055g0.AbstractC2321b
    public Object t2(InterfaceC2320a interfaceC2320a, AbstractC2334o.b bVar, d dVar) {
        interfaceC2320a.a(bVar.a());
        return G.f1419a;
    }

    @Override // p055g0.AbstractC2321b
    public C x2() {
        return this.f23288H;
    }
}
