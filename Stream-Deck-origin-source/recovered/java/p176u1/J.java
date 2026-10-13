package p176u1;

import W6.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class J implements InterfaceC3027k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34370b;

    public J(int i8, int i9) {
        this.f34369a = i8;
        this.f34370b = i9;
    }

    @Override // p176u1.InterfaceC3027k
    public void a(C3030n c3030n) {
        if (c3030n.l()) {
            c3030n.a();
        }
        int iK = n.k(this.f34369a, 0, c3030n.h());
        int iK2 = n.k(this.f34370b, 0, c3030n.h());
        if (iK != iK2) {
            if (iK < iK2) {
                c3030n.n(iK, iK2);
            } else {
                c3030n.n(iK2, iK);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j8 = (J) obj;
        return this.f34369a == j8.f34369a && this.f34370b == j8.f34370b;
    }

    public int hashCode() {
        return (this.f34369a * 31) + this.f34370b;
    }

    public String toString() {
        return "SetComposingRegionCommand(start=" + this.f34369a + ", end=" + this.f34370b + ')';
    }
}
