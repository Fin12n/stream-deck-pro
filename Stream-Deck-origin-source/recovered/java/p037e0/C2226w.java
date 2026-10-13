package p037e0;

import W6.n;

/* JADX INFO: renamed from: e0.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2226w implements InterfaceC2208d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f20348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f20349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC2221q f20351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC2221q f20352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC2221q f20353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f20354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f20355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f20356i;

    public C2226w(o0 o0Var, j0 j0Var, Object obj, AbstractC2221q abstractC2221q) {
        this.f20348a = o0Var;
        this.f20349b = j0Var;
        this.f20350c = obj;
        AbstractC2221q abstractC2221q2 = (AbstractC2221q) c().a().invoke(obj);
        this.f20351d = abstractC2221q2;
        this.f20352e = r.e(abstractC2221q);
        this.f20354g = c().b().invoke(o0Var.e(abstractC2221q2, abstractC2221q));
        this.f20355h = o0Var.b(abstractC2221q2, abstractC2221q);
        AbstractC2221q abstractC2221qE = r.e(o0Var.c(b(), abstractC2221q2, abstractC2221q));
        this.f20353f = abstractC2221qE;
        int iB = abstractC2221qE.b();
        for (int i8 = 0; i8 < iB; i8++) {
            AbstractC2221q abstractC2221q3 = this.f20353f;
            abstractC2221q3.e(i8, n.j(abstractC2221q3.a(i8), -this.f20348a.a(), this.f20348a.a()));
        }
    }

    @Override // p037e0.InterfaceC2208d
    public boolean a() {
        return this.f20356i;
    }

    @Override // p037e0.InterfaceC2208d
    public long b() {
        return this.f20355h;
    }

    @Override // p037e0.InterfaceC2208d
    public j0 c() {
        return this.f20349b;
    }

    @Override // p037e0.InterfaceC2208d
    public AbstractC2221q d(long j8) {
        return !e(j8) ? this.f20348a.c(j8, this.f20351d, this.f20352e) : this.f20353f;
    }

    @Override // p037e0.InterfaceC2208d
    public Object f(long j8) {
        return !e(j8) ? c().b().invoke(this.f20348a.d(j8, this.f20351d, this.f20352e)) : g();
    }

    @Override // p037e0.InterfaceC2208d
    public Object g() {
        return this.f20354g;
    }

    public C2226w(InterfaceC2227x interfaceC2227x, j0 j0Var, Object obj, AbstractC2221q abstractC2221q) {
        this(interfaceC2227x.a(j0Var), j0Var, obj, abstractC2221q);
    }

    public C2226w(InterfaceC2227x interfaceC2227x, j0 j0Var, Object obj, Object obj2) {
        this(interfaceC2227x.a(j0Var), j0Var, obj, (AbstractC2221q) j0Var.a().invoke(obj2));
    }
}
