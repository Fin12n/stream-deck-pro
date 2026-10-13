package O4;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Q5 extends M4 implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient N5 f8021b;

    public N5 A() {
        return N5.A(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC1380b.a(this);
    }

    public final N5 z() {
        N5 n8 = this.f8021b;
        if (n8 != null) {
            return n8;
        }
        N5 n5A = A();
        this.f8021b = n5A;
        return n5A;
    }
}
