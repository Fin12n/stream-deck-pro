package p191w0;

import A1.p;
import A1.t;
import L0.c;

/* JADX INFO: renamed from: w0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3050b implements C3057e0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.b f35803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.b f35804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35805c;

    public C3050b(c.b bVar, c.b bVar2, int i8) {
        this.f35803a = bVar;
        this.f35804b = bVar2;
        this.f35805c = i8;
    }

    @Override // p191w0.C3057e0.a
    public int a(p pVar, long j8, int i8, t tVar) {
        int iA = this.f35804b.a(0, pVar.g(), tVar);
        return pVar.d() + iA + (-this.f35803a.a(0, i8, tVar)) + (tVar == t.Ltr ? this.f35805c : -this.f35805c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3050b)) {
            return false;
        }
        C3050b c3050b = (C3050b) obj;
        return kotlin.jvm.internal.t.c(this.f35803a, c3050b.f35803a) && kotlin.jvm.internal.t.c(this.f35804b, c3050b.f35804b) && this.f35805c == c3050b.f35805c;
    }

    public int hashCode() {
        return (((this.f35803a.hashCode() * 31) + this.f35804b.hashCode()) * 31) + Integer.hashCode(this.f35805c);
    }

    public String toString() {
        return "Horizontal(menuAlignment=" + this.f35803a + ", anchorAlignment=" + this.f35804b + ", offset=" + this.f35805c + ')';
    }
}
