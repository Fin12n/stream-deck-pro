package V0;

import A1.s;
import C6.G;
import R0.C1598l0;
import R0.C1600m0;
import R0.C1623y0;
import R0.InterfaceC1621x0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.InterfaceC3164l0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class m extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V0.c f10410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V0.a f10413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Function0 f10414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3164l0 f10415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C1600m0 f10416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC3164l0 f10417i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f10418j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f10419k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f10420l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Q6.k f10421m;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.k {
        public a() {
            super(1);
        }

        public final void b(l lVar) {
            m.this.h();
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((l) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {
        public b() {
            super(1);
        }

        public final void b(T0.f fVar) {
            V0.c cVarL = m.this.l();
            m mVar = m.this;
            float f8 = mVar.f10419k;
            float f9 = mVar.f10420l;
            long jC = Q0.f.f9082b.c();
            T0.d dVarK0 = fVar.K0();
            long jD = dVarK0.d();
            dVarK0.c().k();
            dVarK0.a().f(f8, f9, jC);
            cVarL.a(fVar);
            dVarK0.c().x();
            dVarK0.b(jD);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((T0.f) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f10424a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m77invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m77invoke() {
        }
    }

    public m(V0.c cVar) {
        super(null);
        this.f10410b = cVar;
        cVar.d(new a());
        this.f10411c = "";
        this.f10412d = true;
        this.f10413e = new V0.a();
        this.f10414f = c.f10424a;
        this.f10415g = l1.e(null, null, 2, null);
        Q0.l.a aVar = Q0.l.f9103b;
        this.f10417i = l1.e(Q0.l.c(aVar.b()), null, 2, null);
        this.f10418j = aVar.a();
        this.f10419k = 1.0f;
        this.f10420l = 1.0f;
        this.f10421m = new b();
    }

    @Override // V0.l
    public void a(T0.f fVar) {
        i(fVar, 1.0f, null);
    }

    public final void h() {
        this.f10412d = true;
        this.f10414f.invoke();
    }

    public final void i(T0.f fVar, float f8, C1600m0 c1600m0) {
        T0.f fVar2;
        int iA = (this.f10410b.j() && this.f10410b.g() != C1598l0.f9405b.e() && o.g(k()) && o.g(c1600m0)) ? C1623y0.f9449b.a() : C1623y0.f9449b.b();
        if (!this.f10412d && Q0.l.f(this.f10418j, fVar.d()) && C1623y0.i(iA, j())) {
            fVar2 = fVar;
        } else {
            this.f10416h = C1623y0.i(iA, C1623y0.f9449b.a()) ? C1600m0.a.b(C1600m0.f9420b, this.f10410b.g(), 0, 2, null) : null;
            this.f10419k = Q0.l.i(fVar.d()) / Q0.l.i(m());
            this.f10420l = Q0.l.g(fVar.d()) / Q0.l.g(m());
            fVar2 = fVar;
            this.f10413e.b(iA, s.a((int) Math.ceil(Q0.l.i(fVar.d())), (int) Math.ceil(Q0.l.g(fVar.d()))), fVar2, fVar.getLayoutDirection(), this.f10421m);
            this.f10412d = false;
            this.f10418j = fVar2.d();
        }
        if (c1600m0 == null) {
            c1600m0 = k() != null ? k() : this.f10416h;
        }
        this.f10413e.c(fVar2, f8, c1600m0);
    }

    public final int j() {
        InterfaceC1621x0 interfaceC1621x0D = this.f10413e.d();
        return interfaceC1621x0D != null ? interfaceC1621x0D.b() : C1623y0.f9449b.b();
    }

    public final C1600m0 k() {
        return (C1600m0) this.f10415g.getValue();
    }

    public final V0.c l() {
        return this.f10410b;
    }

    public final long m() {
        return ((Q0.l) this.f10417i.getValue()).m();
    }

    public final void n(C1600m0 c1600m0) {
        this.f10415g.setValue(c1600m0);
    }

    public final void o(Function0 function0) {
        this.f10414f = function0;
    }

    public final void p(String str) {
        this.f10411c = str;
    }

    public final void q(long j8) {
        this.f10417i.setValue(Q0.l.c(j8));
    }

    public String toString() {
        String str = "Params: \tname: " + this.f10411c + "\n\tviewportWidth: " + Q0.l.i(m()) + "\n\tviewportHeight: " + Q0.l.g(m()) + "\n";
        t.f(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
