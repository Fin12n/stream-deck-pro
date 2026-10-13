package J0;

import C6.C0920i;

/* JADX INFO: renamed from: J0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1022e extends AbstractC1028k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC1028k f3965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Q6.k f3966h;

    /* JADX INFO: renamed from: J0.e$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.k f3967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q6.k f3968b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Q6.k kVar, Q6.k kVar2) {
            super(1);
            this.f3967a = kVar;
            this.f3968b = kVar2;
        }

        public final void b(Object obj) {
            this.f3967a.invoke(obj);
            this.f3968b.invoke(obj);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(obj);
            return C6.G.f1419a;
        }
    }

    public C1022e(int i8, n nVar, Q6.k kVar, AbstractC1028k abstractC1028k) {
        super(i8, nVar, null);
        this.f3965g = abstractC1028k;
        abstractC1028k.m(this);
        if (kVar != null) {
            Q6.k kVarH = abstractC1028k.h();
            if (kVarH != null) {
                kVar = new a(kVar, kVarH);
            }
        } else {
            kVar = abstractC1028k.h();
        }
        this.f3966h = kVar;
    }

    @Override // J0.AbstractC1028k
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Void m(AbstractC1028k abstractC1028k) {
        y.b();
        throw new C0920i();
    }

    @Override // J0.AbstractC1028k
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Void n(AbstractC1028k abstractC1028k) {
        y.b();
        throw new C0920i();
    }

    @Override // J0.AbstractC1028k
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public Void p(G g8) {
        p.Z();
        throw new C0920i();
    }

    @Override // J0.AbstractC1028k
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public C1022e x(Q6.k kVar) {
        return new C1022e(f(), g(), kVar, this.f3965g);
    }

    @Override // J0.AbstractC1028k
    public void d() {
        if (e()) {
            return;
        }
        if (f() != this.f3965g.f()) {
            b();
        }
        this.f3965g.n(this);
        super.d();
    }

    @Override // J0.AbstractC1028k
    public Q6.k h() {
        return this.f3966h;
    }

    @Override // J0.AbstractC1028k
    public boolean i() {
        return true;
    }

    @Override // J0.AbstractC1028k
    public Q6.k k() {
        return null;
    }

    @Override // J0.AbstractC1028k
    public void o() {
    }
}
