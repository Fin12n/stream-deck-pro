package p082j0;

import A1.d;
import A1.t;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class E implements d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f27835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27836c;

    public /* synthetic */ E(d0 d0Var, int i8, AbstractC2633k abstractC2633k) {
        this(d0Var, i8);
    }

    @Override // p082j0.d0
    public int a(d dVar) {
        if (i0.k(this.f27836c, i0.f28011a.g())) {
            return this.f27835b.a(dVar);
        }
        return 0;
    }

    @Override // p082j0.d0
    public int b(d dVar, t tVar) {
        if (i0.k(this.f27836c, tVar == t.Ltr ? i0.f28011a.c() : i0.f28011a.d())) {
            return this.f27835b.b(dVar, tVar);
        }
        return 0;
    }

    @Override // p082j0.d0
    public int c(d dVar, t tVar) {
        if (i0.k(this.f27836c, tVar == t.Ltr ? i0.f28011a.a() : i0.f28011a.b())) {
            return this.f27835b.c(dVar, tVar);
        }
        return 0;
    }

    @Override // p082j0.d0
    public int d(d dVar) {
        if (i0.k(this.f27836c, i0.f28011a.e())) {
            return this.f27835b.d(dVar);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e8 = (E) obj;
        return kotlin.jvm.internal.t.c(this.f27835b, e8.f27835b) && i0.j(this.f27836c, e8.f27836c);
    }

    public int hashCode() {
        return (this.f27835b.hashCode() * 31) + i0.l(this.f27836c);
    }

    public String toString() {
        return '(' + this.f27835b + " only " + ((Object) i0.n(this.f27836c)) + ')';
    }

    public E(d0 d0Var, int i8) {
        this.f27835b = d0Var;
        this.f27836c = i8;
    }
}
