package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class E1 implements K1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K1[] f17946a;

    public E1(K1... k1Arr) {
        this.f17946a = k1Arr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1
    public final J1 a(Class cls) {
        for (int i8 = 0; i8 < 2; i8++) {
            K1 k8 = this.f17946a[i8];
            if (k8.b(cls)) {
                return k8.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1
    public final boolean b(Class cls) {
        for (int i8 = 0; i8 < 2; i8++) {
            if (this.f17946a[i8].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
