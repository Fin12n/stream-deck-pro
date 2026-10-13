package M4;

import java.util.Set;

/* JADX INFO: renamed from: M4.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1056j extends AbstractC1049c implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient AbstractC1052f f5569b;

    public AbstractC1052f A() {
        Object[] array = toArray();
        AbstractC1065t abstractC1065t = AbstractC1052f.f5559b;
        return AbstractC1052f.A(array, array.length);
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
        return r.a(this);
    }

    public final AbstractC1052f z() {
        AbstractC1052f abstractC1052f = this.f5569b;
        if (abstractC1052f != null) {
            return abstractC1052f;
        }
        AbstractC1052f abstractC1052fA = A();
        this.f5569b = abstractC1052fA;
        return abstractC1052fA;
    }
}
