package p176u1;

import M6.eLZq.eGwOBWCdOTaKus;
import W6.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class L implements InterfaceC3027k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34374b;

    public L(int i8, int i9) {
        this.f34373a = i8;
        this.f34374b = i9;
    }

    @Override // p176u1.InterfaceC3027k
    public void a(C3030n c3030n) {
        int iK = n.k(this.f34373a, 0, c3030n.h());
        int iK2 = n.k(this.f34374b, 0, c3030n.h());
        if (iK < iK2) {
            c3030n.p(iK, iK2);
        } else {
            c3030n.p(iK2, iK);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l8 = (L) obj;
        return this.f34373a == l8.f34373a && this.f34374b == l8.f34374b;
    }

    public int hashCode() {
        return (this.f34373a * 31) + this.f34374b;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.f34373a + eGwOBWCdOTaKus.InAAAtFpVO + this.f34374b + ')';
    }
}
