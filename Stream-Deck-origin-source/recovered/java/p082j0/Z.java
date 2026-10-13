package p082j0;

import A1.d;
import A1.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class Z implements d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f27905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f27906c;

    public Z(d0 d0Var, d0 d0Var2) {
        this.f27905b = d0Var;
        this.f27906c = d0Var2;
    }

    @Override // p082j0.d0
    public int a(d dVar) {
        return Math.max(this.f27905b.a(dVar), this.f27906c.a(dVar));
    }

    @Override // p082j0.d0
    public int b(d dVar, t tVar) {
        return Math.max(this.f27905b.b(dVar, tVar), this.f27906c.b(dVar, tVar));
    }

    @Override // p082j0.d0
    public int c(d dVar, t tVar) {
        return Math.max(this.f27905b.c(dVar, tVar), this.f27906c.c(dVar, tVar));
    }

    @Override // p082j0.d0
    public int d(d dVar) {
        return Math.max(this.f27905b.d(dVar), this.f27906c.d(dVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z8 = (Z) obj;
        return kotlin.jvm.internal.t.c(z8.f27905b, this.f27905b) && kotlin.jvm.internal.t.c(z8.f27906c, this.f27906c);
    }

    public int hashCode() {
        return this.f27905b.hashCode() + (this.f27906c.hashCode() * 31);
    }

    public String toString() {
        return '(' + this.f27905b + " ∪ " + this.f27906c + ')';
    }
}
