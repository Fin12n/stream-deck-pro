package p082j0;

import A1.d;
import A1.t;
import L1.h;
import U1.c0;
import p215z0.InterfaceC3164l0;
import p215z0.l1;

/* JADX INFO: renamed from: j0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2597a implements d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3164l0 f27909d = l1.e(h.f4938e, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3164l0 f27910e = l1.e(Boolean.TRUE, null, 2, null);

    public C2597a(int i8, String str) {
        this.f27907b = i8;
        this.f27908c = str;
    }

    @Override // p082j0.d0
    public int a(d dVar) {
        return e().f4940b;
    }

    @Override // p082j0.d0
    public int b(d dVar, t tVar) {
        return e().f4941c;
    }

    @Override // p082j0.d0
    public int c(d dVar, t tVar) {
        return e().f4939a;
    }

    @Override // p082j0.d0
    public int d(d dVar) {
        return e().f4942d;
    }

    public final h e() {
        return (h) this.f27909d.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2597a) && this.f27907b == ((C2597a) obj).f27907b;
    }

    public final void f(h hVar) {
        this.f27909d.setValue(hVar);
    }

    public final void g(boolean z8) {
        this.f27910e.setValue(Boolean.valueOf(z8));
    }

    public final void h(c0 c0Var, int i8) {
        if (i8 == 0 || (i8 & this.f27907b) != 0) {
            f(c0Var.f(this.f27907b));
            g(c0Var.p(this.f27907b));
        }
    }

    public int hashCode() {
        return this.f27907b;
    }

    public String toString() {
        return this.f27908c + '(' + e().f4939a + ", " + e().f4940b + ", " + e().f4941c + ", " + e().f4942d + ')';
    }
}
