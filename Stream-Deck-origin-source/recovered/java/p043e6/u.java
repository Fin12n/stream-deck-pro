package p043e6;

import G6.d;
import Q6.k;
import kotlin.jvm.internal.t;
import p034d6.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class u implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f20885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f20886b;

    public u(i selector, r options) {
        t.g(selector, "selector");
        t.g(options, "options");
        this.f20885a = selector;
        this.f20886b = options;
    }

    @Override // p043e6.g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public u d(k kVar) {
        return (u) g.a.a(this, kVar);
    }

    @Override // p043e6.g
    public r b() {
        return this.f20886b;
    }

    @Override // p043e6.g
    public void c(r rVar) {
        t.g(rVar, "<set-?>");
        this.f20886b = rVar;
    }

    public final Object e(o oVar, k kVar, d dVar) {
        i iVar = this.f20885a;
        r.d dVarK = b().g().k();
        kVar.invoke(dVarK);
        return h.a(iVar, oVar, dVarK, dVar);
    }
}
