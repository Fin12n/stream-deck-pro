package p191w0;

import A1.p;
import A1.r;
import L0.c;
import W6.n;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class X0 implements C3057e0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.InterfaceC0174c f35783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35784b;

    public X0(c.InterfaceC0174c interfaceC0174c, int i8) {
        this.f35783a = interfaceC0174c;
        this.f35784b = i8;
    }

    @Override // p191w0.C3057e0.b
    public int a(p pVar, long j8, int i8) {
        return i8 >= r.f(j8) - (this.f35784b * 2) ? c.f4806a.g().a(i8, r.f(j8)) : n.k(this.f35783a.a(i8, r.f(j8)), this.f35784b, (r.f(j8) - this.f35784b) - i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X0)) {
            return false;
        }
        X0 x8 = (X0) obj;
        return t.c(this.f35783a, x8.f35783a) && this.f35784b == x8.f35784b;
    }

    public int hashCode() {
        return (this.f35783a.hashCode() * 31) + Integer.hashCode(this.f35784b);
    }

    public String toString() {
        return "Vertical(alignment=" + this.f35783a + ", margin=" + this.f35784b + ')';
    }
}
