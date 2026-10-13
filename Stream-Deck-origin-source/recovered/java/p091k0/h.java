package p091k0;

import Q6.k;
import Q6.q;
import p109m0.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h implements n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f28405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f28406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f28407c;

    public h(k kVar, k kVar2, q qVar) {
        this.f28405a = kVar;
        this.f28406b = kVar2;
        this.f28407c = qVar;
    }

    public final q a() {
        return this.f28407c;
    }

    @Override // m0.n.a
    public k getKey() {
        return this.f28405a;
    }

    @Override // m0.n.a
    public k getType() {
        return this.f28406b;
    }
}
