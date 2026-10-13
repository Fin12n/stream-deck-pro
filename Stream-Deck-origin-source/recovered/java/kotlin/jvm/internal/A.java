package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class A extends E implements X6.j {
    public A() {
    }

    @Override // X6.j
    public X6.j.a a() {
        ((X6.j) getReflected()).a();
        return null;
    }

    @Override // kotlin.jvm.internal.AbstractC2628f
    public X6.c computeReflected() {
        return K.e(this);
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    public A(Object obj) {
        super(obj);
    }

    public A(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, i8);
    }
}
