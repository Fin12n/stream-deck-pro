package p082j0;

import A1.d;
import A1.t;

/* JADX INFO: renamed from: j0.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2618w implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f28072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f28073b;

    public C2618w(d0 d0Var, d dVar) {
        this.f28072a = d0Var;
        this.f28073b = dVar;
    }

    @Override // p082j0.J
    public float a() {
        d dVar = this.f28073b;
        return dVar.n0(this.f28072a.d(dVar));
    }

    @Override // p082j0.J
    public float b(t tVar) {
        d dVar = this.f28073b;
        return dVar.n0(this.f28072a.b(dVar, tVar));
    }

    @Override // p082j0.J
    public float c(t tVar) {
        d dVar = this.f28073b;
        return dVar.n0(this.f28072a.c(dVar, tVar));
    }

    @Override // p082j0.J
    public float d() {
        d dVar = this.f28073b;
        return dVar.n0(this.f28072a.a(dVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2618w)) {
            return false;
        }
        C2618w c2618w = (C2618w) obj;
        return kotlin.jvm.internal.t.c(this.f28072a, c2618w.f28072a) && kotlin.jvm.internal.t.c(this.f28073b, c2618w.f28073b);
    }

    public int hashCode() {
        return (this.f28072a.hashCode() * 31) + this.f28073b.hashCode();
    }

    public String toString() {
        return "InsetsPaddingValues(insets=" + this.f28072a + ", density=" + this.f28073b + ')';
    }
}
