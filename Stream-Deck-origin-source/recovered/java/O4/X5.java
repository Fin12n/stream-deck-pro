package O4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class X5 extends P5 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final P5 f8107f = new X5(null, new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f8108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f8109e;

    public X5(Object obj, Object[] objArr, int i8) {
        this.f8108d = objArr;
        this.f8109e = i8;
    }

    public static X5 g(int i8, Object[] objArr, O5 o8) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        AbstractC1440j3.a(obj, obj2);
        return new X5(null, objArr, 1);
    }

    @Override // O4.P5
    public final M4 a() {
        return new W5(this.f8108d, 1, this.f8109e);
    }

    @Override // O4.P5
    public final Q5 d() {
        return new U5(this, this.f8108d, 0, this.f8109e);
    }

    @Override // O4.P5
    public final Q5 e() {
        return new V5(this, new W5(this.f8108d, 0, this.f8109e));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    @Override // O4.P5, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object[] objArr = this.f8108d;
        int i8 = this.f8109e;
        if (obj != null && i8 == 1) {
            Object obj3 = objArr[0];
            obj3.getClass();
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                obj2.getClass();
            } else {
                obj2 = null;
            }
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f8109e;
    }
}
