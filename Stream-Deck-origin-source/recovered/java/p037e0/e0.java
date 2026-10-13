package p037e0;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements InterfaceC2208d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f20183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f20184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f20186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC2221q f20187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC2221q f20188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC2221q f20189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f20190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC2221q f20191i;

    public e0(m0 m0Var, j0 j0Var, Object obj, Object obj2, AbstractC2221q abstractC2221q) {
        this.f20183a = m0Var;
        this.f20184b = j0Var;
        this.f20185c = obj;
        this.f20186d = obj2;
        AbstractC2221q abstractC2221q2 = (AbstractC2221q) c().a().invoke(obj);
        this.f20187e = abstractC2221q2;
        AbstractC2221q abstractC2221q3 = (AbstractC2221q) c().a().invoke(g());
        this.f20188f = abstractC2221q3;
        AbstractC2221q abstractC2221qG = (abstractC2221q == null || (abstractC2221qG = r.e(abstractC2221q)) == null) ? r.g((AbstractC2221q) c().a().invoke(obj)) : abstractC2221qG;
        this.f20189g = abstractC2221qG;
        this.f20190h = m0Var.b(abstractC2221q2, abstractC2221q3, abstractC2221qG);
        this.f20191i = m0Var.d(abstractC2221q2, abstractC2221q3, abstractC2221qG);
    }

    @Override // p037e0.InterfaceC2208d
    public boolean a() {
        return this.f20183a.a();
    }

    @Override // p037e0.InterfaceC2208d
    public long b() {
        return this.f20190h;
    }

    @Override // p037e0.InterfaceC2208d
    public j0 c() {
        return this.f20184b;
    }

    @Override // p037e0.InterfaceC2208d
    public AbstractC2221q d(long j8) {
        return !e(j8) ? this.f20183a.g(j8, this.f20187e, this.f20188f, this.f20189g) : this.f20191i;
    }

    @Override // p037e0.InterfaceC2208d
    public Object f(long j8) {
        if (e(j8)) {
            return g();
        }
        AbstractC2221q abstractC2221qC = this.f20183a.c(j8, this.f20187e, this.f20188f, this.f20189g);
        int iB = abstractC2221qC.b();
        for (int i8 = 0; i8 < iB; i8++) {
            if (Float.isNaN(abstractC2221qC.a(i8))) {
                throw new IllegalStateException(("AnimationVector cannot contain a NaN. " + abstractC2221qC + ". Animation: " + this + ", playTimeNanos: " + j8).toString());
            }
        }
        return c().b().invoke(abstractC2221qC);
    }

    @Override // p037e0.InterfaceC2208d
    public Object g() {
        return this.f20186d;
    }

    public final Object h() {
        return this.f20185c;
    }

    public String toString() {
        return "TargetBasedAnimation: " + this.f20185c + " -> " + g() + ",initial velocity: " + this.f20189g + ", duration: " + AbstractC2210f.b(this) + " ms,animationSpec: " + this.f20183a;
    }

    public /* synthetic */ e0(m0 m0Var, j0 j0Var, Object obj, Object obj2, AbstractC2221q abstractC2221q, int i8, AbstractC2633k abstractC2633k) {
        this(m0Var, j0Var, obj, obj2, (i8 & 16) != 0 ? null : abstractC2221q);
    }

    public /* synthetic */ e0(InterfaceC2213i interfaceC2213i, j0 j0Var, Object obj, Object obj2, AbstractC2221q abstractC2221q, int i8, AbstractC2633k abstractC2633k) {
        this(interfaceC2213i, j0Var, obj, obj2, (i8 & 16) != 0 ? null : abstractC2221q);
    }

    public e0(InterfaceC2213i interfaceC2213i, j0 j0Var, Object obj, Object obj2, AbstractC2221q abstractC2221q) {
        this(interfaceC2213i.a(j0Var), j0Var, obj, obj2, abstractC2221q);
    }
}
