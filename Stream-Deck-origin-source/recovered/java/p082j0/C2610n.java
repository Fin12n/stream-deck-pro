package p082j0;

import Q6.k;
import kotlin.jvm.internal.t;
import p047f1.d;

/* JADX INFO: renamed from: j0.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2610n implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f28037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d0 f28038c;

    public C2610n(k kVar) {
        this.f28037b = kVar;
    }

    @Override // p047f1.d
    public void d(p047f1.k kVar) {
        d0 d0Var = (d0) kVar.u(g0.a());
        if (t.c(d0Var, this.f28038c)) {
            return;
        }
        this.f28038c = d0Var;
        this.f28037b.invoke(d0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2610n) {
            return t.c(((C2610n) obj).f28037b, this.f28037b);
        }
        return false;
    }

    public int hashCode() {
        return this.f28037b.hashCode();
    }
}
