package p082j0;

import A1.d;
import A1.t;
import W6.n;

/* JADX INFO: renamed from: j0.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2613q implements d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f28052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f28053c;

    public C2613q(d0 d0Var, d0 d0Var2) {
        this.f28052b = d0Var;
        this.f28053c = d0Var2;
    }

    @Override // p082j0.d0
    public int a(d dVar) {
        return n.d(this.f28052b.a(dVar) - this.f28053c.a(dVar), 0);
    }

    @Override // p082j0.d0
    public int b(d dVar, t tVar) {
        return n.d(this.f28052b.b(dVar, tVar) - this.f28053c.b(dVar, tVar), 0);
    }

    @Override // p082j0.d0
    public int c(d dVar, t tVar) {
        return n.d(this.f28052b.c(dVar, tVar) - this.f28053c.c(dVar, tVar), 0);
    }

    @Override // p082j0.d0
    public int d(d dVar) {
        return n.d(this.f28052b.d(dVar) - this.f28053c.d(dVar), 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2613q)) {
            return false;
        }
        C2613q c2613q = (C2613q) obj;
        return kotlin.jvm.internal.t.c(c2613q.f28052b, this.f28052b) && kotlin.jvm.internal.t.c(c2613q.f28053c, this.f28053c);
    }

    public int hashCode() {
        return (this.f28052b.hashCode() * 31) + this.f28053c.hashCode();
    }

    public String toString() {
        return '(' + this.f28052b + " - " + this.f28053c + ')';
    }
}
