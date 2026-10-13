package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class w extends y implements X6.i {
    public w() {
    }

    @Override // X6.k
    public X6.k.a a() {
        ((X6.i) getReflected()).a();
        return null;
    }

    @Override // kotlin.jvm.internal.AbstractC2628f
    public X6.c computeReflected() {
        return K.d(this);
    }

    @Override // Q6.k
    public Object invoke(Object obj) {
        return get(obj);
    }

    public w(Object obj) {
        super(obj);
    }

    public w(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, i8);
    }
}
