package p100l0;

import Q6.k;
import Q6.o;
import Q6.q;
import p109m0.n;

/* JADX INFO: renamed from: l0.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2648i implements n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f28991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f28992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f28993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f28994d;

    public C2648i(k kVar, o oVar, k kVar2, q qVar) {
        this.f28991a = kVar;
        this.f28992b = oVar;
        this.f28993c = kVar2;
        this.f28994d = qVar;
    }

    public final q a() {
        return this.f28994d;
    }

    public final o b() {
        return this.f28992b;
    }

    @Override // m0.n.a
    public k getKey() {
        return this.f28991a;
    }

    @Override // m0.n.a
    public k getType() {
        return this.f28993c;
    }
}
