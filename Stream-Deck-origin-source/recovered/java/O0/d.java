package O0;

import A1.s;
import C6.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p056g1.AbstractC2347k;
import p056g1.Z;
import p056g1.c0;
import p056g1.d0;
import p056g1.r;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d extends L0.i.c implements c, c0, b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f7538n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7539o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Q6.k f7540p;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f7542b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(0);
            this.f7542b = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m72invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m72invoke() {
            d.this.d2().invoke(this.f7542b);
        }
    }

    public d(e eVar, Q6.k kVar) {
        this.f7538n = eVar;
        this.f7540p = kVar;
        eVar.f(this);
    }

    @Override // O0.c
    public void G() {
        this.f7539o = false;
        this.f7538n.g(null);
        r.a(this);
    }

    @Override // p056g1.c0
    public void O0() {
        G();
    }

    @Override // O0.b
    public long d() {
        return s.c(AbstractC2347k.h(this, Z.a(128)).a());
    }

    public final Q6.k d2() {
        return this.f7540p;
    }

    public final i e2() {
        if (!this.f7539o) {
            e eVar = this.f7538n;
            eVar.g(null);
            d0.a(this, new a(eVar));
            if (eVar.c() == null) {
                throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f7539o = true;
        }
        i iVarC = this.f7538n.c();
        t.d(iVarC);
        return iVarC;
    }

    public final void f2(Q6.k kVar) {
        this.f7540p = kVar;
        G();
    }

    @Override // O0.b
    public A1.d getDensity() {
        return AbstractC2347k.i(this);
    }

    @Override // O0.b
    public A1.t getLayoutDirection() {
        return AbstractC2347k.j(this);
    }

    @Override // p056g1.InterfaceC2353q
    public void h0() {
        G();
    }

    @Override // p056g1.InterfaceC2353q
    public void q(T0.c cVar) {
        e2().a().invoke(cVar);
    }
}
