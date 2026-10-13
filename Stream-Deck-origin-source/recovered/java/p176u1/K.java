package p176u1;

import W6.n;
import kotlin.jvm.internal.t;
import p128o1.C2739d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class K implements InterfaceC3027k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2739d f34371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34372b;

    public K(C2739d c2739d, int i8) {
        this.f34371a = c2739d;
        this.f34372b = i8;
    }

    @Override // p176u1.InterfaceC3027k
    public void a(C3030n c3030n) {
        if (c3030n.l()) {
            int iF = c3030n.f();
            c3030n.m(c3030n.f(), c3030n.e(), c());
            if (c().length() > 0) {
                c3030n.n(iF, c().length() + iF);
            }
        } else {
            int iK = c3030n.k();
            c3030n.m(c3030n.k(), c3030n.j(), c());
            if (c().length() > 0) {
                c3030n.n(iK, c().length() + iK);
            }
        }
        int iG = c3030n.g();
        int i8 = this.f34372b;
        c3030n.o(n.k(i8 > 0 ? (iG + i8) - 1 : (iG + i8) - c().length(), 0, c3030n.h()));
    }

    public final int b() {
        return this.f34372b;
    }

    public final String c() {
        return this.f34371a.i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k8 = (K) obj;
        return t.c(c(), k8.c()) && this.f34372b == k8.f34372b;
    }

    public int hashCode() {
        return (c().hashCode() * 31) + this.f34372b;
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + c() + "', newCursorPosition=" + this.f34372b + ')';
    }

    public K(String str, int i8) {
        this(new C2739d(str, null, null, 6, null), i8);
    }
}
