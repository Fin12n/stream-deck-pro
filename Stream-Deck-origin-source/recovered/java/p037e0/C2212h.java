package p037e0;

import kotlin.jvm.functions.Function0;
import p215z0.InterfaceC3164l0;
import p215z0.l1;

/* JADX INFO: renamed from: e0.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2212h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f20256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function0 f20259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3164l0 f20260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AbstractC2221q f20261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f20262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f20263h = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC3164l0 f20264i;

    public C2212h(Object obj, j0 j0Var, AbstractC2221q abstractC2221q, long j8, Object obj2, long j9, boolean z8, Function0 function0) {
        this.f20256a = j0Var;
        this.f20257b = obj2;
        this.f20258c = j9;
        this.f20259d = function0;
        this.f20260e = l1.e(obj, null, 2, null);
        this.f20261f = r.e(abstractC2221q);
        this.f20262g = j8;
        this.f20264i = l1.e(Boolean.valueOf(z8), null, 2, null);
    }

    public final void a() {
        k(false);
        this.f20259d.invoke();
    }

    public final long b() {
        return this.f20263h;
    }

    public final long c() {
        return this.f20262g;
    }

    public final long d() {
        return this.f20258c;
    }

    public final Object e() {
        return this.f20260e.getValue();
    }

    public final Object f() {
        return this.f20256a.b().invoke(this.f20261f);
    }

    public final AbstractC2221q g() {
        return this.f20261f;
    }

    public final boolean h() {
        return ((Boolean) this.f20264i.getValue()).booleanValue();
    }

    public final void i(long j8) {
        this.f20263h = j8;
    }

    public final void j(long j8) {
        this.f20262g = j8;
    }

    public final void k(boolean z8) {
        this.f20264i.setValue(Boolean.valueOf(z8));
    }

    public final void l(Object obj) {
        this.f20260e.setValue(obj);
    }

    public final void m(AbstractC2221q abstractC2221q) {
        this.f20261f = abstractC2221q;
    }
}
