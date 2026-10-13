package p043e6;

import Q6.k;
import kotlin.jvm.internal.t;
import p034d6.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f20861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f20862b;

    public p(i selector, r options) {
        t.g(selector, "selector");
        t.g(options, "options");
        this.f20861a = selector;
        this.f20862b = options;
    }

    @Override // p043e6.g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p d(k kVar) {
        return (p) g.a.a(this, kVar);
    }

    @Override // p043e6.g
    public r b() {
        return this.f20862b;
    }

    @Override // p043e6.g
    public void c(r rVar) {
        t.g(rVar, "<set-?>");
        this.f20862b = rVar;
    }

    public final u e() {
        return new u(this.f20861a, b().g());
    }
}
