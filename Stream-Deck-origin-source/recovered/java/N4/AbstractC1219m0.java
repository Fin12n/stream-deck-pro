package N4;

import java.util.Set;

/* JADX INFO: renamed from: N4.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1219m0 extends AbstractC1123e0 implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient AbstractC1183j0 f7216b;

    public AbstractC1183j0 A() {
        Object[] array = toArray();
        I0 i8 = AbstractC1183j0.f7149b;
        return AbstractC1183j0.A(array, array.length);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return F0.b(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return F0.a(this);
    }

    public final AbstractC1183j0 z() {
        AbstractC1183j0 abstractC1183j0 = this.f7216b;
        if (abstractC1183j0 != null) {
            return abstractC1183j0;
        }
        AbstractC1183j0 abstractC1183j0A = A();
        this.f7216b = abstractC1183j0A;
        return abstractC1183j0A;
    }
}
