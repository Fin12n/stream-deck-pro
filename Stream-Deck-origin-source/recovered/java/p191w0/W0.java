package p191w0;

import A1.p;
import A1.r;
import A1.t;
import L0.c;
import W6.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class W0 implements C3057e0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.b f35780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35781b;

    public W0(c.b bVar, int i8) {
        this.f35780a = bVar;
        this.f35781b = i8;
    }

    @Override // p191w0.C3057e0.a
    public int a(p pVar, long j8, int i8, t tVar) {
        return i8 >= r.g(j8) - (this.f35781b * 2) ? c.f4806a.f().a(i8, r.g(j8), tVar) : n.k(this.f35780a.a(i8, r.g(j8), tVar), this.f35781b, (r.g(j8) - this.f35781b) - i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W0)) {
            return false;
        }
        W0 w8 = (W0) obj;
        return kotlin.jvm.internal.t.c(this.f35780a, w8.f35780a) && this.f35781b == w8.f35781b;
    }

    public int hashCode() {
        return (this.f35780a.hashCode() * 31) + Integer.hashCode(this.f35781b);
    }

    public String toString() {
        return "Horizontal(alignment=" + this.f35780a + ", margin=" + this.f35781b + ')';
    }
}
