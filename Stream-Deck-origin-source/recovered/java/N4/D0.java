package N4;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class D0 extends AbstractC1207l0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f6242d;

    public D0(Object obj, Object[] objArr, int i8) {
        this.f6242d = objArr;
    }

    public static D0 g(int i8, Object[] objArr, AbstractC1195k0 abstractC1195k0) {
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2);
        N.b(obj, obj2);
        return new D0(null, objArr, 1);
    }

    @Override // N4.AbstractC1207l0
    public final AbstractC1123e0 a() {
        return new C0(this.f6242d, 1, 1);
    }

    @Override // N4.AbstractC1207l0
    public final AbstractC1219m0 d() {
        return new A0(this, this.f6242d, 0, 1);
    }

    @Override // N4.AbstractC1207l0
    public final AbstractC1219m0 e() {
        return new B0(this, new C0(this.f6242d, 0, 1));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // N4.AbstractC1207l0, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f6242d;
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                Objects.requireNonNull(obj2);
            } else {
                obj2 = null;
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return 1;
    }
}
